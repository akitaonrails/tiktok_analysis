package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.debug.baseinfo.CommentBaseInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.control.CommentControlCell;
import com.ss.android.ugc.aweme.commentv2.debug.intention.CommentIntentionInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.lowend.CommentLowEndInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.photoinfo.CommentPhotoInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.photolimit.CommentPhotoControlInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.photozoom.CommentPhotoZoomInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.poll.CommentPollCell;
import com.ss.android.ugc.aweme.commentv2.debug.quickcomment.CommentQCInfoCell;
import com.ss.android.ugc.aweme.commentv2.debug.topbar.CommentTopBarInfoCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349860lEO extends LinearLayout {
    public final C1846060y8i LL;
    public final ViewOnAttachStateChangeListenerC20631115oD LLILLJJLI;
    public Aweme LLILLL;
    public final String LLILZ;
    public List<InterfaceC1891350zJl> LLILZIL;

    public final void LIZ() {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLILZIL = null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C745460TMa(null));
        arrayList.add(new AbstractC751690TeB() { // from class: X.0lEs
            @Override // X.AbstractC751690TeB
            public final String LIZ() {
                return "Comment Control";
            }
        });
        arrayList.add(new C1350150lEr(this.LLILLL, this.LLILZ));
        Aweme aweme = this.LLILLL;
        arrayList.add(new C745500TMe(aweme != null ? aweme.getAid() : null));
        arrayList.add(new C745480TMc(this.LLILLL));
        arrayList.add(new C745490TMd(this.LLILLL));
        arrayList.add(new AbstractC751690TeB() { // from class: X.0lEt
            @Override // X.AbstractC751690TeB
            public final String LIZ() {
                return "Photo Info";
            }
        });
        final Aweme aweme2 = this.LLILLL;
        arrayList.add(new AbstractC751690TeB(aweme2) { // from class: X.0TMb
            public final Aweme LL;

            @Override // X.AbstractC751690TeB
            public final String LIZ() {
                return "Photo Zoom Info";
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C745470TMb) && Intrinsics.LJFF(this.LL, ((C745470TMb) obj).LL);
            }

            public final int hashCode() {
                Aweme aweme3 = this.LL;
                if (aweme3 == null) {
                    return 0;
                }
                return aweme3.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("CommentPhotoZoomInfoData(aweme=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LL = aweme2;
            }
        });
        final Aweme aweme3 = this.LLILLL;
        arrayList.add(new AbstractC751690TeB(aweme3) { // from class: X.0lEq
            public final Aweme LL;

            @Override // X.AbstractC751690TeB
            public final String LIZ() {
                return "Photo Control Info";
            }

            {
                this.LL = aweme3;
            }
        });
        arrayList.add(new AbstractC751690TeB() { // from class: X.0lEu
            @Override // X.AbstractC751690TeB
            public final String LIZ() {
                return "Comment Poll";
            }
        });
        this.LLILZIL = arrayList;
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILLJJLI;
        if (viewOnAttachStateChangeListenerC20631115oD == null || (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) == null || (state = viewItemOperator.getState()) == null) {
            return;
        }
        state.LJIILL(arrayList, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD;
        super.onAttachedToWindow();
        C1846060y8i c1846060y8i = this.LL;
        if (c1846060y8i != null && (viewOnAttachStateChangeListenerC20631115oD = this.LLILLJJLI) != null) {
            new C1194810hCJ(c1846060y8i, viewOnAttachStateChangeListenerC20631115oD, true, new InterfaceC1194840hCM() { // from class: X.0lEi
                @Override // X.InterfaceC1194840hCM
                public final void LIZ(C1845940y8W c1845940y8W, int i) {
                    AbstractC751690TeB abstractC751690TeB;
                    List<InterfaceC1891350zJl> list = this.LIZ.LLILZIL;
                    InterfaceC1891350zJl interfaceC1891350zJl = null;
                    if (list != null) {
                        interfaceC1891350zJl = (InterfaceC1891350zJl) ListProtector.get(list, i);
                    }
                    if ((interfaceC1891350zJl instanceof AbstractC751690TeB) && (abstractC751690TeB = (AbstractC751690TeB) interfaceC1891350zJl) != null) {
                        c1845940y8W.LIZIZ(abstractC751690TeB.LIZ());
                    }
                }
            }).LIZ();
        }
        C622680Oba.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    @C14EU
    public final void onCommentDebugInfoEvent(C2036007yI c2036007yI) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        Comment comment;
        List<InterfaceC1891350zJl> list = this.LLILZIL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next() instanceof C745460TMa) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILLJJLI;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                if (c2036007yI != null) {
                    comment = c2036007yI.LIZ;
                } else {
                    comment = null;
                }
                state.LJIILJJIL(i, new C745460TMa(comment));
            }
        }
    }

    @C14EU
    public final void onCommentIntentionDebugInfoEvent(C1344920l6Q c1344920l6Q) {
        InterfaceC1733780vDc viewItemOperator;
        C20600815jK<InterfaceC1891350zJl> state;
        String aid;
        List<InterfaceC1891350zJl> list = this.LLILZIL;
        if (list != null) {
            Iterator it2 = ((ArrayList) list).iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next() instanceof C745500TMe) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = this.LLILLJJLI;
            if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null && (state = viewItemOperator.getState()) != null) {
                Aweme aweme = this.LLILLL;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                state.LJIILJJIL(i, new C745500TMe(aid));
            }
        }
    }

    public final void setAweme(Aweme aweme) {
        if (!Intrinsics.LJFF(this.LLILLL, aweme)) {
            this.LLILLL = aweme;
            LIZ();
        }
    }

    public C1349860lEO(Context context, Aweme aweme, String str) {
        InterfaceC1733780vDc viewItemOperator;
        super(context, null, 0);
        this.LLILLL = aweme;
        this.LLILZ = str;
        View viewSd = C786410Ut5.Sd(R.layout.a1s, C786410Ut5.ne(context), this);
        this.LL = (C1846060y8i) viewSd.findViewById(R.id.fgr);
        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = (ViewOnAttachStateChangeListenerC20631115oD) viewSd.findViewById(R.id.fh6);
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20631115oD;
        if (viewOnAttachStateChangeListenerC20631115oD != null && (viewItemOperator = viewOnAttachStateChangeListenerC20631115oD.getViewItemOperator()) != null) {
            viewItemOperator.LIZJ(CommentBaseInfoCell.class, CommentControlCell.class, CommentQCInfoCell.class, CommentIntentionInfoCell.class, CommentLowEndInfoCell.class, CommentTopBarInfoCell.class, CommentPhotoInfoCell.class, CommentPhotoZoomInfoCell.class, CommentPhotoControlInfoCell.class, CommentPollCell.class);
        }
        LIZ();
    }
}
