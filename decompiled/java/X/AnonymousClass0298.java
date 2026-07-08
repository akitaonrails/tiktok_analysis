package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0298, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0298 extends Message<AnonymousClass0298, C02OB> {
    public static final ProtoAdapter<AnonymousClass0298> ADAPTER = new ProtoAdapter<AnonymousClass0298>() { // from class: X.0294
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0298 decode(ProtoReader protoReader) {
            AnonymousClass0298 anonymousClass0298 = new AnonymousClass0298();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0298.store_identity_label = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0298.identity_label_data = AnonymousClass0296.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0298.shop_identity_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0298.brand_logo = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0298.banner_style = C589102Rl.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0298.brand_info = C724002sA.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0298.authorized_data = AnonymousClass0291.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0298.dtc_data = AnonymousClass0297.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0298;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0298 anonymousClass0298) {
            AnonymousClass0298 anonymousClass02982 = anonymousClass0298;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, anonymousClass02982.store_identity_label) + AnonymousClass0296.ADAPTER.encodedSizeWithTag(2, anonymousClass02982.identity_label_data) + ProtoAdapter.STRING.encodedSizeWithTag(3, anonymousClass02982.shop_identity_key) + C02U1.ADAPTER.encodedSizeWithTag(4, anonymousClass02982.brand_logo) + C589102Rl.ADAPTER.encodedSizeWithTag(5, anonymousClass02982.banner_style) + C724002sA.ADAPTER.encodedSizeWithTag(6, anonymousClass02982.brand_info) + AnonymousClass0291.ADAPTER.encodedSizeWithTag(7, anonymousClass02982.authorized_data) + AnonymousClass0297.ADAPTER.encodedSizeWithTag(8, anonymousClass02982.dtc_data) + anonymousClass02982.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0298 anonymousClass0298) {
        }
    };
    public AnonymousClass0291 authorized_data;
    public C589102Rl banner_style;
    public C724002sA brand_info;
    public C02U1 brand_logo;
    public AnonymousClass0297 dtc_data;
    public AnonymousClass0296 identity_label_data;
    public String shop_identity_key;
    public Integer store_identity_label;

    public AnonymousClass0298() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02OB newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
