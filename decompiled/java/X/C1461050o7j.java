package X;

import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCOptConfig;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0o7j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.PrepareParamsHandler$handleData$2$results$2", f = "PrepareParamsHandler.kt", l = {66}, m = "invokeSuspend")
public final class C1461050o7j extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, C19536311c1, InterfaceC1364105Vn<? super C1461090o7n>, Object> {
    public int LL;
    public /* synthetic */ C19536311c1 LLILLJJLI;
    public final /* synthetic */ C19536911c7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1461050o7j(C19536911c7 c19536911c7, InterfaceC1364105Vn<? super C1461050o7j> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = c19536911c7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLEError nLEErrorLIZIZ;
        String str;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        NLEResourceNode resource;
        String resourceFile;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        NLESegment mainSegment3;
        NLEResourceNode resource3;
        NLETrackSlot nLETrackSlot2;
        Object objLIZ = obj;
        C1C7U.LIZ("PrepareParamsHandler@9605.handleData$2$results$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C19536311c1 c19536311c1 = this.LLILLJJLI;
            String resourceFile2 = null;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "vc_dub_compression", true, false) && c19536311c1.LIZIZ == null && (nLETrackSlot2 = c19536311c1.LIZ) != null) {
                c19536311c1 = new C19536311c1(null, c19536311c1.LIZJ, C348930Dm7.LJII(nLETrackSlot2));
            }
            C19545411dU c19545411dU = C19545411dU.LIZ;
            String strLIZJ = this.LLILLL.LJ.LIZJ();
            this.LL = 1;
            c19545411dU.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (c19536311c1.LIZIZ == null) {
                C1461090o7n c1461090o7n = new C1461090o7n();
                NLETrackSlot nLETrackSlot3 = c19536311c1.LIZ;
                if (nLETrackSlot3 != null && (mainSegment3 = nLETrackSlot3.getMainSegment()) != null && (resource3 = mainSegment3.getResource()) != null) {
                    resourceFile = resource3.getResourceFile();
                } else {
                    resourceFile = null;
                }
                c1461090o7n.LIZIZ = resourceFile;
                NLETrackSlot nLETrackSlot4 = c19536311c1.LIZ;
                if (nLETrackSlot4 != null && (mainSegment2 = nLETrackSlot4.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                    resourceFile2 = resource2.getResourceFile();
                }
                c1461090o7n.LIZJ = resourceFile2;
                c1461090o7n.LIZ = C123100dR.LIZ(resourceFile2);
                C189200o6.m2constructorimpl(c1461090o7n);
                c23260099m.resumeWith(c1461090o7n);
            } else {
                if (C284400BCs.LIZ() && C1461100o7o.LIZIZ()) {
                    nLEErrorLIZIZ = C1461020o7g.LIZIZ(C1461020o7g.LIZ, strLIZJ, c19536311c1.LIZIZ, C1461100o7o.LIZ().channels, C1461100o7o.LIZ().bitRate, C1461100o7o.LIZ().sampleRate, false, true, 128);
                } else {
                    VCOptConfig vCOptConfig = new VCOptConfig(2, 44100, 128000);
                    nLEErrorLIZIZ = C1461020o7g.LIZIZ(C1461020o7g.LIZ, strLIZJ, c19536311c1.LIZIZ, vCOptConfig.channels, vCOptConfig.bitRate, vCOptConfig.sampleRate, false, true, 128);
                }
                NLETrack nLETrack = (NLETrack) C13LP.LJJJLL(c19536311c1.LIZIZ.getTracks());
                if (nLETrack != null && (slots = nLETrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                    resourceFile2 = resource.getResourceFile();
                }
                if (strLIZJ.length() > 0 && C2286708xd.LIZJ(strLIZJ) && nLEErrorLIZIZ == NLEError.SUCCESS) {
                    if (C2486109oh.LIZ(strLIZJ) == 0) {
                        C1461090o7n c1461090o7n2 = new C1461090o7n();
                        c1461090o7n2.LIZIZ = resourceFile2;
                        c1461090o7n2.LIZ = true;
                        c1461090o7n2.LIZJ = strLIZJ;
                        c1461090o7n2.LIZLLL = nLEErrorLIZIZ;
                        C189200o6.m2constructorimpl(c1461090o7n2);
                        c23260099m.resumeWith(c1461090o7n2);
                    } else {
                        C1461090o7n c1461090o7n3 = new C1461090o7n();
                        c1461090o7n3.LIZLLL = nLEErrorLIZIZ;
                        c1461090o7n3.LIZIZ = resourceFile2;
                        if (resourceFile2 == null) {
                            str = "empty slot";
                        } else {
                            str = resourceFile2;
                        }
                        c1461090o7n3.LJ = str;
                        c1461090o7n3.LJFF = C2286608xc.LJ(-10);
                        long jLJIIL = C2286708xd.LJIIL(resourceFile2);
                        if (C284400BCs.LIZ() && C1461100o7o.LIZIZ()) {
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LIZLLL(jLJIIL, "fileSize");
                            c2344009Gk.LJIIIIZZ("error_type", "detachAudioStreamFile");
                            c2344009Gk.LJIIIIZZ("fileLocalPath", c1461090o7n3.LJ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("sampleRate=");
                            sbLIZ.append(C1461100o7o.LIZ().sampleRate);
                            sbLIZ.append(",bitRate=");
                            sbLIZ.append(C1461100o7o.LIZ().bitRate);
                            sbLIZ.append(",channels=");
                            sbLIZ.append(C1461100o7o.LIZ().channels);
                            c2344009Gk.LJIIIIZZ("extra", C2188811AlT.LIZIZ(sbLIZ));
                            C20684815ws.LJIILLIIL("voice_conversion_extra_error", c2344009Gk.LIZ);
                        } else {
                            C2344009Gk c2344009Gk2 = new C2344009Gk();
                            c2344009Gk2.LIZLLL(jLJIIL, "fileSize");
                            c2344009Gk2.LJIIIIZZ("error_type", "detachAudioStreamFile");
                            c2344009Gk2.LJIIIIZZ("fileLocalPath", c1461090o7n3.LJ);
                            C20684815ws.LJIILLIIL("voice_conversion_extra_error", c2344009Gk2.LIZ);
                        }
                        C189200o6.m2constructorimpl(c1461090o7n3);
                        c23260099m.resumeWith(c1461090o7n3);
                    }
                } else {
                    C1461090o7n c1461090o7n4 = new C1461090o7n();
                    c1461090o7n4.LIZIZ = resourceFile2;
                    c1461090o7n4.LIZLLL = nLEErrorLIZIZ;
                    C189200o6.m2constructorimpl(c1461090o7n4);
                    c23260099m.resumeWith(c1461090o7n4);
                }
            }
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("PrepareParamsHandler@9605.handleData$2$results$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PrepareParamsHandler@9605.handleData$2$results$2");
        return objLIZ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, C19536311c1 c19536311c1, InterfaceC1364105Vn<? super C1461090o7n> interfaceC1364105Vn) {
        C1461050o7j c1461050o7j = new C1461050o7j(this.LLILLL, interfaceC1364105Vn);
        c1461050o7j.LLILLJJLI = c19536311c1;
        return c1461050o7j.invokeSuspend(Unit.LIZ);
    }
}
