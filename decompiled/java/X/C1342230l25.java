package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentExposureVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1342230l25 {
    public static boolean LJIIJJI;
    public final CommentExposureVM LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Function1<Comment, Boolean> LIZLLL;
    public long LJ;
    public int LJFF;
    public final Set<Comment> LJI = new LinkedHashSet();
    public final Set<Comment> LJII = new LinkedHashSet();
    public final Set<Comment> LJIIIIZZ = new LinkedHashSet();
    public final Set<Comment> LJIIIZ = new LinkedHashSet();
    public Aweme LJIIJ;

    public final void LIZ(ViewGroup viewGroup, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        boolean z;
        int height;
        int i;
        float f;
        float f2;
        AbstractC1049450dPr abstractC1049450dPr;
        Comment commentLIZ;
        String aid;
        CommentExposureVM commentExposureVM;
        CommentExposureVM commentExposureVM2;
        AbstractC1049450dPr abstractC1049450dPr2;
        Comment commentLIZ2;
        String aid2;
        CommentExposureVM commentExposureVM3;
        int height2;
        AbstractC1049450dPr abstractC1049450dPr3;
        Comment commentLIZ3;
        String aid3;
        CommentExposureVM commentExposureVM4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LJ >= 100 && !viewOnAttachStateChangeListenerC20604515jv.isInLayout()) {
            this.LJ = jCurrentTimeMillis;
            if (((Number) C277760Auc.LIZ.getValue()).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            float f3 = 0.67f;
            float f4 = 0.19f;
            if (z && this.LIZIZ) {
                if (viewGroup != null && (height2 = viewGroup.getHeight()) != 0) {
                    float f5 = height2;
                    int i2 = (int) (0.19f * f5);
                    int i3 = (int) (f5 * 0.67f);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    int childCount = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i4);
                        RecyclerView.ViewHolder childViewHolder = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(childAt);
                        if ((childViewHolder instanceof BaseCommentCell) && (abstractC1049450dPr3 = (AbstractC1049450dPr) ((PowerCell) childViewHolder).getItem()) != null && (commentLIZ3 = abstractC1049450dPr3.LIZ()) != null && this.LIZLLL.invoke(commentLIZ3).booleanValue()) {
                            String awemeId = commentLIZ3.getAwemeId();
                            Aweme aweme = this.LJIIJ;
                            if (aweme != null) {
                                aid3 = aweme.getAid();
                            } else {
                                aid3 = null;
                            }
                            if (Intrinsics.LJFF(awemeId, aid3) && LIZIZ(childAt, i2, i3, true)) {
                                linkedHashSet.add(commentLIZ3);
                                if (!this.LJII.contains(commentLIZ3) && (commentExposureVM4 = this.LIZ) != null) {
                                    commentExposureVM4.zQ2(commentLIZ3);
                                }
                                this.LJII.add(commentLIZ3);
                            }
                        }
                    }
                    for (Comment comment : C13LP.LJLLLLLL(this.LJII, linkedHashSet)) {
                        CommentExposureVM commentExposureVM5 = this.LIZ;
                        if (commentExposureVM5 != null) {
                            commentExposureVM5.BQ2(comment);
                        }
                    }
                    this.LJII.clear();
                    this.LJII.addAll(linkedHashSet);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("attached Focus area Holders size = ");
                    sbLIZ.append(this.LJII.size());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            } else {
                boolean z2 = this.LIZIZ;
                int paddingTop = viewOnAttachStateChangeListenerC20604515jv.getPaddingTop();
                int height3 = viewOnAttachStateChangeListenerC20604515jv.getHeight() - viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                if (viewGroup != null && (height = viewGroup.getHeight()) != 0) {
                    if (z2) {
                        i = 0;
                        f = height;
                    } else {
                        i = viewGroup.getResources().getDisplayMetrics().heightPixels;
                        f = i;
                        f4 = 0.11f;
                    }
                    int i5 = (int) (f * f4);
                    if (z2) {
                        f2 = height;
                    } else {
                        f2 = i;
                        f3 = 0.75f;
                    }
                    int i6 = (int) (f2 * f3);
                    int childCount2 = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
                    for (int i7 = 0; i7 < childCount2; i7++) {
                        View childAt2 = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i7);
                        int height4 = childAt2.getHeight();
                        int iMin = Math.min(childAt2.getBottom(), height3) - Math.max(childAt2.getTop(), paddingTop);
                        if (iMin < 0) {
                            iMin = 0;
                        }
                        if (iMin / height4 >= 0.6f) {
                            RecyclerView.ViewHolder childViewHolder2 = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(childAt2);
                            if ((childViewHolder2 instanceof BaseCommentCell) && (abstractC1049450dPr = (AbstractC1049450dPr) ((PowerCell) childViewHolder2).getItem()) != null && (commentLIZ = abstractC1049450dPr.LIZ()) != null && this.LIZLLL.invoke(commentLIZ).booleanValue()) {
                                String awemeId2 = commentLIZ.getAwemeId();
                                Aweme aweme2 = this.LJIIJ;
                                if (aweme2 != null) {
                                    aid = aweme2.getAid();
                                } else {
                                    aid = null;
                                }
                                if (Intrinsics.LJFF(awemeId2, aid)) {
                                    if (LIZIZ(childAt2, i5, i6, z2)) {
                                        linkedHashSet2.add(commentLIZ);
                                        if (!this.LJII.contains(commentLIZ) && (commentExposureVM2 = this.LIZ) != null) {
                                            commentExposureVM2.zQ2(commentLIZ);
                                        }
                                        this.LJII.add(commentLIZ);
                                        this.LJIIIZ.add(commentLIZ);
                                    } else if (!this.LJIIIZ.contains(commentLIZ)) {
                                        linkedHashSet3.add(commentLIZ);
                                        if (!this.LJIIIIZZ.contains(commentLIZ) && (commentExposureVM = this.LIZ) != null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("onAttachNonFocusArea CurComment?.cid = ");
                                            sbLIZ2.append(commentLIZ.getCid());
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                            C722710SWn c722710SWn = commentExposureVM.LLILZIL;
                                            if (c722710SWn != null) {
                                                c722710SWn.LIZIZ(commentLIZ);
                                            }
                                            C722710SWn c722710SWn2 = commentExposureVM.LLILZLL;
                                            if (c722710SWn2 != null) {
                                                c722710SWn2.LIZIZ.remove(commentLIZ);
                                            }
                                        }
                                        this.LJIIIIZZ.add(commentLIZ);
                                    }
                                }
                            }
                        }
                    }
                    Set<Comment> setLJLLLLLL = C13LP.LJLLLLLL(this.LJII, linkedHashSet2);
                    Set<Comment> setLJLLLLLL2 = C13LP.LJLLLLLL(this.LJIIIIZZ, linkedHashSet3);
                    for (Comment comment2 : setLJLLLLLL) {
                        CommentExposureVM commentExposureVM6 = this.LIZ;
                        if (commentExposureVM6 != null) {
                            commentExposureVM6.BQ2(comment2);
                        }
                    }
                    for (Comment comment3 : setLJLLLLLL2) {
                        CommentExposureVM commentExposureVM7 = this.LIZ;
                        if (commentExposureVM7 != null) {
                            commentExposureVM7.CQ2(comment3);
                        }
                    }
                    this.LJII.clear();
                    this.LJII.addAll(linkedHashSet2);
                    this.LJIIIIZZ.clear();
                    this.LJIIIIZZ.addAll(linkedHashSet3);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("attached Focus area Holders size = ");
                    sbLIZ3.append(this.LJII.size());
                    sbLIZ3.append(", common area Holders size = ");
                    sbLIZ3.append(this.LJIIIIZZ.size());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }
            }
            if (this.LIZJ) {
                new ArrayList();
                int paddingTop2 = viewOnAttachStateChangeListenerC20604515jv.getPaddingTop();
                int height5 = viewOnAttachStateChangeListenerC20604515jv.getHeight() - viewOnAttachStateChangeListenerC20604515jv.getPaddingBottom();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                int childCount3 = viewOnAttachStateChangeListenerC20604515jv.getChildCount();
                for (int i8 = 0; i8 < childCount3; i8++) {
                    View childAt3 = viewOnAttachStateChangeListenerC20604515jv.getChildAt(i8);
                    int top = childAt3.getTop();
                    int bottom = childAt3.getBottom();
                    int height6 = childAt3.getHeight();
                    int iMin2 = Math.min(bottom, height5) - Math.max(top, paddingTop2);
                    if (iMin2 < 0) {
                        iMin2 = 0;
                    }
                    if (iMin2 / height6 >= 0.6f) {
                        RecyclerView.ViewHolder childViewHolder3 = viewOnAttachStateChangeListenerC20604515jv.getChildViewHolder(childAt3);
                        if ((childViewHolder3 instanceof BaseCommentCell) && (abstractC1049450dPr2 = (AbstractC1049450dPr) ((PowerCell) childViewHolder3).getItem()) != null && (commentLIZ2 = abstractC1049450dPr2.LIZ()) != null && this.LIZLLL.invoke(commentLIZ2).booleanValue()) {
                            String awemeId3 = commentLIZ2.getAwemeId();
                            Aweme aweme3 = this.LJIIJ;
                            if (aweme3 != null) {
                                aid2 = aweme3.getAid();
                            } else {
                                aid2 = null;
                            }
                            if (Intrinsics.LJFF(awemeId3, aid2)) {
                                linkedHashSet4.add(commentLIZ2);
                                if (!this.LJI.contains(commentLIZ2) && (commentExposureVM3 = this.LIZ) != null) {
                                    commentExposureVM3.yQ2(commentLIZ2);
                                }
                                this.LJI.add(commentLIZ2);
                            }
                        }
                    }
                }
                for (Comment comment4 : C13LP.LJLLLLLL(this.LJI, linkedHashSet4)) {
                    CommentExposureVM commentExposureVM8 = this.LIZ;
                    if (commentExposureVM8 != null) {
                        commentExposureVM8.AQ2(comment4);
                    }
                }
                this.LJI.clear();
                this.LJI.addAll(linkedHashSet4);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("attachedHolders size = ");
                sbLIZ4.append(this.LJI.size());
                C2188811AlT.LIZIZ(sbLIZ4);
            }
        }
    }

    public C1342230l25(CommentExposureVM commentExposureVM, boolean z, boolean z2, AwS600S0100000_21 awS600S0100000_21) {
        this.LIZ = commentExposureVM;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = awS600S0100000_21;
    }

    public final boolean LIZIZ(View view, int i, int i2, boolean z) {
        if (z) {
            int top = view.getTop() + this.LJFF;
            if (view.getBottom() + this.LJFF <= i || top >= i2) {
                return false;
            }
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = iArr[1];
        if (view.getHeight() + i3 <= i || i3 >= i2) {
            return false;
        }
        return true;
    }
}
