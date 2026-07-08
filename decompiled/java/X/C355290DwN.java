package X;

import android.os.Process;
import com.bytedance.ies.nle.editor_jni.NLEAudioBeatTracking;
import com.bytedance.ies.nle.editor_jni.NLEBeatTrackingInfo;
import com.bytedance.ies.nle.editor_jni.NLEBeatTrackingParam;
import com.bytedance.ies.nle.editor_jni.NLEMediaUtil;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.VecNLEBeatTrackingInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.BeatInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.beats.logic.MusicBeatGenerator$generateBeatsFromLocalAlg$2", f = "MusicBeatGenerator.kt", l = {}, m = "invokeSuspend")
public final class C355290DwN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ NLESegmentAudio LL;
    public final /* synthetic */ C355240DwI LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355290DwN(NLESegmentAudio nLESegmentAudio, C355240DwI c355240DwI, String str, InterfaceC1364105Vn<? super C355290DwN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nLESegmentAudio;
        this.LLILLJJLI = c355240DwI;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355290DwN(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String resourceFile;
        long jLLLLLLL;
        Integer numLJ;
        C1C7U.LIZ("MusicBeatGenerator@9595.generateBeatsFromLocalAlg$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        NLEResourceNode resource = this.LL.getResource();
        if (resource == null || (resourceFile = resource.getResourceFile()) == null) {
            resourceFile = "";
        }
        NLEResourceNode resource2 = this.LL.getResource();
        if (resource2 != null) {
            jLLLLLLL = C351220Dpo.LLLLLLL(resource2.getDuration());
        } else {
            jLLLLLLL = 0;
        }
        this.LLILLJJLI.getClass();
        boolean zIs64Bit = Process.is64Bit();
        C0E5P c0e5p = C0E5P.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateBeatsFromLocalAlg: ");
        sbLIZ.append(resourceFile);
        sbLIZ.append("  ");
        sbLIZ.append(jLLLLLLL);
        sbLIZ.append("  ");
        sbLIZ.append(zIs64Bit);
        C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ));
        if (!zIs64Bit && jLLLLLLL > 10000) {
            C13BV c13bv = C13BV.INSTANCE;
            C1C7U.LIZIZ("MusicBeatGenerator@9595.generateBeatsFromLocalAlg$2");
            return c13bv;
        }
        VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo = new VecNLEBeatTrackingInfo();
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            this.LLILLJJLI.LJFF = NLEMediaUtil.createAudioBeatTracking();
            NLEAudioBeatTracking nLEAudioBeatTracking = this.LLILLJJLI.LJFF;
            if (nLEAudioBeatTracking != null) {
                NLEBeatTrackingParam nLEBeatTrackingParam = new NLEBeatTrackingParam();
                String str = this.LLILLL;
                nLEBeatTrackingParam.setFilePath(resourceFile);
                nLEBeatTrackingParam.setModelPath(str);
                nLEBeatTrackingParam.setTrimIn(0L);
                nLEBeatTrackingParam.setTrimOut(jLLLLLLL);
                nLEBeatTrackingParam.setSlice(0L);
                numLJ = C2286608xc.LJ(nLEAudioBeatTracking.process(nLEBeatTrackingParam, vecNLEBeatTrackingInfo));
            } else {
                numLJ = null;
            }
            this.LLILLJJLI.LJFF = null;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("audioBeatsTrackingProgress cost:");
            sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ2.append("  result:");
            sbLIZ2.append(numLJ);
            C356530DyN.LIZ(c0e5p, C2188811AlT.LIZIZ(sbLIZ2));
            for (NLEBeatTrackingInfo nLEBeatTrackingInfo : vecNLEBeatTrackingInfo) {
                arrayList.add(new BeatInfo(C352310DrZ.LIZ(nLEBeatTrackingInfo.getOffset()), nLEBeatTrackingInfo.getBeat(), 0.0f, 1));
            }
            C1C7U.LIZIZ("MusicBeatGenerator@9595.generateBeatsFromLocalAlg$2");
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13BV c13bv2 = C13BV.INSTANCE;
            C1C7U.LIZIZ("MusicBeatGenerator@9595.generateBeatsFromLocalAlg$2");
            return c13bv2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends BeatInfo>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
