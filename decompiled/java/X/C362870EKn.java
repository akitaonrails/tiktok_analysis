package X;

import Y.ARunnableS105S0100000_5;
import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0EKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C362870EKn extends C0ERI {
    public final InterfaceC386690FEd LJIIJJI;
    public final VESize LJIIL;
    public final C1664680tQA<LyricStickerModel> LJIILIIL;
    public final C1664680tQA<BaseStickerModel> LJIILJJIL;
    public final LifecycleOwner LJIILL;
    public final FrameLayout LJIILLIIL;
    public final NLEEditor LJIIZILJ;
    public final C0EK5 LJIJ;

    @Override // X.C0ERI, X.C0FFP
    public final void LIZIZ() {
        if (this.LJIIJ && LJI()) {
            if (this.LJIILJJIL.LIZ.getWidth() <= 0 || this.LJIILJJIL.LIZ.getHeight() <= 0 || this.LJIILJJIL.LIZ.getContainerWidth() <= 0 || this.LJIILJJIL.LIZ.getContainerHeight() <= 0 || this.LJIILLIIL.getTop() != this.LJIILJJIL.LIZ.getContainerTop() || this.LJIILJJIL.LIZ.getContainerWidth() != this.LJIILLIIL.getWidth() || this.LJIILJJIL.LIZ.getContainerHeight() != this.LJIILLIIL.getHeight()) {
                LJIIJJI();
                if (this.LJIILLIIL.getLeft() == 0 && this.LJIILLIIL.getTop() == 0) {
                    HandlerHook.viewPost(this.LJIILLIIL, new ARunnableS105S0100000_5(this, 89));
                }
            }
        }
    }

    @Override // X.C0ERI
    public final void LJIIIIZZ() {
        LJIIIZ(this.LJIILJJIL.LJI, this.LJIILL, new AwS584S0100000_5(this, 922));
        LJIIIZ(this.LJIILIIL.LJI, this.LJIILL, new AwS584S0100000_5(this, 923));
    }

    public final void LJIIJJI() {
        Integer recommendWidth;
        int iIntValue;
        int left = this.LJIILLIIL.getLeft();
        int top = this.LJIILLIIL.getTop();
        int width = this.LJIILLIIL.getWidth() > 0 ? this.LJIILLIIL.getWidth() : this.LJIILLIIL.getLayoutParams().width;
        int height = this.LJIILLIIL.getHeight() > 0 ? this.LJIILLIIL.getHeight() : this.LJIILLIIL.getLayoutParams().height;
        if (width <= 0 || height <= 0 || (recommendWidth = this.LJIILIIL.LIZ.getRecommendWidth()) == null) {
            return;
        }
        int iIntValue2 = recommendWidth.intValue();
        Integer recommendHeight = this.LJIILIIL.LIZ.getRecommendHeight();
        if (recommendHeight == null || (iIntValue = recommendHeight.intValue()) <= 0 || iIntValue2 <= 0) {
            return;
        }
        float f = width / 720.0f;
        int i = (int) (iIntValue2 * f);
        int i2 = (int) (iIntValue * f);
        Rect rect = new Rect();
        int i3 = (width - i) / 2;
        rect.left = i3;
        rect.right = i3 + i;
        int i4 = (height - i2) / 2;
        rect.top = i4;
        rect.bottom = i4 + i2;
        this.LJIILJJIL.LIZLLL(new C362880EKo(rect, width, height, left, top), true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a3, code lost:
    
        if (r5.size() > 1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C362870EKn(X.InterfaceC386690FEd r20, com.ss.android.vesdk.VESize r21, X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel> r22, X.C1664680tQA<com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel> r23, androidx.lifecycle.LifecycleOwner r24, android.widget.FrameLayout r25) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C362870EKn.<init>(X.0FEd, com.ss.android.vesdk.VESize, X.0tQA, X.0tQA, androidx.lifecycle.LifecycleOwner, android.widget.FrameLayout):void");
    }
}
