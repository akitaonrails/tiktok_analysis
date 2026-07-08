package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C6u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2225061C6u extends Message<C2225061C6u, C2225071C6v> {
    public static final ProtoAdapter<C2225061C6u> ADAPTER = new ProtoAdapter<C2225061C6u>() { // from class: X.1C6t
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2225061C6u decode(ProtoReader protoReader) {
            C2225061C6u c2225061C6u = new C2225061C6u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        switch (iNextTag) {
                            case 1:
                                c2225061C6u.promotion_group_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 2:
                                c2225061C6u.promotion_group_title = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 3:
                                c2225061C6u.group_detail_page = C2225031C6r.ADAPTER.decode(protoReader);
                                break;
                            case 4:
                                c2225061C6u.promotion_group_sub_title = C5431029t.ADAPTER.decode(protoReader);
                                break;
                            case 5:
                                c2225061C6u.group_index = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 6:
                                c2225061C6u.group_total_count = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c2225061C6u.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2225061C6u;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2225061C6u c2225061C6u) {
            C2225061C6u c2225061C6u2 = c2225061C6u;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2225061C6u2.promotion_group_type);
            ProtoAdapter<C5431029t> protoAdapter2 = C5431029t.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2225061C6u2.promotion_group_title) + C2225031C6r.ADAPTER.encodedSizeWithTag(3, c2225061C6u2.group_detail_page) + protoAdapter2.encodedSizeWithTag(4, c2225061C6u2.promotion_group_sub_title) + protoAdapter.encodedSizeWithTag(5, c2225061C6u2.group_index) + protoAdapter.encodedSizeWithTag(6, c2225061C6u2.group_total_count) + ProtoAdapter.STRING.encodedSizeWithTag(100, c2225061C6u2.da_info) + c2225061C6u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2225061C6u c2225061C6u) {
        }
    };
    public String da_info;
    public C2225031C6r group_detail_page;
    public Integer group_index;
    public Integer group_total_count;
    public C5431029t promotion_group_sub_title;
    public C5431029t promotion_group_title;
    public Integer promotion_group_type;

    public C2225061C6u() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2225071C6v newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
