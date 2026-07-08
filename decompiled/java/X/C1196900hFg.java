package X;

import Y.ALAdapterS13S0200000_18;
import Y.ARunnableS12S0500000_18;
import Y.ATListenerS342S0200000_18;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.LynxViewClient;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionStateNotifier;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi.PoiAnchorCard;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardCarouselLabel;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLine;
import com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLineCarousel;
import com.ss.android.ugc.aweme.poi.PoiAnchorInfo;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorMakerDelegate;
import com.ss.android.ugc.aweme.state.ability.IStateNotifier;
import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import com.ss.android.ugc.feed.platform.standard.preload.FcpStandardPreloadProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hFg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1196900hFg extends AbstractC707180Roa implements InterfaceC1197120hG2, C0O2O {
    public final /* synthetic */ PoiAnchorMakerDelegate LLILZ;
    public InterfaceC1392640mLO LLILZIL;
    public final C1400390mXt LLILZLL;
    public final C1195400hDG LLIZ;
    public final C1188820h2e LLIZLLLIL;
    public boolean LLJ;
    public PoiDataStruct LLJI;
    public boolean LLJIJIL;
    public LinearLayout LLJILJIL;
    public SmartImageView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;
    public TuxIconView LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public View LLJJIJIL;
    public TuxTextView LLJJJ;
    public TuxTextView LLJJJIL;
    public TuxIconView LLJJJJ;
    public LinearLayout LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public C197039127h LLJLLIL;
    public TuxTextView LLJLLL;
    public TuxTextView LLJZ;
    public BPEAHandler LLJZIJLIL;
    public final List<String> LLL;
    public boolean LLLF;
    public FrameLayout LLLFF;
    public C1537720q7O LLLFFI;
    public Map<String, String> LLLFZ;
    public boolean LLLI;
    public Map<String, ? extends Object> LLLII;
    public int LLLIIII;
    public AnonymousClass0956 LLLIIIIL;
    public C054G LLLIIIL;
    public boolean LLLIIL;
    public boolean LLLIILIL;
    public String LLLIL;
    public long LLLILZ;
    public long LLLILZJ;

    @Override // X.InterfaceC713230RyL
    public final void LIZ() {
        C1537720q7O c1537720q7O;
        this.LLJIJIL = false;
        BPEAHandler bPEAHandler = this.LLJZIJLIL;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        this.LLJZIJLIL = null;
        AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIL = false;
        this.LLLIILIL = false;
        if (this.LLLI && (c1537720q7O = this.LLLFFI) != null) {
            c1537720q7O.LIZ("onVideoViewHolderPageUnSelected", new JSONObject());
        }
        LJIILL();
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

    private final Map<String, String> getAndClearJsbClickParams() {
        Map<String, String> map = this.LLLFZ;
        this.LLLFZ = null;
        return map;
    }

    public final void LJIILL() {
        ViewGroup viewGroup;
        C1537720q7O c1537720q7O = this.LLLFFI;
        if (c1537720q7O != null) {
            ViewParent parent = c1537720q7O.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1537720q7O, viewGroup);
            }
        }
        C1537720q7O c1537720q7O2 = this.LLLFFI;
        if (c1537720q7O2 != null) {
            c1537720q7O2.LLD(true);
        }
        this.LLLFFI = null;
        this.LLLI = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003f A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:23:0x002f, B:33:0x0045, B:34:0x004a, B:40:0x005c, B:37:0x0054, B:41:0x0070, B:43:0x0076, B:45:0x007c, B:47:0x0080, B:49:0x0084, B:58:0x0095, B:60:0x0099, B:32:0x003f), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095 A[Catch: all -> 0x00ab, TryCatch #0 {all -> 0x00ab, blocks: (B:23:0x002f, B:33:0x0045, B:34:0x004a, B:40:0x005c, B:37:0x0054, B:41:0x0070, B:43:0x0076, B:45:0x007c, B:47:0x0080, B:49:0x0084, B:58:0x0095, B:60:0x0099, B:32:0x003f), top: B:74:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIJI() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r7.LLJI
            r2 = 0
            if (r0 == 0) goto L1f
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L1f
            java.lang.String r1 = r0.trackInfo
        Lb:
            com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig$Config r0 = com.ss.android.ugc.aweme.poi.experiment.PoiCoreConfig.LIZ
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.poiAnchorSubTagFrequencyMap
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L1d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            r0 = 0
        L1a:
            if (r0 == 0) goto L21
            return r1
        L1d:
            r0 = 1
            goto L1a
        L1f:
            r1 = r2
            goto Lb
        L21:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r7.LLJI
            if (r0 == 0) goto Lc1
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto Lc1
            com.ss.android.ugc.aweme.poi.PoiAnchorCard r4 = r0.poiAnchorCard
            if (r4 == 0) goto Lc1
            if (r1 == 0) goto L3f
            int r0 = r1.length()     // Catch: java.lang.Throwable -> Lab
            if (r0 <= 0) goto L36
            goto L38
        L36:
            r0 = 0
            goto L39
        L38:
            r0 = 1
        L39:
            if (r0 != 0) goto L3c
            r1 = r2
        L3c:
            if (r1 == 0) goto L3f
            goto L45
        L3f:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            goto L4a
        L45:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lab
            r3.<init>(r1)     // Catch: java.lang.Throwable -> Lab
        L4a:
            java.lang.String r1 = "style"
            boolean r0 = r7.LJJII()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L54
            r0 = r2
            goto L5c
        L54:
            boolean r0 = r7.LJJI()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L70
            java.lang.String r0 = "acc1"
        L5c:
            X.C1189060h32.LJJI(r1, r0, r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = "anchor_text"
            java.lang.String r0 = r7.LJIJ(r4)     // Catch: java.lang.Throwable -> Lab
            X.C1189060h32.LJJI(r1, r0, r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r1 = X.C786410Ut5.J3(r3)     // Catch: java.lang.Throwable -> Lab
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> Lab
            goto Lb7
        L70:
            boolean r0 = r7.LJJIFFI()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto La8
            boolean r0 = r7.LJJIFFI()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8d
            com.ss.android.ugc.aweme.poi.PoiAnchorCardButton r0 = r4.button     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8d
            java.lang.String r0 = r0.title     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8b
            int r0 = r0.length()     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L8b
            goto L8f
        L8b:
            r0 = 1
            goto L90
        L8d:
            r0 = 0
            goto L93
        L8f:
            r0 = 0
        L90:
            if (r0 != 0) goto L8d
            r0 = 1
        L93:
            if (r0 == 0) goto La5
            java.util.List<com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLineCarousel> r0 = r4.secondLineCarousel     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto L9d
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Lab
        L9d:
            if (r6 <= r5) goto La2
            java.lang.String r0 = "acc3"
            goto L5c
        La2:
            java.lang.String r0 = "acc4"
            goto L5c
        La5:
            java.lang.String r0 = "acc2"
            goto L5c
        La8:
            java.lang.String r0 = "acc"
            goto L5c
        Lab:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        Lb7:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto Lbe
            r2 = r1
        Lbe:
            java.lang.String r2 = (java.lang.String) r2
            return r2
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196900hFg.LJIJI():java.lang.String");
    }

    public final void LJIJJ() {
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        String str;
        HybridSchemaParam hybridSchemaParamLIZJ;
        PoiAnchorInfo poiAnchorInfo2;
        PoiAnchorCard poiAnchorCard2;
        String strLJ;
        PoiDataStruct poiDataStruct = this.LLJI;
        if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.videoAnchor) == null || (poiAnchorCard = poiAnchorInfo.poiAnchorCard) == null || (str = poiAnchorCard.lynxSchema) == null || this.LLLFF == null) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        LJIILL();
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(str);
        Gson gson = new Gson();
        PoiDataStruct poiDataStruct2 = this.LLJI;
        String str2 = null;
        k nVar = (poiDataStruct2 == null || (strLJ = C2365509Or.LJ(poiDataStruct2)) == null) ? new n() : (k) GsonProtectorUtils.fromJson(gson, strLJ, k.class);
        float fLIZ = C1189100h36.LIZ(getContext()) / Resources.getSystem().getDisplayMetrics().density;
        n nVar2 = new n();
        nVar2.LJJIFFI("poi_data", nVar);
        nVar2.LJJIII(Float.valueOf(fLIZ), "max_width");
        sparkContext.initData = GsonProtectorUtils.toJson(gson, (k) nVar2);
        C1538140q84 c1538140q84 = C1538140q84.LIZ;
        C1538590q8n c1538590q8n = new C1538590q8n();
        c1538590q8n.LIZLLL = true;
        c1538590q8n.LJ = true;
        C1538140q84.LIZIZ(c1538140q84, sparkContext, c1538590q8n, 4);
        InterfaceC1531560pxS interfaceC1531560pxS = sparkContext.hybridParams;
        if (interfaceC1531560pxS == null || (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) == null) {
            return;
        }
        LynxViewClient lynxViewClient = new LynxViewClient() { // from class: X.0hFh
            @Override // com.lynx.tasm.LynxViewClient
            public final void LJJIFFI() throws JSONException {
                C1196900hFg c1196900hFg = this;
                c1196900hFg.LLLI = true;
                Map<String, ? extends Object> map = c1196900hFg.LLLII;
                if (map != null) {
                    c1196900hFg.LJJ(map);
                }
                C1196900hFg c1196900hFg2 = this;
                if (c1196900hFg2.LLLIILIL) {
                    c1196900hFg2.LJIL();
                }
            }

            @Override // com.lynx.tasm.LynxViewClient
            public final void LJIILJJIL() {
                PoiAnchorInfo poiAnchorInfo3;
                PoiAnchorCard poiAnchorCard3;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String str3 = null;
                if (jCurrentTimeMillis2 > 0) {
                    this.getClass();
                    C1196900hFg.LJIJJLI(true, jCurrentTimeMillis2, null);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadLynxView() onLoadSuccess on anchor name: ");
                PoiDataStruct poiDataStruct3 = this.LLJI;
                if (poiDataStruct3 != null && (poiAnchorInfo3 = poiDataStruct3.videoAnchor) != null && (poiAnchorCard3 = poiAnchorInfo3.poiAnchorCard) != null) {
                    str3 = poiAnchorCard3.poiName;
                }
                sbLIZ.append(str3);
                C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // com.lynx.tasm.LynxViewClient, X.AbstractC1298860ju8
            public final void LJFF(LynxError lynxError) {
                String str3;
                Integer numValueOf;
                PoiAnchorInfo poiAnchorInfo3;
                PoiAnchorCard poiAnchorCard3;
                Integer numValueOf2;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String strLIZJ = null;
                if (jCurrentTimeMillis2 > 0) {
                    C1196900hFg c1196900hFg = this;
                    if (lynxError != null) {
                        numValueOf2 = Integer.valueOf(lynxError.LIZIZ());
                    } else {
                        numValueOf2 = null;
                    }
                    c1196900hFg.getClass();
                    C1196900hFg.LJIJJLI(false, jCurrentTimeMillis2, numValueOf2);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("loadLynxView() onReceivedError on anchor name: ");
                PoiDataStruct poiDataStruct3 = this.LLJI;
                if (poiDataStruct3 != null && (poiAnchorInfo3 = poiDataStruct3.videoAnchor) != null && (poiAnchorCard3 = poiAnchorInfo3.poiAnchorCard) != null) {
                    str3 = poiAnchorCard3.poiName;
                } else {
                    str3 = null;
                }
                sbLIZ.append(str3);
                sbLIZ.append(", errorCode = ");
                if (lynxError != null) {
                    numValueOf = Integer.valueOf(lynxError.LIZIZ());
                } else {
                    numValueOf = null;
                }
                sbLIZ.append(numValueOf);
                sbLIZ.append(", errorMsg = ");
                if (lynxError != null) {
                    strLIZJ = lynxError.LIZJ();
                }
                sbLIZ.append(strLIZJ);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        };
        InterfaceC1541990qEH interfaceC1541990qEHLIZIZ = C1537820q7Y.LIZIZ(hybridSchemaParamLIZJ, sparkContext, getContext(), null);
        C1537720q7O c1537720q7O = interfaceC1541990qEHLIZIZ instanceof C1537720q7O ? (C1537720q7O) interfaceC1541990qEHLIZIZ : null;
        this.LLLFFI = c1537720q7O;
        if (c1537720q7O != null) {
            c1537720q7O.addLynxViewClient(lynxViewClient);
        }
        FrameLayout frameLayout = this.LLLFF;
        if (frameLayout != null) {
            C1537720q7O c1537720q7O2 = this.LLLFFI;
            if (c1537720q7O2 == null) {
                c1537720q7O2 = null;
            }
            frameLayout.addView(c1537720q7O2);
        }
        C1537720q7O c1537720q7O3 = this.LLLFFI;
        if (c1537720q7O3 != null) {
            c1537720q7O3.load();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loadLynxView() called on anchor name: ");
        PoiDataStruct poiDataStruct3 = this.LLJI;
        if (poiDataStruct3 != null && (poiAnchorInfo2 = poiDataStruct3.videoAnchor) != null && (poiAnchorCard2 = poiAnchorInfo2.poiAnchorCard) != null) {
            str2 = poiAnchorCard2.poiName;
        }
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJIL() throws JSONException {
        String aid;
        String str;
        Aweme awemeLJJLIIIJJIZ;
        if (!this.LLLI) {
            this.LLLIILIL = true;
            return;
        }
        C1537720q7O c1537720q7O = this.LLLFFI;
        if (c1537720q7O != null) {
            JSONObject jSONObject = new JSONObject();
            String str2 = this.LLLIL;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("expand_type", str2);
            jSONObject.put("expand_duration", this.LLLILZJ);
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
            if (interfaceC1392640mLO == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || (aid = awemeLJJLIIIJJIZ.getAid()) == null) {
                aid = "";
            }
            jSONObject.put("aweme_id", aid);
            PoiDataStruct poiDataStruct = this.LLJI;
            if (poiDataStruct != null && (str = poiDataStruct.poiId) != null) {
                str3 = str;
            }
            jSONObject.put("poi_id", str3);
            c1537720q7O.LIZ("onSearchPoiCardExpand", jSONObject);
        }
        this.LLLIILIL = false;
    }

    public final boolean LJJI() {
        PoiAnchorCardSecondLine poiAnchorCardSecondLine;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        if (!((Boolean) C0AQ0.LIZ.getValue()).booleanValue()) {
            return false;
        }
        PoiDataStruct poiDataStruct = this.LLJI;
        String str = null;
        if (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.videoAnchor) == null || (poiAnchorCard = poiAnchorInfo.poiAnchorCard) == null) {
            poiAnchorCardSecondLine = null;
        } else {
            poiAnchorCardSecondLine = poiAnchorCard.secondLine;
            if (poiAnchorCardSecondLine != null) {
                str = poiAnchorCardSecondLine.type;
            }
        }
        if (Intrinsics.LJFF(str, "promo")) {
            return Intrinsics.LJFF(poiAnchorCardSecondLine.subType, "promo_strikethrough") || Intrinsics.LJFF(poiAnchorCardSecondLine.subType, "promo_great_deal");
        }
        return false;
    }

    public final boolean LJJIFFI() {
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        PoiDataStruct poiDataStruct = this.LLJI;
        return (poiDataStruct == null || (poiAnchorInfo = poiDataStruct.videoAnchor) == null || (poiAnchorCard = poiAnchorInfo.poiAnchorCard) == null || poiAnchorCard.secondLineCarousel == null) ? false : true;
    }

    public final boolean LJJII() {
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        if (!((Boolean) C0AQ1.LIZ.getValue()).booleanValue()) {
            return false;
        }
        PoiDataStruct poiDataStruct = this.LLJI;
        return C123100dR.LIZ((poiDataStruct == null || (poiAnchorInfo = poiDataStruct.videoAnchor) == null || (poiAnchorCard = poiAnchorInfo.poiAnchorCard) == null) ? null : poiAnchorCard.lynxSchema);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033 A[PHI: r3
      0x0033: PHI (r3v1 boolean) = (r3v0 boolean), (r3v3 boolean), (r3v3 boolean), (r3v3 boolean) binds: [B:23:0x0030, B:13:0x001c, B:15:0x0020, B:17:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL() throws org.json.JSONException {
        /*
            r4 = this;
            X.0mLO r0 = r4.LLILZIL
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.LJJLIIIJJIZ()
        L8:
            r2 = 1
            if (r1 == 0) goto L37
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.getPoiDataStruct()
            if (r0 == 0) goto L2f
            boolean r0 = r0.isProductAnchor()
            if (r2 != r0) goto L2f
            r3 = 1
        L18:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r1.getPoiDataStruct()
            if (r0 == 0) goto L33
            java.util.List<java.lang.String> r0 = r0.productIds
            if (r0 == 0) goto L33
            int r1 = r0.size()
            r0 = 2
            if (r1 < r0) goto L33
            r0 = 1
        L2a:
            if (r3 == 0) goto L37
            if (r0 == 0) goto L37
            return
        L2f:
            r3 = 0
            if (r1 == 0) goto L33
            goto L18
        L33:
            r0 = 0
            goto L2a
        L35:
            r1 = 0
            goto L8
        L37:
            boolean r0 = r4.LLLIIL
            if (r0 == 0) goto L3c
            return
        L3c:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r4.LLJI
            if (r0 == 0) goto L6e
            com.ss.android.ugc.aweme.poi.PoiAnchorInfo r0 = r0.videoAnchor
            if (r0 == 0) goto L6e
            java.util.List<com.ss.android.ugc.aweme.poi.PoiSubTag> r1 = r0.subTags
            if (r1 == 0) goto L6e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L6e
            java.util.Iterator r1 = r1.iterator()
        L52:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.poi.PoiSubTag r0 = (com.ss.android.ugc.aweme.poi.PoiSubTag) r0
            java.lang.String r0 = r0.name
            if (r0 == 0) goto L52
            int r0 = r0.length()
            if (r0 == 0) goto L52
            r4.LLLIIL = r2
            r4.LJIL()
            return
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196900hFg.LJJIIJZLJL():void");
    }

    @Override // X.InterfaceC1197120hG2
    public final void LLZ() {
        this.LLILZ.getClass();
    }

    public final void LJIIZILJ() {
        this.LLJILJIL = (LinearLayout) findViewById(R.id.qxy);
        if (LJJII()) {
            this.LLLFF = (FrameLayout) findViewById(R.id.qxn);
            this.LLJILJILJ = null;
            this.LLJILLL = null;
            this.LLJJ = null;
            this.LLJJI = null;
            this.LLJJIII = null;
            this.LLJJIJI = null;
            this.LLJJIJIIJIL = null;
            this.LLJJIJIL = null;
            this.LLJJJ = null;
            this.LLJJJIL = null;
            this.LLJJJJ = null;
            this.LLJJJJJIL = null;
            this.LLJJJJLIIL = null;
            this.LLJJL = null;
            this.LLJJLIIIJLLLLLLLZ = null;
            this.LLJL = null;
            this.LLJLIL = null;
            this.LLJLILLLLZIIL = null;
            this.LLJLL = null;
            this.LLJLLIL = null;
            this.LLJLLL = null;
            this.LLJZ = null;
            return;
        }
        this.LLJILJILJ = (SmartImageView) findViewById(R.id.qxm);
        this.LLJJIJIL = findViewById(R.id.qxz);
        this.LLJJJ = (TuxTextView) findViewById(R.id.qxl);
        this.LLJJJIL = (TuxTextView) findViewById(R.id.qxq);
        this.LLJJJJ = (TuxIconView) findViewById(R.id.qxs);
        this.LLJJJJJIL = (LinearLayout) findViewById(R.id.qxr);
        this.LLJJJJLIIL = (TuxTextView) findViewById(R.id.qxx);
        this.LLJJL = (TuxTextView) findViewById(R.id.qxv);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) findViewById(R.id.qxt);
        this.LLJL = (TuxTextView) findViewById(R.id.qxu);
        this.LLJLIL = (TuxTextView) findViewById(R.id.qxw);
        this.LLJJIJI = (TuxTextView) findViewById(R.id.qy1);
        this.LLJJIJIIJIL = (TuxTextView) findViewById(R.id.qxg);
        if (LJJI()) {
            this.LLJLILLLLZIIL = (TuxTextView) findViewById(R.id.qxj);
            this.LLJLL = (TuxTextView) findViewById(R.id.qxf);
            this.LLJLLIL = (C197039127h) findViewById(R.id.qxe);
            this.LLJLLL = (TuxTextView) findViewById(R.id.qxp);
            this.LLJILLL = null;
            this.LLJJI = null;
            this.LLJJIII = null;
            this.LLJJ = null;
            this.LLJZ = null;
            return;
        }
        this.LLJILLL = (TuxTextView) findViewById(R.id.qxo);
        this.LLJJI = (TuxIconView) findViewById(R.id.qxi);
        this.LLJJIII = (TuxTextView) findViewById(R.id.qxh);
        this.LLJJ = (TuxTextView) findViewById(R.id.qy0);
        this.LLJZ = (TuxTextView) findViewById(R.id.qxb);
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        IStateNotifier iStateNotifier;
        super.onAttachedToWindow();
        this.LLLIIIL = C2296808zG.LIZIZ();
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
        AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C2296808zG.LIZJ(this.LLLIIIL, null);
        if (!C298410Bmp.LIZ() || (iStateNotifier = (IStateNotifier) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionStateNotifier.class, false, false, false, 14, null)) == null) {
            return;
        }
        iStateNotifier.removeSubscriber(this);
    }

    @Override // X.AbstractC707180Roa, X.InterfaceC1392510mLB
    public C1400390mXt getAnchorMobConfiguration() {
        return this.LLILZLL;
    }

    public C1196900hFg(Context context) {
        super(context);
        this.LLILZ = new PoiAnchorMakerDelegate();
        this.LLILZLL = new C1400390mXt(null, null, null, null, null, 31);
        C1195400hDG c1195400hDG = new C1195400hDG();
        this.LLIZ = c1195400hDG;
        this.LLIZLLLIL = new C1188820h2e(EnumC1188880h2k.VIDEO_ANCHOR);
        this.LLL = new ArrayList();
        this.LLLIIIL = C2296808zG.LIZIZ();
        this.LLLILZJ = -1L;
        new C1195440hDK(this);
        C786410Ut5.Sd(R.layout.e24, C786410Ut5.ne(getContext()), this);
        LJIIZILJ();
        setOnTouchListener(new ATListenerS342S0200000_18(this, new GestureDetector(getContext(), new C1209110hZN(this, 2)), 0));
        c1195400hDG.LIZ();
    }

    @Override // X.AbstractC707180Roa
    public final boolean LIZJ(C2344009Gk c2344009Gk) throws JSONException {
        String str;
        PoiDataStruct poiDataStruct;
        PoiAnchorInfo poiAnchorInfo;
        PoiAnchorCard poiAnchorCard;
        final List<PoiAnchorCardSecondLineCarousel> list;
        final long jIntValue;
        PoiAnchorInfo poiAnchorInfo2;
        PoiAnchorCard poiAnchorCard2;
        Integer num;
        String str2;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
        if (interfaceC1392640mLO == null) {
            return true;
        }
        this.LLLILZ = System.currentTimeMillis();
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
        String strLLIIJI = interfaceC1392640mLO.LLIIJI();
        if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
            strLLIIJI = "video_anchor";
        }
        String strCf = interfaceC1392640mLO.Cf();
        String strLJIJI = LJIJI();
        if (strLJIJI == null) {
            strLJIJI = "";
        }
        LJJLL(awemeLJJLIIIJJIZ, strLLIIJI, strCf, false, strLJIJI, c2344009Gk, null, new AwS597S0100000_18(this, 694));
        PoiDataStruct poiDataStruct2 = interfaceC1392640mLO.LJJLIIIJJIZ().getPoiDataStruct();
        if (poiDataStruct2 != null && poiDataStruct2.isProductAnchor()) {
            str = "product";
        } else {
            str = "poi";
        }
        if (this.LLJIJIL) {
            C1195400hDG c1195400hDG = this.LLIZ;
            if (c1195400hDG.LIZ != null && c1195400hDG.LIZIZ != null && c1195400hDG.LIZJ != null && c1195400hDG.LIZLLL != null) {
                C1195370hDD c1195370hDD = C1195370hDD.LIZ;
                PoiDataStruct poiDataStruct3 = this.LLJI;
                if (poiDataStruct3 != null) {
                    str2 = poiDataStruct3.typeLevel;
                } else {
                    str2 = null;
                }
                c1195370hDD.getClass();
                C1195370hDD.LJ(c1195400hDG, str2, str);
            }
        }
        if (LJJIFFI() && (poiDataStruct = this.LLJI) != null && (poiAnchorInfo = poiDataStruct.videoAnchor) != null && (poiAnchorCard = poiAnchorInfo.poiAnchorCard) != null && (list = poiAnchorCard.secondLineCarousel) != null && !list.isEmpty()) {
            final View viewFindViewById = findViewById(R.id.qxz);
            final SmartImageView smartImageView = (SmartImageView) findViewById(R.id.rdd);
            final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.rde);
            if (viewFindViewById != null && smartImageView != null && linearLayout != null) {
                BPEAHandler bPEAHandler = this.LLJZIJLIL;
                if (bPEAHandler != null) {
                    bPEAHandler.removeCallbacksAndMessages(null);
                }
                this.LLJZIJLIL = null;
                PoiDataStruct poiDataStruct4 = this.LLJI;
                if (poiDataStruct4 != null && (poiAnchorInfo2 = poiDataStruct4.videoAnchor) != null && (poiAnchorCard2 = poiAnchorInfo2.poiAnchorCard) != null && (num = poiAnchorCard2.animationDuration) != null) {
                    jIntValue = num.intValue();
                } else {
                    jIntValue = 3000;
                }
                final C118300cf c118300cf = new C118300cf();
                this.LLJZIJLIL = new BPEAHandler(Looper.getMainLooper());
                HandlerHook.viewPost(this, new ARunnableS12S0500000_18(list, c118300cf, this, smartImageView, linearLayout, 2));
                if (list.size() >= 2) {
                    Runnable runnable = new Runnable() { // from class: X.0hFd
                        public final void LIZ() {
                            PoiAnchorInfo poiAnchorInfo3;
                            PoiAnchorCard poiAnchorCard3;
                            Integer num2;
                            if (c118300cf.element >= list.size()) {
                                c118300cf.element = 0;
                            }
                            final PoiAnchorCardSecondLineCarousel poiAnchorCardSecondLineCarousel = (PoiAnchorCardSecondLineCarousel) ListProtector.get(list, c118300cf.element);
                            final C1196900hFg c1196900hFg = this;
                            final View view = viewFindViewById;
                            final SmartImageView smartImageView2 = smartImageView;
                            final LinearLayout linearLayout2 = linearLayout;
                            PoiDataStruct poiDataStruct5 = c1196900hFg.LLJI;
                            if (poiDataStruct5 != null && (poiAnchorInfo3 = poiDataStruct5.videoAnchor) != null && (poiAnchorCard3 = poiAnchorInfo3.poiAnchorCard) != null && (num2 = poiAnchorCard3.animationType) != null && num2.intValue() == 1) {
                                final float f = 16 * c1196900hFg.getContext().getResources().getDisplayMetrics().density;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", 0.0f, -f);
                                objectAnimatorOfFloat.setDuration(200L);
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
                                objectAnimatorOfFloat2.setDuration(200L);
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                                animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0hFe
                                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                    public final void onAnimationEnd(Animator animator) {
                                        c1196900hFg.LJJIIZ(poiAnchorCardSecondLineCarousel, smartImageView2, linearLayout2);
                                        C786410Ut5.ed(view, f);
                                        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "translationY", f, 0.0f);
                                        objectAnimatorOfFloat3.setDuration(200L);
                                        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
                                        objectAnimatorOfFloat4.setDuration(200L);
                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                        animatorSet2.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4);
                                        animatorSet2.addListener(new ALAdapterS13S0200000_18(poiAnchorCardSecondLineCarousel, c1196900hFg, 0));
                                        animatorSet2.start();
                                    }
                                });
                                animatorSet.start();
                            }
                            c118300cf.element++;
                            BPEAHandler bPEAHandler2 = this.LLJZIJLIL;
                            if (bPEAHandler2 != null) {
                                C786410Ut5.LJLIIL(jIntValue, bPEAHandler2, this);
                            }
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("PoiCardView@aafa.startCarouselAnimation$2");
                            try {
                                LIZ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("PoiCardView@aafa.startCarouselAnimation$2");
                        }
                    };
                    BPEAHandler bPEAHandler2 = this.LLJZIJLIL;
                    if (bPEAHandler2 != null) {
                        C786410Ut5.LJLIIL(jIntValue, bPEAHandler2, runnable);
                    }
                }
            }
        }
        if (LJJII()) {
            if (this.LLLFFI == null) {
                LJIJJ();
            }
            LJJ(this.LLILZLL.LIZ.invoke());
            AnonymousClass0956 anonymousClass0956 = this.LLLIIIIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLIIIIL = C23250099c.LIZLLL(this.LLLIIIL, null, null, new C1196570hF9(this, null), 3);
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0219 A[PHI: r9
      0x0219: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:181:0x0217, B:179:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021f A[PHI: r9
      0x021f: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v5 java.lang.String) binds: [B:181:0x0217, B:183:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x03ce  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLine r14) {
        /*
            Method dump skipped, instruction units count: 1428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196900hFg.LJIILIIL(com.ss.android.ugc.aweme.poi.PoiAnchorCardSecondLine):void");
    }

    public final TuxTextView LJIILJJIL(PoiAnchorCardCarouselLabel poiAnchorCardCarouselLabel) {
        Object c098200Yq;
        Object c098200Yq2;
        Object obj = null;
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        String str = poiAnchorCardCarouselLabel.text;
        if (str == null) {
            str = "";
        }
        tuxTextView.setText(str);
        String str2 = poiAnchorCardCarouselLabel.font;
        if (str2 != null) {
            try {
                c098200Yq = C2248361CzK.LIZIZ(str2);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            Integer num = (Integer) c098200Yq;
            if (num != null) {
                tuxTextView.setTuxFont(num.intValue());
            }
        }
        String str3 = poiAnchorCardCarouselLabel.textColor;
        if (str3 != null) {
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                c098200Yq2 = C2248361CzK.LJ(tuxTextView.getContext(), str3);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            Integer num2 = (Integer) obj;
            if (num2 != null) {
                tuxTextView.setTextColor(num2.intValue());
            }
        }
        if (Intrinsics.LJFF(poiAnchorCardCarouselLabel.hasStrikethrough, Boolean.TRUE)) {
            tuxTextView.setPaintFlags(tuxTextView.getPaintFlags() | 16);
        }
        return tuxTextView;
    }

    public final String LJIJ(PoiAnchorCard poiAnchorCard) {
        String str;
        String strLJJLIIIJ;
        if (LJJIFFI()) {
            List<PoiAnchorCardSecondLineCarousel> list = poiAnchorCard.secondLineCarousel;
            if (list != null && (strLJJLIIIJ = C13LP.LJJLIIIJ(list, " | ", null, null, 0, null, AFwS256S0000000_18.get$arr$(854), 30)) != null) {
                return strLJJLIIIJ;
            }
            return "";
        }
        if (!LJJII()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            PoiAnchorCardSecondLine poiAnchorCardSecondLine = poiAnchorCard.secondLine;
            String str2 = null;
            if (poiAnchorCardSecondLine != null) {
                str = poiAnchorCardSecondLine.value;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            PoiAnchorCardSecondLine poiAnchorCardSecondLine2 = poiAnchorCard.secondLine;
            if (poiAnchorCardSecondLine2 != null) {
                str2 = poiAnchorCardSecondLine2.suffixValue;
            }
            sbLIZ.append(str2);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }

    public final void LJJ(Map<String, ? extends Object> map) throws JSONException {
        Object c098200Yq;
        if (this.LLLI) {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof String) {
                        try {
                            new JSONObject((String) value);
                            c098200Yq = jSONObject.put(key, new JSONObject((String) value));
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                            jSONObject.put(key, value);
                        }
                        C189200o6.m1boximpl(c098200Yq);
                    } else if (!(value instanceof Boolean) && !(value instanceof Number) && !(value instanceof JSONObject) && !(value instanceof JSONArray)) {
                        if (value != null) {
                            jSONObject.put(key, value.toString());
                        }
                    } else {
                        jSONObject.put(key, value);
                    }
                }
            }
            jSONObject.put("start_to_show_timestamp", String.valueOf(this.LLLILZ));
            C1537720q7O c1537720q7O = this.LLLFFI;
            if (c1537720q7O != null) {
                c1537720q7O.LIZ("onSearchPoiCardShow", jSONObject);
            }
            this.LLLII = null;
            return;
        }
        this.LLLII = map;
    }

    public final void LJJIII(String str) {
        EnumC1195310hD7 enumC1195310hD7;
        String str2;
        TuxTextView tuxTextView = this.LLJJJ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        TuxIconView tuxIconView = this.LLJJJJ;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        LinearLayout linearLayout = this.LLJJJJJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        TuxTextView tuxTextView2 = this.LLJJJJLIIL;
        if (tuxTextView2 != null) {
            C786410Ut5.LLLLZLL(tuxTextView2, 8);
        }
        TuxTextView tuxTextView3 = this.LLJJL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
        TuxTextView tuxTextView4 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView4 != null) {
            C786410Ut5.LLLLZLL(tuxTextView4, 8);
        }
        TuxTextView tuxTextView5 = this.LLJL;
        if (tuxTextView5 != null) {
            C786410Ut5.LLLLZLL(tuxTextView5, 8);
        }
        TuxTextView tuxTextView6 = this.LLJLIL;
        if (tuxTextView6 != null) {
            C786410Ut5.LLLLZLL(tuxTextView6, 8);
        }
        TuxTextView tuxTextView7 = this.LLJJJIL;
        if (tuxTextView7 != null) {
            if (str != null) {
                str2 = str;
            } else {
                str2 = "";
            }
            tuxTextView7.setText(str2);
        }
        TuxTextView tuxTextView8 = this.LLJJJIL;
        if (tuxTextView8 != null) {
            C786410Ut5.LLLLZLL(tuxTextView8, 0);
        }
        C1195400hDG c1195400hDG = this.LLIZ;
        if (str != null && str.length() != 0) {
            enumC1195310hD7 = EnumC1195310hD7.POI_DATA;
        } else {
            enumC1195310hD7 = EnumC1195310hD7.NO_SHOW;
        }
        c1195400hDG.LIZLLL = enumC1195310hD7;
    }

    public final void LJJIIJ(Map<String, ? extends Object> map) {
        String string;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || (string = value.toString()) == null) {
                string = "";
            }
            linkedHashMap.put(key, string);
        }
        this.LLLFZ = linkedHashMap;
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) throws JSONException {
        String aid;
        boolean z;
        InterfaceC1392640mLO interfaceC1392640mLO;
        Aweme awemeLJJLIIIJJIZ;
        Aweme awemeLJJLIIIJJIZ2;
        if (!LJJII()) {
            return;
        }
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LLILZIL;
        Object obj = null;
        if (interfaceC1392640mLO2 != null && (awemeLJJLIIIJJIZ2 = interfaceC1392640mLO2.LJJLIIIJJIZ()) != null) {
            aid = awemeLJJLIIIJJIZ2.getAid();
        } else {
            aid = null;
        }
        if (c737030Svd != null) {
            obj = c737030Svd.LIZIZ;
        }
        if (Intrinsics.LJFF(aid, obj) && c737030Svd != null) {
            if (c737030Svd.LIZ == 13) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Bundle bundle = c737030Svd.LIZJ;
                if (bundle != null && bundle.getInt("user_digged") == 1) {
                    this.LLLIL = "like_video";
                    if (this.LLLILZJ == -1) {
                        this.LLLILZJ = System.currentTimeMillis() - this.LLLILZ;
                    }
                    LJJIIJZLJL();
                    return;
                }
            } else if (c737030Svd == null) {
                return;
            }
            if (c737030Svd.LIZ != 54 || (interfaceC1392640mLO = this.LLILZIL) == null || (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) == null || awemeLJJLIIIJJIZ.getCollectStatus() != 1) {
                return;
            }
            this.LLLIL = "fav_video";
            if (this.LLLILZJ == -1) {
                this.LLLILZJ = System.currentTimeMillis() - this.LLLILZ;
            }
            LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC713230RyL
    public final void LJ(C2344009Gk c2344009Gk, Function1<? super Boolean, Unit> function1) {
        InterfaceC1392640mLO interfaceC1392640mLO;
        boolean z;
        String str;
        if (!C0OBG.LIZIZ(this) && (interfaceC1392640mLO = this.LLILZIL) != null) {
            String strLLIIJI = interfaceC1392640mLO.LLIIJI();
            if (!C123100dR.LIZ(strLLIIJI) || strLLIIJI == null) {
                strLLIIJI = "video_anchor";
            }
            if (LJJII()) {
                if (LJJII() && this.LLLIIL) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            String str2 = "click";
            C1189060h32.LJJIFFI(c2344009Gk2, "anchor_interact_method", "click");
            String str3 = "";
            if (!this.LLLF) {
                str = "";
            } else {
                str = "click_book_button";
            }
            C1189060h32.LJIJJLI(c2344009Gk2, "button_type", str);
            EnumC1188920h2o anchorNavigateTarget = null;
            C1189060h32.LJJIFFI(c2344009Gk2, "anchor_show", C13LP.LJJLIIIJ(this.LLL, " | ", null, null, 0, null, null, 62));
            if (z) {
                long j = this.LLLILZJ;
                if (j != -1 && this.LLLILZ != 0) {
                    c2344009Gk2.LIZLLL(j, "expand_duration");
                }
                if (C123100dR.LIZ(this.LLLIL)) {
                    c2344009Gk2.LJFF("expand_type", this.LLLIL);
                }
            }
            c2344009Gk2.LJII(getAndClearJsbClickParams());
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ();
            String strCf = interfaceC1392640mLO.Cf();
            String strLJIJI = LJIJI();
            if (strLJIJI == null) {
                strLJIJI = "";
            }
            LLJJJJ(awemeLJJLIIIJJIZ, strLLIIJI, strCf, null, false, z, strLJIJI, c2344009Gk2, new AwS597S0100000_18(this, 692));
            PoiDataStruct poiDataStruct = interfaceC1392640mLO.LJJLIIIJJIZ().getPoiDataStruct();
            if (poiDataStruct != null) {
                anchorNavigateTarget = poiDataStruct.getAnchorNavigateTarget(false);
            }
            Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
            Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO.LJJLIIIJJIZ();
            String strCf2 = interfaceC1392640mLO.Cf();
            String strLJIJI2 = LJIJI();
            if (strLJIJI2 != null) {
                str3 = strLJIJI2;
            }
            if (this.LLJ) {
                str2 = "slide";
            }
            if (anchorNavigateTarget == null) {
                anchorNavigateTarget = EnumC1188920h2o.DEFAULT;
            }
            LLLLIIL(activityLIZIZ, this, awemeLJJLIIIJJIZ2, strLLIIJI, strCf2, null, z, null, str3, str2, false, anchorNavigateTarget, null, new AwS597S0100000_18(this, 693));
            this.LLLF = false;
        }
    }

    public static String LJIILLIIL(float f, Paint paint, String str) {
        if (paint == null || f <= 0.0f || paint.measureText(str) <= f) {
            return str;
        }
        float fMeasureText = paint.measureText("…");
        float f2 = f - fMeasureText;
        if (f2 <= 0.0f) {
            return "…";
        }
        int length = str.length();
        int length2 = str.length();
        int i = 1;
        while (i <= length2) {
            int i2 = (i + length2) / 2;
            if (paint.measureText(str.substring(0, i2)) <= f2) {
                i = i2 + 1;
                length = i2;
            } else {
                length2 = i2 - 1;
            }
        }
        if (length >= 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.substring(0, length));
            sbLIZ.append("…");
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (paint.measureText(str.substring(0, 1)) + fMeasureText > f) {
            return "…";
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str.substring(0, 1));
        sbLIZ2.append("…");
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJIJJLI(boolean z, long j, Integer num) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(j, "cost");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "error_code");
        }
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        Map<String, String> map = c2344009Gk.LIZ;
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("search_anchor_card_perf_event", map, null);
    }

    public final void LJJIIZ(PoiAnchorCardSecondLineCarousel poiAnchorCardSecondLineCarousel, SmartImageView smartImageView, LinearLayout linearLayout) {
        boolean z;
        String str = poiAnchorCardSecondLineCarousel.iconTux;
        int i = 0;
        if ((str == null || str.length() == 0) && 1 != 0) {
            C786410Ut5.LLFF(8, smartImageView);
        } else {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
            C786410Ut5.LLFF(0, smartImageView);
        }
        C786410Ut5.LJJJJJL(linearLayout);
        List<PoiAnchorCardCarouselLabel> list = poiAnchorCardSecondLineCarousel.labels;
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            for (PoiAnchorCardCarouselLabel poiAnchorCardCarouselLabel : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    TuxTextView tuxTextViewLJIILJJIL = LJIILJJIL(poiAnchorCardCarouselLabel);
                    if (i2 == list.size() - 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C786410Ut5.R6(tuxTextViewLJIILJJIL, new LinearLayout.LayoutParams(0, -2, 1.0f));
                        tuxTextViewLJIILJJIL.setEllipsize(TextUtils.TruncateAt.END);
                        tuxTextViewLJIILJJIL.setMaxLines(1);
                    } else {
                        C786410Ut5.R6(tuxTextViewLJIILJJIL, new LinearLayout.LayoutParams(-2, -2));
                    }
                    linearLayout.addView(tuxTextViewLJIILJJIL);
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (poiAnchorCardSecondLineCarousel.labels == null || !(!r0.isEmpty())) {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayout);
    }

    @Override // X.C0O2O
    public final void Wz(String str, boolean z, EnumC612200Nzm enumC612200Nzm) throws JSONException {
        String aid;
        Aweme awemeLJJLIIIJJIZ;
        if (LJJII() && z && enumC612200Nzm == EnumC612200Nzm.MUTATION) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LLILZIL;
            if (interfaceC1392640mLO != null && (awemeLJJLIIIJJIZ = interfaceC1392640mLO.LJJLIIIJJIZ()) != null) {
                aid = awemeLJJLIIIJJIZ.getAid();
            } else {
                aid = null;
            }
            if (Intrinsics.LJFF(str, aid)) {
                this.LLLIL = "fav_video";
                if (this.LLLILZJ == -1) {
                    this.LLLILZJ = System.currentTimeMillis() - this.LLLILZ;
                }
                LJJIIJZLJL();
            }
        }
    }

    @Override // X.InterfaceC612260Nzs
    public final void xt(String str, Boolean bool, EnumC612200Nzm enumC612200Nzm) throws JSONException {
        Wz(str, bool.booleanValue(), enumC612200Nzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:330:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    @Override // X.InterfaceC713230RyL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r12, X.InterfaceC1392640mLO r13, int r14, kotlin.jvm.functions.Function0 r15) {
        /*
            Method dump skipped, instruction units count: 1223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1196900hFg.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct, X.0mLO, int, kotlin.jvm.functions.Function0):void");
    }
}
