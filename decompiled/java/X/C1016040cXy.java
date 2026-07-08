package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentBusinessAppearModel;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS10S1301000_16;
import kotlin.jvm.internal.AwS81S0100100_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016040cXy implements InterfaceC1032210cy3, InterfaceC1007910cKr {
    public final Context LIZ;
    public final InterfaceC1032120cxu LIZIZ;
    public final ViewGroup LIZJ;
    public final InterfaceC1032280cyA LIZLLL;
    public final InterfaceC1016100cY4 LJ;
    public boolean LJI;
    public boolean LJII;
    public IAnoleManager LJIIIIZZ;
    public int LJIIIZ;
    public InterfaceC1016210cYF LJIIJJI;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(574));
    public final List<String> LJIIJ = C1697810uHb.LJIIJJI(EnumC1008920cMU.INCENTIVE_ANSWER_CARD.getType(), EnumC1008920cMU.LYNX_END_LAYER.getType(), EnumC1008920cMU.NATIVE_END_LAYER.getType(), EnumC1008920cMU.ENDLAYER_GUIDE_GESTURE.getType());

    @Override // X.InterfaceC1032210cy3
    public final void LIZ() {
        int i = 0;
        this.LJI = false;
        this.LJII = false;
        String[] strArr = {EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName(), EnumC696280RSw.REWARD_ANOLE_SLIDE_SLOT.getSlotName(), EnumC696280RSw.REWARD_ANOLE_TOP_FULL_SLOT.getSlotName(), EnumC696280RSw.REWARD_ANOLE_TOP_FULL_ABOVE_ALL_SLOT.getSlotName()};
        do {
            String str = strArr[i];
            IAnoleManager iAnoleManager = this.LJIIIIZZ;
            if (iAnoleManager != null) {
                iAnoleManager.LJIIJJI(str);
            }
            i++;
        } while (i < 4);
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIIJJI() {
        this.LJI = true;
        for (String str : this.LJIIJ) {
            IAnoleManager iAnoleManager = this.LJIIIIZZ;
            if (iAnoleManager != null) {
                iAnoleManager.LJI(str);
            }
        }
    }

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

    @Override // X.InterfaceC1032210cy3
    public final void LIZJ() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZJ();
        }
    }

    @Override // X.InterfaceC1032210cy3
    public final void LIZLLL() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIL("now_render", null);
        }
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJ() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C988650bpn(EnumC996680c2k.SKIP_CLICK.getValue()));
        }
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJI() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.clear();
        }
        this.LJ.reset();
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIIIIZZ() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(C1008430cLh.LIZ);
        }
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIILJJIL() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C988650bpn("receive_again_alert_show"));
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void LJJLIIJ() {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZIZ;
        if (!(interfaceC1032120cxu instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu) == null) {
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
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZIZ;
        Object hybridConfig = interfaceC1032120cxu != null ? interfaceC1032120cxu.getHybridConfig(interfaceC1032120cxu.getHostModel(), this.LIZ) : null;
        if (hybridConfig instanceof C1008080cL8) {
            return (C1008080cL8) hybridConfig;
        }
        return null;
    }

    @Override // X.InterfaceC1032210cy3
    public final void hide() {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LIZ();
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void pauseVideo() {
        InterfaceC1032100cxs interfaceC1032100cxs;
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZIZ;
        if (!(interfaceC1032120cxu instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu) == null) {
            return;
        }
        interfaceC1032100cxs.pause();
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJII(C1018550cc1 c1018550cc1) {
        this.LJIIJJI = c1018550cc1;
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIIIZ(boolean z) {
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
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIIJ(AbstractC1016090cY3 abstractC1016090cY3) {
        AbstractC1007980cKy c995870c1R;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStateChanged,playState:");
        sbLIZ.append(abstractC1016090cY3);
        C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC1016090cY3 instanceof C1016170cYB) {
            c995870c1R = C995850c1P.LIZ;
        } else if (abstractC1016090cY3 instanceof C1016150cY9) {
            c995870c1R = C997500c44.LIZ;
        } else if (abstractC1016090cY3 instanceof C1016160cYA) {
            c995870c1R = C997510c45.LIZ;
        } else if (abstractC1016090cY3 instanceof C1016140cY8) {
            c995870c1R = C997490c43.LIZ;
        } else if (abstractC1016090cY3 instanceof C1016130cY7) {
            c995870c1R = C997480c42.LIZ;
        } else if (abstractC1016090cY3 instanceof C995880c1S) {
            abstractC1016090cY3.getClass();
            c995870c1R = new C995870c1R();
        } else {
            throw new C1954807lC();
        }
        if (c995870c1R instanceof C995850c1P) {
            this.LJ.LL();
        } else if (c995870c1R instanceof C997510c45) {
            this.LJ.LLD();
        } else if (c995870c1R instanceof C997490c43) {
            this.LJ.LLFF();
        } else if (c995870c1R instanceof C997480c42) {
            this.LJ.LJJIJIIJIL();
        }
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(c995870c1R);
        }
    }

    @Override // X.InterfaceC1032210cy3
    public final void LJIIL(JSONObject jSONObject) {
        IAnoleManager iAnoleManager = this.LJIIIIZZ;
        if (iAnoleManager != null) {
            iAnoleManager.LJIIZILJ(new C0SCL(jSONObject));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    @Override // X.InterfaceC1032210cy3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(java.util.List<X.C1016180cYC> r14) {
        /*
            r13 = this;
            r11 = r13
            X.0cxu r0 = r11.LIZIZ
            r4 = 0
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel r1 = r0.getRewardAdModel()
            if (r1 == 0) goto L8f
            X.0cxu r0 = r11.LIZIZ
            java.lang.Object r5 = r0.getHostModel()
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L8f
            r0 = r5
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r0.getAwemeRawAd()
            if (r6 == 0) goto L8f
            X.0cNA r2 = new X.0cNA
            java.lang.String r3 = r1.aid
            if (r3 != 0) goto L29
            java.lang.String r3 = ""
        L29:
            X.0cxu r0 = r11.LIZIZ
            if (r0 == 0) goto L8d
            java.util.HashMap r1 = r0.getCustomAdExtraDataParams()
            if (r1 == 0) goto L8d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L8d
            com.google.gson.n r7 = new com.google.gson.n
            r7.<init>()
            X.04rF r0 = X.C1227904rF.LIZ
            r0.getClass()
            com.google.gson.Gson r0 = X.C1227904rF.LIZLLL()
            com.google.gson.k r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJsonTree(r0, r1)
            java.lang.String r0 = "coinTrackInfo"
            r7.LJJIFFI(r0, r1)
        L50:
            r10 = 96
            r8 = r4
            r9 = r4
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
        L57:
            android.content.Context r8 = r11.LIZ
            if (r2 == 0) goto Lad
            if (r8 == 0) goto Lad
            X.01GW r0 = r11.LJFF
            java.lang.Object r7 = r0.getValue()
            com.ss.android.ugc.aweme.IAnoleService r7 = (com.ss.android.ugc.aweme.IAnoleService) r7
            if (r7 == 0) goto L8b
            r9 = r4
            r10 = r2
            r12 = r4
            X.0cKq r3 = r7.LJI(r8, r9, r10, r11, r12)
        L6e:
            r11.LJIIIIZZ = r3
            if (r3 == 0) goto L82
            android.view.ViewGroup r2 = r11.LIZJ
            X.0RSw r0 = X.EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT
            java.lang.String r1 = r0.getSlotName()
            X.0cY0 r0 = new X.0cY0
            r0.<init>()
            r3.mount(r2, r1, r0)
        L82:
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L91
            return
        L8b:
            r3 = r4
            goto L6e
        L8d:
            r7 = r4
            goto L50
        L8f:
            r2 = r4
            goto L57
        L91:
            java.util.Iterator r3 = r14.iterator()
        L95:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lad
            java.lang.Object r0 = r3.next()
            X.0cYC r0 = (X.C1016180cYC) r0
            com.ss.android.ugc.aweme.IAnoleManager r2 = r11.LJIIIIZZ
            if (r2 == 0) goto L95
            android.view.ViewGroup r1 = r0.LIZ
            java.lang.String r0 = r0.LIZIZ
            r2.mount(r1, r0, r4)
            goto L95
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1016040cXy.LJIILIIL(java.util.List):void");
    }

    @Override // X.InterfaceC1007910cKr
    public final C1014410cVL LLJJIJI(String str) {
        InterfaceC1032120cxu interfaceC1032120cxu;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            bottomInteractView = this.LIZJ;
        } else {
            if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) && (interfaceC1032120cxu = this.LIZIZ) != null) {
                bottomInteractView = interfaceC1032120cxu.getBottomInteractView();
            }
            return null;
        }
        if (bottomInteractView != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("businessComponent height: ");
            sbLIZ.append(bottomInteractView.getHeight());
            C2188811AlT.LIZIZ(sbLIZ);
            int[] iArr = new int[2];
            bottomInteractView.getLocationInWindow(iArr);
            return new C1014410cVL(bottomInteractView.getWidth(), bottomInteractView.getHeight(), iArr);
        }
        return null;
    }

    @Override // X.InterfaceC1007910cKr
    public final C1009390cNF W2(String str) {
        InterfaceC1032120cxu interfaceC1032120cxu;
        ViewGroup bottomInteractView;
        Context contextLIZ = this.LIZ;
        if (contextLIZ == null) {
            C844470XAv.LIZ.getClass();
            contextLIZ = C844470XAv.LIZ();
        }
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            bottomInteractView = this.LIZJ;
        } else {
            if (Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) && (interfaceC1032120cxu = this.LIZIZ) != null) {
                bottomInteractView = interfaceC1032120cxu.getBottomInteractView();
            }
            return C1008220cLM.LIZ();
        }
        if (bottomInteractView != null) {
            return new C1009390cNF(C418440Gaw.LJFF(C497820Jfg.LIZIZ(contextLIZ), contextLIZ), C418440Gaw.LJFF(bottomInteractView.getHeight(), contextLIZ));
        }
        return C1008220cLM.LIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
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
        InterfaceC1032120cxu interfaceC1032120cxu;
        InterfaceC1032100cxs interfaceC1032100cxs;
        List<? extends HashMap<String, Object>> listLIZJ;
        Object c098200Yq;
        Object obj;
        Double d;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        String strOptString2;
        JSONObject jSONObjectOptJSONObject2;
        InterfaceC1016210cYF interfaceC1016210cYF;
        String type;
        String type2;
        InterfaceC1032120cxu interfaceC1032120cxu2;
        String type3;
        Map<String, Object> data;
        InterfaceC1032120cxu interfaceC1032120cxu3;
        GMTBaseModel gMTBaseModel;
        UrlModel clickTrackUrlList;
        GMTBaseModel gMTBaseModel2;
        if (abstractC991850bux instanceof C1008450cLj) {
            InterfaceC1032290cyB interfaceC1032290cyBLIZLLL = this.LIZLLL.LIZLLL();
            if (interfaceC1032290cyBLIZLLL != null) {
                interfaceC1032290cyBLIZLLL.LJIILLIIL();
                return;
            }
            return;
        }
        if (abstractC991850bux instanceof C1008440cLi) {
            InterfaceC1032290cyB interfaceC1032290cyBLIZLLL2 = this.LIZLLL.LIZLLL();
            if (interfaceC1032290cyBLIZLLL2 == null) {
                return;
            }
            interfaceC1032290cyBLIZLLL2.pausePlay();
            return;
        }
        if (abstractC991850bux instanceof C989600brK) {
            C1009100cMm c1009100cMm = ((C989600brK) abstractC991850bux).LIZ;
            Iterator<AnoleComponentBusinessAppearModel> it2 = c1009100cMm.LIZ.iterator();
            while (it2.hasNext()) {
                C1014640cVi.LIZ(this, it2.next(), true);
            }
            Iterator<AnoleComponentBusinessAppearModel> it3 = c1009100cMm.LIZIZ.iterator();
            while (it3.hasNext()) {
                C1014640cVi.LIZ(this, it3.next(), false);
            }
            return;
        }
        List<? extends HashMap<String, Object>> list = null;
        type = null;
        String type4 = null;
        String type5 = null;
        Map<String, Object> data2 = null;
        String type6 = null;
        Object objSearchHostModelByCid = null;
        Object objSearchHostModelByCid2 = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (abstractC991850bux instanceof C1005320cGg) {
            C1005320cGg c1005320cGg = (C1005320cGg) abstractC991850bux;
            if (this.LIZIZ == null || this.LIZ == null || c1005320cGg.LIZ != 1) {
                return;
            }
            HashMap map = new HashMap();
            map.putAll(c1005320cGg.LJII);
            map.putAll(this.LIZIZ.getCustomAdExtraDataParams());
            map.putAll(this.LIZIZ.getCarouselAdExtraParams());
            this.LIZIZ.handleTap(this.LIZ, C2097608Jq.LJIIIIZZ(new Pair(EnumC1005430cGr.ENTER_FROM, Integer.valueOf(c1005320cGg.LIZLLL)), new Pair(EnumC1005430cGr.REFER, c1005320cGg.LJ)), this.LIZIZ.getHostModel());
            GmtRewardAdModel rewardAdModel = this.LIZIZ.getRewardAdModel();
            if (rewardAdModel != null && (gMTBaseModel2 = rewardAdModel.awemeRawAd) != null) {
                type4 = gMTBaseModel2.getType();
            }
            if (Intrinsics.LJFF(type4, "web") && Intrinsics.LJFF(c1005320cGg.LJIIJ, EnumC1008920cMU.NATIVE_END_LAYER.getType())) {
                String str = c1005320cGg.LJIIJJI;
                String str2 = c1005320cGg.LJIIL;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(map);
                linkedHashMap.put("is_lynx", 0);
                C1031480cws c1031480cws = new C1031480cws(str, "click", str2, linkedHashMap);
                InterfaceC1032120cxu interfaceC1032120cxu4 = this.LIZIZ;
                interfaceC1032120cxu4.trackEvent(c1031480cws, interfaceC1032120cxu4.getHostModel());
            }
            C1031480cws c1031480cws2 = new C1031480cws(c1005320cGg.LJFF, "click", c1005320cGg.LJ, map);
            InterfaceC1032120cxu interfaceC1032120cxu5 = this.LIZIZ;
            interfaceC1032120cxu5.trackEvent(c1031480cws2, interfaceC1032120cxu5.getHostModel());
            GmtRewardAdModel rewardAdModel2 = this.LIZIZ.getRewardAdModel();
            if (rewardAdModel2 == null || (gMTBaseModel = rewardAdModel2.awemeRawAd) == null || (clickTrackUrlList = gMTBaseModel.getClickTrackUrlList()) == null) {
                return;
            }
            C1031380cwi c1031380cwi = new C1031380cwi(clickTrackUrlList, "click", 12);
            InterfaceC1032120cxu interfaceC1032120cxu6 = this.LIZIZ;
            interfaceC1032120cxu6.track3rdPartyURL(c1031380cwi, interfaceC1032120cxu6.getHostModel());
            return;
        }
        if (abstractC991850bux instanceof C991870buz) {
            if (interfaceC1007930cKt != null) {
                type3 = interfaceC1007930cKt.getType();
                data = interfaceC1007930cKt.getData();
            } else {
                type3 = null;
                data = null;
            }
            if (C12878052e.LIZ(type3, data) && (interfaceC1032120cxu3 = this.LIZIZ) != null) {
                interfaceC1032120cxu3.notifyContainerEvent(new C1016080cY2(true));
            }
            InterfaceC1032120cxu interfaceC1032120cxu7 = this.LIZIZ;
            if (interfaceC1032120cxu7 == null) {
                return;
            }
            if (interfaceC1007930cKt != null) {
                type5 = interfaceC1007930cKt.getType();
            }
            interfaceC1032120cxu7.addOverlayViewIfNeed(type5, true);
            return;
        }
        if (abstractC991850bux instanceof C991860buy) {
            if (interfaceC1007930cKt != null) {
                type2 = interfaceC1007930cKt.getType();
                data2 = interfaceC1007930cKt.getData();
            } else {
                type2 = null;
            }
            if (!C12878052e.LIZ(type2, data2) || (interfaceC1032120cxu2 = this.LIZIZ) == null) {
                return;
            }
            interfaceC1032120cxu2.notifyContainerEvent(new C1016080cY2(false));
            return;
        }
        if (abstractC991850bux instanceof C991310bu5) {
            InterfaceC1032120cxu interfaceC1032120cxu8 = this.LIZIZ;
            if (interfaceC1032120cxu8 != null) {
                if (interfaceC1007930cKt != null) {
                    type = interfaceC1007930cKt.getType();
                } else {
                    type = null;
                }
                interfaceC1032120cxu8.addOverlayViewIfNeed(type, false);
            }
            if (interfaceC1007930cKt != null) {
                type6 = interfaceC1007930cKt.getType();
            }
            if (!Intrinsics.LJFF(type6, EnumC1008920cMU.RECEIVE_AGAIN_ALERT.getType()) || (interfaceC1016210cYF = this.LJIIJJI) == null) {
                return;
            }
            interfaceC1016210cYF.B0();
            return;
        }
        if (!(abstractC991850bux instanceof C989580brI)) {
            return;
        }
        T t = ((C989580brI) abstractC991850bux).LIZ;
        if (t instanceof C1009000cMc) {
            C1009000cMc c1009000cMc = (C1009000cMc) t;
            String str3 = c1009000cMc.LIZJ;
            switch (str3.hashCode()) {
                case -2010928017:
                    if (str3.equals("reward_watch_next_ad")) {
                        String str4 = c1009000cMc.LIZLLL;
                        InterfaceC1032120cxu interfaceC1032120cxu9 = this.LIZIZ;
                        if (!(interfaceC1032120cxu9 instanceof InterfaceC1032100cxs) || (interfaceC1032100cxs = (InterfaceC1032100cxs) interfaceC1032120cxu9) == null) {
                            return;
                        }
                        JSONObject jSONObjectLIZLLL = C117300cV.LIZLLL(str4);
                        HashMap<String, Object> mapLIZIZ = C117300cV.LIZIZ(C117300cV.LIZ("commonParams", jSONObjectLIZLLL));
                        JSONObject jSONObjectLIZ = C117300cV.LIZ("extraParams", jSONObjectLIZLLL);
                        HashMap<String, String> map2 = new HashMap<>();
                        if (jSONObjectLIZ != null) {
                            Iterator<String> itKeys = jSONObjectLIZ.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                Object objOpt = jSONObjectLIZ.opt(next);
                                if (objOpt != null && !Intrinsics.LJFF(objOpt, JSONObject.NULL)) {
                                    map2.put(next, objOpt.toString());
                                }
                            }
                        }
                        HashMap<String, Object> mapLIZIZ2 = C117300cV.LIZIZ(C117300cV.LIZ("logExtra", jSONObjectLIZLLL));
                        if (jSONObjectLIZLLL == null) {
                            listLIZJ = C13BV.INSTANCE;
                        } else {
                            Object objOpt2 = jSONObjectLIZLLL.opt("prefetchParams");
                            if (objOpt2 instanceof JSONArray) {
                                listLIZJ = C117300cV.LIZJ((JSONArray) objOpt2);
                            } else if (objOpt2 instanceof String) {
                                String string = a0.LJLIIIL((String) objOpt2).toString();
                                if (string.length() == 0) {
                                    listLIZJ = C13BV.INSTANCE;
                                } else {
                                    try {
                                        c098200Yq = C117300cV.LIZJ(new JSONArray(string));
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    C13BV c13bv = C13BV.INSTANCE;
                                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                        c098200Yq = c13bv;
                                    }
                                    listLIZJ = (List) c098200Yq;
                                }
                            } else {
                                listLIZJ = C13BV.INSTANCE;
                            }
                            break;
                        }
                        if (!(!mapLIZIZ.isEmpty())) {
                            mapLIZIZ = null;
                        }
                        if (!(!map2.isEmpty())) {
                            map2 = null;
                        }
                        if (!(!mapLIZIZ2.isEmpty())) {
                            mapLIZIZ2 = null;
                        }
                        if (!listLIZJ.isEmpty()) {
                            list = listLIZJ;
                        }
                        interfaceC1032100cxs.watchNext(mapLIZIZ, map2, mapLIZIZ2, list);
                        return;
                    }
                    break;
                case -162099329:
                    if (str3.equals("skipIncentiveAdsWatchDuration")) {
                        String str5 = c1009000cMc.LIZLLL;
                        if (str5 == null || str5.length() == 0) {
                            return;
                        }
                        HashMap mapLIZIZ3 = C13054058y.LIZIZ(str5);
                        if (mapLIZIZ3 != null) {
                            obj = mapLIZIZ3.get("duration");
                        } else {
                            obj = null;
                        }
                        if ((obj instanceof Double) && (d = (Double) obj) != null && (numValueOf = Integer.valueOf((int) d.doubleValue())) != null && numValueOf.intValue() >= 0) {
                            InterfaceC1032120cxu interfaceC1032120cxu10 = this.LIZIZ;
                            if (interfaceC1032120cxu10 == null) {
                                return;
                            }
                            interfaceC1032120cxu10.skipRewardAdWatchDuration(numValueOf.intValue());
                            return;
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("skipRewardAdWatchDuration call, skipDurationMs illegal skipDurationMs=");
                        sbLIZ.append(numValueOf);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    break;
                case 251910872:
                    if (str3.equals("close_reward_container")) {
                        LJIIJJI();
                        InterfaceC1016210cYF interfaceC1016210cYF2 = this.LJIIJJI;
                        if (interfaceC1016210cYF2 == null) {
                            return;
                        }
                        interfaceC1016210cYF2.B0();
                        return;
                    }
                    break;
                case 1941987120:
                    if (str3.equals("reward_oneToN_jump")) {
                        String str6 = c1009000cMc.LIZLLL;
                        if (str6 == null || str6.length() == 0) {
                            return;
                        }
                        JSONObject jSONObject = new JSONObject(str6);
                        String strOptString3 = jSONObject.optString("cid");
                        String strOptString4 = jSONObject.optString("tag");
                        jSONObject.optString("label");
                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("extParam");
                        if (jSONObjectOptJSONObject3 != null) {
                            strOptString = jSONObjectOptJSONObject3.optString("refer");
                            jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("ad_extra_data");
                        } else {
                            strOptString = null;
                            jSONObjectOptJSONObject = null;
                        }
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.length() > 0) {
                            Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                linkedHashMap2.put(next2, jSONObjectOptJSONObject.get(next2));
                            }
                        }
                        InterfaceC1032120cxu interfaceC1032120cxu11 = this.LIZIZ;
                        if (interfaceC1032120cxu11 != null) {
                            objSearchHostModelByCid2 = interfaceC1032120cxu11.searchHostModelByCid(strOptString3);
                        }
                        C1016240cYI c1016240cYI = new C1016240cYI(strOptString4, strOptString, linkedHashMap2);
                        InterfaceC1032120cxu interfaceC1032120cxu12 = this.LIZIZ;
                        if (interfaceC1032120cxu12 == null) {
                            return;
                        }
                        interfaceC1032120cxu12.jumpRoute(this.LIZ, c1016240cYI, objSearchHostModelByCid2);
                        return;
                    }
                    break;
                case 1942091253:
                    if (str3.equals("reward_oneToN_next")) {
                        InterfaceC1032120cxu interfaceC1032120cxu13 = this.LIZIZ;
                        if (interfaceC1032120cxu13 == null) {
                            return;
                        }
                        interfaceC1032120cxu13.switchNextAdByOneToN();
                        return;
                    }
                    break;
                case 1960036266:
                    if (str3.equals("reward_oneToN_ad_log")) {
                        String str7 = c1009000cMc.LIZLLL;
                        if (str7 == null || str7.length() == 0) {
                            return;
                        }
                        JSONObject jSONObject2 = new JSONObject(str7);
                        String strOptString5 = jSONObject2.optString("cid");
                        String strOptString6 = jSONObject2.optString("tag");
                        String strOptString7 = jSONObject2.optString("label");
                        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("extParam");
                        if (jSONObjectOptJSONObject4 != null) {
                            strOptString2 = jSONObjectOptJSONObject4.optString("refer");
                            jSONObjectOptJSONObject2 = jSONObjectOptJSONObject4.optJSONObject("ad_extra_data");
                        } else {
                            strOptString2 = null;
                            jSONObjectOptJSONObject2 = null;
                        }
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                            Iterator<String> itKeys3 = jSONObjectOptJSONObject2.keys();
                            while (itKeys3.hasNext()) {
                                String next3 = itKeys3.next();
                                linkedHashMap3.put(next3, jSONObjectOptJSONObject2.get(next3));
                            }
                        }
                        InterfaceC1032120cxu interfaceC1032120cxu14 = this.LIZIZ;
                        if (interfaceC1032120cxu14 != null) {
                            objSearchHostModelByCid = interfaceC1032120cxu14.searchHostModelByCid(strOptString5);
                        }
                        InterfaceC1032120cxu interfaceC1032120cxu15 = this.LIZIZ;
                        if (interfaceC1032120cxu15 == null) {
                            return;
                        }
                        interfaceC1032120cxu15.trackEventFromJSB(new C1031480cws(strOptString6, strOptString7, strOptString2, linkedHashMap3), objSearchHostModelByCid);
                        return;
                    }
                    break;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("unHandle Anole common JSB payload=");
            sbLIZ2.append(c1009000cMc);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (!(t instanceof C1003800cEE) || (interfaceC1032120cxu = this.LIZIZ) == null) {
            return;
        }
        interfaceC1032120cxu.switchNextAdByOneToN();
    }

    @Override // X.InterfaceC1007910cKr
    public final void LLJJIII(String str, View.OnLayoutChangeListener onLayoutChangeListener) {
        InterfaceC1032120cxu interfaceC1032120cxu;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            this.LIZJ.removeOnLayoutChangeListener(onLayoutChangeListener);
        } else {
            if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) || (interfaceC1032120cxu = this.LIZIZ) == null || (bottomInteractView = interfaceC1032120cxu.getBottomInteractView()) == null) {
                return;
            }
            bottomInteractView.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final void X2(String str, ViewOnLayoutChangeListenerC1014330cVD viewOnLayoutChangeListenerC1014330cVD) {
        InterfaceC1032120cxu interfaceC1032120cxu;
        ViewGroup bottomInteractView;
        if (Intrinsics.LJFF(str, EnumC696280RSw.REWARD_ANOLE_BOTTOM_SLOT.getSlotName())) {
            this.LIZJ.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1014330cVD);
        } else {
            if (!Intrinsics.LJFF(str, EnumC1009140cMq.ANOLE_REWARD_BOTTOM_INTERACT_VIEW.getInteractName()) || (interfaceC1032120cxu = this.LIZIZ) == null || (bottomInteractView = interfaceC1032120cxu.getBottomInteractView()) == null) {
                return;
            }
            bottomInteractView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1014330cVD);
        }
    }

    @Override // X.InterfaceC1007910cKr
    public final boolean a3(String str, Runnable runnable, int i) {
        C013C c013c = new C013C();
        AwS10S1301000_16 awS10S1301000_16 = new AwS10S1301000_16(this, str, i, runnable, c013c, 1);
        InterfaceC1032120cxu interfaceC1032120cxu = this.LIZIZ;
        if (interfaceC1032120cxu != null && interfaceC1032120cxu.getRewardAdModel() != null) {
            GmtRewardAdModel rewardAdModel = this.LIZIZ.getRewardAdModel();
            if (rewardAdModel != null) {
                awS10S1301000_16.invoke(rewardAdModel);
            }
        } else {
            InterfaceC1016210cYF interfaceC1016210cYF = this.LJIIJJI;
            if (interfaceC1016210cYF != null) {
                interfaceC1016210cYF.B0();
            }
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
            if (!this.LJII && !this.LJI) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C1016040cXy(Context context, InterfaceC1032120cxu interfaceC1032120cxu, ViewGroup viewGroup, InterfaceC1032280cyA interfaceC1032280cyA, InterfaceC1016100cY4 interfaceC1016100cY4) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1032120cxu;
        this.LIZJ = viewGroup;
        this.LIZLLL = interfaceC1032280cyA;
        this.LJ = interfaceC1016100cY4;
    }
}
