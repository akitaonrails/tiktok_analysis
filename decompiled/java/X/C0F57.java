package X;

import Y.AComparatorS24S0000000_5;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0F57, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F57 {
    public final C0F5K LIZ;
    public final C0F5L LIZIZ;
    public final C0F56 LIZJ = new InterfaceC385510F9p() { // from class: X.0F56
        @Override // X.InterfaceC385510F9p
        public final void LIZ() {
            InterfaceC361710EGb interfaceC361710EGb = this.LIZ.LIZ.LJIIJ;
            if (interfaceC361710EGb != null) {
                interfaceC361710EGb.o10(new C0ELW[]{C0ELW.VIDEO, C0ELW.INFO_STICKER, C0ELW.LYRIC_STICKER}, false);
            }
        }

        @Override // X.InterfaceC385510F9p
        public final void LIZIZ() {
            List<TextStickerModel> listSb;
            ViewPropertyAnimator listener;
            ViewPropertyAnimator updateListener;
            Scene sceneLIZ = C0EBE.LIZ(this.LIZ.LIZ.LIZ.getView());
            if (!(sceneLIZ instanceof C19A3) || sceneLIZ == null) {
                return;
            }
            View viewFindViewById = sceneLIZ.findViewById(R.id.fk6);
            if (viewFindViewById != null) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = viewFindViewById.animate();
                if (viewPropertyAnimatorAnimate != null && (listener = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null) {
                    updateListener.cancel();
                }
                C786410Ut5.T4(viewFindViewById, 1.0f);
            }
            this.LIZ.LIZ.LIZ.LLLZZIL.LIZ(C0F58.STICKER_EDIT_PANEL);
            C0EJ3 c0ej3 = this.LIZ.LIZ.LJ;
            if (c0ej3 == null || (listSb = c0ej3.Sb()) == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (TextStickerModel textStickerModel : listSb) {
                if (C0F8Y.LJIIIIZZ(textStickerModel)) {
                    arrayList.add(textStickerModel);
                }
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(C0F7U.LIZJ((TextStickerModel) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList();
            C13LP.LLFII(arrayList2, arrayList3);
            ((C0F5F) this.LIZ.LIZ.LIZ.LLLZL.getValue()).LIZ(C13LP.LJLLLL(new AComparatorS24S0000000_5(60), arrayList3));
        }

        @Override // X.InterfaceC385510F9p
        public final void LIZJ() {
            C19A3 c19a3;
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ.LIZJ;
            if (videoPublishEditModel == null || !C1416310mxZ.LJIIZILJ(videoPublishEditModel)) {
                Scene sceneLIZ = C0EBE.LIZ(this.LIZ.LIZ.LIZ.getView());
                if (!(sceneLIZ instanceof C19A3) || (c19a3 = (C19A3) sceneLIZ) == null || !C363470EMv.LJFF(c19a3)) {
                    this.LIZ.LIZ();
                }
            }
            this.LIZ.LIZ.LIZ.LLLZZIL.LIZIZ(C0F58.STICKER_EDIT_PANEL);
        }

        @Override // X.InterfaceC385510F9p
        public final void O9() {
            C19A3 c19a3;
            VideoPublishEditModel videoPublishEditModel = this.LIZ.LIZ.LIZJ;
            if (videoPublishEditModel == null || !C1416310mxZ.LJIIZILJ(videoPublishEditModel)) {
                return;
            }
            Scene sceneLIZ = C0EBE.LIZ(this.LIZ.LIZ.LIZ.getView());
            if ((sceneLIZ instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ) != null && C363470EMv.LJFF(c19a3)) {
                return;
            }
            this.LIZ.LIZ();
        }
    };

    public final void LIZ() {
        View viewFindViewById;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator listener;
        ViewPropertyAnimator updateListener;
        Scene sceneLIZ = C0EBE.LIZ(this.LIZ.LIZ.getView());
        if (!(sceneLIZ instanceof C19A3) || sceneLIZ == null || (viewFindViewById = sceneLIZ.findViewById(R.id.fk6)) == null) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate != null && (listener = viewPropertyAnimatorAnimate.setListener(null)) != null && (updateListener = listener.setUpdateListener(null)) != null) {
            updateListener.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate2 != null) {
            viewPropertyAnimatorAnimate2.setInterpolator(C1619980sG4.LIZLLL());
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = viewFindViewById.animate();
        if (viewPropertyAnimatorAnimate3 == null || (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate3.alpha(0.0f)) == null || (duration = viewPropertyAnimatorAlpha.setDuration(300L)) == null) {
            return;
        }
        duration.start();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0F56] */
    public C0F57(C0F5K c0f5k, C0F5L c0f5l) {
        this.LIZ = c0f5k;
        this.LIZIZ = c0f5l;
    }
}
