package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731220v9U {
    public static int LIZ;

    public static String LIZ(Integer num, GoLiveECIconInfo goLiveECIconInfo) {
        if (num != null) {
            LIZ = num.intValue();
        }
        if (LIZ > 1 && goLiveECIconInfo != null && !goLiveECIconInfo.independentDisplayEcIcon) {
            return "inside";
        }
        return "outside";
    }

    public static String LIZLLL(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (Intrinsics.LJFF(str, "notify_kyc_status_refresh")) {
                    if (jSONObject.opt("kyc_status_update") == null || !Intrinsics.LJFF(JSONObjectProtectorUtils.getString(jSONObject, "kyc_status_update"), "success")) {
                        return "verify_identity_later";
                    }
                    return "KYC_verification";
                }
                if (Intrinsics.LJFF(str, "notify_kyc_id_verification_popup")) {
                    return "verify_identity_later";
                }
                return "";
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }
        return "";
    }

    public static String LIZIZ(Context context, int i, String str) {
        Resources resources;
        Integer numValueOf;
        if (!TextUtils.isEmpty(str) && (resources = context.getResources()) != null && (numValueOf = Integer.valueOf(C786410Ut5.n3(resources, str, "string", context.getPackageName()))) != null && numValueOf.intValue() > 0) {
            return context.getString(numValueOf.intValue());
        }
        return context.getString(i);
    }

    public static void LIZJ(Context context, MutableLiveData mutableLiveData, String str, int i, long j, Throwable th) {
        String message;
        Integer numValueOf;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C608200NtK c608200NtK = C608200NtK.LIZ;
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        if (th != null) {
            numValueOf = Integer.valueOf(C2177208fy.LIZ(th));
        } else {
            numValueOf = null;
        }
        C608200NtK.LIZ(c608200NtK, "fetch_image_fail", null, str, Long.valueOf(jCurrentTimeMillis), numValueOf, message, 2);
        mutableLiveData.setValue(C800330VaR.LIZIZ(context, i));
    }

    public static void LJ(final Context context, final MutableLiveData mutableLiveData, final String str, final int i, final String str2, final String str3) {
        if (C123100dR.LIZ(str)) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C608200NtK.LIZ(C608200NtK.LIZ, "fetch_image", str2, str, null, null, null, 56);
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str);
            c1331670kl3LIZLLL.LJJIJL(context);
            c1331670kl3LIZLLL.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LIZLLL.LJJII(new AbstractC468201s0(context, mutableLiveData, str, i, str2, str3, jCurrentTimeMillis) { // from class: X.0v9V
                public final /* synthetic */ Context LL;
                public final /* synthetic */ MutableLiveData<Drawable> LLILLJJLI;
                public final /* synthetic */ String LLILLL;
                public final /* synthetic */ int LLILZ;
                public final /* synthetic */ String LLILZIL;
                public final /* synthetic */ long LLILZLL;

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap) {
                    if (bitmap != null) {
                        Context context2 = this.LL;
                        MutableLiveData<Drawable> mutableLiveData2 = this.LLILLJJLI;
                        String str4 = this.LLILLL;
                        C608200NtK.LIZ(C608200NtK.LIZ, "fetch_image_success", this.LLILZIL, str4, Long.valueOf(System.currentTimeMillis() - this.LLILZLL), null, null, 48);
                        mutableLiveData2.setValue(new BitmapDrawable(context2.getResources(), bitmap));
                        return;
                    }
                    C1731220v9U.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, null);
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    C1731220v9U.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZLL, th);
                }

                {
                    this.LLILZLL = jCurrentTimeMillis;
                }
            });
            return;
        }
        mutableLiveData.setValue(C800330VaR.LIZIZ(context, i));
    }
}
