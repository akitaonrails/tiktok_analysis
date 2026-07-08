package X;

import com.ss.android.ugc.aweme.aigc.FileServiceImpl;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AIGCDownloadMockForceFailExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0LMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.FileServiceImpl$createDownloadFlow$1", f = "FileServiceImpl.kt", l = {329, 377}, m = "invokeSuspend")
public final class C541860LMy extends C09AX implements Function2<C094D<? super C0LN4<? extends String>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0VSJ LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ FileServiceImpl LLILZLL;
    public final /* synthetic */ C0LN8 LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C541860LMy(FileServiceImpl fileServiceImpl, C0LN8 c0ln8, String str, String str2, String str3, int i, InterfaceC1364105Vn<? super C541860LMy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = fileServiceImpl;
        this.LLIZ = c0ln8;
        this.LLIZLLLIL = str;
        this.LLJ = str2;
        this.LLJI = str3;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C541860LMy c541860LMy = new C541860LMy(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c541860LMy.LLILZIL = obj;
        return c541860LMy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        final C094D c094d;
        C0VSJ c0vsjLIZJ;
        String absolutePath;
        String parent;
        C541810LMt c541810LMt;
        C1C7U.LIZ("FileServiceImpl@6a32.createDownloadFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            parent = (String) this.LLILLL;
            absolutePath = (String) this.LLILLJJLI;
            c0vsjLIZJ = this.LL;
            c094d = (C094D) this.LLILZIL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c094d = (C094D) this.LLILZIL;
            c0vsjLIZJ = this.LLILZLL.LIZJ(this.LLIZ, this.LLIZLLLIL, this.LLJ);
            absolutePath = c0vsjLIZJ.getAbsolutePath();
            if (absolutePath == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
                return unit2;
            }
            parent = c0vsjLIZJ.getParent();
            if (parent == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
                return unit3;
            }
            if (C570490MZb.LJ(absolutePath)) {
                c094d.LJIIIIZZ(new C0LN7(absolutePath, C0LNA.CACHE));
                c094d.LJIIJJI(null);
                Unit unit4 = Unit.LIZ;
                C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
                return unit4;
            }
            c094d.LJIIIIZZ(new C0LN2(6));
            C541830LMv c541830LMv = C541830LMv.LIZ;
            AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(321);
            this.LLILZIL = c094d;
            this.LL = c0vsjLIZJ;
            this.LLILLJJLI = absolutePath;
            this.LLILLL = parent;
            this.LLILZ = 1;
            if (c541830LMv.LIZ(this, aFwS239S0000000_8) == objLJFF) {
                C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
                return objLJFF;
            }
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        AIGCDownloadMockForceFailExp.AIGCDownloadMockForceFailConfig aIGCDownloadMockForceFailConfig = AIGCDownloadMockForceFailExp.LIZ;
        AIGCDownloadMockForceFailExp.AIGCDownloadMockForceFailConfig aIGCDownloadMockForceFailConfig2 = (AIGCDownloadMockForceFailExp.AIGCDownloadMockForceFailConfig) c0c64LJIILLIIL.LJJII(AIGCDownloadMockForceFailExp.AIGCDownloadMockForceFailConfig.class, aIGCDownloadMockForceFailConfig, "aigc_download_mock_force_fail", true);
        if (aIGCDownloadMockForceFailConfig2 != null) {
            aIGCDownloadMockForceFailConfig = aIGCDownloadMockForceFailConfig2;
        }
        if (aIGCDownloadMockForceFailConfig.enable) {
            c541810LMt = new C541810LMt(aIGCDownloadMockForceFailConfig.errorCode, aIGCDownloadMockForceFailConfig.errorMsg);
        } else {
            c541810LMt = null;
        }
        if (c541810LMt != null) {
            String str = this.LLJ;
            String str2 = this.LLJI;
            FileServiceImpl fileServiceImpl = this.LLILZLL;
            C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[AIGCDownload] mock force fail ");
            sbLIZ.append(str);
            sbLIZ.append(", errCode=");
            sbLIZ.append(c541810LMt.LIZ);
            sbLIZ.append(", url=");
            sbLIZ.append(str2);
            c547140Ld2.LIZIZ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ), null);
            fileServiceImpl.LIZIZ.remove(str);
            c094d.LJIIIIZZ(new C0LN3(new RuntimeException(c541810LMt.LIZIZ), c541810LMt.LIZ));
            c094d.LJIIJJI(null);
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
            return unit5;
        }
        C547140Ld2 c547140Ld22 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[AIGCDownload] downloadFile start ");
        sbLIZ2.append(this.LLJ);
        sbLIZ2.append(", url=");
        sbLIZ2.append(this.LLJI);
        sbLIZ2.append(", retryCount=");
        sbLIZ2.append(this.LLJIJIL);
        c547140Ld22.LIZJ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ2));
        InterfaceC1385405bY interfaceC1385405bYLIZLLL = C0CHQ.LIZ().LIZLLL();
        String str3 = this.LLJI;
        String name = c0vsjLIZJ.getName();
        final int i2 = this.LLJIJIL;
        final String str4 = this.LLJ;
        final FileServiceImpl fileServiceImpl2 = this.LLILZLL;
        final String str5 = absolutePath;
        interfaceC1385405bYLIZLLL.downloadFile(str3, parent, name, i2, new C13UW() { // from class: X.0LN0
            @Override // X.C13UW
            public final void LIZLLL(String str6, String str7) {
                boolean z;
                C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[AIGCDownload] downloadFile onSuccess ");
                sbLIZ3.append(str4);
                sbLIZ3.append(", ");
                sbLIZ3.append(str7);
                c547140Ld23.LIZJ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ3));
                FileServiceImpl fileServiceImpl3 = fileServiceImpl2;
                String str8 = str5;
                int i3 = i2;
                fileServiceImpl3.getClass();
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (C2354709Kn.LJIL(str7, str8)) {
                            z = true;
                            break;
                        }
                        i4++;
                    } else {
                        z = false;
                        break;
                    }
                }
                C547140Ld2 c547140Ld24 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("downloadFile renameDownloadedFile ");
                sbLIZ4.append(str5);
                c547140Ld24.LIZJ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ4));
                if (z) {
                    c094d.LJIIIIZZ(new C0LN7(str5, C0LNA.NETWORK));
                    c094d.LJIIJJI(null);
                } else {
                    fileServiceImpl2.LIZIZ.remove(str4);
                    c094d.LJIIIIZZ(new C0LN3(new RuntimeException("renameFile failed"), 2, 0));
                    c094d.LJIIJJI(null);
                }
            }

            @Override // X.C13UW
            public final void LIZ(Exception exc, Integer num, String str6) {
                int iIntValue;
                C547140Ld2 c547140Ld23 = C546820LcW.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[AIGCDownload] downloadFile onFailed ");
                sbLIZ3.append(str4);
                sbLIZ3.append(", ");
                sbLIZ3.append(str6);
                sbLIZ3.append(", ");
                sbLIZ3.append(num);
                c547140Ld23.LIZIZ("FileServiceImpl", C2188811AlT.LIZIZ(sbLIZ3), exc);
                fileServiceImpl2.LIZIZ.remove(str4);
                C094D<C0LN4<String>> c094d2 = c094d;
                if (exc == null) {
                    exc = new IllegalStateException(str6);
                }
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = -1;
                }
                c094d2.LJIIIIZZ(new C0LN3(exc, iIntValue));
                c094d.LJIIJJI(null);
            }

            @Override // X.C13UW
            public final void LIZIZ(int i3, long j, long j2) {
                c094d.LJIIIIZZ(new C0LN2(i3, j, j2));
            }
        });
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(483);
        this.LLILZIL = null;
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = 2;
        if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
            C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
            return objLJFF;
        }
        Unit unit6 = Unit.LIZ;
        C1C7U.LIZIZ("FileServiceImpl@6a32.createDownloadFlow$1");
        return unit6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C0LN4<? extends String>> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
