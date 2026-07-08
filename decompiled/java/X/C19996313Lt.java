package X;

import com.ss.android.ugc.effectmanager.common.model.BaseInfo;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13Lt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19996313Lt {
    public final C13N5 LIZ;

    public C19996313Lt(final C13RD c13rd, final MaterialResource materialResource) {
        String lowerCase;
        String ext;
        C13M9 c13m9LIZ = new C13M9(c13rd.LJII).LIZ("material_resource");
        if (c13m9LIZ == null || c13m9LIZ.LIZ == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c13rd.LJII);
            sbLIZ.append(C13SB.LIZ);
            sbLIZ.append("material_resource");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C13M6 c13m6 = new C13M6(c13rd, materialResource) { // from class: X.13Lm
            public final C13RD LIZ;
            public final MaterialResource LIZIZ;

            {
                this.LIZ = c13rd;
                this.LIZIZ = materialResource;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0122 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
            @Override // X.C13M6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String LIZ(X.C20008713Qn r21, long r22, X.C13N3 r24) {
                /*
                    Method dump skipped, instruction units count: 482
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C19995613Lm.LIZ(X.13Qn, long, X.13N3):java.lang.String");
            }
        };
        BaseInfo baseInfo = materialResource.getBaseInfo();
        if (baseInfo != null && (ext = baseInfo.getExt()) != null) {
            lowerCase = ext.toLowerCase(Locale.ROOT);
        } else {
            lowerCase = null;
        }
        C13ND c13nd = Intrinsics.LJFF(lowerCase, "zip") ? new C13ND(c13rd, materialResource) { // from class: X.13Ls
            public final C13RD LIZ;
            public final MaterialResource LIZIZ;

            {
                this.LIZ = c13rd;
                this.LIZIZ = materialResource;
            }

            @Override // X.C13ND
            public final boolean LIZ(String str, boolean z) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("execUnZip zipFilePath=");
                sbLIZ2.append(str);
                sbLIZ2.append(" writeLruAndTagFile=");
                sbLIZ2.append(z);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss.getClass();
                C13SS.LIZ("com.ss.ugc.effectplatform.download.MaterialResourceDownloader#MATERIAL_RESOURCE_DIR", strLIZIZ);
                String strLJJJLL = a0.LJJJLL("_zip", str);
                if (strLJJJLL == null) {
                    return false;
                }
                C13SB.LJIIZILJ(strLJJJLL);
                C13SB.LJIJJ(str, strLJJJLL);
                if (z) {
                    InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(this.LIZ.LJJIJL);
                    if (interfaceC20004513OxLIZ == null) {
                        return false;
                    }
                    Regex regex = C19995213Li.LIZ;
                    String strLJ = C19995213Li.LJ(this.LIZIZ);
                    Regex regex2 = C13SG.LJJ;
                    String strLIZJ = C13SJ.LIZJ(strLJ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(strLIZJ);
                    sbLIZ3.append("_zip");
                    interfaceC20004513OxLIZ.remove(C2188811AlT.LIZIZ(sbLIZ3));
                    interfaceC20004513OxLIZ.LJI(strLIZJ, "material_resource");
                }
                C13SB.LJIIZILJ(str);
                return true;
            }
        } : null;
        C13SQ c13sq = c13rd.LJIJJ;
        if (c13sq != null) {
            C19996513Lv c19996513Lv = new C19996513Lv();
            c19996513Lv.LIZIZ = c13sq;
            c19996513Lv.LIZ = c13m6;
            if (c13nd != null) {
                c19996513Lv.LIZLLL = c13nd;
            }
            this.LIZ = c19996513Lv.LIZ();
            return;
        }
        "MaterialResourceDownloader requires EffectConfig.effectNetWorker".toString();
        throw new IllegalArgumentException("MaterialResourceDownloader requires EffectConfig.effectNetWorker");
    }
}
