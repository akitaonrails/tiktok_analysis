package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.BoardAddEvent;
import com.bytedance.android.live.BoardRemoveEvent;
import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.board.data.Animation;
import com.bytedance.android.live.effect.board.data.BoardAnimationMessage;
import com.bytedance.android.live.effect.board.data.FadeParameters;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.PreviewCardCohostEvent;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01g3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C394101g3 implements InterfaceC390601fU {
    public static final ConcurrentHashMap<String, C394101g3> LJIILL = new ConcurrentHashMap<>();
    public final String LIZ;
    public C054G LIZIZ;
    public AnonymousClass0956 LIZJ;
    public DataChannel LJ;
    public AnonymousClass0956 LJII;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LIZLLL = true;
    public final LinkedHashMap<Long, InterfaceC395901gL> LJFF = new LinkedHashMap<>();
    public final HashMap<Long, C09AE> LJI = new HashMap<>();
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(540));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(541));
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C5182020e(this, 627));

    @Override // X.InterfaceC390601fU
    public final void pauseEffect() throws JSONException {
        LJII(false);
    }

    @Override // X.InterfaceC390601fU
    public final void LJ() throws JSONException {
        InterfaceC390401fS interfaceC390401fS;
        if ((!this.LJFF.isEmpty()) && (interfaceC390401fS = (InterfaceC390401fS) this.LJIIIIZZ.getValue()) != null) {
            interfaceC390401fS.LIZLLL(EnumC1779720wPi.USER_REPLACE_BOARD);
        }
        Iterator it2 = C13LP.LLIIII(this.LJFF.keySet()).iterator();
        while (it2.hasNext()) {
            LIZIZ(((Long) it2.next()).longValue(), false);
        }
        this.LJFF.clear();
    }

    @Override // X.InterfaceC390601fU
    public final List<InterfaceC395901gL> LJFF() {
        return C13LP.LLIIII(this.LJFF.values());
    }

    @Override // X.InterfaceC390601fU
    public final boolean LJIIIIZZ() {
        return (this.LJIILIIL || LJFF().isEmpty()) ? false : true;
    }

    public final C389701fL LJIJ() {
        return (C389701fL) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC390601fU
    public final void release() throws JSONException {
        C392901fr.LIZ("release");
        LJIILL.remove(this.LIZ);
        LJII(true);
        ((C395101gD) this.LJIIIZ.getValue()).LIZ = null;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C334201Rk(this, null), 3).LJII(AnonymousClass0207.get$arr$(162));
        C054G c054g = this.LIZIZ;
        if (c054g != null) {
            C2296808zG.LIZJ(c054g, new CancellationException("cancel localScope due to release"));
        }
        this.LIZIZ = null;
        LJIJ().LJFF = null;
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LJ = null;
        LJIJJ(false);
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to release"));
        }
        this.LIZJ = null;
        AnonymousClass0956 anonymousClass09562 = this.LJII;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LJII = null;
        this.LJIIJJI = false;
        this.LJIIL = false;
        this.LJIILIIL = false;
        this.LJIILJJIL = false;
        ((ConcurrentHashMap) C392601fo.LIZJ).clear();
        C392901fr.LIZ("[Trace][Resource] All resource sessions trace data are cleared.");
        ((ConcurrentHashMap) C392601fo.LIZIZ).clear();
        C392901fr.LIZ("[Trace][Business] All sessions trace data are cleared.");
        C456101q3.LIZ.LIZIZ();
        C392601fo.LJII(new AbstractC392801fq() { // from class: X.01fx
            public static final String LIZIZ = "release";

            @Override // X.AbstractC392801fq
            public final String LIZ() {
                return LIZIZ;
            }
        }, null);
    }

    public final void LJJI() {
        if (C500260Jjc.LJJ()) {
            if (!this.LJFF.isEmpty()) {
                AnonymousClass0956 anonymousClass0956 = this.LJII;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C1DFH c1dfh = C0PEM.LIZ;
                this.LJII = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C397201gY(this, null), 3);
                return;
            }
            AnonymousClass0956 anonymousClass09562 = this.LJII;
            if (anonymousClass09562 != null) {
                anonymousClass09562.LIZIZ(null);
            }
            C456101q3 c456101q3 = C456101q3.LIZ;
            C456101q3.LJIIIZ = false;
            C456101q3.LJIIJ = 0L;
        }
    }

    public C394101g3(String str) {
        this.LIZ = str;
    }

    public static JSONObject LJIILLIIL(InterfaceC395901gL interfaceC395901gL) throws JSONException {
        interfaceC395901gL.LJFF();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("key", "LiveBoard_Move");
        jSONObject.put("boardID", String.valueOf(interfaceC395901gL.getBoardId()));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("x", Float.valueOf(interfaceC395901gL.getConfig().LJIJI));
        jSONObject2.put("y", Float.valueOf(interfaceC395901gL.getConfig().LJIJJ));
        jSONObject.put("boardPos", jSONObject2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("x", 1.0d);
        jSONObject3.put("y", 1.0d);
        jSONObject.put("boardScale", jSONObject3);
        return jSONObject;
    }

    public static void LJIL(String str) {
        C0U78 c0u78ComposerManagerB;
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null && (c0u78ComposerManagerB = iEffectService.composerManagerB()) != null) {
            c0u78ComposerManagerB.sendEffectMsg(70, 4, 1, str);
        }
    }

    @Override // X.InterfaceC390601fU
    public final void LIZ(DataChannel dataChannel) throws JSONException {
        this.LJ = dataChannel;
        LJIJ().LJFF = dataChannel;
        C392601fo.LJII(new AbstractC392801fq() { // from class: X.01g0
            public static final String LIZIZ = "init_effect";

            @Override // X.AbstractC392801fq
            public final String LIZ() {
                return LIZIZ;
            }
        }, null);
        LJ();
        DataChannel dataChannel2 = this.LJ;
        if (dataChannel2 != null) {
            dataChannel2.DQ2(PanelLayoutTypeChangeEvent.class, this, new C5183020f(this, 343));
            dataChannel2.DQ2(MultiLiveRTCLayoutChannel.class, this, new AwS583S0100000_4(this, 361));
            dataChannel2.DQ2(LinkCrossRoomStateChangeEvent.class, this, new C5183020f(this, 344));
            dataChannel2.DQ2(PreviewCardCohostEvent.class, this, new C5183020f(this, 345));
        }
    }

    @Override // X.InterfaceC390601fU
    public final void LIZLLL(String str) {
        try {
            n nVar = (n) C19748512Ol.LIZIZ.LJII(str, n.class);
            if (nVar.LJJIJIIJIL("key") && Intrinsics.LJFF(nVar.LJJIIZ("key").LJIL(), "On_Start")) {
                C389701fL c389701fLLJIJ = LJIJ();
                c389701fLLJIJ.getClass();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01PQ(true, c389701fLLJIJ, null), 3);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // X.InterfaceC390601fU
    public final void LJII(boolean z) throws JSONException {
        LJ();
        LJIJJ(z);
    }

    @Override // X.InterfaceC390601fU
    public final InterfaceC395901gL LJIIJJI(long j) {
        return this.LJFF.get(Long.valueOf(j));
    }

    @Override // X.InterfaceC390601fU
    public final void LJIILIIL(InterfaceC395901gL interfaceC395901gL) {
        try {
            LJIL(C397401ga.LIZ(interfaceC395901gL, null));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }

    @Override // X.InterfaceC390601fU
    public final void LJIILJJIL(InterfaceC395901gL interfaceC395901gL) {
        try {
            LJIL(C786410Ut5.J3(LJIILLIIL(interfaceC395901gL)));
            LJJI();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJII(e);
        }
    }

    public final void LJIJJ(boolean z) {
        DataChannel dataChannel;
        C389701fL c389701fLLJIJ = LJIJ();
        AnonymousClass0956 anonymousClass0956 = c389701fLLJIJ.LJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("ON_START received"));
        }
        c389701fLLJIJ.LJI = null;
        LiveEffect liveEffect = c389701fLLJIJ.LIZIZ;
        if (liveEffect != null) {
            C0UA1.LIZ().LJIIJ(liveEffect, "tiktok_live_boards");
            C392901fr.LIZ("removeCurrentEffectResource-> effectAppliedStateFlow.value=DEFAULT_NOT_APPLIED before Dispatchers.Main");
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01PR(c389701fLLJIJ, null), 3);
        }
        c389701fLLJIJ.LIZIZ = null;
        for (C09AE c09ae : this.LJI.values()) {
            if (c09ae.isActive()) {
                c09ae.LIZIZ(new CancellationException("clear clearDebounceJobMap"));
            }
        }
        this.LJI.clear();
        C456101q3 c456101q3 = C456101q3.LIZ;
        C456101q3.LJIIIZ = false;
        C456101q3.LJIIJ = 0L;
        if (C500260Jjc.LJJ() && !z && (dataChannel = this.LJ) != null) {
            dataChannel.SX0(C768940UEi.class, Boolean.valueOf(C766290U4d.LIZJ()));
        }
        C392601fo.LJ = false;
        ((ConcurrentHashMap) C392601fo.LIZJ).remove("liveboards_2");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Trace][Resource] Session ended for resourceId: ");
        sbLIZ.append("liveboards_2");
        sbLIZ.append(". Trace data cleared.");
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ((ConcurrentHashMap) C392601fo.LIZIZ).clear();
        C392901fr.LIZ("[Trace][Business] All sessions trace data are cleared.");
    }

    public final void LJJ(boolean z) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C391501fd(this, z, null), 3);
    }

    public static void LJIIZILJ(InterfaceC395901gL interfaceC395901gL, C388501f9 c388501f9) {
        EnumC395001gC enumC395001gC;
        float duration;
        float duration2;
        if (c388501f9 == null || (enumC395001gC = c388501f9.LIZ) == null) {
            return;
        }
        float duration3 = 0.3f;
        if (enumC395001gC == EnumC395001gC.FADE) {
            BoardAnimationMessage boardAnimationMessage = new BoardAnimationMessage("LiveBoard_Anim", new ArrayList());
            Animation animation = new Animation(0L, "fade", new FadeParameters(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f));
            animation.boardID = interfaceC395901gL.getBoardId();
            animation.type = "fade";
            FadeParameters fadeParameters = animation.parameters;
            fadeParameters.subTextureIndex = 0;
            fadeParameters.startOpacity = 1.0f;
            fadeParameters.endOpacity = 0.0f;
            EnumC395001gC enumC395001gC2 = c388501f9.LIZ;
            if (enumC395001gC2 != null) {
                duration2 = enumC395001gC2.getDuration();
            } else {
                duration2 = 0.3f;
            }
            fadeParameters.duration = duration2;
            boardAnimationMessage.animations.add(animation);
            Animation animation2 = new Animation(0L, "fade", new FadeParameters(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f));
            animation2.boardID = interfaceC395901gL.getBoardId();
            animation2.type = "fade";
            FadeParameters fadeParameters2 = animation2.parameters;
            fadeParameters2.subTextureIndex = 1;
            fadeParameters2.startOpacity = 0.0f;
            fadeParameters2.endOpacity = 1.0f;
            EnumC395001gC enumC395001gC3 = c388501f9.LIZ;
            if (enumC395001gC3 != null) {
                duration3 = enumC395001gC3.getDuration();
            }
            fadeParameters2.duration = duration3;
            boardAnimationMessage.animations.add(animation2);
            LJIL(GsonProtectorUtils.toJson(C293501Bt.LIZ(), boardAnimationMessage));
            return;
        }
        if (enumC395001gC != EnumC395001gC.SLIDE) {
            return;
        }
        BoardAnimationMessage boardAnimationMessage2 = new BoardAnimationMessage("LiveBoard_Anim", new ArrayList());
        float duration4 = 0.3f;
        Animation animation3 = new Animation(0L, "fade", new FadeParameters(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f));
        animation3.boardID = interfaceC395901gL.getBoardId();
        animation3.type = "slide";
        FadeParameters fadeParameters3 = animation3.parameters;
        fadeParameters3.subTextureIndex = 0;
        fadeParameters3.expand = -1;
        fadeParameters3.direction = 1;
        EnumC395001gC enumC395001gC4 = c388501f9.LIZ;
        if (enumC395001gC4 != null) {
            duration = enumC395001gC4.getDuration();
        } else {
            duration = 0.3f;
        }
        fadeParameters3.duration = duration;
        animation3.parameters.opacity = 1.0f;
        boardAnimationMessage2.animations.add(animation3);
        Animation animation4 = new Animation(0L, "fade", new FadeParameters(0, 1.0f, 1.0f, 0.3f, 1, 1, 1.0f));
        animation4.boardID = interfaceC395901gL.getBoardId();
        animation4.type = "slide";
        FadeParameters fadeParameters4 = animation4.parameters;
        fadeParameters4.subTextureIndex = 1;
        fadeParameters4.expand = 1;
        fadeParameters4.direction = 1;
        EnumC395001gC enumC395001gC5 = c388501f9.LIZ;
        if (enumC395001gC5 != null) {
            duration4 = enumC395001gC5.getDuration();
        }
        fadeParameters4.duration = duration4;
        animation4.parameters.opacity = 1.0f;
        boardAnimationMessage2.animations.add(animation4);
        LJIL(GsonProtectorUtils.toJson(C293501Bt.LIZ(), boardAnimationMessage2));
    }

    @Override // X.InterfaceC390601fU
    public final void LIZIZ(long j, boolean z) throws JSONException {
        C394501g7 config;
        InterfaceC395901gL interfaceC395901gLLJIIJJI = LJIIJJI(j);
        if (interfaceC395901gLLJIIJJI != null) {
            C392601fo.LJFF(interfaceC395901gLLJIIJJI.getGroupId() + interfaceC395901gLLJIIJJI.getBoardId(), new AbstractC392801fq() { // from class: X.01g2
                public static final String LIZIZ = "remove_item_view";

                @Override // X.AbstractC392801fq
                public final String LIZ() {
                    return LIZIZ;
                }
            }, null);
        }
        DataChannel dataChannel = this.LJ;
        if (dataChannel != null) {
            dataChannel.LC0(BoardRemoveEvent.class, Long.valueOf(j));
        }
        if (interfaceC395901gLLJIIJJI == null || (config = interfaceC395901gLLJIIJJI.getConfig()) == null || !config.LJJIII) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "LiveBoard_Delete");
            jSONObject.put("boardID", String.valueOf(j));
            LJIL(C786410Ut5.J3(jSONObject));
        }
        this.LJFF.remove(Long.valueOf(j));
        if (interfaceC395901gLLJIIJJI != null) {
            C392601fo.LJFF(interfaceC395901gLLJIIJJI.getGroupId() + interfaceC395901gLLJIIJJI.getBoardId(), new AbstractC392801fq() { // from class: X.01fz
                public static final String LIZIZ = "did_remove_item";

                @Override // X.AbstractC392801fq
                public final String LIZ() {
                    return LIZIZ;
                }
            }, null);
            InterfaceC392301fl statusCallback = interfaceC395901gLLJIIJJI.getStatusCallback();
            if (statusCallback != null) {
                statusCallback.LIZ(z);
            }
        }
        LJJI();
        if (this.LJFF.isEmpty()) {
            AnonymousClass0956 anonymousClass0956 = this.LIZJ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to removeBoard"));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            this.LIZJ = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C01PZ(this, null), 3);
        }
    }

    @Override // X.InterfaceC390601fU
    public final C11KS LIZJ(Context context, EnumC389301fH enumC389301fH) {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to checkBoardConflicts"));
        }
        InterfaceC390401fS interfaceC390401fS = (InterfaceC390401fS) this.LJIIIIZZ.getValue();
        if (interfaceC390401fS != null) {
            interfaceC390401fS.LIZJ();
        }
        return AbstractC19484711Kz.LJII(new C515401zc(context, enumC389301fH, this, 1));
    }

    @Override // X.InterfaceC390601fU
    public final C11KS LJI(Context context, EnumC389301fH enumC389301fH) {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to applyEffect"));
        }
        InterfaceC390401fS interfaceC390401fS = (InterfaceC390401fS) this.LJIIIIZZ.getValue();
        if (interfaceC390401fS != null) {
            interfaceC390401fS.LIZJ();
        }
        return AbstractC19484711Kz.LJII(new C515401zc(context, enumC389301fH, this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // X.InterfaceC390601fU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(androidx.lifecycle.LifecycleOwner r6, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.bytedance.android.livesdkapi.depend.model.LiveEffect, kotlin.Unit> r7) {
        /*
            r5 = this;
            X.08hG r2 = kotlinx.coroutines.CoroutineExceptionHandler.LJJLIL
            X.0204 r1 = new X.0204
            r0 = 14
            r1.<init>(r2, r0)
            if (r6 == 0) goto L24
            androidx.lifecycle.LifecycleCoroutineScope r4 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            if (r4 == 0) goto L24
        L11:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            kotlin.coroutines.CoroutineContext r3 = r0.plus(r1)
            X.01ew r2 = new X.01ew
            r1 = 0
            r2.<init>(r5, r6, r7, r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
            return
        L24:
            X.054G r4 = r5.LIZIZ
            if (r4 != 0) goto L11
            X.1DFB r0 = X.C0PEM.LIZJ
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r1)
            X.054G r4 = X.C2296808zG.LIZ(r0)
            r5.LIZIZ = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394101g3.LJIIL(androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function2):void");
    }

    public final void LJIILL(InterfaceC395901gL interfaceC395901gL, boolean z) {
        C1092100eWe c1092100eWe;
        View view = interfaceC395901gL.getView();
        if (view != null) {
            if (z && !C500260Jjc.LJIL() && !C500260Jjc.LJJIJLIJ()) {
                long boardId = interfaceC395901gL.getBoardId();
                int i = interfaceC395901gL.getConfig().LIZIZ;
                float f = interfaceC395901gL.getConfig().LJII;
                float f2 = interfaceC395901gL.getConfig().LJIIIIZZ;
                interfaceC395901gL.getConfig();
                boolean z2 = interfaceC395901gL.getConfig().LIZLLL;
                boolean z3 = interfaceC395901gL.getConfig().LJ;
                float f3 = interfaceC395901gL.getConfig().LJIIL;
                float f4 = interfaceC395901gL.getConfig().LJIILIIL;
                float f5 = interfaceC395901gL.getConfig().LJIILJJIL;
                float f6 = interfaceC395901gL.getConfig().LJIILL;
                float f7 = interfaceC395901gL.getConfig().LJIILLIIL;
                C484701uf c484701uf = new C484701uf(interfaceC395901gL);
                boolean z4 = interfaceC395901gL.getConfig().LJJI;
                C394501g7 config = interfaceC395901gL.getConfig();
                c1092100eWe = new C1092100eWe(boardId, i, view, f, f2, z2, z3, f3, f4, f5, f6, f7, c484701uf, null, null, null, null, z4, config.LJJ * config.LJJIIZ, new C485301ul(interfaceC395901gL), interfaceC395901gL.getConfig().LJIIJJI, interfaceC395901gL.getConfig().LJJII, interfaceC395901gL.getConfig().LJJIIJ, interfaceC395901gL.getConfig().LJJIII, interfaceC395901gL.getConfig().LJJIIJZLJL);
            } else {
                long boardId2 = interfaceC395901gL.getBoardId();
                int i2 = interfaceC395901gL.getConfig().LIZIZ;
                float f8 = interfaceC395901gL.getConfig().LJII;
                float f9 = interfaceC395901gL.getConfig().LJIIIIZZ;
                interfaceC395901gL.getConfig();
                boolean z5 = interfaceC395901gL.getConfig().LIZLLL;
                boolean z6 = interfaceC395901gL.getConfig().LJ;
                float f10 = interfaceC395901gL.getConfig().LJIIL;
                float f11 = interfaceC395901gL.getConfig().LJIILIIL;
                float f12 = interfaceC395901gL.getConfig().LJIILJJIL;
                float f13 = interfaceC395901gL.getConfig().LJIILL;
                float f14 = interfaceC395901gL.getConfig().LJIILLIIL;
                C484801ug c484801ug = new C484801ug(interfaceC395901gL);
                C484901uh c484901uh = new C484901uh(interfaceC395901gL);
                C485101uj c485101uj = new C485101uj(interfaceC395901gL);
                C485001ui c485001ui = new C485001ui(interfaceC395901gL);
                C485201uk c485201uk = new C485201uk(interfaceC395901gL);
                boolean z7 = interfaceC395901gL.getConfig().LJJI;
                C394501g7 config2 = interfaceC395901gL.getConfig();
                c1092100eWe = new C1092100eWe(boardId2, i2, view, f8, f9, z5, z6, f10, f11, f12, f13, f14, c484801ug, c484901uh, c485101uj, c485001ui, c485201uk, z7, config2.LJJ * config2.LJJIIZ, new C485401um(interfaceC395901gL), interfaceC395901gL.getConfig().LJIIJJI, interfaceC395901gL.getConfig().LJJII, interfaceC395901gL.getConfig().LJJIIJ, interfaceC395901gL.getConfig().LJJIII, interfaceC395901gL.getConfig().LJJIIJZLJL);
            }
            DataChannel dataChannel = this.LJ;
            if (dataChannel != null) {
                dataChannel.LC0(BoardAddEvent.class, c1092100eWe);
                return;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addViewToWindow getView() is null nativeRender=");
        sbLIZ.append(z);
        sbLIZ.append(" boardId=");
        sbLIZ.append(interfaceC395901gL.getBoardId());
        sbLIZ.append(" bizType=");
        sbLIZ.append(interfaceC395901gL.getConfig().LIZ);
        C470401sM.LIZIZ(-5012, 5, C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJI(X.InterfaceC395901gL r9, X.InterfaceC1364105Vn<? super kotlin.Pair<java.lang.String, java.lang.String>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C394701g9
            if (r0 == 0) goto La8
            r6 = r10
            X.01g9 r6 = (X.C394701g9) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La8
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r3 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 1
            if (r0 == 0) goto L3c
            if (r0 != r5) goto Laf
            java.lang.Object r2 = r6.LLILLJJLI
            X.01gL r9 = r6.LL
            X.C155000ia.LIZIZ(r3)
        L26:
            X.01g7 r1 = r9.getConfig()
            boolean r0 = r8.LJIILIIL
            r1.LIZLLL = r0
            X.01g7 r1 = r9.getConfig()
            boolean r0 = r8.LJIILJJIL
            r1.LJ = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r3, r2)
            return r0
        L3c:
            X.C155000ia.LIZIZ(r3)
            android.view.View r0 = r9.getView()
            if (r0 == 0) goto L78
            int r0 = r0.getWidth()
            if (r0 != 0) goto L78
            r0 = 1
        L4c:
            r4 = 0
            if (r0 != 0) goto L5b
            android.view.View r0 = r9.getView()
            if (r0 == 0) goto L7a
            int r0 = r0.getHeight()
            if (r0 != 0) goto L7a
        L5b:
            X.01fo r7 = X.C392601fo.LIZ
            long r2 = r9.getGroupId()
            long r0 = r9.getBoardId()
            long r2 = r2 + r0
            X.01fp r6 = new X.01fp
            X.01es r5 = new X.01es
            r1 = -2005(0xfffffffffffff82b, float:NaN)
            java.lang.String r0 = "Invalid board dimensions"
            r5.<init>(r1, r0)
            r6.<init>(r5)
            r7.LJ(r2, r6)
            return r4
        L78:
            r0 = 0
            goto L4c
        L7a:
            java.util.LinkedHashMap<java.lang.Long, X.01gL> r2 = r8.LJFF
            long r0 = r9.getBoardId()
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r2.put(r0, r9)
            long r2 = r9.getGroupId()
            long r0 = r9.getBoardId()
            long r2 = r2 + r0
            X.01g1 r0 = new X.AbstractC392801fq() { // from class: X.01g1
                public static final java.lang.String LIZIZ = "prepare_biz_data";

                static {
                    /*
                        X.01g1 r0 = new X.01g1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.01g1) X.01g1.LIZ X.01g1
                        java.lang.String r0 = "prepare_biz_data"
                        X.C393901g1.LIZIZ = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C393901g1.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C393901g1.<init>():void");
                }

                @Override // X.AbstractC392801fq
                public final java.lang.String LIZ() {
                    /*
                        r1 = this;
                        java.lang.String r0 = X.C393901g1.LIZIZ
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C393901g1.LIZ():java.lang.String");
                }
            }
            X.C392601fo.LJFF(r2, r0, r4)
            X.01g7 r0 = r9.getConfig()
            java.lang.String r2 = r0.LJJIFFI
            r6.LL = r9
            r6.LLILLJJLI = r2
            r6.LLILZIL = r5
            java.lang.Object r3 = r8.LJIJJLI(r9, r6)
            if (r3 != r7) goto L26
            return r7
        La8:
            X.01g9 r6 = new X.01g9
            r6.<init>(r8, r10)
            goto L12
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394101g3.LJIJI(X.01gL, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJJLI(X.InterfaceC395901gL r14, X.InterfaceC1364105Vn<? super java.lang.String> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394101g3.LJIJJLI(X.01gL, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC390601fU
    public final Object LJIIIZ(Context context, EnumC389301fH enumC389301fH, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to boardEffectResourceCheck"));
        }
        InterfaceC390401fS interfaceC390401fS = (InterfaceC390401fS) this.LJIIIIZZ.getValue();
        if (interfaceC390401fS != null) {
            interfaceC390401fS.LIZJ();
        }
        return LJIJ().LIZLLL(context, enumC389301fH, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC390601fU
    public final C11KS LJIIJ(final Context context, final InterfaceC395901gL interfaceC395901gL, final C388501f9 c388501f9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addOrRefreshBoard start: ");
        sbLIZ.append(interfaceC395901gL.getGroupId());
        sbLIZ.append('_');
        sbLIZ.append(interfaceC395901gL.getBoardId());
        C392901fr.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AnonymousClass0956 anonymousClass0956 = this.LIZJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(new CancellationException("cancel removeEffectJob due to addOrRefreshBoard"));
        }
        final long groupId = interfaceC395901gL.getGroupId() + interfaceC395901gL.getBoardId();
        C09AE c09ae = this.LJI.get(Long.valueOf(interfaceC395901gL.getBoardId()));
        if (c09ae != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("cancel debounceJobMap due to addOrRefreshBoard ");
            sbLIZ2.append(groupId);
            sbLIZ2.append(" again");
            c09ae.LIZIZ(new CancellationException(C2188811AlT.LIZIZ(sbLIZ2)));
        }
        boolean z = interfaceC395901gL.getConfig().LJJIII;
        Map<Long, C393001fs> map = C392601fo.LIZIZ;
        Long lValueOf = Long.valueOf(interfaceC395901gL.getGroupId() + interfaceC395901gL.getBoardId());
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
        Object c393001fs = concurrentHashMap.get(lValueOf);
        if (c393001fs == null) {
            c393001fs = new C393001fs(interfaceC395901gL, new ConcurrentHashMap());
            concurrentHashMap.put(lValueOf, c393001fs);
        }
        ((C393001fs) c393001fs).LIZIZ.clear();
        C392601fo.LJFF = z;
        C392601fo.LJFF(groupId, C393601fy.LIZ, null);
        return AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.01fm
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<Boolean> interfaceC2329309At) {
                C11KT c11kt = (C11KT) interfaceC2329309At;
                C392501fn c392501fn = new C392501fn(CoroutineExceptionHandler.LJJLIL, c11kt, groupId);
                HashMap<Long, C09AE> map2 = this.LL.LJI;
                Long lValueOf2 = Long.valueOf(interfaceC395901gL.getBoardId());
                C1DFH c1dfh = C0PEM.LIZ;
                map2.put(lValueOf2, C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.plus(c392501fn)), null, null, new C391601fe(context, c388501f9, interfaceC395901gL, this.LL, null), 3));
                C09AE c09ae2 = this.LL.LJI.get(Long.valueOf(interfaceC395901gL.getBoardId()));
                if (c09ae2 != null) {
                    c09ae2.LJII(new C020W(c11kt, interfaceC395901gL, 90));
                }
            }
        });
    }
}
