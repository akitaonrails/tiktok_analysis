package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0wgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.arch.action.ActionFlowExtKt$thenEach$1", f = "ActionFlowExt.kt", l = {15, LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "perform")
public final class C1790000wgI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1789990wgH LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790000wgI(C1789990wgH c1789990wgH, InterfaceC1364105Vn<? super C1790000wgI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1789990wgH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActionFlowExtKt@5043.thenEach$1$perform$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ActionFlowExtKt@5043.thenEach$1$perform$1");
        return objLIZ;
    }
}
