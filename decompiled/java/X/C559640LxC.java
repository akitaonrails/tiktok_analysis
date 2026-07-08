package X;

import android.content.Intent;
import android.os.IBinder;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.cut_ui.IBinderWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.cut_ui_impl.newplayer.CutPlayerActivity$launchCompile$1$2$running$1$onCompileDone$1", f = "CutPlayerActivity.kt", l = {}, m = "invokeSuspend")
public final class C559640LxC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractActivityC559670LxF LL;
    public final /* synthetic */ C259800zU<String> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C559640LxC(AbstractActivityC559670LxF abstractActivityC559670LxF, C259800zU<String> c259800zU, InterfaceC1364105Vn<? super C559640LxC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractActivityC559670LxF;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559640LxC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        IBinder iBinder;
        Intent intentLIZ;
        AbstractBinderC559650LxD abstractBinderC559650LxD;
        C1C7U.LIZ("CutPlayerActivity@2b06.launchCompile$1$2$running$1$onCompileDone$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Intent intentLLLZZIL = this.LL.LLLZZIL(this.LLILLJJLI.element);
        IBinderWrapper iBinderWrapper = (IBinderWrapper) this.LL.getIntent().getParcelableExtra("result_receiver");
        if (iBinderWrapper != null) {
            iBinder = iBinderWrapper.iBinder;
        } else {
            iBinder = null;
        }
        if ((iBinder instanceof AbstractBinderC559650LxD) && (abstractBinderC559650LxD = (AbstractBinderC559650LxD) iBinder) != null) {
            intentLIZ = abstractBinderC559650LxD.LIZ();
        } else {
            intentLIZ = null;
        }
        if (intentLIZ != null) {
            InterfaceC559900Lxc interfaceC559900Lxc = C559870LxZ.LIZ;
            C559870LxZ.LIZJ("cutui.CutPlayerActivity", "compile success then go ahread : " + intentLIZ);
            AbstractActivityC559670LxF abstractActivityC559670LxF = this.LL;
            if (abstractActivityC559670LxF.LLJJLIIIJLLLLLLLZ) {
                abstractActivityC559670LxF.LLJJJ = true;
                AbstractActivityC559670LxF.LLLLLZL(abstractActivityC559670LxF, intentLIZ, 1002);
                INLEPlayer iNLEPlayer = abstractActivityC559670LxF.LLILZLL;
                if (iNLEPlayer != null) {
                    iNLEPlayer.destroy();
                }
                abstractActivityC559670LxF.LLILZLL = null;
            } else {
                abstractActivityC559670LxF.LLJJL = intentLIZ;
            }
        } else {
            InterfaceC559900Lxc interfaceC559900Lxc2 = C559870LxZ.LIZ;
            C559870LxZ.LIZJ("cutui.CutPlayerActivity", "compile success then return back");
            C2204961BRm.P(intentLLLZZIL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3ssaFgmb9Whbo/Ckjzj8ywdoXobgP7UczuHHlToSKdiEhB0A/UJyg==", null), this.LL);
            this.LL.finish();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CutPlayerActivity@2b06.launchCompile$1$2$running$1$onCompileDone$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
