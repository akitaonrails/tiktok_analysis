package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.model.ECBillboard;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0vCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1732900vCC extends AbstractC1732910vCD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        final String str;
        AbstractC1732690vBr abstractC1732690vBr;
        AbstractC1732690vBr abstractC1732690vBr2;
        Room room;
        AbstractC1732690vBr abstractC1732690vBr3;
        AbstractC1732690vBr abstractC1732690vBr4;
        AbstractC1732690vBr abstractC1732690vBr5;
        final InterfaceC1732920vCE interfaceC1732920vCE = (InterfaceC1732920vCE) xBaseParamModel;
        C1729270v6L.LIZ("jsb_receive", null, "jsb", null, null, null, "", 0, 0, interfaceC1732920vCE.getActionType().intValue(), 442);
        final C1732890vCB c1732890vCB = new C1732890vCB(interfaceC1732920vCE, completionBlock);
        try {
            final List<ECBillboard> list = (List) C09C2.LIZ().LJIIIIZZ(interfaceC1732920vCE.getBillboard(), new TypeToken<List<? extends ECBillboard>>() { // from class: X.0vCI
            }.getType());
            if (list != null) {
                Number actionType = interfaceC1732920vCE.getActionType();
                final String idStr = null;
                if (Intrinsics.LJFF(actionType, 0)) {
                    LIZJ(0, "billboard_get", "", interfaceC1732920vCE.getContainerType().intValue(), list);
                    Number containerType = interfaceC1732920vCE.getContainerType();
                    InterfaceC1731950vAf interfaceC1731950vAf = new InterfaceC1731950vAf() { // from class: X.0vCF
                        @Override // X.InterfaceC1731950vAf
                        public final void onSuccess() {
                            c1732890vCB.onSuccess();
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(0, "billboard_on_screen", "", iIntValue, list2);
                        }

                        @Override // X.InterfaceC1731950vAf
                        public final void LIZ(String str2) {
                            c1732890vCB.LIZ(str2);
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(0, "billboard_show_fail", str2, iIntValue, list2);
                        }
                    };
                    Map<String, ? extends Object> daInfo = interfaceC1732920vCE.getDaInfo();
                    Number bornTimeMs = interfaceC1732920vCE.getBornTimeMs();
                    WeakReference<AbstractC1732690vBr> weakReference = C1732220vB6.LIZ;
                    if (weakReference != null && (abstractC1732690vBr5 = weakReference.get()) != null) {
                        if (!C1732220vB6.LIZ(abstractC1732690vBr5, bornTimeMs, containerType)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("born time invalid, bornTime");
                            sbLIZ.append(bornTimeMs);
                            interfaceC1731950vAf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            return;
                        }
                        abstractC1732690vBr5.LJJI(list, containerType, interfaceC1731950vAf, daInfo);
                        return;
                    }
                    interfaceC1731950vAf.LIZ("container is not ready, please check is in live room");
                    return;
                }
                if (Intrinsics.LJFF(actionType, 1)) {
                    LIZJ(2, "billboard_delete", "", interfaceC1732920vCE.getContainerType().intValue(), list);
                    Number containerType2 = interfaceC1732920vCE.getContainerType();
                    InterfaceC1731950vAf interfaceC1731950vAf2 = new InterfaceC1731950vAf() { // from class: X.0vCG
                        @Override // X.InterfaceC1731950vAf
                        public final void onSuccess() {
                            c1732890vCB.onSuccess();
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(2, "billboard_delete_success", "", iIntValue, list2);
                        }

                        @Override // X.InterfaceC1731950vAf
                        public final void LIZ(String str2) {
                            c1732890vCB.LIZ(str2);
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(2, "billboard_delete_fail", str2, iIntValue, list2);
                        }
                    };
                    Map<String, Object> daInfo2 = interfaceC1732920vCE.getDaInfo();
                    Number bornTimeMs2 = interfaceC1732920vCE.getBornTimeMs();
                    WeakReference<AbstractC1732690vBr> weakReference2 = C1732220vB6.LIZ;
                    if (weakReference2 != null && (abstractC1732690vBr4 = weakReference2.get()) != null) {
                        if (!C1732220vB6.LIZ(abstractC1732690vBr4, bornTimeMs2, containerType2)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("born time invalid, bornTime");
                            sbLIZ2.append(bornTimeMs2);
                            interfaceC1731950vAf2.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            return;
                        }
                        if (C2296808zG.LJI(abstractC1732690vBr4.LLIZLLLIL)) {
                            C23250099c.LIZLLL(abstractC1732690vBr4.LLIZLLLIL, null, null, new C1732980vCK(containerType2, abstractC1732690vBr4, list, daInfo2, interfaceC1731950vAf2, null), 3);
                            return;
                        } else {
                            interfaceC1731950vAf2.LIZ("scope cancelled");
                            return;
                        }
                    }
                    interfaceC1731950vAf2.LIZ("container is not ready, please check are u in a live room");
                    return;
                }
                if (Intrinsics.LJFF(actionType, 2)) {
                    LIZJ(2, "billboard_get", "", interfaceC1732920vCE.getContainerType().intValue(), list);
                    Number containerType3 = interfaceC1732920vCE.getContainerType();
                    InterfaceC1731950vAf interfaceC1731950vAf3 = new InterfaceC1731950vAf() { // from class: X.0vCH
                        @Override // X.InterfaceC1731950vAf
                        public final void onSuccess() {
                            c1732890vCB.onSuccess();
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(2, "billboard_on_screen", "", iIntValue, list2);
                        }

                        @Override // X.InterfaceC1731950vAf
                        public final void LIZ(String str2) {
                            c1732890vCB.LIZ(str2);
                            C1732900vCC c1732900vCC = this;
                            List<ECBillboard> list2 = list;
                            int iIntValue = interfaceC1732920vCE.getContainerType().intValue();
                            c1732900vCC.getClass();
                            C1732900vCC.LIZJ(2, "billboard_show_fail", str2, iIntValue, list2);
                        }
                    };
                    Map<String, Object> daInfo3 = interfaceC1732920vCE.getDaInfo();
                    Number bornTimeMs3 = interfaceC1732920vCE.getBornTimeMs();
                    WeakReference<AbstractC1732690vBr> weakReference3 = C1732220vB6.LIZ;
                    if (weakReference3 != null && (abstractC1732690vBr3 = weakReference3.get()) != null) {
                        if (!C1732220vB6.LIZ(abstractC1732690vBr3, bornTimeMs3, containerType3)) {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("born time invalid, bornTime");
                            sbLIZ3.append(bornTimeMs3);
                            interfaceC1731950vAf3.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                            return;
                        }
                        if (C2296808zG.LJI(abstractC1732690vBr3.LLIZLLLIL)) {
                            C23250099c.LIZLLL(abstractC1732690vBr3.LLIZLLLIL, null, null, new C1732990vCL(abstractC1732690vBr3, list, interfaceC1731950vAf3, daInfo3, null), 3);
                            return;
                        } else {
                            interfaceC1731950vAf3.LIZ("scope cancelled");
                            return;
                        }
                    }
                    interfaceC1731950vAf3.LIZ("container is not ready, please check is in live room");
                    return;
                }
                if (Intrinsics.LJFF(actionType, 3)) {
                    WeakReference<AbstractC1732690vBr> weakReference4 = C1732220vB6.LIZ;
                    if (weakReference4 != null && (abstractC1732690vBr2 = weakReference4.get()) != null && (room = abstractC1732690vBr2.LLILZIL) != null) {
                        idStr = room.getIdStr();
                    }
                    WeakReference<AbstractC1732690vBr> weakReference5 = C1732220vB6.LIZ;
                    if (weakReference5 != null && (abstractC1732690vBr = weakReference5.get()) != null && abstractC1732690vBr.LLILZ == 0) {
                        str = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        str = "1";
                    }
                    C1729270v6L.LIZ("jsb_success", null, "jsb", null, null, null, "", 0, 0, interfaceC1732920vCE.getActionType().intValue(), 442);
                    completionBlock.onSuccess(new InterfaceC600660NhA(idStr, str) { // from class: X.0Nd1
                        public Boolean LIZ = Boolean.TRUE;
                        public String LIZIZ;
                        public Map<String, ? extends Object> LIZJ;

                        @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                        public final Map<String, Object> convert() {
                            Pair[] pairArr = new Pair[3];
                            pairArr[0] = new Pair("isSuccess", Boolean.TRUE);
                            pairArr[1] = new Pair("errMessage", String.valueOf(this.LIZIZ));
                            Map<String, ? extends Object> mapLJ = this.LIZJ;
                            if (mapLJ == null) {
                                mapLJ = C2097608Jq.LJ();
                            }
                            pairArr[2] = new Pair("extraParams", mapLJ);
                            return C2097608Jq.LJIIIIZZ(pairArr);
                        }

                        @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel
                        public final JSONObject toJSON() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("isSuccess", this.LIZ);
                            jSONObject.put("errMessage", this.LIZIZ);
                            jSONObject.put("extraParams", this.LIZJ);
                            return jSONObject;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final String getErrMessage() {
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final Map<String, Object> getExtraParams() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final Boolean isSuccess() {
                            return this.LIZ;
                        }

                        @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel
                        public final List<String> provideResultList() {
                            return C13BV.INSTANCE;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final void setErrMessage(String str2) {
                            this.LIZIZ = str2;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final void setExtraParams(Map<String, ? extends Object> map) {
                            this.LIZJ = map;
                        }

                        @Override // X.InterfaceC600660NhA
                        public final void setSuccess(Boolean bool) {
                            this.LIZ = bool;
                        }

                        {
                            Pair[] pairArr = new Pair[2];
                            pairArr[0] = new Pair("room_id", idStr == null ? "" : idStr);
                            pairArr[1] = new Pair("during_live", str);
                            this.LIZJ = C2097608Jq.LJIIIIZZ(pairArr);
                        }
                    }, "default");
                    return;
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("invalid action type ");
                sbLIZ4.append(interfaceC1732920vCE.getActionType());
                c1732890vCB.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            c1732890vCB.LIZ("billboardItems is null.");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("billboard serialized fail. e: ");
            sbLIZ5.append(e.getMessage());
            c1732890vCB.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
        }
    }

    public static void LIZJ(int i, String str, String str2, int i2, List list) {
        int iIntValue;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ECBillboard eCBillboard = (ECBillboard) it2.next();
                Integer num = eCBillboard.billboardType;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                String str3 = eCBillboard.billboardId;
                if (str3 == null) {
                    str3 = "";
                }
                C1729270v6L.LIZ(str, str2, "jsb", null, null, null, str3, iIntValue, i2, i, 56);
            }
        }
    }
}
