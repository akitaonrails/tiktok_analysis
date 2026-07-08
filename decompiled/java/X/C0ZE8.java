package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.im.activestatus.impl.analytics.ActivityStatusDelegate;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.contact.ContactFeature;
import com.ss.android.ugc.aweme.im.saas.host.api.im.inbox.IIMInboxService;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZE8, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZE8 implements C0ZEE {
    public static final C0ZE8 LIZ = new C0ZE8();
    public static final ConcurrentHashMap<String, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static final Map<LifecycleOwner, C0ZE6> LIZJ = new LinkedHashMap();

    public static boolean LIZIZ(String str) {
        Function1<String, Boolean> function1;
        if (str != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZHL c0zhlLIZJ = C897370ZIh.LIZ().LIZJ();
            if (c0zhlLIZJ == null || (function1 = c0zhlLIZJ.LIZ) == null || !function1.invoke(str).booleanValue()) {
                return false;
            }
        }
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (C897370ZIh.LIZ().LJ().LIZ() || C1689706jX.LIZ()) {
            return true;
        }
        return false;
    }

    public static final int LIZJ(String str) {
        Integer num = LIZIZ.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static String LJ(EnumC1643306c3 enumC1643306c3) {
        if (C1689706jX.LIZ()) {
            int i = C1643406c4.LIZ[enumC1643306c3.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "no_one";
                    }
                    throw new C1954807lC();
                }
                return "friends";
            }
            return "public";
        }
        int i2 = C1643406c4.LIZ[enumC1643306c3.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                return "off";
            }
            throw new C1954807lC();
        }
        return "on";
    }

    public static final void LJI(C0ZHA c0zha) {
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", c0zha.getValue());
        C20684815ws.LJIILLIIL("activity_status_pop_up_show", c830490Whz);
    }

    public static final void LJIIIZ(C0ZE7 c0ze7) {
        boolean zLJI = MethodIDManager.LJI(202369);
        if (!Intrinsics.LJFF(c0ze7.LJII, Boolean.TRUE)) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C895180Z9w(c0ze7, null), 3);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    public static final void LJIIJ(C0ZE7 c0ze7) {
        LifecycleOwner lifecycleOwner;
        if (c0ze7 != null && (lifecycleOwner = c0ze7.LIZ) != null) {
            Map<LifecycleOwner, C0ZE6> map = LIZJ;
            C0ZE6 activityStatusDelegate = (C0ZE6) ((LinkedHashMap) map).get(lifecycleOwner);
            if (activityStatusDelegate == null) {
                activityStatusDelegate = new ActivityStatusDelegate(lifecycleOwner);
            }
            map.put(lifecycleOwner, activityStatusDelegate);
            activityStatusDelegate.LIZJ(new AwS558S0100000_14(lifecycleOwner, 203));
            activityStatusDelegate.LIZ(c0ze7);
            activityStatusDelegate.LJ(c0ze7);
        }
    }

    public final int LIZLLL(String str) {
        if (LIZJ(str) == 1) {
            return 1;
        }
        return 0;
    }

    public static final void LJII(String str, EnumC896490ZEx enumC896490ZEx) {
        LIZIZ.put(str, Integer.valueOf(enumC896490ZEx.getValue()));
    }

    public static final void LJFF(C0ZHA c0zha, boolean z, boolean z2) {
        Object obj;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_method", c0zha.getValue());
        String str = "off";
        if (z2) {
            obj = "on";
        } else if (!z2) {
            obj = "off";
        } else {
            throw new C1954807lC();
        }
        c830490Whz.put("to_status", obj);
        if (z) {
            str = "on";
        } else if (z) {
            throw new C1954807lC();
        }
        c830490Whz.put("original_status", str);
        C20684815ws.LJIILLIIL("activity_status_pop_up_close", c830490Whz);
    }

    public static final void LJIIIIZZ(String str, EnumC1643306c3 enumC1643306c3, EnumC1643306c3 enumC1643306c32) {
        C05RV c05rvLIZJ;
        String mobValue;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("original_status", LJ(enumC1643306c3));
        c830490Whz.put("to_status", LJ(enumC1643306c32));
        IIMInboxService.LIZ.getClass();
        IIMInboxService value = C0ZCD.LIZIZ.getValue();
        if (value != null && (c05rvLIZJ = value.LIZJ()) != null && (mobValue = c05rvLIZJ.getMobValue()) != null) {
            c830490Whz.put("inbox_mode", mobValue);
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("change_activity_status", c830490Whz);
    }

    @Override // X.C0ZEE
    public final void LIZ(C0ZE7 c0ze7, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        String string;
        Integer numLJI;
        if (!LIZIZ(c0ze7.LJIIIZ)) {
            return;
        }
        if (!z) {
            C0ZJ9.LIZ.LIZ(c0ze7.LIZIZ, Intrinsics.LJFF(c0ze7.LJII, Boolean.TRUE), c0ze7.LIZJ, c0ze7.LJI, "type_click", C0I0B.LJFF.LIZIZ());
        }
        if (C1572306Dp.LIZ(c0ze7.LIZJ) || !Intrinsics.LJFF(c0ze7.LJII, Boolean.TRUE)) {
            return;
        }
        C0ZE6 c0ze6 = (C0ZE6) ((LinkedHashMap) LIZJ).get(c0ze7.LIZ);
        if (c0ze6 != null) {
            c0ze6.LIZIZ(c0ze7, C0I0B.LJFF.LIZIZ());
            return;
        }
        Map<String, String> mapLIZ = new C0ZEC(c0ze7).LIZ();
        ContactFeature contactFeatureLIZ = ContactFeature.LIZ.LIZ();
        if (contactFeatureLIZ == null || (numLJI = contactFeatureLIZ.LJI(c0ze7.LIZJ)) == null || (string = numLJI.toString()) == null) {
            string = "none";
        }
        mapLIZ.put("follow_status", string);
        interfaceC1493105sv.sendEvent("activity_status_click", mapLIZ);
    }
}
