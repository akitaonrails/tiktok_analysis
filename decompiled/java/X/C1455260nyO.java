package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS0S0720000_22;
import Y.ARunnableS122S0100000_22;
import Y.ARunnableS91S0200000_22;
import Y.AfS191S0100000_22;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.h0;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.crash.Npth;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEVEOperationEventManager;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.publish.PublishPreviewModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForEditPage;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.topic.trendingtopic.IVideoTrendingTopicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS557S0100000_13;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS59S0310000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import rlf.a;
import v7.o;

/* JADX INFO: renamed from: X.0nyO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_creation_edit")
public final class C1455260nyO extends AbstractC1453750nvx implements InterfaceC384890F7f, InterfaceC379610EuV {
    public static final C356610DyV A;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] B;
    public final C1DRG LLJJ;
    public final C1664750tQH LLJJI;
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 438));
    public final boolean LLJJIJI;
    public final C1453870nw9<EnumC1453860nw8> LLJJIJIIJIL;
    public final C1453870nw9<EnumC1453850nw7> LLJJIJIL;
    public final C385680FAg<EnumC1453860nw8, EnumC1453850nw7> LLJJJ;
    public boolean LLJJJIL;
    public C1462070o9N LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public InterfaceC1460000o62 LLJJL;
    public final h0<InterfaceC1460000o62> LLJJLIIIJLLLLLLLZ;
    public InterfaceC1455840nzK LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public InterfaceC1455720nz8 LLJLL;
    public InterfaceC1455730nz9 LLJLLIL;
    public final C01GW LLJLLL;
    public InterfaceC1456070nzh LLJZ;
    public final C01GW LLJZIJLIL;
    public InterfaceC1455500nym LLL;
    public final C01GW LLLF;
    public InterfaceC1453620nvk LLLFF;
    public InterfaceC1451320ns2 LLLFFI;
    public VideoPublishEditModel LLLFZ;
    public boolean LLLI;
    public boolean LLLII;
    public InterfaceC1453200nv4 LLLIIII;
    public InterfaceC1415760mwg LLLIIIIL;
    public C1DRG LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public InterfaceC1461350o8D LLLIZZ;
    public final C01GW LLLJ;
    public final C1664750tQH LLLJIL;
    public InterfaceC1455590nyv LLLJL;
    public InterfaceC1457250o1b LLLL;
    public final C01GW LLLLII;
    public InterfaceC1418580n1E LLLLIIIILLL;
    public InterfaceC1456910o13 LLLLIIL;
    public InterfaceC1454950nxt LLLLIILL;
    public final C01GW LLLLIILLL;
    public InterfaceC1419190n2D LLLLIL;
    public final C01GW LLLLILI;
    public InterfaceC1456080nzi LLLLJ;
    public final C01GW LLLLJI;
    public InterfaceC1453420nvQ LLLLL;
    public final C01GW LLLLLIL;
    public InterfaceC1452510ntx LLLLLILLIL;
    public InterfaceC377540ErA LLLLLJIL;
    public C0EYP LLLLLJLJLL;
    public InterfaceC1455620nyy LLLLLL;
    public final C01GW LLLLLLIL;
    public C0EPM LLLLLLJ;
    public final C01GW LLLLLLL;
    public InterfaceC2180241AUk LLLLLLLLL;
    public final C01GW LLLLLLLLLL;
    public final C01GW LLLLLLLZIL;
    public final C01GW LLLLLLZ;
    public InterfaceC1431860nMe LLLLLLZZ;
    public final C01GW LLLLLZ;
    public final C01GW LLLLLZIL;
    public final C1664740tQG LLLLLZL;
    public final C1664750tQH LLLLZ;
    public final C1664750tQH LLLLZI;
    public InterfaceC1455680nz4 LLLLZIL;
    public InterfaceC1460680o78 LLLLZLL;
    public InterfaceC1456730o0l LLLLZLLIL;
    public C0MFO LLLLZLLLI;
    public C19740512Lj LLLZ;
    public C1439740nZM LLLZI;
    public InterfaceC1444130ngR LLLZIIL;
    public ProgressDialogC1399790mWv LLLZIL;
    public Dialog LLLZL;
    public View LLLZLL;
    public C1649540t1k LLLZLZ;
    public InterfaceC1453610nvj LLLZZ;
    public C1439810nZT LLLZZIL;
    public InterfaceC1418610n1H LLZ;
    public final List<RunnableC1432010nMt> LLZIL;
    public final LinkedBlockingQueue<Runnable> LLZILL;
    public final C01GW LLZL;
    public boolean LLZLI;
    public boolean LLZLL;
    public boolean LLZLLIL;
    public long LLZLLLL;
    public long LLZZ;
    public boolean LLZZJLIL;
    public boolean LLZZLLIL;
    public boolean LLZZZIL;
    public boolean LLZZZZ;
    public final C11NJ a;
    public InterfaceC19530111b1 b;
    public final C01GW c;
    public final C054G d;
    public final C054G e;
    public final C01GW f;
    public final C01GW g;
    public C364440EQo h;
    public final h0<C364440EQo> i;
    public final C1455830nzJ j;
    public final C0EN4 k;
    public InterfaceC1455360nyY l;
    public final h0<InterfaceC1455360nyY> m;
    public Boolean n;
    public C0MER o;
    public final C1455420nye p;
    public NLEVEOperationEventManager q;
    public C1455510nyn r;
    public boolean s;
    public final C01GW t;
    public final C01GW u;
    public final AwS566S0100000_22 v;
    public final C1455330nyV w;
    public final C1456270o01 x;
    public final Map<String, String> y;
    public final C01GW z;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1455260nyO.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C13LE.LIZ.getClass();
        B = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1455260nyO.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C1455260nyO.class, "dmEditPrePublishApi", "getDmEditPrePublishApi()Lcom/ss/android/ugc/aweme/social/preload/DMEditPrePublishApi;", 0), new C2217381BqS(C1455260nyO.class, "editPrePublishApi", "getEditPrePublishApi()Lcom/ss/android/ugc/gamora/editor/preload/EditPrePublishApi;", 0), new C2217381BqS(C1455260nyO.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0)};
        A = new C356610DyV();
    }

    @Override // X.InterfaceC384890F7f
    public final InterfaceC1444130ngR LLJIJIL() {
        InterfaceC1444130ngR interfaceC1444130ngR = this.LLLZIIL;
        if (interfaceC1444130ngR == null) {
            return null;
        }
        return interfaceC1444130ngR;
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLIIIILLL() {
        InterfaceC1457600o2A interfaceC1457600o2A = (InterfaceC1457600o2A) this.LLJLIL.getValue();
        if (interfaceC1457600o2A != null) {
            interfaceC1457600o2A.rZ();
        }
    }

    @Override // X.AbstractC1453750nvx
    public final C1DRG LLLLLILLIL() {
        if (this.LLZLI) {
            return C1664600tQ2.LJ(this).LJFF();
        }
        return null;
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLLL() {
        InterfaceC1419190n2D interfaceC1419190n2D = this.LLLLIL;
        if (interfaceC1419190n2D != null) {
            interfaceC1419190n2D.fb2();
        }
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLLLZ() {
        return findSceneByTag("EditStickerScene") != null;
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLZZ() {
        AbstractC856710XjB next;
        AbstractC856750XjF abstractC856750XjF = (AbstractC856750XjF) this.t.getValue();
        abstractC856750XjF.getClass();
        C201955140j.LIZ("audioCopyrightDetectInEdit -> back from publish page: updateDetectResultFromModel");
        HashMap<Integer, PreCheckResultModel> detectResults = abstractC856750XjF.LJI().creativeModel.audioCopyrightDetectModel.getDetectResults();
        if (detectResults != null) {
            for (Map.Entry<Integer, PreCheckResultModel> entry : detectResults.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                PreCheckResultModel value = entry.getValue();
                Iterator<AbstractC856710XjB> it2 = abstractC856750XjF.LJ().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LIZ() == iIntValue) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AbstractC856710XjB abstractC856710XjB = next;
                if (abstractC856710XjB != null && value != null && value.hasShowResult) {
                    abstractC856710XjB.LIZ = null;
                }
            }
        }
    }

    public final void LLLZLL() {
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel.getAutoEnhanceOn()) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            if (videoPublishEditModel2.creativeModel.editVideoEnhanceModel.useHdrV2) {
                InterfaceC1453620nvk interfaceC1453620nvk = this.LLLFF;
                if (interfaceC1453620nvk != null) {
                    VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
                    interfaceC1453620nvk.Vw0((videoPublishEditModel3 != null ? videoPublishEditModel3 : null).getAutoEnhanceOn(), true);
                } else {
                    C1DRG c1drgLJFF = C1664600tQ2.LJ(this).LJFF();
                    if (c1drgLJFF != null) {
                        ((C0ETY) c1drgLJFF.LJII(C0ETY.class, null)).Sd(InterfaceC1453620nvk.class, new AwS601S0100000_22(this, 311));
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (X.C365940EWi.LIZLLL(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1455500nym LLZL() {
        /*
            r1 = this;
            X.0nym r0 = r1.LLL
            if (r0 != 0) goto L1c
            boolean r0 = r1.LLJJIJI
            if (r0 != 0) goto L13
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LLLFZ
            if (r0 != 0) goto Ld
            r0 = 0
        Ld:
            boolean r0 = X.C365940EWi.LIZLLL(r0)
            if (r0 == 0) goto L1c
        L13:
            X.01GW r0 = r1.LLLF
            java.lang.Object r0 = r0.getValue()
            X.0nym r0 = (X.InterfaceC1455500nym) r0
            return r0
        L1c:
            X.0nym r0 = r1.LLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLZL():X.0nym");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
    
        if (X.C365940EWi.LIZLLL(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC2180241AUk LLZLI() {
        /*
            r1 = this;
            X.1AUk r0 = r1.LLLLLLLLL
            if (r0 != 0) goto L1c
            boolean r0 = r1.LLJJIJI
            if (r0 != 0) goto L13
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LLLFZ
            if (r0 != 0) goto Ld
            r0 = 0
        Ld:
            boolean r0 = X.C365940EWi.LIZLLL(r0)
            if (r0 == 0) goto L1c
        L13:
            X.01GW r0 = r1.LLLLLLLLLL
            java.lang.Object r0 = r0.getValue()
            X.1AUk r0 = (X.InterfaceC2180241AUk) r0
            return r0
        L1c:
            X.1AUk r0 = r1.LLLLLLLLL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLZLI():X.1AUk");
    }

    public final InterfaceC1451520nsM LLZLL() {
        return (InterfaceC1451520nsM) this.LLLLZ.getValue(this, B[3]);
    }

    public final InterfaceC1446740nke LLZLLIL() {
        return (InterfaceC1446740nke) this.LLLJIL.getValue(this, B[1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (X.C365940EWi.LIZLLL(r0) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1461350o8D LLZLLLL() {
        /*
            r1 = this;
            X.0o8D r0 = r1.LLLIZZ
            if (r0 != 0) goto L20
            com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1$Config r0 = com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1.LIZ()
            boolean r0 = r0.enableLazySafeComponent
            if (r0 != 0) goto L17
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r1.LLLFZ
            if (r0 != 0) goto L11
            r0 = 0
        L11:
            boolean r0 = X.C365940EWi.LIZLLL(r0)
            if (r0 == 0) goto L20
        L17:
            X.01GW r0 = r1.LLLJ
            java.lang.Object r0 = r0.getValue()
            X.0o8D r0 = (X.InterfaceC1461350o8D) r0
            return r0
        L20:
            X.0o8D r0 = r1.LLLIZZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLZLLLL():X.0o8D");
    }

    public final InterfaceC1460000o62 c() {
        return (InterfaceC1460000o62) this.LLJJJJLIIL.getValue();
    }

    public final C364440EQo f() {
        C364440EQo c364440EQoLLLZIL;
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (!C289250BVj.LIZ(videoPublishEditModel)) {
            return this.h;
        }
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            C364440EQo c364440EQoLIZJ = this.i.LIZJ();
            return c364440EQoLIZJ == null ? new C364440EQo() : c364440EQoLIZJ;
        }
        C0EPM c0epm = (C0EPM) this.LLLLLLL.getValue();
        return (c0epm == null || (c364440EQoLLLZIL = c0epm.LLLZIL()) == null) ? this.h : c364440EQoLLLZIL;
    }

    public final AbstractC214814194y g() {
        return (AbstractC214814194y) this.LLLLZI.getValue(this, B[4]);
    }

    @Override // X.AbstractC1453750nvx
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final C1462070o9N LLLLLJIL() {
        C1DRG c1drgLJFF;
        C1462070o9N c1462070o9N = this.LLJJJJ;
        if (c1462070o9N != null) {
            return c1462070o9N;
        }
        if ((getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED && ((Boolean) C273860AoK.LIZ.getValue()).booleanValue()) || (c1drgLJFF = C1664600tQ2.LJ(this).LJFF()) == null || ((C0ETY) c1drgLJFF.LJII(C0ETY.class, null)).MY1(InterfaceC1461350o8D.class) == null) {
            return null;
        }
        C1462070o9N c1462070o9N2 = (C1462070o9N) findSceneByTag("EditStickerScene");
        this.LLJJJJ = c1462070o9N2;
        return c1462070o9N2;
    }

    public final void l() {
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C565160MEo.LIZIZ(videoPublishEditModel)) {
            C19740512Lj c19740512Lj = this.LLLZ;
            if (c19740512Lj == null) {
                c19740512Lj = null;
            }
            c19740512Lj.LIZIZ(new GestureInteractItem(99999, new AbstractC21664419qU() { // from class: X.0o64
                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    InterfaceC1460000o62 interfaceC1460000o62C;
                    if (!C1460090o6B.LIZ() && (interfaceC1460000o62C = this.LL.c()) != null) {
                        interfaceC1460000o62C.fl(new C1460160o6I());
                        return false;
                    }
                    return false;
                }
            }));
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        if (C1428470nHB.LLIIIJ(videoPublishEditModel2)) {
            C1446250njr c1446250njr = C1446250njr.LIZ;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1446250njr.getClass();
            C1446250njr.LIZIZ = jElapsedRealtime;
            C19740512Lj c19740512Lj2 = this.LLLZ;
            (c19740512Lj2 != null ? c19740512Lj2 : null).LIZIZ(new GestureInteractItem(100, new AbstractC21664419qU() { // from class: X.0nyb
                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    C1462070o9N c1462070o9NLLLLLJIL;
                    C1462070o9N c1462070o9NLLLLLJIL2;
                    C196925122x c196925122xLLLLLLZ;
                    C122Q c122q;
                    if (motionEvent != null && motionEvent.getEventTime() - motionEvent.getDownTime() < 500) {
                        C1455260nyO c1455260nyO = this.LL;
                        VideoPublishEditModel videoPublishEditModel3 = c1455260nyO.LLLFZ;
                        if (videoPublishEditModel3 == null || !C1428470nHB.LLIIIJ(videoPublishEditModel3) || (((c1462070o9NLLLLLJIL = c1455260nyO.LLLLLJIL()) != null && C12WG.LIZIZ(c1462070o9NLLLLLJIL)) || ((c1462070o9NLLLLLJIL2 = c1455260nyO.LLLLLJIL()) != null && c1462070o9NLLLLLJIL2.LLLLZLL()))) {
                            return true;
                        }
                        VideoPublishEditModel videoPublishEditModel4 = c1455260nyO.LLLFZ;
                        if (videoPublishEditModel4 == null) {
                            videoPublishEditModel4 = null;
                        }
                        if (!u4.LJIILIIL(videoPublishEditModel4)) {
                            C1462070o9N c1462070o9NLLLLLJIL3 = c1455260nyO.LLLLLJIL();
                            if (c1462070o9NLLLLLJIL3 != null && (c196925122xLLLLLLZ = c1462070o9NLLLLLJIL3.LLLLLLZ()) != null) {
                                C1462070o9N c1462070o9NLLLLLJIL4 = c1455260nyO.LLLLLJIL();
                                if (c1462070o9NLLLLLJIL4 != null && (c122q = c1462070o9NLLLLLJIL4.LLLLLJLJLL) != null) {
                                    c122q.Zn1(c196925122xLLLLLLZ);
                                    return true;
                                }
                            } else {
                                C1462070o9N c1462070o9NLLLLLJIL5 = c1455260nyO.LLLLLJIL();
                                if (c1462070o9NLLLLLJIL5 != null) {
                                    C1462070o9N.LLLZLL(c1462070o9NLLLLLJIL5, null, null, 3);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                    return this instanceof C1417630mzh;
                }
            }));
            return;
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        int i = 0;
        if (C306630C0f.LIZ() && C1428470nHB.LJZL(videoPublishEditModel3) && !C1416310mxZ.LJJJJZI(videoPublishEditModel3) && !videoPublishEditModel3.creativeModel.storyModel.isStoryEntrance() && !u4.LJLL(videoPublishEditModel3) && !C1434160nQM.LIZ(videoPublishEditModel3.creativeModel)) {
            C19740512Lj c19740512Lj3 = this.LLLZ;
            (c19740512Lj3 != null ? c19740512Lj3 : null).LIZIZ(new GestureInteractItem(i, new AbstractC21664419qU() { // from class: X.0nxe
                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    boolean z;
                    C1455260nyO c1455260nyO = this.LL;
                    InterfaceC1453420nvQ interfaceC1453420nvQ = c1455260nyO.LLLLL;
                    if (interfaceC1453420nvQ != null && !interfaceC1453420nvQ.A8()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c1455260nyO.LLZZZIL = z;
                    return false;
                }

                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    LiveData<Pair<Boolean, Boolean>> liveDataX8;
                    Pair<Boolean, Boolean> value;
                    C1455260nyO c1455260nyO = this.LL;
                    if (c1455260nyO.LLLFZ != null && C306630C0f.LIZ()) {
                        VideoPublishEditModel videoPublishEditModel4 = c1455260nyO.LLLFZ;
                        if (videoPublishEditModel4 == null) {
                            videoPublishEditModel4 = null;
                        }
                        if (C1428470nHB.LJZL(videoPublishEditModel4)) {
                            VideoPublishEditModel videoPublishEditModel5 = c1455260nyO.LLLFZ;
                            if (videoPublishEditModel5 == null) {
                                videoPublishEditModel5 = null;
                            }
                            if (!videoPublishEditModel5.creativeModel.storyModel.isStoryEntrance()) {
                                VideoPublishEditModel videoPublishEditModel6 = c1455260nyO.LLLFZ;
                                if (videoPublishEditModel6 == null) {
                                    videoPublishEditModel6 = null;
                                }
                                if (!C1416310mxZ.LJJJJZI(videoPublishEditModel6)) {
                                    VideoPublishEditModel videoPublishEditModel7 = c1455260nyO.LLLFZ;
                                    if (videoPublishEditModel7 == null) {
                                        videoPublishEditModel7 = null;
                                    }
                                    if (!videoPublishEditModel7.isEnterFromDM() || C290580BaC.LIZ()) {
                                        C1462070o9N c1462070o9NLLLLLJIL = c1455260nyO.LLLLLJIL();
                                        if (c1462070o9NLLLLLJIL != null && C12WG.LIZIZ(c1462070o9NLLLLLJIL)) {
                                            return false;
                                        }
                                        C1462070o9N c1462070o9NLLLLLJIL2 = c1455260nyO.LLLLLJIL();
                                        if (c1462070o9NLLLLLJIL2 != null && c1462070o9NLLLLLJIL2.LLLLLZ()) {
                                            return false;
                                        }
                                        C1462070o9N c1462070o9NLLLLLJIL3 = c1455260nyO.LLLLLJIL();
                                        if (c1462070o9NLLLLLJIL3 != null && c1462070o9NLLLLLJIL3.LLLLZLL()) {
                                            return false;
                                        }
                                        InterfaceC1460000o62 interfaceC1460000o62C = c1455260nyO.c();
                                        if ((interfaceC1460000o62C != null && (liveDataX8 = interfaceC1460000o62C.x8()) != null && (value = liveDataX8.getValue()) != null && !value.getFirst().booleanValue()) || !c1455260nyO.LLZZZIL || motionEvent == null || !c1455260nyO.n(motionEvent) || motionEvent.getEventTime() - motionEvent.getDownTime() >= 500) {
                                            return false;
                                        }
                                        C1462070o9N c1462070o9NLLLLLJIL4 = c1455260nyO.LLLLLJIL();
                                        if (c1462070o9NLLLLLJIL4 != null) {
                                            C1462070o9N.LLLZLL(c1462070o9NLLLLLJIL4, null, null, 3);
                                        }
                                        VideoPublishEditModel videoPublishEditModel8 = c1455260nyO.LLLFZ;
                                        if (videoPublishEditModel8 == null) {
                                            videoPublishEditModel8 = null;
                                        }
                                        u4.LJJLIIIIJ(videoPublishEditModel8, "tap_anywhere", 0, null, null, null, null, null, null, null, 1016);
                                        return true;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
            }));
            return;
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        if (C1428520nHG.LJIL(videoPublishEditModel4)) {
            C19740512Lj c19740512Lj4 = this.LLLZ;
            if (c19740512Lj4 == null) {
                c19740512Lj4 = null;
            }
            c19740512Lj4.LIZIZ(new GestureInteractItem(i, new AbstractC21664419qU() { // from class: X.0nxf
                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                    InterfaceC1460000o62 interfaceC1460000o62C;
                    LiveData<Pair<Boolean, Boolean>> liveDataX8;
                    Pair<Boolean, Boolean> value;
                    C1462070o9N c1462070o9NLLLLLJIL = this.LL.LLLLLJIL();
                    boolean zLLLLLZ = false;
                    if (c1462070o9NLLLLLJIL != null && C12WG.LIZIZ(c1462070o9NLLLLLJIL)) {
                        return false;
                    }
                    if (this.LL.findSceneByTag("EditStickerScene") != null) {
                        C1462070o9N c1462070o9NLLLLLJIL2 = this.LL.LLLLLJIL();
                        if (c1462070o9NLLLLLJIL2 != null) {
                            zLLLLLZ = c1462070o9NLLLLLJIL2.LLLLLZ();
                            if (!zLLLLLZ) {
                            }
                        } else {
                            zLLLLLZ = false;
                        }
                        if (motionEvent != null) {
                            C1455260nyO c1455260nyO = this.LL;
                            VideoPublishEditModel videoPublishEditModel5 = c1455260nyO.LLLFZ;
                            VideoPublishEditModel videoPublishEditModel6 = null;
                            if (videoPublishEditModel5 == null) {
                                videoPublishEditModel5 = null;
                            }
                            if (C1428520nHG.LJIL(videoPublishEditModel5) && !((Boolean) c1455260nyO.g.getValue()).booleanValue() && (((interfaceC1460000o62C = c1455260nyO.c()) == null || (liveDataX8 = interfaceC1460000o62C.x8()) == null || (value = liveDataX8.getValue()) == null || value.getFirst().booleanValue()) && c1455260nyO.s && c1455260nyO.n(motionEvent))) {
                                VideoPublishEditModel videoPublishEditModel7 = this.LL.LLLFZ;
                                if (videoPublishEditModel7 != null) {
                                    videoPublishEditModel6 = videoPublishEditModel7;
                                }
                                if (!C1416310mxZ.LJJJJZI(videoPublishEditModel6) && motionEvent.getEventTime() - motionEvent.getDownTime() < 500) {
                                    this.LL.LLLZI("tap_anywhere");
                                    return zLLLLLZ;
                                }
                            }
                        }
                    }
                    return zLLLLLZ;
                }
            }));
            C19740512Lj c19740512Lj5 = this.LLLZ;
            (c19740512Lj5 != null ? c19740512Lj5 : null).LIZIZ(new GestureInteractItem(10001, new AbstractC21664419qU() { // from class: X.0nxg
                @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
                    InterfaceC1453420nvQ interfaceC1453420nvQ;
                    C1455260nyO c1455260nyO = this.LL;
                    InterfaceC1460000o62 interfaceC1460000o62C = c1455260nyO.c();
                    boolean z = true;
                    if ((interfaceC1460000o62C != null && interfaceC1460000o62C.fi1()) || ((interfaceC1453420nvQ = this.LL.LLLLL) != null && interfaceC1453420nvQ.A8())) {
                        z = false;
                    }
                    c1455260nyO.s = z;
                    return this instanceof C1417630mzh;
                }
            }));
        }
    }

    public final void r() {
        InterfaceC1452170ntP value;
        p("click_edit_effect_entrance");
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        videoPublishEditModel.creativeModel.effectEntrancePosition = "edit_page_panel";
        InterfaceC1460000o62 interfaceC1460000o62C = c();
        if (interfaceC1460000o62C != null) {
            boolean zOz1 = interfaceC1460000o62C.Oz1();
            VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            C1402610mbT.LJJI(videoPublishEditModel2, zOz1, false);
        }
        InterfaceC1455500nym interfaceC1455500nymLLZL = LLZL();
        if (interfaceC1455500nymLLZL != null) {
            interfaceC1455500nymLLZL.show();
        }
        C1456140nzo.LIZIZ(LLZLLIL(), false, false, false, false, 12);
        LLZLLIL().HV(false);
        C1459710o5Z.LIZ("effect");
        InterfaceC1460000o62 interfaceC1460000o62C2 = c();
        if (interfaceC1460000o62C2 != null) {
            interfaceC1460000o62C2.bo();
        }
        if (C0BVH.LIZ()) {
            VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
            if ((videoPublishEditModel3 != null ? videoPublishEditModel3 : null).videoFps(true) >= C0BM4.LIZ() || (value = LLZLLIL().g().getValue()) == null) {
                return;
            }
            value.setPreviewFps(C0BM4.LIZ(), true);
        }
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLJ() {
        C1DRG c1drgLJIIIZ;
        InterfaceC379580EuS interfaceC379580EuS;
        if (C301600Bry.LIZ()) {
            InterfaceC1455360nyY interfaceC1455360nyYT = t();
            if (interfaceC1455360nyYT != null) {
                interfaceC1455360nyYT.xC();
                return;
            }
            return;
        }
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL == null || (c1drgLJIIIZ = C1664600tQ2.LJIIIZ(c1462070o9NLLLLLJIL)) == null || (interfaceC379580EuS = (InterfaceC379580EuS) c1drgLJIIIZ.LJIIL(null, InterfaceC379580EuS.class)) == null) {
            return;
        }
        interfaceC379580EuS.m4();
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLJI() {
        if (C301600Bry.LIZ()) {
            InterfaceC1455360nyY interfaceC1455360nyYT = t();
            if (interfaceC1455360nyYT != null) {
                interfaceC1455360nyYT.YB0();
                return;
            }
            return;
        }
        a aVar = a.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        aVar.LIZJ(videoPublishEditModel, "save_local");
        InterfaceC1439070nYH publishService = C0CHQ.LIZ().getPublishService();
        VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
        if (publishService.LJJLIIIJJIZ(videoPublishEditModel2 != null ? videoPublishEditModel2 : null, true)) {
            LLLLILI(new Runnable() { // from class: X.0nzp
                @Override // java.lang.Runnable
                public final void run() {
                    C1C7U.LIZ("EditRootScene@37d3.editSaveLocal$1");
                    C1C7U.LIZIZ("EditRootScene@37d3.editSaveLocal$1");
                }
            }, new ARunnableS91S0200000_22(this, publishService, 17));
        }
    }

    public final void LLLZ() {
        if (C301600Bry.LIZIZ()) {
            InterfaceC1455360nyY interfaceC1455360nyYT = t();
            if (interfaceC1455360nyYT != null) {
                interfaceC1455360nyYT.uN();
                return;
            }
            return;
        }
        InterfaceC1419190n2D interfaceC1419190n2D = this.LLLLIL;
        if (interfaceC1419190n2D != null) {
            interfaceC1419190n2D.uV0();
        }
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C1428520nHG.LJJLIL(videoPublishEditModel)) {
            VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            if (videoPublishEditModel2.getAILivePhotoModel().LJII()) {
                C564860MDk.LJ(getSceneContext(), "effect", new AwS566S0100000_22(this, 450));
                return;
            }
        }
        VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        if (!C1428520nHG.LJJLIL(videoPublishEditModel3) || this.LLLLLJLJLL == null) {
            r();
            return;
        }
        C363500EMy.LIZ.getClass();
        C363500EMy.LJIIIZ = true;
        LLLLZLLLI(this, true, 2);
        VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        videoPublishEditModel4.creativeModel.effectEntrancePosition = "editor_pro_panel";
        InterfaceC1460000o62 interfaceC1460000o62C = c();
        if (interfaceC1460000o62C != null) {
            boolean zOz1 = interfaceC1460000o62C.Oz1();
            VideoPublishEditModel videoPublishEditModel5 = this.LLLFZ;
            C1402610mbT.LJJI(videoPublishEditModel5 != null ? videoPublishEditModel5 : null, zOz1, true);
        }
    }

    public final InterfaceC1457250o1b LLZIL() {
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            return (InterfaceC1457250o1b) this.LLLLII.getValue();
        }
        if (this.LLLL == null) {
            VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            if (C365940EWi.LIZLLL(videoPublishEditModel)) {
                return (InterfaceC1457250o1b) this.LLLLII.getValue();
            }
        }
        return this.LLLL;
    }

    public final InterfaceC1452170ntP d() {
        return LLZLLIL().g().getValue();
    }

    public final C348100Dkm e() {
        InterfaceC1452170ntP interfaceC1452170ntPD = d();
        if (interfaceC1452170ntPD instanceof C1463670oBx) {
            return ((C1463670oBx) interfaceC1452170ntPD).LIZLLL();
        }
        return null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        Iterator it2 = ((ArrayList) this.LLZIL).iterator();
        while (it2.hasNext()) {
            ((RunnableC1432010nMt) it2.next()).LIZ();
        }
        this.LLZILL.clear();
        EventBus.LIZLLL().LJJI(this);
        this.LLZLI = false;
        InterfaceC1456910o13 interfaceC1456910o13 = this.LLLLIIL;
        if (interfaceC1456910o13 != null) {
            interfaceC1456910o13.n80();
        }
        C1403010mc7.LIZ.getMusicService().al();
        if (!C0FQX.LIZIZ) {
            C2275708vr.LIZ();
        }
        C366400EYc.LIZ.getClass();
        this.a.dispose();
        C0CHQ.LIZ().getPublishService().LJJIIJ(this.v);
        C2296808zG.LIZJ(this.d, null);
        C1414150mu5.LIZIZ.clear();
        C1414150mu5.LIZ = null;
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (C365940EWi.LIZLLL(videoPublishEditModel)) {
            ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        }
        C1453180nv2.LIZ = 0;
        C1453180nv2.LIZIZ = 0;
        C0CHQ.LIZ().LJJIIJ().destroy();
        C365730EVn.LIZ.LJFF(null);
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        NLEVEOperationEventManager nLEVEOperationEventManager = this.q;
        if (nLEVEOperationEventManager != null) {
            nLEVEOperationEventManager.clearVEOperationListener();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b8  */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0nyn, com.bytedance.ies.nle.editor_jni.NLEVEOperationListener] */
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
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.onResume():void");
    }

    public final InterfaceC1455360nyY t() {
        if (!C301600Bry.LIZLLL()) {
            "EditComponentsToolBarExp should be enabled".toString();
            throw new IllegalArgumentException("EditComponentsToolBarExp should be enabled");
        }
        if (!LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            if (this.l == null) {
                if (this.mViewDestroyed) {
                    throw new IllegalStateException("EditRootScene is destroyed");
                }
                C1DRG c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
                if (c1drg == null) {
                    throw new IllegalStateException("diContainer is null");
                }
                this.l = (InterfaceC1455360nyY) c1drg.LJII(InterfaceC1455360nyY.class, null);
            }
            InterfaceC1455360nyY interfaceC1455360nyY = this.l;
            if (interfaceC1455360nyY != null) {
                return interfaceC1455360nyY;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        InterfaceC1455360nyY interfaceC1455360nyYLIZJ = this.m.LIZJ();
        if (interfaceC1455360nyYLIZJ != null) {
            return interfaceC1455360nyYLIZJ;
        }
        if (this.mViewDestroyed) {
            C365090ETb.LIZIZ();
            C0CHQ.LIZ().getApplicationService().getClass();
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL.toLowerCase(Locale.ROOT), "local_test")) {
                throw new IllegalStateException("EditRootScene is destroyed");
            }
            IllegalStateException illegalStateException = new IllegalStateException("EditRootScene is destroyed");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requireToolbarClickComponent called after scene destroyed (lifecycle: ");
            sbLIZ.append(getLifecycle().getCurrentState());
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("lifecycle", getLifecycle().getCurrentState().toString());
            pairArr[1] = new Pair("sceneState", this.mState.getName());
            VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            pairArr[2] = new Pair("creationId", videoPublishEditModel.getCreationId());
            Npth.reportBizException("EditRootScene", illegalStateException, strLIZIZ, C2097608Jq.LJIIIIZZ(pairArr));
            return null;
        }
        if (this.LLJJJIL) {
            C1DRG c1drg2 = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(this)).LLJJI;
            if (c1drg2 == null) {
                throw new IllegalStateException("diContainer is null");
            }
            InterfaceC1455360nyY interfaceC1455360nyY2 = (InterfaceC1455360nyY) c1drg2.LJII(InterfaceC1455360nyY.class, null);
            this.l = interfaceC1455360nyY2;
            this.m.LJII(interfaceC1455360nyY2);
            return interfaceC1455360nyY2;
        }
        C0CHQ.LIZ().getApplicationService().getClass();
        C844470XAv.LIZ.getClass();
        if (TextUtils.equals(C844470XAv.LJIILL.toLowerCase(Locale.ROOT), "local_test")) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("EditToolBarClickCallbacksApi not ready before first frame (lifecycle: ");
            sbLIZ2.append(getLifecycle().getCurrentState());
            sbLIZ2.append(')');
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("EditToolBarClickCallbacksApi not ready before first frame");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EditToolBarClickCallbacksApi not ready before first frame (lifecycle: ");
        sbLIZ3.append(getLifecycle().getCurrentState());
        sbLIZ3.append(')');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        Pair[] pairArr2 = new Pair[3];
        pairArr2[0] = new Pair("lifecycle", getLifecycle().getCurrentState().toString());
        pairArr2[1] = new Pair("sceneState", this.mState.getName());
        VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        pairArr2[2] = new Pair("creationId", videoPublishEditModel2.getCreationId());
        Npth.reportBizException("EditRootScene", illegalStateException2, strLIZIZ2, C2097608Jq.LJIIIIZZ(pairArr2));
        return null;
    }

    public final void x() {
        if (C301600Bry.LIZIZ()) {
            throw new IllegalArgumentException("Use EditToolBarClickCallbacksComponent instead");
        }
        InterfaceC1456070nzh interfaceC1456070nzh = (InterfaceC1456070nzh) this.LLJZIJLIL.getValue();
        if (interfaceC1456070nzh != null) {
            interfaceC1456070nzh.c4();
        }
        C1456140nzo.LIZIZ(LLZLLIL(), false, false, false, false, 12);
        C1459710o5Z.LIZ("voice");
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        C1402610mbT.LJIL(videoPublishEditModel);
    }

    @Override // X.AbstractC1453750nvx
    public final Map<String, String> LLLLL() {
        return this.y;
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLLJLJLL() {
        return this.LLZLLIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJ;
    }

    /* JADX WARN: Type inference failed for: r0v100, types: [X.0o01] */
    /* JADX WARN: Type inference failed for: r0v99, types: [X.0nyV] */
    public C1455260nyO(C1DRG c1drg) {
        boolean z;
        this.LLJJ = c1drg;
        this.LLJJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableMergeEPLazy && LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = new C1453870nw9<>();
        this.LLJJIJIL = new C1453870nw9<>();
        this.LLJJJ = new C385680FAg<>();
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 692));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 690));
        this.LLJJLIIIJLLLLLLLZ = new h0<>(null);
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 541));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 550));
        this.LLJLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 456));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 436));
        this.LLLF = C452501pT.LIZIZ(new AwS566S0100000_22(this, 539));
        this.LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 189));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 542));
        this.LLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 457));
        this.LLLILZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 549));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 462));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 664));
        this.LLLJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 662));
        this.LLLJIL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLLLII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 461));
        this.LLLLIILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 437));
        this.LLLLILI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 612));
        this.LLLLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 553));
        this.LLLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 660));
        this.LLLLLLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 792));
        this.LLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 610));
        this.LLLLLLLLLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 554));
        this.LLLLLLLZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 611));
        this.LLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 691));
        this.LLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 537));
        this.LLLLLZIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 551));
        this.LLLLLZL = C1664770tQJ.LIZIZ(c1drg, InterfaceC1449590npF.class, null);
        this.LLLLZ = C1664770tQJ.LIZ(c1drg, InterfaceC1451520nsM.class, null);
        this.LLLLZI = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        this.LLZIL = new ArrayList();
        this.LLZILL = new LinkedBlockingQueue<>();
        this.LLZL = C452501pT.LIZIZ(new AwS557S0100000_13(this, 133));
        this.LLZZLLIL = true;
        this.LLZZZIL = true;
        this.a = new C11NJ();
        this.c = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(209));
        this.d = C2296808zG.LIZ(C0PEM.LIZJ);
        this.e = C2296808zG.LIZIZ();
        this.f = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(206));
        this.g = C452501pT.LIZIZ(new AwS566S0100000_22(this, 708));
        this.h = new C364440EQo();
        this.i = new h0<>(new C364440EQo());
        this.j = new C1455830nzJ();
        this.k = new C0EN4();
        this.m = new h0<>(null);
        this.p = new C1455420nye(this);
        this.s = true;
        this.t = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1176));
        this.u = C452501pT.LIZIZ(new AwS566S0100000_22(this, 787));
        this.v = new AwS566S0100000_22(this, 791);
        this.w = new InterfaceC1462140o9U() { // from class: X.0nyV
            @Override // X.InterfaceC1462140o9U
            public final LiveData<Integer> LIZ() {
                InterfaceC1460000o62 interfaceC1460000o62C = this.LIZ.c();
                if (interfaceC1460000o62C != null) {
                    return interfaceC1460000o62C.ww();
                }
                return null;
            }

            @Override // X.InterfaceC1462140o9U
            public final C364440EQo LIZIZ() {
                return this.LIZ.f();
            }

            @Override // X.InterfaceC1462140o9U
            public final InterfaceC19672111xv LIZJ() {
                return this.LIZ.x;
            }

            @Override // X.InterfaceC1462140o9U
            public final void LIZLLL() {
                C1455260nyO c1455260nyO = this.LIZ;
                c1455260nyO.LLLLLIL().Pn().LJ(c1455260nyO, new AObjectS245S0100000_22(c1455260nyO, 172));
            }

            @Override // X.InterfaceC1462140o9U
            public final C385670FAf<InterfaceC1460000o62> LJ() {
                return this.LIZ.LLJJLIIIJLLLLLLLZ;
            }

            @Override // X.InterfaceC1462140o9U
            public final void LJFF() {
                C348100Dkm c348100DkmE;
                INLEMediaSession iNLEMediaSession;
                INLEPlayer playerApi;
                C1455260nyO c1455260nyO = this.LIZ;
                VideoPublishEditModel videoPublishEditModel = c1455260nyO.LLLFZ;
                if (videoPublishEditModel == null) {
                    videoPublishEditModel = null;
                }
                if (!u4.LJIIIIZZ(videoPublishEditModel) || (c348100DkmE = c1455260nyO.e()) == null || (iNLEMediaSession = c348100DkmE.LIZIZ) == null || (playerApi = iNLEMediaSession.getPlayerApi()) == null) {
                    return;
                }
                c1455260nyO.u(((int) playerApi.getDuration()) / LSPassThroughRecordSizeConfig.DEFAULT, true);
            }

            @Override // X.InterfaceC1462140o9U
            public final void LJII() {
                InterfaceC1460000o62 interfaceC1460000o62C = this.LIZ.c();
                if (interfaceC1460000o62C != null) {
                    interfaceC1460000o62C.Ws(1);
                }
            }

            @Override // X.InterfaceC1462140o9U
            public final Scene LJIIIIZZ() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1462140o9U
            public final AbstractC1664510tPt LJI(C1DRG c1drg2, C1462090o9P c1462090o9P) {
                return new C1460260o6S(c1462090o9P, c1drg2);
            }
        };
        this.x = new InterfaceC19672111xv() { // from class: X.0o01
            @Override // X.InterfaceC19672111xv
            public final Bitmap LIZ(VideoPublishEditModel videoPublishEditModel) {
                return null;
            }

            @Override // X.InterfaceC19672111xv
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC19672111xv
            public final View LIZJ() {
                return null;
            }

            @Override // X.InterfaceC19672111xv
            public final Rect LIZLLL() {
                return null;
            }
        };
        this.y = new LinkedHashMap();
        this.z = C452501pT.LIZIZ(new AwS549S0100000_5(this, 155));
    }

    public static void p(String str) {
        C1653260t7k.LIZ(str);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLIL(ARunnableS122S0100000_22 aRunnableS122S0100000_22) {
        q(false, false, aRunnableS122S0100000_22, true);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLL(boolean z) {
        this.LLZLLIL = z;
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLZIL(C1439740nZM c1439740nZM) {
        this.LLLZI = c1439740nZM;
    }

    public final void LLLLLZL(int i) {
        MutableLiveData<Integer> mutableLiveDataPr0;
        SurfaceView value = LLZLLIL().ge().getValue();
        if (value != null) {
            C426750GoL.LJIIIZ(value, 0, Integer.valueOf(i), 0, 0, false, 16);
        }
        InterfaceC1461350o8D interfaceC1461350o8DLLZLLLL = LLZLLLL();
        if (interfaceC1461350o8DLLZLLLL != null && (mutableLiveDataPr0 = interfaceC1461350o8DLLZLLLL.Pr0()) != null) {
            mutableLiveDataPr0.setValue(Integer.valueOf(i));
        }
    }

    public final void LLLLZ(final Function0<Unit> function0) {
        final Activity activity = this.mActivity;
        if (activity == null) {
            return;
        }
        if (C1403010mc7.LIZ.LJ().LJ(activity) == 0) {
            function0.invoke();
        } else {
            if (!(activity instanceof C19EG)) {
                return;
            }
            C19514711Wn.LIZIZ.LIZIZ(activity, TokenCert.Companion.with("bpea-tools_request_record_audio_permission_edit_root_scene")).LIZIZ("android.permission.RECORD_AUDIO").LIZJ(new InterfaceC19515111Wr() { // from class: X.0MG5
                @Override // X.InterfaceC19515111Wr
                public final void onCanceled() {
                }

                @Override // X.InterfaceC19515111Wr
                public final void LIZ(C0HWO... c0hwoArr) {
                    C348100Dkm c348100DkmLIZIZ;
                    INLEMediaSession iNLEMediaSession;
                    INLEPlayer playerApi;
                    if (c0hwoArr.length != 0 && c0hwoArr[0].LIZ()) {
                        function0.invoke();
                        return;
                    }
                    Activity activity2 = activity;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131829829);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(activity2, 3080, creativeToastBuilder);
                    Bundle bundle = this.g().mArguments;
                    if (bundle != null && bundle.containsKey("switch_mode_hide_intermediate")) {
                        this.LLZLLIL().rh0(false);
                    }
                    InterfaceC1452170ntP value = this.LLZLLIL().g().getValue();
                    if (value != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null && (iNLEMediaSession = c348100DkmLIZIZ.LIZIZ) != null && (playerApi = iNLEMediaSession.getPlayerApi()) != null) {
                        playerApi.play();
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1456220nzw LLLLZLL(boolean r11) {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LLLFZ
            r3 = 0
            if (r0 != 0) goto L6
            r0 = r3
        L6:
            boolean r8 = X.C1428520nHG.LJJJJLI(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LLLFZ
            if (r0 != 0) goto Lf
            r0 = r3
        Lf:
            boolean r9 = X.C1428520nHG.LJJJJJL(r0)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LLLFZ
            if (r0 != 0) goto L18
            r0 = r3
        L18:
            boolean r0 = r0.hasRecord()
            r4 = 0
            if (r0 == 0) goto Lbc
            X.0nke r0 = r10.LLZLLIL()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto L35
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = X.C352130DrH.LIZ(r0)
            if (r0 != 0) goto L3a
        L35:
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = new com.bytedance.ies.nle.editor_jni.NLEModel
            r0.<init>()
        L3a:
            boolean r0 = X.C346900Diq.LIZ(r0)
            if (r0 != 0) goto Lbc
            r5 = 1
        L41:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r10.LLLFZ
            if (r0 != 0) goto L46
            r0 = r3
        L46:
            boolean r6 = r0.isTimeEffectApply()
            X.0nke r0 = r10.LLZLLIL()
            androidx.lifecycle.LiveData r0 = r0.g()
            java.lang.Object r0 = r0.getValue()
            X.0ntP r0 = (X.InterfaceC1452170ntP) r0
            if (r0 == 0) goto Lba
            X.0oBx r0 = (X.C1463670oBx) r0
            com.bytedance.ies.nle.editor_jni.NLEModel r0 = r0.LIZJ()
            boolean r1 = X.C348930Dm7.LJFF(r0)
        L64:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = r10.LLLFZ
            if (r2 != 0) goto Lb8
            r0 = r3
        L69:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.VoiceConversionModel r0 = r0.voiceConversionModel
            boolean r0 = r0.hasDubVoiceConversion
            if (r0 != 0) goto Lb6
            if (r2 != 0) goto Lb4
            r0 = r3
        L74:
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.VoiceConversionModel r0 = r0.voiceConversionModel
            boolean r0 = r0.hasOriginVoiceConversion
            if (r0 != 0) goto Lb6
            if (r1 != 0) goto Lb6
            r1 = 0
        L7f:
            if (r2 == 0) goto L82
            r3 = r2
        L82:
            com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam r0 = r3.getVeAudioEffectParam()
            if (r0 == 0) goto La4
            if (r1 != 0) goto La4
            if (r8 != 0) goto L8e
            if (r9 != 0) goto Lb2
        L8e:
            r7 = 1
        L8f:
            if (r11 == 0) goto L98
            r4 = r6
        L92:
            X.0nzw r3 = new X.0nzw
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L98:
            if (r6 != 0) goto La2
            if (r5 != 0) goto La2
            if (r7 != 0) goto La2
            if (r8 != 0) goto La2
            if (r9 == 0) goto L92
        La2:
            r4 = 1
            goto L92
        La4:
            r0 = 0
            if (r8 != 0) goto L8e
            if (r0 != 0) goto L8e
            if (r1 == 0) goto Lb2
            boolean r0 = X.C301760BsE.LIZ()
            if (r0 != 0) goto Lb2
            goto L8e
        Lb2:
            r7 = 0
            goto L8f
        Lb4:
            r0 = r2
            goto L74
        Lb6:
            r1 = 1
            goto L7f
        Lb8:
            r0 = r2
            goto L69
        Lba:
            r1 = 0
            goto L64
        Lbc:
            r5 = 0
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLLZLL(boolean):X.0nzw");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLZLLIL(boolean r39) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLLZLLIL(boolean):void");
    }

    public final void LLLZI(String str) {
        InterfaceC1461660o8i interfaceC1461660o8iLLLLLLLLL;
        if (C301600Bry.LIZIZ()) {
            InterfaceC1455360nyY interfaceC1455360nyYT = t();
            if (interfaceC1455360nyYT != null) {
                interfaceC1455360nyYT.KV(str, null);
                return;
            }
            return;
        }
        p("click_edit_text_entrance");
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL != null && (interfaceC1461660o8iLLLLLLLLL = c1462070o9NLLLLLJIL.LLLLLLLLL()) != null && interfaceC1461660o8iLLLLLLLLL.lK1()) {
            return;
        }
        C1462070o9N c1462070o9NLLLLLJIL2 = LLLLLJIL();
        if (c1462070o9NLLLLLJIL2 != null) {
            C1462070o9N.LLLZLL(c1462070o9NLLLLLJIL2, null, null, 3);
        }
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        u4.LJJLIIIIJ(videoPublishEditModel, str, 0, null, null, null, null, null, null, null, 1016);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZLZ(kotlin.jvm.functions.Function0<kotlin.Unit> r6) {
        /*
            r5 = this;
            X.0n2D r0 = r5.LLLLIL
            if (r0 == 0) goto L47
            r4 = 1
            r0.ET(r4, r6)
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLFZ
            r3 = 0
            if (r0 != 0) goto Le
            r0 = r3
        Le:
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLFZ
            if (r0 != 0) goto L19
            r0 = r3
        L19:
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            java.util.List<com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData> r0 = r0.segmentDataList
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLFZ
            if (r0 != 0) goto L26
            r0 = r3
        L26:
            com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData r0 = r0.getCurMultiEditVideoRecordData()
            java.util.List<com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData> r0 = r0.segmentDataList
            int r0 = r0.size()
            if (r0 != r4) goto L48
        L32:
            X.0oB9 r2 = X.AbstractC1463010oAt.LLLII
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r5.LLLFZ
            if (r0 == 0) goto L39
            r3 = r0
        L39:
            kotlin.jvm.internal.AwS108S0110000_22 r1 = new kotlin.jvm.internal.AwS108S0110000_22
            r0 = 7
            r1.<init>(r5, r4, r0)
            r2.getClass()
            java.lang.String r0 = "click_video_trim"
            X.C1463170oB9.LIZIZ(r3, r0, r1)
        L47:
            return
        L48:
            r4 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLZLZ(kotlin.jvm.functions.Function0):void");
    }

    public final void LLLZZ(Function0<Unit> function0) {
        C0EZ1 c0ez1;
        C0EZ2 c0ez2Og1;
        InterfaceC364330EQd interfaceC364330EQd;
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        VideoPublishEditModel videoPublishEditModel = null;
        if (c1462070o9NLLLLLJIL != null && (c0ez1 = (C0EZ1) c1462070o9NLLLLLJIL.LLLJ.getValue()) != null && (c0ez2Og1 = c0ez1.Og1()) != null) {
            C1462070o9N c1462070o9NLLLLLJIL2 = LLLLLJIL();
            if (c1462070o9NLLLLLJIL2 != null) {
                interfaceC364330EQd = (InterfaceC364330EQd) c1462070o9NLLLLLJIL2.LLLJ.getValue();
            } else {
                interfaceC364330EQd = null;
            }
            VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
            if (videoPublishEditModel2 != null) {
                videoPublishEditModel = videoPublishEditModel2;
            }
            c0ez2Og1.pZ0(this, interfaceC364330EQd, videoPublishEditModel, function0);
            return;
        }
        function0.invoke();
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0101, code lost:
    
        r7.stickers.add(r10);
     */
    @Override // X.InterfaceC384890F7f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel r10) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLZILL(com.ss.android.ugc.aweme.editSticker.model.StickerItemModel):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x03dd A[PHI: r0
      0x03dd: PHI (r0v95 X.0o0l) = (r0v94 X.0o0l), (r0v98 X.0o0l), (r0v101 X.0o0l) binds: [B:281:0x03e4, B:273:0x03cb, B:278:0x03db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x04fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r13) {
        /*
            Method dump skipped, instruction units count: 1578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.i(int):void");
    }

    public final Bitmap j(Bitmap bitmap) {
        List<StickerItemModel> list;
        List<StickerItemModel> list2;
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel.getInfoStickerModel() != null) {
            VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            InfoStickerModel infoStickerModel = videoPublishEditModel3.getInfoStickerModel();
            if (infoStickerModel != null && (list = infoStickerModel.stickers) != null && !list.isEmpty()) {
                VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
                if (videoPublishEditModel4 != null) {
                    videoPublishEditModel2 = videoPublishEditModel4;
                }
                InfoStickerModel infoStickerModel2 = videoPublishEditModel2.getInfoStickerModel();
                if (infoStickerModel2 != null && (list2 = infoStickerModel2.stickers) != null) {
                    for (StickerItemModel stickerItemModel : list2) {
                        if (stickerItemModel.type == 2) {
                            Bitmap bitmapLIZIZ = C097U.LIZIZ(bitmap.getWidth(), bitmap.getHeight(), stickerItemModel.path);
                            bitmap = C2475009mu.LIZLLL(bitmap, bitmapLIZIZ);
                            C2475009mu.LJ(bitmapLIZIZ);
                        }
                    }
                }
            }
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(X.InterfaceC1461350o8D r6) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.k(X.0o8D):void");
    }

    public final boolean n(MotionEvent motionEvent) {
        RectF rectFLIZLLL = C1428310nGv.LIZLLL(this.LLLZLZ);
        rectFLIZLLL.top += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        rectFLIZLLL.bottom -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        if (C444960Hcc.LIZIZ()) {
            rectFLIZLLL.left += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        } else {
            rectFLIZLLL.right -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(110));
        }
        return rectFLIZLLL.contains(motionEvent.getRawX(), motionEvent.getRawY());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0872  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x089e  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x08ca  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x090c  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x094e  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09bc  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a03  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0a2f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0a5b  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0a7d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0201  */
    @Override // com.bytedance.scene.Scene
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityCreated(android.os.Bundle r19) {
        /*
            Method dump skipped, instruction units count: 2725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.onActivityCreated(android.os.Bundle):void");
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lgo.a.LIZIZ.editService().onCreate();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onServerRenderingEvent(C356880Dyw c356880Dyw) {
        LLLZ();
        EventBus.LIZLLL().LJJI(this);
    }

    public static final void m(C1455260nyO c1455260nyO, InterfaceC1461350o8D interfaceC1461350o8D) {
        C122Q c122q;
        C560530Lyd<Unit> c560530LydQz1;
        C122Q c122q2;
        LiveData<TextStickerData> liveDataD9;
        C385670FAf<C529150Kp7> c385670FAfZn;
        c1455260nyO.LLLIZZ = interfaceC1461350o8D;
        interfaceC1461350o8D.Pn().observe(c1455260nyO, new AObserverS225S0100000_22(c1455260nyO, 67));
        InterfaceC1455680nz4 interfaceC1455680nz4 = c1455260nyO.LLLLZIL;
        if (interfaceC1455680nz4 != null && (c385670FAfZn = interfaceC1455680nz4.Zn()) != null) {
            c385670FAfZn.LIZ(c1455260nyO, new AObjectS305S0200000_22(c1455260nyO, interfaceC1461350o8D, 12));
        }
        C1462070o9N c1462070o9NLLLLLJIL = c1455260nyO.LLLLLJIL();
        if (c1462070o9NLLLLLJIL != null && (c122q2 = c1462070o9NLLLLLJIL.LLLLLJLJLL) != null && (liveDataD9 = c122q2.D9()) != null) {
            liveDataD9.observe(c1455260nyO, new AObserverS225S0100000_22(c1455260nyO, 68));
        }
        C1462070o9N c1462070o9NLLLLLJIL2 = c1455260nyO.LLLLLJIL();
        if (c1462070o9NLLLLLJIL2 != null && (c122q = c1462070o9NLLLLLJIL2.LLLLLJLJLL) != null && (c560530LydQz1 = c122q.qz1()) != null) {
            c560530LydQz1.LIZ(c1455260nyO, new AObjectS245S0100000_22(c1455260nyO, 117));
        }
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLIILL(String str, Function0<Unit> function0) {
        p("click_edit_captions_entrance");
        InterfaceC1461350o8D interfaceC1461350o8DLLZLLLL = LLZLLLL();
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        NLEModel nLEModelLIZ = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        Activity activityRequireActivity = requireActivity();
        InterfaceC1455500nym interfaceC1455500nymLLZL = LLZL();
        InterfaceC1456910o13 interfaceC1456910o13 = this.LLLLIIL;
        InterfaceC1460000o62 interfaceC1460000o62C = c();
        InterfaceC1446740nke interfaceC1446740nkeLLZLLIL = LLZLLIL();
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        C364440EQo c364440EQoF = f();
        C1462130o9T c1462130o9T = new C1462130o9T(this);
        C0EYP c0eyp = this.LLLLLJLJLL;
        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 451);
        C0EPM c0epm = (C0EPM) this.LLLLLLL.getValue();
        AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(this, 452);
        InterfaceC1452170ntP value = LLZLLIL().g().getValue();
        if (value != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        }
        return new C1455430nyf(interfaceC1461350o8DLLZLLLL, videoPublishEditModel, activityRequireActivity, this, interfaceC1455500nymLLZL, interfaceC1456910o13, interfaceC1460000o62C, interfaceC1446740nkeLLZLLIL, c1462070o9NLLLLLJIL, c364440EQoF, c1462130o9T, c0eyp, awS566S0100000_22, c0epm, awS566S0100000_222, nLEModelLIZ).LIZ(str, function0);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLILI(Runnable runnable, Runnable runnable2) {
        LLLZZ(new AwS266S0300000_22(this, runnable, runnable2, 15));
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLLLL(Effect effect, CustomStickerInfo customStickerInfo) {
        LLZLLIL().vW1().setValue(C1452730nuJ.LIZLLL(0L));
        C1455830nzJ c1455830nzJ = this.j;
        c1455830nzJ.LIZ.LJIIJ(new C1456640o0c(effect, customStickerInfo));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LLLLLZ(boolean z, final C1456350o09 c1456350o09) {
        C1455340nyW c1455340nyWLIZJ = C0CHQ.LIZ().getPublishService().LJIIJ().LIZJ();
        ArrayList arrayList = new ArrayList();
        C0MH8 c0mh8 = C0MH8.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        c0mh8.getClass();
        c0mh8.LIZ(videoPublishEditModel, new CoverNewItem(C0MH8.LJIIIIZZ(videoPublishEditModel2), c1456350o09.LIZ, 2, null, 0L, Boolean.TRUE, 0 == true ? 1 : 0, 88, 0 == true ? 1 : 0), false);
        final AwS59S0310000_22 awS59S0310000_22 = new AwS59S0310000_22(c1455340nyWLIZJ, this, arrayList, z, 4);
        VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        C1456230nzx c1456230nzx = new C1456230nzx(videoPublishEditModel3);
        InterfaceC1452170ntP interfaceC1452170ntPD = d();
        C1457050o1H c1457050o1H = c1456230nzx.LIZ;
        c1457050o1H.LJIIIIZZ = interfaceC1452170ntPD;
        c1457050o1H.LIZIZ = c1456350o09.LIZ;
        c1457050o1H.LJFF = c1456350o09.LIZIZ;
        VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        int iLJIIIIZZ = C0MH8.LJIIIIZZ(videoPublishEditModel4);
        C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
        c1457050o1H2.LIZLLL = iLJIIIIZZ;
        c1457050o1H2.LJIIJJI = c1456350o09.LIZJ;
        c1457050o1H2.LJIIL = c1456350o09.LIZLLL;
        c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0nz6
            @Override // X.InterfaceC1457180o1U
            public final void onError(int i, String str) {
                C2354709Kn.LJIJJLI(c1456350o09.LIZ);
                awS59S0310000_22.invoke();
                C201955140j.LJ(str);
            }
        };
        AwS59S0310000_22 awS59S0310000_222 = new AwS59S0310000_22(c1455340nyWLIZJ, this, arrayList, z, 3);
        C1457050o1H c1457050o1H3 = c1456230nzx.LIZ;
        c1457050o1H3.LJ = awS59S0310000_222;
        c1457050o1H3.LIZJ = new C0MBV() { // from class: X.0nzl
            @Override // X.C0MBV
            public final void LIZLLL() {
                awS59S0310000_22.invoke();
            }
        };
        AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 310);
        C1457050o1H c1457050o1H4 = c1456230nzx.LIZ;
        c1457050o1H4.LJIIIZ = awS601S0100000_22;
        C1457060o1I.LIZIZ(c1457050o1H4);
    }

    public final C15O7 o(Runnable runnable, boolean z) {
        C15O7<Unit> c15o7P82;
        InterfaceC1455760nzC interfaceC1455760nzC = (InterfaceC1455760nzC) this.LLLILZLLLI.getValue();
        if (interfaceC1455760nzC == null || (c15o7P82 = interfaceC1455760nzC.p82(runnable, true, z)) == null) {
            return C15O7.LJIIJ(Unit.LIZ);
        }
        return c15o7P82;
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1456130nzn.LIZ();
    }

    public final void u(int i, boolean z) {
        InterfaceC1455720nz8 interfaceC1455720nz8;
        InterfaceC1461350o8D interfaceC1461350o8DLLZLLLL;
        InterfaceC1455500nym interfaceC1455500nymLLZL = LLZL();
        if (interfaceC1455500nymLLZL != null) {
            interfaceC1455500nymLLZL.Tj(i);
            interfaceC1455500nymLLZL.Qh();
            interfaceC1455500nymLLZL.aH(true);
            interfaceC1455500nymLLZL.LLLL(i);
        }
        InterfaceC1452170ntP interfaceC1452170ntPD = d();
        if (interfaceC1452170ntPD != null) {
            InterfaceC1461350o8D interfaceC1461350o8DLLZLLLL2 = LLZLLLL();
            if (interfaceC1461350o8DLLZLLLL2 != null) {
                interfaceC1461350o8DLLZLLLL2.l0(new Pair<>(Integer.valueOf(interfaceC1452170ntPD.mo51if()), Integer.valueOf(i)));
            }
            if (z && (interfaceC1461350o8DLLZLLLL = LLZLLLL()) != null) {
                interfaceC1461350o8DLLZLLLL.v1(i, true);
            }
            InterfaceC1461350o8D interfaceC1461350o8DLLZLLLL3 = LLZLLLL();
            if (interfaceC1461350o8DLLZLLLL3 != null) {
                interfaceC1461350o8DLLZLLLL3.u1();
            }
        }
        if (this.LLJJIJI) {
            interfaceC1455720nz8 = (InterfaceC1455720nz8) this.LLJLILLLLZIIL.getValue();
        } else {
            interfaceC1455720nz8 = this.LLJLL;
        }
        if (interfaceC1455720nz8 != null) {
            interfaceC1455720nz8.SS1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLLZLLLI(X.C1455260nyO r13, boolean r14, int r15) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLLZLLLI(X.0nyO, boolean, int):void");
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLL(ARunnableS122S0100000_22 aRunnableS122S0100000_22, boolean z, boolean z2) {
        boolean z3;
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2;
        lgo.a.LIZIZ.LIZIZ().LIZ(C1453590nvh.LIZIZ);
        if (((Number) C296210BjH.LIZ.getValue()).intValue() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        VideoPublishEditModel videoPublishEditModel3 = null;
        if (z3) {
            C112C c112c = C112C.LIZ;
            VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
            c112c.getClass();
            C112C.LJI(videoPublishEditModel4, c1462070o9NLLLLLJIL);
        } else if (C0BUA.LIZ()) {
            if (C0BKM.LIZ()) {
                C112C c112c2 = C112C.LIZ;
                VideoPublishEditModel videoPublishEditModel5 = this.LLLFZ;
                if (videoPublishEditModel5 == null) {
                    videoPublishEditModel5 = null;
                }
                C1462070o9N c1462070o9NLLLLLJIL2 = LLLLLJIL();
                c112c2.getClass();
                C112C.LJIILIIL = C112C.LIZJ(videoPublishEditModel5, c1462070o9NLLLLLJIL2);
                C112C.LIZIZ();
            } else {
                C112C c112c3 = C112C.LIZ;
                VideoPublishEditModel videoPublishEditModel6 = this.LLLFZ;
                if (videoPublishEditModel6 == null) {
                    videoPublishEditModel6 = null;
                }
                C1462070o9N c1462070o9NLLLLLJIL3 = LLLLLJIL();
                c112c3.getClass();
                C112C.LIZ(videoPublishEditModel6, c1462070o9NLLLLLJIL3);
            }
        }
        VideoPublishEditModel videoPublishEditModel7 = this.LLLFZ;
        if (videoPublishEditModel7 == null) {
            videoPublishEditModel = null;
        } else {
            videoPublishEditModel = videoPublishEditModel7;
        }
        if (videoPublishEditModel.creativeModel.imageEditModel.isVideoChildPageFromImage) {
            if (videoPublishEditModel7 == null) {
                videoPublishEditModel2 = null;
            } else {
                videoPublishEditModel2 = videoPublishEditModel7;
            }
            videoPublishEditModel2.creativeModel.imageEditModel.isVideoChildPageFromImage = false;
        }
        C1411910mqT c1411910mqT = C1411910mqT.LIZ;
        if (videoPublishEditModel7 != null) {
            videoPublishEditModel3 = videoPublishEditModel7;
        }
        c1411910mqT.getClass();
        C1411910mqT.LIZIZ(videoPublishEditModel3);
        LLLLLLJ(aRunnableS122S0100000_22, null, z, z2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLZIIL(final boolean r22, final java.lang.Runnable r23, final java.lang.Runnable r24) {
        /*
            Method dump skipped, instruction units count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLZIIL(boolean, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override // X.AbstractC1453750nvx, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int iLIZIZ;
        j jVar = C524780Ki4.LIZ;
        jVar.step("av_video_edit", "begin EditRootScene:onCreateView");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ViewGroup viewGroup2 = (ViewGroup) ((ILayoutPreloadServiceForEditPage) ServiceManager.get().getService(ILayoutPreloadServiceForEditPage.class)).loadLayoutFiles("scene_edit_root", getSceneContext(), layoutInflater, R.layout.eor, viewGroup, false);
        if (C293350Bef.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
        } else {
            iLIZIZ = 0;
        }
        this.LLLZ = C1451800nso.LIZ(viewGroup.getContext(), (ViewGroup) viewGroup2.findViewById(R.id.gpu), iLIZIZ, 8);
        C365090ETb.LIZIZ();
        if (C0L2Z.LIZ()) {
            View viewFindViewById = viewGroup2.findViewById(R.id.gqv);
            if (viewFindViewById != null) {
                new C20576115fL((ViewStub) viewFindViewById).LIZIZ(new AwS552S0100000_8(this, 620), new AwS566S0100000_22(this, 453));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLLZLL = viewGroup2.findViewById(R.id.gss);
        this.LLLZLZ = (C1649540t1k) viewGroup2.findViewById(R.id.gre);
        this.LLZLLLL = SystemClock.elapsedRealtime() - jElapsedRealtime;
        jVar.step("av_video_edit", "end EditRootScene:onCreateView");
        if (!C0CHQ.LIZ().getAccountService().LIZ() && C0CHQ.LIZ().getAccountService().isLogin() && (((IVideoTrendingTopicService) this.c.getValue()).LIZJ() || ((IVideoTrendingTopicService) this.c.getValue()).LIZIZ())) {
            this.a.LIZ(((IVideoTrendingTopicService) this.c.getValue()).LIZ().LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS191S0100000_22(this, 31), new C09JN() { // from class: X.05Pn
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("EditRootScene@37d3.getVideoTrendingTopicStatus$2");
                    C2344809Gs.LJI((Throwable) obj);
                    C1C7U.LIZIZ("EditRootScene@37d3.getVideoTrendingTopicStatus$2");
                }
            }));
        }
        return viewGroup2;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(android.content.Intent r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.s(android.content.Intent, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(boolean r14, final boolean r15, java.lang.Runnable r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.q(boolean, boolean, java.lang.Runnable, boolean):void");
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLJ(Runnable runnable, Runnable runnable2, boolean z, boolean z2, boolean z3) {
        VideoPublishEditModel videoPublishEditModel;
        C122Q c122q;
        C1462070o9N c1462070o9NLLLLLJIL = LLLLLJIL();
        if (c1462070o9NLLLLLJIL != null && (c122q = c1462070o9NLLLLLJIL.LLLLLJLJLL) != null) {
            c122q.Mj0();
        }
        InterfaceC1456910o13 interfaceC1456910o13 = this.LLLLIIL;
        if (interfaceC1456910o13 != null) {
            interfaceC1456910o13.Rw();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditRootScene -> nextStepCustom -> captions.Size = ");
        VideoPublishEditModel videoPublishEditModel2 = this.LLLFZ;
        if (videoPublishEditModel2 == null) {
            videoPublishEditModel2 = null;
        }
        sbLIZ.append(C363730ENv.LIZIZ(videoPublishEditModel2));
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1452170ntP value = LLZLLIL().g().getValue();
        if (value != null) {
            VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
            if (videoPublishEditModel3 == null) {
                videoPublishEditModel3 = null;
            }
            videoPublishEditModel3.getPreviewInfo().setPreviewVideoLength(value.getDuration());
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel = null;
        } else {
            videoPublishEditModel = videoPublishEditModel4;
        }
        if (videoPublishEditModel.mIsFromDraft) {
            if (videoPublishEditModel4 == null) {
                videoPublishEditModel4 = null;
            }
            if (videoPublishEditModel4.isDraftMusicIllegal()) {
                VideoPublishEditModel videoPublishEditModel5 = this.LLLFZ;
                if (videoPublishEditModel5 == null) {
                    videoPublishEditModel5 = null;
                }
                if (MusicBeanUtilKt.extractAVMusic(videoPublishEditModel5.creativeModel.musicBuzModel) != null) {
                    VideoPublishEditModel videoPublishEditModel6 = this.LLLFZ;
                    if (videoPublishEditModel6 == null) {
                        videoPublishEditModel6 = null;
                    }
                    videoPublishEditModel6.setDraftMusicIllegal(false);
                }
            }
        }
        if (z3) {
            VideoPublishEditModel videoPublishEditModel7 = this.LLLFZ;
            if (videoPublishEditModel7 == null) {
                videoPublishEditModel7 = null;
            }
            if (!C1428470nHB.LLIIIJ(videoPublishEditModel7)) {
                VideoPublishEditModel videoPublishEditModel8 = this.LLLFZ;
                if (videoPublishEditModel8 == null) {
                    videoPublishEditModel8 = null;
                }
                if (!u4.LJLL(videoPublishEditModel8) && C571300Mau.LIZ()) {
                    LLZLLIL().RF0();
                }
            }
        }
        if (C1463450oBb.LIZ()) {
            LLLZIIL(!z3, runnable, runnable2);
            return;
        }
        VideoPublishEditModel videoPublishEditModel9 = this.LLLFZ;
        if (videoPublishEditModel9 == null) {
            videoPublishEditModel9 = null;
        }
        AwS59S0310000_22 awS59S0310000_22 = new AwS59S0310000_22(this, runnable, runnable2, z3, 6);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C353101Yr(videoPublishEditModel9, null, awS59S0310000_22), 3);
    }

    public final void LLLZIL(boolean z, boolean z2, Runnable runnable, boolean z3, Runnable runnable2) {
        C524780Ki4.LIZ.step("av_video_publish", "begin_compile_sticker");
        InterfaceC1455760nzC interfaceC1455760nzC = (InterfaceC1455760nzC) this.LLLILZLLLI.getValue();
        if (interfaceC1455760nzC != null) {
            interfaceC1455760nzC.Ly0(true, z3, new C860030XoX(this, runnable2, z, z2, runnable));
        }
    }

    public final void v(Runnable runnable, Runnable runnable2, boolean z, boolean z2, boolean z3) {
        if (runnable != null) {
            runnable.run();
            return;
        }
        if (z) {
            VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
            if (videoPublishEditModel == null) {
                videoPublishEditModel = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[saveDraft]: save draft creation id = ");
            sbLIZ.append(videoPublishEditModel.getCreationId());
            C0LSN.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            new C1438570nXT("VEVideoPublishEditActivity");
            AwemeDraft awemeDraftLIZLLL = C1438570nXT.LIZLLL(videoPublishEditModel);
            awemeDraftLIZLLL.lastEditTime = System.currentTimeMillis();
            ((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJII(videoPublishEditModel.getCreationId());
            C0CHQ.LIZ().LJI().LIZIZ().LJFF(new C545640Lac(awemeDraftLIZLLL, new C0M2T(false, "VEVideoPublishEditActivity", null, 3, false, 28)));
            InterfaceC2180241AUk interfaceC2180241AUkLLZLI = LLZLI();
            if (interfaceC2180241AUkLLZLI != null) {
                interfaceC2180241AUkLLZLI.yF0();
                return;
            }
            return;
        }
        C524780Ki4.LIZ.step("av_video_publish", "compile_sticker_done");
        q(z2, z3, runnable2, false);
    }

    public static final void LLZ(o<Unit> oVar, Runnable runnable, C1455260nyO c1455260nyO, boolean z, boolean z2, Runnable runnable2) {
        if (!oVar.LIZ.LJIILJJIL() && !oVar.LIZ.LJIILIIL()) {
            oVar.LIZJ(null);
        }
        if (runnable != null) {
            runnable.run();
        } else {
            c1455260nyO.q(z, z2, runnable2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Object] */
    public final void LLLZZIL(boolean z, boolean z2, Runnable runnable, Runnable runnable2, boolean z3, Runnable runnable3) {
        C259800zU c259800zU = new C259800zU();
        C118300cf c118300cf = new C118300cf();
        VideoPublishEditModel videoPublishEditModel = this.LLLFZ;
        VideoPublishEditModel videoPublishEditModel2 = null;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        c118300cf.element = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
        o oVar = new o();
        VideoPublishEditModel videoPublishEditModel3 = this.LLLFZ;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        Pair<String, Integer> pairLJJIIJZLJL = C1428520nHG.LJJIIJZLJL(videoPublishEditModel3, false, null, true, 2);
        if (pairLJJIIJZLJL != null) {
            c259800zU.element = pairLJJIIJZLJL.getFirst();
            c118300cf.element = pairLJJIIJZLJL.getSecond().intValue();
        }
        VideoPublishEditModel videoPublishEditModel4 = this.LLLFZ;
        if (videoPublishEditModel4 != null) {
            videoPublishEditModel2 = videoPublishEditModel4;
        }
        PublishPreviewModel publishPreviewModel = videoPublishEditModel2.creativeModel.publishPreviewModel;
        String str = (String) c259800zU.element;
        if (str == null) {
            str = "";
        }
        publishPreviewModel.firstFramePath = str;
        LLLZIL(z, z2, runnable, z3, new ARunnableS0S0720000_22(this, c259800zU, c118300cf, runnable3, oVar, runnable2, z, z2, runnable, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLLLZIL(final X.C1455260nyO r25, boolean r26, boolean r27, X.C1456220nzw r28, X.EnumC359990E9l r29, kotlin.jvm.internal.AwS549S0100000_5 r30, int r31) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1455260nyO.LLLLZIL(X.0nyO, boolean, boolean, X.0nzw, X.0E9l, kotlin.jvm.internal.AwS549S0100000_5, int):void");
    }

    public static void w(C1455260nyO c1455260nyO, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, EnumC359990E9l enumC359990E9l, int i) {
        boolean z8;
        boolean z9 = z7;
        boolean z10 = z6;
        boolean z11 = z5;
        boolean z12 = z4;
        EnumC359990E9l enumC359990E9l2 = enumC359990E9l;
        boolean z13 = z3;
        boolean z14 = z2;
        if ((i & 2) != 0) {
            z14 = false;
        }
        if ((i & 4) != 0) {
            z13 = false;
        }
        if ((i & 8) != 0) {
            z12 = false;
        }
        if ((i & 16) != 0) {
            z11 = false;
        }
        if ((i & 32) != 0) {
            z10 = false;
        }
        if ((i & 64) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        if ((i & 128) != 0) {
            z9 = false;
        }
        if ((i & 256) != 0) {
            enumC359990E9l2 = null;
        }
        c1455260nyO.LLLZLL();
        System.currentTimeMillis();
        C0EZH c0ezh = new C0EZH(c1455260nyO.f(), z, z14, z13, z12, false, z8, z9, enumC359990E9l2, false, false, false, null, z11, z10, 15648);
        C0EYP c0eyp = c1455260nyO.LLLLLJLJLL;
        if (c0eyp != null) {
            c0eyp.Dy0(c1455260nyO, c0ezh);
        }
    }
}
