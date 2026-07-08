package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLEStyStickerAnim;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ERO, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ERO extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<TextStickerModel> LJIILIIL;
    public final C1664680tQA<BaseStickerModel> LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final FrameLayout LJIILLIIL;
    public final InterfaceC388760FMc LJIIZILJ;
    public final C0FK0 LJIJ;
    public final NLEEditor LJIJI;
    public C364590ERd LJIJJ;
    public boolean LJIJJLI;
    public final int LJIL;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        LJIILLIIL(true);
    }

    public final NLEStyStickerAnim LJIIJJI() {
        return C385050F7v.LJFF(this.LJIILIIL.LIZ.getTextMotionModel(), new C0ERP(this.LJIILIIL.LIZ));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x018a, code lost:
    
        if (r8.size() > 1) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ERO.LJIILIIL():void");
    }

    public final NLESegmentTextSticker LJIILJJIL() {
        String str;
        NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
        nLESegmentTextSticker.setIsRichtext(true);
        TextStickerModel textStickerModel = this.LJIILIIL.LIZ;
        C0FK0 c0fk0 = this.LJIJ;
        if (c0fk0 == null || (str = c0fk0.LJIJJLI) == null) {
            str = "";
        }
        nLESegmentTextSticker.setRichContent(C385050F7v.LIZIZ(textStickerModel, str));
        nLESegmentTextSticker.setContent(C385050F7v.LIZ(this.LJIILIIL.LIZ));
        return nLESegmentTextSticker;
    }

    public final void LJIIZILJ() {
        NLETrackSlot next;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        String str;
        if (LJI()) {
            Iterator<NLETrack> it2 = this.LJIJI.getModel().getTracks().iterator();
            while (it2.hasNext()) {
                Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.getUUID(), this.LJI)) {
                            break;
                        }
                    }
                }
                NLETrackSlot nLETrackSlot = next;
                if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null) {
                    nLESegmentTextStickerDynamicCast.setIsRichtext(true);
                    TextStickerModel textStickerModel = this.LJIILIIL.LIZ;
                    C0FK0 c0fk0 = this.LJIJ;
                    if (c0fk0 == null || (str = c0fk0.LJIJJLI) == null) {
                        str = "";
                    }
                    nLESegmentTextStickerDynamicCast.setRichContent(C385050F7v.LIZIZ(textStickerModel, str));
                    nLESegmentTextStickerDynamicCast.setContent(C385050F7v.LIZ(this.LJIILIIL.LIZ));
                    nLESegmentTextStickerDynamicCast.setAlpha(C385630FAb.LIZ(this.LJIILJJIL.LIZ));
                    LJ();
                    C0FF8 c0ff8LIZ = this.LJIIZILJ.LIZ();
                    if (c0ff8LIZ != null) {
                        c0ff8LIZ.LJIIL();
                    }
                }
            }
        }
    }

    @Override // X.C0ERI, X.C0FFP
    public final void destroy() {
        super.destroy();
        this.LJIJJLI = true;
    }

    @Override // X.C0ERI, X.C0FFP
    public final void LIZLLL() {
        LJIIZILJ();
    }

    @Override // X.C0ERI
    public final int LJFF() {
        return this.LJIL;
    }

    public final void LJIIL(NLETrackSlot nLETrackSlot) {
        String str;
        TextMotionModel textMotionModel = this.LJIILIIL.LIZ.getTextMotionModel();
        nLETrackSlot.setExtra("motion_id", textMotionModel.motionId);
        nLETrackSlot.setExtra("motion_res_id", textMotionModel.motionResId);
        nLETrackSlot.setExtra("animation_type", String.valueOf(textMotionModel.motionType));
        nLETrackSlot.setExtra("animation_duration", String.valueOf(textMotionModel.motionDuration));
        if (textMotionModel.lastMotionEnabledState) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        nLETrackSlot.setExtra("motion_enabled_on_last_use", str);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(boolean r15) {
        /*
            r14 = this;
            r5 = r14
            boolean r0 = r5.LJIIJ
            if (r0 != 0) goto L6
            return
        L6:
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r12 = r0.getLeft()
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r13 = r0.getTop()
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r0 = r0.getWidth()
            if (r0 <= 0) goto L99
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r8 = r0.getWidth()
        L20:
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L90
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            int r9 = r0.getHeight()
        L2e:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r4 = r5.LJII()
            if (r4 == 0) goto L72
            X.0ERd r3 = r5.LJIJJ
            if (r3 == 0) goto L55
            X.0tQA<com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel> r0 = r5.LJIILIIL
            STATE r2 = r0.LIZ
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel r2 = (com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel) r2
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerCompatModel r0 = r2.getCompatModel()
            boolean r0 = r0.isFromMaeTemplate()
            r1 = 1
            if (r0 != 0) goto L7b
            boolean r0 = r2.getAutoAdaptCanvas()
            if (r0 == 0) goto L73
            java.util.List r0 = r2.getCanvasWHFixed()
            if (r0 == 0) goto L73
        L55:
            r6 = 0
        L56:
            float r11 = r4.getRotation()
            java.lang.String r7 = r4.getUUID()
            X.0ERa r4 = new X.0ERa
            r10 = r15
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r10 == 0) goto La3
            if (r6 != 0) goto La3
            kotlin.jvm.internal.AwS549S0100000_5 r1 = new kotlin.jvm.internal.AwS549S0100000_5
            r0 = 1490(0x5d2, float:2.088E-42)
            r1.<init>(r4, r0)
            X.C0CNO.LIZIZ(r1)
        L72:
            return
        L73:
            X.0FK0 r0 = r3.LIZJ
            if (r0 == 0) goto L7d
            boolean r0 = r0.LJJIIZI
            if (r0 != r1) goto L7d
        L7b:
            r6 = 1
            goto L56
        L7d:
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r2.getTextMotionModel()
            boolean r0 = X.C363290EMd.LIZ(r0)
            if (r0 == 0) goto L55
            com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextMotionModel r0 = r2.getTextMotionModel()
            boolean r0 = r0.autoWrapLine
            if (r0 == 0) goto L55
            goto L7b
        L90:
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r9 = r0.height
            goto L2e
        L99:
            android.widget.FrameLayout r0 = r5.LJIILLIIL
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            int r8 = r0.width
            goto L20
        La3:
            r4.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ERO.LJIILL(boolean):void");
    }

    public final void LJIILLIIL(final boolean z) {
        if (!LJI()) {
            return;
        }
        LJIILL(z);
        if (this.LJIILLIIL.getLeft() == 0 && this.LJIILLIIL.getTop() == 0) {
            this.LJIILLIIL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0ERS
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    C0ERO c0ero = this.LL;
                    if (!c0ero.LJIJJLI) {
                        c0ero.LJIILL(z);
                    }
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ERO(InterfaceC386690FEd interfaceC386690FEd, VESize vESize, C1664680tQA c1664680tQA, C1664680tQA c1664680tQA2, LifecycleOwner lifecycleOwner, FrameLayout frameLayout, InterfaceC388760FMc interfaceC388760FMc) {
        C0FK0 c0fk0LJIILLIIL;
        NLEEditor nLEEditorLJI;
        super(interfaceC386690FEd, vESize, c1664680tQA2, lifecycleOwner, frameLayout);
        C0FF8 c0ff8LIZ = interfaceC388760FMc.LIZ();
        if (c0ff8LIZ != null) {
            c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL();
        } else {
            c0fk0LJIILLIIL = null;
        }
        this.LJIIJJI = interfaceC386690FEd;
        this.LJIIL = vESize;
        this.LJIILIIL = c1664680tQA;
        this.LJIILJJIL = c1664680tQA2;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = frameLayout;
        this.LJIIZILJ = interfaceC388760FMc;
        this.LJIJ = c0fk0LJIILLIIL;
        this.LJIJI = (interfaceC386690FEd == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) ? C346630DiP.LIZ() : nLEEditorLJI;
        this.LJIL = 2000;
    }
}
