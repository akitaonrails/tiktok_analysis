package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ncR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1441650ncR {
    public static final EnumC1441650ncR EDIT_EFFECT;
    public static final EnumC1441650ncR EDIT_STICKER;
    public static final /* synthetic */ EnumC1441650ncR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1441650ncR MV_THEME;
    public static final EnumC1441650ncR PHOTO_MOVIE;
    public static final EnumC1441650ncR RECORD_PROP;
    public static final EnumC1441650ncR RECORD_UPLOAD_VIDEO_SOUND;
    public static final EnumC1441650ncR STATUS_UPLOAD;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1441650ncR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1441650ncR enumC1441650ncR = new EnumC1441650ncR("PHOTO_MOVIE", 0, 1);
        PHOTO_MOVIE = enumC1441650ncR;
        EnumC1441650ncR enumC1441650ncR2 = new EnumC1441650ncR("MV_THEME", 1, 2);
        MV_THEME = enumC1441650ncR2;
        EnumC1441650ncR enumC1441650ncR3 = new EnumC1441650ncR("STATUS_UPLOAD", 2, 4);
        STATUS_UPLOAD = enumC1441650ncR3;
        EnumC1441650ncR enumC1441650ncR4 = new EnumC1441650ncR("RECORD_PROP", 3, 8);
        RECORD_PROP = enumC1441650ncR4;
        EnumC1441650ncR enumC1441650ncR5 = new EnumC1441650ncR("EDIT_EFFECT", 4, 16);
        EDIT_EFFECT = enumC1441650ncR5;
        EnumC1441650ncR enumC1441650ncR6 = new EnumC1441650ncR("EDIT_STICKER", 5, 32);
        EDIT_STICKER = enumC1441650ncR6;
        EnumC1441650ncR enumC1441650ncR7 = new EnumC1441650ncR("RECORD_UPLOAD_VIDEO_SOUND", 6, 64);
        RECORD_UPLOAD_VIDEO_SOUND = enumC1441650ncR7;
        EnumC1441650ncR[] enumC1441650ncRArr = {enumC1441650ncR, enumC1441650ncR2, enumC1441650ncR3, enumC1441650ncR4, enumC1441650ncR5, enumC1441650ncR6, enumC1441650ncR7};
        LLILLJJLI = enumC1441650ncRArr;
        LLILLL = new C2254308sP(enumC1441650ncRArr);
    }

    public static EnumC1441650ncR[] values() {
        return (EnumC1441650ncR[]) LLILLJJLI.clone();
    }

    public final int getTag() {
        return this.LL;
    }

    public static EnumC1441650ncR valueOf(String str) {
        return (EnumC1441650ncR) C08FF.LIZ(EnumC1441650ncR.class, str);
    }

    public EnumC1441650ncR(String str, int i, int i2) {
        this.LL = i2;
    }
}
