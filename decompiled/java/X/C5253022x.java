package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.022x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5253022x extends Message<C5253022x, C02PT> {
    public static final ProtoAdapter<C5253022x> ADAPTER = new ProtoAdapter<C5253022x>() { // from class: X.021Z
        public final ProtoAdapter<Map<String, String>> LIZ;
        public final ProtoAdapter<Map<String, C544002Ac>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, C544002Ac.ADAPTER);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C5253022x decode(ProtoReader protoReader) {
            C5253022x c5253022x = new C5253022x();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 200) {
                        switch (iNextTag) {
                            case 1:
                                c5253022x.announcement_id = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 2:
                                c5253022x.material_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 3:
                                c5253022x.text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 4:
                                c5253022x.link = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case 5:
                                c5253022x.icon = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case 6:
                                c5253022x.background = C02U1.ADAPTER.decode(protoReader);
                                break;
                            case 7:
                                c5253022x.announcement_show_type = ProtoAdapter.INT32.decode(protoReader);
                                break;
                            case 8:
                                c5253022x.icon_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_ECAF /* 9 */:
                                c5253022x.clickable = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                c5253022x.bold_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case BdTuring.TYPE_EMAIL /* 11 */:
                                c5253022x.button_text = ProtoAdapter.STRING.decode(protoReader);
                                break;
                            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                c5253022x.usable_end_time = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                c5253022x.arguments.putAll(this.LIZ.decode(protoReader));
                                break;
                            case 14:
                                c5253022x.link_arguments.putAll(this.LIZIZ.decode(protoReader));
                                break;
                            case 15:
                                c5253022x.max_text_line = ProtoAdapter.INT64.decode(protoReader);
                                break;
                            case 16:
                                c5253022x.closeable = ProtoAdapter.BOOL.decode(protoReader);
                                break;
                            default:
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                break;
                        }
                    } else {
                        c5253022x.da_info = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c5253022x;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C5253022x c5253022x) {
            C5253022x c5253022x2 = c5253022x;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c5253022x2.announcement_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c5253022x2.material_type) + protoAdapter.encodedSizeWithTag(3, c5253022x2.text) + protoAdapter.encodedSizeWithTag(4, c5253022x2.link);
            ProtoAdapter<C02U1> protoAdapter3 = C02U1.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(5, c5253022x2.icon) + protoAdapter3.encodedSizeWithTag(6, c5253022x2.background) + protoAdapter2.encodedSizeWithTag(7, c5253022x2.announcement_show_type) + protoAdapter.encodedSizeWithTag(8, c5253022x2.icon_text);
            ProtoAdapter<Boolean> protoAdapter4 = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag4 = iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(9, c5253022x2.clickable) + protoAdapter.encodedSizeWithTag(10, c5253022x2.bold_text) + protoAdapter.encodedSizeWithTag(11, c5253022x2.button_text);
            ProtoAdapter<Long> protoAdapter5 = ProtoAdapter.INT64;
            return iEncodedSizeWithTag4 + protoAdapter5.encodedSizeWithTag(12, c5253022x2.usable_end_time) + this.LIZ.encodedSizeWithTag(13, c5253022x2.arguments) + this.LIZIZ.encodedSizeWithTag(14, c5253022x2.link_arguments) + protoAdapter5.encodedSizeWithTag(15, c5253022x2.max_text_line) + protoAdapter4.encodedSizeWithTag(16, c5253022x2.closeable) + protoAdapter.encodedSizeWithTag(200, c5253022x2.da_info) + c5253022x2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C5253022x c5253022x) {
        }
    };
    public String announcement_id;
    public Integer announcement_show_type;
    public Map<String, String> arguments;
    public C02U1 background;
    public String bold_text;
    public String button_text;
    public Boolean clickable;
    public Boolean closeable;
    public String da_info;
    public C02U1 icon;
    public String icon_text;
    public String link;
    public Map<String, C544002Ac> link_arguments;
    public Integer material_type;
    public Long max_text_line;
    public String text;
    public Long usable_end_time;

    @Override // com.squareup.wire.Message
    public C02PT newBuilder() {
        return null;
    }

    public C5253022x() {
        super(ADAPTER, ByteString.EMPTY);
        this.arguments = new LinkedHashMap();
        this.link_arguments = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
