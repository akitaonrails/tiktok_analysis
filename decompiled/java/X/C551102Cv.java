package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551102Cv extends Message<C551102Cv, C580602Oe> {
    public static final ProtoAdapter<C551102Cv> ADAPTER = new ProtoAdapter<C551102Cv>() { // from class: X.0278
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551102Cv decode(ProtoReader protoReader) {
            C551102Cv c551102Cv = new C551102Cv();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551102Cv.is_need_recovery_marketing = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c551102Cv.voucher_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c551102Cv.tip_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c551102Cv.tip_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c551102Cv.tip_button = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c551102Cv.channel = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551102Cv;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551102Cv c551102Cv) {
            C551102Cv c551102Cv2 = c551102Cv;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c551102Cv2.is_need_recovery_marketing);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c551102Cv2.voucher_id) + protoAdapter.encodedSizeWithTag(3, c551102Cv2.tip_title) + protoAdapter.encodedSizeWithTag(4, c551102Cv2.tip_content) + protoAdapter.encodedSizeWithTag(5, c551102Cv2.tip_button) + ProtoAdapter.INT32.encodedSizeWithTag(6, c551102Cv2.channel) + c551102Cv2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551102Cv c551102Cv) {
        }
    };
    public Integer channel;
    public Boolean is_need_recovery_marketing;
    public String tip_button;
    public String tip_content;
    public String tip_title;
    public String voucher_id;

    public C551102Cv() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C580602Oe newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
