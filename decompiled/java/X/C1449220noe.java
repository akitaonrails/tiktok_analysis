package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0noe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449220noe {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.07TU] */
    public static final C07TU LIZ(Effect effect, CreativeModel creativeModel) {
        final String strLIZJ;
        if ((!C1629100sUm.LIZLLL(effect) && !C1629100sUm.LJFF(effect)) || (strLIZJ = C1629100sUm.LIZJ(effect)) == null) {
            strLIZJ = "";
        }
        final String strLIZ = C1449140noW.LIZ(effect);
        final String strLIZJ2 = C1448620nng.LIZJ(effect.getEffectId(), creativeModel.feedPropPinModel);
        final String strLIZ2 = C1402490mbH.LIZ(Intrinsics.LJFF(creativeModel.propFromGroupModel.fromPropId, effect.getEffectId()));
        return new InterfaceC1282004zy(strLIZJ2, strLIZ, strLIZJ, strLIZ2) { // from class: X.07TU
            public final String LL;
            public final String LLILLJJLI;
            public final String LLILLL;
            public final String LLILZ;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C07TU)) {
                    return false;
                }
                C07TU c07tu = (C07TU) obj;
                return Intrinsics.LJFF(this.LL, c07tu.LL) && Intrinsics.LJFF(this.LLILLJJLI, c07tu.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c07tu.LLILLL) && Intrinsics.LJFF(this.LLILZ, c07tu.LLILZ);
            }

            public final int hashCode() {
                return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("prop_panel_pin_type", this.LL);
                linkedHashMap.put("effect_source", this.LLILLJJLI);
                linkedHashMap.put("fav_source", this.LLILLL);
                linkedHashMap.put("is_default_prop", this.LLILZ);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PropBusinessParamGroup(propPanelPinType=");
                sbLIZ.append(this.LL);
                sbLIZ.append(", effectSource=");
                sbLIZ.append(this.LLILLJJLI);
                sbLIZ.append(", favSource=");
                sbLIZ.append(this.LLILLL);
                sbLIZ.append(", isDefaultProp=");
                sbLIZ.append(this.LLILZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = strLIZJ2;
                this.LLILLJJLI = strLIZ;
                this.LLILLL = strLIZJ;
                this.LLILZ = strLIZ2;
            }
        };
    }

    public static final void LIZIZ(C1449240nog c1449240nog, CreativeModel creativeModel, Effect effect, String str, String str2, int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LIZ(effect, creativeModel));
        if (C13LP.LJJJJ(str2, C1697810uHb.LJIIJJI("trending", "hot", "popular", "tr"))) {
            str2 = "trending";
        }
        arrayList.add(new C00YV(str, str2));
        final String strValueOf = String.valueOf(i);
        arrayList.add(new C0253006p(strValueOf));
        arrayList.add(new InterfaceC1282004zy(strValueOf) { // from class: X.0070
            public final String LL;

            @Override // X.InterfaceC1282004zy
            public final boolean checkExtraParamKey() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AnonymousClass0070) && Intrinsics.LJFF(this.LL, ((AnonymousClass0070) obj).LL);
            }

            public final int hashCode() {
                return this.LL.hashCode();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> keyParams() {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("prop_impr_position", this.LL);
                return linkedHashMap;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PropCameraParamGroup(imprPosition=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> filteredParams() {
                return keyParams();
            }

            @Override // X.InterfaceC1282004zy
            public final Map<String, Object> getExtraParam() {
                return C2097608Jq.LJ();
            }

            {
                this.LL = strValueOf;
            }
        });
        c1449240nog.getClass();
        Collection<Function1<Effect, InterfaceC1282004zy>> collectionValues = C1905007dA.LIZ.values();
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Function1) it2.next()).invoke(effect));
        }
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateGroupModel, thread = ");
        sbLIZ.append(C786410Ut5.u3().getName());
        sbLIZ.append(", createGroupList = ");
        sbLIZ.append(arrayList2);
        sbLIZ.append(", groupList = ");
        sbLIZ.append(arrayList);
        C201955140j.LJIILL(c20012313Rx, "PropETReporter", C2188811AlT.LIZIZ(sbLIZ));
        C1449300nom c1449300nom = c1449240nog.LIZ.propETGroupModel;
        c1449300nom.LIZLLL = true;
        c1449300nom.LIZJ = c1449300nom.LIZIZ;
        c1449300nom.LIZIZ = new C1449310non(effect.getEffectId(), C13LP.LJLIL(arrayList, arrayList2));
    }
}
