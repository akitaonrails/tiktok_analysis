package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Bn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler", f = "AIGCPictureHandler.kt", l = {683, 688}, m = "uploadImage")
public final class C2215261Bn2 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCPictureHandler LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215261Bn2(AIGCPictureHandler aIGCPictureHandler, InterfaceC1364105Vn<? super C2215261Bn2> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIGCPictureHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCPictureHandler@13c6.uploadImage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objUploadImage = this.LLILZIL.uploadImage(null, null, null, this);
        C1C7U.LIZIZ("AIGCPictureHandler@13c6.uploadImage$1");
        return objUploadImage;
    }
}
