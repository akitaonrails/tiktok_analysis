package X;

/* JADX INFO: renamed from: X.0YM9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YM9 {
    public final C0YM2 LIZ;
    public final C054G LIZIZ = C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ()));
    public final C01GW LIZJ = C452501pT.LIZIZ(new C0YM8(this));
    public volatile long LIZLLL;

    public final C0YHC LIZ() {
        return (C0YHC) this.LIZJ.getValue();
    }

    public final boolean LIZIZ() {
        C882400YjW c882400YjW = C882400YjW.LIZ;
        C0YM2 c0ym2 = this.LIZ;
        c882400YjW.getClass();
        for (int i : C882400YjW.LIZIZ(c0ym2).LJJIFFI()) {
            if (!LIZ().LIZ().LIZ(i) || !LIZ().isLogin()) {
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZLLL();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("isInboxInitialized inbox");
                sbLIZ.append(i);
                sbLIZ.append(", not inited ");
                sbLIZ.append(!LIZ().LIZ().LIZ(i));
                sbLIZ.append(", not isLogin ");
                sbLIZ.append(!LIZ().isLogin());
                C882690Yjz.LJIIIZ("SDKMessagePuller", C2188811AlT.LIZIZ(sbLIZ));
                return false;
            }
        }
        return true;
    }

    public C0YM9(C0YM2 c0ym2) {
        this.LIZ = c0ym2;
    }

    public final void LIZJ(int i, boolean z) {
        C882400YjW.LIZ.getClass();
        C882400YjW.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("realPullMsgForAllInbox: reason ");
        sbLIZ.append(i);
        sbLIZ.append(", forcePull ");
        sbLIZ.append(z);
        C882690Yjz.LJIIIZ("SDKMessagePuller", C2188811AlT.LIZIZ(sbLIZ));
        LIZ().LIZ().LIZIZ(-2, z, null, i);
    }
}
