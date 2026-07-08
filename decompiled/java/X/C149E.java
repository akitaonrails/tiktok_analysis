package X;

/* JADX INFO: renamed from: X.149E, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C149E extends AbstractC202165148l {
    public final String LLIZ;
    public final AbstractC202165148l LLIZLLLIL;
    public final int LLJ;

    @Override // X.AbstractC202165148l
    public boolean getFullscreen() {
        AbstractC202165148l abstractC202165148l = this.LLIZLLLIL;
        if (abstractC202165148l == null) {
            return false;
        }
        return abstractC202165148l.getFullscreen();
    }

    @Override // X.AbstractC202165148l
    public String getServiceType() {
        String serviceType;
        AbstractC202165148l abstractC202165148l = this.LLIZLLLIL;
        return (abstractC202165148l == null || (serviceType = abstractC202165148l.getServiceType()) == null) ? "" : serviceType;
    }

    @Override // X.AbstractC202165148l
    public int getType() {
        AbstractC202165148l abstractC202165148l = this.LLIZLLLIL;
        if (abstractC202165148l == null) {
            return 0;
        }
        return abstractC202165148l.getType();
    }

    @Override // X.AbstractC202165148l
    public int getEventLimits() {
        return this.LLJ;
    }

    public final String getRiskInfo() {
        return this.LLIZ;
    }

    public C149E(String str) {
        this(null, str);
    }

    @Override // X.AbstractC202165148l
    public void buildUrl(StringBuilder sb) {
        AbstractC202165148l abstractC202165148l = this.LLIZLLLIL;
        if (abstractC202165148l != null) {
            abstractC202165148l.buildUrl(sb);
        }
        C148N.LIZIZ(sb, "verify_data", this.LLIZ);
    }

    @Override // X.AbstractC202165148l
    public void setFullscreen(boolean z) {
        AbstractC202165148l abstractC202165148l = this.LLIZLLLIL;
        if (abstractC202165148l != null) {
            abstractC202165148l.setFullscreen(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[Catch: Exception -> 0x0111, TryCatch #1 {Exception -> 0x0111, blocks: (B:3:0x0009, B:10:0x004e, B:11:0x0052, B:18:0x006b, B:20:0x0073, B:13:0x005d, B:15:0x0061, B:17:0x0065, B:21:0x007b, B:23:0x0083, B:24:0x008b, B:59:0x0105, B:60:0x0110, B:27:0x0094, B:30:0x009d, B:51:0x00e6, B:33:0x00a6, B:36:0x00af, B:39:0x00b8, B:42:0x00c1, B:44:0x00c9, B:45:0x00d2, B:48:0x00dc, B:52:0x00f0, B:55:0x00fa, B:12:0x0055, B:7:0x0046, B:5:0x003e), top: B:66:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C149E(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149E.<init>(java.lang.String, java.lang.String):void");
    }
}
