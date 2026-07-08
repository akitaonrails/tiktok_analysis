package X;

import com.ss.android.ugc.aweme.notice.api.bean.NoticeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0zeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1904200zeU extends C09AY implements Function0<Unit> {
    public final /* synthetic */ NoticeList LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1904200zeU(NoticeList noticeList, int i) {
        super(0);
        this.LL = noticeList;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1904220zeW c1904220zeW = C1904220zeW.LL;
        NoticeList noticeList = this.LL;
        int i = this.LLILLJJLI;
        c1904220zeW.getClass();
        C1904220zeW.LJJJJLL(noticeList, i);
        return Unit.LIZ;
    }
}
