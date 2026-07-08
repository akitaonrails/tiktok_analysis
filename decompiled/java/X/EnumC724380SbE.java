package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SbE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class EnumC724380SbE {
    public static final EnumC724380SbE DEFAULT;
    public static final EnumC724380SbE HOSTATTACH;
    public static final EnumC724380SbE HOSTBIND;
    public static final EnumC724380SbE HOSTDETACH;
    public static final EnumC724380SbE HOSTRESUME;
    public static final EnumC724380SbE HOSTSTOP;
    public static final /* synthetic */ EnumC724380SbE[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC724380SbE> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC724380SbE enumC724380SbE = new EnumC724380SbE(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC724380SbE;
        EnumC724380SbE enumC724380SbE2 = new EnumC724380SbE("HOSTATTACH", 1);
        HOSTATTACH = enumC724380SbE2;
        EnumC724380SbE enumC724380SbE3 = new EnumC724380SbE("HOSTDETACH", 2);
        HOSTDETACH = enumC724380SbE3;
        EnumC724380SbE enumC724380SbE4 = new EnumC724380SbE("HOSTRESUME", 3);
        HOSTRESUME = enumC724380SbE4;
        EnumC724380SbE enumC724380SbE5 = new EnumC724380SbE("HOSTSTOP", 4);
        HOSTSTOP = enumC724380SbE5;
        EnumC724380SbE enumC724380SbE6 = new EnumC724380SbE("HOSTBIND", 5);
        HOSTBIND = enumC724380SbE6;
        EnumC724380SbE[] enumC724380SbEArr = {enumC724380SbE, enumC724380SbE2, enumC724380SbE3, enumC724380SbE4, enumC724380SbE5, enumC724380SbE6};
        LL = enumC724380SbEArr;
        LLILLJJLI = new C2254308sP(enumC724380SbEArr);
    }

    public static EnumC724380SbE[] values() {
        return (EnumC724380SbE[]) LL.clone();
    }

    public static EnumC724380SbE valueOf(String str) {
        return (EnumC724380SbE) C08FF.LIZ(EnumC724380SbE.class, str);
    }

    public EnumC724380SbE(String str, int i) {
    }
}
