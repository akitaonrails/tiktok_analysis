package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07pT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1981307pT {
    public static final EnumC1981307pT DEFAULT;
    public static final /* synthetic */ EnumC1981307pT[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1981307pT V1;
    public static final EnumC1981307pT V2;
    public static final EnumC1981307pT V3;
    public static final EnumC1981307pT V4;
    public static final EnumC1981307pT V5;

    public static InterfaceC2044707zh<EnumC1981307pT> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1981307pT enumC1981307pT = new EnumC1981307pT(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC1981307pT;
        EnumC1981307pT enumC1981307pT2 = new EnumC1981307pT("V1", 1);
        V1 = enumC1981307pT2;
        EnumC1981307pT enumC1981307pT3 = new EnumC1981307pT("V2", 2);
        V2 = enumC1981307pT3;
        EnumC1981307pT enumC1981307pT4 = new EnumC1981307pT("V3", 3);
        V3 = enumC1981307pT4;
        EnumC1981307pT enumC1981307pT5 = new EnumC1981307pT("V4", 4);
        V4 = enumC1981307pT5;
        EnumC1981307pT enumC1981307pT6 = new EnumC1981307pT("V5", 5);
        V5 = enumC1981307pT6;
        EnumC1981307pT[] enumC1981307pTArr = {enumC1981307pT, enumC1981307pT2, enumC1981307pT3, enumC1981307pT4, enumC1981307pT5, enumC1981307pT6};
        LL = enumC1981307pTArr;
        LLILLJJLI = new C2254308sP(enumC1981307pTArr);
    }

    public static EnumC1981307pT[] values() {
        return (EnumC1981307pT[]) LL.clone();
    }

    public static EnumC1981307pT valueOf(String str) {
        return (EnumC1981307pT) C08FF.LIZ(EnumC1981307pT.class, str);
    }

    public EnumC1981307pT(String str, int i) {
    }
}
