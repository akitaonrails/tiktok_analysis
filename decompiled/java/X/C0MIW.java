package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.AISelfModel;
import com.ss.android.ugc.aweme.creative.model.RecordEffectModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SrcImageInfo;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mediaselector.aicontentprotocol.AlbumAiContentService;
import ge.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MIW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MIW extends i<InterfaceC1455840nzK, C566300MIy, C566100MIe, C534660Ky0> implements InterfaceC1455840nzK, InterfaceC379610EuV {
    public static final C566090MId LLJJLIIIJLLLLLLLZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public static final int LLJLIL;
    public static final List<Integer> LLJLILLLLZIIL;
    public final C1DRG LLJILJILJ;
    public final AISelfModel LLJILLL;
    public final String LLJJ;
    public final String LLJJI;
    public final Function0<C566300MIy> LLJJIII;
    public C566300MIy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final C0MIO LLJJJ;
    public final Function0<C566100MIe> LLJJJIL;
    public final Function0<C534660Ky0> LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0MId] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0MIW.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C0MIW.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0)};
        LLJJLIIIJLLLLLLLZ = new Object() { // from class: X.0MId
        };
        LLJLIL = 8;
        LLJLILLLLZIIL = C1697810uHb.LJIILJJIL(4, 3);
    }

    public InterfaceC1455840nzK d5() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJJJJIL.getValue(this, LLJL[1]);
    }

    private final InterfaceC566060MIa T4() {
        return (InterfaceC566060MIa) this.LLJJJJLIIL.getValue();
    }

    private final void Xi() {
        C20736016Cg c20736016Cg;
        C0MIO c0mio;
        C566300MIy c566300MIy = this.LLJJIJI;
        if (c566300MIy == null || (c20736016Cg = c566300MIy.LLJILLL) == null || (c0mio = this.LLJJJ) == null) {
            return;
        }
        c0mio.L90(c20736016Cg, new AwS587S0100000_8(this, 406));
    }

    private final void v5() {
        String str;
        C0MIO c0mio;
        AISelfModel aISelfModel = this.LLJILLL;
        if (!aISelfModel.isUltraFastStyleGeneration) {
            if (!aISelfModel.isUltraFastModelCreation || (str = aISelfModel.taskId) == null || (c0mio = this.LLJJJ) == null) {
                return;
            }
            c0mio.SD0(new C0MID(this), str, C1664590tQ1.LJIIIZ(this), new C0MIS(this), this.LLJILLL.styleId, null);
            return;
        }
        String str2 = aISelfModel.styleId;
        if (str2 != null) {
            C0MIO c0mio2 = this.LLJJJ;
            if (c0mio2 != null) {
                c0mio2.BW1(new C0MIA(this), new C0MIC(this), str2, C1664590tQ1.LJIIIZ(this), new C0MIR(this), new AwS587S0100000_8(this, 407));
            }
            AISelfModel aISelfModel2 = this.LLJILLL;
            D5(aISelfModel2.quota, aISelfModel2.quotaRemain);
        }
    }

    public final IAIMEServices P4() {
        return (IAIMEServices) this.LLJJIJIIJIL.getValue();
    }

    public final C0MIZ Z4() {
        return (C0MIZ) this.LLJJL.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJL[0]);
    }

    private final boolean t5() {
        return C123100dR.LIZ(getEditModel().creativeModel.aiSelfModel.styleVideoResultImage);
    }

    public final void K4() {
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getString(2131825878));
        C1390380mHk.LIZJ(contextLJIIIZ, 6015, creativeToastBuilder);
    }

    public final void O4() {
        String strJ4 = getEditModel().creativeModel.aiSelfModel.isUltraFastModelCreation ? C786410Ut5.j4(new Regex("\\{1\\}").replace(new StringBuilder(C1664590tQ1.LJIIIZ(this).getString(2131825911)), "%s"), Arrays.copyOf(new Object[]{C1664590tQ1.LJIIIZ(this).getString(2131825841)}, 1)) : C1664590tQ1.LJIIIZ(this).getString(2131825877);
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(strJ4);
        C1390380mHk.LIZJ(contextLJIIIZ, 6015, creativeToastBuilder);
    }

    @Override // X.InterfaceC1455840nzK
    public boolean VG0() {
        return T2().LIZ || t5();
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C0MIO c0mio = this.LLJJJ;
        if (c0mio != null) {
            c0mio.n7();
        }
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        if (t5()) {
            return;
        }
        super.show();
        v5();
    }

    @Override // X.InterfaceC1455840nzK
    public Pair<List<Integer>, String> st0() {
        return getEditModel().creativeModel.aiSelfModel.isUltraFastStyleGeneration ? new Pair<>(LLJLILLLLZIIL, C1664590tQ1.LJIIIZ(this).getString(2131825826)) : new Pair<>(LLJLILLLLZIIL, C1664590tQ1.LJIIIZ(this).getString(2131825827));
    }

    public final void x5() {
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getString(2131825944));
        C1390380mHk.LIZJ(contextLJIIIZ, 6015, creativeToastBuilder);
    }

    @Override // ge.i
    public Function0<C566300MIy> E3() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC1664470tPp, X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        d5();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C566100MIe> o2() {
        return this.LLJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C534660Ky0> w2() {
        return this.LLJJJJ;
    }

    private final void n5(List<String> list) {
        String str;
        C1463670oBx c1463670oBx;
        NLETrack mainTrack;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLESegment mainSegment;
        List<String> list2;
        if (!list.isEmpty()) {
            str = (String) C13LP.LJJJJZI(list);
        } else {
            str = "";
        }
        InterfaceC1452170ntP value = JY0().g().getValue();
        NLESegmentVideo nLESegmentVideo = null;
        if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null && (mainTrack = c1463670oBx.LIZJ().getMainTrack()) != null && (slots = mainTrack.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast(mainSegment.deepClone());
            if (nLESegmentVideoDynamicCast != null) {
                NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                if (resource != null) {
                    C2286708xd.LJFF(str, resource.getResourceFile());
                    resource.setResourceFile(str);
                    CanvasVideoData canvasVideoData = getEditModel().getCanvasVideoData();
                    if (canvasVideoData != null && (list2 = canvasVideoData.sourceInfo) != null) {
                        ListProtector.set(list2, 0, str);
                    }
                    ImageAlbumData imageAlbumData = getEditModel().getImageAlbumData();
                    if (imageAlbumData != null) {
                        imageAlbumData.setImageList(Collections.singletonList(new SingleImageData(null, null, new SrcImageInfo(str, (int) resource.getHeight(), (int) resource.getWidth(), null, null, 24, null), null, null, null, null, null, null, null, null, 0, null, null, null, null, false, null, null, null, null, null, false, 8388083, null)));
                    }
                }
                nLESegmentVideo = nLESegmentVideoDynamicCast;
            }
            nLETrackSlot.setMainSegment(nLESegmentVideo);
            C350410DoV.LIZLLL(c1463670oBx.LJ, true, C051R.LIZIZ(new C0E1X(C0E1V.REPLACE.getNameId(), null, null, null, null, 30)), false, true);
        }
    }

    public final void F4(C0MIY c0miy) {
        String str;
        String strLJJLIIIJ;
        List listLJJLIIIJILLIZJL;
        if (C566080MIc.LIZ() && (str = getEditModel().creativeModel.aiSelfModel.styleId) != null) {
            RecordEffectModel recordEffectModel = getEditModel().creativeModel.recordEffectModel;
            String str2 = recordEffectModel.stickerID;
            if (str2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{","}, 0, 6)) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLJJLIIIJILLIZJL) {
                    if (!Intrinsics.LJFF(obj, str)) {
                        arrayList.add(obj);
                    }
                }
                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
            } else {
                strLJJLIIIJ = null;
            }
            recordEffectModel.stickerID = strLJJLIIIJ;
        }
        getEditModel().creativeModel.aiSelfModel.styleId = c0miy.LJIIIIZZ;
        getEditModel().creativeModel.aiSelfModel.styleName = c0miy.LIZJ;
        getEditModel().creativeModel.aiSelfModel.styleIconUri = H4(c0miy.LJI);
        getEditModel().creativeModel.aiSelfModel.styleCustomizedPromptText = c0miy.LIZ;
        getEditModel().creativeModel.aiSelfModel.isChildStyle = Boolean.valueOf(c0miy.LIZLLL);
        getEditModel().creativeModel.aiSelfModel.anchorIconUri = c0miy.LJII;
        getEditModel().creativeModel.aiSelfModel.taskId = c0miy.LIZIZ;
        getEditModel().creativeModel.aiSelfModel.originalEditEffectIds = c0miy.LJIIJ;
        if (!TextUtils.isEmpty(c0miy.LJ)) {
            getEditModel().creativeModel.aiSelfModel.styleParentId = c0miy.LJ;
        }
        if (!TextUtils.isEmpty(c0miy.LJIIIZ)) {
            getEditModel().creativeModel.aiSelfModel.styleResourceId = c0miy.LJIIIZ;
        }
        if (C566080MIc.LIZ()) {
            getEditModel().creativeModel.recordEffectModel.stickerID = C566140MIi.LIZ(getEditModel());
        }
    }

    public final String H4(String str) {
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), getEditModel().getCreativeInfo(), EnumC20228214Cy.CANVAS, null, false, 12);
        String strLIZ = C1449640npK.LIZ(".jpg");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2286708xd.LJFF(str, strLIZIZ);
        return strLIZIZ;
    }

    private final void D5(Integer num, Integer num2) {
        String quantityString;
        if (num2 != null) {
            num2.intValue();
            if (num2.intValue() <= 5) {
                C0MIO c0mio = this.LLJJJ;
                if (c0mio != null) {
                    c0mio.bf0(num2, this.LLJJ);
                }
                Resources resources = C1664590tQ1.LJIIIZ(this).getResources();
                if (resources != null) {
                    quantityString = resources.getQuantityString(2131755093, 2, num, num2);
                } else {
                    quantityString = null;
                }
                Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(quantityString);
                C1390380mHk.LIZJ(contextLJIIIZ, 6015, creativeToastBuilder);
            }
        }
    }

    private final void k5(List<String> list, List<String> list2) {
        C0MIZ c0mizZ4 = Z4();
        if (c0mizZ4 != null) {
            c0mizZ4.za2(list, list2);
        }
    }

    public final void C5(Integer num, Integer num2) {
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(C1664590tQ1.LJIIIZ(this).getString(2131825914, num));
        C1390380mHk.LIZJ(contextLJIIIZ, 6015, creativeToastBuilder);
    }

    public final void E5(List<String> list, List<String> list2, List<String> list3) {
        if (C566070MIb.LIZ() && list.size() > 1) {
            k5(list, list3);
        } else {
            n5(list);
            InterfaceC566060MIa interfaceC566060MIaT4 = T4();
            if (interfaceC566060MIaT4 != null) {
                interfaceC566060MIaT4.vm1(list2);
            }
        }
        String str = getEditModel().creativeModel.aiSelfModel.taskId;
        if (str != null) {
            AlbumAiContentService.LIZ.getClass();
            AlbumAiContentService albumAiContentServiceLIZ = C523440Kfu.LIZ();
            if (albumAiContentServiceLIZ != null) {
                albumAiContentServiceLIZ.LIZ(null, str);
            }
        }
    }

    public C0MIW(C1DRG c1drg, C19A3 c19a3, AISelfModel aISelfModel, String str, String str2) {
        C0MIO c0mioLIZJ;
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = aISelfModel;
        this.LLJJ = str;
        this.LLJJI = str2;
        this.LLJJIII = new AwS552S0100000_8(this, 601);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(278));
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        IAIMEServices iAIMEServicesP4 = P4();
        if (iAIMEServicesP4 != null) {
            c0mioLIZJ = iAIMEServicesP4.LIZJ(c19a3);
        } else {
            c0mioLIZJ = null;
        }
        this.LLJJJ = c0mioLIZJ;
        this.LLJJJIL = AFwS194S0000000_8.get$arr$(279);
        this.LLJJJJ = new AwS552S0100000_8(this, 600);
        this.LLJJJJJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 598));
        this.LLJJL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 599));
    }
}
