package X;

import com.ss.android.ugc.aweme.im.sdk.psp.IMPSPManager;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.168w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC207272168w {
    public void LIZ() {
    }

    public abstract void LIZIZ(C207274168y c207274168y, InterfaceC805220ViK interfaceC805220ViK);

    public abstract String LIZJ();

    public final void LIZLLL(C207274168y c207274168y, final ITTMParamData iTTMParamData) {
        String str = c207274168y.LIZJ;
        if (str != null && str.length() > 0 && 1 != 0) {
            String str2 = c207274168y.LIZLLL;
            if (str2 != null && str2.length() > 0) {
                IMPSPManager.LIZ.getClass();
                AbstractC207271168v abstractC207271168v = (AbstractC207271168v) ((ConcurrentHashMap) IMPSPManager.LIZLLL).get(str);
                if (abstractC207271168v == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("on ");
                    sbLIZ.append(LIZJ());
                    sbLIZ.append(" action finish, nextScene is null, nextSceneName=");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    return;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("on ");
                sbLIZ2.append(LIZJ());
                sbLIZ2.append(" action finish, runScene, nextSceneName=");
                sbLIZ2.append(str);
                sbLIZ2.append(", nextStrategyName=");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
                C169O.LIZ();
                final ITTMParamData iTTMParamDataLIZLLL = abstractC207271168v.LIZLLL(c207274168y.LJ);
                InterfaceC830890Wid interfaceC830890Wid = abstractC207271168v.LIZ;
                final Map<?, ?> map = c207274168y.LJ;
                InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890Wid, str2, new TTMParamData(new ITTMParamData(iTTMParamData, iTTMParamDataLIZLLL, map) { // from class: X.0OBb
                    public final ITTMParamData LIZIZ;
                    public final ITTMParamData LIZJ;
                    public final Map<?, ?> LIZLLL;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C615210OBb)) {
                            return false;
                        }
                        C615210OBb c615210OBb = (C615210OBb) obj;
                        return Intrinsics.LJFF(this.LIZIZ, c615210OBb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c615210OBb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c615210OBb.LIZLLL);
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final Object getInputData() {
                        return this;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final int getType() {
                        return 2;
                    }

                    public final int hashCode() {
                        ITTMParamData iTTMParamData2 = this.LIZIZ;
                        int iHashCode = (iTTMParamData2 == null ? 0 : iTTMParamData2.hashCode()) * 31;
                        ITTMParamData iTTMParamData3 = this.LIZJ;
                        int iHashCode2 = (iHashCode + (iTTMParamData3 == null ? 0 : iTTMParamData3.hashCode())) * 31;
                        Map<?, ?> map2 = this.LIZLLL;
                        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
                    }

                    public final String toString() {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("NextSceneDataModel(actionResult=");
                        sbLIZ3.append(this.LIZIZ);
                        sbLIZ3.append(", customSceneParam=");
                        sbLIZ3.append(this.LIZJ);
                        sbLIZ3.append(", nextStrategyParams=");
                        sbLIZ3.append(this.LIZLLL);
                        sbLIZ3.append(')');
                        return C2188811AlT.LIZIZ(sbLIZ3);
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final boolean containsKey(String str3) {
                        if (str3 == null) {
                            return false;
                        }
                        int iHashCode = str3.hashCode();
                        if (iHashCode != -2079255118) {
                            if (iHashCode != 1465659891) {
                                if (iHashCode != 1850513580 || !str3.equals("nextStrategyParams") || this.LIZLLL == null) {
                                    return false;
                                }
                            } else if (!str3.equals("actionResult") || this.LIZIZ == null) {
                                return false;
                            }
                        } else if (!str3.equals("customSceneParam") || this.LIZJ == null) {
                            return false;
                        }
                        return true;
                    }

                    @Override // com.tiktok.ttm.ttmparam.ITTMParamData
                    public final ITTMParamData getObjectItem(String str3) {
                        if (str3 != null) {
                            int iHashCode = str3.hashCode();
                            if (iHashCode != -2079255118) {
                                if (iHashCode != 1465659891) {
                                    if (iHashCode == 1850513580 && str3.equals("nextStrategyParams")) {
                                        Map<?, ?> map2 = this.LIZLLL;
                                        if (map2 != null) {
                                            return new TTMParamData(map2).getActualParamData();
                                        }
                                        return null;
                                    }
                                } else if (str3.equals("actionResult")) {
                                    return this.LIZIZ;
                                }
                            } else if (str3.equals("customSceneParam")) {
                                return this.LIZJ;
                            }
                        }
                        return new TTMParamData("").getActualParamData();
                    }

                    {
                        this.LIZIZ = iTTMParamData;
                        this.LIZJ = iTTMParamDataLIZLLL;
                        this.LIZLLL = map;
                    }
                }));
                if (interfaceC805220ViKRunScene != null) {
                    abstractC207271168v.LIZ(interfaceC805220ViKRunScene, abstractC207271168v.LIZ);
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("onActionFinish, scene result is null, nextSceneName=");
                sbLIZ3.append(str);
                sbLIZ3.append(", nextStrategyName=");
                sbLIZ3.append(str2);
                C2188811AlT.LIZIZ(sbLIZ3);
                return;
            }
            LIZJ();
            C169O.LIZ();
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("on ");
        sbLIZ4.append(LIZJ());
        sbLIZ4.append(" action finish, nextSceneName is null");
        C2188811AlT.LIZIZ(sbLIZ4);
        C169O.LIZ();
    }
}
