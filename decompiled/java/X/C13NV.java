package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS146S0110000_30;
import kotlin.jvm.internal.AwS15S0101100_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.13NV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13NV extends AbstractC20000013Ne {
    public final Effect LIZ;
    public final C13RD LIZIZ;
    public final String LIZJ;
    public final DownloadEffectExtra LIZLLL;
    public final boolean LJ;
    public final C01GW LJFF;
    public List<String> LJI;
    public C13NN<C13NR> LJII;
    public final C557050Lt1 LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public long LJIIJJI;

    @Override // X.AbstractC20000013Ne
    public final boolean isSupportPaused() {
        return true;
    }

    public final void LIZIZ() {
        ArrayList arrayList;
        String extra = this.LIZ.getExtra();
        if (extra == null || extra.length() > 0) {
            Integer extraZstFileSize = this.LIZ.getExtraZstFileSize();
            String extraZstUri = this.LIZ.getExtraZstUri();
            String extraZipMd5 = this.LIZ.getExtraZipMd5();
            int iIntValue = ((Number) C260610AJf.LIZ.getValue()).intValue();
            this.LIZ.setZstdDownload(false);
            if (extraZstFileSize == null || extraZstFileSize.intValue() <= 0 || extraZstFileSize.intValue() > iIntValue || extraZstUri == null || !Intrinsics.LJFF(this.LIZ.getId(), extraZipMd5)) {
                return;
            }
            C13SS c13ss = C13SS.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("effect: ");
            sbLIZ.append(this.LIZ.getEffect_id());
            sbLIZ.append(", name: ");
            sbLIZ.append(this.LIZ.getName());
            sbLIZ.append(", ");
            sbLIZ.append(EffectKt.expectedMd5(this.LIZ));
            sbLIZ.append(" has zstd package");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c13ss.getClass();
            C13SS.LIZ("DownloadEffectTask", strLIZIZ);
            List<String> list = this.LJI;
            if (list != null) {
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (String str : list) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(a0.LJL(str, "/", str));
                    sbLIZ2.append('/');
                    sbLIZ2.append(extraZstUri);
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                }
            } else {
                arrayList = null;
            }
            this.LJI = arrayList;
            this.LIZ.setZstdDownload(true);
            C13SS c13ss2 = C13SS.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("effect: zstUri ");
            sbLIZ3.append(this.LIZ.getExtraZstUri());
            sbLIZ3.append(", size: ");
            sbLIZ3.append(this.LIZ.getExtraZstFileSize());
            sbLIZ3.append(", replace Url with ZstUrl");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            c13ss2.getClass();
            C13SS.LIZ("DownloadEffectTask", strLIZIZ2);
        }
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void cancel() {
        C13NN<C13NR> c13nn = this.LJII;
        if (c13nn != null) {
            c13nn.LIZ();
        }
        super.cancel();
    }

    @Override // X.AbstractC20000013Ne
    public final void execute() {
        if (this.LJIIIIZZ.LIZIZ()) {
            C13NQ c13nq = new C13NQ(this.LIZ, this.LJI, this.LIZIZ.LJII, 0, false, 504);
            c13nq.LJ = Boolean.valueOf(this.LJIIIZ);
            c13nq.LJIIIIZZ = this.LJ;
            InterfaceC19997313Md interfaceC19997313Md = this.LIZIZ.LJJI;
            if (interfaceC19997313Md == null) {
                runOnMainThread(new AwS574S0100000_30(this, 419));
                return;
            }
            C13NN<C13NR> c13nnLIZ = interfaceC19997313Md.LIZ(c13nq);
            this.LJII = c13nnLIZ;
            if (c13nnLIZ != null) {
                c13nnLIZ.LIZ = new C13NO<C13NR>() { // from class: X.13NW
                    @Override // X.C13NO
                    public final void LIZJ(C13NN<C13NR> c13nn) {
                    }

                    @Override // X.C13NO
                    public final void LIZ(C13NN<C13NR> c13nn) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[Effect][Callback][Pause][");
                        sbLIZ.append(this.LIZ.getId());
                        sbLIZ.append(']');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("DownloadEffectTask", strLIZIZ);
                        C13NV c13nv = this.LIZ;
                        c13nv.runOnMainThread(new AwS431S0200000_30(c13nv, (C13NV) c13nn, (C13NN<C13NR>) 91));
                    }

                    @Override // X.C13NO
                    public final void LIZLLL(C13NN<C13NR> c13nn) {
                        C13NV c13nv = this.LIZ;
                        c13nv.runOnMainThread(new AwS574S0100000_30(c13nv, 421));
                    }

                    @Override // X.C13NO
                    public final void LIZIZ(C13NN<C13NR> c13nn, C13NR c13nr) {
                        this.LIZ.LIZ(true, null);
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchEffect: ");
                        sbLIZ.append(this.LIZ.LIZ.getName());
                        sbLIZ.append(" onSuccess");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("DownloadEffectTask", strLIZIZ);
                        C13NV c13nv = this.LIZ;
                        c13nv.runOnMainThread(new AwS431S0200000_30(c13nv, c13nr, 94));
                    }

                    @Override // X.C13NO
                    public final void LJ(C13NN<C13NR> c13nn, C1662010tLr c1662010tLr) {
                        this.LIZ.LIZ(false, c1662010tLr);
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchEffect: ");
                        sbLIZ.append(this.LIZ.LIZ.getName());
                        sbLIZ.append(" onFailed");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("DownloadEffectTask", strLIZIZ);
                        C13NV c13nv = this.LIZ;
                        c13nv.runOnMainThread(new AwS431S0200000_30(c13nv, c1662010tLr, 90));
                    }

                    @Override // X.C13NO
                    public final void LJI(C13NN<C13NR> c13nn, boolean z) {
                        C13SS c13ss = C13SS.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("[Effect][Callback][Cancel][");
                        sbLIZ.append(this.LIZ.getId());
                        sbLIZ.append(']');
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c13ss.getClass();
                        C13SS.LIZ("DownloadEffectTask", strLIZIZ);
                        C13NV c13nv = this.LIZ;
                        c13nv.runOnMainThread(new AwS146S0110000_30(c13nv, z, 3));
                    }

                    @Override // X.C13NO
                    public final void LJFF(C13NN<C13NR> c13nn, int i, long j) {
                        AwS15S0101100_30 awS15S0101100_30 = new AwS15S0101100_30(this.LIZ, i, j, 0);
                        if (((Boolean) this.LIZ.LJFF.getValue()).booleanValue()) {
                            awS15S0101100_30.invoke();
                        } else {
                            C421570Gfz.LIZ(new AwS574S0100000_30(awS15S0101100_30, 420));
                        }
                    }
                };
                c13nnLIZ.LIZIZ();
            }
        }
    }

    @Override // X.AbstractC20000013Ne
    public final void onCancel() {
        if (this.isRunning) {
            return;
        }
        C13MA c13maLIZ = this.LIZIZ.LJJJIL.LIZ(this.LIZJ);
        if ((c13maLIZ instanceof C13NY) && c13maLIZ != null) {
            c13maLIZ.onFail(this.LIZ, new C1662010tLr(10001, new Exception("10001")));
        }
        runOnMainThread(new AwS574S0100000_30(this, 417));
    }

    @Override // X.AbstractC20000013Ne
    public final void onPreExecute() {
        final C13NY c13ny;
        C2278408wI c2278408wI = C19999713Nb.LIZ;
        c2278408wI.LIZ();
        try {
            Effect effect = this.LIZ;
            effect.setId(u.LJJIFFI(u.LJJIFFI(effect.getId(), "\"", "_", false), "/", "_", false));
            C13MG c13mg = this.LIZIZ.LJJJI;
            String strExpectedMd5 = EffectKt.expectedMd5(this.LIZ);
            c13mg.getClass();
            if (C13MG.LIZLLL(strExpectedMd5)) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("effect: ");
                sbLIZ.append(this.LIZ.getEffect_id());
                sbLIZ.append(", name: ");
                sbLIZ.append(this.LIZ.getName());
                sbLIZ.append(", ");
                sbLIZ.append(EffectKt.expectedMd5(this.LIZ));
                sbLIZ.append(" is now downloading, add in listener");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZ("DownloadEffectTask", strLIZIZ);
                C13MA c13maLIZ = this.LIZIZ.LJJJIL.LIZ(this.LIZJ);
                if ((c13maLIZ instanceof C13NY) && (c13ny = (C13NY) c13maLIZ) != null) {
                    c13ny.onStart(this.LIZ);
                    C13MG c13mg2 = this.LIZIZ.LJJJI;
                    Effect effect2 = this.LIZ;
                    C13NY c13ny2 = new C13NY() { // from class: X.13NX
                        @Override // X.C13NY
                        public final void onStart(Effect effect3) {
                        }

                        @Override // X.C13MA
                        public final void onSuccess(Effect effect3) {
                            c13ny.onSuccess(effect3);
                            C13NV c13nv = this;
                            c13nv.LIZIZ.LJJJIL.LIZJ(c13nv.LIZJ);
                        }

                        @Override // X.C13MA
                        public final /* bridge */ /* synthetic */ void preProcess(Effect effect3) {
                        }

                        @Override // X.C13MA
                        public final void onFail(Effect effect3, C1662010tLr c1662010tLr) {
                            c13ny.onFail(effect3, c1662010tLr);
                            C13NV c13nv = this;
                            c13nv.LIZIZ.LJJJIL.LIZJ(c13nv.LIZJ);
                        }

                        @Override // X.C13NY
                        public final void onProgress(Effect effect3, int i, long j) {
                            c13ny.onProgress(effect3, i, j);
                        }
                    };
                    c13mg2.getClass();
                    C13MG.LIZ(effect2, c13ny2);
                }
                this.LJIIIIZZ.LIZJ(false);
            } else {
                this.LJIIIIZZ.LIZJ(true);
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("effect: ");
                sbLIZ2.append(this.LIZ.getEffect_id());
                sbLIZ2.append(", name: ");
                sbLIZ2.append(this.LIZ.getName());
                sbLIZ2.append(", ");
                sbLIZ2.append(EffectKt.expectedMd5(this.LIZ));
                sbLIZ2.append(" added in download list!");
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                c13ss2.getClass();
                C13SS.LIZ("DownloadEffectTask", strLIZIZ2);
            }
            c2278408wI.LIZIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2278408wI.LIZIZ();
            throw th;
        }
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final int getLevel() {
        return this.LJIIJ;
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final long getModifyTime() {
        return this.LJIIJJI;
    }

    @Override // X.AbstractC20000013Ne
    public final void onPause(boolean z) {
        int i;
        String str;
        if (!this.isRunning) {
            C13MA c13maLIZ = this.LIZIZ.LJJJIL.LIZ(this.LIZJ);
            if ((c13maLIZ instanceof C13NY) && c13maLIZ != null) {
                Effect effect = this.LIZ;
                if (z) {
                    i = 10029;
                } else {
                    i = 10020;
                }
                if (z) {
                    str = "10029";
                } else {
                    str = "10020";
                }
                c13maLIZ.onFail(effect, new C1662010tLr(i, new Exception(str)));
            }
        }
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void pause(boolean z) {
        super.pause(z);
        C13NN<C13NR> c13nn = this.LJII;
        if (c13nn != null) {
            c13nn.LJIIIZ(z);
        }
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void setLevel(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC20000013Ne, X.InterfaceC20001313Nr
    public final void setModifyTime(long j) {
        this.LJIIJJI = j;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(boolean z, C1662010tLr c1662010tLr) {
        DownloadEffectExtra downloadEffectExtra;
        String strLIZIZ;
        String str;
        if (this.LIZIZ.LJIJJLI != null && (downloadEffectExtra = this.LIZLLL) != null) {
            if (Intrinsics.LJFF("beautify", downloadEffectExtra.getPanel()) || Intrinsics.LJFF("beautifynew", this.LIZLLL.getPanel())) {
                int i = !z ? 1 : 0;
                StringBuilder sb = new StringBuilder();
                List<String> list = this.LJI;
                if (list != null) {
                    Iterator<String> it2 = list.iterator();
                    while (it2.hasNext()) {
                        sb.append(it2.next());
                        sb.append(",");
                    }
                }
                InterfaceC1633730scF interfaceC1633730scF = this.LIZIZ.LJIJJLI;
                if (interfaceC1633730scF != null) {
                    HashMap map = new HashMap();
                    map.put("effect_id", this.LIZ.getEffect_id());
                    map.put("effect_name", this.LIZ.getName());
                    String str2 = this.LIZIZ.LJIIJ;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    map.put("app_id", str2);
                    map.put("download_urls", sb.toString());
                    String panel = this.LIZLLL.getPanel();
                    if (panel == null) {
                        panel = "";
                    }
                    map.put("panel", panel);
                    if (c1662010tLr == null) {
                        strLIZIZ = "";
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("");
                        sbLIZ.append(c1662010tLr.LIZ);
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    }
                    map.put("error_code", strLIZIZ);
                    if (c1662010tLr != null && (str = c1662010tLr.LIZIZ) != null) {
                        str3 = str;
                    }
                    map.put("error_msg", str3);
                    interfaceC1633730scF.monitorStatusRate("effect_resource_download_success_rate", i, map);
                }
            }
        }
    }

    public C13NV(Effect effect, C13RD c13rd, String str, DownloadEffectExtra downloadEffectExtra, boolean z) {
        List<String> arrayList;
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        super(str, null);
        this.LIZ = effect;
        this.LIZIZ = c13rd;
        this.LIZJ = str;
        this.LIZLLL = downloadEffectExtra;
        this.LJ = z;
        if (!z && (iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null)) != null) {
            iCKResourceVEPluginStatusService.LIZ();
        }
        this.LJFF = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(326));
        C13LD c13ld = C13LD.LIZ;
        UrlModel file_url = effect.getFile_url();
        c13ld.getClass();
        if (file_url != null && !C13LD.LJII(file_url)) {
            arrayList = file_url.getUrlList();
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJI = arrayList;
        this.LJIIIIZZ = new C557050Lt1(true);
    }
}
