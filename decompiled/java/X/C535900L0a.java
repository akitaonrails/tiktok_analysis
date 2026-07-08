package X;

import com.ss.android.ugc.aweme.creative.model.album.LivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.album.LivePhotoTransitionEffectParam;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.livephoto.mediaswitch.LivePhotoHandler$applyMode$1$2", f = "LivePhotoHandler.kt", l = {54}, m = "invokeSuspend")
public final class C535900L0a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LivePhotoModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535900L0a(LivePhotoModel livePhotoModel, InterfaceC1364105Vn<? super C535900L0a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = livePhotoModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C535900L0a(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LivePhotoModel livePhotoModel;
        String effect_id;
        C1C7U.LIZ("LivePhotoHandler@5cb5.applyMode$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String unzipPath = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0L0Z c0l0z = new C0L0Z(null);
            this.LL = 1;
            obj = C099A.LIZJ(Mp4ScreenVideoLoadTimeout.CONTROL, c0l0z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LivePhotoHandler@5cb5.applyMode$1$2");
                return objLJFF;
            }
        }
        C189200o6 c189200o6 = (C189200o6) obj;
        if (c189200o6 != null && C189200o6.m8isSuccessimpl(c189200o6.m10unboximpl()) && (livePhotoModel = this.LLILLJJLI) != null) {
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
            }
            livePhotoModel.livePhotoTransitionEffectParam = new LivePhotoTransitionEffectParam(effect_id, unzipPath);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LivePhotoHandler@5cb5.applyMode$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
