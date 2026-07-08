package X;

import com.ss.android.ugc.aweme.comment.commentlist.util.CommentPageLoadTimer;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import defpackage.d1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hrm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1220520hrm extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220520hrm(boolean z) {
        super(0);
        this.LL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        d1 d1Var = CommentPageLoadTimer.LIZLLL;
        if (d1Var != null) {
            d1Var.LIZIZ("duration_iothread_request_precess");
            d1Var.LIZ("duration_ttnet_call");
        }
        CommentPerfMonitorUtil commentPerfMonitorUtil = CommentPerfMonitorUtil.LIZ;
        boolean z = this.LL;
        commentPerfMonitorUtil.getClass();
        d1 d1VarLJFF = CommentPerfMonitorUtil.LJFF(z);
        d1VarLJFF.LIZIZ("duration_iothread_request_precess");
        d1VarLJFF.LIZ("duration_ttnet_call");
        return Unit.LIZ;
    }
}
