package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.image.switchmode.payload.SwitchModePayload;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS374S0200000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MmS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.switchmode.ImageSwitchModeScene$navToAnotherPage$1$1", f = "ImageSwitchModeScene.kt", l = {}, m = "invokeSuspend")
public final class C578460MmS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C578370MmJ LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ SwitchModePayload LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578460MmS(C578370MmJ c578370MmJ, Bundle bundle, SwitchModePayload switchModePayload, InterfaceC1364105Vn<? super C578460MmS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c578370MmJ;
        this.LLILLJJLI = bundle;
        this.LLILLL = switchModePayload;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578460MmS(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C578370MmJ c578370MmJ = this.LL;
        c578370MmJ.LLLII(this.LLILLJJLI, new AwS374S0200000_8(c578370MmJ, this.LLILLL, 35));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageSwitchModeScene@3ccb.navToAnotherPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
