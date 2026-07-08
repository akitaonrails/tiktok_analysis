package X;

import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PGA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PGA {
    public static final C0PGA BAN;
    public static final C0PGA BAN_AND_PSA;
    public static final C0PGA DEFAULT;
    public static final /* synthetic */ C0PGA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PGA PSA;
    public final int LL;

    public static InterfaceC2044707zh<C0PGA> getEntries() {
        return LLILLL;
    }

    static {
        C0PGA c0pga = new C0PGA(LivePreviewCTASmartDisplayManager.DEFAULT, 0, 0);
        DEFAULT = c0pga;
        C0PGA c0pga2 = new C0PGA("BAN", 1, 1);
        BAN = c0pga2;
        C0PGA c0pga3 = new C0PGA("PSA", 2, 2);
        PSA = c0pga3;
        C0PGA c0pga4 = new C0PGA("BAN_AND_PSA", 3, 3);
        BAN_AND_PSA = c0pga4;
        C0PGA[] c0pgaArr = {c0pga, c0pga2, c0pga3, c0pga4};
        LLILLJJLI = c0pgaArr;
        LLILLL = new C2254308sP(c0pgaArr);
    }

    public static C0PGA[] values() {
        return (C0PGA[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C0PGA valueOf(String str) {
        return (C0PGA) C08FF.LIZ(C0PGA.class, str);
    }

    public C0PGA(String str, int i, int i2) {
        this.LL = i2;
    }
}
