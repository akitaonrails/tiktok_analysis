package Y;

import X.C0CNO;
import X.C1058250de3;
import X.C1142950fqf;
import X.C1155870gBV;
import X.C1161920gLG;
import X.C129G;
import X.C13LP;
import X.C1548820qPI;
import X.C15DF;
import X.C15DM;
import X.C15DO;
import X.C15JH;
import X.C15K3;
import X.C15LE;
import X.C15LG;
import X.C16A8;
import X.C16F5;
import X.C16FT;
import X.C16FU;
import X.C18L3;
import X.C1B79;
import X.C1C7U;
import X.C20337314hv;
import X.C20384614pY;
import X.C20441214yg;
import X.C204618154u;
import X.C20634715on;
import X.C20649015r6;
import X.C20675115vJ;
import X.C20734216Bo;
import X.C2097908Jt;
import X.C214834195s;
import X.C214835195t;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C963550bBJ;
import X.C963590bBN;
import X.C976480bWA;
import X.EnumC1538460q8a;
import X.EnumC1779290wP1;
import X.EnumC1779770wPn;
import X.InterfaceC1541990qEH;
import X.InterfaceC20499215Je;
import X.InterfaceC2214261BlQ;
import X.InterfaceC487670JAn;
import X.InterfaceC973730bRj;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.InteractionLynxContainerLayout;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.LynxCommonData;
import com.bytedance.android.live.liveinteract.multihost.biz.lynx.event.LynxMatchSourceChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchEnigmaDebugSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLynxConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;
import com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper;
import com.ss.android.ugc.aweme.search.detail.keyframe.ui.SearchDetailKeyFrameBottomAssemAssem;
import com.ss.android.ugc.aweme.setting.page.security.SecuritySaveInfoCell;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.jvm.internal.AwS112S0201000_31;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS575S0100000_31;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public class ARunnableS42S0101000_31 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                run$18(this);
                break;
            case 19:
                run$19(this);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                run$20(this);
                break;
            case 21:
                run$21(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        InteractionLynxContainerLayout interactionLynxContainerLayout = (InteractionLynxContainerLayout) this.l0;
        interactionLynxContainerLayout.LLJJLIIIJLLLLLLLZ = null;
        int i = interactionLynxContainerLayout.LLJLILLLLZIIL;
        int i2 = this.i1;
        if (i != i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pending create cancelled, gen=");
            sbLIZ.append(this.i1);
            sbLIZ.append(" current=");
            sbLIZ.append(((InteractionLynxContainerLayout) this.l0).LLJLILLLLZIIL);
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        interactionLynxContainerLayout.LLJJL = EnumC1779770wPn.LLILLL;
        if (interactionLynxContainerLayout.kp()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("doCreateSparkLynxView gen=");
        sbLIZ2.append(i2);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
        String strSchemaV2 = LiveMatchLynxConfigSetting.INSTANCE.schemaV2();
        if (strSchemaV2.length() == 0) {
            C20441214yg.LJ("InteractionLynxContainerLayout", "schema is empty when doCreateSparkLynxView");
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("doCreateSparkLynxView schema=");
        sbLIZ3.append(strSchemaV2);
        C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ3));
        DataChannel dataChannel = interactionLynxContainerLayout.LLJLLIL;
        LynxCommonData lynxCommonDataLIZJ = C963550bBJ.LIZJ(new AwS381S0200000_15(interactionLynxContainerLayout, dataChannel != null ? (C963590bBN) dataChannel.gg0(LynxMatchSourceChannel.class) : null, 62));
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("init data = ");
        sbLIZ4.append(lynxCommonDataLIZJ);
        C20441214yg.LIZIZ("suzhexundebug", C2188811AlT.LIZIZ(sbLIZ4));
        Context context = interactionLynxContainerLayout.getContext();
        if (context != null) {
            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("initialData", new JSONObject(GsonProtectorUtils.toJson(C1058250de3.LIZIZ(), lynxCommonDataLIZJ))));
            if (interactionLynxContainerLayout.ip()) {
                interactionLynxContainerLayout.LLJJIJIL = iHybridContainerService.NN(context, strSchemaV2, interactionLynxContainerLayout, false, new AwS112S0201000_31(interactionLynxContainerLayout, (InteractionLynxContainerLayout) i2, (int) mapLIZJ, (Map<String, ? extends JSONObject>) 6));
            } else {
                interactionLynxContainerLayout.LLJJJ = iHybridContainerService.DU1(context, strSchemaV2, interactionLynxContainerLayout, false, new AwS112S0201000_31(interactionLynxContainerLayout, (InteractionLynxContainerLayout) i2, (int) mapLIZJ, (Map<String, ? extends JSONObject>) 5));
            }
            HandlerHook.viewPost(interactionLynxContainerLayout.getContentView(), new ARunnableS42S0101000_31(i2, interactionLynxContainerLayout, 14));
        } else {
            C20441214yg.LJ("InteractionLynxContainerLayout", "context is null when createSparkLynxView");
        }
        Iterator<C16A8<?>> it2 = InteractionLynxContainerLayout.LLJLLL.iterator();
        while (it2.hasNext()) {
            C1548820qPI.LIZLLL(it2.next().getEventName(), interactionLynxContainerLayout);
        }
    }

    public final void LIZ$1() {
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        List<C976480bWA> value;
        C976480bWA c976480bWA;
        C15DF c15df = (C15DF) this.l0;
        c15df.LLLLLJIL = false;
        c15df.LLLLLILLIL = -1;
        c15df.LLLLLIL = -1;
        c15df.LLLLLJLJLL = false;
        int i = this.i1;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null || (c976480bWA = (C976480bWA) C13LP.LJJJLZIJ(i, value)) == null) {
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        long jLJJJJJ = interfaceC973730bRjYf22 != null ? interfaceC973730bRjYf22.LJJJJJ() : 0L;
        C15DM c15dm = c15df.LLLJ;
        boolean z = c15df.LLLILZLLLI;
        c15dm.getClass();
        C15DO c15doLIZIZ = C15DM.LIZIZ(c976480bWA, false, z, jLJJJJJ);
        String strLJIIJ = c15df.LJIIJ(c15doLIZIZ.LIZ, c15df.LLLILZLLLI && c976480bWA.LIZ == jLJJJJJ);
        c15df.LLJILJILJ = i;
        TuxTextView tuxTextView = c15df.LLJIJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(strLJIIJ);
        }
        c15df.LLJJ = c976480bWA.LIZJ + ((long) LiveMatchEnigmaDebugSettings.INSTANCE.getSelfEnigmaScore());
        if (c15doLIZIZ.LIZIZ) {
            C786410Ut5.LL(0, (ConstraintLayout) c15df.findViewById(R.id.mjz));
            View view = c15df.LLJLILLLLZIIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TuxTextView tuxTextView2 = c15df.LLJLLL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
        }
        C1142950fqf c1142950fqf = c15df.LLJI;
        if (c1142950fqf != null) {
            c1142950fqf.LJIIIZ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToFirstRankImmediate: switched to index=");
        sbLIZ.append(i);
        sbLIZ.append(", score=");
        sbLIZ.append(strLJIIJ);
        C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$2() {
        final Activity activity = (Activity) this.l0;
        final int i = this.i1;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        if (C20675115vJ.LIZIZ.compareAndSet(false, true)) {
            SAFExtensionKt.LJIJI(new InterfaceC2214261BlQ() { // from class: X.15vK
                @Override // X.InterfaceC2214261BlQ
                public final void LIZIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LIZLLL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJFF(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJI(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJII(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIIZZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIIZ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIJJI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILJJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIILLIIL(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIIZILJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJ(AbstractC1387200mCc abstractC1387200mCc, Bundle bundle) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJJLI(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIL(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJJ(AbstractC1387200mCc abstractC1387200mCc) {
                }

                @Override // X.InterfaceC2214261BlQ
                public final void LJIJI(AbstractC1387200mCc abstractC1387200mCc) {
                    if (!(abstractC1387200mCc instanceof C1397950mTx)) {
                        return;
                    }
                    int iHashCode = ((C1397950mTx) abstractC1387200mCc).LIZLLL.hashCode();
                    Iterator it2 = ((ConcurrentHashMap) C20675115vJ.LIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        AtomicReference atomicReference = (AtomicReference) ((Map.Entry) it2.next()).getValue();
                        C1155870gBV c1155870gBV = (C1155870gBV) atomicReference.get();
                        if (c1155870gBV != null && c1155870gBV.LIZIZ == iHashCode) {
                            atomicReference.set(null);
                            it2.remove();
                        }
                    }
                }
            });
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C20675115vJ.LIZ;
        if (concurrentHashMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        final int iHashCode = activity.hashCode();
        final C1155870gBV c1155870gBV = new C1155870gBV(iHashCode, null);
        final AtomicReference atomicReference = new AtomicReference(c1155870gBV);
        concurrentHashMap.put(Integer.valueOf(i), atomicReference);
        new C18L3(new MutableContextWrapper(activity)).LIZ(i, null, new InterfaceC487670JAn(activity, atomicReference, c1155870gBV, iHashCode, i) { // from class: X.15vL
            public final /* synthetic */ Activity LIZ;
            public final /* synthetic */ AtomicReference<C1155870gBV> LIZIZ;
            public final /* synthetic */ C1155870gBV LIZJ;
            public final /* synthetic */ int LIZLLL;

            @Override // X.InterfaceC487670JAn
            public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                if (!this.LIZ.isFinishing() && !this.LIZ.isDestroyed()) {
                    AtomicReference<C1155870gBV> atomicReference2 = this.LIZIZ;
                    C1155870gBV c1155870gBV2 = this.LIZJ;
                    C1155870gBV c1155870gBV3 = new C1155870gBV(this.LIZLLL, view);
                    while (!atomicReference2.compareAndSet(c1155870gBV2, c1155870gBV3) && atomicReference2.get() == c1155870gBV2) {
                    }
                }
            }
        });
    }

    public final void LIZ$3() {
        InteractionLynxContainerLayout interactionLynxContainerLayout = (InteractionLynxContainerLayout) this.l0;
        if (interactionLynxContainerLayout.LLJLILLLLZIIL != this.i1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deferred load skipped, stale generation=");
            sbLIZ.append(this.i1);
            sbLIZ.append(", current=");
            sbLIZ.append(((InteractionLynxContainerLayout) this.l0).LLJLILLLLZIIL);
            C20441214yg.LIZIZ("InteractionLynxContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (!interactionLynxContainerLayout.ip()) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = ((InteractionLynxContainerLayout) this.l0).LLJJJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null) {
                return;
            }
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIIIIZZ();
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLJLILLLLZIIL != EnumC1538460q8a.FAIL) {
                ((ViewGroup) ((InteractionLynxContainerLayout) this.l0).getContentView()).addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            return;
        }
        InterfaceC1541990qEH interfaceC1541990qEH = ((InteractionLynxContainerLayout) this.l0).LLJJIJIL;
        if (interfaceC1541990qEH == null) {
            return;
        }
        interfaceC1541990qEH.load();
        View viewE1 = interfaceC1541990qEH.e1();
        if (viewE1 == null) {
            return;
        }
        ((ViewGroup) ((InteractionLynxContainerLayout) this.l0).getContentView()).addView(viewE1, new ViewGroup.LayoutParams(-1, -1));
    }

    public final void LIZ$4() {
        if (!((C204618154u) this.l0).LJIIJ().LLILLJJLI.LIZLLL || ((C204618154u) this.l0).LJIIJ().LLILLJJLI.LJ < this.i1) {
            C204618154u c204618154u = (C204618154u) this.l0;
            c204618154u.getClass();
            C0CNO.LIZLLL(0L, new AwS575S0100000_31(c204618154u, 1593));
        } else {
            C129G c129g = ((C204618154u) this.l0).LJIIJ;
            if (c129g != null) {
                c129g.resetLoadMoreState();
            }
        }
    }

    public final void LIZ$5() {
        int i = this.i1;
        C214834195s c214834195s = (C214834195s) this.l0;
        if (i != c214834195s.LJ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("OnPartnerFound fade endAction stale-skipped (scheduled=");
            sbLIZ.append(this.i1);
            sbLIZ.append(" current=");
            sbLIZ.append(((C214834195s) this.l0).LJ);
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("CancelCountdownComponent", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C16F5 c16f5 = c214834195s.LIZ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 4);
            c16f5.setClickable(false);
            c16f5.setFocusable(false);
            C786410Ut5.k5(c16f5, 1.0f);
        }
    }

    public final void LIZ$6() {
        int i = this.i1;
        C214835195t c214835195t = (C214835195t) this.l0;
        if (i == c214835195t.LJ) {
            C16F5 c16f5 = c214835195t.LIZ;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 4);
                C786410Ut5.k5(c16f5, 1.0f);
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnPartnerFound fade endAction stale-skipped (scheduled=");
        sbLIZ.append(this.i1);
        sbLIZ.append(" current=");
        sbLIZ.append(((C214835195t) this.l0).LJ);
        sbLIZ.append(')');
        C20441214yg.LJIIIZ("SearchStatusTextComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void run$0(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SecuritySaveInfoCell@8143.enableOCL$2$1");
        try {
            ((SecuritySaveInfoCell) aRunnableS42S0101000_31.l0).R5();
            ((SecuritySaveInfoCell) aRunnableS42S0101000_31.l0).S5(aRunnableS42S0101000_31.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SecuritySaveInfoCell@8143.enableOCL$2$1");
    }

    public static final void run$1(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SecuritySaveInfoCell@8143.disableOCL$2$1");
        try {
            ((SecuritySaveInfoCell) aRunnableS42S0101000_31.l0).R5();
            ((SecuritySaveInfoCell) aRunnableS42S0101000_31.l0).S5(aRunnableS42S0101000_31.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SecuritySaveInfoCell@8143.disableOCL$2$1");
    }

    public static final void run$10(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.restart$1");
        try {
            ((C1B79) aRunnableS42S0101000_31.l0).LIZ.LJIJI(aRunnableS42S0101000_31.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.restart$1");
    }

    public static final void run$11(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDownloadPlayHelper@f063.buildRepeatRunnable$1");
        try {
            InterfaceC20499215Je interfaceC20499215Je = ((MusicDownloadPlayHelper) aRunnableS42S0101000_31.l0).LLILZ;
            if (interfaceC20499215Je != null && interfaceC20499215Je.isPlaying()) {
                ((MusicDownloadPlayHelper) aRunnableS42S0101000_31.l0).Nf(aRunnableS42S0101000_31.i1, null);
                ((MusicDownloadPlayHelper) aRunnableS42S0101000_31.l0).LJFF();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDownloadPlayHelper@f063.buildRepeatRunnable$1");
    }

    public static final void run$12(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        C15LE c15le = (C15LE) aRunnableS42S0101000_31.l0;
        int i = aRunnableS42S0101000_31.i1;
        C15LG c15lg = c15le.LIZLLL.LJ;
        if (c15lg != null) {
            c15lg.sa(i, false);
        }
    }

    public static final void run$13(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3FragmentLayoutPreloader@ca56.preload$1");
        try {
            aRunnableS42S0101000_31.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3FragmentLayoutPreloader@ca56.preload$1");
    }

    public static final void run$14(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("InteractionLynxContainerLayout@8922.doCreateSparkLynxView$1$2");
        try {
            aRunnableS42S0101000_31.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractionLynxContainerLayout@8922.doCreateSparkLynxView$1$2");
    }

    public static final void run$15(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbnormalExitMonitor@8384.addPublishRecord$1");
        try {
            ((C20337314hv) aRunnableS42S0101000_31.l0).LJIIIIZZ().storeInt("exit_monitor_key_publish_task", ((C20337314hv) aRunnableS42S0101000_31.l0).LJFF.addAndGet(aRunnableS42S0101000_31.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbnormalExitMonitor@8384.addPublishRecord$1");
    }

    public static final void run$16(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("AbnormalExitMonitor@8384.removePublishRecord$1");
        try {
            ((C20337314hv) aRunnableS42S0101000_31.l0).LJIIIIZZ().storeInt("exit_monitor_key_publish_task", ((C20337314hv) aRunnableS42S0101000_31.l0).LJFF.addAndGet(-aRunnableS42S0101000_31.i1));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AbnormalExitMonitor@8384.removePublishRecord$1");
    }

    public static final void run$17(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("RecommendMusicTabViewV3@7c1b.renderAIMusicList$1");
        try {
            aRunnableS42S0101000_31.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RecommendMusicTabViewV3@7c1b.renderAIMusicList$1");
    }

    public static final void run$18(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CancelCountdownComponent@8cf6.onEvent$2");
        try {
            aRunnableS42S0101000_31.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CancelCountdownComponent@8cf6.onEvent$2");
    }

    public static final void run$19(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SearchStatusTextComponent@2470.onEvent$2");
        try {
            aRunnableS42S0101000_31.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchStatusTextComponent@2470.onEvent$2");
    }

    public static final void run$2(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("PlaybookDetailView@ddb3.layoutManager$1$scrollToPositionWithOffset$1");
        try {
            RecyclerView recyclerView = ((C20384614pY) aRunnableS42S0101000_31.l0).LLJILJILJ;
            if (recyclerView != null) {
                recyclerView.scrollBy(0, aRunnableS42S0101000_31.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PlaybookDetailView@ddb3.layoutManager$1$scrollToPositionWithOffset$1");
    }

    public static final void run$20(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SynchronizationHelper@de15.addDelayTask$1");
        try {
            C20649015r6 c20649015r6 = C20649015r6.LIZ;
            EnumC1779290wP1 enumC1779290wP1 = (EnumC1779290wP1) aRunnableS42S0101000_31.l0;
            int i = aRunnableS42S0101000_31.i1;
            c20649015r6.getClass();
            C20649015r6.LIZIZ(enumC1779290wP1, i);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SynchronizationHelper@de15.addDelayTask$1");
    }

    public static final void run$21(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("SlideSwitchLayout@16ac.smoothScrollToItem$1");
        try {
            ((C20734216Bo) aRunnableS42S0101000_31.l0).smoothScrollTo(aRunnableS42S0101000_31.i1 * C20734216Bo.LLJJIJIL, 0);
            ((C20734216Bo) aRunnableS42S0101000_31.l0).LLJILJILJ = System.currentTimeMillis();
            ((C20734216Bo) aRunnableS42S0101000_31.l0).LLJJ = aRunnableS42S0101000_31.i1;
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SlideSwitchLayout@16ac.smoothScrollToItem$1");
    }

    public static final void run$3(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("InteractionLynxContainerLayout@8922.scheduleCreateIfNeeded$runnable$1");
        try {
            aRunnableS42S0101000_31.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InteractionLynxContainerLayout@8922.scheduleCreateIfNeeded$runnable$1");
    }

    public static final void run$4(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        LinearLayoutManager linearLayoutManager;
        C1C7U.LIZ("SearchDetailKeyFrameBottomAssemAssem@3c42.onViewCreated$6$1");
        try {
            SearchDetailKeyFrameBottomAssemAssem searchDetailKeyFrameBottomAssemAssem = (SearchDetailKeyFrameBottomAssemAssem) aRunnableS42S0101000_31.l0;
            C20634715on c20634715on = searchDetailKeyFrameBottomAssemAssem.LLLI;
            if (c20634715on != null) {
                c20634715on.LIZ = aRunnableS42S0101000_31.i1;
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = searchDetailKeyFrameBottomAssemAssem.LLJLLIL;
            RecyclerView.LayoutManager layoutManager = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null) {
                layoutManager = viewOnAttachStateChangeListenerC20604515jv.getLayoutManager();
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                linearLayoutManager.startSmoothScroll(((SearchDetailKeyFrameBottomAssemAssem) aRunnableS42S0101000_31.l0).LLLI);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchDetailKeyFrameBottomAssemAssem@3c42.onViewCreated$6$1");
    }

    public static final void run$5(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("RepeatMusicPlayer@854f.buildRepeatRunnable$1");
        try {
            MediaPlayer mediaPlayer = ((RepeatMusicPlayer) aRunnableS42S0101000_31.l0).LL;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    ((RepeatMusicPlayer) aRunnableS42S0101000_31.l0).LL.pause();
                }
                RepeatMusicPlayer repeatMusicPlayer = (RepeatMusicPlayer) aRunnableS42S0101000_31.l0;
                C15K3 c15k3 = repeatMusicPlayer.LLIZ;
                if (c15k3 != null) {
                    c15k3.LIZIZ++;
                }
                repeatMusicPlayer.LIZIZ(aRunnableS42S0101000_31.i1, repeatMusicPlayer.LLILLL);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("RepeatMusicPlayer@854f.buildRepeatRunnable$1");
    }

    public static final void run$6(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        C16FU c16fu = (C16FU) aRunnableS42S0101000_31.l0;
        int i = aRunnableS42S0101000_31.i1;
        c16fu.getClass();
        C1C7U.LIZ("StatusViewStyleableHelper@f964.setAttributes$1L");
        ((C16FT) c16fu.LL).setLayoutType(i);
        C1C7U.LIZIZ("StatusViewStyleableHelper@f964.setAttributes$1L");
    }

    public static final void run$7(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("LiveMatchBasicScoreComponent@a46c.handleIndividualMatchHide$1");
        try {
            aRunnableS42S0101000_31.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveMatchBasicScoreComponent@a46c.handleIndividualMatchHide$1");
    }

    public static final void run$8(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("CutMusicRepeartPlayer@623e.buildRepeatRunnable$1");
        try {
            MediaPlayer mediaPlayer = ((CutMusicRepeartPlayer) aRunnableS42S0101000_31.l0).LL;
            if (mediaPlayer != null) {
                if (mediaPlayer.isPlaying()) {
                    ((CutMusicRepeartPlayer) aRunnableS42S0101000_31.l0).LL.pause();
                }
                CutMusicRepeartPlayer cutMusicRepeartPlayer = (CutMusicRepeartPlayer) aRunnableS42S0101000_31.l0;
                C15JH c15jh = cutMusicRepeartPlayer.LLILZLL;
                if (c15jh != null) {
                    c15jh.LIZIZ++;
                }
                cutMusicRepeartPlayer.LIZ(aRunnableS42S0101000_31.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CutMusicRepeartPlayer@623e.buildRepeatRunnable$1");
    }

    public static final void run$9(ARunnableS42S0101000_31 aRunnableS42S0101000_31) {
        boolean zLIZ;
        C1C7U.LIZ("ProcessDownloadHandler@bc34.pause$1");
        try {
            ((C1B79) aRunnableS42S0101000_31.l0).LIZ.LJIILL(aRunnableS42S0101000_31.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ProcessDownloadHandler@bc34.pause$1");
    }

    public ARunnableS42S0101000_31(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
