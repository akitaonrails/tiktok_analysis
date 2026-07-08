package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02EF, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02EF extends Message<C02EF, C02QL> {
    public static final ProtoAdapter<C02EF> ADAPTER = new ProtoAdapter<C02EF>() { // from class: X.027x
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02EF decode(ProtoReader protoReader) {
            C02EF c02ef = new C02EF();
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
                                    c02ef.icon = C029C.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c02ef.text_font = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c02ef.text_color = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c02ef.text = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02ef;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02EF c02ef) {
            C02EF c02ef2 = c02ef;
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, c02ef2.text);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c02ef2.text_color) + protoAdapter.encodedSizeWithTag(3, c02ef2.text_font) + C029C.ADAPTER.encodedSizeWithTag(4, c02ef2.icon) + c02ef2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02EF c02ef) {
        }
    };
    public C029C icon;
    public String text;
    public Integer text_color;
    public Integer text_font;

    public C02EF() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02QL newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
