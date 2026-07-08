package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0Kl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mediaselector.mediahandler.preprocess.CheckAllMediasExistTask", f = "CheckAllMediasExistTask.kt", l = {BaseNotice.CREATOR}, m = "process")
public final class C526690Kl9 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C526700KlA LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C526690Kl9(C526700KlA c526700KlA, InterfaceC1364105Vn<? super C526690Kl9> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c526700KlA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CheckAllMediasExistTask@1e34.process$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, this);
        C1C7U.LIZIZ("CheckAllMediasExistTask@1e34.process$1");
        return objLIZ;
    }
}
