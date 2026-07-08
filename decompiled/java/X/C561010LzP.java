package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0LzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionAsyncExtKt$thenAsync$1", f = "ActionAsyncExt.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "perform")
public final class C561010LzP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C561000LzO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561010LzP(C561000LzO c561000LzO, InterfaceC1364105Vn<? super C561010LzP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c561000LzO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionAsyncExtKt@fd51.thenAsync$1$perform$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ActionAsyncExtKt@fd51.thenAsync$1$perform$1");
        return objLIZ;
    }
}
