package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dRy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050760dRy {
    public static final C1050760dRy LIZ = new C1050760dRy();
    public static Pair<String, ? extends List<String>> LIZIZ = new Pair<>(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID(), new ArrayList());

    public static void LIZIZ(Activity activity) {
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131833858);
            c1389890mGx.LJIIJJI();
        }
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMumC2mTqQHYsrrAA4R/Vh1Sz9e6CWQGfqg2TtZUqRbq9UjQ==", null));
    }

    public static boolean LIZJ(Context context, String str) {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964164);
        if (context != null) {
            try {
                LIZ(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1050760dRy c1050760dRy = LIZ;
                Activity activityLIZ = C1388190mED.LIZ(context);
                c1050760dRy.getClass();
                LIZIZ(activityLIZ);
                C1AF0.LJ(e);
                return false;
            }
        }
        return false;
    }

    public static boolean LIZLLL(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("smsto", str, null));
        C2429209fW.LIZ().appendDataFlowId(intent, 1207964165);
        if (context != null) {
            try {
                LIZ(context, intent);
                return true;
            } catch (ActivityNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                C1050760dRy c1050760dRy = LIZ;
                Activity activityLIZ = C1388190mED.LIZ(context);
                c1050760dRy.getClass();
                LIZIZ(activityLIZ);
                C1AF0.LJ(e);
                return false;
            }
        }
        return false;
    }

    public static void LJ(Context context, Aweme aweme, User user, CouponInfo couponInfo) {
        FragmentManager supportFragmentManager;
        String couponCode;
        String uid;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1050860dS8 c1050860dS8 = new C1050860dS8(context, couponInfo, aweme, user);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = c1050860dS8;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJLILLLLZIIL = false;
            tuxSheet.LLJJIJIIJIL = true;
            C0OM1 c0om1 = new C0OM1();
            C1251150ifB c1251150ifB = new C1251150ifB();
            c1251150ifB.LIZLLL();
            c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
            c1251150ifB.LIZJ(new AwS560S0100000_16(c1050860dS8, 0));
            c0om1.LIZIZ(c1251150ifB);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJJIJIL = c0om1;
            tuxSheet2.LLJJJ = null;
            tuxSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.0dRz
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    dialogInterface.dismiss();
                }
            };
            tuxSheet2.show(supportFragmentManager, "ba_coupon_sheet");
            Pair<String, ? extends List<String>> pair = LIZIZ;
            if (user != null && (uid = user.getUid()) != null) {
                if (TextUtils.equals(pair.getFirst(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
                    new C1050610dRj().LJJ(user, aweme, couponInfo, pair.getSecond().contains(uid) ? 1 : 0);
                } else {
                    new C1050610dRj().LJJ(user, aweme, couponInfo, 0);
                }
            }
            String websiteSecure = couponInfo.getWebsiteSecure();
            if (websiteSecure != null && websiteSecure.length() > 0 && (couponCode = couponInfo.getCouponCode()) != null && couponCode.length() > 0) {
                LIZ.getClass();
                try {
                    C20145813s8.LIZ(couponCode, couponCode, context, CertProviderManagerKt.findCert("bpea-ba_profile_copy_bio_coupon", 1476399142));
                } catch (C838130WuJ e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                }
            }
        }
    }
}
