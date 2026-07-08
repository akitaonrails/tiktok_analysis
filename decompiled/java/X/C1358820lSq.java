package X;

import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import java.util.List;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lSq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358820lSq extends AbstractC329610Cw3<Long> {
    public InterfaceC20236714Gf<? super AbstractC316870CbV<Long>> LIZIZ;
    public final C1358810lSp LIZJ;
    public final /* synthetic */ UpvotePanelListViewModel LIZLLL;

    public final boolean LIZ(UpvoteStruct upvoteStruct) {
        String uid;
        if (!upvoteStruct.isPublished()) {
            return false;
        }
        if (!Intrinsics.LJFF(upvoteStruct.upvoteId, this.LIZLLL.LLJILJIL)) {
            List<String> list = this.LIZLLL.LLJILJILJ;
            if (list == null) {
                return false;
            }
            User user = upvoteStruct.user;
            if (user != null) {
                uid = user.getUid();
            } else {
                uid = null;
            }
            if (!list.contains(uid)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onRefresh(InterfaceC1364105Vn<? super AbstractC316870CbV<Long>> interfaceC1364105Vn) {
        Integer numValueOf;
        List<UpvoteStruct> list;
        this.LIZIZ = (InterfaceC20236714Gf) interfaceC1364105Vn;
        UpvoteList value = this.LIZLLL.wQ2().getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRefresh: size: ");
        if (value != null && (list = value.upvotes) != null) {
            numValueOf = Integer.valueOf(list.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (value != null) {
            C897520ZIw c897520ZIw = (C897520ZIw) this.LIZLLL.LLJ.getValue();
            if (c897520ZIw != null) {
                c897520ZIw.LJFF(C0O26.LIZIZ(value.upvotes, AFwS259S0000000_21.get$arr$(251)));
            }
            this.LIZJ.LIZIZ(value);
            return;
        }
        UpvotePanelListViewModel upvotePanelListViewModel = this.LIZLLL;
        upvotePanelListViewModel.xQ2(this.LIZJ, upvotePanelListViewModel.LLJILJIL, 0L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358820lSq(UpvotePanelListViewModel upvotePanelListViewModel, C20603715jn c20603715jn) {
        super(c20603715jn);
        this.LIZLLL = upvotePanelListViewModel;
        this.LIZJ = new C1358810lSp(this, upvotePanelListViewModel);
    }

    @Override // com.bytedance.ies.powerlist.page.config.PowerPageSource
    public final void onLoadMore(InterfaceC1364105Vn interfaceC1364105Vn, Object obj) {
        long jLongValue = ((Number) obj).longValue();
        this.LIZIZ = (InterfaceC20236714Gf) interfaceC1364105Vn;
        this.LIZLLL.xQ2(this.LIZJ, null, jLongValue);
    }
}
