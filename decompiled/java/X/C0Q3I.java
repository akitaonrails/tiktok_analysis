package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Q3I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3I implements InterfaceC654480Plm {
    public static final C0Q3I COMMON;
    public static final /* synthetic */ C0Q3I[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0Q3I VISUAL;
    public static final C0Q3I VOICE;
    public final String LL;
    public final String LLILLJJLI;

    public C0Q3I() {
        throw null;
    }

    public static InterfaceC2044707zh<C0Q3I> getEntries() {
        return LLILZ;
    }

    static {
        C0Q3I c0q3i = new C0Q3I("COMMON", 0, "common");
        COMMON = c0q3i;
        C0Q3I c0q3i2 = new C0Q3I("VISUAL", 1, "visual");
        VISUAL = c0q3i2;
        C0Q3I c0q3i3 = new C0Q3I("VOICE", 2, "voice");
        VOICE = c0q3i3;
        C0Q3I[] c0q3iArr = {c0q3i, c0q3i2, c0q3i3};
        LLILLL = c0q3iArr;
        LLILZ = new C2254308sP(c0q3iArr);
    }

    public static C0Q3I[] values() {
        return (C0Q3I[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static C0Q3I valueOf(String str) {
        return (C0Q3I) C08FF.LIZ(C0Q3I.class, str);
    }

    public C0Q3I(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = LiveCenterMockToolSwitch.GROWTH;
    }
}
