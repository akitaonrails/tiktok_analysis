package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.029x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5435029x extends Message<C5435029x, C02PZ> {
    public static final ProtoAdapter<C5435029x> ADAPTER = new ProtoAdapter<C5435029x>() { // from class: X.023u
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5435029x decode(ProtoReader protoReader) {
            C5435029x c5435029x = new C5435029x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c5435029x.banner_text = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            c5435029x.link_schema = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c5435029x.da_info = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c5435029x.activity_end_countdown_ms = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c5435029x.dialog_on_countdown_end = C5293024l.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            c5435029x.banner_rich_text = C5431029t.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            c5435029x.style = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 8:
                            c5435029x.banner_icon = C029C.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c5435029x.banner_action_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5435029x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5435029x c5435029x) {
            C5435029x c5435029x2 = c5435029x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5435029x2.banner_text) + protoAdapter.encodedSizeWithTag(2, c5435029x2.link_schema) + protoAdapter.encodedSizeWithTag(3, c5435029x2.da_info) + protoAdapter.encodedSizeWithTag(4, c5435029x2.activity_end_countdown_ms) + C5293024l.ADAPTER.encodedSizeWithTag(5, c5435029x2.dialog_on_countdown_end) + C5431029t.ADAPTER.encodedSizeWithTag(6, c5435029x2.banner_rich_text);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(7, c5435029x2.style) + C029C.ADAPTER.encodedSizeWithTag(8, c5435029x2.banner_icon) + protoAdapter2.encodedSizeWithTag(9, c5435029x2.banner_action_type) + c5435029x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5435029x c5435029x) {
        }
    };
    public String activity_end_countdown_ms;
    public Integer banner_action_type;
    public C029C banner_icon;
    public C5431029t banner_rich_text;
    public String banner_text;
    public String da_info;
    public C5293024l dialog_on_countdown_end;
    public String link_schema;
    public Integer style;

    public C5435029x() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02PZ newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
