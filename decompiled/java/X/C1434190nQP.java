package X;

import Y.ACallableS427S0100000_22;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nQP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434190nQP extends AbstractC1434490nQt {
    public final Function0<Unit> LLILZLL;
    public C1431070nLN LLIZ;
    public InterfaceC1434170nQN LLIZLLLIL;
    public C2221281Bwk LLJ;
    public C1434960nRe LLJI;
    public C1434970nRf LLJIJIL;
    public VideoCreation LLJILJIL;
    public C1404570med LLJILJILJ;
    public C1404740meu LLJILLL;
    public C1436170nTb LLJJ;
    public boolean LLJJI;
    public boolean LLJJIJI;
    public AbstractC1434250nQV LLJJJ;
    public C1434460nQq LLJJJJJIL;
    public C1431990nMr LLJJJJLIIL;
    public boolean LLJJL;
    public C1434270nQX LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public volatile boolean LLJLILLLLZIIL;
    public volatile boolean LLJLL;
    public InterfaceC1434410nQl LLJLLL;
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(526));
    public final long LLJJIJIIJIL = -1;
    public final long LLJJIJIL = -1;
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(527));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(528));
    public String LLJLIL = "";
    public final C1434180nQO LLJLLIL = new InterfaceC1432000nMs() { // from class: X.0nQO
        @Override // X.InterfaceC1432000nMs
        public final String LIZIZ() {
            try {
                AbstractC1434250nQV abstractC1434250nQV = this.LIZ.LLJJJ;
                if (abstractC1434250nQV == null) {
                    abstractC1434250nQV = null;
                }
                return abstractC1434250nQV.LIZLLL();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "";
            }
        }

        @Override // X.InterfaceC1432000nMs
        public final EnumC1434770nRL LIZ() {
            return EnumC1434770nRL.UPLOAD;
        }
    };

    public final void LJIILL() {
        C1431990nMr c1431990nMr;
        if (((Boolean) C262650ARb.LIZ.getValue()).booleanValue()) {
            C15O7.LIZJ(new ACallableS427S0100000_22(this, 21));
        } else {
            AbstractC1434250nQV abstractC1434250nQV = this.LLJJJ;
            if (abstractC1434250nQV == null) {
                abstractC1434250nQV = null;
            }
            abstractC1434250nQV.LIZJ();
        }
        ((Keva) C1434500nQu.LIZ.getValue()).erase("upload_param_key");
        C1434460nQq c1434460nQq = this.LLJJJJJIL;
        if (c1434460nQq == null) {
            c1434460nQq = null;
        }
        C11JF c11jf = c1434460nQq.LIZJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = c1434460nQq.LIZJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            c1434460nQq.LIZJ = null;
        }
        if (!C299860BpA.LIZ() || (c1431990nMr = this.LLJJJJLIIL) == null) {
            return;
        }
        c1431990nMr.LIZ.remove(this.LLJLLIL);
    }

    public final int LJIILLIIL() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    public final C1431580nMC LJIIZILJ() {
        return (C1431580nMC) this.LLJJJIL.getValue();
    }

    public final void LJIJJ() {
        C2221281Bwk c2221281Bwk;
        C1434960nRe c1434960nRe = this.LLJI;
        if (c1434960nRe == null) {
            c1434960nRe = null;
        }
        VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
        C571720Mba.LIZ(videoPublishEditModel, "WaveUploadVideoTask");
        VideoCreation videoCreation = this.LLJILJIL;
        if (videoCreation == null) {
            videoCreation = null;
        }
        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) videoCreation;
        float videoCoverStartTm = videoPublishEditModel.getVideoCoverStartTm();
        String creationId = videoPublishEditModel.getCreationId();
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo == null) {
            uploadSpeedInfo = new UploadSpeedInfo(-6L, "", -6L, -6L, -1);
        }
        boolean z = videoPublishEditModel.isPrivate == 1;
        LJIIIZ().LIZ();
        AbstractC1434250nQV abstractC1434250nQVLIZ = C1434320nQc.LIZ();
        this.LLJJJ = abstractC1434250nQVLIZ;
        Map<String, String> mapLJ = C2097608Jq.LJ();
        if (((Boolean) C0ARJ.LIZ.getValue()).booleanValue()) {
            HashMap map = new HashMap();
            C1434960nRe c1434960nRe2 = this.LLJI;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = c1434960nRe2.LIZ;
            HashMap map2 = new HashMap();
            String str = videoPublishEditModel2.mShootWay;
            if (str != null) {
                map2.put("shoot_way", str);
            }
            map2.put("content_type", C1428470nHB.LJIILL(videoPublishEditModel2));
            map2.put("aweme_type", Integer.valueOf(C1428470nHB.LJIIJJI(videoPublishEditModel2)));
            C1434970nRf c1434970nRf = this.LLJIJIL;
            if (c1434970nRf == null) {
                c1434970nRf = null;
            }
            map2.put("is_retry", Integer.valueOf(c1434970nRf.LIZ.retryType != EnumC1405170mfb.NOT_RETRY ? 1 : 0));
            map2.put("is_story", Integer.valueOf(videoPublishEditModel2.getTtStoryUploadModel() != null ? 1 : 0));
            map2.put("privacy_type", Integer.valueOf(videoPublishEditModel2.isPrivate));
            map.put("X-CONTEXT", GsonProtectorUtils.toJson(C08JS.LIZIZ(), map2));
            mapLJ = map;
        }
        abstractC1434250nQVLIZ.LJJIFFI(uploadAuthKeyConfig, mapLJ);
        AbstractC1434250nQV abstractC1434250nQV = this.LLJJJ;
        if (abstractC1434250nQV == null) {
            abstractC1434250nQV = null;
        }
        C1434970nRf c1434970nRf2 = this.LLJIJIL;
        if (c1434970nRf2 == null) {
            c1434970nRf2 = null;
        }
        abstractC1434250nQV.LJIILLIIL(c1434970nRf2.LIZ.publishType == 2);
        AbstractC1434250nQV abstractC1434250nQV2 = this.LLJJJ;
        if (abstractC1434250nQV2 == null) {
            abstractC1434250nQV2 = null;
        }
        abstractC1434250nQV2.LJIJI(C1428470nHB.LJIIJJI(videoPublishEditModel));
        if (((Boolean) C287460BOm.LIZ.getValue()).booleanValue()) {
            AbstractC1434250nQV abstractC1434250nQV3 = this.LLJJJ;
            if (abstractC1434250nQV3 == null) {
                abstractC1434250nQV3 = null;
            }
            abstractC1434250nQV3.LJII("publish_video");
        }
        C1436170nTb c1436170nTb = this.LLJJ;
        if (c1436170nTb != null && (c1436170nTb.LIZIZ >= 0 || c1436170nTb.LIZ >= 0)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("WaitUploadParamsTask: upload set info: ");
            sbLIZ.append(c1436170nTb);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            AbstractC1434250nQV abstractC1434250nQV4 = this.LLJJJ;
            if (abstractC1434250nQV4 == null) {
                abstractC1434250nQV4 = null;
            }
            abstractC1434250nQV4.LJIIJ(c1436170nTb.LIZ());
            C1434500nQu.LIZIZ(c1436170nTb);
        }
        if (z && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_enable_private_video_encryption", true, false)) {
            AbstractC1434250nQV abstractC1434250nQV5 = this.LLJJJ;
            if (abstractC1434250nQV5 == null) {
                abstractC1434250nQV5 = null;
            }
            abstractC1434250nQV5.LJIIZILJ();
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "tool_upload_retry_state_switch", true, false)) {
            AbstractC1434250nQV abstractC1434250nQV6 = this.LLJJJ;
            if (abstractC1434250nQV6 == null) {
                abstractC1434250nQV6 = null;
            }
            abstractC1434250nQV6.LJIJ();
        }
        String probeContext = uploadSpeedInfo.getProbeContext();
        if (!TextUtils.isEmpty(probeContext)) {
            int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 800, "upload_speed_test_threshold", true);
            C1431070nLN c1431070nLN = this.LLIZ;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1404980mfI(iLJIJ, "WaveUploadVideoTask", uploadSpeedInfo.getSpeed(), probeContext), EnumC2251001D8o.OUTER);
            AbstractC1434250nQV abstractC1434250nQV7 = this.LLJJJ;
            if (abstractC1434250nQV7 == null) {
                abstractC1434250nQV7 = null;
            }
            abstractC1434250nQV7.LJIIIIZZ(probeContext);
            AbstractC1434250nQV abstractC1434250nQV8 = this.LLJJJ;
            if (abstractC1434250nQV8 == null) {
                abstractC1434250nQV8 = null;
            }
            abstractC1434250nQV8.LJJ((int) uploadSpeedInfo.getSpeed());
            if (iLJIJ > 0) {
                AbstractC1434250nQV abstractC1434250nQV9 = this.LLJJJ;
                if (abstractC1434250nQV9 == null) {
                    abstractC1434250nQV9 = null;
                }
                abstractC1434250nQV9.LJIL(iLJIJ);
            }
            if (C0CHQ.LIZ().getPublishService().LJJIJIIJI().LIZ().LIZJ()) {
                uploadSpeedInfo.setProbeContext("");
            }
        }
        AbstractC1434250nQV abstractC1434250nQV10 = this.LLJJJ;
        if (abstractC1434250nQV10 == null) {
            abstractC1434250nQV10 = null;
        }
        abstractC1434250nQV10.LJIJJLI(C0A2I.LIZ());
        C1404740meu c1404740meu = this.LLJILLL;
        if (c1404740meu == null) {
            c1404740meu = null;
        }
        List<C1404760mew> list = c1404740meu.LIZ;
        if (list != null && !list.isEmpty()) {
            int i = ((C1404760mew) ListProtector.get(list, 0)).LIZ * 1024;
            C1431070nLN c1431070nLN2 = this.LLIZ;
            if (c1431070nLN2 == null) {
                c1431070nLN2 = null;
            }
            c1431070nLN2.LIZIZ(new C1405040mfO(i), EnumC2251001D8o.OUTER);
            AbstractC1434250nQV abstractC1434250nQV11 = this.LLJJJ;
            if (abstractC1434250nQV11 == null) {
                abstractC1434250nQV11 = null;
            }
            abstractC1434250nQV11.LJIJJ(i);
        }
        if (LJIILLIIL() > 0 && (c2221281Bwk = this.LLJ) != null) {
            c2221281Bwk.LJIIIZ = new InterfaceC1436020nTM() { // from class: X.0nQY
                @Override // X.InterfaceC1436020nTM
                public final void LIZ(EnumC1288180jcu enumC1288180jcu) {
                    if (enumC1288180jcu == EnumC1288180jcu.CANCEL) {
                        C1434440nQo c1434440nQoLJ = this.LIZ.LJIIIZ().LJ();
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C1404570med c1404570med = this.LIZ.LLJILJILJ;
                        AbstractC1434250nQV abstractC1434250nQV12 = null;
                        if (c1404570med == null) {
                            c1404570med = null;
                        }
                        c2344009Gk.LJ(c1404570med, "publish_id");
                        c2344009Gk.LIZJ(0, "video_type");
                        c2344009Gk.LIZJ(1, "video_upload_type");
                        c2344009Gk.LJIIIIZZ("cancel_step", "call_uploader");
                        Map<String, String> map3 = c2344009Gk.LIZ;
                        c1434440nQoLJ.getClass();
                        C20684815ws.LJIILLIIL("user_cancel_publish", map3);
                        AbstractC1434250nQV abstractC1434250nQV13 = this.LIZ.LLJJJ;
                        if (abstractC1434250nQV13 != null) {
                            abstractC1434250nQV12 = abstractC1434250nQV13;
                        }
                        abstractC1434250nQV12.LIZIZ();
                    }
                }
            };
        }
        AbstractC1434250nQV abstractC1434250nQV12 = this.LLJJJ;
        if (abstractC1434250nQV12 == null) {
            abstractC1434250nQV12 = null;
        }
        abstractC1434250nQV12.LJIILJJIL(videoCoverStartTm);
        AbstractC1434250nQV abstractC1434250nQV13 = this.LLJJJ;
        if (abstractC1434250nQV13 == null) {
            abstractC1434250nQV13 = null;
        }
        abstractC1434250nQV13.LJJI(creationId);
        if (C297790Blp.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("setDiskResumeUniqueKey: ");
            sbLIZ2.append(creationId);
            C2188811AlT.LIZIZ(sbLIZ2);
            AbstractC1434250nQV abstractC1434250nQV14 = this.LLJJJ;
            if (abstractC1434250nQV14 == null) {
                abstractC1434250nQV14 = null;
            }
            abstractC1434250nQV14.LJIIIZ(creationId);
        }
    }

    @Override // X.AbstractC1434490nQt
    public final int LJIIJ() {
        LJIIIZ().LJIIIIZZ().getClass();
        new C1404950mfF();
        return C1404950mfF.LIZJ();
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.UPLOAD;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0nQO] */
    public C1434190nQP(AwS566S0100000_22 awS566S0100000_22) {
        this.LLILZLL = awS566S0100000_22;
    }

    @Override // X.C1D8B
    public final void LIZJ(Object obj) {
        if ((obj instanceof C556180Lrc) && ((AbstractC556190Lrd) obj).LIZ == EnumC1434770nRL.COMPILE) {
            C1431070nLN c1431070nLN = null;
            if (LJIILJJIL(null)) {
                this.LLJJIJI = true;
                LJIILL();
                C1431070nLN c1431070nLN2 = this.LLIZ;
                if (c1431070nLN2 != null) {
                    c1431070nLN = c1431070nLN2;
                }
                C1431070nLN.LIZ(c1431070nLN);
            }
        }
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZLLL(Object obj) {
        super.LIZLLL(obj);
        if (!this.LLJLILLLLZIIL && !this.LLJLL) {
            this.LLJLL = true;
            C1431070nLN c1431070nLN = this.LLIZ;
            C1431070nLN c1431070nLN2 = null;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1404990mfJ("WaveUploadVideoTask", "UploadVideoTask pause"), EnumC2251001D8o.OUTER);
            AbstractC1434250nQV abstractC1434250nQV = this.LLJJJ;
            if (abstractC1434250nQV == null) {
                abstractC1434250nQV = null;
            }
            abstractC1434250nQV.LJFF();
            C1431070nLN c1431070nLN3 = this.LLIZ;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            c1431070nLN2.LIZIZ(C1431170nLX.LIZ, EnumC2251001D8o.OUTER);
            return true;
        }
        return false;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final void LJ(Object obj) {
        super.LJ(obj);
        if (this.LLJLL) {
            C1431070nLN c1431070nLN = this.LLIZ;
            C1431070nLN c1431070nLN2 = null;
            if (c1431070nLN == null) {
                c1431070nLN = null;
            }
            c1431070nLN.LIZIZ(new C1404990mfJ("WaveUploadVideoTask", "UploadVideoTask resume"), EnumC2251001D8o.OUTER);
            AbstractC1434250nQV abstractC1434250nQV = this.LLJJJ;
            if (abstractC1434250nQV == null) {
                abstractC1434250nQV = null;
            }
            abstractC1434250nQV.LJI();
            C1431070nLN c1431070nLN3 = this.LLIZ;
            if (c1431070nLN3 != null) {
                c1431070nLN2 = c1431070nLN3;
            }
            c1431070nLN2.LIZIZ(C1431160nLW.LIZ, EnumC2251001D8o.OUTER);
            this.LLJLL = false;
        }
    }

    public final boolean LJIILJJIL(Integer num) {
        C1431070nLN c1431070nLN = this.LLIZ;
        if (c1431070nLN != null && c1431070nLN.LIZJ < C291170Bb9.LIZ() && !this.LLJJIJI && C0C2T.LIZ(num)) {
            return true;
        }
        return false;
    }

    public final boolean LJIJ(C1434330nQd c1434330nQd) {
        int iLJII = C1431420nLw.LJII(c1434330nQd);
        if (LJIILJJIL(Integer.valueOf(iLJII))) {
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("allow restart: ");
            sbLIZ.append(c1434330nQd);
            c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ));
            C0Z6N.LIZ(new AwS423S0200000_22(c1434330nQd, this, 116));
            return false;
        }
        this.LLJLILLLLZIIL = true;
        C1434960nRe c1434960nRe = null;
        if (this.LLJ != null) {
            C823190WQz c823190WQz = C823190WQz.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C1434960nRe c1434960nRe2 = this.LLJI;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            sbLIZ2.append(c1434960nRe2.LIZ.getCreationId());
            sbLIZ2.append("_compile");
            c823190WQz.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1444650nhH.LIZ.getClass();
        C1444650nhH.LIZLLL(iLJII);
        C1431070nLN c1431070nLN = this.LLIZ;
        if (c1431070nLN == null) {
            c1431070nLN = null;
        }
        c1431070nLN.LIZLLL(iLJII, c1434330nQd);
        if (((Set) C115400cC.LIZIZ.getValue()).contains(Integer.valueOf(iLJII))) {
            C1434970nRf c1434970nRf = this.LLJIJIL;
            if (c1434970nRf == null) {
                c1434970nRf = null;
            }
            if (c1434970nRf.LIZ.publishType == 0) {
                C1402780mbk c1402780mbk = C1402780mbk.LIZ;
                C1434960nRe c1434960nRe3 = this.LLJI;
                if (c1434960nRe3 != null) {
                    c1434960nRe = c1434960nRe3;
                }
                VideoPublishEditModel videoPublishEditModel = c1434960nRe.LIZ;
                Integer numValueOf = Integer.valueOf(iLJII);
                c1402780mbk.getClass();
                C1402780mbk.LIZ(videoPublishEditModel, "/top/v1", numValueOf);
            }
        }
        LJIILL();
        return true;
    }

    @Override // X.AbstractC1434490nQt, X.C1D8B
    public final boolean LIZIZ(AbstractC1404540mea abstractC1404540mea, InterfaceC1434410nQl interfaceC1434410nQl) {
        super.LIZIZ(abstractC1404540mea, interfaceC1434410nQl);
        this.LLJLILLLLZIIL = true;
        if (this.LLJ != null) {
            C823190WQz c823190WQz = C823190WQz.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            C1434960nRe c1434960nRe = this.LLJI;
            if (c1434960nRe == null) {
                c1434960nRe = null;
            }
            sbLIZ.append(c1434960nRe.LIZ.getCreationId());
            sbLIZ.append("_compile");
            c823190WQz.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (abstractC1404540mea instanceof C1404550meb) {
            C2221281Bwk c2221281Bwk = this.LLJ;
            if (c2221281Bwk != null) {
                c2221281Bwk.stopUpload(false);
            }
        } else {
            C1434960nRe c1434960nRe2 = this.LLJI;
            if (c1434960nRe2 == null) {
                c1434960nRe2 = null;
            }
            C1435600nSg.LJIIIIZZ(c1434960nRe2.LIZ, this.LLJJL, true);
            C2221281Bwk c2221281Bwk2 = this.LLJ;
            if (c2221281Bwk2 != null) {
                c2221281Bwk2.LJIJI = false;
                c2221281Bwk2.cancelUpload();
            }
        }
        C1434460nQq c1434460nQq = this.LLJJJJJIL;
        if (c1434460nQq == null) {
            c1434460nQq = null;
        }
        C11JF c11jf = c1434460nQq.LIZJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            C11JF c11jf2 = c1434460nQq.LIZJ;
            if (c11jf2 != null) {
                c11jf2.dispose();
            }
            c1434460nQq.LIZJ = null;
        }
        this.LLJLLL = interfaceC1434410nQl;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0283 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0317 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0327 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x033b A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0348 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x037a A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03d0 A[Catch: Exception -> 0x041e, TryCatch #0 {Exception -> 0x041e, blocks: (B:142:0x0226, B:145:0x022e, B:148:0x0235, B:150:0x0239, B:152:0x023d, B:153:0x023f, B:158:0x0247, B:161:0x0254, B:164:0x0267, B:167:0x026c, B:169:0x0272, B:171:0x0278, B:174:0x027d, B:197:0x02d4, B:199:0x02da, B:201:0x02de, B:206:0x02f8, B:210:0x02ff, B:214:0x030f, B:231:0x0344, B:233:0x0348, B:236:0x034d, B:238:0x0355, B:241:0x035c, B:260:0x03ca, B:262:0x03d0, B:265:0x03d5, B:268:0x03e8, B:270:0x03f3, B:273:0x03f8, B:274:0x03fb, B:277:0x0400, B:280:0x040b, B:283:0x041a, B:242:0x0371, B:243:0x0379, B:244:0x037a, B:246:0x0380, B:249:0x0385, B:251:0x038d, B:252:0x0396, B:257:0x03a6, B:255:0x039b, B:258:0x03ae, B:216:0x0317, B:203:0x02e2, B:220:0x031f, B:222:0x0327, B:225:0x032e, B:228:0x0336, B:229:0x033b, B:230:0x0343, B:176:0x0283, B:179:0x0288, B:181:0x0290, B:184:0x0295, B:186:0x029d, B:187:0x02a5, B:188:0x02a6, B:191:0x02ad, B:194:0x02b5, B:259:0x03c0), top: B:306:0x0226 }] */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0419  */
    /* JADX WARN: Type inference failed for: r0v150, types: [X.0nQW] */
    @Override // X.AbstractC1434490nQt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1404610meh r15, X.C1431070nLN r16) {
        /*
            Method dump skipped, instruction units count: 1189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1434190nQP.LJII(X.0meh, X.0nLN):void");
    }

    public final boolean LJIJI(VideoCreation videoCreation, C1404850mf5 c1404850mf5) {
        C1431070nLN c1431070nLN = this.LLIZ;
        C1431070nLN c1431070nLN2 = null;
        if (c1431070nLN == null || c1431070nLN.LIZJ != C291170Bb9.LIZ()) {
            C0CHQ.LIZ().LJIIJJI();
            Integer num = Integer.MAX_VALUE;
            if (num.intValue() != Integer.MAX_VALUE) {
                int iIntValue = num.intValue();
                C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("mock error code: ");
                sbLIZ.append(iIntValue);
                c1437510nVlLJJLIIIJ.LIZ("upload", C2188811AlT.LIZIZ(sbLIZ));
                LJIJ(new C1434330nQd(C1431470nM1.LIZ(iIntValue), null, 2, null));
                return false;
            }
        }
        this.LLJLILLLLZIIL = true;
        if (this.LLJ != null) {
            C823190WQz c823190WQz = C823190WQz.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            C1434960nRe c1434960nRe = this.LLJI;
            if (c1434960nRe == null) {
                c1434960nRe = null;
            }
            sbLIZ2.append(c1434960nRe.LIZ.getCreationId());
            sbLIZ2.append("_compile");
            c823190WQz.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1431070nLN c1431070nLN3 = this.LLIZ;
        if (c1431070nLN3 != null) {
            c1431070nLN2 = c1431070nLN3;
        }
        c1431070nLN2.LJ(new C1404470meT(videoCreation, c1404850mf5), false);
        LJIILL();
        return true;
    }

    public final void LJIJJLI(String str, boolean z) {
        C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZ(LJIILIIL(), str);
        C0CHQ.LIZ().LJIIJJI();
        C1AF0.LIZJ(str);
    }
}
