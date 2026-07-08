package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextTemplate;
import com.bytedance.ies.nle.editor_jni.NLEStyText;
import com.bytedance.ies.nle.editor_jni.NLETextTemplateClip;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETextTemplateClipSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.AwS0S1104001_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ERj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364650ERj extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<TextStickerModel> LJIILIIL;
    public final C1664680tQA<BaseStickerModel> LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final FrameLayout LJIILLIIL;
    public final InterfaceC388760FMc LJIIZILJ;
    public final NLEEditor LJIJ;
    public final int LJIJI;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        LJIILIIL(true);
    }

    @Override // X.C0ERI
    public final NLETrackSlot LJII() {
        NLEModel model;
        VecNLETrackSPtr tracks;
        String str = this.LJIILIIL.LIZ.getTextTemplateModel().templateuuid;
        if (!(str == null || str.length() == 0) && (model = this.LJIJ.getModel()) != null && (tracks = model.getTracks()) != null) {
            ArrayList arrayList = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C385050F7v.LJIIL(nLETrack)) {
                    arrayList.add(nLETrack);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
                if (slots != null) {
                    for (NLETrackSlot nLETrackSlot : slots) {
                        if (Intrinsics.LJFF(nLETrackSlot.getUUID(), str)) {
                            return nLETrackSlot;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0281, code lost:
    
        if (r8.size() > 1) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI() {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C364650ERj.LJIIJJI():void");
    }

    @Override // X.C0ERI, X.C0FFP
    public final void LIZLLL() {
        NLESegment mainSegment;
        VecNLETextTemplateClipSPtr textClips;
        NLETextTemplateClip nLETextTemplateClip;
        VecNLETextTemplateClipSPtr textClips2;
        NLETextTemplateClip nLETextTemplateClip2;
        VecNLETextTemplateClipSPtr textClips3;
        NLETextTemplateClip nLETextTemplateClip3;
        NLEResourceNode effectSDKFile;
        C0FF8 c0ff8LIZ;
        NLETrackSlot nLETrackSlotLJII = LJII();
        if (nLETrackSlotLJII == null || (mainSegment = nLETrackSlotLJII.getMainSegment()) == null) {
            return;
        }
        InterfaceC388760FMc interfaceC388760FMc = this.LJIIZILJ;
        if (interfaceC388760FMc != null && (c0ff8LIZ = interfaceC388760FMc.LIZ()) != null) {
            c0ff8LIZ.LJIIL();
        }
        NLESegmentTextTemplate nLESegmentTextTemplateDynamicCast = NLESegmentTextTemplate.dynamicCast(mainSegment);
        String content = null;
        if (Intrinsics.LJFF(this.LJIILIIL.LIZ.getTextTemplateModel().templatePath, (nLESegmentTextTemplateDynamicCast == null || (effectSDKFile = nLESegmentTextTemplateDynamicCast.getEffectSDKFile()) == null) ? null : effectSDKFile.getResourceFile())) {
            if (nLESegmentTextTemplateDynamicCast != null) {
                textClips3 = nLESegmentTextTemplateDynamicCast.getTextClips();
                if (textClips3 != null) {
                    content = nLETextTemplateClip3.getContent();
                }
            }
        } else if (nLESegmentTextTemplateDynamicCast != null) {
            NLEResourceNode nLEResourceNode = new NLEResourceNode();
            nLEResourceNode.setResourceFile(this.LJIILIIL.LIZ.getTextTemplateModel().templatePath);
            nLEResourceNode.setResourceType(NLEResType.TEXT_TEMPLATE);
            nLESegmentTextTemplateDynamicCast.setEffectSDKFile(nLEResourceNode);
            textClips3 = nLESegmentTextTemplateDynamicCast.getTextClips();
            if (textClips3 != null && (nLETextTemplateClip3 = (NLETextTemplateClip) C13LP.LJJJLL(textClips3)) != null) {
                content = nLETextTemplateClip3.getContent();
            }
        }
        if (!Intrinsics.LJFF(content, this.LJIILIIL.LIZ.getTextStr()) && nLESegmentTextTemplateDynamicCast != null && (textClips2 = nLESegmentTextTemplateDynamicCast.getTextClips()) != null && (nLETextTemplateClip2 = (NLETextTemplateClip) C13LP.LJJJLL(textClips2)) != null) {
            nLETextTemplateClip2.setContent(this.LJIILIIL.LIZ.getTextStr());
        }
        String str = this.LJIILIIL.LIZ.getTextTemplateModel().useDefaultFont ? this.LJIILIIL.LIZ.getTextTemplateModel().defaultFontPath : this.LJIILIIL.LIZ.getFontModel().localPath;
        NLEStyText nLEStyText = new NLEStyText();
        if (this.LJIILIIL.LIZ.getTextTemplateModel().textParam.length() > 0) {
            nLEStyText = new NLEStyText(this.LJIILIIL.LIZ.getTextTemplateModel().textParam);
        }
        nLEStyText.setTypeSettingKind(0);
        if (!this.LJIILIIL.LIZ.getTextTemplateModel().useDefaultColor) {
            Pair pairLIZLLL = C0F9I.LIZLLL(this.LJIILIIL.LIZ.getColor(), 4);
            nLEStyText.setTextColor(((Number) pairLIZLLL.getFirst()).intValue());
            nLEStyText.setOutlineColor(((Number) pairLIZLLL.getSecond()).intValue());
        }
        nLEStyText.setFont(new NLEResourceNode());
        NLEResourceNode font = nLEStyText.getFont();
        if (font != null) {
            font.setResourceFile(str);
        }
        if (!this.LJIILIIL.LIZ.getTextTemplateModel().useDefaultAlign) {
            nLEStyText.setAlignType(this.LJIILIIL.LIZ.getAlign() - 1);
        }
        if (nLESegmentTextTemplateDynamicCast != null && (textClips = nLESegmentTextTemplateDynamicCast.getTextClips()) != null && (nLETextTemplateClip = (NLETextTemplateClip) C13LP.LJJJLL(textClips)) != null) {
            nLETextTemplateClip.setContentStyle(nLEStyText);
        }
        LJ();
    }

    @Override // X.C0ERI
    public final int LJFF() {
        return this.LJIJI;
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
            AwS0S1104001_5 awS0S1104001_5 = new AwS0S1104001_5(this, nLETrackSlotLJII.getUUID(), width, height, nLETrackSlotLJII.getRotation(), left, top, 0);
            if (z) {
                C0CNO.LIZ(C15O7.LJI, new AwS549S0100000_5(awS0S1104001_5, 1198));
            } else {
                awS0S1104001_5.invoke();
            }
        }
    }

    public final void LJIILIIL(final boolean z) {
        LJIIL(z);
        if (this.LJIILLIIL.getLeft() == 0 && this.LJIILLIIL.getTop() == 0) {
            this.LJIILLIIL.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0ERl
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    this.LL.LJIIL(z);
                }
            });
        }
    }

    public C364650ERj(FrameLayout frameLayout, LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA, C1664680tQA c1664680tQA2, InterfaceC388760FMc interfaceC388760FMc, InterfaceC386690FEd interfaceC386690FEd, VESize vESize) {
        NLEEditor nLEEditorLJI;
        super(interfaceC386690FEd, vESize, c1664680tQA2, lifecycleOwner, frameLayout, interfaceC388760FMc);
        this.LJIIJJI = interfaceC386690FEd;
        this.LJIIL = vESize;
        this.LJIILIIL = c1664680tQA;
        this.LJIILJJIL = c1664680tQA2;
        this.LJIILL = lifecycleOwner;
        this.LJIILLIIL = frameLayout;
        this.LJIIZILJ = interfaceC388760FMc;
        this.LJIJ = (interfaceC386690FEd == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) ? C346630DiP.LIZ() : nLEEditorLJI;
        this.LJIJI = 2000;
    }
}
