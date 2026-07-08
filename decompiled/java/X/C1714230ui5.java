package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.BaseVerifyFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ui5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1714230ui5 {
    public static final BaseVerifyFragment LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
        if (fragmentLJI instanceof BaseVerifyFragment) {
            return (BaseVerifyFragment) fragmentLJI;
        }
        return null;
    }

    public static final void LIZLLL(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static final void LJ(Context context, Function0<Unit> function0) {
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZIZ(C20642515q3.LJI(2131840459));
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS605S0100000_26(function0, (Function0<Unit>) 502));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    public static final void LIZIZ(C19EG c19eg, C1713570uh1 c1713570uh1, String str) {
        if (c1713570uh1 != null && Intrinsics.LJFF(str, "PASS")) {
            if (c1713570uh1.LIZ.LIZIZ.LJFF && c19eg != null) {
                c19eg.finish();
                return;
            }
            return;
        }
        if (c19eg == null) {
            return;
        }
        c19eg.finish();
    }

    public static void LIZJ(C1713680uhC c1713680uhC, Fragment fragment, String str, String str2, String str3, String str4, int i) {
        String str5 = str4;
        String str6 = str3;
        Fragment fragment2 = fragment;
        if ((i & 1) != 0) {
            fragment2 = null;
        }
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        c1713680uhC.LIZ(new C1713690uhD(fragment2, str, str2, str6, str5, new C1708530uYt(null, null, 6), (Map) null, 136));
    }
}
