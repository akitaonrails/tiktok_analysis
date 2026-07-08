package Y;

import X.C09JN;
import X.C0O8X;
import X.C1344030l4z;
import X.C1350920lG6;
import X.C1356840lPe;
import X.C1498560p6E;
import X.C1606010rtX;
import X.C1C7U;
import X.C844470XAv;
import X.EnumC1606080rte;
import X.EnumC1615506Uf;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import org.json.JSONException;

/* JADX INFO: loaded from: classes22.dex */
public class AfS8S1110000_21 implements C09JN {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS8S1110000_21 afS8S1110000_21, Object obj) throws JSONException {
        long size;
        C1C7U.LIZ("LikeListVM$BubbleBridge@d24d.fetchLikeList$1");
        LikeListResponse likeListResponse = (LikeListResponse) obj;
        LikeListVM likeListVM = ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).LLIZ;
        likeListVM.LLJIJIL.LIZ();
        likeListVM.LLJIJIL.LIZLLL(likeListResponse);
        likeListVM.LLJIJIL.LJFF();
        if (afS8S1110000_21.z2 && !likeListResponse.getHasMore()) {
            List<User> likeList = likeListResponse.getLikeList();
            if (likeList != null) {
                size = likeList.size();
            } else {
                size = 0;
            }
            Long l = (Long) ((Map) ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).LLIZLLLIL.getValue()).get(afS8S1110000_21.s0);
            if (l == null || size != l.longValue()) {
                ((Map) ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).LLIZLLLIL.getValue()).put(afS8S1110000_21.s0, Long.valueOf(size));
                C1344030l4z.LIZJ("LikeListVM", "Like bubble fetchLikeList notifyLikeCountChange");
                C1356840lPe.LIZIZ(afS8S1110000_21.s0, size, likeListResponse);
            }
        }
        if (afS8S1110000_21.z2) {
            ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).zQ2(new Pair(afS8S1110000_21.s0, likeListResponse), "REFRESH_LIKED_LIST_SUCCESS");
        } else {
            ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).zQ2(new Pair(afS8S1110000_21.s0, likeListResponse), "LOAD_MORE_LIKED_LIST_SUCCESS");
        }
        C1606010rtX.LIZIZ.LIZJ(EnumC1615506Uf.STORY, EnumC1606080rte.COMMENT, likeListResponse.getLikeList(), AFwS259S0000000_21.get$arr$(82));
        C1350920lG6.LJIJI("normal_video", "like_list", likeListResponse.getLikeList(), (Set) ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).LLJ.getValue());
        C1C7U.LIZIZ("LikeListVM$BubbleBridge@d24d.fetchLikeList$1");
    }

    public static final void accept$1(AfS8S1110000_21 afS8S1110000_21, Object obj) {
        C1C7U.LIZ("LikeListVM$BubbleBridge@d24d.fetchLikeList$2");
        Throwable th = (Throwable) obj;
        if (afS8S1110000_21.z2) {
            ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).zQ2(afS8S1110000_21.s0, "REFRESH_LIKED_LIST_FAIL");
        } else {
            ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).zQ2(afS8S1110000_21.s0, "LOAD_MORE_LIKED_LIST_FAIL");
        }
        C0O8X c0o8x = ((LikeListVM.BubbleBridge) afS8S1110000_21.l1).LLIZ.LLJIJIL;
        C844470XAv.LIZ.getClass();
        c0o8x.LJI(C1498560p6E.LIZ(C844470XAv.LIZ(), th));
        C1C7U.LIZIZ("LikeListVM$BubbleBridge@d24d.fetchLikeList$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS8S1110000_21(com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM.BubbleBridge r2, java.lang.String r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            if (r5 == 0) goto Lf
            r0 = r1
            r0.z2 = r4
            r0.l1 = r2
            r0.s0 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r2
            r0.z2 = r4
            r0.s0 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS8S1110000_21.<init>(com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM$BubbleBridge, java.lang.String, boolean, int):void");
    }
}
