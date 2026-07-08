package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02YY, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02YY extends Message<C02YY, C606202Ya> {
    public static final ProtoAdapter<C02YY> ADAPTER = new ProtoAdapter<C02YY>() { // from class: X.02YZ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02YY decode(ProtoReader protoReader) {
            C02YY c02yy = new C02YY();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c02yy.pop_up_message = C606402Yc.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c02yy.specification_link_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02yy.url_list.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02yy;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02YY c02yy) {
            C02YY c02yy2 = c02yy;
            return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, c02yy2.url_list) + ProtoAdapter.INT32.encodedSizeWithTag(2, c02yy2.specification_link_type) + C606402Yc.ADAPTER.encodedSizeWithTag(3, c02yy2.pop_up_message) + c02yy2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02YY c02yy) {
        }
    };
    public C606402Yc pop_up_message;
    public Integer specification_link_type;
    public List<String> url_list;

    public C02YY() {
        super(ADAPTER, ByteString.EMPTY);
        this.url_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C606202Ya newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
