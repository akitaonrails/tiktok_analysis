package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0eaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1094630eaj {
    public static final C1094620eai Companion;
    public static final EnumC1094630eaj DEFAULT;
    public static final /* synthetic */ EnumC1094630eaj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1094630eaj PITAYA;
    public static final EnumC1094630eaj PORTRAIT;
    public static final EnumC1094630eaj TTM;
    public static final EnumC1094630eaj TTM_NATIVE;

    public static InterfaceC2044707zh<EnumC1094630eaj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1094630eaj enumC1094630eaj = new EnumC1094630eaj(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1094630eaj;
        EnumC1094630eaj enumC1094630eaj2 = new EnumC1094630eaj("PITAYA", 1);
        PITAYA = enumC1094630eaj2;
        EnumC1094630eaj enumC1094630eaj3 = new EnumC1094630eaj("TTM", 2);
        TTM = enumC1094630eaj3;
        EnumC1094630eaj enumC1094630eaj4 = new EnumC1094630eaj("TTM_NATIVE", 3);
        TTM_NATIVE = enumC1094630eaj4;
        EnumC1094630eaj enumC1094630eaj5 = new EnumC1094630eaj("PORTRAIT", 4);
        PORTRAIT = enumC1094630eaj5;
        EnumC1094630eaj[] enumC1094630eajArr = {enumC1094630eaj, enumC1094630eaj2, enumC1094630eaj3, enumC1094630eaj4, enumC1094630eaj5};
        LL = enumC1094630eajArr;
        LLILLJJLI = new C2254308sP(enumC1094630eajArr);
        Companion = new C1094620eai();
    }

    public static EnumC1094630eaj[] values() {
        return (EnumC1094630eaj[]) LL.clone();
    }

    public static EnumC1094630eaj valueOf(String str) {
        return (EnumC1094630eaj) C08FF.LIZ(EnumC1094630eaj.class, str);
    }

    public EnumC1094630eaj(String str, int i) {
    }
}
