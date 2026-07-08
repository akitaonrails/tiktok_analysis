package X;

import Y.ARunnableS3S0202000_16;
import android.text.TextUtils;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.als.LiveEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.120t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C196869120t extends AbstractC2255721DQs<InterfaceC1461650o8h> implements InterfaceC1461650o8h, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final FrameLayout LLILZ;
    public final boolean LLILZIL;
    public final InterfaceC1462140o9U LLILZLL;
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 663));
    public final LiveEvent<Unit> LLJ = new C560530Lyd();
    public final LiveEvent<Pair<Integer, Integer>> LLJI = new C560530Lyd();
    public final LiveEvent<StickerItemModel> LLJIJIL = new C560530Lyd();
    public final LiveEvent<C529150Kp7> LLJILJIL = new C560530Lyd();
    public final LiveEvent<Pair<Float, Long>> LLJILJILJ = new C560530Lyd();
    public final LiveEvent<C443120HZe<Float, Float, Float>> LLJILLL = new C560530Lyd();
    public final LiveEvent<Unit> LLJJ = new C560530Lyd();
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 184));
    public final InterfaceC1731706qJ LLJJIII = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C196869120t.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C196869120t.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public InterfaceC1461650o8h W1() {
        return this;
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLIZ.getValue(this, LLJJIJI[0]);
    }

    private final C196868120s o2() {
        return (C196868120s) this.LLJJI.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJJIII.getValue(this, LLJJIJI[1]);
    }

    @Override // X.InterfaceC1461650o8h
    public void show() {
        if (this.LLILLJJLI.isAdded(w2())) {
            return;
        }
        this.LLILLJJLI.add(this.LLILLL, w2(), "EditInfoStickerScene");
    }

    public final C196864120o w2() {
        return (C196864120o) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC1461650o8h
    public boolean B8() {
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null) {
            return c196871120v.LLJLIL;
        }
        return false;
    }

    @Override // X.InterfaceC1461650o8h
    public InterfaceC1444160ngU LJJIFFI() {
        return w2().LLLLIILL();
    }

    @Override // X.InterfaceC1461650o8h
    public void LJJJLZIJ() {
        ((C560530Lyd) Ks1()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461650o8h
    public void LLZZ() {
        C196871120v c196871120v = o2().LLILLL;
        if (c196871120v == null || c196871120v.LLIZLLLIL == null) {
            return;
        }
        c196871120v.LLJZ.LJII();
    }

    @Override // X.InterfaceC1461650o8h
    public List<StickerItemModel> Lm() {
        C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v == null || (c196870120u = c196871120v.LLIZLLLIL) == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = ((ArrayList) c196870120u.LIZ).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C196874120y) it2.next()).LLILLL);
        }
        return arrayList;
    }

    @Override // X.InterfaceC1461650o8h
    public void Nm() {
        C196870120u c196870120u;
        C196864120o c196864120oW2 = w2();
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C196864120o.LLJLLL;
        C196871120v c196871120v = c196864120oW2.LLLLIILL().LLILLL;
        if (c196871120v == null || (c196870120u = c196871120v.LLIZLLLIL) == null || C0IKQ.LIZ(c196870120u.LIZ)) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator it2 = ((ArrayList) c196870120u.LIZ).iterator();
        while (it2.hasNext()) {
            C196874120y c196874120y = (C196874120y) it2.next();
            c196870120u.LJFF.getClass();
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(c196870120u.LJ);
            long duration = c348100DkmLIZIZ.LIZIZ.getPlayerApi().getDuration();
            c348100DkmLIZIZ.LJIIIZ().LJIILJJIL(c196874120y.LLILLL.uuid);
            if (duration != c348100DkmLIZIZ.LIZIZ.getPlayerApi().getDuration()) {
                atomicBoolean.set(true);
            }
            it2.remove();
            C121P c121p = c196870120u.LJI;
            if (c121p != null) {
                c121p.LIZ(c196874120y.LLILLL, atomicBoolean.get());
            }
        }
        c196870120u.LIZIZ = null;
    }

    @Override // X.InterfaceC1461650o8h
    public void OC() {
        ((C560530Lyd) gG()).LJIIJ(new C529150Kp7());
    }

    @Override // X.InterfaceC1461650o8h
    public Object X7() {
        return w2().LLLLIILL().LLLII;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 != null) {
            interfaceC1455850nzLX1.PD1(this);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1455850nzL interfaceC1455850nzLX1 = X1();
        if (interfaceC1455850nzLX1 != null) {
            interfaceC1455850nzLX1.PD1(null);
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void pausePlay() {
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        if (c196868120sLLLLIILL.LLJJL) {
            c196868120sLLLLIILL.LJIIZILJ();
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void u1() {
        ((C560530Lyd) wq()).LJIIJ(Unit.LIZ);
    }

    @Override // X.InterfaceC1461650o8h
    public boolean ub() {
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null) {
            return c196871120v.LLJLILLLLZIIL;
        }
        return false;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<Pair<Float, Long>> Ak0() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<Unit> Ks1() {
        return this.LLJ;
    }

    public final InterfaceC1462140o9U Z1() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<Pair<Integer, Integer>> eQ2() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<C529150Kp7> gG() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<C443120HZe<Float, Float, Float>> mF2() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<StickerItemModel> v61() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1461650o8h
    public LiveEvent<Unit> wq() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1461650o8h
    public void Bh0(int i) {
        C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            C196874120y c196874120y = null;
            for (C196874120y c196874120y2 : (ArrayList) c196870120u.LIZ) {
                if (c196874120y2.LLILLL.getId() == i) {
                    c196874120y = c196874120y2;
                }
            }
            if (c196874120y != null) {
                c196870120u.LJFF(c196874120y);
            }
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Bt0(String str) {
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null) {
            c196871120v.LJI(str);
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Ci1(StickerItemModel stickerItemModel) {
        ((C560530Lyd) v61()).LJIIJ(stickerItemModel);
    }

    @Override // X.InterfaceC1461650o8h
    public void Dc2(final List<? extends StickerItemModel> list) {
        final C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null) {
            if (c196871120v.LLILLL != 0 && c196871120v.LLILZ != 0) {
                C196870120u c196870120u = c196871120v.LLIZLLLIL;
                if (c196870120u != null) {
                    c196870120u.LJIILL(list);
                    return;
                }
                return;
            }
            C786410Ut5.x3(c196871120v.getViewTreeObserver(), new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.121F
                public boolean LL;

                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    C196870120u c196870120u2;
                    c196871120v.LIZJ();
                    C196871120v c196871120v2 = c196871120v;
                    if (c196871120v2.LLILLL <= 0 || c196871120v2.LLILZ <= 0 || this.LL || (c196870120u2 = c196871120v2.LLIZLLLIL) == null) {
                        return;
                    }
                    c196870120u2.LJIILL(list);
                    this.LL = true;
                    C786410Ut5.C3(c196871120v.getViewTreeObserver(), this);
                }
            });
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Qj(String str) {
        C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            C196874120y c196874120y = null;
            for (C196874120y c196874120y2 : (ArrayList) c196870120u.LIZ) {
                if (c196874120y2.LLILLL.stickerId.equals(str)) {
                    c196874120y = c196874120y2;
                }
            }
            if (c196874120y != null) {
                c196870120u.LJFF(c196874120y);
            }
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Qq(C121I<?> c121i) {
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        if (!C12WG.LIZIZ(c196868120sLLLLIILL.LLILLJJLI)) {
            if (c196868120sLLLLIILL.LLLJ) {
                c196868120sLLLLIILL.LJIIL(true, c121i);
            } else {
                c196868120sLLLLIILL.LJIIJJI(true, c121i);
            }
        }
    }

    @Override // X.InterfaceC1461650o8h
    public StickerItemModel YS0(String str) {
        C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            for (C196874120y c196874120y : (ArrayList) c196870120u.LIZ) {
                StickerItemModel stickerItemModel = c196874120y.LLILLL;
                if (stickerItemModel != null && stickerItemModel.stickerId.equals(str)) {
                    return c196874120y.LLILLL;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1461650o8h
    public C196874120y eX(String str) {
        C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            for (C196874120y c196874120y : (ArrayList) c196870120u.LIZ) {
                StickerItemModel stickerItemModel = c196874120y.LLILLL;
                if (stickerItemModel != null && stickerItemModel.uuid.equals(str)) {
                    ((ArrayList) c196870120u.LIZ).remove(c196874120y);
                    return c196874120y;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1461650o8h
    public void fb1(InfoStickerModel infoStickerModel) {
        C196864120o c196864120oW2 = w2();
        c196864120oW2.getClass();
        C201955140j.LJIIL("restore info stickers");
        C196868120s c196868120sLLLLIILL = c196864120oW2.LLLLIILL();
        if (c196868120sLLLLIILL.LLILLL != null) {
            c196868120sLLLLIILL.LLILLL.LJIIIIZZ(infoStickerModel, true);
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void l0(Pair<Integer, Integer> pair) {
        ((C560530Lyd) eQ2()).LJIIJ(pair);
    }

    @Override // X.InterfaceC1461650o8h
    public void l7(C121I<?> c121i) {
        w2().LLLLIILL().LJIILIIL(c121i);
    }

    @Override // X.InterfaceC1461650o8h
    public void sB(boolean z) {
        final C196870120u c196870120u;
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            if (!z) {
                if (c196870120u.LJ != null) {
                    for (final C196874120y c196874120y : (ArrayList) c196870120u.LIZ) {
                        C391370FWd.LIZ("infosep#setAlpha", new Function0() { // from class: X.121K
                            public final /* synthetic */ float LLILLL = 0.0f;

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                C196870120u c196870120u2 = c196870120u;
                                C196874120y c196874120y2 = c196874120y;
                                c196870120u2.LJ.setInfoStickerAlpha(c196874120y2.LLILLL.getId(), this.LLILLL);
                                return null;
                            }
                        });
                        C391360FWc.LIZLLL("infosep#setAlpha", c196870120u.LJ, new Function1() { // from class: X.121G
                            public final /* synthetic */ float LLILLJJLI = 0.0f;

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                C196874120y c196874120y2 = c196874120y;
                                float f = this.LLILLJJLI;
                                C348100Dkm c348100Dkm = (C348100Dkm) obj;
                                C348440DlK c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(c196874120y2.LLILLL.uuid);
                                if (c348440DlKLJJIIJZLJL != null) {
                                    c348440DlKLJJIIJZLJL.LJIIIIZZ = f;
                                    c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                                    return null;
                                }
                                return null;
                            }
                        });
                    }
                }
            } else {
                Iterator it2 = ((ArrayList) c196870120u.LIZ).iterator();
                while (it2.hasNext()) {
                    c196870120u.LJIIJ((C196874120y) it2.next());
                }
            }
            c196871120v.invalidate();
        }
    }

    @Override // X.InterfaceC1461650o8h
    public boolean sL1(int i) {
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        C196871120v c196871120v = c196868120sLLLLIILL.LLILLL;
        if (c196871120v != null && c196871120v.getStickNumber() + i >= c196868120sLLLLIILL.LLJJIII) {
            C196871120v c196871120v2 = c196868120sLLLLIILL.LLILLL;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131836170);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZLLL(c196871120v2, 1035, creativeToastBuilder);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1461650o8h
    public void ss1(C121M c121m) {
        w2().LLJJLIIIJLLLLLLLZ = c121m;
    }

    @Override // X.InterfaceC1461650o8h
    public void v7(boolean z) {
        C196871120v c196871120v = w2().LLLLIILL().LLILLL;
        if (c196871120v != null) {
            c196871120v.LJIIJJI(z);
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Oi2(float f, long j) {
        ((C560530Lyd) Ak0()).LJIIJ(new Pair(Float.valueOf(f), Long.valueOf(j)));
    }

    @Override // X.InterfaceC1461650o8h
    public void QZ1(String str, float f) {
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        Float fValueOf = Float.valueOf(f);
        C196871120v c196871120v = c196868120sLLLLIILL.LLILLL;
        if (c196871120v != null) {
            C196870120u c196870120u = c196871120v.LLIZLLLIL;
            float fFloatValue = fValueOf.floatValue();
            C196874120y c196874120y = null;
            for (C196874120y c196874120y2 : (ArrayList) c196870120u.LIZ) {
                if (c196874120y2.LLILLL.uuid.equals(str)) {
                    c196874120y = c196874120y2;
                }
            }
            if (c196874120y != null) {
                c196874120y.LLILLL.scale = fFloatValue;
                c196874120y.LJIIIZ(fFloatValue / c196874120y.LLJILJIL);
            }
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void cF1(String str, int i) {
        o2().LJIJJLI(i, 0, str);
    }

    @Override // X.InterfaceC1461650o8h
    public void na2(Effect effect, Map<String, String> map) {
        VideoPublishEditModel editModel = getEditModel();
        if (!u4.LJLL(editModel) && C1444940nhk.LJII(editModel.getCanvasVideoData()) && C1429880nJS.LIZIZ(effect) && C123100dR.LIZ((String) C13LP.LJJJLL(effect.getIconUrl().getUrlList())) && C1462570oAB.LIZ(effect)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZ.plus(new C09AL())), null, null, new C353640Dti(effect, this, map, null), 3);
        } else {
            w2().LLLIIIIL(effect, map);
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void v1(int i, boolean z) {
        C196871120v c196871120v;
        C196870120u c196870120u;
        C196868120s c196868120sO2 = o2();
        VideoPublishEditModel videoPublishEditModel = c196868120sO2.LLJJIJIL;
        if (videoPublishEditModel != null && videoPublishEditModel.getInfoStickerModel() != null && !C0IKQ.LIZ(c196868120sO2.LLJJIJIL.getInfoStickerModel().stickers)) {
            for (StickerItemModel stickerItemModel : c196868120sO2.LLJJIJIL.getInfoStickerModel().stickers) {
                Pair<Integer, Integer> pairLIZ = C391130FVf.LIZ(stickerItemModel.uiStartTime, stickerItemModel.uiEndTime, i);
                stickerItemModel.uiStartTime = pairLIZ.getFirst().intValue();
                stickerItemModel.uiEndTime = pairLIZ.getSecond().intValue();
                stickerItemModel.startTime = pairLIZ.getFirst().intValue();
                stickerItemModel.endTime = pairLIZ.getSecond().intValue();
            }
        }
        if (z && (c196871120v = o2().LLILLL) != null && (c196870120u = c196871120v.LLIZLLLIL) != null) {
            for (C196874120y c196874120y : (ArrayList) c196870120u.LIZ) {
                if (c196874120y.LLILLL.isPin) {
                    AnonymousClass1214 anonymousClass1214 = c196871120v.LLLFFI;
                    if (anonymousClass1214 != null) {
                        anonymousClass1214.LIZ(c196874120y);
                    }
                    c196871120v.LJIIJ(c196874120y);
                    c196874120y.LLILLL.setPin(false);
                    C2286708xd.LJIJ(c196874120y.LLILLL.pinAlgorithmFile);
                    c196874120y.LLILLL.setPinAlgorithmFile(null);
                    C121M c121m = c196871120v.LLJL;
                    if (c121m != null) {
                        c121m.LIZJ();
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void Rg2(float f, float f2, float f3) {
        ((C560530Lyd) mF2()).LJIIJ(new C443120HZe(Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
    }

    @Override // X.InterfaceC1461650o8h
    public void a6(int i, int i2, int[] iArr) {
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        if (c196868120sLLLLIILL.LLJJIJI != null && c196868120sLLLLIILL.LLJLIL != null) {
            HandlerHook.viewPost(c196868120sLLLLIILL.LLJLIL, new ARunnableS3S0202000_16(c196868120sLLLLIILL, iArr, i, i2, 1));
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void nF0(String str, int i, int i2) {
        o2().LJIJJLI(i, i2, str);
    }

    @Override // X.InterfaceC1461650o8h
    public void sJ0(C348460DlM c348460DlM, String[] strArr, int i) {
        String str;
        String strLJIIL;
        C196868120s c196868120sLLLLIILL = w2().LLLLIILL();
        C196871120v c196871120v = c196868120sLLLLIILL.LLILLL;
        if (c196871120v != null) {
            if (c196871120v.getStickNumber() >= c196868120sLLLLIILL.LLJJIII) {
                C196871120v c196871120v2 = c196868120sLLLLIILL.LLILLL;
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131836170);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(c196871120v2, 1035, creativeToastBuilder);
                return;
            }
            C196871120v c196871120v3 = c196868120sLLLLIILL.LLILLL;
            C196870120u c196870120u = c196871120v3.LLIZLLLIL;
            if (c196870120u == null) {
                return;
            }
            C196874120y c196874120y = c196870120u.LIZIZ;
            if (c196874120y != null && c196874120y.LLILZIL) {
                c196874120y.LLILZIL = false;
            }
            if (strArr != null && strArr.length > 0) {
                str = strArr[0];
            } else {
                str = null;
            }
            c196870120u.LJFF.getClass();
            C348460DlM c348460DlM2 = new C348460DlM();
            c348460DlM2.LJIIL = c348460DlM.LJIIL;
            c348460DlM2.LJFF = c348460DlM.LJFF;
            c348460DlM2.LJI = c348460DlM.LJI;
            c348460DlM2.LJIILL = c348460DlM.LJIILL;
            c348460DlM2.LJIIZILJ = c348460DlM.LJIIZILJ;
            c348460DlM2.LJIILLIIL = c348460DlM.LJIILLIIL;
            c348460DlM2.LJIILJJIL = strArr;
            c348460DlM2.LJIIJ = c348460DlM.LJIIJ;
            c348460DlM2.LIZJ = c348460DlM.LIZJ;
            c348460DlM2.LJII = c348460DlM.LJII;
            c348460DlM2.LJIJJ = c348460DlM.LJIJJ;
            if (i == 27) {
                c348460DlM2.LJ = c348460DlM.LJ;
                c348460DlM2.LJIIJ = 1.2f;
            } else if (i == 33) {
                if (c196870120u.LJ != null) {
                    c348460DlM2.LJ = r0.getDuration();
                }
                c348460DlM2.LJIIJ = 1.2f;
            } else if (i == 34) {
                if (c196870120u.LJ != null) {
                    c348460DlM2.LJ = r0.getDuration();
                }
                if (strArr != null) {
                    if (TextUtils.equals("true", strArr[6])) {
                        int i2 = CastIntegerProtector.parseInt(strArr[2]);
                        if (!TextUtils.equals("true", strArr[7]) && i2 <= 10) {
                            c348460DlM2.LJIIJ = 1.18f;
                        }
                    } else {
                        c348460DlM2.LJIIJ = 0.95f;
                    }
                }
            } else {
                c348460DlM2.LJ = c196870120u.LJ.getDuration();
            }
            if (c348460DlM2.LJIJJ != null) {
                strLJIIL = C352130DrH.LIZIZ(c196870120u.LJ).LJIIIZ().LJJII(c348460DlM2);
            } else {
                strLJIIL = C352130DrH.LIZIZ(c196870120u.LJ).LJIIIZ().LJIIL(c348460DlM2);
            }
            c348460DlM.LIZIZ = strLJIIL;
            float f = 2;
            StickerItemModel stickerItemModel = c196870120u.LIZLLL(c348460DlM.LJIILL, c348460DlM.LJIIL, str, i, c348460DlM2.LIZIZ, (c348460DlM.LJFF - 0.5f) * f, (0.5f - c348460DlM.LJI) * f, 1.0f, 1.0f, false).LLILLL;
            stickerItemModel.scale = c348460DlM2.LJIIJ;
            stickerItemModel.resId = c348460DlM.LJIIZILJ;
            stickerItemModel.panel = c348460DlM.LJIILLIIL;
            c196871120v3.invalidate();
        }
    }

    @Override // X.InterfaceC1461650o8h
    public void cS(int i, final int i2, final int i3, final int i4, final int i5) {
        InterfaceC1452170ntP interfaceC1452170ntP;
        C196868120s c196868120sO2 = o2();
        VideoPublishEditModel videoPublishEditModel = c196868120sO2.LLJJIJIL;
        if (videoPublishEditModel != null && videoPublishEditModel.getInfoStickerModel() != null && !C0IKQ.LIZ(c196868120sO2.LLJJIJIL.getInfoStickerModel().stickers)) {
            for (final StickerItemModel stickerItemModel : c196868120sO2.LLJJIJIL.getInfoStickerModel().stickers) {
                if (Objects.equals(Integer.valueOf(stickerItemModel.getId()), Integer.valueOf(i)) && (interfaceC1452170ntP = c196868120sO2.LLJJIJI) != null) {
                    C391360FWc.LIZLLL("", interfaceC1452170ntP, new Function1() { // from class: X.0FWL
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            C348440DlK c348440DlKLJJIIJZLJL;
                            StickerItemModel stickerItemModel2 = stickerItemModel;
                            int i6 = i2;
                            int i7 = i3;
                            int i8 = i4;
                            int i9 = i5;
                            C348100Dkm c348100Dkm = (C348100Dkm) obj;
                            if (stickerItemModel2.uuid != null && (c348440DlKLJJIIJZLJL = c348100Dkm.LJIIIZ().LJJIIJZLJL(stickerItemModel2.uuid)) != null) {
                                stickerItemModel2.startTime = i6;
                                stickerItemModel2.endTime = i7;
                                stickerItemModel2.uiStartTime = i8;
                                stickerItemModel2.uiEndTime = i9;
                                c348440DlKLJJIIJZLJL.LIZLLL = i6;
                                c348440DlKLJJIIJZLJL.LJ = i7;
                                c348100Dkm.LJIIIZ().LIZLLL(c348440DlKLJJIIJZLJL);
                                return null;
                            }
                            return null;
                        }
                    });
                }
            }
        }
    }

    public C196869120t(C1DRG c1drg, C19A3 c19a3, int i, FrameLayout frameLayout, boolean z, InterfaceC1462140o9U interfaceC1462140o9U) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
        this.LLILZ = frameLayout;
        this.LLILZIL = z;
        this.LLILZLL = interfaceC1462140o9U;
    }

    @Override // X.InterfaceC1461650o8h
    public void m9(String str, String str2, int i, int i2, boolean z, Map<String, String> map) {
        w2().LLLII(str, str2, i, i2, z, map);
    }
}
