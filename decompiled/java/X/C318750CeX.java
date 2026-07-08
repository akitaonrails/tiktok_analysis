package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel$updateRvAmeEntryShow$1", f = "CreateTabBottomBtnViewModel.kt", l = {58}, m = "invokeSuspend")
public final class C318750CeX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ CreateTabBottomBtnViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318750CeX(boolean z, CreateTabBottomBtnViewModel createTabBottomBtnViewModel, InterfaceC1364105Vn<? super C318750CeX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = createTabBottomBtnViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318750CeX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC318870Cej enumC318870Cej;
        C1C7U.LIZ("CreateTabBottomBtnViewModel@8f4d.updateRvAmeEntryShow$1");
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
            if (this.LLILLJJLI) {
                enumC318870Cej = EnumC318870Cej.LLILLJJLI;
            } else {
                enumC318870Cej = EnumC318870Cej.LLILLL;
            }
            C2252321DDq c2252321DDq = this.LLILLL.LL;
            this.LL = 1;
            c2252321DDq.setValue(enumC318870Cej);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.updateRvAmeEntryShow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.updateRvAmeEntryShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
