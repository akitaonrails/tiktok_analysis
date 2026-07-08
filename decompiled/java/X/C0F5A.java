package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F5A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F5A {
    public final C0F5K LIZ;
    public final Function0<Unit> LIZIZ;

    public final void LIZIZ() {
        NLEModel nLEModelLJI;
        NLESegmentAudio nLESegmentAudioDynamicCast;
        NLEResourceNode resource;
        NLESegmentAudio nLESegmentAudioDynamicCast2;
        CreativeModel creativeModel;
        this.LIZ.LIZ.t4(true);
        this.LIZIZ.invoke();
        InlineCaptionFragment inlineCaptionFragment = this.LIZ.LIZ;
        inlineCaptionFragment.getClass();
        if (!C0E2B.LIZ()) {
            C786410Ut5.LJZL(4, inlineCaptionFragment.YS());
        }
        C0F5K c0f5k = this.LIZ;
        VideoPublishEditModel videoPublishEditModel = c0f5k.LIZJ;
        LanguageDetail languageDetail = null;
        if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
            creativeModel.inlineCaptionModel = null;
        }
        c0f5k.LJI.LJIIIIZZ.clear();
        C0F5K c0f5k2 = this.LIZ;
        c0f5k2.LJI.LJIIIZ = null;
        AbstractC2217051Bpv abstractC2217051Bpv = c0f5k2.LIZLLL.LLIZ;
        if (abstractC2217051Bpv != null) {
            C563650M8t c563650M8t = C563650M8t.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("InlineCaptionFragment -> showPreview -> currentLanguage = ");
            sbLIZ.append(this.LIZ.LJI.LIZ);
            sbLIZ.append(", languageCode = ");
            C0F5K c0f5k3 = this.LIZ;
            sbLIZ.append(c0f5k3.LIZLLL.vQ2(c0f5k3.LJI.LIZ));
            C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
            abstractC2217051Bpv.LJIIIZ();
            C0E48 c0e48 = this.LIZ.LIZIZ;
            if (c0e48 != null) {
                nLEModelLJI = C350870DpF.LJI(c0e48);
                NLETrack nLETrackLIZ = C346960Diw.LIZ(nLEModelLJI);
                boolean zLLIIIILZ = C351220Dpo.LLIIIILZ(nLEModelLJI);
                if (nLETrackLIZ != null || zLLIIIILZ) {
                    nLEModelLJI = NLEModel.dynamicCast(nLEModelLJI.deepClone());
                    if (nLETrackLIZ != null) {
                        C349080DmM.LIZJ(nLEModelLJI);
                    }
                    if (zLLIIIILZ) {
                        VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
                        ArrayList arrayList = new ArrayList();
                        for (NLETrack nLETrack : tracks) {
                            NLETrack nLETrack2 = nLETrack;
                            if (nLETrack2.getTrackType() == NLETrackType.VIDEO || nLETrack2.getTrackType() == NLETrackType.AUDIO) {
                                arrayList.add(nLETrack);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                        }
                        ArrayList<NLETrackSlot> arrayList3 = new ArrayList();
                        for (Object obj : arrayList2) {
                            if (C351220Dpo.LLLIL((NLETrackSlot) obj)) {
                                arrayList3.add(obj);
                            }
                        }
                        for (NLETrackSlot nLETrackSlot : arrayList3) {
                            if (nLETrackSlot != null && (nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) != null && (resource = nLESegmentAudioDynamicCast.getResource()) != null) {
                                resource.setResourceFile((nLETrackSlot == null || (nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment())) == null) ? null : C351220Dpo.LJJLIIIJJI(nLESegmentAudioDynamicCast2));
                            }
                        }
                    }
                }
            } else {
                nLEModelLJI = null;
            }
            C0F5K c0f5k4 = this.LIZ;
            String strVQ2 = c0f5k4.LIZLLL.vQ2(c0f5k4.LJI.LIZ);
            abstractC2217051Bpv.LJIIL(strVQ2, nLEModelLJI, Boolean.FALSE, C294870Bh7.LIZ(this.LIZ.LIZJ) && C0EJ1.LJFF(strVQ2), C1416310mxZ.LJIILJJIL(this.LIZ.LIZJ), C289240BVi.LIZ(this.LIZ.LIZJ) ? "big_caption" : null);
        }
        ArrayList<LanguageDetail> arrayList4 = this.LIZ.LIZLLL.LLILLL;
        if (arrayList4 != null) {
            Iterator<LanguageDetail> it3 = arrayList4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                LanguageDetail next = it3.next();
                if (Intrinsics.LJFF(next.localName, this.LIZ.LJI.LIZ)) {
                    languageDetail = next;
                    break;
                }
            }
            languageDetail = languageDetail;
        }
        LIZ(languageDetail);
    }

    public final void LIZJ() {
        C0F5K c0f5k = this.LIZ;
        List<TextStickerData> list = c0f5k.LJI.LJIIIZ;
        if (list != null) {
            c0f5k.LIZ.KT(list);
        }
        InlineCaptionFragment inlineCaptionFragment = this.LIZ.LIZ;
        inlineCaptionFragment.getClass();
        if (!C0E2B.LIZ()) {
            C786410Ut5.LJZL(0, inlineCaptionFragment.YS());
        }
        this.LIZ.LIZ.RT();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionFragment -> initCaptionDataList == null: ");
        sbLIZ.append(this.LIZ.LJI.LJIIIZ == null);
        C201955140j.LIZJ(c563650M8t, C2188811AlT.LIZIZ(sbLIZ));
        C0F5K c0f5k2 = this.LIZ;
        InlineCaptionFragment inlineCaptionFragment2 = c0f5k2.LIZ;
        C0E48 c0e48 = c0f5k2.LIZIZ;
        inlineCaptionFragment2.LLLII = c0e48 != null ? c0e48.LLLLLLIL() : null;
        C0F5K c0f5k3 = this.LIZ;
        C0F5P c0f5p = c0f5k3.LJI;
        NLETrackSlot nLETrackSlot = c0f5k3.LIZ.LLLII;
        c0f5p.LJI = nLETrackSlot != null ? (nLETrackSlot.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1 : 0L;
        C0F5K c0f5k4 = this.LIZ;
        C0EJ3 c0ej3 = c0f5k4.LJ;
        if (c0ej3 != null) {
            C0E48 c0e482 = c0f5k4.LIZIZ;
            c0ej3.LLLLZIL(c0e482 != null ? C0EJ1.LIZJ(C350870DpF.LJI(c0e482)) : null);
        }
        C0F5K c0f5k5 = this.LIZ;
        List<TextStickerData> list2 = c0f5k5.LJI.LJIIIZ;
        if (list2 != null) {
            c0f5k5.LIZ.GT(list2, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[PHI: r6
      0x0056: PHI (r6v1 boolean) = (r6v0 boolean), (r6v3 boolean) binds: [B:21:0x0053, B:8:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r8 = this;
            X.0F5K r0 = r8.LIZ
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r1 = r0.LIZJ
            r7 = 0
            r4 = 1
            if (r1 == 0) goto L52
            boolean r0 = X.C1416310mxZ.LJIJJ(r1)
            if (r0 != r4) goto L52
            r6 = 1
        Lf:
            boolean r0 = X.C1416310mxZ.LJIIZILJ(r1)
            if (r0 != r4) goto L56
            r5 = 1
        L16:
            X.01GW r0 = X.C257050A5n.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            X.01GW r0 = X.C275390Aqn.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.0E12 r1 = X.C363750ENx.LIZ
            java.lang.String r0 = "has_shown_caption_style_prompt"
            boolean r0 = r1.LIZ(r0, r7)
            if (r6 == 0) goto L51
            if (r5 == 0) goto L51
            if (r3 != 0) goto L40
            if (r2 == 0) goto L51
            if (r0 != 0) goto L51
        L40:
            X.0F5K r0 = r8.LIZ
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r1 = r0.LIZ
            boolean r0 = r1.LLLLLLJ
            if (r0 != 0) goto L51
            r1.PT()
            X.0F5K r0 = r8.LIZ
            com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment r0 = r0.LIZ
            r0.LLLLLLJ = r4
        L51:
            return
        L52:
            r6 = 0
            if (r1 == 0) goto L56
            goto Lf
        L56:
            r5 = 0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0F5A.LIZLLL():void");
    }

    public final void LIZ(LanguageDetail languageDetail) {
        VideoPublishEditModel videoPublishEditModel;
        C01GW<C365830EVx> c01gw = C365830EVx.LIZLLL;
        InterfaceC360730ECh interfaceC360730ECh = C0E46.LIZ().LIZ().LIZ;
        if (((Boolean) C275400Aqo.LIZ.getValue()).booleanValue()) {
            C0E12 c0e12 = C363750ENx.LIZ;
            c0e12.getClass();
            String str = "-1";
            String string = c0e12.LIZ.getString("style_template_res_id", "-1");
            if (string == null) {
                string = "-1";
            }
            if (!Intrinsics.LJFF(string, "-1") && interfaceC360730ECh != null) {
                InlineCaptionFragment inlineCaptionFragment = this.LIZ.LIZ;
                c0e12.getClass();
                String string2 = c0e12.LIZ.getString("style_template_res_id", "-1");
                if (string2 != null) {
                    str = string2;
                }
                inlineCaptionFragment.LLLLJI = new C0FCA(interfaceC360730ECh, str, this.LIZ.LIZ.LLLLL);
                VideoPublishEditModel videoPublishEditModel2 = this.LIZ.LIZJ;
                if (videoPublishEditModel2 != null && C305200Bxm.LIZ(videoPublishEditModel2)) {
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZ);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C0F5N(this, null), 2);
                    return;
                }
                return;
            }
        }
        InlineCaptionFragment inlineCaptionFragment2 = this.LIZ.LIZ;
        if (inlineCaptionFragment2.LLLLJI == null && interfaceC360730ECh != null) {
            inlineCaptionFragment2.LLLLJI = new C0FCA(interfaceC360730ECh, "", this.LIZ.LIZ.LLLLL);
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LIZ.LIZJ;
        if (videoPublishEditModel3 != null && C305200Bxm.LIZ(videoPublishEditModel3)) {
            LifecycleCoroutineScope lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZ);
            C1DFH c1dfh2 = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope2, C2107308Nj.LIZ, null, new C0F5M(this, languageDetail, null), 2);
        } else {
            if (!C305200Bxm.LIZIZ(this.LIZ.LIZJ) || (videoPublishEditModel = this.LIZ.LIZJ) == null || !C1416310mxZ.LJIJJ(videoPublishEditModel) || C363750ENx.LIZIZ("has_use_default_caption_anim")) {
                return;
            }
            LifecycleCoroutineScope lifecycleScope3 = LifecycleOwnerKt.getLifecycleScope(this.LIZ.LIZ);
            C1DFH c1dfh3 = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope3, C2107308Nj.LIZ, null, new C0F5O(this, null), 2);
        }
    }

    public C0F5A(C0F5K c0f5k, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = c0f5k;
        this.LIZIZ = awS549S0100000_5;
    }
}
