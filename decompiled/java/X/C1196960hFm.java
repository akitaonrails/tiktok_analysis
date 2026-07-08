package X;

import Y.ALAdapterS14S0100000_18;
import Y.AUListenerS267S0100000_18;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196960hFm extends AbstractC707180Roa implements InterfaceC1197120hG2, C0O2O {
    public static final int LLLFFI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public static final int LLLFZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
    public final /* synthetic */ PoiAnchorMakerDelegate LLILZ;
    public final C054G LLILZIL;
    public InterfaceC1392640mLO LLILZLL;
    public final long LLIZ;
    public final double LLIZLLLIL;
    public PoiDataStruct LLJ;
    public int LLJI;
    public ViewGroup LLJIJIL;
    public SmartImageView LLJILJIL;
    public SmartImageView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxIconView LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public ViewGroup LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxIconView LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public C1197030hFt LLJJJJLIIL;
    public C1197020hFs LLJJL;
    public C1197040hFu LLJJLIIIJLLLLLLLZ;
    public final C1400390mXt LLJL;
    public final C1195400hDG LLJLIL;
    public final List<PoiSubTag> LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C1188820h2e LLJLLIL;
    public final ViewOnTouchListenerC1196980hFo LLJLLL;
    public AnonymousClass0956 LLJZ;
    public AnimatorSet LLJZIJLIL;
    public String LLL;
    public long LLLF;
    public long LLLFF;

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
    }

    @Override // X.InterfaceC1197120hG2
    public final String LIZLLL() {
        return this.LLILZ.LIZLLL();
    }

    @Override // X.InterfaceC1197120hG2
    public final String LJJIZ() {
        return this.LLILZ.LJJIZ();
    }

    @Override // X.InterfaceC1197120hG2
    public final void LJJLL(Aweme aweme, String str, String str2, boolean z, String str3, C2344009Gk c2344009Gk, PageFinder pageFinder, Function1<? super C2344009Gk, Unit> function1) {
        this.LLILZ.LJJLL(aweme, str, str2, z, str3, c2344009Gk, pageFinder, function1);
    }

    @Override // X.InterfaceC1197120hG2
    public final String LLIL(int i) {
        return this.LLILZ.LLIL(i);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJIJI(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        this.LLILZ.LLJJIJI(interfaceC665370Q7z, fcpStandardPreloadProtocol);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLJJJJ(Aweme aweme, String str, String str2, String str3, boolean z, boolean z2, String str4, C2344009Gk c2344009Gk, Function1<? super C2344009Gk, Unit> function1) {
        this.LLILZ.LLJJJJ(aweme, str, str2, str3, z, z2, str4, c2344009Gk, function1);
    }

    @Override // X.InterfaceC1197120hG2
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LLJJJJLIIL(Aweme aweme, String str) {
        return this.LLILZ.LLJJJJLIIL(aweme, str);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLFFI(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LLILZ.LLLFFI(i, i2, i3, i4, i5, i6);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIL(InterfaceC665370Q7z interfaceC665370Q7z, FcpStandardPreloadProtocol fcpStandardPreloadProtocol) {
        this.LLILZ.LLLIL(interfaceC665370Q7z, fcpStandardPreloadProtocol);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLILZLLLI(Aweme aweme, String str, String str2, boolean z) {
        this.LLILZ.LLLILZLLLI(aweme, str, str2, z);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLIZZ(Aweme aweme) {
        this.LLILZ.LLLIZZ(aweme);
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLLLIIL(Context context, View view, Aweme aweme, String str, String str2, C2344009Gk c2344009Gk, boolean z, String str3, String str4, String str5, boolean z2, EnumC1188920h2o enumC1188920h2o, String str6, Function1<? super C2344009Gk, Unit> function1) {
        this.LLILZ.LLLLIIL(context, view, aweme, str, str2, c2344009Gk, z, str3, str4, str5, z2, enumC1188920h2o, str6, function1);
    }

    private final String getSuffix() {
        PoiAnchorInfo poiAnchorInfo;
        String str;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo2;
        String str2;
        PoiAnchorInfo poiAnchorInfo3;
        PoiAnchorButtonInfo poiAnchorButtonInfo;
        String str3;
        PoiAnchorInfo poiAnchorInfo4;
        PoiDataStruct poiDataStruct2 = this.LLJ;
        String str4 = null;
        if (poiDataStruct2 != null && (poiAnchorInfo4 = poiDataStruct2.videoAnchor) != null) {
            str4 = poiAnchorInfo4.transactionSuffix;
        }
        if ((str4 == null || str4.length() == 0) && ((poiDataStruct = this.LLJ) == null || (poiAnchorInfo3 = poiDataStruct.videoAnchor) == null || (poiAnchorButtonInfo = poiAnchorInfo3.poiAnchorButton) == null || (str3 = poiAnchorButtonInfo.title) == null || str3.length() == 0)) {
            PoiDataStruct poiDataStruct3 = this.LLJ;
            return (poiDataStruct3 == null || (poiAnchorInfo2 = poiDataStruct3.videoAnchor) == null || (str2 = poiAnchorInfo2.suffix) == null) ? "" : str2;
        }
        PoiDataStruct poiDataStruct4 = this.LLJ;
        return (poiDataStruct4 == null || (poiAnchorInfo = poiDataStruct4.videoAnchor) == null || (str = poiAnchorInfo.transactionSuffix) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0034 A[PHI: r2
      0x0034: PHI (r2v1 boolean) = (r2v0 boolean), (r2v3 boolean), (r2v3 boolean), (r2v3 boolean) binds: [B:23:0x0031, B:13:0x001d, B:15:0x0021, B:17:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL() {
        /*
            r5 = this;
            X.0mLO r0 = r5.LLILZLL
            if (r0 == 0) goto L36
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LJJLIIIJJIZ()
        L8:
            r4 = 1
            r3 = 0
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.getPoiDataStruct()
            if (r0 == 0) goto L30
            boolean r0 = r0.isProductAnchor()
            if (r4 != r0) goto L30
            r2 = 1
        L19:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.getPoiDataStruct()
            if (r0 == 0) goto L34
            java.util.List<java.lang.String> r0 = r0.productIds
            if (r0 == 0) goto L34
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L34
            r0 = 1
        L2b:
            if (r2 == 0) goto L38
            if (r0 == 0) goto L38
            return r3
        L30:
            r2 = 0
            if (r1 == 0) goto L34
            goto L19
        L34:
            r0 = 0
            goto L2b
        L36:
            r1 = 0
            goto L8
        L38:
            android.view.ViewGroup r0 = r5.LLJJJ
            if (r0 == 0) goto L43
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L43
        L42:
            return r3
        L43:
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJJJIL
            if (r0 == 0) goto L42
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L42
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196960hFm.LJIILIIL():boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILJJIL() {
        /*
            r14 = this;
            java.lang.String r4 = "poi_info"
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r14.LLJ
            r2 = 0
            if (r0 == 0) goto L20
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L20
            java.lang.String r3 = r0.trackInfo
        Ld:
            com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig$Config r1 = com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig.LIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.poiAnchorSubTagFrequencyMap
            r10 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1e
            r0 = 0
        L1b:
            if (r0 == 0) goto L22
            return r3
        L1e:
            r0 = 1
            goto L1b
        L20:
            r3 = r2
            goto Ld
        L22:
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.poiAnchorTrackMap
            if (r5 != 0) goto L27
            return r3
        L27:
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r1 = r14.LLJLILLLLZIIL
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r14.LLJ
            if (r0 == 0) goto L3a
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L3a
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r0 = r0.subTags
        L33:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L3c
            return r3
        L3a:
            r0 = r2
            goto L33
        L3c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r0 = r14.LLJLILLLLZIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L49:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.poi.PoiSubTag r0 = (com.ss.android.ugc.aweme.poi.PoiSubTag) r0
            java.lang.Integer r0 = r0.type
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r5.get(r0)
            if (r0 == 0) goto L49
            r6.add(r0)
            goto L49
        L65:
            java.lang.String r7 = ","
            r8 = 0
            r13 = 62
            r9 = r8
            r11 = r8
            r12 = r8
            java.lang.String r1 = X.C13LP.LJJLIIIJ(r6, r7, r8, r9, r10, r11, r12, r13)
            if (r3 == 0) goto L79
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L96
            if (r0 != 0) goto L7a
        L79:
            r10 = 1
        L7a:
            if (r10 == 0) goto L7d
            goto L83
        L7d:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L96
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L96
            goto L88
        L83:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L96
            r0.<init>()     // Catch: java.lang.Throwable -> L96
        L88:
            r0.remove(r4)     // Catch: java.lang.Throwable -> L96
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L96
            java.lang.String r1 = X.C786410Ut5.J3(r0)     // Catch: java.lang.Throwable -> L96
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L96
            goto La2
        L96:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        La2:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto La9
            r2 = r1
        La9:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196960hFm.LJIILJJIL():java.lang.String");
    }

    public final boolean LJIILL() {
        Aweme awemeLJJLIIIJJIZ;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        ViewGroup viewGroup = this.LLJJJ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZLL;
        return C1189100h36.LIZIZ((interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (poiDataStruct = awemeLJJLIIIJJIZ.getPoiDataStruct()) == null || (poiAnchorInfo = poiDataStruct.commentAnchor) == null) ? null : poiAnchorInfo.subTags);
    }

    public final C1197020hFs LJIILLIIL() {
        return new C1197020hFs(C1180060goW.LJFF(this.LLJJ), C1180060goW.LIZLLL(this.LLJJ) + C1180060goW.LJFF(this.LLJJ), C1180060goW.LJFF(this.LLJJIII), C1180060goW.LIZLLL(this.LLJJIII) + C1180060goW.LJFF(this.LLJJIII), C1180060goW.LIZLLL(this.LLJJI) + C1180060goW.LJFF(this.LLJJI), C1180060goW.LJFF(this.LLJJIJIIJIL), C1180060goW.LIZLLL(this.LLJJIJIIJIL) + C1180060goW.LJFF(this.LLJJIJIIJIL), C1180060goW.LJFF(this.LLJJIJI), C1180060goW.LIZLLL(this.LLJJIJI) + C1180060goW.LJFF(this.LLJJIJI));
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLZ() {
        this.LLILZ.getClass();
    }

    public final void LJIIZILJ() {
        if (LJIILIIL()) {
            AnimatorSet animatorSet = this.LLJZIJLIL;
            if (animatorSet == null || !animatorSet.isRunning()) {
                AnimatorSet animatorSet2 = this.LLJZIJLIL;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                ViewGroup viewGroup = this.LLJILLL;
                if (viewGroup != null) {
                    viewGroup.setPivotX(0.0f);
                }
                ViewGroup viewGroup2 = this.LLJILLL;
                if (viewGroup2 != null) {
                    viewGroup2.setPivotY(1.0f);
                }
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
                valueAnimatorOfInt.addListener(new ALAdapterS14S0100000_18(this, 8));
                valueAnimatorOfInt.addUpdateListener(new AUListenerS267S0100000_18(this, 12));
                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(31)));
                valueAnimatorOfInt2.setDuration(300L);
                valueAnimatorOfInt2.setInterpolator(new C21388418n4());
                valueAnimatorOfInt2.addListener(new ALAdapterS14S0100000_18(this, 7));
                valueAnimatorOfInt2.addUpdateListener(new AUListenerS267S0100000_18(this, 11));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LLJJJ, "alpha", 0.0f, 1.0f);
                objectAnimatorOfFloat.setDuration(200L);
                objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(valueAnimatorOfInt, valueAnimatorOfInt2, objectAnimatorOfFloat);
                animatorSet3.addListener(new ALAdapterS14S0100000_18(this, 4));
                animatorSet3.start();
                this.LLJZIJLIL = animatorSet3;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        IStateNotifier iStateNotifier;
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
        if (!C298410Bmp.LIZ() || (iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionStateNotifier.class, false, false, false, 14, null)) == null) {
            return;
        }
        iStateNotifier.addSubscriber(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        IStateNotifier iStateNotifier;
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
        AnimatorSet animatorSet = this.LLJZIJLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (!C298410Bmp.LIZ() || (iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionStateNotifier.class, false, false, false, 14, null)) == null) {
            return;
        }
        iStateNotifier.removeSubscriber(this);
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return this.LLJL;
    }

    public C1196960hFm(Context context) {
        super(context);
        this.LLILZ = new PoiAnchorMakerDelegate();
        this.LLILZIL = C2296808zG.LIZIZ();
        this.LLIZ = -1L;
        this.LLIZLLLIL = -1.0d;
        this.LLJL = new C1400390mXt(null, null, null, null, null, 31);
        C1195400hDG c1195400hDG = new C1195400hDG();
        this.LLJLIL = c1195400hDG;
        this.LLJLILLLLZIIL = new ArrayList();
        this.LLJLLIL = new C1188820h2e(EnumC1188880h2k.VIDEO_ANCHOR);
        this.LLJLLL = new ViewOnTouchListenerC1196980hFo();
        this.LLLF = -1L;
        long jNanoTime = System.nanoTime();
        this.LLIZ = jNanoTime;
        C786410Ut5.Sd(R.layout.e2d, C786410Ut5.ne(context), this);
        this.LLJIJIL = (ViewGroup) findViewById(R.id.b2j);
        this.LLJILLL = (ViewGroup) findViewById(R.id.r3_);
        this.LLJILJIL = (SmartImageView) findViewById(R.id.r38);
        this.LLJILJILJ = (SmartImageView) findViewById(R.id.r26);
        this.LLJJ = (TuxTextView) findViewById(R.id.re4);
        this.LLJJJJJIL = (ViewGroup) findViewById(R.id.evm);
        this.LLJJIJIL = (ViewGroup) findViewById(R.id.re0);
        this.LLJJI = (TuxTextView) findViewById(R.id.re1);
        this.LLJJIII = (TuxTextView) findViewById(R.id.re2);
        this.LLJJIJI = (TuxTextView) findViewById(R.id.re3);
        this.LLJJIJIIJIL = (TuxIconView) findViewById(R.id.r3b);
        this.LLJJJ = (ViewGroup) findViewById(R.id.rdl);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.rdk);
        this.LLJJJJ = (TuxIconView) findViewById(R.id.r3a);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, this.LLJIJIL);
        if (jNanoTime != -1) {
            this.LLIZLLLIL = (System.nanoTime() - jNanoTime) / 1000.0d;
        }
        c1195400hDG.LIZ();
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLLZIIL.getValue());
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        String str;
        String str2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZLL;
        if (interfaceC1392640mLO == null) {
            return true;
        }
        this.LLLFF = System.currentTimeMillis();
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
            strLLIIJI = "video_anchor";
        }
        String strCf = interfaceC1392640mLO.Cf();
        String strLJIILJJIL = LJIILJJIL();
        if (strLJIILJJIL == null) {
            strLJIILJJIL = "";
        }
        Map mapLIZIZ = C18JG.LIZIZ("c1480.d0", PageFinder.via(interfaceC1392640mLO.LJ()));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapLIZIZ.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        c2344009Gk.LJII(linkedHashMap2);
        LJJLL(awemeLJJLIIIJJIZ, strLLIIJI, strCf, false, strLJIILJJIL, c2344009Gk, PageFinder.via(interfaceC1392640mLO.LJ()), new AwS597S0100000_18(this, 691));
        PoiDataStruct poiDataStruct = interfaceC1392640mLO.LJJLIIIJJIZ().getPoiDataStruct();
        if (poiDataStruct != null && poiDataStruct.isProductAnchor()) {
            str = "product";
        } else {
            str = "poi";
        }
        C1195370hDD c1195370hDD = C1195370hDD.LIZ;
        C1195400hDG c1195400hDG = this.LLJLIL;
        PoiDataStruct poiDataStruct2 = this.LLJ;
        if (poiDataStruct2 != null) {
            str2 = poiDataStruct2.typeLevel;
        } else {
            str2 = null;
        }
        c1195370hDD.getClass();
        C1195370hDD.LJ(c1195400hDG, str2, str);
        AnonymousClass0956 anonymousClass0956 = this.LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJZ = C23250099c.LIZLLL(this.LLILZIL, null, null, new C1196590hFB(this, interfaceC1392640mLO, null), 3);
        return true;
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Object obj;
        Aweme aweme;
        boolean z;
        Aweme awemeLJJLIIIJJIZ;
        String aid = null;
        if (c737030Svd != null) {
            obj = c737030Svd.LIZIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        if (c737030Svd != null) {
            if (c737030Svd.LIZ == 13) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Bundle bundle = c737030Svd.LIZJ;
                if (bundle != null && bundle.getInt("user_digged") == 1) {
                    this.LLL = "like_video";
                    if (this.LLLF == -1) {
                        this.LLLF = System.currentTimeMillis() - this.LLLFF;
                    }
                    LJIIZILJ();
                    return;
                }
            } else if (c737030Svd == null) {
                return;
            }
            if (c737030Svd.LIZ != 54 || aweme == null || aweme.getCollectStatus() != 1) {
                return;
            }
            String aid2 = aweme.getAid();
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZLL;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                aid = awemeLJJLIIIJJIZ.getAid();
            }
            if (!Intrinsics.LJFF(aid2, aid)) {
                return;
            }
            this.LLL = "fav_video";
            if (this.LLLF == -1) {
                this.LLLF = System.currentTimeMillis() - this.LLLFF;
            }
            LJIIZILJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0180  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C2344009Gk r34, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196960hFm.LJ(X.09Gk, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        String aid;
        Aweme awemeLJJLIIIJJIZ;
        if (z && enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZLL;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                aid = awemeLJJLIIIJJIZ.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                this.LLL = "fav_video";
                if (this.LLLF == -1) {
                    this.LLLF = System.currentTimeMillis() - this.LLLFF;
                }
                LJIIZILJ();
            }
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:386:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07f9  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0800  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r33, X.InterfaceC1392640mLO r34, int r35, kotlin.jvm.functions.Function0 r36) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196960hFm.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, int, kotlin.jvm.functions.Function0):void");
    }
}
