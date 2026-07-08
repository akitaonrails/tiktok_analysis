package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.v2.StoryEditToolBarV2RailKt$StoryEditToolBarV2Rail$2$1", f = "StoryEditToolBarV2Rail.kt", l = {66, 79}, m = "invokeSuspend")
public final class C1355405Se extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1355405Se(boolean z, C1677480tko<Float, C1677280tkU> c1677480tko, boolean z2, InterfaceC1364105Vn<? super C1355405Se> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1677480tko;
        this.LLILZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1355405Se(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        C1C7U.LIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1 || i == 2) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            if (this.LLILLL.LIZLLL().floatValue() != f) {
                if (this.LLILZ) {
                    C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL;
                    Float fLIZLLL = C2286608xc.LIZLLL(f);
                    C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.78f, 1500.0f, null, 4);
                    if (this.LLILLJJLI) {
                        f2 = 0.45f;
                    } else {
                        f2 = -0.45f;
                    }
                    Float fLIZLLL2 = C2286608xc.LIZLLL(f2);
                    this.LL = 1;
                    if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1676890tjrLIZJ, fLIZLLL2, null, this, 8) == objLJFF) {
                        C1C7U.LIZIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$2$1");
                        return objLJFF;
                    }
                } else {
                    C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLL;
                    Float fLIZLLL3 = C2286608xc.LIZLLL(f);
                    this.LL = 2;
                    if (c1677480tko2.LJFF(fLIZLLL3, this) == objLJFF) {
                        C1C7U.LIZIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$2$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryEditToolBarV2RailKt@110d.StoryEditToolBarV2Rail$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
