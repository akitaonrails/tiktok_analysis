package X;

import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.detail.vm.SubSpaceDetailVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCCommentPageResponse;

/* JADX INFO: renamed from: X.0K3G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K3G implements C0K3N {
    public final SubSpaceDetailVM LL;
    public final C0K3S LLILLJJLI;
    public C0K37 LLILLL;
    public RecyclerView LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 631));

    public final void LJI() {
        ArrayList<AbstractC511160K2w> arrayList;
        ArrayList<AbstractC511160K2w> arrayList2;
        C0K37 c0k37 = this.LLILLL;
        if (c0k37 == null || (arrayList = c0k37.LL) == null) {
            return;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C0K3A) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C0K37 c0k372 = this.LLILLL;
        if (c0k372 != null && (arrayList2 = c0k372.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C0K37 c0k373 = this.LLILLL;
        if (c0k373 != null) {
            c0k373.notifyItemRemoved(numValueOf.intValue());
        }
        LJI();
    }

    public final void LJII() {
        ArrayList<AbstractC511160K2w> arrayList;
        ArrayList<AbstractC511160K2w> arrayList2;
        C0K37 c0k37 = this.LLILLL;
        if (c0k37 == null || (arrayList = c0k37.LL) == null) {
            return;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            } else if (it2.next() instanceof C0K2N) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        C0K37 c0k372 = this.LLILLL;
        if (c0k372 != null && (arrayList2 = c0k372.LL) != null) {
            ListProtector.remove(arrayList2, numValueOf.intValue());
        }
        C0K37 c0k373 = this.LLILLL;
        if (c0k373 != null) {
            c0k373.notifyItemRemoved(numValueOf.intValue());
        }
    }

    @Override // X.C0K3N
    public final boolean LJIIJJI() {
        C511170K2x c511170K2x;
        C0K3S c0k3s = this.LLILLJJLI;
        return C0K51.LJI((c0k3s == null || (c511170K2x = c0k3s.LLIZLLLIL) == null) ? null : c511170K2x.LIZIZ);
    }

    public static final SpaceCommentItem LIZIZ(SpaceCommentItem spaceCommentItem) {
        if (spaceCommentItem == null) {
            return null;
        }
        int i = spaceCommentItem.commentType;
        if (i != C0K3I.COMMENT.getValue()) {
            if (i != C0K3I.REPLY.getValue() && i != C0K3I.REPLY_TO_REPLY.getValue()) {
                return null;
            }
            return spaceCommentItem.replyCommentInfo;
        }
        return spaceCommentItem;
    }

    public final void LJ(SpacePost spacePost) {
        C0K37 c0k37;
        ArrayList<AbstractC511160K2w> arrayList;
        if (spacePost != null && (c0k37 = this.LLILLL) != null && (arrayList = c0k37.LL) != null) {
            int i = 0;
            for (AbstractC511160K2w abstractC511160K2w : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC511160K2w abstractC511160K2w2 = abstractC511160K2w;
                    if (abstractC511160K2w2.LIZIZ() == spacePost.postId) {
                        if (!(abstractC511160K2w2 instanceof C0K34)) {
                            if ((abstractC511160K2w2 instanceof C511150K2v) || (abstractC511160K2w2 instanceof C0K3F)) {
                                if (abstractC511160K2w2 instanceof C511150K2v) {
                                    ((C511150K2v) abstractC511160K2w2).LIZ = spacePost;
                                }
                            }
                        } else {
                            ((C0K34) abstractC511160K2w2).LIZLLL(spacePost);
                        }
                        C0K37 c0k372 = this.LLILLL;
                        if (c0k372 != null) {
                            c0k372.notifyItemChanged(i);
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public final void LJFF(C0K3J c0k3j) {
        ArrayList<AbstractC511160K2w> arrayList;
        C0K37 c0k37;
        C0K37 c0k372 = this.LLILLL;
        if (c0k372 != null && (arrayList = c0k372.LL) != null) {
            Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), c0k3j)) {
                    if (i >= 0 && (c0k37 = this.LLILLL) != null) {
                        c0k37.notifyItemChanged(i);
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }

    public C0K3G(SubSpaceDetailVM subSpaceDetailVM, C0K3S c0k3s) {
        this.LL = subSpaceDetailVM;
        this.LLILLJJLI = c0k3s;
    }

    public static final int LIZ(SpaceCommentItem spaceCommentItem, ArrayList arrayList) {
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            AbstractC511160K2w abstractC511160K2w = (AbstractC511160K2w) it2.next();
            if (abstractC511160K2w instanceof C0K3J) {
                if (spaceCommentItem.commentType == C0K3I.COMMENT.getValue()) {
                    C0K3J c0k3j = (C0K3J) abstractC511160K2w;
                    if (c0k3j.LIZLLL() == spaceCommentItem.commentId && c0k3j.LIZ.postId == spaceCommentItem.postId) {
                        return i;
                    }
                } else {
                    SpaceCommentItem spaceCommentItem2 = ((C0K3J) abstractC511160K2w).LIZ;
                    if (spaceCommentItem2.commentId == spaceCommentItem.commentId && spaceCommentItem2.postId == spaceCommentItem.postId) {
                        return i;
                    }
                }
            }
            i++;
        }
        return -1;
    }

    public final ArrayList<AbstractC511160K2w> LIZJ(SpaceCommentItem spaceCommentItem, SpaceCommentItem spaceCommentItem2) {
        boolean z;
        SpaceCommentItem spaceCommentItemLIZIZ = LIZIZ(spaceCommentItem2);
        if (spaceCommentItemLIZIZ != null && spaceCommentItem.commentId == spaceCommentItemLIZIZ.commentId) {
            z = true;
        } else {
            z = false;
        }
        SpacePost spacePost = null;
        if (z) {
            return null;
        }
        ArrayList<AbstractC511160K2w> arrayList = new ArrayList<>();
        C0K3S c0k3s = this.LLILLJJLI;
        if (c0k3s != null) {
            spacePost = c0k3s.LLILLL;
        }
        arrayList.add(new C0K3J(spaceCommentItem, spacePost));
        long j = spaceCommentItem.replyCount;
        if (j > 0) {
            arrayList.add(new C0K3K(spaceCommentItem, j));
        }
        return arrayList;
    }

    public final ArrayList<AbstractC511160K2w> LIZLLL(SpaceCommentItem spaceCommentItem, ArrayList<AbstractC511160K2w> arrayList) {
        int i;
        SpacePost spacePost;
        SpacePost spacePost2 = null;
        if (spaceCommentItem == null) {
            return null;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        while (true) {
            i = 1;
            if (!it2.hasNext()) {
                break;
            }
            AbstractC511160K2w next = it2.next();
            AbstractC511160K2w abstractC511160K2w = next;
            SpaceCommentItem spaceCommentItemLIZIZ = LIZIZ(spaceCommentItem);
            if ((abstractC511160K2w instanceof C0K3J) && spaceCommentItemLIZIZ != null && ((C0K3J) abstractC511160K2w).LIZLLL() == spaceCommentItemLIZIZ.commentId) {
                if (next != null) {
                    return null;
                }
            }
        }
        ArrayList<AbstractC511160K2w> arrayList2 = new ArrayList<>();
        SpaceCommentItem spaceCommentItem2 = spaceCommentItem.replyCommentInfo;
        if (spaceCommentItem2 != null) {
            C0K3S c0k3s = this.LLILLJJLI;
            if (c0k3s != null) {
                spacePost = c0k3s.LLILLL;
            } else {
                spacePost = null;
            }
            arrayList2.add(new C0K3J(spaceCommentItem2, spacePost));
        } else {
            i = 0;
        }
        C0K3S c0k3s2 = this.LLILLJJLI;
        if (c0k3s2 != null) {
            spacePost2 = c0k3s2.LLILLL;
        }
        arrayList2.add(new C0K3J(spaceCommentItem, spacePost2));
        SpaceCommentItem spaceCommentItemLIZIZ2 = LIZIZ(spaceCommentItem);
        if (spaceCommentItemLIZIZ2 != null) {
            long j = spaceCommentItemLIZIZ2.replyCount;
            if (j > 0) {
                arrayList2.add(new C0K3K(spaceCommentItemLIZIZ2, j - ((long) i)));
            }
        }
        return arrayList2;
    }

    @Override // X.C0K3N
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Boolean bool;
        String str;
        C511170K2x c511170K2x;
        Long l;
        C11NZ c11nz;
        C511170K2x c511170K2x2;
        C0K3S c0k3s = this.LLILLJJLI;
        if (c0k3s != null && (c511170K2x2 = c0k3s.LLIZLLLIL) != null) {
            bool = c511170K2x2.LIZIZ;
        } else {
            bool = null;
        }
        if (C0K51.LJFF(bool)) {
            ((AwS373S0200000_7) function1).invoke(new IllegalArgumentException("has more is false"));
            return;
        }
        C0K3S c0k3s2 = this.LLILLJJLI;
        if (c0k3s2 != null && (str = c0k3s2.LLJIJIL) != null && (c511170K2x = c0k3s2.LLIZLLLIL) != null && (l = c511170K2x.LIZ) != null) {
            long jLongValue = l.longValue();
            SpacePost spacePost = this.LLILLJJLI.LLILLL;
            if (spacePost != null) {
                C11NZ<DataResponse<PGCCommentPageResponse.ResponseData>> commentPages = C0K4J.LIZ().getCommentPages(spacePost.postId, jLongValue, str, C0K3I.COMMENT.getValue(), 0L);
                if (commentPages != null && (c11nz = (C11NZ) C0JCK.LIZ(commentPages, EnumC499440JiI.GENERAL, C0K3G.class.getSimpleName(), "sub/space/comment/page", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this.LL))) != null) {
                    c11nz.LJJLL(new AfS143S0200000_7(function0, (EmoteModel) this, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 22), new AfS176S0100000_7((AwS373S0200000_7) function1, 178));
                }
            }
        }
    }
}
