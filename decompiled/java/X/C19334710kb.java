package X;

import Y.AfS162S0200000_28;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.IAccountMainService;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.journey.INUJRevampService;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS266S0000000_25;
import org.json.JSONException;

/* JADX INFO: renamed from: X.10kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334710kb implements C0XTR {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.C0XTR
    public final void onResult(int i, int i2, Object obj) throws JSONException {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19334710kb(Object obj, CompletionBlock<InterfaceC1878130yyR> completionBlock, C1878160yyU c1878160yyU) {
        this.$t = c1878160yyU;
        this.l0 = obj;
        this.l1 = completionBlock;
    }

    public static final void onResult$0(C19334710kb c19334710kb, int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            Bundle arguments = ((TTKRegistrationBaseFragment) c19334710kb.l0).getArguments();
            if (arguments != null && arguments.getBoolean("is_container_fragment", false)) {
                return;
            }
            ((Activity) c19334710kb.l1).finish();
        }
    }

    public static final void onResult$1(C19334710kb c19334710kb, int i, int i2, Object obj) throws JSONException {
        if (i == 1) {
            if (i2 == 1) {
                ((LoginMethod) c19334710kb.l0).loginSuccessCallback((InterfaceC1019840ce6) c19334710kb.l1);
            } else {
                ((LoginMethod) c19334710kb.l0).loginCancelCallback((InterfaceC1019840ce6) c19334710kb.l1);
            }
        }
    }

    public static final void onResult$2(C19334710kb c19334710kb, int i, int i2, Object obj) throws JSONException {
        if (i == 1) {
            if (i2 == 1) {
                ((LoginMethod) c19334710kb.l0).loginSuccessCallback((InterfaceC1019840ce6) c19334710kb.l1);
            } else {
                ((LoginMethod) c19334710kb.l0).loginCancelCallback((InterfaceC1019840ce6) c19334710kb.l1);
            }
        }
    }

    public static final void onResult$3(C19334710kb c19334710kb, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                com.ss.android.ugc.aweme.fe.method.LoginMethod loginMethod = (com.ss.android.ugc.aweme.fe.method.LoginMethod) c19334710kb.l0;
                InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c19334710kb.l1;
                loginMethod.getClass();
                com.ss.android.ugc.aweme.fe.method.LoginMethod.LIZIZ(interfaceC1041760dDS);
                return;
            }
            ((com.ss.android.ugc.aweme.fe.method.LoginMethod) c19334710kb.l0).LIZ((InterfaceC1041760dDS) c19334710kb.l1);
        }
    }

    public static final void onResult$4(C19334710kb c19334710kb, int i, int i2, Object obj) {
        if (i == 1) {
            if (i2 == 1) {
                com.ss.android.ugc.aweme.fe.method.LoginMethod loginMethod = (com.ss.android.ugc.aweme.fe.method.LoginMethod) c19334710kb.l0;
                InterfaceC1041760dDS interfaceC1041760dDS = (InterfaceC1041760dDS) c19334710kb.l1;
                loginMethod.getClass();
                com.ss.android.ugc.aweme.fe.method.LoginMethod.LIZIZ(interfaceC1041760dDS);
                return;
            }
            ((com.ss.android.ugc.aweme.fe.method.LoginMethod) c19334710kb.l0).LIZ((InterfaceC1041760dDS) c19334710kb.l1);
        }
    }

    public static final void onResult$5(C19334710kb c19334710kb, int i, int i2, Object obj) {
        C19719912Dl c19719912DlLIZJ;
        IPluginService.PluginDataWrapper value;
        IPluginService.TrendingCreatorsData trendingCreatorsData;
        Boolean bool;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showMandatoryLoginPage result action:");
        sbLIZ.append(i);
        C1911410zq7.LIZJ("LoginComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            return;
        }
        if (i2 == 2) {
            ((IMandatoryLoginService) c19334710kb.l0).skipLoginForTest();
        } else if (i2 != 1 && i2 != 2 && i2 != 4) {
            return;
        }
        C19241910Pp.LIZ.getClass();
        C0TA0 c0ta0LIZ = C19241910Pp.LIZ();
        if (c0ta0LIZ != null && (value = c0ta0LIZ.getValue()) != null && (trendingCreatorsData = value.trendingCreatorsData) != null && (bool = trendingCreatorsData.isPageEnabled) != null && bool.booleanValue()) {
            C1673980tfA.LIZ.getClass();
            IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
            if (iPluginService != null) {
                iPluginService.prefetchABSettings(AFwS266S0000000_25.get$arr$(101));
            }
        }
        if (i2 == 1) {
            C19249910Sr.LIZIZ.LIZIZ(new C2344009Gk(), C10H5.NUJ_LOGIN_SUCCESS.getValue());
            ((C19241010Pg) c19334710kb.l1).getClass();
            INUJRevampService iNUJRevampService = (INUJRevampService) PluggableExtentionKt.pluggableSpi$default(INUJRevampService.class, false, false, false, 14, null);
            if (iNUJRevampService != null && iNUJRevampService.LIZIZ()) {
                C1911410zq7.LIZ("LoginComponent", "defer complete() until signup Activity finishes");
                C19241010Pg c19241010Pg = (C19241010Pg) c19334710kb.l1;
                c19241010Pg.getClass();
                IAccountMainService iAccountMainService = (IAccountMainService) PluggableExtentionKt.pluggableSpi$default(IAccountMainService.class, false, false, false, 14, null);
                if (iAccountMainService != null && (c19719912DlLIZJ = iAccountMainService.LIZJ()) != null) {
                    C11JF c11jf = c19241010Pg.LJFF;
                    if (c11jf != null) {
                        c11jf.dispose();
                    }
                    c19241010Pg.LJFF = (C11JF) C1906580ziK.LIZJ().LJII().LJJLJLI(new AfS162S0200000_28(c19719912DlLIZJ, (MutableLiveData<Integer>) c19241010Pg, (Function0<Unit>) 15));
                    for (AbstractC1387200mCc abstractC1387200mCc : C1906580ziK.LJII()) {
                        if (c19719912DlLIZJ.LIZIZ(abstractC1387200mCc.LIZIZ())) {
                            return;
                        }
                    }
                    C1911410zq7.LIZ("LoginComponent", "signup Activity already gone, calling complete()");
                    c19241010Pg.LJ();
                    return;
                }
                C1911410zq7.LIZLLL("LoginComponent", "signupActivityClass is null, fallback to immediate complete()");
                c19241010Pg.LJ();
                return;
            }
        }
        ((C19241010Pg) c19334710kb.l1).LJ();
    }

    public static final void onResult$6(C19334710kb c19334710kb, int i, int i2, Object obj) {
        String containerID;
        CompletionBlock completionBlock = (CompletionBlock) c19334710kb.l0;
        InterfaceC634840OvC interfaceC634840OvC = ((C1878160yyU) c19334710kb.l1).IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1878130yyR.class, containerID), "");
    }
}
