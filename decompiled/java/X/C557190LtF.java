package X;

import Y.AfS177S0100000_8;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoMiddleFragment;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0LtF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C557190LtF {
    public final String LIZ;
    public String LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final InterfaceC557220LtI LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS552S0100000_8(this, 8));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(21));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS552S0100000_8(this, 7));
    public AnonymousClass0956 LJIIIIZZ;
    public C11JF LJIIIZ;

    public final ICreationAsyncTaskManager LIZ() {
        return (ICreationAsyncTaskManager) this.LJI.getValue();
    }

    public final void LIZLLL(C0LSZ c0lsz) {
        C557210LtH c557210LtH = (C557210LtH) this.LJII.getValue();
        c557210LtH.getClass();
        if (C557210LtH.LIZ(c0lsz.LJI) > C557210LtH.LIZ(c557210LtH.LJFF) && Intrinsics.LJFF(c0lsz.LJ, "STARTED")) {
            if (Intrinsics.LJFF(c0lsz.LJI, "DOWNLOAD")) {
                if (Intrinsics.LJFF(c0lsz.LJI, "DOWNLOAD")) {
                    AnonymousClass0956 anonymousClass0956 = c557210LtH.LIZLLL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c557210LtH.LIZLLL = C23250099c.LIZLLL(c557210LtH.LIZ, null, null, new C557140LtA(c0lsz, c557210LtH, null), 3);
                }
            } else {
                AnonymousClass0956 anonymousClass09562 = c557210LtH.LIZLLL;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                c557210LtH.LIZLLL = null;
                c557210LtH.LJ.onNext(Integer.valueOf(((InterfaceC557150LtB) c557210LtH.LJI.getValue()).LIZ(c0lsz, 0)));
            }
        }
        if (Intrinsics.LJFF(c0lsz.LJI, "DOWNLOAD")) {
            C1953307kx c1953307kx = C1953307kx.LIZ;
            String str = c0lsz.LJIILIIL;
            c1953307kx.getClass();
            if (C1953307kx.LIZLLL(str)) {
                this.LIZIZ = c0lsz.LJIILIIL;
            }
        }
        C11PQ<Integer> c11pq = ((C557210LtH) this.LJII.getValue()).LJ;
        c11pq.getClass();
        this.LJIIIZ = (C11JF) new C19475711Hn(c11pq).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 0));
    }

    public final Object LIZIZ(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C557210LtH c557210LtH = (C557210LtH) this.LJII.getValue();
        AnonymousClass0956 anonymousClass0956 = c557210LtH.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c557210LtH.LIZLLL = null;
        C11JF c11jf = this.LJIIIZ;
        if (c11jf != null && (!c11jf.isDisposed())) {
            c11jf.dispose();
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2108108Nr.LIZ, new C557180LtE(this, c0lsz, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final Object LIZJ(C0LSZ c0lsz, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        AwemeDraft awemeDraftLJI;
        C557210LtH c557210LtH = (C557210LtH) this.LJII.getValue();
        AnonymousClass0956 anonymousClass0956 = c557210LtH.LIZLLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c557210LtH.LIZLLL = null;
        if (this.LJ) {
            String str = c0lsz.LIZ;
            awemeDraftLJI = o.LJIL.LJIIJ().LJIIL();
            if (awemeDraftLJI == null || !Intrinsics.LJFF(awemeDraftLJI.LIZ.aiLivePhotoModel.getTaskId(), str)) {
                awemeDraftLJI = null;
            }
        } else {
            awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(c0lsz.LJIIJ, 0, null, 6, null), false, false, false, 14));
        }
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2108108Nr.LIZ, new C557200LtG(this, awemeDraftLJI, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public C557190LtF(String str, String str2, InterfaceC497601wk interfaceC497601wk, AILivePhotoMiddleFragment aILivePhotoMiddleFragment, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = aILivePhotoMiddleFragment;
        this.LJ = z;
    }
}
