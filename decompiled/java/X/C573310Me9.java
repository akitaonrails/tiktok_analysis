package X;

import Y.ACallableS410S0100000_2;
import Y.ARunnableS41S0300000_8;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.mediaselector.IPreDownloadMusic;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.templatecore.templatedata.MvThemeData;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: renamed from: X.0Me9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573310Me9 {
    public static final /* synthetic */ int LJI = 0;
    public final C19EG LIZ;
    public final SafeHandler LIZIZ;
    public final IPreDownloadMusic LIZJ;
    public volatile boolean LIZLLL;
    public MvThemeData LJ;
    public final IAnotherMusicService LJFF;

    public static final void LIZLLL(C118300cf c118300cf, Function0<Unit> function0) {
        int i = c118300cf.element + 1;
        c118300cf.element = i;
        if (i == 2 && function0 != null) {
            function0.invoke();
        }
    }

    public C573310Me9(C19EG c19eg, Scene scene, boolean z, int i) {
        scene = (i & 2) != 0 ? null : scene;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = c19eg;
        this.LIZIZ = new SafeHandler(C0CHQ.LIZ().LJIJJ().LJIIIIZZ(c19eg));
        this.LIZJ = C569270MUj.LIZ(c19eg, scene, z);
        this.LJFF = (IAnotherMusicService) C0CHQ.LIZ().LJJJJL();
    }

    public final AbstractC573460MeO LIZIZ(C573060Mdk c573060Mdk, String str, final String str2, boolean z, InterfaceC573490MeR interfaceC573490MeR) {
        final C573380MeG c573380MeG = new C573380MeG(c573060Mdk, new WeakReference(this.LIZ), interfaceC573490MeR, null, null, null, 1016);
        c573380MeG.LJIIJ = str;
        C573410MeJ c573410MeJ = new C573410MeJ(str2, c573380MeG);
        C573400MeI c573400MeI = new C573400MeI(str2, c573380MeG);
        AbstractC573460MeO abstractC573460MeO = new AbstractC573460MeO(c573380MeG) { // from class: X.0MeC
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
            /* JADX WARN: Type inference failed for: r0v19, types: [X.0Me6, X.0MeO] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v3, types: [com.ss.android.ugc.templatecore.templatedata.MvThemeData] */
            /* JADX WARN: Type inference failed for: r5v5, types: [com.ss.android.ugc.templatecore.templatedata.MvThemeData] */
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
            @Override // X.InterfaceC573280Me6
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 210
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C573340MeC.LIZ(java.lang.Object):void");
            }
        };
        AbstractC573460MeO abstractC573460MeO2 = new AbstractC573460MeO(c573380MeG) { // from class: X.0MeH
            @Override // X.InterfaceC573280Me6
            public final void LIZ(Object obj) {
                this.LIZJ.LIZIZ();
                C573060Mdk c573060Mdk2 = this.LIZ.LIZ;
                if (c573060Mdk2 != null) {
                    c573060Mdk2.LJIIJJI = 2;
                }
                if (obj instanceof MvThemeData) {
                    final MvThemeData mvThemeData = (MvThemeData) obj;
                    if (C385400F9e.LIZJ(mvThemeData.effect)) {
                        long jLIZ = this.LIZJ.LIZ();
                        C573380MeG c573380MeG2 = this.LIZ;
                        C573060Mdk c573060Mdk3 = c573380MeG2.LIZ;
                        if (c573060Mdk3 != null) {
                            c573060Mdk3.LIZIZ = (int) jLIZ;
                        }
                        InterfaceC573490MeR interfaceC573490MeR2 = c573380MeG2.LIZJ;
                        if (interfaceC573490MeR2 != null) {
                            interfaceC573490MeR2.LIZ(mvThemeData);
                            return;
                        }
                        return;
                    }
                    InterfaceC1635410sex interfaceC1635410sex = this.LIZ.LJI;
                    if (interfaceC1635410sex == null) {
                        return;
                    }
                    interfaceC1635410sex.LIZJ(mvThemeData.effect, new C1634550sdZ("mv", new IEffectDownloadProgressListener() { // from class: X.0MeD
                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onStart(Effect effect) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PhotoMVNext: effectDownloadStart: id=");
                            sbLIZ.append(effect.getEffectId());
                            sbLIZ.append(" name=");
                            sbLIZ.append(effect.getName());
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(Effect effect) {
                            Effect effect2 = effect;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PhotoMVNext: EffectDownProcessor: effectID = ");
                            sbLIZ.append(effect2.getEffectId());
                            sbLIZ.append(" name = ");
                            sbLIZ.append(effect2.getName());
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            C0L16.LIZ(0, "download_effect", "download success");
                            if (!C385400F9e.LIZJ(effect2)) {
                                getClass();
                                C15O7.LIZJ(new ACallableS410S0100000_2(effect2, 12));
                                long jLIZ2 = this.LIZ.LIZJ.LIZ();
                                C573060Mdk c573060Mdk4 = this.LIZ.LIZ.LIZ;
                                if (c573060Mdk4 != null) {
                                    c573060Mdk4.LIZIZ = (int) jLIZ2;
                                    c573060Mdk4.LJIIJ = "mv list is null";
                                    c573060Mdk4.LJIIIZ = 3;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("PhotoMVNext: EffectDownProcessor:mvRes is not legal error: effectID = ");
                                sbLIZ2.append(effect2.getEffectId());
                                sbLIZ2.append(" name = ");
                                sbLIZ2.append(effect2.getName());
                                C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("download success but mvRes is not legal mvVersion: ");
                                sbLIZ3.append(C385400F9e.LIZIZ(effect2));
                                C0L16.LIZ(-1, "download_effect", C2188811AlT.LIZIZ(sbLIZ3));
                                InterfaceC573490MeR interfaceC573490MeR3 = this.LIZ.LIZ.LIZJ;
                                if (interfaceC573490MeR3 != null) {
                                    interfaceC573490MeR3.onFailed();
                                    return;
                                }
                                return;
                            }
                            long jLIZ3 = this.LIZ.LIZJ.LIZ();
                            C573060Mdk c573060Mdk5 = this.LIZ.LIZ.LIZ;
                            if (c573060Mdk5 != null) {
                                c573060Mdk5.LIZIZ = (int) jLIZ3;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("PhotoMVNext: effectDownloadSuccess: id=");
                            sbLIZ4.append(effect2.getEffectId());
                            sbLIZ4.append(" name=");
                            sbLIZ4.append(effect2.getName());
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ4));
                            InterfaceC573490MeR interfaceC573490MeR4 = this.LIZ.LIZ.LIZJ;
                            if (interfaceC573490MeR4 == null) {
                                return;
                            }
                            interfaceC573490MeR4.LIZ(mvThemeData);
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                            String effectId;
                            long jLIZ2 = this.LIZ.LIZJ.LIZ();
                            C573060Mdk c573060Mdk4 = this.LIZ.LIZ.LIZ;
                            if (c573060Mdk4 != null) {
                                c573060Mdk4.LIZIZ = (int) jLIZ2;
                                c573060Mdk4.LJIIJ = exceptionResult.getMsg();
                            }
                            C573060Mdk c573060Mdk5 = this.LIZ.LIZ.LIZ;
                            if (c573060Mdk5 != null) {
                                c573060Mdk5.LJIIIZ = 3;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PhotoMVNext: effectDownloadFail: id=");
                            String name = null;
                            if (effect != null) {
                                effectId = effect.getEffectId();
                            } else {
                                effectId = null;
                            }
                            sbLIZ.append(effectId);
                            sbLIZ.append(" name=");
                            if (effect != null) {
                                name = effect.getName();
                            }
                            sbLIZ.append(name);
                            sbLIZ.append(" msg=");
                            sbLIZ.append(exceptionResult.getMsg());
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                            C0L16.LIZ(-2, "download_effect", "download failed");
                            InterfaceC573490MeR interfaceC573490MeR3 = this.LIZ.LIZ.LIZJ;
                            if (interfaceC573490MeR3 != null) {
                                interfaceC573490MeR3.onFailed();
                            }
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                        public final void onProgress(Effect effect, int i, long j) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("PhotoMVNext: effectDownloadProgress: id=");
                            sbLIZ.append(effect.getEffectId());
                            sbLIZ.append(" name=");
                            sbLIZ.append(effect.getName());
                            sbLIZ.append(" p=");
                            sbLIZ.append(i);
                            sbLIZ.append(" total=");
                            sbLIZ.append(j);
                            C564000MAc.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }, false, null));
                    return;
                }
                long jLIZ2 = this.LIZJ.LIZ();
                C573380MeG c573380MeG3 = this.LIZ;
                C573060Mdk c573060Mdk4 = c573380MeG3.LIZ;
                if (c573060Mdk4 != null) {
                    c573060Mdk4.LIZIZ = (int) jLIZ2;
                    c573060Mdk4.LJIIJ = "mv list pass error";
                    c573060Mdk4.LJIIIZ = 3;
                }
                InterfaceC573490MeR interfaceC573490MeR3 = c573380MeG3.LIZJ;
                if (interfaceC573490MeR3 == null) {
                    return;
                }
                interfaceC573490MeR3.onFailed();
            }
        };
        c573410MeJ.LIZIZ = c573400MeI;
        c573400MeI.LIZIZ = abstractC573460MeO;
        abstractC573460MeO.LIZIZ = abstractC573460MeO2;
        if (z) {
            AbstractC573460MeO abstractC573460MeO3 = new AbstractC573460MeO(str2, c573380MeG) { // from class: X.0MeB
                public final String LIZLLL;

                /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
                @Override // X.InterfaceC573280Me6
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ(java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 333
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C573330MeB.LIZ(java.lang.Object):void");
                }

                {
                    super(c573380MeG);
                    this.LIZLLL = str2;
                }
            };
            abstractC573460MeO3.LIZIZ = c573410MeJ;
            return abstractC573460MeO3;
        }
        return c573410MeJ;
    }

    public final C573420MeK LIZ(C573060Mdk c573060Mdk, MusicModel musicModel, InterfaceC573480MeQ interfaceC573480MeQ, List list, String str, Map map) {
        final C573380MeG c573380MeG = new C573380MeG(c573060Mdk, new WeakReference(this.LIZ), null, interfaceC573480MeQ, list, str, 960);
        c573380MeG.LJIIJJI = musicModel;
        c573380MeG.LJIILLIIL = map;
        C573420MeK c573420MeK = new C573420MeK(c573380MeG);
        c573420MeK.LIZIZ = new AbstractC573460MeO(c573380MeG) { // from class: X.0MeF
            @Override // X.InterfaceC573280Me6
            public final void LIZ(final Object obj) {
                this.LIZJ.LIZIZ();
                C573060Mdk c573060Mdk2 = this.LIZ.LIZ;
                if (c573060Mdk2 != null) {
                    c573060Mdk2.LJIIJJI = 4;
                }
                if (obj instanceof MusicModel) {
                    AVMusic aVMusicTransformMusicModel = C1403010mc7.LIZ.getMusicService().transformMusicModel((MusicModel) obj);
                    if (aVMusicTransformMusicModel == null) {
                        long jLIZ = this.LIZJ.LIZ();
                        C573380MeG c573380MeG2 = this.LIZ;
                        C573060Mdk c573060Mdk3 = c573380MeG2.LIZ;
                        if (c573060Mdk3 != null) {
                            c573060Mdk3.LJFF = (int) jLIZ;
                            c573060Mdk3.LJIIJ = "avmusic model null";
                            c573060Mdk3.LJIIIZ = 7;
                        }
                        InterfaceC573480MeQ interfaceC573480MeQ2 = c573380MeG2.LIZLLL;
                        if (interfaceC573480MeQ2 != null) {
                            interfaceC573480MeQ2.onFailed();
                            return;
                        }
                        return;
                    }
                    C573060Mdk c573060Mdk4 = this.LIZ.LIZ;
                    if (c573060Mdk4 != null) {
                        c573060Mdk4.LJI = aVMusicTransformMusicModel.getMusicId();
                    }
                    WeakReference<Activity> weakReference = this.LIZ.LIZIZ;
                    Activity activity = null;
                    if (weakReference != null && weakReference.get() != null) {
                        IAnotherMusicService iAnotherMusicService = o.LJI;
                        WeakReference<Activity> weakReference2 = this.LIZ.LIZIZ;
                        if (weakReference2 != null) {
                            activity = weakReference2.get();
                        }
                        iAnotherMusicService.LJ("mv_template", activity, aVMusicTransformMusicModel, 6, false, new InterfaceC1416880myU() { // from class: X.0MeM
                            @Override // X.InterfaceC1416880myU
                            public final void LIZJ(boolean z) {
                            }

                            @Override // X.InterfaceC1416880myU
                            public final void onProgress(int i) {
                            }

                            @Override // X.InterfaceC1416880myU
                            public final void onStart() {
                            }

                            @Override // X.InterfaceC1416880myU
                            public final void LIZ(Integer num, String str2) {
                                int iIntValue;
                                long jLIZ2 = this.LIZ.LIZJ.LIZ();
                                C573060Mdk c573060Mdk5 = this.LIZ.LIZ.LIZ;
                                if (c573060Mdk5 != null) {
                                    c573060Mdk5.LJFF = (int) jLIZ2;
                                    if (num != null) {
                                        iIntValue = num.intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                    c573060Mdk5.LJII = iIntValue;
                                }
                                C573380MeG c573380MeG3 = this.LIZ.LIZ;
                                C573060Mdk c573060Mdk6 = c573380MeG3.LIZ;
                                if (c573060Mdk6 != null) {
                                    c573060Mdk6.LJIIJ = str2;
                                    c573060Mdk6.LJIIIZ = 7;
                                }
                                InterfaceC573480MeQ interfaceC573480MeQ3 = c573380MeG3.LIZLLL;
                                if (interfaceC573480MeQ3 != null) {
                                    interfaceC573480MeQ3.onFailed();
                                }
                            }

                            @Override // X.InterfaceC1416880myU
                            public final void LIZIZ(String str2, MusicWaveBean musicWaveBean) {
                                long jLIZ2 = this.LIZ.LIZJ.LIZ();
                                C573380MeG c573380MeG3 = this.LIZ.LIZ;
                                C573060Mdk c573060Mdk5 = c573380MeG3.LIZ;
                                if (c573060Mdk5 != null) {
                                    c573060Mdk5.LJFF = (int) jLIZ2;
                                }
                                InterfaceC573480MeQ interfaceC573480MeQ3 = c573380MeG3.LIZLLL;
                                if (interfaceC573480MeQ3 != null) {
                                    interfaceC573480MeQ3.LIZ(false, (MusicModel) obj, str2);
                                }
                            }
                        }, false);
                        return;
                    }
                    long jLIZ2 = this.LIZJ.LIZ();
                    C573380MeG c573380MeG3 = this.LIZ;
                    C573060Mdk c573060Mdk5 = c573380MeG3.LIZ;
                    if (c573060Mdk5 != null) {
                        c573060Mdk5.LJFF = (int) jLIZ2;
                        c573060Mdk5.LJIIJ = "activity is null";
                        c573060Mdk5.LJIIIZ = 7;
                    }
                    InterfaceC573480MeQ interfaceC573480MeQ3 = c573380MeG3.LIZLLL;
                    if (interfaceC573480MeQ3 != null) {
                        interfaceC573480MeQ3.onFailed();
                        return;
                    }
                    return;
                }
                long jLIZ3 = this.LIZJ.LIZ();
                C573380MeG c573380MeG4 = this.LIZ;
                C573060Mdk c573060Mdk6 = c573380MeG4.LIZ;
                if (c573060Mdk6 != null) {
                    c573060Mdk6.LJFF = (int) jLIZ3;
                    c573060Mdk6.LJIIJ = "avmusic model type error";
                    c573060Mdk6.LJIIIZ = 7;
                }
                InterfaceC573480MeQ interfaceC573480MeQ4 = c573380MeG4.LIZLLL;
                if (interfaceC573480MeQ4 != null) {
                    interfaceC573480MeQ4.onFailed();
                }
            }
        };
        return c573420MeK;
    }

    public final void LIZJ(final String str, final InterfaceC573470MeP interfaceC573470MeP, final List list, final String str2, final String str3, final MusicModel musicModel, final C573060Mdk c573060Mdk, final boolean z, final String str4, final C573110Mdp c573110Mdp) {
        String str5;
        this.LIZLLL = false;
        try {
            C201955140j.LJIILIIL("PhotoMVNext", "{\"event\":\"effectDownloadStart\",\"timeLimitMs\":5000}");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LIZIZ.postDelayed(new ARunnableS41S0300000_8(this, c573060Mdk, interfaceC573470MeP, 8), Mp4ScreenVideoLoadTimeout.CONTROL);
        this.LJ = null;
        if (c573060Mdk != null) {
            str5 = c573060Mdk.LJIIIIZZ;
        } else {
            str5 = null;
        }
        LIZIZ(c573060Mdk, str5, str, true, new InterfaceC573490MeR(c573060Mdk, str, interfaceC573470MeP, list, str2, str3, musicModel, z, str4, c573110Mdp) { // from class: X.0Me8
            public final C573060Mdk LIZ;
            public final String LIZIZ;
            public final InterfaceC573470MeP LIZJ;
            public final List<String> LIZLLL;
            public final String LJ;
            public final String LJFF;
            public final MusicModel LJI;
            public final IPhotoPreDownloadMusic LJII = null;
            public final C573110Mdp LJIIIIZZ;

            @Override // X.InterfaceC573490MeR
            public final void onFailed() {
                String str6;
                C573060Mdk c573060Mdk2 = this.LIZ;
                int i = c573060Mdk2 != null ? c573060Mdk2.LJIIIZ : -1;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("error: ");
                C573060Mdk c573060Mdk3 = this.LIZ;
                sbLIZ.append(c573060Mdk3 != null ? c573060Mdk3.LJIIJ : null);
                sbLIZ.append(" isTimeOut: ");
                sbLIZ.append(this.LJIIIZ.LIZLLL);
                C0L16.LIZ(i, "mv_fail", C2188811AlT.LIZIZ(sbLIZ));
                if (!this.LJIIIZ.LIZLLL) {
                    try {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("{\"event\":\"mvFail\",\"panel\":\"");
                        sbLIZ2.append(this.LIZIZ);
                        sbLIZ2.append("\",\"failedStep\":");
                        C573060Mdk c573060Mdk4 = this.LIZ;
                        sbLIZ2.append(c573060Mdk4 != null ? c573060Mdk4.LJIIIZ : -1);
                        sbLIZ2.append(",\"reason\":\"");
                        C573060Mdk c573060Mdk5 = this.LIZ;
                        if (c573060Mdk5 == null || (str6 = c573060Mdk5.LJIIJ) == null) {
                            str6 = "";
                        }
                        sbLIZ2.append(str6);
                        sbLIZ2.append("\"}");
                        C201955140j.LJFF("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ2));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    InterfaceC573470MeP interfaceC573470MeP2 = this.LIZJ;
                    if (interfaceC573470MeP2 != null) {
                        interfaceC573470MeP2.onFailed();
                    }
                }
                this.LJIIIZ.LIZIZ.removeCallbacksAndMessages(null);
            }

            @Override // X.InterfaceC573490MeR
            public final void LIZ(MvThemeData mvThemeData) {
                boolean z2;
                int i;
                this.LJIIIZ.LJ = mvThemeData;
                String str6 = this.LIZIZ;
                C573360MeE c573360MeE = new C573360MeE();
                if (Intrinsics.LJFF("singlepiceffect", str6)) {
                    c573360MeE.LIZ(mvThemeData);
                } else if (Intrinsics.LJFF("slideshoweffect", str6)) {
                    c573360MeE.LIZIZ(mvThemeData);
                }
                try {
                    C573060Mdk c573060Mdk2 = this.LIZ;
                    if (c573060Mdk2 != null) {
                        i = c573060Mdk2.LIZIZ;
                    } else {
                        i = -1;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("{\"event\":\"mvSuccess\",\"panel\":\"");
                    sbLIZ.append(this.LIZIZ);
                    sbLIZ.append("\",\"downloadTime\":");
                    sbLIZ.append(i);
                    sbLIZ.append('}');
                    C201955140j.LJIILIIL("PhotoMvGoNext", C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                C0L16.LIZ(0, "mv_success", "");
                C573310Me9 c573310Me9 = this.LJIIIZ;
                C573060Mdk c573060Mdk3 = this.LIZ;
                InterfaceC573470MeP interfaceC573470MeP2 = this.LIZJ;
                List<String> list2 = this.LIZLLL;
                String str7 = this.LJ;
                String str8 = this.LJFF;
                MusicModel musicModel2 = this.LJI;
                IPhotoPreDownloadMusic iPhotoPreDownloadMusic = this.LJII;
                C573110Mdp c573110Mdp2 = this.LJIIIIZZ;
                c573310Me9.getClass();
                int i2 = c573110Mdp2.LIZ;
                InterfaceC573480MeQ interfaceC573480MeQ = new InterfaceC573480MeQ(interfaceC573470MeP2, mvThemeData, c573060Mdk3) { // from class: X.0Me7
                    public final InterfaceC573470MeP LIZ;
                    public final MvThemeData LIZIZ;
                    public final C573060Mdk LIZJ;

                    @Override // X.InterfaceC573480MeQ
                    public final void onFailed() {
                        if (!this.LIZLLL.LIZLLL) {
                            try {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("{\"event\":\"musicFail\",\"errorCode\":");
                                C573060Mdk c573060Mdk4 = this.LIZJ;
                                sbLIZ2.append(c573060Mdk4 != null ? c573060Mdk4.LJII : -1);
                                sbLIZ2.append('}');
                                C201955140j.LJIJ("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ2));
                                C573060Mdk c573060Mdk5 = this.LIZJ;
                                C0L16.LIZ(c573060Mdk5 != null ? c573060Mdk5.LJII : -1, "music_fail", "");
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                            InterfaceC573470MeP interfaceC573470MeP3 = this.LIZ;
                            if (interfaceC573470MeP3 != null) {
                                interfaceC573470MeP3.LIZ(this.LIZIZ, null, null, false, false);
                            }
                        }
                        C573060Mdk c573060Mdk6 = this.LIZJ;
                        C0L16.LIZ(c573060Mdk6 != null ? c573060Mdk6.LJII : -1, "music_fail_timeout", "");
                        this.LIZLLL.LIZIZ.removeCallbacksAndMessages(null);
                    }

                    @Override // X.InterfaceC573480MeQ
                    public final void LIZ(boolean z3, MusicModel musicModel3, String str9) {
                        int i3;
                        int i4 = -1;
                        if (!this.LIZLLL.LIZLLL) {
                            try {
                                C573060Mdk c573060Mdk4 = this.LIZJ;
                                if (c573060Mdk4 != null) {
                                    i3 = c573060Mdk4.LJFF;
                                } else {
                                    i3 = -1;
                                }
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("{\"event\":\"musicSuccess\",\"downloadTime\":");
                                sbLIZ2.append(i3);
                                sbLIZ2.append(",\"isOutside\":");
                                sbLIZ2.append(z3);
                                sbLIZ2.append('}');
                                C201955140j.LJIILIIL("PhotoMVNext", C2188811AlT.LIZIZ(sbLIZ2));
                                C0L16.LIZ(0, "music_success", "");
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                            }
                            InterfaceC573470MeP interfaceC573470MeP3 = this.LIZ;
                            if (interfaceC573470MeP3 != null) {
                                interfaceC573470MeP3.LIZ(this.LIZIZ, musicModel3, str9, z3, false);
                            }
                        }
                        C573060Mdk c573060Mdk5 = this.LIZJ;
                        if (c573060Mdk5 != null) {
                            i4 = c573060Mdk5.LJII;
                        }
                        C0L16.LIZ(i4, "music_success_timeout", "");
                        this.LIZLLL.LIZIZ.removeCallbacksAndMessages(null);
                    }

                    {
                        this.LIZ = interfaceC573470MeP2;
                        this.LIZIZ = mvThemeData;
                        this.LIZJ = c573060Mdk3;
                    }
                };
                final C573380MeG c573380MeG = new C573380MeG(c573060Mdk3, new WeakReference(c573310Me9.LIZ), null, interfaceC573480MeQ, list2, str7, null, str8, musicModel2, new WeakReference(c573310Me9.LIZJ));
                c573380MeG.LJIILIIL = iPhotoPreDownloadMusic;
                boolean z3 = true;
                if (i2 == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c573380MeG.LJIILJJIL = z2;
                if (i2 != 2) {
                    z3 = false;
                }
                c573380MeG.LJIILL = z3;
                AbstractC573460MeO abstractC573460MeO = new AbstractC573460MeO(c573380MeG) { // from class: X.0MeA
                    @Override // X.InterfaceC573280Me6
                    public final void LIZ(Object obj) {
                        IPreDownloadMusic iPreDownloadMusic;
                        this.LIZJ.LIZIZ();
                        C573380MeG c573380MeG2 = this.LIZ;
                        C573060Mdk c573060Mdk4 = c573380MeG2.LIZ;
                        if (c573060Mdk4 != null) {
                            c573060Mdk4.LJIIJJI = 4;
                        }
                        if (c573380MeG2.LJIIIIZZ != null && !TextUtils.isEmpty(c573380MeG2.LJII) && C2286708xd.LIZJ(this.LIZ.LJII)) {
                            long jLIZ = this.LIZJ.LIZ();
                            C573380MeG c573380MeG3 = this.LIZ;
                            C573060Mdk c573060Mdk5 = c573380MeG3.LIZ;
                            if (c573060Mdk5 != null) {
                                c573060Mdk5.LJFF = (int) jLIZ;
                            }
                            InterfaceC573480MeQ interfaceC573480MeQ2 = c573380MeG3.LIZLLL;
                            if (interfaceC573480MeQ2 != null) {
                                MusicModel musicModel3 = c573380MeG3.LJIIIIZZ;
                                if (musicModel3 != null) {
                                    String str9 = c573380MeG3.LJII;
                                    if (str9 != null) {
                                        interfaceC573480MeQ2.LIZ(true, musicModel3, str9);
                                        return;
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            return;
                        }
                        C573380MeG c573380MeG4 = this.LIZ;
                        if (c573380MeG4.LJIILL) {
                            InterfaceC573480MeQ interfaceC573480MeQ3 = c573380MeG4.LIZLLL;
                            if (interfaceC573480MeQ3 != null) {
                                MusicModel musicModel4 = new MusicModel();
                                musicModel4.setId(Long.MIN_VALUE);
                                interfaceC573480MeQ3.LIZ(false, musicModel4, "");
                                return;
                            }
                            return;
                        }
                        WeakReference<IPreDownloadMusic> weakReference = c573380MeG4.LJIIIZ;
                        if (weakReference != null && (iPreDownloadMusic = weakReference.get()) != null && (((!C2538909xD.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_recommend_music_with_frame_multi_picture", true) == 0 && !C2538909xD.LIZIZ()) || C0L5K.LIZ()) && !C0L0Y.LIZ())) {
                            IPreDownloadMusic.PreDownloadMusicData preDownloadMusicData = iPreDownloadMusic.getPreDownloadMusicData();
                            if (preDownloadMusicData.isDataValid()) {
                                long jLIZ2 = this.LIZJ.LIZ();
                                C573380MeG c573380MeG5 = this.LIZ;
                                C573060Mdk c573060Mdk6 = c573380MeG5.LIZ;
                                if (c573060Mdk6 != null) {
                                    c573060Mdk6.LJFF = (int) jLIZ2;
                                }
                                InterfaceC573480MeQ interfaceC573480MeQ4 = c573380MeG5.LIZLLL;
                                if (interfaceC573480MeQ4 != null) {
                                    MusicModel musicModel5 = preDownloadMusicData.getMusicModel();
                                    if (musicModel5 != null) {
                                        String musicFile = preDownloadMusicData.getMusicFile();
                                        if (musicFile != null) {
                                            interfaceC573480MeQ4.LIZ(false, musicModel5, musicFile);
                                            return;
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                return;
                            }
                        }
                        C573380MeG c573380MeG6 = this.LIZ;
                        if (c573380MeG6.LJIILJJIL) {
                            InterfaceC573480MeQ interfaceC573480MeQ5 = c573380MeG6.LIZLLL;
                            if (interfaceC573480MeQ5 != null) {
                                MusicModel musicModel6 = new MusicModel();
                                musicModel6.setId(Long.MIN_VALUE);
                                interfaceC573480MeQ5.LIZ(false, musicModel6, "");
                                return;
                            }
                            return;
                        }
                        AbstractC573460MeO abstractC573460MeO2 = this.LIZIZ;
                        if (abstractC573460MeO2 != null) {
                            abstractC573460MeO2.LIZ(null);
                        }
                    }
                };
                abstractC573460MeO.LIZIZ = c573310Me9.LIZ(c573060Mdk3, null, interfaceC573480MeQ, list2, str7, c573110Mdp2.LIZIZ);
                abstractC573460MeO.LIZ(null);
            }

            {
                this.LIZ = c573060Mdk;
                this.LIZIZ = str;
                this.LIZJ = interfaceC573470MeP;
                this.LIZLLL = list;
                this.LJ = str2;
                this.LJFF = str3;
                this.LJI = musicModel;
                this.LJIIIIZZ = c573110Mdp;
            }
        }).LIZ(null);
    }
}
