package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import java.io.FileInputStream;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS588S0100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OIh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel$initHybridResource$3", f = "BulletinProfileViewModel.kt", l = {923}, m = "invokeSuspend")
public final class C617090OIh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BulletinProfileViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617090OIh(BulletinProfileViewModel bulletinProfileViewModel, long j, InterfaceC1364105Vn<? super C617090OIh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bulletinProfileViewModel;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C617090OIh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinProfileViewModel@3b06.initHybridResource$3");
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
            C0OIU c0oiu = (C0OIU) this.LLILLJJLI.DQ2().getOperator();
            long j = this.LLILLL;
            this.LL = 1;
            obj = c0oiu.i(j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BulletinProfileViewModel@3b06.initHybridResource$3");
                return objLJFF;
            }
        }
        AbstractC1623806Xk abstractC1623806Xk = (AbstractC1623806Xk) obj;
        if (abstractC1623806Xk instanceof C491001vg) {
            this.LLILLJJLI.u51().LJIIIZ("inspiration_card", EnumC620170OUd.FAIL, -1);
        }
        this.LLILLJJLI.setState(new AwS588S0100000_9(abstractC1623806Xk, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 215));
        if (!C1982307pd.LIZIZ()) {
            this.LLILLJJLI.setState(new AwS588S0100000_9(abstractC1623806Xk, (AbstractC1623806Xk<? extends Pair<? extends FileInputStream, String>>) 216));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinProfileViewModel@3b06.initHybridResource$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
