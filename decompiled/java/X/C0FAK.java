package X;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FAK, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FAK {
    public static final C0FAK CLICK_ICON;
    public static final C0FAK CLICK_PREVIEW;
    public static final C0FAK CLOSE_PANEL;
    public static final /* synthetic */ C0FAK[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0FAK SWITCH_TAB;

    public static InterfaceC2044707zh<C0FAK> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0FAK c0fak = new C0FAK("SWITCH_TAB", 0);
        SWITCH_TAB = c0fak;
        C0FAK c0fak2 = new C0FAK("CLICK_ICON", 1);
        CLICK_ICON = c0fak2;
        C0FAK c0fak3 = new C0FAK("CLICK_PREVIEW", 2);
        CLICK_PREVIEW = c0fak3;
        C0FAK c0fak4 = new C0FAK("CLOSE_PANEL", 3);
        CLOSE_PANEL = c0fak4;
        C0FAK[] c0fakArr = {c0fak, c0fak2, c0fak3, c0fak4};
        LL = c0fakArr;
        LLILLJJLI = new C2254308sP(c0fakArr);
    }

    public static C0FAK[] values() {
        return (C0FAK[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }

    public static C0FAK valueOf(String str) {
        return (C0FAK) C08FF.LIZ(C0FAK.class, str);
    }

    public C0FAK(String str, int i) {
    }
}
