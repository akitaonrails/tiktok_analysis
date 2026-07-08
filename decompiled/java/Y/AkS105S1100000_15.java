package Y;

import X.C0VSJ;
import X.C1161920gLG;
import X.C13LP;
import X.C15438062q;
import X.C2188811AlT;
import X.C385080F7y;
import X.C385090F7z;
import X.C915050Zv5;
import X.C917840Zza;
import X.C953760avW;
import X.C953770avX;
import X.InterfaceC1487280oo2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public class AkS105S1100000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS105S1100000_15 akS105S1100000_15, Object obj) {
        C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
        C953770avX c953770avXLJIIIIZZ = c915050Zv5.LIZ().LJIIIIZZ();
        if (c953770avXLJIIIIZZ != null) {
            String str = akS105S1100000_15.s0;
            Long l = (Long) akS105S1100000_15.l1;
            if (Intrinsics.LJFF(c953770avXLJIIIIZZ.LJII, str)) {
                long j = c953770avXLJIIIIZZ.LIZJ;
                if (l != null && l.longValue() == j) {
                    c915050Zv5.LIZ().LJIILIIL(c953770avXLJIIIIZZ.LIZIZ());
                    c915050Zv5.LIZ().LJIILJJIL();
                }
            }
            return c953770avXLJIIIIZZ;
        }
        return null;
    }

    public static final Object apply$1(AkS105S1100000_15 akS105S1100000_15, Object obj) {
        VecNLETrackSPtr tracks;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        String first;
        int iIntValue;
        NLEEditor nLEEditor = new NLEEditor();
        nLEEditor.restore(((C953770avX) akS105S1100000_15.l1).LJIIJ);
        nLEEditor.commit();
        nLEEditor.done();
        ArrayList arrayList = new ArrayList();
        NLEModel model = nLEEditor.getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getExtraTrackType() == NLETrackType.STICKER) {
                    arrayList2.add(nLETrack);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (NLETrack nLETrack2 : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSlots());
                if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                    C385090F7z c385090F7z = NLETextRichContent.Companion;
                    String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
                    c385090F7z.getClass();
                    NLETextRichContent nLETextRichContentLIZ = C385090F7z.LIZ(richContent);
                    C385080F7y c385080F7y = nLETextRichContentLIZ.richTextData;
                    String str = c385080F7y.textStr;
                    Pair<String, String> pair = c385080F7y.font;
                    if (pair == null || (first = pair.getFirst()) == null) {
                        first = "";
                    }
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    List<Float> list = nLETextRichContentLIZ.richTextData.textColor;
                    multiCanvasUtils.getClass();
                    Integer numLJIJJ = MultiCanvasUtils.LJIJJ(list);
                    if (numLJIJJ != null) {
                        iIntValue = numLJIJJ.intValue();
                    } else {
                        iIntValue = C953770avX.LJIILL;
                    }
                    arrayList.add(new CloudDraftItemManager.Label(nLETrackSlot.getTransformX(), nLETrackSlot.getTransformY(), nLETrackSlot.getRotation(), iIntValue, str, nLETrack2.getLayer(), first, nLETrackSlot.getScale()));
                } else {
                    nLESegmentTextStickerDynamicCast = null;
                }
                arrayList3.add(nLESegmentTextStickerDynamicCast);
            }
        }
        return new CloudDraftItemManager.CloudDraftConfig(akS105S1100000_15.s0, arrayList);
    }

    public static final Object apply$2(AkS105S1100000_15 akS105S1100000_15, Object obj) throws Throwable {
        Pair pair = (Pair) obj;
        C0VSJ c0vsj = new C0VSJ(((C953770avX) akS105S1100000_15.l1).LIZLLL);
        IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cloud/");
        sbLIZ.append(akS105S1100000_15.s0);
        sbLIZ.append("/background.png");
        File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), true);
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        CloudDraftItemManager.LIZJ(c0vsj.getAbsolutePath(), fileFM2.getAbsolutePath());
        C0VSJ c0vsj2 = new C0VSJ(((C953770avX) akS105S1100000_15.l1).LJ);
        IHostMultiCanvas iHostMultiCanvas2 = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cloud/");
        sbLIZ2.append(akS105S1100000_15.s0);
        sbLIZ2.append("/cover.png");
        File fileFM22 = iHostMultiCanvas2.fM2(C2188811AlT.LIZIZ(sbLIZ2), true);
        CloudDraftItemManager.LIZJ(c0vsj2.getAbsolutePath(), fileFM22.getAbsolutePath());
        return new C917840Zza(fileFM2.getAbsolutePath(), fileFM22.getAbsolutePath(), (String) pair.getFirst(), (CloudDraftItemManager.CloudDraftConfig) pair.getSecond(), CloudDraftItemManager.LIZLLL(fileFM22.getAbsolutePath()), akS105S1100000_15.s0);
    }

    public static final Object apply$3(AkS105S1100000_15 akS105S1100000_15, Object obj) {
        VecNLETrackSPtr tracks;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        String first;
        int iIntValue;
        ArrayList arrayList = new ArrayList();
        NLEModel model = ((NLEEditor) akS105S1100000_15.l1).getModel();
        if (model != null && (tracks = model.getTracks()) != null) {
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getExtraTrackType() == NLETrackType.STICKER) {
                    arrayList2.add(nLETrack);
                }
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (NLETrack nLETrack2 : arrayList2) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrack2.getSlots());
                if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                    C385090F7z c385090F7z = NLETextRichContent.Companion;
                    String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
                    c385090F7z.getClass();
                    NLETextRichContent nLETextRichContentLIZ = C385090F7z.LIZ(richContent);
                    C385080F7y c385080F7y = nLETextRichContentLIZ.richTextData;
                    String str = c385080F7y.textStr;
                    Pair<String, String> pair = c385080F7y.font;
                    if (pair == null || (first = pair.getFirst()) == null) {
                        first = "";
                    }
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    List<Float> list = nLETextRichContentLIZ.richTextData.textColor;
                    multiCanvasUtils.getClass();
                    Integer numLJIJJ = MultiCanvasUtils.LJIJJ(list);
                    if (numLJIJJ != null) {
                        iIntValue = numLJIJJ.intValue();
                    } else {
                        iIntValue = C953770avX.LJIILL;
                    }
                    arrayList.add(new CloudDraftItemManager.Label(nLETrackSlot.getTransformX(), nLETrackSlot.getTransformY(), nLETrackSlot.getRotation(), iIntValue, str, nLETrack2.getLayer(), first, nLETrackSlot.getScale()));
                } else {
                    nLESegmentTextStickerDynamicCast = null;
                }
                arrayList3.add(nLESegmentTextStickerDynamicCast);
            }
        }
        return new CloudDraftItemManager.CloudDraftConfig(akS105S1100000_15.s0, arrayList);
    }

    public static final Object apply$4(AkS105S1100000_15 akS105S1100000_15, Object obj) throws Throwable {
        Pair pair = (Pair) obj;
        C0VSJ c0vsj = new C0VSJ(((C953770avX) akS105S1100000_15.l1).LIZLLL);
        IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Cloud/");
        sbLIZ.append(akS105S1100000_15.s0);
        sbLIZ.append("/background.png");
        File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), true);
        BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
        CloudDraftItemManager.LIZJ(c0vsj.getAbsolutePath(), fileFM2.getAbsolutePath());
        C0VSJ c0vsj2 = new C0VSJ(((C953770avX) akS105S1100000_15.l1).LJ);
        IHostMultiCanvas iHostMultiCanvas2 = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Cloud/");
        sbLIZ2.append(akS105S1100000_15.s0);
        sbLIZ2.append("/cover.png");
        File fileFM22 = iHostMultiCanvas2.fM2(C2188811AlT.LIZIZ(sbLIZ2), true);
        CloudDraftItemManager.LIZJ(c0vsj2.getAbsolutePath(), fileFM22.getAbsolutePath());
        return new C917840Zza(fileFM2.getAbsolutePath(), fileFM22.getAbsolutePath(), (String) pair.getFirst(), (CloudDraftItemManager.CloudDraftConfig) pair.getSecond(), CloudDraftItemManager.LIZLLL(fileFM22.getAbsolutePath()), akS105S1100000_15.s0);
    }

    public AkS105S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
