package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1C3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2224291C3v extends Message<C2224291C3v, C723602s6> {
    public static final ProtoAdapter<C2224291C3v> ADAPTER = new ProtoAdapter<C2224291C3v>() { // from class: X.1C3u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2224291C3v decode(ProtoReader protoReader) {
            C2224291C3v c2224291C3v = new C2224291C3v();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2224291C3v.instance_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c2224291C3v.voucher_type_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c2224291C3v.status = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            c2224291C3v.instance_price_info = C2224311C3x.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c2224291C3v.instance_show_info = C1518120pbm.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c2224291C3v.dynamic_scope = C2223371C0h.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c2224291C3v.user_voucher_info = C2224261C3s.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2224291C3v;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2224291C3v c2224291C3v) {
            C2224291C3v c2224291C3v2 = c2224291C3v;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c2224291C3v2.instance_key) + protoAdapter.encodedSizeWithTag(2, c2224291C3v2.voucher_type_id) + ProtoAdapter.INT32.encodedSizeWithTag(3, c2224291C3v2.status) + C2224311C3x.ADAPTER.encodedSizeWithTag(4, c2224291C3v2.instance_price_info) + C1518120pbm.ADAPTER.encodedSizeWithTag(5, c2224291C3v2.instance_show_info) + C2223371C0h.ADAPTER.encodedSizeWithTag(6, c2224291C3v2.dynamic_scope) + C2224261C3s.ADAPTER.encodedSizeWithTag(7, c2224291C3v2.user_voucher_info) + c2224291C3v2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C2224291C3v c2224291C3v) {
        }
    };
    public C2223371C0h dynamic_scope;
    public String instance_key;
    public C2224311C3x instance_price_info;
    public C1518120pbm instance_show_info;
    public Integer status;
    public C2224261C3s user_voucher_info;
    public String voucher_type_id;

    public C2224291C3v() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C723602s6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
