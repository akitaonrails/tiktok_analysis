package X;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IQG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet$buildAddMuteRuleDialog$3$1", f = "LiveMuteRulesEditFragmentSheet.kt", l = {325}, m = "invokeSuspend")
public final class C0IQG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveMuteRulesEditFragmentSheet LLILLJJLI;
    public final /* synthetic */ DialogInterface LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IQG(LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet, DialogInterface dialogInterface, InterfaceC1364105Vn<? super C0IQG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveMuteRulesEditFragmentSheet;
        this.LLILLL = dialogInterface;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IQG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMuteRulesEditFragmentSheet@3f89.buildAddMuteRuleDialog$3$1");
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
            LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet = this.LLILLJJLI;
            this.LL = 1;
            obj = liveMuteRulesEditFragmentSheet.uS(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.buildAddMuteRuleDialog$3$1");
                return objLJFF;
            }
        }
        this.LLILLL.dismiss();
        if (obj != null) {
            this.LLILLJJLI.close(1);
            C766270U4b.LIZLLL(2131837807);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.buildAddMuteRuleDialog$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
