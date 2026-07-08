package X;

import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TPG, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0TPG extends C0TRR {
    public static final C01GW<C0TPF> LJ = C452501pT.LIZIZ(new C0TPH());
    public int LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(506));

    public abstract int LIZLLL();

    public final void LJ(int i, Integer num) {
        if (((Boolean) this.LIZLLL.getValue()).booleanValue() && !C746020TOe.LIZ().LIZIZ().getBoolean(C0TPF.LIZ("did_user_request_card"), false)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(LIZLLL(), "card_type");
            c2344009Gk.LIZJ(i, "fail_reason");
            if (num != null) {
                num.intValue();
                c2344009Gk.LIZJ(num.intValue(), "fcp_freq_check_fail_code");
            }
            C20684815ws.LJIILLIIL("ttplus_feedcard_request_fail", c2344009Gk.LIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x022e  */
    @Override // X.C0TRR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest> LIZJ(X.C0TRR r22, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData r23, java.util.List<com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo> r24) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0TPG.LIZJ(X.0TRR, com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData, java.util.List):java.util.List");
    }
}
