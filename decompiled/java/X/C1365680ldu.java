package X;

import android.app.Activity;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.BaseSheet;
import com.ss.android.ugc.aweme.ToastHelper;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ldu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ToastHelper$showToast$1$1$1", f = "ToastHelper.kt", l = {}, m = "invokeSuspend")
public final class C1365680ldu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ToastHelper LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365680ldu(ToastHelper toastHelper, String str, long j, boolean z, int i, String str2, boolean z2, InterfaceC1364105Vn<? super C1365680ldu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = toastHelper;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = z;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365680ldu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToastHelper@5030.showToast$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final ToastHelper toastHelper = this.LL;
        final String str = this.LLILLJJLI;
        final long j = this.LLILLL;
        final boolean z = this.LLILZ;
        int i = this.LLILZIL;
        String str2 = this.LLILZLL;
        final boolean z2 = this.LLIZ;
        if (!Intrinsics.LJFF(toastHelper.LIZJ, str2)) {
            toastHelper.LIZLLL();
            final ArrayList arrayList = new ArrayList();
            for (final Activity activity : (ArrayList) ToastHelper.LIZIZ()) {
                final int i2 = i;
                HandlerHook.viewPost(activity.getWindow().getDecorView(), new Runnable() { // from class: X.0ldv
                    public final void LIZ() {
                        Integer numValueOf;
                        C19EG c19eg;
                        FragmentManager supportFragmentManager;
                        List<Fragment> listLJJLIIIJL;
                        Fragment fragment;
                        FragmentManager childFragmentManager;
                        List<Fragment> listLJJLIIIJL2;
                        C19EG c19eg2;
                        FragmentManager supportFragmentManager2;
                        List<Fragment> listLJJLIIIJL3;
                        if (activity.isFinishing() || activity.isDestroyed() || !activity.getWindow().getDecorView().isAttachedToWindow() || activity.getWindow().getDecorView().getWidth() <= 0) {
                            return;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(activity);
                        List<WeakReference<InterfaceC1365770le3>> list = arrayList;
                        String str3 = str;
                        long j2 = j;
                        ToastHelper toastHelper2 = toastHelper;
                        int i3 = i2;
                        boolean z3 = z2;
                        boolean z4 = z;
                        C1389920mH0 c1389920mH0 = null;
                        C1383230m6D c1383230m6D = new C1383230m6D(null, 31);
                        c1389890mGx.LIZ = c1383230m6D;
                        C1717206ny.LIZ(new WeakReference(c1383230m6D), list);
                        c1389890mGx.LJIIJ(str3);
                        c1389890mGx.LIZLLL(j2);
                        Integer numValueOf2 = Integer.valueOf(i3);
                        toastHelper2.getClass();
                        Integer numValueOf3 = (numValueOf2 == null || numValueOf2.intValue() != 0) ? null : Integer.valueOf(R.raw.icon_tick_circle_fill);
                        if (numValueOf3 != null) {
                            c1389890mGx.LJFF(numValueOf3.intValue());
                            c1389890mGx.LJII(R.attr.a1h);
                        }
                        c1389890mGx.LIZ(z3);
                        if (!z4) {
                            c1389890mGx.LJ(Integer.valueOf(R.style.y0));
                        }
                        c1389890mGx.LJIIJJI();
                        ArrayList<Fragment> arrayList2 = new ArrayList();
                        Activity activity2 = activity;
                        if ((activity2 instanceof C19EG) && (c19eg2 = (C19EG) activity2) != null && (supportFragmentManager2 = c19eg2.getSupportFragmentManager()) != null && (listLJJLIIIJL3 = supportFragmentManager2.LJJLIIIJL()) != null) {
                            ArrayList arrayList3 = new ArrayList();
                            for (Fragment fragment2 : listLJJLIIIJL3) {
                                if (fragment2 instanceof BaseSheet) {
                                    arrayList3.add(fragment2);
                                }
                            }
                            arrayList2.addAll(arrayList3);
                        }
                        Activity activity3 = activity;
                        if ((activity3 instanceof C19EG) && (c19eg = (C19EG) activity3) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJJLL(listLJJLIIIJL)) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (listLJJLIIIJL2 = childFragmentManager.LJJLIIIJL()) != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (Fragment fragment3 : listLJJLIIIJL2) {
                                if (fragment3 instanceof AppCompatDialogFragment) {
                                    arrayList4.add(fragment3);
                                }
                            }
                            arrayList2.addAll(arrayList4);
                        }
                        List<WeakReference<InterfaceC1365770le3>> list2 = arrayList;
                        String str4 = str;
                        ToastHelper toastHelper3 = toastHelper;
                        int i4 = i2;
                        long j3 = j;
                        boolean z5 = z2;
                        boolean z6 = z;
                        for (Fragment fragment4 : arrayList2) {
                            if (C494501wF.LIZ(fragment4)) {
                                C1389890mGx c1389890mGx2 = new C1389890mGx(fragment4);
                                C1383230m6D c1383230m6D2 = new C1383230m6D(c1389920mH0, 31);
                                c1389890mGx2.LIZ = c1383230m6D2;
                                C1717206ny.LIZ(new WeakReference(c1383230m6D2), list2);
                                c1389890mGx2.LJIIJ(str4);
                                Integer numValueOf4 = Integer.valueOf(i4);
                                toastHelper3.getClass();
                                if (numValueOf4 != null && numValueOf4.intValue() == 0 && (numValueOf = Integer.valueOf(R.raw.icon_tick_circle_fill)) != null) {
                                    c1389890mGx2.LJFF(numValueOf.intValue());
                                    c1389890mGx2.LJII(R.attr.a1h);
                                }
                                c1389890mGx2.LIZLLL(j3);
                                c1389890mGx2.LIZ(z5);
                                if (!z6) {
                                    c1389890mGx2.LJ(Integer.valueOf(R.style.y0));
                                }
                                c1389890mGx2.LJIIJJI();
                                c1389920mH0 = null;
                            }
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("ToastHelper@5030.showTopToast$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("ToastHelper@5030.showTopToast$1$1");
                    }
                });
                i = i2;
                j = j;
            }
            toastHelper.LIZJ = str2;
            toastHelper.LIZLLL = arrayList;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToastHelper@5030.showToast$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
