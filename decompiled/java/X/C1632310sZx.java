package X;

import Y.AObjectS246S0100000_25;
import Y.AObserverS227S0100000_25;
import android.os.Bundle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;
import mn3.e0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1632310sZx extends AbstractC2255721DQs<InterfaceC1420200n3q> implements InterfaceC1420200n3q, InterfaceC379610EuV {
    public static final C1632450saB LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1632360sa2.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final h0<AbstractC1632340sa0> LLILZIL = new h0<>(C1632440saA.LIZ);
    public final MessageCenter.Listener LLIZLLLIL = new MessageCenter.Listener() { // from class: X.0sa4
        @Override // com.bef.effectsdk.message.MessageCenter.Listener
        public final void onMessageReceived(int i, int i2, int i3, String str) {
            C01TT.LIZLLL(new C1632370sa3(i, i2, i3, this.LL));
        }
    };
    public final Keva LLJ = Keva.getRepo("keva_green_screen_guidance");

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0saB] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1632310sZx.class, "recordGreenScreenUIApi", "getRecordGreenScreenUIApi()Lcom/ss/android/ugc/gamora/recorder/greenscreen/RecordGreenScreenUIApi;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1632310sZx.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C1632310sZx.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LLJI = new Object() { // from class: X.0saB
        };
        LLJILJIL = 8;
    }

    public InterfaceC1420200n3q T2() {
        return this;
    }

    private final boolean c3() {
        return this.LLJ.getBoolean("keva_green_screen_guidance_key", true);
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILLL.getValue(this, LLJIJIL[1]);
    }

    public final InterfaceC1632360sa2 W2() {
        return (InterfaceC1632360sa2) this.LLILLJJLI.getValue(this, LLJIJIL[0]);
    }

    public final q getStickerApi() {
        return (q) this.LLILZ.getValue(this, LLJIJIL[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v3() {
        InterfaceC1625410sOp interfaceC1625410sOpW4;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        Effect effect;
        InterfaceC1624480sNK interfaceC1624480sNKC02;
        InterfaceC1625470sOv interfaceC1625470sOvLJII2;
        Effect effectLJI;
        InterfaceC1625410sOp interfaceC1625410sOpW42;
        String resourceId = null;
        Bundle bundle = null;
        resourceId = null;
        resourceId = null;
        resourceId = null;
        resourceId = null;
        if (W2().ut1().LIZJ().booleanValue() && W2().Ry2().LIZJ().booleanValue() && this.LLILZLL && this.LLIZ) {
            AbstractC1632340sa0 abstractC1632340sa0LIZJ = wo1().LIZJ();
            AwS569S0100000_25 awS569S0100000_25 = new AwS569S0100000_25(this, 581);
            abstractC1632340sa0LIZJ.getClass();
            if (!(abstractC1632340sa0LIZJ instanceof C1632420sa8)) {
                awS569S0100000_25.invoke();
                return;
            }
            Effect effect2 = ((C1632420sa8) abstractC1632340sa0LIZJ).LIZ;
            if (effect2 != null) {
                com.ss.android.ugc.gamora.recorder.greenscreen.e0.LLJZ.getClass();
                C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
                C201955140j.LIZLLL(c20012313Rx, "RecordGreenScreenComponent", "Applying camera green screen");
                if (c3()) {
                    C201955140j.LIZLLL(c20012313Rx, "RecordGreenScreenComponent", "Adding guidance param to extraData");
                    q3(false);
                    bundle = new Bundle();
                    bundle.putBoolean("camera_green_screen_show_guidance", true);
                }
                q stickerApi = getStickerApi();
                if (stickerApi == null || (interfaceC1625410sOpW42 = stickerApi.w4()) == null) {
                    return;
                }
                interfaceC1625410sOpW42.LIZJ(C1622820sKe.LIZIZ(effect2, 0, null, null, bundle, null, null, 0, false, null, "camera_tool_bar", 503));
                return;
            }
            return;
        }
        Effect effectEe0 = Ee0();
        if (effectEe0 != null) {
            q stickerApi2 = getStickerApi();
            if (Intrinsics.LJFF((stickerApi2 == null || (interfaceC1624480sNKC02 = stickerApi2.C0()) == null || (interfaceC1625470sOvLJII2 = interfaceC1624480sNKC02.LJII()) == null || (effectLJI = interfaceC1625470sOvLJII2.LJI()) == null) ? null : effectLJI.getResourceId(), effectEe0.getResourceId())) {
                q stickerApi3 = getStickerApi();
                if (stickerApi3 != null && (interfaceC1624480sNKC0 = stickerApi3.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null && (effect = (Effect) mutableLiveDataLJIJJLI.getValue()) != null) {
                    resourceId = effect.getResourceId();
                }
                if (Intrinsics.LJFF(resourceId, effectEe0.getResourceId())) {
                    com.ss.android.ugc.gamora.recorder.greenscreen.e0.LLJZ.getClass();
                    C201955140j.LIZLLL(C20012313Rx.LIZIZ, "RecordGreenScreenComponent", "Canceling camera green screen");
                    q stickerApi4 = getStickerApi();
                    if (stickerApi4 == null || (interfaceC1625410sOpW4 = stickerApi4.w4()) == null) {
                        return;
                    }
                    interfaceC1625410sOpW4.LIZJ(new C1625460sOu(-1, null, EnumC1448980noG.UI_CLICK, effectEe0, true));
                }
            }
        }
    }

    @Override // X.InterfaceC1420200n3q
    public Effect Ee0() {
        AbstractC1632340sa0 abstractC1632340sa0LIZJ = wo1().LIZJ();
        abstractC1632340sa0LIZJ.getClass();
        if (abstractC1632340sa0LIZJ instanceof C1632410sa7) {
            return ((C1632410sa7) abstractC1632340sa0LIZJ).LIZ;
        }
        if (abstractC1632340sa0LIZJ instanceof C1632420sa8) {
            return ((C1632420sa8) abstractC1632340sa0LIZJ).LIZ;
        }
        return null;
    }

    public final void W1() {
        W2().JC();
    }

    public final void o2() {
        C1632400sa6 c1632400sa6;
        AbstractC1632340sa0 abstractC1632340sa0LIZJ = wo1().LIZJ();
        abstractC1632340sa0LIZJ.getClass();
        if (abstractC1632340sa0LIZJ instanceof C1632440saA) {
            this.LLILZIL.LJII(new C1632430sa9());
            return;
        }
        AbstractC1632340sa0 abstractC1632340sa0LIZJ2 = wo1().LIZJ();
        abstractC1632340sa0LIZJ2.getClass();
        if ((abstractC1632340sa0LIZJ2 instanceof C1632430sa9) || (abstractC1632340sa0LIZJ2 instanceof C1632410sa7)) {
            return;
        }
        AbstractC1632340sa0 abstractC1632340sa0LIZJ3 = wo1().LIZJ();
        abstractC1632340sa0LIZJ3.getClass();
        if (abstractC1632340sa0LIZJ3 instanceof C1632420sa8) {
            return;
        }
        AbstractC1632340sa0 abstractC1632340sa0LIZJ4 = wo1().LIZJ();
        abstractC1632340sa0LIZJ4.getClass();
        if (abstractC1632340sa0LIZJ4 instanceof C1632400sa6) {
            AbstractC1632340sa0 abstractC1632340sa0LIZJ5 = wo1().LIZJ();
            if (!(abstractC1632340sa0LIZJ5 instanceof C1632400sa6) || (c1632400sa6 = (C1632400sa6) abstractC1632340sa0LIZJ5) == null) {
                return;
            }
            m3(c1632400sa6);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLJIJJLI;
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        LiveEvent<Unit> liveEventIq0;
        C385670FAf<Boolean> c385670FAfA31;
        super.onCreate();
        e0 cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null && (c385670FAfA31 = cameraApiComponent.A31()) != null) {
            c385670FAfA31.LIZ(this, new AObjectS246S0100000_25(this, 456));
        }
        q stickerApi = getStickerApi();
        if (stickerApi != null && (liveEventIq0 = stickerApi.Iq0()) != null) {
            liveEventIq0.LIZ(this, new AObjectS246S0100000_25(this, 457));
        }
        W2().Ry2().LIZ(this, new AObjectS246S0100000_25(this, 458));
        W2().Tk0().LIZ(this, new AObjectS246S0100000_25(this, 459));
        e0 cameraApiComponent2 = getCameraApiComponent();
        if (cameraApiComponent2 != null && (interfaceC2254081DKkSt2 = cameraApiComponent2.St2()) != null && (effectController = interfaceC2254081DKkSt2.getEffectController()) != null) {
            effectController.to(this.LLIZLLLIL);
        }
        q stickerApi2 = getStickerApi();
        if (stickerApi2 != null && (interfaceC1624480sNKC0 = stickerApi2.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLJIJJLI = interfaceC1625470sOvLJII.LJIJJLI()) != null) {
            mutableLiveDataLJIJJLI.observe(this, new AObserverS227S0100000_25(this, 56));
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C1631640sYs(this, null), 2);
        wo1().LIZ(this, new AObjectS246S0100000_25(this, 460));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        super.onDestroy();
        e0 cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent == null || (interfaceC2254081DKkSt2 = cameraApiComponent.St2()) == null || (effectController = interfaceC2254081DKkSt2.getEffectController()) == null) {
            return;
        }
        effectController.Tn(this.LLIZLLLIL);
    }

    @Override // X.InterfaceC1420200n3q
    public boolean x62() {
        Effect effect;
        q stickerApi;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        AbstractC1632340sa0 abstractC1632340sa0LIZJ = wo1().LIZJ();
        AFwS214S0000000_25 aFwS214S0000000_25 = AFwS214S0000000_25.get$arr$(288);
        abstractC1632340sa0LIZJ.getClass();
        if (abstractC1632340sa0LIZJ instanceof C1632420sa8) {
            effect = ((C1632420sa8) abstractC1632340sa0LIZJ).LIZ;
        } else {
            aFwS214S0000000_25.invoke();
            effect = null;
        }
        return (effect == null || (stickerApi = getStickerApi()) == null || (interfaceC1624480sNKC0 = stickerApi.C0()) == null || !C1626430sQT.LIZ(interfaceC1624480sNKC0, effect, true)) ? false : true;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        T2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1420200n3q
    public C385670FAf<AbstractC1632340sa0> wo1() {
        return this.LLILZIL;
    }

    public C1632310sZx(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0sa1] */
    private final void G2(final String str) {
        q stickerApi = getStickerApi();
        if (stickerApi == null) {
            this.LLILZIL.LJII(new C1632400sa6(wo1().LIZJ(), null));
        } else {
            C1632390sa5.LIZ("Fetching green screen effect from local");
            stickerApi.C0().getStickerRepository().LJJI().LJI(str, new IFetchEffectChannelListener() { // from class: X.0sa1
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                    C1632390sa5.LIZ("Error: Fetching green screen effect from local");
                    this.LIZ.H2(str);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    List<Effect> allCategoryEffects;
                    Effect effect;
                    EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                    if (effectChannelResponse2 != null && (allCategoryEffects = effectChannelResponse2.getAllCategoryEffects()) != null && (effect = (Effect) C13LP.LJJJLL(allCategoryEffects)) != null) {
                        C1632310sZx c1632310sZx = this.LIZ;
                        String str2 = str;
                        C1632390sa5.LIZ("Success: Fetching green screen effect from local");
                        c1632310sZx.LLILZIL.LJII(new C1632410sa7(effect));
                        c1632310sZx.H2(str2);
                        return;
                    }
                    this.LIZ.H2(str);
                }
            });
        }
    }

    private final void m3(C1632400sa6 c1632400sa6) {
        this.LLILZIL.LJII(c1632400sa6.LIZ);
    }

    private final void q3(boolean z) {
        this.LLJ.storeBoolean("keva_green_screen_guidance_key", z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0sZz] */
    public final void H2(String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        q stickerApi = getStickerApi();
        if (stickerApi == null) {
            if (wo1().LIZJ() instanceof C1632430sa9) {
                this.LLILZIL.LJII(new C1632400sa6(wo1().LIZJ(), null));
                C1408810mlT c1408810mlT = C1408810mlT.LIZ;
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                c1408810mlT.getClass();
                C1408810mlT.LIZ(iCurrentTimeMillis, 0, 50001, null, "model", "sticker Api not init");
                return;
            }
            return;
        }
        if (!C560970LzL.LIZ(C1664590tQ1.LJIIIZ(this))) {
            if (wo1().LIZJ() instanceof C1632430sa9) {
                this.LLILZIL.LJII(new C1632400sa6(wo1().LIZJ(), null));
                C1408810mlT c1408810mlT2 = C1408810mlT.LIZ;
                int iCurrentTimeMillis2 = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                c1408810mlT2.getClass();
                C1408810mlT.LIZ(iCurrentTimeMillis2, 0, 50002, null, "model", "client has no net");
                return;
            }
            return;
        }
        C1632390sa5.LIZ("Fetching green screen effect from remote");
        stickerApi.C0().getStickerRepository().LJJI().LIZLLL(str, new IFetchEffectChannelListener() { // from class: X.0sZz
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult exceptionResult) {
                int errorCode;
                String msg;
                C1632390sa5.LIZ("Error: Fetching green screen effect from remote");
                if (this.LIZ.wo1().LIZJ() instanceof C1632430sa9) {
                    C1632310sZx c1632310sZx = this.LIZ;
                    c1632310sZx.LLILZIL.LJII(new C1632400sa6(c1632310sZx.wo1().LIZJ(), exceptionResult));
                    C1408810mlT c1408810mlT3 = C1408810mlT.LIZ;
                    int iCurrentTimeMillis3 = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                    if (exceptionResult != null) {
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        errorCode = 40002;
                    }
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "download fail with unknown error";
                    }
                    c1408810mlT3.getClass();
                    C1408810mlT.LIZ(iCurrentTimeMillis3, 0, errorCode, null, "model", msg);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                List<Effect> allCategoryEffects;
                List<Effect> allCategoryEffects2;
                Effect effect;
                EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                if (effectChannelResponse2 != null && (allCategoryEffects2 = effectChannelResponse2.getAllCategoryEffects()) != null && (effect = (Effect) C13LP.LJJJLL(allCategoryEffects2)) != null) {
                    C1632310sZx c1632310sZx = this.LIZ;
                    long j = jCurrentTimeMillis;
                    C1632390sa5.LIZ("Success: Fetching green screen effect from remote");
                    if (c1632310sZx.wo1().LIZJ() instanceof C1632430sa9) {
                        c1632310sZx.LLILZIL.LJII(new C1632410sa7(effect));
                        C1408810mlT c1408810mlT3 = C1408810mlT.LIZ;
                        String effectId = effect.getEffectId();
                        int iCurrentTimeMillis3 = (int) (System.currentTimeMillis() - j);
                        c1408810mlT3.getClass();
                        C1408810mlT.LIZ(iCurrentTimeMillis3, 1, 0, effectId, "model", "");
                        return;
                    }
                    return;
                }
                C1632310sZx c1632310sZx2 = this.LIZ;
                long j2 = jCurrentTimeMillis;
                if (!(c1632310sZx2.wo1().LIZJ() instanceof C1632430sa9)) {
                    return;
                }
                h0<AbstractC1632340sa0> h0Var = c1632310sZx2.LLILZIL;
                AbstractC1632340sa0 abstractC1632340sa0LIZJ = c1632310sZx2.wo1().LIZJ();
                ExceptionResult exceptionResult = new ExceptionResult(40001);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("response is ");
                sbLIZ.append(effectChannelResponse2);
                exceptionResult.setMsg(C2188811AlT.LIZIZ(sbLIZ));
                h0Var.LJII(new C1632400sa6(abstractC1632340sa0LIZJ, exceptionResult));
                C1408810mlT c1408810mlT4 = C1408810mlT.LIZ;
                int iCurrentTimeMillis4 = (int) (System.currentTimeMillis() - j2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("response is ");
                if (effectChannelResponse2 != null) {
                    allCategoryEffects = effectChannelResponse2.getAllCategoryEffects();
                } else {
                    allCategoryEffects = null;
                }
                sbLIZ2.append(allCategoryEffects);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c1408810mlT4.getClass();
                C1408810mlT.LIZ(iCurrentTimeMillis4, 0, 40001, null, "model", strLIZIZ);
            }
        });
    }

    public final void Z1(final Effect effect) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC1625550sP3 interfaceC1625550sP3 = new InterfaceC1625550sP3() { // from class: X.0sZy
            @Override // X.InterfaceC1625550sP3
            public final void LJIIIIZZ(Effect effect2) {
            }

            @Override // X.InterfaceC1625550sP3
            public final void onSuccess(Effect effect2) {
                this.LL.LLILZIL.LJII(new C1632420sa8(effect));
                C1632390sa5.LIZ("download green screen effect resource progress success");
                C1408810mlT c1408810mlT = C1408810mlT.LIZ;
                String effectId = effect.getEffectId();
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                c1408810mlT.getClass();
                C1408810mlT.LIZ(iCurrentTimeMillis, 1, 0, effectId, "source", "");
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJII(int i, Effect effect2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download green screen effect resource progress: ");
                sbLIZ.append(i);
                C1632390sa5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC1625550sP3
            public final void LJIILLIIL(Effect effect2, ExceptionResult exceptionResult) {
                C1632310sZx c1632310sZx = this.LL;
                c1632310sZx.LLILZIL.LJII(new C1632400sa6(c1632310sZx.wo1().LIZJ(), exceptionResult));
                C1408810mlT c1408810mlT = C1408810mlT.LIZ;
                String effectId = effect.getEffectId();
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() - jCurrentTimeMillis);
                int errorCode = exceptionResult.getErrorCode();
                String msg = exceptionResult.getMsg();
                if (msg == null) {
                    msg = "download fail with unknown error";
                }
                c1408810mlT.getClass();
                C1408810mlT.LIZ(iCurrentTimeMillis, 0, errorCode, effectId, "source", msg);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("download green screen effect resource progress fail: ");
                sbLIZ.append(exceptionResult.getException());
                C201955140j.LJIIIIZZ(C1632460saC.LIZIZ, "green_screen_resource_tag", C2188811AlT.LIZIZ(sbLIZ));
            }
        };
        q stickerApi = getStickerApi();
        if (stickerApi == null) {
            this.LLILZIL.LJII(new C1632400sa6(wo1().LIZJ(), null));
        } else {
            C1632390sa5.LIZ("ready download green screen effect resource");
            stickerApi.C0().LJJLIIIIJ(new C1629340sVA(effect, true, null, 4), interfaceC1625550sP3);
        }
    }

    public final void i3(boolean z) {
        InterfaceC2254081DKk interfaceC2254081DKkSt2;
        InterfaceC1645720sva effectController;
        e0 cameraApiComponent = getCameraApiComponent();
        if (cameraApiComponent != null && (interfaceC2254081DKkSt2 = cameraApiComponent.St2()) != null && (effectController = interfaceC2254081DKkSt2.getEffectController()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("turn_off_camera", !z ? 1 : 0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("interface", "GREEN_SCREEN_MEDIA_SWITCH");
            jSONObject2.put("body", jSONObject);
            effectController.sendEffectMsg(41, 41L, 1L, C786410Ut5.J3(jSONObject2));
        }
    }

    public final void w2(String str) {
        C1632390sa5.LIZ("Fetching green screen effect");
        G2(str);
    }

    private final C1632420sa8 X1(C1632420sa8 c1632420sa8, Function1<? super Effect, Unit> function1) {
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        q stickerApi = getStickerApi();
        if (stickerApi != null && (interfaceC1624480sNKC0 = stickerApi.C0()) != null && C1626430sQT.LIZ(interfaceC1624480sNKC0, c1632420sa8.LIZ, true)) {
            return c1632420sa8;
        }
        function1.invoke(c1632420sa8.LIZ);
        return null;
    }
}
