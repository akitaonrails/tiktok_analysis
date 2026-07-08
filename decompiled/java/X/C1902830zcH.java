package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0zcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902830zcH extends InboxEntrancePod {
    public C1902830zcH(InboxEntranceCell inboxEntranceCell, boolean z, boolean z2, boolean z3) {
        super(inboxEntranceCell, z3, z, z2, 206);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod
    /* JADX INFO: renamed from: LIZ */
    public final InboxEntrancePod copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C1902830zcH(this.entranceCell, z, z4, z5);
    }

    @Override // com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod, X.InterfaceC887660Ys0
    public final Object copyData(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function1 function1) {
        return new C1902830zcH(this.entranceCell, z, z4, z5);
    }
}
