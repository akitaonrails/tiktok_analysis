package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FEY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEY extends C0FFD {
    public final Context LJIJJLI;
    public final TextStickerModel LJIL;
    public final FrameLayout LJJ;
    public final C0FFO LJJI;
    public final LifecycleOwner LJJIFFI;
    public final C390420FSm LJJII;
    public final C364590ERd LJJIII;
    public final C01GW LJJIIJ;

    @Override // X.C0FFE
    public final View LJJJJJ() {
        return null;
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
        C0ERO c0ero = new C0ERO(this.LJIIZILJ, (VESize) this.LJJIIJ.getValue(), LJJJZ(), LJJIJ(), this.LJJIFFI, this.LJJ, this.LJIILLIIL);
        c0ero.LJIIJ = false;
        c0ero.LJIILIIL();
        c0ero.LJIJJ = this.LJJIII;
        this.LJIIIZ = c0ero;
        LJJJIL();
        LJJJ();
        C390420FSm c390420FSm = this.LJJII;
        C1664680tQA<TextStickerModel> c1664680tQALJJJZ = LJJJZ();
        C0FFP c0ffpLJJIL = LJJIL();
        C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
        LIZ(new C0FES(c390420FSm, c1664680tQALJJJZ, c0ffpLJJIL, c0ff8LIZ != null ? c0ff8LIZ.LJIILLIIL() : null, this.LJIIZILJ));
    }

    @Override // X.C0FFE
    public final void LJJJ() {
        C0FF8 c0ff8LIZ;
        C0FK0 c0fk0LJIILLIIL;
        if (LJJIJL().LIZ.LJIILJJIL && (c0ff8LIZ = this.LJIILLIIL.LIZ()) != null && (c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL()) != null && c0fk0LJIILLIIL.LJIJI) {
            LIZ(new C0FEP(new AwS549S0100000_5(this, 18), new AwS549S0100000_5(this, 19)));
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C0FFD, X.C0FFE
    public final void LJJJIL() {
        super.LJJJIL();
        C19658611vk c19658611vk = new C19658611vk(new C19658511vj(new C19658411vi(LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FEZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getWidth());
            }
        }), LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FEa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getHeight());
            }
        })), LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FEb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getMediaWidth());
            }
        })), LJJIJ().LIZ(new C2217381BqS() { // from class: X.0FEc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((BaseStickerModel) obj).getMediaHeight());
            }
        }));
        LifecycleOwner lifecycleOwner = this.LJJIFFI;
        C0FXL c0fxl = new C0FXL(this, 0);
        c19658611vk.LIZJ.LJIIIZ(lifecycleOwner, Lifecycle.State.STARTED, new AwS584S0100000_5(c0fxl, 941));
    }

    @Override // X.C0FFD
    public final void LJJJLL() {
        C0ERO c0ero;
        NLEEditor nLEEditorLJI;
        Object next;
        NLESegmentTextSticker nLESegmentTextStickerDynamicCast;
        C0FFP c0ffpLJJIL = LJJIL();
        if (!(c0ffpLJJIL instanceof C0ERO) || (c0ero = (C0ERO) c0ffpLJJIL) == null) {
            return;
        }
        c0ero.LJIJJLI = true;
        InterfaceC386690FEd interfaceC386690FEd = this.LJIIZILJ;
        if (interfaceC386690FEd == null || (nLEEditorLJI = interfaceC386690FEd.LJI()) == null) {
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
                    next = null;
                    break;
                } else {
                    next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), c0ero.LJI)) {
                        break;
                    }
                }
            }
            NLETrackSlot nLETrackSlot = (NLETrackSlot) next;
            if (nLETrackSlot != null && (nLESegmentTextStickerDynamicCast = NLESegmentTextSticker.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && nLESegmentTextStickerDynamicCast.getIsRichtext()) {
                NLESegmentTextSticker nLESegmentTextSticker = new NLESegmentTextSticker();
                NLESegment mainSegment = nLETrackSlot.getMainSegment();
                NLENode nLENodeDeepCloneWithUUID = nLESegmentTextSticker.deepCloneWithUUID(mainSegment != null ? mainSegment.getUUID() : null);
                if (nLENodeDeepCloneWithUUID != null) {
                    nLETrackSlot.setMainSegment(NLESegmentTextSticker.dynamicCast(nLENodeDeepCloneWithUUID));
                }
            }
        }
        LJJIJIIJIL().LLILLL.clear();
    }

    @Override // X.C0FFD
    public final void LJJJLZIJ() {
        BaseStickerModel baseStickerModel = LJJIJ().LIZ;
        if (baseStickerModel.getWidth() <= 0 || baseStickerModel.getHeight() <= 0 || baseStickerModel.getMediaWidth() <= 0 || baseStickerModel.getMediaHeight() <= 0) {
            return;
        }
        LJJJZ().LIZLLL(new AwS584S0100000_5(this, 4), true);
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
        C0ERO c0ero;
        boolean z2;
        C0FFP c0ffpLJJIL = LJJIL();
        TextStickerModel textStickerModel = null;
        if ((c0ffpLJJIL instanceof C0ERO) && (c0ero = (C0ERO) c0ffpLJJIL) != null) {
            c0ero.LJIIJ = z;
            if (stickerModel instanceof TextStickerModel) {
                textStickerModel = (TextStickerModel) stickerModel;
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
                LJJJZ().LIZLLL(new AwS371S0200000_5(textStickerModel, c013c, 3), true);
                LJJJLIIL(((TextStickerModel) stickerModel).getBaseStickerModel());
            } else {
                z2 = false;
            }
            super.LJIIJJI(stickerModel);
            if (z2 && textStickerModel != null) {
                LJJJZ().LIZLLL(new AwS584S0100000_5(textStickerModel, 5), true);
                c0ero.LJIILLIIL(false);
            }
            LJJJLZIJ();
            c0ero.LJIIJ = true;
        }
    }

    public C0FEY(Context context, TextStickerModel textStickerModel, FrameLayout frameLayout, C0FFO c0ffo, LifecycleOwner lifecycleOwner, C390420FSm c390420FSm) {
        C0FK0 c0fk0LJIILLIIL;
        super(context, textStickerModel, c0ffo, lifecycleOwner, c390420FSm);
        this.LJIJJLI = context;
        this.LJIL = textStickerModel;
        this.LJJ = frameLayout;
        this.LJJI = c0ffo;
        this.LJJIFFI = lifecycleOwner;
        this.LJJII = c390420FSm;
        C0FKI c0fki = this.LJIJ;
        C0FF8 c0ff8LIZ = this.LJIILLIIL.LIZ();
        if (c0ff8LIZ != null) {
            c0fk0LJIILLIIL = c0ff8LIZ.LJIILLIIL();
        } else {
            c0fk0LJIILLIIL = null;
        }
        this.LJJIII = new C364590ERd(frameLayout, c0fki, c0fk0LJIILLIIL);
        this.LJJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 20));
    }
}
