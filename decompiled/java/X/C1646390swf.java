package X;

import Y.AObjectS246S0100000_25;
import android.view.MotionEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.h0;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.template.VideoTemplateSlot;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.component.a;
import com.ss.android.ugc.aweme.texttoimage.ITextToImageService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.bottom.IBottomTabChangeService;
import com.ss.android.ugc.gamora.recorder.splitshoot.s;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0swf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646390swf extends AbstractC2255721DQs<InterfaceC1638550sk1> implements InterfaceC1638550sk1, InterfaceC379610EuV {
    public static final C1646460swm LLJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLILLLLZIIL;
    public static final int LLJLL;
    public final C1DRG LL;
    public boolean LLJJIJI;
    public String LLJJIJIL;
    public final C01GW LLJJJ;
    public final C538770LBb<Integer> LLJJJIL;
    public boolean LLJJJJ;
    public String LLJJJJJIL;
    public final List<InterfaceC1646450swl> LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), a.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648570t0B.class, null);
    public final l0 LLILZIL = (l0) getDiContainer().LJIIL(null, l0.class);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648020szI.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1650230t2r.class, null);
    public final InterfaceC1731706qJ LLJ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1648510t05.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1647420syK.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C0MFK.class, null);
    public final C1646390swf LLJILJIL = this;
    public final h0<Integer> LLJILJILJ = new h0<>(8);
    public final h0<Unit> LLJILLL = new h0<>(Unit.LIZ);
    public final C560530Lyd<C1646670sx7> LLJJ = new C560530Lyd<>();
    public final C560530Lyd<C1647390syH> LLJJI = new C560530Lyd<>();
    public final h0<String> LLJJIII = new h0<>(null);
    public boolean LLJJIJIIJIL = true;

    /* JADX WARN: Type inference failed for: r0v18, types: [X.0swm] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1646390swf.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJLILLLLZIIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1646390swf.class, "stickerApi", "getStickerApi()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C2217381BqS(C1646390swf.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C2217381BqS(C1646390swf.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C2217381BqS(C1646390swf.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C2217381BqS(C1646390swf.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C2217381BqS(C1646390swf.class, "gestureApiComponent", "getGestureApiComponent()Lcom/bytedance/creativex/recorder/gesture/api/GestureApiComponent;", 0), new C2217381BqS(C1646390swf.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0), new C2217381BqS(C1646390swf.class, "recordTooltipComponent", "getRecordTooltipComponent()Lcom/ss/android/ugc/gamora/recorder/tooltip/RecordTooltipApiComponent;", 0)};
        LLJLIL = new Object() { // from class: X.0swm
        };
        LLJLL = 8;
    }

    private final C1646430swj H2() {
        return (C1646430swj) this.LLJJJ.getValue();
    }

    private final boolean H3() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    private final boolean O3() {
        l0 l0Var = this.LLILZIL;
        return l0Var != null && C1624010sMZ.LIZJ(l0Var);
    }

    private final InterfaceC1648020szI Op() {
        return (InterfaceC1648020szI) this.LLILZLL.getValue(this, LLJLILLLLZIIL[3]);
    }

    private final AbstractC21664519qV T2() {
        return new AbstractC21664519qV() { // from class: X.0swg
            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.getPlanCUIApiComponent().HF1()) {
                    return false;
                }
                C1646390swf c1646390swf = this.LL;
                if (!c1646390swf.LLJJIJI || (numLIZJ = c1646390swf.LLJILJILJ.LIZJ()) == null || numLIZJ.intValue() != 0 || !this.LL.G2().A70() || C539900LFk.LIZIZ(this.LL.getShortVideoContext())) {
                    return false;
                }
                if (motionEvent != null && motionEvent2 != null) {
                    AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                    if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                    if (abstractC21664519qVZk12 != null && abstractC21664519qVZk12.onFling(motionEvent, motionEvent2, f, f2)) {
                        return true;
                    }
                    return this.LL.G2().onFling(motionEvent, motionEvent2, f, f2);
                }
                return this instanceof r1k.a;
            }

            @Override // X.AbstractC21664719qX, X.InterfaceC21645719nT
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                Integer numLIZJ;
                if (this.LL.getCameraApiComponent().St2().I4() || this.LL.getCameraApiComponent().yC() || this.LL.getPlanCUIApiComponent().HF1()) {
                    return false;
                }
                C1646390swf c1646390swf = this.LL;
                if (!c1646390swf.LLJJIJI || (numLIZJ = c1646390swf.LLJILJILJ.LIZJ()) == null || numLIZJ.intValue() != 0 || motionEvent == null || motionEvent2 == null) {
                    return false;
                }
                AbstractC21664519qV abstractC21664519qVZk1 = this.LL.getGestureApiComponent().zk1(1);
                if (abstractC21664519qVZk1 != null && abstractC21664519qVZk1.onScroll(motionEvent, motionEvent2, f, f2)) {
                    return true;
                }
                AbstractC21664519qV abstractC21664519qVZk12 = this.LL.getGestureApiComponent().zk1(6);
                if ((abstractC21664519qVZk12 == null || !abstractC21664519qVZk12.onScroll(motionEvent, motionEvent2, f, f2)) && Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
                    return false;
                }
                return true;
            }
        };
    }

    private final C1624060sMe c3() {
        return (C1624060sMe) this.LLJJL.getValue();
    }

    private final InterfaceC1647420syK getRecordAdapterApi() {
        return (InterfaceC1647420syK) this.LLJI.getValue(this, LLJLILLLLZIIL[7]);
    }

    private final q getStickerApi() {
        return (q) this.LLILLL.getValue(this, LLJLILLLLZIIL[1]);
    }

    private final C0MFK i3() {
        return (C0MFK) this.LLJIJIL.getValue(this, LLJLILLLLZIIL[8]);
    }

    public final InterfaceC1649550t1l W2() {
        return (InterfaceC1649550t1l) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InterfaceC1650230t2r getCameraApiComponent() {
        return (InterfaceC1650230t2r) this.LLIZLLLIL.getValue(this, LLJLILLLLZIIL[5]);
    }

    public final InterfaceC1648510t05 getGestureApiComponent() {
        return (InterfaceC1648510t05) this.LLJ.getValue(this, LLJLILLLLZIIL[6]);
    }

    public final a getPlanCUIApiComponent() {
        return (a) this.LLILLJJLI.getValue(this, LLJLILLLLZIIL[0]);
    }

    public final InterfaceC1648570t0B getRecordControlApi() {
        return (InterfaceC1648570t0B) this.LLILZ.getValue(this, LLJLILLLLZIIL[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJLILLLLZIIL[4]);
    }

    @Override // X.InterfaceC1638550sk1
    public boolean hy() {
        Integer numLIZJ;
        return this.LLJJIJI && (numLIZJ = this.LLJILJILJ.LIZJ()) != null && numLIZJ.intValue() == 0;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        C201955140j.LJIILJJIL(C201967140v.LIZIZ, "SplitShootComponent onDestroy");
        super.onDestroy();
        getRecordAdapterApi().ai0(null);
    }

    public final InterfaceC1646440swk G2() {
        return (AbstractC578120Mlu) H2().LIZIZ.getValue();
    }

    @Override // X.InterfaceC1638550sk1
    public int LLJJJJLIIL() {
        return G2().LLJJJJLIIL();
    }

    @Override // X.InterfaceC1638550sk1
    public int Oj2() {
        return G2().dW1();
    }

    @Override // X.InterfaceC1638550sk1
    public String Wg() {
        return G2().Wg();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        String tag;
        C560530Lyd c560530LydLIZJ;
        InterfaceC1624480sNK interfaceC1624480sNKC0;
        InterfaceC1625470sOv interfaceC1625470sOvLJII;
        MutableLiveData mutableLiveDataLIZ;
        super.onCreate();
        getRecordAdapterApi().ai0(this);
        C201967140v c201967140v = C201967140v.LIZIZ;
        C201955140j.LJIILJJIL(c201967140v, "SplitShootComponent onCreate");
        C0MFK c0mfkI3 = i3();
        if (c0mfkI3 != null) {
            c0mfkI3.ig(new InterfaceC1654640t9y() { // from class: X.0swi
                public final EnumC1654620t9w LL = EnumC1654620t9w.TEXT_MODE;

                @Override // X.InterfaceC1654640t9y
                public final void z0() {
                }

                @Override // X.InterfaceC1654640t9y
                public final void H() {
                    this.LLILLJJLI.G2().Bh1();
                }

                @Override // X.InterfaceC1654640t9y
                public final boolean LJJLIL() {
                    Integer numLIZJ;
                    this.LLILLJJLI.getShortVideoContext();
                    return ((ITextToImageService) ServiceManager.get().getService(ITextToImageService.class)).LJJIFFI() && (numLIZJ = this.LLILLJJLI.LLJILJILJ.LIZJ()) != null && numLIZJ.intValue() == 0 && this.LLILLJJLI.QA1(EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag());
                }

                @Override // X.InterfaceC1654640t9y
                public final EnumC1654620t9w LJJI() {
                    return this.LL;
                }
            });
        }
        this.LLJJIJIL = C0CHQ.LIZ().LJJJJJ().getDefaultShootTabTag(getShortVideoContext());
        if (!C539900LFk.LIZ(getShortVideoContext())) {
            tag = this.LLJJIJIL;
        } else if (getShortVideoContext().LJJIL()) {
            JN0(false);
            tag = EnumC1647570syZ.RECORD_NOW.getTag();
        } else {
            String strLJ = C539900LFk.LJ(getShortVideoContext());
            VideoTemplateSlot.Companion.getClass();
            if (Intrinsics.LJFF(strLJ, VideoTemplateSlot.MATERIAL_TYPE_VIDEO)) {
                JN0(false);
            }
            tag = "record_custom_duration_video";
        }
        this.LLJJIJIL = tag;
        H2().LIZIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentShootModeTag initiated to ");
        sbLIZ.append(this.LLJJIJIL);
        C201955140j.LIZLLL(c201967140v, "SplitShootComponent", C2188811AlT.LIZIZ(sbLIZ));
        getRecordControlApi().zx2().LIZ(this, new AObjectS246S0100000_25(this, 535));
        hb1().LIZ(this, new AObjectS246S0100000_25(this, 536));
        getRecordControlApi().yM2().LIZ(this, new AObjectS246S0100000_25(this, 537));
        l0 l0Var = this.LLILZIL;
        if (l0Var != null && (interfaceC1624480sNKC0 = l0Var.C0()) != null && (interfaceC1625470sOvLJII = interfaceC1624480sNKC0.LJII()) != null && (mutableLiveDataLIZ = interfaceC1625470sOvLJII.LIZ()) != null) {
            mutableLiveDataLIZ.observe(this, new AObjectS246S0100000_25(this, 538));
        }
        getRecordControlApi().xk1().LJ(this, new AObjectS246S0100000_25(this, 539));
        if (((IAVServiceProxy) ServiceManager.get().getService(IAVServiceProxy.class)).getStoryService().LJI()) {
            getGestureApiComponent().xX0(T2(), 3);
        }
        G2().AC0().LIZ(this, new AObjectS246S0100000_25(this, 540));
        IBottomTabChangeService iBottomTabChangeService = (IBottomTabChangeService) PluggableExtentionKt.pluggableSpi$default(IBottomTabChangeService.class, false, false, false, 14, null);
        if (iBottomTabChangeService == null || (c560530LydLIZJ = iBottomTabChangeService.LIZJ()) == null) {
            return;
        }
        c560530LydLIZJ.LJII(this, Lifecycle.State.CREATED, new AObjectS246S0100000_25(this, 541));
    }

    @Override // X.InterfaceC1638550sk1
    public /* bridge */ /* synthetic */ C385670FAf Cx2() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1638550sk1
    public C560530Lyd<C1647390syH> hb1() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1638550sk1
    public /* bridge */ /* synthetic */ C385670FAf jP0() {
        return this.LLJJIII;
    }

    public h0<Integer> m3() {
        return this.LLJILJILJ;
    }

    public h0<String> q3() {
        return this.LLJJIII;
    }

    public C1646390swf w2() {
        return this.LLJILJIL;
    }

    private final void W1(Effect effect) {
        String name;
        String template_effect_id;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", getShortVideoContext().getCreationId());
        c0lab.LJ("enter_from", "video_shoot_page");
        c0lab.LJ("shoot_way", getShortVideoContext().shootWay);
        String effectId = null;
        if (effect != null) {
            name = effect.getName();
        } else {
            name = null;
        }
        c0lab.LJ("template_name", name);
        if (effect != null) {
            template_effect_id = effect.getTemplate_effect_id();
        } else {
            template_effect_id = null;
        }
        int i = 1;
        if (template_effect_id != null && template_effect_id.length() != 0) {
            if (effect != null) {
                effectId = effect.getTemplate_effect_id();
            }
        } else if (effect != null) {
            effectId = effect.getEffectId();
        }
        c0lab.LJ("template_id", effectId);
        if (effect == null || effect.getEffectType() != 0) {
            i = 0;
        }
        c0lab.LIZ(i, "is_pro_template");
        C20684815ws.LJIILLIIL("show_switching_shooting_mode_popup", c0lab.LIZ);
    }

    private final void v3(Effect effect) {
        String strLIZ = C1449600npG.LIZ(effect);
        if (Intrinsics.LJFF(strLIZ, "video_15")) {
            C1631530sYh.LIZ.getClass();
            B3(effect, C1631530sYh.LIZIZ);
            return;
        }
        if (Intrinsics.LJFF(strLIZ, "video_60")) {
            C1631530sYh.LIZ.getClass();
            B3(effect, C1631530sYh.LIZJ);
            return;
        }
        if (Intrinsics.LJFF(strLIZ, "video_180")) {
            ShortVideoContext shortVideoContext = getShortVideoContext();
            if (C577980Mlg.LIZ() != 0 && !shortVideoContext.LJJLL() && (!((Boolean) C286960BMo.LIZ.getValue()).booleanValue() || C577940Mlc.LIZ() == 0 || C577940Mlc.LIZ() == 0 || shortVideoContext.LJJLL())) {
                C1631530sYh.LIZ.getClass();
                B3(effect, C1631530sYh.LIZLLL);
                return;
            }
        }
        if (!Intrinsics.LJFF(strLIZ, "video_600")) {
            return;
        }
        ShortVideoContext shortVideoContext2 = getShortVideoContext();
        if (C577940Mlc.LIZ() == 0 || shortVideoContext2.LJJLL()) {
            return;
        }
        C1631530sYh.LIZ.getClass();
        B3(effect, C1631530sYh.LJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E3(com.ss.android.ugc.effectmanager.effect.model.Effect r4) {
        /*
            r3 = this;
            X.0szI r0 = r3.Op()
            java.lang.String r1 = r0.getCurrentBottomTag()
            if (r4 != 0) goto Lb
            return
        Lb:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
            boolean r0 = X.C539900LFk.LJI(r0)
            if (r0 == 0) goto L16
            return
        L16:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
            X.0nbh r0 = r0.LIZJ()
            boolean r0 = r0.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L28
            return
        L28:
            java.lang.String r0 = "RecordShoot180s"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L47
            java.lang.String r0 = r3.LLJJJJJIL
            java.lang.String r1 = "invalid_duration"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 == 0) goto L54
            com.ss.android.ugc.gamora.recorder.sticker.l0 r0 = r3.LLILZIL
            if (r0 == 0) goto L48
            boolean r0 = X.C1624010sMZ.LIZJ(r0)
            if (r0 != r2) goto L48
        L44:
            r3.v3(r4)
        L47:
            return
        L48:
            java.util.List<java.lang.String> r0 = X.C579450Mo3.LIZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r3.getShortVideoContext()
            boolean r0 = X.C579450Mo3.LIZ(r0)
            if (r0 != 0) goto L44
        L54:
            java.lang.String r0 = r3.LLJJJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L47
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1646390swf.E3(com.ss.android.ugc.effectmanager.effect.model.Effect):void");
    }

    @Override // X.InterfaceC1638550sk1
    public void JN0(boolean z) {
        int i;
        this.LLJJIJI = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        us0(i);
    }

    @Override // X.InterfaceC1638550sk1
    public boolean QA1(String str) {
        return ((s) H2().LIZIZ.getValue()).LLJZ.contains(str);
    }

    @Override // X.InterfaceC1638550sk1
    public void U7(int i) {
        this.LLJJJIL.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1638550sk1
    public void Ut1(boolean z) {
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1638550sk1
    public void d30(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // X.InterfaceC1638550sk1
    public void m5(C1646490swp c1646490swp) {
        InterfaceC1646450swl next;
        Iterator<InterfaceC1646450swl> it2 = this.LLJJJJLIIL.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.YJ1().LIZJ, this.LLJJIJIL)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC1646450swl interfaceC1646450swl = next;
        if (interfaceC1646450swl != null) {
            interfaceC1646450swl.m5(c1646490swp);
        }
        c3().LIZIZ(c1646490swp.LJ);
    }

    @Override // X.InterfaceC1638550sk1
    public void mK(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public final boolean o4(C1647390syH c1647390syH) {
        if (c1647390syH == null) {
            return true;
        }
        C1646160swI c1646160swI = EnumC1647570syZ.Companion;
        Object obj = c1647390syH.LIZIZ;
        c1646160swI.getClass();
        if (!C1646160swI.LIZIZ(obj) && !C1646160swI.LIZIZ(c1647390syH.LIZ)) {
            return c1647390syH.LJ;
        }
        return false;
    }

    @Override // X.InterfaceC1638550sk1
    public void pe1(boolean z) {
        if (this.LLJJIJI) {
            if (z && !getShortVideoContext().cameraComponentModel.isRetakeMode) {
                if (getShortVideoContext().LJII() > 0) {
                    us0(8);
                    return;
                } else {
                    us0(0);
                    return;
                }
            }
            us0(8);
        }
    }

    @Override // X.InterfaceC1638550sk1
    public void setTabSwitchEnabled(boolean z) {
        G2().setTabSwitchEnabled(z);
        Op().setTabSwitchEnabled(z);
    }

    @Override // X.InterfaceC1638550sk1
    public void us0(int i) {
        if (!this.LLJJIJIIJIL && i == 0) {
            return;
        }
        h0<Integer> h0Var = this.LLJILJILJ;
        if (!this.LLJJJJ) {
            i = 8;
        }
        h0Var.LJII(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1638550sk1
    public void yf(C1646490swp c1646490swp) {
        int i;
        c1646490swp.LJ = this.LLJJIJIL;
        c1646490swp.LIZLLL = o4(c1646490swp.LIZJ);
        C1647390syH c1647390syH = c1646490swp.LIZJ;
        if (c1647390syH != null) {
            i = c1647390syH.LIZJ;
        } else {
            i = 0;
        }
        Q3(c1646490swp, true, i);
        this.LLJILLL.LJII(Unit.LIZ);
    }

    public final void z4(boolean z) {
        if (!this.LLJJIJI) {
            return;
        }
        if (z && getShortVideoContext().LJII() <= 0) {
            if (!getShortVideoContext().cameraComponentModel.isRetakeMode) {
                us0(0);
                return;
            }
            return;
        }
        us0(8);
    }

    public C1646390swf(C19A3 c19a3, C1DRG c1drg) {
        this.LL = c1drg;
        C1631530sYh.LIZ.getClass();
        this.LLJJIJIL = C1631530sYh.LIZIZ;
        this.LLJJJ = C452501pT.LIZIZ(new AwS426S0200000_25(c19a3, this, 95));
        this.LLJJJIL = new C538770LBb<>(0);
        this.LLJJJJ = true;
        this.LLJJJJJIL = "";
        this.LLJJJJLIIL = new ArrayList();
        this.LLJJL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 598));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(299));
        this.LLJL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
    }

    private final void B3(Effect effect, String str) {
        l0 l0Var;
        InterfaceC1623190sLF interfaceC1623190sLFU;
        if (!Intrinsics.LJFF(this.LLJJIJIL, str)) {
            if (C1449600npG.LJIIIIZZ(effect) || Z1(C1449600npG.LIZ(effect), this.LLJJIJIL)) {
                if (O3() && H3() && (l0Var = this.LLILZIL) != null && (interfaceC1623190sLFU = l0Var.U()) != null) {
                    interfaceC1623190sLFU.hide();
                }
                X1(effect, str);
            }
        }
    }

    private final void X1(Effect effect, String str) {
        W1(effect);
        C1389890mGx c1389890mGx = new C1389890mGx(C1664590tQ1.LJII(this));
        c1389890mGx.LJIIJ(C1664590tQ1.LJII(this).getString(2131821844));
        c1389890mGx.LJIIJJI();
        gj(str, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean Z1(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_15
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            java.lang.String r5 = "video_180"
            java.lang.String r4 = "video_600"
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L3c
            int r1 = r7.hashCode()
            r0 = 1151385854(0x44a0c0fe, float:1286.031)
            if (r1 == r0) goto L33
            r0 = 1333218597(0x4f774d25, float:4.149028E9)
            if (r1 == r0) goto L2c
            r0 = 1333223154(0x4f775ef2, float:4.1501947E9)
            if (r1 != r0) goto L2b
            boolean r0 = r7.equals(r4)
            if (r0 != 0) goto L3b
        L2b:
            return r2
        L2c:
            boolean r0 = r7.equals(r5)
            if (r0 != 0) goto L3b
            return r2
        L33:
            java.lang.String r0 = "video_60"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L2b
        L3b:
            return r3
        L3c:
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_60
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L56
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r5)
            if (r0 != 0) goto L55
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
            if (r0 != 0) goto L55
            return r2
        L55:
            return r3
        L56:
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_180
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L6a
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r4)
            if (r0 == 0) goto L69
            return r3
        L69:
            return r2
        L6a:
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_COMBINE_600
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L77
            return r2
        L77:
            X.0syZ r0 = X.EnumC1647570syZ.RECORD_NOW
            java.lang.String r0 = r0.getTag()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L84
            return r3
        L84:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1646390swf.Z1(java.lang.String, java.lang.String):boolean");
    }

    @Override // X.InterfaceC1638550sk1
    public void gj(String str, boolean z) {
        G2().gj(str, z);
    }

    public final void Q3(C1646490swp c1646490swp, boolean z, int i) {
        String str;
        Object obj;
        String str2;
        boolean z2;
        String str3;
        String str4;
        boolean z3;
        String str5;
        InterfaceC1646450swl next;
        String str6 = c1646490swp.LJ;
        if (str6 == null) {
            str = this.LLJJIJIL;
        } else {
            str = str6;
        }
        this.LLJJIJIL = str;
        C1647390syH c1647390syH = c1646490swp.LIZJ;
        InterfaceC1646450swl interfaceC1646450swl = null;
        if (c1647390syH != null) {
            obj = c1647390syH.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (str6 != null) {
            str = str6;
        }
        a6n.a aVarProvideRecordEnv = Op().provideRecordEnv();
        if (aVarProvideRecordEnv.LIZ) {
            InterfaceC1646290swV interfaceC1646290swV = aVarProvideRecordEnv.LIZIZ;
            if (interfaceC1646290swV != null) {
                interfaceC1646290swV.n3("record");
            }
        } else {
            ln3.a aVar = aVarProvideRecordEnv.LIZLLL;
            if (aVar != null) {
                aVar.n3("record");
            }
        }
        C1631530sYh.LIZ.getClass();
        int iLIZIZ = C1631530sYh.LIZIZ(str);
        aVarProvideRecordEnv.LIZLLL().shootMode = iLIZIZ;
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTabSelectedInner from ");
        sbLIZ.append(str2);
        sbLIZ.append(" to ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c201967140v, "SplitShootComponent", C2188811AlT.LIZIZ(sbLIZ));
        if (str2 != null) {
            Iterator<InterfaceC1646450swl> it2 = this.LLJJJJLIIL.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.YJ1().LIZJ, str2)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC1646450swl interfaceC1646450swl2 = next;
            if (interfaceC1646450swl2 != null) {
                interfaceC1646450swl2.m5(c1646490swp);
            }
        }
        Iterator<InterfaceC1646450swl> it3 = this.LLJJJJLIIL.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            InterfaceC1646450swl next2 = it3.next();
            if (Intrinsics.LJFF(next2.YJ1().LIZJ, str)) {
                interfaceC1646450swl = next2;
                break;
            }
        }
        InterfaceC1646450swl interfaceC1646450swl3 = interfaceC1646450swl;
        if (interfaceC1646450swl3 != null) {
            interfaceC1646450swl3.yf(c1646490swp);
        }
        this.LLJJIII.LJII(str);
        e4(aVarProvideRecordEnv, str, aVarProvideRecordEnv.LIZLLL(), z, str2);
        ShortVideoContext shortVideoContextLIZLLL = aVarProvideRecordEnv.LIZLLL();
        if (z) {
            z2 = c1646490swp.LIZ;
        } else {
            z2 = false;
        }
        o2(str, shortVideoContextLIZLLL, z2, z);
        C1439190nYT.LJIIIIZZ(iLIZIZ);
        C1446240njq c1446240njq = C1446240njq.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        boolean z4 = c1646490swp.LIZ;
        c1446240njq.getClass();
        String strLIZ = C1646520sws.LIZ(str);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str3 = "";
                    } else {
                        str3 = "cross";
                    }
                } else {
                    str3 = "full_slide";
                }
            } else {
                str3 = "tab_bar_slide";
            }
        } else {
            str3 = "tab_bar_click";
        }
        if (z4) {
            str4 = "land";
            C1446240njq.LIZIZ = "by_default";
            str3 = "";
        } else if (!Intrinsics.LJFF(C1446240njq.LIZIZ(C1446240njq.LIZIZ), C1446240njq.LIZIZ(strLIZ))) {
            str4 = "outer";
        } else {
            str4 = "inner";
        }
        C0LAB c0lab = new C0LAB();
        C1446240njq.LIZ(c0lab, shortVideoContext);
        c0lab.LJ("to_status", strLIZ);
        c0lab.LJ("change_type", str4);
        c0lab.LJ("change_method", str3);
        c0lab.LJ("from_status", C1446240njq.LIZIZ);
        c0lab.LJ("shoot_tab_name", strLIZ);
        c0lab.LJ("enter_from", "video_shoot_page");
        if (Intrinsics.LJFF(strLIZ, "text")) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    str5 = "";
                } else {
                    str5 = "slide";
                }
            } else {
                str5 = "click";
            }
            c0lab.LJ("text_mode_enter_method", str5);
        }
        String str7 = shortVideoContext.creativeModel.initialModel.dmCameraModel.searchSessionId;
        if (str7 != null) {
            c0lab.LJ("search_session_id", str7);
        }
        if (shortVideoContext.creativeModel.initialModel.dmCameraModel.isFromEffectButton) {
            c0lab.LJ("is_chat_page_icon_effect", "1");
        }
        int i2 = shortVideoContext.creativeModel.initialModel.dmCameraModel.chatType;
        if (i2 != -1) {
            c0lab.LJ("chat_type", C912070ZqH.LIZIZ.LJFF().LJIJI(Integer.valueOf(i2)));
        }
        C20684815ws.LJIILLIIL("change_record_mode", c0lab.LIZ);
        C1446240njq.LIZIZ = strLIZ;
        if (c1646490swp.LIZLLL && C330830Cy1.LIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        Op().notifyBottomTabIndexChange(new C1647390syH(str2, str, i, false, z3, true, EnumC1647570syZ.RECORD_SPLIT_3MIN.getTag(), false, false, 384));
        q stickerApi = getStickerApi();
        if (stickerApi != null && Intrinsics.LJFF(stickerApi.qr1().LJI(), Boolean.TRUE)) {
            stickerApi.pp2(false, "");
        }
        c3().LIZIZ(str);
    }

    @Override // X.InterfaceC1638550sk1
    public void Yf(boolean z, int i, boolean z2) {
        G2().Yf(z, i, z2);
    }

    private final void o2(String str, ShortVideoContext shortVideoContext, boolean z, boolean z2) {
        boolean z3;
        C1631530sYh.LIZ.getClass();
        if (!C1631530sYh.LIZJ(str) && !Intrinsics.LJFF(C1631530sYh.LIZIZ, str)) {
            EnumC1647570syZ.Companion.getClass();
            if (!C1646160swI.LIZIZ(str)) {
                return;
            }
        }
        if (shortVideoContext.LJJLL()) {
            return;
        }
        C1648150szV c1648150szV = new C1648150szV(!C1631530sYh.LIZJ(str));
        if (!Intrinsics.LJFF(str, C1631530sYh.LIZLLL) && !Intrinsics.LJFF(str, C1631530sYh.LJ)) {
            z3 = false;
        } else {
            z3 = true;
        }
        c1648150szV.LIZIZ = z3;
        c1648150szV.LIZLLL = z;
        c1648150szV.LIZJ = 2;
        c1648150szV.LJ = !z2;
        Op().configSwitchDuration(c1648150szV);
    }

    private final void e4(a6n.a aVar, String str, ShortVideoContext shortVideoContext, boolean z, String str2) {
        int musicBeginTime;
        int duration;
        int musicStartFromCut;
        ArrayList<Integer> trimPointList;
        Integer num;
        C1631530sYh.LIZ.getClass();
        if (!C1631530sYh.LIZJ(str)) {
            if (Intrinsics.LJFF(C1631530sYh.LIZIZ, str)) {
                EnumC1647570syZ.Companion.getClass();
                if (C1646160swI.LIZIZ(str2)) {
                    return;
                }
            } else {
                return;
            }
        }
        if (shortVideoContext.LJJJJZI() && !shortVideoContext.cameraComponentModel.isEditorProRecordMode) {
            int i = 0;
            if (shortVideoContext.LJJZ()) {
                shortVideoContext.cameraComponentModel.mMusicStart = C1444030ngH.LIZIZ(shortVideoContext.stitchContext.stitchParams);
            } else if (!z) {
                AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
                if (aVMusicExtractAVMusic != null && ((((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ() || ((IMusicService) ServiceManager.get().getService(IMusicService.class)).LJJIJLIJ()) && aVMusicExtractAVMusic.isFullSong)) {
                    float previewStartTime = aVMusicExtractAVMusic.getPreviewStartTime();
                    float f = LSPassThroughRecordSizeConfig.DEFAULT;
                    shortVideoContext.cameraComponentModel.mMusicStart = (int) (previewStartTime * f);
                    shortVideoContext.creativeModel.musicBuzModel.musicStart = (int) (aVMusicExtractAVMusic.getPreviewStartTime() * f);
                } else if (C579130MnX.LIZ() && aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isNeedReuse()) {
                    shortVideoContext.cameraComponentModel.mMusicStart = aVMusicExtractAVMusic.getMusicBeginTime();
                    MusicBuzModel musicBuzModel = shortVideoContext.creativeModel.musicBuzModel;
                    if (aVMusicExtractAVMusic != null) {
                        musicBeginTime = aVMusicExtractAVMusic.getMusicBeginTime();
                    } else {
                        musicBeginTime = 0;
                    }
                    musicBuzModel.musicStart = musicBeginTime;
                    if (C1399580mWa.LIZ()) {
                        MusicBuzModel musicBuzModel2 = shortVideoContext.creativeModel.musicBuzModel;
                        int i2 = musicBuzModel2.originalMusicEndFromFollowup;
                        shortVideoContext.cameraComponentModel.musicEndTime = i2;
                        musicBuzModel2.musicEnd = i2;
                        musicBuzModel2.musicEndFromCut = i2;
                    }
                } else {
                    shortVideoContext.cameraComponentModel.mMusicStart = 0;
                    shortVideoContext.creativeModel.musicBuzModel.musicStart = 0;
                }
            }
            AVMusic aVMusicExtractAVMusic2 = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
            if (aVMusicExtractAVMusic2 != null) {
                duration = aVMusicExtractAVMusic2.getDuration();
                ArrayList<Integer> trimPointList2 = aVMusicExtractAVMusic2.getTrimPointList();
                if (trimPointList2 != null && !trimPointList2.isEmpty() && (trimPointList = aVMusicExtractAVMusic2.getTrimPointList()) != null && (num = (Integer) ListProtector.get(trimPointList, 0)) != null) {
                    musicStartFromCut = num.intValue();
                } else {
                    musicStartFromCut = aVMusicExtractAVMusic2.getMusicStartFromCut();
                }
            } else {
                duration = 0;
                musicStartFromCut = 0;
            }
            if (shortVideoContext.videoLength <= duration - musicStartFromCut && Intrinsics.LJFF(shortVideoContext.shootWay, "single_song")) {
                i = musicStartFromCut;
            }
            MusicBuzModel musicBuzModel3 = shortVideoContext.creativeModel.musicBuzModel;
            musicBuzModel3.musicStartFromCut = i;
            musicBuzModel3.musicEditFrom = "";
            C1439190nYT.LJII(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath(), MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel), shortVideoContext.cameraComponentModel.mMusicStart);
            if (C1652380t6K.LIZ(shortVideoContext)) {
                int iLIZ = C1442040nd4.LIZ(shortVideoContext, 0, null);
                aVar.LIZJ().G4(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath(), r1.mMusicStart, shortVideoContext.cameraComponentModel.mTotalRecordingTime, true, false, false, iLIZ, r1.musicEndTime);
                return;
            }
            aVar.LIZJ().G4(shortVideoContext.cameraComponentModel.mWorkspace.getMusicPath(), r1.mMusicStart, shortVideoContext.cameraComponentModel.mTotalRecordingTime, false, false, false, -1, -1L);
        }
    }
}
