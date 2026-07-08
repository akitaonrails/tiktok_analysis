package Y;

import X.C013C;
import X.C1C7U;
import X.C375140EnI;
import X.C375170EnL;
import X.C375260EnU;
import X.C381300ExE;
import X.C389830FQf;
import X.C786410Ut5;
import X.EnumC375190EnN;
import android.graphics.RectF;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class ARunnableS4S0500000_5 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
        Float f;
        if (((C389830FQf) this.l0).getParent() == null || ((C389830FQf) this.l0).getVisibility() == 0) {
            return;
        }
        ((C375140EnI) this.l1).LLJIJIL = new Pair<>(Integer.valueOf(((C389830FQf) this.l0).getWidth()), Integer.valueOf(((C389830FQf) this.l0).getHeight()));
        C375170EnL c375170EnL = (C375170EnL) this.l2;
        Pair pairLIZ = C375260EnU.LIZ(c375170EnL.LIZ / c375170EnL.LIZIZ, ((C389830FQf) this.l0).getWidth(), ((C389830FQf) this.l0).getHeight());
        C389830FQf c389830FQf = (C389830FQf) this.l0;
        int iFloatValue = (int) ((Number) pairLIZ.getFirst()).floatValue();
        int iFloatValue2 = (int) ((Number) pairLIZ.getSecond()).floatValue();
        c389830FQf.LLILZ.left = (c389830FQf.getWidth() - iFloatValue) / 2.0f;
        RectF rectF = c389830FQf.LLILZ;
        rectF.right = rectF.left + iFloatValue;
        rectF.top = (c389830FQf.getHeight() - iFloatValue2) / 2.0f;
        RectF rectF2 = c389830FQf.LLILZ;
        rectF2.bottom = rectF2.top + iFloatValue2;
        c389830FQf.LJIIIIZZ();
        ((C389830FQf) this.l0).setCropMode((EnumC375190EnN) this.l3);
        if (((C389830FQf) this.l0).getCropMode() == EnumC375190EnN.FREE && (f = (Float) this.l4) != null) {
            ((C389830FQf) this.l0).setFreeModeCropRect(f.floatValue());
        }
        C375140EnI c375140EnI = (C375140EnI) this.l1;
        NLETrackSlot nLETrackSlot = c375140EnI.LLJI;
        if (nLETrackSlot != null && nLETrackSlot.hasExtra("crop_matrix")) {
            if (!c375140EnI.LJIIL()) {
                c375140EnI.LJJI();
            }
            NLEEditor nLEEditor = c375140EnI.LLIZ;
            if (nLEEditor != null) {
                nLEEditor.commit();
            }
            c375140EnI.LLJILLL = nLETrackSlot.getTransformX();
            c375140EnI.LLJJ = nLETrackSlot.getTransformY();
            c375140EnI.LLJILJILJ = nLETrackSlot.getScale();
        }
        C786410Ut5.LJLLLLLL(0, (C389830FQf) this.l0);
    }

    public final void LIZ$1() {
        if (((C381300ExE) this.l0).LJJIIJZLJL() || ((C013C) this.l1).element) {
            return;
        }
        if (((INLEPlayer) this.l2).getCurrentPosition() < ((NLETrackSlot) this.l3).getStartTime() && ((INLEPlayer) this.l2).getCurrentPosition() > ((NLETrackSlot) this.l3).getEndTime()) {
            C786410Ut5.LJLIIL(50L, ((C381300ExE) this.l0).LJIIJJI, this);
        } else {
            ((Function0) this.l4).invoke();
            ((C013C) this.l1).element = true;
        }
    }

    public static final void run$0(ARunnableS4S0500000_5 aRunnableS4S0500000_5) {
        boolean zLIZ;
        C1C7U.LIZ("CropMaterialEditor@a52b.onSlotSelected$2");
        try {
            aRunnableS4S0500000_5.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CropMaterialEditor@a52b.onSlotSelected$2");
    }

    public static final void run$1(ARunnableS4S0500000_5 aRunnableS4S0500000_5) {
        boolean zLIZ;
        C1C7U.LIZ("TemplateCombineEffectTaskV0@393c.seekToSlot$1");
        try {
            aRunnableS4S0500000_5.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TemplateCombineEffectTaskV0@393c.seekToSlot$1");
    }

    public ARunnableS4S0500000_5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
