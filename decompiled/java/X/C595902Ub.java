package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C595902Ub extends Message<C595902Ub, C596002Uc> {
    public static final ProtoAdapter<C595902Ub> ADAPTER = new ProtoAdapter<C595902Ub>() { // from class: X.02Ua
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C595902Ub decode(ProtoReader protoReader) {
            C595902Ub c595902Ub = new C595902Ub();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c595902Ub.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c595902Ub.has_qualified = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 3:
                            c595902Ub.banner_ratio = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c595902Ub.addon_banner_info_item_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c595902Ub.threshold_diff = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c595902Ub.threshold_diff_str = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c595902Ub.sub_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c595902Ub;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C595902Ub c595902Ub) {
            C595902Ub c595902Ub2 = c595902Ub;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c595902Ub2.content) + ProtoAdapter.BOOL.encodedSizeWithTag(2, c595902Ub2.has_qualified);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(3, c595902Ub2.banner_ratio) + protoAdapter2.encodedSizeWithTag(4, c595902Ub2.addon_banner_info_item_type) + protoAdapter.encodedSizeWithTag(5, c595902Ub2.threshold_diff) + protoAdapter.encodedSizeWithTag(6, c595902Ub2.threshold_diff_str) + protoAdapter.encodedSizeWithTag(7, c595902Ub2.sub_content) + c595902Ub2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C595902Ub c595902Ub) {
        }
    };
    public Integer addon_banner_info_item_type;
    public Integer banner_ratio;
    public String content;
    public Boolean has_qualified;
    public String sub_content;
    public String threshold_diff;
    public String threshold_diff_str;

    public C595902Ub() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C596002Uc newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
