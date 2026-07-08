package X;

import Y.ACallableS426S0100000_21;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.api.IExposedCommentDataAbility;
import com.ss.android.ugc.aweme.comment.commentlist.util.CommentPageLoadTimer;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.comment.model.ButtonResource;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentEventModel;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentListModel;
import com.ss.android.ugc.aweme.comment.model.CommentSurprise;
import com.ss.android.ugc.aweme.comment.model.CommentSurpriseStruct;
import com.ss.android.ugc.aweme.comment.model.SurpriseResource;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.CommentSyncSharedVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentListAssemVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageContainer;
import com.ss.android.ugc.aweme.experiment.ReplyCommentLoadNumConfig;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3CommentConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import defpackage.d1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS5S1000100_6;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS668S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0l5H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1344210l5H {
    public static final /* synthetic */ int LJJJIL = 0;
    public final EnumC1342450l2R LIZ;
    public final CommentListAssemVM LIZIZ;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public boolean LJIIJJI;
    public long LJIIL;
    public C20607315kN LJIILIIL;
    public final C09YA LJIILJJIL;
    public Aweme LJIILL;
    public Comment LJIILLIIL;
    public InterfaceC665370Q7z LJIIZILJ;
    public C1157350gDt LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public final C736950SvV LJJ;
    public final C736950SvV LJJI;
    public final Set<String> LJJIFFI;
    public final List<String> LJJII;
    public final C01GW LJJIII;
    public IExposedCommentDataAbility LJJIIJ;
    public volatile boolean LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public volatile C1342890l39 LJJIJ;
    public LinkedHashSet<String> LJJIJIIJI;
    public final BPEAHandler LJJIJIIJIL;
    public CommentContextSource LJJIJIL;
    public boolean LJJIJL;
    public Integer LJJIJLIJ;
    public Integer LJJIL;
    public final List<C09AE> LJJIZ;
    public boolean LJJJ;
    public EnumC1342610l2h LJJJI;
    public final C1344230l5J LIZJ = new C1344230l5J();
    public final C0O8X LIZLLL = new C0O8X();
    public final C319260CfM LJ = new C319260CfM();
    public final C20600815jK<InterfaceC1891350zJl> LJIJ = new C20600815jK<>();
    public final C20600815jK<InterfaceC1891350zJl> LJIJI = new C20600815jK<>();

    public static void LJJIJIIJIL() {
        if (((Boolean) C305060BxY.LJ.getValue()).booleanValue()) {
            C20737016Cq.LIZ(new String[]{"start_jit_block"}, 500L, 4);
        }
        if (C305060BxY.LIZ()) {
            C20737016Cq.LIZ(new String[]{"start_boot_finish"}, 500L, 4);
        }
    }

    public final void LIZIZ() {
        for (C09AE c09ae : (ArrayList) this.LJJIZ) {
            if (!c09ae.isCompleted() && !c09ae.isCancelled()) {
                c09ae.LIZIZ(null);
            }
        }
        ((ArrayList) this.LJJIZ).clear();
    }

    public final C20600815jK<InterfaceC1891350zJl> LJI() {
        CommentContextSource commentContextSource = this.LJJIJIL;
        return (commentContextSource != null ? commentContextSource.getCurrSortType() : null) == this.LIZ ? this.LIZIZ.LLJILJIL : this.LJIJ;
    }

    public final C20600815jK<InterfaceC1891350zJl> LJIIIIZZ() {
        CommentContextSource commentContextSource = this.LJJIJIL;
        return (commentContextSource != null ? commentContextSource.getCurrSortType() : null) == this.LIZ ? this.LIZIZ.LLJIJIL : this.LJIJI;
    }

    public final boolean LJIIZILJ() {
        CommentCommonModel commonModel;
        CommentContextSource commentContextSource = this.LJJIJIL;
        boolean z = (commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || !commonModel.isNoPermissionVideoFromCommentHistory()) ? false : true;
        Aweme aweme = this.LJIILL;
        return ((aweme != null && aweme.isCmtSwt()) || C1017070cZd.LJJLIL(this.LJIILL)) && !z;
    }

    public final boolean LJIJ() {
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentContextSource commentContextSource = this.LJJIJIL;
        boolean z = (commentContextSource == null || (commonModel2 = commentContextSource.getCommonModel()) == null || !commonModel2.isNoPermissionVideoFromCommentHistory()) ? false : true;
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        return C1346420l8q.LIZ((commentContextSource2 == null || (commonModel = commentContextSource2.getCommonModel()) == null) ? null : Boolean.valueOf(commonModel.commentClose)) && !z;
    }

    public final boolean LJIJI() {
        Fragment fragment;
        WeakReference<Fragment> weakReference = this.LIZIZ.LLIZLLLIL;
        return weakReference == null || (fragment = weakReference.get()) == null || !fragment.isAdded() || fragment.isDetached() || fragment.getActivity() == null || C0R1H.LIZJ(fragment).compareTo(Lifecycle.State.INITIALIZED) <= 0;
    }

    public final boolean LJIILLIIL() {
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        if (C1345700l7g.LJII(LJI())) {
            return true;
        }
        return C1344890l6N.LIZIZ() && (c20600815jK = this.LIZIZ.LLJILJILJ) != null && (c20600815jK.LJII().isEmpty() ^ true);
    }

    public static List LJIIJJI(List list) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Comment comment = (Comment) obj;
                    C13LP.LJJJLZIJ(i2, list);
                    comment.setCurTextMaxLines(C1353700lKa.LIZJ());
                    comment.setCommentType(2);
                    C1340440kzC c1340440kzC = new C1340440kzC(comment, C1340060kya.LIZ(2, comment, false));
                    c1340440kzC.LLILZLL.LJIJJ = C1345700l7g.LJIILJJIL(comment);
                    if (C07CD.LIZ()) {
                        Integer foldStatus = comment.getFoldStatus();
                        int value = EnumC1341640l18.FOLD.getValue();
                        if (foldStatus != null && foldStatus.intValue() == value) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c1340440kzC.LLILZLL.LJIJI = z;
                    }
                    arrayList.add(c1340440kzC);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }

    public static void LJJIII(CommentItemList commentItemList) {
        LogPbBean logPbBean;
        List<Comment> replyComments;
        List<Comment> list = commentItemList.items;
        if (list != null && !C086I.LIZIZ(list) && (logPbBean = commentItemList.logPd) != null) {
            for (Comment comment : list) {
                if (comment != null) {
                    comment.setLogPb(commentItemList.logPd);
                }
                if (((Boolean) C1342930l3D.LIZIZ.getValue()).booleanValue() && (replyComments = comment.getReplyComments()) != null) {
                    for (Comment comment2 : replyComments) {
                        if (comment2 != null) {
                            comment2.setLogPb(logPbBean);
                        }
                    }
                }
            }
        }
    }

    public final int LJII(Comment comment) {
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI;
        C1340440kzC c1340440kzC;
        Comment comment2;
        if (comment == null || (c20600815jKLJI = LJI()) == null) {
            return -1;
        }
        int i = 0;
        if (comment.getCommentType() == 2) {
            int i2 = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) c20600815jKLJI.LJII()) {
                if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), comment.getRootCommentId())) {
                    if (i2 == -1) {
                        return -1;
                    }
                    int iLJIIIIZZ = c20600815jKLJI.LJIIIIZZ() - 1;
                    for (int i3 = i2 + 1; i3 < iLJIIIIZZ; i3++) {
                        InterfaceC1891350zJl interfaceC1891350zJlLJI = c20600815jKLJI.LJI(i3);
                        String cid = null;
                        if ((interfaceC1891350zJlLJI instanceof C1340440kzC) && (c1340440kzC = (C1340440kzC) interfaceC1891350zJlLJI) != null && (comment2 = c1340440kzC.LLILZIL) != null) {
                            cid = comment2.getCid();
                        }
                        if (Intrinsics.LJFF(cid, comment.getCid())) {
                            return (i3 - i2) - 1;
                        }
                        if (c20600815jKLJI.LJI(i3) instanceof C1340820kzo) {
                            return -1;
                        }
                    }
                    return -1;
                }
                i2++;
            }
            return -1;
        }
        List<InterfaceC1891350zJl> listLJII = c20600815jKLJI.LJII();
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl2 : listLJII) {
            if (interfaceC1891350zJl2 instanceof C1340400kz8) {
                arrayList.add(interfaceC1891350zJl2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof C1340440kzC)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((AbstractC1049450dPr) it2.next()).LIZ().getCid(), comment.getCid())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void LJIILIIL(boolean z) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        String authorUid;
        String str;
        Aweme aweme;
        Aweme aweme2;
        boolean z2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        CommentCommonModel commonModel3;
        CommentCommonModel commonModel4;
        String authorUid2 = null;
        if (LJIILLIIL()) {
            C1340510kzJ c1340510kzJ = C1340510kzJ.LIZ;
            CommentContextSource commentContextSource = this.LJJIJIL;
            c1340510kzJ.getClass();
            if (C1340510kzJ.LIZIZ(commentContextSource)) {
                LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
                this.LIZIZ.runOnUIThread(new AwS600S0100000_21(this, 219));
                return;
            }
        }
        this.LIZIZ.runOnUIThread(new AwS600S0100000_21(this, 207));
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null && (commonModel4 = commentContextSource2.getCommonModel()) != null) {
            boolValueOf = Boolean.valueOf(commonModel4.isNoPermissionVideoFromCommentHistory());
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf) && LJIILLIIL()) {
            LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
            return;
        }
        CommentContextSource commentContextSource3 = this.LJJIJIL;
        if (commentContextSource3 != null && (commonModel3 = commentContextSource3.getCommonModel()) != null) {
            boolValueOf2 = Boolean.valueOf(commonModel3.isNoPermissionVideoFromCommentHistory());
        } else {
            boolValueOf2 = null;
        }
        if (C1346420l8q.LIZJ(boolValueOf2) && !LJIILLIIL()) {
            LJJIIZI(EnumC1342430l2P.COMMENT_EMPTY, EnumC1342610l2h.MATCH_PARENT, null);
            return;
        }
        CommentContextSource commentContextSource4 = this.LJJIJIL;
        if ((commentContextSource4 != null && (commonModel2 = commentContextSource4.getCommonModel()) != null && !commonModel2.enableComment) || C1017070cZd.LJJLIL(this.LJIILL)) {
            LJJIIZI(EnumC1342430l2P.AD_FORBID, EnumC1342610l2h.MATCH_PARENT, null);
            return;
        }
        CommentContextSource commentContextSource5 = this.LJJIJIL;
        if (commentContextSource5 != null && (commonModel = commentContextSource5.getCommonModel()) != null) {
            boolValueOf3 = Boolean.valueOf(commonModel.commentClose);
        } else {
            boolValueOf3 = null;
        }
        if (C1346420l8q.LIZ(boolValueOf3) && !C1348690lCV.LIZLLL(this.LJIILL)) {
            LJJIIZI(EnumC1342430l2P.COMMENT_CLOSE, EnumC1342610l2h.MATCH_PARENT, null);
            return;
        }
        if (z) {
            if (!LJIILLIIL() && (z2 = this.LJIIIIZZ)) {
                if (!C1347490lAZ.LIZJ(this.LJIILL, this.LJIIIZ, z2)) {
                    return;
                }
                LJJIIZI(EnumC1342430l2P.FILTER_STATUS, EnumC1342610l2h.MATCH_PARENT, null);
                LJIJJLI(this.LJIIIZ);
                return;
            }
            if (!LJIILLIIL() && (!C04W6.LIZ() || !this.LJIIJJI)) {
                if (this.LJI && ((Number) C1107104Ur.LIZ.getValue()).intValue() == 1) {
                    LJJIIZI(EnumC1342430l2P.COMMENT_DISLIKE, EnumC1342610l2h.MATCH_PARENT, null);
                    return;
                } else {
                    LJJIIZI(EnumC1342430l2P.COMMENT_EMPTY, EnumC1342610l2h.MATCH_PARENT, null);
                    return;
                }
            }
        }
        if (!this.LJFF) {
            if (this.LJIIJJI) {
                LJJIIZI(EnumC1342430l2P.FOLD, EnumC1342610l2h.WARP_CONTENT, new C1344280l5O(new C1220590hrt(this.LJIIL, 4, null, null, null, 0, 60), null, 2));
                C2344009Gk c2344009Gk = new C2344009Gk();
                CommentContextSource commentContextSource6 = this.LJJIJIL;
                if (commentContextSource6 != null && (aweme2 = CommentContextSourceKt.aweme(commentContextSource6)) != null) {
                    authorUid = AwemeExtKt.getAuthorUid(aweme2);
                } else {
                    authorUid = null;
                }
                if (C10EU.LJIIZILJ(authorUid)) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c2344009Gk.LJIIIIZZ("is_item_author", str);
                CommentContextSource commentContextSource7 = this.LJJIJIL;
                if (commentContextSource7 != null && (aweme = CommentContextSourceKt.aweme(commentContextSource7)) != null) {
                    authorUid2 = AwemeExtKt.getAuthorUid(aweme);
                }
                c2344009Gk.LJIIIIZZ("author_id", authorUid2);
                C20684815ws.LJIILLIIL("hidden_comment_entrance_show", c2344009Gk.LIZ);
                return;
            }
            if (C1347490lAZ.LIZJ(this.LJIILL, this.LJIIIZ, this.LJIIIIZZ)) {
                LJJIIZI(EnumC1342430l2P.FILTER_FOOTER, EnumC1342610l2h.NORMAL_FOOTER, null);
                LJIJJLI(this.LJIIIZ);
                return;
            }
        }
        if (!z && !LJIILLIIL() && this.LJI && ((Number) C1107104Ur.LIZ.getValue()).intValue() == 1) {
            LJJIIZI(EnumC1342430l2P.COMMENT_DISLIKE, EnumC1342610l2h.MATCH_PARENT, null);
            return;
        }
        if (!this.LJFF) {
            if (!Intrinsics.LJFF(CommentContextSourceKt.fromPage(this.LJJIJIL), "graphic_detail")) {
                LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
                return;
            } else {
                LJJIIZI(EnumC1342430l2P.POST_MODE_FULL_PAGE_LOAD_COMPLETE, EnumC1342610l2h.DEFAULT, null);
                return;
            }
        }
        LJJIIZI(EnumC1342430l2P.DEFAULT, EnumC1342610l2h.DEFAULT, null);
    }

    public final void LJIJJLI(int i) {
        String str;
        Aweme aweme;
        String aid;
        String str2 = "";
        if (i == 0) {
            str = "2";
        } else if (i != 2) {
            str = "";
        } else {
            str = "1";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        CommentContextSource commentContextSource = this.LJJIJIL;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str2);
        c2344009Gk.LJIIIIZZ("reminder_degree", str);
        c2344009Gk.LJIIIIZZ("reminder_status", "2");
        C20684815ws.LJIILLIIL("filtered_comment_review_byvideo_sw", c2344009Gk.LIZ);
    }

    public final void LJJIIJ(CommentItemList commentItemList) {
        List<Comment> list;
        List<Comment> list2;
        List<Comment> list3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (commentItemList != null && (list3 = commentItemList.items) != null) {
            int i = 0;
            for (Comment comment : list3) {
                int i2 = i + 1;
                if (i >= 0) {
                    Comment comment2 = comment;
                    if (!this.LJJIJIIJI.contains(comment2.getCid()) && !linkedHashSet.contains(comment2.getCid())) {
                        linkedHashSet.add(comment2.getCid());
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Iterator it2 = C13LP.LJLLL(arrayList).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (commentItemList != null && (list = commentItemList.items) != null && C1697810uHb.LJIIIZ(list).LJLJL(iIntValue) && (list2 = commentItemList.items) != null) {
                ListProtector.remove(list2, iIntValue);
            }
        }
    }

    public final void LJJIIJZLJL(List<InterfaceC1891350zJl> list) {
        for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) list) {
            if (interfaceC1891350zJl instanceof C1340400kz8) {
                AbstractC1049450dPr abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl;
                if (abstractC1049450dPr.LIZ().hasFirstCommentTag) {
                    if (this.LJJJ) {
                        abstractC1049450dPr.LIZ().resetFirstCommentTag();
                    } else {
                        this.LJJJ = true;
                    }
                }
            }
        }
    }

    public final void LJJIJIL(CommentItemList commentItemList) {
        String aid;
        long j;
        int size;
        String aid2;
        boolean z;
        Object obj;
        Long lValueOf;
        int size2;
        Object obj2;
        int size3;
        Integer numValueOf;
        Integer numValueOf2;
        LogPbBean logPbBean;
        String imprId;
        List<Comment> list;
        Long lValueOf2;
        List<Comment> list2;
        String aid3;
        List<Comment> list3;
        List<Comment> list4;
        List<Comment> list5;
        C1344230l5J c1344230l5J = this.LIZJ;
        c1344230l5J.LIZ.put("Duration", String.valueOf(System.currentTimeMillis() - c1344230l5J.LIZIZ));
        C1344230l5J c1344230l5J2 = this.LIZJ;
        Aweme aweme = this.LJIILL;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c1344230l5J2.LIZ.put("GroupId", aid);
        this.LIZJ.LIZ.put("MethodName", "v2");
        C1344230l5J c1344230l5J3 = this.LIZJ;
        long j2 = 0;
        if (commentItemList != null) {
            j = commentItemList.total;
        } else {
            j = 0;
        }
        c1344230l5J3.LIZ.put("TotalCount", String.valueOf(j));
        C1344230l5J c1344230l5J4 = this.LIZJ;
        if (commentItemList != null && (list5 = commentItemList.items) != null) {
            size = list5.size();
        } else {
            size = 0;
        }
        c1344230l5J4.LIZ.put("ActualReturnCount", String.valueOf(size));
        C1344230l5J c1344230l5J5 = this.LIZJ;
        if (commentItemList != null) {
            j2 = commentItemList.cursor;
        }
        c1344230l5J5.LIZ.put("Offset", String.valueOf(j2));
        if (commentItemList != null) {
            this.LIZJ.LIZ(commentItemList);
        }
        C1344230l5J c1344230l5J6 = this.LIZJ;
        if (!c1344230l5J6.LIZ.containsKey("UserId") && ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            c1344230l5J6.LIZ.put("UserId", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        if (!c1344230l5J6.LIZ.containsKey("DeviceId")) {
            c1344230l5J6.LIZ.put("DeviceId", DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId());
        }
        try {
            C794240VDq.LIZJ("aweme_comment_list_api_monitor_log", new JSONObject(C2097608Jq.LJIIZILJ(c1344230l5J6.LIZ)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZLLL.LIZ();
        C0O8X c0o8x = this.LIZLLL;
        Aweme aweme2 = this.LJIILL;
        if (aweme2 != null) {
            aid2 = aweme2.getAid();
        } else {
            aid2 = null;
        }
        c0o8x.LIZJ(aid2, "gid");
        C0O8X c0o8x2 = this.LIZLLL;
        if (commentItemList != null && (list4 = commentItemList.items) != null && !list4.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        c0o8x2.LIZIZ(obj, "is_empty");
        C0O8X c0o8x3 = this.LIZLLL;
        if (commentItemList != null) {
            lValueOf = Long.valueOf(commentItemList.total);
        } else {
            lValueOf = null;
        }
        c0o8x3.LIZJ(lValueOf, "rsp_total");
        C0O8X c0o8x4 = this.LIZLLL;
        if (commentItemList != null && (list3 = commentItemList.items) != null) {
            size2 = list3.size();
        } else {
            size2 = 0;
        }
        c0o8x4.LIZJ(Integer.valueOf(size2), "rsp_count");
        this.LIZLLL.LIZLLL(commentItemList);
        this.LIZLLL.LJFF();
        C319260CfM c319260CfM = this.LJ;
        c319260CfM.LIZIZ.put("duration", String.valueOf(System.currentTimeMillis() - c319260CfM.LIZJ));
        C319260CfM c319260CfM2 = this.LJ;
        Aweme aweme3 = this.LJIILL;
        if (aweme3 != null && (aid3 = aweme3.getAid()) != null) {
            c319260CfM2.LIZIZ.put("gid", aid3);
        } else {
            c319260CfM2.getClass();
        }
        C319260CfM c319260CfM3 = this.LJ;
        if (commentItemList == null || (list2 = commentItemList.items) == null || list2.isEmpty()) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        c319260CfM3.LIZ(obj2, "is_empty");
        C319260CfM c319260CfM4 = this.LJ;
        if (commentItemList != null && (lValueOf2 = Long.valueOf(commentItemList.total)) != null) {
            c319260CfM4.LIZIZ.put("rsp_total", lValueOf2);
        } else {
            c319260CfM4.getClass();
        }
        C319260CfM c319260CfM5 = this.LJ;
        if (commentItemList != null && (list = commentItemList.items) != null) {
            size3 = list.size();
        } else {
            size3 = 0;
        }
        Integer numValueOf3 = Integer.valueOf(size3);
        if (numValueOf3 != null) {
            c319260CfM5.LIZIZ.put("rsp_count", numValueOf3);
        } else {
            c319260CfM5.getClass();
        }
        C319260CfM c319260CfM6 = this.LJ;
        c319260CfM6.getClass();
        if ((commentItemList instanceof BaseCommentResponse) && (logPbBean = commentItemList.logPd) != null && (imprId = logPbBean.getImprId()) != null) {
            c319260CfM6.LIZIZ.put("log_id", imprId);
        }
        if (commentItemList != null && commentItemList.status_code == 0) {
            c319260CfM6.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1");
        } else {
            c319260CfM6.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT);
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = c319260CfM6.LIZ;
        if (commentItemList != null) {
            numValueOf = Integer.valueOf(commentItemList.status_code);
        } else {
            numValueOf = null;
        }
        concurrentHashMap.put("status_code", String.valueOf(numValueOf));
        ConcurrentHashMap<String, Object> concurrentHashMap2 = c319260CfM6.LIZ;
        if (commentItemList != null) {
            numValueOf2 = Integer.valueOf(commentItemList.error_code);
        } else {
            numValueOf2 = null;
        }
        concurrentHashMap2.put("error_code", String.valueOf(numValueOf2));
        this.LJ.LIZIZ();
    }

    public final void LJJIJL(Throwable th) {
        C844470XAv.LIZ.getClass();
        int iLIZ = C1498560p6E.LIZ(C844470XAv.LIZ(), th);
        this.LIZLLL.LJI(iLIZ);
        C319260CfM c319260CfM = this.LJ;
        c319260CfM.LIZ(CardStruct.IStatusCode.DEFAULT, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c319260CfM.LIZ(Integer.valueOf(iLIZ), "error_code");
        c319260CfM.LIZ("-1", "status_code");
        c319260CfM.LIZIZ();
        C844470XAv.LIZ();
        try {
            if (C036E.LIZ.LIZIZ()) {
                C1344530l5n.LIZ.getClass();
                C1344530l5n.LIZ(iLIZ, "fetch", th);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJJIL(List<? extends InterfaceC1891350zJl> list) {
        C1340430kzB c1340430kzB;
        Comment comment;
        String cid;
        Object objLJJJLIIL;
        ArrayList<InterfaceC1891350zJl> arrayList = (ArrayList) list;
        int size = (this.LJJIJIIJI.size() + arrayList.size()) - 100;
        if (size > 0) {
            int i = 0;
            do {
                if (this.LJJIJIIJI.size() > 0 && (objLJJJLIIL = C13LP.LJJJLIIL(this.LJJIJIIJI)) != null) {
                    this.LJJIJIIJI.remove(objLJJJLIIL);
                }
                i++;
            } while (i < size);
        }
        LinkedHashSet<String> linkedHashSet = this.LJJIJIIJI;
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1891350zJl interfaceC1891350zJl : arrayList) {
            if ((interfaceC1891350zJl instanceof C1340430kzB) && (c1340430kzB = (C1340430kzB) interfaceC1891350zJl) != null && (comment = c1340430kzB.LLILZIL) != null && (cid = comment.getCid()) != null) {
                arrayList2.add(cid);
            }
        }
        linkedHashSet.addAll(arrayList2);
    }

    public final void LJJIZ(boolean z) {
        ArrayList arrayList;
        String strEventType;
        String strEventType2;
        C20600815jK<InterfaceC1891350zJl> c20600815jK;
        Iterable iterableSingletonList;
        Iterable iterableSingletonList2;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = LJI();
        ArrayList arrayList2 = null;
        if (c20600815jKLJI != null) {
            List<InterfaceC1891350zJl> listLJII = c20600815jKLJI.LJII();
            arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) listLJII) {
                if (interfaceC1891350zJl instanceof C1340400kz8) {
                    iterableSingletonList2 = Collections.singletonList(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ());
                } else if (interfaceC1891350zJl instanceof C1340820kzo) {
                    iterableSingletonList2 = ((C1340820kzo) interfaceC1891350zJl).LLILZ.LIZJ;
                } else {
                    iterableSingletonList2 = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterableSingletonList2, arrayList);
            }
        } else {
            arrayList = null;
        }
        if (((Number) C294300BgC.LIZ.getValue()).intValue() > 0 && (c20600815jK = this.LIZIZ.LLJILJIL) != null) {
            List<InterfaceC1891350zJl> listLJII2 = c20600815jK.LJII();
            arrayList2 = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) listLJII2) {
                if (interfaceC1891350zJl2 instanceof C1340400kz8) {
                    iterableSingletonList = Collections.singletonList(((AbstractC1049450dPr) interfaceC1891350zJl2).LIZ());
                } else if (interfaceC1891350zJl2 instanceof C1340820kzo) {
                    iterableSingletonList = ((C1340820kzo) interfaceC1891350zJl2).LLILZ.LIZJ;
                } else {
                    iterableSingletonList = C13BV.INSTANCE;
                }
                C19719612Di.LJJI(iterableSingletonList, arrayList2);
            }
        }
        if (arrayList != null) {
            InterfaceC1344290l5P interfaceC1344290l5P = (InterfaceC1344290l5P) this.LJJIII.getValue();
            CommentContextSource commentContextSource = this.LJJIJIL;
            String str = "";
            if (commentContextSource == null || (strEventType = CommentContextSourceKt.eventType(commentContextSource)) == null) {
                strEventType = "";
            }
            interfaceC1344290l5P.LJFF(strEventType, false, arrayList);
            if (arrayList2 != null) {
                InterfaceC1344290l5P interfaceC1344290l5P2 = (InterfaceC1344290l5P) this.LJJIII.getValue();
                CommentContextSource commentContextSource2 = this.LJJIJIL;
                if (commentContextSource2 != null && (strEventType2 = CommentContextSourceKt.eventType(commentContextSource2)) != null) {
                    str = strEventType2;
                }
                interfaceC1344290l5P2.LJFF(str, false, arrayList2);
            }
            if (z) {
                CommentListAssemVM commentListAssemVM = this.LIZIZ;
                C291001Au c291001Au = new C291001Au(Unit.LIZ);
                commentListAssemVM.getClass();
                commentListAssemVM.setState(new AwS583S0100000_4(c291001Au, (C291001Au<C1341850l1T>) 199));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1344210l5H(EnumC1342450l2R enumC1342450l2R, CommentListAssemVM commentListAssemVM) {
        HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory;
        this.LIZ = enumC1342450l2R;
        this.LIZIZ = commentListAssemVM;
        this.LJIILJJIL = new C09YA(commentListAssemVM, AFwS209S0000000_21.get$arr$(427));
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CommentSyncSharedVM.class);
        AFwS259S0000000_21 aFwS259S0000000_21 = AFwS259S0000000_21.get$arr$(314);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        C1622206Wu c1622206WuLJII = C724750Sbp.LJII(commentListAssemVM);
        boolean z = commentListAssemVM instanceof HasDefaultViewModelProviderFactory;
        if (z) {
            hasDefaultViewModelProviderFactory = (HasDefaultViewModelProviderFactory) commentListAssemVM;
        } else {
            hasDefaultViewModelProviderFactory = null;
        }
        this.LJJ = new C736950SvV(c19719912DlLIZ, null, c452070Ho5, c1622206WuLJII, C1220000hqw.LIZ(hasDefaultViewModelProviderFactory), aFwS259S0000000_21, null, null, null);
        this.LJJI = new C736950SvV(C13LE.LIZ(CommentPollViewModel.class), null, c452070Ho5, C724750Sbp.LJII(commentListAssemVM), C1220000hqw.LIZ(z ? (HasDefaultViewModelProviderFactory) commentListAssemVM : null), AFwS259S0000000_21.get$arr$(315), null, null, null);
        this.LJJIFFI = new LinkedHashSet();
        this.LJJII = new ArrayList();
        this.LJJIII = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(426));
        this.LJJIIJZLJL = true;
        this.LJJIJIIJI = new LinkedHashSet<>();
        this.LJJIJIIJIL = new BPEAHandler(Looper.getMainLooper());
        this.LJJIZ = new ArrayList();
        this.LJJJI = EnumC1342610l2h.MATCH_PARENT;
    }

    public static void LJFF(String str, List list) {
        C0HD9 c0hd9LJIL;
        int size = ((ArrayList) list).size();
        for (int i = 0; i < size; i++) {
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(list, i);
            if (interfaceC1891350zJl instanceof C1340400kz8) {
                AbstractC1049450dPr abstractC1049450dPrLIZLLL = (AbstractC1049450dPr) interfaceC1891350zJl;
                String cid = abstractC1049450dPrLIZLLL.LIZ().getCid();
                if (cid != null && (c0hd9LJIL = C1360460lVU.LIZIZ.LJIL(str, cid)) != null) {
                    if (abstractC1049450dPrLIZLLL instanceof C1340430kzB) {
                        C1340430kzB c1340430kzB = (C1340430kzB) interfaceC1891350zJl;
                        abstractC1049450dPrLIZLLL = C1340430kzB.LJ(c1340430kzB, C1340410kz9.LIZ(c1340430kzB.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9LJIL, 12582911));
                    } else if (abstractC1049450dPrLIZLLL instanceof C1340440kzC) {
                        C1340440kzC c1340440kzC = (C1340440kzC) interfaceC1891350zJl;
                        abstractC1049450dPrLIZLLL = C1340440kzC.LJ(c1340440kzC, C1340410kz9.LIZ(c1340440kzC.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9LJIL, 12582911));
                    } else if (abstractC1049450dPrLIZLLL instanceof C1340450kzD) {
                        C1340450kzD c1340450kzD = (C1340450kzD) interfaceC1891350zJl;
                        abstractC1049450dPrLIZLLL = C1340450kzD.LIZLLL(c1340450kzD, C1340410kz9.LIZ(c1340450kzD.LLILZLL, false, false, 0, 0.0f, null, false, false, false, null, c0hd9LJIL, 12582911));
                    }
                    ListProtector.set(list, i, abstractC1049450dPrLIZLLL);
                }
            }
        }
    }

    public static boolean LJIJJ(Comment comment, C1340820kzo c1340820kzo) {
        if (comment.getCommentType() == 1 && comment.getReplyComments() == null && comment.getReplyCommentTotal() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("add margin bottom in first comment:");
            sbLIZ.append(comment.getText());
            C2188811AlT.LIZIZ(sbLIZ);
            return true;
        }
        if (comment.getCommentType() == 2) {
            if (c1340820kzo != null && c1340820kzo.LIZ() == 4) {
                return false;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("add margin bottom in second comment:");
            sbLIZ2.append(comment.getText());
            C2188811AlT.LIZIZ(sbLIZ2);
            return true;
        }
        return false;
    }

    public static void LJJIJIIJI(List list, boolean z) {
        C1340820kzo c1340820kzo;
        C1340830kzp c1340830kzp;
        Comment comment;
        C1340820kzo c1340820kzo2;
        C1340830kzp c1340830kzp2;
        C1340820kzo c1340820kzo3;
        C1340830kzp c1340830kzp3;
        if (z && C292290Bcx.LIZJ() && (C292290Bcx.LIZ() == 2 || C292290Bcx.LIZ() == 7)) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : (ArrayList) list) {
                if ((interfaceC1891350zJl instanceof C1340820kzo) && (c1340820kzo3 = (C1340820kzo) interfaceC1891350zJl) != null && (c1340830kzp3 = c1340820kzo3.LLILZ) != null) {
                    c1340830kzp3.LJIIJJI = true;
                }
            }
            return;
        }
        if (C292290Bcx.LIZJ() && C292290Bcx.LIZ() == 1) {
            for (InterfaceC1891350zJl interfaceC1891350zJl2 : (ArrayList) list) {
                if ((interfaceC1891350zJl2 instanceof C1340820kzo) && (c1340820kzo2 = (C1340820kzo) interfaceC1891350zJl2) != null && (c1340830kzp2 = c1340820kzo2.LLILZ) != null) {
                    c1340830kzp2.LJIIJJI = true;
                }
            }
            return;
        }
        C844470XAv.LIZ.getClass();
        if (!C804420Vh2.LJI(C844470XAv.LIZ())) {
            return;
        }
        for (InterfaceC1891350zJl interfaceC1891350zJl3 : (ArrayList) list) {
            if ((interfaceC1891350zJl3 instanceof C1340820kzo) && (c1340820kzo = (C1340820kzo) interfaceC1891350zJl3) != null && (c1340830kzp = c1340820kzo.LLILZ) != null && (comment = c1340830kzp.LJI) != null && Intrinsics.LJFF(comment.getCanPreloadFromServerScore(), Boolean.TRUE)) {
                c1340820kzo.LLILZ.LJIIJJI = true;
            }
        }
    }

    public final void LIZ(List<InterfaceC1891350zJl> list, C1340820kzo c1340820kzo) {
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addTranslationCTABanner powerItemList size:");
        sbLIZ.append(list.size());
        C2188811AlT.LIZIZ(sbLIZ);
        if (C1839820xye.LIZ().LJFF() == -1 && (!list.isEmpty()) && C161T.LIZ().LIZ() && C0BJA.LIZIZ() && !C0S58.LIZ) {
            int i = 0;
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                int i2 = i + 1;
                String strEnterFrom = null;
                if (i >= 0) {
                    InterfaceC1891350zJl interfaceC1891350zJl2 = interfaceC1891350zJl;
                    if ((interfaceC1891350zJl2 instanceof C1340400kz8) && (abstractC1049450dPr = (AbstractC1049450dPr) interfaceC1891350zJl2) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null && (commentLIZ.isTranslated() || C161N.LIZIZ.LJIILLIIL(commentLIZ, EnumC715680S5m.NOT_OVERWRITTEN))) {
                        ListProtector.add(list, i2, new C1344400l5a(commentLIZ, this.LJJIJIL, LJIJJ(commentLIZ, c1340820kzo)));
                        C1839820xye.LIZ().LJIIIZ(0);
                        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                        CommentContextSource commentContextSource = this.LJJIJIL;
                        if (commentContextSource != null) {
                            strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
                        }
                        c1350920lG6.getClass();
                        C1350920lG6.LJJL(commentLIZ, strEnterFrom);
                        return;
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void LJ(C1340820kzo c1340820kzo, boolean z) {
        String strEnterFrom;
        Aweme aweme;
        String strEventType;
        List<String> arrayList;
        ReplyCommentLoadNumConfig replyCommentLoadNumConfig;
        int iLIZIZ;
        CommentListModel listModel;
        if (!this.LJJIFFI.contains(c1340820kzo.LLILLJJLI)) {
            this.LJJIFFI.add(c1340820kzo.LLILLJJLI);
            CommentContextSource commentContextSource = this.LJJIJIL;
            if (commentContextSource != null) {
                strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
            } else {
                strEnterFrom = null;
            }
            C1340830kzp c1340830kzp = c1340820kzo.LLILZ;
            LJJIJLIJ(c1340830kzp.LIZLLL, strEnterFrom, c1340830kzp.LJFF, "ttk_comment_list_reply_api_monitor");
            String str = c1340820kzo.LLILLJJLI;
            long j = c1340820kzo.LLILZ.LJFF;
            int iLIZ = c1340820kzo.LIZ();
            C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = LJI();
            long j2 = c1340820kzo.LLILZ.LJ - ((long) c1340820kzo.LL);
            CommentContextSource commentContextSource2 = this.LJJIJIL;
            if (commentContextSource2 != null) {
                aweme = CommentContextSourceKt.aweme(commentContextSource2);
            } else {
                aweme = null;
            }
            CommentContextSource commentContextSource3 = this.LJJIJIL;
            if (commentContextSource3 != null) {
                strEventType = CommentContextSourceKt.eventType(commentContextSource3);
            } else {
                strEventType = null;
            }
            CommentContextSource commentContextSource4 = this.LJJIJIL;
            if (commentContextSource4 == null || (listModel = commentContextSource4.getListModel()) == null || (arrayList = listModel.getHighlightedWord()) == null) {
                arrayList = new ArrayList<>();
            }
            if (c20600815jKLJI == null) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchSecondaryComment start ");
            sbLIZ.append(str);
            sbLIZ.append("  cursor:");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            C1346160l8Q c1346160l8Q = C1346170l8R.LIZ;
            C1346170l8R.LIZIZ(c1340820kzo.LLILZ.LIZJ, true);
            C01GW c01gw = C1340880kzu.LIZIZ;
            ReplyCommentLoadNumConfig replyCommentLoadNumConfig2 = (ReplyCommentLoadNumConfig) c01gw.getValue();
            if ((replyCommentLoadNumConfig2 != null && replyCommentLoadNumConfig2.replyCommentFirstPageLoadNum > 0) || ((replyCommentLoadNumConfig = (ReplyCommentLoadNumConfig) c01gw.getValue()) != null && replyCommentLoadNumConfig.replyCommentNonFirstPageLoadNum > 0)) {
                iLIZIZ = c1340820kzo.LLILZ.LIZLLL;
            } else {
                C01GW c01gw2 = C277950Auv.LIZ;
                if (((Number) c01gw2.getValue()).intValue() != 1 && ((Number) c01gw2.getValue()).intValue() != 4) {
                    iLIZIZ = c1340820kzo.LLILZ.LIZLLL;
                } else {
                    iLIZIZ = c1340820kzo.LLILZ.LIZLLL + (C292290Bcx.LIZIZ() * 2);
                }
            }
            ((ArrayList) this.LJJIZ).add(C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZIZ), null, null, new C1220620hrw(str, this, c1340820kzo, iLIZIZ, aweme, strEventType, arrayList, z, c20600815jKLJI, j2, iLIZ, null), 3));
            return;
        }
        if (!z) {
            ((ArrayList) this.LJJII).add(c1340820kzo.LLILLJJLI);
        }
    }

    public final void LJIIL(boolean z, Exception exc) {
        if (z) {
            LJJIIZI(EnumC1342430l2P.REFRESH_ERR, EnumC1342610l2h.MATCH_PARENT, new C1344280l5O(null, exc, 1));
        } else {
            LJJIIZI(EnumC1342430l2P.LOAD_MORE_ERR, EnumC1342610l2h.NORMAL_FOOTER, null);
        }
    }

    public final void LJIL(C1340820kzo c1340820kzo, long j) {
        String aid;
        String cid;
        Integer numValueOf;
        Integer numValueOf2;
        String uid;
        String str;
        Integer numValueOf3;
        String str2;
        String authorUid;
        String sessionId;
        int i;
        int i2;
        String sessionId2;
        Aweme aweme;
        CommentCommonModel commonModel;
        Activity activityLIZIZ;
        CommentEventModel eventModel;
        User user;
        CommentEventModel eventModel2;
        C1340830kzp c1340830kzp = c1340820kzo.LLILZ;
        int i3 = 1;
        int i4 = c1340830kzp.LJIIJ + 1;
        c1340830kzp.LJIIJ = i4;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSource = this.LJJIJIL;
        Comment comment = c1340830kzp.LJI;
        c1350920lG6.getClass();
        String strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSource);
        Aweme aweme2 = CommentContextSourceKt.aweme(commentContextSource);
        EnumC1342450l2R currSortType = null;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        C2344009Gk c2344009GkLJIIIZ = C1350920lG6.LJIIIZ(strEnterFrom, aid);
        if (comment != null) {
            cid = comment.getCid();
        } else {
            cid = null;
        }
        c2344009GkLJIIIZ.LJFF("parent_comment_id", cid);
        c2344009GkLJIIIZ.LIZJ(i4, "click_cnt");
        Aweme aweme3 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme3 != null) {
            numValueOf = Integer.valueOf(aweme3.getAwemeType());
        } else {
            numValueOf = null;
        }
        c2344009GkLJIIIZ.LJ(numValueOf, "aweme_type");
        if (commentContextSource != null && (eventModel2 = commentContextSource.getEventModel()) != null) {
            numValueOf2 = Integer.valueOf(eventModel2.hasTitle);
        } else {
            numValueOf2 = null;
        }
        c2344009GkLJIIIZ.LJ(numValueOf2, "has_title");
        if (comment != null && (user = comment.getUser()) != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        c2344009GkLJIIIZ.LJFF("parent_comment_author_uid", uid);
        c2344009GkLJIIIZ.LIZLLL(j, "reply_comment_cnt");
        if (commentContextSource != null && (eventModel = commentContextSource.getEventModel()) != null && eventModel.isFromPostMode()) {
            str = "graphic_detail";
        } else {
            str = "";
        }
        c2344009GkLJIIIZ.LJFF("from_page", str);
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            numValueOf3 = Integer.valueOf(C0SXF.LJJIII(activityLIZIZ, CommentContextSourceKt.aweme(commentContextSource)));
        } else {
            numValueOf3 = null;
        }
        c2344009GkLJIIIZ.LJ(numValueOf3, "is_landscape_screen");
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str2 = commonModel.tabName;
        } else {
            str2 = null;
        }
        c2344009GkLJIIIZ.LJFF("tab_name", str2);
        if (!Intrinsics.LJFF("from_music", CommentContextSourceKt.enterFrom(commentContextSource))) {
            c2344009GkLJIIIZ.LIZJ(((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(C2214201BlK.LJFF(), CommentContextSourceKt.aweme(commentContextSource)), "music_name");
        }
        c2344009GkLJIIIZ.LJII(C1ER1.LIZIZ.LJJJJL());
        C735840Sti c735840Sti = C735840Sti.LIZ;
        Aweme aweme4 = CommentContextSourceKt.aweme(commentContextSource);
        c735840Sti.getClass();
        C735840Sti.LIZIZ(aweme4, c2344009GkLJIIIZ);
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        c2344009GkLJIIIZ.LIZJ(C10EU.LJIIZILJ(authorUid) ? 1 : 0, "is_video_author");
        if (commentContextSource != null) {
            sessionId = CommentContextSourceKt.getSessionId(commentContextSource);
        } else {
            sessionId = null;
        }
        if (C123100dR.LIZ(sessionId)) {
            if (commentContextSource != null) {
                sessionId2 = CommentContextSourceKt.getSessionId(commentContextSource);
            } else {
                sessionId2 = null;
            }
            c2344009GkLJIIIZ.LJFF("session_id", sessionId2);
        }
        if (comment != null && C295340Bhs.LIZ()) {
            C161N c161n = C161N.LIZIZ;
            boolean zLJIILLIIL = c161n.LJIILLIIL(comment, EnumC715680S5m.NOT_OVERWRITTEN);
            if (C161T.LIZ().LJ(comment.getAwemeId()) && zLJIILLIIL) {
                i = 1;
            } else {
                i = 0;
            }
            boolean zLJZL = c161n.LJZL(comment.getCommentLanguage());
            boolean zLJIILIIL = c161n.LJIILIIL(comment);
            if (zLJIILIIL && !zLJZL && C0BJB.LIZ()) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            boolean zLJJIIZ = C746760TRa.LIZ().LJJIIZ(comment.getAwemeId(), comment.getCid());
            boolean zLJJIJIIJIL = C746760TRa.LIZ().LJJIJIIJIL(comment.getAwemeId(), comment.getCid());
            c2344009GkLJIIIZ.LJFF("llm_variant", c161n.LJJLIIIJ().LIZJ(comment));
            c2344009GkLJIIIZ.LJFF("comment_source_language", comment.getCommentLanguage());
            c2344009GkLJIIIZ.LJFF("target_language", c161n.LLIIZ());
            c2344009GkLJIIIZ.LIZJ(i2, "is_translation_icon_shown");
            c2344009GkLJIIIZ.LIZJ(i, "is_auto_translated");
            c2344009GkLJIIIZ.LIZJ(zLJIILIIL ? 1 : 0, "is_comment_translatable");
            c2344009GkLJIIIZ.LIZJ(zLJIILLIIL ? 1 : 0, "is_comment_translated");
            c2344009GkLJIIIZ.LIZJ(zLJJIJIIJIL ? 1 : 0, "is_ever_real_translated");
            c2344009GkLJIIIZ.LIZJ(zLJJIIZ ? 1 : 0, "is_ever_start_translation");
        }
        if (commentContextSource != null) {
            currSortType = commentContextSource.getCurrSortType();
        }
        c2344009GkLJIIIZ.LJFF("channel", C1342490l2V.LIZ(currSortType));
        Aweme aweme5 = CommentContextSourceKt.aweme(commentContextSource);
        if (aweme5 == null || !AwemeExtKt.isOfflineVideo(aweme5)) {
            i3 = 0;
        }
        c2344009GkLJIIIZ.LIZJ(i3, "is_offline_video");
        C1350920lG6.LJJJ(c2344009GkLJIIIZ, "show_more_reply");
    }

    public final void LJJIFFI(InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, C1220590hrt c1220590hrt) throws Exception {
        Long lValueOf;
        String aid;
        boolean z;
        CommentListModel listModel;
        String highlightCids;
        CommentListModel listModel2;
        AwemeStatistics statistics;
        C1342970l3H c1342970l3H = C1342970l3H.LIZ;
        Aweme aweme = this.LJIILL;
        String insertCid = null;
        if (aweme != null && (statistics = aweme.getStatistics()) != null) {
            lValueOf = Long.valueOf(statistics.getCommentCount());
        } else {
            lValueOf = null;
        }
        if (C1342970l3H.LIZIZ(lValueOf)) {
            return;
        }
        if (this.LJIL && c1220590hrt.LIZLLL == null) {
            return;
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        C743720TFi c743720TFi = CommentPerfMonitorUtil.LIZIZ;
        c743720TFi.LIZIZ();
        c743720TFi.LIZIZ = System.currentTimeMillis();
        c743720TFi.LIZLLL = System.currentTimeMillis();
        c743720TFi.LJIIIIZZ.LIZ("duration_mainthread_request_process");
        String strLIZ = C1346020l8C.LIZ(this.LJIILL, this.LIZ, null);
        if (C123100dR.LIZ(strLIZ)) {
            c1220590hrt.LIZJ = strLIZ;
        }
        int i = c1220590hrt.LJFF;
        if (i <= 0) {
            i = 20;
        }
        Aweme aweme2 = this.LJIILL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        CommentContextSource commentContextSource = this.LJJIJIL;
        if (commentContextSource != null && (listModel2 = commentContextSource.getListModel()) != null) {
            insertCid = listModel2.getInsertCid();
        }
        String str = "";
        if (insertCid == null) {
            insertCid = "";
        }
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null && (listModel = commentContextSource2.getListModel()) != null && (highlightCids = listModel.getHighlightCids()) != null) {
            str = highlightCids;
        }
        if (C286300BKa.LIZ() && (C286300BKa.LIZIZ() & 8) == 8 && c1220590hrt.LIZLLL == null) {
            z = true;
        } else {
            z = false;
        }
        LIZLLL(aid, insertCid, str, i, c1220590hrt, interfaceC1364105Vn, z, true);
    }

    public final void LJJII(InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, C20607315kN c20607315kN) {
        boolean z;
        Long lValueOf;
        int iLIZ;
        AwemeStatistics statistics;
        String aid;
        String insertCid;
        int i;
        boolean z2;
        CommentCommonModel commonModel;
        CommentListModel listModel;
        String highlightCids;
        CommentListModel listModel2;
        CommentListModel listModel3;
        CommentContextSource commentContextSource;
        CommentListModel listModel4;
        String insertCid2;
        CommentCommonModel commonModel2;
        CommentListModel listModel5;
        List<String> highlightedWord;
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null && (listModel5 = commentContextSource2.getListModel()) != null && (highlightedWord = listModel5.getHighlightedWord()) != null) {
            highlightedWord.clear();
        }
        this.LJFF = false;
        this.LJI = false;
        this.LJII = 0L;
        this.LJIIIIZZ = false;
        this.LJIIIZ = 0;
        this.LJIIJ = 0;
        this.LJIIJJI = false;
        this.LJIIL = 0L;
        this.LJJIJIIJI = new LinkedHashSet<>();
        String aid2 = null;
        this.LJIILIIL = null;
        C1344690l63.LIZ.getClass();
        C1344690l63.LJI.clear();
        ((LinkedHashMap) C1344690l63.LJFF).clear();
        if (C0BKX.LIZIZ()) {
            for (C1344210l5H c1344210l5H : this.LIZIZ.LLILZLL) {
                if (c1344210l5H != null) {
                    c1344210l5H.LIZIZ();
                }
            }
            this.LJIILIIL = c20607315kN;
            if (c20607315kN != null) {
                c20607315kN.LJIIIIZZ();
            }
        }
        CommentContextSource commentContextSource3 = this.LJJIJIL;
        if (commentContextSource3 != null && (commonModel2 = commentContextSource3.getCommonModel()) != null && commonModel2.isNoPermissionVideoFromCommentHistory()) {
            z = true;
        } else {
            z = false;
        }
        if (LJIIZILJ()) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LJJ.getValue();
            Aweme aweme = this.LJIILL;
            if (aweme != null) {
                aid2 = aweme.getAid();
            }
            assemViewModel.setState(new AwS5S1000100_6(aid2, 0L, 0));
            return;
        }
        if (LJIJ() && !C1348690lCV.LIZLLL(this.LJIILL)) {
            AssemViewModel assemViewModel2 = (AssemViewModel) this.LJJ.getValue();
            Aweme aweme2 = this.LJIILL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            assemViewModel2.setState(new AwS5S1000100_6(aid2, 0L, 0));
            return;
        }
        Aweme aweme3 = this.LJIILL;
        if (aweme3 != null && C1344240l5K.LIZ(aweme3) && ((commentContextSource = this.LJJIJIL) == null || (listModel4 = commentContextSource.getListModel()) == null || (insertCid2 = listModel4.getInsertCid()) == null || a0.LJJJIL(insertCid2))) {
            if (interfaceC1364105Vn != null) {
                C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
                C13BV c13bv = C13BV.INSTANCE;
                c317290CcB.getClass();
                LJJIIZ(interfaceC1364105Vn, new C316640Cb8(c13bv));
                return;
            }
            C20600815jK<InterfaceC1891350zJl> c20600815jKLJI = LJI();
            if (c20600815jKLJI != null) {
                c20600815jKLJI.LJIILL(C13BV.INSTANCE, null);
            }
            C20607315kN c20607315kN2 = this.LJIILIIL;
            if (c20607315kN2 != null) {
                c20607315kN2.LJIIIZ(false);
                return;
            } else {
                LJIILIIL(true);
                return;
            }
        }
        CommentContextSource commentContextSource4 = this.LJJIJIL;
        if (commentContextSource4 == null || (listModel3 = commentContextSource4.getListModel()) == null || (iLIZ = listModel3.getFirstRefreshCount()) <= 0) {
            C1342970l3H c1342970l3H = C1342970l3H.LIZ;
            Aweme aweme4 = this.LJIILL;
            if (aweme4 != null && (statistics = aweme4.getStatistics()) != null) {
                lValueOf = Long.valueOf(statistics.getCommentCount());
            } else {
                lValueOf = null;
            }
            if (C1342970l3H.LIZIZ(lValueOf)) {
                iLIZ = C1342970l3H.LIZIZ.LJI();
            } else {
                iLIZ = C342480Dbi.LIZ();
            }
        }
        C1344440l5e c1344440l5e = CommentPageLoadTimer.LIZJ;
        if (c1344440l5e != null) {
            c1344440l5e.LJ = System.currentTimeMillis();
            C1344440l5e c1344440l5e2 = CommentPageLoadTimer.LIZJ;
            if (c1344440l5e2 != null) {
                c1344440l5e2.LJIIIIZZ = true;
            }
            C733390Spl.LIZ("CommentPageLoadTimer: beginNetworkLoad()");
        }
        d1 d1Var = new d1("PageLoadTimer");
        CommentPageLoadTimer.LIZLLL = d1Var;
        d1Var.LIZ("duration_mainthread_request_process");
        C733390Spl.LIZ("CommentPageLoadTimer: beginNetworkStageRecord()");
        CommentPerfMonitorUtil.LIZ.getClass();
        C1345380l7A c1345380l7A = CommentPerfMonitorUtil.LJII;
        c1345380l7A.LJIL = System.currentTimeMillis();
        c1345380l7A.LJJI = CommentPerfMonitorUtil.LJI();
        c1345380l7A.LJJIII.LIZ("duration_mainthread_request_process");
        Aweme aweme5 = this.LJIILL;
        if (aweme5 != null) {
            aid = aweme5.getAid();
        } else {
            aid = null;
        }
        CommentContextSource commentContextSource5 = this.LJJIJIL;
        if (commentContextSource5 != null && (listModel2 = commentContextSource5.getListModel()) != null) {
            insertCid = listModel2.getInsertCid();
        } else {
            insertCid = null;
        }
        String str = "";
        if (insertCid == null) {
            insertCid = "";
        }
        CommentContextSource commentContextSource6 = this.LJJIJIL;
        if (commentContextSource6 != null && (listModel = commentContextSource6.getListModel()) != null && (highlightCids = listModel.getHighlightCids()) != null) {
            str = highlightCids;
        }
        if (z) {
            i = 5;
        } else {
            i = 0;
        }
        Aweme aweme6 = this.LJIILL;
        EnumC1342450l2R enumC1342450l2R = this.LIZ;
        CommentContextSource commentContextSource7 = this.LJJIJIL;
        if (commentContextSource7 != null && (commonModel = commentContextSource7.getCommonModel()) != null) {
            aid2 = commonModel.channelNameForServer;
        }
        C1220590hrt c1220590hrt = new C1220590hrt(0L, i, C1346020l8C.LIZ(aweme6, enumC1342450l2R, aid2), null, null, 0, 57);
        if (C286300BKa.LIZ() && (C286300BKa.LIZIZ() & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZLLL(aid, insertCid, str, iLIZ, c1220590hrt, interfaceC1364105Vn, z2, false);
    }

    public final void LJJIIZ(InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, AbstractC316870CbV<C1220590hrt> abstractC316870CbV) {
        if (interfaceC1364105Vn == null) {
            return;
        }
        this.LIZIZ.LLJILLL = true;
        C189200o6.m2constructorimpl(abstractC316870CbV);
        interfaceC1364105Vn.resumeWith(abstractC316870CbV);
    }

    public static void LJIILL(CommentItemList commentItemList, List list, Aweme aweme) {
        String aid;
        if (C1347490lAZ.LIZLLL(aweme, commentItemList.filteredCommentsViewType, commentItemList.hasFilteredComments())) {
            C1347490lAZ.LIZ.getClass();
            final Comment comment = new Comment();
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            comment.setAwemeId(aid);
            comment.setCommentType(227);
            comment.setCid("");
            comment.setAliasAweme(aweme);
            comment.setUser(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser());
            ListProtector.add(list, 0, new InterfaceC1891350zJl(comment) { // from class: X.07Wf
                public final Comment LL;

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1875507Wf) && Intrinsics.LJFF(this.LL, ((C1875507Wf) obj).LL);
                }

                @Override // X.InterfaceC1891350zJl
                public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return null;
                }

                public final int hashCode() {
                    return this.LL.hashCode();
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ReviewFilteredCommentsItem(comment=");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                {
                    this.LL = comment;
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }

                @Override // X.InterfaceC1891350zJl
                public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                    return Intrinsics.LJFF(interfaceC1891350zJl, this);
                }
            });
        }
    }

    public final void LIZJ(long j, AnonymousClass0957<? extends CommentItemList> anonymousClass0957, String str) {
        Fragment fragment;
        View viewVa;
        String aid;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LJIIZILJ;
        if (interfaceC665370Q7z != null) {
            WeakReference<Fragment> weakReference = this.LIZIZ.LLIZLLLIL;
            if (weakReference != null) {
                fragment = weakReference.get();
            } else {
                fragment = null;
            }
            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(fragment, interfaceC665370Q7z);
            if (iCommentListAssemAbilityLIZLLL != null && (viewVa = iCommentListAssemAbilityLIZLLL.Va()) != null && viewVa.getParent() != null && this.LJIL) {
                Aweme aweme = this.LJIILL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (Intrinsics.LJFF(aid, str) && !LJIJI()) {
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this.LIZIZ);
                    C1DFH c1dfh = C0PEM.LIZ;
                    ((ArrayList) this.LJJIZ).add(C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C2355509Kv(this, j, anonymousClass0957, null), 2));
                    return;
                }
            }
        }
        C1344030l4z.LIZLLL("CommentSortListVM", "cancel doLoadSpitData");
    }

    public final CommentItemList LJIIIZ(String str, boolean z, boolean z2) {
        CommentListModel listModel;
        CommentItemList commentItemListVz;
        CommentListModel listModel2;
        C1344300l5Q c1344300l5Q;
        BaseResponse.ServerTimeExtra serverTimeExtra;
        ArrayList arrayList;
        CommentSurprise commentSurpriseCopy;
        boolean z3 = false;
        Boolean boolValueOf = null;
        if (z && z2 && !C296440Bje.LIZ()) {
            if (this.LIZ == EnumC1342450l2R.DEFAULT_SORT && C296460Bjg.LIZJ()) {
                z3 = true;
            }
            if (C296440Bje.LIZ()) {
                C0W17.LIZJ("commentCache", "getValidCache disabled by commentCache experiment");
            } else if (str != null && (c1344300l5Q = (C1344300l5Q) C20563083t.LIZ().get(str)) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (z3 == c1344300l5Q.LIZJ && jCurrentTimeMillis - c1344300l5Q.LIZ <= ((FriendsV3CommentConfig) C1351070lGL.LIZIZ.getValue()).exposeCommentCacheTimeMs) {
                    CommentItemList commentItemList = c1344300l5Q.LIZLLL;
                    if (commentItemList != null) {
                        commentItemListVz = new CommentItemList();
                        commentItemListVz.isFriendsV3Cache = true;
                        commentItemListVz.status_code = commentItemList.status_code;
                        commentItemListVz.error_code = commentItemList.error_code;
                        commentItemListVz.message = commentItemList.message;
                        commentItemListVz.status_msg = commentItemList.status_msg;
                        commentItemListVz.prompts = commentItemList.prompts;
                        BaseResponse.ServerTimeExtra serverTimeExtra2 = commentItemList.extra;
                        if (serverTimeExtra2 != null) {
                            serverTimeExtra = new BaseResponse.ServerTimeExtra();
                            serverTimeExtra.now = serverTimeExtra2.now;
                            serverTimeExtra.logid = serverTimeExtra2.logid;
                            serverTimeExtra.server_stream_time = serverTimeExtra2.server_stream_time;
                            serverTimeExtra.f335dc = serverTimeExtra2.f335dc;
                        } else {
                            serverTimeExtra = null;
                        }
                        commentItemListVz.extra = serverTimeExtra;
                        commentItemListVz.logPd = commentItemList.logPd;
                        commentItemListVz.cursor = commentItemList.cursor;
                        commentItemListVz.hasMore = commentItemList.hasMore;
                        commentItemListVz.total = commentItemList.total;
                        commentItemListVz.replyStyle = commentItemList.replyStyle;
                        commentItemListVz.newInsertIds = commentItemList.newInsertIds;
                        commentItemListVz.hasFilteredComments = commentItemListVz.hasFilteredComments() ? 1 : 0;
                        commentItemListVz.hasFoldComment = commentItemListVz.hasFoldComment;
                        commentItemListVz.foldCommentCursor = commentItemList.foldCommentCursor;
                        commentItemListVz.aliasCommentDeleted = commentItemList.aliasCommentDeleted;
                        commentItemListVz.securityGuide = commentItemList.securityGuide;
                        commentItemListVz.commentShowUnderPostCid = commentItemList.commentShowUnderPostCid;
                        commentItemListVz.filteredCommentsCount = commentItemList.filteredCommentsCount;
                        commentItemListVz.filteredCommentsViewType = commentItemList.filteredCommentsViewType;
                        List<Comment> list = commentItemList.items;
                        if (list != null) {
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (Comment comment : list) {
                                Comment commentM169clone = comment.m169clone();
                                commentM169clone.setUserBuried(comment.getUserBuried());
                                commentM169clone.setDiggCount(comment.getDiggCount());
                                commentM169clone.isAuthorDigged = comment.isAuthorDigged;
                                arrayList2.add(commentM169clone);
                            }
                            arrayList = new ArrayList(arrayList2);
                        } else {
                            arrayList = null;
                        }
                        commentItemListVz.items = arrayList;
                        commentItemListVz.topGiftList = commentItemList.topGiftList;
                        CommentSurprise commentSurprise = commentItemList.commentSurprise;
                        if (commentSurprise != null) {
                            commentSurpriseCopy = commentSurprise.copy(commentSurprise.surpriseType, commentSurprise.surpriseResource, commentSurprise.rawData, commentSurprise.resourceType, commentSurprise.schema, commentSurprise.keyword);
                        } else {
                            commentSurpriseCopy = null;
                        }
                        commentItemListVz.commentSurprise = commentSurpriseCopy;
                        commentItemListVz.isPreload = commentItemList.isPreload;
                        commentItemListVz.hitPreRequest = commentItemList.hitPreRequest;
                        commentItemListVz.preRequestMethod = commentItemList.preRequestMethod;
                        commentItemListVz.rootCid = commentItemList.rootCid;
                        commentItemListVz.jsonData = commentItemList.jsonData;
                        commentItemListVz.lazySplitItemsParseTask = commentItemList.lazySplitItemsParseTask;
                    }
                } else {
                    C20563083t.LIZ().remove(str);
                }
            }
            commentItemListVz = null;
        } else {
            CommentContextSource commentContextSource = this.LJJIJIL;
            if (commentContextSource == null || (listModel = commentContextSource.getListModel()) == null || !listModel.getExposedCommentUseCacheData()) {
                commentItemListVz = null;
            } else {
                IExposedCommentDataAbility iExposedCommentDataAbility = this.LJJIIJ;
                if (iExposedCommentDataAbility == null) {
                    InterfaceC665370Q7z interfaceC665370Q7z = this.LJIIZILJ;
                    if (interfaceC665370Q7z != null && (iExposedCommentDataAbility = (IExposedCommentDataAbility) C1558520qew.LIZ(interfaceC665370Q7z, IExposedCommentDataAbility.class, null)) != null) {
                        this.LJJIIJ = iExposedCommentDataAbility;
                    }
                    commentItemListVz = null;
                }
                commentItemListVz = iExposedCommentDataAbility.Vz(str);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fetchCommentList useExposedCommentCache = ");
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null && (listModel2 = commentContextSource2.getListModel()) != null) {
            boolValueOf = Boolean.valueOf(listModel2.getExposedCommentUseCacheData());
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", cacheData = ");
        sbLIZ.append(commentItemListVz);
        C2188811AlT.LIZIZ(sbLIZ);
        return commentItemListVz;
    }

    public final void LJJIIZI(EnumC1342430l2P enumC1342430l2P, EnumC1342610l2h enumC1342610l2h, C1344280l5O c1344280l5O) {
        String str;
        Exception exc;
        Exception exc2;
        C1220590hrt c1220590hrt;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ;
        Exception exc3;
        Exception exc4;
        Exception exc5;
        C1220590hrt c1220590hrt2;
        C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ2;
        CommentCommonModel commonModel;
        CommentContextSource commentContextSource = this.LJJIJIL;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null) {
            str = commonModel.fromPage;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "graphic_detail")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setFooterStatus type=");
            sbLIZ.append(enumC1342430l2P);
            sbLIZ.append(' ');
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LIZIZ.LLIZ && enumC1342610l2h == EnumC1342610l2h.MATCH_PARENT) {
                enumC1342610l2h = EnumC1342610l2h.HEADER_MATCH;
            }
            C1157350gDt c1157350gDt = new C1157350gDt(enumC1342430l2P, enumC1342610l2h);
            this.LJIJJ = c1157350gDt;
            switch (C1342400l2M.LIZ[enumC1342430l2P.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 7:
                case 8:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ3 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ3 != null) {
                        if (enumC1342610l2h != EnumC1342610l2h.CUSTOMIZE_LOADING) {
                            enumC1342610l2h = null;
                        }
                        C1157340gDs c1157340gDs = new C1157340gDs(enumC1342430l2P, enumC1342610l2h);
                        if (c1344280l5O != null) {
                            exc3 = c1344280l5O.LIZIZ;
                        } else {
                            exc3 = null;
                        }
                        c20600815jKLJIIIIZZ3.LJIILL(Collections.singletonList(new C1157070gDR(c1157340gDs, exc3)), null);
                    }
                    break;
                case 5:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ4 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ4 != null) {
                        c20600815jKLJIIIIZZ4.LJIILL(Collections.singletonList(new C1157120gDW(c1157350gDt)), null);
                    }
                    break;
                case 6:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ5 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ5 != null) {
                        C1157340gDs c1157340gDs2 = new C1157340gDs(enumC1342430l2P, null);
                        if (c1344280l5O != null) {
                            exc4 = c1344280l5O.LIZIZ;
                        } else {
                            exc4 = null;
                        }
                        c20600815jKLJIIIIZZ5.LJIILL(Collections.singletonList(new C1157070gDR(c1157340gDs2, exc4)), null);
                    }
                    break;
                case BdTuring.TYPE_ECAF /* 9 */:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ6 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ6 != null) {
                        C1157340gDs c1157340gDs3 = new C1157340gDs(enumC1342430l2P, null);
                        if (c1344280l5O != null) {
                            exc5 = c1344280l5O.LIZIZ;
                        } else {
                            exc5 = null;
                        }
                        c20600815jKLJIIIIZZ6.LJIILL(Collections.singletonList(new C1157070gDR(c1157340gDs3, exc5)), null);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ7 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ7 != null) {
                        c20600815jKLJIIIIZZ7.LJIILL(Collections.singletonList(new C050J(enumC1342610l2h)), null);
                    }
                    break;
                case BdTuring.TYPE_EMAIL /* 11 */:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ8 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ8 != null) {
                        if (c1344280l5O == null || (c1220590hrt2 = c1344280l5O.LIZ) == null) {
                            c1220590hrt2 = new C1220590hrt(0L, 0, null, null, null, 0, 63);
                        }
                        c20600815jKLJIIIIZZ8.LJIILL(Collections.singletonList(new C1157440gE2(enumC1342610l2h, c1220590hrt2)), null);
                    }
                    break;
                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                    C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ9 = LJIIIIZZ();
                    if (c20600815jKLJIIIIZZ9 != null && c20600815jKLJIIIIZZ9.LJIIIIZZ() > 0 && (c20600815jKLJIIIIZZ2 = LJIIIIZZ()) != null) {
                        c20600815jKLJIIIIZZ2.LJFF(null);
                        break;
                    }
                    break;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setFooterStatus type=");
        sbLIZ2.append(enumC1342430l2P);
        sbLIZ2.append(' ');
        C2188811AlT.LIZIZ(sbLIZ2);
        boolean z = this.LIZIZ.LLIZ;
        if (enumC1342610l2h == EnumC1342610l2h.MATCH_PARENT) {
            if (z) {
                enumC1342610l2h = EnumC1342610l2h.HEADER_MATCH;
            } else {
                enumC1342610l2h = this.LJJJI;
            }
        }
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null && CommentContextSourceKt.isFromTitlePanel(commentContextSource2)) {
            C718860SHs.LIZ.getClass();
            if (C0QQX.LIZ || C719150SIv.LIZ) {
                CommentContextSource commentContextSource3 = this.LJJIJIL;
                if (commentContextSource3 != null && CommentContextSourceKt.videoDescOnly(commentContextSource3)) {
                    enumC1342610l2h = EnumC1342610l2h.TITLE_PANEL_DESC_ONLY;
                } else {
                    enumC1342610l2h = EnumC1342610l2h.TITLE_PANEL;
                }
            }
        }
        C1157350gDt c1157350gDt2 = new C1157350gDt(enumC1342430l2P, enumC1342610l2h);
        this.LJIJJ = c1157350gDt2;
        switch (C1342400l2M.LIZ[enumC1342430l2P.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 7:
            case 8:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ10 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ10 != null) {
                    if (c1344280l5O != null) {
                        exc = c1344280l5O.LIZIZ;
                    } else {
                        exc = null;
                    }
                    c20600815jKLJIIIIZZ10.LJIILL(Collections.singletonList(new C1157110gDV(c1157350gDt2, exc)), null);
                }
                break;
            case 5:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ11 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ11 != null) {
                    c20600815jKLJIIIIZZ11.LJIILL(Collections.singletonList(new C1157120gDW(c1157350gDt2)), null);
                }
                break;
            case 6:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ12 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ12 != null) {
                    c20600815jKLJIIIIZZ12.LJIILL(Collections.singletonList(new C1157120gDW(c1157350gDt2)), null);
                }
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ13 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ13 != null) {
                    C1157340gDs c1157340gDs4 = new C1157340gDs(enumC1342430l2P, null);
                    if (c1344280l5O != null) {
                        exc2 = c1344280l5O.LIZIZ;
                    } else {
                        exc2 = null;
                    }
                    c20600815jKLJIIIIZZ13.LJIILL(Collections.singletonList(new C1157070gDR(c1157340gDs4, exc2)), null);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ14 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ14 != null) {
                    c20600815jKLJIIIIZZ14.LJIILL(Collections.singletonList(new C050J(enumC1342610l2h)), null);
                }
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ15 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ15 != null) {
                    if (c1344280l5O == null || (c1220590hrt = c1344280l5O.LIZ) == null) {
                        c1220590hrt = new C1220590hrt(0L, 0, null, null, null, 0, 63);
                    }
                    c20600815jKLJIIIIZZ15.LJIILL(Collections.singletonList(new C1157440gE2(enumC1342610l2h, c1220590hrt)), null);
                }
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                C20600815jK<InterfaceC1891350zJl> c20600815jKLJIIIIZZ16 = LJIIIIZZ();
                if (c20600815jKLJIIIIZZ16 != null && c20600815jKLJIIIIZZ16.LJIIIIZZ() > 0 && (c20600815jKLJIIIIZZ = LJIIIIZZ()) != null) {
                    c20600815jKLJIIIIZZ.LJFF(null);
                    break;
                }
                break;
        }
    }

    public final void LJJJ(CommentSurpriseStruct commentSurpriseStruct, int i, String str) {
        String aid;
        ICommentPageContainer iCommentPageContainer;
        List listLJJLIIIJ;
        SurpriseResource surpriseResource;
        List<ButtonResource> list;
        CommentCommonModel commonModel;
        Aweme aweme;
        CommentContextSource commentContextSource = this.LJJIJIL;
        if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && (aweme = commonModel.aweme) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (commentSurpriseStruct.commentSurprise != null) {
            if (i == EnumC1220570hrr.AUTHOR_SIDE_FIRST_COMMENT.getValue()) {
                if (C123100dR.LIZ(str)) {
                    try {
                        listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        listLJJLIIIJ = null;
                    }
                    CommentSurprise commentSurprise = commentSurpriseStruct.commentSurprise;
                    if (commentSurprise != null && (surpriseResource = commentSurprise.surpriseResource) != null && (list = surpriseResource.buttons) != null) {
                        boolean z = false;
                        for (ButtonResource buttonResource : list) {
                            if (C123100dR.LIZ(buttonResource.replyCid) && listLJJLIIIJ != null && C13LP.LJJJJ(buttonResource.replyCid, listLJJLIIIJ)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C1344380l5Y c1344380l5Y = C1344380l5Y.LIZ;
                c1344380l5Y.getClass();
                if (aid != null && !new ArrayList(C13LP.LJJJJLI(C1344380l5Y.LIZ())).contains(aid)) {
                    c1344380l5Y.getClass();
                    ArrayList arrayList = new ArrayList(C13LP.LJJJJLI(C1344380l5Y.LIZ()));
                    if (!arrayList.contains(aid)) {
                        arrayList.add(aid);
                    }
                    if (arrayList.size() > 100) {
                        C13LP.LLD(100, arrayList);
                    }
                    String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
                    Keva keva = (Keva) C1344380l5Y.LIZIZ.getValue();
                    String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("author_side_first_comment_aid");
                    sbLIZ.append(curUserId);
                    keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strLJJLIIIJ);
                } else {
                    return;
                }
            }
            C1352020lHs.LIZJ(commentSurpriseStruct.commentSurprise);
            InterfaceC665370Q7z interfaceC665370Q7z = this.LJIIZILJ;
            if (interfaceC665370Q7z != null && (iCommentPageContainer = (ICommentPageContainer) C1558520qew.LIZ(interfaceC665370Q7z, ICommentPageContainer.class, null)) != null && iCommentPageContainer.l91()) {
                CommentListAssemVM commentListAssemVM = this.LIZIZ;
                C291001Au c291001Au = new C291001Au(commentSurpriseStruct);
                commentListAssemVM.getClass();
                commentListAssemVM.setState(new AwS583S0100000_4(c291001Au, (C291001Au<C1341850l1T>) 200));
                return;
            }
            C1352020lHs.LIZIZ(commentSurpriseStruct, Boolean.FALSE, "comment_close");
        }
    }

    public static AnonymousClass0957 LJIIJ(C1344500l5k c1344500l5k, boolean z, boolean z2, C1220590hrt c1220590hrt) {
        if (c1344500l5k != null && z && !z2 && !Intrinsics.LJFF(c1220590hrt.LIZJ, "tiktok_video_comment_option_time") && !Intrinsics.LJFF(c1220590hrt.LIZJ, "tiktok_video_comment_option_visual") && !Intrinsics.LJFF(c1220590hrt.LIZJ, "tiktok_video_comment_option_creator")) {
            C1344220l5I.LIZ.getClass();
            C1344220l5I.LIZ();
            C1344250l5L c1344250l5LLIZJ = C1344220l5I.LIZJ(c1344500l5k);
            if (c1344250l5LLIZJ != null) {
                return c1344250l5LLIZJ.commentListTask;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r26, java.lang.String r27, java.util.List<X.InterfaceC1891350zJl> r28, com.ss.android.ugc.aweme.comment.model.CommentItemList r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344210l5H.LJIILJJIL(java.lang.String, java.lang.String, java.util.List, com.ss.android.ugc.aweme.comment.model.CommentItemList):void");
    }

    public final void LJJIJLIJ(int i, String str, long j, String str2) {
        String str3;
        C1344230l5J c1344230l5J = this.LIZJ;
        c1344230l5J.LIZ.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1344230l5J.LIZIZ = jCurrentTimeMillis;
        c1344230l5J.LIZ.put("TimeStamp", String.valueOf(jCurrentTimeMillis));
        this.LIZLLL.LJ();
        C0O8X c0o8x = this.LIZLLL;
        c0o8x.LIZLLL = str2;
        c0o8x.LIZIZ(str, "enter_from");
        C0O8X c0o8x2 = this.LIZLLL;
        if (j == 0) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0o8x2.LIZIZ(str3, "is_first_page");
        this.LIZLLL.LIZJ(Integer.valueOf(i), "req_count");
        this.LIZLLL.LIZJ(Long.valueOf(j), "req_offset");
    }

    public final void LJJ(Throwable th, boolean z, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, String str, int i) {
        EnumC1342450l2R currSortType;
        Exception exc;
        Exception exc2;
        Exception exc3;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC1344310l5R interfaceC1344310l5R;
        if (LJIJI()) {
            return;
        }
        d1 d1Var = CommentPageLoadTimer.LIZLLL;
        if (d1Var != null) {
            d1Var.LIZIZ("duration_sub_to_main_switch");
            d1Var.LIZ("duration_mainthread_response_process");
        }
        CommentPerfMonitorUtil.LIZ.getClass();
        d1 d1VarLJFF = CommentPerfMonitorUtil.LJFF(z);
        d1VarLJFF.LIZIZ("duration_sub_to_main_switch");
        d1VarLJFF.LIZ("duration_mainthread_response_process");
        LJJIJL(th);
        CommentPerfMonitorUtil.LJFF(z).LIZIZ("duration_mainthread_response_process");
        if (C296030Biz.LIZ() || (C296030Biz.LIZIZ() & 2) > 0) {
            C1344220l5I.LIZ.getClass();
            C1344220l5I.LIZIZ(str);
        }
        EnumC1342450l2R currSortType2 = null;
        if (z) {
            C1349890lER.LIZJ();
            d1 d1Var2 = CommentPageLoadTimer.LIZLLL;
            if (d1Var2 != null) {
                d1Var2.LIZIZ("duration_mainthread_response_process");
            }
            C1344440l5e c1344440l5e = CommentPageLoadTimer.LIZJ;
            if (c1344440l5e != null) {
                c1344440l5e.LJFF = System.currentTimeMillis();
                C733390Spl.LIZ("CommentPageLoadTimer: onDataLoadFailed");
                C1344440l5e c1344440l5e2 = CommentPageLoadTimer.LIZJ;
                if (c1344440l5e2 != null && (interfaceC1344310l5R = c1344440l5e2.LJII) != null) {
                    interfaceC1344310l5R.LIZ(0, c1344440l5e2.LIZJ(), false);
                }
                CommentPageLoadTimer.LIZ.getClass();
                CommentPageLoadTimer.LIZIZ();
                CommentPageLoadTimer.LIZJ = null;
                CommentPageLoadTimer.LIZLLL = null;
            }
            CommentPerfMonitorUtil.LIZLLL(false, 0, this.LIZ, i);
            CommentPerfMonitorUtil.LJ();
        } else {
            C743720TFi c743720TFi = CommentPerfMonitorUtil.LIZIZ;
            c743720TFi.LIZJ = System.currentTimeMillis();
            c743720TFi.LJ = System.currentTimeMillis();
            C15O7.LIZJ(new ACallableS426S0100000_21(c743720TFi, 10));
        }
        LJJIJIIJIL();
        this.LJIJJLI = false;
        this.LJIL = false;
        Objects.toString(this.LIZ);
        CommentContextSource commentContextSource = this.LJJIJIL;
        if (commentContextSource != null) {
            currSortType = commentContextSource.getCurrSortType();
        } else {
            currSortType = null;
        }
        Objects.toString(currSortType);
        EnumC1342450l2R enumC1342450l2R = this.LIZ;
        CommentContextSource commentContextSource2 = this.LJJIJIL;
        if (commentContextSource2 != null) {
            currSortType2 = commentContextSource2.getCurrSortType();
        }
        if (enumC1342450l2R == currSortType2 && interfaceC1364105Vn != null) {
            C317290CcB c317290CcB = AbstractC316870CbV.LIZ;
            if (!(th instanceof Exception) || (exc3 = (Exception) th) == null) {
                exc3 = new Exception(th);
            }
            c317290CcB.getClass();
            LJJIIZ(interfaceC1364105Vn, new C316650Cb9(exc3));
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && (abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ()) != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                    C632670Orh.LIZIZ(activityLIZ, new C19719212De(211032902, new AwS668S0100000_19(th, 35), true));
                } else {
                    C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                    c1397580mTM.LIZIZ("(debug) error: " + th);
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            }
        } else {
            C20607315kN c20607315kN = this.LJIILIIL;
            if (c20607315kN != null && z) {
                if (!(th instanceof Exception) || (exc2 = (Exception) th) == null) {
                    exc2 = new Exception(th);
                }
                c20607315kN.LJII(exc2);
            } else {
                if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                    exc = new Exception(th);
                }
                LJIIL(z, exc);
            }
        }
        this.LJJIJL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x03aa, code lost:
    
        if (r13.isEmpty() == false) goto L180;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, X.0l5k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final java.lang.String r32, java.lang.String r33, java.lang.String r34, final int r35, X.C1220590hrt r36, final X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1220590hrt>> r37, boolean r38, boolean r39) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344210l5H.LIZLLL(java.lang.String, java.lang.String, java.lang.String, int, X.0hrt, X.05Vn, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05ff A[PHI: r3 r5 r14
      0x05ff: PHI (r3v39 X.0Hs4) = (r3v35 X.0Hs4), (r3v40 X.0Hs4) binds: [B:356:0x0708, B:300:0x05fd] A[DONT_GENERATE, DONT_INLINE]
      0x05ff: PHI (r5v43 com.ss.android.ugc.aweme.base.model.UrlModel) = (r5v38 com.ss.android.ugc.aweme.base.model.UrlModel), (r5v44 com.ss.android.ugc.aweme.base.model.UrlModel) binds: [B:356:0x0708, B:300:0x05fd] A[DONT_GENERATE, DONT_INLINE]
      0x05ff: PHI (r14v7 ??) = (r14v14 ??), (r14v8 ??) binds: [B:356:0x0708, B:300:0x05fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0617 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3 A[PHI: r8
      0x00a3: PHI (r8v1 java.lang.String) = 
      (r8v0 java.lang.String)
      (r8v0 java.lang.String)
      (r8v9 java.lang.String)
      (r8v0 java.lang.String)
      (r8v0 java.lang.String)
     binds: [B:9:0x0031, B:11:0x0041, B:105:0x024e, B:20:0x0063, B:30:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0605 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0632 A[EDGE_INSN: B:567:0x0632->B:314:0x0632 BREAK  A[LOOP:3: B:284:0x05c4->B:568:0x05c4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x05c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d6  */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.ss.android.ugc.aweme.base.ImageUrlModel] */
    /* JADX WARN: Type inference failed for: r14v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r20v2, types: [X.09Ku, android.view.ViewTreeObserver$OnGlobalLayoutListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v0, types: [X.0l5H] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r5v56, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v58, types: [X.0l5R] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(com.ss.android.ugc.aweme.comment.model.CommentItemList r29, boolean r30, java.lang.String r31, java.lang.String r32, X.C1220590hrt r33, java.lang.String r34, java.lang.String r35, X.InterfaceC1364105Vn<? super X.AbstractC316870CbV<X.C1220590hrt>> r36, int r37, int r38) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344210l5H.LJJI(com.ss.android.ugc.aweme.comment.model.CommentItemList, boolean, java.lang.String, java.lang.String, X.0hrt, java.lang.String, java.lang.String, X.05Vn, int, int):void");
    }
}
