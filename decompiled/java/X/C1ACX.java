package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSupportNewLayoutInFeedSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicFixLiveFeedNotResueSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestFeedPreviewOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharebgFlickOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSharedBgFlickConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkmicRtcRatioOptimizeLivePlayerHelper;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveGameMultiStreamWatch;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerAppBackgroundEventSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveSwapMultiStreamDataSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveOptPreviewCardViewExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveInnerStreamUseSurfaceControlExp;
import com.bytedance.android.livesdk.livesetting.watchlive.player.LiveSmoothExitNotCaptureExp;
import com.bytedance.android.livesdk.workaround.LiveDisableChangeTabTrasView;
import com.bytedance.android.livesdk.workaround.SurfaceViewAndroid10Workaround;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1ACX, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ACX implements C1ACD, InterfaceC485640J2s, LifecycleOwner, ViewModelStoreOwner {
    public static final /* synthetic */ int LLLFF = 0;
    public final InterfaceC2175541ACi LL;
    public final EnumC1913520ztW LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public LiveRoomStruct LLIZ;
    public FrameLayout LLIZLLLIL;
    public String LLJ;
    public long LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public C2175491ACd LLJJ;
    public C1ADP LLJJI;
    public InterfaceC2175841ADm LLJJIII;
    public LiveWidget LLJJIJI;
    public boolean LLJJIJIL;
    public C473250Ih9 LLJJJ;
    public volatile boolean LLJJJIL;
    public Long LLJJJJLIIL;
    public InterfaceC480510Isr LLJLIL;
    public C1699360uK6 LLJLILLLLZIIL;
    public C0IXC LLJLL;
    public InterfaceC2175461ACa LLJLLIL;
    public InterfaceC2175711ACz LLJLLL;
    public InterfaceC2175511ACf LLJZ;
    public boolean LLJZIJLIL;
    public Function1<? super Rect, Unit> LLL;
    public Function1<? super String, Unit> LLLF;
    public int LLJI = -1;
    public final C2175631ACr LLJJIJIIJIL = new C2175631ACr();
    public final AtomicInteger LLJJJJ = new AtomicInteger(0);
    public final AtomicBoolean LLJJJJJIL = new AtomicBoolean(false);
    public final C01GW LLJJL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1483));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(439));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4049));

    @Override // X.C1ACD
    public final void LJJJJJ() {
        LJJJLZIJ("resetInteractPreviewViewOnPause", null, true);
    }

    @Override // X.C1ACD
    public final void bind() {
    }

    @Override // X.C1ACD
    public final void onPause() {
    }

    @Override // X.C1ACD
    public final void s6() {
        this.LLJJIJIL = false;
    }

    @Override // X.C1ACD
    public final C1608290rxD LJIIL() {
        String str;
        C940530aaB c940530aaBLJJIJIIJI;
        InterfaceC2175461ACa interfaceC2175461ACa = this.LLJLLIL;
        if (interfaceC2175461ACa == null || (c940530aaBLJJIJIIJI = interfaceC2175461ACa.LJJIJIIJI(false)) == null || (str = c940530aaBLJJIJIIJI.LIZ) == null) {
            str = "normal";
        }
        InterfaceC2175461ACa interfaceC2175461ACa2 = this.LLJLLIL;
        return new C1608290rxD(str, interfaceC2175461ACa2 != null ? interfaceC2175461ACa2.LJJII() : 0);
    }

    @Override // X.C1ACD
    public final int LJIJJLI() {
        return this.LLJJJJ.get();
    }

    @Override // X.C1ACD
    public final void LJJJJ() {
        this.LLJJJJJIL.set(true);
    }

    public final InterfaceC480510Isr LJJL() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        String str;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        String str2;
        LiveRoomStruct liveRoomStruct3;
        LiveRoomStruct liveRoomStruct4;
        LiveRoomStruct liveRoomStruct5 = this.LLIZ;
        InterfaceC480510Isr interfaceC480510Isr = null;
        Long lValueOf = liveRoomStruct5 != null ? Long.valueOf(liveRoomStruct5.id) : null;
        if (C1AD3.LIZ().enablePrewarm && this.LLJLIL != null && lValueOf != null && lValueOf.longValue() != 0 && !Intrinsics.LJFF(this.LLJJJJLIIL, lValueOf)) {
            C480940ItY.LIZ.getClass();
            if (C480940ItY.LIZIZ.containsKey(lValueOf)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("playController reset stale field for reuse, oldRoomId:");
                sbLIZ.append(this.LLJJJJLIIL);
                sbLIZ.append(" newRoomId:");
                sbLIZ.append(lValueOf);
                C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
                this.LLJLIL = null;
            }
        }
        if (this.LLJLIL == null) {
            InterfaceC2175541ACi interfaceC2175541ACi = this.LL;
            Object objY7 = interfaceC2175541ACi != null ? interfaceC2175541ACi.Y7() : null;
            C1ACA c1aca = objY7 instanceof C1ACA ? (C1ACA) objY7 : null;
            if (C1AD3.LIZ().enablePrewarm) {
                LiveRoomStruct liveRoomStruct6 = this.LLIZ;
                Long lValueOf2 = liveRoomStruct6 != null ? Long.valueOf(liveRoomStruct6.id) : null;
                C480940ItY.LIZ.getClass();
                if (lValueOf2 != null && C480940ItY.LIZIZ.containsKey(lValueOf2)) {
                    long jLongValue = lValueOf2.longValue();
                    C480940ItY.LIZJ.remove(Long.valueOf(jLongValue));
                    C480490Isp c480490IspRemove = C480940ItY.LIZIZ.remove(Long.valueOf(jLongValue));
                    if (c480490IspRemove != null) {
                        interfaceC480510Isr = c480490IspRemove.LL;
                    }
                }
            }
            if (interfaceC480510Isr != null) {
                this.LLILZIL = interfaceC480510Isr.getPlayerTag();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("playController create controller hashTag:");
                sbLIZ2.append(interfaceC480510Isr.hashCode());
                sbLIZ2.append("mPlayerTag:");
                sbLIZ2.append(this.LLILZIL);
                C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ2));
                this.LLJLIL = interfaceC480510Isr;
                LiveRoomStruct liveRoomStruct7 = this.LLIZ;
                this.LLJJJJLIIL = liveRoomStruct7 != null ? Long.valueOf(liveRoomStruct7.id) : null;
                InterfaceC480510Isr interfaceC480510Isr2 = this.LLJLIL;
                if (interfaceC480510Isr2 != null) {
                    LiveRoomStruct liveRoomStruct8 = this.LLIZ;
                    interfaceC480510Isr2.x0(liveRoomStruct8 != null ? liveRoomStruct8.id : 0L);
                }
                if (c1aca != null) {
                    c1aca.LLFF = true;
                    c1aca.LLF = this.LLJJJJ.get();
                    str2 = c1aca.LJJLIIIJ;
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str2, "SELECT")) {
                    if (c1aca != null) {
                        c1aca.LJJLIIIJ = this.LLJJJJ.get() > 0 ? "eta_pulse" : "eta_prewarm";
                    }
                    C1AC7 c1ac7 = C1AC7.LIZ;
                    long j = (c1aca == null || (liveRoomStruct4 = c1aca.LIZJ) == null) ? 0L : liveRoomStruct4.id;
                    int i = this.LLJJJJ.get();
                    c1ac7.getClass();
                    C1AC7.LJIJJ(i, j, true);
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = new Pair("roomId", Long.valueOf((c1aca == null || (liveRoomStruct3 = c1aca.LIZJ) == null) ? 0L : liveRoomStruct3.id));
                    pairArr[1] = new Pair("bindHit", Boolean.TRUE);
                    pairArr[2] = new Pair("pulseCount", Integer.valueOf(this.LLJJJJ.get()));
                    pairArr[3] = new Pair("startPlayReason", c1aca != null ? c1aca.LJJLIIIJ : null);
                    pairArr[4] = new Pair("playerTag", this.LLILZIL);
                    C1AC7.LJIILL("eta_bind_result", pairArr);
                }
                return this.LLJLIL;
            }
            if (TextUtils.equals(c1aca != null ? c1aca.LJJLIIIJ : null, "SELECT") && c1aca != null && c1aca.LLFF) {
                C1AC7 c1ac72 = C1AC7.LIZ;
                long j2 = (c1aca == null || (liveRoomStruct2 = c1aca.LIZJ) == null) ? 0L : liveRoomStruct2.id;
                c1ac72.getClass();
                C1AC7.LJIJJ(0, j2, false);
                Pair[] pairArr2 = new Pair[4];
                pairArr2[0] = new Pair("roomId", Long.valueOf((c1aca == null || (liveRoomStruct = c1aca.LIZJ) == null) ? 0L : liveRoomStruct.id));
                pairArr2[1] = new Pair("bindHit", Boolean.FALSE);
                pairArr2[2] = new Pair("reason", "no_cached_player");
                pairArr2[3] = new Pair("startPlayReason", c1aca != null ? c1aca.LJJLIIIJ : null);
                C1AC7.LJIILL("eta_bind_result", pairArr2);
            }
            LiveRoomStruct liveRoomStruct9 = this.LLIZ;
            if (liveRoomStruct9 != null) {
                C1ACY.LIZ.getClass();
                AtomicBoolean atomicBoolean = C1ACY.LJIILJJIL;
                if (atomicBoolean.get()) {
                    LiveRoomStruct liveRoomStruct10 = C1ACY.LJJIJIL;
                    if (liveRoomStruct10 == null || liveRoomStruct9.id != liveRoomStruct10.id) {
                        C1ACY.LJJIJL = null;
                    } else {
                        InterfaceC480510Isr interfaceC480510Isr3 = C1ACY.LJJIJL;
                        C1ACY.LJJIJL = null;
                        if (interfaceC480510Isr3 != null) {
                            if (atomicBoolean.get()) {
                                LiveRoomStruct liveRoomStruct11 = C1ACY.LJJIJIL;
                                if (liveRoomStruct11 == null || liveRoomStruct9.id != liveRoomStruct11.id) {
                                    C1ACY.LJJIJIL = null;
                                    C1ACY.LJJIJIIJI = null;
                                    str = null;
                                } else {
                                    str = C1ACY.LJJIJIIJI;
                                    C1ACY.LJJIJIIJI = null;
                                }
                            } else {
                                str = null;
                            }
                            this.LLILZIL = str;
                            this.LLJLIL = interfaceC480510Isr3;
                            LiveRoomStruct liveRoomStruct12 = this.LLIZ;
                            this.LLJJJJLIIL = liveRoomStruct12 != null ? Long.valueOf(liveRoomStruct12.id) : null;
                            InterfaceC480510Isr interfaceC480510Isr4 = this.LLJLIL;
                            if (interfaceC480510Isr4 != null) {
                                LiveRoomStruct liveRoomStruct13 = this.LLIZ;
                                interfaceC480510Isr4.x0(liveRoomStruct13 != null ? liveRoomStruct13.id : 0L);
                            }
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("playControllerForColdBoot create controller hashTag:");
                            InterfaceC480510Isr interfaceC480510Isr5 = this.LLJLIL;
                            sbLIZ3.append(interfaceC480510Isr5 != null ? interfaceC480510Isr5.hashCode() : 0);
                            sbLIZ3.append("mPlayerTag:");
                            sbLIZ3.append(this.LLILZIL);
                            C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ3));
                            return this.LLJLIL;
                        }
                    }
                }
            }
            if (this.LLIZ == null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("create controller hashTag:");
                InterfaceC480510Isr interfaceC480510Isr6 = this.LLJLIL;
                sbLIZ4.append(interfaceC480510Isr6 != null ? interfaceC480510Isr6.hashCode() : 0);
                sbLIZ4.append("mPlayerTag: null");
                C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ4));
                return null;
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("preview_");
            LiveRoomStruct liveRoomStruct14 = this.LLIZ;
            sbLIZ5.append(liveRoomStruct14 != null ? Long.valueOf(liveRoomStruct14.id) : null);
            sbLIZ5.append('_');
            sbLIZ5.append(SystemClock.uptimeMillis());
            this.LLILZIL = C2188811AlT.LIZIZ(sbLIZ5);
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            InterfaceC480520Iss interfaceC480520IssLLJJ = (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null) ? null : interfaceC20673515v3K4.LLJJ(this.LLILZIL, true);
            this.LLJLIL = interfaceC480520IssLLJJ instanceof InterfaceC480510Isr ? (InterfaceC480510Isr) interfaceC480520IssLLJJ : null;
            LiveRoomStruct liveRoomStruct15 = this.LLIZ;
            this.LLJJJJLIIL = liveRoomStruct15 != null ? Long.valueOf(liveRoomStruct15.id) : null;
            InterfaceC480510Isr interfaceC480510Isr7 = this.LLJLIL;
            if (interfaceC480510Isr7 != null) {
                LiveRoomStruct liveRoomStruct16 = this.LLIZ;
                interfaceC480510Isr7.x0(liveRoomStruct16 != null ? liveRoomStruct16.id : 0L);
            }
        }
        return this.LLJLIL;
    }

    public final void LJJLIIIJLLLLLLLZ() {
        C1A7J c1a7j;
        C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", "+++++++++++++++++++++ resetPlayer ");
        try {
            InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
            if (interfaceC480510IsrLJJL != null) {
                C2175491ACd c2175491ACd = this.LLJJ;
                Surface surface = null;
                if (!C293620Bf6.LIZ(c2175491ACd != null ? c2175491ACd.LIZ : null) || !(!((Boolean) C285930BIp.LIZ.getValue()).booleanValue())) {
                    C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", "+++++++++++++++++++++ resetPlayer start -1");
                    interfaceC480510IsrLJJL.LJJIIZ();
                    interfaceC480510IsrLJJL.y0(null, null);
                } else {
                    C2175491ACd c2175491ACd2 = this.LLJJ;
                    View view = c2175491ACd2 != null ? c2175491ACd2.LIZ : null;
                    if ((view instanceof C1A7J) && (c1a7j = (C1A7J) view) != null) {
                        surface = c1a7j.getSurface();
                    }
                    interfaceC480510IsrLJJL.E0(this.LLILZIL, surface);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2344809Gs.LJI(e);
        }
    }

    @Override // X.InterfaceC480650It5
    public final boolean LLILLIZIL() {
        InterfaceC2175541ACi interfaceC2175541ACi = this.LL;
        return interfaceC2175541ACi != null && interfaceC2175541ACi.LLILLIZIL();
    }

    @Override // X.InterfaceC485640J2s
    public final void LLLLLLIL() {
        InterfaceC2175541ACi interfaceC2175541ACi = this.LL;
        if (interfaceC2175541ACi != null) {
            interfaceC2175541ACi.LLLLLLIL();
        }
        boolean z = this.LLJJJIL;
        this.LLJJJIL = true;
        if (!LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable() || z) {
            return;
        }
        C486790J7d.LIZJ(new ARunnableS133S0100000_33(this, 105));
    }

    public final Context getContext() {
        FrameLayout frameLayout = this.LLIZLLLIL;
        if (frameLayout != null) {
            return frameLayout.getContext();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return (Lifecycle) this.LLJJL.getValue();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    @Override // X.InterfaceC485640J2s
    public final void o() {
        InterfaceC2175541ACi interfaceC2175541ACi = this.LL;
        if (interfaceC2175541ACi != null) {
            interfaceC2175541ACi.o();
        }
    }

    @Override // X.C1ACD
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append("+++++++++++++++++++++ready to stopStreamData");
        C827750WdZ.LIZJ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL == null || !TextUtils.equals(this.LLILZLL, interfaceC480510IsrLJJL.LJJIZ())) {
            return;
        }
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null) {
            c2175491ACd.LIZ();
        }
        C2175491ACd c2175491ACd2 = this.LLJJ;
        if (c2175491ACd2 != null) {
            c2175491ACd2.LIZLLL(true);
        }
        if (LiveOptPreviewCardViewExp.isEnable()) {
            C2175491ACd c2175491ACd3 = this.LLJJ;
            LJJLIIIJL(this, "stopWithStreamData", c2175491ACd3 != null ? c2175491ACd3.LIZ : null);
        } else {
            C2175491ACd c2175491ACd4 = this.LLJJ;
            LJJLIIIJLJLI(this, "stopWithStreamData", c2175491ACd4 != null ? c2175491ACd4.LIZ : null, null, false, 12);
        }
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        LJJLIIIJLLLLLLLZ();
        LJJLIIIIJ();
        this.LLJJIJIL = false;
    }

    @Override // X.C1ACD
    public final void LIZLLL() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LIZLLL();
        }
    }

    @Override // X.C1ACD
    public final JSONObject LJI() {
        JSONObject jSONObjectLJI;
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        return (interfaceC480510IsrLJJL == null || (jSONObjectLJI = interfaceC480510IsrLJJL.LJI()) == null) ? new JSONObject() : jSONObjectLJI;
    }

    @Override // X.C1ACD
    public final void LJII() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJII();
        }
        this.LLILLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("wangyanaaaaa surfaceControl smooth exit setSmoothExit： ");
        sbLIZ.append(true);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.C1ACD
    public final String LJIIIIZZ() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.LJIIIIZZ();
        }
        return null;
    }

    @Override // X.C1ACD
    public final boolean LJJII() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.isPlaying();
        }
        return false;
    }

    @Override // X.C1ACD
    public final void LJJIJLIJ() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJJJJI(false);
        }
    }

    @Override // X.C1ACD
    public final long LJJIL() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.c0();
        }
        return 0L;
    }

    @Override // X.C1ACD
    public final boolean LJJJI() {
        return !TextUtils.equals(LJJL() != null ? r0.getPlayerTag() : null, this.LLILZIL);
    }

    @Override // X.C1ACD
    public final void LJJJIL() {
        Object c098200Yq;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append("+++++++++++++++++++++ready to pausePrePullStream");
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL == null || !TextUtils.equals(this.LLILZLL, interfaceC480510IsrLJJL.LJJIZ())) {
            return;
        }
        if (this.LLJJJJJIL.getAndSet(false)) {
            this.LLJJJJ.incrementAndGet();
            try {
                interfaceC480510IsrLJJL.t0(this.LLILZIL, "eta_pulse_pause", true);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                interfaceC480510IsrLJJL.stop(this.LLILZIL);
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m1boximpl(c098200Yq);
        } else {
            LJJLIIIIJ();
        }
        LJJIJLIJ();
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null) {
            c2175491ACd.LIZLLL(true);
        }
        this.LLJJIJIL = false;
        interfaceC480510IsrLJJL.n0();
    }

    @Override // X.C1ACD
    public final void LJJJJIZL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append("+++++++++++++++++++++ready to pauseStreamData");
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            if (TextUtils.equals(this.LLILZLL, interfaceC480510IsrLJJL.LJJIZ())) {
                LJJLIIIIJ();
                this.LLJLILLLLZIIL = null;
                this.LLJLL = null;
                LJJLIIIJLLLLLLLZ();
                C2175491ACd c2175491ACd = this.LLJJ;
                if (c2175491ACd != null) {
                    c2175491ACd.LIZ();
                }
                C2175491ACd c2175491ACd2 = this.LLJJ;
                if (c2175491ACd2 != null) {
                    c2175491ACd2.LIZLLL(true);
                }
                if (LiveOptPreviewCardViewExp.isEnable()) {
                    C2175491ACd c2175491ACd3 = this.LLJJ;
                    LJJLIIIJL(this, "pauseWithStreamData", c2175491ACd3 != null ? c2175491ACd3.LIZ : null);
                } else {
                    C2175491ACd c2175491ACd4 = this.LLJJ;
                    LJJLIIIJLJLI(this, "pauseWithStreamData", c2175491ACd4 != null ? c2175491ACd4.LIZ : null, null, false, 12);
                }
                this.LLJJIJIL = false;
            }
        }
    }

    @Override // X.C1ACD
    public final void LJJJJJL() {
        String multiStreamDefaultPreviewQualitySdkKey;
        LiveRoomStruct liveRoomStruct;
        String liveStudioExtraStreamDefaultPreviewQualitySdkKey;
        LiveRoomStruct liveRoomStruct2;
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            TtliveSwapMultiStreamDataSetting ttliveSwapMultiStreamDataSetting = TtliveSwapMultiStreamDataSetting.INSTANCE;
            boolean z = true;
            if (ttliveSwapMultiStreamDataSetting.getValue() && (!ttliveSwapMultiStreamDataSetting.getValue() || ((liveRoomStruct2 = this.LLIZ) != null && !liveRoomStruct2.isMainStreamHorizontal()))) {
                z = false;
            }
            if (!LJJLIIIJ(this.LLIZ) || (liveRoomStruct = this.LLIZ) == null || liveRoomStruct.getLiveStudioExtraStreamDefaultQualitySdkKey() == null || !z) {
                LiveRoomStruct liveRoomStruct3 = this.LLIZ;
                if (liveRoomStruct3 == null || (multiStreamDefaultPreviewQualitySdkKey = liveRoomStruct3.getMultiStreamDefaultPreviewQualitySdkKey()) == null || TextUtils.equals("auto", multiStreamDefaultPreviewQualitySdkKey.toLowerCase(Locale.US))) {
                    return;
                }
                LiveRoomStruct liveRoomStruct4 = this.LLIZ;
                interfaceC480510IsrLJJL.LJJ(liveRoomStruct4 != null ? liveRoomStruct4.getMultiStreamDefaultQualitySdkKey() : null);
                return;
            }
            LiveRoomStruct liveRoomStruct5 = this.LLIZ;
            if (liveRoomStruct5 == null || (liveStudioExtraStreamDefaultPreviewQualitySdkKey = liveRoomStruct5.getLiveStudioExtraStreamDefaultPreviewQualitySdkKey()) == null || TextUtils.equals("auto", liveStudioExtraStreamDefaultPreviewQualitySdkKey.toLowerCase(Locale.US))) {
                return;
            }
            LiveRoomStruct liveRoomStruct6 = this.LLIZ;
            interfaceC480510IsrLJJL.LJJ(liveRoomStruct6 != null ? liveRoomStruct6.getLiveStudioExtraStreamDefaultQualitySdkKey() : null);
        }
    }

    public final void LJJLIIIIJ() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            if (LJJL() != null) {
                if (TextUtils.isEmpty(this.LLILZIL)) {
                    interfaceC480510IsrLJJL.LJJIIZI(getContext());
                } else {
                    interfaceC480510IsrLJJL.stop(this.LLILZIL);
                }
            }
            interfaceC480510IsrLJJL.LJJJJLL(false);
            this.LLILZLL = null;
            this.LLIZ = null;
            this.LLJ = null;
        }
        InterfaceC2175511ACf interfaceC2175511ACf = this.LLJZ;
        if (interfaceC2175511ACf != null) {
            interfaceC2175511ACf.LJII(false);
        }
    }

    @Override // X.C1ACD
    public final void dynamicOpenTextureRender() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.dynamicOpenTextureRender();
        }
    }

    @Override // X.C1ACD
    public final String getCurrentResolution() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.getCurrentResolution();
        }
        return null;
    }

    @Override // X.C1ACD
    public final boolean getIfPreviewUsingPlayer() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.getIfPreviewUsingPlayer();
        }
        return false;
    }

    @Override // X.C1ACD
    public final C1699430uKD getPlayerThreadBlockStatus() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.getPlayerThreadBlockStatus();
        }
        return null;
    }

    @Override // X.C1ACD
    public final View getVideoView() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            return interfaceC480510IsrLJJL.getVideoView();
        }
        return null;
    }

    @Override // X.C1ACD
    public final void onResume() {
        InterfaceC480510Isr interfaceC480510IsrLJJL;
        InterfaceC2175541ACi interfaceC2175541ACi;
        InterfaceC480510Isr interfaceC480510IsrLJJL2 = LJJL();
        if (interfaceC480510IsrLJJL2 != null) {
            interfaceC480510IsrLJJL2.v0(true);
        }
        if (LinkmicRtcRatioOptimizeLivePlayerHelper.isEnable()) {
            C468980IaG c468980IaG = C0ITW.LJI;
            LiveRoomStruct liveRoomStruct = this.LLIZ;
            c468980IaG.getClass();
            if ((!C468980IaG.LIZ(liveRoomStruct) || this.LLJJJ == null) && (interfaceC480510IsrLJJL = LJJL()) != null) {
                int iP0 = interfaceC480510IsrLJJL.p0();
                int i = 65535 & iP0;
                int i2 = iP0 >> 16;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                if ((i == this.LLJILJIL && i2 == this.LLJILJILJ) || (interfaceC2175541ACi = this.LL) == null) {
                    return;
                }
                LJJJLIIL(i, i2, interfaceC2175541ACi);
            }
        }
    }

    @Override // X.C1ACD
    public final void stopUseTextureRender() {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.stopUseTextureRender();
        }
    }

    @Override // X.C1ACD
    public final InterfaceC2175461ACa LJIJJ() {
        return this.LLJLLIL;
    }

    @Override // X.C1ACD
    public final boolean LJJIZ() {
        return this.LLJJIJIL;
    }

    @Override // X.C1ACD
    public final C2175491ACd LJJJJLI() {
        return this.LLJJ;
    }

    @Override // X.C1ACD
    public final String getPlayerTag() {
        return this.LLILZIL;
    }

    public static boolean LJJLIIIJ(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct != null && liveRoomStruct.multiStreamScene == 1 && LiveGameMultiStreamWatch.INSTANCE.isExperimentGroup()) {
            return true;
        }
        return false;
    }

    @Override // X.C1ACD
    public final C2175631ACr LIZ(boolean z) {
        InterfaceC2175461ACa interfaceC2175461ACa = this.LLJLLIL;
        if (interfaceC2175461ACa != null) {
            C940530aaB c940530aaBLJJIJIIJI = interfaceC2175461ACa.LJJIJIIJI(z);
            c940530aaBLJJIJIIJI.getClass();
            if (SystemClock.uptimeMillis() - c940530aaBLJJIJIIJI.LJIIIZ < Mp4ScreenVideoLoadTimeout.CONTROL) {
                c940530aaBLJJIJIIJI = new C940530aaB(c940530aaBLJJIJIIJI.LJIIJ, c940530aaBLJJIJIIJI.LJIIJJI, c940530aaBLJJIJIIJI.LJIIL, c940530aaBLJJIJIIJI.LJIILIIL, c940530aaBLJJIJIIJI.LJIILJJIL, 480);
            }
            C2175631ACr c2175631ACr = this.LLJJIJIIJIL;
            c2175631ACr.LIZ = c940530aaBLJJIJIIJI.LIZ;
            c2175631ACr.LIZIZ = c940530aaBLJJIJIIJI.LIZIZ;
            c2175631ACr.LIZJ = c940530aaBLJJIJIIJI.LIZJ;
            c2175631ACr.LIZLLL = c940530aaBLJJIJIIJI.LIZLLL;
            c2175631ACr.LJ = c940530aaBLJJIJIIJI.LJ;
            c2175631ACr.LJIIIZ = SystemClock.uptimeMillis();
            C2175631ACr c2175631ACr2 = this.LLJJIJIIJIL;
            c2175631ACr2.LJFF = c940530aaBLJJIJIIJI.LJFF;
            c2175631ACr2.LJI = c940530aaBLJJIJIIJI.LJI;
            c2175631ACr2.LJII = c940530aaBLJJIJIIJI.LJII;
            c2175631ACr2.LJIIIIZZ = c940530aaBLJJIJIIJI.LJIIIIZZ;
        } else {
            C2175631ACr c2175631ACr3 = this.LLJJIJIIJIL;
            c2175631ACr3.getClass();
            if (SystemClock.uptimeMillis() - c2175631ACr3.LJIIIZ >= 300000) {
                C2175631ACr c2175631ACr4 = this.LLJJIJIIJIL;
                c2175631ACr4.LIZ = "normal";
                c2175631ACr4.LIZIZ = 0L;
                c2175631ACr4.LIZJ = 0L;
                c2175631ACr4.LIZLLL = 0L;
                c2175631ACr4.LJ = "";
                c2175631ACr4.LJFF = "normal";
                c2175631ACr4.LJII = 0;
                c2175631ACr4.LJIIIIZZ = null;
            }
        }
        return this.LLJJIJIIJIL;
    }

    @Override // X.C1ACD
    public final void LIZJ(String str) {
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && !SurfaceViewAndroid10Workaround.INSTANCE.removeTransLogic()) {
            View view = c2175491ACd.LIZ;
            if ((view instanceof SurfaceView) && (view.getParent() instanceof ViewGroup)) {
                C786410Ut5.Gc(0.0f, (ViewGroup) c2175491ACd.LIZ.getParent());
            }
        }
    }

    @Override // X.C1ACD
    public final void LJIIIZ(C0IXC c0ixc) {
        this.LLJLL = c0ixc;
    }

    @Override // X.C1ACD
    public final void LJIIJ(C2174981AAe c2174981AAe) {
        this.LLJJI = c2174981AAe;
    }

    @Override // X.C1ACD
    public final void LJIIJJI(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJIIJJI(z);
        }
    }

    @Override // X.C1ACD
    public final void LJIILIIL(C1699360uK6 c1699360uK6) {
        this.LLJLILLLLZIIL = c1699360uK6;
    }

    @Override // X.C1ACD
    public final void LJIILJJIL(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            if (!TextUtils.isEmpty(this.LLILZIL)) {
                interfaceC480510IsrLJJL.t0(this.LLILZIL, "preview", z);
            } else {
                if (LJJL() == null || getContext() == null) {
                    return;
                }
                interfaceC480510IsrLJJL.LJJJJ(getContext(), "preview", z);
            }
        }
    }

    @Override // X.C1ACD
    public final void LJIILL(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJIILL(z);
        }
    }

    @Override // X.C1ACD
    public final void LJIILLIIL(ArrayList<String> arrayList) {
        Integer numValueOf;
        InterfaceC480510Isr interfaceC480510IsrLJJL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LivePlayHelper#preloadResource#streamData.streamData.size=");
        String string = null;
        if (arrayList != null) {
            numValueOf = Integer.valueOf(arrayList.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C827750WdZ.LIZ("MPD", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        if (arrayList != null && !arrayList.isEmpty() && (interfaceC480510IsrLJJL = LJJL()) != null) {
            LiveRoomStruct liveRoomStruct = this.LLIZ;
            if (liveRoomStruct != null) {
                string = Long.valueOf(liveRoomStruct.id).toString();
            }
            LiveRoomStruct liveRoomStruct2 = this.LLIZ;
            if (liveRoomStruct2 != null && liveRoomStruct2.getForceLowLatency()) {
                z = true;
            }
            interfaceC480510IsrLJJL.LJJIJIIJIL(string, z);
            interfaceC480510IsrLJJL.LJIILIIL(true);
            interfaceC480510IsrLJJL.LJIILLIIL(arrayList);
        }
    }

    @Override // X.C1ACD
    public final void LJIIZILJ(LiveWidget liveWidget) {
        this.LLJJIJI = liveWidget;
    }

    @Override // X.C1ACD
    public final void LJIJ(int i) {
        View view;
        this.LLJILLL = i;
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && (view = c2175491ACd.LIZ) != null) {
            C500260Jjc.LJLJL(i, view);
        }
        InterfaceC2175461ACa interfaceC2175461ACa = this.LLJLLIL;
        if (interfaceC2175461ACa != null) {
            interfaceC2175461ACa.LJJIIZ(i);
        }
    }

    @Override // X.C1ACD
    public final Bitmap LJIJI(boolean z) {
        IPullStreamService iPullStreamService;
        C480680It8 c480680It8YY;
        InterfaceC480510Isr interfaceC480510Isr;
        Bitmap bitmapLJIJI;
        if (z && LiveInnerStreamUseSurfaceControlExp.getEnable()) {
            InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
            if ((interfaceC480510IsrLJJL == null || interfaceC480510IsrLJJL.getVideoView() == null) && (iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class)) != null && (c480680It8YY = iPullStreamService.YY()) != null && (interfaceC480510Isr = c480680It8YY.LIZIZ) != null && (bitmapLJIJI = interfaceC480510Isr.LJIJI(true)) != null) {
                return bitmapLJIJI;
            }
            if (LiveSmoothExitNotCaptureExp.getEnable()) {
                return null;
            }
        }
        InterfaceC480510Isr interfaceC480510IsrLJJL2 = LJJL();
        if (interfaceC480510IsrLJJL2 == null) {
            return null;
        }
        return interfaceC480510IsrLJJL2.LJIJI(true);
    }

    @Override // X.C1ACD
    public final void LJIL(String str) {
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && (c2175491ACd.LIZ.getParent() instanceof ViewGroup)) {
            int i = Resources.getSystem().getDisplayMetrics().heightPixels;
            ViewGroup viewGroup = (ViewGroup) c2175491ACd.LIZ.getParent();
            float f = i * 5.0f;
            if (viewGroup.getTranslationX() != f) {
                C786410Ut5.Gc(f, viewGroup);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ttlive_enter_room_LivePreviewVideoView, In room: detachSurfaceView, detach reason:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    @Override // X.C1ACD
    public final String LJJ(int i) {
        String strLJIL;
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL == null || (strLJIL = interfaceC480510IsrLJJL.LJIL(i)) == null) {
            return "";
        }
        return strLJIL;
    }

    @Override // X.C1ACD
    public final void LJJIFFI(C750450TcB c750450TcB) {
        this.LLL = c750450TcB;
    }

    @Override // X.C1ACD
    public final void LJJIII(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJJIII(z);
        }
    }

    @Override // X.C1ACD
    public final void LJJIIJ(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.LJJJJLL(z);
        }
    }

    @Override // X.C1ACD
    public final void LJJIIZ(String str) {
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && (c2175491ACd.LIZ.getParent() instanceof ViewGroup) && ((View) c2175491ACd.LIZ.getParent()).getTranslationX() != 0.0f) {
            C786410Ut5.Gc(0.0f, (ViewGroup) c2175491ACd.LIZ.getParent());
        }
    }

    @Override // X.C1ACD
    public final void LJJIJ(String str) {
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null) {
            c2175491ACd.LIZ();
        }
    }

    @Override // X.C1ACD
    public final void LJJIJIIJI(LiveRoomStruct liveRoomStruct) {
        this.LLIZ = liveRoomStruct;
    }

    @Override // X.C1ACD
    public final void LJJIJIIJIL(AwS612S0100000_33 awS612S0100000_33) {
        this.LLLF = awS612S0100000_33;
    }

    @Override // X.C1ACD
    public final void LJJJJI(C1ACN c1acn) {
        this.LLJJIII = c1acn;
    }

    @Override // X.C1ACD
    public final void LJJJJL(boolean z) {
        int i;
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && !LiveDisableChangeTabTrasView.INSTANCE.isEnable()) {
            View view = c2175491ACd.LIZ;
            if ((view instanceof SurfaceView) && (view.getParent() instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) c2175491ACd.LIZ.getParent();
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LJLZ(i, viewGroup);
            }
        }
    }

    public final void LJJJJZI(FrameLayout frameLayout) {
        View view;
        View view2;
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null && (view = c2175491ACd.LIZ) != null && frameLayout != null && frameLayout.indexOfChild(view) < 0) {
            View view3 = null;
            if (1 != 0) {
                if (LiveOptPreviewCardViewExp.isEnable()) {
                    LJJJLZIJ("addRenderView", null, true);
                    if (frameLayout.getChildCount() != 0) {
                        Iterator<View> it2 = new C09RD(frameLayout).iterator();
                        boolean z = false;
                        while (true) {
                            C09RE c09re = (C09RE) it2;
                            if (!c09re.hasNext()) {
                                break;
                            }
                            View view4 = (View) c09re.next();
                            if (view4 instanceof C0IF5) {
                                C786410Ut5.LJJJZ(view4, frameLayout);
                                z = true;
                            }
                        }
                        if (z) {
                            C20441214yg.LJ("ttlive_preview_LivePlayHelper_Preview", "there is an error for multi-adding live surfaceview, call wangyan.shang ");
                        }
                    }
                    frameLayout.addView(view, 0);
                    return;
                }
                if (C293620Bf6.LIZ(view)) {
                    LJJJLZIJ("addRenderView", null, true);
                    Object objLIZ = C1ACC.LIZ(frameLayout);
                    if (objLIZ == null) {
                        if (view.getParent() instanceof ViewGroup) {
                            C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
                        }
                        C786410Ut5.LJLLLLLL(0, view);
                        frameLayout.addView(view, 0);
                        return;
                    }
                    View view5 = (View) objLIZ;
                    if (view5.getVisibility() != 0) {
                        C786410Ut5.LJLLLLLL(0, view5);
                    }
                    C2175491ACd c2175491ACd2 = this.LLJJ;
                    if (c2175491ACd2 == null) {
                        return;
                    }
                    c2175491ACd2.LIZ = view5;
                    return;
                }
                LJJJLZIJ("addRenderView", null, true);
                C2175491ACd c2175491ACd3 = this.LLJJ;
                if (c2175491ACd3 != null) {
                    view3 = c2175491ACd3.LIZ;
                }
                LJJLIIIJJIZ(view3);
                Object objLIZ2 = C1ACC.LIZ(frameLayout);
                if (objLIZ2 == null) {
                    C786410Ut5.LJLLLLLL(0, view);
                    frameLayout.addView(view, 0);
                } else {
                    if (!(objLIZ2 instanceof View) || (view2 = (View) objLIZ2) == null || view2.getVisibility() == 0) {
                        return;
                    }
                    C786410Ut5.LJLLLLLL(0, view2);
                }
            }
        }
    }

    public final void LJJLIIIJJI(View view) {
        boolean z;
        LiveRoomStruct liveRoomStruct = this.LLIZ;
        if (liveRoomStruct != null) {
            z = liveRoomStruct.liveTypeAudio;
        } else {
            z = false;
        }
        if (view != null) {
            C755980Tl6 c755980Tl6LIZ = C755980Tl6.LIZ();
            String str = this.LLJ;
            if (str == null) {
                c755980Tl6LIZ.getClass();
                return;
            }
            if (z) {
                if (c755980Tl6LIZ.LJFF == null) {
                    c755980Tl6LIZ.LJFF = new ConcurrentHashMap();
                }
                c755980Tl6LIZ.LJFF.put(str, view);
            } else {
                if (c755980Tl6LIZ.LJI == null) {
                    c755980Tl6LIZ.LJI = new ConcurrentHashMap();
                }
                c755980Tl6LIZ.LJI.put(str, view);
            }
        }
    }

    public final void LJJLIIIJJIZ(View view) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseSurfaceView hasCode: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(", videoView: ");
        Integer num = null;
        if (view != null) {
            numValueOf = Integer.valueOf(view.hashCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        if (view != null) {
            try {
                Object tag = view.getTag(R.id.n9j);
                if (tag instanceof Integer) {
                    num = (Integer) tag;
                }
                int iHashCode = hashCode();
                if (num != null && num.intValue() == iHashCode) {
                    C786410Ut5.LJLLLLLL(8, view);
                    if (view.getParent() instanceof ViewGroup) {
                        C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
                    }
                    z = true;
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        if (LiveOptPreviewCardViewExp.isEnable() && z) {
            LJJLIIIJJI(view);
        } else {
            LJJLIIIJJI(view);
        }
    }

    @Override // X.C1ACD
    public final void changeLowLatencyMode(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.changeLowLatencyMode(false);
        }
    }

    @Override // X.C1ACD
    public final void changeSRSupportScene(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.changeSRSupportScene(z);
        }
    }

    @Override // X.C1ACD
    public final void onAppBackground(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL;
        if (LivePlayerAppBackgroundEventSetting.enable() && (interfaceC480510IsrLJJL = LJJL()) != null) {
            interfaceC480510IsrLJJL.LJIIZILJ(z);
        }
    }

    @Override // X.C1ACD
    public final void setHadGamePreviewLiveVideoRotated(boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.setHadGamePreviewLiveVideoRotated(true);
        }
    }

    public C1ACX(InterfaceC2175541ACi interfaceC2175541ACi, EnumC1913520ztW enumC1913520ztW) {
        this.LL = interfaceC2175541ACi;
        this.LLILLJJLI = enumC1913520ztW;
    }

    @Override // X.C1ACD
    public final void LJJIJIL(String str, boolean z) {
        View view;
        String str2;
        View view2;
        View view3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append("+++++++++++++++++++++destroy source:");
        sbLIZ.append(str);
        sbLIZ.append(", removeRenderView:");
        sbLIZ.append(z);
        sbLIZ.append("， renderView:");
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd != null) {
            view = c2175491ACd.LIZ;
        } else {
            view = null;
        }
        sbLIZ.append(view);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        if (str == null) {
            str2 = "destroy";
        } else {
            str2 = str;
        }
        C2175491ACd c2175491ACd2 = this.LLJJ;
        if (c2175491ACd2 != null) {
            view2 = c2175491ACd2.LIZ;
        } else {
            view2 = null;
        }
        LJJLIIIJLJLI(this, str2, view2, str, true, 4);
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            LJJLIIIIJ();
            if (!TextUtils.isEmpty(this.LLILZIL)) {
                interfaceC480510IsrLJJL.LJIJ(this.LLILZIL);
            } else {
                interfaceC480510IsrLJJL.LJJJJIZL(getContext());
            }
        }
        C2175491ACd c2175491ACd3 = this.LLJJ;
        if (c2175491ACd3 != null) {
            c2175491ACd3.LIZ();
        }
        C2175491ACd c2175491ACd4 = this.LLJJ;
        if (c2175491ACd4 != null) {
            view3 = c2175491ACd4.LIZ;
        } else {
            view3 = null;
        }
        LJJLIIIJJIZ(view3);
        this.LLJJ = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJJIJIL = false;
        this.LLL = null;
        this.LLLF = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJLL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r29, java.lang.String r30) {
        /*
            Method dump skipped, instruction units count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJJJJLL(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLI(X.C945320ahu r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJJLI(X.0ahu, java.lang.String):void");
    }

    @Override // X.InterfaceC480650It5
    public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
        Object c098200Yq;
        Object objMd;
        C1A7N c1a7n;
        ViewParent parent;
        View view;
        C473250Ih9 c473250Ih9;
        String str;
        InterfaceC2175461ACa interfaceC2175461ACa;
        C2175491ACd c2175491ACd;
        View view2;
        C1A7N c1a7n2;
        InterfaceC2175541ACi interfaceC2175541ACi;
        InterfaceC2175541ACi interfaceC2175541ACi2;
        InterfaceC2175541ACi interfaceC2175541ACi3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" + onPlayerMessage ...");
        sbLIZ.append(enumC1913550ztZ.name());
        sbLIZ.append("...");
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        int iIntValue = 0;
        ViewGroup viewGroup = null;
        Object objMd2 = null;
        switch (C1913530ztX.LIZIZ[enumC1913550ztZ.ordinal()]) {
            case 1:
                try {
                    if ((obj instanceof String) && (str = (String) obj) != null) {
                        c098200Yq = Integer.valueOf(CastIntegerProtector.parseInt(str));
                    } else {
                        c098200Yq = null;
                    }
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
                    iIntValue = num.intValue();
                }
                int i = 65535 & iIntValue;
                int i2 = iIntValue >> 16;
                InterfaceC2175541ACi interfaceC2175541ACi4 = this.LL;
                if (interfaceC2175541ACi4 != null) {
                    C468980IaG c468980IaG = C0ITW.LJI;
                    LiveRoomStruct liveRoomStruct = this.LLIZ;
                    c468980IaG.getClass();
                    if (C468980IaG.LIZ(liveRoomStruct) && (c473250Ih9 = this.LLJJJ) != null) {
                        i = c473250Ih9.LIZ;
                        i2 = c473250Ih9.LIZIZ;
                        Map<String, Object> map = C1338270kvh.LIZ;
                    } else {
                        Map<String, Object> map2 = C1338270kvh.LIZ;
                    }
                    LJJJLIIL(i, i2, interfaceC2175541ACi4);
                    InterfaceC2175541ACi interfaceC2175541ACi5 = this.LL;
                    if (interfaceC2175541ACi5 != null) {
                        objMd = interfaceC2175541ACi5.Md();
                    } else {
                        objMd = null;
                    }
                    if ((objMd instanceof C1A7N) && (c1a7n = (C1A7N) objMd) != null) {
                        C2175491ACd c2175491ACd2 = this.LLJJ;
                        if (c2175491ACd2 != null && (view = c2175491ACd2.LIZ) != null) {
                            parent = view.getParent();
                        } else {
                            parent = null;
                        }
                        if (parent instanceof ViewGroup) {
                            viewGroup = (ViewGroup) parent;
                        }
                        c1a7n.LIZ(i, i2, viewGroup);
                    }
                }
                InterfaceC2175511ACf interfaceC2175511ACf = this.LLJZ;
                if (interfaceC2175511ACf != null) {
                    interfaceC2175511ACf.LJIJ(this.LLIZLLLIL);
                }
                break;
            case 2:
                boolean z = this.LLJJJIL;
                this.LLJJJIL = true;
                if (LiveInnerStreamUseSurfaceControlExp.getEnable() && (c2175491ACd = this.LLJJ) != null && (view2 = c2175491ACd.LIZ) != null) {
                    C786410Ut5.LJLLLLLL(0, view2);
                }
                InterfaceC2175541ACi interfaceC2175541ACi6 = this.LL;
                if (interfaceC2175541ACi6 != null) {
                    interfaceC2175541ACi6.v();
                }
                InterfaceC2175541ACi interfaceC2175541ACi7 = this.LL;
                if (interfaceC2175541ACi7 != null) {
                    interfaceC2175541ACi7.T5();
                }
                if (!LiveSdkMultiGuestFeedPreviewOptSetting.INSTANCE.isEnable() && !z && (interfaceC2175461ACa = this.LLJLLIL) != null) {
                    interfaceC2175461ACa.LJII();
                }
                break;
            case 3:
                if (obj instanceof String) {
                    LJJLI(new C945320ahu(null, (String) obj), "");
                } else if (obj instanceof C945320ahu) {
                    C945320ahu c945320ahu = (C945320ahu) obj;
                    if (C969340bKe.LJFF(c945320ahu) == 16) {
                        InterfaceC2175541ACi interfaceC2175541ACi8 = this.LL;
                        if (interfaceC2175541ACi8 != null) {
                            objMd2 = interfaceC2175541ACi8.Md();
                        }
                        if ((objMd2 instanceof C1A7N) && (c1a7n2 = (C1A7N) objMd2) != null) {
                            c1a7n2.LJFF = true;
                        }
                    }
                    LJJLI(c945320ahu, "");
                }
                break;
            case 4:
                if (obj != null && (interfaceC2175541ACi = this.LL) != null) {
                    interfaceC2175541ACi.oe(obj.toString());
                }
                break;
            case 5:
                if (obj != null && (interfaceC2175541ACi2 = this.LL) != null) {
                    interfaceC2175541ACi2.mo29if(obj.toString());
                }
                break;
            case 6:
                if (obj != null && (interfaceC2175541ACi3 = this.LL) != null) {
                    interfaceC2175541ACi3.w9(obj.toString());
                }
                break;
            case 7:
                InterfaceC2175541ACi interfaceC2175541ACi9 = this.LL;
                if (interfaceC2175541ACi9 != null) {
                    interfaceC2175541ACi9.LLLIL();
                }
                break;
        }
        InterfaceC2175541ACi interfaceC2175541ACi10 = this.LL;
        if (interfaceC2175541ACi10 != null) {
            interfaceC2175541ACi10.LLLLJ(enumC1913550ztZ, obj);
        }
    }

    @Override // X.C1ACD
    public final void f0(C0IIZ c0iiz, boolean z) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            interfaceC480510IsrLJJL.f0(c0iiz, z);
        }
    }

    @Override // X.C1ACD
    public final void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC) {
        InterfaceC480510Isr interfaceC480510IsrLJJL = LJJL();
        if (interfaceC480510IsrLJJL != null) {
            if (interfaceC1699420uKC == null) {
                interfaceC480510IsrLJJL.switchResolution(str);
            } else {
                interfaceC480510IsrLJJL.switchResolution(str, interfaceC1699420uKC);
            }
        }
    }

    public static void LJJLIIIJL(C1ACX c1acx, String str, View view) {
        c1acx.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeRendViewAndNotRecycle, source=");
        sbLIZ.append(str);
        sbLIZ.append(", forceRemoveLinkMicView=");
        sbLIZ.append(false);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        Integer num = null;
        c1acx.LJJJLZIJ(str, null, true);
        if (C293620Bf6.LIZ(view)) {
            C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", "removeSelf not call remove videoView");
            return;
        }
        if (view == null) {
            return;
        }
        try {
            Object tag = view.getTag(R.id.n9j);
            if (tag instanceof Integer) {
                num = (Integer) tag;
            }
            int iHashCode = c1acx.hashCode();
            if (num != null && num.intValue() == iHashCode) {
                C786410Ut5.LJLLLLLL(8, view);
                if (view.getParent() instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(view, (ViewGroup) view.getParent());
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013f  */
    @Override // X.C1ACD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(final com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r21, boolean r22, final X.C1ACA r23) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJ(com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, boolean, X.1ACA):void");
    }

    @Override // X.C1ACD
    public final void LJJI(int i, int i2, boolean z) {
        C473250Ih9 c473250Ih9;
        if (this.LL != null) {
            LJJJLIIL(i, i2, this.LL);
            if (z) {
                c473250Ih9 = new C473250Ih9(i, i2);
            } else {
                c473250Ih9 = null;
            }
            this.LLJJJ = c473250Ih9;
        }
    }

    @Override // X.C1ACD
    public final void LJJJ(Context context, String str, FrameLayout frameLayout) {
        InterfaceC464060IHs interfaceC464060IHsLIZIZ;
        InterfaceC480510Isr interfaceC480510IsrLJJL;
        C2175491ACd c2175491ACd = this.LLJJ;
        if (c2175491ACd == null || c2175491ACd.LIZIZ() == null) {
            LJJLIIIJILLIZJL(context, str, frameLayout);
        }
        LJJJJZI(frameLayout);
        C2175491ACd c2175491ACd2 = this.LLJJ;
        if (c2175491ACd2 != null && (interfaceC464060IHsLIZIZ = c2175491ACd2.LIZIZ()) != null && (interfaceC480510IsrLJJL = LJJL()) != null) {
            interfaceC480510IsrLJJL.y0(interfaceC464060IHsLIZIZ, this.LLILZIL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00de A[PHI: r3
      0x00de: PHI (r3v2 java.lang.Float) = (r3v1 java.lang.Float), (r3v3 java.lang.Float) binds: [B:59:0x00dc, B:47:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJLIIL(int r12, int r13, X.InterfaceC2175541ACi r14) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJJJLIIL(int, int, X.1ACi):void");
    }

    public final void LJJJLZIJ(String str, String str2, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dropUpLayoutContainerLinkMic, source=");
        sbLIZ.append(str);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = true;
        if (z || !MultiGuestSharebgFlickOptSetting.INSTANCE.isEnable() || !MultiGuestSharedBgFlickConfigSetting.INSTANCE.getValue().optFeed) {
            InterfaceC2175461ACa interfaceC2175461ACa = this.LLJLLIL;
            if (interfaceC2175461ACa != null) {
                if (!LinkmicFixLiveFeedNotResueSetting.INSTANCE.getValue()) {
                    z2 = z;
                }
                interfaceC2175461ACa.LJJIIJZLJL(str2, z2);
            }
            this.LLJLLIL = null;
        }
        if (LinkMicSupportNewLayoutInFeedSetting.INSTANCE.getValue() && z && ((Lifecycle) this.LLJJL.getValue()).getCurrentState() != Lifecycle.State.INITIALIZED) {
            ((LifecycleRegistry) this.LLJJL.getValue()).setCurrentState(Lifecycle.State.DESTROYED);
            getViewModelStore().clear();
        }
        InterfaceC2175711ACz interfaceC2175711ACz = this.LLJLLL;
        if (interfaceC2175711ACz != null) {
            interfaceC2175711ACz.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJILLIZJL(android.content.Context r15, java.lang.String r16, android.widget.FrameLayout r17) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJJLIIIJILLIZJL(android.content.Context, java.lang.String, android.widget.FrameLayout):void");
    }

    public static void LJJLIIIJLJLI(C1ACX c1acx, String str, View view, String str2, boolean z, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        c1acx.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("removeSelf, source=");
        sbLIZ.append(str);
        sbLIZ.append(", forceRemoveLinkMicView=");
        sbLIZ.append(false);
        C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", C2188811AlT.LIZIZ(sbLIZ));
        c1acx.LJJJLZIJ(str, str2, z);
        if (C293620Bf6.LIZ(view)) {
            C827750WdZ.LIZ("ttlive_preview_LivePlayHelper_Preview", "removeSelf not call remove videoView");
        } else {
            c1acx.LJJLIIIJJIZ(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01de A[Catch: Exception -> 0x030c, TryCatch #0 {Exception -> 0x030c, blocks: (B:60:0x0108, B:62:0x010c, B:63:0x0110, B:65:0x011b, B:67:0x012b, B:68:0x012f, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0145, B:78:0x0149, B:80:0x014d, B:81:0x0151, B:82:0x0158, B:84:0x015c, B:85:0x0160, B:87:0x0164, B:88:0x0168, B:90:0x016e, B:92:0x0174, B:94:0x0178, B:104:0x0192, B:107:0x019c, B:109:0x01a0, B:111:0x01a4, B:113:0x01a8, B:115:0x01ae, B:117:0x01b4, B:119:0x01b8, B:121:0x01bc, B:123:0x01c0, B:125:0x01c6, B:126:0x01ca, B:128:0x01d2, B:130:0x01d6, B:131:0x01da, B:133:0x01de, B:134:0x01e2, B:156:0x0266, B:158:0x026a, B:161:0x0278, B:135:0x01f5, B:137:0x01fb, B:139:0x01ff, B:141:0x0205, B:143:0x0216, B:144:0x0219, B:146:0x0235, B:147:0x0237, B:149:0x0243, B:150:0x024b, B:152:0x0259, B:166:0x0285, B:168:0x028b, B:170:0x0296, B:171:0x0298, B:173:0x02a0, B:174:0x02a2, B:176:0x02aa, B:177:0x02ac, B:178:0x02b3, B:181:0x02bb, B:183:0x02bf, B:184:0x02c1, B:186:0x02c9, B:195:0x02dc, B:197:0x0308, B:99:0x0184), top: B:204:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0308 A[Catch: Exception -> 0x030c, TRY_LEAVE, TryCatch #0 {Exception -> 0x030c, blocks: (B:60:0x0108, B:62:0x010c, B:63:0x0110, B:65:0x011b, B:67:0x012b, B:68:0x012f, B:70:0x0135, B:72:0x013b, B:74:0x0141, B:76:0x0145, B:78:0x0149, B:80:0x014d, B:81:0x0151, B:82:0x0158, B:84:0x015c, B:85:0x0160, B:87:0x0164, B:88:0x0168, B:90:0x016e, B:92:0x0174, B:94:0x0178, B:104:0x0192, B:107:0x019c, B:109:0x01a0, B:111:0x01a4, B:113:0x01a8, B:115:0x01ae, B:117:0x01b4, B:119:0x01b8, B:121:0x01bc, B:123:0x01c0, B:125:0x01c6, B:126:0x01ca, B:128:0x01d2, B:130:0x01d6, B:131:0x01da, B:133:0x01de, B:134:0x01e2, B:156:0x0266, B:158:0x026a, B:161:0x0278, B:135:0x01f5, B:137:0x01fb, B:139:0x01ff, B:141:0x0205, B:143:0x0216, B:144:0x0219, B:146:0x0235, B:147:0x0237, B:149:0x0243, B:150:0x024b, B:152:0x0259, B:166:0x0285, B:168:0x028b, B:170:0x0296, B:171:0x0298, B:173:0x02a0, B:174:0x02a2, B:176:0x02aa, B:177:0x02ac, B:178:0x02b3, B:181:0x02bb, B:183:0x02bf, B:184:0x02c1, B:186:0x02c9, B:195:0x02dc, B:197:0x0308, B:99:0x0184), top: B:204:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0077 A[PHI: r1
      0x0077: PHI (r1v17 java.lang.String) = (r1v3 java.lang.String), (r1v19 java.lang.String) binds: [B:57:0x0101, B:18:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dd  */
    @Override // X.C1ACD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(boolean r22, final com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r23, android.widget.FrameLayout r24, boolean r25, java.lang.String r26, java.lang.String r27, boolean r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ACX.LJJIIJZLJL(boolean, com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct, android.widget.FrameLayout, boolean, java.lang.String, java.lang.String, boolean, java.lang.String):void");
    }
}
