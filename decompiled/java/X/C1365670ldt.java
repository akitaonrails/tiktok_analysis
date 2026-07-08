package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.ToastHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ldt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ToastHelper$showToast$1$1$2", f = "ToastHelper.kt", l = {}, m = "invokeSuspend")
public final class C1365670ldt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ToastHelper LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365670ldt(ToastHelper toastHelper, String str, long j, String str2, boolean z, InterfaceC1364105Vn<? super C1365670ldt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = toastHelper;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = str2;
        this.LLILZIL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365670ldt(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZ;
        C19EG c19eg;
        Fragment next;
        final BaseSheet baseSheet;
        final C19EG activity;
        Activity activityLIZIZ;
        C1C7U.LIZ("ToastHelper@5030.showToast$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ToastHelper toastHelper = this.LL;
        final String str = this.LLILLJJLI;
        final long j = this.LLILLL;
        String str2 = this.LLILZ;
        final boolean z = this.LLILZIL;
        if (!Intrinsics.LJFF(toastHelper.LIZJ, str2)) {
            toastHelper.LIZLLL();
            final ArrayList arrayList = new ArrayList();
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                activityLIZ = C1388190mED.LIZ(activityLIZIZ);
            } else {
                activityLIZ = null;
            }
            if ((activityLIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZ) != null && !c19eg.isFinishing() && !c19eg.isDestroyed()) {
                Iterator<Fragment> it2 = c19eg.getSupportFragmentManager().LJJLIIIJL().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        Fragment fragment = next;
                        if ((fragment instanceof BaseSheet) && C494501wF.LIZ(fragment)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                if ((next instanceof BaseSheet) && (baseSheet = (BaseSheet) next) != null && (activity = baseSheet.getActivity()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    HandlerHook.viewPost(activity.getWindow().getDecorView(), new Runnable() { // from class: X.0lds
                        public final void LIZ() {
                            if (activity.isFinishing() || activity.isDestroyed() || !activity.getWindow().getDecorView().isAttachedToWindow() || activity.getWindow().getDecorView().getWidth() <= 0) {
                                return;
                            }
                            BaseSheet baseSheet2 = baseSheet;
                            List<WeakReference<InterfaceC1365770le3>> list = arrayList;
                            String str3 = str;
                            long j2 = j;
                            boolean z2 = z;
                            if (C494501wF.LIZ(baseSheet2)) {
                                C1389880mGw c1389880mGw = new C1389880mGw(baseSheet2);
                                C1361790lXd c1361790lXd = new C1361790lXd(0);
                                c1389880mGw.LIZ = c1361790lXd;
                                C1717206ny.LIZ(new WeakReference(c1361790lXd), list);
                                c1389880mGw.LJIIIZ(str3);
                                c1389880mGw.LIZLLL(j2);
                                c1389880mGw.LIZ(z2);
                                c1389880mGw.LJIIJ();
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ToastHelper@5030.showCenterToast$1$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ToastHelper@5030.showCenterToast$1$1");
                        }
                    });
                }
            }
            for (final Activity activity2 : (ArrayList) ToastHelper.LIZIZ()) {
                HandlerHook.viewPost(activity2.getWindow().getDecorView(), new Runnable() { // from class: X.0ldr
                    public final void LIZ() {
                        if (activity2.isFinishing() || activity2.isDestroyed() || !activity2.getWindow().getDecorView().isAttachedToWindow() || activity2.getWindow().getDecorView().getWidth() <= 0) {
                            return;
                        }
                        C1389880mGw c1389880mGw = new C1389880mGw(activity2);
                        List<WeakReference<InterfaceC1365770le3>> list = arrayList;
                        String str3 = str;
                        long j2 = j;
                        boolean z2 = z;
                        C1361790lXd c1361790lXd = new C1361790lXd(0);
                        c1389880mGw.LIZ = c1361790lXd;
                        C1717206ny.LIZ(new WeakReference(c1361790lXd), list);
                        c1389880mGw.LJIIIZ(str3);
                        c1389880mGw.LIZLLL(j2);
                        c1389880mGw.LIZ(z2);
                        c1389880mGw.LJIIJ();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ToastHelper@5030.showCenterToast$2$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ToastHelper@5030.showCenterToast$2$1");
                    }
                });
            }
            toastHelper.LIZJ = str2;
            toastHelper.LIZLLL = arrayList;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToastHelper@5030.showToast$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
