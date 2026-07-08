package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08fp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2176308fp implements C091J {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1750));
    public final Map<String, InterfaceC2176408fq> LIZIZ;
    public final Map<String, InterfaceC2176408fq> LIZJ;

    @Override // X.C091J
    public final void LIZ() {
        Iterator<T> it2 = this.LIZIZ.values().iterator();
        while (it2.hasNext()) {
            ((InterfaceC2176408fq) it2.next()).LIZ();
        }
    }

    public C2176308fp() {
        Map<String, InterfaceC2176408fq> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        this.LIZIZ = mapSynchronizedMap;
        this.LIZJ = mapSynchronizedMap;
    }

    @Override // X.C091J
    public final Map<String, InterfaceC2176408fq> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.C091J
    public final void LIZIZ(InterfaceC2176408fq interfaceC2176408fq) {
        this.LIZIZ.put(interfaceC2176408fq.LIZIZ().getKey(), interfaceC2176408fq);
    }

    @Override // X.C091J
    public void LIZJ(List<EffectCategoryModel> list) {
        int i;
        Iterator<Map.Entry<String, InterfaceC2176408fq>> it2 = this.LIZJ.entrySet().iterator();
        while (it2.hasNext()) {
            InterfaceC2176408fq value = it2.next().getValue();
            value.LIZLLL();
            value.LIZLLL();
            int i2 = 0;
            if (((ArrayList) list).size() > 0) {
                value.LIZLLL();
                i = 0;
            } else {
                i = -1;
            }
            EffectCategoryModel effectCategoryModelLIZIZ = value.LIZIZ();
            ArrayList arrayList = (ArrayList) list;
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (Intrinsics.LJFF(((EffectCategoryModel) it3.next()).getKey(), effectCategoryModelLIZIZ.getKey())) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (((Boolean) this.LIZ.getValue()).booleanValue() && i2 > -1) {
                ListProtector.set(list, i2, effectCategoryModelLIZIZ);
            } else if (i >= 0) {
                ListProtector.add(list, i, value.LIZIZ());
            } else {
                arrayList.add(value.LIZIZ());
            }
        }
    }
}
