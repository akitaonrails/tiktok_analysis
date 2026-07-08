package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.RewardAdModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS10S1301000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cXz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016050cXz implements InterfaceC1007910cKr {
    public final Context LIZ;
    public final InterfaceC1031540cwy LIZIZ;
    public final ViewGroup LIZJ;
    public final InterfaceC1031710cxF LIZLLL;
    public final IVideoPlayTaskManager LJ;
    public boolean LJI;
    public boolean LJII;
    public IAnoleManager LJIIIIZZ;
    public int LJIIIZ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(185));
    public final List<String> LJIIJ = C1697810uHb.LJIIJJI(EnumC1008920cMU.INCENTIVE_ANSWER_CARD.getType(), EnumC1008920cMU.LYNX_END_LAYER.getType(), EnumC1008920cMU.NATIVE_END_LAYER.getType(), EnumC1008920cMU.ENDLAYER_GUIDE_GESTURE.getType());

    @Override // X.InterfaceC1007910cKr
    public final long LJJLIL() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final int LLJILLL() {
        return 0;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ LLJJIJIIJIL() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void P() {
    }

    @Override // X.InterfaceC1007910cKr
    public final void U2() {
    }

    @Override // X.InterfaceC1007910cKr
    public final JSONObject V2() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final ViewGroup b3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean d3() {
        return true;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean e3() {
        return false;
    }

    @Override // X.InterfaceC1007910cKr
    public final void f3(long j, String str, String str2, AwS81S0100100_16 awS81S0100100_16) {
    }

    @Override // X.InterfaceC1007910cKr
    public final void g3(int i) {
    }

    @Override // X.InterfaceC1007910cKr
    public final Integer i3() {
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void o0() {
    }

    @Override // X.InterfaceC1007910cKr
    public final long r1() {
        return 0L;
    }

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZIZ;
        if (!(interfaceC1031540cwy instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1031540cwy) == null) {
            return;
        }
        interfaceC1032100cxs.resume();
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014390cVJ Y2() {
        ViewGroup viewGroup = this.LIZJ;
        return new C1014390cVJ(new C1009390cNF(viewGroup.getWidth(), viewGroup.getHeight()), new PointF(viewGroup.getWidth() / 2, viewGroup.getHeight() / 2));
    }

    @Override // X.InterfaceC1007910cKr
    public final HashMap<String, Object> Z2() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("video_play_count", Integer.valueOf(this.LJ.LLF()));
        return map;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1008080cL8 c3() {
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZIZ;
        if (interfaceC1031540cwy != null) {
            return interfaceC1031540cwy.getHybridConfig(interfaceC1031540cwy.getHostModel(), this.LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZIZ;
        if (!(interfaceC1031540cwy instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1031540cwy) == null) {
            return;
        }
        interfaceC1032100cxs.pause();
    }

    public final void LIZ(boolean z) {
        if (!z) {
            this.LJII = true;
        }
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C692050RCp(z));
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("incentive video's visibility change: ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
    }

    public final void LIZJ(AbstractC997470c41 abstractC997470c41) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStateChanged,playState:");
        sbLIZ.append(abstractC997470c41);
        C2188811AlT.LIZIZ(sbLIZ);
        C989530brD.LIZ();
        if (abstractC997470c41 instanceof C995850c1P) {
            this.LJ.LL();
            IAnoleManager iAnoleManager = this.LJIIIIZZ;
            if (iAnoleManager != null) {
                iAnoleManager.LIZJ();
            }
        } else if (abstractC997470c41 instanceof C997510c45) {
            this.LJ.LLD();
        } else if (abstractC997470c41 instanceof C997490c43) {
            this.LJ.LLFF();
        } else if (abstractC997470c41 instanceof C997480c42) {
            this.LJ.LJJIJIIJIL();
        }
        IAnoleManager iAnoleManager2 = this.LJIIIIZZ;
        if (iAnoleManager2 != null) {
            iAnoleManager2.LJIIZILJ(abstractC997470c41);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        InterfaceC1031540cwy interfaceC1031540cwy;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            bottomInteractView = this.LIZJ;
        } else {
            if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) && (interfaceC1031540cwy = this.LIZIZ) != null) {
                bottomInteractView = interfaceC1031540cwy.getBottomInteractView();
            }
            return null;
        }
        if (bottomInteractView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("businessComponent height: ");
            sbLIZ.append(bottomInteractView.getHeight());
            C2188811AlT.LIZIZ(sbLIZ);
            C989530brD.LIZ();
            int[] iArr = new int[2];
            bottomInteractView.getLocationInWindow(iArr);
            return new C1014410cVL(bottomInteractView.getWidth(), bottomInteractView.getHeight(), iArr);
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        InterfaceC1031540cwy interfaceC1031540cwy;
        ViewGroup bottomInteractView;
        Context contextLIZ = this.LIZ;
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            bottomInteractView = this.LIZJ;
        } else {
            if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) && (interfaceC1031540cwy = this.LIZIZ) != null) {
                bottomInteractView = interfaceC1031540cwy.getBottomInteractView();
            }
            return C1008220cLM.LIZ();
        }
        if (bottomInteractView != null) {
            return new C1009390cNF(C418440Gaw.LJFF(C497820Jfg.LIZIZ(contextLIZ), contextLIZ), C418440Gaw.LJFF(bottomInteractView.getHeight(), contextLIZ));
        }
        return C1008220cLM.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // X.InterfaceC1007910cKr
    public final void LIZIZ(AbstractC991850bux abstractC991850bux, InterfaceC1007930cKt interfaceC1007930cKt) {
        Object obj;
        Double d;
        AwemeRawAd awemeRawAd;
        UrlModel clickTrackUrlList;
        if (abstractC991850bux instanceof C1008450cLj) {
            this.LIZLLL.LIZIZ().LJFF();
            return;
        }
        if (abstractC991850bux instanceof C1008440cLi) {
            this.LIZLLL.LIZIZ().LJ();
            return;
        }
        if (abstractC991850bux instanceof C989600brK) {
            C1009100cMm c1009100cMm = ((C989600brK) abstractC991850bux).LIZ;
            for (AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel : c1009100cMm.LIZ) {
                InterfaceC1031540cwy interfaceC1031540cwy = this.LIZIZ;
                if (interfaceC1031540cwy != null) {
                    interfaceC1031540cwy.showOrHideViewWithAnim(true, anoleComponentBusinessAppearModel);
                }
            }
            for (AnoleComponentBusinessAppearModel anoleComponentBusinessAppearModel2 : c1009100cMm.LIZIZ) {
                InterfaceC1031540cwy interfaceC1031540cwy2 = this.LIZIZ;
                if (interfaceC1031540cwy2 != null) {
                    interfaceC1031540cwy2.showOrHideViewWithAnim(false, anoleComponentBusinessAppearModel2);
                }
            }
            C989530brD.LIZ();
            return;
        }
        if (abstractC991850bux instanceof C1005320cGg) {
            C989530brD.LIZ();
            C1005320cGg c1005320cGg = (C1005320cGg) abstractC991850bux;
            if (this.LIZIZ == null || this.LIZ == null || c1005320cGg.LIZ != 1) {
                return;
            }
            C989530brD.LIZ();
            this.LIZIZ.handleTap(this.LIZ, C2097608Jq.LJIIIIZZ(new Pair(EnumC1005420cGq.ENTER_FROM, Integer.valueOf(c1005320cGg.LIZLLL)), new Pair(EnumC1005420cGq.REFER, c1005320cGg.LJ)), this.LIZIZ.getHostModel());
            HashMap map = new HashMap();
            map.putAll(c1005320cGg.LJII);
            map.putAll(this.LIZIZ.getCustomAdExtraDataParams());
            C1031310cwb c1031310cwb = new C1031310cwb(c1005320cGg.LJFF, "click", c1005320cGg.LJ, map);
            InterfaceC1031540cwy interfaceC1031540cwy3 = this.LIZIZ;
            interfaceC1031540cwy3.trackEvent(c1031310cwb, interfaceC1031540cwy3.getHostModel());
            RewardAdModel rewardAdModel = this.LIZIZ.getRewardAdModel();
            if (rewardAdModel == null || (awemeRawAd = rewardAdModel.awemeRawAd) == null || (clickTrackUrlList = awemeRawAd.getClickTrackUrlList()) == null) {
                return;
            }
            C1031370cwh c1031370cwh = new C1031370cwh(clickTrackUrlList, "click", 12);
            InterfaceC1031540cwy interfaceC1031540cwy4 = this.LIZIZ;
            interfaceC1031540cwy4.track3rdPartyURL(c1031370cwh, interfaceC1031540cwy4.getHostModel());
            return;
        }
        Integer numValueOf = null;
        String type = null;
        String type2 = null;
        numValueOf = null;
        if (abstractC991850bux instanceof C991870buz) {
            InterfaceC1031540cwy interfaceC1031540cwy5 = this.LIZIZ;
            if (interfaceC1031540cwy5 == null) {
                return;
            }
            if (interfaceC1007930cKt != null) {
                type = interfaceC1007930cKt.getType();
            }
            interfaceC1031540cwy5.addOverlayViewIfNeed(type, true);
            return;
        }
        if (abstractC991850bux instanceof C991310bu5) {
            InterfaceC1031540cwy interfaceC1031540cwy6 = this.LIZIZ;
            if (interfaceC1031540cwy6 == null) {
                return;
            }
            if (interfaceC1007930cKt != null) {
                type2 = interfaceC1007930cKt.getType();
            }
            interfaceC1031540cwy6.addOverlayViewIfNeed(type2, false);
            return;
        }
        if (!(abstractC991850bux instanceof C989580brI)) {
            return;
        }
        T t = ((C989580brI) abstractC991850bux).LIZ;
        if (!(t instanceof C1009000cMc)) {
            return;
        }
        C1009000cMc c1009000cMc = (C1009000cMc) t;
        if (Intrinsics.LJFF(c1009000cMc.LIZJ, "skipIncentiveAdsWatchDuration")) {
            String str = c1009000cMc.LIZLLL;
            if (str == null || str.length() == 0) {
                return;
            }
            HashMap mapLIZIZ = C13054058y.LIZIZ(str);
            if (mapLIZIZ != null) {
                obj = mapLIZIZ.get("duration");
            } else {
                obj = null;
            }
            if ((obj instanceof Double) && (d = (Double) obj) != null && (numValueOf = Integer.valueOf((int) d.doubleValue())) != null && numValueOf.intValue() >= 0) {
                InterfaceC1031540cwy interfaceC1031540cwy7 = this.LIZIZ;
                if (interfaceC1031540cwy7 == null) {
                    return;
                }
                interfaceC1031540cwy7.skipRewardAdWatchDuration(numValueOf.intValue());
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("skipRewardAdWatchDuration call, skipDurationMs illegal skipDurationMs=");
            sbLIZ.append(numValueOf);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("unHandle Anole common JSB payload=");
        sbLIZ2.append(c1009000cMc);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InterfaceC1031540cwy interfaceC1031540cwy;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            this.LIZJ.removeOnLayoutChangeListener(onLayoutChangeListener);
        } else {
            if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) || (interfaceC1031540cwy = this.LIZIZ) == null || (bottomInteractView = interfaceC1031540cwy.getBottomInteractView()) == null) {
                return;
            }
            bottomInteractView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        InterfaceC1031540cwy interfaceC1031540cwy;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            this.LIZJ.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1014330cVD);
        } else {
            if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) || (interfaceC1031540cwy = this.LIZIZ) == null || (bottomInteractView = interfaceC1031540cwy.getBottomInteractView()) == null) {
                return;
            }
            bottomInteractView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1014330cVD);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        RewardAdModel rewardAdModel;
        C013C c013c = new C013C();
        AwS10S1301000_16 awS10S1301000_16 = new AwS10S1301000_16(this, str, i, runnable, c013c, 0);
        InterfaceC1031540cwy interfaceC1031540cwy = this.LIZIZ;
        if (interfaceC1031540cwy != null && interfaceC1031540cwy.getRewardAdModel() != null && (rewardAdModel = this.LIZIZ.getRewardAdModel()) != null) {
            awS10S1301000_16.invoke(rewardAdModel);
        }
        return c013c.element;
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean h3(String str, InterfaceC1007930cKt interfaceC1007930cKt, AnoleComponentAppearModel anoleComponentAppearModel) {
        if (Intrinsics.LJFF(EnumC696280RSw.REWARD_ANOLE_TOP_FULL_SLOT.getSlotName(), str) && Intrinsics.LJFF(EnumC1008920cMU.INCENTIVE_ANSWER_CARD.getType(), interfaceC1007930cKt.getType())) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("shouldShowADComponent called, wasIncentiveAdEverInvisible=");
            sbLIZ.append(this.LJII);
            sbLIZ.append(", userHasClickedExitButton=");
            sbLIZ.append(this.LJI);
            C2188811AlT.LIZIZ(sbLIZ);
            C989530brD.LIZ();
            if (!this.LJII && !this.LJI) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C1016050cXz(Context context, InterfaceC1031540cwy interfaceC1031540cwy, C1035140d2m c1035140d2m, InterfaceC1031710cxF interfaceC1031710cxF, IVideoPlayTaskManager iVideoPlayTaskManager) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1031540cwy;
        this.LIZJ = c1035140d2m;
        this.LIZLLL = interfaceC1031710cxF;
        this.LJ = iVideoPlayTaskManager;
    }
}
