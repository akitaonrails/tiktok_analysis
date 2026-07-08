package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Eqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC377350Eqr {
    public static final EnumC377350Eqr COMPLETE;
    public static final EnumC377350Eqr DEFAULT;
    public static final EnumC377350Eqr FAILED;
    public static final /* synthetic */ EnumC377350Eqr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC377350Eqr PROCESSING;
    public static final EnumC377350Eqr STOPPED;

    public static InterfaceC2044707zh<EnumC377350Eqr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC377350Eqr enumC377350Eqr = new EnumC377350Eqr(LivePreviewCTASmartDisplayManager.DEFAULT, 0);
        DEFAULT = enumC377350Eqr;
        EnumC377350Eqr enumC377350Eqr2 = new EnumC377350Eqr("PROCESSING", 1);
        PROCESSING = enumC377350Eqr2;
        EnumC377350Eqr enumC377350Eqr3 = new EnumC377350Eqr("FAILED", 2);
        FAILED = enumC377350Eqr3;
        EnumC377350Eqr enumC377350Eqr4 = new EnumC377350Eqr("COMPLETE", 3);
        COMPLETE = enumC377350Eqr4;
        EnumC377350Eqr enumC377350Eqr5 = new EnumC377350Eqr("STOPPED", 4);
        STOPPED = enumC377350Eqr5;
        EnumC377350Eqr[] enumC377350EqrArr = {enumC377350Eqr, enumC377350Eqr2, enumC377350Eqr3, enumC377350Eqr4, enumC377350Eqr5};
        LL = enumC377350EqrArr;
        LLILLJJLI = new C2254308sP(enumC377350EqrArr);
    }

    public static EnumC377350Eqr[] values() {
        return (EnumC377350Eqr[]) LL.clone();
    }

    public static EnumC377350Eqr valueOf(String str) {
        return (EnumC377350Eqr) C08FF.LIZ(EnumC377350Eqr.class, str);
    }

    public EnumC377350Eqr(String str, int i) {
    }
}
