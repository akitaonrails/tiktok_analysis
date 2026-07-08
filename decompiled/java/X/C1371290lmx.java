package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler;

/* JADX INFO: renamed from: X.0lmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.improve.handler.LongPressShareButtonHandler", f = "LongPressShareButtonHandler.kt", l = {35, LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "preHandleShare")
public final class C1371290lmx extends AbstractC23140094w {
    public Object LL;
    public BaseSharePackage LLILLJJLI;
    public InterfaceC1369790lkX LLILLL;
    public Object LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ LongPressShareButtonHandler LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1371290lmx(LongPressShareButtonHandler longPressShareButtonHandler, InterfaceC1364105Vn<? super C1371290lmx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = longPressShareButtonHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongPressShareButtonHandler@f385.preHandleShare$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILZLL.LJIILIIL(null, null, null, null, this);
        C1C7U.LIZIZ("LongPressShareButtonHandler@f385.preHandleShare$1");
        return objLJIILIIL;
    }
}
