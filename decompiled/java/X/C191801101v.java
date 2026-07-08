package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.101v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191801101v implements InterfaceC722440SVm<C0SVX> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C102D LIZJ;
    public final C722360SVe LIZLLL;

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVX> LJ() {
        return new InterfaceC722470SVp<C0SVX>() { // from class: X.101u
            public final Aweme LIZ;

            @Override // X.InterfaceC722470SVp
            public final C07XH LIZ() {
                String string;
                AwemeStatus.ReviewResult reviewResult;
                C0SVT c0svt = new C0SVT(C0SXM.COLOR.ordinal(), 0, C1308910kAL.LIZJ(R.attr.oi, this.LIZIZ.LIZ), 2);
                AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(this.LIZ);
                if (statusSafety == null || (reviewResult = statusSafety.getReviewResult()) == null || (string = reviewResult.getCoverNotice()) == null) {
                    string = "";
                }
                C191801101v c191801101v = this.LIZIZ;
                if (string.length() == 0) {
                    string = c191801101v.LIZ.getString(2131837443);
                }
                return new C0SVX(c0svt, string, 62, null);
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.102D] */
    public C191801101v(Context context, Aweme aweme, final Function0 function0) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = new C0SVZ() { // from class: X.102D
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                this.LIZ.getClass();
                function0.invoke();
            }
        };
        this.LIZLLL = new C722360SVe("card_mask", "moderation", C2097908Jt.LIZJ(new Pair("item_id", aweme.getAid())));
    }
}
