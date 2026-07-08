package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.027R, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027R extends Message<C027R, C585502Qb> {
    public static final ProtoAdapter<C027R> ADAPTER = new ProtoAdapter<C027R>() { // from class: X.024F
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027R decode(ProtoReader protoReader) {
            C027R c027r = new C027R();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027r.is_authorized = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            c027r.to_authorized_seller_ids.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            c027r.title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c027r.description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c027r.auth_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 6:
                            c027r.desc_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c027r.enable_auth_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c027r.disable_auth_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027r;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027R c027r) {
            C027R c027r2 = c027r;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c027r2.is_authorized);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.asRepeated().encodedSizeWithTag(2, c027r2.to_authorized_seller_ids) + protoAdapter.encodedSizeWithTag(3, c027r2.title) + protoAdapter.encodedSizeWithTag(4, c027r2.description) + ProtoAdapter.INT32.encodedSizeWithTag(5, c027r2.auth_type) + C5431029t.ADAPTER.encodedSizeWithTag(6, c027r2.desc_text) + protoAdapter.encodedSizeWithTag(7, c027r2.enable_auth_toast) + protoAdapter.encodedSizeWithTag(8, c027r2.disable_auth_toast) + c027r2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C027R c027r) {
        }
    };
    public Integer auth_type;
    public C5431029t desc_text;
    public String description;
    public String disable_auth_toast;
    public String enable_auth_toast;
    public Boolean is_authorized;
    public String title;
    public List<String> to_authorized_seller_ids;

    public C027R() {
        super(ADAPTER, ByteString.EMPTY);
        this.to_authorized_seller_ids = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C585502Qb newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
