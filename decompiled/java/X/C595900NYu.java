package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0NYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusInterceptorMgr", f = "ActivityStatusInterceptorMgr.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "interceptUser$im_sdk_activity_status_release")
public final class C595900NYu extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C595910NYv LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595900NYu(C595910NYv c595910NYv, InterfaceC1364105Vn<? super C595900NYu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c595910NYv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusInterceptorMgr@b197.interceptUser$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("ActivityStatusInterceptorMgr@b197.interceptUser$1");
        return objLIZ;
    }
}
