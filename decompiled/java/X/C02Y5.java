package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Y5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C02Y5 extends Message<C02Y5, C02Y6> {
    public static final ProtoAdapter<C02Y5> ADAPTER = new ProtoAdapter<C02Y5>() { // from class: X.02Y4
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C02Y5 decode(ProtoReader protoReader) {
            C02Y5 c02y5 = new C02Y5();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 2:
                            c02y5.background = C676402kU.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c02y5.action_button = C02R1.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c02y5.dislike_button = C637202eA.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                        case 6:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 7:
                            c02y5.card_margin = C1C3S.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c02y5.card_layout = C02Y3.ADAPTER.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c02y5.lynx_card_reserve = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c02y5.is_light_mode = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c02y5.is_sko_mode = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c02y5;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C02Y5 c02y5) {
            C02Y5 c02y52 = c02y5;
            int iEncodedSizeWithTag = C676402kU.ADAPTER.encodedSizeWithTag(2, c02y52.background) + C02R1.ADAPTER.encodedSizeWithTag(3, c02y52.action_button) + C637202eA.ADAPTER.encodedSizeWithTag(4, c02y52.dislike_button) + C1C3S.ADAPTER.encodedSizeWithTag(7, c02y52.card_margin) + C02Y3.ADAPTER.encodedSizeWithTag(8, c02y52.card_layout) + ProtoAdapter.STRING.encodedSizeWithTag(9, c02y52.lynx_card_reserve);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(10, c02y52.is_light_mode) + protoAdapter.encodedSizeWithTag(11, c02y52.is_sko_mode) + c02y52.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C02Y5 c02y5) {
            C02Y5 c02y52 = c02y5;
            C676402kU.ADAPTER.encodeWithTag(protoWriter, 2, c02y52.background);
            C02R1.ADAPTER.encodeWithTag(protoWriter, 3, c02y52.action_button);
            C637202eA.ADAPTER.encodeWithTag(protoWriter, 4, c02y52.dislike_button);
            C1C3S.ADAPTER.encodeWithTag(protoWriter, 7, c02y52.card_margin);
            C02Y3.ADAPTER.encodeWithTag(protoWriter, 8, c02y52.card_layout);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, c02y52.lynx_card_reserve);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 10, c02y52.is_light_mode);
            protoAdapter.encodeWithTag(protoWriter, 11, c02y52.is_sko_mode);
            protoWriter.writeBytes(c02y52.unknownFields());
        }
    };
    public C02R1 action_button;
    public C676402kU background;
    public C02Y3 card_layout;
    public C1C3S card_margin;
    public C637202eA dislike_button;
    public Boolean is_light_mode;
    public Boolean is_sko_mode;
    public String lynx_card_reserve;

    public C02Y5() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02Y6 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
