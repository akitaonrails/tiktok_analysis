package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextTemplateModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FEX, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEX extends C0FFD {
    public final Context LJIJJLI;
    public final TextStickerModel LJIL;
    public final FrameLayout LJJ;
    public final C0FFO LJJI;
    public final LifecycleOwner LJJIFFI;
    public final C390420FSm LJJII;
    public final C01GW LJJIII;

    @Override // X.C0FFE
    public final C388890FMp LJJIJIIJI() {
        return null;
    }

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return null;
    }

    @Override // X.C0FFD
    public final void LJJJLL() {
        C0ERI c0eri;
        InterfaceC386690FEd interfaceC386690FEd;
        NLEEditor nLEEditorLJI;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        LLD(true);
        C0FFP c0ffpLJJIL = LJJIL();
        Object obj = null;
        if (!(c0ffpLJJIL instanceof C0ERO) || (c0eri = (C0ERI) c0ffpLJJIL) == null || (interfaceC386690FEd = this.LJIIZILJ) == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) {
            return;
        }
        NLEModel model = nLEEditorLJI.getModel();
        if (model != null) {
            List<NLETrack> listLJIIIIZZ = C385050F7v.LJIIIIZZ(model);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) listLJIIIIZZ).iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList);
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (Intrinsics.LJFF(((NLENode) next).getUUID(), c0eri.LJI)) {
                    obj = next;
                    break;
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
            if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && nLESegmentTextStickerDynamicCast.getIsRichtext()) {
                nLETrackSlot.setMainSegment(new NLESegmentTextSticker());
            }
        }
        LJJIJIIJIL().LLILLL.clear();
    }

    @Override // X.C0FFE
    public final C0FUE LJJJI() {
        Context context = this.LJIJJLI;
        C390420FSm c390420FSm = this.LJJII;
        LJJIJL();
        C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
        return new C390760FTu(this, context, c390420FSm, c0ff8LIZ != null ? c0ff8LIZ.LJIILLIIL() : null);
    }

    @Override // X.C0FFD
    public final void LJJL() {
        C0FFP c0ffp;
        if (C0F8Y.LJIIL(this.LJIL)) {
            C0F8L c0f8l = new C0F8L(this.LJIIZILJ, (VESize) this.LJJIII.getValue(), LJJJZ(), LJJIJ(), this.LJJIFFI, this.LJJ, this.LJIILLIIL);
            c0f8l.LJIIJ = false;
            c0f8l.LJIIL();
            c0ffp = c0f8l;
        } else {
            InterfaceC386690FEd interfaceC386690FEd = this.LJIIZILJ;
            VESize vESize = (VESize) this.LJJIII.getValue();
            C1664680tQA<TextStickerModel> c1664680tQALJJJZ = LJJJZ();
            C1664680tQA<BaseStickerModel> c1664680tQALJJIJ = LJJIJ();
            LifecycleOwner lifecycleOwner = this.LJJIFFI;
            FrameLayout frameLayout = this.LJJ;
            C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
            if (c0ff8LIZ != null) {
                c0ff8LIZ.LJIILLIIL();
            }
            C364650ERj c364650ERj = new C364650ERj(frameLayout, lifecycleOwner, c1664680tQALJJJZ, c1664680tQALJJIJ, this.LJIILLIIL, interfaceC386690FEd, vESize);
            c364650ERj.LJIIJ = false;
            c364650ERj.LJIIJJI();
            c0ffp = c364650ERj;
        }
        this.LJIIIZ = c0ffp;
        LJJJIL();
        LJJJ();
        C390420FSm c390420FSm = this.LJJII;
        C1664680tQA<TextStickerModel> c1664680tQALJJJZ2 = LJJJZ();
        C0FFP c0ffpLJJIL = LJJIL();
        C0FF8 c0ff8LIZ2 = this.LJIILLIIL.LIZ();
        LIZ(new C0FES(c390420FSm, c1664680tQALJJJZ2, c0ffpLJJIL, c0ff8LIZ2 != null ? c0ff8LIZ2.LJIILLIIL() : null, this.LJIIZILJ));
    }

    @Override // X.C0FFE
    public final void LJJJ() {
        C0FF8 c0ff8LIZ;
        C0FK0 c0fk0LJIILLIIL;
        if (LJJIJL().LIZ.LJIILJJIL && (c0ff8LIZ = this.LJIILLIIL.LIZ()) != null && (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) != null && c0fk0LJIILLIIL.LJIJI) {
            LIZ(new C0FEP(new AwS549S0100000_5(this, 21), new AwS549S0100000_5(this, 22)));
        }
    }

    @Override // X.C0FFD
    public final void LJJJLZIJ() {
        BaseStickerModel baseStickerModel = LJJIJ().LIZ;
        if (baseStickerModel.getWidth() <= 0 || baseStickerModel.getHeight() <= 0 || baseStickerModel.getMediaWidth() <= 0 || baseStickerModel.getMediaHeight() <= 0) {
            return;
        }
        LJJJZ().LIZLLL(new AwS584S0100000_5(this, 6), true);
    }

    @Override // X.C0FFD, X.C0FFE
    public final LifecycleOwner LJJIJIL() {
        return this.LJJIFFI;
    }

    @Override // X.C0FFE
    public final C0FFO LJJIJLIJ() {
        return this.LJJI;
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIIJJI(StickerModel stickerModel) {
        LJIL(stickerModel, true);
    }

    @Override // X.C0FFE, X.C0FTJ
    public final void LJIL(StickerModel stickerModel, boolean z) {
        C0ERI c0eri;
        TextStickerModel textStickerModel;
        boolean z2;
        C364650ERj c364650ERj;
        C0FFP c0ffpLJJIL = LJJIL();
        String str = null;
        if ((c0ffpLJJIL instanceof C0ERI) && (c0eri = (C0ERI) c0ffpLJJIL) != null) {
            c0eri.LJIIJ = z;
            if (stickerModel instanceof TextStickerModel) {
                textStickerModel = (TextStickerModel) stickerModel;
            } else {
                textStickerModel = null;
            }
            if (textStickerModel != null) {
                C013C c013c = new C013C();
                c013c.element = textStickerModel.getVisible();
                if (textStickerModel.getVisible() && !LJJJZ().LIZ.getVisible()) {
                    c013c.element = false;
                    z2 = true;
                } else {
                    z2 = false;
                }
                LJJJZ().LIZLLL(new AwS371S0200000_5(textStickerModel, c013c, 4), true);
                LJJJLIIL(((TextStickerModel) stickerModel).getBaseStickerModel());
            } else {
                z2 = false;
            }
            super.LJIIJJI(stickerModel);
            if (C0F8Y.LJIIL(this.LJIL) && textStickerModel != null) {
                TextTemplateModel textTemplateModel = textStickerModel.getTextTemplateModel();
                if (textTemplateModel != null) {
                    str = textTemplateModel.templateuuid;
                }
                textStickerModel.setUuid(str);
            }
            if (z2 && textStickerModel != null) {
                LJJJZ().LIZLLL(new AwS584S0100000_5(textStickerModel, 7), true);
                if (C0F8Y.LJIIL(this.LJIL)) {
                    c0eri.LIZIZ();
                } else if ((c0eri instanceof C364650ERj) && (c364650ERj = (C364650ERj) c0eri) != null) {
                    c364650ERj.LJIILIIL(false);
                }
            }
            LJJJLZIJ();
            c0eri.LJIIJ = true;
        }
    }

    public C0FEX(Context context, TextStickerModel textStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        super(context, textStickerModel, c0ffo, lifecycleOwner, c390420FSm);
        this.LJIJJLI = context;
        this.LJIL = textStickerModel;
        this.LJJ = frameLayout;
        this.LJJI = c0ffo;
        this.LJJIFFI = lifecycleOwner;
        this.LJJII = c390420FSm;
        this.LJJIII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 23));
    }
}
