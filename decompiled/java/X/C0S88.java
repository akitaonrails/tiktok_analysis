package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import com.ss.android.ugc.aweme.feed.model.SubOnlyVideo;
import com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger;
import com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S88, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S88 implements C0S8H {
    public final Function0<C0S8S> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function1<C0S8A<?>, Boolean> LIZJ;
    public final Function1<C0S8A<?>, Unit> LIZLLL;
    public final Function1<C0S8A<?>, Boolean> LJ;
    public final Function2<C0S8A<?>, Object, Unit> LJFF;

    public C0S88() {
        throw null;
    }

    @Override // X.C0S8H
    public final <T> void LIZ(C0S8A<T> c0s8a) {
        C0S8S c0s8sInvoke;
        if (this.LIZJ.invoke(c0s8a).booleanValue()) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            if (C716300S7w.LIZIZ(c0s8a.LIZ, c0s8a.LIZIZ) && (c0s8sInvoke = this.LIZ.invoke()) != null) {
                Aweme aweme = c0s8a.LIZ;
                AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 1158);
                FrameLayout frameLayout = c0s8sInvoke.LIZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                FrameLayout frameLayout2 = c0s8sInvoke.LIZIZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
                C0S87<Object> c0s87 = c0s8sInvoke.LJ;
                if (c0s87 != null) {
                    c0s87.LIZJ(new AwS253S0300000_9(c0s8sInvoke, aweme, awS555S0100000_11, 21));
                }
            }
        }
    }

    @Override // X.C0S8H
    public final <T> void LIZIZ(C0S8A<T> c0s8a) {
        C0S8S c0s8sInvoke;
        if (this.LIZJ.invoke(c0s8a).booleanValue()) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            if (C716300S7w.LIZIZ(c0s8a.LIZ, c0s8a.LIZIZ) && (c0s8sInvoke = this.LIZ.invoke()) != null) {
                FrameLayout frameLayout = c0s8sInvoke.LIZ;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                FrameLayout frameLayout2 = c0s8sInvoke.LIZIZ;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(0, frameLayout2);
                }
                C0S87<Object> c0s87 = c0s8sInvoke.LJ;
                if (c0s87 != null) {
                    c0s87.LJLJLJ();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0SC0] */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.0S87, X.0S87<java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0S87] */
    @Override // X.C0S8H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void LIZLLL(X.C0S8A<T> r10) {
        /*
            r9 = this;
            kotlin.jvm.functions.Function0<X.0S8S> r0 = r9.LIZ
            java.lang.Object r5 = r0.invoke()
            X.0S8S r5 = (X.C0S8S) r5
            kotlin.jvm.functions.Function1<X.0S8A<?>, java.lang.Boolean> r0 = r9.LIZJ
            java.lang.Object r0 = r0.invoke(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L81
            X.01GW<com.ss.android.ugc.aweme.videohotswap.service.IPaidContentVideoHotSwapService> r0 = com.ss.android.ugc.aweme.videohotswap.overlay.PaywallComponentTrigger.LLJLILLLLZIIL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r10.LIZ
            boolean r0 = r10.LIZIZ
            boolean r0 = X.C716300S7w.LIZIZ(r1, r0)
            if (r0 == 0) goto L81
            if (r5 == 0) goto L7c
            X.0S89<T> r7 = r10.LIZJ
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r10.LIZ
            r5.LIZLLL = r7
            X.0S87<java.lang.Object> r0 = r5.LJ
            r1 = 0
            if (r0 == 0) goto L33
            X.0SBg r1 = r0.getType()
        L33:
            X.0SBg r0 = r7.LIZLLL()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L75
            android.widget.FrameLayout r0 = r5.LIZIZ
            if (r0 == 0) goto L75
            android.content.Context r6 = r0.getContext()
            if (r6 == 0) goto L75
            X.0S89<java.lang.Object> r8 = r5.LIZLLL
            if (r8 == 0) goto L82
            android.widget.FrameLayout r2 = r5.LIZIZ
            X.0Syb r1 = new X.0Syb
            r0 = 3
            r1.<init>(r2, r0)
            java.util.Iterator r3 = r1.iterator()
        L57:
            r1 = r3
            X.0SyZ r1 = (X.C738850SyZ) r1
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            X.0S87 r2 = r8.LIZ(r0)
            if (r2 == 0) goto L57
        L6c:
            r5.LJ = r2
            boolean r0 = r5.LJI
            if (r0 == 0) goto L75
            r2.LJJLJLI()
        L75:
            X.0S87<java.lang.Object> r0 = r5.LJ
            if (r0 == 0) goto L7c
            r0.LIZLLL(r4)
        L7c:
            kotlin.jvm.functions.Function1<X.0S8A<?>, kotlin.Unit> r0 = r9.LIZLLL
            r0.invoke(r10)
        L81:
            return
        L82:
            android.widget.FrameLayout r0 = r5.LIZIZ
            if (r0 == 0) goto L89
            X.C786410Ut5.LJJJJIZL(r0)
        L89:
            X.0SBy r0 = r5.LIZJ
            X.0SC0 r2 = r7.LIZJ(r6, r0)
            androidx.compose.ui.platform.ComposeView r1 = r2.LJIIJ()
            android.widget.FrameLayout r0 = r5.LIZIZ
            if (r0 == 0) goto L6c
            r0.addView(r1)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0S88.LIZLLL(X.0S8A):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.09Gk] */
    @Override // X.C0S8H
    public final <T> void LIZJ(C0S8A<T> c0s8a, T t, String str) {
        C0S8S c0s8sInvoke;
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        long jLongValue;
        long jLongValue2;
        long jLongValue3;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long previewSettingsDuration;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewDuration;
        StandardBusinessModel standardBusinessModel3;
        CMPreviewInfo cmPreviewInfo3;
        Long previewSettingsStartTime;
        StandardBusinessModel standardBusinessModel4;
        CMPreviewInfo cmPreviewInfo4;
        Long generatedPreviewStartTime;
        StandardBusinessModel standardBusinessModel5;
        CMPreviewInfo cmPreviewInfo5;
        StandardBusinessModel standardBusinessModel6;
        SubOnlyVideo subOnlyVideo;
        C0S87<Object> c0s87;
        if (this.LIZJ.invoke(c0s8a).booleanValue()) {
            C01GW<IPaidContentVideoHotSwapService> c01gw = PaywallComponentTrigger.LLJLILLLLZIIL;
            if (C716300S7w.LIZIZ(c0s8a.LIZ, c0s8a.LIZIZ) && (c0s8sInvoke = this.LIZ.invoke()) != null) {
                Aweme aweme = c0s8a.LIZ;
                FrameLayout frameLayout3 = c0s8sInvoke.LIZ;
                if (frameLayout3 != null) {
                    C786410Ut5.LJZ(8, frameLayout3);
                }
                FrameLayout frameLayout4 = c0s8sInvoke.LIZIZ;
                ?? LJFF = 0;
                LJFF = 0;
                LJFF = 0;
                if (frameLayout4 != null) {
                    C786410Ut5.LJZ(0, frameLayout4);
                }
                Integer subsStatus = null;
                try {
                    c0s87 = c0s8sInvoke.LJ;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if ((c0s87 instanceof C0S87) && c0s87 != null) {
                    c0s87.LIZ(aweme, t);
                    Rect rect = new Rect();
                    FrameLayout frameLayout5 = c0s8sInvoke.LIZIZ;
                    if (frameLayout5 != null && frameLayout5.getGlobalVisibleRect(rect) && (frameLayout = c0s8sInvoke.LIZIZ) != null && rect.height() == frameLayout.getHeight() && (frameLayout2 = c0s8sInvoke.LIZIZ) != null && rect.width() == frameLayout2.getWidth()) {
                        ?? c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(1, "is_vhs");
                        c2344009Gk.LJIIIIZZ("show_entrance", str);
                        CMPreviewInfo.SubsStatus.Companion companion = CMPreviewInfo.SubsStatus.Companion;
                        ContentModel contentModel = aweme.getContentModel();
                        if (contentModel != null && (standardBusinessModel6 = contentModel.standardBusinessModel) != null && (subOnlyVideo = standardBusinessModel6.getSubOnlyVideo()) != null) {
                            subsStatus = subOnlyVideo.getSubsStatus();
                        }
                        c2344009Gk.LJIIIIZZ("subscribe_state", companion.fromInt(subsStatus).name().toLowerCase(Locale.ROOT));
                        ContentModel contentModel2 = aweme.getContentModel();
                        if (contentModel2 != null && (standardBusinessModel5 = contentModel2.standardBusinessModel) != null && (cmPreviewInfo5 = standardBusinessModel5.getCmPreviewInfo()) != null) {
                            LJFF = Intrinsics.LJFF(cmPreviewInfo5.getShouldShowPreview(), Boolean.TRUE);
                        }
                        c2344009Gk.LIZJ(LJFF, "should_show_preview");
                        ContentModel contentModel3 = aweme.getContentModel();
                        long jLongValue4 = 0;
                        if (contentModel3 != null && (standardBusinessModel4 = contentModel3.standardBusinessModel) != null && (cmPreviewInfo4 = standardBusinessModel4.getCmPreviewInfo()) != null && (generatedPreviewStartTime = cmPreviewInfo4.getGeneratedPreviewStartTime()) != null) {
                            jLongValue = generatedPreviewStartTime.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        c2344009Gk.LIZLLL(jLongValue, "generated_preview_start_time");
                        ContentModel contentModel4 = aweme.getContentModel();
                        if (contentModel4 != null && (standardBusinessModel3 = contentModel4.standardBusinessModel) != null && (cmPreviewInfo3 = standardBusinessModel3.getCmPreviewInfo()) != null && (previewSettingsStartTime = cmPreviewInfo3.getPreviewSettingsStartTime()) != null) {
                            jLongValue2 = previewSettingsStartTime.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        c2344009Gk.LIZLLL(jLongValue2, "preview_settings_start_time");
                        ContentModel contentModel5 = aweme.getContentModel();
                        if (contentModel5 != null && (standardBusinessModel2 = contentModel5.standardBusinessModel) != null && (cmPreviewInfo2 = standardBusinessModel2.getCmPreviewInfo()) != null && (generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration()) != null) {
                            jLongValue3 = generatedPreviewDuration.longValue();
                        } else {
                            jLongValue3 = 0;
                        }
                        c2344009Gk.LIZLLL(jLongValue3, "generated_preview_duration");
                        ContentModel contentModel6 = aweme.getContentModel();
                        if (contentModel6 != null && (standardBusinessModel = contentModel6.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (previewSettingsDuration = cmPreviewInfo.getPreviewSettingsDuration()) != null) {
                            jLongValue4 = previewSettingsDuration.longValue();
                        }
                        c2344009Gk.LIZLLL(jLongValue4, "preview_settings_duration");
                        c2344009Gk.LJIIIIZZ("group_id", aweme.getAid());
                        C20684815ws.LJIILLIIL("livesdk_subscribe_paywall_show", c2344009Gk.LIZ);
                    }
                } else {
                    throw new IllegalArgumentException("PaywallOverlayView binding failed: Type mismatch or view not initialized");
                }
            }
            if (this.LJ.invoke(c0s8a).booleanValue()) {
                this.LJFF.invoke(c0s8a, t);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0S88(Function0<C0S8S> function0, Function0<Unit> function02, Function1<? super C0S8A<?>, Boolean> function1, Function1<? super C0S8A<?>, Unit> function12, Function1<? super C0S8A<?>, Boolean> function13, Function2<? super C0S8A<?>, Object, Unit> function2) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function1;
        this.LIZLLL = function12;
        this.LJ = function13;
        this.LJFF = function2;
    }
}
