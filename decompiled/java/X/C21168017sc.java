package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17sc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.core.download.ability.HandleOutPutAbility$handleRequest$1", f = "HandleOutPutAbility.kt", l = {35, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 37}, m = "invokeSuspend")
public final class C21168017sc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C21168117sd<CONTEXT> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21168017sc(C21168117sd<CONTEXT> c21168117sd, InterfaceC1364105Vn<? super C21168017sc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c21168117sd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21168017sc(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("HandleOutPutAbility@8433.handleRequest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C21168117sd<CONTEXT> c21168117sd = this.LLILLJJLI;
            C21170817t4 c21170817t4 = c21168117sd.LJFF;
            if (c21170817t4.LIZIZ) {
                this.LL = 1;
                C1DFH c1dfh = C0PEM.LIZ;
                Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C21168517sh(c21168117sd, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("HandleOutPutAbility@8433.handleRequest$1");
                    return objLJFF;
                }
            } else if (c21170817t4.LIZ) {
                this.LL = 2;
                if (!TextUtils.equals(c21168117sd.LIZLLL, (String) c21168117sd.LJIIIIZZ.getValue())) {
                    C2222908nL.LIZ(c21168117sd.LIZLLL, (String) c21168117sd.LJIIIIZZ.getValue());
                }
                C1DFH c1dfh2 = C0PEM.LIZ;
                Object objLJI2 = C23250099c.LJI(this, C2107308Nj.LIZ, new C21168317sf(c21168117sd, null));
                if (objLJI2 != C099R.LJFF()) {
                    objLJI2 = Unit.LIZ;
                }
                if (objLJI2 == objLJFF) {
                    C1C7U.LIZIZ("HandleOutPutAbility@8433.handleRequest$1");
                    return objLJFF;
                }
            } else {
                this.LL = 3;
                C1DFH c1dfh3 = C0PEM.LIZ;
                Object objLJI3 = C23250099c.LJI(this, C2107308Nj.LIZ, new C21168417sg(c21168117sd, null));
                if (objLJI3 != C099R.LJFF()) {
                    objLJI3 = Unit.LIZ;
                }
                if (objLJI3 == objLJFF) {
                    C1C7U.LIZIZ("HandleOutPutAbility@8433.handleRequest$1");
                    return objLJFF;
                }
            }
        }
        C21168117sd<CONTEXT> c21168117sd2 = this.LLILLJJLI;
        c21168117sd2.LJ((String) c21168117sd2.LJIIIIZZ.getValue(), "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HandleOutPutAbility@8433.handleRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
