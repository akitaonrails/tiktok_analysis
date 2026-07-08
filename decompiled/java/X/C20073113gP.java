package X;

import androidx.compose.ui.platform.z;

/* JADX INFO: renamed from: X.13gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1916, 1951}, m = "boundsUpdatesEventLoop$ui_release")
public final class C20073113gP extends AbstractC23140094w {
    public z LL;
    public C20036313aT LLILLJJLI;
    public InterfaceC824740WWy LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ z LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20073113gP(z zVar, InterfaceC1364105Vn<? super C20073113gP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = zVar;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        return this.LLILZIL.LIZJ(this);
    }
}
