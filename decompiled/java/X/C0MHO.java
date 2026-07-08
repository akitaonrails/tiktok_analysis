package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.ForwardCelebrationEnvironment$goEditPage$1$1", f = "ForwardCelebrationEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MHO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C0MHP LLILLJJLI;
    public final /* synthetic */ VideoPublishEditModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHO(Context context, C0MHP c0mhp, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0MHO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = c0mhp;
        this.LLILLL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MHO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Unit unit;
        MusicObject musicObjectUE1;
        C1C7U.LIZ("ForwardCelebrationEnvironment@c138.goEditPage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().LJJJJJ().preloadEffectModel();
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).avatarService().downloadTextFont(this.LL);
        C0MHP c0mhp = this.LLILLJJLI;
        if (c0mhp != null && (musicObjectUE1 = c0mhp.uE1()) != null) {
            VideoPublishEditModel videoPublishEditModel = this.LLILLL;
            C0MHP c0mhp2 = this.LLILLJJLI;
            videoPublishEditModel.creativeModel.musicBuzModel.music = musicObjectUE1;
            if (!C294040Bfm.LIZ()) {
                c0mhp2.Tx1(videoPublishEditModel.getNleModel());
            }
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        C1C7U.LIZIZ("ForwardCelebrationEnvironment@c138.goEditPage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
