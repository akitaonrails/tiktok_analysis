package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M7T, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.action.AIRemixAction$execute$2", f = "AIRemixAction.kt", l = {113}, m = "invokeSuspend")
public final class C0M7T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C0M7S LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M7T(Context context, C0M7S c0m7s, InterfaceC1364105Vn<? super C0M7T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = c0m7s;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0M7T c0m7t = new C0M7T(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0m7t.LLILLJJLI = obj;
        return c0m7t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Dialog dialog;
        boolean zLIZIZ;
        C1C7U.LIZ("AIRemixAction@3cc4.execute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                Dialog dialog2 = (Dialog) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
                dialog = dialog2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(this.LLILLL);
            dialogC1389620mGW.setOnDismissListener(new DialogInterfaceOnDismissListenerC580970MqV(interfaceC497601wk, 3));
            dialogC1389620mGW.LJJLJ(R.string.txr);
            C571830Mbl.LIZIZ(dialogC1389620mGW);
            C0M7D c0m7d = this.LLILZ.LLILLL;
            this.LLILLJJLI = dialogC1389620mGW;
            this.LL = 1;
            obj = c0m7d.LIZIZ(this);
            dialog = dialogC1389620mGW;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIRemixAction@3cc4.execute$2");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C0M7S c0m7s = this.LLILZ;
            Context context = this.LLILLL;
            C23250099c.LIZLLL(c0m7s.LLILZIL, null, null, new C563160M6w(c0m7s, context, new AwS552S0100000_8(c0m7s, context, 914), null), 3);
        } else {
            try {
                zLIZIZ = C036E.LIZ.LIZIZ();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                zLIZIZ = false;
            }
            if (!zLIZIZ) {
                Activity activityLIZ = C085T.LIZ(this.LLILLL);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIIZ(2131857244);
                    c1389890mGx.LJIIJJI();
                }
            } else {
                Activity activityLIZ2 = C085T.LIZ(this.LLILLL);
                if (activityLIZ2 != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activityLIZ2);
                    c1389890mGx2.LJIIIZ(2131846103);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        C571830Mbl.LIZ(dialog);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIRemixAction@3cc4.execute$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
