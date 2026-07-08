package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0MK0, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createVideoCanvasPrepareTaskFlow$2", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C0MK0 extends C09AX implements InterfaceC1631620sYq<C0MMG, C0MM6, InterfaceC1364105Vn<? super C0MKE>, Object> {
    public /* synthetic */ C0MMG LL;
    public /* synthetic */ C0MM6 LLILLJJLI;
    public final /* synthetic */ ForwardMedia LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C0MML LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MK0(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = forwardMedia;
        this.LLILZ = context;
        this.LLILZIL = c0mml;
        this.LLILZLL = creativeInfo;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.createVideoCanvasPrepareTaskFlow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MMG c0mmg = this.LL;
        C0MM6 c0mm6 = this.LLILLJJLI;
        C0MM5 c0mm5 = C0MM5.LIZ;
        ForwardMedia forwardMedia = this.LLILLL;
        C0MM9 c0mm9 = forwardMedia.author;
        c0mm5.getClass();
        C0MKE c0mke = new C0MKE(this.LLILZLL, this.LLILLL, this.LLILZIL, c0mmg, C0MM5.LIZ(forwardMedia, C0MM5.LIZLLL(c0mm9), c0mmg, this.LLILZ, c0mm6, this.LLILZIL), C0MUO.LIZ(this.LLILZ), this.LLILLL.originVideoAIGCLabelType, 0, 1, 128);
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.createVideoCanvasPrepareTaskFlow$2");
        return c0mke;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C0MMG c0mmg, C0MM6 c0mm6, InterfaceC1364105Vn<? super C0MKE> interfaceC1364105Vn) {
        ForwardMedia forwardMedia = this.LLILLL;
        Context context = this.LLILZ;
        C0MML c0mml = this.LLILZIL;
        C0MK0 c0mk0 = new C0MK0(context, this.LLILZLL, forwardMedia, c0mml, interfaceC1364105Vn);
        c0mk0.LL = c0mmg;
        c0mk0.LLILLJJLI = c0mm6;
        return c0mk0.invokeSuspend(Unit.LIZ);
    }
}
