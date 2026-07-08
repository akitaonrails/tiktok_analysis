package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;

/* JADX INFO: renamed from: X.0nRM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434780nRM extends AbstractC1434920nRa {
    public final C1433530nPL LIZJ;
    public final String LIZLLL;
    public final InterfaceC1434300nQa LJ;
    public volatile C1D80 LJFF;
    public volatile boolean LJI;
    public final C1434960nRe LJII;
    public AbstractC1433570nPP LJIIIIZZ;
    public final C01GW LJIIIZ;

    public final void LIZIZ() {
        C1D82 c1d82;
        C1440550naf c1440550nafLIZ;
        ArrayList arrayListLJ;
        this.LIZJ.LIZ.publishId = this.LIZJ.LIZIZ;
        boolean zLJJLIIIJLLLLLLLZ = C1428470nHB.LJJLIIIJLLLLLLLZ(this.LJII.LIZ);
        EnumC1434770nRL enumC1434770nRL = EnumC1434770nRL.COMPILE;
        C1D82 c1d822 = new C1D82(new AwS566S0100000_22(this, 1108), enumC1434770nRL);
        C1433800nPm c1433800nPm = C1433780nPk.LIZ;
        c1d822.LJIIJ = c1433800nPm;
        EnumC1434770nRL enumC1434770nRL2 = EnumC1434770nRL.SAVE_LOCAL;
        C1D82 c1d823 = new C1D82(AFwS210S0000000_22.get$arr$(509), enumC1434770nRL2);
        C1D82 c1d824 = new C1D82(AFwS210S0000000_22.get$arr$(510), EnumC1434770nRL.UPDATE_AIGC_INFO_BEFORE_SAVE_LOCAL);
        char c = 0;
        c1d823.LIZ(c1d824);
        EnumC1434770nRL enumC1434770nRL3 = EnumC1434770nRL.ORIGINAL_FRAME_UPLOAD;
        C1D82 c1d825 = new C1D82(AFwS210S0000000_22.get$arr$(508), enumC1434770nRL3);
        C1D82 c1d826 = new C1D82(AFwS210S0000000_22.get$arr$(507), EnumC1434770nRL.AUTH_KEY);
        c1d825.LIZ(c1d826);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "aikit_aigc_auth", true, true)) {
            c1d82 = new C1D82(new AwS566S0100000_22(this, 1106), EnumC1434770nRL.AIGC_AUTH);
            c1d823.LIZ(c1d82);
        } else {
            c1d82 = null;
        }
        if (!C1428580nHM.LIZ(this.LJII.LIZ.isEnterFromDM()) || !C0CHQ.LIZ().getAccountService().isLogin()) {
            c1d824.LIZ(c1d822);
            c1d823.LIZ(c1d822);
            c1440550nafLIZ = LIZ(c1d822, c1d82);
        } else if (C1428470nHB.LJJZZI(this.LJII.LIZ)) {
            c1d824.LIZ(c1d822);
            c1d823.LIZ(c1d822, c1d825);
            this.LJII.LIZ.creativeModel.editSaveLocalModel.compileWatermark = !r2.isAiSelf;
            c1440550nafLIZ = LIZ(c1d822, c1d826, c1d82);
        } else {
            C1D82 c1d827 = new C1D82(AFwS210S0000000_22.get$arr$(511), EnumC1434770nRL.INDEPENDENT_WATERMARK_COMPILE);
            c1d827.LJIIJ = c1433800nPm;
            c = 0;
            c1d827.LIZ(c1d822);
            c1d824.LIZ(c1d827);
            c1d823.LIZ(c1d827, c1d824, c1d825);
            c1440550nafLIZ = LIZ(c1d822, c1d826, c1d82);
        }
        ArrayList arrayList = (ArrayList) c1440550nafLIZ.LIZLLL;
        arrayList.add(this.LJII);
        arrayList.add(new C1434970nRf(this.LIZJ.LIZ));
        arrayList.add(new C1404570med(this.LIZJ.LIZIZ));
        if (!C1428470nHB.LJJZZI(this.LJII.LIZ)) {
            arrayList.add(new C2221281Bwk(C297810Blr.LIZ() ? this.LJII.LIZ.getOutputFile() : this.LJII.LIZ.getParallelUploadOutputFile(), this.LIZLLL));
        }
        arrayList.add(this.LJ);
        arrayList.add(this.LJIIIZ.getValue());
        C444960Hcc.LIZIZ();
        arrayList.add(new C1435350nSH(zLJJLIIIJLLLLLLLZ));
        c1440550nafLIZ.LJFF = EnableParallelPublishSchedulerV2Exp.LIZ().enable;
        c1440550nafLIZ.LJ = C1435270nS9.LIZ();
        this.LJ.LJFF();
        c1440550nafLIZ.LJII = new C1435280nSA(C1434840nRS.LIZLLL(this.LIZJ));
        this.LJ.LJFF();
        c1440550nafLIZ.LJIIIIZZ = new C1435280nSA(C1434840nRS.LJ());
        this.LJ.LJFF();
        c1440550nafLIZ.LJIIIZ = new C1435280nSA(C1434840nRS.LIZJ());
        this.LJFF = c1440550nafLIZ.LIZ();
        if (C0CHQ.LIZ().getAccountService().isLogin()) {
            C1437500nVk[] c1437500nVkArr = new C1437500nVk[2];
            c1437500nVkArr[c] = new C1437500nVk(98, enumC1434770nRL3);
            c1437500nVkArr[1] = new C1437500nVk(2, enumC1434770nRL2);
            arrayListLJ = C1697810uHb.LJ(c1437500nVkArr);
        } else {
            C1437500nVk[] c1437500nVkArr2 = new C1437500nVk[2];
            c1437500nVkArr2[c] = new C1437500nVk(98, enumC1434770nRL);
            c1437500nVkArr2[1] = new C1437500nVk(2, enumC1434770nRL2);
            arrayListLJ = C1697810uHb.LJ(c1437500nVkArr2);
        }
        C1D80 c1d80 = this.LJFF;
        if (c1d80 == null) {
            c1d80 = null;
        }
        c1d80.LIZ(new C1436320nTq());
        C1D80 c1d802 = this.LJFF;
        if (c1d802 == null) {
            c1d802 = null;
        }
        c1d802.LIZ(new C1404640mek(new AwS566S0100000_22(this, 1104)));
        C1D80 c1d803 = this.LJFF;
        if (c1d803 == null) {
            c1d803 = null;
        }
        c1d803.LIZ(new C1404830mf3("SaveLocalPublisher"));
        C1D80 c1d804 = this.LJFF;
        if (c1d804 == null) {
            c1d804 = null;
        }
        c1d804.LIZ(new C1435900nTA(arrayListLJ, this.LJ, "SaveLocalPublisher", new AwS636S0100000_22(this, 70)));
        C1D80 c1d805 = this.LJFF;
        if (c1d805 == null) {
            c1d805 = null;
        }
        C575070Mgz.LIZ(c1d805, new AwS601S0100000_22(this, 905));
    }

    @Override // X.InterfaceC1433580nPQ
    public final void reStart() {
        C1D80 c1d80 = this.LJFF;
        if (c1d80 == null) {
            c1d80 = null;
        }
        if (c1d80.LIZJ() instanceof C1D8S) {
            LIZIZ();
        }
        ((C1405220mfg) this.LJIIIZ.getValue()).LIZLLL(EnumC1404590mef.EDIT_SAVE_LOCAL);
        C1D80 c1d802 = this.LJFF;
        (c1d802 != null ? c1d802 : null).LJII();
    }

    @Override // X.InterfaceC1433580nPQ
    public final boolean LJIJ() {
        return this.LJI;
    }

    public static C1440550naf LIZ(C1D82... c1d82Arr) {
        C1D82[] c1d82Arr2 = (C1D82[]) ((ArrayList) C13LQ.LJIJI(c1d82Arr)).toArray(new C1D82[0]);
        return new C1440550naf("SaveLocalPublisher", (C1D82[]) Arrays.copyOf(c1d82Arr2, c1d82Arr2.length));
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIILL(C1433230nOr c1433230nOr) {
        if (this.LJFF != null) {
            C1D80 c1d80 = this.LJFF;
            if (c1d80 == null) {
                c1d80 = null;
            }
            c1d80.LIZIZ(c1433230nOr);
        }
    }

    @Override // X.InterfaceC1433580nPQ
    public final void LJIIZILJ(AbstractC1433570nPP abstractC1433570nPP) {
        this.LJIIIIZZ = abstractC1433570nPP;
        if (this.LIZJ.LJI != null) {
            try {
                LIZIZ();
                ((C1405220mfg) this.LJIIIZ.getValue()).LIZLLL(EnumC1404590mef.EDIT_SAVE_LOCAL);
                C1D80 c1d80 = this.LJFF;
                if (c1d80 == null) {
                    c1d80 = null;
                }
                c1d80.LJII();
                return;
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(new Throwable(), "EditSaveLocalPublisher record task is null");
                return;
            }
        }
        C1AF0.LJFF(new Throwable(), "EditSaveLocalPublisher record task is null");
    }

    public C1434780nRM(C1433530nPL c1433530nPL, String str, C1434310nQb c1434310nQb) {
        super(c1434310nQb);
        this.LIZJ = c1433530nPL;
        this.LIZLLL = str;
        this.LJ = c1434310nQb;
        this.LJII = new C1434960nRe((VideoPublishEditModel) c1433530nPL.LIZ.editModel);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1105));
    }
}
