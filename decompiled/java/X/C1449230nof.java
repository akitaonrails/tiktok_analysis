package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.eventtracking.ab.EffectETGroupEnableConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nof, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449230nof {
    public final CreativeModel LIZ;
    public final String LIZIZ;
    public final InterfaceC1281804zw LIZJ;
    public String LIZLLL;
    public Effect LJ;
    public boolean LJFF;
    public boolean LJI;
    public List<? extends InterfaceC1282004zy> LJII;

    public C1449230nof() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    public final void LIZ() {
        ?? arrayList;
        List<InterfaceC1282004zy> list;
        if (EffectETGroupEnableConfig.isEnabled()) {
            CreativeModel creativeModel = this.LIZ;
            if (this.LJFF) {
                String str = this.LIZIZ;
                String str2 = this.LIZLLL;
                boolean z = this.LJI;
                Map<Class<?>, Function1<Effect, InterfaceC1282004zy>> map = C1905007dA.LIZ;
                arrayList = C1905007dA.LIZIZ(str, creativeModel.propETGroupModel.LIZ);
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                ?? LIZ = C2188811AlT.LIZ();
                LIZ.append("getGroupListFromCache, event = ");
                LIZ.append(str);
                LIZ.append(", isUsingProp = ");
                LIZ.append(creativeModel.propETGroupModel.LIZLLL);
                LIZ.append(", modelGroupList = ");
                LIZ.append(arrayList);
                C201955140j.LIZLLL(c20012313Rx, "PropETReporter", C2188811AlT.LIZIZ(LIZ));
                C1449300nom c1449300nom = creativeModel.propETGroupModel;
                if (c1449300nom.LIZLLL || z) {
                    C1449310non c1449310non = c1449300nom.LIZJ;
                    if (c1449310non == null || !Intrinsics.LJFF(c1449310non.LIZ, str2)) {
                        C1449310non c1449310non2 = c1449300nom.LIZIZ;
                        if (c1449310non2 != null) {
                            list = c1449310non2.LIZIZ;
                            if (list == null) {
                            }
                            arrayList = C13LP.LJLIL(C1905007dA.LIZIZ(str, list), arrayList);
                        }
                        list = C13BV.INSTANCE;
                        arrayList = C13LP.LJLIL(C1905007dA.LIZIZ(str, list), arrayList);
                    } else {
                        C1449310non c1449310non3 = c1449300nom.LIZJ;
                        if (c1449310non3 != null) {
                            list = c1449310non3.LIZIZ;
                            if (list == null) {
                            }
                            arrayList = C13LP.LJLIL(C1905007dA.LIZIZ(str, list), arrayList);
                        }
                        list = C13BV.INSTANCE;
                        arrayList = C13LP.LJLIL(C1905007dA.LIZIZ(str, list), arrayList);
                    }
                }
            } else {
                Effect effect = this.LJ;
                if (effect != null) {
                    Map<Class<?>, Function1<Effect, InterfaceC1282004zy>> map2 = C1905007dA.LIZ;
                    String str3 = this.LIZIZ;
                    arrayList = new ArrayList();
                    List list2 = (List) ((LinkedHashMap) C1905007dA.LIZJ).get(str3);
                    if (list2 != null) {
                        for (Object obj : list2) {
                            Function1<Effect, InterfaceC1282004zy> function1 = C1905007dA.LIZ.get(obj);
                            if (function1 != null) {
                                arrayList.add(function1.invoke(effect));
                            }
                            Function1<CreativeModel, InterfaceC1282004zy> function12 = C1905007dA.LIZIZ.get(obj);
                            if (function12 != null) {
                                arrayList.add(function12.invoke(creativeModel));
                            }
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
            }
            List<? extends InterfaceC1282004zy> listLJLIL = C13LP.LJLIL(this.LJII, arrayList);
            C20012313Rx c20012313Rx2 = C20012313Rx.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildPropETReport, event = ");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", useCache = ");
            sbLIZ.append(this.LJFF);
            sbLIZ.append(", propId = ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", allGroups = ");
            sbLIZ.append(listLJLIL);
            sbLIZ.append(", effect = ");
            Effect effect2 = this.LJ;
            sbLIZ.append(effect2 != null ? effect2.getName() : null);
            C201955140j.LIZLLL(c20012313Rx2, "PropETReporter", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.LIZ(listLJLIL);
        }
    }

    public C1449230nof(CreativeModel creativeModel, String str, InterfaceC1281804zw interfaceC1281804zw) {
        this.LIZ = creativeModel;
        this.LIZIZ = str;
        this.LIZJ = interfaceC1281804zw;
        this.LJFF = true;
        this.LJII = C13BV.INSTANCE;
    }
}
