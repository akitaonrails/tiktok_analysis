package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mal, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1402170mal implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public static final void run$0(C1402170mal c1402170mal) {
        ((Function1) c1402170mal.l0).invoke(Boolean.FALSE);
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        Fragment fragment = (Fragment) c1402170mal.l1;
        Activity activity = (Activity) c1402170mal.l2;
        c1392890mLn.getClass();
        C1392890mLn.LJFF(activity, fragment);
    }

    public static final void run$1(C1402170mal c1402170mal) {
        ((Function1) c1402170mal.l0).invoke(Boolean.FALSE);
        C1392890mLn c1392890mLn = C1392890mLn.LIZ;
        Fragment fragment = (Fragment) c1402170mal.l1;
        Activity activity = (Activity) c1402170mal.l2;
        c1392890mLn.getClass();
        C1392890mLn.LJFF(activity, fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1402170mal(Function1 function1, Function1<? super Boolean, Unit> function12, Fragment fragment, Activity activity) {
        this.$t = activity;
        this.l0 = function1;
        this.l1 = function12;
        this.l2 = fragment;
    }
}
