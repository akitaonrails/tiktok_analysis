package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0284, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0284 extends Message<AnonymousClass0284, C565402Ii> {
    public static final ProtoAdapter<AnonymousClass0284> ADAPTER = new ProtoAdapter<AnonymousClass0284>() { // from class: X.024P
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0284 decode(ProtoReader protoReader) {
            AnonymousClass0284 anonymousClass0284 = new AnonymousClass0284();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0284.head_image_url = C673002jw.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0284.offline_info_list.add(C02G1.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            anonymousClass0284.challenge_list.add(C021F.ADAPTER.decode(protoReader));
                            break;
                        case 4:
                            anonymousClass0284.smart_phone = C760302y1.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0284.quick_shop_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0284.quick_shop_name = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0284.site_id = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0284;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0284 anonymousClass0284) {
            AnonymousClass0284 anonymousClass02842 = anonymousClass0284;
            int iEncodedSizeWithTag = C673002jw.ADAPTER.encodedSizeWithTag(1, anonymousClass02842.head_image_url) + C02G1.ADAPTER.asRepeated().encodedSizeWithTag(2, anonymousClass02842.offline_info_list) + C021F.ADAPTER.asRepeated().encodedSizeWithTag(3, anonymousClass02842.challenge_list) + C760302y1.ADAPTER.encodedSizeWithTag(4, anonymousClass02842.smart_phone);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(5, anonymousClass02842.quick_shop_url) + protoAdapter.encodedSizeWithTag(6, anonymousClass02842.quick_shop_name) + protoAdapter.encodedSizeWithTag(7, anonymousClass02842.site_id) + anonymousClass02842.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, AnonymousClass0284 anonymousClass0284) {
            AnonymousClass0284 anonymousClass02842 = anonymousClass0284;
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 1, anonymousClass02842.head_image_url);
            C02G1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, anonymousClass02842.offline_info_list);
            C021F.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, anonymousClass02842.challenge_list);
            C760302y1.ADAPTER.encodeWithTag(protoWriter, 4, anonymousClass02842.smart_phone);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 5, anonymousClass02842.quick_shop_url);
            protoAdapter.encodeWithTag(protoWriter, 6, anonymousClass02842.quick_shop_name);
            protoAdapter.encodeWithTag(protoWriter, 7, anonymousClass02842.site_id);
            protoWriter.writeBytes(anonymousClass02842.unknownFields());
        }
    };
    public List<C021F> challenge_list;
    public C673002jw head_image_url;
    public List<C02G1> offline_info_list;
    public String quick_shop_name;
    public String quick_shop_url;
    public String site_id;
    public C760302y1 smart_phone;

    public AnonymousClass0284() {
        super(ADAPTER, ByteString.EMPTY);
        this.offline_info_list = C1516540pZE.LJIIIIZZ();
        this.challenge_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C565402Ii newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
