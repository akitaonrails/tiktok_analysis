package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MHV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$startDownloadVideo$1", f = "ForwardOnThisDayEnvironment.kt", l = {446, 502, 509, 536, 569, 599}, m = "invokeSuspend")
public final class C0MHV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public C259800zU LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final /* synthetic */ VideoPublishEditModel LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ ForwardMedia LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ C0MMK LLJI;
    public final /* synthetic */ Function0<Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MHV(VideoPublishEditModel videoPublishEditModel, Context context, ForwardMedia forwardMedia, boolean z, C0MMK c0mmk, Function0<Unit> function0, InterfaceC1364105Vn<? super C0MHV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = videoPublishEditModel;
        this.LLIZ = context;
        this.LLIZLLLIL = forwardMedia;
        this.LLJ = z;
        this.LLJI = c0mmk;
        this.LLJIJIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MHV(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0315  */
    /* JADX WARN: Type inference failed for: r2v50, types: [T, com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog] */
    /* JADX WARN: Type inference failed for: r7v27, types: [T, X.0mWv, android.app.Dialog, android.app.ProgressDialog] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r125) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MHV.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
