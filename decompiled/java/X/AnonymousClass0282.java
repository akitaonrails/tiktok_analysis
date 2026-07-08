package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0282, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0282 extends Message<AnonymousClass0282, C583902Pl> {
    public static final ProtoAdapter<AnonymousClass0282> ADAPTER = new ProtoAdapter<AnonymousClass0282>() { // from class: X.024y
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0282 decode(ProtoReader protoReader) {
            AnonymousClass0282 anonymousClass0282 = new AnonymousClass0282();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0282.icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0282.description_title = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0282.descriptions.add(C5434029w.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            anonymousClass0282.appendix_template = C5434029w.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0282.logistics_rich_text = C5434029w.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0282.delivery_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0282.shipping_fee = C02FG.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0282;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0282 anonymousClass0282) {
            AnonymousClass0282 anonymousClass02822 = anonymousClass0282;
            int iEncodedSizeWithTag = C029C.ADAPTER.encodedSizeWithTag(1, anonymousClass02822.icon);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, anonymousClass02822.description_title);
            ProtoAdapter<C5434029w> protoAdapter2 = C5434029w.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter2.asRepeated().encodedSizeWithTag(3, anonymousClass02822.descriptions) + protoAdapter2.encodedSizeWithTag(4, anonymousClass02822.appendix_template) + protoAdapter2.encodedSizeWithTag(5, anonymousClass02822.logistics_rich_text) + protoAdapter.encodedSizeWithTag(6, anonymousClass02822.delivery_name) + C02FG.ADAPTER.encodedSizeWithTag(7, anonymousClass02822.shipping_fee) + anonymousClass02822.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0282 anonymousClass0282) {
        }
    };
    public C5434029w appendix_template;
    public String delivery_name;
    public String description_title;
    public List<C5434029w> descriptions;
    public C029C icon;
    public C5434029w logistics_rich_text;
    public C02FG shipping_fee;

    public AnonymousClass0282() {
        super(ADAPTER, ByteString.EMPTY);
        this.descriptions = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C583902Pl newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
