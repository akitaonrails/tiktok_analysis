package Y;

import X.C03IT;
import X.C098200Yq;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C189200o6;
import X.C19WF;
import X.C1C7U;
import X.C21694119vH;
import X.C259800zU;
import X.C786410Ut5;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.mix.mixdetail.viewholder.MixFeedCell;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoContainerSugItemCell;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS11S1200000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float fMeasureText;
        TextPaint paint;
        if (((TuxTextView) this.l1).getParent() != null) {
            TuxTextView tuxTextView = ((TakoContainerSugItemCell) this.l2).LL;
            if (tuxTextView == null || (paint = tuxTextView.getPaint()) == null) {
                fMeasureText = 0.0f;
            } else {
                String str = this.s0;
                fMeasureText = paint.measureText(str, 0, str.length());
            }
            int i = fMeasureText <= ((float) ((((TuxTextView) this.l1).getWidth() - ((TuxTextView) this.l1).getPaddingStart()) - ((TuxTextView) this.l1).getPaddingEnd())) ? 1 : 2;
            ((TuxTextView) this.l1).setMaxLines(i);
            ((TuxTextView) this.l1).setLines(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, android.text.Layout] */
    public final void LIZ$1() {
        ((C259800zU) this.l1).element = ((TextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.ohp)).getLayout();
        T t = ((C259800zU) this.l1).element;
        Layout layout = (Layout) t;
        if (layout != null) {
            Layout layout2 = (Layout) t;
            if (layout.getEllipsisCount((layout2 != null ? layout2.getLineCount() : 1) - 1) > 0) {
                C786410Ut5.LLLLZLL((TuxTextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.ohp), 8);
                ((TextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.oho)).setText(this.s0);
                C786410Ut5.LLLLZLL((TuxTextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.oho), 0);
                return;
            }
        }
        C786410Ut5.LLLLZLL((TuxTextView) ((MixFeedCell) this.l2).itemView.findViewById(R.id.ohp), 0);
    }

    public final void LIZ$2() {
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) this.l1;
        C21694119vH c21694119vH = (C21694119vH) this.l2;
        String str = this.s0;
        try {
            UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel != null ? urlModel.getUrlList() : null));
            c1331670kl3LJIIJ.LJJIJL(c21694119vH.LLJIJIL.getContext());
            c21694119vH.LJIJJLI(c1331670kl3LJIIJ, str);
            c1331670kl3LJIIJ.LJJIFFI();
            C189200o6.m2constructorimpl(c1331670kl3LJIIJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ$3() {
        PhotoModeImageUrlModel photoModeImageUrlModel = (PhotoModeImageUrlModel) this.l1;
        C21694119vH c21694119vH = (C21694119vH) this.l2;
        String str = this.s0;
        try {
            UrlModel urlModel = photoModeImageUrlModel.displayImageNoWatermark;
            C1331670kl3 c1331670kl3LJIIJ = C1331660kl2.LJIIJ(new C03IT(urlModel != null ? urlModel.getUrlList() : null));
            c1331670kl3LJIIJ.LJJIJL(c21694119vH.LLJIJIL.getContext());
            c21694119vH.LJIJJLI(c1331670kl3LJIIJ, str);
            c1331670kl3LJIIJ.LJIILIIL();
            C189200o6.m2constructorimpl(c1331670kl3LJIIJ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void run$0(ARunnableS11S1200000_6 aRunnableS11S1200000_6) {
        boolean zLIZ;
        C1C7U.LIZ("StickerButtonPanel@24f3.alphaTo$1");
        try {
            ((TextView) aRunnableS11S1200000_6.l1).setText(aRunnableS11S1200000_6.s0);
            C19WF c19wfLIZIZ = q0.LIZIZ((View) aRunnableS11S1200000_6.l2);
            c19wfLIZIZ.LIZ(1.0f);
            c19wfLIZIZ.LIZJ(100L);
            c19wfLIZIZ.LJFF();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerButtonPanel@24f3.alphaTo$1");
    }

    public static final void run$1(ARunnableS11S1200000_6 aRunnableS11S1200000_6) {
        boolean zLIZ;
        C1C7U.LIZ("TakoContainerSugItemCell@3505.onBindItemView$1$1");
        try {
            aRunnableS11S1200000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoContainerSugItemCell@3505.onBindItemView$1$1");
    }

    public static final void run$2(ARunnableS11S1200000_6 aRunnableS11S1200000_6) {
        boolean zLIZ;
        C1C7U.LIZ("MixFeedCell@a78e.onBindItemView$3$1");
        try {
            aRunnableS11S1200000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MixFeedCell@a78e.onBindItemView$3$1");
    }

    public static final void run$3(ARunnableS11S1200000_6 aRunnableS11S1200000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PhotosItemViewHolder@c326.getTargetImageModel$3$1");
        try {
            aRunnableS11S1200000_6.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotosItemViewHolder@c326.getTargetImageModel$3$1");
    }

    public static final void run$4(ARunnableS11S1200000_6 aRunnableS11S1200000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PhotosItemViewHolder@c326.getTargetImageModel$3$2");
        try {
            aRunnableS11S1200000_6.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotosItemViewHolder@c326.getTargetImageModel$3$2");
    }

    public ARunnableS11S1200000_6(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.s0 = str;
        this.l2 = obj;
    }
}
