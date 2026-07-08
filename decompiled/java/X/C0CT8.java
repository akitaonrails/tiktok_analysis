package X;

/* JADX INFO: renamed from: X.0CT8, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bulletin.db.internal.task.BulletinTaskManager", f = "BulletinTaskManager.kt", l = {42}, m = "executeWriteTask")
public final class C0CT8<T> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0CT6 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CT8(C0CT6 c0ct6, InterfaceC1364105Vn<? super C0CT8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0ct6;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinTaskManager@936c.executeWriteTask$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this, null);
        C1C7U.LIZIZ("BulletinTaskManager@936c.executeWriteTask$1");
        return objLIZIZ;
    }
}
