package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02HX, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02HX extends Message<C02HX, C582502Ox> {
    public static final ProtoAdapter<C02HX> ADAPTER = new ProtoAdapter<C02HX>() { // from class: X.02HW
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02HX decode(ProtoReader protoReader) {
            C02HX c02hx = new C02HX();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c02hx.reason = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c02hx.text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c02hx.link_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c02hx.action = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c02hx.action_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c02hx.extra = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c02hx.action_redirect_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c02hx.judge_result = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02hx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02HX c02hx) {
            C02HX c02hx2 = c02hx;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c02hx2.reason);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c02hx2.text) + protoAdapter2.encodedSizeWithTag(3, c02hx2.link_schema) + protoAdapter.encodedSizeWithTag(4, c02hx2.action) + protoAdapter2.encodedSizeWithTag(5, c02hx2.action_text) + protoAdapter2.encodedSizeWithTag(6, c02hx2.extra) + protoAdapter.encodedSizeWithTag(7, c02hx2.action_redirect_type) + protoAdapter.encodedSizeWithTag(8, c02hx2.judge_result) + c02hx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C02HX c02hx) {
        }
    };
    public Integer action;
    public Integer action_redirect_type;
    public String action_text;
    public String extra;
    public Integer judge_result;
    public String link_schema;
    public Integer reason;
    public String text;

    public C02HX() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C582502Ox newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
