package X;

import java.security.SecureRandom;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.thought.ui.ThoughtLikeUiKt$UnlikedCircleBackground$1$1", f = "ThoughtLikeUi.kt", l = {173, 177, 179}, m = "invokeSuspend")
public final class C1356105Sl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356105Sl(C1677480tko c1677480tko, C05P0 c05p0, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = z;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1356105Sl(this.LLILLJJLI, this.LLILZ, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        C05P0<Boolean> c05p0 = this.LLILZ;
        SecureRandom secureRandom = C1683170ttz.LIZ;
        float f = 0.0f;
        if (!c05p0.getValue().booleanValue()) {
            this.LLILZ.setValue(Boolean.TRUE);
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            if (!this.LLILLL) {
                f = 1.0f;
            }
            Float fLIZLLL = C2286608xc.LIZLLL(f);
            this.LL = 1;
            if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
            return unit22;
        }
        if (this.LLILLL) {
            C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLJJLI;
            Float fLIZLLL2 = C2286608xc.LIZLLL(0.0f);
            C1677050tk7 c1677050tk7LIZLLL = C1671550tbF.LIZLLL(100, 0, C05Y0.LIZLLL, 2);
            this.LL = 2;
            if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, c1677050tk7LIZLLL, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
                return objLJFF;
            }
        } else {
            C1677480tko<Float, C1677280tkU> c1677480tko3 = this.LLILLJJLI;
            Float fLIZLLL3 = C2286608xc.LIZLLL(1.0f);
            C1677050tk7 c1677050tk7LIZLLL2 = C1671550tbF.LIZLLL(150, 0, C05Y0.LIZLLL, 2);
            this.LL = 3;
            if (C1677480tko.LIZJ(c1677480tko3, fLIZLLL3, c1677050tk7LIZLLL2, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
                return objLJFF;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("ThoughtLikeUiKt@717c.UnlikedCircleBackground$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
