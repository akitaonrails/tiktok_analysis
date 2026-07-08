package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Cea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.mvvm.CreateTabBottomBtnViewModel$updateTabChangedKey$1", f = "CreateTabBottomBtnViewModel.kt", l = {68}, m = "invokeSuspend")
public final class C318780Cea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ CreateTabBottomBtnViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318780Cea(String str, CreateTabBottomBtnViewModel createTabBottomBtnViewModel, InterfaceC1364105Vn<? super C318780Cea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = createTabBottomBtnViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318780Cea(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreateTabBottomBtnViewModel@8f4d.updateTabChangedKey$1");
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
            boolean zLJFF = Intrinsics.LJFF(this.LLILLJJLI, C1630860sXc.LIZIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTabChangedKey(");
            sbLIZ.append(this.LLILLJJLI);
            sbLIZ.append("), currentIsInCreateTab=");
            sbLIZ.append(((Boolean) this.LLILLL.LLILLJJLI.getValue()).booleanValue());
            sbLIZ.append(", targetIsInCreateTab=");
            sbLIZ.append(zLJFF);
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "CreateTabBottomBtnViewModel", C2188811AlT.LIZIZ(sbLIZ));
            C2252321DDq c2252321DDq = this.LLILLL.LLILLJJLI;
            Boolean boolValueOf = Boolean.valueOf(zLJFF);
            this.LL = 1;
            c2252321DDq.setValue(boolValueOf);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.updateTabChangedKey$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreateTabBottomBtnViewModel@8f4d.updateTabChangedKey$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
