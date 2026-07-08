package X;

import Y.ARunnableS100S0200000_31;
import android.content.Context;
import android.net.Uri;
import com.bytedance.applog.AppLog;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.storage.M2StorageCleanInterface;
import com.ss.android.ugc.aweme.experiment.OutreachOperationConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS400S0200000_34;
import kotlin.jvm.internal.AwS46S0010000_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bm9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2214711Bm9 extends AbstractC2214721BmA {
    public static void LIZJ(C2214711Bm9 c2214711Bm9, CompletionBlock completionBlock, Function1 function1) {
        String containerID;
        c2214711Bm9.getClass();
        InterfaceC634840OvC interfaceC634840OvC = c2214711Bm9.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2214741BmC.class, containerID);
        function1.invoke(xBaseModelLIZJ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws JSONException {
        Context context;
        InterfaceC2214761BmE c2214801BmI;
        Object c098200Yq;
        Context context2;
        boolean zLIZLLL;
        String str;
        Context context3;
        InterfaceC2214731BmB interfaceC2214731BmB = (InterfaceC2214731BmB) xBaseParamModel;
        if (!((OutreachOperationConfig) C2214811BmJ.LIZIZ.getValue()).enable) {
            C2382909Vj.LIZ(completionBlock, 0, "OutreachOperationSettings not enable", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            String operation = interfaceC2214731BmB.getOperation();
            JSONObject jSONObject = new JSONObject(interfaceC2214731BmB.getParams());
            if (Intrinsics.LJFF(operation, EnumC2192791Art.OPEN_APP.getType())) {
                c2214801BmI = new C2214771BmF(jSONObject.optString("schema"), jSONObject.optString("app_id"));
            } else if (Intrinsics.LJFF(operation, EnumC2192791Art.OPEN_APP_STORE.getType())) {
                c2214801BmI = new C2214781BmG(jSONObject.optString("schema"), jSONObject.optString("app_id"));
            } else if (Intrinsics.LJFF(operation, EnumC2192791Art.OPEN_MINI_CARD.getType())) {
                c2214801BmI = new C2214791BmH(jSONObject.optString("schema"), jSONObject.optString("app_id"));
            } else if (Intrinsics.LJFF(operation, EnumC2192791Art.OPEN_OR_INSTALL.getType())) {
                c2214801BmI = new C2214751BmD(jSONObject.optString("install_schema"), jSONObject.optString("open_schema"), jSONObject.optString("app_id"), jSONObject.optString("clear_schema"), jSONObject.optInt("clear_type", 0), jSONObject.optBoolean("is_mini_card"));
            } else if (Intrinsics.LJFF(operation, EnumC2192791Art.IS_APP_INSTALLED.getType())) {
                c2214801BmI = new C2214801BmI(jSONObject.optString("app_id"));
            } else {
                C2382909Vj.LIZ(completionBlock, 0, "params argument is illegal", null, 4);
                return;
            }
            boolean z = true;
            if (c2214801BmI instanceof C2214801BmI) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null && (context3 = interfaceC634840OvC2.getContext()) != null && ((C2214801BmI) c2214801BmI).LIZ.length() != 0) {
                    LIZJ(this, completionBlock, new AwS400S0200000_34(context3, c2214801BmI, 11));
                    return;
                } else {
                    C2382909Vj.LIZ(completionBlock, 0, "context or packageName is empty", null, 4);
                    return;
                }
            }
            if (c2214801BmI instanceof C2214781BmG) {
                C1054060dXI c1054060dXI = C1054060dXI.LIZ;
                C2214781BmG c2214781BmG = (C2214781BmG) c2214801BmI;
                String str2 = c2214781BmG.LIZ;
                c1054060dXI.getClass();
                String strLIZ = C1054060dXI.LIZ(str2);
                if (strLIZ == null) {
                    strLIZ = c2214781BmG.LIZIZ;
                }
                if (C1054060dXI.LIZLLL(context, str2, strLIZ)) {
                    LIZJ(this, completionBlock, AFwS281S0000000_34.get$arr$(36));
                    C20336714hp c20336714hp = C20336714hp.LIZ;
                    String str3 = c2214781BmG.LIZIZ;
                    c20336714hp.getClass();
                    C20336714hp.LIZ(str3, null, interfaceC2214731BmB);
                    return;
                }
                LIZJ(this, completionBlock, AFwS281S0000000_34.get$arr$(37));
                return;
            }
            if (c2214801BmI instanceof C2214791BmH) {
                C1054060dXI c1054060dXI2 = C1054060dXI.LIZ;
                C2214791BmH c2214791BmH = (C2214791BmH) c2214801BmI;
                String str4 = c2214791BmH.LIZ;
                c1054060dXI2.getClass();
                String strLIZ2 = C1054060dXI.LIZ(str4);
                if (strLIZ2 == null) {
                    strLIZ2 = c2214791BmH.LIZIZ;
                }
                if (C1054060dXI.LJ(context, str4, strLIZ2)) {
                    LIZJ(this, completionBlock, AFwS281S0000000_34.get$arr$(38));
                    C20336714hp c20336714hp2 = C20336714hp.LIZ;
                    String str5 = c2214791BmH.LIZIZ;
                    c20336714hp2.getClass();
                    C20336714hp.LIZ(str5, null, interfaceC2214731BmB);
                    return;
                }
                LIZJ(this, completionBlock, AFwS281S0000000_34.get$arr$(39));
                return;
            }
            if (c2214801BmI instanceof C2214751BmD) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (context2 = interfaceC634840OvC3.getContext()) != null) {
                    C2214751BmD c2214751BmD = (C2214751BmD) c2214801BmI;
                    if (c2214751BmD.LIZJ.length() != 0) {
                        C1054060dXI c1054060dXI3 = C1054060dXI.LIZ;
                        String str6 = c2214751BmD.LIZJ;
                        c1054060dXI3.getClass();
                        if (C2162308dZ.LJFF(context2, str6)) {
                            LIZJ(this, completionBlock, new AwS400S0200000_34(context2, c2214801BmI, 12));
                            return;
                        }
                        if (c2214751BmD.LJ != 0 && (str = c2214751BmD.LIZLLL) != null && str.length() != 0) {
                            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS100S0200000_31(c2214801BmI, interfaceC2214731BmB, 41));
                            String string = UriProtector.parse(c2214751BmD.LIZLLL).buildUpon().appendQueryParameter("outreach_clear_type", String.valueOf(c2214751BmD.LJ)).build().toString();
                            int i = c2214751BmD.LJ;
                            M2StorageCleanInterface m2StorageCleanInterface = (M2StorageCleanInterface) PluggableExtentionKt.pluggableSpi$default(M2StorageCleanInterface.class, false, false, false, 14, null);
                            if (m2StorageCleanInterface == null || !m2StorageCleanInterface.LIZJ(context2, i, string)) {
                                z = false;
                            }
                            C20571615ec c20571615ec = C20571615ec.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("OutreachOperationMethodHandler OpenOrInstall needClear: ");
                            sbLIZ.append(z);
                            sbLIZ.append(", ");
                            sbLIZ.append(c2214751BmD.LIZLLL);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c20571615ec.getClass();
                            C20571615ec.LIZJ(strLIZIZ);
                            LIZJ(this, completionBlock, AFwS281S0000000_34.get$arr$(40));
                            if (z) {
                                return;
                            }
                        }
                        if (!C1054060dXI.LIZIZ(UriProtector.parse(c2214751BmD.LIZ))) {
                            C2382909Vj.LIZ(completionBlock, 0, "install_schema argument is illegal", null, 4);
                            return;
                        }
                        if (c2214751BmD.LJFF) {
                            String str7 = c2214751BmD.LIZ;
                            String strLIZ3 = C1054060dXI.LIZ(str7);
                            if (strLIZ3 == null) {
                                strLIZ3 = c2214751BmD.LIZJ;
                            }
                            zLIZLLL = C1054060dXI.LJ(context2, str7, strLIZ3);
                        } else {
                            String str8 = c2214751BmD.LIZ;
                            String strLIZ4 = C1054060dXI.LIZ(str8);
                            if (strLIZ4 == null) {
                                strLIZ4 = c2214751BmD.LIZJ;
                            }
                            zLIZLLL = C1054060dXI.LIZLLL(context2, str8, strLIZ4);
                        }
                        LIZJ(this, completionBlock, new AwS46S0010000_34(zLIZLLL, 4));
                        if (zLIZLLL) {
                            C20336714hp c20336714hp3 = C20336714hp.LIZ;
                            String str9 = c2214751BmD.LIZJ;
                            Integer numValueOf = Integer.valueOf(c2214751BmD.LJ);
                            c20336714hp3.getClass();
                            C20336714hp.LIZ(str9, numValueOf, interfaceC2214731BmB);
                        }
                        C20571615ec c20571615ec2 = C20571615ec.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("OutreachOperationMethodHandler OpenOrInstall openGpResult: ");
                        sbLIZ2.append(zLIZLLL);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(c2214751BmD.LJFF);
                        sbLIZ2.append(", ");
                        sbLIZ2.append(c2214751BmD.LIZ);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c20571615ec2.getClass();
                        C20571615ec.LIZJ(strLIZIZ2);
                        return;
                    }
                }
                C2382909Vj.LIZ(completionBlock, 0, "context or packageName is empty", null, 4);
                return;
            }
            if (c2214801BmI instanceof C2214771BmF) {
                String mob = interfaceC2214731BmB.getMob();
                try {
                    if (mob == null) {
                        mob = "";
                    }
                    c098200Yq = new JSONObject(mob);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                JSONObject jSONObject2 = new JSONObject();
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = jSONObject2;
                }
                JSONObject jSONObject3 = (JSONObject) c098200Yq;
                C1054060dXI c1054060dXI4 = C1054060dXI.LIZ;
                Uri.Builder builderBuildUpon = UriProtector.parse(((C2214771BmF) c2214801BmI).LIZ).buildUpon();
                Iterator<String> itKeys = jSONObject3.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    builderBuildUpon.appendQueryParameter(next, jSONObject3.optString(next));
                }
                String strOptString = jSONObject3.optString("outreach_type");
                String strOptString2 = jSONObject3.optString("outreach_key");
                if (strOptString.length() > 0 && strOptString2.length() > 0) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strOptString);
                    sbLIZ3.append('_');
                    sbLIZ3.append(strOptString2);
                    builderBuildUpon.appendQueryParameter("gd_label", C2188811AlT.LIZIZ(sbLIZ3));
                }
                builderBuildUpon.appendQueryParameter("m_device_id", AppLog.getDid());
                Uri uriBuild = builderBuildUpon.build();
                C20571615ec c20571615ec3 = C20571615ec.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("buildOpenM2Uri: ");
                sbLIZ4.append(uriBuild);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                c20571615ec3.getClass();
                C20571615ec.LIZ(strLIZIZ3);
                c1054060dXI4.getClass();
                LIZJ(this, completionBlock, new AwS46S0010000_34(C1054060dXI.LIZJ(context, uriBuild, null), 3));
                return;
            }
            throw new C1954807lC();
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
