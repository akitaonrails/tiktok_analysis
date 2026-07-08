package X;

/* JADX INFO: renamed from: X.0Csb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327470Csb {
    public AnonymousClass0957<C783680Uog> LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;

    public final void LIZ() {
        AnonymousClass0957<C783680Uog> anonymousClass0957 = this.LIZ;
        if (C500260Jjc.LJJJI(anonymousClass0957 != null ? Boolean.valueOf(anonymousClass0957.isCompleted()) : null)) {
            C20441214yg.LIZIZ("GamePreScheduleRequest", "pre request complete");
            AnonymousClass0957<C783680Uog> anonymousClass09572 = this.LIZ;
            if ((anonymousClass09572 != null ? anonymousClass09572.LIZLLL() : null) == null) {
                C20441214yg.LIZIZ("GamePreScheduleRequest", "pre request fail");
                this.LIZJ = true;
                return;
            }
            boolean z = System.currentTimeMillis() - 0 > 420000;
            this.LIZIZ = z;
            if (z) {
                C20441214yg.LIZIZ("GamePreScheduleRequest", "pre request expire");
            }
        }
    }
}
