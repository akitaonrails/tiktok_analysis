package X;

import Y.AgS289S0100000_8;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.social.creation.api.IMediaDownloadService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$fetchPhotomodeImage$1", f = "Forward2StoryEnvironment.kt", l = {786}, m = "invokeSuspend")
public final class C566760MKs extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMG>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ForwardMedia LLILLL;
    public final /* synthetic */ CreativeInfo LLILZ;
    public final /* synthetic */ C0MML LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566760MKs(Context context, CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MML c0mml, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = forwardMedia;
        this.LLILZ = creativeInfo;
        this.LLILZIL = c0mml;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        ForwardMedia forwardMedia = this.LLILLL;
        C566760MKs c566760MKs = new C566760MKs(this.LLILZLL, this.LLILZ, forwardMedia, this.LLILZIL, interfaceC1364105Vn);
        c566760MKs.LLILLJJLI = obj;
        return c566760MKs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZJ;
        C1C7U.LIZ("Forward2StoryEnvironment@d506.fetchPhotomodeImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
                C0MM5.LIZIZ.LIZJ();
                IMediaDownloadService iMediaDownloadService = (IMediaDownloadService) PluggableExtentionKt.pluggableSpi$default(IMediaDownloadService.class, false, false, false, 14, null);
                if (iMediaDownloadService != null) {
                    ForwardMedia forwardMedia = this.LLILLL;
                    c095dLIZJ = iMediaDownloadService.LIZJ(this.LLILZLL, this.LLILZ, forwardMedia, this.LLILZIL);
                } else {
                    c095dLIZJ = null;
                }
                if (c095dLIZJ != null) {
                    AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(interfaceC346701Wf, 3);
                    this.LL = 1;
                    if (c095dLIZJ.collect(agS289S0100000_8, this) == objLJFF) {
                        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.fetchPhotomodeImage$1");
                        return objLJFF;
                    }
                }
            }
            C0MM5.LIZIZ.LJFF();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("Forward2StoryEnvironment@d506.fetchPhotomodeImage$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C0MM5.LIZIZ.LJFF();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMG> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
