package X;

import Y.AfS109S0300000_15;
import Y.AkS199S0300000_15;
import Y.AkS324S0200000_15;
import Y.AkS36S0500000_15;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.EditEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.live.liveinteract.multilive.model.LangTranslate;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateInfo;
import com.bytedance.android.live.liveinteract.multilive.model.StarlingTranslateResponse;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.0bNO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971040bNO implements InterfaceC971180bNc {
    public final InterfaceC971000bNK LIZ;
    public NLEEditor LIZIZ;
    public C1463860oCG LIZJ;
    public C971070bNR LIZLLL;
    public C953770avX LJ;
    public boolean LJFF;
    public C953100auS LJI;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public final List<InterfaceC915550Zvt> LJIIJJI;
    public C916750Zxp LJII = new C916750Zxp(2, 0, "");
    public List<C970190bM1> LJIIIZ = new ArrayList();

    public final NLETrackSlot LIZIZ() {
        NLEModel model;
        VecNLETrackSPtr tracks;
        NLETrack next;
        VecNLETrackSlotSPtr slots;
        C953770avX c953770avX;
        List<C971360bNu> list;
        int i = C953770avX.LJIILL;
        C953770avX c953770avXLIZ = C971350bNt.LIZ();
        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
        C971360bNu c971360bNu = (C971360bNu) C13LP.LJJJLZIJ(0, c953770avXLIZ.LJI);
        NLEEditor nLEEditor = this.LIZIZ;
        multiCanvasUtils.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = MultiCanvasUtils.LIZIZ(c971360bNu, nLEEditor, 0.5f, 0.5f, false, 0.0f, 1.0f, -1);
        if (C13LP.LJJJLZIJ(0, c953770avXLIZ.LJI) != null && nLETrackSlotLIZIZ != null) {
            nLETrackSlotLIZIZ.getUUID();
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, c953770avXLIZ.LJI);
        if (objLJJJLZIJ != null && (c953770avX = this.LJ) != null && (list = c953770avX.LJI) != null) {
            list.add((C971360bNu) objLJJJLZIJ);
        }
        NLEEditor nLEEditor2 = this.LIZIZ;
        if (nLEEditor2 == null || (model = nLEEditor2.getModel()) == null || (tracks = model.getTracks()) == null) {
            return null;
        }
        Iterator<NLETrack> it2 = tracks.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (next.getExtraTrackType() == NLETrackType.STICKER) {
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack == null || (slots = nLETrack.getSlots()) == null) {
            return null;
        }
        return (NLETrackSlot) C13LP.LJJJLZIJ(0, slots);
    }

    public final void LIZLLL() {
        DataChannel dataChannel;
        C953770avX c953770avX = this.LJ;
        if (c953770avX != null) {
            int i = c953770avX.LJIIIIZZ;
            if (i == 5 || i == 4 || i == 2) {
                C953100auS c953100auS = this.LJI;
                if (c953100auS != null && (dataChannel = c953100auS.LIZIZ) != null) {
                    dataChannel.FQ2(EditEvent.class);
                }
                c953770avX.LJIIIIZZ = 1;
            }
        }
    }

    public final List<NLETrackSlot> LJI() {
        NLEModel model;
        VecNLETrackSPtr tracks;
        Object objLJJJLZIJ;
        ArrayList arrayList = new ArrayList();
        NLEEditor nLEEditor = this.LIZIZ;
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null && (tracks = model.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getExtraTrackType() == NLETrackType.STICKER && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null) {
                    arrayList.add(objLJJJLZIJ);
                }
            }
        }
        return arrayList;
    }

    public final void LJIIJJI() {
        String str;
        C953770avX c953770avX = this.LJ;
        if (c953770avX == null || (str = c953770avX.LJII) == null || !MultiguestNoticeboardV2Setting.INSTANCE.templateEnable() || !C1533950q1J.LJ(str)) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(str, ((C970190bM1) it2.next()).LIZ.mediaNodeId)) {
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.LIZ.LJJLIIIJILLIZJL();
    }

    public final void LJIIZILJ() {
        int templateQuickSelectMaxCount = MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplateQuickSelectMaxCount();
        C953230auf.LIZ.getClass();
        List listLJLIL = C13LP.LJLIL(C13LP.LL(C953230auf.LIZJ, templateQuickSelectMaxCount - Math.min(templateQuickSelectMaxCount, C953230auf.LIZIZ.size())), C13LP.LL(C953230auf.LIZIZ, templateQuickSelectMaxCount));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : (ArrayList) listLJLIL) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            C953230auf.LIZ.getClass();
            C953230auf.LIZIZ.size();
            arrayList.add(new C970190bM1((NoticeboardTemplate) obj));
            i = i2;
        }
        this.LJIIIZ = arrayList;
        this.LIZ.LJJJJLI();
    }

    public C971040bNO(InterfaceC971000bNK interfaceC971000bNK) {
        this.LIZ = interfaceC971000bNK;
        C954080aw2 c954080aw2 = C954080aw2.LIZJ;
        if (!C954080aw2.LIZLLL) {
            MultiCanvasUtils.LIZ.getClass();
            C954080aw2.LIZLLL = MultiCanvasUtils.LJIL(2, false);
        }
        this.LJIIJJI = new ArrayList();
    }

    public final void LJ(NLEEditor nLEEditor) {
        String uuid;
        NLEBranch branch;
        NLECommit head;
        nLEEditor.commit();
        C953770avX c953770avX = this.LJ;
        if (c953770avX != null) {
            NLEEditor nLEEditor2 = this.LIZIZ;
            if (nLEEditor2 == null || (branch = nLEEditor2.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
                uuid = "";
            }
            c953770avX.LJII = uuid;
        }
        LJIIJJI();
        this.LJFF = false;
    }

    public final C971330bNr LJFF(MotionEvent motionEvent) {
        C971330bNr c971330bNr = null;
        for (C971330bNr c971330bNr2 : this.LIZ.LJJJJ()) {
            if (c971330bNr2.LIZIZ.getEnable()) {
                MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                C971380bNw c971380bNw = c971330bNr2.LIZ;
                c971380bNw.getDetectiveView();
                multiCanvasUtils.getClass();
                if (MultiCanvasUtils.LJIILL(motionEvent, c971380bNw) && (c971330bNr == null || c971330bNr2.LIZIZ.getTransformZ() > c971330bNr.LIZIZ.getTransformZ())) {
                    c971330bNr = c971330bNr2;
                }
            }
        }
        return c971330bNr;
    }

    public final Bitmap LJII(int i) {
        Bitmap bitmapLJIIIIZZ = null;
        if (i < 0) {
            return null;
        }
        SurfaceView surfaceViewLJJIIJZLJL = this.LIZ.LJJIIJZLJL();
        if (surfaceViewLJJIIJZLJL != null) {
            MultiCanvasUtils.LIZ.getClass();
            bitmapLJIIIIZZ = MultiCanvasUtils.LJIIIIZZ(surfaceViewLJJIIJZLJL);
        }
        MultiCanvasUtils.LIZ.getClass();
        if (!MultiCanvasUtils.LJIIZILJ(bitmapLJIIIIZZ)) {
            return LJII(i - 1);
        }
        return bitmapLJIIIIZZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.RectF LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r8) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C971040bNO.LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot):android.graphics.RectF");
    }

    public final boolean LJIIIZ(C953770avX c953770avX) {
        if (!Intrinsics.LJFF(c953770avX, this.LJ)) {
            return false;
        }
        Long l = c953770avX.LJIIL;
        if (l != null) {
            String str = c953770avX.LJII;
            C953230auf c953230auf = C953230auf.LIZ;
            long jLongValue = l.longValue();
            c953230auf.getClass();
            if (Intrinsics.LJFF(str, C953230auf.LJI(jLongValue))) {
                return false;
            }
        }
        return true;
    }

    public final boolean LJIIJ(C953770avX c953770avX) {
        EnumC952890au7 enumC952890au7;
        if (!MultiguestNoticeboardV2Setting.INSTANCE.templateEnable()) {
            return false;
        }
        C953100auS c953100auS = this.LJI;
        if (c953100auS != null) {
            enumC952890au7 = c953100auS.LIZJ;
        } else {
            enumC952890au7 = null;
        }
        if (enumC952890au7 == EnumC952890au7.PLAYBOOK_EDIT) {
            Long l = c953770avX.LJIIL;
            if (l == null) {
                return true;
            }
            long jLongValue = l.longValue();
            String str = c953770avX.LJII;
            C953230auf.LIZ.getClass();
            if (Intrinsics.LJFF(str, C953230auf.LJI(jLongValue))) {
                return false;
            }
            return true;
        }
        if (!this.LJIIIIZZ || !LJIIIZ(c953770avX)) {
            return false;
        }
        return true;
    }

    public final void LJIIL(boolean z) {
        INLEMediaSettings mediaSettingApi;
        INLEPlayer playerApi;
        INLEMediaSettings mediaSettingApi2;
        INLEPlayer playerApi2;
        if (z) {
            C1463860oCG c1463860oCG = this.LIZJ;
            if (c1463860oCG != null && (playerApi2 = c1463860oCG.getPlayerApi()) != null) {
                ((C389960FQs) playerApi2).setEnableDirectRenderMode(true);
            }
            C1463860oCG c1463860oCG2 = this.LIZJ;
            if (c1463860oCG2 != null && (mediaSettingApi2 = c1463860oCG2.getMediaSettingApi()) != null) {
                ((C1463880oCI) mediaSettingApi2).setPreviewFps(60, true);
                return;
            }
            return;
        }
        C1463860oCG c1463860oCG3 = this.LIZJ;
        if (c1463860oCG3 != null && (playerApi = c1463860oCG3.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).setEnableDirectRenderMode(false);
        }
        C1463860oCG c1463860oCG4 = this.LIZJ;
        if (c1463860oCG4 == null || (mediaSettingApi = c1463860oCG4.getMediaSettingApi()) == null) {
            return;
        }
        ((C1463880oCI) mediaSettingApi).setPreviewFps(-1);
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [T, java.util.ArrayList] */
    public final void LJIILIIL(C953770avX c953770avX) {
        Long l;
        C953770avX c953770avX2;
        final C953770avX c953770avX3 = c953770avX;
        if (this.LJIIJ) {
            return;
        }
        this.LJIIJ = true;
        C953230auf.LIZ.getClass();
        if (C953230auf.LJIIJJI()) {
            if (c953770avX3 == null) {
                c953770avX2 = this.LJ;
                if (c953770avX2 != null) {
                }
            } else {
                c953770avX2 = c953770avX3;
            }
            if (LJIIIZ(c953770avX2)) {
                final C954060aw0 c954060aw0 = (C954060aw0) C954080aw2.LIZJ.LIZ.getValue();
                final InterfaceC971000bNK interfaceC971000bNK = this.LIZ;
                final C953100auS c953100auS = this.LJI;
                if (c953770avX3 == null) {
                    c953770avX3 = this.LJ;
                }
                C971130bNX c971130bNX = new C971130bNX(this);
                C971030bNN c971030bNN = new C971030bNN(this);
                C971020bNM c971020bNM = new C971020bNM(this);
                final AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(this, 1207);
                c954060aw0.getClass();
                if (c953770avX3 != null) {
                    final Context contextLJIL = interfaceC971000bNK.LJIL();
                    c953770avX3.LJI.clear();
                    for (C971330bNr c971330bNr : interfaceC971000bNK.LJJJJ()) {
                        c953770avX3.LJI.add(c971330bNr.LIZJ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("viewModelList text: ");
                        sbLIZ.append(c971330bNr.LIZJ.LIZ);
                        C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ));
                    }
                    List<C971360bNu> list = c953770avX3.LJI;
                    ArrayList arrayList = new ArrayList();
                    for (C971360bNu c971360bNu : list) {
                        if (c971360bNu.LIZ.length() > 0) {
                            arrayList.add(c971360bNu);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((C971360bNu) it2.next()).LIZ);
                    }
                    final ArrayList arrayList3 = new ArrayList(arrayList2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("get starlingKeyList, draftItemSaved.textList = ");
                    sbLIZ2.append(c953770avX3.LJI);
                    C20441214yg.LIZIZ("starling_template", C2188811AlT.LIZIZ(sbLIZ2));
                    final ArrayList arrayList4 = new ArrayList();
                    final C259800zU c259800zU = new C259800zU();
                    c259800zU.element = new ArrayList();
                    final C259800zU c259800zU2 = new C259800zU();
                    final C118300cf c118300cf = new C118300cf();
                    c118300cf.element = 2;
                    c954060aw0.LIZ = (C19487111Lx) new C11QI(AbstractC19484711Kz.LJII(new C987160bnO(c971130bNX, c953770avX3, 0)).LJJIJIIJI(C11S5.LIZ()).LJIIZILJ(new AkS199S0300000_15(contextLJIL, c954060aw0, arrayList3, 2)).LJIL(new InterfaceC1487280oo2() { // from class: X.0bNs
                        /* JADX WARN: Type inference failed for: r4v1, types: [T, java.lang.Object, java.util.ArrayList] */
                        @Override // X.InterfaceC1487280oo2
                        public final Object apply(Object obj) {
                            List<StarlingTranslateInfo> list2;
                            StarlingTranslateInfo next;
                            String str;
                            NLECommit head;
                            String uuid;
                            VecNLETrackSPtr tracks;
                            NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
                            List<LangTranslate> list3;
                            LangTranslate langTranslate;
                            StarlingTranslateResponse.ResponseData responseData;
                            Pair pair = (Pair) obj;
                            C953770avX c953770avX4 = (C953770avX) pair.getFirst();
                            BaseResponse baseResponse = (BaseResponse) pair.getSecond();
                            c954060aw0.LIZ(contextLJIL, "step 2/5", "translating draftItem start", false);
                            if (baseResponse != null && (responseData = (StarlingTranslateResponse.ResponseData) baseResponse.data) != null) {
                                list2 = responseData.starlingTranslateInfo;
                            } else {
                                list2 = null;
                            }
                            ?? r4 = (T) new ArrayList();
                            arrayList4.add("official");
                            C953770avX c953770avXLIZ = c953770avX4.LIZ(3);
                            if (c953770avXLIZ == null) {
                                c953770avXLIZ = new C953770avX();
                            }
                            r4.add(c953770avXLIZ);
                            if (list2 != null && !list2.isEmpty()) {
                                List<LangTranslate> list4 = ((StarlingTranslateInfo) ListProtector.get(list2, 0)).langTranslate;
                                List<String> list5 = arrayList4;
                                Iterator<LangTranslate> it3 = list4.iterator();
                                while (it3.hasNext()) {
                                    list5.add(it3.next().locale);
                                    C953770avX c953770avXLIZ2 = c953770avX4.LIZ(2);
                                    if (c953770avXLIZ2 == null) {
                                        c953770avXLIZ2 = new C953770avX();
                                    }
                                    r4.add(c953770avXLIZ2);
                                }
                                int i = 0;
                                for (Object obj2 : r4) {
                                    int i2 = i + 1;
                                    if (i >= 0) {
                                        C953770avX c953770avX5 = (C953770avX) obj2;
                                        if (i != 0) {
                                            int i3 = 0;
                                            for (C971360bNu c971360bNu2 : c953770avX5.LJI) {
                                                int i4 = i3 + 1;
                                                if (i3 >= 0) {
                                                    C971360bNu c971360bNu3 = c971360bNu2;
                                                    Iterator<StarlingTranslateInfo> it4 = list2.iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            next = it4.next();
                                                            if (Intrinsics.LJFF(next.starlingKey, c971360bNu3.LIZ)) {
                                                                break;
                                                            }
                                                        } else {
                                                            next = null;
                                                            break;
                                                        }
                                                    }
                                                    StarlingTranslateInfo starlingTranslateInfo = next;
                                                    String str2 = "";
                                                    if (starlingTranslateInfo == null || (list3 = starlingTranslateInfo.langTranslate) == null || (langTranslate = (LangTranslate) ListProtector.get(list3, i - 1)) == null || (str = langTranslate.translateResult) == null) {
                                                        str = "";
                                                    }
                                                    NLEEditor nLEEditor = new NLEEditor();
                                                    nLEEditor.restore(c953770avX5.LJIIJ);
                                                    nLEEditor.commit();
                                                    nLEEditor.done();
                                                    NLEModel model = nLEEditor.getModel();
                                                    if (model != null && (tracks = model.getTracks()) != null) {
                                                        ArrayList arrayList5 = new ArrayList();
                                                        for (NLETrack nLETrack : tracks) {
                                                            if (nLETrack.getExtraTrackType() == NLETrackType.STICKER) {
                                                                arrayList5.add(nLETrack);
                                                            }
                                                        }
                                                        ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
                                                        Iterator it5 = arrayList5.iterator();
                                                        while (it5.hasNext()) {
                                                            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(((NLETrack) it5.next()).getSlots());
                                                            if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                                                                C385090F7z c385090F7z = NLETextRichContent.Companion;
                                                                String richContent = nLESegmentTextStickerDynamicCast.getRichContent();
                                                                c385090F7z.getClass();
                                                                if (Intrinsics.LJFF(C385090F7z.LIZ(richContent).richTextData.textStr, c971360bNu3.LIZ)) {
                                                                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                                                                    C971360bNu c971360bNu4 = new C971360bNu((String) null, 0, (String) null, 15);
                                                                    c971360bNu4.LIZ = str;
                                                                    c971360bNu4.LIZIZ = c971360bNu3.LIZIZ;
                                                                    c971360bNu4.LIZJ = c971360bNu3.LIZJ;
                                                                    multiCanvasUtils.getClass();
                                                                    MultiCanvasUtils.LJJ(c971360bNu4, nLESegmentTextStickerDynamicCast, nLEEditor);
                                                                }
                                                            } else {
                                                                nLESegmentTextStickerDynamicCast = null;
                                                            }
                                                            arrayList6.add(nLESegmentTextStickerDynamicCast);
                                                        }
                                                    }
                                                    nLEEditor.commit();
                                                    nLEEditor.done();
                                                    if (Intrinsics.LJFF(c953770avX5.LJIIIZ, ((C971360bNu) ListProtector.get(c953770avX5.LJI, i3)).LIZ)) {
                                                        c953770avX5.LJIIIZ = str;
                                                    }
                                                    ((C971360bNu) ListProtector.get(c953770avX5.LJI, i3)).LIZ = str;
                                                    c953770avX5.LJIIJ = nLEEditor.store();
                                                    NLEBranch branch = nLEEditor.getBranch();
                                                    if (branch != null && (head = branch.getHead()) != null && (uuid = head.getUUID()) != null) {
                                                        str2 = uuid;
                                                    }
                                                    c953770avX5.LJII = str2;
                                                    C20441214yg.LIZIZ("starling_template", "step 2: generate translated DraftItems, index: " + i + ", text: " + str + ", mediaNodeId: " + c953770avX5.LJII);
                                                    i3 = i4;
                                                } else {
                                                    C1697810uHb.LJIJI();
                                                    throw null;
                                                }
                                            }
                                        }
                                        i = i2;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                            c259800zU.element = r4;
                            return r4;
                        }
                    }).LJIIZILJ(new AkS36S0500000_15(c954060aw0, contextLJIL, interfaceC971000bNK, c971030bNN, c971020bNM, 1)).LJIIZILJ(new AkS324S0200000_15(contextLJIL, c954060aw0, 5)).LJIIZILJ(new AkS199S0300000_15((Object) c259800zU2, (C971050bNP) c954060aw0, (List<String>) contextLJIL, (C259800zU<List<C953770avX>>) 4)).LJIIZILJ(new InterfaceC1487280oo2() { // from class: X.0aw4
                        /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
                        
                            if (r1 == X.EnumC952890au7.PREVIEW_PLAYBOOK) goto L24;
                         */
                        @Override // X.InterfaceC1487280oo2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object apply(java.lang.Object r15) {
                            /*
                                Method dump skipped, instruction units count: 343
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C954100aw4.apply(java.lang.Object):java.lang.Object");
                        }
                    }).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C09JN() { // from class: X.0auh
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00d0  */
                        @Override // X.C09JN
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void accept(java.lang.Object r24) {
                            /*
                                Method dump skipped, instruction units count: 215
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C953250auh.accept(java.lang.Object):void");
                        }
                    }).LJIIL(new AfS109S0300000_15(c954060aw0, contextLJIL, interfaceC971000bNK, 24))).LJIIZILJ();
                    return;
                }
                return;
            }
        }
        if (c953770avX3 != null || (c953770avX3 = this.LJ) != null) {
            AwS416S0200000_15 awS416S0200000_15 = new AwS416S0200000_15(this, c953770avX3, 129);
            if (LJIIJ(c953770avX3) && (((l = c953770avX3.LJIIL) == null || !C953230auf.LJIIL(l.longValue())) && C953230auf.LIZIZ.size() >= C953230auf.LIZLLL)) {
                C953230auf.LJIJ(this.LIZ.LJIL(), new AwS559S0100000_15(awS416S0200000_15, 1230), new AwS559S0100000_15(this, 1231));
            } else {
                awS416S0200000_15.invoke();
            }
        }
    }

    public final void LJIJ(C971120bNW c971120bNW) {
        NLETrackSlot nLETrackSlot = c971120bNW.LJFF.LIZIZ;
        switch (C971080bNS.LIZJ[c971120bNW.LIZ.ordinal()]) {
            case 1:
                Float f = c971120bNW.LIZIZ;
                if (f != null) {
                    nLETrackSlot.setTransformX(C363400EMo.LIZ(f.floatValue()));
                }
                Float f2 = c971120bNW.LIZJ;
                if (f2 != null) {
                    nLETrackSlot.setTransformY(C363400EMo.LIZIZ(f2.floatValue()));
                }
                break;
            case 2:
                Float f3 = c971120bNW.LIZLLL;
                if (f3 != null) {
                    nLETrackSlot.setScale(f3.floatValue());
                }
                break;
            case 3:
                Float f4 = c971120bNW.LJ;
                if (f4 != null) {
                    nLETrackSlot.setRotation(f4.floatValue());
                }
                break;
            case 4:
            case 5:
            case 6:
                NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentTextStickerDynamicCast != null) {
                    MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                    C971360bNu c971360bNu = c971120bNW.LJFF.LIZJ;
                    NLEEditor nLEEditor = this.LIZIZ;
                    multiCanvasUtils.getClass();
                    MultiCanvasUtils.LJJ(c971360bNu, nLESegmentTextStickerDynamicCast, nLEEditor);
                }
                break;
            case 7:
                Float f5 = c971120bNW.LIZIZ;
                if (f5 != null) {
                    nLETrackSlot.setTransformX(C363400EMo.LIZ(f5.floatValue()));
                }
                Float f6 = c971120bNW.LIZJ;
                if (f6 != null) {
                    nLETrackSlot.setTransformY(C363400EMo.LIZIZ(f6.floatValue()));
                }
                Float f7 = c971120bNW.LJ;
                if (f7 != null) {
                    nLETrackSlot.setRotation(f7.floatValue());
                }
                Float f8 = c971120bNW.LIZLLL;
                if (f8 != null) {
                    nLETrackSlot.setScale(f8.floatValue());
                }
                break;
            case 8:
                NLESegmentTextSticker nLESegmentTextStickerDynamicCast2 = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                if (nLESegmentTextStickerDynamicCast2 != null) {
                    MultiCanvasUtils multiCanvasUtils2 = MultiCanvasUtils.LIZ;
                    C971360bNu c971360bNu2 = c971120bNW.LJFF.LIZJ;
                    NLEEditor nLEEditor2 = this.LIZIZ;
                    multiCanvasUtils2.getClass();
                    MultiCanvasUtils.LJJ(c971360bNu2, nLESegmentTextStickerDynamicCast2, nLEEditor2);
                }
                Float f9 = c971120bNW.LIZIZ;
                if (f9 != null) {
                    nLETrackSlot.setTransformX(C363400EMo.LIZ(f9.floatValue()));
                }
                Float f10 = c971120bNW.LIZJ;
                if (f10 != null) {
                    nLETrackSlot.setTransformY(C363400EMo.LIZIZ(f10.floatValue()));
                }
                break;
            default:
                throw new C1954807lC();
        }
        Function0<Boolean> function0 = c971120bNW.LJI;
        if (function0 != null && function0.invoke().booleanValue()) {
            NLEEditor nLEEditor3 = this.LIZIZ;
            if (nLEEditor3 != null) {
                nLEEditor3.commit();
                return;
            }
            return;
        }
        NLEEditor nLEEditor4 = this.LIZIZ;
        if (nLEEditor4 != null) {
            LJ(nLEEditor4);
        }
        LIZLLL();
    }

    public final void LIZJ(EnumC954150aw9 enumC954150aw9, C953770avX c953770avX) {
        if (enumC954150aw9 == EnumC954150aw9.DEFAULT) {
            this.LJIIIIZZ = true;
        }
        C953770avX c953770avXLIZ = c953770avX.LIZ(2);
        if (c953770avXLIZ != null) {
            C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
            c915050Zv5.LIZ().LJIIL(c953770avXLIZ);
            c915050Zv5.LIZ().LJIILJJIL();
        } else {
            c953770avXLIZ = null;
        }
        this.LJ = c953770avXLIZ;
        if (c953770avXLIZ != null) {
            int i = C971080bNS.LIZ[enumC954150aw9.ordinal()];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    for (C971360bNu c971360bNu : c953770avXLIZ.LJI) {
                        MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
                        NLEEditor nLEEditor = this.LIZIZ;
                        multiCanvasUtils.getClass();
                        NLETrackSlot nLETrackSlotLIZIZ = MultiCanvasUtils.LIZIZ(c971360bNu, nLEEditor, 0.5f, 0.5f, false, 0.0f, 1.0f, -1);
                        if (nLETrackSlotLIZIZ != null) {
                            nLETrackSlotLIZIZ.getUUID();
                        }
                        c971360bNu.getClass();
                    }
                    LIZ(c953770avXLIZ.LIZLLL, null, true, true);
                } else {
                    throw new C1954807lC();
                }
            } else {
                NLEEditor nLEEditor2 = this.LIZIZ;
                if (nLEEditor2 != null) {
                    nLEEditor2.restore(c953770avXLIZ.LJIIJ);
                }
                String str = c953770avXLIZ.LJII;
                LIZ(c953770avXLIZ.LIZLLL, str, false, false);
                NLEEditor nLEEditor3 = this.LIZIZ;
                if (nLEEditor3 != null) {
                    nLEEditor3.commit();
                }
                C953770avX c953770avX2 = this.LJ;
                if (c953770avX2 != null) {
                    c953770avX2.LJII = str;
                }
            }
        }
        this.LIZ.LJJLIIIIJ();
    }

    public final void LJIILLIIL(C953770avX c953770avX, Function1<? super C953770avX, Unit> function1) {
        int i = c953770avX.LIZ;
        if ((i == 1 || i == 3) && new C0VSJ(c953770avX.LJ).exists() && new C0VSJ(c953770avX.LJ).length() > 0) {
            C953770avX c953770avXLIZ = c953770avX.LIZ(2);
            if (c953770avXLIZ != null) {
                c953770avXLIZ.LJIIJJI = false;
                C915050Zv5 c915050Zv5 = C953760avW.LIZIZ;
                c915050Zv5.LIZ().LJIIL(c953770avXLIZ);
                c915050Zv5.LIZ().LJIILJJIL();
            }
            function1.invoke(c953770avX);
            return;
        }
        C500260Jjc.LJJLIIIJILLIZJL(new AwS416S0200000_15(this, new AwS224S0300000_15(this, (C971040bNO) c953770avX, (C953770avX) function1, (Function1<? super C953770avX, Unit>) 65), 130));
    }

    public final void LJIILL(EnumC971110bNV enumC971110bNV, C971330bNr c971330bNr, Function1<? super NLETrackSlot, Unit> function1) {
        NLEModel model;
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLEModel model2;
        int i = C971080bNS.LIZIZ[enumC971110bNV.ordinal()];
        int height = 0;
        if (i != 1) {
            if (i == 2) {
                NLEEditor nLEEditor = this.LIZIZ;
                if (nLEEditor != null && (model = nLEEditor.getModel()) != null && (tracks = model.getTracks()) != null) {
                    Iterator<NLETrack> it2 = tracks.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            NLETrack nLETrack = next;
                            if (nLETrack.getExtraTrackType() == NLETrackType.STICKER && (!nLETrack.getSlots().isEmpty()) && Intrinsics.LJFF(nLETrack.getSlots().get(0), c971330bNr.LIZIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null) {
                        NLEEditor nLEEditor2 = this.LIZIZ;
                        if (nLEEditor2 != null && (model2 = nLEEditor2.getModel()) != null) {
                            model2.removeTrack(nLETrack2);
                        }
                        NLEEditor nLEEditor3 = this.LIZIZ;
                        if (nLEEditor3 != null) {
                            LJ(nLEEditor3);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw new C1954807lC();
            }
        } else {
            int size = this.LIZ.LJJJJ().size();
            MultiGuestNoticeboardEditorSetting multiGuestNoticeboardEditorSetting = MultiGuestNoticeboardEditorSetting.INSTANCE;
            if (size >= multiGuestNoticeboardEditorSetting.getTextStickerCountLimited()) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853949, Integer.valueOf(multiGuestNoticeboardEditorSetting.getTextStickerCountLimited())));
                return;
            }
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            NLETrackSlot nLETrackSlot = c971330bNr.LIZIZ;
            NLEEditor nLEEditor4 = this.LIZIZ;
            multiCanvasUtils.getClass();
            NLETrackSlot nLETrackSlotLJFF = MultiCanvasUtils.LJFF(nLEEditor4, nLETrackSlot);
            SurfaceView surfaceViewLJJIIJZLJL = this.LIZ.LJJIIJZLJL();
            if (surfaceViewLJJIIJZLJL != null) {
                height = surfaceViewLJJIIJZLJL.getHeight();
            }
            float f = height;
            nLETrackSlotLJFF.setTransformY(C363400EMo.LIZIZ(((C363400EMo.LIZLLL(nLETrackSlotLJFF.getTransformY()) * f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / f));
            NLEEditor nLEEditor5 = this.LIZIZ;
            if (nLEEditor5 != null) {
                LJ(nLEEditor5);
            }
            if (function1 != null) {
                function1.invoke(nLETrackSlotLJFF);
            }
        }
        LIZLLL();
    }

    @Override // X.InterfaceC971180bNc
    public final void LIZ(String str, String str2, boolean z, boolean z2) {
        Bitmap.CompressFormat compressFormat;
        C953770avX c953770avX;
        String uuid;
        NLEBranch branch;
        NLECommit head;
        SurfaceView surfaceViewLJJIIJZLJL = this.LIZ.LJJIIJZLJL();
        if (surfaceViewLJJIIJZLJL != null) {
            IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str3 = File.separator;
            sbLIZ.append(str3);
            sbLIZ.append("bg_image");
            File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
            if (fileFM2.exists()) {
                MultiCanvasUtils.LIZ.getClass();
                MultiCanvasUtils.LJII(fileFM2);
            }
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            int iLIZIZ = C971140bNY.LIZIZ(surfaceViewLJJIIJZLJL);
            int iLIZ = C971140bNY.LIZ(surfaceViewLJJIIJZLJL);
            multiCanvasUtils.getClass();
            Bitmap bitmapLJI = MultiCanvasUtils.LJI(iLIZIZ, iLIZ, str);
            int iLIZIZ2 = C971140bNY.LIZIZ(surfaceViewLJJIIJZLJL);
            int iLIZ2 = C971140bNY.LIZ(surfaceViewLJJIIJZLJL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            sbLIZ2.append("bg_image");
            sbLIZ2.append(str3);
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append(".webp");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (Build.VERSION.SDK_INT >= 30) {
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
            } else {
                compressFormat = Bitmap.CompressFormat.WEBP;
            }
            MultiCanvasUtils.LIZ(this.LIZIZ, MultiCanvasUtils.LJIJI(bitmapLJI, iLIZIZ2, iLIZ2, strLIZIZ, compressFormat));
            NLEEditor nLEEditor = this.LIZIZ;
            if (nLEEditor != null) {
                nLEEditor.commit();
                nLEEditor.done();
                C953770avX c953770avX2 = this.LJ;
                if (c953770avX2 != null) {
                    NLEEditor nLEEditor2 = this.LIZIZ;
                    if (nLEEditor2 == null || (branch = nLEEditor2.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
                        uuid = "";
                    }
                    c953770avX2.LJII = uuid;
                }
                if (str2 != null && (c953770avX = this.LJ) != null) {
                    c953770avX.LJII = str2;
                }
                if (!z2) {
                    LJIIJJI();
                }
                this.LJFF = z2;
            }
            C953770avX c953770avX3 = this.LJ;
            if (c953770avX3 != null) {
                c953770avX3.LIZLLL = str;
            }
            if (z) {
                LIZLLL();
            }
        }
    }

    public final void LJIILJJIL(C917840Zza c917840Zza, C953770avX c953770avX, boolean z, Long l) {
        int i;
        EnumC953330aup enumC953330aup;
        long jLongValue;
        EnumC953330aup enumC953330aup2;
        boolean z2;
        C953100auS c953100auS = this.LJI;
        if (c953100auS != null) {
            C20441214yg.LIZIZ("NoticeBoardDialogPresenter", "onSaveReady");
            Long l2 = c953770avX.LJIIL;
            if (l2 != null && l2.longValue() > 0 && c953770avX.LJII.length() == 0) {
                i = 1;
            } else {
                i = 2;
            }
            InterfaceC2280191EMv<String, String, EnumC937290aUx, EnumC953330aup, String, C917840Zza, EnumC952890au7, String, C916750Zxp, Unit> interfaceC2280191EMv = c953100auS.LJFF;
            String str = c953770avX.LJ;
            String str2 = c953770avX.LJII;
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            EnumC952890au7 enumC952890au7 = c953100auS.LIZJ;
            multiCanvasUtils.getClass();
            EnumC937290aUx enumC937290aUxLJIIJJI = MultiCanvasUtils.LJIIJJI(enumC952890au7);
            if (c953770avX.LJFF) {
                enumC953330aup = EnumC953330aup.COLOR;
            } else {
                enumC953330aup = EnumC953330aup.PHOTO;
            }
            String str3 = c953770avX.LJIIIZ;
            EnumC952890au7 enumC952890au72 = c953100auS.LIZJ;
            String strLIZIZ = c953770avX.LIZIZ();
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                Long l3 = c953770avX.LJIIL;
                if (l3 != null) {
                    jLongValue = l3.longValue();
                } else {
                    jLongValue = 0;
                }
            }
            interfaceC2280191EMv.os(str, str2, enumC937290aUxLJIIJJI, enumC953330aup, str3, c917840Zza, enumC952890au72, strLIZIZ, new C916750Zxp(i, jLongValue, c953770avX.LJII));
            EnumC937290aUx enumC937290aUxLJIIJJI2 = MultiCanvasUtils.LJIIJJI(c953100auS.LIZJ);
            if (c953770avX.LJFF) {
                enumC953330aup2 = EnumC953330aup.COLOR;
            } else {
                enumC953330aup2 = EnumC953330aup.PHOTO;
            }
            if (c953770avX.LJIIIZ.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C946850akN.LIZLLL(enumC937290aUxLJIIJJI2, enumC953330aup2, z2, z, String.valueOf(c953770avX.LJIIL), c953770avX.LJIILIIL, "in_spots", "", "", "");
        }
        this.LIZ.LJJIII(EnumC919100a1c.SAVE);
    }
}
