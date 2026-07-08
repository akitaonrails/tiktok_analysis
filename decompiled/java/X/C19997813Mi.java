package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.ugc.effectplatform.model.DiffEffect;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS274S0300000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.13Mi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19997813Mi {
    public final C13RD LIZ;
    public final String LIZIZ;
    public final C13N5 LIZJ;
    public final Effect LIZLLL;
    public final C13NN<C13NR> LJ;
    public DiffEffect LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public C13MX LJIIJ;
    public String LJIIL;
    public final C19997913Mj LJIIJJI = new C19997913Mj();
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(327));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.StringBuilder] */
    public final void LIZIZ() {
        C19998313Mn c19998313MnLIZ;
        C1662010tLr c1662010tLr;
        if (!EffectKt.containDiffInfo(this.LIZLLL)) {
            C13NN<C13NR> c13nn = this.LJ;
            C1662010tLr c1662010tLr2 = new C1662010tLr(10023);
            c1662010tLr2.LIZIZ = "Diff task is illegal";
            c13nn.LIZLLL(c13nn, c1662010tLr2);
            return;
        }
        this.LJFF = this.LIZLLL.getFile_diff();
        C259800zU c259800zU = new C259800zU();
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(this.LIZIZ);
        if (!(interfaceC20004513OxLIZ instanceof C13MX)) {
            C13NN<C13NR> c13nn2 = this.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EffectDiskLruCache not found. Path: ");
            sbLIZ.append(this.LIZIZ);
            C1662010tLr c1662010tLr3 = new C1662010tLr(10023, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            Exception exc = c1662010tLr3.LIZLLL;
            c1662010tLr3.LIZIZ = exc != null ? exc.getMessage() : null;
            c13nn2.LIZLLL(c13nn2, c1662010tLr3);
            return;
        }
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new StringBuilder("first check baseDir: ");
        this.LJIIJ = (C13MX) interfaceC20004513OxLIZ;
        if (LIZLLL()) {
            ((StringBuilder) c259800zU2.element).append("exist, ");
            C13MX c13mx = this.LJIIJ;
            if (c13mx == null) {
                c13mx = null;
            }
            String str = this.LJII;
            if (str == null) {
                str = null;
            }
            c13mx.LJIILJJIL(str);
            this.LJIIJJI.LIZ(new AwS574S0100000_30(this, 422));
        } else {
            ((StringBuilder) c259800zU2.element).append("not exist, ");
            C20001113Np c20001113Np = this.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                final AwS274S0300000_30 awS274S0300000_30 = new AwS274S0300000_30(c259800zU2, (C259800zU<StringBuilder>) c259800zU, (C259800zU<C19998313Mn>) this, (C19997813Mi) 18);
                AbstractC20000013Ne abstractC20000013Ne = new AbstractC20000013Ne(awS274S0300000_30) { // from class: X.13Mm
                    public final Function0<Unit> LIZ;

                    @Override // X.AbstractC20000013Ne
                    public final void onCancel() {
                    }

                    @Override // X.AbstractC20000013Ne
                    public final void execute() {
                        this.LIZ.invoke();
                    }

                    {
                        super(C1528550psb.LIZ(), null);
                        this.LIZ = awS274S0300000_30;
                    }
                };
                abstractC20000013Ne.setTag(C504670Jqj.LIZIZ("DiffBaseEffectTask") ? "null" : "DiffBaseEffectTask");
                c20001113Np.LIZIZ(abstractC20000013Ne);
            }
        }
        DiffEffect diffEffect = this.LJFF;
        if (diffEffect == null) {
            diffEffect = null;
        }
        final String uri = diffEffect.getDiff_url().getUri();
        if (uri == null) {
            c19998313MnLIZ = new C19998313Mn();
            C1662010tLr c1662010tLr4 = new C1662010tLr(10023);
            c1662010tLr4.LIZIZ = "Diff task is illegal";
            c19998313MnLIZ.LIZ = c1662010tLr4;
        } else {
            C13M6 c13m6 = new C13M6() { // from class: X.13MV
                @Override // X.C13M6
                public final String LIZ(C20008713Qn c20008713Qn, long j, C13N3 c13n3) {
                    String strLJIIJJI = C20012413Ry.LJIIJJI(this.LIZ.LIZLLL.getZipPath());
                    if (strLJIIJJI == null) {
                        return null;
                    }
                    InterfaceC20004513Ox interfaceC20004513OxLIZ2 = C19996613Lw.LIZ(strLJIIJJI);
                    if (interfaceC20004513OxLIZ2 instanceof C13MX) {
                        return ((C13MX) interfaceC20004513OxLIZ2).LJIL(this.LIZ.LIZLLL, c20008713Qn, uri, j, true, new AwS644S0100000_30(c13n3, 49));
                    }
                    Regex regex = C13SG.LJJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(uri);
                    sbLIZ2.append(".zip");
                    String strLIZJ = C13SJ.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (interfaceC20004513OxLIZ2 != null) {
                        interfaceC20004513OxLIZ2.LJII(strLIZJ, c20008713Qn, this.LIZ.LIZLLL.getPanel());
                    }
                    return this.LIZ.LIZLLL.getZipPath();
                }
            };
            DiffEffect diffEffect2 = this.LJFF;
            if (diffEffect2 == null) {
                diffEffect2 = null;
            }
            c19998313MnLIZ = LIZ(LIZJ(diffEffect2.getDiff_url()), c13m6, true, 2, null);
        }
        C19997913Mj c19997913Mj = this.LJIIJJI;
        AwS574S0100000_30 awS574S0100000_30 = new AwS574S0100000_30(this, 423);
        synchronized (c19997913Mj.LIZ) {
            try {
                if (!c19997913Mj.LIZIZ.LIZIZ()) {
                    awS574S0100000_30.invoke();
                    c19997913Mj.LIZ.wait();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C19998313Mn c19998313Mn = (C19998313Mn) c259800zU.element;
        if (c19998313Mn != null && (c1662010tLr = c19998313Mn.LIZ) != null) {
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[DiffEffect][Flow][Download Base Failed][");
            sbLIZ2.append(this.LIZLLL.getName());
            sbLIZ2.append("][");
            sbLIZ2.append(c1662010tLr.LIZ);
            sbLIZ2.append("][");
            sbLIZ2.append(c1662010tLr.LIZIZ);
            sbLIZ2.append(']');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            c13ss.getClass();
            C13SS.LIZIZ("JKL", strLIZIZ, null);
            C13NN<C13NR> c13nn3 = this.LJ;
            c13nn3.LIZLLL(c13nn3, c1662010tLr);
            return;
        }
        C13SS c13ss2 = C13SS.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("[DiffEffect][Flow][Download Base Suc][");
        sbLIZ3.append(this.LIZLLL.getName());
        sbLIZ3.append(']');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        c13ss2.getClass();
        C13SS.LJ("JKL", strLIZIZ2);
        C1662010tLr c1662010tLr5 = c19998313MnLIZ.LIZ;
        if (c1662010tLr5 != null) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[DiffEffect][Flow][Download Diff Failed][");
            sbLIZ4.append(this.LIZLLL.getName());
            sbLIZ4.append("][");
            Exception exc2 = c1662010tLr5.LIZLLL;
            sbLIZ4.append(exc2 != null ? exc2.getMessage() : null);
            sbLIZ4.append(']');
            C13SS.LIZIZ("JKL", C2188811AlT.LIZIZ(sbLIZ4), null);
            C13NN<C13NR> c13nn4 = this.LJ;
            C1662010tLr c1662010tLr6 = new C1662010tLr(10023, c1662010tLr5.LIZLLL);
            Exception exc3 = c1662010tLr6.LIZLLL;
            c1662010tLr6.LIZIZ = exc3 != null ? exc3.getMessage() : null;
            c13nn4.LIZLLL(c13nn4, c1662010tLr6);
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("[DiffEffect][Flow][Download Diff Suc][");
        sbLIZ5.append(this.LIZLLL.getName());
        sbLIZ5.append(']');
        C13SS.LJ("JKL", C2188811AlT.LIZIZ(sbLIZ5));
        try {
            C13MX c13mx2 = this.LJIIJ;
            if (c13mx2 == null) {
                c13mx2 = null;
            }
            Effect effect = this.LIZLLL;
            String unzipPath = effect.getUnzipPath();
            String str2 = this.LJIIIZ;
            if (str2 == null) {
                str2 = null;
            }
            e = c13mx2.LJIJ(effect, unzipPath, str2);
            if (e == null) {
                C13SS c13ss3 = C13SS.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("[DiffEffect][Flow][MergeFolder Suc][");
                sbLIZ6.append(this.LIZLLL.getName());
                sbLIZ6.append(']');
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ6);
                c13ss3.getClass();
                C13SS.LJ("JKL", strLIZIZ3);
                C13NN<C13NR> c13nn5 = this.LJ;
                c13nn5.LJII(c13nn5, new C13NR(this.LIZLLL));
                return;
            }
        } catch (Exception e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
        }
        C13SS c13ss4 = C13SS.LIZ;
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("[DiffEffect][Flow][MergeFolder Failed][");
        sbLIZ7.append(this.LIZLLL.getName());
        sbLIZ7.append("][");
        sbLIZ7.append(e.getMessage());
        sbLIZ7.append(']');
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ7);
        c13ss4.getClass();
        C13SS.LIZIZ("JKL", strLIZIZ4, null);
        C13NN<C13NR> c13nn6 = this.LJ;
        C1662010tLr c1662010tLr7 = new C1662010tLr(10023, e);
        Exception exc4 = c1662010tLr7.LIZLLL;
        c1662010tLr7.LIZIZ = exc4 != null ? exc4.getMessage() : null;
        c13nn6.LIZLLL(c13nn6, c1662010tLr7);
    }

    public final boolean LIZLLL() {
        String str = this.LJIIIZ;
        if (str == null) {
            str = null;
        }
        if (!C13SB.LJ(str)) {
            return false;
        }
        String str2 = this.LJIIIZ;
        return C19997613Mg.LIZ(str2 != null ? str2 : null);
    }

    public static List LIZJ(UrlModel urlModel) {
        List<String> url_prefix;
        if (urlModel == null) {
            return new ArrayList();
        }
        if (!urlModel.getUrlList().isEmpty()) {
            return urlModel.getUrlList();
        }
        String uri = urlModel.getUri();
        if (uri != null && uri.length() != 0 && (url_prefix = urlModel.getUrl_prefix()) != null && !url_prefix.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            List<String> url_prefix2 = urlModel.getUrl_prefix();
            if (url_prefix2 != null) {
                for (String str : url_prefix2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(urlModel.getUri());
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            urlModel.setUrlList(arrayList);
            return arrayList;
        }
        return new ArrayList();
    }

    public C19997813Mi(C13RD c13rd, String str, C13N5 c13n5, Effect effect, C13NN<C13NR> c13nn) {
        this.LIZ = c13rd;
        this.LIZIZ = str;
        this.LIZJ = c13n5;
        this.LIZLLL = effect;
        this.LJ = c13nn;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19998313Mn LIZ(java.util.List r23, X.C13M6 r24, final boolean r25, int r26, java.lang.StringBuffer r27) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19997813Mi.LIZ(java.util.List, X.13M6, boolean, int, java.lang.StringBuffer):X.13Mn");
    }
}
