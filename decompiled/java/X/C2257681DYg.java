package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DYg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2257681DYg extends Message<C2257681DYg, C2257701DYi> {
    public static final EnumC2244811Ctb DEFAULT_AUTO_REPLY_SWITCH;
    public static final Long DEFAULT_CREATE_TIME;
    public static final C062G DEFAULT_MODE;
    public static final EnumC2244811Ctb DEFAULT_SUGGESTED_REPLY_SWITCH;
    public static final Long DEFAULT_UPDATE_TIME;
    public static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer app_id;

    @WireField(adapter = "im_bot.BotSwitchStatus#ADAPTER", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_12)
    public final EnumC2244811Ctb auto_reply_switch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String avoid;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer biz_id;

    @WireField(adapter = "im_bot.BotAccountInfo#ADAPTER", tag = 7)
    public final C1DAR bot_account_info;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 1)
    public final Long bot_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 16)
    public final String check_first;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = BdTuring.TYPE_SMS_VOICE)
    public final Long create_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 6)
    public final Long creator_uid;

    @WireField(adapter = "im_bot.BotMode#ADAPTER", tag = LiveToolbarIconStyleSetting.GRAY_WITH_TEXT)
    public final C062G mode;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = BdTuring.TYPE_ECAF)
    public final Double progress_percentage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = HorizontalCarouselRecentEffectsLimitAB.LIMIT_10)
    public final String progress_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String prompt;

    @WireField(adapter = "im_bot.BotScene#ADAPTER", tag = 4)
    public final C062L scene;

    @WireField(adapter = "im_bot.BotStatus#ADAPTER", tag = 5)
    public final C062E status;

    @WireField(adapter = "im_bot.BotSwitchStatus#ADAPTER", tag = BdTuring.TYPE_EMAIL)
    public final EnumC2244811Ctb suggested_reply_switch;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 14)
    public final Long update_time;
    public static final ProtoAdapter<C2257681DYg> ADAPTER = new ProtoAdapter<C2257681DYg>() { // from class: X.1DYh
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2257681DYg decode(ProtoReader protoReader) {
            C2257701DYi c2257701DYi = new C2257701DYi();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c2257701DYi.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 2:
                            c2257701DYi.LJ = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                            c2257701DYi.LJFF = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 4:
                            try {
                                c2257701DYi.LJI = C062L.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                TryCatchGuardChecker.doCheck(e);
                                c2257701DYi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            break;
                        case 5:
                            try {
                                c2257701DYi.LJII = C062E.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                c2257701DYi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                            }
                            break;
                        case 6:
                            c2257701DYi.LJIIIIZZ = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 7:
                            c2257701DYi.LJIIIZ = C1DAR.ADAPTER.decode(protoReader);
                            break;
                        case 8:
                            c2257701DYi.LJIIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c2257701DYi.LJIIJJI = ProtoAdapter.DOUBLE.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c2257701DYi.LJIIL = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            try {
                                c2257701DYi.LJIILIIL = EnumC2244811Ctb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                c2257701DYi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            try {
                                c2257701DYi.LJIILJJIL = EnumC2244811Ctb.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                TryCatchGuardChecker.doCheck(e4);
                                c2257701DYi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                            }
                            break;
                        case BdTuring.TYPE_SMS_VOICE /* 13 */:
                            c2257701DYi.LJIILL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 14:
                            c2257701DYi.LJIILLIIL = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 15:
                            c2257701DYi.LJIIZILJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 16:
                            c2257701DYi.LJIJ = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                            try {
                                c2257701DYi.LJIJI = C062G.ADAPTER.decode(protoReader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                TryCatchGuardChecker.doCheck(e5);
                                c2257701DYi.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                            }
                            break;
                        default:
                            FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                            c2257701DYi.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2257701DYi.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2257681DYg c2257681DYg) {
            C2257681DYg c2257681DYg2 = c2257681DYg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c2257681DYg2.bot_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c2257681DYg2.biz_id) + protoAdapter2.encodedSizeWithTag(3, c2257681DYg2.app_id) + C062L.ADAPTER.encodedSizeWithTag(4, c2257681DYg2.scene) + C062E.ADAPTER.encodedSizeWithTag(5, c2257681DYg2.status) + protoAdapter.encodedSizeWithTag(6, c2257681DYg2.creator_uid) + C1DAR.ADAPTER.encodedSizeWithTag(7, c2257681DYg2.bot_account_info);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(8, c2257681DYg2.prompt) + ProtoAdapter.DOUBLE.encodedSizeWithTag(9, c2257681DYg2.progress_percentage) + protoAdapter3.encodedSizeWithTag(10, c2257681DYg2.progress_text);
            ProtoAdapter<EnumC2244811Ctb> protoAdapter4 = EnumC2244811Ctb.ADAPTER;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(11, c2257681DYg2.suggested_reply_switch) + protoAdapter4.encodedSizeWithTag(12, c2257681DYg2.auto_reply_switch) + protoAdapter.encodedSizeWithTag(13, c2257681DYg2.create_time) + protoAdapter.encodedSizeWithTag(14, c2257681DYg2.update_time) + protoAdapter3.encodedSizeWithTag(15, c2257681DYg2.avoid) + protoAdapter3.encodedSizeWithTag(16, c2257681DYg2.check_first) + C062G.ADAPTER.encodedSizeWithTag(17, c2257681DYg2.mode) + c2257681DYg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2257681DYg redact(C2257681DYg c2257681DYg) {
            C2257701DYi c2257701DYiNewBuilder = c2257681DYg.newBuilder();
            C1DAR c1dar = c2257701DYiNewBuilder.LJIIIZ;
            if (c1dar != null) {
                c2257701DYiNewBuilder.LJIIIZ = C1DAR.ADAPTER.redact(c1dar);
            }
            c2257701DYiNewBuilder.clearUnknownFields();
            return c2257701DYiNewBuilder.build();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2257681DYg c2257681DYg) {
            C2257681DYg c2257681DYg2 = c2257681DYg;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c2257681DYg2.bot_id);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, c2257681DYg2.biz_id);
            protoAdapter2.encodeWithTag(protoWriter, 3, c2257681DYg2.app_id);
            C062L.ADAPTER.encodeWithTag(protoWriter, 4, c2257681DYg2.scene);
            C062E.ADAPTER.encodeWithTag(protoWriter, 5, c2257681DYg2.status);
            protoAdapter.encodeWithTag(protoWriter, 6, c2257681DYg2.creator_uid);
            C1DAR.ADAPTER.encodeWithTag(protoWriter, 7, c2257681DYg2.bot_account_info);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 8, c2257681DYg2.prompt);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 9, c2257681DYg2.progress_percentage);
            protoAdapter3.encodeWithTag(protoWriter, 10, c2257681DYg2.progress_text);
            ProtoAdapter<EnumC2244811Ctb> protoAdapter4 = EnumC2244811Ctb.ADAPTER;
            protoAdapter4.encodeWithTag(protoWriter, 11, c2257681DYg2.suggested_reply_switch);
            protoAdapter4.encodeWithTag(protoWriter, 12, c2257681DYg2.auto_reply_switch);
            protoAdapter.encodeWithTag(protoWriter, 13, c2257681DYg2.create_time);
            protoAdapter.encodeWithTag(protoWriter, 14, c2257681DYg2.update_time);
            protoAdapter3.encodeWithTag(protoWriter, 15, c2257681DYg2.avoid);
            protoAdapter3.encodeWithTag(protoWriter, 16, c2257681DYg2.check_first);
            C062G.ADAPTER.encodeWithTag(protoWriter, 17, c2257681DYg2.mode);
            protoWriter.writeBytes(c2257681DYg2.unknownFields());
        }
    };
    public static final Long DEFAULT_BOT_ID = 0L;
    public static final Integer DEFAULT_BIZ_ID = 0;
    public static final Integer DEFAULT_APP_ID = 0;
    public static final C062L DEFAULT_SCENE = C062L.BOT_SCENE_UNKNOWN;
    public static final C062E DEFAULT_STATUS = C062E.BOT_STATUS_UNKNOWN;
    public static final Long DEFAULT_CREATOR_UID = 0L;
    public static final Double DEFAULT_PROGRESS_PERCENTAGE = Double.valueOf(0.0d);

    static {
        EnumC2244811Ctb enumC2244811Ctb = EnumC2244811Ctb.BOT_SWITCH_STATUS_UNKNOWN;
        DEFAULT_SUGGESTED_REPLY_SWITCH = enumC2244811Ctb;
        DEFAULT_AUTO_REPLY_SWITCH = enumC2244811Ctb;
        DEFAULT_CREATE_TIME = 0L;
        DEFAULT_UPDATE_TIME = 0L;
        DEFAULT_MODE = C062G.BOT_MODE_TOPIC;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Long l = this.bot_id;
        int iHashCode2 = (iHashCode + (l != null ? l.hashCode() : 0)) * 37;
        Integer num = this.biz_id;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 37;
        Integer num2 = this.app_id;
        int iHashCode4 = (iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 37;
        C062L c062l = this.scene;
        int iHashCode5 = (iHashCode4 + (c062l != null ? c062l.hashCode() : 0)) * 37;
        C062E c062e = this.status;
        int iHashCode6 = (iHashCode5 + (c062e != null ? c062e.hashCode() : 0)) * 37;
        Long l2 = this.creator_uid;
        int iHashCode7 = (iHashCode6 + (l2 != null ? l2.hashCode() : 0)) * 37;
        C1DAR c1dar = this.bot_account_info;
        int iHashCode8 = (iHashCode7 + (c1dar != null ? c1dar.hashCode() : 0)) * 37;
        String str = this.prompt;
        int iHashCode9 = (iHashCode8 + (str != null ? str.hashCode() : 0)) * 37;
        Double d = this.progress_percentage;
        int iHashCode10 = (iHashCode9 + (d != null ? d.hashCode() : 0)) * 37;
        String str2 = this.progress_text;
        int iHashCode11 = (iHashCode10 + (str2 != null ? str2.hashCode() : 0)) * 37;
        EnumC2244811Ctb enumC2244811Ctb = this.suggested_reply_switch;
        int iHashCode12 = (iHashCode11 + (enumC2244811Ctb != null ? enumC2244811Ctb.hashCode() : 0)) * 37;
        EnumC2244811Ctb enumC2244811Ctb2 = this.auto_reply_switch;
        int iHashCode13 = (iHashCode12 + (enumC2244811Ctb2 != null ? enumC2244811Ctb2.hashCode() : 0)) * 37;
        Long l3 = this.create_time;
        int iHashCode14 = (iHashCode13 + (l3 != null ? l3.hashCode() : 0)) * 37;
        Long l4 = this.update_time;
        int iHashCode15 = (iHashCode14 + (l4 != null ? l4.hashCode() : 0)) * 37;
        String str3 = this.avoid;
        int iHashCode16 = (iHashCode15 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.check_first;
        int iHashCode17 = (iHashCode16 + (str4 != null ? str4.hashCode() : 0)) * 37;
        C062G c062g = this.mode;
        int iHashCode18 = iHashCode17 + (c062g != null ? c062g.hashCode() : 0);
        this.hashCode = iHashCode18;
        return iHashCode18;
    }

    @Override // com.squareup.wire.Message
    public C2257701DYi newBuilder() {
        C2257701DYi c2257701DYi = new C2257701DYi();
        c2257701DYi.LIZLLL = this.bot_id;
        c2257701DYi.LJ = this.biz_id;
        c2257701DYi.LJFF = this.app_id;
        c2257701DYi.LJI = this.scene;
        c2257701DYi.LJII = this.status;
        c2257701DYi.LJIIIIZZ = this.creator_uid;
        c2257701DYi.LJIIIZ = this.bot_account_info;
        c2257701DYi.LJIIJ = this.prompt;
        c2257701DYi.LJIIJJI = this.progress_percentage;
        c2257701DYi.LJIIL = this.progress_text;
        c2257701DYi.LJIILIIL = this.suggested_reply_switch;
        c2257701DYi.LJIILJJIL = this.auto_reply_switch;
        c2257701DYi.LJIILL = this.create_time;
        c2257701DYi.LJIILLIIL = this.update_time;
        c2257701DYi.LJIIZILJ = this.avoid;
        c2257701DYi.LJIJ = this.check_first;
        c2257701DYi.LJIJI = this.mode;
        c2257701DYi.addUnknownFields(unknownFields());
        return c2257701DYi;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bot_id != null) {
            sb.append(", bot_id=");
            sb.append(this.bot_id);
        }
        if (this.biz_id != null) {
            sb.append(", biz_id=");
            sb.append(this.biz_id);
        }
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.scene != null) {
            sb.append(", scene=");
            sb.append(this.scene);
        }
        if (this.status != null) {
            sb.append(", status=");
            sb.append(this.status);
        }
        if (this.creator_uid != null) {
            sb.append(", creator_uid=");
            sb.append(this.creator_uid);
        }
        if (this.bot_account_info != null) {
            sb.append(", bot_account_info=");
            sb.append(this.bot_account_info);
        }
        if (this.prompt != null) {
            sb.append(", prompt=");
            sb.append(this.prompt);
        }
        if (this.progress_percentage != null) {
            sb.append(", progress_percentage=");
            sb.append(this.progress_percentage);
        }
        if (this.progress_text != null) {
            sb.append(", progress_text=");
            sb.append(this.progress_text);
        }
        if (this.suggested_reply_switch != null) {
            sb.append(", suggested_reply_switch=");
            sb.append(this.suggested_reply_switch);
        }
        if (this.auto_reply_switch != null) {
            sb.append(", auto_reply_switch=");
            sb.append(this.auto_reply_switch);
        }
        if (this.create_time != null) {
            sb.append(", create_time=");
            sb.append(this.create_time);
        }
        if (this.update_time != null) {
            sb.append(", update_time=");
            sb.append(this.update_time);
        }
        if (this.avoid != null) {
            sb.append(", avoid=");
            sb.append(this.avoid);
        }
        if (this.check_first != null) {
            sb.append(", check_first=");
            sb.append(this.check_first);
        }
        if (this.mode != null) {
            sb.append(", mode=");
            sb.append(this.mode);
        }
        sb.replace(0, 2, "BotInfo{");
        sb.append('}');
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2257681DYg)) {
            return false;
        }
        C2257681DYg c2257681DYg = (C2257681DYg) obj;
        if (unknownFields().equals(c2257681DYg.unknownFields()) && C1516540pZE.LJ(this.bot_id, c2257681DYg.bot_id) && C1516540pZE.LJ(this.biz_id, c2257681DYg.biz_id) && C1516540pZE.LJ(this.app_id, c2257681DYg.app_id) && C1516540pZE.LJ(this.scene, c2257681DYg.scene) && C1516540pZE.LJ(this.status, c2257681DYg.status) && C1516540pZE.LJ(this.creator_uid, c2257681DYg.creator_uid) && C1516540pZE.LJ(this.bot_account_info, c2257681DYg.bot_account_info) && C1516540pZE.LJ(this.prompt, c2257681DYg.prompt) && C1516540pZE.LJ(this.progress_percentage, c2257681DYg.progress_percentage) && C1516540pZE.LJ(this.progress_text, c2257681DYg.progress_text) && C1516540pZE.LJ(this.suggested_reply_switch, c2257681DYg.suggested_reply_switch) && C1516540pZE.LJ(this.auto_reply_switch, c2257681DYg.auto_reply_switch) && C1516540pZE.LJ(this.create_time, c2257681DYg.create_time) && C1516540pZE.LJ(this.update_time, c2257681DYg.update_time) && C1516540pZE.LJ(this.avoid, c2257681DYg.avoid) && C1516540pZE.LJ(this.check_first, c2257681DYg.check_first) && C1516540pZE.LJ(this.mode, c2257681DYg.mode)) {
            return true;
        }
        return false;
    }

    public C2257681DYg(Long l, Integer num, Integer num2, C062L c062l, C062E c062e, Long l2, C1DAR c1dar, String str, Double d, String str2, EnumC2244811Ctb enumC2244811Ctb, EnumC2244811Ctb enumC2244811Ctb2, Long l3, Long l4, String str3, String str4, C062G c062g) {
        this(l, num, num2, c062l, c062e, l2, c1dar, str, d, str2, enumC2244811Ctb, enumC2244811Ctb2, l3, l4, str3, str4, c062g, ByteString.EMPTY);
    }

    public C2257681DYg(Long l, Integer num, Integer num2, C062L c062l, C062E c062e, Long l2, C1DAR c1dar, String str, Double d, String str2, EnumC2244811Ctb enumC2244811Ctb, EnumC2244811Ctb enumC2244811Ctb2, Long l3, Long l4, String str3, String str4, C062G c062g, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bot_id = l;
        this.biz_id = num;
        this.app_id = num2;
        this.scene = c062l;
        this.status = c062e;
        this.creator_uid = l2;
        this.bot_account_info = c1dar;
        this.prompt = str;
        this.progress_percentage = d;
        this.progress_text = str2;
        this.suggested_reply_switch = enumC2244811Ctb;
        this.auto_reply_switch = enumC2244811Ctb2;
        this.create_time = l3;
        this.update_time = l4;
        this.avoid = str3;
        this.check_first = str4;
        this.mode = c062g;
    }
}
