package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ImageUploadTaskInput;

/* JADX INFO: renamed from: X.0LLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.aicreation.childtask.AICreationMultiResourceUploadTask", f = "AICreationMultiResourceUploadTask.kt", l = {171, 185}, m = "beginTask")
public final class C541460LLk extends AbstractC23140094w {
    public ImageUploadTaskInput LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C541410LLf LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541460LLk(C541410LLf c541410LLf, InterfaceC1364105Vn<? super C541460LLk> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c541410LLf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AICreationMultiResourceUploadTask@a170.beginTask$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJLIIL = this.LLILLL.LJJJLIIL(null, this);
        C1C7U.LIZIZ("AICreationMultiResourceUploadTask@a170.beginTask$1");
        return objLJJJLIIL;
    }
}
