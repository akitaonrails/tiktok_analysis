package Y;

import X.C0E48;
import X.C0E55;
import X.C0EDA;
import X.C0EDQ;
import X.C0F61;
import X.C0F63;
import X.C0F6N;
import X.C0FDZ;
import X.C1295960jpS;
import X.C1402610mbT;
import X.C201955140j;
import X.C2188811AlT;
import X.C354270Duj;
import X.C361100EDs;
import X.C384570F5z;
import X.C384590F6b;
import X.C386640FDy;
import X.C786410Ut5;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ACListenerS40S0201000_5 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        int offsetForPosition;
        C384570F5z c384570F5z = (C384570F5z) aCListenerS40S0201000_5.l0;
        if (c384570F5z.LLJIJIL == aCListenerS40S0201000_5.i2) {
            offsetForPosition = ((C0F61) aCListenerS40S0201000_5.l1).LLILZLL.getOffsetForPosition(c384570F5z.LLJ, c384570F5z.LLJI);
        } else {
            offsetForPosition = -1;
        }
        C0F63 c0f63 = ((C384570F5z) aCListenerS40S0201000_5.l0).LLIZLLLIL;
        if (c0f63 != null) {
            c0f63.LIZIZ(aCListenerS40S0201000_5.i2, offsetForPosition, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[PHI: r9 r10
      0x0054: PHI (r9v1 boolean) = (r9v2 boolean), (r9v4 boolean) binds: [B:19:0x0052, B:39:0x0080] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r10v1 boolean) = (r10v2 boolean), (r10v3 boolean) binds: [B:19:0x0052, B:39:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$1(Y.ACListenerS40S0201000_5 r11, android.view.View r12) {
        /*
            java.lang.Object r0 = r11.l0
            X.0EvJ r0 = (X.C380110EvJ) r0
            X.0EvK r1 = r0.LLILLJJLI
            int r0 = r11.i2
            X.07YH r4 = r1.LIZLLL(r0)
            java.lang.Object r0 = r11.l0
            X.0EvJ r0 = (X.C380110EvJ) r0
            X.0EvK r2 = r0.LLILLJJLI
            java.lang.Object r0 = r11.l1
            X.0EvL r0 = (X.C380130EvL) r0
            android.view.View r1 = r0.itemView
            android.view.ViewParent r5 = r2.getParent()
        L1c:
            if (r5 == 0) goto L8f
            boolean r0 = r5 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L8a
            if (r5 == r2) goto L8a
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L26:
            r6 = 1
            if (r5 == 0) goto L4f
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r1.getDrawingRect(r3)
            r5.offsetDescendantRectToMyCoords(r1, r3)
            int r2 = r5.getPaddingTop()
            int r1 = r5.getHeight()
            int r0 = r5.getPaddingBottom()
            int r1 = r1 - r0
            int r8 = r3.top
            if (r8 >= r2) goto L82
            int r8 = r8 - r2
        L46:
            if (r8 >= 0) goto L5f
            r0 = -1
            boolean r0 = r5.canScrollVertically(r0)
            if (r0 != 0) goto L6b
        L4f:
            r8 = 0
        L50:
            r9 = 0
        L51:
            r10 = 0
            if (r9 == 0) goto L55
        L54:
            r8 = 0
        L55:
            java.lang.Object r5 = r11.l0
            X.0EvJ r5 = (X.C380110EvJ) r5
            int r7 = r11.i2
            r5.LLLIIIIL(r6, r7, r8, r9, r10)
            return
        L5f:
            if (r8 <= 0) goto L68
            boolean r0 = r5.canScrollVertically(r6)
            if (r0 != 0) goto L6b
            goto L4f
        L68:
            if (r8 != 0) goto L6b
            goto L50
        L6b:
            int r0 = r4.LIZ
            if (r0 <= r6) goto L77
            boolean r0 = r4.LIZIZ
            if (r0 != 0) goto L77
            boolean r0 = r4.LIZJ
            if (r0 == 0) goto L50
        L77:
            r9 = 1
            boolean r0 = r4.LIZJ
            if (r0 == 0) goto L51
            int r0 = r4.LIZ
            if (r0 <= r6) goto L51
            r10 = 1
            goto L54
        L82:
            int r8 = r3.bottom
            if (r8 <= r1) goto L88
            int r8 = r8 - r1
            goto L46
        L88:
            r8 = 0
            goto L50
        L8a:
            android.view.ViewParent r5 = r5.getParent()
            goto L1c
        L8f:
            r5 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS40S0201000_5.onClick$1(Y.ACListenerS40S0201000_5, android.view.View):void");
    }

    public static final void onClick$2(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        ((C386640FDy) aCListenerS40S0201000_5.l0).LLILLJJLI.invoke(Integer.valueOf(aCListenerS40S0201000_5.i2), (C0FDZ) aCListenerS40S0201000_5.l1);
    }

    public static final void onClick$3(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        ((C386640FDy) aCListenerS40S0201000_5.l0).LLILLL.invoke(Integer.valueOf(aCListenerS40S0201000_5.i2), (C0FDZ) aCListenerS40S0201000_5.l1);
    }

    public static final void onClick$4(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        ((C386640FDy) aCListenerS40S0201000_5.l0).LLILLJJLI.invoke(Integer.valueOf(aCListenerS40S0201000_5.i2), (C0FDZ) aCListenerS40S0201000_5.l1);
    }

    public static final void onClick$5(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        C0E55 player;
        ((C0F6N) aCListenerS40S0201000_5.l0).LLJILJIL = aCListenerS40S0201000_5.i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InlineCaptionTextFragment -> CaptionEditAdapter -> click play, startTime = ");
        long startTime = ((TextStickerData) ListProtector.get(((C0F6N) aCListenerS40S0201000_5.l0).LLIZ, aCListenerS40S0201000_5.i2)).getStartTime();
        long j = LSPassThroughRecordSizeConfig.DEFAULT;
        sbLIZ.append(startTime * j);
        sbLIZ.append(", endTime = ");
        sbLIZ.append(((long) ((TextStickerData) ListProtector.get(((C0F6N) aCListenerS40S0201000_5.l0).LLIZ, aCListenerS40S0201000_5.i2)).getEndTime()) * j);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        C0E48 c0e48 = ((C0F6N) aCListenerS40S0201000_5.l0).LLILLJJLI;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LJJIIZI(((long) ((TextStickerData) ListProtector.get(((C0F6N) aCListenerS40S0201000_5.l0).LLIZ, aCListenerS40S0201000_5.i2)).getStartTime()) * j, ((long) ((TextStickerData) ListProtector.get(((C0F6N) aCListenerS40S0201000_5.l0).LLIZ, aCListenerS40S0201000_5.i2)).getEndTime()) * j, false, true);
        }
        C1295960jpS c1295960jpS = ((C384590F6b) aCListenerS40S0201000_5.l1).LLILLL;
        C786410Ut5.LLD(0, c1295960jpS);
        c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.playAnimation();
        C786410Ut5.LJZI(8, ((C384590F6b) aCListenerS40S0201000_5.l1).LLILLJJLI);
        C0F6N c0f6n = (C0F6N) aCListenerS40S0201000_5.l0;
        C1402610mbT.LJJJI(1, c0f6n.LL, c0f6n.LLILLL, c0f6n.LLILZ);
    }

    public static final void onClick$6(ACListenerS40S0201000_5 aCListenerS40S0201000_5, View view) {
        C361100EDs c361100EDs = (C361100EDs) aCListenerS40S0201000_5.l0;
        if (!c361100EDs.LLILLL) {
            return;
        }
        c361100EDs.LLILLL = false;
        C354270Duj.LIZ(600L, new AwS549S0100000_5(c361100EDs, 1259));
        C0EDA c0eda = ((C361100EDs) aCListenerS40S0201000_5.l0).LLILZ;
        if (c0eda != null) {
            c0eda.LIZ((C0EDQ) aCListenerS40S0201000_5.l1, aCListenerS40S0201000_5.i2);
        }
    }

    public ACListenerS40S0201000_5(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.l0 = obj2;
        this.i2 = i;
        this.l1 = obj;
    }
}
