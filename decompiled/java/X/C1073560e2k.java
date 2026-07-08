package X;

import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0e2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dialog.FriendsDialogScene$checkAuthFlow$1", f = "FriendsDialogScene.kt", l = {311}, m = "invokeSuspend")
public final class C1073560e2k extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C1073560e2k(InterfaceC1364105Vn<? super C1073560e2k> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1073560e2k c1073560e2k = new C1073560e2k(interfaceC1364105Vn);
        c1073560e2k.LLILLJJLI = obj;
        return c1073560e2k;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1264610j0t interfaceC1264610j0tLIZ;
        C095D c095dLIZIZ;
        C1C7U.LIZ("FriendsDialogScene@9188.checkAuthFlow$1");
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
            C19EG c19egLIZIZ = StateOwner.LL.LIZIZ();
            if (c19egLIZIZ != null && (interfaceC1264610j0tLIZ = C1072350e0n.LIZ(c19egLIZIZ, new AwS595S0100000_16(interfaceC497601wk, 180))) != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("FriendsDialogScene@9188.checkAuthFlow$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsDialogScene@9188.checkAuthFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
