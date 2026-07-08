package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0LKq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.ImageUploadTask", f = "ImageUploadTask.kt", l = {BaseNotice.CREATOR, 63, 70, 76, 77, 82, 101, 104, 115, 121, 135, 136, 146}, m = "run")
public final class C541260LKq extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C541280LKs LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541260LKq(C541280LKs c541280LKs, InterfaceC1364105Vn<? super C541260LKq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c541280LKs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageUploadTask@5f84.run$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZ.LJFF(null, this);
        C1C7U.LIZIZ("ImageUploadTask@5f84.run$1");
        return objLJFF;
    }
}
