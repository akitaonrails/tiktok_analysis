package X;

import Y.ACListenerS115S0200000_11;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0Rqb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708430Rqb implements InterfaceC698070RZt {
    public final Context LIZ;

    @Override // X.InterfaceC698070RZt
    public final Integer LIZIZ() {
        return null;
    }

    @Override // X.InterfaceC698070RZt
    public final String LLLII() {
        return "bottom_tag_container_ad_label";
    }

    public C708430Rqb(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC698070RZt
    public final View.OnClickListener LIZ(VideoItemParams videoItemParams) {
        Aweme aweme = videoItemParams.getAweme();
        if (C1017070cZd.LIZ(aweme)) {
            return new ACListenerS115S0200000_11(this, videoItemParams, 36);
        }
        C1911600zqQ c1911600zqQ = C1911600zqQ.LIZIZ;
        if (c1911600zqQ.LIZ(aweme)) {
            return c1911600zqQ.LJFF(aweme);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c A[PHI: r0
      0x002c: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v6 java.lang.String) binds: [B:14:0x0029, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.InterfaceC698070RZt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.getAweme()
            boolean r0 = X.C1017070cZd.LIZ(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
            if (r0 == 0) goto L1e
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r0 = r0.getLabel()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getLabelName()
            if (r0 != 0) goto L2c
        L1e:
            return r1
        L1f:
            com.ss.android.ugc.aweme.commercialize.model.promote.PromoteModel r0 = r2.getPromoteModel()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r0.getLabelText()
            if (r0 != 0) goto L2c
            return r1
        L2c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C708430Rqb.LIZJ(com.ss.android.ugc.aweme.feed.model.VideoItemParams):java.lang.String");
    }
}
