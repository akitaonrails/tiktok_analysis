package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.CameraEffectViewModel$setCurEffectId$1", f = "CameraEffectViewModel.kt", l = {60}, m = "invokeSuspend")
public final class C2199408jY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CameraEffectViewModel LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ Long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2199408jY(CameraEffectViewModel cameraEffectViewModel, List<String> list, Long l, InterfaceC1364105Vn<? super C2199408jY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cameraEffectViewModel;
        this.LLILLL = list;
        this.LLILZ = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2199408jY(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CameraEffectViewModel@2d3b.setCurEffectId$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            C2199508jZ c2199508jZ = new C2199508jZ(this.LLILLL);
            this.LL = 1;
            if (c2252331DDr.emit(c2199508jZ, this) == objLJFF) {
                C1C7U.LIZIZ("CameraEffectViewModel@2d3b.setCurEffectId$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CameraEffectViewModel@2d3b.setCurEffectId$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
