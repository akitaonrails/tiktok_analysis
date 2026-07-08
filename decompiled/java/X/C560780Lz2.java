package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIGCGenerationParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundGenerateComponent$generateAndNavToLoadingPage$1", f = "AIPlaygroundGenerateComponent.kt", l = {207}, m = "invokeSuspend")
public final class C560780Lz2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1851370yHH LLILLJJLI;
    public final /* synthetic */ AIGCGenerationParam LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560780Lz2(C1851370yHH c1851370yHH, AIGCGenerationParam aIGCGenerationParam, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1851370yHH;
        this.LLILLL = aIGCGenerationParam;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560780Lz2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn, this.LLILZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundGenerateComponent@1d45.generateAndNavToLoadingPage$1");
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
            InterfaceC560620Lym interfaceC560620LymZ4 = this.LLILLJJLI.Z4();
            final AIGCGenerationParam aIGCGenerationParam = this.LLILLL;
            final boolean z = this.LLILZ;
            final C1851370yHH c1851370yHH = this.LLILLJJLI;
            InterfaceC382380Eyy interfaceC382380Eyy = new InterfaceC382380Eyy() { // from class: X.0Lz3
                @Override // X.InterfaceC382380Eyy
                public final void LIZ(String str) {
                }

                @Override // X.InterfaceC382380Eyy
                public final void LIZIZ(C377760ErW c377760ErW) {
                }

                @Override // X.InterfaceC382380Eyy
                public final void onStart() {
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c1851370yHH), null, null, new C560770Lz1(c1851370yHH, aIGCGenerationParam, null, z), 3);
                }
            };
            this.LL = 1;
            if (interfaceC560620LymZ4.rj1(aIGCGenerationParam, z, interfaceC382380Eyy, this) == objLJFF) {
                C1C7U.LIZIZ("AIPlaygroundGenerateComponent@1d45.generateAndNavToLoadingPage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundGenerateComponent@1d45.generateAndNavToLoadingPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
