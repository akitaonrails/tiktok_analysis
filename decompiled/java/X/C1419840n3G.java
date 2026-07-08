package X;

import Y.ARunnableS1S2110000_22;
import Y.ARunnableS33S0101000_22;
import Y.ARunnableS5S1101000_22;
import Y.ARunnableS7S0100001_22;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter;
import com.bytedance.ies.nle.editor_jni.NLEResourceCallback;
import com.bytedance.ies.nle.editor_jni.NLEResourceManager;
import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovie;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.cktemplate.resource.ITemplateResourceDownloaderService;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0n3G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419840n3G extends NLEResourceManager {
    public final Function0<Integer> LIZ;
    public final boolean LIZIZ;
    public final Set<NLESingleResourceDownloadCallback> LIZJ;
    public final boolean LIZLLL;
    public final AtomicLong LJ;

    public C1419840n3G(AwS566S0100000_22 awS566S0100000_22) {
        Set<NLESingleResourceDownloadCallback> linkedHashSet;
        this.LIZ = awS566S0100000_22;
        boolean zLIZ = C291060Bay.LIZ();
        this.LIZIZ = zLIZ;
        if (zLIZ) {
            linkedHashSet = Collections.synchronizedSet(new LinkedHashSet());
        } else {
            linkedHashSet = new LinkedHashSet<>();
        }
        this.LIZJ = linkedHashSet;
        this.LIZLLL = C0C64.LJIILLIIL().LJIIIZ(31744, "template_autocut_async_render_callback_fix", true, true);
        this.LJ = new AtomicLong(0L);
    }

    public static void LIZ(Runnable runnable) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("template_async_render_anr_fix_switch", false)) {
            C01TT.LIZLLL(new AwS566S0100000_22(runnable, 837));
        } else {
            runnable.run();
        }
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceManager
    public final String fetchResource(String str, final NLEResourceCallback nLEResourceCallback) {
        boolean z;
        if (str == null) {
            return null;
        }
        String name = C786410Ut5.u3().getName();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_RENDER: [fetchResource] ENTER resourceId=");
        sbLIZ.append(str);
        sbLIZ.append(", thread=");
        sbLIZ.append(name);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
        try {
            C1419810n3D.LIZJ(null);
            final int iIntValue = this.LIZ.invoke().intValue();
            final long j = this.LJ.get();
            if (this.LIZLLL && nLEResourceCallback != null) {
                nLEResourceCallback = new NLEResourceCallback() { // from class: X.0n3L
                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceCallback
                    public final void onProgress(float f) {
                        if (this.LIZ.LJ.get() == j) {
                            nLEResourceCallback.onProgress(f);
                        }
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceCallback
                    public final void onError(int i, String str2) {
                        if (this.LIZ.LJ.get() == j) {
                            nLEResourceCallback.onError(i, str2);
                        }
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceCallback
                    public final void onSuccess(String str2, String str3, boolean z2) {
                        if (this.LIZ.LJ.get() == j) {
                            nLEResourceCallback.onSuccess(str2, str3, z2);
                        }
                    }
                };
            }
            boolean z2 = true;
            if (iIntValue != EnumC1412640mre.PUGC_TEMPLATE.getValue() && (!this.LIZIZ || (iIntValue != EnumC1412640mre.UGC_TEMPLATE.getValue() && iIntValue != EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue()))) {
                z = false;
            } else {
                z = true;
            }
            if (iIntValue != EnumC1412640mre.CUT_SAME.getValue() && !z) {
                z2 = false;
            }
            if (z2) {
                NLESingleResourceDownloadCallback nLESingleResourceDownloadCallback = new NLESingleResourceDownloadCallback() { // from class: X.0n3K
                    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
                    public final void onProgress(int i) {
                        C1419840n3G c1419840n3G = this;
                        ARunnableS33S0101000_22 aRunnableS33S0101000_22 = new ARunnableS33S0101000_22(i, nLEResourceCallback, 5);
                        c1419840n3G.getClass();
                        C1419840n3G.LIZ(aRunnableS33S0101000_22);
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
                    public final void onFailure(String str2, int i, String str3) {
                        C1419840n3G c1419840n3G = this;
                        ARunnableS5S1101000_22 aRunnableS5S1101000_22 = new ARunnableS5S1101000_22(i, nLEResourceCallback, str3, 1);
                        c1419840n3G.getClass();
                        C1419840n3G.LIZ(aRunnableS5S1101000_22);
                        C1417710mzp.LJIJI("source_async_render", str2, i, str3, null, Integer.valueOf(iIntValue));
                        this.LIZJ.remove(this);
                    }

                    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
                    public final void onSuccess(String str2, String str3, boolean z3) {
                        C1419840n3G c1419840n3G = this;
                        ARunnableS1S2110000_22 aRunnableS1S2110000_22 = new ARunnableS1S2110000_22(nLEResourceCallback, str2, str3, z3, 0);
                        c1419840n3G.getClass();
                        C1419840n3G.LIZ(aRunnableS1S2110000_22);
                        this.LIZJ.remove(this);
                    }
                };
                this.LIZJ.add(nLESingleResourceDownloadCallback);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("ASYNC_RENDER: [fetchResource] before fetch, type=");
                sbLIZ2.append(iIntValue);
                sbLIZ2.append(" resourceId=");
                sbLIZ2.append(str);
                sbLIZ2.append(", callbackSetSize=");
                sbLIZ2.append(this.LIZJ.size());
                C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ2));
                C1419810n3D.LIZ.getClass();
                C1419810n3D.LIZIZ(iIntValue).fetch(str, nLESingleResourceDownloadCallback);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ASYNC_RENDER: [fetchResource] after fetch dispatched, type=");
                sbLIZ3.append(iIntValue);
                sbLIZ3.append(" resourceId=");
                sbLIZ3.append(str);
                C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ3));
                return String.valueOf(System.nanoTime());
            }
            return LIZIZ(nLEResourceCallback, iIntValue, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("ASYNC_RENDER: [fetchResource] THROW resourceId=");
            sbLIZ4.append(str);
            sbLIZ4.append(", thread=");
            sbLIZ4.append(name);
            C201955140j.LJIIIZ(c1398350mUb2, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ4), th);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0n3H] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0n3N, com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String LIZIZ(final NLEResourceCallback nLEResourceCallback, final int i, String str) {
        ITemplateResourceDownloaderService iTemplateResourceDownloaderService = AnonymousClass0962.LIZ;
        if (iTemplateResourceDownloaderService != 0 && iTemplateResourceDownloaderService.LIZIZ()) {
            iTemplateResourceDownloaderService.LIZJ(str, new InterfaceC554990Lph() { // from class: X.0n3H
                @Override // X.InterfaceC554990Lph
                public final void LJJI(final String str2, final String str3) {
                    C1419840n3G c1419840n3G = this;
                    final NLEResourceCallback nLEResourceCallback2 = nLEResourceCallback;
                    Runnable runnable = new Runnable() { // from class: X.0n3I
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$1$onSuccess$1");
                            try {
                                NLEResourceCallback nLEResourceCallback3 = nLEResourceCallback2;
                                if (nLEResourceCallback3 != null) {
                                    nLEResourceCallback3.onSuccess(str2, str3, false);
                                }
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("AutoCutNLEResourceManagerImpl@446c.fetchDavinciResource$1$onSuccess$1");
                        }
                    };
                    c1419840n3G.getClass();
                    C1419840n3G.LIZ(runnable);
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ASYNC_RENDER: WuZhui templateType=");
                    sbLIZ.append(i);
                    sbLIZ.append(" onSuccess: urs=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", path=");
                    sbLIZ.append(str3);
                    C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // X.InterfaceC554990Lph
                public final void LIZ(int i2, String str2, String str3) {
                    C1419840n3G c1419840n3G = this;
                    ARunnableS5S1101000_22 aRunnableS5S1101000_22 = new ARunnableS5S1101000_22(i2, nLEResourceCallback, str3, 2);
                    c1419840n3G.getClass();
                    C1419840n3G.LIZ(aRunnableS5S1101000_22);
                    C1417710mzp.LJIJI("source_async_render", str2, i2, str3, null, Integer.valueOf(i));
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ASYNC_RENDER: WuZhui templateType=");
                    sbLIZ.append(i);
                    sbLIZ.append(" onFail: urs=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", code=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(str3);
                    C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
            return String.valueOf(System.nanoTime());
        }
        if (C295320Bhq.LIZ()) {
            C23157095n c23157095n = C23157095n.LIZ;
            SmartMovieAdapter.SmartMovieEffectDownCallback smartMovieEffectDownCallback = new SmartMovieAdapter.SmartMovieEffectDownCallback() { // from class: X.0n3M
                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieEffectDownCallback
                public final void onProgress(float f) {
                    C1419840n3G c1419840n3G = this;
                    ARunnableS7S0100001_22 aRunnableS7S0100001_22 = new ARunnableS7S0100001_22(f, nLEResourceCallback, 2);
                    c1419840n3G.getClass();
                    C1419840n3G.LIZ(aRunnableS7S0100001_22);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieEffectDownCallback
                public final void onFailure(String str2, int i2, String str3) {
                    C1419840n3G c1419840n3G = this;
                    ARunnableS5S1101000_22 aRunnableS5S1101000_22 = new ARunnableS5S1101000_22(i2, nLEResourceCallback, str3, 3);
                    c1419840n3G.getClass();
                    C1419840n3G.LIZ(aRunnableS5S1101000_22);
                    C1417710mzp.LJIJI("source_async_render", str2, i2, str3, null, Integer.valueOf(i));
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ASYNC_RENDER: templateType=");
                    sbLIZ.append(i);
                    sbLIZ.append(", Unnecessary onFailure: urs=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", code=");
                    sbLIZ.append(i2);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(str3);
                    C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // com.bytedance.ies.cutsame.cut_android.SmartMovieAdapter.SmartMovieEffectDownCallback
                public final void onSuccess(String str2, String str3, boolean z) {
                    C1419840n3G c1419840n3G = this;
                    ARunnableS1S2110000_22 aRunnableS1S2110000_22 = new ARunnableS1S2110000_22(nLEResourceCallback, str2, str3, z, 1);
                    c1419840n3G.getClass();
                    C1419840n3G.LIZ(aRunnableS1S2110000_22);
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ASYNC_RENDER: templateType=");
                    sbLIZ.append(i);
                    sbLIZ.append(", Unnecessary onSuccess: urs=");
                    sbLIZ.append(str2);
                    sbLIZ.append(", path=");
                    sbLIZ.append(str3);
                    sbLIZ.append(", isFromCache=");
                    sbLIZ.append(z);
                    C201955140j.LIZLLL(c1398350mUb, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ));
                }
            };
            c23157095n.getClass();
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchDavinciUrs urs=");
            sbLIZ.append(str);
            C201955140j.LIZLLL(c1398350mUb, "SmartMovieApiExt", C2188811AlT.LIZIZ(sbLIZ));
            AnonymousClass0960 anonymousClass0960 = C23157095n.LIZIZ;
            if (anonymousClass0960 == null) {
                C201955140j.LJIIIIZZ(c1398350mUb, "SmartMovieApiExt", "fetchDavinciUrs failed: not initialized");
                return "";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetchDavinciUrs urs=");
            sbLIZ2.append(str);
            C201955140j.LIZLLL(c1398350mUb, "SmartMovieExt", C2188811AlT.LIZIZ(sbLIZ2));
            return anonymousClass0960.LIZIZ.fetchEffectByUrs(str, smartMovieEffectDownCallback);
        }
        C1418540n1A c1418540n1A = C1418540n1A.LIZ;
        ?? r9 = new NLESingleResourceDownloadCallback() { // from class: X.0n3N
            @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
            public final void onProgress(int i2) {
                C1419840n3G c1419840n3G = this;
                ARunnableS33S0101000_22 aRunnableS33S0101000_22 = new ARunnableS33S0101000_22(i2, nLEResourceCallback, 6);
                c1419840n3G.getClass();
                C1419840n3G.LIZ(aRunnableS33S0101000_22);
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
            public final void onFailure(String str2, int i2, String str3) {
                C1419840n3G c1419840n3G = this;
                ARunnableS5S1101000_22 aRunnableS5S1101000_22 = new ARunnableS5S1101000_22(i2, nLEResourceCallback, str3, 4);
                c1419840n3G.getClass();
                C1419840n3G.LIZ(aRunnableS5S1101000_22);
                C1417710mzp.LJIJI("source_async_render", str2, i2, str3, null, Integer.valueOf(i));
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ASYNC_RENDER: templateType=");
                sbLIZ3.append(i);
                sbLIZ3.append(", Unnecessary onFailure: urs=");
                sbLIZ3.append(str2);
                sbLIZ3.append(", code=");
                sbLIZ3.append(i2);
                sbLIZ3.append(", msg=");
                sbLIZ3.append(str3);
                C201955140j.LIZLLL(c1398350mUb2, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
            public final void onSuccess(String str2, String str3, boolean z) {
                C1419840n3G c1419840n3G = this;
                ARunnableS1S2110000_22 aRunnableS1S2110000_22 = new ARunnableS1S2110000_22(nLEResourceCallback, str2, str3, z, 2);
                c1419840n3G.getClass();
                C1419840n3G.LIZ(aRunnableS1S2110000_22);
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ASYNC_RENDER: templateType=");
                sbLIZ3.append(i);
                sbLIZ3.append(", Unnecessary onSuccess: urs=");
                sbLIZ3.append(str2);
                sbLIZ3.append(", path=");
                sbLIZ3.append(str3);
                sbLIZ3.append(", isFromCache=");
                sbLIZ3.append(z);
                C201955140j.LIZLLL(c1398350mUb2, "AutoCutNLEResourceManagerImpl", C2188811AlT.LIZIZ(sbLIZ3));
            }
        };
        c1418540n1A.getClass();
        C1418550n1B c1418550n1BLIZ = C1418540n1A.LIZ();
        c1418550n1BLIZ.getClass();
        C1419870n3J c1419870n3J = new C1419870n3J(r9, new Object[0]);
        SmartMovie smartMovie = c1418550n1BLIZ.LIZ;
        if (smartMovie == null) {
            smartMovie = null;
        }
        String strSmartMovie_fetchDavinciUrs = SmartMovieJniJNI.SmartMovie_fetchDavinciUrs(smartMovie.LIZ, smartMovie, str, NLESingleResourceDownloadCallback.getCPtr(r9), r9);
        ((HashMap) c1418550n1BLIZ.LIZLLL.getValue()).put(strSmartMovie_fetchDavinciUrs, Long.valueOf(c1419870n3J.LIZJ));
        return strSmartMovie_fetchDavinciUrs;
    }
}
