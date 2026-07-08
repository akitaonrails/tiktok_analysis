package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C660702hx extends Message<C660702hx, C660802hy> {
    public static final ProtoAdapter<C660702hx> ADAPTER = new ProtoAdapter<C660702hx>() { // from class: X.02hw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C660702hx decode(ProtoReader protoReader) {
            C660702hx c660702hx = new C660702hx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c660702hx.regex = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c660702hx.error = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c660702hx.region = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c660702hx.match_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c660702hx.params = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c660702hx.match_action = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c660702hx.only_diff = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c660702hx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C660702hx c660702hx) {
            C660702hx c660702hx2 = c660702hx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c660702hx2.regex) + protoAdapter.encodedSizeWithTag(2, c660702hx2.error) + protoAdapter.encodedSizeWithTag(3, c660702hx2.region);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(4, c660702hx2.match_type) + protoAdapter.encodedSizeWithTag(5, c660702hx2.params) + protoAdapter2.encodedSizeWithTag(6, c660702hx2.match_action) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c660702hx2.only_diff) + c660702hx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C660702hx c660702hx) {
        }
    };
    public String error;
    public Integer match_action;
    public Integer match_type;
    public Boolean only_diff;
    public String params;
    public String regex;
    public String region;

    public C660702hx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C660802hy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
