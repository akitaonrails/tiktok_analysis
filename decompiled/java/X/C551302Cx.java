package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551302Cx extends Message<C551302Cx, C582202Ou> {
    public static final ProtoAdapter<C551302Cx> ADAPTER = new ProtoAdapter<C551302Cx>() { // from class: X.027A
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551302Cx decode(ProtoReader protoReader) {
            C551302Cx c551302Cx = new C551302Cx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551302Cx.key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c551302Cx.count_show_content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c551302Cx.count = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            c551302Cx.content = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c551302Cx.head_tag = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c551302Cx.seller_detail_popup = C685802m0.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551302Cx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551302Cx c551302Cx) {
            C551302Cx c551302Cx2 = c551302Cx;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c551302Cx2.key) + protoAdapter.encodedSizeWithTag(2, c551302Cx2.count_show_content) + ProtoAdapter.INT64.encodedSizeWithTag(3, c551302Cx2.count) + protoAdapter.encodedSizeWithTag(4, c551302Cx2.content) + protoAdapter.encodedSizeWithTag(5, c551302Cx2.head_tag) + C685802m0.ADAPTER.encodedSizeWithTag(6, c551302Cx2.seller_detail_popup) + c551302Cx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551302Cx c551302Cx) {
        }
    };
    public String content;
    public Long count;
    public String count_show_content;
    public String head_tag;
    public String key;
    public C685802m0 seller_detail_popup;

    public C551302Cx() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C582202Ou newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
