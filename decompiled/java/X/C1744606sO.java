package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.06sO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.preload.LandingMessagePreloader", f = "LandingMessagePreloader.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "preloadResource")
public final class C1744606sO extends AbstractC23140094w {
    public EnumC1001040c9m LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1744506sN LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1744606sO(C1744506sN c1744506sN, InterfaceC1364105Vn<? super C1744606sO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1744506sN;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LandingMessagePreloader@d714.preloadResource$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, null, this);
        C1C7U.LIZIZ("LandingMessagePreloader@d714.preloadResource$1");
        return objLIZ;
    }
}
