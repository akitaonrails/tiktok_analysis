package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlinx.coroutines.CoroutineExceptionHandler;
import lth.o;

/* JADX INFO: renamed from: X.11h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19567911h7 {
    public static final C09XS LIZLLL = new C09XS();
    public final C01GW LIZ;
    public final C01GW LIZIZ;
    public final C054G LIZJ;

    public C19567911h7(LifecycleOwner lifecycleOwner) {
        o.LJFF(C2216131BoR.LIZ());
        this.LIZ = C452501pT.LIZIZ(new AwS552S0100000_8(lifecycleOwner, 1101));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(459));
        this.LIZIZ = c01gwLIZIZ;
        C19568211hA c19568211hA = (C19568211hA) c01gwLIZIZ.getValue();
        c19568211hA.getClass();
        c19568211hA.LJIIIIZZ(new C19568011h8(c19568211hA));
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        this.LIZJ = C2296808zG.LIZ(C2108108Nr.LIZ.plus(c1dfkLIZ).plus(new C1770006wU(CoroutineExceptionHandler.LJJLIL, 21)));
    }

    public final Object LIZIZ(List list, C09XP c09xp) {
        final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c09xp));
        final ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((StickerItemModel) it2.next()).stickerId);
        }
        ((InterfaceC1635410sex) this.LIZ.getValue()).LJFF(arrayList, false, null, new IFetchEffectListListener() { // from class: X.01gR
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DraftBoxFragment : updateEffect , effectIdList --- : ");
                sbLIZ.append(arrayList);
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1364105Vn<List<Effect>> interfaceC1364105Vn = c23260099m;
                C098200Yq c098200Yq = new C098200Yq(exceptionResult.getException());
                C189200o6.m2constructorimpl(c098200Yq);
                interfaceC1364105Vn.resumeWith(c098200Yq);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list2) {
                C23250099c.LIZLLL(this.LIZ.LIZJ, null, null, new C01W7(list2, c23260099m, arrayList, null), 3);
            }
        });
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c09xp);
        }
        return objLIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        r3 = ((java.util.concurrent.ConcurrentLinkedQueue) r10.LJII).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r3.hasNext() == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b4, code lost:
    
        r1 = r3.next();
        r0 = ((X.AbstractC19568411hC) r1).LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (r0 == 0) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c3, code lost:
    
        if (r0.equals(r7) != true) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c5, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        r1 = r10.LIZ;
        r3 = r1.LIZ((Param) r7, r1.LIZ.LIZ());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e0, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e2, code lost:
    
        ((java.util.concurrent.ConcurrentLinkedQueue) r10.LJFF).offer(r3);
        r10.LJ = true;
        r1 = X.C2188811AlT.LIZ();
        r1.append("download enqueued, info: ");
        r1.append(r7);
        X.C19568211hA.LJII(X.C2188811AlT.LIZIZ(r1));
        r10.LJIIIIZZ(new kotlin.jvm.internal.AwS157S0400000_29(r7, (java.lang.Object) new kotlin.jvm.internal.AwS430S0200000_29(r10, r3, 84), (kotlin.jvm.functions.Function0<? extends java.lang.Object>) r9, (X.InterfaceC19568511hD<java.lang.Object, java.lang.Object>) r10, (X.C19568211hA<java.lang.Object, java.lang.Object>) 14));
        r10.LJIIIZ();
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LIZ(X.C19567911h7 r12, java.util.List r13, X.C09XP r14) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19567911h7.LIZ(X.11h7, java.util.List, X.09XP):java.lang.Object");
    }
}
