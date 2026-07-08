package X;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0uSM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704480uSM {
    public final String LIZ;
    public int LJI;
    public AnonymousClass0956 LJIIIIZZ;
    public AnonymousClass0956 LJIIIZ;
    public final AnonymousClass0956 LJIIJ;
    public final /* synthetic */ C1704510uSP LJIIJJI;
    public final C1DEK LIZIZ = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final AtomicInteger LIZJ = new AtomicInteger(0);
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final Object LJ = new Object();
    public boolean LJFF = true;
    public final Set<String> LJII = new LinkedHashSet();

    public final void LJFF() {
        if (this.LJIIIZ != null) {
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        C1704510uSP c1704510uSP = this.LJIIJJI;
        this.LJIIIZ = C23250099c.LIZLLL(c1704510uSP.LIZIZ, null, null, new C1704490uSN(anonymousClass0956, this, c1704510uSP, null), 3);
    }

    public final void LJII() {
        this.LIZLLL.set(this.LJII.size());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0099 -> B:19:0x0057). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00bd -> B:19:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704480uSM.LJ(X.05Vn):java.lang.Object");
    }

    public C1704480uSM(C1704510uSP c1704510uSP, String str) {
        this.LJIIJJI = c1704510uSP;
        this.LIZ = str;
        this.LJIIJ = C23250099c.LIZLLL(c1704510uSP.LIZIZ, null, null, new C1704420uSG(this, null), 3);
    }

    public static void LIZLLL(String str, Throwable th) {
        C0LX3 c0lx3 = C0LX3.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(": ");
        sbLIZ.append(th.getMessage());
        C201955140j.LJIIIIZZ(c0lx3, "WorkflowAutoLifecycle", C2188811AlT.LIZIZ(sbLIZ));
        C470601sO.LIZ.getClass();
        C470601sO.LIZ(th);
    }

    public final Object LIZ(InterfaceC1704540uSS interfaceC1704540uSS, C1704440uSI c1704440uSI) {
        if (interfaceC1704540uSS instanceof C1267704xf) {
            Object objLIZJ = LIZJ((C1267704xf) interfaceC1704540uSS, c1704440uSI);
            if (objLIZJ == C099R.LJFF()) {
                return objLIZJ;
            }
            return Unit.LIZ;
        }
        boolean z = true;
        if (interfaceC1704540uSS instanceof C1173504iT) {
            C1173504iT c1173504iT = (C1173504iT) interfaceC1704540uSS;
            this.LJII.remove(c1173504iT.LIZ);
            LJII();
            if (!this.LJII.isEmpty() || this.LIZJ.get() != 0 || this.LJIIIZ != null) {
                z = false;
            }
            C0LX3 c0lx3 = C0LX3.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onOwnerStop workflow=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" scene=");
            sbLIZ.append(c1173504iT.LIZ);
            sbLIZ.append(" scheduleStop=");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c0lx3, "WorkflowAutoLifecycle", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                LJFF();
            }
        } else {
            if (interfaceC1704540uSS instanceof C1704530uSR) {
                Object objLIZIZ = LIZIZ((C1704530uSR) interfaceC1704540uSS, c1704440uSI);
                if (objLIZIZ == C099R.LJFF()) {
                    return objLIZIZ;
                }
                return Unit.LIZ;
            }
            if (interfaceC1704540uSS instanceof C1173404iS) {
                C1173404iS c1173404iS = (C1173404iS) interfaceC1704540uSS;
                this.LIZJ.decrementAndGet();
                LJII();
                if (this.LIZJ.get() > 0) {
                    z = false;
                }
                C0LX3 c0lx32 = C0LX3.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onObserverStop workflow=");
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(" shouldDrain=");
                sbLIZ2.append(z);
                C201955140j.LIZLLL(c0lx32, "WorkflowAutoLifecycle", C2188811AlT.LIZIZ(sbLIZ2));
                if (z) {
                    List<String> list = c1173404iS.LIZ;
                    AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C1704510uSP c1704510uSP = this.LJIIJJI;
                    this.LJIIIIZZ = C23250099c.LIZLLL(c1704510uSP.LIZIZ, null, null, new C1704500uSO(this, list, c1704510uSP, null), 3);
                }
            } else if (interfaceC1704540uSS instanceof C1340680kza) {
                if (this.LJIIIIZZ == ((C1340680kza) interfaceC1704540uSS).LIZ) {
                    this.LJIIIIZZ = null;
                }
                if (this.LIZJ.get() == 0 && this.LJII.isEmpty() && this.LJIIIZ == null) {
                    C0LX3 c0lx33 = C0LX3.LIZIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("schedule stop workflow=");
                    sbLIZ3.append(this.LIZ);
                    sbLIZ3.append(" after drain");
                    C201955140j.LIZLLL(c0lx33, "WorkflowAutoLifecycle", C2188811AlT.LIZIZ(sbLIZ3));
                    LJFF();
                }
            } else if (interfaceC1704540uSS instanceof C1340690kzb) {
                if (this.LJIIIZ == ((C1340690kzb) interfaceC1704540uSS).LIZ) {
                    this.LJIIIZ = null;
                }
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[Catch: all -> 0x010e, TryCatch #0 {all -> 0x010e, blocks: (B:35:0x00d6, B:36:0x00d9, B:37:0x00f3, B:39:0x00f8, B:40:0x00fb, B:42:0x0101, B:43:0x0104, B:28:0x00a2, B:29:0x00a5, B:30:0x00bf, B:32:0x00c5, B:23:0x008b, B:25:0x0091), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f8 A[Catch: all -> 0x010e, TryCatch #0 {all -> 0x010e, blocks: (B:35:0x00d6, B:36:0x00d9, B:37:0x00f3, B:39:0x00f8, B:40:0x00fb, B:42:0x0101, B:43:0x0104, B:28:0x00a2, B:29:0x00a5, B:30:0x00bf, B:32:0x00c5, B:23:0x008b, B:25:0x0091), top: B:55:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0101 A[Catch: all -> 0x010e, TryCatch #0 {all -> 0x010e, blocks: (B:35:0x00d6, B:36:0x00d9, B:37:0x00f3, B:39:0x00f8, B:40:0x00fb, B:42:0x0101, B:43:0x0104, B:28:0x00a2, B:29:0x00a5, B:30:0x00bf, B:32:0x00c5, B:23:0x008b, B:25:0x0091), top: B:55:0x0020 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1704530uSR r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704480uSM.LIZIZ(X.0uSR, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1267704xf r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704480uSM.LIZJ(X.04xf, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(java.util.List<java.lang.String> r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1704480uSM.LJI(java.util.List, X.05Vn):java.lang.Object");
    }
}
