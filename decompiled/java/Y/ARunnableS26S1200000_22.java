package Y;

import X.AbstractC1433190nOn;
import X.AbstractC1433460nPE;
import X.C0CHQ;
import X.C1431840nMc;
import X.C1432260nNI;
import X.C1433210nOp;
import X.C1433220nOq;
import X.C1433450nPD;
import X.C1433490nPH;
import X.C1433530nPL;
import X.C1433600nPS;
import X.C1433730nPf;
import X.C1440005kM;
import X.C19EG;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C492390JSr;
import X.C830690WiJ;
import X.InterfaceRunnableC1433480nPG;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.social.sendtodm.SendToDMComponent;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS26S1200000_22 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ((SendToDMComponent) this.l1).JY0().RF0();
        VideoPublishEditModel videoPublishEditModelClone = ((SendToDMComponent) this.l1).m3().clone();
        C1432260nNI.LIZ(((SendToDMComponent) this.l1).m3());
        videoPublishEditModelClone.creativeModel.dmMediaModel = new DMMediaModel(2, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(videoPublishEditModelClone.getCreativeInfo()), "", "", false, true, true, null);
        IMMediaPublishEvent.DMRecordMediaPublishEvent dMRecordMediaPublishEventX1 = ((SendToDMComponent) this.l1).X1(new IMMediaPublishEvent.DMRecordMediaPublishEvent("", videoPublishEditModelClone, true, false, null, null, false, !r1.m3().creativeModel.stickerModel.textStickerModels.isEmpty(), this.s0, null, null, false, false, false, (Map) this.l2), videoPublishEditModelClone);
        ((SendToDMComponent) this.l1).uu("update photo publish event");
        C1440005kM.LIZIZ(new C1431840nMc(dMRecordMediaPublishEventX1));
        ((SendToDMComponent) this.l1).v3();
    }

    public final void LIZ$1() {
        InterfaceRunnableC1433480nPG interfaceRunnableC1433480nPG;
        ((C1433530nPL) this.l1).LIZ = (PublishModel) this.l2;
        AbstractC1433190nOn abstractC1433190nOn = ((C1433530nPL) this.l1).LIZLLL;
        if (abstractC1433190nOn instanceof C1433220nOq) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ReStartNewPublish ");
            sbLIZ.append(this.s0);
            C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!(abstractC1433190nOn instanceof C1433210nOp)) {
            if (!(abstractC1433190nOn instanceof C1433490nPH) || (interfaceRunnableC1433480nPG = ((C1433530nPL) this.l1).LJI) == null) {
                return;
            }
            interfaceRunnableC1433480nPG.reStart();
            return;
        }
        AbstractC1433460nPE abstractC1433460nPE = ((C1433210nOp) abstractC1433190nOn).LIZ;
        if (abstractC1433460nPE instanceof C492390JSr) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("ReStartAlreadySuccessPublish ");
            sbLIZ2.append(this.s0);
            C1433730nPf.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (abstractC1433460nPE instanceof C1433600nPS) {
            C1433730nPf c1433730nPf = C1433730nPf.LIZ;
            PublishModel publishModel = (PublishModel) this.l2;
            c1433730nPf.getClass();
            String strLJJIII = C1433730nPf.LJJIII(publishModel, null, null);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("PublishScheduler | reStart Cancel Publish, reStart new. old:");
            sbLIZ3.append(this.s0);
            sbLIZ3.append(" new:");
            sbLIZ3.append(strLJJIII);
            C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        if (abstractC1433460nPE instanceof C1433450nPD) {
            C1433730nPf c1433730nPf2 = C1433730nPf.LIZ;
            PublishModel publishModel2 = (PublishModel) this.l2;
            c1433730nPf2.getClass();
            String strLJJIII2 = C1433730nPf.LJJIII(publishModel2, null, null);
            C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("PublishScheduler | reStart Failed Publish, reStart new. old:");
            sbLIZ4.append(this.s0);
            sbLIZ4.append(" new:");
            sbLIZ4.append(strLJJIII2);
            C201955140j.LIZJ(c830690WiJ2, C2188811AlT.LIZIZ(sbLIZ4));
        }
    }

    public static final void run$0(ARunnableS26S1200000_22 aRunnableS26S1200000_22) {
        boolean zLIZ;
        C1C7U.LIZ("ToolsActivityAssem@6e7.tryProcessPublish$1");
        try {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().showPublishRecoverViewForCCPublish((C19EG) aRunnableS26S1200000_22.l1, aRunnableS26S1200000_22.s0, (PublishFailMsg) aRunnableS26S1200000_22.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolsActivityAssem@6e7.tryProcessPublish$1");
    }

    public static final void run$1(ARunnableS26S1200000_22 aRunnableS26S1200000_22) {
        boolean zLIZ;
        C1C7U.LIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$2");
        try {
            aRunnableS26S1200000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SendToDMComponent@496a.tryCreateStickyMessageEvent$2");
    }

    public static final void run$2(ARunnableS26S1200000_22 aRunnableS26S1200000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.startPublish$1$1");
        try {
            aRunnableS26S1200000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.startPublish$1$1");
    }

    public ARunnableS26S1200000_22(C1433530nPL c1433530nPL, PublishModel publishModel, int i) {
        this.$t = i;
        this.l1 = c1433530nPL;
        this.l2 = publishModel;
        this.s0 = null;
    }

    public ARunnableS26S1200000_22(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
