package X;

import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3DialogAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS614S0100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Tng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friendstab.ui.feed.panel.component.FriendsV3DialogAssem$showAutoDialog$1", f = "FriendsV3DialogAssem.kt", l = {140}, m = "invokeSuspend")
public final class C757580Tng extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FriendsV3DialogAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757580Tng(FriendsV3DialogAssem friendsV3DialogAssem, InterfaceC1364105Vn<? super C757580Tng> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = friendsV3DialogAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757580Tng c757580Tng = new C757580Tng(this.LLILLL, interfaceC1364105Vn);
        c757580Tng.LLILLJJLI = obj;
        return c757580Tng;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1264610j0t interfaceC1264610j0tLIZ;
        C095D c095dLIZIZ;
        C1C7U.LIZ("FriendsV3DialogAssem@dec4.showAutoDialog$1");
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
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLL);
            if (c19egLIZ != null && (interfaceC1264610j0tLIZ = C1072350e0n.LIZ(c19egLIZ, new AwS614S0100000_35(interfaceC497601wk, 87))) != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("FriendsV3DialogAssem@dec4.showAutoDialog$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsV3DialogAssem@dec4.showAutoDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
