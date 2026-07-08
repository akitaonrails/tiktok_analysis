package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.google.gson.h;
import com.ss.android.ugc.aweme.playerkit.configpicker.MultiDimensionalConditionConfig;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oa2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478600oa2 extends C09AY implements Function0<C1484440ojS> {
    public C1478600oa2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ojS] */
    @Override // kotlin.jvm.functions.Function0
    public final C1484440ojS invoke() {
        return new C1478960oac() { // from class: X.0ojS
            public C1484380ojM LIZ;
            public final IStarshipSolariaProfile LIZIZ = StarshipSolariaProfile.LJII();

            @Override // X.C1478960oac, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig
            public final C1484380ojM config() {
                h hVar;
                C1484380ojM c1484380ojM;
                if (this.LIZ == null) {
                    int i = 0;
                    if (C2547109yX.LIZ.booleanValue()) {
                        C1484430ojR c1484430ojR = new C1484430ojR();
                        MultiDimensionalConditionConfig multiDimensionalConditionConfig = C1484520oja.LIZ;
                        MultiDimensionalConditionConfig multiDimensionalConditionConfig2 = C1484510ojZ.LIZ;
                        c1484430ojR.LIZ = this.LIZIZ.LIZJ();
                        InterfaceC1474770oTr[] interfaceC1474770oTrArr = C588870N7t.LIZ;
                        int length = interfaceC1474770oTrArr.length;
                        while (i < length) {
                            InterfaceC1474770oTr interfaceC1474770oTr = interfaceC1474770oTrArr[i];
                            if (!((ArrayList) c1484430ojR.LIZIZ).contains(interfaceC1474770oTr)) {
                                ((ArrayList) c1484430ojR.LIZIZ).add(interfaceC1474770oTr);
                            }
                            i++;
                        }
                        c1484380ojM = new C1484380ojM(c1484430ojR.LIZIZ);
                        c1484380ojM.LIZJ = c1484430ojR.LIZ;
                    } else {
                        C1484470ojV c1484470ojV = new C1484470ojV();
                        c1484470ojV.LIZ = C2509809sW.LIZ;
                        c1484470ojV.LIZIZ = C2509709sV.LIZ;
                        c1484470ojV.LIZJ = this.LIZIZ.LIZJ();
                        InterfaceC1474770oTr[] interfaceC1474770oTrArr2 = C588870N7t.LIZ;
                        int length2 = interfaceC1474770oTrArr2.length;
                        while (i < length2) {
                            InterfaceC1474770oTr interfaceC1474770oTr2 = interfaceC1474770oTrArr2[i];
                            if (!((ArrayList) c1484470ojV.LIZLLL).contains(interfaceC1474770oTr2)) {
                                ((ArrayList) c1484470ojV.LIZLLL).add(interfaceC1474770oTr2);
                            }
                            i++;
                        }
                        h hVar2 = c1484470ojV.LIZ;
                        if ((hVar2 == null || hVar2.size() == 0) && (hVar = c1484470ojV.LIZIZ) != null) {
                            hVar.size();
                        }
                        c1484380ojM = new C1484380ojM(c1484470ojV.LIZ, c1484470ojV.LIZIZ, null, c1484470ojV.LIZLLL);
                        c1484380ojM.LIZJ = c1484470ojV.LIZJ;
                    }
                    this.LIZ = c1484380ojM;
                }
                this.LIZ.LIZJ = this.LIZIZ.LIZJ();
                return this.LIZ;
            }

            @Override // X.C1478960oac, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateFilterConfig
            public final boolean enable() {
                return C2523109uf.LIZ;
            }
        };
    }
}
