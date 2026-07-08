package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageStruct;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.UserVoteInfo;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.service.IPostModeService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345700l7g {
    public static final String LIZ(Comment comment) {
        if (comment == null) {
            return "";
        }
        if (LIZLLL(comment) == 1) {
            return "original";
        }
        if (LIZLLL(comment) != 2) {
            return "";
        }
        if (C123100dR.LIZ(comment.getReplyToReplyCommentId()) && !Intrinsics.LJFF(comment.getReplyToReplyCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return "reply_to_reply";
        }
        return "reply";
    }

    public static final String LIZIZ(Comment comment) {
        if (comment == null) {
            return "original";
        }
        if (LIZLLL(comment) == 1) {
            return "reply";
        }
        return "reply_to_reply";
    }

    public static final C20600815jK<InterfaceC1891350zJl> LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        for (AbstractC1906720ziY abstractC1906720ziY : viewOnAttachStateChangeListenerC20604515jv.getAllChunks()) {
            if (abstractC1906720ziY instanceof C1342180l20) {
                if (abstractC1906720ziY != null) {
                    return abstractC1906720ziY.LLILZLL;
                }
                return null;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final int LIZLLL(Comment comment) {
        if (comment.getCommentType() != 0) {
            return comment.getCommentType();
        }
        String rootCommentId = comment.getRootCommentId();
        if (rootCommentId == null || rootCommentId.length() == 0 || Intrinsics.LJFF(comment.getRootCommentId(), CardStruct.IStatusCode.DEFAULT)) {
            return 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final FragmentManager LJ(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Context context = fragment.getContext();
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            interfaceC214902198i = null;
            break;
        }
        Fragment parentFragment = fragment;
        while (!(parentFragment instanceof InterfaceC214902198i)) {
            parentFragment = parentFragment.getParentFragment();
            if (parentFragment == 0) {
                interfaceC214902198i = null;
                break;
            }
        }
        interfaceC214902198i = (InterfaceC214902198i) parentFragment;
        if (LJIIJ(interfaceC214902198i, false, false)) {
            return SAFExtensionKt.LJIIJJI(fragment);
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getSupportFragmentManager();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(com.ss.android.ugc.aweme.comment.model.CommentContextSource r3) {
        /*
            com.bytedance.ies.abmock.SettingsManager r0 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()
            r0.getClass()
            java.lang.String r0 = "comment_audio_publish_entry_forbidden"
            r2 = 0
            boolean r0 = com.bytedance.ies.abmock.SettingsManager.LIZ(r0, r2)
            if (r0 != 0) goto L25
            boolean r0 = X.C0BJW.LIZ()
            if (r0 == 0) goto L25
            r1 = 1
            if (r3 == 0) goto L35
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r3.getKeyboardModel()
            if (r0 == 0) goto L26
            boolean r0 = r0.getForceDisableCommentAudio()
            if (r0 != r1) goto L26
        L25:
            return r2
        L26:
            com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel r0 = r3.getKeyboardModel()
            if (r0 == 0) goto L35
            boolean r0 = r0.isLandscapeMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L36
        L35:
            r0 = 0
        L36:
            boolean r0 = X.C1346420l8q.LIZ(r0)
            if (r0 == 0) goto L4a
            if (r3 == 0) goto L25
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r3.getCommonModel()
            if (r0 == 0) goto L25
            boolean r0 = r0.isInPhotoCommentDetailPage()
            if (r0 != r1) goto L25
        L4a:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345700l7g.LJFF(com.ss.android.ugc.aweme.comment.model.CommentContextSource):boolean");
    }

    public static final boolean LJI(CommentContextSource commentContextSource) {
        String region;
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        CommentKeyboardModel keyboardModel;
        CommentKeyboardModel keyboardModel2;
        Aweme aweme;
        Aweme aweme2;
        if (commentContextSource == null || (aweme2 = CommentContextSourceKt.aweme(commentContextSource)) == null || (region = aweme2.getRegion()) == null) {
            region = "";
        }
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(region, (Object[]) C1380700m28.LIZIZ.getValue());
        Boolean boolValueOf2 = null;
        if (commentContextSource != null && (aweme = CommentContextSourceKt.aweme(commentContextSource)) != null) {
            boolValueOf = Boolean.valueOf(C1347740lAy.LIZ(aweme, false));
        } else {
            boolValueOf = null;
        }
        if (C1346420l8q.LIZ(boolValueOf) && ((commentContextSource == null || (keyboardModel2 = commentContextSource.getKeyboardModel()) == null || !keyboardModel2.getForceDisableCommentPhoto()) && !zLJIILLIIL)) {
            if (commentContextSource != null && (keyboardModel = commentContextSource.getKeyboardModel()) != null) {
                boolValueOf2 = Boolean.valueOf(keyboardModel.isLandscapeMode());
            }
            if (C1346420l8q.LIZ(boolValueOf2)) {
                if (commentContextSource != null && (commonModel = commentContextSource.getCommonModel()) != null && commonModel.isInPhotoCommentDetailPage()) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJII(C20600815jK<InterfaceC1891350zJl> c20600815jK) {
        if (c20600815jK != null) {
            for (InterfaceC1891350zJl interfaceC1891350zJl : c20600815jK.LJII()) {
                if ((interfaceC1891350zJl instanceof C1340430kzB) || (interfaceC1891350zJl instanceof C1340450kzD)) {
                    if (interfaceC1891350zJl != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(CommentContextSource commentContextSource) {
        if (commentContextSource == null) {
            return false;
        }
        return commentContextSource.getCommonModel().isLandscapeMode();
    }

    public static final boolean LJIIIZ(User user) {
        AccountUserService accountUserServiceLJIIJ;
        String uid;
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId = null;
        if (iAccountService != null) {
            accountUserServiceLJIIJ = iAccountService.LJIIJ();
        } else {
            accountUserServiceLJIIJ = null;
        }
        if (user != null) {
            uid = user.getUid();
        } else {
            uid = null;
        }
        if (accountUserServiceLJIIJ != null) {
            curUserId = accountUserServiceLJIIJ.getCurUserId();
        }
        return Intrinsics.LJFF(uid, curUserId);
    }

    public static final boolean LJIIJJI(Comment comment) {
        if (comment == null || LIZLLL(comment) != 2 || comment.getAliasAweme() == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJIILJJIL(com.ss.android.ugc.aweme.comment.model.Comment r4) {
        /*
            boolean r0 = X.C0BU7.LIZIZ
            r3 = 0
            if (r0 != 0) goto L6
            return r3
        L6:
            if (r4 == 0) goto L5c
            java.lang.Boolean r1 = r4.getThreadHasMore()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L5c
            java.lang.String r0 = r4.getReplyToReplyCommentId()
            boolean r0 = X.C123100dR.LIZ(r0)
            java.lang.String r2 = "0"
            if (r0 == 0) goto L4f
            java.lang.String r0 = r4.getReplyToReplyCommentId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L4f
            r1 = 1
        L2b:
            java.lang.String r0 = r4.getRootCommentId()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L46
            java.lang.String r0 = r4.getRootCommentId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L46
            if (r1 != 0) goto L51
        L41:
            boolean r0 = X.C0BU7.LIZJ
            if (r0 != 0) goto L51
            return r3
        L46:
            r0 = 0
            if (r1 != 0) goto L4c
            if (r0 != 0) goto L41
            return r3
        L4c:
            if (r0 == 0) goto L51
            goto L41
        L4f:
            r1 = 0
            goto L2b
        L51:
            java.lang.Boolean r1 = r4.getThreadHasMore()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            return r0
        L5c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345700l7g.LJIILJJIL(com.ss.android.ugc.aweme.comment.model.Comment):boolean");
    }

    public static final C19EG LJIILLIIL(AbstractC738140SxQ abstractC738140SxQ) {
        C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
        if (c19egLIZ != null) {
            return c19egLIZ;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC738140SxQ);
        sbLIZ.append(" not attached to an activity.");
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJIIZILJ(Comment comment) {
        boolean z;
        boolean z2;
        if (comment == null) {
            return "text_comment";
        }
        if (comment.getAliasAweme() != null) {
            return "video";
        }
        List<CommentImageStruct> imageList = comment.getImageList();
        if (imageList != null && !imageList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        boolean z3 = !z;
        if (comment.getStickerStruct() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String strLIZIZ = C1350750lFp.LIZIZ(comment.getText());
        if (z3) {
            if (strLIZIZ.length() > 0) {
                return "photo_text";
            }
            return "photo";
        }
        if (z2) {
            if (strLIZIZ.length() > 0) {
                return "sticker_text";
            }
            return "sticker";
        }
        if (strLIZIZ.length() == 0) {
            return "text_comment";
        }
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        int iLIZIZ = C439870HMr.LIZIZ(strLIZIZ);
        if (iLIZIZ == 0) {
            return "text_comment";
        }
        if (iLIZIZ != 1) {
            if (iLIZIZ != 2) {
                return "text_comment";
            }
            return "text_emoji";
        }
        return "emoji";
    }

    public static final Context LJIJJ(Context context) {
        for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof C19EG) {
                return baseContext;
            }
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC665370Q7z LJIJJLI(androidx.fragment.app.Fragment r5) {
        /*
            r4 = 0
            r3 = 1
            r2 = 0
            if (r5 == 0) goto L19
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L56
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        Lf:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L3a
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L47
        L19:
            r1 = r2
        L1a:
            boolean r0 = LJIIJ(r1, r3, r4)
            if (r0 == 0) goto L2d
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L2c
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L2c
            X.0Q7z r2 = X.C1558360qeg.LJFF(r1, r2)
        L2c:
            return r2
        L2d:
            if (r5 == 0) goto L2c
            X.19EG r0 = r5.getActivity()
            if (r0 == 0) goto L2c
            X.0Q7z r2 = X.C1558360qeg.LJI(r0, r2)
            return r2
        L3a:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L19
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L47
            goto L19
        L47:
            r1 = r5
        L48:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L4f
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L1a
        L4f:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L19
            goto L48
        L56:
            r1 = r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345700l7g.LJIJJLI(androidx.fragment.app.Fragment):X.0Q7z");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC665370Q7z LJIL(X.AbstractC738140SxQ r6) {
        /*
            r5 = 0
            r4 = 1
            r3 = 0
            if (r6 == 0) goto L1f
            androidx.fragment.app.Fragment r1 = X.C724240Sb0.LJI(r6)
            if (r1 == 0) goto L1f
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L5b
            android.app.Activity r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L15:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L40
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L4f
        L1f:
            r1 = r3
        L20:
            boolean r0 = LJIIJ(r1, r4, r5)
            if (r0 == 0) goto L33
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L32
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            if (r1 == 0) goto L32
            X.0Q7z r3 = X.C1558360qeg.LJFF(r1, r3)
        L32:
            return r3
        L33:
            if (r6 == 0) goto L32
            X.19EG r0 = X.C724240Sb0.LIZ(r6)
            if (r0 == 0) goto L32
            X.0Q7z r3 = X.C1558360qeg.LJI(r0, r3)
            return r3
        L40:
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1f
            X.198d r2 = (X.InterfaceC214897198d) r2
            boolean r0 = r2.getEnableSAF()
            if (r0 != 0) goto L4f
            goto L1f
        L4d:
            if (r1 == 0) goto L1f
        L4f:
            boolean r0 = r1 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L56
            X.198i r1 = (X.InterfaceC214902198i) r1
            goto L20
        L56:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            goto L4d
        L5b:
            r2 = r3
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345700l7g.LJIL(X.0SxQ):X.0Q7z");
    }

    public static final int LJIILL(Comment comment, C20600815jK<InterfaceC1891350zJl> c20600815jK) {
        Iterator it2 = ((ArrayList) c20600815jK.LJII()).iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
            if ((interfaceC1891350zJl instanceof C1340400kz8) && Intrinsics.LJFF(((AbstractC1049450dPr) interfaceC1891350zJl).LIZ().getCid(), comment.getCid())) {
                if (i >= 0) {
                    return i;
                }
            } else {
                i++;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean LJIIJ(InterfaceC214902198i interfaceC214902198i, boolean z, boolean z2) {
        if (interfaceC214902198i == 0) {
            return false;
        }
        SAFHelper.LIZ.getClass();
        if (!SAFHelper.LJIIJ()) {
            return false;
        }
        if (interfaceC214902198i instanceof InterfaceC1603190roz) {
            if (z) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().disableMainPageAbilitySingleAct) {
                    return false;
                }
            }
            if (z2) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().disableMainPageVMSingleAct) {
                    return false;
                }
            }
            if (C1345750l7l.LIZ) {
                return true;
            }
            C1345730l7j.LIZ.getClass();
            if (!C1345730l7j.LIZ().disableMainPageSingleAct) {
                C295150BhZ.LIZ.getClass();
                if (C295150BhZ.LIZ()) {
                    if (C1345730l7j.LIZ().needCacheIsSupportMainPage) {
                        C1345750l7l.LIZ = true;
                    }
                    return true;
                }
            }
            return false;
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null && iDetailFeedSafService.LIZLLL((Fragment) interfaceC214902198i) != null) {
            return true;
        }
        IPostModeService iPostModeService = (IPostModeService) PluggableExtentionKt.pluggableSpi$default(IPostModeService.class, false, false, false, 14, null);
        if (iPostModeService != null) {
            C1345730l7j.LIZ.getClass();
            if (!C1345730l7j.LIZ().disablePostModeSingleAct && iPostModeService.LJJIIZI((Fragment) interfaceC214902198i)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIIL(Comment comment, Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        boolean z = false;
        if (comment == null || fragment == null || interfaceC665370Q7z == null || !C1344890l6N.LIZ()) {
            return false;
        }
        UserVoteInfo userVoteInfo = comment.userVoteInfo;
        CommentContextSource commentContextSource = null;
        if (userVoteInfo == null || userVoteInfo.voteText == null) {
            return false;
        }
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", CommentContextSource.class, null);
        if (interfaceC1555100qZQLIZIZ != null) {
            commentContextSource = (CommentContextSource) interfaceC1555100qZQLIZIZ.getSource();
        }
        if (LJIIIIZZ(commentContextSource)) {
            return false;
        }
        C1340510kzJ.LIZ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSource)) {
            return false;
        }
        ICommentListVMAbility iCommentListVMAbilityLJ = C1345760l7m.LJ(fragment, interfaceC665370Q7z);
        if (iCommentListVMAbilityLJ != null && iCommentListVMAbilityLJ.M62(comment.getCid())) {
            z = true;
        }
        return !z;
    }

    public static final boolean LJIILIIL(Comment comment, CommentContextSource commentContextSource, boolean z) {
        UserVoteInfo userVoteInfo;
        if (comment == null || !C1344890l6N.LIZ() || LJIIIIZZ(commentContextSource) || (userVoteInfo = comment.userVoteInfo) == null || userVoteInfo.voteText == null) {
            return false;
        }
        C1340510kzJ.LIZ.getClass();
        if (C1340510kzJ.LIZIZ(commentContextSource)) {
            return false;
        }
        return !z;
    }

    public static final C1340400kz8 LJIJ(int i, Comment comment, boolean z) throws Exception {
        int iLIZLLL = LIZLLL(comment);
        if (iLIZLLL != 1) {
            if (iLIZLLL == 2) {
                return new C1340440kzC(comment, C1340060kya.LIZ(i, comment, z));
            }
            throw new Exception("type error");
        }
        return new C1340430kzB(comment, C1340060kya.LIZ(i, comment, z));
    }
}
