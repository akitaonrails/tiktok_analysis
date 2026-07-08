package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0MJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$createIMSingleImageCanvasPrepareTaskFlow$1", f = "Forward2StoryEnvironment.kt", l = {}, m = "invokeSuspend")
public final class C566550MJx extends C09AX implements Function2<C0MMG, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0MKE>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CreativeInfo LLILLJJLI;
    public final /* synthetic */ ForwardMedia LLILLL;
    public final /* synthetic */ C0MMK LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C566550MJx(CreativeInfo creativeInfo, ForwardMedia forwardMedia, C0MMK c0mmk, Context context, InterfaceC1364105Vn<? super C566550MJx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creativeInfo;
        this.LLILLL = forwardMedia;
        this.LLILZ = c0mmk;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C566550MJx c566550MJx = new C566550MJx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c566550MJx.LL = obj;
        return c566550MJx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Forward2StoryEnvironment@d506.createIMSingleImageCanvasPrepareTaskFlow$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MMG c0mmg = (C0MMG) this.LL;
        C0MM5 c0mm5 = C0MM5.LIZ;
        CreativeInfo creativeInfo = this.LLILLJJLI;
        ForwardMedia forwardMedia = this.LLILLL;
        C0MMK c0mmk = this.LLILZ;
        Context context = this.LLILZIL;
        c0mm5.getClass();
        b bVarLIZIZ = C0MM5.LIZIZ(c0mmg, creativeInfo, forwardMedia, c0mmk, context);
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.createIMSingleImageCanvasPrepareTaskFlow$1");
        return bVarLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0MMG c0mmg, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends C0MKE>> interfaceC1364105Vn) {
        return ((a) create(c0mmg, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
