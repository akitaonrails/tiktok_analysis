package X;

import com.ss.android.ugc.aweme.property.SmartCompileBaseModel;
import com.ss.android.ugc.aweme.property.SmartCompileModelV1;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1439930nZf {
    public static final String LIZ;
    public static final C1512200pSE LIZIZ;
    public static final C01GW LIZJ;

    static {
        SmartCompileModelV1 smartCompileModelV1LIZ = C1439970nZj.LIZ();
        C1512200pSE c1512200pSE = null;
        String engineType = smartCompileModelV1LIZ != null ? smartCompileModelV1LIZ.getEngineType() : null;
        LIZ = engineType;
        final SmartCompileModelV1 smartCompileModelV1LIZ2 = C1439970nZj.LIZ();
        if (smartCompileModelV1LIZ2 != null && !Intrinsics.LJFF(engineType, "pitaya_ml")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SmartCompileV1 , component init , model : ");
            sbLIZ.append(smartCompileModelV1LIZ2);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            c1512200pSE = new C1512200pSE(new InterfaceC1512350pST(smartCompileModelV1LIZ2) { // from class: X.0nZo
                public final SmartCompileBaseModel LIZ;

                @Override // X.InterfaceC1512350pST
                public final boolean enable() {
                    return true;
                }

                @Override // X.InterfaceC1512350pST
                public final String LIZ() {
                    String str = this.LIZ.scene;
                    return str.length() == 0 ? "default" : str;
                }

                @Override // X.InterfaceC1512350pST
                public final String LIZIZ() {
                    return this.LIZ.packageUrl;
                }

                @Override // X.InterfaceC1512350pST
                public final String LIZJ() {
                    return this.LIZ.type == 3 ? "bytenn" : "tflite";
                }

                {
                    this.LIZ = smartCompileModelV1LIZ2;
                }
            });
        }
        LIZIZ = c1512200pSE;
        LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(189));
    }
}
