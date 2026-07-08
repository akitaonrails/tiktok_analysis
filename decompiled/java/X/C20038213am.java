package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: X.13am, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.AndroidComposeView", f = "AndroidComposeView.android.kt", l = {739}, m = "textInputSession")
public final class C20038213am extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AndroidComposeView LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20038213am(AndroidComposeView androidComposeView, InterfaceC1364105Vn<? super C20038213am> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = androidComposeView;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LJIILJJIL(null, this);
    }
}
