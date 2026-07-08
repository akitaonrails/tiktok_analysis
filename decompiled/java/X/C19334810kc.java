package X;

import android.app.Activity;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyManagementViewModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJPushService;
import com.ss.android.ugc.aweme.notification.banner.protocol.AddPhoneNumberBannerAssem;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.10kc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334810kc implements C0XTR {
    public final int $t;
    public Object l0;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) {
        switch (this.$t) {
            case 0:
                onResult$0(this, i, i2, obj);
                break;
            case 1:
                onResult$1(this, i, i2, obj);
                break;
            case 2:
                onResult$2(this, i, i2, obj);
                break;
            case 3:
                onResult$3(this, i, i2, obj);
                break;
            case 4:
                onResult$4(this, i, i2, obj);
                break;
            case 5:
                onResult$5(this, i, i2, obj);
                break;
            case 6:
                onResult$6(this, i, i2, obj);
                break;
            case 7:
                onResult$7(this, i, i2, obj);
                break;
            case 8:
                onResult$8(this, i, i2, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onResult$9(this, i, i2, obj);
                break;
        }
    }

    public C19334810kc(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onResult$0(C19334810kc c19334810kc, int i, int i2, Object obj) {
        Function1 function1;
        boolean z = true;
        if (i == 1 && (function1 = (Function1) c19334810kc.l0) != null) {
            if (i2 != 1) {
                z = false;
            }
            function1.invoke(Boolean.valueOf(z));
        }
    }

    public static final void onResult$1(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                INUJPushService iNUJPushService = (INUJPushService) PluggableExtentionKt.pluggableSpi$default(INUJPushService.class, false, false, false, 14, null);
                if (iNUJPushService != null) {
                    iNUJPushService.LJI();
                }
                C10PO.LIZ.getClass();
                C10P6 c10p6 = C10PO.LIZIZ;
                if (c10p6 != null) {
                    c10p6.LIZ();
                    return;
                }
                return;
            }
        } else if (i != 1) {
            return;
        }
        if (i2 != 4) {
            return;
        }
        ((C19236110Nj) c19334810kc.l0).LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onResult$2(X.C19334810kc r6, int r7, int r8, java.lang.Object r9) {
        /*
            r0 = 1
            if (r7 != r0) goto L4e
            if (r8 != r0) goto L50
            X.10R5 r0 = X.C10R5.LJIIIIZZ
            X.10R5 r0 = X.C10RS.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L25
            X.10Um r1 = X.C19254610Um.LIZIZ
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem r0 = (com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem) r0
            X.19EG r2 = r0.getActivity()
            r3 = 1
            r4 = 0
            r9 = 0
            r5 = r4
            r6 = r4
            r7 = r4
            r8 = r4
            r1.LJIIZILJ(r2, r3, r4, r5, r6, r7, r8, r9)
        L25:
            java.lang.Class<com.ss.android.ugc.aweme.video.IPlayerManagerService> r0 = com.ss.android.ugc.aweme.video.IPlayerManagerService.class
            r1 = 0
            r4 = 14
            r5 = 0
            r2 = r1
            r3 = r1
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r0, r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.video.IPlayerManagerService r0 = (com.ss.android.ugc.aweme.video.IPlayerManagerService) r0
            if (r0 == 0) goto L3c
            r0.LIZIZ()
            r0.LJIILLIIL()
        L3b:
            return
        L3c:
            X.0OBD r0 = X.C585570Mxv.LIZ
            java.lang.ref.WeakReference<com.ss.android.ugc.playerkit.videoview.VideoViewComponent> r0 = r0.LL
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.playerkit.videoview.VideoViewComponent r0 = (com.ss.android.ugc.playerkit.videoview.VideoViewComponent) r0
            if (r0 == 0) goto L3b
            r0.resume()
            return
        L4e:
            if (r7 != r0) goto L25
        L50:
            r0 = 2
            if (r8 != r0) goto L25
            java.lang.Object r0 = r6.l0
            com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem r0 = (com.ss.android.ugc.aweme.account.main.LoginAndConsentAssem) r0
            X.01GW r0 = r0.LLILZLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.IMandatoryLoginService r0 = (com.ss.android.ugc.aweme.IMandatoryLoginService) r0
            if (r0 == 0) goto L25
            r0.skipLoginForTest()
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19334810kc.onResult$2(X.10kc, int, int, java.lang.Object):void");
    }

    public static final void onResult$3(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((PasskeyManagementViewModel) c19334810kc.l0).setState(AFwS271S0000000_28.get$arr$(309));
        }
    }

    public static final void onResult$4(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((PasskeyManagementViewModel) c19334810kc.l0).setState(AFwS271S0000000_28.get$arr$(310));
        }
    }

    public static final void onResult$5(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i2 != 1) {
            C1878190yyX c1878190yyX = (C1878190yyX) c19334810kc.l0;
            c1878190yyX.getClass();
            InterfaceC1874730ysx interfaceC1874730ysx = c1878190yyX.LIZ;
            if (interfaceC1874730ysx != null) {
                interfaceC1874730ysx.onFail();
            }
            c1878190yyX.LIZ = null;
            return;
        }
        C1878190yyX c1878190yyX2 = (C1878190yyX) c19334810kc.l0;
        EnumC1155040gAA enumC1155040gAA = EnumC1155040gAA.LOGGEDIN;
        c1878190yyX2.getClass();
        if (enumC1155040gAA == EnumC1155040gAA.CANCELLED) {
            InterfaceC1874730ysx interfaceC1874730ysx2 = c1878190yyX2.LIZ;
            if (interfaceC1874730ysx2 != null) {
                interfaceC1874730ysx2.onFail();
            }
        } else {
            InterfaceC1874730ysx interfaceC1874730ysx3 = c1878190yyX2.LIZ;
            if (interfaceC1874730ysx3 != null) {
                interfaceC1874730ysx3.onSuccess();
            }
        }
        c1878190yyX2.LIZ = null;
    }

    public static final void onResult$6(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i2 != 1) {
            C1878200yyY c1878200yyY = (C1878200yyY) c19334810kc.l0;
            c1878200yyY.getClass();
            InterfaceC1874720ysw interfaceC1874720ysw = c1878200yyY.LIZ;
            if (interfaceC1874720ysw != null) {
                interfaceC1874720ysw.onFail();
            }
            c1878200yyY.LIZ = null;
            return;
        }
        C1878200yyY c1878200yyY2 = (C1878200yyY) c19334810kc.l0;
        EnumC1155040gAA enumC1155040gAA = EnumC1155040gAA.LOGGEDIN;
        c1878200yyY2.getClass();
        if (enumC1155040gAA == EnumC1155040gAA.CANCELLED) {
            InterfaceC1874720ysw interfaceC1874720ysw2 = c1878200yyY2.LIZ;
            if (interfaceC1874720ysw2 != null) {
                interfaceC1874720ysw2.onFail();
            }
        } else {
            InterfaceC1874720ysw interfaceC1874720ysw3 = c1878200yyY2.LIZ;
            if (interfaceC1874720ysw3 != null) {
                interfaceC1874720ysw3.onSuccess();
            }
        }
        c1878200yyY2.LIZ = null;
    }

    public static final void onResult$7(C19334810kc c19334810kc, int i, int i2, Object obj) {
        Activity activityLIZ;
        Activity activityLIZ2;
        if (i == 7 && i2 == 1) {
            if (!C1076010e6h.LIZJ.LJIIJ().LIZJ()) {
                Context context = ((AddPhoneNumberBannerAssem) c19334810kc.l0).getContext();
                if (context != null && (activityLIZ2 = C1388190mED.LIZ(context)) != null) {
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLIZ2, "//suggest/contact");
                    smartRouteBuildRoute.withParam("auth_platform", EnumC1070410dxf.CONTACT);
                    smartRouteBuildRoute.withParam("enter_from", "notification_page");
                    smartRouteBuildRoute.withParam("enter_method", "inbox_add_phone_banner");
                    smartRouteBuildRoute.withParam("scene_type", "inbox_add_phone_banner");
                    smartRouteBuildRoute.withParam("enter_position", "inbox_add_phone_banner");
                    smartRouteBuildRoute.open();
                }
            } else {
                Context context2 = ((AddPhoneNumberBannerAssem) c19334810kc.l0).getContext();
                if (context2 != null && (activityLIZ = C1388190mED.LIZ(context2)) != null) {
                    SmartRoute smartRouteBuildRoute2 = SmartRouter.buildRoute(activityLIZ, "//friends/contact");
                    smartRouteBuildRoute2.withParam("enter_from", "notification_page");
                    smartRouteBuildRoute2.withParam("enter_method", "inbox_add_phone_banner");
                    smartRouteBuildRoute2.withParam("scene_type", "inbox_add_phone_banner");
                    smartRouteBuildRoute2.open();
                }
            }
            AddPhoneNumberBannerAssem addPhoneNumberBannerAssem = (AddPhoneNumberBannerAssem) c19334810kc.l0;
            AddPhoneNumberBannerAssem.LLILZLL.add(addPhoneNumberBannerAssem.lo());
            addPhoneNumberBannerAssem.LL.setValue(new Pair(EnumC637310OzB.DISMISS, null));
        }
    }

    public static final void onResult$8(C19334810kc c19334810kc, int i, int i2, Object obj) {
        if (i2 == 1) {
            ((Function0) c19334810kc.l0).invoke();
        }
    }

    public static final void onResult$9(C19334810kc c19334810kc, int i, int i2, Object obj) {
        BaseBundle baseBundle;
        if (i2 == 1 && (obj instanceof Bundle) && (baseBundle = (BaseBundle) obj) != null) {
            boolean z = baseBundle.getBoolean("is_login_success");
            BaseActivity baseActivity = ((C1BV2) c19334810kc.l0).LIZ;
            if (!z) {
                C1389890mGx c1389890mGx = new C1389890mGx(baseActivity);
                c1389890mGx.LJIIIZ(2131829440);
                c1389890mGx.LIZ(true);
                c1389890mGx.LJIIJJI();
            }
        }
    }
}
