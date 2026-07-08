package X;

import android.content.Context;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0mI8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.PopupMonitorServiceImpl$reportPopupShow$1", f = "PopupMonitorServiceImpl.kt", l = {442}, m = "invokeSuspend")
public final class C1390620mI8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1390700mIG LLILLJJLI;
    public final /* synthetic */ Context LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1390620mI8(C1390700mIG c1390700mIG, Context context, InterfaceC1364105Vn<? super C1390620mI8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1390700mIG;
        this.LLILLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1390620mI8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        Boolean second;
        C443120HZe<String, Boolean, Long> next;
        final String strLJIIIZ;
        C1C7U.LIZ("PopupMonitorServiceImpl@8747.reportPopupShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            PopupMonitorServiceImpl.LIZ.getClass();
            if (PopupMonitorServiceImpl.LJIIJJI.contains(this.LLILLJJLI.LIZ)) {
                j = C1390630mI9.LIZ().reportDelayTime;
            } else {
                j = 1000;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.reportPopupShow$1");
                return objLJFF;
            }
        }
        ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap = PopupManager.LIZIZ;
        String str = this.LLILLJJLI.LIZ;
        Iterator<C443120HZe<String, Boolean, Long>> it2 = PopupManager.LJIIJ.iterator();
        while (true) {
            second = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.getFirst(), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C443120HZe<String, Boolean, Long> c443120HZe = next;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasPopupRealShow: ");
        sbLIZ.append(str);
        sbLIZ.append("isShowing: ");
        if (c443120HZe != null) {
            second = c443120HZe.getSecond();
        }
        sbLIZ.append(second);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c443120HZe != null && c443120HZe.getSecond().booleanValue()) {
            PopupMonitorServiceImpl popupMonitorServiceImpl = PopupMonitorServiceImpl.LIZ;
            popupMonitorServiceImpl.getClass();
            C1390660mIC c1390660mICLJJIJL = PopupMonitorServiceImpl.LJJIJL();
            if (C314160CTe.LIZ() != 0) {
                if (this.LLILLJJLI.LIZJ.length() != 0 && !Intrinsics.LJFF(this.LLILLJJLI.LIZJ, "other")) {
                    strLJIIIZ = this.LLILLJJLI.LIZJ;
                } else {
                    int i2 = C2187451AjH.LIZ;
                    C20651915rZ.LIZIZ("reportPopupShow: miss enter from");
                    strLJIIIZ = popupMonitorServiceImpl.LJIIIZ(this.LLILLL);
                }
            } else {
                strLJIIIZ = popupMonitorServiceImpl.LJIIIZ(this.LLILLL);
            }
            ConcurrentHashMap<InterfaceC20658015sY, CopyOnWriteArrayList<C20656115sF>> concurrentHashMap2 = PopupManager.LIZIZ;
            C1390700mIG c1390700mIG = this.LLILLJJLI;
            final String str2 = c1390700mIG.LIZ;
            final String str3 = c1390700mIG.LIZIZ;
            PopupManager.LIZLLL().LJIIIZ.execute(new Runnable() { // from class: X.0mI7
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PopupManager@9e7f.recordPopupShow$1");
                    try {
                        PopupManager.LJIIIZ.addFirst(new C1390590mI5(str2, str3, System.currentTimeMillis(), strLJIIIZ));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PopupManager@9e7f.recordPopupShow$1");
                }
            });
            C1390650mIB c1390650mIB = C1390650mIB.LIZ;
            C1390700mIG c1390700mIG2 = this.LLILLJJLI;
            String str4 = c1390700mIG2.LIZ;
            EnumC1390310mHd enumC1390310mHd = EnumC1390310mHd.POPUP;
            String str5 = c1390700mIG2.LIZIZ;
            c1390650mIB.getClass();
            C1390650mIB.LJFF(str4, enumC1390310mHd, c1390660mICLJJIJL, str5, 2, strLJIIIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PopupMonitorServiceImpl@8747.reportPopupShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
