package X;

import com.bytedance.ies.xelement.input.AutoHeightInputShadowNode;
import com.bytedance.ies.xelement.input.LynxTextAreaView;
import com.bytedance.ies.xelement.text.text.LynxTextShadowNode;
import com.bytedance.ies.xelement.text.text.LynxTextUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.ui.LynxUI;
import com.ss.android.ugc.aweme.pgc.hybrid.ui.LynxCreatorTextAreaView;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextArea;
import com.ss.android.ugc.aweme.poi.textarea.LocalServiceTextAreaNew;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import j27.s;
import kotlin.jvm.internal.AwS599S0100000_20;

/* JADX INFO: renamed from: X.0kxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339190kxB extends C1311670kEn {
    public final int $t;
    public Object l0;

    @Override // X.C1311670kEn
    public final ShadowNode LJ() {
        switch (this.$t) {
            case 0:
                return LJ$0(this);
            case 1:
                return LJ$1(this);
            case 2:
                return LJ$2(this);
            case 3:
                return LJ$3(this);
            case 4:
                return LJ$4(this);
            case 5:
                return LJ$5(this);
            case 6:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            default:
                return super.LJ();
            case 7:
                return LJ$6(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LJ$7(this);
        }
    }

    @Override // X.C1311670kEn
    public final LynxUI<?> LJFF(s sVar) {
        switch (this.$t) {
            case 0:
                return LJFF$0(this, sVar);
            case 1:
                return LJFF$1(this, sVar);
            case 2:
                return LJFF$2(this, sVar);
            case 3:
                return LJFF$3(this, sVar);
            case 4:
                return LJFF$4(this, sVar);
            case 5:
                return LJFF$5(this, sVar);
            case 6:
                return LJFF$6(this, sVar);
            case 7:
                return LJFF$7(this, sVar);
            case 8:
                return LJFF$8(this, sVar);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LJFF$9(this, sVar);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return LJFF$10(this, sVar);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return LJFF$11(this, sVar);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return LJFF$12(this, sVar);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return LJFF$13(this, sVar);
            default:
                return super.LJFF(sVar);
        }
    }

    public static final ShadowNode LJ$0(C1339190kxB c1339190kxB) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$1(C1339190kxB c1339190kxB) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$2(C1339190kxB c1339190kxB) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$3(C1339190kxB c1339190kxB) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$4(C1339190kxB c1339190kxB) {
        return new AutoHeightInputShadowNode();
    }

    public static final ShadowNode LJ$5(C1339190kxB c1339190kxB) {
        return ((ISparkHostApi) c1339190kxB.l0).LJIIL();
    }

    public static final ShadowNode LJ$6(C1339190kxB c1339190kxB) {
        return ((ISparkHostApi) c1339190kxB.l0).LJIILJJIL();
    }

    public static final ShadowNode LJ$7(C1339190kxB c1339190kxB) {
        LynxTextShadowNode lynxTextShadowNode = new LynxTextShadowNode();
        lynxTextShadowNode.LJJJZ = new AwS599S0100000_20((ISparkHostApi) c1339190kxB.l0, 43);
        return lynxTextShadowNode;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1339190kxB(com.ss.android.ugc.aweme.spark.ISparkHostApi r6, int r7) {
        /*
            r5 = this;
            r5.$t = r7
            switch(r7) {
                case 0: goto L11;
                case 1: goto L1a;
                case 2: goto L23;
                case 3: goto L2c;
                case 4: goto L35;
                case 5: goto L5;
                case 6: goto L3e;
                case 7: goto L5;
                case 8: goto L47;
                case 9: goto L50;
                case 10: goto L59;
                case 11: goto L62;
                case 12: goto L6b;
                default: goto L5;
            }
        L5:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "x-ttk-map-view"
            r0 = r3
            r1 = r3
        Ld:
            r4.<init>(r2, r3, r0, r1)
            return
        L11:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "x-textarea"
            r0 = r3
            r1 = r3
            goto Ld
        L1a:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "ls-textarea"
            r0 = r3
            r1 = r3
            goto Ld
        L23:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "textarea"
            r0 = r3
            r1 = r3
            goto Ld
        L2c:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "creator-textarea"
            r0 = r3
            r1 = r3
            goto Ld
        L35:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "ls-textarea-new"
            r0 = r3
            r1 = r3
            goto Ld
        L3e:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "x-audio-livecore"
            r0 = r3
            r1 = r3
            goto Ld
        L47:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "ecom-search-video"
            r0 = r3
            r1 = r3
            goto Ld
        L50:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "ecom-search-live"
            r0 = r3
            r1 = r3
            goto Ld
        L59:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "shop-search-video"
            r0 = r3
            r1 = r3
            goto Ld
        L62:
            r4 = r5
            r4.l0 = r6
            r3 = 0
            java.lang.String r2 = "shop-search-live"
            r0 = r3
            r1 = r3
            goto Ld
        L6b:
            r4 = r5
            r4.l0 = r6
            java.lang.String r2 = "x-text"
            r3 = 0
            r0 = 1
            r1 = r3
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1339190kxB.<init>(com.ss.android.ugc.aweme.spark.ISparkHostApi, int):void");
    }

    public static final LynxUI LJFF$0(C1339190kxB c1339190kxB, s sVar) {
        LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(sVar, null);
        lynxTextAreaView.LLLILZJ = new AwS599S0100000_20((ISparkHostApi) c1339190kxB.l0, 41);
        return lynxTextAreaView;
    }

    public static final LynxUI LJFF$1(C1339190kxB c1339190kxB, s sVar) {
        LocalServiceTextArea localServiceTextAreaLJJJJL;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null && (localServiceTextAreaLJJJJL = iSparkHostApi.LJJJJL(sVar)) != null) {
            return localServiceTextAreaLJJJJL;
        }
        throw new IllegalStateException("Failed to create emoji adapter");
    }

    public static final LynxUI LJFF$10(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJJIII(sVar);
        }
        return null;
    }

    public static final LynxUI LJFF$11(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJIJI(sVar);
        }
        return null;
    }

    public static final LynxUI LJFF$12(C1339190kxB c1339190kxB, s sVar) {
        return new LynxTextUI(sVar);
    }

    public static final LynxUI LJFF$13(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJ(sVar);
        }
        return null;
    }

    public static final LynxUI LJFF$2(C1339190kxB c1339190kxB, s sVar) {
        LynxTextAreaView lynxTextAreaView = new LynxTextAreaView(sVar, null);
        lynxTextAreaView.LLLILZJ = new AwS599S0100000_20((ISparkHostApi) c1339190kxB.l0, 42);
        return lynxTextAreaView;
    }

    public static final LynxUI LJFF$3(C1339190kxB c1339190kxB, s sVar) {
        LynxCreatorTextAreaView lynxCreatorTextAreaViewLJJLIIIJILLIZJL;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null && (lynxCreatorTextAreaViewLJJLIIIJILLIZJL = iSparkHostApi.LJJLIIIJILLIZJL(sVar)) != null) {
            return lynxCreatorTextAreaViewLJJLIIIJILLIZJL;
        }
        throw new IllegalStateException("Failed to create emoji adapter");
    }

    public static final LynxUI LJFF$4(C1339190kxB c1339190kxB, s sVar) {
        LocalServiceTextAreaNew localServiceTextAreaNewLLJJIJI;
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null && (localServiceTextAreaNewLLJJIJI = iSparkHostApi.LLJJIJI(sVar)) != null) {
            return localServiceTextAreaNewLLJJIJI;
        }
        throw new IllegalStateException("Failed to create emoji adapter");
    }

    public static final LynxUI LJFF$5(C1339190kxB c1339190kxB, s sVar) {
        return ((ISparkHostApi) c1339190kxB.l0).LIZLLL(sVar);
    }

    public static final LynxUI LJFF$6(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.getLynxAudioLiveView(sVar);
        }
        return null;
    }

    public static final LynxUI LJFF$7(C1339190kxB c1339190kxB, s sVar) {
        return ((ISparkHostApi) c1339190kxB.l0).LJIILL(sVar);
    }

    public static final LynxUI LJFF$8(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJFF(sVar);
        }
        return null;
    }

    public static final LynxUI LJFF$9(C1339190kxB c1339190kxB, s sVar) {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) c1339190kxB.l0;
        if (iSparkHostApi != null) {
            return iSparkHostApi.LJIJ(sVar);
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339190kxB(ISparkHostApi iSparkHostApi, String str, int i) {
        super(str, false, false, false);
        this.$t = i;
        this.l0 = iSparkHostApi;
    }
}
