package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nRI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434740nRI extends AbstractC1434920nRa {
    public final C1404610meh LIZJ;
    public final InterfaceC1434300nQa LIZLLL;
    public final Executor LJ;
    public C1D80 LJFF;
    public final C1434960nRe LJI;
    public final C1434970nRf LJII;
    public final C1404570med LJIIIIZZ;
    public AbstractC1433570nPP LJIIIZ;

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return true;
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DetachedWatermarkPublisher] initPublisher publishId=");
        sbLIZ.append(this.LJIIIIZZ.LIZ);
        sbLIZ.append(" isSaveLocal=");
        sbLIZ.append(this.LJI.LIZ.isSaveLocal());
        sbLIZ.append(" watermarkModeration=");
        sbLIZ.append(C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_after_moderation", true, false) && this.LJI.LIZ.isSaveLocalWithWaterMark());
        sbLIZ.append(" autoAIGC=");
        sbLIZ.append(C0L1C.LIZ());
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1D82 c1d82 = new C1D82(AFwS210S0000000_22.get$arr$(506), EnumC1434770nRL.INDEPENDENT_WATERMARK_COMPILE);
        c1d82.LJIIJ = C1433780nPk.LIZ;
        C1D82 c1d822 = new C1D82(AFwS210S0000000_22.get$arr$(505), EnumC1434770nRL.WAIT_CLICK_PUBLISH);
        VideoPublishEditModel videoPublishEditModel = this.LJI.LIZ;
        EnableParallelPublishSchedulerV2Exp.Config configLIZ = EnableParallelPublishSchedulerV2Exp.LIZ();
        if (configLIZ.enable && configLIZ.watermarkDetachEnable && configLIZ.watermarkWaitClickPublish) {
            C201955140j.LIZIZ("DetachWaterMark", "[WatermarkGraph] detached watermarkReady depend waitClickPublish (delay-until-click enabled)");
            c1d82.LIZ(c1d822);
        }
        C1434850nRT.LIZ(videoPublishEditModel, c1d82, c1d822, null);
        C1440550naf c1440550naf = new C1440550naf("DetachedWatermarkPublisher", c1d82, c1d822);
        ArrayList arrayList = (ArrayList) c1440550naf.LIZLLL;
        arrayList.add(this.LJI);
        arrayList.add(this.LJII);
        Iterator<Object> it2 = this.LIZJ.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1405220mfg) {
                if (next != null) {
                    arrayList.add(next);
                    arrayList.add(this.LJIIIIZZ);
                    Iterator<Object> it3 = this.LIZJ.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1404770mex) {
                            if (next2 != null) {
                                arrayList.add(next2);
                                arrayList.add(this.LIZLLL);
                                Iterator<Object> it4 = this.LIZJ.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof SynthetiseResult) {
                                        if (next3 != null) {
                                            arrayList.add(next3);
                                            c1440550naf.LJII = new C1435280nSA(this.LJ);
                                            this.LIZLLL.LJFF();
                                            c1440550naf.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
                                            this.LIZLLL.LJFF();
                                            c1440550naf.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
                                            C1D80 c1d80LIZ = c1440550naf.LIZ();
                                            this.LJFF = c1d80LIZ;
                                            C575070Mgz.LIZ(c1d80LIZ, new AwS601S0100000_22(this, 904));
                                            return;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.SynthetiseResult");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.story.AuthKeyResult");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.normal.ClickPublishWaiter");
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DetachedWatermarkPublisher] reStart publishId=");
        sbLIZ.append(this.LJIIIIZZ.LIZ);
        sbLIZ.append(" netState=");
        C1D80 c1d80 = this.LJFF;
        sbLIZ.append(c1d80 != null ? String.valueOf(c1d80.LIZJ()) : "uninit");
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1D80 c1d802 = this.LJFF;
        if ((c1d802 != null ? c1d802.LIZJ() : null) instanceof C1D8S) {
            LIZ();
        }
        C1D80 c1d803 = this.LJFF;
        if (c1d803 != null) {
            c1d803.LJII();
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DetachedWatermarkPublisher] cancel publishId=");
        sbLIZ.append(this.LJIIIIZZ.LIZ);
        sbLIZ.append(" cause=");
        sbLIZ.append(c1433230nOr.LIZ);
        sbLIZ.append(" netInitialized=");
        if (this.LJFF != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        C1D80 c1d80 = this.LJFF;
        if (c1d80 != null) {
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJIIIZ = abstractC1433570nPP;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[DetachedWatermarkPublisher] start publishId=");
        sbLIZ.append(this.LJIIIIZZ.LIZ);
        C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ));
        try {
            LIZ();
            C1D80 c1d80 = this.LJFF;
            if (c1d80 != null) {
                c1d80.LJII();
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[DetachedWatermarkPublisher] start net.start() done publishId=");
            sbLIZ2.append(this.LJIIIIZZ.LIZ);
            C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ2));
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[DetachedWatermarkPublisher] start FAILED publishId=");
            sbLIZ3.append(this.LJIIIIZZ.LIZ);
            sbLIZ3.append(" msg=");
            sbLIZ3.append(e.getMessage());
            C201955140j.LIZIZ("DetachWaterMark", C2188811AlT.LIZIZ(sbLIZ3));
            C1AF0.LJFF(new Throwable(), "DetachedWatermarkPublisher record task is null");
        }
    }

    public C1434740nRI(C1404610meh c1404610meh, C1434310nQb c1434310nQb, Executor executor) {
        super(c1434310nQb);
        this.LIZJ = c1404610meh;
        this.LIZLLL = c1434310nQb;
        this.LJ = executor;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    this.LJI = (C1434960nRe) next;
                    Iterator<Object> it3 = this.LIZJ.LIZ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (next2 instanceof C1434970nRf) {
                            if (next2 != null) {
                                this.LJII = (C1434970nRf) next2;
                                Iterator<Object> it4 = this.LIZJ.LIZ.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Object next3 = it4.next();
                                    if (next3 instanceof C1404570med) {
                                        if (next3 != null) {
                                            this.LJIIIIZZ = (C1404570med) next3;
                                            return;
                                        }
                                    }
                                }
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishId");
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.PublishModelContainer");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
