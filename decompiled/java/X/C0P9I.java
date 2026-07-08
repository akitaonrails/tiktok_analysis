package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0P9I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9I {
    public static final void LIZ(Aweme aweme) {
        if (((C0PRC) C0Q3E.LJI().Ph1().LIZJ()).LL == C644560PPy.LJIJJLI()) {
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            C0Q3E.LJI().fe(new C0P9J(true, aid));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Entering search inner flow! awemeId = ");
            sbLIZ.append(aid);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
