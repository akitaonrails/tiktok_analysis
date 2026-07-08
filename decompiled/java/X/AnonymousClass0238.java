package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.0238, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0238 extends Message<AnonymousClass0238, C586702Qn> {
    public static final ProtoAdapter<AnonymousClass0238> ADAPTER = new ProtoAdapter<AnonymousClass0238>() { // from class: X.022L
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0238 decode(ProtoReader protoReader) {
            AnonymousClass0238 anonymousClass0238 = new AnonymousClass0238();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 100) {
                        if (iNextTag != 101) {
                            switch (iNextTag) {
                                case 1:
                                    anonymousClass0238.id = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 2:
                                    anonymousClass0238.type = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 3:
                                    anonymousClass0238.text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 4:
                                    anonymousClass0238.extra_text = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case 5:
                                    anonymousClass0238.icon = C741902v3.ADAPTER.decode(protoReader);
                                    break;
                                case 6:
                                    anonymousClass0238.countdown = C02XR.ADAPTER.decode(protoReader);
                                    break;
                                case 7:
                                    anonymousClass0238.default_style = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case 8:
                                    anonymousClass0238.schema = ProtoAdapter.STRING.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    anonymousClass0238.status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    anonymousClass0238.claimed_status = ProtoAdapter.INT32.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    anonymousClass0238.background = C2224681C5i.ADAPTER.decode(protoReader);
                                    break;
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                    anonymousClass0238.is_show_icon = ProtoAdapter.BOOL.decode(protoReader);
                                    break;
                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                    anonymousClass0238.icon_popup = C1C2H.ADAPTER.decode(protoReader);
                                    break;
                                case 14:
                                    anonymousClass0238.text_popup = C1C2H.ADAPTER.decode(protoReader);
                                    break;
                                default:
                                    protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    break;
                            }
                        } else {
                            anonymousClass0238.feature.add(C02HD.ADAPTER.decode(protoReader));
                        }
                    } else {
                        anonymousClass0238.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0238;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0238 anonymousClass0238) {
            AnonymousClass0238 anonymousClass02382 = anonymousClass0238;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02382.id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, anonymousClass02382.type) + protoAdapter.encodedSizeWithTag(3, anonymousClass02382.text) + protoAdapter.encodedSizeWithTag(4, anonymousClass02382.extra_text) + C741902v3.ADAPTER.encodedSizeWithTag(5, anonymousClass02382.icon) + C02XR.ADAPTER.encodedSizeWithTag(6, anonymousClass02382.countdown) + protoAdapter2.encodedSizeWithTag(7, anonymousClass02382.default_style) + protoAdapter.encodedSizeWithTag(8, anonymousClass02382.schema) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02382.status) + protoAdapter2.encodedSizeWithTag(10, anonymousClass02382.claimed_status) + C2224681C5i.ADAPTER.encodedSizeWithTag(11, anonymousClass02382.background) + ProtoAdapter.BOOL.encodedSizeWithTag(12, anonymousClass02382.is_show_icon);
            ProtoAdapter<C1C2H> protoAdapter3 = C1C2H.ADAPTER;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(13, anonymousClass02382.icon_popup) + protoAdapter3.encodedSizeWithTag(14, anonymousClass02382.text_popup) + protoAdapter.encodedSizeWithTag(100, anonymousClass02382.da_info) + C02HD.ADAPTER.asRepeated().encodedSizeWithTag(101, anonymousClass02382.feature) + anonymousClass02382.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0238 anonymousClass0238) {
        }
    };
    public C2224681C5i background;
    public Integer claimed_status;
    public C02XR countdown;
    public String da_info;
    public Integer default_style;
    public String extra_text;
    public List<C02HD> feature;
    public C741902v3 icon;
    public C1C2H icon_popup;
    public String id;
    public Boolean is_show_icon;
    public String schema;
    public Integer status;
    public String text;
    public C1C2H text_popup;
    public Integer type;

    public AnonymousClass0238() {
        super(ADAPTER, ByteString.EMPTY);
        this.feature = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C586702Qn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
