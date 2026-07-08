package X;

import Y.ACListenerS124S0200000_21;
import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ldx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ToastHelper$showToast$1$1$3", f = "ToastHelper.kt", l = {}, m = "invokeSuspend")
public final class C1365710ldx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ToastHelper LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C0ZTY LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365710ldx(ToastHelper toastHelper, String str, long j, Function0<Unit> function0, boolean z, int i, String str2, C0ZTY c0zty, InterfaceC1364105Vn<? super C1365710ldx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = toastHelper;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = function0;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = str2;
        this.LLIZLLLIL = c0zty;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365710ldx(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final boolean z;
        long j;
        final String str;
        C1C7U.LIZ("ToastHelper@5030.showToast$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final ToastHelper toastHelper = this.LL;
        String str2 = this.LLILLJJLI;
        final long j2 = this.LLILLL;
        final Function0<Unit> function0 = this.LLILZ;
        boolean z2 = this.LLILZIL;
        final int i = this.LLILZLL;
        String str3 = this.LLIZ;
        C0ZTY c0zty = this.LLIZLLLIL;
        if (!Intrinsics.LJFF(toastHelper.LIZJ, str3)) {
            toastHelper.LIZLLL();
            final ArrayList arrayList = new ArrayList();
            final C118300cf c118300cf = new C118300cf();
            List listLIZIZ = ToastHelper.LIZIZ();
            if (Intrinsics.LJFF(c0zty, C0ZTX.LIZ)) {
                Activity activity = (Activity) C13LP.LJJJLL(listLIZIZ);
                if (activity != null) {
                    c118300cf.element = toastHelper.LIZJ(activity, null);
                }
            } else if (c0zty instanceof C1365750le1) {
                c118300cf.element = ((C1365750le1) c0zty).LIZ;
            } else if (c0zty instanceof C1365760le2) {
                Activity activity2 = (Activity) C13LP.LJJJLL(listLIZIZ);
                if (activity2 != null) {
                    c118300cf.element = toastHelper.LIZJ(activity2, Integer.valueOf(((C1365760le2) c0zty).LIZ));
                }
            } else {
                throw new C1954807lC();
            }
            for (final Activity activity3 : (ArrayList) listLIZIZ) {
                if (!activity3.isFinishing()) {
                    str = str2;
                    z = z2;
                    j = j2;
                    HandlerHook.viewPost(activity3.getWindow().getDecorView(), new Runnable() { // from class: X.0ldy
                        public final void LIZ() {
                            Window window;
                            C19EG c19eg;
                            FragmentManager supportFragmentManager;
                            List<Fragment> listLJJLIIIJL;
                            Fragment fragment;
                            FragmentManager childFragmentManager;
                            List<Fragment> listLJJLIIIJL2;
                            C19EG c19eg2;
                            FragmentManager supportFragmentManager2;
                            List<Fragment> listLJJLIIIJL3;
                            if (activity3.isFinishing() || activity3.isDestroyed() || !activity3.getWindow().getDecorView().isAttachedToWindow() || activity3.getWindow().getDecorView().getWidth() <= 0) {
                                return;
                            }
                            C1389910mGz c1389910mGz = new C1389910mGz(activity3);
                            List<WeakReference<InterfaceC1365770le3>> list = arrayList;
                            String str4 = str;
                            long j3 = j2;
                            boolean z3 = z;
                            int i2 = i;
                            C118300cf c118300cf2 = c118300cf;
                            ToastHelper toastHelper2 = toastHelper;
                            Function0<Unit> function02 = function0;
                            int i3 = 0;
                            C1360890lWB c1360890lWB = new C1360890lWB(0);
                            c1389910mGz.LIZ = c1360890lWB;
                            C1717206ny.LIZ(new WeakReference(c1360890lWB), list);
                            c1389910mGz.LJIIJ(str4);
                            c1389910mGz.LJ(j3);
                            if (!z3) {
                                c1389910mGz.LJI(R.style.y0);
                            }
                            ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(function02, toastHelper2, 8);
                            C1360890lWB c1360890lWB2 = c1389910mGz.LIZ;
                            c1360890lWB2.LJIIIIZZ = aCListenerS124S0200000_21;
                            c1360890lWB2.LIZIZ = i2;
                            c1389910mGz.LIZIZ(c118300cf2.element);
                            c1389910mGz.LJIIJJI();
                            ArrayList<DialogFragment> arrayList2 = new ArrayList();
                            Activity activity4 = activity3;
                            if ((activity4 instanceof C19EG) && (c19eg2 = (C19EG) activity4) != null && (supportFragmentManager2 = c19eg2.getSupportFragmentManager()) != null && (listLJJLIIIJL3 = supportFragmentManager2.LJJLIIIJL()) != null) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Fragment fragment2 : listLJJLIIIJL3) {
                                    if (fragment2 instanceof BaseSheet) {
                                        arrayList3.add(fragment2);
                                    }
                                }
                                arrayList2.addAll(arrayList3);
                            }
                            Activity activity5 = activity3;
                            if ((activity5 instanceof C19EG) && (c19eg = (C19EG) activity5) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && (fragment = (Fragment) C13LP.LJJJLL(listLJJLIIIJL)) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null && (listLJJLIIIJL2 = childFragmentManager.LJJLIIIJL()) != null) {
                                ArrayList arrayList4 = new ArrayList();
                                for (Fragment fragment3 : listLJJLIIIJL2) {
                                    if (fragment3 instanceof AppCompatDialogFragment) {
                                        arrayList4.add(fragment3);
                                    }
                                }
                                arrayList2.addAll(arrayList4);
                            }
                            List<WeakReference<InterfaceC1365770le3>> list2 = arrayList;
                            String str5 = str;
                            long j4 = j2;
                            boolean z4 = z;
                            int i4 = i;
                            C118300cf c118300cf3 = c118300cf;
                            ToastHelper toastHelper3 = toastHelper;
                            Function0<Unit> function03 = function0;
                            for (DialogFragment dialogFragment : arrayList2) {
                                if (C494501wF.LIZ(dialogFragment)) {
                                    C1389910mGz c1389910mGz2 = new C1389910mGz(dialogFragment);
                                    C1360890lWB c1360890lWB3 = new C1360890lWB(i3);
                                    c1389910mGz2.LIZ = c1360890lWB3;
                                    C1717206ny.LIZ(new WeakReference(c1360890lWB3), list2);
                                    c1389910mGz2.LJIIJ(str5);
                                    c1389910mGz2.LJ(j4);
                                    if (!z4) {
                                        c1389910mGz2.LJI(R.style.y0);
                                    }
                                    Dialog dialog = dialogFragment.getDialog();
                                    View decorView = (dialog == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
                                    C1360890lWB c1360890lWB4 = c1389910mGz2.LIZ;
                                    c1360890lWB4.LJIIIZ = decorView;
                                    c1360890lWB4.LJIIIIZZ = new ACListenerS124S0200000_21(function03, toastHelper3, 9);
                                    c1360890lWB4.LIZIZ = i4;
                                    c1389910mGz2.LIZIZ(c118300cf3.element);
                                    c1389910mGz2.LJIIJJI();
                                    i3 = 0;
                                }
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("ToastHelper@5030.showBottomToast$3$1");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("ToastHelper@5030.showBottomToast$3$1");
                        }
                    });
                } else {
                    z = z2;
                    j = j2;
                    str = str2;
                }
                z2 = z;
                j2 = j;
                str2 = str;
            }
            toastHelper.LIZJ = str3;
            toastHelper.LIZLLL = arrayList;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToastHelper@5030.showToast$1$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
