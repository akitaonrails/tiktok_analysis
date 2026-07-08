package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Opf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631410Opf {
    public static final EnumC631410Opf DEFAULT;
    public static final /* synthetic */ EnumC631410Opf[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC631410Opf LOADING;
    public static final EnumC631410Opf PLAYING;
    public final int LL;

    public static InterfaceC2044707zh<EnumC631410Opf> getEntries() {
        return LLILLL;
    }

    static {
        EnumC631410Opf enumC631410Opf = new EnumC631410Opf(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = enumC631410Opf;
        EnumC631410Opf enumC631410Opf2 = new EnumC631410Opf("LOADING", 1, 1);
        LOADING = enumC631410Opf2;
        EnumC631410Opf enumC631410Opf3 = new EnumC631410Opf("PLAYING", 2, 2);
        PLAYING = enumC631410Opf3;
        EnumC631410Opf[] enumC631410OpfArr = {enumC631410Opf, enumC631410Opf2, enumC631410Opf3};
        LLILLJJLI = enumC631410OpfArr;
        LLILLL = new C2254308sP(enumC631410OpfArr);
    }

    public static EnumC631410Opf[] values() {
        return (EnumC631410Opf[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC631410Opf valueOf(String str) {
        return (EnumC631410Opf) C08FF.LIZ(EnumC631410Opf.class, str);
    }

    public EnumC631410Opf(String str, int i, int i2) {
        this.LL = i2;
    }
}
