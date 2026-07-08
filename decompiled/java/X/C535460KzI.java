package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* JADX INFO: renamed from: X.0KzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.C2PAReadTask", f = "C2PAReadTask.kt", l = {28}, m = "process")
public final class C535460KzI extends AbstractC23140094w {
    public Object LL;
    public ShortVideoContext LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public MediaModel LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C535450KzH LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C535460KzI(C535450KzH c535450KzH, InterfaceC1364105Vn<? super C535460KzI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c535450KzH;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("C2PAReadTask@bb33.process$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, this);
        C1C7U.LIZIZ("C2PAReadTask@bb33.process$1");
        return objLIZ;
    }
}
