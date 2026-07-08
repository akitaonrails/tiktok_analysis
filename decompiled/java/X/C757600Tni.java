package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Tni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardWidgetV2$newAuthDialogCenter$1", f = "UserCardWidgetV2.kt", l = {880}, m = "invokeSuspend")
public final class C757600Tni extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ UserCardWidgetV2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757600Tni(UserCardWidgetV2 userCardWidgetV2, InterfaceC1364105Vn<? super C757600Tni> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = userCardWidgetV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757600Tni c757600Tni = new C757600Tni(this.LLILLL, interfaceC1364105Vn);
        c757600Tni.LLILLJJLI = obj;
        return c757600Tni;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1264610j0t interfaceC1264610j0tLIZIZ;
        C095D c095dLIZIZ;
        C1C7U.LIZ("UserCardWidgetV2@a30b.newAuthDialogCenter$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            Fragment fragmentLJI = C724240Sb0.LJI(this.LLILLL);
            if (fragmentLJI != null && (interfaceC1264610j0tLIZIZ = C1072350e0n.LIZIZ(fragmentLJI, new AwS614S0100000_35(interfaceC497601wk, 185))) != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("UserCardWidgetV2@a30b.newAuthDialogCenter$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardWidgetV2@a30b.newAuthDialogCenter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
