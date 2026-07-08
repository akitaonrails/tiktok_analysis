package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0lxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class EnumC1377930lxf {
    public static final C1377920lxe Companion;
    public static final EnumC1377930lxf FACEBOOK;
    public static final EnumC1377930lxf KAKAOTALK;
    public static final EnumC1377930lxf LINE;
    public static final /* synthetic */ EnumC1377930lxf[] LLILZLL;
    public static final /* synthetic */ C2254308sP LLIZ;
    public static final EnumC1377930lxf MESSENGER;
    public static final EnumC1377930lxf SAVE_LOCAL;
    public static final EnumC1377930lxf SMS;
    public static final EnumC1377930lxf SNAPCHAT;
    public static final EnumC1377930lxf SPARK;
    public static final EnumC1377930lxf TELEGRAM;
    public static final EnumC1377930lxf VIBER;
    public static final EnumC1377930lxf VK;
    public static final EnumC1377930lxf WHATSAPP;
    public static final EnumC1377930lxf ZALO;
    public final String LL;
    public String LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;

    public static InterfaceC2044707zh<EnumC1377930lxf> getEntries() {
        return LLIZ;
    }

    public static final List<EnumC1377930lxf> supportChannels(Activity activity) {
        Companion.getClass();
        return C1377920lxe.LIZ(activity);
    }

    static {
        EnumC1377930lxf enumC1377930lxf = new EnumC1377930lxf(0, R.raw.icon_whatsapp, R.raw.icon_color_whatsapp_circle, 5, "WHATSAPP", "whatsapp", "WhatsApp");
        WHATSAPP = enumC1377930lxf;
        EnumC1377930lxf enumC1377930lxf2 = new EnumC1377930lxf(1, R.raw.icon_facebook_circle, R.raw.icon_color_facebook_circle, 6, "FACEBOOK", "facebook", "Facebook");
        FACEBOOK = enumC1377930lxf2;
        EnumC1377930lxf enumC1377930lxf3 = new EnumC1377930lxf(2, R.raw.icon_messages, R.raw.icon_color_sms_circle, 13, "SMS", "sms", "SMS");
        SMS = enumC1377930lxf3;
        EnumC1377930lxf enumC1377930lxf4 = new EnumC1377930lxf(3, R.raw.icon_messenger, R.raw.icon_color_messenger_circle, 7, "MESSENGER", "messenger", "Messenger");
        MESSENGER = enumC1377930lxf4;
        EnumC1377930lxf enumC1377930lxf5 = new EnumC1377930lxf(4, R.raw.icon_vk, R.raw.icon_color_vk_circle, 9, "VK", "vk", "VK");
        VK = enumC1377930lxf5;
        EnumC1377930lxf enumC1377930lxf6 = new EnumC1377930lxf(5, R.raw.icon_snapchat, R.raw.icon_color_snapchat_circle, 8, "SNAPCHAT", "snapchat", "Snapchat");
        SNAPCHAT = enumC1377930lxf6;
        EnumC1377930lxf enumC1377930lxf7 = new EnumC1377930lxf(6, R.raw.icon_line, R.raw.icon_color_line_circle, 11, "LINE", "line", "Line");
        LINE = enumC1377930lxf7;
        EnumC1377930lxf enumC1377930lxf8 = new EnumC1377930lxf(7, R.raw.icon_zalo, R.raw.icon_color_zalo_circle, 10, "ZALO", "zalo", "Zalo");
        ZALO = enumC1377930lxf8;
        EnumC1377930lxf enumC1377930lxf9 = new EnumC1377930lxf(8, R.raw.icon_kakaotalk, R.raw.icon_color_kakaotalk_circle, 12, "KAKAOTALK", "kakaotalk", "KakaoTalk");
        KAKAOTALK = enumC1377930lxf9;
        EnumC1377930lxf enumC1377930lxf10 = new EnumC1377930lxf(9, R.raw.icon_telegram, R.raw.icon_color_telegram_circle, 18, "TELEGRAM", "telegram", "Telegram");
        TELEGRAM = enumC1377930lxf10;
        EnumC1377930lxf enumC1377930lxf11 = new EnumC1377930lxf(10, R.raw.icon_icon_viber, R.raw.icon_color_viber_circle, 19, "VIBER", "viber", "Viber");
        VIBER = enumC1377930lxf11;
        EnumC1377930lxf enumC1377930lxf12 = new EnumC1377930lxf(11, R.raw.icon_color_tiktok_photos, R.raw.icon_color_tiktok_photos_circle, 20, "SPARK", "spark", "TikTok Photos");
        SPARK = enumC1377930lxf12;
        EnumC1377930lxf enumC1377930lxf13 = new EnumC1377930lxf(12, R.raw.icon_arrow_down_circle_fill, R.raw.icon_arrow_down_circle_fill, 1, "SAVE_LOCAL", "save_local", "Save Local");
        SAVE_LOCAL = enumC1377930lxf13;
        EnumC1377930lxf[] enumC1377930lxfArr = {enumC1377930lxf, enumC1377930lxf2, enumC1377930lxf3, enumC1377930lxf4, enumC1377930lxf5, enumC1377930lxf6, enumC1377930lxf7, enumC1377930lxf8, enumC1377930lxf9, enumC1377930lxf10, enumC1377930lxf11, enumC1377930lxf12, enumC1377930lxf13};
        LLILZLL = enumC1377930lxfArr;
        LLIZ = new C2254308sP(enumC1377930lxfArr);
        Companion = new C1377920lxe();
    }

    public static EnumC1377930lxf[] values() {
        return (EnumC1377930lxf[]) LLILZLL.clone();
    }

    public final int getCheckedIconRes() {
        return this.LLILZ;
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getLabel() {
        return this.LLILLJJLI;
    }

    public final int getSaveType() {
        return this.LLILZIL;
    }

    public final int getUncheckedIconRes() {
        return this.LLILLL;
    }

    public static EnumC1377930lxf valueOf(String str) {
        return (EnumC1377930lxf) C08FF.LIZ(EnumC1377930lxf.class, str);
    }

    public final void setLabel(String str) {
        this.LLILLJJLI = str;
    }

    public EnumC1377930lxf(int i, int i2, int i3, int i4, String str, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
    }
}
