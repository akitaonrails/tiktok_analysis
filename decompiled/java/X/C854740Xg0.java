package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.setting.page.security.SecurityAlertsCell;
import com.ss.android.ugc.aweme.setting.page.security.SecurityVerificationCell;
import com.ss.android.ugc.aweme.tools.policysecurity.OriginalSoundUploadService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xg0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854740Xg0 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7<Boolean> c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            case 2:
                return then$2(this, c15o7);
            case 3:
                return then$3(this, c15o7);
            case 4:
                return then$4(this, c15o7);
            case 5:
                return then$5(this, c15o7);
            case 6:
                return then$6(this, c15o7);
            case 7:
                return then$7(this, c15o7);
            case 8:
                return then$8(this, c15o7);
            default:
                return null;
        }
    }

    public C854740Xg0(Bundle bundle, int i) {
        this.$t = i;
        switch (i) {
            case 2:
            case 3:
            case 5:
                this.l0 = bundle;
                break;
            case 4:
            default:
                this.l0 = bundle;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$0(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        C1C7U.LIZ("SecurityAlertsCell@c0d9.initSecurityInfo$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1C7U.LIZIZ("SecurityAlertsCell@c0d9.initSecurityInfo$1");
            return null;
        }
        if (((Boolean) c15o7.LJIIL()).booleanValue()) {
            C848730XRf c848730XRf = (C848730XRf) ((SecurityAlertsCell) c854740Xg0.l0).getItem();
            if (c848730XRf != null) {
                c848730XRf.LLILLJJLI = R.raw.icon_exclamation_mark_circle_fill;
            }
            C848730XRf c848730XRf2 = (C848730XRf) ((SecurityAlertsCell) c854740Xg0.l0).getItem();
            if (c848730XRf2 != null) {
                c848730XRf2.LLILLL = R.attr.zs;
            }
            ((SecurityAlertsCell) c854740Xg0.l0).I5();
        }
        C1C7U.LIZIZ("SecurityAlertsCell@c0d9.initSecurityInfo$1");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object then$1(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        int i;
        C1C7U.LIZ("SecurityVerificationCell@7ed3.initTwoStep$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1C7U.LIZIZ("SecurityVerificationCell@7ed3.initTwoStep$1");
            return null;
        }
        Object objLJIIL = c15o7.LJIIL();
        if (objLJIIL != null) {
            C1069520dwE c1069520dwE = (C1069520dwE) ((SecurityVerificationCell) c854740Xg0.l0).getItem();
            if (c1069520dwE != null) {
                if (Intrinsics.LJFF(objLJIIL, Boolean.TRUE)) {
                    i = 2131848822;
                } else {
                    i = 2131848821;
                }
                c1069520dwE.LLILLJJLI = i;
            }
            ((SecurityVerificationCell) c854740Xg0.l0).I5();
        }
        C1C7U.LIZIZ("SecurityVerificationCell@7ed3.initTwoStep$1");
        return null;
    }

    public static final Object then$2(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        final Bundle bundle = (Bundle) c854740Xg0.l0;
        C1C7U.LIZ("AccountServiceUserOperate@b04e.runAfterSwitchAccount$1L");
        ArrayList arrayList = new ArrayList();
        if (!((AccountUserService) C0XQ7.LJFF()).LIZ()) {
            arrayList.add(new C849950XVx(bundle, true));
            arrayList.add(new C0XV9() { // from class: X.0XVl
                @Override // X.C0XV9
                public final void LIZ(Bundle bundle2) {
                    Bundle bundle3 = bundle;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (bundle2 == null) {
                        bundle2 = bundle3;
                    }
                    ((IRecommendUsersService) ServiceManager.get().getService(IRecommendUsersService.class)).LJIIJ("switch");
                    ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIJJ();
                    C849850XVn.LIZIZ.LIZJ().LJJIFFI();
                    C0XVC.LIZ(Long.valueOf(jCurrentTimeMillis), "NewUserDialogCleanHook", "switch_account");
                    C0XV8.LIZJ(bundle2);
                }
            });
            arrayList.add(new C0XV4(bundle, true));
            C849820XVk.LIZIZ(true);
        }
        CopyOnWriteArrayList<C0XVA> copyOnWriteArrayList = C0NPK.LIZ;
        C0NPK.LIZIZ = new ArrayList(arrayList);
        C0XV8.LIZIZ();
        C0XV8.LIZJ(bundle);
        Object objLJIIL = c15o7.LJIIL();
        C1C7U.LIZIZ("AccountServiceUserOperate@b04e.runAfterSwitchAccount$1L");
        return objLJIIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[PHI: r7
      0x00ad: PHI (r7v1 boolean) = (r7v0 boolean), (r7v3 boolean) binds: [B:25:0x00aa, B:12:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object then$3(X.C854740Xg0 r8, X.C15O7 r9) {
        /*
            java.lang.Object r6 = r8.l0
            android.os.Bundle r6 = (android.os.Bundle) r6
            java.lang.String r8 = "AccountServiceUserOperate@b04e.runAfterLogin$1L"
            X.C1C7U.LIZ(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.C0XQ7.LJFF()
            com.ss.android.ugc.aweme.AccountUserService r0 = (com.ss.android.ugc.aweme.AccountUserService) r0
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L87
            X.0XV6 r0 = new X.0XV6
            r0.<init>()
            r5.add(r0)
            X.0XVz r0 = new X.0XVz
            r0.<init>()
            r5.add(r0)
            X.0XVj r0 = new X.0XVj
            r0.<init>()
            r5.add(r0)
            long r1 = java.lang.System.currentTimeMillis()
            r4 = 0
            r3 = 1
            if (r6 == 0) goto La9
            int r0 = X.C0XVM.LIZ(r6)
            if (r0 != r3) goto La9
            java.lang.String r0 = "need_skip_restart"
            boolean r0 = r6.getBoolean(r0)
            if (r0 != 0) goto La9
            r7 = 1
        L49:
            java.lang.String r0 = "is_from_new_user_journey"
            boolean r0 = r6.getBoolean(r0, r4)
            if (r0 == 0) goto Lad
            r3 = 1
        L52:
            java.lang.Class<com.ss.android.ugc.aweme.journey.INewUserJourneyService> r0 = com.ss.android.ugc.aweme.journey.INewUserJourneyService.class
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi(r0)
            com.ss.android.ugc.aweme.journey.INewUserJourneyService r0 = (com.ss.android.ugc.aweme.journey.INewUserJourneyService) r0
            if (r0 == 0) goto L9e
            if (r3 != 0) goto L64
            boolean r0 = r0.LIZLLL()
            if (r0 != 0) goto La0
        L64:
            X.0XVx r0 = new X.0XVx
            r0.<init>(r6, r4)
            r5.add(r0)
            X.0XV4 r0 = new X.0XV4
            r0.<init>(r6, r4)
            r5.add(r0)
            X.0XV5 r0 = new X.0XV5
            r0.<init>()
            r5.add(r0)
            X.0XV7 r0 = new X.0XV7
            r0.<init>()
            r5.add(r0)
            X.C849820XVk.LIZIZ(r4)
        L87:
            java.util.concurrent.CopyOnWriteArrayList<X.0XVA> r0 = X.C0NPK.LIZ
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r5)
            X.C0NPK.LIZIZ = r0
            X.C0XV8.LIZIZ()
            X.C0XV8.LIZJ(r6)
            java.lang.Object r0 = r9.LJIIL()
            X.C1C7U.LIZIZ(r8)
            return r0
        L9e:
            if (r3 != 0) goto L64
        La0:
            X.0XVs r0 = new X.0XVs
            r0.<init>()
            r5.add(r0)
            goto L64
        La9:
            r7 = 0
            if (r6 == 0) goto Lad
            goto L49
        Lad:
            r3 = 0
            goto L52
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C854740Xg0.then$3(X.0Xg0, X.15O7):java.lang.Object");
    }

    public static final Object then$4(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        Context context = (Context) c854740Xg0.l0;
        C1C7U.LIZ("PostPublishTrigger@8fc7.trigger$2L");
        try {
            JobIntentService.enqueueWork(context, (Class<?>) OriginalSoundUploadService.class, 3008, new Intent());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
        C1C7U.LIZIZ("PostPublishTrigger@8fc7.trigger$2L");
        return null;
    }

    public static final Object then$5(C854740Xg0 c854740Xg0, C15O7 c15o7) throws Exception {
        String strName;
        String message;
        Bundle bundle = (Bundle) c854740Xg0.l0;
        C1C7U.LIZ("UserUtils@bfa1.refreshAwemeUser$2L");
        String strValueOf = "";
        if (c15o7.LJIILL()) {
            if (c15o7.LJIIJJI() instanceof C0XIR) {
                C0XIR c0xir = (C0XIR) c15o7.LJIIJJI();
                strValueOf = String.valueOf(c0xir.getErrorCode());
                message = c0xir.getErrorMsg();
            } else {
                message = c15o7.LJIIJJI().getMessage();
            }
            C832090WkZ.LIZJ(strValueOf, message, EnumC587430N2f.REFRESH_AWEME_USER);
        } else if (c15o7.LJIIL() != null) {
            EnumC587430N2f enumC587430N2f = EnumC587430N2f.REFRESH_AWEME_USER;
            String uid = ((User) c15o7.LJIIL()).getUid();
            HashMap map = new HashMap();
            map.put("event", "login part success");
            if (enumC587430N2f == null || (strName = enumC587430N2f.name()) == null) {
                strName = "";
            }
            map.put("part", strName);
            map.put("loginMethod", "");
            if (uid != null) {
                strValueOf = uid;
            }
            map.put("extra", strValueOf);
            C832090WkZ.LIZ.LIZIZ(map.toString());
        } else {
            C832090WkZ.LIZJ("", "user == null", EnumC587430N2f.REFRESH_AWEME_USER);
        }
        if (!c15o7.LJIILL()) {
            if (c15o7.LJIIL() != null) {
                AccountUserService accountUserServiceLIZ = C0XQ5.LIZ();
                User user = (User) c15o7.LJIIL();
                accountUserServiceLIZ.LJJIJIL();
                C848230XPh.LL.LJIILIIL(user);
                C848040XOo.LIZ.getClass();
                C848040XOo.LIZIZ(10, null, user);
            }
            C1C7U.LIZIZ("UserUtils@bfa1.refreshAwemeUser$2L");
            return bundle;
        }
        throw c15o7.LJIIJJI();
    }

    public static final Object then$6(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        C832080WkY c832080WkY = (C832080WkY) c854740Xg0.l0;
        c832080WkY.getClass();
        C1C7U.LIZ("GooglePhoneHintHelper@33ac.processPhoneData$2L");
        if (!C09UZ.LIZLLL(c15o7) || !((Boolean) c15o7.LJIIL()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bolts result error: ");
            sbLIZ.append(C2210608lM.LIZ(c15o7.LJIIJJI()));
            c832080WkY.LIZ(c832080WkY.LLILZ, C2188811AlT.LIZIZ(sbLIZ), false, c832080WkY.LLILZIL);
        }
        C1C7U.LIZIZ("GooglePhoneHintHelper@33ac.processPhoneData$2L");
        return null;
    }

    public static final Object then$7(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        C1C7U.LIZ("AuthSequenceManager@5a17.startLoginSuccess$2");
        C0XVC.LIZ(null, "RefreshAwemeUserHook", "login");
        C15O7<Bundle> c15o7LIZIZ = C0X3A.LIZIZ((Bundle) c854740Xg0.l0);
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLoginSuccess$2");
        return c15o7LIZIZ;
    }

    public static final Object then$8(C854740Xg0 c854740Xg0, C15O7 c15o7) {
        C1C7U.LIZ("AuthSequenceManager@5a17.startLoginSuccess$3");
        ((Function0) c854740Xg0.l0).invoke();
        C1C7U.LIZIZ("AuthSequenceManager@5a17.startLoginSuccess$3");
        return null;
    }

    public C854740Xg0(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
