package X;

import Y.AfS107S0300000_12;
import Y.AfS148S0200000_12;
import Y.AfS35S1300000_12;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.donation.token.DonationSessionResponse;
import com.ss.android.ugc.aweme.donation.token.DonationTokenCreateApi;
import com.ss.android.ugc.aweme.donation.token.DonationTokenResponse;
import com.ss.android.ugc.aweme.donation.token.SessionCreationReq;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0TGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743950TGf {
    public static final C743950TGf LIZ = new C743950TGf();
    public static final IAccountService LIZIZ = (IAccountService) ServiceManager.get().getService(IAccountService.class);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [T, X.0XRx] */
    public static void LIZ(Context context, String str, int i, String str2, String str3, String str4, DialogC848910XRx dialogC848910XRx, Function1 function1) {
        Long lValueOf;
        C11NZ<DonationTokenResponse> c11nz;
        Long lValueOf2;
        C11NZ<DonationSessionResponse> c11nzCreateSession;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = dialogC848910XRx;
        if (context instanceof Activity) {
            if (dialogC848910XRx == 0) {
                c259800zU.element = new DialogC848910XRx(context);
            }
            C0FNV.LIZJ((Dialog) c259800zU.element);
        }
        if (TextUtils.equals(str3, "PERCENT")) {
            if (i == 3) {
                DonationTokenCreateApi.LIZ.getClass();
                c11nzCreateSession = C0TPK.LIZIZ().createSession(new SessionCreationReq(str2, Integer.valueOf(i), 0L, str, str4));
            } else {
                DonationTokenCreateApi.LIZ.getClass();
                DonationTokenCreateApi donationTokenCreateApiLIZIZ = C0TPK.LIZIZ();
                Integer numValueOf = Integer.valueOf(i);
                if (str != null) {
                    lValueOf2 = Long.valueOf(CastLongProtector.parseLong(str));
                } else {
                    lValueOf2 = null;
                }
                c11nzCreateSession = donationTokenCreateApiLIZIZ.createSession(new SessionCreationReq(str2, numValueOf, lValueOf2, null, str4));
            }
            c11nzCreateSession.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS107S0300000_12(context, function1, c259800zU, 1), new AfS148S0200000_12(c259800zU, context, 38));
            return;
        }
        if (i == 3) {
            DonationTokenCreateApi.LIZ.getClass();
            c11nz = C0TPK.LIZ().tokenCreate(i, 0L, str, str4);
        } else {
            DonationTokenCreateApi.LIZ.getClass();
            DonationTokenCreateApi donationTokenCreateApiLIZ = C0TPK.LIZ();
            if (str != null) {
                lValueOf = Long.valueOf(CastLongProtector.parseLong(str));
            } else {
                lValueOf = null;
            }
            c11nz = donationTokenCreateApiLIZ.tokenCreate(i, lValueOf, null, str4);
        }
        c11nz.LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS35S1300000_12(c259800zU, str2, function1, context, 0), new AfS148S0200000_12(c259800zU, context, 39));
    }
}
