package Y;

import X.C0HZQ;
import X.C0J19;
import X.C0J1E;
import X.C0KC9;
import X.C0KCC;
import X.C0KCJ;
import X.C0KDH;
import X.C0KDP;
import X.C0KDZ;
import X.C13LP;
import X.C16F5;
import X.C197039127h;
import X.C1A6I;
import X.C259800zU;
import X.C513840KDe;
import android.content.Context;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubPackageMultiMonthFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.ui.SubUpdowngradePackageFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.PackagePageViewModel;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class AObserverS172S0200000_7 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        C1A6I c1a6i = (C1A6I) obj;
        C0J19 c0j19 = ((MaterialSelectPagingScene) aObserverS172S0200000_7.l0).LLLF;
        if (c0j19 != null) {
            c0j19.LLLI(c1a6i);
        }
        ((C0J1E) aObserverS172S0200000_7.l1).LIZ(C13LP.LLIIII(c1a6i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$1(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        C0KCJ c0kcj = (C0KCJ) obj;
        if (((MediatorLiveData) aObserverS172S0200000_7.l0).getValue() == 0) {
            ((MediatorLiveData) aObserverS172S0200000_7.l0).setValue(new C0KCJ(c0kcj.LIZ, c0kcj.LIZIZ, c0kcj.LIZJ, null, true, false, 40));
        } else {
            C0KCJ c0kcj2 = (C0KCJ) ((MediatorLiveData) aObserverS172S0200000_7.l0).getValue();
            if (c0kcj2 != null) {
                c0kcj2.LIZ = ((UpDowngradePackageViewModel) aObserverS172S0200000_7.l1).wQ2(c0kcj.LIZ);
                c0kcj2.LIZIZ = c0kcj.LIZIZ;
                c0kcj2.LIZJ = c0kcj.LIZJ;
                c0kcj2.LJ = true;
            }
            ((MediatorLiveData) aObserverS172S0200000_7.l0).setValue(c0kcj2);
        }
        ((UpDowngradePackageViewModel) aObserverS172S0200000_7.l1).LLILZIL.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$2(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        Map<String, C0KDH> map = (Map) obj;
        if (((MediatorLiveData) aObserverS172S0200000_7.l0).getValue() == 0) {
            ((MediatorLiveData) aObserverS172S0200000_7.l0).setValue(new C0KCJ(null, null, null, map, false, true, 23));
            return;
        }
        C0KCJ c0kcj = (C0KCJ) ((MediatorLiveData) aObserverS172S0200000_7.l0).getValue();
        if (c0kcj != null) {
            c0kcj.LIZ = ((UpDowngradePackageViewModel) aObserverS172S0200000_7.l1).wQ2(c0kcj.LIZ);
            c0kcj.LIZLLL = map;
            c0kcj.LJFF = true;
        }
        ((MediatorLiveData) aObserverS172S0200000_7.l0).setValue(c0kcj);
    }

    public static final void onChanged$3(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        Boolean bool = (Boolean) obj;
        if (!Intrinsics.LJFF(Boolean.valueOf(((LiveDrawerDialogV3) aObserverS172S0200000_7.l0).LLJJJIL), bool)) {
            ((LiveDrawerDialogV3) aObserverS172S0200000_7.l0).LLJJJIL = bool.booleanValue();
            C16F5 c16f5 = (C16F5) aObserverS172S0200000_7.l1;
            if (c16f5 != null) {
                c16f5.setText(((LiveDrawerDialogV3) aObserverS172S0200000_7.l0).aS(bool.booleanValue()));
            }
        }
    }

    public static final void onChanged$4(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        PackagePageViewModel packagePageViewModel;
        MutableLiveData<C0KDP> mutableLiveData;
        boolean zLJIIJ = C513840KDe.LJIIJ((C0KDZ) obj);
        C0HZQ c0hzq = ((SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0).LLJILJIL;
        if (c0hzq != null) {
            c0hzq.setClickable(!zLJIIJ);
        }
        C197039127h c197039127h = ((SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0).LLJIJIL;
        if (c197039127h != null) {
            c197039127h.setClickable(!zLJIIJ);
        }
        if (zLJIIJ && (packagePageViewModel = ((SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0).LLILLL) != null && (mutableLiveData = packagePageViewModel.LLJI) != null) {
            mutableLiveData.observeForever((Observer) aObserverS172S0200000_7.l1);
        }
    }

    public static final void onChanged$5(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        UpDowngradePackageViewModel upDowngradePackageViewModel;
        MutableLiveData<C0KDP> mutableLiveData;
        boolean zLJIIJ = C513840KDe.LJIIJ((C0KDZ) obj);
        C0HZQ c0hzq = ((SubUpdowngradePackageFragment) aObserverS172S0200000_7.l0).LLJ;
        if (c0hzq != null) {
            c0hzq.setClickable(!zLJIIJ);
        }
        C197039127h c197039127h = ((SubUpdowngradePackageFragment) aObserverS172S0200000_7.l0).LLIZLLLIL;
        if (c197039127h != null) {
            c197039127h.setClickable(!zLJIIJ);
        }
        if (zLJIIJ && (upDowngradePackageViewModel = ((SubUpdowngradePackageFragment) aObserverS172S0200000_7.l0).LLILLL) != null && (mutableLiveData = upDowngradePackageViewModel.LLJ) != null) {
            mutableLiveData.observeForever((Observer) aObserverS172S0200000_7.l1);
        }
    }

    public static final void onChanged$6(AObserverS172S0200000_7 aObserverS172S0200000_7, Object obj) {
        Function0 function0;
        if (((C0KDP) obj).LIZJ == 1) {
            C0KC9 c0kc9 = C0KC9.LIZ;
            SubPackageMultiMonthFragment subPackageMultiMonthFragment = (SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0;
            C0KCC c0kcc = subPackageMultiMonthFragment.LLILZIL;
            Boolean boolValueOf = Boolean.valueOf(subPackageMultiMonthFragment.LLIZ);
            Context context = ((SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0).getContext();
            c0kc9.getClass();
            C0KC9.LIZLLL(c0kcc, boolValueOf, context);
            SubPackageMultiMonthFragment subPackageMultiMonthFragment2 = (SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0;
            PackagePageViewModel packagePageViewModel = subPackageMultiMonthFragment2.LLILLL;
            if (packagePageViewModel != null) {
                packagePageViewModel.LLJIJIL.setValue(C0KDZ.PAY_ENDED);
            }
            C197039127h c197039127h = subPackageMultiMonthFragment2.LLJIJIL;
            if (c197039127h != null) {
                c197039127h.setLoading(false);
            }
            subPackageMultiMonthFragment2.LLILLJJLI.invoke();
        } else {
            SubPackageMultiMonthFragment subPackageMultiMonthFragment3 = (SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0;
            PackagePageViewModel packagePageViewModel2 = subPackageMultiMonthFragment3.LLILLL;
            if (packagePageViewModel2 != null) {
                packagePageViewModel2.LLJIJIL.setValue(C0KDZ.PAY_ENDED);
            }
            C197039127h c197039127h2 = subPackageMultiMonthFragment3.LLJIJIL;
            if (c197039127h2 != null) {
                c197039127h2.setLoading(false);
            }
        }
        if (((SubPackageMultiMonthFragment) aObserverS172S0200000_7.l0).LLJJJIL && (function0 = (Function0) ((C259800zU) aObserverS172S0200000_7.l1).element) != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$7(Y.AObserverS172S0200000_7 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS172S0200000_7.onChanged$7(Y.AObserverS172S0200000_7, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS172S0200000_7(Object obj, MediatorLiveData<C0KCJ> mediatorLiveData, UpDowngradePackageViewModel upDowngradePackageViewModel) {
        this.$t = upDowngradePackageViewModel;
        this.l0 = obj;
        this.l1 = mediatorLiveData;
    }
}
