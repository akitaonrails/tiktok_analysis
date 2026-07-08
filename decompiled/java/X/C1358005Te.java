package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.ui.component.layout.CanUseMicSlotSelectPopupKt$CanUseMicSlotSelectPopup$1$1", f = "CanUseMicSlotSelectPopup.kt", l = {45}, m = "invokeSuspend")
public final class C1358005Te extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<Integer> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1690080u58 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358005Te(List<Integer> list, int i, C1690080u58 c1690080u58, InterfaceC1364105Vn<? super C1358005Te> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = c1690080u58;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358005Te(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CanUseMicSlotSelectPopupKt@5198.CanUseMicSlotSelectPopup$1$1");
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
            int iIndexOf = this.LLILLJJLI.indexOf(C2286608xc.LJ(this.LLILLL));
            if (iIndexOf >= 0) {
                C1690080u58 c1690080u58 = this.LLILZ;
                this.LL = 1;
                C1687100u0K c1687100u0K = C1690080u58.LJIL;
                if (c1690080u58.LJIIJ(iIndexOf, 0, this) == objLJFF) {
                    C1C7U.LIZIZ("CanUseMicSlotSelectPopupKt@5198.CanUseMicSlotSelectPopup$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CanUseMicSlotSelectPopupKt@5198.CanUseMicSlotSelectPopup$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
