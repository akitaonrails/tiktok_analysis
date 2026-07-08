package X;

import com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget;

/* JADX INFO: renamed from: X.0CtC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.publicscreen.impl.caption.CaptionTextWidget", f = "CaptionTextWidget.kt", l = {355, 363, 367}, m = "refreshDataBuffer")
public final class C327840CtC extends AbstractC23140094w {
    public C327810Ct9 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ CaptionTextWidget LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327840CtC(CaptionTextWidget captionTextWidget, InterfaceC1364105Vn<? super C327840CtC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = captionTextWidget;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CaptionTextWidget@eb36.refreshDataBuffer$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objA1 = this.LLILZIL.A1(null, null, this);
        C1C7U.LIZIZ("CaptionTextWidget@eb36.refreshDataBuffer$1");
        return objA1;
    }
}
