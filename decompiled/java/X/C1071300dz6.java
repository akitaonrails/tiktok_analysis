package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0dz6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.email.EmailUploadAuthProcessor", f = "EmailUploadAuthProcessor.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT}, m = "process")
public final class C1071300dz6 extends AbstractC23140094w {
    public C1071220dyy LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1071280dz4 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071300dz6(C1071280dz4 c1071280dz4, InterfaceC1364105Vn<? super C1071300dz6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1071280dz4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmailUploadAuthProcessor@63e0.process$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("EmailUploadAuthProcessor@63e0.process$1");
        return objLIZ;
    }
}
