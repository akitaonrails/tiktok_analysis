package X;

/* JADX INFO: renamed from: X.0zaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.open.component.NoticeComponentDataRepository", f = "NoticeComponentDataRepository.kt", l = {39}, m = "fetchNoticeByGroup")
public final class C1901770zaZ extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1901760zaY LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1901770zaZ(C1901760zaY c1901760zaY, InterfaceC1364105Vn<? super C1901770zaZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1901760zaY;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NoticeComponentDataRepository@c20c.fetchNoticeByGroup$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(0, false, null, this);
        C1C7U.LIZIZ("NoticeComponentDataRepository@c20c.fetchNoticeByGroup$1");
        return objLIZ;
    }
}
