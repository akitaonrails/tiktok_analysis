package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.101x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191803101x implements InterfaceC722440SVm<C0SVX> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C191805101z LIZJ;
    public final C722360SVe LIZLLL;

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVX> LJ() {
        return new InterfaceC722470SVp<C0SVX>() { // from class: X.101y
            public final Aweme LIZ;

            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                String coverNotice;
                AwemeStatus.ReviewResult reviewResult;
                C0SVT c0svt = new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.a1_, this.LIZIZ.LIZ), 2);
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(this.LIZ);
                if (statusSafety == null || (reviewResult = statusSafety.getReviewResult()) == null || (coverNotice = reviewResult.getCoverNotice()) == null) {
                    coverNotice = "";
                }
                return new C0SVX(c0svt, coverNotice.length() != 0 ? coverNotice : "", 62, null);
            }

            {
                this.LIZ = this.LIZIZ.LIZIZ;
            }
        };
    }

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVX>> LIZIZ() {
        return C0SVW.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVW(this.LIZ, (C0SVX) c07xh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.101z] */
    public C191803101x(Context context, Aweme aweme, String str, final Function0<Unit> function0) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = new C0SVZ() { // from class: X.101z
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                int reviewStatus = AwemeExtKt.getReviewStatus(this.LIZ.LIZIZ);
                C20684815ws.LJIILLIIL("content_check_status_profile_page_show", C2097908Jt.LIZJ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, reviewStatus != 4 ? reviewStatus != 5 ? "" : "failed" : "in_progress")));
                function0.invoke();
            }
        };
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("item_id", aweme.getAid());
        pairArr[1] = new Pair("enter_from", str == null ? "" : str);
        this.LIZLLL = new C722360SVe("card_mask", "content_check", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
