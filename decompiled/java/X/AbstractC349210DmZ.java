package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.vesdk.filterparam.VEAudioSamiFilterParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DmZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC349210DmZ extends AbstractC349250Dmd {
    public final List<String> LIZLLL;

    @Override // X.InterfaceC1446570nkN
    public final void LIZ() {
        if (this.LIZIZ == null || ((ArrayList) this.LIZLLL).isEmpty()) {
            return;
        }
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        Iterator it2 = ((ArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            C347470Djl c347470DjlLJIJJ = c348100DkmLIZIZ.LJFF().LJIJJ((String) it2.next());
            if (c347470DjlLJIJJ != null) {
                c348100DkmLIZIZ.LJFF().LJIIIIZZ(c347470DjlLJIJJ);
                this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = false;
            }
        }
        ((ArrayList) this.LIZLLL).clear();
    }

    public final void LJ() {
        if (this.LIZIZ == null) {
            return;
        }
        LIZ();
        VEAudioSamiFilterParam vEAudioSamiFilterParam = new VEAudioSamiFilterParam();
        vEAudioSamiFilterParam.samiType = 2;
        vEAudioSamiFilterParam.samiModelPath = this.LIZJ;
        vEAudioSamiFilterParam.samiParam = "            {\n                \"name\":\"denoise_v2\",\n                \"version\":\"1.0\",\n                \"config\":{\n                    \"denoisemode\":1,\n                    \"denoiserate\":1.0\n                }\n            }";
        C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(this.LIZIZ);
        if (c348100DkmLIZIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        AudioEnhanceParam audioEnhanceParam = this.LIZ.getAudioEnhanceParam();
        String uuid = "";
        if (audioEnhanceParam != null && audioEnhanceParam.getEnableOriginEnhance()) {
            if (this.LIZ.isFastImport()) {
                LJFF(c348100DkmLIZIZ.LIZ.getModel().getMainTrack().getUUID(), c348100DkmLIZIZ, vEAudioSamiFilterParam);
            } else {
                String uuid2 = "";
                for (NLETrack nLETrack : c348100DkmLIZIZ.LIZ.getModel().getTracks()) {
                    if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
                        uuid2 = nLETrack.getUUID();
                    }
                }
                if (uuid2.length() > 0) {
                    LJFF(uuid2, c348100DkmLIZIZ, vEAudioSamiFilterParam);
                }
            }
        }
        AudioEnhanceParam audioEnhanceParam2 = this.LIZ.getAudioEnhanceParam();
        if (audioEnhanceParam2 == null || !audioEnhanceParam2.getEnableMusicEnhance()) {
            return;
        }
        for (NLETrack nLETrack2 : c348100DkmLIZIZ.LIZ.getModel().getTracks()) {
            if (Intrinsics.LJFF(nLETrack2.getExtra("AudioTrackType"), "BGM")) {
                uuid = nLETrack2.getUUID();
            }
        }
        if (uuid.length() > 0) {
            LJFF(uuid, c348100DkmLIZIZ, vEAudioSamiFilterParam);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    @Override // X.InterfaceC1446570nkN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gs() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LIZ
            com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam r0 = r0.getAudioEnhanceParam()
            if (r0 == 0) goto L37
            boolean r1 = X.C349220Dma.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L37
        Lf:
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L22
            X.0ntP r0 = r2.LIZIZ
            if (r0 == 0) goto L44
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LIZ
            boolean r0 = r0.mIsFromDraft
            if (r0 != 0) goto L39
            r0 = 0
            r2.LIZLLL(r0)
        L21:
            return
        L22:
            X.0ntP r0 = r2.LIZIZ
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r2.LIZ
            boolean r0 = r0.mIsFromDraft
            if (r0 == 0) goto L21
            kotlin.jvm.internal.AwS549S0100000_5 r1 = new kotlin.jvm.internal.AwS549S0100000_5
            r0 = 1316(0x524, float:1.844E-42)
            r1.<init>(r2, r0)
            X.C0CNO.LJ(r1)
            return
        L37:
            r0 = 0
            goto Lf
        L39:
            kotlin.jvm.internal.AwS549S0100000_5 r1 = new kotlin.jvm.internal.AwS549S0100000_5
            r0 = 1315(0x523, float:1.843E-42)
            r1.<init>(r2, r0)
            X.C0CNO.LJ(r1)
            return
        L44:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        L4d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC349210DmZ.gs():void");
    }

    public AbstractC349210DmZ(C349280Dmg c349280Dmg) {
        super(c349280Dmg);
        this.LIZLLL = new ArrayList();
    }

    public final void LJFF(String str, C348100Dkm c348100Dkm, VEAudioSamiFilterParam vEAudioSamiFilterParam) {
        C347470Djl c347470Djl = new C347470Djl(NLEEditorJniJNI.NLEFilterName_getAUDIO_SAMI_FILTER());
        c347470Djl.LIZIZ = str;
        c347470Djl.LJIILJJIL = vEAudioSamiFilterParam.samiModelPath;
        c347470Djl.LJIILL = vEAudioSamiFilterParam.samiParam;
        c347470Djl.LJIILIIL = Integer.valueOf(vEAudioSamiFilterParam.samiType);
        String strLJIILL = c348100Dkm.LJFF().LJIILL(str, c347470Djl);
        this.LIZ.creativeModel.audioAlgorithmModel.isDenoiseOn = true;
        ((ArrayList) this.LIZLLL).add(strLJIILL);
    }
}
