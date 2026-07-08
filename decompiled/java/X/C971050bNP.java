package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.SurfaceView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.EditEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeBoardNLESwing;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.ies.nle.editor_jni.NLESeekFlag;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C971050bNP {
    public static final /* synthetic */ int LJIIJ = 0;
    public final DialogC971210bNf LIZ;
    public final DataChannel LIZIZ;
    public NLEEditor LIZJ;
    public C1463860oCG LIZLLL;
    public C971060bNQ LJ;
    public C953770avX LJFF;
    public String LJI;
    public final C11NJ LJII = new C11NJ();
    public C19487111Lx LJIIIIZZ;
    public boolean LJIIIZ;

    public final NLETrackSlot LIZ() {
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
        NLEEditor nLEEditor = this.LIZJ;
        multiCanvasUtils.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = MultiCanvasUtils.LIZIZ(c971360bNu, nLEEditor, 0.5f, 0.5f, false, 0.0f, 1.0f, -1);
        if (C13LP.LJJJLZIJ(0, c953770avXLIZ.LJI) != null && nLETrackSlotLIZIZ != null) {
            nLETrackSlotLIZIZ.getUUID();
        }
        Object objLJJJLZIJ = C13LP.LJJJLZIJ(0, c953770avXLIZ.LJI);
        if (objLJJJLZIJ != null && (c953770avX = this.LJFF) != null && (list = c953770avX.LJI) != null) {
            list.add((C971360bNu) objLJJJLZIJ);
        }
        NLEEditor nLEEditor2 = this.LIZJ;
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

    public final void LIZJ() {
        C953770avX c953770avX = this.LJFF;
        if (c953770avX != null) {
            int i = c953770avX.LJIIIIZZ;
            if (i == 5 || i == 4 || i == 2) {
                DataChannel dataChannel = this.LIZIZ;
                if (dataChannel != null) {
                    dataChannel.FQ2(EditEvent.class);
                }
                c953770avX.LJIIIIZZ = 1;
            }
        }
    }

    public final List<NLETrackSlot> LJFF() {
        NLEModel model;
        VecNLETrackSPtr tracks;
        Object objLJJJLZIJ;
        ArrayList arrayList = new ArrayList();
        NLEEditor nLEEditor = this.LIZJ;
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null && (tracks = model.getTracks()) != null) {
            for (NLETrack nLETrack : tracks) {
                if (nLETrack.getExtraTrackType() == NLETrackType.STICKER && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, nLETrack.getSlots())) != null) {
                    arrayList.add(objLJJJLZIJ);
                }
            }
        }
        return arrayList;
    }

    public final void LIZLLL(NLEEditor nLEEditor) {
        String uuid;
        NLEBranch branch;
        NLECommit head;
        nLEEditor.commit();
        C953770avX c953770avX = this.LJFF;
        if (c953770avX != null) {
            NLEEditor nLEEditor2 = this.LIZJ;
            if (nLEEditor2 == null || (branch = nLEEditor2.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
                uuid = "";
            }
            c953770avX.LJII = uuid;
        }
    }

    public final C971330bNr LJ(MotionEvent motionEvent) {
        C971330bNr c971330bNr = null;
        for (C971330bNr c971330bNr2 : this.LIZ.LLJZIJLIL) {
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

    public final Bitmap LJI(int i) {
        Bitmap bitmapLJIIIIZZ = null;
        if (i < 0) {
            return null;
        }
        SurfaceView surfaceView = this.LIZ.LLJJJJ;
        if (surfaceView != null) {
            MultiCanvasUtils.LIZ.getClass();
            bitmapLJIIIIZZ = MultiCanvasUtils.LJIIIIZZ(surfaceView);
        }
        MultiCanvasUtils.LIZ.getClass();
        if (!MultiCanvasUtils.LJIIZILJ(bitmapLJIIIIZZ)) {
            return LJI(i - 1);
        }
        return bitmapLJIIIIZZ;
    }

    public final RectF LJII(NLETrackSlot nLETrackSlot) {
        NLERectF infoStickerBoundingBox;
        INLEStickerRuntime stickerApi;
        C1463860oCG c1463860oCG;
        INLEPlayer playerApi;
        MultiGuestNoticeBoardNLESwing multiGuestNoticeBoardNLESwing = MultiGuestNoticeBoardNLESwing.INSTANCE;
        if (multiGuestNoticeBoardNLESwing.isEnable() && (c1463860oCG = this.LIZLLL) != null && (playerApi = c1463860oCG.getPlayerApi()) != null) {
            C389960FQs c389960FQs = (C389960FQs) playerApi;
            c389960FQs.seekTime(c389960FQs.getCurrentPosition(), NLESeekFlag.EDITOR_SEEK_FLAG_LAST_UpdateSwingSync);
            c389960FQs.play();
        }
        C1463860oCG c1463860oCG2 = this.LIZLLL;
        if (c1463860oCG2 != null && (stickerApi = c1463860oCG2.getStickerApi()) != null) {
            infoStickerBoundingBox = ((C1EQC) stickerApi).getInfoStickerBoundingBox(nLETrackSlot.getUUID(), false);
        } else {
            infoStickerBoundingBox = null;
        }
        SurfaceView surfaceView = this.LIZ.LLJJJJ;
        if (infoStickerBoundingBox != null && surfaceView != null) {
            if (multiGuestNoticeBoardNLESwing.isEnable()) {
                infoStickerBoundingBox.setBottom(-infoStickerBoundingBox.getBottom());
                infoStickerBoundingBox.setTop(-infoStickerBoundingBox.getTop());
            }
            int iLIZIZ = C971140bNY.LIZIZ(surfaceView);
            int iLIZ = C971140bNY.LIZ(surfaceView);
            RectF rectF = new RectF();
            float f = iLIZIZ;
            rectF.left = C363400EMo.LIZJ(infoStickerBoundingBox.getLeft() + nLETrackSlot.getTransformX()) * f;
            float f2 = iLIZ;
            rectF.top = C363400EMo.LIZLLL(infoStickerBoundingBox.getTop() + nLETrackSlot.getTransformY()) * f2;
            rectF.right = C363400EMo.LIZJ(infoStickerBoundingBox.getRight() + nLETrackSlot.getTransformX()) * f;
            rectF.bottom = C363400EMo.LIZLLL(infoStickerBoundingBox.getBottom() + nLETrackSlot.getTransformY()) * f2;
            if (C426750GoL.LIZLLL(C915980Zwa.LIZJ().context())) {
                MultiCanvasUtils.LIZ.getClass();
                if (!MultiCanvasUtils.LJIILLIIL(nLETrackSlot)) {
                    RectF rectF2 = new RectF(rectF);
                    rectF.left = f - rectF2.right;
                    rectF.right = f - rectF2.left;
                }
            }
            return rectF;
        }
        return new RectF();
    }

    public final void LJIIIIZZ(boolean z) {
        INLEMediaSettings mediaSettingApi;
        INLEPlayer playerApi;
        INLEMediaSettings mediaSettingApi2;
        INLEPlayer playerApi2;
        if (z) {
            C1463860oCG c1463860oCG = this.LIZLLL;
            if (c1463860oCG != null && (playerApi2 = c1463860oCG.getPlayerApi()) != null) {
                ((C389960FQs) playerApi2).setEnableDirectRenderMode(true);
            }
            C1463860oCG c1463860oCG2 = this.LIZLLL;
            if (c1463860oCG2 != null && (mediaSettingApi2 = c1463860oCG2.getMediaSettingApi()) != null) {
                ((C1463880oCI) mediaSettingApi2).setPreviewFps(60, true);
                return;
            }
            return;
        }
        C1463860oCG c1463860oCG3 = this.LIZLLL;
        if (c1463860oCG3 != null && (playerApi = c1463860oCG3.getPlayerApi()) != null) {
            ((C389960FQs) playerApi).setEnableDirectRenderMode(false);
        }
        C1463860oCG c1463860oCG4 = this.LIZLLL;
        if (c1463860oCG4 == null || (mediaSettingApi = c1463860oCG4.getMediaSettingApi()) == null) {
            return;
        }
        ((C1463880oCI) mediaSettingApi).setPreviewFps(-1);
    }

    public final void LJIIJ(C971120bNW c971120bNW) {
        NLETrackSlot nLETrackSlot = c971120bNW.LJFF.LIZIZ;
        switch (C971090bNT.LIZIZ[c971120bNW.LIZ.ordinal()]) {
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
                    NLEEditor nLEEditor = this.LIZJ;
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
                    NLEEditor nLEEditor2 = this.LIZJ;
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
            NLEEditor nLEEditor3 = this.LIZJ;
            if (nLEEditor3 != null) {
                nLEEditor3.commit();
                return;
            }
            return;
        }
        NLEEditor nLEEditor4 = this.LIZJ;
        if (nLEEditor4 != null) {
            LIZLLL(nLEEditor4);
        }
        LIZJ();
    }

    public C971050bNP(DialogC971210bNf dialogC971210bNf, DataChannel dataChannel) {
        this.LIZ = dialogC971210bNf;
        this.LIZIZ = dataChannel;
        C954080aw2 c954080aw2 = C954080aw2.LIZJ;
        if (!C954080aw2.LIZLLL) {
            MultiCanvasUtils.LIZ.getClass();
            C954080aw2.LIZLLL = MultiCanvasUtils.LJIL(2, false);
        }
    }

    public final void LIZIZ(String str, boolean z) {
        Bitmap.CompressFormat compressFormat;
        String uuid;
        NLEBranch branch;
        NLECommit head;
        SurfaceView surfaceView = this.LIZ.LLJJJJ;
        if (surfaceView != null) {
            IHostMultiCanvas iHostMultiCanvas = (IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append("bg_image");
            File fileFM2 = iHostMultiCanvas.fM2(C2188811AlT.LIZIZ(sbLIZ), false);
            if (fileFM2.exists()) {
                MultiCanvasUtils.LIZ.getClass();
                MultiCanvasUtils.LJII(fileFM2);
            }
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            int iLIZIZ = C971140bNY.LIZIZ(surfaceView);
            int iLIZ = C971140bNY.LIZ(surfaceView);
            multiCanvasUtils.getClass();
            Bitmap bitmapLJI = MultiCanvasUtils.LJI(iLIZIZ, iLIZ, str);
            int iLIZIZ2 = C971140bNY.LIZIZ(surfaceView);
            int iLIZ2 = C971140bNY.LIZ(surfaceView);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str2);
            sbLIZ2.append("bg_image");
            sbLIZ2.append(str2);
            sbLIZ2.append(System.currentTimeMillis());
            sbLIZ2.append(".webp");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            if (Build.VERSION.SDK_INT >= 30) {
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSLESS;
            } else {
                compressFormat = Bitmap.CompressFormat.WEBP;
            }
            MultiCanvasUtils.LIZ(this.LIZJ, MultiCanvasUtils.LJIJI(bitmapLJI, iLIZIZ2, iLIZ2, strLIZIZ, compressFormat));
            NLEEditor nLEEditor = this.LIZJ;
            if (nLEEditor != null) {
                nLEEditor.commit();
                nLEEditor.done();
                C953770avX c953770avX = this.LJFF;
                if (c953770avX != null) {
                    NLEEditor nLEEditor2 = this.LIZJ;
                    if (nLEEditor2 == null || (branch = nLEEditor2.getBranch()) == null || (head = branch.getHead()) == null || (uuid = head.getUUID()) == null) {
                        uuid = "";
                    }
                    c953770avX.LJII = uuid;
                }
            }
            C953770avX c953770avX2 = this.LJFF;
            if (c953770avX2 != null) {
                c953770avX2.LIZLLL = str;
            }
            if (z) {
                LIZJ();
            }
        }
    }

    public final void LJIIIZ(EnumC971110bNV enumC971110bNV, C971330bNr c971330bNr, Function1<? super NLETrackSlot, Unit> function1) {
        NLEModel model;
        VecNLETrackSPtr tracks;
        NLETrack next;
        NLEModel model2;
        int i = C971090bNT.LIZ[enumC971110bNV.ordinal()];
        int height = 0;
        if (i != 1) {
            if (i == 2) {
                NLEEditor nLEEditor = this.LIZJ;
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
                        NLEEditor nLEEditor2 = this.LIZJ;
                        if (nLEEditor2 != null && (model2 = nLEEditor2.getModel()) != null) {
                            model2.removeTrack(nLETrack2);
                        }
                        NLEEditor nLEEditor3 = this.LIZJ;
                        if (nLEEditor3 != null) {
                            LIZLLL(nLEEditor3);
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
            int size = this.LIZ.LLJZIJLIL.size();
            MultiGuestNoticeboardEditorSetting multiGuestNoticeboardEditorSetting = MultiGuestNoticeboardEditorSetting.INSTANCE;
            if (size >= multiGuestNoticeboardEditorSetting.getTextStickerCountLimited()) {
                C766270U4b.LJIIJJI(C497740JfY.LJIJJ(2131853949, Integer.valueOf(multiGuestNoticeboardEditorSetting.getTextStickerCountLimited())));
                return;
            }
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            NLETrackSlot nLETrackSlot = c971330bNr.LIZIZ;
            NLEEditor nLEEditor4 = this.LIZJ;
            multiCanvasUtils.getClass();
            NLETrackSlot nLETrackSlotLJFF = MultiCanvasUtils.LJFF(nLEEditor4, nLETrackSlot);
            SurfaceView surfaceView = this.LIZ.LLJJJJ;
            if (surfaceView != null) {
                height = surfaceView.getHeight();
            }
            float f = height;
            nLETrackSlotLJFF.setTransformY(C363400EMo.LIZIZ(((C363400EMo.LIZLLL(nLETrackSlotLJFF.getTransformY()) * f) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) / f));
            NLEEditor nLEEditor5 = this.LIZJ;
            if (nLEEditor5 != null) {
                LIZLLL(nLEEditor5);
            }
            if (function1 != null) {
                function1.invoke(nLETrackSlotLJFF);
            }
        }
        LIZJ();
    }
}
