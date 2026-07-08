package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MLx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$calculateBackgroundColor$1", f = "Forward2StoryEnvironment.kt", l = {855, 873, 875, 886, 883}, m = "invokeSuspend")
public final class C567070MLx extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMG>, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC346701Wf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C0MMG LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567070MLx(ForwardMedia forwardMedia, C0MMG c0mmg, CreativeInfo creativeInfo, InterfaceC1364105Vn<? super C567070MLx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = forwardMedia;
        this.LLILZIL = c0mmg;
        this.LLILZLL = creativeInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567070MLx c567070MLx = new C567070MLx(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c567070MLx.LLILLL = obj;
        return c567070MLx;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02cf  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C567070MLx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMG> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
