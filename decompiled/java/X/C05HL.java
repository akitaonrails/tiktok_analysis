package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantCloneRecordFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import njp.a;

/* JADX INFO: renamed from: X.05HL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.read.instantvop.InstantVoiceCloneView$startRecord$1", f = "InstantVoiceCloneView.kt", l = {}, m = "invokeSuspend")
public final class C05HL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C11VM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05HL(C11VM c11vm, InterfaceC1364105Vn<? super C05HL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c11vm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05HL(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantVoiceCloneView@888c.startRecord$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = C05HM.LIZIZ.LIZ();
        if (iLIZ == 0) {
            InstantCloneRecordFragment instantCloneRecordFragment = this.LL.LLJJI;
            if (instantCloneRecordFragment != null) {
                try {
                    C01TT.LIZLLL(new AwS573S0100000_29(instantCloneRecordFragment, 958));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C11VK c11vk = C11VK.LIZ;
            String str = this.LL.LLJILJIL;
            c11vk.getClass();
            C11VK.LJIIJ(1, str, "");
        } else {
            Activity activityLIZ = C1388190mED.LIZ(this.LL.getContext());
            if (activityLIZ != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activityLIZ);
                c1389880mGw.LJIIIZ(this.LL.getContext().getString(2131858299));
                c1389880mGw.LJIIJ();
                C11VK c11vk2 = C11VK.LIZ;
                String str2 = this.LL.LLJILJIL;
                String strValueOf = String.valueOf(iLIZ);
                c11vk2.getClass();
                C11VK.LJIIJ(0, str2, strValueOf);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InstantVoiceCloneView@888c.startRecord$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
