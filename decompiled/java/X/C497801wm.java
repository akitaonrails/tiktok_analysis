package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01wm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$prepareAudioData$2", f = "VideoImageMixedController.kt", l = {}, m = "invokeSuspend")
public final class C497801wm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ List<TikTokMediaModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C497801wm(List<? extends TikTokMediaModel> list, InterfaceC1364105Vn<? super C497801wm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C497801wm c497801wm = new C497801wm(this.LLILLJJLI, interfaceC1364105Vn);
        c497801wm.LL = obj;
        return c497801wm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoImageMixedController@1fe.prepareAudioData$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        for (TikTokMediaModel tikTokMediaModel : this.LLILLJJLI) {
            if (!C23118094a.LJIIIIZZ(interfaceC497601wk.getCoroutineContext())) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("VideoImageMixedController@1fe.prepareAudioData$2");
                return unit;
            }
            if (C23203097h.LIZIZ(tikTokMediaModel.LJFF()) == null) {
                C23203097h.LJFF(tikTokMediaModel.LJFF(), false);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.prepareAudioData$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
