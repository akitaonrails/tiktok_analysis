package X;

import android.app.Application;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FCF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.subtitle.SilentAutoCaptionComponent$startCaptionRecognition$3", f = "SilentAutoCaptionComponent.kt", l = {397}, m = "invokeSuspend")
public final class C0FCF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C391160FVi LL;
    public int LLILLJJLI;
    public final /* synthetic */ C391160FVi LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FCF(C391160FVi c391160FVi, InterfaceC1364105Vn<? super C0FCF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c391160FVi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FCF(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C391160FVi c391160FVi;
        HashMap<String, Effect> map;
        C1C7U.LIZ("SilentAutoCaptionComponent@7851.startCaptionRecognition$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c391160FVi = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C391160FVi c391160FVi2 = this.LLILLL;
            if (c391160FVi2.LLJI == null) {
                c391160FVi2.LLJI = new C0FCA(this.LLILLL.v3(), "", this.LLILLL.B3());
            }
            c391160FVi = this.LLILLL;
            C0FCA c0fca = c391160FVi.LLJI;
            if (c0fca != null) {
                C371890Ei3 c371890Ei3 = C371890Ei3.LIZ;
                C2216191BoX.LIZ.getClass();
                Application applicationLIZ = C2216191BoX.LIZ();
                c371890Ei3.getClass();
                LanguageDetail languageDetailLIZ = C371890Ei3.LIZ(applicationLIZ);
                this.LL = c391160FVi;
                this.LLILLJJLI = 1;
                obj = c0fca.LIZIZ(languageDetailLIZ, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("SilentAutoCaptionComponent@7851.startCaptionRecognition$3");
                    return objLJFF;
                }
            } else {
                map = null;
                c391160FVi.LLJJ = map;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SilentAutoCaptionComponent@7851.startCaptionRecognition$3");
                return unit;
            }
        }
        map = (HashMap) obj;
        c391160FVi.LLJJ = map;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SilentAutoCaptionComponent@7851.startCaptionRecognition$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
