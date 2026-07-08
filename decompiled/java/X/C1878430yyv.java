package X;

import com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878430yyv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ GamePartnershipGamePinCardWidget LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1870150ylZ LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1878430yyv(GamePartnershipGamePinCardWidget gamePartnershipGamePinCardWidget, C1870150ylZ c1870150ylZ, String str, boolean z) {
        super(0);
        this.LL = gamePartnershipGamePinCardWidget;
        this.LLILLJJLI = z;
        this.LLILLL = c1870150ylZ;
        this.LLILZ = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
        /*
            r15 = this;
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r1 = r15.LL
            boolean r0 = r1.LLJJ
            if (r0 != 0) goto Laf
            android.widget.FrameLayout r0 = r1.LL
            if (r0 == 0) goto Laf
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "post running, isFromShowCard "
            r1.append(r0)
            boolean r0 = r15.LLILLJJLI
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r4 = "PartnershipAudience"
            X.C20441214yg.LIZIZ(r4, r0)
            boolean r0 = r15.LLILLJJLI
            r12 = 0
            if (r0 == 0) goto L42
            X.0ylZ r0 = r15.LLILLL
            if (r0 == 0) goto Laf
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r0 = r15.LL
            android.widget.FrameLayout r0 = r0.LL
            if (r0 == 0) goto L33
            X.C786410Ut5.U4(r0, r12)
        L33:
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r0 = r15.LL
            android.widget.FrameLayout r1 = r0.LL
            if (r1 == 0) goto L3d
            r0 = 0
            X.C786410Ut5.LJZ(r0, r1)
        L3d:
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r0 = r15.LL
            r0.show()
        L42:
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r1 = r15.LL
            X.0ylZ r0 = r15.LLILLL
            r1.I1(r0)
            X.0yla r5 = new X.0yla
            boolean r3 = r15.LLILLJJLI
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r2 = r15.LL
            java.lang.String r1 = r15.LLILZ
            X.0ylZ r0 = r15.LLILLL
            r5.<init>()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "startAnimation visibility "
            r1.append(r0)
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r0 = r15.LL
            android.widget.FrameLayout r0 = r0.LL
            if (r0 == 0) goto Lbc
            boolean r0 = X.C500260Jjc.LJJJJIZL(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L6d:
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r4, r0)
            com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget r1 = r15.LL
            android.widget.FrameLayout r4 = r1.LL
            if (r4 == 0) goto Laf
            boolean r0 = r15.LLILLJJLI
            r1.getClass()
            android.view.animation.ScaleAnimation r6 = new android.view.animation.ScaleAnimation
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto Lb8
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
        L8b:
            r11 = 1
            r9 = r7
            r10 = r8
            r13 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            if (r0 == 0) goto Lb2
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r12, r14)
        L99:
            android.view.animation.AnimationSet r2 = new android.view.animation.AnimationSet
            r2.<init>(r11)
            r0 = 300(0x12c, double:1.48E-321)
            r2.setDuration(r0)
            r2.addAnimation(r6)
            r2.addAnimation(r3)
            r2.setAnimationListener(r5)
            r4.startAnimation(r2)
        Laf:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb2:
            android.view.animation.AlphaAnimation r3 = new android.view.animation.AlphaAnimation
            r3.<init>(r14, r12)
            goto L99
        Lb8:
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            goto L8b
        Lbc:
            r0 = 0
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1878430yyv.invoke():java.lang.Object");
    }
}
