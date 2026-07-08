package X;

/* JADX INFO: renamed from: X.148x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202177148x extends AbstractC202165148l {
    @Override // X.AbstractC202165148l
    public int getEventLimits() {
        return 6000;
    }

    @Override // X.AbstractC202165148l
    public String getServiceType() {
        return "twice_verify";
    }

    @Override // X.AbstractC202165148l
    public int getType() {
        return 10;
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        C148N.LIZIZ(sb, "decision_config", "block-info_verify");
        C148N.LIZ(sb, "use_turing_bridge", 1);
    }
}
