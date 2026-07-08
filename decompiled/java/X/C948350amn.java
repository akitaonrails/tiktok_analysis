package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS559S0100000_15;
import njp.a;

/* JADX INFO: renamed from: X.0amn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.previewlive.ui.module.LayoutSettingModuleViewKt$LayoutSettingModuleView$1$7$1", f = "LayoutSettingModuleView.kt", l = {143}, m = "invokeSuspend")
public final class C948350amn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C05P0<Boolean> LLILLJJLI;
    public final /* synthetic */ C948300ami LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C05P0<Boolean> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C948350amn(C05P0<Boolean> c05p0, C948300ami c948300ami, String str, C05P0<Boolean> c05p02, InterfaceC1364105Vn<? super C948350amn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c05p0;
        this.LLILLL = c948300ami;
        this.LLILZ = str;
        this.LLILZIL = c05p02;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C948350amn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LayoutSettingModuleViewKt@6bab.LayoutSettingModuleView$1$7$1");
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
            C1629806Zs c1629806Zs = new C1629806Zs(C20028913Yh.LJIIIZ(new AwS559S0100000_15(this.LLILLJJLI, (C05P0<Boolean>) 1035)));
            final C948300ami c948300ami = this.LLILLL;
            final String str = this.LLILZ;
            final C05P0<Boolean> c05p0 = this.LLILZIL;
            InterfaceC346701Wf<? super Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0amh
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    if (((Boolean) obj2).booleanValue()) {
                        int i2 = c948300ami.LIZLLL;
                        C942270acz.LIZIZ(i2, i2, "drop_down", "", str);
                        c05p0.setValue(Boolean.FALSE);
                    } else if (!c05p0.getValue().booleanValue()) {
                        int i3 = c948300ami.LIZLLL;
                        C942270acz.LIZIZ(i3, i3, "click", "cancel", str);
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c1629806Zs.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("LayoutSettingModuleViewKt@6bab.LayoutSettingModuleView$1$7$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LayoutSettingModuleViewKt@6bab.LayoutSettingModuleView$1$7$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
