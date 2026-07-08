package X;

import Y.ARunnableS122S0100000_22;
import Y.ARunnableS55S0300000_22;
import Y.ARunnableS91S0200000_22;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModelKt;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433500nPI implements InterfaceRunnableC1433480nPG {
    public final InterfaceC1433590nPR LL;
    public final C1433660nPY LLILLJJLI;
    public final C1433740nPg LLILLL;
    public final Executor LLILZ;
    public final C1433530nPL LLILZIL;
    public final C1433350nP3 LLILZLL;
    public InterfaceC1433580nPQ LLIZ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final C1433330nP1 LLJILJILJ;
    public volatile boolean LLJILLL;
    public final List<AbstractC1433570nPP> LLIZLLLIL = new ArrayList();
    public final ExecutorC1592406Li LLJ = C576120Mig.LIZJ;
    public final C1430790nKv LLJILJIL = new C1430790nKv();

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJL() {
        C1433330nP1 c1433330nP1 = this.LLJILJILJ;
        PublishModel publishModel = this.LLILZIL.LIZ;
        c1433330nP1.LIZIZ("updateModel");
        c1433330nP1.LIZ = publishModel;
        this.LLJ.execute(new ARunnableS122S0100000_22(this, 119));
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final boolean LLIIIL() {
        InterfaceC1433580nPQ interfaceC1433580nPQ = this.LLIZ;
        return interfaceC1433580nPQ != null && interfaceC1433580nPQ.LJIJ();
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void reStart() {
        this.LLILZLL.LIZIZ("reStart");
        InterfaceC1433580nPQ interfaceC1433580nPQ = this.LLIZ;
        if (interfaceC1433580nPQ != null) {
            interfaceC1433580nPQ.reStart();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("PublishTask@7c51.run");
        AbstractC1433190nOn abstractC1433190nOn = this.LLILZIL.LIZLLL;
        abstractC1433190nOn.getClass();
        if (!((abstractC1433190nOn instanceof C1433210nOp) && (((C1433210nOp) abstractC1433190nOn).LIZ instanceof C1433420nPA))) {
            AbstractC1433190nOn abstractC1433190nOn2 = this.LLILZIL.LIZLLL;
            abstractC1433190nOn2.getClass();
            if (!(abstractC1433190nOn2 instanceof C1433210nOp) || !(((C1433210nOp) abstractC1433190nOn2).LIZ instanceof C1433430nPB)) {
                AbstractC1433190nOn abstractC1433190nOn3 = this.LLILZIL.LIZLLL;
                abstractC1433190nOn3.getClass();
                if ((abstractC1433190nOn3 instanceof C1433210nOp) && (((C1433210nOp) abstractC1433190nOn3).LIZ instanceof C1433470nPF) && this.LLILZIL.LJIIIIZZ && ((Boolean) C263270ATl.LIZ.getValue()).booleanValue()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("the PublishTask[taskId:");
                    sbLIZ.append(this.LLILZIL.LIZIZ);
                    sbLIZ.append("] is cancelled when records full.");
                    C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C1C7U.LIZIZ("PublishTask@7c51.run");
                    return;
                }
                if (!this.LLILZIL.LIZ.isEditSave && !this.LLILZIL.LIZ.LIZ) {
                    C1436310nTp.LIZ.LIZ(((VideoPublishEditModel) this.LLILZIL.LIZ.editModel).creativeModel.editSaveLocalModel.flowId);
                }
                this.LLILZIL.LIZ(new C1433490nPH(0, null));
                InterfaceC1433590nPR interfaceC1433590nPR = this.LL;
                C1433530nPL c1433530nPL = this.LLILZIL;
                InterfaceC1433580nPQ interfaceC1433580nPQLIZ = interfaceC1433590nPR.LIZ(c1433530nPL, c1433530nPL.LIZIZ, this.LLJILJIL);
                this.LLIZ = interfaceC1433580nPQLIZ;
                if (interfaceC1433580nPQLIZ == null) {
                    throw new NullPointerException("publisher is null");
                }
                if (!C0BJ5.LIZ()) {
                    C140D.LIZ.LJJIIJ(false);
                }
                this.LLILZLL.LIZIZ("start");
                InterfaceC1433580nPQ interfaceC1433580nPQ = this.LLIZ;
                if (interfaceC1433580nPQ != null) {
                    interfaceC1433580nPQ.LJIIZILJ(new C1433510nPJ(this));
                }
                BaseShortVideoContext baseShortVideoContext = this.LLILZIL.LIZ.editModel;
                if (baseShortVideoContext instanceof VideoPublishEditModel) {
                    VideoPublishEditModelKt videoPublishEditModelKt = (VideoPublishEditModelKt) baseShortVideoContext;
                    videoPublishEditModelKt.setOpenForegroundPublish(false);
                    videoPublishEditModelKt.setBackgroundPublish(false);
                }
                final C1433560nPO c1433560nPO = new C1433560nPO(this);
                if (!this.LLILZIL.LIZ.LIZ && !this.LLILZIL.LIZ.LIZIZ) {
                    SettingsManager.LIZLLL().getClass();
                    if (SettingsManager.LIZ("enable_foreground_publish", true) && !C1433650nPX.LIZ()) {
                        if (C1433650nPX.LIZ() || Build.VERSION.SDK_INT >= 31) {
                            LJZI(new AbstractC1433570nPP() { // from class: X.0nQ8
                                public boolean LIZ;
                                public boolean LIZIZ;
                                public final C1434000nQ6 LIZJ;

                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v0, types: [X.0nQ6, X.12Az] */
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
                                {
                                    ?? r0 = new C1434040nQA() { // from class: X.0nQ6
                                        @Override // X.C1434040nQA, X.InterfaceC19713512Az
                                        public final void onAppBackground() {
                                            if (c1433560nPO.LIZ.LLILZIL.LIZ.publishType != 0) {
                                                return;
                                            }
                                            c1433560nPO.LIZ(true);
                                        }
                                    };
                                    this.LIZJ = r0;
                                    C19713312Ax c19713312Ax = C19712912At.LIZ;
                                    c19713312Ax.LJ(r0);
                                    if (this.LIZLLL.LIZ.LLILZIL.LIZ.publishType == 0) {
                                        if (!C1433650nPX.LIZ()) {
                                            C1444780nhU.LIZIZ();
                                            boolean z = true;
                                            this.LIZIZ = true;
                                            try {
                                                C1439040nYE c1439040nYE = C1439040nYE.LIZ;
                                                String str = this.LIZLLL.LIZ.LLILZIL.LIZIZ;
                                                c1439040nYE.getClass();
                                                C1439040nYE.LIZIZ(str);
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                z = false;
                                            }
                                            this.LIZ = z;
                                        }
                                        this.LIZLLL.LIZ(c19713312Ax.LIZJ());
                                    }
                                }

                                @Override // X.AbstractC1433570nPP
                                public final void onProgress(int i, Object obj) {
                                    if (this.LIZLLL.LIZ.LLILZIL.LIZ.publishType != 0) {
                                        return;
                                    }
                                    if (!C1433650nPX.LIZ()) {
                                        boolean z = true;
                                        if (!this.LIZIZ) {
                                            C1444780nhU.LIZIZ();
                                            this.LIZIZ = true;
                                        }
                                        if (!this.LIZ) {
                                            C1433560nPO c1433560nPO2 = this.LIZLLL;
                                            c1433560nPO2.getClass();
                                            try {
                                                C1439040nYE c1439040nYE = C1439040nYE.LIZ;
                                                String str = c1433560nPO2.LIZ.LLILZIL.LIZIZ;
                                                c1439040nYE.getClass();
                                                C1439040nYE.LIZIZ(str);
                                            } catch (Exception e) {
                                                TryCatchGuardChecker.doCheck(e);
                                                z = false;
                                            }
                                            this.LIZ = z;
                                        }
                                    }
                                    this.LIZLLL.LIZ(C19712912At.LIZ.LIZJ());
                                }

                                @Override // X.AbstractC1433570nPP
                                public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
                                    C19712912At.LIZ.LJFF(this.LIZJ);
                                }
                            });
                        } else {
                            LJZI(new C1434030nQ9(c1433560nPO));
                        }
                    }
                }
                SettingsManager.LIZLLL().getClass();
                if (!SettingsManager.LIZ("enable_foreground_publish", true)) {
                    LJZI(new C1434010nQ7(this));
                }
                this.LLJ.execute(new ARunnableS122S0100000_22(this, 120));
                C1C7U.LIZIZ("PublishTask@7c51.run");
                return;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("the PublishTask[taskId:");
        sbLIZ2.append(this.LLILZIL.LIZIZ);
        sbLIZ2.append("] is cancelled when starting to schedule");
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        C1C7U.LIZIZ("PublishTask@7c51.run");
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishParallel PublishTask(");
        sbLIZ.append(this.LLILZIL.LIZIZ);
        sbLIZ.append(") invoke mark record");
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1433580nPQ interfaceC1433580nPQ = this.LLIZ;
        if (interfaceC1433580nPQ != null) {
            interfaceC1433580nPQ.LJI();
        }
    }

    public final void LIZ(Function1<? super AbstractC1433570nPP, Unit> function1) {
        if (((ArrayList) this.LLIZLLLIL).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.LLIZLLLIL);
        this.LLJ.execute(new ARunnableS55S0300000_22(arrayList, function1, this, 11));
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJIILL(C1433230nOr c1433230nOr) {
        AbstractC1433460nPE c1433430nPB;
        if (this.LLJI) {
            return;
        }
        this.LLJI = true;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("invoke_type", "realStopPublish");
        C20684815ws.LJIILLIIL("publish_service_cancel", c0lab.LIZ);
        InterfaceC1433580nPQ interfaceC1433580nPQ = this.LLIZ;
        if (interfaceC1433580nPQ != null) {
            interfaceC1433580nPQ.LJIILL(c1433230nOr);
        }
        if (this.LLJIJIL) {
            c1433430nPB = new C1433410nP9(new C1430810nKx(new Throwable("cancel_by_click_cover")));
        } else if (Intrinsics.LJFF(c1433230nOr.LIZ, "discard")) {
            C1434650nR9 c1434650nR9 = new C1434650nR9(new Throwable("discard by user"));
            c1434650nR9.setDiscard(true);
            c1433430nPB = new C1433440nPC(c1434650nR9);
        } else if (Intrinsics.LJFF(c1433230nOr.LIZ, "cancel_by_group")) {
            c1433430nPB = new C1433420nPA(c1433230nOr);
        } else if (Intrinsics.LJFF(c1433230nOr.LIZ, "cancel_last_task_while_adding")) {
            c1433430nPB = new AbstractC1433460nPE() { // from class: X.0nPF
                public final String toString() {
                    return "cancel_last_task_while_adding";
                }
            };
        } else if (Intrinsics.LJFF(c1433230nOr.LIZ, "cancel_by_wave_net_timeout")) {
            c1433430nPB = new C1433430nPB(c1433230nOr);
        } else {
            c1433430nPB = C1433600nPS.LIZ;
        }
        C1433530nPL c1433530nPL = this.LLILZIL;
        c1433530nPL.getClass();
        c1433530nPL.LIZ(new C1433210nOp(c1433430nPB, null));
        c1433530nPL.LJFF = SystemClock.uptimeMillis();
        c1433530nPL.LJI = null;
        if (!this.LLJIJIL && !c1433230nOr.LIZIZ && !Intrinsics.LJFF(c1433230nOr.LIZ, "cancel_by_group") && !Intrinsics.LJFF(c1433230nOr.LIZ, "cancel_by_wave_net_timeout")) {
            LIZ(new AwS388S0200000_22(c1433430nPB, this, 282));
        } else {
            this.LLILLL.LJIIIZ(this.LLILZIL);
            LIZ(new AwS388S0200000_22(c1433430nPB, this, 281));
            ((ArrayList) this.LLIZLLLIL).clear();
        }
        C1433660nPY c1433660nPY = this.LLILLJJLI;
        String str = this.LLILZIL.LIZIZ;
        synchronized (c1433660nPY) {
            c1433660nPY.LJ.remove(str);
        }
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJJIZ(InterfaceC1433360nP4<CreateBaseAwemeResponse> interfaceC1433360nP4) {
        List<AbstractC1433570nPP> list = this.LLIZLLLIL;
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(interfaceC1433360nP4, (InterfaceC1433360nP4<CreateBaseAwemeResponse>) 839);
        ListIterator<AbstractC1433570nPP> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (((Boolean) awS601S0100000_22.invoke(listIterator.next())).booleanValue()) {
                listIterator.remove();
            }
        }
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJJLL(AbstractC1433570nPP abstractC1433570nPP) {
        this.LLIZLLLIL.remove(abstractC1433570nPP);
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJLJJLL(String str) {
        this.LLILZLL.LIZIZ(str);
    }

    @Override // X.InterfaceRunnableC1433480nPG
    public final void LJZI(AbstractC1433570nPP abstractC1433570nPP) {
        if (((ArrayList) this.LLIZLLLIL).contains(abstractC1433570nPP)) {
            return;
        }
        ((ArrayList) this.LLIZLLLIL).add(abstractC1433570nPP);
        AbstractC1433190nOn abstractC1433190nOn = this.LLILZIL.LIZLLL;
        if ((abstractC1433190nOn instanceof C1433490nPH) && ((C1433490nPH) abstractC1433190nOn).LIZ > 0) {
            this.LLJ.execute(new ARunnableS91S0200000_22(abstractC1433570nPP, abstractC1433190nOn, 39));
        }
    }

    public C1433500nPI(PublishModel publishModel, C1434140nQK c1434140nQK, C1433660nPY c1433660nPY, C1433740nPg c1433740nPg, Executor executor) {
        CreativeToolsPluginService creativeToolsPluginService;
        this.LL = c1434140nQK;
        this.LLILLJJLI = c1433660nPY;
        this.LLILLL = c1433740nPg;
        C1433530nPL c1433530nPL = new C1433530nPL(publishModel, this);
        this.LLILZIL = c1433530nPL;
        this.LLILZ = executor;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler");
        sbLIZ.append("-PublishTask-");
        sbLIZ.append(c1433530nPL.LIZIZ);
        this.LLILZLL = new C1433350nP3(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ = new C1433330nP1(c1433530nPL.LIZ);
        if (!c1433530nPL.LIZ.skipVEPluginCheck && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            creativeToolsPluginService.LIZ();
        }
    }

    public C1433500nPI(C1434140nQK c1434140nQK, C1433660nPY c1433660nPY, C1433530nPL c1433530nPL, C1433740nPg c1433740nPg, Executor executor) {
        CreativeToolsPluginService creativeToolsPluginService;
        this.LL = c1434140nQK;
        this.LLILLJJLI = c1433660nPY;
        this.LLILLL = c1433740nPg;
        this.LLILZIL = c1433530nPL;
        this.LLILZ = executor;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishScheduler");
        sbLIZ.append("-PublishTask-");
        sbLIZ.append(c1433530nPL.LIZIZ);
        this.LLILZLL = new C1433350nP3(C2188811AlT.LIZIZ(sbLIZ));
        this.LLJILJILJ = new C1433330nP1(c1433530nPL.LIZ);
        if (!c1433530nPL.LIZ.skipVEPluginCheck && (creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null) {
            creativeToolsPluginService.LIZ();
        }
    }
}
