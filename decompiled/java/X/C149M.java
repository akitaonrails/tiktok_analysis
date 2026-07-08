package X;

/* JADX INFO: renamed from: X.149M, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149M extends AbstractC202165148l {
    public int LLIZ;

    public C149M() {
        this(0);
    }

    @Override // X.AbstractC202165148l
    public int getEventLimits() {
        return 6000;
    }

    @Override // X.AbstractC202165148l
    public String getServiceType() {
        return "verify";
    }

    @Override // X.AbstractC202165148l
    public int getType() {
        return 2;
    }

    public final int getChallengeCode() {
        return this.LLIZ;
    }

    public C149M(int i) {
        this.LLIZ = i;
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        int i = this.LLIZ;
        if (i != 0) {
            C148N.LIZ(sb, "challenge_code", i);
        }
    }

    public final void setChallengeCode(int i) {
        this.LLIZ = i;
    }
}
