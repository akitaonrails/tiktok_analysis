package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02AP, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02AP extends Message<C02AP, C02NC> {
    public static final ProtoAdapter<C02AP> ADAPTER = new ProtoAdapter<C02AP>() { // from class: X.026F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02AP decode(ProtoReader protoReader) {
            C02AP c02ap = new C02AP();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                } else {
                                    c02ap.icon_attribute = C02Z7.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ap.description_list.add(C5431029t.ADAPTER.decode(protoReader));
                            }
                        } else {
                            c02ap.title = C5431029t.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c02ap.show_type = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ap;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02AP c02ap) {
            C02AP c02ap2 = c02ap;
            int iEncodedSizeWithTag = ProtoAdapter.INT32.encodedSizeWithTag(1, c02ap2.show_type);
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ap2.title) + protoAdapter.asRepeated().encodedSizeWithTag(3, c02ap2.description_list) + C02Z7.ADAPTER.encodedSizeWithTag(4, c02ap2.icon_attribute) + c02ap2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02AP c02ap) {
        }
    };
    public List<C5431029t> description_list;
    public C02Z7 icon_attribute;
    public Integer show_type;
    public C5431029t title;

    public C02AP() {
        super(ADAPTER, ByteString.EMPTY);
        this.description_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02NC newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
