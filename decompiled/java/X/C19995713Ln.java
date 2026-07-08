package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.BaseInfo;
import com.ss.android.ugc.effectmanager.common.model.MaterialResource;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS13S3100000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13Ln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19995713Ln extends AbstractC20000013Ne {
    public final MaterialResource LIZ;
    public final C13RD LIZIZ;
    public final String LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() throws Exception {
        long jLIZ;
        String ext;
        C13RD c13rd = this.LIZIZ;
        MaterialResource materialResource = this.LIZ;
        C19996313Lt c19996313Lt = new C19996313Lt(c13rd, materialResource);
        List<String> cdnList = materialResource.getCdnList();
        final C259800zU c259800zU = new C259800zU();
        Iterator<String> it2 = cdnList.iterator();
        while (true) {
            if (it2.hasNext()) {
                jLIZ = c19996313Lt.LIZ.LIZ(it2.next(), new C13N3() { // from class: X.13Ml
                    @Override // X.C13MU
                    public final void onProgress(int i, long j) {
                    }

                    @Override // X.C13N3
                    public final void onStart() {
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Exception] */
                    @Override // X.C13N3
                    public final void LIZ(C19999313Mx c19999313Mx) {
                        if (!c19999313Mx.LIZ()) {
                            c259800zU.element = c19999313Mx.LJI;
                        }
                    }
                });
                if (jLIZ > 0) {
                    break;
                }
            } else {
                Throwable th = (Throwable) c259800zU.element;
                if (th != null) {
                    throw th;
                }
                jLIZ = -1;
            }
        }
        if (jLIZ <= 0) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute download failed resourceKey=");
            sbLIZ.append(this.LIZ.getResourceKey());
            sbLIZ.append(" uri=");
            sbLIZ.append(this.LIZ.getUri());
            sbLIZ.append(" downloadedFileSize=");
            sbLIZ.append(jLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZIZ("MaterialResTask", strLIZIZ, null);
            runOnMainThread(new AwS574S0100000_30(this, 428));
            return;
        }
        String uri = this.LIZ.getUri();
        String resourceKey = this.LIZ.getResourceKey();
        BaseInfo baseInfo = this.LIZ.getBaseInfo();
        if (baseInfo == null || (ext = baseInfo.getExt()) == null) {
            ext = "";
        }
        C13LI.LIZJ(uri, this.LIZ.getAssetType(), resourceKey, this.LIZ.isAssetMaterial(), ext);
        Regex regex = C19995213Li.LIZ;
        String strLJ = C19995213Li.LJ(this.LIZ);
        String strLIZJ = C19995213Li.LIZJ(this.LIZ);
        Regex regex2 = C13SG.LJJ;
        String strLIZJ2 = C13SJ.LIZJ(strLIZJ);
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(this.LIZIZ.LJJIJL);
        String strLIZIZ2 = null;
        String strLJIIJJI = interfaceC20004513OxLIZ != null ? interfaceC20004513OxLIZ.LJIIJJI(strLIZJ2) : null;
        String strLIZLLL = C19995213Li.LIZLLL(strLJ);
        if (strLJIIJJI != null && strLJIIJJI.length() != 0) {
            if (strLIZLLL == null || strLIZLLL.length() == 0) {
                strLIZIZ2 = strLJIIJJI;
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJIIJJI);
                sbLIZ2.append('.');
                sbLIZ2.append(strLIZLLL);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        C13SS c13ss2 = C13SS.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("execute success resourceKey=");
        sbLIZ3.append(this.LIZ.getResourceKey());
        sbLIZ3.append(" uri=");
        sbLIZ3.append(this.LIZ.getUri());
        sbLIZ3.append(" fullName=");
        sbLIZ3.append(strLJ);
        sbLIZ3.append(" cacheBaseName=");
        sbLIZ3.append(strLIZJ);
        sbLIZ3.append(" cacheKey=");
        sbLIZ3.append(strLIZJ2);
        sbLIZ3.append(" basePath=");
        sbLIZ3.append(strLJIIJJI);
        sbLIZ3.append(" ext=");
        sbLIZ3.append(strLIZLLL);
        sbLIZ3.append(" finalPath=");
        sbLIZ3.append(strLIZIZ2);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        c13ss2.getClass();
        C13SS.LIZ("MaterialResTask", strLIZIZ3);
        runOnMainThread(new AwS13S3100000_30(this, strLIZIZ2, strLIZJ2, strLJIIJJI, 2));
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        runOnMainThread(new AwS574S0100000_30(this, 429));
    }

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        try {
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C13SS.LIZ.getClass();
            C13SS.LIZIZ("MaterialResTask", "DownloadMaterialResourceTask execute fails", e);
            runOnMainThread(new AwS431S0200000_30(this, e, 100));
        }
    }

    public C19995713Ln(MaterialResource materialResource, C13RD c13rd, String str) {
        super(str, c13rd.LJJJIL);
        this.LIZ = materialResource;
        this.LIZIZ = c13rd;
        this.LIZJ = str;
    }
}
