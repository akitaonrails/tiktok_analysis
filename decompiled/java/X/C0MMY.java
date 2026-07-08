package X;

import com.ss.android.ugc.aweme.canvas.CanvasFilterParam;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardVideo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.QuickForwardResolver$restoreCanvasResource$1", f = "QuickForwardResolver.kt", l = {71, 75}, m = "invokeSuspend")
public final class C0MMY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C099G LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CanvasFilterParam LLILZIL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, Boolean, String, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ CanvasVideoData LLIZLLLIL;
    public final /* synthetic */ ForwardVideo LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0MMY(String str, CanvasFilterParam canvasFilterParam, InterfaceC1631620sYq<? super Boolean, ? super Boolean, ? super String, Unit> interfaceC1631620sYq, String str2, CanvasVideoData canvasVideoData, ForwardVideo forwardVideo, InterfaceC1364105Vn<? super C0MMY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = canvasFilterParam;
        this.LLILZLL = interfaceC1631620sYq;
        this.LLIZ = str2;
        this.LLIZLLLIL = canvasVideoData;
        this.LLJ = forwardVideo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MMY c0mmy = new C0MMY(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
        c0mmy.LLILLL = obj;
        return c0mmy;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MMY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
