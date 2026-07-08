package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig;
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

/* JADX INFO: renamed from: X.0hFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196950hFl extends AbstractC707180Roa implements InterfaceC1197120hG2, C0O2O {
    public static final int LLLII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
    public final /* synthetic */ PoiAnchorMakerDelegate LLILZ;
    public InterfaceC1392640mLO LLILZIL;
    public final C1400390mXt LLILZLL;
    public ViewGroup LLIZ;
    public SmartImageView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewGroup LLJILLL;
    public ViewGroup LLJJ;
    public TuxTextView LLJJI;
    public TuxIconView LLJJIII;
    public ViewGroup LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxTextView LLJJJJ;
    public PoiDataStruct LLJJJJJIL;
    public int LLJJJJLIIL;
    public AnimatorSet LLJJL;
    public final C054G LLJJLIIIJLLLLLLLZ;
    public AnonymousClass0956 LLJL;
    public String LLJLIL;
    public long LLJLILLLLZIIL;
    public long LLJLL;
    public C1197060hFw LLJLLIL;
    public C1197050hFv LLJLLL;
    public C1197080hFy LLJZ;
    public final List<PoiSubTag> LLJZIJLIL;
    public final long LLL;
    public final double LLLF;
    public boolean LLLFF;
    public final C1195400hDG LLLFFI;
    public final C1188820h2e LLLFZ;
    public final ViewOnTouchListenerC1196980hFo LLLI;

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
    }

    @Override // X.InterfaceC1197120hG2
    public final String LIZLLL() {
        return this.LLILZ.LIZLLL();
    }

    @Override // X.AbstractC707180Roa
    public final void LJIIIZ() {
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.String> getCtaMobParams() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r6.LLJJJJJIL
            r1 = 0
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L5e
            com.ss.android.ugc.aweme.poi.PoiAnchorButtonInfo r0 = r0.poiAnchorButton
            if (r0 == 0) goto L5e
            java.lang.Integer r0 = r0.style
        Lf:
            int r5 = X.C1175120ggY.LIZJ(r0)
            X.07uS r0 = X.EnumC2012207uS.BUTTON
            int r0 = r0.getValue()
            if (r5 != r0) goto L5b
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r6.LLJJJJJIL
            if (r0 == 0) goto L25
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L25
            java.lang.Integer r1 = r0.anchorExpType
        L25:
            int r0 = X.C1175120ggY.LIZJ(r1)
            if (r0 <= 0) goto L5b
            java.lang.String r4 = "1"
        L2d:
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            java.lang.String r2 = java.lang.String.valueOf(r5)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "main_is_cta_guide"
            r1.<init>(r0, r2)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "main_is_cta_guide_dynamic"
            r1.<init>(r0, r4)
            r0 = 1
            r3[r0] = r1
            java.lang.String r2 = java.lang.String.valueOf(r5)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "is_cta_guide"
            r1.<init>(r0, r2)
            r0 = 2
            r3[r0] = r1
            java.util.Map r0 = X.C2097608Jq.LJIIIIZZ(r3)
            return r0
        L5b:
            java.lang.String r4 = "0"
            goto L2d
        L5e:
            r0 = r1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.getCtaMobParams():java.util.Map");
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
        PoiDataStruct poiDataStruct2 = this.LLJJJJJIL;
        String str4 = null;
        if (poiDataStruct2 != null && (poiAnchorInfo4 = poiDataStruct2.videoAnchor) != null) {
            str4 = poiAnchorInfo4.transactionSuffix;
        }
        if ((str4 == null || str4.length() == 0) && ((poiDataStruct = this.LLJJJJJIL) == null || (poiAnchorInfo3 = poiDataStruct.videoAnchor) == null || (poiAnchorButtonInfo = poiAnchorInfo3.poiAnchorButton) == null || (str3 = poiAnchorButtonInfo.title) == null || str3.length() == 0)) {
            PoiDataStruct poiDataStruct3 = this.LLJJJJJIL;
            return (poiDataStruct3 == null || (poiAnchorInfo2 = poiDataStruct3.videoAnchor) == null || (str2 = poiAnchorInfo2.suffix) == null) ? "" : str2;
        }
        PoiDataStruct poiDataStruct4 = this.LLJJJJJIL;
        return (poiDataStruct4 == null || (poiAnchorInfo = poiDataStruct4.videoAnchor) == null || (str = poiAnchorInfo.transactionSuffix) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIILL() {
        /*
            r14 = this;
            java.lang.String r4 = "poi_info"
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r14.LLJJJJJIL
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
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r1 = r14.LLJZIJLIL
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r14.LLJJJJJIL
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
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r0 = r14.LLJZIJLIL
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
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.LJIILL():java.lang.String");
    }

    public final boolean LJIILLIIL() {
        Aweme awemeLJJLIIIJJIZ;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        ViewGroup viewGroup = this.LLJJ;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return false;
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
        return C1189100h36.LIZIZ((interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (poiDataStruct = awemeLJJLIIIJJIZ.getPoiDataStruct()) == null || (poiAnchorInfo = poiDataStruct.commentAnchor) == null) ? null : poiAnchorInfo.subTags);
    }

    public final void LJIIZILJ() {
        C1197060hFw c1197060hFw = this.LLJLLIL;
        int iLIZJ = C1175120ggY.LIZJ(c1197060hFw != null ? Integer.valueOf(c1197060hFw.LIZJ) : null);
        C1197060hFw c1197060hFw2 = this.LLJLLIL;
        int iLIZJ2 = C1175120ggY.LIZJ(c1197060hFw2 != null ? Integer.valueOf(c1197060hFw2.LIZLLL) : null);
        C1197060hFw c1197060hFw3 = this.LLJLLIL;
        int iLIZJ3 = C1175120ggY.LIZJ(c1197060hFw3 != null ? Integer.valueOf(c1197060hFw3.LJFF) : null);
        C1197050hFv c1197050hFv = this.LLJLLL;
        int iLIZJ4 = C1175120ggY.LIZJ(c1197050hFv != null ? Integer.valueOf(c1197050hFv.LIZ) : null);
        C1197050hFv c1197050hFv2 = this.LLJLLL;
        int iLIZJ5 = C1175120ggY.LIZJ(c1197050hFv2 != null ? Integer.valueOf(c1197050hFv2.LIZJ) : null);
        C1197080hFy c1197080hFy = this.LLJZ;
        LLLFFI(iLIZJ, iLIZJ2, iLIZJ3, iLIZJ4, iLIZJ5, C1175120ggY.LIZJ(c1197080hFy != null ? Integer.valueOf(c1197080hFy.LIZ) : null));
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO != null ? interfaceC1392640mLO.LJJLIIIJJIZ() : null;
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILZIL;
        String strLLIIJI = interfaceC1392640mLO2 != null ? interfaceC1392640mLO2.LLIIJI() : null;
        if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
            strLLIIJI = "video_anchor";
        }
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LLILZIL;
        String strCf = interfaceC1392640mLO3 != null ? interfaceC1392640mLO3.Cf() : null;
        if (strCf == null) {
            strCf = "";
        }
        String strLJIILL = LJIILL();
        String str = strLJIILL != null ? strLJIILL : "";
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (LJIILLIIL()) {
            long j = this.LLJLL;
            if (j != -1 && this.LLJLILLLLZIIL != 0) {
                c2344009Gk.LIZLLL(j, "expand_duration");
            }
            if (C123100dR.LIZ(this.LLJLIL)) {
                c2344009Gk.LJFF("expand_type", this.LLJLIL);
            }
        }
        c2344009Gk.LJII(getCtaMobParams());
        this.LLILZ.LIZ(awemeLJJLIIIJJIZ, strLLIIJI, strCf, str, c2344009Gk);
    }

    public final C1197050hFv LJIJ() {
        int iLJFF = C1180060goW.LJFF(this.LLJ);
        int iLIZLLL = C1180060goW.LIZLLL(this.LLJ) + C1180060goW.LJFF(this.LLJ);
        int iLJFF2 = C1180060goW.LJFF(this.LLJIJIL);
        int iLIZLLL2 = C1180060goW.LIZLLL(this.LLJIJIL) + C1180060goW.LJFF(this.LLJIJIL);
        int iLIZLLL3 = C1180060goW.LIZLLL(this.LLJI) + C1180060goW.LJFF(this.LLJI);
        int iLJFF3 = C1180060goW.LJFF(this.LLJILJILJ);
        int iLIZLLL4 = C1180060goW.LIZLLL(this.LLJILJILJ) + C1180060goW.LJFF(this.LLJILJILJ);
        int iLJFF4 = C1180060goW.LJFF(this.LLJILJIL);
        int iLIZLLL5 = C1180060goW.LIZLLL(this.LLJILJIL) + C1180060goW.LJFF(this.LLJILJIL);
        C1197060hFw c1197060hFw = this.LLJLLIL;
        return new C1197050hFv(iLJFF, iLIZLLL, iLJFF2, iLIZLLL2, iLIZLLL3, iLJFF3, iLIZLLL4, iLJFF4, iLIZLLL5, C1175120ggY.LIZJ(c1197060hFw != null ? Integer.valueOf(c1197060hFw.LJIIIIZZ) : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.LJIJJ():void");
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLZ() {
        this.LLILZ.getClass();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).addSubscriber(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
        AnimatorSet animatorSet = this.LLJJL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        C2296808zG.LIZJ(this.LLJJLIIIJLLLLLLLZ, null);
        if (C298410Bmp.LIZ()) {
            ((IStateNotifier) ServiceManager.get().getService(IAwemeCollectionStateNotifier.class)).removeSubscriber(this);
        }
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return this.LLILZLL;
    }

    public C1196950hFl(Context context) {
        super(context);
        this.LLILZ = new PoiAnchorMakerDelegate();
        this.LLILZLL = new C1400390mXt(null, null, null, null, null, 31);
        this.LLJJLIIIJLLLLLLLZ = C2296808zG.LIZIZ();
        new C1195430hDJ(this);
        this.LLJLL = -1L;
        this.LLJZIJLIL = new ArrayList();
        this.LLL = -1L;
        this.LLLF = -1.0d;
        C1195400hDG c1195400hDG = new C1195400hDG();
        this.LLLFFI = c1195400hDG;
        this.LLLFZ = new C1188820h2e(EnumC1188880h2k.VIDEO_ANCHOR);
        this.LLLI = new ViewOnTouchListenerC1196980hFo();
        long jNanoTime = System.nanoTime();
        this.LLL = jNanoTime;
        C786410Ut5.Sd(R.layout.e3s, C786410Ut5.ne(context), this);
        float f = C715390S4j.LIZ;
        C715390S4j.LIZJ(4, findViewById(R.id.b2j));
        this.LLIZLLLIL = (SmartImageView) findViewById(R.id.r38);
        this.LLJ = (TuxTextView) findViewById(R.id.re4);
        this.LLIZ = (ViewGroup) findViewById(R.id.b2j);
        this.LLJJIJI = (ViewGroup) findViewById(R.id.evm);
        this.LLJILLL = (ViewGroup) findViewById(R.id.re0);
        this.LLJI = (TuxTextView) findViewById(R.id.re1);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.re2);
        this.LLJILJIL = (TuxTextView) findViewById(R.id.re3);
        this.LLJILJILJ = (TuxIconView) findViewById(R.id.r3b);
        this.LLJJ = (ViewGroup) findViewById(R.id.rdl);
        this.LLJJI = (TuxTextView) findViewById(R.id.rdk);
        this.LLJJIII = (TuxIconView) findViewById(R.id.r3a);
        this.LLJJIJIIJIL = (ViewGroup) findViewById(R.id.qza);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.qz_);
        this.LLJJIJIL = (ViewGroup) findViewById(R.id.qzd);
        this.LLJJJ = (TuxTextView) findViewById(R.id.qze);
        this.LLJJJJ = (TuxTextView) findViewById(R.id.qzf);
        C2271391DvN.LIZ(this.LLJJIJIIJIL, (C1A5L) C2271381DvM.LLLZL.getValue());
        C2271391DvN.LIZ(this.LLJJIJIL, (C1A5L) C2271381DvM.LLLZIL.getValue());
        LJIILIIL(false);
        if (jNanoTime != -1) {
            this.LLLF = (System.nanoTime() - jNanoTime) / 1000.0d;
        }
        c1195400hDG.LIZ();
        C2271391DvN.LIZ(this, (C1A5L) C2271381DvM.LLLZI.getValue());
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) {
        String str;
        String str2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
        if (interfaceC1392640mLO == null) {
            return true;
        }
        interfaceC1392640mLO.LJJLIIIJJIZ();
        this.LLJLILLLLZIIL = System.currentTimeMillis();
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
            strLLIIJI = "video_anchor";
        }
        String strCf = interfaceC1392640mLO.Cf();
        String strLJIILL = LJIILL();
        if (strLJIILL == null) {
            strLJIILL = "";
        }
        c2344009Gk.LJII(getCtaMobParams());
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
        LJJLL(awemeLJJLIIIJJIZ, strLLIIJI, strCf, false, strLJIILL, c2344009Gk, PageFinder.via(interfaceC1392640mLO.LJ()), new AwS597S0100000_18(this, 689));
        PoiDataStruct poiDataStruct = interfaceC1392640mLO.LJJLIIIJJIZ().getPoiDataStruct();
        if (poiDataStruct != null && poiDataStruct.isProductAnchor()) {
            str = "product";
        } else {
            str = "poi";
        }
        C1195370hDD c1195370hDD = C1195370hDD.LIZ;
        C1195400hDG c1195400hDG = this.LLLFFI;
        PoiDataStruct poiDataStruct2 = this.LLJJJJJIL;
        if (poiDataStruct2 != null) {
            str2 = poiDataStruct2.typeLevel;
        } else {
            str2 = null;
        }
        c1195370hDD.getClass();
        C1195370hDD.LJ(c1195400hDG, str2, str);
        AnonymousClass0956 anonymousClass0956 = this.LLJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJL = C23250099c.LIZLLL(this.LLJJLIIIJLLLLLLLZ, null, null, new C1196580hFA(this, interfaceC1392640mLO, null), 3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(boolean r9) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.LJIILIIL(boolean):void");
    }

    public final void LJIILJJIL(List<PoiSubTag> list) {
        Map<String, String> map = PoiCoreConfig.LIZ.poiAnchorSubTagFrequencyMap;
        if (map != null && !map.isEmpty() && list != null) {
            C19719612Di.LJJIIJ(list, new C1196990hFp(this), true);
        }
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
                    this.LLJLIL = "like_video";
                    if (this.LLJLL == -1) {
                        this.LLJLL = System.currentTimeMillis() - this.LLJLILLLLZIIL;
                    }
                    LJIJJ();
                    return;
                }
            } else if (c737030Svd == null) {
                return;
            }
            if (c737030Svd.LIZ != 54 || aweme == null || aweme.getCollectStatus() != 1) {
                return;
            }
            String aid2 = aweme.getAid();
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                aid = awemeLJJLIIIJJIZ.getAid();
            }
            if (!Intrinsics.LJFF(aid2, aid)) {
                return;
            }
            this.LLJLIL = "fav_video";
            if (this.LLJLL == -1) {
                this.LLJLL = System.currentTimeMillis() - this.LLJLILLLLZIIL;
            }
            LJIJJ();
        }
    }

    @Override // X.AbstractC707180Roa
    public void setDarkMode(boolean z) {
        int iIntValue;
        int iIntValue2;
        Integer numLIZJ;
        Integer numLIZJ2;
        Integer numLIZJ3;
        Integer numLIZJ4;
        if (z) {
            ViewGroup viewGroup = this.LLIZ;
            if (viewGroup != null) {
                C384050F3z c384050F3z = new C384050F3z();
                Context context = getContext();
                if (context != null) {
                    numLIZJ4 = C1308910kAL.LIZJ(R.attr.atk, context);
                } else {
                    numLIZJ4 = null;
                }
                c384050F3z.LIZ = numLIZJ4;
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                viewGroup.setBackground(c384050F3z.LIZ(getContext()));
            }
            Context context2 = getContext();
            if (context2 != null && (numLIZJ3 = C1308910kAL.LIZJ(R.attr.av2, context2)) != null) {
                iIntValue2 = numLIZJ3.intValue();
            } else {
                iIntValue2 = -16777216;
            }
            iIntValue = iIntValue2;
        } else {
            ViewGroup viewGroup2 = this.LLIZ;
            if (viewGroup2 != null) {
                viewGroup2.setBackgroundResource(R.drawable.cu6);
            }
            Context context3 = getContext();
            iIntValue = -1;
            if (context3 != null && (numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, context3)) != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = -1;
            }
            Context context4 = getContext();
            if (context4 != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.eg, context4)) != null) {
                iIntValue = numLIZJ.intValue();
            }
        }
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView2 = this.LLJI;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView3 = this.LLJIJIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView4 = this.LLJILJIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView5 = this.LLJIJIL;
        if (tuxTextView5 != null) {
            tuxTextView5.setTextColor(iIntValue);
        }
        TuxIconView tuxIconView = this.LLJILJILJ;
        if (tuxIconView != null) {
            tuxIconView.setTintColor(iIntValue2);
        }
        TuxIconView tuxIconView2 = this.LLJJIII;
        if (tuxIconView2 != null) {
            tuxIconView2.setTintColor(iIntValue2);
        }
        TuxTextView tuxTextView6 = this.LLJJI;
        if (tuxTextView6 != null) {
            tuxTextView6.setTextColor(iIntValue2);
        }
        TuxTextView tuxTextView7 = this.LLJJJIL;
        if (tuxTextView7 != null) {
            tuxTextView7.setTextColor(iIntValue2);
        }
        LJIILIIL(z);
    }

    public static void LJIJI(TuxTextView tuxTextView, String str) {
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (TextUtils.isEmpty(str)) {
            if (tuxTextView != null) {
                C786410Ut5.LLIL(tuxTextView, 8);
            }
        } else {
            if (tuxTextView == null) {
                return;
            }
            C786410Ut5.LLIL(tuxTextView, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01af  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C2344009Gk r34, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r35) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.LJ(X.09Gk, kotlin.jvm.functions.Function1):void");
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) {
        String aid;
        Aweme awemeLJJLIIIJJIZ;
        if (z && enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                aid = awemeLJJLIIIJJIZ.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                this.LLJLIL = "fav_video";
                if (this.LLJLL == -1) {
                    this.LLJLL = System.currentTimeMillis() - this.LLJLILLLLZIIL;
                }
                LJIJJ();
            }
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:442:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08fb  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0927  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x092e  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0935  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r30, X.InterfaceC1392640mLO r31, int r32, kotlin.jvm.functions.Function0 r33) {
        /*
            Method dump skipped, instruction units count: 2413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196950hFl.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, int, kotlin.jvm.functions.Function0):void");
    }
}
