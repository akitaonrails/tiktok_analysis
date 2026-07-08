package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Bn1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureUploadHandler", f = "AIGCPictureUploadHandler.kt", l = {670, 675}, m = "uploadImage")
public final class C2215251Bn1 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Function1 LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ AIGCPictureUploadHandler LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2215251Bn1(AIGCPictureUploadHandler aIGCPictureUploadHandler, InterfaceC1364105Vn<? super C2215251Bn1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = aIGCPictureUploadHandler;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCPictureUploadHandler@a7fd.uploadImage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(null, null, null, this);
        C1C7U.LIZIZ("AIGCPictureUploadHandler@a7fd.uploadImage$1");
        return objLJII;
    }
}
