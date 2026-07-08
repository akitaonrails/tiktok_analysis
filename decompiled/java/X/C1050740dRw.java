package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050740dRw extends AbstractC1066890drz {
    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1050740dRw();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.DM_AI_GROUP_SHOT_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        boolean zLIZ;
        String string;
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        if (C911570ZpT.LIZ().enableGroupShot) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            if (Intrinsics.LJFF(interfaceC1392640mLO.Cf(), "chat")) {
                InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
                if (interfaceC1392640mLO2 == null) {
                    interfaceC1392640mLO2 = null;
                }
                Activity activityLIZJ = C0J3A.LIZJ(interfaceC1392640mLO2.LIZIZ());
                if ((activityLIZJ instanceof C19EG) && activityLIZJ != null) {
                    try {
                        Bundle extras = activityLIZJ.getIntent().getExtras();
                        if (extras != null && (string = extras.getString("conversation_id")) != null) {
                            zLIZ = C1701006lM.LIZIZ.LJII(extras.getInt("chat_type"), string, true);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else {
                zLIZ = C278130AvD.LIZ();
            }
            if (zLIZ) {
                AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
                list.remove(anchorCommonStruct2);
                LJIILIIL(anchorCommonStruct2);
                this.LLIZ = anchorCommonStruct2;
                if (arrayList.size() == 1) {
                    return EnumC1050190dR3.DONE;
                }
                return EnumC1050190dR3.PROCEED;
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            list.remove(it2.next());
        }
        return EnumC1050190dR3.NOT_FOUND;
    }

    @Override // X.AbstractC1066910ds1, X.InterfaceC1393560mMs
    public final void LJJJLL(View view, C2344009Gk c2344009Gk) {
        C19EG c19eg;
        String strOptString;
        String string;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        boolean zLJFF = Intrinsics.LJFF(strCf, "chat");
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        Activity activityLIZJ = C0J3A.LIZJ(interfaceC1392640mLO2.LIZIZ());
        if ((activityLIZJ instanceof C19EG) && (c19eg = (C19EG) activityLIZJ) != null) {
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            String strOptString2 = "";
            if (anchorCommonStruct == null) {
                strOptString = "";
            } else {
                try {
                    strOptString = new JSONObject(anchorCommonStruct.getExtra()).optString("third_id");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strOptString = "";
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                try {
                    strOptString2 = new JSONObject(anchorCommonStruct2.getExtra()).optString("template_resource_id");
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            if (zLJFF) {
                try {
                    Bundle extras = c19eg.getIntent().getExtras();
                    if (extras == null || (string = extras.getString("conversation_id")) == null) {
                        return;
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1700406lG(c19eg, extras.getInt("chat_type"), string, strOptString, strOptString2, strCf, null), 3);
                    return;
                } catch (Exception e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    return;
                }
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C1700506lH(c19eg, strOptString, strOptString2, strCf, null), 3);
        }
    }
}
