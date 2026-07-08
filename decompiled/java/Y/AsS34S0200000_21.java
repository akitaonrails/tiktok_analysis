package Y;

import X.AbstractC1585810rMx;
import X.C07CC;
import X.C1342230l25;
import X.C1342970l3H;
import X.C1558520qew;
import X.C288650BTb;
import X.C337180DJs;
import X.C339190DRl;
import X.C718860SHs;
import X.C719150SIv;
import X.C948503nH;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.comment.api.IPageActionBarAbility;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.experiment.CommentStickerConsumptionSpecExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public class AsS34S0200000_21 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) throws Throwable {
        if (this.$t != 0) {
            super.LJJIIJ(recyclerView, i);
        } else {
            LJJIIJ$0(this, recyclerView, i);
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS34S0200000_21(View view, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i) {
        this.$t = i;
        this.l1 = viewOnAttachStateChangeListenerC20604515jv;
        this.l0 = view.findViewById(R.id.fz3);
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIJ$0(Y.AsS34S0200000_21 r9, androidx.recyclerview.widget.RecyclerView r10, int r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1049
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS34S0200000_21.LJJIIJ$0(Y.AsS34S0200000_21, androidx.recyclerview.widget.RecyclerView, int):void");
    }

    public AsS34S0200000_21(CommentPowerListAssem commentPowerListAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, int i) {
        this.$t = i;
        this.l0 = commentPowerListAssem;
        this.l1 = viewOnAttachStateChangeListenerC20604515jv;
    }

    public static final void LJJIIZI$0(AsS34S0200000_21 asS34S0200000_21, RecyclerView recyclerView, int i, int i2) {
        Long lValueOf;
        int iFindFirstVisibleItemPosition;
        int iFindLastVisibleItemPosition;
        C1342230l25 c1342230l25Up;
        View viewFindViewByPosition;
        LinearLayoutManager linearLayoutManager;
        LinearLayoutManager linearLayoutManager2;
        VelocityTracker velocityTracker;
        float yVelocity;
        AwemeStatistics statistics;
        boolean zLJI = MethodIDManager.LJI(196727);
        if (i2 != 0) {
            ((CommentPowerListAssem) asS34S0200000_21.l0).LLLI = i2;
        }
        if ((CommentStickerConsumptionSpecExp.LIZIZ() || C07CC.LIZ()) && i2 != 0) {
            CommentPowerListAssem commentPowerListAssem = (CommentPowerListAssem) asS34S0200000_21.l0;
            if (!commentPowerListAssem.LLLL) {
                commentPowerListAssem.LLLL = true;
                commentPowerListAssem.if1();
            }
        }
        CommentPowerListAssem commentPowerListAssem2 = (CommentPowerListAssem) asS34S0200000_21.l0;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentPowerListAssem.LLLLLJLJLL;
        commentPowerListAssem2.getClass();
        C1342970l3H c1342970l3H = C1342970l3H.LIZ;
        Aweme aweme = commentPowerListAssem2.mp().LLJI;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        int iIntValue = 0;
        if (!C1342970l3H.LIZIZ(lValueOf) && commentPowerListAssem2.mp().EQ2() && !commentPowerListAssem2.mp().DQ2().LJJIJL && !commentPowerListAssem2.Bp().isInLayout()) {
            if (!commentPowerListAssem2.LLLIZZ || (velocityTracker = commentPowerListAssem2.LLLILZJ) == null) {
                commentPowerListAssem2.pq();
            } else {
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT);
                VelocityTracker velocityTracker2 = commentPowerListAssem2.LLLILZJ;
                if (velocityTracker2 != null) {
                    yVelocity = velocityTracker2.getYVelocity();
                } else {
                    yVelocity = 0.0f;
                }
                commentPowerListAssem2.LLLILZLLLI = yVelocity;
                if (Math.abs(yVelocity) > 0.0f) {
                    int iComputeVerticalScrollRange = (recyclerView.computeVerticalScrollRange() - recyclerView.computeVerticalScrollOffset()) - recyclerView.computeVerticalScrollExtent();
                    if (iComputeVerticalScrollRange <= 0) {
                        iComputeVerticalScrollRange = 0;
                    }
                    if ((iComputeVerticalScrollRange / Math.abs(commentPowerListAssem2.LLLILZLLLI)) * LSPassThroughRecordSizeConfig.DEFAULT < commentPowerListAssem2.LLLJ) {
                        commentPowerListAssem2.mp().DQ2().LJJIJL = true;
                        commentPowerListAssem2.mp().xQ2();
                    }
                } else {
                    commentPowerListAssem2.pq();
                }
            }
        }
        CommentPowerListAssem commentPowerListAssem3 = (CommentPowerListAssem) asS34S0200000_21.l0;
        commentPowerListAssem3.getClass();
        if (C288650BTb.LIZ()) {
            if (!recyclerView.canScrollVertically(-1)) {
                IPageActionBarAbility iPageActionBarAbility = (IPageActionBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(commentPowerListAssem3), IPageActionBarAbility.class, null);
                if (iPageActionBarAbility != null) {
                    iPageActionBarAbility.Ld0(false);
                }
            } else {
                IPageActionBarAbility iPageActionBarAbility2 = (IPageActionBarAbility) C1558520qew.LIZ(C1558520qew.LJIIL(commentPowerListAssem3), IPageActionBarAbility.class, null);
                if (iPageActionBarAbility2 != null) {
                    iPageActionBarAbility2.Ld0(true);
                }
            }
        }
        RecyclerView.LayoutManager layoutManager = ((CommentPowerListAssem) asS34S0200000_21.l0).Bp().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager2 = (LinearLayoutManager) layoutManager) != null) {
            iFindFirstVisibleItemPosition = linearLayoutManager2.findFirstVisibleItemPosition();
        } else {
            iFindFirstVisibleItemPosition = 0;
        }
        CommentPublishViewModel commentPublishViewModel = (CommentPublishViewModel) ((CommentPowerListAssem) asS34S0200000_21.l0).LLJILJILJ.getValue();
        RecyclerView.LayoutManager layoutManager2 = ((CommentPowerListAssem) asS34S0200000_21.l0).Bp().getLayoutManager();
        if ((layoutManager2 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager2) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        commentPublishViewModel.LLJJI = iFindLastVisibleItemPosition;
        ((CommentPowerListAssem) asS34S0200000_21.l0).mp().LQ2(Integer.valueOf(iFindFirstVisibleItemPosition));
        if (CommentContextSourceKt.isFromTitlePanel(((CommentPowerListAssem) asS34S0200000_21.l0).sp())) {
            if (iFindFirstVisibleItemPosition == 0) {
                RecyclerView.LayoutManager layoutManager3 = ((ViewOnAttachStateChangeListenerC20604515jv) asS34S0200000_21.l1).getLayoutManager();
                if (layoutManager3 != null && (viewFindViewByPosition = layoutManager3.findViewByPosition(iFindFirstVisibleItemPosition)) != null) {
                    CommentPowerListAssem commentPowerListAssem4 = (CommentPowerListAssem) asS34S0200000_21.l0;
                    commentPowerListAssem4.LLLJL.setEmpty();
                    viewFindViewByPosition.getLocalVisibleRect(commentPowerListAssem4.LLLJL);
                    C718860SHs.LIZ.getClass();
                    if (C719150SIv.LIZ) {
                        HandlerHook.viewPost(viewFindViewByPosition, new ARunnableS27S0201000_21(iFindFirstVisibleItemPosition, commentPowerListAssem4, viewFindViewByPosition, 3));
                    } else {
                        HandlerHook.viewPost(viewFindViewByPosition, new ARunnableS27S0201000_21(iFindFirstVisibleItemPosition, commentPowerListAssem4, viewFindViewByPosition, 4));
                    }
                }
            } else {
                HandlerHook.viewPost(recyclerView, new ARunnableS32S0101000_21(iFindFirstVisibleItemPosition, (CommentPowerListAssem) asS34S0200000_21.l0, 5));
            }
        }
        Integer num = ((CommentPowerListAssem) asS34S0200000_21.l0).LLLFZ;
        if (num != null) {
            iIntValue = num.intValue();
        }
        CommentPowerListAssem commentPowerListAssem5 = (CommentPowerListAssem) asS34S0200000_21.l0;
        if (commentPowerListAssem5.LLLFZ != null) {
            commentPowerListAssem5.LLLFZ = Integer.valueOf(iIntValue + i2);
        }
        CommentPowerListAssem commentPowerListAssem6 = (CommentPowerListAssem) asS34S0200000_21.l0;
        if (commentPowerListAssem6.LLILZ && !commentPowerListAssem6.LLJLLIL && C948503nH.LIZJ(commentPowerListAssem6) && (c1342230l25Up = ((CommentPowerListAssem) asS34S0200000_21.l0).up()) != null) {
            c1342230l25Up.LIZ((ViewGroup) ((CommentPowerListAssem) asS34S0200000_21.l0).LLJJIJI.getValue(), ((CommentPowerListAssem) asS34S0200000_21.l0).Bp());
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static final void LJJIIZI$1(AsS34S0200000_21 asS34S0200000_21, RecyclerView recyclerView, int i, int i2) {
        if (((LinearLayoutManager) ((ViewOnAttachStateChangeListenerC20604515jv) asS34S0200000_21.l1).getLayoutManager()).findFirstCompletelyVisibleItemPosition() != 0) {
            C339190DRl.LIZLLL((View) asS34S0200000_21.l0);
        } else {
            C337180DJs.LIZIZ((View) asS34S0200000_21.l0);
        }
    }
}
