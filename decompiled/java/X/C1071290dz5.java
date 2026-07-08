package X;

/* JADX INFO: renamed from: X.0dz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.pipeline.contact.ContactUploadAuthProcessor", f = "ContactUploadAuthProcessor.kt", l = {22, 25}, m = "process")
public final class C1071290dz5 extends AbstractC23140094w {
    public C1071220dyy LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1071270dz3 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1071290dz5(C1071270dz3 c1071270dz3, InterfaceC1364105Vn<? super C1071290dz5> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1071270dz3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactUploadAuthProcessor@dfc5.process$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, this);
        C1C7U.LIZIZ("ContactUploadAuthProcessor@dfc5.process$1");
        return objLIZ;
    }
}
