package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoTransitionEffectParam;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoMvChosenResultImpl$onChosenResultAfterShowDialog$3", f = "PhotoMvChosenResultImpl.kt", l = {139, 150}, m = "invokeSuspend")
public final class C535920L0c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public LivePhotoModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ ShortVideoContext LLILLL;
    public final /* synthetic */ C535980L0i LLILZ;
    public final /* synthetic */ ArrayList<MediaModel> LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ Intent LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535920L0c(int i, Intent intent, ShortVideoContext shortVideoContext, C535980L0i c535980L0i, ArrayList arrayList, InterfaceC1364105Vn interfaceC1364105Vn, C013C c013c) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = shortVideoContext;
        this.LLILZ = c535980L0i;
        this.LLILZIL = arrayList;
        this.LLILZLL = c013c;
        this.LLIZ = i;
        this.LLIZLLLIL = intent;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535920L0c(this.LLIZ, this.LLIZLLLIL, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LivePhotoModel livePhotoModel;
        String effect_id;
        String unzipPath;
        Object objLIZJ = obj;
        C1C7U.LIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZJ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            livePhotoModel = this.LL;
            C155000ia.LIZIZ(objLIZJ);
        } else {
            C155000ia.LIZIZ(objLIZJ);
            livePhotoModel = this.LLILLL.creativeModel.livePhotoModel;
            C535910L0b c535910L0b = new C535910L0b(null);
            this.LL = livePhotoModel;
            this.LLILLJJLI = 1;
            objLIZJ = C099A.LIZJ(1000L, c535910L0b, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3");
                return objLJFF;
            }
        }
        C189200o6 c189200o6 = (C189200o6) objLIZJ;
        if (c189200o6 != null && C189200o6.m8isSuccessimpl(c189200o6.m10unboximpl()) && livePhotoModel != null) {
            Object objM10unboximpl = c189200o6.m10unboximpl();
            if (C189200o6.m7isFailureimpl(objM10unboximpl)) {
                objM10unboximpl = null;
            }
            Effect effect = (Effect) objM10unboximpl;
            if (effect != null) {
                effect_id = effect.getEffect_id();
            } else {
                effect_id = null;
            }
            Object objM10unboximpl2 = c189200o6.m10unboximpl();
            if (C189200o6.m7isFailureimpl(objM10unboximpl2)) {
                objM10unboximpl2 = null;
            }
            Effect effect2 = (Effect) objM10unboximpl2;
            if (effect2 != null) {
                unzipPath = effect2.getUnzipPath();
            } else {
                unzipPath = null;
            }
            livePhotoModel.livePhotoTransitionEffectParam = new LivePhotoTransitionEffectParam(effect_id, unzipPath);
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C535930L0d c535930L0d = new C535930L0d(this.LLIZ, this.LLIZLLLIL, this.LLILLL, this.LLILZ, this.LLILZIL, null, this.LLILZLL);
        this.LL = null;
        this.LLILLJJLI = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c535930L0d) == objLJFF) {
            C1C7U.LIZIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoMvChosenResultImpl@4c52.onChosenResultAfterShowDialog$3");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
