package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4L, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$goEditPage$observeJob$1", f = "AutoCutAnchorMediaProcessImpl.kt", l = {472, 474, 480, 486, 493, 498}, m = "invokeSuspend")
public final class C0L4L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0L4M LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0L4P LLILLL;
    public final /* synthetic */ ShortVideoContext LLILZ;
    public final /* synthetic */ C0L7B LLILZIL;
    public final /* synthetic */ Intent LLILZLL;
    public final /* synthetic */ List<MediaModel> LLIZ;
    public final /* synthetic */ Activity LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0L4L(C0L4P c0l4p, ShortVideoContext shortVideoContext, C0L7B c0l7b, Intent intent, List<? extends MediaModel> list, Activity activity, InterfaceC1364105Vn<? super C0L4L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0l4p;
        this.LLILZ = shortVideoContext;
        this.LLILZIL = c0l7b;
        this.LLILZLL = intent;
        this.LLIZ = list;
        this.LLIZLLLIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L4L(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0L4L.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
