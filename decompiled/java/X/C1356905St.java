package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05St, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullScreenMediaLongPressPopUpKt$FullScreenMediaLongPressPopUp$1$1", f = "FullScreenMediaLongPressPopUp.kt", l = {58, 63}, m = "invokeSuspend")
public final class C1356905St extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356905St(C1677480tko<Float, C1677280tkU> c1677480tko, Function0<Unit> function0, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C1356905St> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = function0;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356905St(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullScreenMediaLongPressPopUpKt@1eec.FullScreenMediaLongPressPopUp$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILLL.invoke();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILZ.getValue().booleanValue()) {
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
                Float fLIZLLL = C2286608xc.LIZLLL(1.0f);
                C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, 0, C05Y0.LIZ, 2);
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("FullScreenMediaLongPressPopUpKt@1eec.FullScreenMediaLongPressPopUp$1$1");
                    return objLJFF;
                }
            } else {
                C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLJJLI;
                Float fLIZLLL2 = C2286608xc.LIZLLL(0.0f);
                C1677050tk7 c1677050tk7LIZLLL2 = C1671550tbF.LIZLLL(250, 0, C05Y0.LIZ, 2);
                this.LL = 2;
                if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, c1677050tk7LIZLLL2, null, null, this, 12) == objLJFF) {
                    C1C7U.LIZIZ("FullScreenMediaLongPressPopUpKt@1eec.FullScreenMediaLongPressPopUp$1$1");
                    return objLJFF;
                }
                this.LLILLL.invoke();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullScreenMediaLongPressPopUpKt@1eec.FullScreenMediaLongPressPopUp$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
