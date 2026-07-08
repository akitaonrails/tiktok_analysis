package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.080C, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C080C {
    public static final /* synthetic */ C080C[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C080C REALTIME_SPECIAL_CARD;
    public final String LL = "realtime_special_card_funnel_client";
    public final String LLILLJJLI = "realtime_special_card_client_exception";

    public static InterfaceC2044707zh<C080C> getEntries() {
        return LLILZ;
    }

    static {
        C080C c080c = new C080C();
        REALTIME_SPECIAL_CARD = c080c;
        C080C[] c080cArr = {c080c};
        LLILLL = c080cArr;
        LLILZ = new C2254308sP(c080cArr);
    }

    public static C080C[] values() {
        return (C080C[]) LLILLL.clone();
    }

    public final String getExceptionEventName() {
        return this.LLILLJJLI;
    }

    public final String getFunnelEventName() {
        return this.LL;
    }

    public static C080C valueOf(String str) {
        return (C080C) C08FF.LIZ(C080C.class, str);
    }
}
