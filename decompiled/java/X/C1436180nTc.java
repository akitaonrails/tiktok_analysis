package X;

import Y.AfS157S0200000_22;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS231S0300000_22;

/* JADX INFO: renamed from: X.0nTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436180nTc extends AbstractC1434490nQt {
    public boolean LLILZLL;
    public C1431070nLN LLIZ;
    public C1405220mfg LLIZLLLIL;
    public boolean LLJ;
    public C11JF LLJI;
    public long LLJIJIL = -1;
    public final long LLJILJIL = C0C64.LJIILLIIL().LJIJ(31744, 5000, "upload_parameter_optimize_timeout", true);
    public final int LLJILJILJ = C0C64.LJIILLIIL().LJIJ(31744, LSPassThroughRecordSizeConfig.DEFAULT, "upload_parameter_optimize_threshold", true);
    public boolean LLJILLL;
    public C1436170nTb LLJJ;
    public boolean LLJJI;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.WAIT_UPLOAD_PARAMS;
    }

    @Override // X.C1D8B
    public final void LIZJ(Object obj) {
        boolean z = obj instanceof C1436170nTb;
        C1436170nTb c1436170nTb = null;
        if (!z && !(obj instanceof C1431030nLJ) && !(obj instanceof C1435310nSD)) {
            return;
        }
        C1436190nTd c1436190nTd = new C1436190nTd(obj, false);
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaitUploadParamsTask: msg: ");
        sbLIZ.append(obj);
        C201955140j.LIZJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        C1431070nLN c1431070nLN = this.LLIZ;
        if (c1431070nLN != null) {
            LJIILJJIL(c1436190nTd, c1431070nLN);
            return;
        }
        if (!(obj instanceof C1431030nLJ) && !(obj instanceof C1435310nSD)) {
            if (z) {
                c1436170nTb = (C1436170nTb) obj;
            }
            this.LLJJ = c1436170nTb;
            return;
        }
        this.LLJILLL = true;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        DMMediaModel dMMediaModel;
        Object next2;
        this.LLJIJIL = System.currentTimeMillis();
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next == null || (next instanceof C1405220mfg)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLIZLLLIL = (C1405220mfg) next;
        Iterator<Object> it3 = c1404610meh.LIZ.iterator();
        while (it3.hasNext() && (next2 = it3.next()) != null && !(next2 instanceof C2221281Bwk)) {
        }
        Iterator<Object> it4 = c1404610meh.LIZ.iterator();
        while (true) {
            if (!it4.hasNext()) {
                break;
            }
            Object next3 = it4.next();
            if (next3 instanceof C1434960nRe) {
                if (next3 != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C1434960nRe) next3).LIZ;
                    if (C1428470nHB.LJJZZI(videoPublishEditModel) || (((dMMediaModel = videoPublishEditModel.creativeModel.dmMediaModel) != null && dMMediaModel.type == 0) || C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_upload_parameter_optimize", true) != 1)) {
                        c1431070nLN.LJ(null, true);
                        return;
                    }
                    C201955140j.LIZJ(C830690WiJ.LIZIZ, "WaitUploadParamsTask: begin");
                    this.LLIZ = c1431070nLN;
                    C1436170nTb c1436170nTb = this.LLJJ;
                    if (c1436170nTb != null) {
                        LJIILJJIL(new C1436190nTd(c1436170nTb, false, 2), c1431070nLN);
                        return;
                    } else {
                        this.LLJI = (C11JF) C11NZ.LJLJJLL(this.LLJILJIL, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(new C19501611Rm(EnumC2272608vM.LL)).LJJLJLI(new AfS157S0200000_22(c1431070nLN, this, 9));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIILJJIL(C1436190nTd c1436190nTd, C1431070nLN c1431070nLN) {
        boolean z;
        C1436170nTb c1436170nTb;
        C11JF c11jf;
        if (this.LLJ) {
            return;
        }
        Object obj = c1436190nTd.LIZ;
        if (!(obj instanceof C1431030nLJ) && !(obj instanceof C1435310nSD)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.LLJILLL = true;
            if (this.LLILZLL) {
                C1436170nTb c1436170nTb2 = this.LLJJ;
                if (c1436170nTb2 == null) {
                    c1436170nTb2 = new C1436170nTb(0L, 0L, false, false, 31);
                }
                c1436170nTb2.LJ = true;
                this.LLJJ = c1436170nTb2;
                c1431070nLN.LJ(c1436170nTb2, c1436190nTd.LIZIZ);
                this.LLJ = true;
            }
        } else {
            if (obj instanceof C1436170nTb) {
                c1436170nTb = (C1436170nTb) obj;
            } else {
                c1436170nTb = null;
            }
            this.LLJJ = c1436170nTb;
            if (c1436170nTb != null && (((c1436170nTb.LIZIZ * c1436170nTb.LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 1024)) / ((long) 8) < this.LLJILJILJ) {
                c1431070nLN.LJ(c1436170nTb, c1436190nTd.LIZIZ);
                this.LLJ = true;
            } else if (!this.LLJJI) {
                this.LLJJI = true;
                C1405220mfg c1405220mfg = this.LLIZLLLIL;
                if (c1405220mfg != null) {
                    c1405220mfg.LIZJ(new AwS231S0300000_22(this, c1431070nLN, c1436190nTd, 32));
                }
            }
        }
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("task done, cost time: ");
        sbLIZ.append(System.currentTimeMillis() - this.LLJIJIL);
        c1437510nVlLJJLIIIJ.LIZ("WaitUploadParamsTask", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJ && (c11jf = this.LLJI) != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = this.LLJI;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            this.LLJI = null;
        }
    }
}
