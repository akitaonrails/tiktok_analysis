package X;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import com.bytedance.android.live.slot.IFrameSlot;

/* JADX INFO: renamed from: X.0fOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125520fOY implements IFrameSlot {
    public String LL = "";
    public Bundle LLILLJJLI;

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final InterfaceC752610Tff LIZJ() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void LJIJJ(String str) {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final String getScheme() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final /* synthetic */ void onHide() {
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIIZILJ() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    @Override // com.bytedance.android.live.slot.IFrameSlot
    public final Animation LJIJ() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.0f, 1.0f, 0.0f, 1, 0.0f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.setDuration(300L);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(alphaAnimation);
        return animationSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // com.bytedance.android.live.slot.IFrameSlot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View LJIJI(android.content.Context r11) {
        /*
            r10 = this;
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r0 = 4643985272004935680(0x4072c00000000000, double:300.0)
            int r2 = X.C341940Daq.LIZ(r0)
            r0 = 4638144666238189568(0x405e000000000000, double:120.0)
            int r0 = X.C341940Daq.LIZ(r0)
            r3.<init>(r2, r0)
            r0 = 80
            r3.gravity = r0
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r0 = X.C341940Daq.LIZ(r0)
            r3.leftMargin = r0
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            int r0 = X.C341940Daq.LIZ(r0)
            r3.bottomMargin = r0
            X.0q7g r2 = X.C1541950qED.LIZJ
            com.ss.android.ugc.aweme.spark.IAdSparkUtils r4 = com.ss.android.ugc.aweme.spark.AdSparkUtils.LJFF()
            r5 = r11
            if (r4 == 0) goto L5c
            android.os.Bundle r1 = r10.LLILLJJLI
            if (r1 == 0) goto L3d
            java.lang.String r0 = r10.LL
            java.lang.String r6 = X.C08RU.LIZ(r1, r0)
            if (r6 != 0) goto L3f
        L3d:
            java.lang.String r6 = r10.LL
        L3f:
            r7 = 0
            r9 = 0
            r8 = r7
            com.ss.android.ugc.aweme.spark.AdSparkContext r0 = r4.LIZJ(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L5c
        L48:
            r2.getClass()
            X.0qED r1 = new X.0qED
            r1.<init>(r5, r0)
            r0 = 0
            X.0qEB r0 = r1.LIZ(r0)
            X.C786410Ut5.C6(r0, r3)
            r0.LJIIIIZZ()
            return r0
        L5c:
            com.bytedance.hybrid.spark.SparkContext r0 = new com.bytedance.hybrid.spark.SparkContext
            r0.<init>()
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125520fOY.LJIJI(android.content.Context):android.view.View");
    }
}
