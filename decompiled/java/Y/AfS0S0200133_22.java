package Y;

import X.C09JN;
import X.C0F3X;
import X.C1456980o1A;
import X.C1458080o2w;
import X.C1458390o3R;
import X.C1458840o4A;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResultForServer;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AutoApplyMusicResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class AfS0S0200133_22 implements C09JN {
    public final int $t;
    public double d3;
    public double d4;
    public double d5;
    public float f6;
    public float f7;
    public float f8;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS0S0200133_22 afS0S0200133_22, Object obj) {
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader$Companion@d094.startAedCheckByServer$1");
        AutoApplyMusicResponse autoApplyMusicResponse = (AutoApplyMusicResponse) obj;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) afS0S0200133_22.l0;
        long j = afS0S0200133_22.j2;
        double d = afS0S0200133_22.d3;
        double d2 = afS0S0200133_22.d4;
        float f = afS0S0200133_22.f6;
        float f2 = afS0S0200133_22.f7;
        float f3 = afS0S0200133_22.f8;
        double d3 = afS0S0200133_22.d5;
        Function1 function1 = (Function1) afS0S0200133_22.l1;
        String str = C1458080o2w.LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aedCheckByServerResult: ");
        sbLIZ.append(autoApplyMusicResponse);
        sbLIZ.append(", cost:");
        sbLIZ.append(System.currentTimeMillis() - j);
        C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        C1458080o2w.LJIILIIL = autoApplyMusicResponse;
        C1458080o2w.LJIILJJIL = false;
        C1456980o1A.LJ(j, d, d2, autoApplyMusicResponse, false);
        if (Intrinsics.LJFF(autoApplyMusicResponse.needAutoApplyMusic, Boolean.TRUE)) {
            C0F3X c0f3x = C0F3X.SUCCESS;
            C1458080o2w.LJIIL = c0f3x;
            if (function1 != null) {
                function1.invoke(c0f3x);
            }
            C1456980o1A.LIZ(c0f3x);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("aedCheckByServerResult callback invoked end, lastAed=");
            sbLIZ2.append(C1458080o2w.LJIIL);
            C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ2));
        } else {
            C0F3X c0f3x2 = C0F3X.TAKING;
            C1458080o2w.LJIIL = c0f3x2;
            if (autoApplyMusicResponse.status_code != 0) {
                if (f2 < d3 && f < d3 && f3 < d3) {
                    C0F3X c0f3x3 = C0F3X.SUCCESS;
                    C1458080o2w.LJIIL = c0f3x3;
                    if (function1 != null) {
                        function1.invoke(c0f3x3);
                    }
                    C1456980o1A.LIZ(c0f3x3);
                } else {
                    C1456980o1A.LIZ(c0f3x2);
                }
            } else {
                if (function1 != null) {
                    function1.invoke(c0f3x2);
                }
                C1456980o1A.LIZ(c0f3x2);
                if (videoPublishEditModel != null) {
                    C1458390o3R.LIZ.getClass();
                    C1458390o3R.LJIJJ(C1458390o3R.LJIIJ, videoPublishEditModel, false);
                }
            }
        }
        C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader$Companion@d094.startAedCheckByServer$1");
    }

    public static final void accept$1(AfS0S0200133_22 afS0S0200133_22, Object obj) {
        C1C7U.LIZ("StaticImageVideoAutoMusicLoader$Companion@d094.startAedCheckByServer$2");
        Throwable th = (Throwable) obj;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) afS0S0200133_22.l0;
        long j = afS0S0200133_22.j2;
        double d = afS0S0200133_22.d3;
        double d2 = afS0S0200133_22.d4;
        float f = afS0S0200133_22.f6;
        float f2 = afS0S0200133_22.f7;
        float f3 = afS0S0200133_22.f8;
        double d3 = afS0S0200133_22.d5;
        Function1 function1 = (Function1) afS0S0200133_22.l1;
        C0F3X c0f3x = C0F3X.TAKING;
        C1458080o2w.LJIIL = c0f3x;
        boolean zLJFF = Intrinsics.LJFF(th.getMessage(), C1458080o2w.LJIILLIIL);
        String str = C1458080o2w.LJIIZILJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aedCheckByServerError: ");
        sbLIZ.append(th);
        sbLIZ.append(", cost:");
        sbLIZ.append(System.currentTimeMillis() - j);
        sbLIZ.append(", isTimeout:");
        sbLIZ.append(zLJFF);
        sbLIZ.append(", lastTimeout:");
        sbLIZ.append(C1458080o2w.LJIILJJIL);
        C201955140j.LJIILIIL(str, C2188811AlT.LIZIZ(sbLIZ));
        if (zLJFF) {
            C1458080o2w.LJIILJJIL = true;
            VoiceDetectionResultForServer voiceDetectionResultForServer = new VoiceDetectionResultForServer(1, 1, 0, System.currentTimeMillis() - j, null, null, null, null);
            C1458840o4A.LIZ.getClass();
            C1458840o4A.LIZ(voiceDetectionResultForServer);
            C1456980o1A.LIZLLL(videoPublishEditModel, f, f2, f3, d3, function1);
            if (f2 < d3 && f < d3 && f3 < d3) {
                C0F3X c0f3x2 = C0F3X.SUCCESS;
                C1458080o2w.LJIIL = c0f3x2;
                C1456980o1A.LIZ(c0f3x2);
            } else {
                C1456980o1A.LIZ(c0f3x);
            }
        } else {
            C1458080o2w.LJIILJJIL = false;
            VoiceDetectionResultForServer voiceDetectionResultForServer2 = new VoiceDetectionResultForServer(0, -1, -1, System.currentTimeMillis() - j, Double.valueOf(d), Double.valueOf(d2), null, null);
            C1458840o4A.LIZ.getClass();
            C1458840o4A.LIZ(voiceDetectionResultForServer2);
            C201955140j.LJIILIIL(str, "processAedFail");
            if (function1 != null) {
                function1.invoke(c0f3x);
            }
            if (videoPublishEditModel != null) {
                C1458390o3R.LIZ.getClass();
                C1458390o3R.LJIJJ(C1458390o3R.LJIIJ, videoPublishEditModel, false);
            }
            C1456980o1A.LIZ(c0f3x);
        }
        C1C7U.LIZIZ("StaticImageVideoAutoMusicLoader$Companion@d094.startAedCheckByServer$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0013: IPUT (r14 I:java.lang.Object), (r0 I:Y.AfS0S0200133_22) (LINE:167772179) Y.AfS0S0200133_22.l1 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0007: IPUT (r5 I:double), (r0 I:Y.AfS0S0200133_22) (LINE:167772167) Y.AfS0S0200133_22.d3 double, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0009: IPUT (r7 I:double), (r0 I:Y.AfS0S0200133_22) (LINE:167772169) Y.AfS0S0200133_22.d4 double, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x000b: IPUT (r9 I:float), (r0 I:Y.AfS0S0200133_22) (LINE:167772171) Y.AfS0S0200133_22.f6 float, block:B:2:0x0000 */
    public AfS0S0200133_22(VideoPublishEditModel videoPublishEditModel, VideoPublishEditModel videoPublishEditModel2, long j, double d, double d2, float f, float f2, float f3, double d3, Function1<? super C0F3X, Unit> function1) {
        double d4;
        double d5;
        float f4;
        Object obj;
        this.$t = function1;
        this.l0 = videoPublishEditModel;
        this.j2 = videoPublishEditModel2;
        this.d3 = d4;
        this.d4 = d5;
        this.f6 = f4;
        this.f7 = f;
        this.f8 = f2;
        this.d5 = f3;
        this.l1 = obj;
    }
}
