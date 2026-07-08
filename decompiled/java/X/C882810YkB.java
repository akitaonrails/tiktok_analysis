package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YkB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882810YkB extends AbstractC880120Yfq {
    public final int LLJ;
    public final int LLJI;

    @Override // X.AbstractC880120Yfq
    public final int LJ() {
        return 0;
    }

    @Override // X.AbstractC880120Yfq
    public final boolean LJI() {
        C0Y8T c0y8t;
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        if (C0CYM.LIZJ.LJIIIIZZ()) {
            InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
            if ((!(interfaceC879010Ye3 instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) == null || (filterTabType = c878950Ydx.LLILLL) == null || (filterTabType != FilterTabType.ARCHIVE && filterTabType != FilterTabType.SPAM)) && (c0y8t = this.LLILZ) != null && !C882340YjQ.LJ(c0y8t) && !AbstractC880120Yfq.LJII(this.LLILZ)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("archive chat, current conversation_tags: ");
        C0Y8T c0y8t = this.LLILZ;
        sbLIZ.append(c0y8t != null ? c0y8t.getConversationTags() : null);
        sbLIZ.append(", curPage: ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLILZLL.LIZIZ(Collections.singletonList(EnumC879080YeA.SECONDARY), C1697810uHb.LJIIJJI(EnumC879080YeA.PRIMARY, EnumC879080YeA.SPAM), Boolean.FALSE, new C914130Ztb(this, C20642515q3.LJ(2131755207, 1, "1"), "ArchiveAction", new AwS558S0100000_14(this, 1472), 2));
        AbstractC880120Yfq.LJFF(this, "archive", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C882810YkB(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        super(activity, c879540Yeu, c878950Ydx);
        this.LLJ = 2131830262;
        this.LLJI = R.raw.icon_archive_box;
    }
}
