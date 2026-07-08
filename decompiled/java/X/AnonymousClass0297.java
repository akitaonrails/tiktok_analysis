package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0297, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0297 extends Message<AnonymousClass0297, C02O5> {
    public static final ProtoAdapter<AnonymousClass0297> ADAPTER = new ProtoAdapter<AnonymousClass0297>() { // from class: X.0295
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0297 decode(ProtoReader protoReader) {
            AnonymousClass0297 anonymousClass0297 = new AnonymousClass0297();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0297.equity_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0297.text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            anonymousClass0297.schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0297.right_id_list.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            anonymousClass0297.direct_from_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0297.combined_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0297.bg_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0297.right_image = C643802fE.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0297.banner_text_color = C658602hc.ADAPTER.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0297;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0297 anonymousClass0297) {
            AnonymousClass0297 anonymousClass02972 = anonymousClass0297;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02972.equity_text);
            ProtoAdapter<C658602hc> protoAdapter2 = C658602hc.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, anonymousClass02972.text_color) + protoAdapter.encodedSizeWithTag(3, anonymousClass02972.schema) + protoAdapter.asRepeated().encodedSizeWithTag(4, anonymousClass02972.right_id_list) + protoAdapter.encodedSizeWithTag(5, anonymousClass02972.direct_from_text) + protoAdapter.encodedSizeWithTag(6, anonymousClass02972.combined_text);
            ProtoAdapter<C643802fE> protoAdapter3 = C643802fE.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(7, anonymousClass02972.bg_image) + protoAdapter3.encodedSizeWithTag(8, anonymousClass02972.right_image) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02972.banner_text_color) + anonymousClass02972.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0297 anonymousClass0297) {
        }
    };
    public C658602hc banner_text_color;
    public C643802fE bg_image;
    public String combined_text;
    public String direct_from_text;
    public String equity_text;
    public List<String> right_id_list;
    public C643802fE right_image;
    public String schema;
    public C658602hc text_color;

    public AnonymousClass0297() {
        super(ADAPTER, ByteString.EMPTY);
        this.right_id_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02O5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
