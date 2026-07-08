package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.029u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5432029u extends Message<C5432029u, C02NQ> {
    public static final ProtoAdapter<C5432029u> ADAPTER = new ProtoAdapter<C5432029u>() { // from class: X.029r
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5432029u decode(ProtoReader protoReader) {
            C5432029u c5432029u = new C5432029u();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5432029u.link_text_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c5432029u.text_attribute = C5428029q.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c5432029u.icon_attribute = C02Z7.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c5432029u.space_attribute = C02ZA.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c5432029u.countdown_attribute = C02EC.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5432029u.extra_info = C648402fy.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5432029u.ec_rich_text_countdown_attribute = C2225001C6o.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5432029u;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5432029u c5432029u) {
            C5432029u c5432029u2 = c5432029u;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c5432029u2.link_text_type) + C5428029q.ADAPTER.encodedSizeWithTag(2, c5432029u2.text_attribute) + C02Z7.ADAPTER.encodedSizeWithTag(3, c5432029u2.icon_attribute) + C02ZA.ADAPTER.encodedSizeWithTag(4, c5432029u2.space_attribute) + C02EC.ADAPTER.encodedSizeWithTag(5, c5432029u2.countdown_attribute) + C648402fy.ADAPTER.encodedSizeWithTag(6, c5432029u2.extra_info) + C2225001C6o.ADAPTER.encodedSizeWithTag(7, c5432029u2.ec_rich_text_countdown_attribute) + c5432029u2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5432029u c5432029u) {
        }
    };
    public C02EC countdown_attribute;
    public C2225001C6o ec_rich_text_countdown_attribute;
    public C648402fy extra_info;
    public C02Z7 icon_attribute;
    public Integer link_text_type;
    public C02ZA space_attribute;
    public C5428029q text_attribute;

    public C5432029u() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02NQ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
