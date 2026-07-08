package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1358600lSU {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final C1358650lSZ LIZ;
    public final RelationButton LIZIZ;
    public final TuxTextView LIZJ;
    public final TuxIconView LIZLLL;
    public final TuxIconView LJ;
    public C1358130lRj LJFF;
    public Aweme LJI;
    public Context LJII;
    public LifecycleOwner LJIIIIZZ;
    public Function0<Unit> LJIIIZ;
    public Function0<Unit> LJIIJ;
    public Function1<? super UpvoteStruct, Boolean> LJIIJJI;
    public Function1<? super C0SY7, Unit> LJIIL;
    public String LJIILIIL;

    public final User LIZ() {
        UpvoteStruct upvoteStruct;
        C1358130lRj c1358130lRj = this.LJFF;
        if (c1358130lRj == null || (upvoteStruct = c1358130lRj.LL) == null) {
            return null;
        }
        return upvoteStruct.user;
    }

    public final String LIZIZ() {
        VideoItemParams videoItemParams;
        C1358130lRj c1358130lRj = this.LJFF;
        if (c1358130lRj == null || (videoItemParams = c1358130lRj.LLILLJJLI) == null) {
            return null;
        }
        return videoItemParams.mEventType;
    }

    public final void LIZJ() {
        VideoItemParams videoItemParams;
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String tabName;
        boolean z = false;
        C786410Ut5.o1(this.LIZ, 0);
        C455830Hu9.LIZ.getClass();
        final C455870HuD c455870HuD = (C455870HuD) C455830Hu9.LJ.getValue();
        final C1358650lSZ c1358650lSZ = this.LIZ;
        C1358130lRj c1358130lRj = this.LJFF;
        UpvoteStruct upvoteStruct = c1358130lRj != null ? c1358130lRj.LL : null;
        Aweme aweme = this.LJI;
        String strLIZIZ = LIZIZ();
        String str = "";
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        C1358130lRj c1358130lRj2 = this.LJFF;
        if (c1358130lRj2 != null && (videoItemParams = c1358130lRj2.LLILLJJLI) != null && (baseFeedPageParams = videoItemParams.baseFeedPageParams) != null && (c2189821An6 = baseFeedPageParams.param) != null && (tabName = c2189821An6.getTabName()) != null) {
            str = tabName;
        }
        C1358120lRi c1358120lRi = UpvotePanelListViewModel.LLJJIJI;
        C1358130lRj c1358130lRj3 = this.LJFF;
        VideoItemParams videoItemParams2 = c1358130lRj3 != null ? c1358130lRj3.LLILLJJLI : null;
        c1358120lRi.getClass();
        String strLIZIZ2 = C1389300mG0.LIZIZ(videoItemParams2 != null ? videoItemParams2.fragment : null);
        C1358130lRj c1358130lRj4 = this.LJFF;
        if (c1358130lRj4 != null && c1358130lRj4.LIZ()) {
            z = true;
        }
        final Function0<Unit> function0 = this.LJIIIZ;
        c1358650lSZ.LLILLL = aweme;
        c1358650lSZ.LLILZ = upvoteStruct;
        c1358650lSZ.LLILZIL = strLIZIZ;
        c1358650lSZ.LLILZLL = str;
        c1358650lSZ.LLIZ = strLIZIZ2;
        c1358650lSZ.LLIZLLLIL = z;
        c1358650lSZ.LL.LIZ(c455870HuD != null ? Integer.valueOf(c455870HuD.LIZIZ) : null, null);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1173120gdK() { // from class: X.0lSS
            public final /* synthetic */ String LLILZ = null;

            @Override // X.AbstractViewOnClickListenerC1173120gdK
            public final void LIZ(View view) {
                SetSticker setSticker;
                if (C424430Gkb.LIZ() && C123100dR.LIZ(this.LLILZ)) {
                    c1358650lSZ.LIZIZ(this.LLILZ);
                } else {
                    C1358650lSZ c1358650lSZ2 = c1358650lSZ;
                    C455870HuD c455870HuD2 = c455870HuD;
                    if (c455870HuD2 != null) {
                        setSticker = c455870HuD2.LIZ;
                    } else {
                        setSticker = null;
                    }
                    c1358650lSZ2.LIZ(setSticker);
                }
                Function0 function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        }, c1358650lSZ);
        this.LIZ.setOnLongClickListener(new ViewOnLongClickListenerC1401960maQ(this, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x038c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358600lSU.LJ():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1358600lSU.LIZLLL():void");
    }

    public C1358600lSU(C1358650lSZ c1358650lSZ, RelationButton relationButton, TuxTextView tuxTextView, TuxIconView tuxIconView, TuxIconView tuxIconView2) {
        this.LIZ = c1358650lSZ;
        this.LIZIZ = relationButton;
        this.LIZJ = tuxTextView;
        this.LIZLLL = tuxIconView;
        this.LJ = tuxIconView2;
    }
}
