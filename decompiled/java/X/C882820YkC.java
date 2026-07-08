package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0YkC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C882820YkC extends AbstractC880120Yfq {
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
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
        FilterTabType filterTabType = null;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            filterTabType = c878950Ydx.LLILLL;
        }
        return filterTabType != FilterTabType.ARCHIVE || !C0CYM.LIZJ.LJIIIIZZ() || (c0y8t = this.LLILZ) == null || C882340YjQ.LJ(c0y8t) || AbstractC880120Yfq.LJII(this.LLILZ);
    }

    @Override // X.AbstractC880120Yfq
    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unarchive chat, current conversation_tags: ");
        C0Y8T c0y8t = this.LLILZ;
        sbLIZ.append(c0y8t != null ? c0y8t.getConversationTags() : null);
        sbLIZ.append(", curPage: ");
        sbLIZ.append(this.LLILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        AbstractC879060Ye8.LIZJ(this.LLILZLL, null, C1697810uHb.LJIIJJI(EnumC879080YeA.SECONDARY, EnumC879080YeA.SPAM), Boolean.FALSE, new C914130Ztb(this, C20642515q3.LJ(2131755205, 1, "1"), "UnarchiveAction", new AwS558S0100000_14(this, 1478), 2), 1);
        AbstractC880120Yfq.LJFF(this, "unarchive", null, null, 6);
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC880120Yfq
    public final int LIZLLL() {
        return this.LLJ;
    }

    public C882820YkC(Activity activity, C879540Yeu c879540Yeu, C878950Ydx c878950Ydx) {
        super(activity, c879540Yeu, c878950Ydx);
        this.LLJ = 2131830263;
        this.LLJI = R.raw.icon_archive_box_arrow_top;
    }
}
