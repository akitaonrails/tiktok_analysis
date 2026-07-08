package com.bytedance.android.live.dynamicstrategy.strategy;

import X.C09CT;
import X.C0J0E;
import X.C0J0F;
import X.C13BV;
import X.C2097608Jq;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEpiFeatureMigrateToFeatureCenterSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public class Strategy {

    @C09CT("condition_features")
    public List<String> conditionFactors;

    @C09CT("key_features")
    public List<String> relativeFactors;

    @C09CT("result_type")
    public int resultType;

    @C09CT("version")
    public float version;

    @C09CT("type")
    public String type = "";

    @C09CT("name")
    public String name = "";

    @C09CT("decision_key")
    public String decisionKey = "";

    @C09CT("default_result")
    public String defaultValue = "";

    @C09CT("default_result_dict")
    public Map<String, String> defaultResultDict = C2097608Jq.LJ();
    public final List<C0J0E> LIZ = new ArrayList();

    public final List<C0J0E> LIZ() {
        ArrayList arrayList = new ArrayList();
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue()) {
            for (String str : this.conditionFactors) {
                if (str.length() != 0) {
                    int iLJJJJ = a0.LJJJJ(str, '.', 0, 6);
                    C0J0E c0j0e = new C0J0E();
                    if (iLJJJJ > 0) {
                        c0j0e.LIZ = str.substring(iLJJJJ + 1, str.length());
                    } else {
                        c0j0e.LIZ = str;
                    }
                    int iLJJJ = a0.LJJJ(str, e3.c, 0, false, 6);
                    if (iLJJJ > 0) {
                        c0j0e.LIZIZ = str.substring(0, iLJJJ);
                    } else if (iLJJJ == 0 && iLJJJJ > 1) {
                        c0j0e.LIZJ = str.substring(1, iLJJJJ);
                    }
                    arrayList.add(c0j0e);
                }
            }
        }
        return arrayList;
    }

    public final List<C0J0E> LIZIZ() {
        if (LiveEpiFeatureMigrateToFeatureCenterSetting.INSTANCE.getValue() && ((ArrayList) this.LIZ).isEmpty()) {
            Iterator<String> it2 = this.relativeFactors.iterator();
            while (it2.hasNext()) {
                C0J0E c0j0eLIZ = C0J0F.LIZ(it2.next());
                if (c0j0eLIZ != null) {
                    ((ArrayList) this.LIZ).add(c0j0eLIZ);
                }
            }
        }
        return this.LIZ;
    }

    public Strategy() {
        C13BV c13bv = C13BV.INSTANCE;
        this.relativeFactors = c13bv;
        this.conditionFactors = c13bv;
    }
}
