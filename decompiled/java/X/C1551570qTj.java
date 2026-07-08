package X;

import Y.AObjectS366S0100000_23;
import Y.ARunnableS92S0200000_23;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551570qTj extends AbstractC1552240qUo<Pair<Uri, UpdatePackage>, Pair<InterfaceC1550870qSb, UpdatePackage>> {
    public static final String LJIILJJIL;
    public C1551530qTf LJI;
    public AbstractC1552040qUU LJII;
    public OptionCheckUpdateParams LJIIIIZZ;
    public C1551680qTu LJIIIZ;
    public volatile EnumC1551610qTn LJIIJ = EnumC1551610qTn.PENDING;
    public AObjectS366S0100000_23 LJIIJJI;
    public volatile boolean LJIIL;
    public C1550930qSh LJIILIIL;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("res");
        sbLIZ.append(File.separator);
        LJIILJJIL = C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1552240qUo
    public final void LIZIZ(Object... objArr) {
        this.LJI = (C1551530qTf) objArr[0];
        this.LJII = (AbstractC1552040qUU) objArr[1];
        if (objArr.length > 2) {
            Object obj = objArr[2];
            if (obj instanceof OptionCheckUpdateParams) {
                this.LJIIIIZZ = (OptionCheckUpdateParams) obj;
            }
        }
        Object obj2 = objArr[3];
        if (obj2 instanceof C1550930qSh) {
            this.LJIILIIL = (C1550930qSh) obj2;
        }
        Object pipelineData = this.LJ.getPipelineData("update_operation");
        if (pipelineData instanceof C1551680qTu) {
            C1551680qTu c1551680qTu = (C1551680qTu) pipelineData;
            this.LJIIIZ = c1551680qTu;
            if (!c1551680qTu.LJFF) {
                this.LJIIIZ = null;
                return;
            }
            if (c1551680qTu.LIZIZ()) {
                this.LJIIJ = EnumC1551610qTn.PAUSED;
            }
            AObjectS366S0100000_23 aObjectS366S0100000_23 = new AObjectS366S0100000_23(this, 0);
            this.LJIIJJI = aObjectS366S0100000_23;
            ((CopyOnWriteArrayList) this.LJIIIZ.LIZIZ).add(aObjectS366S0100000_23);
        }
    }

    public static String LIZLLL(UpdatePackage updatePackage, String str) {
        if (!TextUtils.isEmpty(str)) {
            int iLastIndexOf = str.lastIndexOf("/");
            if (iLastIndexOf != -1) {
                String strSubstring = str.substring(iLastIndexOf + 1);
                if (!TextUtils.isEmpty(strSubstring)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(LJIILJJIL);
                    sbLIZ.append(strSubstring);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("url path illegal, url:");
                sbLIZ2.append(str);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("url path illegal, url:");
            sbLIZ3.append(str);
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("url empty, channel:");
        sbLIZ4.append(updatePackage.getChannel());
        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:24|(1:59)(1:28)|(4:30|(1:32)(1:58)|(1:60)(4:36|(3:38|(3:40|(10:43|(1:45)(1:57)|46|(1:48)(1:56)|49|(1:51)|(1:53)|(3:290|55|293)(1:292)|291|41)|289)|61)|62|(3:109|77|(1:81))(3:64|(1:108)(1:68)|(1:(4:(5:98|(1:107)(1:102)|(0)(1:76)|77|(2:79|81))|109|77|(0))(6:87|(1:96)(1:91)|(0)|76|77|(0)))(6:70|(1:85)(1:74)|(0)|76|77|(0))))|(2:83|84))|(1:111)|112|(6:(1:114)(2:150|(1:152)(2:153|(1:(16:156|116|(5:118|(1:120)(1:149)|121|(3:123|(3:125|(1:297)(4:129|(1:131)(1:146)|132|(1:299)(4:136|285|137|(5:139|287|140|147|295)(1:300)))|148)|294)(1:158)|159)(1:160)|161|(1:163)|164|(1:166)(1:167)|275|168|(2:170|172)(1:171)|173|283|174|269|175|(3:177|178|(1:180))(7:181|272|(3:190|(1:192)|193)(4:184|(1:187)|188|189)|219|(1:221)|222|(10:228|(3:230|(3:232|(2:234|303)(1:304)|235)|302)|236|281|237|270|238|279|239|243)(2:226|227)))(2:265|266))(1:157)))|283|174|269|175|(0)(0))|115|116|(0)(0)|161|(0)|164|(0)(0)|275|168|(0)(0)|173) */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0487, code lost:
    
        r4 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0488, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03d5 A[Catch: all -> 0x0487, TryCatch #5 {all -> 0x0487, blocks: (B:168:0x03ce, B:171:0x03d5), top: B:275:0x03ce }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f4 A[Catch: all -> 0x0482, TRY_LEAVE, TryCatch #1 {all -> 0x0482, blocks: (B:175:0x03ea, B:177:0x03f4, B:181:0x0419, B:184:0x041f, B:187:0x0446, B:188:0x044d), top: B:269:0x03ea }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0419 A[Catch: all -> 0x0482, TRY_ENTER, TryCatch #1 {all -> 0x0482, blocks: (B:175:0x03ea, B:177:0x03f4, B:181:0x0419, B:184:0x041f, B:187:0x0446, B:188:0x044d), top: B:269:0x03ea }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04a1 A[Catch: all -> 0x0567, TryCatch #4 {all -> 0x0567, blocks: (B:203:0x048e, B:208:0x0498, B:209:0x049c, B:211:0x04a1, B:212:0x04a4, B:256:0x055d, B:257:0x0566), top: B:273:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x055d A[Catch: all -> 0x0567, TRY_ENTER, TryCatch #4 {all -> 0x0567, blocks: (B:203:0x048e, B:208:0x0498, B:209:0x049c, B:211:0x04a1, B:212:0x04a4, B:256:0x055d, B:257:0x0566), top: B:273:0x048e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b2  */
    @Override // X.AbstractC1552240qUo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1552320qUw<android.util.Pair<X.InterfaceC1550870qSb, com.bytedance.geckox.model.UpdatePackage>> r36, android.util.Pair<android.net.Uri, com.bytedance.geckox.model.UpdatePackage> r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1551570qTj.LIZJ(X.0qUw, java.lang.Object):java.lang.Object");
    }

    public final void LJ(InterfaceC1552320qUw<Pair<InterfaceC1550870qSb, UpdatePackage>> interfaceC1552320qUw, UpdatePackage updatePackage) {
        C1551680qTu c1551680qTu;
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        C1551810qU7 statisticModel = updatePackage.getStatisticModel();
        if (statisticModel != null) {
            statisticModel.LJJI = System.currentTimeMillis();
        }
        this.LJII.LJIIL(updatePackage);
        Object interceptorByType = interfaceC1552320qUw.getInterceptorByType(C1551760qU2.class);
        if (interceptorByType instanceof C1551760qU2) {
            Object pipelineData = interfaceC1552320qUw.getPipelineData("download_task");
            if (pipelineData instanceof AbstractRunnableC1551740qU0) {
                C1551680qTu c1551680qTu2 = this.LJIIIZ;
                if (c1551680qTu2 != null) {
                    List listSingletonList = Collections.singletonList(pipelineData);
                    if (c1551680qTu2.LIZLLL == null) {
                        c1551680qTu2.LIZLLL = new ARunnableS92S0200000_23(listSingletonList, c1551680qTu2, 100);
                        C786410Ut5.LJLIIL(60000L, (Handler) c1551680qTu2.LJ.getValue(), c1551680qTu2.LIZLLL);
                    }
                }
                C1551760qU2 c1551760qU2 = (C1551760qU2) interceptorByType;
                synchronized (c1551760qU2.LJIIIZ) {
                    try {
                        c1551760qU2.LJIIIZ.add((AbstractRunnableC1551740qU0) pipelineData);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
        AObjectS366S0100000_23 aObjectS366S0100000_23 = this.LJIIJJI;
        if (aObjectS366S0100000_23 != null && (c1551680qTu = this.LJIIIZ) != null) {
            c1551680qTu.LIZLLL(aObjectS366S0100000_23);
        }
    }

    public static boolean LJFF(C0VSJ c0vsj, String str, File file, C1504280pFS c1504280pFS, boolean z) {
        long j = c1504280pFS.LLILZIL;
        int i = C1957007lY.LIZ.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try recordBreakPoint, position:");
        sbLIZ.append(j);
        sbLIZ.append(", threshold:");
        sbLIZ.append(i);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        if (j <= i) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("--BP");
        sbLIZ2.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        if (z && file.getName().equals(strLIZIZ)) {
            return true;
        }
        boolean zRenameTo = file.renameTo(new C0VSJ(c0vsj, strLIZIZ));
        if (!zRenameTo) {
            C1553130qWF.LIZ("gecko-debug-tag", "rename file failed");
        }
        return zRenameTo;
    }
}
