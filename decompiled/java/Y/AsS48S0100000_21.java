package Y;

import X.AbstractC1362700lZ6;
import X.AbstractC1368060lhk;
import X.AbstractC1585810rMx;
import X.C0DJ3;
import X.C0QSJ;
import X.C1342550l2b;
import X.C1355870lO5;
import X.C1358550lSP;
import X.C1362630lYz;
import X.C1362650lZ1;
import X.C1363390laD;
import X.C13LE;
import X.C1401160mZ8;
import X.C1481605r4;
import X.C1558520qew;
import X.C2096308Jd;
import X.C2250431D6j;
import X.C687700QyG;
import X.C844470XAv;
import X.EnumC1362640lZ0;
import X.InterfaceC1602960roc;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.CommentPowerListAssem;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.Lemon8PostCommentListFragment;
import com.ss.android.ugc.aweme.search.entry.commenticon.communication.CommentRootFragmentScope;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.assem.RepostReplyListAssem;
import kotlin.jvm.internal.AwS422S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public class AsS48S0100000_21 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
            case 7:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 2:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 4:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 5:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 6:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 1:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
        }
    }

    public AsS48S0100000_21(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        Aweme aweme;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSourceSp;
        CommentContextSource commentContextSourceSp2;
        Object objLIZ;
        Object ability;
        Object ability2;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        if (((CommentPowerListAssem) asS48S0100000_21.l0).LLJLILLLLZIIL && i == 0) {
            CommentPowerListAssem commentPowerListAssem = (CommentPowerListAssem) asS48S0100000_21.l0;
            CommentContextSource commentContextSourceSp3 = commentPowerListAssem.sp();
            Object obj = null;
            if (commentContextSourceSp3 != null && (commonModel4 = commentContextSourceSp3.getCommonModel()) != null) {
                aweme = commonModel4.aweme;
            } else {
                aweme = null;
            }
            if (!commentPowerListAssem.LLJL) {
                CommentContextSource commentContextSourceSp4 = commentPowerListAssem.sp();
                if (commentContextSourceSp4 != null) {
                    commonModel = commentContextSourceSp4.getCommonModel();
                } else {
                    commonModel = null;
                }
                if (commonModel == null || (((commentContextSourceSp = commentPowerListAssem.sp()) != null && (commonModel3 = commentContextSourceSp.getCommonModel()) != null && Intrinsics.LJFF(commonModel3.isSpiltMode(), Boolean.TRUE)) || ((commentContextSourceSp2 = commentPowerListAssem.sp()) != null && (commonModel2 = commentContextSourceSp2.getCommonModel()) != null && commonModel2.isLandscapeMode()))) {
                    commentPowerListAssem.LLJL = true;
                    return;
                }
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(commentPowerListAssem);
                C844470XAv.LIZ.getClass();
                if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                    InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ICommentPageContainer.class, null);
                    C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, CommentRootFragmentScope.class);
                    if (c0qsjLIZJ != null) {
                        ability2 = c0qsjLIZJ.getAbility(ICommentPageContainer.class);
                    } else {
                        ability2 = null;
                    }
                    if (!(ability2 instanceof ICommentPageContainer)) {
                        ability2 = null;
                    }
                    InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) ability2;
                    C0DJ3 c0dj3 = C0DJ3.LIZ;
                    String strLJI = C13LE.LIZ(ICommentPageContainer.class).LJI();
                    if (strLJI == null) {
                        strLJI = "null";
                    }
                    c0dj3.getClass();
                    C0DJ3.LIZ(interfaceC494301wDLIZ, strLJI, interfaceC494301wD);
                }
                C0DJ3.LIZ.getClass();
                if (C0DJ3.LIZIZ()) {
                    C0QSJ c0qsjLIZJ2 = C687700QyG.LIZJ(interfaceC665370Q7zLJIIL, CommentRootFragmentScope.class);
                    if (c0qsjLIZJ2 != null) {
                        ability = c0qsjLIZJ2.getAbility(ICommentPageContainer.class);
                    } else {
                        ability = null;
                    }
                    if (ability instanceof ICommentPageContainer) {
                        obj = ability;
                    }
                    objLIZ = (ICommentPageContainer) obj;
                } else {
                    objLIZ = C1558520qew.LIZ(interfaceC665370Q7zLJIIL, ICommentPageContainer.class, null);
                }
                ICommentPageContainer iCommentPageContainer = (ICommentPageContainer) objLIZ;
                if (iCommentPageContainer == null) {
                    return;
                }
                iCommentPageContainer.Qg2(aweme, new AwS565S0100000_21(commentPowerListAssem, 1717));
            }
        }
    }

    public static final void LJJIIJ$1(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        String aid;
        String aid2;
        if (i == 0) {
            RepostReplyListAssem repostReplyListAssem = (RepostReplyListAssem) asS48S0100000_21.l0;
            int i2 = repostReplyListAssem.LLJI;
            String str = "";
            String str2 = null;
            if (i2 > 0) {
                C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                VideoItemParams videoItemParams = repostReplyListAssem.ip().LLILLJJLI;
                if (videoItemParams != null) {
                    str2 = videoItemParams.mEventType;
                }
                String strAQ2 = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().AQ2();
                String str3 = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().LLJ;
                Aweme aweme = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().LL;
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    str = aid2;
                }
                c1358550lSP.getClass();
                C1358550lSP.LJIJ("down", str2, strAQ2, str3, str);
            } else if (i2 < 0) {
                C1358550lSP c1358550lSP2 = C1358550lSP.LIZ;
                VideoItemParams videoItemParams2 = repostReplyListAssem.ip().LLILLJJLI;
                if (videoItemParams2 != null) {
                    str2 = videoItemParams2.mEventType;
                }
                String strAQ22 = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().AQ2();
                String str4 = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().LLJ;
                Aweme aweme2 = ((RepostReplyListAssem) asS48S0100000_21.l0).ip().LL;
                if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                    str = aid;
                }
                c1358550lSP2.getClass();
                C1358550lSP.LJIJ("up", str2, strAQ22, str4, str);
            }
            ((RepostReplyListAssem) asS48S0100000_21.l0).LLJI = 0;
        }
    }

    public static final void LJJIIJ$2(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        if (i != 0) {
            if (i != 1) {
                ((InterfaceC1602960roc) asS48S0100000_21.l0).start();
                return;
            } else {
                ((InterfaceC1602960roc) asS48S0100000_21.l0).start();
                return;
            }
        }
        ((InterfaceC1602960roc) asS48S0100000_21.l0).stop();
    }

    public static final void LJJIIJ$3(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21;
        LinearLayoutManager linearLayoutManager = ((AbstractC1368060lhk) asS48S0100000_21.l0).LLIZLLLIL;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        if (((AbstractC1368060lhk) asS48S0100000_21.l0).LL == 0 && iFindLastCompletelyVisibleItemPosition == r1.getItemCount() - 1 && (aRunnableS121S0100000_21 = ((AbstractC1368060lhk) asS48S0100000_21.l0).LLJ) != null) {
            C1481605r4.LIZIZ(aRunnableS121S0100000_21);
        }
    }

    public static final void LJJIIJ$4(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        C1363390laD c1363390laD;
        if (i == 1) {
            AbstractC1362700lZ6 abstractC1362700lZ6 = ((C1362650lZ1) asS48S0100000_21.l0).LLIZLLLIL;
            if ((abstractC1362700lZ6 instanceof C1363390laD) && (c1363390laD = (C1363390laD) abstractC1362700lZ6) != null) {
                c1363390laD.LLJJIJI = true;
            }
            C1362630lYz.LIZ.getClass();
            C2096308Jd c2096308Jd = C1362630lYz.LIZIZ;
            if (c2096308Jd != null) {
                c2096308Jd.add(Integer.valueOf(EnumC1362640lZ0.SLIDE_SHARE.getValue()));
            }
        }
    }

    public static final void LJJIIJ$5(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        C2250431D6j c2250431D6j = C2250431D6j.LIZ;
        AwS422S0200000_21 awS422S0200000_21 = new AwS422S0200000_21(recyclerView, (Aweme) asS48S0100000_21.l0, 121);
        c2250431D6j.getClass();
        C2250431D6j.LIZ(i, awS422S0200000_21);
    }

    public static final void LJJIIJ$6(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i) {
        C1401160mZ8 c1401160mZ8 = (C1401160mZ8) asS48S0100000_21.l0;
        c1401160mZ8.LJIIJJI = i;
        if (i == 0) {
            c1401160mZ8.LIZLLL(c1401160mZ8.LJIILJJIL, true, true);
        }
    }

    public static final void LJJIIZI$0(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i, int i2) {
        int iFindLastVisibleItemPosition;
        LinearLayoutManager linearLayoutManager;
        RecyclerView.LayoutManager layoutManager = ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) asS48S0100000_21.l0).So().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        } else {
            iFindLastVisibleItemPosition = 0;
        }
        int iLJIIIIZZ = ((com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) asS48S0100000_21.l0).Jo().LLILZLL.LJIIIIZZ();
        com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem commentPowerListAssem = (com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) asS48S0100000_21.l0;
        int i3 = commentPowerListAssem.LLJILJILJ;
        if (iFindLastVisibleItemPosition >= i3 && iLJIIIIZZ - iFindLastVisibleItemPosition < i3 && commentPowerListAssem.Lo().LL) {
            com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem commentPowerListAssem2 = (com.ss.android.ugc.aweme.lemon.comment.ui.CommentPowerListAssem) asS48S0100000_21.l0;
            if (!commentPowerListAssem2.LLJILLL) {
                commentPowerListAssem2.LLJILLL = true;
                CommentListAssemVM commentListAssemVMLo = commentPowerListAssem2.Lo();
                commentListAssemVMLo.LLJILJILJ.getOperator().LIZ(new C1342550l2b(commentListAssemVMLo.LLILLJJLI));
            }
        }
    }

    public static final void LJJIIZI$1(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i, int i2) {
        ((RepostReplyListAssem) asS48S0100000_21.l0).LLJI += i2;
    }

    public static final void LJJIIZI$2(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i, int i2) {
        C1355870lO5 c1355870lO5 = ((Lemon8PostCommentListFragment) asS48S0100000_21.l0).NR().LLILZ;
        if (c1355870lO5 != null && c1355870lO5.LJFF <= 0) {
            c1355870lO5.LJFF = System.currentTimeMillis();
            c1355870lO5.LIZ();
        }
    }

    public static final void LJJIIZI$3(AsS48S0100000_21 asS48S0100000_21, RecyclerView recyclerView, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        ((C1401160mZ8) asS48S0100000_21.l0).getClass();
        C1401160mZ8 c1401160mZ8 = (C1401160mZ8) asS48S0100000_21.l0;
        if (c1401160mZ8.LIZIZ == 0 || c1401160mZ8.LIZJ == 0) {
            c1401160mZ8.LIZIZ();
        }
        C1401160mZ8 c1401160mZ82 = (C1401160mZ8) asS48S0100000_21.l0;
        if (c1401160mZ82.LJIIJJI == 1) {
            c1401160mZ82.LIZLLL(i2, false, false);
            return;
        }
        if (i2 == 0) {
            return;
        }
        c1401160mZ82.LJIILJJIL = i2;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(i2) > 50) {
            z = true;
        } else {
            z = false;
        }
        if (c1401160mZ82.LJIIJJI == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j = c1401160mZ82.LJII;
        if (j != 0 && jElapsedRealtime - j <= c1401160mZ82.LJIIIIZZ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z2 && !z3) {
            if (z) {
                return;
            }
            c1401160mZ82.LIZLLL(i2, false, false);
        } else {
            if (!z || !z2) {
                return;
            }
            c1401160mZ82.LIZJ(-1);
        }
    }
}
