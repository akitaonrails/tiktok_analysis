package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS428S0200000_27;

/* JADX INFO: renamed from: X.0ybR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1863870ybR extends AbstractC1863890ybT<TakoActiveBotItem> {
    public C20232214Em LLIZ;

    @Override // X.AbstractC1863890ybT
    public final Long LIZ() {
        TakoBotInfo takoBotInfo;
        C20232214Em c20232214Em = this.LLIZ;
        if (c20232214Em == null || (takoBotInfo = c20232214Em.LIZ) == null) {
            return null;
        }
        return Long.valueOf(takoBotInfo.botId);
    }

    public final C20232214Em getRenderData() {
        return this.LLIZ;
    }

    @Override // X.AbstractC1863890ybT
    public final void LIZIZ(InterfaceC21657319pL interfaceC21657319pL) {
        Long lValueOf;
        boolean z;
        TakoActiveBotItem takoActiveBotItem = (TakoActiveBotItem) interfaceC21657319pL;
        if (takoActiveBotItem != null) {
            lValueOf = Long.valueOf(takoActiveBotItem.bot.botId);
        } else {
            lValueOf = null;
        }
        long jLIZIZ = C0R2Q.LIZIZ(lValueOf);
        TuxTextView name = getName();
        int i = 0;
        if (name != null) {
            if (jLIZIZ <= 1) {
                z = true;
            } else {
                z = false;
            }
            name.setClickable(z);
        }
        TuxTextView exit = getExit();
        if (exit != null) {
            Long lLIZ = LIZ();
            if (lLIZ == null || jLIZIZ != lLIZ.longValue()) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(exit, i);
        }
        View shadow = getShadow();
        if (shadow != null) {
            Long lLIZ2 = LIZ();
            if (lLIZ2 == null || jLIZIZ != lLIZ2.longValue()) {
                shadow.setBackground(C14MI.LIZ(shadow.getContext(), R.drawable.ddn));
            }
        }
    }

    @Override // X.AbstractC1863890ybT
    public final void LIZJ(boolean z) {
        C20232214Em c20232214Em;
        this.LLILZLL = z;
        if (z && (c20232214Em = this.LLIZ) != null) {
            C13MK.LIZLLL(new AwS428S0200000_27(this, c20232214Em, 79));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setRenderData(X.C20232214Em r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L50
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBotInfo r3 = r11.LIZ
            if (r3 == 0) goto L50
            java.lang.String r2 = r3.botAvatar
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L53
            if (r2 == 0) goto L53
            com.bytedance.tux.input.TuxTextView r1 = r10.getName()
            if (r1 == 0) goto L1d
            java.lang.String r0 = r3.botName
            r1.setText(r0)
        L1d:
            com.bytedance.tux.input.TuxTextView r4 = r10.getName()
            if (r4 == 0) goto L3c
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6 = 0
            r9 = 30
            r7 = r6
            r8 = r6
            X.C426750GoL.LJIIL(r4, r5, r6, r7, r8, r9)
        L3c:
            X.0Gq9 r1 = r10.getAvatar()
            if (r1 == 0) goto L53
            r0 = 0
            X.C786410Ut5.LLLLJI(r1, r0)
            X.0kl3 r0 = X.C1331660kl2.LJIIIZ(r2)
            r0.LJJ(r1)
            r0.LJIIJJI()
        L50:
            r10.LLIZ = r11
            return
        L53:
            com.bytedance.tux.input.TuxTextView r2 = r10.getName()
            if (r2 == 0) goto L50
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r3.botEmoji
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            java.lang.String r0 = r3.botName
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.setText(r0)
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1863870ybR.setRenderData(X.14Em):void");
    }

    public AbstractC1863870ybR(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
