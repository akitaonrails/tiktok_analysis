package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0x4O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.cache.GetCustomSchemaUseCase", f = "GetCustomSchemaUseCase.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT, 45}, m = "execute")
public final class C1804940x4O extends AbstractC23140094w {
    public int LL;
    public C1804970x4R LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1804910x4L LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804940x4O(C1804910x4L c1804910x4L, InterfaceC1364105Vn<? super C1804940x4O> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1804910x4L;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetCustomSchemaUseCase@27b8.execute$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("GetCustomSchemaUseCase@27b8.execute$1");
        return objLJIIIZ;
    }
}
