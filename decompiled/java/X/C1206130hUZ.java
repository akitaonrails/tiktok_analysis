package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publicgroup.data.model.SetGroupStatusRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hUZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publicgroup.vm.GroupListViewModel$updateGroupVisibility$1", f = "GroupListViewModel.kt", l = {476}, m = "invokeSuspend")
public final class C1206130hUZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1229760i6g LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1206130hUZ(C1229760i6g c1229760i6g, boolean z, InterfaceC1364105Vn<? super C1206130hUZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1229760i6g;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1206130hUZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC1206110hUX enumC1206110hUX;
        C1C7U.LIZ("GroupListViewModel@5b8e.updateGroupVisibility$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C1230140i7I c1230140i7I = C1230140i7I.LIZ;
                Long lLJFF = C2286608xc.LJFF(this.LLILLJJLI.LL);
                if (this.LLILLL) {
                    enumC1206110hUX = EnumC1206110hUX.SHOW;
                } else {
                    enumC1206110hUX = EnumC1206110hUX.HIDE;
                }
                SetGroupStatusRequest setGroupStatusRequest = new SetGroupStatusRequest(lLJFF, C2286608xc.LJ(enumC1206110hUX.getValue()));
                this.LL = 1;
                if (c1230140i7I.LJ(setGroupStatusRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("GroupListViewModel@5b8e.updateGroupVisibility$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (this.LLILLL) {
                str = "show";
            } else {
                str = "hide";
            }
            sbLIZ.append(str);
            sbLIZ.append(" group failed:");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupListViewModel@5b8e.updateGroupVisibility$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
