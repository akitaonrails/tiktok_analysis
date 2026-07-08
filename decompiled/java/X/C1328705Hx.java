package X;

/* JADX INFO: renamed from: X.05Hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1328705Hx implements C0H62 {
    public static final C1328705Hx LL = new C1328705Hx();
    public static final C2252321DDq LLILLJJLI;
    public static final AnonymousClass0951 LLILLL;

    static {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(null);
        LLILLJJLI = c2252321DDqLIZ;
        LLILLL = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    @Override // X.C0H62
    public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
        String strName;
        LLILLJJLI.setValue(c0o0l2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("net_status change: ");
        if (c0o0l2 != null) {
            strName = c0o0l2.name();
        } else {
            strName = null;
        }
        sbLIZ.append(strName);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
