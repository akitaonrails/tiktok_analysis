package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0whj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790890whj extends C09AY implements Function1<AbstractC1250290idn, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ IMQuickReplyManageFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1790890whj(boolean z, boolean z2, IMQuickReplyManageFragment iMQuickReplyManageFragment) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = iMQuickReplyManageFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC1250290idn abstractC1250290idn) {
        String string;
        String string2;
        C1250300ido c1250300ido = (C1250300ido) abstractC1250290idn;
        boolean z = this.LL;
        boolean z2 = this.LLILLJJLI;
        IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LLILLL;
        c1250300ido.LJ = z;
        String str = "";
        if (z2) {
            Context context = iMQuickReplyManageFragment.getContext();
            if (context != null && (string2 = context.getString(2131830803)) != null) {
                str = string2;
            }
            c1250300ido.LIZJ = str;
        } else {
            Context context2 = iMQuickReplyManageFragment.getContext();
            if (context2 != null && (string = context2.getString(2131830805)) != null) {
                str = string;
            }
            c1250300ido.LIZJ = str;
        }
        return Unit.LIZ;
    }
}
