package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0261, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0261 extends Message<AnonymousClass0261, C02PN> {
    public static final ProtoAdapter<AnonymousClass0261> ADAPTER = new ProtoAdapter<AnonymousClass0261>() { // from class: X.0232
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0261 decode(ProtoReader protoReader) {
            AnonymousClass0261 anonymousClass0261 = new AnonymousClass0261();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0261.title = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0261.logistics_descriptions.add(C5431029t.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            anonymousClass0261.logistic_price = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0261.extra_info = C551402Cy.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0261.descriptions_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0261.pudo_service_list = C02ZU.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0261.selected_status = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0261.title_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0261;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0261 anonymousClass0261) {
            AnonymousClass0261 anonymousClass02612 = anonymousClass0261;
            ProtoAdapter<C5431029t> protoAdapter = C5431029t.ADAPTER;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02612.title) + protoAdapter.asRepeated().encodedSizeWithTag(2, anonymousClass02612.logistics_descriptions) + protoAdapter.encodedSizeWithTag(3, anonymousClass02612.logistic_price) + C551402Cy.ADAPTER.encodedSizeWithTag(4, anonymousClass02612.extra_info);
            ProtoAdapter<C029C> protoAdapter2 = C029C.ADAPTER;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(5, anonymousClass02612.descriptions_icon) + C02ZU.ADAPTER.encodedSizeWithTag(6, anonymousClass02612.pudo_service_list) + ProtoAdapter.BOOL.encodedSizeWithTag(7, anonymousClass02612.selected_status) + protoAdapter2.encodedSizeWithTag(8, anonymousClass02612.title_icon) + anonymousClass02612.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0261 anonymousClass0261) {
        }
    };
    public C029C descriptions_icon;
    public C551402Cy extra_info;
    public C5431029t logistic_price;
    public List<C5431029t> logistics_descriptions;
    public C02ZU pudo_service_list;
    public Boolean selected_status;
    public C5431029t title;
    public C029C title_icon;

    public AnonymousClass0261() {
        super(ADAPTER, ByteString.EMPTY);
        this.logistics_descriptions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02PN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
