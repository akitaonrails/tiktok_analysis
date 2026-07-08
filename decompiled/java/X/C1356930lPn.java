package X;

import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommentCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleCommonCell;
import com.ss.android.ugc.aweme.comment.bubble.cell.ReactionBubbleDescriptionCell;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.viewerlist.model.ViewerListResponse;
import com.ss.android.ugc.aweme.comment.viewerlist.viewmodel.VideoViewerListVM;
import com.ss.android.ugc.aweme.comment.viewmodel.CommentListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0lPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356930lPn extends AbstractC1356940lPo implements Observer<C0RD4> {
    public final C0SEN LLIZ;
    public boolean LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public List<? extends InterfaceC1891350zJl> LLJILJIL;
    public final Set<String> LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> LLJJIII;
    public C720890SPn LLJJIJI;

    @Override // X.AbstractC1356940lPo
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC1356940lPo
    public final boolean LJII() {
        return true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentDeleteEvent(C1209980ham c1209980ham) {
    }

    @Override // X.AbstractC1356940lPo
    public final void LJI() {
        this.LL.LJIILJJIL(ReactionBubbleDescriptionCell.class, ReactionBubbleCommentCell.class, ReactionBubbleCommonCell.class);
    }

    public final boolean LJIIIIZZ() {
        Aweme aweme = this.LLILLL;
        if (!C0TNQ.LJI(aweme) || !C0TNQ.LJIIIIZZ(aweme) || !C0TNQ.LJFF() || C0TNQ.LIZLLL(aweme) <= 0) {
            return false;
        }
        C0CNY.LIZ.getClass();
        return (C0CNY.LIZIZ() & 2) == 2;
    }

    public final void LJIILJJIL() {
        if (((Boolean) C0AE2.LIZ.getValue()).booleanValue()) {
            CommentService.LIZ.getClass();
            if (C523420Kfs.LIZ().LLFFF(this.LL.getContext())) {
                return;
            }
        }
        this.LL.LJJIJIIJI();
    }

    @Override // X.AbstractC1356940lPo
    public final void LIZIZ() {
        super.LIZIZ();
        C622680Oba.LIZLLL(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f A[PHI: r4
      0x004f: PHI (r4v1 com.ss.android.ugc.aweme.profile.model.User) = (r4v0 com.ss.android.ugc.aweme.profile.model.User), (r4v2 com.ss.android.ugc.aweme.profile.model.User) binds: [B:8:0x0031, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1356940lPo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r10 = this;
            r2 = 0
            r10.LLJ = r2
            r10.LLJIJIL = r2
            X.0Rb8 r0 = X.C698840Rb8.LIZ
            r0.getClass()
            r0 = 1
            r5 = r11
            boolean r0 = X.C698840Rb8.LIZ(r5, r0)
            if (r0 != 0) goto L36
            com.ss.android.ugc.aweme.profile.model.User r3 = r5.getAuthor()
            X.C0XQ7.LJ()
            com.ss.android.ugc.aweme.IAccountService r0 = X.C0XQ7.LIZ
            com.ss.android.ugc.aweme.AccountUserService r0 = r0.LJIIJ()
            com.ss.android.ugc.aweme.profile.model.User r4 = r0.getCurUser()
            java.lang.String r1 = r4.getUid()
            if (r3 == 0) goto L8a
            java.lang.String r0 = r3.getUid()
        L2d:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L4f
            r4 = r3
            if (r3 != 0) goto L4f
        L36:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.comment.services.CommentService> r0 = com.ss.android.ugc.aweme.comment.services.CommentService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = (com.ss.android.ugc.aweme.comment.services.CommentService) r0
            boolean r0 = r0.LJJIJIIJIL(r5)
            r10.LLIZLLLIL = r0
            super.LIZ(r5)
            X.C622680Oba.LIZJ(r10)
            return
        L4f:
            X.0SPn r3 = new X.0SPn
            long r6 = r5.getCreateTime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r0
            X.0lPp r0 = r10.LL
            X.0SQ1 r8 = r0.getMMobEventParam()
            X.0SEN r0 = r10.LLIZ
            java.lang.Integer r9 = r0.LIZLLL
            r3.<init>(r4, r5, r6, r8, r9)
            r10.LLJJIJI = r3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "addPublishBubbleItem, hashCode = "
            r1.append(r0)
            X.0SPn r0 = r10.LLJJIJI
            if (r0 == 0) goto L78
            int r2 = r0.hashCode()
        L78:
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            X.0lPp r0 = r10.LL
            X.15jK r1 = r0.getState()
            X.0SPn r0 = r10.LLJJIJI
            X.C20600815jK.LIZJ(r1, r0)
            goto L36
        L8a:
            r0 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356930lPn.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.AbstractC1356940lPo
    public final void LJ(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn) {
        this.LLJJIII = interfaceC1364105Vn;
        this.LLJIJIL = 0;
        this.LLJ = 0;
        this.LLJI = 0;
        int iLIZ = C729800Sjy.LIZ();
        LikeListVM.BubbleBridge bubbleBridge = null;
        String authorUid = null;
        if (this.LLIZLLLIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("xjccccccaweme fetch comment awemeid ");
            sbLIZ.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
            CommentListViewModel commentListViewModel = (CommentListViewModel) this.LLJILLL.getValue();
            String str = this.LLILLJJLI;
            Fragment fragmentLIZ = this.LLIZ.LIZ();
            Aweme aweme = this.LLILLL;
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            }
            commentListViewModel.CQ2(str, 0L, iLIZ, fragmentLIZ, authorUid);
            return;
        }
        ArrayList arrayList = new ArrayList();
        C720890SPn c720890SPn = this.LLJJIJI;
        if (c720890SPn != null) {
            ListProtector.add(arrayList, 0, c720890SPn);
        }
        this.LLJILJIL = arrayList;
        LikeListVM.BubbleBridge bubbleBridge2 = ((LikeListVM) this.LLJJ.getValue()).LL;
        if (bubbleBridge2 != null) {
            bubbleBridge = bubbleBridge2;
        }
        bubbleBridge.CQ2(this.LLILLJJLI, new PaginationCursor(0L, 0L));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onAnchorUpdateEvent(C586090Myl c586090Myl) {
        ReactionBubbleDescriptionCell reactionBubbleDescriptionCell;
        C1356950lPp c1356950lPp = this.LL;
        AbstractC21673619ry adapter = c1356950lPp.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = c1356950lPp.findViewHolderForAdapterPosition(i);
                if ((viewHolderFindViewHolderForAdapterPosition instanceof ReactionBubbleDescriptionCell) && (reactionBubbleDescriptionCell = (ReactionBubbleDescriptionCell) viewHolderFindViewHolderForAdapterPosition) != null) {
                    Aweme aweme = c586090Myl.LIZ;
                    C0SQ2 c0sq2 = reactionBubbleDescriptionCell.LLJILJIL;
                    if (c0sq2 != null) {
                        c0sq2.LIZ(aweme, null);
                    }
                }
            }
        }
    }

    @C14EU
    public final void onAuthChangeEvent(C2036907yR c2036907yR) {
        if (c2036907yR != null && c2036907yR.LIZIZ) {
            LJFF();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBatchCommentEvent(C1343770l4Z c1343770l4Z) {
        AbstractC1356940lPo abstractC1356940lPo;
        int i = c1343770l4Z.LIZ;
        if ((i != 0 && i != 1 && i != 2) || (abstractC1356940lPo = this.LL.LLILZIL) == null) {
            return;
        }
        abstractC1356940lPo.LJFF();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUser(C888460YtI c888460YtI) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockUserEvent ");
        sbLIZ.append(c888460YtI);
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        C1356950lPp c1356950lPp = this.LL;
        c1356950lPp.getClass();
        C1344030l4z.LIZJ("ReactionBubbleList", "onBlockUser");
        AbstractC1356940lPo abstractC1356940lPo = c1356950lPp.LLILZIL;
        if (abstractC1356940lPo != null) {
            abstractC1356940lPo.LJFF();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(C0RD4 c0rd4) {
        C0RD4 c0rd42 = c0rd4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onChanged  ");
        sbLIZ.append(c0rd42.LIZ);
        sbLIZ.append(" this is ");
        sbLIZ.append(this);
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        String str = c0rd42.LIZ;
        Object obj = null;
        switch (str.hashCode()) {
            case -1118677714:
                if (!str.equals("LOAD_MORE_COMMENT_LIST_FAIL")) {
                    return;
                }
                break;
            case -1077696328:
                if (!str.equals("REFRESH_LIKED_LIST_SUCCESS")) {
                    return;
                }
                Object obj2 = c0rd42.LIZIZ;
                if (obj2 != null) {
                    obj = obj2;
                }
                Pair pair = (Pair) obj;
                if (!Intrinsics.LJFF(pair.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIJ((LikeListResponse) pair.getSecond(), true);
                return;
            case -1042345298:
                if (!str.equals("REFRESH_VIDEO_VIEWER_HISTORY_FAIL")) {
                    return;
                }
                break;
            case -734123415:
                if (!str.equals("REFRESH_LIKED_LIST_FAIL")) {
                    return;
                }
                break;
            case -675733933:
                if (!str.equals("REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS")) {
                    return;
                }
                Object obj3 = c0rd42.LIZIZ;
                if (obj3 != null) {
                    obj = obj3;
                }
                Pair pair2 = (Pair) obj;
                if (!Intrinsics.LJFF(pair2.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIJJI((ViewerListResponse) pair2.getSecond(), true);
                return;
            case -249497211:
                if (!str.equals("LOAD_MORE_LIKED_LIST_SUCCESS")) {
                    return;
                }
                Object obj4 = c0rd42.LIZIZ;
                if (obj4 != null) {
                    obj = obj4;
                }
                Pair pair3 = (Pair) obj;
                if (!Intrinsics.LJFF(pair3.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIJ((LikeListResponse) pair3.getSecond(), false);
                return;
            case 307526214:
                if (!str.equals("REFRESH_COMMENT_LIST_SUCCESS")) {
                    return;
                }
                Object obj5 = c0rd42.LIZIZ;
                if (obj5 != null) {
                    obj = obj5;
                }
                Pair pair4 = (Pair) obj;
                if (!Intrinsics.LJFF(pair4.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIIZ((CommentItemList) pair4.getSecond(), true);
                return;
            case 517174171:
                if (!str.equals("REFRESH_COMMENT_LIST_FAIL")) {
                    return;
                }
                break;
            case 1262006593:
                if (!str.equals("LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL")) {
                    return;
                }
                break;
            case 1637927891:
                if (!str.equals("LOAD_MORE_COMMENT_LIST_SUCCESS")) {
                    return;
                }
                Object obj6 = c0rd42.LIZIZ;
                if (obj6 != null) {
                    obj = obj6;
                }
                Pair pair5 = (Pair) obj;
                if (!Intrinsics.LJFF(pair5.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIIZ((CommentItemList) pair5.getSecond(), false);
                return;
            case 1780372668:
                if (!str.equals("LOAD_MORE_LIKED_LIST_FAIL")) {
                    return;
                }
                break;
            case 1809158880:
                if (!str.equals("LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS")) {
                    return;
                }
                Object obj7 = c0rd42.LIZIZ;
                if (obj7 != null) {
                    obj = obj7;
                }
                Pair pair6 = (Pair) obj;
                if (!Intrinsics.LJFF(pair6.getFirst(), this.LLILLJJLI)) {
                    return;
                }
                LJIIJJI((ViewerListResponse) pair6.getSecond(), false);
                return;
            default:
                return;
        }
        Object obj8 = c0rd42.LIZIZ;
        if (obj8 == null) {
            obj8 = null;
        }
        if (!Intrinsics.LJFF(obj8, this.LLILLJJLI)) {
            return;
        }
        C1344030l4z.LIZJ("TrackResume", "continua.resume 1");
        InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn = this.LLJJIII;
        if (interfaceC1364105Vn != null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            Exception exc = new Exception();
            c317290CcB.getClass();
            C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
            C189200o6.m2constructorimpl(c316650Cb9);
            interfaceC1364105Vn.resumeWith(c316650Cb9);
        }
        this.LLJJIII = null;
        this.LLILZIL = false;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentEvent(C1342800l30 c1342800l30) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleCommentEvent ");
        sbLIZ.append(c1342800l30);
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        Comment comment = c1342800l30.LIZIZ;
        if (!Intrinsics.LJFF(comment.getAwemeId(), this.LLILLJJLI)) {
            return;
        }
        int i = c1342800l30.LIZ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1356950lPp c1356950lPp = this.LL;
                    c1356950lPp.getClass();
                    C1344030l4z.LIZJ("ReactionBubbleList", "onCommentDeleted");
                    AbstractC1356940lPo abstractC1356940lPo = c1356950lPp.LLILZIL;
                    if (abstractC1356940lPo != null) {
                        abstractC1356940lPo.LJFF();
                        return;
                    }
                    return;
                }
                return;
            }
            C1356950lPp c1356950lPp2 = this.LL;
            c1356950lPp2.getClass();
            String fakeId = comment.getFakeId();
            if (TextUtils.isEmpty(fakeId)) {
                return;
            }
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) c1356950lPp2.getState().LJII()) {
                if ((interfaceC1891350zJl instanceof C0SWT) && Intrinsics.LJFF(((C0SWT) interfaceC1891350zJl).LLILLJJLI.getFakeId(), fakeId)) {
                    if (i2 < 0) {
                        return;
                    }
                    InterfaceC1891350zJl interfaceC1891350zJlLJI = c1356950lPp2.getState().LJI(i2);
                    if (!(interfaceC1891350zJlLJI instanceof C0SWT)) {
                        return;
                    }
                    c1356950lPp2.getState().LJIILJJIL(i2, new C0SWT(comment, ((C0SWT) interfaceC1891350zJlLJI).LLILLL, c1356950lPp2.LLJJJJJIL));
                    return;
                }
                i2++;
            }
            return;
        }
        C1356950lPp c1356950lPp3 = this.LL;
        c1356950lPp3.getClass();
        C1344030l4z.LIZJ("ReactionBubbleList", "from outside comment");
        AbstractC1356940lPo abstractC1356940lPo2 = c1356950lPp3.LLILZIL;
        if (abstractC1356940lPo2 == null || !abstractC1356940lPo2.LJII()) {
            return;
        }
        C786410Ut5.t(c1356950lPp3, 0);
        c1356950lPp3.LJJIJIIJIL();
        C0SWT c0swt = new C0SWT(comment, false, c1356950lPp3.LLJJJJJIL);
        if (c1356950lPp3.getState().LJIIIIZZ() != 0 && c1356950lPp3.LLJL != 0 && !(c1356950lPp3.getState().LJI(c1356950lPp3.LLJL - 1) instanceof C0SWT) && !(c1356950lPp3.getState().LJI(c1356950lPp3.LLJL - 1) instanceof C720890SPn)) {
            if (c1356950lPp3.getState().LJIIIIZZ() == 0) {
                C20600815jK.LIZJ(c1356950lPp3.getState(), c0swt);
            } else {
                C20600815jK.LIZIZ(c1356950lPp3.getState(), c1356950lPp3.getFirstDataPositionInState(), c0swt);
            }
        } else if (c1356950lPp3.getState().LJIIIIZZ() == 0) {
            C20600815jK.LIZJ(c1356950lPp3.getState(), c0swt);
        } else {
            C20600815jK.LIZIZ(c1356950lPp3.getState(), c1356950lPp3.LLJL, c0swt);
        }
        c1356950lPp3.LLJJJIL = true;
        HandlerHook.viewPostDelay(c1356950lPp3, c1356950lPp3.getStartScrollRunnable(), c1356950lPp3.LLJJ * ((long) 2));
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentShowEvent(C0SYH c0syh) {
        if (!((Boolean) C0AE2.LIZ.getValue()).booleanValue()) {
            return;
        }
        if (c0syh.LIZ == 1) {
            this.LL.LJJIJIIJIL();
        } else {
            this.LL.LJJIJIIJI();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onDiggEvent(C734240Sr8 c734240Sr8) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BubbleDiggEvent ");
        sbLIZ.append(c734240Sr8);
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        int i = c734240Sr8.LIZ;
        if (i != 0) {
            if (i == 1) {
                this.LL.LJJIIJZLJL();
                return;
            }
            return;
        }
        this.LL.LJJIIJ();
    }

    @C14EU
    public final void onCommentEvent(C697110RWb c697110RWb) {
        if (c697110RWb == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCommentEvent  ");
        sbLIZ.append(c697110RWb.LIZIZ.getAid());
        C2188811AlT.LIZIZ(sbLIZ);
        if (TextUtils.equals(c697110RWb.LIZIZ.getAid(), this.LLILLJJLI)) {
            C1356950lPp c1356950lPp = this.LL;
            c1356950lPp.getClass();
            C1344030l4z.LIZJ("ReactionBubbleList", "onCommentAuthChange");
            c1356950lPp.LJIIJ();
        }
    }

    public C1356930lPn(C0SEN c0sen, C1356950lPp c1356950lPp) {
        super(c1356950lPp, true);
        this.LLIZ = c0sen;
        this.LLIZLLLIL = true;
        this.LLJILJILJ = new LinkedHashSet();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1550));
        this.LLJILLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1446));
        this.LLJJ = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1447));
        this.LLJJI = c01gwLIZIZ3;
        DataCenter dataCenter = (DataCenter) c01gwLIZIZ.getValue();
        LJIILIIL(dataCenter, "REFRESH_COMMENT_LIST_SUCCESS", this);
        LJIILIIL(dataCenter, "REFRESH_COMMENT_LIST_FAIL", this);
        LJIILIIL(dataCenter, "LOAD_MORE_COMMENT_LIST_SUCCESS", this);
        LJIILIIL(dataCenter, "LOAD_MORE_COMMENT_LIST_FAIL", this);
        LikeListVM.BubbleBridge bubbleBridge = ((LikeListVM) c01gwLIZIZ2.getValue()).LL;
        bubbleBridge = bubbleBridge == null ? null : bubbleBridge;
        LJIILIIL(bubbleBridge, "REFRESH_LIKED_LIST_SUCCESS", this);
        LJIILIIL(bubbleBridge, "REFRESH_LIKED_LIST_FAIL", this);
        LJIILIIL(bubbleBridge, "LOAD_MORE_LIKED_LIST_SUCCESS", this);
        LJIILIIL(bubbleBridge, "LOAD_MORE_LIKED_LIST_FAIL", this);
        String str = c0sen.LIZJ;
        if (str != null) {
            ((LikeListVM) c01gwLIZIZ2.getValue()).LLJILJIL = str;
        }
        VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = ((VideoViewerListVM) c01gwLIZIZ3.getValue()).LLILLJJLI;
        VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel2 = bubbleVideoViewerViewModel != null ? bubbleVideoViewerViewModel : null;
        LJIILIIL(bubbleVideoViewerViewModel2, "REFRESH_VIDEO_VIEWER_HISTORY_SUCCESS", this);
        LJIILIIL(bubbleVideoViewerViewModel2, "REFRESH_VIDEO_VIEWER_HISTORY_FAIL", this);
        LJIILIIL(bubbleVideoViewerViewModel2, "LOAD_MORE_VIDEO_VIEWER_HISTORY_SUCCESS", this);
        LJIILIIL(bubbleVideoViewerViewModel2, "LOAD_MORE_VIDEO_VIEWER_HISTORY_FAIL", this);
    }

    @Override // X.AbstractC1356940lPo
    public final void LIZLLL(InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn, C331340Cyq c331340Cyq) {
        this.LLJJIII = interfaceC1364105Vn;
        int iLIZ = C729800Sjy.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("list load more cursor:");
        sbLIZ.append(c331340Cyq.LIZIZ);
        sbLIZ.append("  type:");
        sbLIZ.append(c331340Cyq.LIZ);
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        if (TextUtils.isEmpty(this.LLILLJJLI)) {
            InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn2 = this.LLJJIII;
            if (interfaceC1364105Vn2 != null) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                Exception exc = new Exception();
                c317290CcB.getClass();
                C316650Cb9 c316650Cb9 = new C316650Cb9(exc);
                C189200o6.m2constructorimpl(c316650Cb9);
                interfaceC1364105Vn2.resumeWith(c316650Cb9);
            }
            this.LLILZIL = false;
            return;
        }
        int i = c331340Cyq.LIZ;
        String authorUid = null;
        VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = null;
        LikeListVM.BubbleBridge bubbleBridge = null;
        if (i != 1) {
            if (i != 2) {
                VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel2 = ((VideoViewerListVM) this.LLJJI.getValue()).LLILLJJLI;
                if (bubbleVideoViewerViewModel2 != null) {
                    bubbleVideoViewerViewModel = bubbleVideoViewerViewModel2;
                }
                bubbleVideoViewerViewModel.CQ2(this.LLILLJJLI, c331340Cyq.LIZIZ, EnumC1233370iCV.BULLET.getValue());
                return;
            }
            LikeListVM.BubbleBridge bubbleBridge2 = ((LikeListVM) this.LLJJ.getValue()).LL;
            if (bubbleBridge2 != null) {
                bubbleBridge = bubbleBridge2;
            }
            bubbleBridge.CQ2(this.LLILLJJLI, c331340Cyq.LIZIZ);
            return;
        }
        CommentListViewModel commentListViewModel = (CommentListViewModel) this.LLJILLL.getValue();
        String str = this.LLILLJJLI;
        long cursor = c331340Cyq.LIZIZ.getCursor();
        Fragment fragmentLIZ = this.LLIZ.LIZ();
        Aweme aweme = this.LLILLL;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        }
        commentListViewModel.CQ2(str, cursor, iLIZ, fragmentLIZ, authorUid);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(com.ss.android.ugc.aweme.comment.model.CommentItemList r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1356930lPn.LJIIIZ(com.ss.android.ugc.aweme.comment.model.CommentItemList, boolean):void");
    }

    public final void LJIIJ(LikeListResponse likeListResponse, boolean z) {
        List<User> likeList = likeListResponse.getLikeList();
        if (likeList == null) {
            likeList = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(likeList, 10));
        for (User user : likeList) {
            this.LLJILJILJ.add(user.getUid());
            arrayList.add(new C0SQ6(user, Collections.singletonList(1001), "like", this.LL.getMMobEventParam(), false, 36));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleLikedListData data:hasmore:");
        sbLIZ.append(likeListResponse.getHasMore());
        sbLIZ.append(" likedListItems:");
        sbLIZ.append(arrayList2.size());
        sbLIZ.append(" currentLikeLoadTimes:");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(' ');
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ));
        Collection collection = this.LLJILJIL;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        List<? extends InterfaceC1891350zJl> listLJLIL = C13LP.LJLIL(arrayList2, collection);
        VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel = null;
        this.LLJILJIL = null;
        this.LLJ++;
        if (likeListResponse.getHasMore() && this.LLJ < 5) {
            C1344030l4z.LIZJ("TrackResume", "continua.resume 4");
            LJIIL(listLJLIL, new C331340Cyq(2, new PaginationCursor(likeListResponse.getCursor(), likeListResponse.getOffset())));
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("check enableVideoViewer ");
            sbLIZ2.append(LJIIIIZZ());
            C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ2));
            if (LJIIIIZZ()) {
                C1344030l4z.LIZJ("TrackResume", "continua.resume 5");
                this.LLJILJIL = listLJLIL;
                VideoViewerListVM.BubbleVideoViewerViewModel bubbleVideoViewerViewModel2 = ((VideoViewerListVM) this.LLJJI.getValue()).LLILLJJLI;
                if (bubbleVideoViewerViewModel2 != null) {
                    bubbleVideoViewerViewModel = bubbleVideoViewerViewModel2;
                }
                bubbleVideoViewerViewModel.CQ2(this.LLILLJJLI, new PaginationCursor(0L, 0L), EnumC1233370iCV.BULLET.getValue());
            } else {
                C1344030l4z.LIZJ("TrackResume", "continua.resume 6");
                InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn = this.LLJJIII;
                if (interfaceC1364105Vn != null) {
                    AbstractC316870CbV.LIZ.getClass();
                    C316640Cb8 c316640Cb8 = new C316640Cb8(listLJLIL);
                    C189200o6.m2constructorimpl(c316640Cb8);
                    interfaceC1364105Vn.resumeWith(c316640Cb8);
                }
                this.LLJJIII = null;
                this.LLILZIL = false;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handleLikedListData:powerItemssize:");
        sbLIZ3.append(arrayList2.size());
        C1344030l4z.LIZJ("CommentAndLikeListMgr", C2188811AlT.LIZIZ(sbLIZ3));
        if (z && (!arrayList2.isEmpty())) {
            this.LL.setBubbleDataReady(true);
            LJIILJJIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.13BV] */
    public final void LJIIJJI(ViewerListResponse viewerListResponse, boolean z) {
        ?? arrayList;
        if (viewerListResponse.getViewerList() == null) {
            arrayList = C13BV.INSTANCE;
        } else {
            List<User> viewerList = viewerListResponse.getViewerList();
            ArrayList arrayList2 = new ArrayList();
            for (User user : viewerList) {
                if (!this.LLJILJILJ.contains(user.getUid())) {
                    arrayList2.add(user);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0SQ6((User) it2.next(), Collections.singletonList(1002), "views", this.LL.getMMobEventParam(), false, 36));
            }
        }
        C1344030l4z.LIZJ("CommentAndLikeListMgr", "handleVideoViewerListData data:hasmore:" + viewerListResponse.getHasMore() + ' ' + arrayList.size() + " currentLikeLoadTimes:" + this.LLJ);
        Collection collection = this.LLJILJIL;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        List<? extends InterfaceC1891350zJl> listLJLIL = C13LP.LJLIL(arrayList, collection);
        this.LLJILJIL = null;
        this.LLJI++;
        if (viewerListResponse.getHasMore() && this.LLJI < 5) {
            C1344030l4z.LIZJ("TrackResume", "continua.resume 7");
            LJIIL(listLJLIL, new C331340Cyq(4, new PaginationCursor(viewerListResponse.getCursor(), viewerListResponse.getOffset())));
        } else {
            C1344030l4z.LIZJ("TrackResume", "continua.resume 8");
            InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn = this.LLJJIII;
            if (interfaceC1364105Vn != null) {
                AbstractC316870CbV.LIZ.getClass();
                C316640Cb8 c316640Cb8 = new C316640Cb8(listLJLIL);
                C189200o6.m2constructorimpl(c316640Cb8);
                interfaceC1364105Vn.resumeWith(c316640Cb8);
            }
            this.LLILZIL = false;
        }
        this.LLJJIII = null;
        C1344030l4z.LIZJ("CommentAndLikeListMgr", "handleVideoViewerListData:powerItemssize:" + arrayList.size());
        if (z && (!arrayList.isEmpty())) {
            this.LL.setBubbleDataReady(true);
            LJIILJJIL();
        }
    }

    public final void LJIIL(List<? extends InterfaceC1891350zJl> list, C331340Cyq c331340Cyq) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pendingItemAndTriggerNext ");
        sbLIZ.append(this.LL.getState().LJIIIIZZ());
        sbLIZ.append("  pendingsize ");
        sbLIZ.append(((ArrayList) list).size());
        C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC1364105Vn<? super AbstractC316870CbV<C331340Cyq>> interfaceC1364105Vn = this.LLJJIII;
        if (interfaceC1364105Vn != null) {
            C323380Cm0 c323380Cm0LJ = C317290CcB.LJ(AbstractC316870CbV.LIZ, null, c331340Cyq, list, 1);
            C189200o6.m2constructorimpl(c323380Cm0LJ);
            interfaceC1364105Vn.resumeWith(c323380Cm0LJ);
        }
        this.LLJJIII = null;
    }

    public final void LJIILIIL(DataCenter dataCenter, String str, Observer<C0RD4> observer) {
        dataCenter.xQ2(str, observer, C948503nH.LIZ(this.LL));
    }
}
