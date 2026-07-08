package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05XP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.ui.NoFTCShootPageActivityCloseKt$deleteUnusedFilesOnExit$1", f = "NoFTCShootPageActivityClose.kt", l = {}, m = "invokeSuspend")
public final class C05XP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CreativeInfo LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05XP(CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C05XP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05XP(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoFTCShootPageActivityCloseKt@8efb.deleteUnusedFilesOnExit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C570490MZb.LIZIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NoFTCShootPageActivityCloseKt@8efb.deleteUnusedFilesOnExit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
