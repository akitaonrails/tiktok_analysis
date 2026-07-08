package X;

import Y.ACListenerS154S0100000_19;
import Y.ACListenerS85S1100000_13;
import Y.ARunnableS52S0300000_19;
import Y.AfS188S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.AccountSelectionOption;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS257S0000000_19;

/* JADX INFO: renamed from: X.0iIB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1236890iIB {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static C852510XcP LJ;
    public static final C1236890iIB LIZ = new C1236890iIB();
    public static String LJFF = "";
    public static String LJI = "";

    public static String LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(TextUtils.isEmpty(LJI) ? LJFF : LJI);
        sbLIZ.append("_voice");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LIZ(final InterfaceC1236910iID interfaceC1236910iID, EnumC852910Xd3 enumC852910Xd3, EnumC852660Xce enumC852660Xce) {
        boolean z;
        boolean zBooleanValue = false;
        if ((enumC852910Xd3 == EnumC852910Xd3.PHONE_SMS_SIGN_UP || enumC852910Xd3 == EnumC852910Xd3.PHONE_SMS_LOGIN || enumC852910Xd3 == EnumC852910Xd3.VERIFY_PHONE || enumC852910Xd3 == EnumC852910Xd3.NON1P_PHONE_BIND || enumC852910Xd3 == EnumC852910Xd3.OPTIONAL_PHONE_SMS_BIND || enumC852910Xd3 == EnumC852910Xd3.PHONE_SMS_BIND) && enumC852660Xce != EnumC852660Xce.RECOVER_ACCOUNT) {
            z = true;
        } else {
            z = false;
        }
        if (!TextUtils.isEmpty(LJFF) && z) {
            if (C1236920iIE.LIZ().containsKey(LJFF) && C1236920iIE.LIZ().get(LJFF) != null) {
                Boolean bool = (Boolean) C1236920iIE.LIZ().get(LJFF);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
                LIZIZ = zBooleanValue;
                interfaceC1236910iID.LIZ(zBooleanValue);
                return;
            }
            C1237300iIq.LIZ(LJFF, new InterfaceC1236910iID() { // from class: X.0iIC
                @Override // X.InterfaceC1236910iID
                public final void LIZ(boolean z2) {
                    String str;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Voice code ");
                    if (z2) {
                        str = "enabled";
                    } else {
                        str = "disabled";
                    }
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1236920iIE.LIZ().put(C1236890iIB.LJFF, Boolean.valueOf(z2));
                    C1236890iIB.LIZIZ = z2;
                    interfaceC1236910iID.LIZ(z2);
                }
            });
            return;
        }
        LIZIZ = false;
        interfaceC1236910iID.LIZ(false);
    }

    public static void LIZLLL(BaseAccountFlowFragment baseAccountFlowFragment, String str, Function0 function0) {
        C1237220iIi c1237220iIi;
        if (!LIZIZ) {
            return;
        }
        if (TextUtils.isEmpty(LJFF) && (str == null || str.length() == 0)) {
            return;
        }
        C851370XaZ c851370XaZLIZ = C851360XaY.LIZ(baseAccountFlowFragment.getActivity(), LIZIZ(), baseAccountFlowFragment.SR());
        if (c851370XaZLIZ != null && (c1237220iIi = c851370XaZLIZ.LIZ) != null && c1237220iIi.LIZIZ()) {
            Context context = baseAccountFlowFragment.getContext();
            if (context != null) {
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                c1397580mTM.LIZIZ(context.getString(2131829362));
                C985403tE.LIZ(c1397580mTM, AFwS257S0000000_19.get$arr$(604));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
                return;
            }
            return;
        }
        function0.invoke();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("passport_ticket", str);
            linkedHashMap.put("type", C2093608Ic.LIZIZ("48"));
            linkedHashMap.put("mix_mode", "1");
        }
        if (baseAccountFlowFragment.LLJJIJIIJIL.getValue() instanceof AccountSelectionOption.TargetAccount) {
            linkedHashMap.putAll(baseAccountFlowFragment.NR());
        }
        C0XZ4 c0xz4 = C0XZ4.LIZ;
        String str2 = LJFF;
        boolean zLJ = C1533950q1J.LJ(str);
        EnumC852660Xce enumC852660XceSR = baseAccountFlowFragment.SR();
        EnumC852910Xd3 enumC852910Xd3LLJJLIIIJLLLLLLLZ = baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ();
        c0xz4.getClass();
        C0XZ4.LJJIJIIJI(baseAccountFlowFragment, baseAccountFlowFragment, str2, zLJ, enumC852660XceSR, enumC852910Xd3LLJJLIIIJLLLLLLLZ, "user_click", linkedHashMap).LJIIIIZZ(new AfS188S0100000_19(baseAccountFlowFragment, 19)).LJIILL();
    }

    public static void LJI(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2) {
        boolean z;
        Serializable serializable;
        Bundle arguments = baseAccountFlowFragment.getArguments();
        boolean z2 = false;
        if (arguments != null) {
            z = arguments.getBoolean("bind_secure", false);
        } else {
            z = false;
        }
        LIZJ = z;
        if (arguments != null) {
            z2 = arguments.getBoolean("recover_mobile_code", false);
        }
        LIZLLL = z2;
        C852510XcP c852510XcP = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("recover_account_data");
        } else {
            serializable = null;
        }
        if (serializable instanceof C852510XcP) {
            c852510XcP = (C852510XcP) serializable;
        }
        LJ = c852510XcP;
        LJFF = str;
        LJI = str2;
    }

    public static C1247510iZJ LIZJ(final BaseAccountFlowFragment baseAccountFlowFragment, final String str, final String str2, final String str3, final Function0 function0) {
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZIZ(2131824503);
        c1247510iZJ.LJ = new View.OnClickListener() { // from class: X.0hdo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0XGR c0xgr = new C0XGR();
                c0xgr.LIZLLL("enter_from", str2);
                c0xgr.LIZLLL("enter_method", str3);
                C20684815ws.LJIILLIIL("request_phone_call", c0xgr.LIZ);
                C1236890iIB c1236890iIB = C1236890iIB.LIZ;
                BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
                String str4 = str;
                Function0<Unit> function02 = function0;
                c1236890iIB.getClass();
                C1236890iIB.LIZLLL(baseAccountFlowFragment2, str4, function02);
            }
        };
        return c1247510iZJ;
    }

    public static void LJFF(final BaseAccountFlowFragment baseAccountFlowFragment, final TuxTextView tuxTextView, String str, String str2, final Function0 function0, final String str3) {
        LJI(baseAccountFlowFragment, str, str2);
        LIZ(new InterfaceC1236910iID() { // from class: X.0hdn
            @Override // X.InterfaceC1236910iID
            public final void LIZ(boolean z) {
                C19EG activity;
                C1236890iIB c1236890iIB = C1236890iIB.LIZ;
                BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
                String str4 = str3;
                Function0<Unit> function02 = function0;
                c1236890iIB.getClass();
                ArrayList arrayList = new ArrayList();
                if (C1236890iIB.LIZIZ) {
                    arrayList.add(C1236890iIB.LIZJ(baseAccountFlowFragment2, str4, baseAccountFlowFragment2.LJJLIIIJJI(), baseAccountFlowFragment2.LLIIJI(), function02));
                }
                if (!((Boolean) baseAccountFlowFragment2.LLJJIJIL.getValue()).booleanValue()) {
                    if (!C1236890iIB.LIZJ) {
                        C1247510iZJ c1247510iZJ = new C1247510iZJ();
                        c1247510iZJ.LIZIZ(2131824502);
                        c1247510iZJ.LJ = new ACListenerS85S1100000_13(baseAccountFlowFragment2, str4, 0);
                        arrayList.add(c1247510iZJ);
                    }
                    IAccountLoginMethodsService iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null);
                    if (iAccountLoginMethodsService == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LJIIIZ()) {
                        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                        c1247510iZJ2.LIZIZ(2131835945);
                        c1247510iZJ2.LJ = new ACListenerS154S0100000_19(baseAccountFlowFragment2, 207);
                        arrayList.add(c1247510iZJ2);
                    }
                }
                if (!arrayList.isEmpty() && (activity = baseAccountFlowFragment.getActivity()) != null) {
                    activity.runOnUiThread(new ARunnableS52S0300000_19(baseAccountFlowFragment, tuxTextView, arrayList, 2));
                }
            }
        }, baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ(), baseAccountFlowFragment.SR());
    }

    public static void LJ(final BaseAccountFlowFragment baseAccountFlowFragment, final TuxTextView tuxTextView, String str, final String str2, final boolean z, final Function0 function0, final Function0 function02) {
        LJI(baseAccountFlowFragment, str, "");
        LIZ(new InterfaceC1236910iID() { // from class: X.0hdm
            @Override // X.InterfaceC1236910iID
            public final void LIZ(boolean z2) {
                C19EG activity;
                ArrayList arrayList = new ArrayList();
                if (C1236890iIB.LIZIZ) {
                    C1236890iIB c1236890iIB = C1236890iIB.LIZ;
                    BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
                    String str3 = str2;
                    Function0<Unit> function03 = function0;
                    String strLJJLIIIJJI = baseAccountFlowFragment2.LJJLIIIJJI();
                    String strLLIIJI = baseAccountFlowFragment.LLIIJI();
                    c1236890iIB.getClass();
                    arrayList.add(C1236890iIB.LIZJ(baseAccountFlowFragment2, str3, strLJJLIIIJJI, strLLIIJI, function03));
                }
                if (z) {
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZIZ(2131821286);
                    c1247510iZJ.LJ = new ACListenerS154S0100000_19(function02, 74);
                    arrayList.add(c1247510iZJ);
                }
                if (!arrayList.isEmpty() && (activity = baseAccountFlowFragment.getActivity()) != null) {
                    activity.runOnUiThread(new ARunnableS52S0300000_19(baseAccountFlowFragment, tuxTextView, arrayList, 1));
                }
            }
        }, baseAccountFlowFragment.LLJJLIIIJLLLLLLLZ(), baseAccountFlowFragment.SR());
    }
}
