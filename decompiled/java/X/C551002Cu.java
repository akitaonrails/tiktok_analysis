package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C551002Cu extends Message<C551002Cu, C577502Mz> {
    public static final ProtoAdapter<C551002Cu> ADAPTER = new ProtoAdapter<C551002Cu>() { // from class: X.0275
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C551002Cu decode(ProtoReader protoReader) {
            C551002Cu c551002Cu = new C551002Cu();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c551002Cu.image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c551002Cu.promotion_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c551002Cu.dark_mode_image = C02U1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c551002Cu.promotionLogoType = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 5:
                            c551002Cu.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c551002Cu.bcm_nova_delivery_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c551002Cu;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C551002Cu c551002Cu) {
            C551002Cu c551002Cu2 = c551002Cu;
            ProtoAdapter<C02U1> protoAdapter = C02U1.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c551002Cu2.image);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c551002Cu2.promotion_id) + protoAdapter.encodedSizeWithTag(3, c551002Cu2.dark_mode_image) + ProtoAdapter.INT32.encodedSizeWithTag(4, c551002Cu2.promotionLogoType) + protoAdapter2.encodedSizeWithTag(5, c551002Cu2.da_info) + protoAdapter2.encodedSizeWithTag(6, c551002Cu2.bcm_nova_delivery_id) + c551002Cu2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C551002Cu c551002Cu) {
        }
    };
    public String bcm_nova_delivery_id;
    public String da_info;
    public C02U1 dark_mode_image;
    public C02U1 image;
    public Integer promotionLogoType;
    public String promotion_id;

    public C551002Cu() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C577502Mz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
