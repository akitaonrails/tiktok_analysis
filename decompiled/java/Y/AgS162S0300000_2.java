package Y;

import X.AnonymousClass0617;
import X.C013C;
import X.C05P0;
import X.C05RA;
import X.C05UN;
import X.C098200Yq;
import X.C13LP;
import X.C1516305wf;
import X.C1713806nQ;
import X.C189200o6;
import X.C2188811AlT;
import X.C2286608xc;
import X.C23250099c;
import X.C259800zU;
import X.C452980HpY;
import X.C453470HqL;
import X.InterfaceC1361305Ul;
import X.InterfaceC1364105Vn;
import X.InterfaceC1368705Xh;
import X.InterfaceC1482905rH;
import X.InterfaceC1665500tRU;
import X.InterfaceC346701Wf;
import X.InterfaceC453160Hpq;
import X.InterfaceC453460HqK;
import X.InterfaceC497601wk;
import X.InterfaceC879010Ye3;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes3.dex */
public class AgS162S0300000_2 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return emit$10(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public static final Object emit$0(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str = (String) obj;
        InterfaceC1361305Ul interfaceC1361305UlNo = ((TakoContentPreviewAssem) agS162S0300000_2.l0).No();
        if (interfaceC1361305UlNo != null) {
            interfaceC1361305UlNo.W7(str);
        }
        C23250099c.LIZLLL((InterfaceC497601wk) agS162S0300000_2.l1, null, null, new C05RA((C05UN) agS162S0300000_2.l2, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public static final Object emit$1(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        InterfaceC1361305Ul interfaceC1361305UlNo;
        TakoContentPreviewItem takoContentPreviewItem = (TakoContentPreviewItem) C13LP.LJJJLZIJ(((Number) obj).intValue(), ((C05UN) agS162S0300000_2.l0).LIZLLL().LL);
        if (takoContentPreviewItem == null) {
            return Unit.LIZ;
        }
        String str = (String) ((C259800zU) agS162S0300000_2.l1).element;
        if (str != null && (interfaceC1361305UlNo = ((TakoContentPreviewAssem) agS162S0300000_2.l2).No()) != null) {
            interfaceC1361305UlNo.Of(str, true);
        }
        InterfaceC1361305Ul interfaceC1361305UlNo2 = ((TakoContentPreviewAssem) agS162S0300000_2.l2).No();
        if (interfaceC1361305UlNo2 != null) {
            interfaceC1361305UlNo2.Of(takoContentPreviewItem.Ic(), false);
        }
        ((C259800zU) agS162S0300000_2.l1).element = takoContentPreviewItem.Ic();
        return Unit.LIZ;
    }

    public static final Object emit$10(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        String str;
        List<StickerItem> list;
        C1713806nQ c1713806nQ = (C1713806nQ) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stickerDataUpdate: data=");
        int size = 0;
        if (c1713806nQ != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", stickerCount=");
        if (c1713806nQ != null && (list = c1713806nQ.LIZ) != null) {
            size = list.size();
        }
        sbLIZ.append(size);
        sbLIZ.append(", qsid=");
        if (c1713806nQ != null) {
            str = c1713806nQ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", hasShown=");
        sbLIZ.append(((C013C) agS162S0300000_2.l0).element);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c1713806nQ != null && (!c1713806nQ.LIZ.isEmpty())) {
            ((C013C) agS162S0300000_2.l0).element = true;
            C453470HqL c453470HqL = (C453470HqL) agS162S0300000_2.l1;
            List<StickerItem> list2 = c1713806nQ.LIZ;
            String str2 = c1713806nQ.LIZIZ;
            InterfaceC453460HqK interfaceC453460HqK = c1713806nQ.LIZJ;
            if (interfaceC453460HqK == null) {
                interfaceC453460HqK = (C452980HpY) agS162S0300000_2.l2;
            }
            InterfaceC453160Hpq interfaceC453160Hpq = c1713806nQ.LIZLLL;
            if (interfaceC453160Hpq == null) {
                interfaceC453160Hpq = (C452980HpY) agS162S0300000_2.l2;
            }
            c453470HqL.LIZJ(list2, str2, interfaceC453460HqK, interfaceC453160Hpq);
        } else if (((C013C) agS162S0300000_2.l0).element) {
            ((C453470HqL) agS162S0300000_2.l1).LIZ(AFwS187S0000000_2.get$arr$(1311));
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (!((Boolean) obj).booleanValue() && ((Boolean) ((C05P0) agS162S0300000_2.l0).getValue()).booleanValue()) {
            InterfaceC1368705Xh interfaceC1368705Xh = (InterfaceC1368705Xh) ((Function0) agS162S0300000_2.l1).invoke();
            if (interfaceC1368705Xh != null) {
                try {
                    if (interfaceC1368705Xh.LLLLLZL()) {
                        interfaceC1368705Xh.LLLLZI();
                    }
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            ((C05P0) agS162S0300000_2.l0).setValue(false);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0956] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$3(Y.AgS162S0300000_2 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C05RM
            if (r0 == 0) goto L67
            r3 = r9
            X.05RM r3 = (X.C05RM) r3
            int r2 = r3.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r3.LLILZLL = r2
        L12:
            java.lang.Object r1 = r3.LLILZ
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZLL
            r6 = 1
            if (r0 == 0) goto L43
            if (r0 != r6) goto L6d
            java.lang.Object r8 = r3.LLILLJJLI
            Y.AgS162S0300000_2 r7 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            java.lang.Object r5 = r7.l0
            X.00zU r5 = (X.C259800zU) r5
            java.lang.Object r4 = r7.l1
            X.01wk r4 = (X.InterfaceC497601wk) r4
            X.099V r3 = X.C099V.UNDISPATCHED
            X.05RL r2 = new X.05RL
            java.lang.Object r1 = r7.l2
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 0
            r2.<init>(r1, r8, r4, r0)
            X.0956 r0 = X.C23250099c.LIZLLL(r4, r0, r3, r2, r6)
            r5.element = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L43:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r0 = r7.l0
            X.00zU r0 = (X.C259800zU) r0
            T r1 = r0.element
            X.09AE r1 = (X.C09AE) r1
            if (r1 == 0) goto L26
            X.05bI r0 = new X.05bI
            r0.<init>()
            r1.LIZIZ(r0)
            r3.LL = r7
            r3.LLILLJJLI = r8
            r3.LLILLL = r1
            r3.LLILZLL = r6
            java.lang.Object r0 = r1.LJJZ(r3)
            if (r0 != r2) goto L26
            return r2
        L67:
            X.05RM r3 = new X.05RM
            r3.<init>(r7, r9)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS162S0300000_2.emit$3(Y.AgS162S0300000_2, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$4(Y.AgS162S0300000_2 r7, java.lang.Object r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C1371405Yi
            if (r0 == 0) goto L7b
            r5 = r9
            X.05Yi r5 = (X.C1371405Yi) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r6 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2b
            if (r0 == r1) goto L89
            if (r0 == r2) goto L54
            if (r0 != r3) goto L81
            X.C155000ia.LIZIZ(r6)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r6)
            java.lang.Object r0 = r7.l0
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 == 0) goto L43
            java.lang.Object r0 = r7.l1
            X.01Wf r0 = (X.InterfaceC346701Wf) r0
            r5.LLILZIL = r1
            java.lang.Object r0 = r0.emit(r8, r5)
            if (r0 != r4) goto L8c
            return r4
        L43:
            java.lang.Object r0 = r7.l2
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILZIL = r2
            java.lang.Object r6 = r0.invoke(r8, r5)
            if (r6 != r4) goto L5b
            return r4
        L54:
            java.lang.Object r8 = r5.LLILLJJLI
            Y.AgS162S0300000_2 r7 = r5.LL
            X.C155000ia.LIZIZ(r6)
        L5b:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r0 = r6.booleanValue()
            if (r0 != 0) goto L8f
            java.lang.Object r0 = r7.l0
            X.013C r0 = (X.C013C) r0
            r0.element = r1
            java.lang.Object r1 = r7.l1
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            r0 = 0
            r5.LL = r0
            r5.LLILLJJLI = r0
            r5.LLILZIL = r3
            java.lang.Object r0 = r1.emit(r8, r5)
            if (r0 != r4) goto L28
            return r4
        L7b:
            X.05Yi r5 = new X.05Yi
            r5.<init>(r7, r9)
            goto L12
        L81:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L89:
            X.C155000ia.LIZIZ(r6)
        L8c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS162S0300000_2.emit$4(Y.AgS162S0300000_2, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, X.05YD, X.1DDq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$5(Y.AgS162S0300000_2 r5, java.lang.Object r6, X.InterfaceC1364105Vn r7) {
        /*
            java.lang.Object r0 = r5.l0
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            X.0D0u r0 = (X.InterfaceC332260D0u) r0
            if (r0 == 0) goto L11
            r0.setValue(r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != 0) goto L33
        L11:
            java.lang.Object r0 = r5.l1
            X.01wk r0 = (X.InterfaceC497601wk) r0
            java.lang.Object r4 = r5.l0
            X.00zU r4 = (X.C259800zU) r4
            java.lang.Object r3 = r5.l2
            X.05XL r3 = (X.C05XL) r3
            X.1DDq r2 = X.C1BNE.LIZ(r6)
            X.0951 r1 = new X.0951
            kotlin.coroutines.CoroutineContext r0 = r0.getCoroutineContext()
            X.09AE r0 = X.C23118094a.LJII(r0)
            r1.<init>(r2, r0)
            r3.LJIIZILJ(r1)
            r4.element = r2
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS162S0300000_2.emit$5(Y.AgS162S0300000_2, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$6(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Number) obj).intValue();
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = ((C1516305wf) agS162S0300000_2.l0).LJIJJ();
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) agS162S0300000_2.l1;
        AnonymousClass0617 anonymousClass0617 = (AnonymousClass0617) agS162S0300000_2.l2;
        C1516305wf c1516305wf = (C1516305wf) agS162S0300000_2.l0;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye3, Collections.singletonList(anonymousClass0617), c1516305wf.LIZIZ(), c1516305wf.LLILLJJLI);
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = ((C1516305wf) agS162S0300000_2.l0).LJIJJ();
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) agS162S0300000_2.l1;
        AnonymousClass0617 anonymousClass0617 = (AnonymousClass0617) agS162S0300000_2.l2;
        C1516305wf c1516305wf = (C1516305wf) agS162S0300000_2.l0;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye3, Collections.singletonList(anonymousClass0617), c1516305wf.LIZIZ(), c1516305wf.LLILLJJLI);
        }
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Boolean) obj).booleanValue();
        CopyOnWriteArrayList<InterfaceC1482905rH> copyOnWriteArrayListLJIJJ = ((C1516305wf) agS162S0300000_2.l0).LJIJJ();
        InterfaceC879010Ye3 interfaceC879010Ye3 = (InterfaceC879010Ye3) agS162S0300000_2.l1;
        AnonymousClass0617 anonymousClass0617 = (AnonymousClass0617) agS162S0300000_2.l2;
        C1516305wf c1516305wf = (C1516305wf) agS162S0300000_2.l0;
        Iterator<InterfaceC1482905rH> it2 = copyOnWriteArrayListLJIJJ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(interfaceC879010Ye3, Collections.singletonList(anonymousClass0617), c1516305wf.LIZIZ(), c1516305wf.LLILLJJLI);
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS162S0300000_2 agS162S0300000_2, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iIntValue = ((Number) obj).intValue() % ((InterfaceC1665500tRU) agS162S0300000_2.l0).size();
        ((C05P0) agS162S0300000_2.l2).setValue(Integer.valueOf(iIntValue));
        ((Function1) agS162S0300000_2.l1).invoke(C2286608xc.LJ(iIntValue));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS162S0300000_2(Object obj, C05P0<Boolean> c05p0, Function0<? extends InterfaceC1368705Xh> function0, InterfaceC497601wk interfaceC497601wk) {
        this.$t = interfaceC497601wk;
        this.l0 = obj;
        this.l1 = c05p0;
        this.l2 = function0;
    }
}
