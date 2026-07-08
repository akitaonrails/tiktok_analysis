package Y;

import X.C0EPT;
import X.C0FSX;
import X.C0FSY;
import X.C1C7U;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.effect.EffectModel;
import java.util.List;
import kotlin.jvm.internal.AwS90S1200000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS6S1300000_5 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((View) this.l1).getParent() != null) {
            int[] iArr = new int[2];
            ((View) this.l1).getLocationOnScreen(iArr);
            ((C0FSY) this.l2).LLILLL.setText(this.s0);
            ((C0FSY) this.l2).LLILLL.setMaxWidth(((View) this.l1).getWidth());
            ((C0FSY) this.l2).LLILLL.setMaxLines(10);
            if (((C0FSY) this.l2).LLILLL.getParent() == null) {
                C0FSY c0fsy = (C0FSY) this.l2;
                c0fsy.LLILLJJLI.addView(c0fsy.LLILLL);
            }
            C0FSY c0fsy2 = (C0FSY) this.l2;
            HandlerHook.viewPost(c0fsy2.LLILLL, new ARunnableS14S0400000_5((C0FSX) this.l3, iArr, (View) this.l1, c0fsy2, 4));
        }
    }

    public static final void run$0(ARunnableS6S1300000_5 aRunnableS6S1300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("EditEffectComponentV2@ada7.applyMagicEffect$2$1$2");
        try {
            ((C0EPT) aRunnableS6S1300000_5.l1).i3(new AwS90S1200000_5((List) aRunnableS6S1300000_5.l2, (List<? extends NLETrackSlot>) aRunnableS6S1300000_5.l3, (EffectModel) aRunnableS6S1300000_5.s0, (String) 0));
            C0EPT.r8((C0EPT) aRunnableS6S1300000_5.l1, true, true, null, -1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditEffectComponentV2@ada7.applyMagicEffect$2$1$2");
    }

    public static final void run$1(ARunnableS6S1300000_5 aRunnableS6S1300000_5) {
        boolean zLIZ;
        C1C7U.LIZ("StickerGuide@28fc.showGuideInEditLayout$1");
        try {
            aRunnableS6S1300000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerGuide@28fc.showGuideInEditLayout$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS6S1300000_5(Object obj, C0EPT c0ept, List<? extends NLETrackSlot> list, EffectModel effectModel, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = c0ept;
        this.l3 = list;
        this.s0 = effectModel;
    }
}
