package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.06Lf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.search.repository.InboxSearchUserFilterRepository", f = "InboxSearchUserFilterRepository.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITH_TEXT}, m = "getUserFilterList")
public final class C1592106Lf extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C2386209Wq LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1592106Lf(C2386209Wq c2386209Wq, InterfaceC1364105Vn<? super C1592106Lf> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c2386209Wq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InboxSearchUserFilterRepository@e2eb.getUserFilterList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLL.LIZ(null, 0L, null, this);
        C1C7U.LIZIZ("InboxSearchUserFilterRepository@e2eb.getUserFilterList$1");
        return objLIZ;
    }
}
