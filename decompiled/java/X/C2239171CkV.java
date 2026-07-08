package X;

import Y.AObjectS58S0000000_5;
import com.bytedance.ies.cutsame.cut_android.NLETemplateSource;
import com.bytedance.ies.cutsame.downloaderv2.IWuZhuiDownloader;
import com.bytedance.ies.cutsame.source.api.AfrApi;
import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import com.bytedance.ies.nle.editor_jni.DynamicLightWaveUtil;
import com.bytedance.ies.nle.editor_jni.NLEModelDownloader;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1CkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2239171CkV implements InterfaceC357410Dzn {
    public final InterfaceC2239231Ckb LIZ;
    public final NLEModelDownloader LIZIZ;
    public final AfrApi LIZJ;
    public final IWuZhuiDownloader LIZLLL;
    public AnonymousClass0956 LJ;
    public PthreadTimer LJFF;
    public int LJI;
    public NLETemplateSource LJIIIIZZ;
    public String LJII = "";
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AObjectS58S0000000_5(3));

    @Override // X.InterfaceC357410Dzn
    public final void cancelCompile() {
        PthreadTimer pthreadTimer = this.LJFF;
        if (pthreadTimer != null) {
            pthreadTimer.cancel();
        }
        this.LJFF = null;
        C2239211CkZ c2239211CkZ = C2239241Ckc.LIZ;
        if (c2239211CkZ != null) {
            c2239211CkZ.LIZ();
        }
        C353010Dsh c353010Dsh = (C353010Dsh) this.LJIIIZ.getValue();
        c353010Dsh.LIZ = true;
        C352570Drz c352570Drz = c353010Dsh.LIZIZ;
        if (c352570Drz != null) {
            c352570Drz.LIZ();
        }
        AnonymousClass0956 anonymousClass0956 = this.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (this.LJII.length() != 0) {
            C0VSJ c0vsj = new C0VSJ(this.LJII);
            if (c0vsj.exists() && c0vsj.isFile()) {
                c0vsj.delete();
            }
        }
    }

    @Override // X.InterfaceC357410Dzn
    public final void clear() {
        C2239211CkZ c2239211CkZ = C2239241Ckc.LIZ;
        if (c2239211CkZ != null) {
            ((DynamicLightWaveUtil) c2239211CkZ.LJ.getValue()).destroy();
        }
        NLETemplateSource nLETemplateSource = this.LJIIIIZZ;
        if (nLETemplateSource != null) {
            nLETemplateSource.LIZLLL();
        }
        this.LJIIIIZZ = null;
    }

    public static boolean LIZJ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && c0vsj.isFile() && c0vsj.length() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC357410Dzn
    public final void LIZ(NLETemplateModel nLETemplateModel, C357460Dzs c357460Dzs) {
        VecString processor;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceAV aVFile;
        String resourceFile;
        VecNLETrackSPtr tracks = nLETemplateModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
            if (nLETrackSlot != null && (processor = nLETrackSlot.getProcessor()) != null && !processor.isEmpty() && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null && (resourceFile = aVFile.getResourceFile()) != null && (!a0.LJJJIL(resourceFile))) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            c357460Dzs.LIZ(nLETemplateModel);
        } else {
            this.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2239141CkS(arrayList2, this, c357460Dzs, nLETemplateModel, null), 2);
        }
    }

    public final String LJ(String str, ProcessorConfig processorConfig) {
        String str2;
        String strLJ = this.LIZ.LJ();
        String str3 = "";
        String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(C20130113pb.LJ(new C0VSJ(str)), ":", "_", false), ";", "", false);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(strLJJIFFI);
        sbLIZ.append(processorConfig.algorithm);
        sbLIZ.append(processorConfig.conf);
        String strLIZJ = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        if (processorConfig.outputType == 1) {
            str2 = ".png";
        } else {
            str2 = ".mp4";
        }
        if (!u.LJIIZILJ(strLJ, "/", false)) {
            str3 = "/";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLJ);
        sbLIZ2.append(str3);
        sbLIZ2.append(strLIZJ);
        sbLIZ2.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static NLERenderProxySegment LJFF(String str, String str2, ProcessorConfig processorConfig) {
        NLERenderProxySegment nLERenderProxySegment = new NLERenderProxySegment();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(str);
        nLERenderProxySegment.setRenderConfigRes(nLEResourceNode);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceFile(str2);
        if (processorConfig.outputType == 1) {
            nLEResourceAV.setResourceType(NLEResType.IMAGE);
        } else {
            C2229251CMx c2229251CMxLIZIZ = C2229261CMy.LIZIZ(str2);
            Pair pairLIZJ = C2229261CMy.LIZJ(c2229251CMxLIZIZ);
            int iIntValue = ((Number) pairLIZJ.getFirst()).intValue();
            int iIntValue2 = ((Number) pairLIZJ.getSecond()).intValue();
            nLEResourceAV.setDuration(C352310DrZ.LIZJ(c2229251CMxLIZIZ.LJ));
            nLEResourceAV.setWidth(iIntValue);
            nLEResourceAV.setHeight(iIntValue2);
            nLEResourceAV.setResourceType(NLEResType.VIDEO);
        }
        nLERenderProxySegment.setAVFile(nLEResourceAV);
        return nLERenderProxySegment;
    }

    @Override // X.InterfaceC357410Dzn
    public final void LIZIZ(String str, String str2, InterfaceC20343514iv interfaceC20343514iv) {
        this.LJII = "";
        this.LJ = C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C2239181CkW(this, str2, str, interfaceC20343514iv, null), 2);
    }

    public C2239171CkV(InterfaceC2239231Ckb interfaceC2239231Ckb, NLEModelDownloader nLEModelDownloader, AfrApi afrApi, IWuZhuiDownloader iWuZhuiDownloader) {
        this.LIZ = interfaceC2239231Ckb;
        this.LIZIZ = nLEModelDownloader;
        this.LIZJ = afrApi;
        this.LIZLLL = iWuZhuiDownloader;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x036f  */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.14iw] */
    /* JADX WARN: Type inference failed for: r10v12, types: [X.14iv, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v7, types: [X.09bI] */
    /* JADX WARN: Type inference failed for: r15v4, types: [X.05Vn] */
    /* JADX WARN: Type inference failed for: r15v5, types: [X.05Vn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(final java.lang.String r23, java.lang.String r24, com.bytedance.ies.cutsame.source.model.ProcessorConfig r25, X.InterfaceC20343514iv r26, kotlin.jvm.functions.Function1<? super X.C2239221Cka, kotlin.Unit> r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2239171CkV.LIZLLL(java.lang.String, java.lang.String, com.bytedance.ies.cutsame.source.model.ProcessorConfig, X.14iv, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }
}
