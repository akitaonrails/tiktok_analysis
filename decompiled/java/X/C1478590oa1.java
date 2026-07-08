package X;

import com.bytedance.android.starship.solaria.profile.IStarshipSolariaProfile;
import com.bytedance.android.starship.solaria.profile.StarshipSolariaProfile;
import com.google.gson.h;
import com.ss.android.ugc.aweme.playerkit.configpicker.MultiDimensionalConditionConfig;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1478590oa1 extends C09AY implements Function0<C1484450ojT> {
    public C1478590oa1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0ojT] */
    @Override // kotlin.jvm.functions.Function0
    public final C1484450ojT invoke() {
        return new C1478950oab() { // from class: X.0ojT
            public C1484380ojM LIZ;
            public final IStarshipSolariaProfile LIZIZ = StarshipSolariaProfile.LJII();

            @Override // X.C1478950oab, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
            public final C1484380ojM config() {
                h hVar;
                C1484380ojM c1484380ojM;
                if (this.LIZ == null) {
                    int i = 0;
                    if (C2547109yX.LIZ.booleanValue()) {
                        C1484480ojW c1484480ojW = new C1484480ojW();
                        MultiDimensionalConditionConfig multiDimensionalConditionConfig = C1484500ojY.LIZ;
                        MultiDimensionalConditionConfig multiDimensionalConditionConfig2 = C1484490ojX.LIZ;
                        c1484480ojW.LIZ = this.LIZIZ.LIZJ();
                        InterfaceC1474770oTr[] interfaceC1474770oTrArr = C588870N7t.LIZ;
                        int length = interfaceC1474770oTrArr.length;
                        while (i < length) {
                            InterfaceC1474770oTr interfaceC1474770oTr = interfaceC1474770oTrArr[i];
                            if (!((ArrayList) c1484480ojW.LIZIZ).contains(interfaceC1474770oTr)) {
                                ((ArrayList) c1484480ojW.LIZIZ).add(interfaceC1474770oTr);
                            }
                            i++;
                        }
                        c1484380ojM = new C1484380ojM(c1484480ojW.LIZIZ);
                        c1484380ojM.LIZJ = c1484480ojW.LIZ;
                    } else {
                        C1484460ojU c1484460ojU = new C1484460ojU();
                        c1484460ojU.LIZ = C2509509sT.LIZ;
                        c1484460ojU.LIZIZ = C2509409sS.LIZ;
                        c1484460ojU.LIZJ = this.LIZIZ.LIZJ();
                        c1484460ojU.LIZLLL = C2509609sU.LIZ;
                        InterfaceC1474770oTr[] interfaceC1474770oTrArr2 = C588870N7t.LIZ;
                        int length2 = interfaceC1474770oTrArr2.length;
                        while (i < length2) {
                            InterfaceC1474770oTr interfaceC1474770oTr2 = interfaceC1474770oTrArr2[i];
                            if (!((ArrayList) c1484460ojU.LJ).contains(interfaceC1474770oTr2)) {
                                ((ArrayList) c1484460ojU.LJ).add(interfaceC1474770oTr2);
                            }
                            i++;
                        }
                        h hVar2 = c1484460ojU.LIZ;
                        if ((hVar2 == null || hVar2.size() == 0) && (hVar = c1484460ojU.LIZIZ) != null) {
                            hVar.size();
                        }
                        h hVar3 = c1484460ojU.LIZLLL;
                        if (hVar3 != null) {
                            hVar3.size();
                        }
                        c1484380ojM = new C1484380ojM(c1484460ojU.LIZ, c1484460ojU.LIZIZ, c1484460ojU.LIZLLL, c1484460ojU.LJ);
                        c1484380ojM.LIZJ = c1484460ojU.LIZJ;
                    }
                    this.LIZ = c1484380ojM;
                }
                this.LIZ.LIZJ = this.LIZIZ.LIZJ();
                return this.LIZ;
            }

            @Override // X.C1478950oab, com.ss.android.ugc.aweme.simkit.api.IDimensionBitrateCurveConfig
            public final boolean enable() {
                return C2523009ue.LIZ;
            }
        };
    }
}
