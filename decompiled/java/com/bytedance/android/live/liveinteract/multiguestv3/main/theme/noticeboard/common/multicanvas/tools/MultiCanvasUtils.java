package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools;

import X.C08QA;
import X.C098200Yq;
import X.C0PEM;
import X.C0VSJ;
import X.C0VSV;
import X.C0WZX;
import X.C1161920gLG;
import X.C13LP;
import X.C1419820n3E;
import X.C1697810uHb;
import X.C189200o6;
import X.C1A66;
import X.C20441214yg;
import X.C2107108Nh;
import X.C2188781AlQ;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2296808zG;
import X.C23250099c;
import X.C363400EMo;
import X.C385080F7y;
import X.C418440Gaw;
import X.C426750GoL;
import X.C497740JfY;
import X.C500260Jjc;
import X.C814420VxA;
import X.C915980Zwa;
import X.C917840Zza;
import X.C944400agQ;
import X.C952340atE;
import X.C952900au8;
import X.C953230auf;
import X.C953270auj;
import X.C953760avW;
import X.C953770avX;
import X.C971360bNu;
import X.C971740bOW;
import X.EnumC937290aUx;
import X.EnumC952890au7;
import X.InterfaceC915550Zvt;
import X.InterfaceC945610aiN;
import X.InterfaceC971680bOQ;
import X.InterfaceC971750bOX;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.newcopy.NLETextRichContent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.CloudDraftItemManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestNoticeboardEditorSetting;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLELoggerListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.log.TELog2ClientInvoker;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.vesdk.runtime.VERuntime;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardMaterialInfo;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCanvasUtils {
    public static final MultiCanvasUtils LIZ = new MultiCanvasUtils();

    public static InterfaceC971680bOQ LJIIJ() {
        return ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).Eu1();
    }

    public static void LJIJ() {
        C953230auf.LIZ.getClass();
        List<NoticeboardTemplate> listLL = C13LP.LL(C13LP.LJLIL(C953230auf.LIZJ, C953230auf.LIZIZ), MultiGuestNoticeboardEditorSetting.INSTANCE.getTemplatePreloadCount());
        if (listLL != null) {
            for (NoticeboardTemplate noticeboardTemplate : listLL) {
                ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = noticeboardTemplate.convertNoticeboardMaterialInfo;
                if (convertNoticeboardMaterialInfo != null) {
                    BPEAHandler bPEAHandler = CloudDraftItemManager.LIZ;
                    CloudDraftItemManager.LJFF(noticeboardTemplate.noticeboardTemplateId, new InterfaceC915550Zvt() { // from class: X.0bM2
                        @Override // X.InterfaceC915550Zvt
                        public final void LIZ(Throwable th) {
                        }

                        @Override // X.InterfaceC915550Zvt
                        public final void LIZIZ(C953770avX c953770avX) {
                        }
                    }, noticeboardTemplate.mediaNodeId, "shortcut", convertNoticeboardMaterialInfo);
                }
            }
        }
    }

    public static void LJII(File file) {
        File[] fileArrListFiles;
        if (file.exists()) {
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    LIZ.getClass();
                    LJII(file2);
                }
            }
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LJIIIIZZ(android.view.SurfaceView r6) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L6a
            android.view.SurfaceHolder r0 = r6.getHolder()
            if (r0 == 0) goto L36
            android.view.Surface r0 = r0.getSurface()
            if (r0 == 0) goto L36
            boolean r1 = r0.isValid()
            r0 = 1
            if (r1 != r0) goto L36
        L19:
            if (r0 == 0) goto L6a
            int r0 = r6.getWidth()
            if (r0 <= 0) goto L6a
            int r0 = r6.getHeight()
            if (r0 <= 0) goto L6a
            int r2 = r6.getWidth()
            int r1 = r6.getHeight()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            goto L38
        L36:
            r0 = 0
            goto L19
        L38:
            android.view.SurfaceHolder r0 = r6.getHolder()     // Catch: java.lang.Throwable -> L5d
            android.view.Surface r4 = r0.getSurface()     // Catch: java.lang.Throwable -> L5d
            X.0bOR r3 = new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: X.0bOR
                static {
                    /*
                        X.0bOR r0 = new X.0bOR
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0bOR) X.0bOR.LIZ X.0bOR
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.PixelCopyOnPixelCopyFinishedListenerC971690bOR.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.PixelCopyOnPixelCopyFinishedListenerC971690bOR.<init>():void");
                }

                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int r1) {
                    /*
                        r0 = this;
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.PixelCopyOnPixelCopyFinishedListenerC971690bOR.onPixelCopyFinished(int):void");
                }
            }     // Catch: java.lang.Throwable -> L5d
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L5d
            com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils$getBitmap$1$1$2 r2 = new com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils$getBitmap$1$1$2     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "bpea-multi_guest_notice_board_surface_view"
            r0 = 1476435975(0x5800a007, float:5.656992E14)
            com.bytedance.bpea.basics.Cert r0 = com.bytedance.bpea.basics.CertProviderManagerKt.findCert(r1, r0)     // Catch: java.lang.Throwable -> L5d
            X.C1322890kWt.LIZIZ(r4, r5, r3, r2, r0)     // Catch: java.lang.Throwable -> L5d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L5d
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L5d
            return r5
        L5d:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r5
        L6a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils.LJIIIIZZ(android.view.SurfaceView):android.graphics.Bitmap");
    }

    public static Bitmap LJIIIZ(String str) {
        String str2;
        C953770avX c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(str);
        if (c953770avXLJFF != null) {
            str2 = c953770avXLJFF.LJ;
        } else {
            str2 = null;
        }
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str2);
        if (!LJIIZILJ(bitmapDecodeFile)) {
            return null;
        }
        return bitmapDecodeFile;
    }

    public static EnumC937290aUx LJIIJJI(EnumC952890au7 enumC952890au7) {
        switch (C952900au8.LIZ[enumC952890au7.ordinal()]) {
            case 1:
                return EnumC937290aUx.LIVE_SETTING;
            case 2:
                return EnumC937290aUx.BOARD;
            case 3:
                return EnumC937290aUx.MULTI_SETTING;
            case 4:
            case 5:
            case 6:
                return EnumC937290aUx.MULTI_TOOL;
            case 7:
                return EnumC937290aUx.NOTICEBOARD_CLICK;
            case 8:
                return EnumC937290aUx.SETTING_PLAYBOOK;
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC937290aUx.PLAYBOOK;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC937290aUx.AUTO_APPLY;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return EnumC937290aUx.HEAD_LINE;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return EnumC937290aUx.DESIGN_PAGE;
            case 14:
                return EnumC937290aUx.UNKNOWN;
            default:
                return EnumC937290aUx.MULTI_SETTING;
        }
    }

    public static String LJIILIIL(C971360bNu c971360bNu) {
        int i;
        int i2;
        Pair<String, String> pairLJI;
        InterfaceC971680bOQ interfaceC971680bOQLJIIJ;
        if (C426750GoL.LIZLLL(C915980Zwa.LIZJ().context())) {
            i = 255;
        } else {
            i = 254;
        }
        boolean zLIZLLL = C426750GoL.LIZLLL(C915980Zwa.LIZJ().context());
        if (C426750GoL.LIZLLL(C915980Zwa.LIZJ().context())) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        NLETextRichContent nLETextRichContent = new NLETextRichContent(2, "", new C385080F7y("", null, null, 48.0f, false, 0.0f, null, null, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.2f), 0, i2, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f)), true, 0.0f, true, false, C1697810uHb.LJ(Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f)), 0.0f, 0, 0.04f, 0.15f, 0.0f, 0.05f, 0.0f, 0.9f, C1697810uHb.LJ(Float.valueOf(-1.0f), Float.valueOf(-1.0f)), zLIZLLL ? 1 : 0, i, C1697810uHb.LJ("", "", ""), false, "...", "", false, false, C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(1.0f), Float.valueOf(1.0f)), false, 1.0f, C1697810uHb.LJ(Float.valueOf(0.5f), Float.valueOf(0.7f), Float.valueOf(1.0f), Float.valueOf(0.8f)), true);
        String str = c971360bNu.LIZ;
        MultiCanvasUtils multiCanvasUtils = LIZ;
        int i3 = c971360bNu.LIZIZ;
        multiCanvasUtils.getClass();
        ArrayList arrayListLJ = C1697810uHb.LJ(Float.valueOf(((i3 >> 16) & 255) / 255.0f), Float.valueOf(((i3 >> 8) & 255) / 255.0f), Float.valueOf((255 & i3) / 255.0f), Float.valueOf(((i3 >> 24) & 255) / 255.0f));
        if (c971360bNu.LIZ.length() > 0 && (interfaceC971680bOQLJIIJ = LJIIJ()) != null) {
            pairLJI = interfaceC971680bOQLJIIJ.LJI(c971360bNu.LIZJ);
        } else {
            pairLJI = null;
        }
        nLETextRichContent.setRichTextData(new C385080F7y(str, pairLJI, arrayListLJ, (720.0f / C497740JfY.LJIIZILJ()) * 0.24f * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(25)), false, 0.0f, null, C1697810uHb.LJIIJJI(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.25f)), C1697810uHb.LJ(Float.valueOf(0.0f), Float.valueOf(-0.03f)), 0.01f));
        nLETextRichContent.setRichText(nLETextRichContent.richTextData.toLabelStr());
        return nLETextRichContent.toJsonStr();
    }

    public static String LJIILJJIL(NLETrackSlot nLETrackSlot) {
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentTextStickerDynamicCast != null) {
            return nLESegmentTextStickerDynamicCast.getContent();
        }
        return "";
    }

    public static boolean LJIILLIIL(NLETrackSlot nLETrackSlot) {
        String strLJIILJJIL = LJIILJJIL(nLETrackSlot);
        if (strLJIILJJIL != null) {
            return a0.LJJJIL(strLJIILJJIL);
        }
        return false;
    }

    public static boolean LJIIZILJ(Bitmap bitmap) {
        if (bitmap != null && C500260Jjc.LJJIFFI(Boolean.valueOf(bitmap.isRecycled())) && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            return true;
        }
        return false;
    }

    public static Integer LJIJJ(List list) {
        Unit unit;
        if (list != null) {
            try {
                if (list.size() >= 4) {
                    float f = 255;
                    return Integer.valueOf((((int) (((Number) list.get(3)).floatValue() * f)) << 24) | (((int) (((Number) list.get(0)).floatValue() * f)) << 16) | (((int) (((Number) list.get(1)).floatValue() * f)) << 8) | ((int) (((Number) list.get(2)).floatValue() * f)));
                }
                unit = Unit.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        } else {
            unit = null;
        }
        C189200o6.m2constructorimpl(unit);
        return null;
    }

    public static void LIZ(NLEEditor nLEEditor, String str) {
        NLETrack nLETrack;
        NLEModel model;
        NLEModel model2;
        NLETrack mainTrack;
        NLEModel model3;
        if (nLEEditor != null && (model3 = nLEEditor.getModel()) != null && model3.getMainTrack() != null) {
            nLETrack = nLEEditor.getModel().getMainTrack();
            if (nLETrack == null) {
                return;
            }
        } else {
            nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            nLETrack.setExtraTrackType(NLETrackType.IMAGE);
            if (nLEEditor != null && (model = nLEEditor.getModel()) != null) {
                model.addTrack(nLETrack);
            }
        }
        VecNLETrackSlotSPtr slots = nLETrack.getSlots();
        if (slots != null) {
            Iterator<NLETrackSlot> it2 = slots.iterator();
            while (it2.hasNext()) {
                nLETrack.removeSlot(it2.next());
            }
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentVideo nLESegmentVideo = new NLESegmentVideo();
        nLESegmentVideo.setCanvasStyle(new NLEStyCanvas());
        long maxEnd = 0;
        nLESegmentVideo.setTimeClipStart(0L);
        nLESegmentVideo.setTimeClipEnd(nLESegmentVideo.getTimeClipStart() + 3000000);
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.IMAGE);
        nLEResourceAV.setResourceFile(str);
        nLEResourceAV.setDuration(3000000L);
        nLESegmentVideo.setAVFile(nLEResourceAV);
        nLETrackSlot.setMainSegment(nLESegmentVideo);
        if (nLEEditor != null && (model2 = nLEEditor.getModel()) != null && (mainTrack = model2.getMainTrack()) != null) {
            maxEnd = mainTrack.getMaxEnd();
        }
        nLETrackSlot.setStartTime(maxEnd);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + 3000000);
        nLETrack.addSlotAtEnd(nLETrackSlot);
    }

    public static void LIZJ(Function0 function0, Function0 function02) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C952340atE(function0, function02, null), 3);
    }

    public static void LJ(C0VSJ c0vsj, File file) {
        if (!Intrinsics.LJFF(c0vsj.getAbsolutePath(), file.getAbsolutePath())) {
            try {
                C08QA.LJIILLIIL(c0vsj, file, true, 4);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static NLETrackSlot LJFF(NLEEditor nLEEditor, NLETrackSlot nLETrackSlot) {
        NLEModel model;
        char c;
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone(true));
        if (nLEEditor != null && (model = nLEEditor.getModel()) != null) {
            NLETrack nLETrack = new NLETrack();
            Iterator<NLETrack> it2 = model.getTracks().iterator();
            if (it2.hasNext()) {
                NLETrack next = it2.next();
                if (it2.hasNext()) {
                    if (next.getExtraTrackType() == NLETrackType.STICKER) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    do {
                        NLETrack next2 = it2.next();
                        if (next2.getExtraTrackType() == NLETrackType.STICKER && c < 1) {
                            next = next2;
                            c = 1;
                        }
                    } while (it2.hasNext());
                }
                nLETrack.setLayer(next.getLayer() + 1);
                nLETrack.setExtraTrackType(NLETrackType.STICKER);
                if (nLETrackSlotDynamicCast != null) {
                    nLETrackSlotDynamicCast.setTransformZ(model.getLayerMax() + 1);
                    nLETrackSlotDynamicCast.setLayer(model.getLayerMax() + 1);
                }
                nLETrack.addSlot(nLETrackSlotDynamicCast);
                model.addTrack(nLETrack);
            } else {
                throw new NoSuchElementException();
            }
        }
        return nLETrackSlotDynamicCast;
    }

    public static String LJIIL(Context context, String str) throws Throwable {
        if (u.LJJIIJZLJL(str, "content://", false)) {
            ContentResolver contentResolver = context.getContentResolver();
            Uri uri = UriProtector.parse(str);
            String string = null;
            Cursor cursorLJJJ = C2204961BRm.LJJJ(contentResolver, uri, new String[]{"_data"}, null, null, null, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYEJJ97iNZknTVMu//6lsVPlMF/xh3yMjXB9EX+N5cT+mRsEIix6zmUcBwbyL0ej0znPyXhkjA4ffPpsTQ7PoQ4GWjdV0ypqpIpY4XTu1/AU4PVgqW/UEljJYQ", null));
            if (cursorLJJJ != null) {
                try {
                    if (cursorLJJJ.moveToFirst()) {
                        string = cursorLJJJ.getString(cursorLJJJ.getColumnIndexOrThrow("_data"));
                    } else {
                        string = null;
                    }
                    C2107108Nh.LIZ(cursorLJJJ, null);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(cursorLJJJ, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = null;
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(cursorLJJJ, th);
                        throw th;
                    }
                }
            }
            if (string == null) {
                return "";
            }
            return string;
        }
        return str;
    }

    public static boolean LJIILL(MotionEvent motionEvent, View view) {
        float x = view.getX() + (view.getWidth() / 2.0f);
        float y = view.getY() + (view.getHeight() / 2.0f);
        float x2 = motionEvent.getX() - x;
        float y2 = motionEvent.getY() - y;
        double radians = Math.toRadians(-view.getRotation());
        double d = x2;
        double d2 = y2;
        float fCos = ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2))) + x;
        float fSin = ((float) ((d * Math.sin(radians)) + (d2 * Math.cos(radians)))) + y;
        if (fCos > view.getX() && fCos < view.getX() + view.getWidth() && fSin > view.getY() && fSin < view.getY() + view.getHeight()) {
            return true;
        }
        return false;
    }

    public static boolean LJIL(int i, boolean z) {
        if (z) {
            return true;
        }
        try {
            C2188781AlQ c2188781AlQ = C2188781AlQ.LIZ;
            Context context = C915980Zwa.LIZJ().context();
            c2188781AlQ.getClass();
            C2188781AlQ.LIZ(context);
            NLE nle = NLE.INSTANCE;
            NLE.loadNLELibrary$default(nle, false, false, false, 7, null);
            nle.setLogLevel(LogLevel.LEVEL_DEBUG);
            nle.setLogger(new NLELoggerListener() { // from class: X.0bOS
                @Override // com.bytedance.ies.nle.editor_jni.NLELoggerListener
                public final void onLog(LogLevel logLevel, String str) {
                    C0TIN.LIZ(logLevel.ordinal(), "tag_nle", str);
                }
            });
            C1A66.LJFF((byte) 31);
            VERuntime.getInstance().setEffectLogLevel(3);
            C971740bOW.LIZ = new InterfaceC971750bOX() { // from class: X.0bOT
                @Override // X.InterfaceC971750bOX
                public final void LIZ(int i2, String str) {
                    C0TIN.LIZ(i2, "tag_ve", str);
                }
            };
            TELog2ClientInvoker.nativeInit();
            TELog2ClientInvoker.nativeSetIsToLogcat(true);
            C1419820n3E.LIZ.LIZ();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryInitAllNLE: ");
            sbLIZ.append(th.getMessage());
            C20441214yg.LIZIZ("MultiCanvasUtils", C2188811AlT.LIZIZ(sbLIZ));
            if (i <= 0) {
                return false;
            }
            return LJIL(i - 1, false);
        }
    }

    public static NoticeboardMaterialInfo LIZLLL(C953270auj c953270auj, String str, C917840Zza c917840Zza) {
        Iterator<CloudDraftItemManager.Label> it2 = c917840Zza.LIZLLL.labels.iterator();
        long length = 0;
        while (it2.hasNext()) {
            length += (long) it2.next().text.length();
        }
        NoticeboardMaterialInfo noticeboardMaterialInfo = new NoticeboardMaterialInfo();
        noticeboardMaterialInfo.backgroundImageUri = c953270auj.LIZ;
        noticeboardMaterialInfo.coverImageUri = c953270auj.LIZIZ;
        noticeboardMaterialInfo.configJsonUri = c953270auj.LIZJ;
        if (str.length() == 0) {
            str = C497740JfY.LJIJI(2131853998);
        }
        noticeboardMaterialInfo.title = str;
        noticeboardMaterialInfo.textCharCount = length;
        noticeboardMaterialInfo.textBoxCount = c917840Zza.LIZLLL.labels.size();
        noticeboardMaterialInfo.thumbCoverImageUri = c953270auj.LIZLLL;
        return noticeboardMaterialInfo;
    }

    public static Bitmap LJI(int i, int i2, String str) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        Boolean boolValueOf = null;
        if (bitmapDecodeFile == null) {
            return null;
        }
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        if (width >= i && height >= i2) {
            InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
            if (interfaceC945610aiNLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC945610aiNLIZ.LJIIIIZZ());
            }
            if (C500260Jjc.LJJJI(boolValueOf) && (width > i || height > i2)) {
                float fMax = Math.max(i / width, i2 / height);
                Matrix matrix = new Matrix();
                matrix.postScale(fMax, fMax);
                bitmapDecodeFile = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix, true);
            }
        } else {
            float fMax2 = Math.max(i / width, i2 / height);
            Matrix matrix2 = new Matrix();
            matrix2.postScale(fMax2, fMax2);
            bitmapDecodeFile = Bitmap.createBitmap(bitmapDecodeFile, 0, 0, width, height, matrix2, true);
        }
        int width2 = (bitmapDecodeFile.getWidth() - i) / 2;
        int height2 = (bitmapDecodeFile.getHeight() - i2) / 2;
        if (width2 >= 0 && height2 >= 0) {
            return Bitmap.createBitmap(bitmapDecodeFile, width2, height2, i, i2);
        }
        return bitmapDecodeFile;
    }

    public static String LJIJJLI(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2(str, true);
        try {
            C0VSV c0vsv = new C0VSV(fileFM2);
            Throwable th = null;
            try {
                bitmap.compress(compressFormat, 100, c0vsv);
                c0vsv.flush();
                C2107108Nh.LIZ(c0vsv, null);
                String absolutePath = fileFM2.getAbsolutePath();
                if (absolutePath == null) {
                    return "";
                }
                return absolutePath;
            } catch (Throwable th2) {
                try {
                    TryCatchGuardChecker.doCheck(th2);
                } catch (Throwable th3) {
                    th = th3;
                }
                try {
                    throw th2;
                } catch (Throwable th4) {
                    th = th4;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(c0vsv, th);
                            throw th;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                }
            }
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C189200o6.m2constructorimpl(new C098200Yq(th6));
            return "";
        }
    }

    public static void LJJ(C971360bNu c971360bNu, NLESegmentTextSticker nLESegmentTextSticker, NLEEditor nLEEditor) {
        nLESegmentTextSticker.setRichContent(LJIILIIL(c971360bNu));
        nLESegmentTextSticker.setContent(c971360bNu.LIZ);
    }

    public static String LJIJI(Bitmap bitmap, int i, int i2, String str, Bitmap.CompressFormat compressFormat) {
        if (bitmap != null) {
            LIZ.getClass();
            float width = i / bitmap.getWidth();
            float height = i2 / bitmap.getHeight();
            if (width <= height) {
                width = height;
            }
            int width2 = (((int) (bitmap.getWidth() * width)) - i) / 2;
            int height2 = (((int) (bitmap.getHeight() * width)) - i2) / 2;
            Rect rect = new Rect(width2, height2, width2 + i, height2 + i2);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, rect, new Rect(0, 0, i, i2), (Paint) null);
            if (LJIIZILJ(bitmapCreateBitmap)) {
                return LJIJJLI(bitmapCreateBitmap, str, compressFormat);
            }
            return "";
        }
        return "";
    }

    public static NLETrackSlot LIZIZ(C971360bNu c971360bNu, NLEEditor nLEEditor, float f, float f2, boolean z, float f3, float f4, int i) {
        if (c971360bNu == null) {
            return null;
        }
        NLETrack nLETrack = new NLETrack();
        nLETrack.setExtraTrackType(NLETrackType.STICKER);
        if (i >= 0) {
            nLETrack.setLayer(i);
        }
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
        nLESegmentTextSticker.setIsRichtext(true);
        LIZ.getClass();
        nLESegmentTextSticker.setRichContent(LJIILIIL(c971360bNu));
        nLESegmentTextSticker.setContent(c971360bNu.LIZ);
        nLETrackSlot.setMainSegment(nLESegmentTextSticker);
        if (!z) {
            f = C363400EMo.LIZ(f);
        }
        nLETrackSlot.setTransformX(f);
        if (!z) {
            f2 = C363400EMo.LIZIZ(f2);
        }
        nLETrackSlot.setTransformY(f2);
        nLETrackSlot.setStartTime(0L);
        nLETrackSlot.setEndTime(-2L);
        nLETrackSlot.setRotation(f3);
        nLETrackSlot.setScale(f4);
        nLETrack.addSlotAtEnd(nLETrackSlot);
        if (nLEEditor != null) {
            NLEModel model = nLEEditor.getModel();
            if (model != null) {
                model.addTrack(nLETrack);
            }
            nLEEditor.commit();
        }
        return (NLETrackSlot) C13LP.LJJJLZIJ(0, nLETrack.getSlots());
    }
}
