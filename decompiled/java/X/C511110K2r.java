package X;

import Y.AfS143S0200000_7;
import Y.AfS176S0100000_7;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SpaceCommentItem;
import com.bytedance.android.livesdk.chatroom.api.SpacePoll;
import com.bytedance.android.livesdk.chatroom.api.SpacePollOption;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import webcast.api.pgc_sub.PGCPostPageResponse;

/* JADX INFO: renamed from: X.0K2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511110K2r implements C0K3N {
    public final SubSpaceFeedVM LL;
    public final C511370K3r LLILLJJLI;
    public C0K2Z LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 759));
    public int LLILZIL = -1;
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 758));

    public final boolean LIZJ() {
        ArrayList<AbstractC511160K2w> arrayList;
        C0K2Z c0k2z = this.LLILLL;
        if (c0k2z == null || (arrayList = c0k2z.LL) == null) {
            return false;
        }
        Iterator<AbstractC511160K2w> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC511160K2w next = it2.next();
            if ((next instanceof C511130K2t) || (next instanceof C511150K2v)) {
                return next != null;
            }
        }
        return false;
    }

    @Override // X.C0K3N
    public final boolean LJIIJJI() {
        C511170K2x c511170K2x;
        C511370K3r c511370K3r = this.LLILLJJLI;
        return C0K51.LJI((c511370K3r == null || (c511170K2x = c511370K3r.LL) == null) ? null : c511170K2x.LIZIZ);
    }

    public static final ArrayList<AbstractC511160K2w> LIZ(SpacePost spacePost) {
        List<SpacePollOption> list;
        String strValueOf;
        ArrayList<AbstractC511160K2w> arrayList = new ArrayList<>();
        arrayList.add(new C511150K2v(spacePost));
        if (!spacePost.previewMode) {
            SpacePoll spacePoll = spacePost.pollInfo;
            if (spacePoll != null && (list = spacePoll.optionList) != null) {
                int i = 1;
                for (SpacePollOption spacePollOption : list) {
                    if (1 <= i && i < 27) {
                        strValueOf = String.valueOf((char) ((i + 65) - 1));
                    } else {
                        strValueOf = "?";
                    }
                    arrayList.add(new C0K34(spacePost, spacePollOption, strValueOf));
                    i++;
                }
            }
            Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0K3J((SpaceCommentItem) it2.next(), spacePost));
            }
        } else {
            arrayList.add(new C511140K2u(spacePost));
        }
        arrayList.add(new C511120K2s(spacePost));
        return arrayList;
    }

    public static final ArrayList<AbstractC511160K2w> LIZIZ(SpacePost spacePost) {
        ArrayList<AbstractC511160K2w> arrayList = new ArrayList<>();
        arrayList.add(new C511130K2t(spacePost));
        if (!spacePost.previewMode) {
            Iterator it2 = C13LP.LL(spacePost.commentList, 3).iterator();
            while (it2.hasNext()) {
                arrayList.add(new C0K3J((SpaceCommentItem) it2.next(), spacePost));
            }
        } else {
            arrayList.add(new C511140K2u(spacePost));
        }
        arrayList.add(new C511120K2s(spacePost));
        return arrayList;
    }

    public final void LIZLLL(SpacePost spacePost) {
        ArrayList<AbstractC511160K2w> arrayList;
        C0K2Z c0k2z = this.LLILLL;
        if (c0k2z != null && (arrayList = c0k2z.LL) != null) {
            int i = 0;
            for (AbstractC511160K2w abstractC511160K2w : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    AbstractC511160K2w abstractC511160K2w2 = abstractC511160K2w;
                    if (abstractC511160K2w2.LIZIZ() == spacePost.postId) {
                        if (abstractC511160K2w2 instanceof C0K34) {
                            ((C0K34) abstractC511160K2w2).LIZLLL(spacePost);
                        } else if (abstractC511160K2w2 instanceof C511150K2v) {
                            ((C511150K2v) abstractC511160K2w2).LIZ = spacePost;
                        }
                        C0K2Z c0k2z2 = this.LLILLL;
                        if (c0k2z2 != null) {
                            c0k2z2.notifyItemChanged(i);
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

    public C511110K2r(SubSpaceFeedVM subSpaceFeedVM, C511370K3r c511370K3r) {
        this.LL = subSpaceFeedVM;
        this.LLILLJJLI = c511370K3r;
    }

    @Override // X.C0K3N
    public final void e4(Function0<Unit> function0, Function1<? super Throwable, Unit> function1) {
        Boolean bool;
        String secUid;
        C511170K2x c511170K2x;
        Long l;
        long jLongValue;
        C11NZ c11nz;
        C511170K2x c511170K2x2;
        Long l2;
        User user;
        C511170K2x c511170K2x3;
        C511370K3r c511370K3r = this.LLILLJJLI;
        if (c511370K3r != null && (c511170K2x3 = c511370K3r.LL) != null) {
            bool = c511170K2x3.LIZIZ;
        } else {
            bool = null;
        }
        if (C0K51.LJFF(bool)) {
            ((AwS373S0200000_7) function1).invoke(new IllegalArgumentException("has more is false"));
            return;
        }
        C511370K3r c511370K3r2 = this.LLILLJJLI;
        if (c511370K3r2 == null || (user = c511370K3r2.LLILLL) == null || (secUid = user.getSecUid()) == null) {
            secUid = "";
        }
        C511370K3r c511370K3r3 = this.LLILLJJLI;
        if (c511370K3r3 != null && (c511170K2x = c511370K3r3.LL) != null && (l = c511170K2x.LIZ) != null) {
            long jLongValue2 = l.longValue();
            C511370K3r c511370K3r4 = this.LLILLJJLI;
            if (c511370K3r4 != null && (c511170K2x2 = c511370K3r4.LL) != null && (l2 = c511170K2x2.LIZJ) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            C11NZ<DataResponse<PGCPostPageResponse.ResponseData>> postPage = C0K4J.LIZ().getPostPage(secUid, jLongValue2, jLongValue);
            if (postPage != null && (c11nz = (C11NZ) postPage.LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this.LL))) != null) {
                c11nz.LJJLL(new AfS143S0200000_7(function0, (EmoteModel) this, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 34), new AfS176S0100000_7((AwS373S0200000_7) function1, 273));
            }
        }
    }
}
