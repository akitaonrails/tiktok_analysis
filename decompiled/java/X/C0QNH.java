package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QNH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QNH {
    public static final C0QNI Companion;
    public static final C0QNH DEALS_AUTO;
    public static final C0QNH DEALS_DARK;
    public static final C0QNH DEALS_LIGHT;
    public static final C0QNH DISABLE;
    public static final C0QNH ENHANCED_AUTO;
    public static final C0QNH ENHANCED_DARK;
    public static final C0QNH ENHANCED_LIGHT;
    public static final /* synthetic */ C0QNH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0QNH ONLINE_AUTO;
    public final String LL;

    public static InterfaceC2044707zh<C0QNH> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0QNI] */
    static {
        C0QNH c0qnh = new C0QNH("DISABLE", 0, CardStruct.IStatusCode.DEFAULT);
        DISABLE = c0qnh;
        C0QNH c0qnh2 = new C0QNH("ONLINE_AUTO", 1, "1");
        ONLINE_AUTO = c0qnh2;
        C0QNH c0qnh3 = new C0QNH("DEALS_AUTO", 2, "2");
        DEALS_AUTO = c0qnh3;
        C0QNH c0qnh4 = new C0QNH("DEALS_DARK", 3, "3");
        DEALS_DARK = c0qnh4;
        C0QNH c0qnh5 = new C0QNH("DEALS_LIGHT", 4, "4");
        DEALS_LIGHT = c0qnh5;
        C0QNH c0qnh6 = new C0QNH("ENHANCED_AUTO", 5, "5");
        ENHANCED_AUTO = c0qnh6;
        C0QNH c0qnh7 = new C0QNH("ENHANCED_DARK", 6, "6");
        ENHANCED_DARK = c0qnh7;
        C0QNH c0qnh8 = new C0QNH("ENHANCED_LIGHT", 7, "7");
        ENHANCED_LIGHT = c0qnh8;
        C0QNH[] c0qnhArr = {c0qnh, c0qnh2, c0qnh3, c0qnh4, c0qnh5, c0qnh6, c0qnh7, c0qnh8};
        LLILLJJLI = c0qnhArr;
        LLILLL = new C2254308sP(c0qnhArr);
        Companion = new Object() { // from class: X.0QNI
        };
    }

    public static C0QNH[] values() {
        return (C0QNH[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0QNH valueOf(String str) {
        return (C0QNH) C08FF.LIZ(C0QNH.class, str);
    }

    public C0QNH(String str, int i, String str2) {
        this.LL = str2;
    }
}
