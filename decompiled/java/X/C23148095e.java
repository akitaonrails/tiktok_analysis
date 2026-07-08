package X;

import com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS189S0000000_3;
import njp.a;

/* JADX INFO: renamed from: X.095e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.api.SmartMovieExt$restore$1", f = "SmartMovieExt.kt", l = {116}, m = "invokeSuspend")
public final class C23148095e extends C09AX implements Function2<C094D<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0960 LLILLL;
    public final /* synthetic */ NLEModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23148095e(AnonymousClass0960 anonymousClass0960, NLEModel nLEModel, InterfaceC1364105Vn<? super C23148095e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0960;
        this.LLILZ = nLEModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C23148095e c23148095e = new C23148095e(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c23148095e.LLILLJJLI = obj;
        return c23148095e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartMovieExt@c965.restore$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            C201955140j.LIZLLL(C1398350mUb.LIZIZ, "SmartMovieExt", "restore");
            AnonymousClass0960 anonymousClass0960 = this.LLILLL;
            anonymousClass0960.LIZIZ.fetchModelEffects(this.LLILZ, anonymousClass0960.LIZ.LIZIZ.LJIILIIL, false, false, new SmartMovieAdapter.SmartMovieDownloadCallback() { // from class: X.095d
                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
                public final void onNeedFetch(List<String> list) {
                    c094d.LJIIIIZZ(new C23146095c(list));
                }

                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
                public final void onProgress(float f) {
                    c094d.LJIIIIZZ(new C23145095b(f));
                }

                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
                public final void onSuccess(NLEModel nLEModel) {
                    C201955140j.LIZLLL(C1398350mUb.LIZIZ, "SmartMovieExt", "restore onSuccess");
                    c094d.LJIIIIZZ(new C23149095f(nLEModel, C2097608Jq.LJ()));
                    c094d.LJIIJJI(null);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieDownloadCallback
                public final void onFailure(String str, SmartMovieAdapter.SmartMovieCKErrorCode smartMovieCKErrorCode, String str2, Map<String, String> map) {
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("restore onFailure urs=");
                    sbLIZ.append(str);
                    sbLIZ.append(" code=");
                    sbLIZ.append(smartMovieCKErrorCode);
                    sbLIZ.append(" msg=");
                    sbLIZ.append(str2);
                    C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieExt", C2188811AlT.LIZIZ(sbLIZ));
                    c094d.LJIIIIZZ(new C096G(SmartMovieAdapter.SmartMovieCKErrorCode.FETCH_NLEMODEL_FAILURE.getCode(), str, str2, C2097608Jq.LJ()));
                }
            });
            this.LL = 1;
            if (C23128094k.LIZ(c094d, AFwS189S0000000_3.get$arr$(1330), this) == objLJFF) {
                C1C7U.LIZIZ("SmartMovieExt@c965.restore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieExt@c965.restore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C096H> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
