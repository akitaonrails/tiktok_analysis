package X;

import Y.ARunnableS20S0201000_14;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bduploader.BDImageXUploader;
import com.ss.bduploader.BDUploadUtil;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0YRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874190YRd extends AbstractRunnableC874200YRe<C874190YRd, C0YRY, C873920YQc> {
    public final C0YH7 LLILLL;
    public final C0YHF LLILZ;
    public final C874220YRg LLILZIL;
    public BDImageXUploader LLILZLL;
    public C874230YRh LLIZ;
    public boolean LLIZLLLIL;
    public C0YQG LLJ;

    @Override // X.AbstractRunnableC874200YRe
    public final void LIZ() {
        if (this.LLILLL.getConfig().LIZ().LIZIZ && this.LLILLL.getConfig().LIZ().LJJLIIIIJ.LIZJ.LIZLLL) {
            LIZJ(-1, new C874260YRk("mock to fail"));
            return;
        }
        Function1<String, Unit> function1 = this.LLILZIL.LIZIZ;
        if (function1 != null) {
            function1.invoke(((C0YRY) this.LL).LIZ);
        }
        C868780Y6i c868780Y6iLIZLLL = this.LLILLL.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start upload ");
        sbLIZ.append(this);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "IMPhotoUploadTask", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LLIZ = this.LLILLL.getConfig().LIZ().LJJLIIIIJ.LIZJ.LIZJ;
        LIZIZ();
        BDImageXUploader bDImageXUploader = this.LLILZLL;
        if (bDImageXUploader != null) {
            bDImageXUploader.setListener(new C874170YRb(this));
        }
    }

    public final void LIZIZ() {
        try {
            BDImageXUploader bDImageXUploader = new BDImageXUploader();
            bDImageXUploader.setUploadDomain(this.LLJ.LIZIZ);
            bDImageXUploader.setTopAccessKey(this.LLJ.LIZJ.LIZ);
            bDImageXUploader.setTopSecretKey(this.LLJ.LIZJ.LIZJ);
            bDImageXUploader.setTopSessionToken(this.LLJ.LIZJ.LIZIZ);
            bDImageXUploader.setServiceID(this.LLJ.LIZ);
            C874230YRh c874230YRh = this.LLIZ;
            if (c874230YRh != null) {
                bDImageXUploader.setNetworkType(403, c874230YRh.LJFF);
                bDImageXUploader.setNetworkType(404, c874230YRh.LJI);
                bDImageXUploader.setSocketNum(c874230YRh.LIZLLL);
                bDImageXUploader.setFileRetryCount(c874230YRh.LIZ);
                bDImageXUploader.setRWTimeout(c874230YRh.LIZIZ);
                bDImageXUploader.setMaxFailTime(c874230YRh.LJ);
                bDImageXUploader.setEnableHttps(c874230YRh.LIZJ);
            }
            bDImageXUploader.setProcessActionType(((C0YRY) this.LL).LIZLLL);
            TreeMap<String, Object> treeMap = new TreeMap<>();
            treeMap.put("copies", "cipher_v2");
            bDImageXUploader.setConfig(treeMap);
            this.LLILZLL = bDImageXUploader;
            bDImageXUploader.setFilePath(1, new String[]{((C0YRY) this.LL).LIZJ});
            if (this.LLILLL.getConfig().LIZ().LIZIZ) {
                BDUploadUtil.setEnableNativeLog(Boolean.TRUE);
            }
            BDImageXUploader bDImageXUploader2 = this.LLILZLL;
            if (bDImageXUploader2 != null) {
                bDImageXUploader2.start();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LIZJ(20004, e);
        }
    }

    public final void LIZJ(int i, Exception exc) {
        BDImageXUploader bDImageXUploader = this.LLILZLL;
        if (bDImageXUploader != null) {
            bDImageXUploader.close();
        }
        C787080UuA.LIZIZ(new ARunnableS20S0201000_14(this, i, exc, 0));
    }

    public C874190YRd(C0YRY c0yry, C0YH7 c0yh7, C0YHF c0yhf, C874220YRg c874220YRg) {
        super(c0yry);
        this.LLILLL = c0yh7;
        this.LLILZ = c0yhf;
        this.LLILZIL = c874220YRg;
        this.LLJ = c0yry.LJ;
    }
}
