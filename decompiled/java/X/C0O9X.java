package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0O9X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.fanspotlight.service.SetPickVideoListMutation", f = "SetPickVideoListMutation.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "operate")
public final class C0O9X extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0O9W LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O9X(C0O9W c0o9w, InterfaceC1364105Vn<? super C0O9X> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0o9w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SetPickVideoListMutation@4aa7.operate$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        C1C7U.LIZIZ("SetPickVideoListMutation@4aa7.operate$1");
        return objLIZIZ;
    }
}
