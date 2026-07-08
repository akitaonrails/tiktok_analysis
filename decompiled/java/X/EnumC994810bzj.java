package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bzj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC994810bzj {
    public static final EnumC994810bzj DEFAULT;
    public static final /* synthetic */ EnumC994810bzj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC994810bzj NORMAL;

    public static InterfaceC2044707zh<EnumC994810bzj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC994810bzj enumC994810bzj = new EnumC994810bzj(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC994810bzj;
        EnumC994810bzj enumC994810bzj2 = new EnumC994810bzj("NORMAL", 1);
        NORMAL = enumC994810bzj2;
        EnumC994810bzj[] enumC994810bzjArr = {enumC994810bzj, enumC994810bzj2};
        LL = enumC994810bzjArr;
        LLILLJJLI = new C2254308sP(enumC994810bzjArr);
    }

    public static EnumC994810bzj[] values() {
        return (EnumC994810bzj[]) LL.clone();
    }

    public static EnumC994810bzj valueOf(String str) {
        return (EnumC994810bzj) C08FF.LIZ(EnumC994810bzj.class, str);
    }

    public EnumC994810bzj(String str, int i) {
    }
}
