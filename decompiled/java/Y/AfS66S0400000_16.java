package Y;

import X.AbstractC19994813Le;
import X.C09JN;
import X.C1070510dxp;
import X.C1070520dxq;
import X.C11JF;
import X.C1C7U;
import X.InterfaceC1041760dDS;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.fe.method.OpenRechargePanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public class AfS66S0400000_16 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS66S0400000_16 afS66S0400000_16, Object obj) {
        C1C7U.LIZ("OpenRechargePanel@3170.handle$disposable$1");
        ((OpenRechargePanel) afS66S0400000_16.l0).LIZ((JSONObject) afS66S0400000_16.l1, (Bundle) afS66S0400000_16.l2, (InterfaceC1041760dDS) afS66S0400000_16.l3);
        C1C7U.LIZIZ("OpenRechargePanel@3170.handle$disposable$1");
    }

    public static final void accept$1(AfS66S0400000_16 afS66S0400000_16, Object obj) {
        C1C7U.LIZ("OpenRechargePanel@3170.handle$disposable$2");
        ((OpenRechargePanel) afS66S0400000_16.l0).LIZ((JSONObject) afS66S0400000_16.l1, (Bundle) afS66S0400000_16.l2, (InterfaceC1041760dDS) afS66S0400000_16.l3);
        C1C7U.LIZIZ("OpenRechargePanel@3170.handle$disposable$2");
    }

    public static final void accept$2(AfS66S0400000_16 afS66S0400000_16, Object obj) {
        C1C7U.LIZ("FindCtxSettingManager@b41b.checkMLBBRemoveStatusPeriodically$1");
        Long l = (Long) obj;
        if (C1070520dxq.LJIJ >= 10 || !C1070510dxp.LIZIZ()) {
            C11JF c11jf = C1070520dxq.LJIIZILJ;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C1070520dxq c1070520dxq = C1070520dxq.LIZ;
            Context context = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function1 = (Function1) afS66S0400000_16.l2;
            Function1 function12 = (Function1) afS66S0400000_16.l3;
            c1070520dxq.getClass();
            C1070520dxq.LJIILJJIL(context, lifecycleOwner, function1, function12);
            Keva.getRepo("mlbb_sync_repo").storeBoolean("mlbb_sync_is_removing", false);
            C1070520dxq.LJIJ = 0;
            C1070520dxq.LJIJI = 0L;
            C1070520dxq.LJIJJ = 0L;
        }
        long j = C1070520dxq.LJIJI + C1070520dxq.LJIJJ;
        if (l != null && l.longValue() == j && C1070520dxq.LJIJ < 10) {
            C1070520dxq.LJIJI += C1070520dxq.LJIJJ;
            C1070520dxq.LJIJ++;
            C1070520dxq.LJIJJ = AbstractC19994813Le.Default.nextLong(5L, 10L);
            C1070520dxq c1070520dxq2 = C1070520dxq.LIZ;
            Context context2 = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function13 = (Function1) afS66S0400000_16.l2;
            Function1 function14 = (Function1) afS66S0400000_16.l3;
            c1070520dxq2.getClass();
            C1070520dxq.LIZJ(context2, lifecycleOwner2, function13, function14);
        }
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkMLBBRemoveStatusPeriodically$1");
    }

    public static final void accept$3(AfS66S0400000_16 afS66S0400000_16, Object obj) {
        C1C7U.LIZ("FindCtxSettingManager@b41b.checkContactRemoveStatusPeriodically$1");
        Long l = (Long) obj;
        if (C1070520dxq.LJIIIIZZ >= 10 || !C1070510dxp.LIZJ()) {
            C1070520dxq c1070520dxq = C1070520dxq.LIZ;
            Context context = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function1 = (Function1) afS66S0400000_16.l2;
            Function1 function12 = (Function1) afS66S0400000_16.l3;
            c1070520dxq.getClass();
            C1070520dxq.LJIIL(context, lifecycleOwner, function1, function12, 0);
        }
        long j = C1070520dxq.LJIIIZ + C1070520dxq.LJIIJ;
        if (l != null && l.longValue() == j && C1070520dxq.LJIIIIZZ < 10) {
            C1070520dxq.LJIIIZ += C1070520dxq.LJIIJ;
            C1070520dxq.LJIIIIZZ++;
            C1070520dxq.LJIIJ = AbstractC19994813Le.Default.nextLong(5L, 10L);
            C1070520dxq c1070520dxq2 = C1070520dxq.LIZ;
            Context context2 = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function13 = (Function1) afS66S0400000_16.l2;
            Function1 function14 = (Function1) afS66S0400000_16.l3;
            c1070520dxq2.getClass();
            C1070520dxq.LIZ(context2, lifecycleOwner2, function13, function14);
        }
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkContactRemoveStatusPeriodically$1");
    }

    public static final void accept$4(AfS66S0400000_16 afS66S0400000_16, Object obj) {
        C1C7U.LIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatusPeriodically$1");
        Long l = (Long) obj;
        if (C1070520dxq.LJIILIIL >= 10 || !C1070510dxp.LIZ()) {
            C11JF c11jf = C1070520dxq.LJIIL;
            if (c11jf != null) {
                c11jf.dispose();
            }
            C1070520dxq c1070520dxq = C1070520dxq.LIZ;
            Context context = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function1 = (Function1) afS66S0400000_16.l2;
            Function1 function12 = (Function1) afS66S0400000_16.l3;
            c1070520dxq.getClass();
            C1070520dxq.LJIILIIL(context, lifecycleOwner, function1, function12);
            Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", false);
            C1070520dxq.LJIILIIL = 0;
            C1070520dxq.LJIILL = 0L;
            C1070520dxq.LJIILJJIL = 0L;
        }
        long j = C1070520dxq.LJIILJJIL + C1070520dxq.LJIILL;
        if (l != null && l.longValue() == j && C1070520dxq.LJIILIIL < 10) {
            C1070520dxq.LJIILJJIL += C1070520dxq.LJIILL;
            C1070520dxq.LJIILIIL++;
            C1070520dxq.LJIILL = AbstractC19994813Le.Default.nextLong(5L, 10L);
            C1070520dxq c1070520dxq2 = C1070520dxq.LIZ;
            Context context2 = (Context) afS66S0400000_16.l0;
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) afS66S0400000_16.l1;
            Function1 function13 = (Function1) afS66S0400000_16.l2;
            Function1 function14 = (Function1) afS66S0400000_16.l3;
            c1070520dxq2.getClass();
            C1070520dxq.LIZIZ(context2, lifecycleOwner2, function13, function14);
        }
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatusPeriodically$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS66S0400000_16(Object obj, Context context, LifecycleOwner lifecycleOwner, Function1<? super Integer, Unit> function1, Function1<? super Boolean, Unit> function12) {
        this.$t = function12;
        this.l0 = obj;
        this.l1 = context;
        this.l2 = lifecycleOwner;
        this.l3 = function1;
    }
}
