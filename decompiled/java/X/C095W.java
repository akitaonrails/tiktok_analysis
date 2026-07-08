package X;

import com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095W, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieNLEPipeline$fetchModelEffectsAsFlow$1$1", f = "SmartMovieNLEPipeline.kt", l = {}, m = "invokeSuspend")
public final class C095W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C095X LL;
    public final /* synthetic */ NLEModel LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C094D<C096H> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C095W(C095X c095x, NLEModel nLEModel, boolean z, C094D<? super C096H> c094d, InterfaceC1364105Vn<? super C095W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c095x;
        this.LLILLJJLI = nLEModel;
        this.LLILLL = z;
        this.LLILZ = c094d;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C095W(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieNLEPipeline@d86f.fetchModelEffectsAsFlow$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C095X c095x = this.LL;
        SmartMovieAdapter smartMovieAdapter = c095x.LIZIZ;
        NLEModel nLEModel = this.LLILLJJLI;
        int i = c095x.LIZ.LIZIZ.LJIILIIL;
        boolean z = this.LLILLL;
        final C094D<C096H> c094d = this.LLILZ;
        smartMovieAdapter.fetchModelEffects(nLEModel, i, z, false, new SmartMovieAdapter.SmartMovieDownloadCallback() { // from class: X.095Z
            @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
            public final void onNeedFetch(List<String> list) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchModelEffectsAsFlow onNeedFetch ");
                sbLIZ.append(list);
                C201955140j.LIZLLL(c1398350mUb, "SmartMovieNLEPipeline", C2188811AlT.LIZIZ(sbLIZ));
                c094d.LJIIIIZZ(new C23146095c(list));
            }

            @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
            public final void onProgress(float f) {
                c094d.LJIIIIZZ(new C23145095b(f));
            }

            @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
            public final void onSuccess(NLEModel nLEModel2) {
                C201955140j.LIZLLL(C1398350mUb.LIZIZ, "SmartMovieNLEPipeline", "fetchModelEffectsAsFlow onSuccess");
                c094d.LJIIIIZZ(new C23144095a(nLEModel2));
                c094d.LJIIJJI(null);
            }

            @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
            public final void onFailure(String str, SmartMovieAdapter.SmartMovieCKErrorCode smartMovieCKErrorCode, String str2, Map<String, String> map) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchModelEffectsAsFlow onFailure ");
                sbLIZ.append(str);
                sbLIZ.append(' ');
                sbLIZ.append(smartMovieCKErrorCode);
                sbLIZ.append(' ');
                sbLIZ.append(str2);
                sbLIZ.append(' ');
                sbLIZ.append(map);
                C201955140j.LIZLLL(c1398350mUb, "SmartMovieNLEPipeline", C2188811AlT.LIZIZ(sbLIZ));
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("effect_error_code", String.valueOf(smartMovieCKErrorCode.getCode()));
                c094d.LJIIIIZZ(new C096G(6, str, str2, linkedHashMap));
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieNLEPipeline@d86f.fetchModelEffectsAsFlow$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
