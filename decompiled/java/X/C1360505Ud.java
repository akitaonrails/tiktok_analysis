package X;

import android.view.ViewConfiguration;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05Ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1360505Ud extends C09AY implements Function1<C1395705dD, Unit> {
    public final /* synthetic */ C1362605Uy LL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLILLJJLI;
    public final /* synthetic */ Function1<EnumC1360305Ub, Unit> LLILLL;
    public final /* synthetic */ InterfaceC497601wk LLILZ;
    public final /* synthetic */ InterfaceC1369205Xm LLILZIL;
    public final /* synthetic */ ViewConfiguration LLILZLL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLIZ;
    public final /* synthetic */ SocMediaResource LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C1683130ttv LLJI;
    public final /* synthetic */ C05P0<Boolean> LLJIJIL;
    public final /* synthetic */ C1677480tko<C1683130ttv, C1677390tkf> LLJILJIL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLJILJILJ;
    public final /* synthetic */ Function1<String, Unit> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1360505Ud(C1362605Uy c1362605Uy, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU, Function1<? super EnumC1360305Ub, Unit> function1, InterfaceC497601wk interfaceC497601wk, InterfaceC1369205Xm interfaceC1369205Xm, ViewConfiguration viewConfiguration, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU2, SocMediaResource socMediaResource, boolean z, C1683130ttv c1683130ttv, C05P0<Boolean> c05p0, C1677480tko<C1683130ttv, C1677390tkf> c1677480tko, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU3, Function1<? super String, Unit> function12) {
        super(1);
        this.LL = c1362605Uy;
        this.LLILLJJLI = c259800zU;
        this.LLILLL = function1;
        this.LLILZ = interfaceC497601wk;
        this.LLILZIL = interfaceC1369205Xm;
        this.LLILZLL = viewConfiguration;
        this.LLIZ = c259800zU2;
        this.LLIZLLLIL = socMediaResource;
        this.LLJ = z;
        this.LLJI = c1683130ttv;
        this.LLJIJIL = c05p0;
        this.LLJILJIL = c1677480tko;
        this.LLJILJILJ = c259800zU3;
        this.LLJILLL = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1395705dD c1395705dD) {
        long j = c1395705dD.LIZ;
        C1683130ttv c1683130ttv = this.LL.LIZLLL;
        if (!C1671460tb6.LJ(this.LLIZ)) {
            if (Float.intBitsToFloat((int) (this.LLILLJJLI.element.LIZLLL().LIZ & 4294967295L)) > (c1683130ttv.LIZLLL - c1683130ttv.LIZIZ) * 0.2f) {
                C1671460tb6.LJI(this.LL, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLILZ, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLIZ, this.LLILLJJLI, "swipe_down");
            } else {
                this.LLILLL.invoke(EnumC1360305Ub.IDLE);
                C1671460tb6.LIZ.LIZ("Not dismissing");
                C1671460tb6.LIZLLL(this.LLILZ, this.LLIZ, this.LLILLJJLI, 1.0f, 0L);
                C23250099c.LIZLLL(this.LLILZ, null, null, new C05SO(this.LLJILJILJ, null), 3);
            }
        } else {
            C1677900tlU c1677900tlU = new C1677900tlU(new C2255691DQp(this.LLILZIL));
            C238400w2 c238400w2 = new C238400w2();
            c238400w2.element = 0L;
            if (((float) Math.sqrt((C1395705dD.LIZIZ(j) * C1395705dD.LIZIZ(j)) + (C1395705dD.LIZJ(j) * C1395705dD.LIZJ(j)))) > this.LLILZLL.getScaledMinimumFlingVelocity() && ((float) Math.sqrt((C1395705dD.LIZIZ(j) * C1395705dD.LIZIZ(j)) + (C1395705dD.LIZJ(j) * C1395705dD.LIZJ(j)))) < this.LLILZLL.getScaledMaximumFlingVelocity()) {
                InterfaceC497601wk interfaceC497601wk = this.LLILZ;
                C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1370105Xv(j, c1677900tlU, c238400w2, interfaceC497601wk, this.LL, this.LLIZLLLIL, this.LLJ, this.LLILLJJLI, this.LLJILJILJ, this.LLIZ, null), 3);
            }
        }
        return Unit.LIZ;
    }
}
