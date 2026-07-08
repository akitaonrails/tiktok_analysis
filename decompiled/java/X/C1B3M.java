package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.openauthorize.entity.OAuthPage;
import com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS128S0400000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.1B3M, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3M implements InterfaceC1069010dvP {
    public String LIZ;
    public String LIZIZ;
    public Activity LIZJ;
    public String LIZLLL;
    public DialogC1389620mGW LJ;
    public Function1<? super C2196061AxA, Unit> LJFF;
    public String LJI;
    public Map<String, String> LJIIIIZZ;
    public boolean LJIIIZ;
    public final C2198621B3c LJII = new C2198621B3c();
    public long LJIIJ = Long.MIN_VALUE;

    public final void LJ() {
        C2196061AxA c2196061AxA;
        Function1<? super C2196061AxA, Unit> function1;
        C2198621B3c c2198621B3c = this.LJII;
        if (c2198621B3c.LIZ || (c2196061AxA = c2198621B3c.LIZIZ) == null || (function1 = this.LJFF) == null) {
            return;
        }
        function1.invoke(c2196061AxA);
    }

    public final void LIZIZ(HashMap<String, Object> map) {
        if (this.LJIIJ > -9223372036854775807L) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
            if (jCurrentTimeMillis <= 0) {
                jCurrentTimeMillis = 0;
            }
            map.put("duration", Long.valueOf(jCurrentTimeMillis));
        }
    }

    @C14EU
    public final void onEvent$openplatform_impl_release(C1B3P c1b3p) {
        boolean z;
        int iIntValue;
        EventBus.LIZLLL().LJJI(this);
        HashMap map = new HashMap();
        map.putAll(new C2344009Gk().LIZ);
        HashMap<String, Object> map2 = new HashMap<>();
        String str = this.LIZ;
        if (str != null) {
            map.put("channel", str);
        }
        String str2 = this.LIZIZ;
        if (str2 != null) {
            map.put("scopes", str2);
        }
        String str3 = this.LJI;
        if (str3 != null) {
            map.put("enter_method", str3);
        }
        Integer num = c1b3p.LJI;
        if (num != null) {
            map.put("auto_auth", Integer.valueOf(num.intValue()));
        }
        String str4 = c1b3p.LJFF;
        if (str4 != null) {
            map.put("ttoclid", str4);
        }
        String str5 = c1b3p.LIZ;
        if (str5 != null && str5.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String str6 = c1b3p.LJ;
            if (str6 == null) {
                str6 = c1b3p.LIZLLL;
            }
            if (str6 != null) {
                map.put("msg", str6);
            }
            int iIntValue2 = 12345;
            if (c1b3p.LJIIIIZZ == null) {
                Integer num2 = c1b3p.LIZJ;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 12345;
                }
                map.put("code", Integer.valueOf(iIntValue));
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception:");
                sbLIZ.append(c1b3p.LJII);
                sbLIZ.append(", statusCode:");
                sbLIZ.append(c1b3p.LJIIIZ);
                sbLIZ.append(", errorCode:");
                sbLIZ.append(c1b3p.LJIIIIZZ);
                map.put("msg", C2188811AlT.LIZIZ(sbLIZ));
                map.put("code", -7);
            }
            LIZIZ(map2);
            Map<String, String> map3 = this.LJIIIIZZ;
            if (map3 != null) {
                map.putAll(map3);
            }
            C1326305Gz.LIZ.getClass();
            C1326305Gz.LIZ("jump_open_auth_page", map, map2);
            Integer num3 = c1b3p.LIZJ;
            if (num3 != null) {
                iIntValue2 = num3.intValue();
            }
            String str7 = c1b3p.LIZLLL;
            if (str7 == null) {
                str7 = "";
            }
            LIZJ(iIntValue2, str7);
            return;
        }
        map.put("code", 0);
        LIZIZ(map2);
        Map<String, String> map4 = this.LJIIIIZZ;
        if (map4 != null) {
            map.putAll(map4);
        }
        C1326305Gz.LIZ.getClass();
        C1326305Gz.LIZ("jump_open_auth_page", map, map2);
        this.LJII.LIZIZ = new C2196061AxA(c1b3p.LIZ, c1b3p.LIZIZ, 0, null, null, 24);
        LJ();
    }

    public final void LIZJ(int i, String str) {
        this.LJII.LIZIZ = new C2196061AxA(null, this.LIZIZ, Integer.valueOf(i), str, null, 16);
        LJ();
    }

    public final void LJFF(IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle) {
        Activity activity;
        if (!this.LJIIIZ) {
            if (this.LJ == null && (activity = this.LIZJ) != null) {
                this.LJ = new DialogC1389620mGW(activity);
            }
            DialogC1389620mGW dialogC1389620mGW = this.LJ;
            if (dialogC1389620mGW != null) {
                C0FNV.LIZJ(dialogC1389620mGW);
            }
        }
        LIZLLL(iOpenPlatformService, c1b3s, bundle, false, new AwS128S0400000_34(this, iOpenPlatformService, c1b3s, bundle, 4));
    }

    public final void LIZLLL(IOpenPlatformService iOpenPlatformService, C1B3S c1b3s, Bundle bundle, boolean z, Function1<? super OAuthPage, Unit> function1) {
        String str = this.LIZLLL;
        String string = bundle.getString("_bytedance_params_type_caller_package");
        boolean z2 = bundle.getBoolean("_bytedance_params_auto_auth_disabled");
        if (z) {
            z2 = false;
        }
        String str2 = this.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.LIZIZ;
        if (str4 != null) {
            str3 = str4;
        }
        iOpenPlatformService.LJI(str2, str3, c1b3s.LIZIZ, string, z2, str, c1b3s.LIZ, this.LIZJ instanceof ActivityC2196911AyX, new AwS613S0100000_34(function1, 154));
    }

    @Override // X.InterfaceC1069010dvP
    public final void LIZ(Activity activity, C2198611B3b c2198611B3b, String str, Map<String, String> map, boolean z, boolean z2, Function1<? super C2196061AxA, Unit> function1) {
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String stringExtra;
        this.LJFF = function1;
        this.LIZLLL = str;
        this.LIZJ = activity;
        this.LJIIIIZZ = map;
        this.LJIIIZ = z2;
        this.LIZ = c2198611B3b.LIZ;
        this.LIZIZ = c2198611B3b.LIZIZ;
        String str2 = c2198611B3b.LIZJ;
        String str3 = c2198611B3b.LJI;
        String packageName = c2198611B3b.LJII;
        Boolean bool = c2198611B3b.LIZLLL;
        boolean zBooleanValue3 = false;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        Boolean bool2 = c2198611B3b.LJ;
        if (bool2 != null) {
            zBooleanValue2 = bool2.booleanValue();
        } else {
            zBooleanValue2 = false;
        }
        Boolean bool3 = c2198611B3b.LJFF;
        if (bool3 != null) {
            zBooleanValue3 = bool3.booleanValue();
        }
        String str4 = c2198611B3b.LJIIIIZZ;
        if (str4 == null) {
            str4 = "iab_android";
        }
        this.LJI = str4;
        C1B3S c1b3s = new C1B3S();
        c1b3s.LJII = this.LIZIZ;
        c1b3s.LIZ = str2;
        c1b3s.LJFF = "wap_to_native";
        c1b3s.LIZIZ = str3;
        if (packageName == null) {
            packageName = activity.getPackageName();
        }
        Bundle bundle = new Bundle();
        c1b3s.toBundle(bundle);
        C786410Ut5.LJJJI("_bytedance_params_client_key", this.LIZ, bundle);
        C786410Ut5.LJJJI("__bytedance_base_caller_version", "1", bundle);
        C786410Ut5.LJJJI("_bytedance_params_type_caller_package", packageName, bundle);
        C786410Ut5.LJJJI("_aweme_params_enter_from_flag", "ENTER_FROM_INNER_WEB", bundle);
        if (zBooleanValue2) {
            bundle.putBoolean("_bytedance_params_auto_auth_disabled", zBooleanValue2);
        }
        C786410Ut5.LJJJI("_bytedance_params_initiate_url", this.LIZLLL, bundle);
        C786410Ut5.LJJJI("_bytedance_params_source", "jsb", bundle);
        bundle.putBoolean("is_minis", z);
        try {
            stringExtra = activity.getIntent().getStringExtra("ttoclid");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            stringExtra = null;
        }
        C786410Ut5.LJJJI("ttoclid", stringExtra, bundle);
        IOpenPlatformService iOpenPlatformService = (IOpenPlatformService) ServiceManager.get().getService(IOpenPlatformService.class);
        if (zBooleanValue3) {
            LIZLLL(iOpenPlatformService, c1b3s, bundle, true, new AwS613S0100000_34(this, 155));
            return;
        }
        if (zBooleanValue) {
            C786410Ut5.LJJJI("_bytedance_params_enter_source", "authorization_sdk", bundle);
            C786410Ut5.LJJJI("_bytedance_params_enter_method", this.LJI, bundle);
            C786410Ut5.LJJJI("_bytedance_params_enter_from", "authorization_sdk", bundle);
            Pair<Boolean, Boolean> pairLJFF = iOpenPlatformService.LJFF();
            boolean zBooleanValue4 = pairLJFF.getFirst().booleanValue();
            boolean zBooleanValue5 = pairLJFF.getSecond().booleanValue();
            HashMap map2 = new HashMap();
            map2.putAll(new C2344009Gk().LIZ);
            String string = bundle.getString("ttoclid");
            map2.put("channel", this.LIZ);
            String str5 = this.LJI;
            if (str5 != null) {
                map2.put("enter_method", str5);
            }
            map2.put("is_login", Integer.valueOf(zBooleanValue4 ? 1 : 0));
            map2.put("enter_source", "authorization_sdk");
            if (string != null) {
                map2.put("ttoclid", string);
            }
            Map<String, String> map3 = this.LJIIIIZZ;
            if (map3 != null) {
                for (Map.Entry<String, String> entry : map3.entrySet()) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            C1326305Gz.LIZ.getClass();
            C1326305Gz.LIZ("auth_init", map2, null);
            this.LJIIJ = System.currentTimeMillis();
            if (zBooleanValue5) {
                String str6 = this.LIZ;
                C1236610iHj.LIZIZ(str6, "auth_js_child_exit", "20003", C1236610iHj.LIZ(str6, true, activity instanceof ActivityC2196911AyX), EnumC21632119lH.TTOP, EnumC19415410xc.MOBILE);
                LIZJ(102, "child_mode");
                return;
            } else {
                if (!zBooleanValue4) {
                    if (this.LJIIIZ) {
                        LIZJ(-2001, "background_load_ui_blocked: UI operation rejected because the mini game container is still being pre-rendered offscreen");
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    C786410Ut5.LJJJI("enter_method", this.LJI, bundle2);
                    C786410Ut5.LJJJI("enter_from", "authorization_sdk", bundle2);
                    String str7 = this.LIZ;
                    if (str7 == null) {
                        str7 = "";
                    }
                    iOpenPlatformService.LJIIIIZZ(activity, str7, bundle2, new C1B3R(this, activity, iOpenPlatformService, c1b3s, bundle));
                    return;
                }
                LJFF(iOpenPlatformService, c1b3s, bundle);
                return;
            }
        }
        if (this.LJIIIZ) {
            LIZJ(-2001, "background_load_ui_blocked: UI operation rejected because the mini game container is still being pre-rendered offscreen");
            return;
        }
        EventBus.LIZLLL().LJIJJ(this);
        Intent intentLIZ = iOpenPlatformService.LIZ(activity);
        if (intentLIZ == null) {
            return;
        }
        intentLIZ.addFlags(67108864);
        intentLIZ.putExtras(bundle);
        EventBus.LIZLLL().LJIJJ(this);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intentLIZ, "Context_startActivity_1");
        C1701330uNH.LIZ(intentLIZ, activity);
        C2204961BRm.LJIILLIIL(activity, intentLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOu9d5fBzjv//UXmkV50mXDia6/y+Q/r7KtxHsBaopvXOg==", null));
    }
}
