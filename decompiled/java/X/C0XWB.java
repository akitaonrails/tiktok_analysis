package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0XWB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XWB {
    public static final C0XWB AUTO_LOGIN;
    public static final C0XWB DEFAULT;
    public static final /* synthetic */ C0XWB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0XWB ONE_CLICK_LOGIN;
    public static final C0XWB SMART_LOCK;
    public final int LL;

    public static InterfaceC2044707zh<C0XWB> getEntries() {
        return LLILLL;
    }

    static {
        C0XWB c0xwb = new C0XWB(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0xwb;
        C0XWB c0xwb2 = new C0XWB("AUTO_LOGIN", 1, 1);
        AUTO_LOGIN = c0xwb2;
        C0XWB c0xwb3 = new C0XWB("ONE_CLICK_LOGIN", 2, 2);
        ONE_CLICK_LOGIN = c0xwb3;
        C0XWB c0xwb4 = new C0XWB("SMART_LOCK", 3, 3);
        SMART_LOCK = c0xwb4;
        C0XWB[] c0xwbArr = {c0xwb, c0xwb2, c0xwb3, c0xwb4};
        LLILLJJLI = c0xwbArr;
        LLILLL = new C2254308sP(c0xwbArr);
    }

    public static C0XWB[] values() {
        return (C0XWB[]) LLILLJJLI.clone();
    }

    public final int getServerCode() {
        return this.LL;
    }

    public static C0XWB valueOf(String str) {
        return (C0XWB) C08FF.LIZ(C0XWB.class, str);
    }

    public C0XWB(String str, int i, int i2) {
        this.LL = i2;
    }
}
