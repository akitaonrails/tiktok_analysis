package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentImageSticker;
import com.bytedance.ies.nle.editor_jni.NLESegmentInfoSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS0S1104001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363850EOh extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<InfoStickerModel> LJIILIIL;
    public final C1664680tQA<BaseStickerModel> LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final FrameLayout LJIILLIIL;
    public final NLEEditor LJIIZILJ;
    public final long LJIJ;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        LJIILIIL(true);
    }

    @Override // X.C0ERI
    public final int LJFF() {
        return 0;
    }

    public final void LJIIL(boolean z) {
        int width;
        int height;
        if (!this.LJIIJ) {
            return;
        }
        int left = this.LJIILLIIL.getLeft();
        int top = this.LJIILLIIL.getTop();
        if (this.LJIILLIIL.getWidth() > 0) {
            width = this.LJIILLIIL.getWidth();
        } else {
            width = this.LJIILLIIL.getLayoutParams().width;
        }
        if (this.LJIILLIIL.getHeight() > 0) {
            height = this.LJIILLIIL.getHeight();
        } else {
            height = this.LJIILLIIL.getLayoutParams().height;
        }
        NLETrackSlot nLETrackSlotLJII = LJII();
        if (nLETrackSlotLJII != null) {
            AwS0S1104001_5 awS0S1104001_5 = new AwS0S1104001_5(this, nLETrackSlotLJII.getUUID(), width, height, nLETrackSlotLJII.getRotation(), left, top, 1);
            if (z) {
                C0CNO.LIZ(C15O7.LJI, new AwS549S0100000_5(awS0S1104001_5, 1675));
            } else {
                awS0S1104001_5.invoke();
            }
        }
    }

    public final void LJIILIIL(final boolean z) {
        LJIIL(z);
        if (this.LJIILLIIL.getLeft() == 0 && this.LJIILLIIL.getTop() == 0) {
            this.LJIILLIIL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0EOx
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    this.LL.LJIIL(z);
                }
            });
        }
    }

    public static NLETrackSlot LJIIJJI(C363850EOh c363850EOh, C089X c089x, C350910DpJ c350910DpJ, C363980EOu c363980EOu) {
        Integer numValueOf;
        int iIntValue;
        long micros;
        INLEMediaSession iNLEMediaSessionF1;
        INLEPlayer playerApi;
        long startTime;
        int iIntValue2;
        long micros2;
        INLEMediaSession iNLEMediaSessionF12;
        INLEPlayer playerApi2;
        long startTime2;
        String str;
        NLEModel model = c363850EOh.LJIIZILJ.getModel();
        NLETrack nLETrack = c350910DpJ.LJIIJJI;
        if (nLETrack == null) {
            nLETrack = new NLETrack();
        }
        NLETrackSlot nLETrackSlot = c350910DpJ.LJIIL;
        if (nLETrackSlot == null) {
            nLETrackSlot = new NLETrackSlot();
        }
        if (C351420Dq8.LIZLLL(model)) {
            numValueOf = Integer.valueOf(C351420Dq8.LJ(model, EnumC355980DxU.STICKER));
        } else {
            numValueOf = null;
        }
        long currentPosition = 0;
        if (c089x == C089X.INFO) {
            if (numValueOf != null) {
                iIntValue2 = numValueOf.intValue();
            } else {
                iIntValue2 = c350910DpJ.LJIIJ;
            }
            nLETrackSlot.setLayer(iIntValue2);
            Long l = c350910DpJ.LJFF;
            if (l != null) {
                micros2 = l.longValue();
            } else {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                InterfaceC386690FEd interfaceC386690FEd = c363850EOh.LJIIJJI;
                if (interfaceC386690FEd != null && (iNLEMediaSessionF12 = interfaceC386690FEd.f1()) != null && (playerApi2 = iNLEMediaSessionF12.getPlayerApi()) != null) {
                    currentPosition = playerApi2.getCurrentPosition();
                }
                micros2 = timeUnit.toMicros(currentPosition / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            nLETrackSlot.setStartTime(micros2);
            Long l2 = c350910DpJ.LJI;
            if (l2 != null) {
                startTime2 = l2.longValue();
            } else {
                startTime2 = nLETrackSlot.getStartTime() + c363850EOh.LJIJ;
            }
            nLETrackSlot.setEndTime(startTime2);
            nLETrackSlot.setExtra("previewIconPath", c350910DpJ.LIZ);
            NLESegmentInfoSticker nLESegmentInfoSticker = new NLESegmentInfoSticker();
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(c350910DpJ.LIZIZ);
            nLEResourceNode.setResourceType(NLEResType.INFO_STICKER);
            String str2 = c350910DpJ.LIZJ;
            if (str2 != null) {
                nLEResourceNode.setResourceId(str2);
            }
            if (C1452960nug.LJIIIZ && (str = c350910DpJ.LJIIIIZZ) != null && str.length() != 0) {
                nLEResourceNode.setExtra("biz_res_id", C0FGD.LIZ(c350910DpJ.LJII, c350910DpJ.LJIIIIZZ));
            }
            nLESegmentInfoSticker.setEffectSDKFile(nLEResourceNode);
            nLESegmentInfoSticker.setAlpha(c363980EOu.LJ);
            nLETrackSlot.setMainSegment(nLESegmentInfoSticker);
            nLETrackSlot.setTransformX(c363980EOu.LIZ);
            nLETrackSlot.setTransformY(c363980EOu.LIZIZ);
            nLETrackSlot.setRotation(c363980EOu.LIZLLL);
            nLETrackSlot.setMirror_X(c363980EOu.LJFF);
            nLETrackSlot.setMirror_Y(c363980EOu.LJI);
            nLETrackSlot.setScale(c363980EOu.LIZJ);
        } else {
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = c350910DpJ.LJIIJ;
            }
            nLETrackSlot.setLayer(iIntValue);
            nLETrackSlot.setExtra("previewIconPath", c350910DpJ.LIZ);
            nLETrackSlot.setTransformX(c363980EOu.LIZ);
            nLETrackSlot.setTransformY(c363980EOu.LIZIZ);
            Long l3 = c350910DpJ.LJFF;
            if (l3 != null) {
                micros = l3.longValue();
            } else {
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                InterfaceC386690FEd interfaceC386690FEd2 = c363850EOh.LJIIJJI;
                if (interfaceC386690FEd2 != null && (iNLEMediaSessionF1 = interfaceC386690FEd2.f1()) != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
                    currentPosition = playerApi.getCurrentPosition();
                }
                micros = timeUnit2.toMicros(currentPosition / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
            }
            nLETrackSlot.setStartTime(micros);
            Long l4 = c350910DpJ.LJI;
            if (l4 != null) {
                startTime = l4.longValue();
            } else {
                startTime = nLETrackSlot.getStartTime() + c363850EOh.LJIJ;
            }
            nLETrackSlot.setEndTime(startTime);
            NLESegmentImageSticker nLESegmentImageSticker = new NLESegmentImageSticker();
            NLEResourceNode nLEResourceNode2 = new NLEResourceNode();
            nLEResourceNode2.setResourceFile(c350910DpJ.LIZIZ);
            nLEResourceNode2.setResourceType(NLEResType.IMAGE_STICKER);
            nLESegmentImageSticker.setImageFile(nLEResourceNode2);
            nLETrackSlot.setMainSegment(nLESegmentImageSticker);
            nLETrackSlot.setRelativeWidth(c350910DpJ.LIZLLL);
            nLETrackSlot.setRelativeHeight(c350910DpJ.LJ);
            nLETrackSlot.setScale(0.4f);
        }
        nLETrack.setLayer(c350910DpJ.LJIIIZ);
        nLETrack.setExtra("track_type", "sticker");
        nLETrack.setExtraTrackType(NLETrackType.STICKER);
        nLETrack.setExtra("StickerTrackType", "INFO");
        C351220Dpo.LLLLJI(nLETrack);
        nLETrack.addSlot(nLETrackSlot);
        VecNLETrackSPtr tracks = model.getTracks();
        if ((tracks instanceof Collection) && tracks.isEmpty()) {
            model.addTrack(nLETrack);
        } else {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next(), nLETrack)) {
                    break;
                }
            }
            model.addTrack(nLETrack);
        }
        c363850EOh.LJIIZILJ.commit();
        return nLETrackSlot;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04c3 A[PHI: r1
      0x04c3: PHI (r1v44 java.lang.String) = (r1v7 java.lang.String), (r1v47 java.lang.String) binds: [B:130:0x04b0, B:156:0x0650] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018a  */
    /* JADX WARN: Type inference failed for: r2v168, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel] */
    /* JADX WARN: Type inference failed for: r2v47, types: [T, com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r4v2, types: [STATE, T] */
    /* JADX WARN: Type inference failed for: r4v35, types: [STATE, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C363850EOh(X.InterfaceC386690FEd r63, com.ss.android.vesdk.VESize r64, X.C1664680tQA r65, X.C1664680tQA r66, androidx.lifecycle.LifecycleOwner r67, android.widget.FrameLayout r68) {
        /*
            Method dump skipped, instruction units count: 1887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C363850EOh.<init>(X.0FEd, com.ss.android.vesdk.VESize, X.0tQA, X.0tQA, androidx.lifecycle.LifecycleOwner, android.widget.FrameLayout):void");
    }
}
