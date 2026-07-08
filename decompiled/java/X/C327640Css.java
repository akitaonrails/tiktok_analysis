package X;

/* JADX INFO: renamed from: X.0Css, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.translate.CaptionTextManager", f = "CaptionTextManager.kt", l = {210, 220, 238, 242, 250}, m = "insertCaption$suspendImpl")
public final class C327640Css extends AbstractC23140094w {
    public C327620Csq LL;
    public Object LLILLJJLI;
    public C327610Csp LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C327620Csq LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327640Css(C327620Csq c327620Csq, InterfaceC1364105Vn<? super C327640Css> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c327620Csq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTextManager@987e.insertCaption$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = C327620Csq.LJIIIIZZ(this.LLILZIL, null, null, this);
        C1C7U.LIZIZ("CaptionTextManager@987e.insertCaption$1");
        return objLJIIIIZZ;
    }
}
