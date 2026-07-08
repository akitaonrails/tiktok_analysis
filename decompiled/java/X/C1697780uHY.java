package X;

/* JADX INFO: renamed from: X.0uHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", f = "AndroidPlatformTextInputSession.android.kt", l = {71}, m = "startInputMethod")
public final class C1697780uHY extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1697770uHX LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1697780uHY(C1697770uHX c1697770uHX, InterfaceC1364105Vn<? super C1697780uHY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1697770uHX;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        return this.LLILLJJLI.LIZ(null, this);
    }
}
