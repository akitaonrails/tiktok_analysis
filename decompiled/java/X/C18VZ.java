package X;

import Y.AObjectS249S0100000_32;
import Y.ARunnableS101S0200000_32;
import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.text.TextWatcher;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.AIPlaygroundChipsModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import com.ss.android.ugc.tools.chat.room.model.CreationChatRoomEnterParams;
import com.ss.android.ugc.tools.data.AIChatAppearance;
import com.ss.android.ugc.tools.data.AIChatPageConfig;
import com.ss.android.ugc.tools.data.AIChatPayload;
import com.ss.android.ugc.tools.data.AIChatTrackingConfig;
import com.ss.android.ugc.tools.data.GuideAppearance;
import com.ss.android.ugc.tools.data.InputAreaAppearance;
import ge.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS398S0200000_32;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.AwS62S0310000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18VZ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VZ extends i<C18VO, C21296918Vz, C21295318Vj, C21296618Vw> implements C18VO, InterfaceC379610EuV {
    public static final C21296718Vx LLJZIJLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final int LLLF;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C11RK<C18UI> LLJJ;
    public final InterfaceC332260D0u<Boolean> LLJJI;
    public final InterfaceC332260D0u<Boolean> LLJJIII;
    public boolean LLJJIJI;
    public Function0<? extends View> LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final InterfaceC1731706qJ LLJJJ;
    public final InterfaceC1731706qJ LLJJJIL;
    public final InterfaceC1731706qJ LLJJJJ;
    public final InterfaceC1731706qJ LLJJJJJIL;
    public final InterfaceC1731706qJ LLJJJJLIIL;
    public final C11NJ LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C18W7 LLJLIL;
    public String LLJLILLLLZIIL;
    public int LLJLL;
    public final C01GW LLJLLIL;
    public final C21288318Sr LLJLLL;
    public final C01GW LLJZ;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.18Vx] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18VZ.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C18VZ.class, "chatRoomComponentApi", "getChatRoomComponentApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomFeatureApi;", 0), new C2217381BqS(C18VZ.class, "chatExtractFrameApi", "getChatExtractFrameApi()Lcom/ss/android/ugc/tools/chat/extract/api/AiChatExtractFramesFeatureApi;", 0), new C2217381BqS(C18VZ.class, "chatPreviewFeatureApi", "getChatPreviewFeatureApi()Lcom/ss/android/ugc/tools/chat/preview/api/AiChatPreviewFeatureApi;", 0), new C2217381BqS(C18VZ.class, "draftApi", "getDraftApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatDraftApi;", 0), new C2217381BqS(C18VZ.class, "actionBarApi", "getActionBarApi()Lcom/ss/android/ugc/tools/chat/input/api/AiChatActionBarApi;", 0)};
        LLJZIJLIL = new Object() { // from class: X.18Vx
        };
        LLLF = 8;
    }

    private final C18VP C5() {
        return (C18VP) this.LLJJJJ.getValue(this, LLL[3]);
    }

    private final LiveState<EnumC21294918Vf> M5() {
        return H2(new C2217381BqS() { // from class: X.18Vp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21295318Vj) obj).LIZ;
            }
        });
    }

    private final LiveState<String> N5() {
        return H2(new C2217381BqS() { // from class: X.18Vq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C21295318Vj) obj).LIZLLL;
            }
        });
    }

    private final C21292518Uh R5() {
        return (C21292518Uh) this.LLJZ.getValue();
    }

    private final C21294518Vb v5() {
        return (C21294518Vb) this.LLJLLIL.getValue();
    }

    private final C18VS x5() {
        return (C18VS) this.LLJJJIL.getValue(this, LLL[2]);
    }

    public final AiChatRoomFeatureApi D5() {
        return (AiChatRoomFeatureApi) this.LLJJJ.getValue(this, LLL[1]);
    }

    public final C18UJ E5() {
        return (C18UJ) this.LLJJIJIL.getValue(this, LLL[0]);
    }

    public final InterfaceC21167517sX H5() {
        return (InterfaceC21167517sX) this.LLJJJJJIL.getValue(this, LLL[4]);
    }

    public final C21288318Sr S5() {
        if (!((Boolean) C289720BXe.LIZ.getValue()).booleanValue() || !C21295618Vm.LIZ().getBoolean("key_is_pending", false)) {
            return null;
        }
        if (!Intrinsics.LJFF(C21295618Vm.LIZ().getString("key_session_id", ""), E5().LIZJ)) {
            C21295618Vm.LIZ().clear();
            return null;
        }
        String string = C21295618Vm.LIZ().getString("key_input_data", "");
        if (string.length() != 0) {
            try {
                return (C21288318Sr) C21295618Vm.LIZIZ.LJII(string, C21288318Sr.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21290818Tq.LIZIZ("AiChatPendingAuthKeva", "Failed to parse pending input data", e);
                C21295618Vm.LIZ().clear();
            }
        }
        return null;
    }

    @Override // X.C18VO
    public void b51() {
        C18W7 c18w7 = this.LLJLIL;
        if (c18w7 != null) {
            c18w7.LJIIJJI = false;
            if (c18w7.LJIIL) {
                C21290818Tq.LIZJ("KeyboardHelper", "resumeKeyboard");
                C18W7.LIZIZ(c18w7, null, 3);
            }
        }
    }

    public final void h8() {
        C18W2 c18w2 = this.LLJLLL.LIZ;
        Z4(c18w2 != null ? c18w2.LIZ : null, "");
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Remove Input Data Operation!");
        T4();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k5() {
        /*
            r3 = this;
            boolean r0 = r3.LLJL
            if (r0 != 0) goto L5b
            X.18Sr r0 = r3.LLJLLL
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt r0 = r0.LIZJ
            r1 = 0
            if (r0 == 0) goto L59
            java.lang.String r0 = r0.getPromptId()
        Lf:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L1f
            X.18Sr r0 = r3.LLJLLL
            java.util.List<X.18Vo> r0 = r0.LIZIZ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L5b
        L1f:
            X.18Sr r0 = r3.LLJLLL
            X.18W2 r0 = r0.LIZ
            if (r0 == 0) goto L27
            java.lang.String r1 = r0.LIZIZ
        L27:
            boolean r0 = r3.n7(r1)
            if (r0 != 0) goto L5b
            X.188u r2 = X.EnumC212366188u.ENABLE
        L2f:
            java.lang.Object r0 = r3.T2()
            X.18Vj r0 = (X.C21295318Vj) r0
            X.188u r0 = r0.LJ
            if (r0 == r2) goto L43
            kotlin.jvm.internal.AwS398S0200000_32 r1 = new kotlin.jvm.internal.AwS398S0200000_32
            r0 = 40
            r1.<init>(r3, r2, r0)
            r3.i3(r1)
        L43:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[Change Send Button]current Send State: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AiChatInputFeatureComponent"
            X.C21290818Tq.LIZ(r0, r1)
            return
        L59:
            r0 = r1
            goto Lf
        L5b:
            X.188u r2 = X.EnumC212366188u.RESET_ALPHA
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.k5():void");
    }

    public final boolean n5() {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        return this.LLJJIJI || !((iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) == null || !interfaceC21291818UaLIZLLL.LIZIZ());
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21295318Vj> o2() {
        return new AwS576S0100000_32(this, 389);
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        C21290818Tq.LIZJ("AiChatInputFeatureComponent", "onPause");
        super.onPause();
        C18W7 c18w7 = this.LLJLIL;
        if (c18w7 != null) {
            boolean z = false;
            c18w7.LJI = false;
            View viewInvoke = c18w7.LIZ.invoke();
            boolean z2 = viewInvoke != null && viewInvoke.hasFocus();
            c18w7.LJIIIIZZ = z2;
            boolean z3 = c18w7.LJIILL;
            c18w7.LJIIIZ = z3;
            if (z2 && z3) {
                z = true;
            }
            c18w7.LJIIJ = z;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPause wasEditingBeforeStop:");
            sbLIZ.append(c18w7.LJIIIIZZ);
            sbLIZ.append(", wasKeyboardVisibleBeforeStop:");
            sbLIZ.append(c18w7.LJIIIZ);
            C21290818Tq.LIZJ("KeyboardHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.C18VO
    public C11NZ<C18UI> r21() {
        C11RK<C18UI> c11rk = this.LLJJ;
        c11rk.getClass();
        return new C19475711Hn(c11rk);
    }

    public final InterfaceC21295718Vn t5() {
        return (InterfaceC21295718Vn) this.LLJJJJLIIL.getValue(this, LLL[5]);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C21296618Vw> w2() {
        return new AwS576S0100000_32(this, 388);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void T4() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.T4():void");
    }

    private final boolean p8() {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        return C289710BXd.LIZ() && ((iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) == null || !interfaceC21291818UaLIZLLL.LIZIZ());
    }

    public final AIChatPayload U5() {
        AIChatPageConfig aIChatPageConfig = E5().LJI;
        if (aIChatPageConfig != null && aIChatPageConfig.payload != null) {
            AIChatPageConfig aIChatPageConfig2 = E5().LJI;
            if (aIChatPageConfig2 != null) {
                return aIChatPageConfig2.payload;
            }
            return null;
        }
        CreationChatRoomEnterParams creationChatRoomEnterParams = E5().LJII;
        if (creationChatRoomEnterParams.text == null && creationChatRoomEnterParams.imageUrl1 == null && creationChatRoomEnterParams.imageUrl2 == null) {
            return null;
        }
        C1357350lQT c1357350lQT = new C1357350lQT();
        if (creationChatRoomEnterParams.imageUrl1 != null) {
            C1357350lQT.LIZ(new AwS611S0100000_32(creationChatRoomEnterParams, 197));
            throw null;
        }
        if (creationChatRoomEnterParams.imageUrl2 != null) {
            C1357350lQT.LIZ(new AwS611S0100000_32(creationChatRoomEnterParams, 198));
            throw null;
        }
        if (creationChatRoomEnterParams.text != null) {
            c1357350lQT.LIZ = new AIChatGenPrompt(UUID.randomUUID().toString(), creationChatRoomEnterParams.text, null, null, null, null);
        }
        AIChatGenPrompt aIChatGenPrompt = c1357350lQT.LIZ;
        ArrayList arrayList = (ArrayList) c1357350lQT.LIZIZ;
        return new AIChatPayload(aIChatGenPrompt, arrayList.isEmpty() ^ true ? arrayList : null);
    }

    public final void W6() {
        o8();
        S6(true, EnumC21295018Vg.UI_ACTION_REIN);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[PHI: r9
      0x0078: PHI (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v3 java.lang.String) binds: [B:33:0x0076, B:31:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d6() {
        /*
            r14 = this;
            com.bytedance.als.ui.state.LiveState r0 = r14.M5()
            java.lang.Object r2 = r0.LIZJ()
            X.18Vf r0 = X.EnumC21294918Vf.IMAGE_MAXED
            java.lang.String r1 = "AiChatInputFeatureComponent"
            if (r2 == r0) goto La4
            com.bytedance.als.ui.state.LiveState r0 = r14.M5()
            java.lang.Object r2 = r0.LIZJ()
            X.18Vf r0 = X.EnumC21294918Vf.IMAGE_ACTION_BAR
            if (r2 == r0) goto La4
            r14.o8()
            X.18Sr r0 = r14.LLJLLL
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt r0 = r0.LIZJ
            r10 = 0
            if (r0 == 0) goto La2
            java.lang.String r0 = r0.getPromptId()
        L28:
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L97
            int r0 = r0.length()
            if (r0 == 0) goto L97
            r6 = 1
        L33:
            X.18Uh r0 = r14.R5()
            X.18UJ r5 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel r2 = r5.LJ
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel r2 = r2.chatRoomModel
            if (r2 == 0) goto L5b
            X.12Pt r4 = X.C19751912Pt.LIZ
            java.lang.String r11 = r2.creationId
            java.lang.String r12 = r2.shootWay
            java.lang.String r13 = r2.enterMethod
            int r8 = r2.quota
            java.lang.Boolean r9 = r2.isNewUser
            com.ss.android.ugc.tools.data.AIChatPageConfig r2 = r5.LJI
            if (r2 == 0) goto L55
            com.ss.android.ugc.tools.data.AIChatTrackingConfig r2 = r2.tracking
            if (r2 == 0) goto L55
            java.lang.Integer r10 = r2.awemeType
        L55:
            r4.getClass()
            X.C19751912Pt.LIZ(r8, r9, r10, r11, r12, r13)
        L5b:
            X.0LIw r4 = X.C540800LIw.LIZ
            X.18UJ r2 = r0.LIZ
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel r11 = r2.LJ
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel r2 = r11.chatRoomModel
            java.lang.String r10 = ""
            if (r2 == 0) goto L6b
            java.lang.String r5 = r2.creationId
            if (r5 != 0) goto L6c
        L6b:
            r5 = r10
        L6c:
            if (r6 > r3) goto L6f
            r7 = 1
        L6f:
            if (r2 == 0) goto L75
            java.lang.String r9 = r2.shootWay
            if (r9 != 0) goto L78
        L75:
            r9 = r10
            if (r2 == 0) goto L7d
        L78:
            java.lang.String r2 = r2.enterMethod
            if (r2 == 0) goto L7d
            r10 = r2
        L7d:
            r4.getClass()
            r8 = 69
            android.os.Bundle r4 = X.C540800LIw.LIZ(r5, r6, r7, r8, r9, r10, r11)
            X.0MTo r3 = X.C1660680tJi.LIZ()
            X.19EG r2 = r0.LIZIZ
            r0 = 1028(0x404, float:1.44E-42)
            r3.LIZJ(r2, r4, r0, r0)
            java.lang.String r0 = "Add Image Action Operation!"
            X.C21290818Tq.LIZ(r1, r0)
            return
        L97:
            X.18Sr r0 = r14.LLJLLL
            java.util.List<X.18Vo> r0 = r0.LIZIZ
            int r0 = r0.size()
            int r6 = 2 - r0
            goto L33
        La2:
            r0 = r10
            goto L28
        La4:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "handleAddImageAction return; inputModeState="
            r2.append(r0)
            com.bytedance.als.ui.state.LiveState r0 = r14.M5()
            java.lang.Object r0 = r0.LIZJ()
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C21290818Tq.LIZ(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.d6():void");
    }

    public final void o8() {
        if (T2().LIZ == EnumC21294918Vf.REINFORCE) {
            Keva keva = C21139517o1.LIZ;
            String str = E5().LIZLLL;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Keva keva2 = C21139517o1.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_click_time");
            sbLIZ.append(str);
            keva2.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
            i3(AFwS278S0000000_32.get$arr$(119));
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18Vh] */
    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        super.onCreate();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C21294418Va(this, null), 3);
        boolean z = true;
        if (!C289710BXd.LIZ() && ((iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) == null || !interfaceC21291818UaLIZLLL.LIZIZ())) {
            z = false;
        }
        this.LLJJIJI = z;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18VT(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18VX(this, null), 3);
        N5().LIZ(this, new AObjectS249S0100000_32(this, 18));
        M5().LIZ(this, new AObjectS249S0100000_32(this, 17));
        Scene sceneLIZ = C565530MFz.LIZ(this.LLJILJILJ);
        if (sceneLIZ != null) {
            this.LLJLIL = new C18W7(sceneLIZ, new AwS576S0100000_32(this, 387), new AwS575S0100000_31(sceneLIZ, 1291), new C18W9() { // from class: X.18Vh
                @Override // X.C18W9
                public final void LIZIZ() {
                    if (!this.LIZ.n5()) {
                        C21290818Tq.LIZJ("AiChatInputFeatureComponent", "User Activate the Keyboard Failed, cause privacy");
                    } else {
                        this.LIZ.S6(true, EnumC21295018Vg.DETECT_CHANGED);
                        C21290818Tq.LIZ("AiChatInputFeatureComponent", "User Activate the Keyboard");
                    }
                }

                @Override // X.C18W9
                public final void LIZ(EnumC993320bxK enumC993320bxK) {
                    if (enumC993320bxK != EnumC993320bxK.CONTEXT_LOST) {
                        this.LIZ.S6(false, EnumC21295018Vg.DETECT_CHANGED);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("User Fold the Keyboard ");
                    sbLIZ.append(enumC993320bxK);
                    C21290818Tq.LIZ("AiChatInputFeatureComponent", C2188811AlT.LIZIZ(sbLIZ));
                }
            });
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLJJL.dispose();
        C18W7 c18w7 = this.LLJLIL;
        if (c18w7 != null) {
            c18w7.LJIILIIL.getViewTreeObserver().removeOnWindowFocusChangeListener(c18w7.LJIIZILJ);
            C786410Ut5.C3(c18w7.LJIILIIL.getViewTreeObserver(), c18w7.LJIILLIIL);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        View viewInvoke;
        super.onResume();
        C21290818Tq.LIZJ("AiChatInputFeatureComponent", "onResume");
        C18W7 c18w7 = this.LLJLIL;
        if (c18w7 != null) {
            c18w7.LJI = true;
            C21290818Tq.LIZJ("KeyboardHelper", "onResume");
            if (c18w7.LJIIJ && c18w7.LJIIIIZZ && c18w7.LJIIIZ && (viewInvoke = c18w7.LIZ.invoke()) != null && viewInvoke.isAttachedToWindow()) {
                HandlerHook.viewPost(viewInvoke, new ARunnableS101S0200000_32(c18w7, viewInvoke, 42));
            }
            c18w7.LJIIJ = false;
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStart() {
        super.onStart();
        if (((Boolean) C289720BXe.LIZ.getValue()).booleanValue()) {
            this.LLJJIII.setValue(Boolean.TRUE);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        InterfaceC21167517sX interfaceC21167517sXH5 = H5();
        if (interfaceC21167517sXH5 != null) {
            C21288318Sr c21288318Sr = this.LLJLLL;
            List<C21295818Vo> list = c21288318Sr.LIZIZ;
            C18W2 c18w2 = c21288318Sr.LIZ;
            String str = c18w2 != null ? c18w2.LIZIZ : null;
            AIChatGenPrompt aIChatGenPrompt = c21288318Sr.LIZJ;
            interfaceC21167517sXH5.EE0(list, str, aIChatGenPrompt != null ? aIChatGenPrompt.getPromptId() : null);
        }
    }

    @Override // X.C18VO
    public C05YD<Boolean> cr0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    private final void H4(List<C21295818Vo> list) throws Throwable {
        int iIntValue;
        if (((Boolean) C268620Afs.LIZ.getValue()).booleanValue()) {
            for (C21295818Vo c21295818VoLIZ : list) {
                if (c21295818VoLIZ.LIZJ <= 0 || c21295818VoLIZ.LIZLLL <= 0) {
                    Pair pairLIZ = C2400609au.LIZ(c21295818VoLIZ.LIZIZ);
                    Integer num = (Integer) pairLIZ.first;
                    int iIntValue2 = 0;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    Integer num2 = (Integer) pairLIZ.second;
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    }
                    c21295818VoLIZ = C21295818Vo.LIZ(c21295818VoLIZ, null, iIntValue, iIntValue2, 243);
                }
                this.LLJLLL.LIZIZ.add(c21295818VoLIZ);
            }
        } else {
            this.LLJLLL.LIZIZ.addAll(list);
        }
        for (C21295818Vo c21295818Vo : list) {
            C21294518Vb c21294518VbV5 = v5();
            EnumC1778830wOH enumC1778830wOH = c21295818Vo.LJII;
            c21294518VbV5.getClass();
            if (C291270BbJ.LIZ()) {
                if (enumC1778830wOH == EnumC1778830wOH.ALBUM) {
                    C21294518Vb.LIZ("upload", c21294518VbV5.LIZ);
                } else {
                    C21294518Vb.LIZ("preload", c21294518VbV5.LIZ);
                }
            }
        }
        i3(new AwS611S0100000_32(this, 192));
    }

    private final void K4(String str) {
        i3(new AwS146S1100000_32(this, str, 8));
    }

    private final void P4(List<C21295818Vo> list) throws Throwable {
        this.LLJLLL.LIZIZ.clear();
        H4(list);
    }

    private final void d8(List<String> list) {
        List<C21295818Vo> list2 = this.LLJLLL.LIZIZ;
        final AwS611S0100000_32 awS611S0100000_32 = new AwS611S0100000_32(list, (List<AIPlaygroundChipsModel>) 193);
        if (list2 instanceof CopyOnWriteArrayList) {
            if (Build.VERSION.SDK_INT >= 26) {
                ((CopyOnWriteArrayList) list2).removeIf(new Predicate() { // from class: X.14SU
                    @Override // java.util.function.Predicate
                    public final boolean test(T t) {
                        return awS611S0100000_32.invoke(t).booleanValue();
                    }
                });
            } else {
                ArrayList arrayList = new ArrayList();
                CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list2;
                for (Object obj : copyOnWriteArrayList) {
                    if (((Boolean) awS611S0100000_32.invoke(obj)).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    copyOnWriteArrayList.removeAll(arrayList);
                }
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            list2.removeIf(new Predicate() { // from class: X.14SV
                @Override // java.util.function.Predicate
                public final boolean test(T t) {
                    return awS611S0100000_32.invoke(t).booleanValue();
                }
            });
        } else {
            Iterator<C21295818Vo> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((Boolean) awS611S0100000_32.invoke(it2.next())).booleanValue()) {
                    it2.remove();
                }
            }
        }
        i3(new AwS611S0100000_32(this, 194));
    }

    private final boolean n7(String str) {
        if (str != null && str.length() != 0 && a0.LJLIIIL(str).toString().length() != 0) {
            return false;
        }
        return true;
    }

    private final boolean u7(C869590Y9l c869590Y9l) {
        boolean z;
        AIChatAppearance aIChatAppearance;
        InputAreaAppearance inputAreaAppearance;
        AIChatPageConfig aIChatPageConfig = E5().LJI;
        if (aIChatPageConfig != null && (aIChatAppearance = aIChatPageConfig.appearance) != null && (inputAreaAppearance = aIChatAppearance.inputArea) != null && !inputAreaAppearance.showEnhanceEntrance) {
            return false;
        }
        String str = E5().LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = C21139517o1.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("last_click_time");
        sbLIZ.append(str);
        long j = keva.getLong(C2188811AlT.LIZIZ(sbLIZ), 0L);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_visit_time");
        sbLIZ2.append(str);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ2), jCurrentTimeMillis);
        if (c869590Y9l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long createdAt = c869590Y9l.getCreatedAt() + (((long) C342380DbY.LIZ().reinforceInputIntervalInHours) * 3600000);
            if (jCurrentTimeMillis >= createdAt && j <= createdAt) {
                return true;
            }
            return false;
        }
        if (jCurrentTimeMillis >= j + (((long) C342380DbY.LIZ().reinforceInputIntervalInHours) * 3600000)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J8(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C21294818Ve
            if (r0 == 0) goto L75
            r4 = r7
            X.18Ve r4 = (X.C21294818Ve) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L61
            if (r0 != r1) goto L7b
            X.C155000ia.LIZIZ(r3)
        L22:
            X.0gEF r3 = (X.InterfaceC1157570gEF) r3
            boolean r0 = r3 instanceof X.C1157450gE3
            if (r0 == 0) goto L5e
            long r4 = java.lang.System.currentTimeMillis()
            X.0gE3 r3 = (X.C1157450gE3) r3
            T r0 = r3.LIZ
            X.0Zmp r0 = (X.C909930Zmp) r0
            X.0Y9l r0 = r0.LIZ
            boolean r0 = r6.u7(r0)
            if (r0 == 0) goto L44
            kotlin.jvm.internal.AwS611S0100000_32 r1 = new kotlin.jvm.internal.AwS611S0100000_32
            r0 = 199(0xc7, float:2.79E-43)
            r1.<init>(r6, r0)
            r6.i3(r1)
        L44:
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showReinforceInput Time = "
            r1.append(r0)
            long r2 = r2 - r4
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "AiChatInputFeatureComponent"
            X.C21290818Tq.LIZ(r0, r1)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L61:
            X.C155000ia.LIZIZ(r3)
            X.18T4 r0 = X.C21163117rp.LIZIZ()
            X.1DDq r0 = r0.LJI()
            r4.LLILLL = r1
            java.lang.Object r3 = X.C09IC.LJIIZILJ(r0, r4)
            if (r3 != r2) goto L22
            return r2
        L75:
            X.18Ve r4 = new X.18Ve
            r4.<init>(r6, r7)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.J8(X.05Vn):java.lang.Object");
    }

    public final void L6(boolean z) {
        this.LLJJLIIIJLLLLLLLZ = z;
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Focus Change Operation!");
        S6(z, EnumC21295018Vg.FOCUS_CHANGED);
    }

    public final void N6(Integer num) {
        int iIntValue;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        this.LLJLL = iIntValue;
        C18VS c18vsX5 = x5();
        if (c18vsX5 != null) {
            c18vsX5.show();
        }
    }

    public final void T6(C21295818Vo c21295818Vo) {
        String str = c21295818Vo.LIZIZ;
        C5().YT(new C18XG(false, null, str, str));
    }

    @Override // X.C18VO
    public void TJ0(boolean z) {
        C18W7 c18w7 = this.LLJLIL;
        if (c18w7 != null && !c18w7.LJIIJJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pauseKeyboard: ");
            sbLIZ.append(z);
            C21290818Tq.LIZJ("KeyboardHelper", C2188811AlT.LIZIZ(sbLIZ));
            c18w7.LJIIL = c18w7.LJIILL;
            c18w7.LJIIJJI = true;
            if (z) {
                C18W7.LIZ(c18w7);
            }
        }
    }

    @Override // X.C18VO
    public void Vr2(boolean z) {
        if (n5()) {
            y8(this, z, 0L, EnumC21295018Vg.UI_ACTION_OPEN_DEFAULT);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C18VU(this, z, null), 3);
        }
    }

    public final void Z7(C21288318Sr c21288318Sr) {
        String promptId;
        InterfaceC21295718Vn interfaceC21295718VnT5;
        this.LLJJI.setValue(Boolean.TRUE);
        C18W2 c18w2 = c21288318Sr.LIZ;
        String str = null;
        if (c18w2 != null) {
            str = c18w2.LIZIZ;
        }
        F4(str, c21288318Sr.LIZIZ, EnumC21295518Vl.REPLACE);
        AIChatGenPrompt aIChatGenPrompt = c21288318Sr.LIZJ;
        if (aIChatGenPrompt != null && (promptId = aIChatGenPrompt.getPromptId()) != null && (interfaceC21295718VnT5 = t5()) != null) {
            interfaceC21295718VnT5.uH(promptId);
        }
        String string = C21295618Vm.LIZ().getString("key_image_ops_log", "");
        if (string.length() != 0) {
            try {
                Map<? extends String, ? extends Integer> map = (Map) C21295618Vm.LIZIZ.LJIIIIZZ(string, new TypeToken<Map<String, ? extends Integer>>() { // from class: X.00WS
                }.getType());
                if (map != null) {
                    C21294518Vb c21294518VbV5 = v5();
                    c21294518VbV5.getClass();
                    if (C291270BbJ.LIZ()) {
                        c21294518VbV5.LIZ.clear();
                        c21294518VbV5.LIZ.putAll(map);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C21290818Tq.LIZIZ("AiChatPendingAuthKeva", "Failed to parse pending image ops log", e);
            }
        }
        r8(new C18UI(c21288318Sr, v5().LIZIZ()), AFwS223S0000000_32.get$arr$(126));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(com.ss.android.ugc.tools.data.AIChatPayload r17) throws java.lang.Throwable {
        /*
            r16 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r17
            if (r1 == 0) goto L9f
            java.util.List<com.ss.android.ugc.tools.data.MediaPayload> r2 = r1.medias
            if (r2 == 0) goto L95
            java.util.Iterator r5 = r2.iterator()
        L11:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r3 = r5.next()
            com.ss.android.ugc.tools.data.MediaPayload r3 = (com.ss.android.ugc.tools.data.MediaPayload) r3
            boolean r2 = r3 instanceof com.ss.android.ugc.tools.data.MediaPayload.Image
            if (r2 == 0) goto L3a
            com.ss.android.ugc.tools.data.MediaPayload$Image r3 = (com.ss.android.ugc.tools.data.MediaPayload.Image) r3
            java.lang.String r7 = r3.id
            java.lang.String r8 = r3.path
            int r10 = r3.height
            int r9 = r3.width
            X.18Vo r6 = new X.18Vo
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 240(0xf0, float:3.36E-43)
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15)
            r0.add(r6)
            goto L11
        L3a:
            boolean r2 = r3 instanceof com.ss.android.ugc.tools.data.MediaPayload.ImageCollection
            if (r2 == 0) goto L6d
            com.ss.android.ugc.tools.data.MediaPayload$ImageCollection r3 = (com.ss.android.ugc.tools.data.MediaPayload.ImageCollection) r3
            java.util.List<com.ss.android.ugc.tools.data.ImageItem> r4 = r3.images
            int r2 = r3.coverIndex
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r2)
            com.ss.android.ugc.tools.data.ImageItem r2 = (com.ss.android.ugc.tools.data.ImageItem) r2
            java.lang.String r7 = r3.id
            java.lang.String r8 = r2.url
            int r10 = r2.height
            int r9 = r2.width
            java.util.List<com.ss.android.ugc.tools.data.ImageItem> r2 = r3.images
            int r3 = r2.size()
            r2 = 1
            if (r3 <= r2) goto L6b
            r13 = 1
        L5c:
            X.0wOH r14 = X.EnumC1778830wOH.IMAGE_COLLECTION
            X.18Vo r6 = new X.18Vo
            r11 = 0
            r15 = 48
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15)
            r0.add(r6)
            goto L11
        L6b:
            r13 = 0
            goto L5c
        L6d:
            boolean r2 = r3 instanceof com.ss.android.ugc.tools.data.MediaPayload.VideoCover
            if (r2 == 0) goto L8f
            com.ss.android.ugc.tools.data.MediaPayload$VideoCover r3 = (com.ss.android.ugc.tools.data.MediaPayload.VideoCover) r3
            java.lang.String r7 = r3.id
            java.lang.String r2 = r3.coverUrl
            java.lang.String r8 = java.lang.String.valueOf(r2)
            int r10 = r3.coverHeight
            int r9 = r3.coverWidth
            X.0wOH r14 = X.EnumC1778830wOH.VIDEO_COVER
            X.18Vo r6 = new X.18Vo
            r11 = 0
            r13 = 1
            r15 = 48
            r6.<init>(r7, r8, r9, r10, r11, r13, r14, r15)
            r0.add(r6)
            goto L11
        L8f:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        L95:
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt r1 = r1.prompt
            if (r1 == 0) goto L9f
            java.lang.String r1 = r1.getPromptText()
            if (r1 != 0) goto La1
        L9f:
            java.lang.String r1 = ""
        La1:
            r2 = r16
            r2.O4(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.d7(com.ss.android.ugc.tools.data.AIChatPayload):void");
    }

    @Override // X.C18VO
    public void fn0(TextWatcher textWatcher) {
        i3(new AwS398S0200000_32(this, textWatcher, 38));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa A[PHI: r7
      0x00aa: PHI (r7v1 int) = (r7v0 int), (r7v3 int) binds: [B:31:0x00a7, B:17:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C18VO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void gu2(java.util.List<java.lang.String> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.gu2(java.util.List):void");
    }

    public final void k7(boolean z) {
        String promptId;
        InterfaceC21295718Vn interfaceC21295718VnT5 = t5();
        if (interfaceC21295718VnT5 != null) {
            interfaceC21295718VnT5.LN2();
        }
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        if (C21163117rp.LIZIZ().LJFF()) {
            I7(z, strLIZ, this.LLJLLL, null);
            i3(AFwS278S0000000_32.get$arr$(120));
            k5();
            return;
        }
        if (this.LLJL) {
            I7(z, strLIZ, this.LLJLLL, null);
            i3(AFwS278S0000000_32.get$arr$(121));
            k5();
            return;
        }
        AIChatGenPrompt aIChatGenPrompt = this.LLJLLL.LIZJ;
        String str = null;
        if (aIChatGenPrompt != null) {
            promptId = aIChatGenPrompt.getPromptId();
        } else {
            promptId = null;
        }
        if (C123100dR.LIZ(promptId) && this.LLJLLL.LIZIZ.isEmpty()) {
            I7(z, strLIZ, this.LLJLLL, null);
            i3(AFwS278S0000000_32.get$arr$(122));
            k5();
            return;
        }
        C18W2 c18w2 = this.LLJLLL.LIZ;
        if (c18w2 != null) {
            str = c18w2.LIZIZ;
        }
        if (n7(str)) {
            I7(z, strLIZ, this.LLJLLL, null);
            i3(AFwS278S0000000_32.get$arr$(123));
            k5();
            return;
        }
        this.LLJLLL.LIZIZ();
        if (p8()) {
            r8(new C18UI(this.LLJLLL.LIZ(), strLIZ, v5().LIZIZ()), AFwS223S0000000_32.get$arr$(126));
        } else {
            if (!o7(this, this.LLJLLL, strLIZ, z)) {
                return;
            }
            I7(z, strLIZ, this.LLJLLL, null);
            this.LLJJ.onNext(new C18UI(this.LLJLLL.LIZ(), strLIZ, v5().LIZIZ()));
        }
    }

    public final void m6(List<C21295818Vo> list) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (C21295818Vo c21295818Vo : list) {
            String strLIZ = C1017903yT.LIZ();
            strLIZ.toString();
            arrayList.add(C21295818Vo.LIZ(c21295818Vo, strLIZ, 0, 0, 254));
        }
        H4(arrayList);
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Add Image Operation!");
        T4();
        S6(true, EnumC21295018Vg.UI_ACTION_ADDED_IMAGE);
    }

    @Override // X.C18VO
    public void qv2(Function0<Unit> function0) {
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Use clear!");
        C21288318Sr c21288318Sr = this.LLJLLL;
        c21288318Sr.LIZJ = null;
        c21288318Sr.LIZ = null;
        c21288318Sr.LIZIZ.clear();
        i3(new AwS611S0100000_32(this, 196));
        S6(false, EnumC21295018Vg.UI_ACTION_SENT);
        function0.invoke();
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Clear Input Data Operation!");
        T4();
    }

    public final void u6(C21295818Vo c21295818Vo) {
        d8(Collections.singletonList(c21295818Vo.LIZ));
        C21294518Vb c21294518VbV5 = v5();
        EnumC1778830wOH enumC1778830wOH = c21295818Vo.LJII;
        c21294518VbV5.getClass();
        if (C291270BbJ.LIZ()) {
            if (enumC1778830wOH == EnumC1778830wOH.ALBUM) {
                C21294518Vb.LIZ("delete_upload", c21294518VbV5.LIZ);
            } else {
                C21294518Vb.LIZ("delete_preload", c21294518VbV5.LIZ);
            }
        }
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Delete Image Operation!");
        T4();
    }

    public C18VZ(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = new C11RK<>();
        Boolean bool = Boolean.FALSE;
        this.LLJJI = C1BNE.LIZ(bool);
        this.LLJJIII = C1BNE.LIZ(bool);
        this.LLJJIJI = true;
        this.LLJJIJIL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
        this.LLJJJ = C1664770tQJ.LIZ(getDiContainer(), AiChatRoomFeatureApi.class, null);
        this.LLJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), C18VS.class, null);
        this.LLJJJJ = C1664770tQJ.LIZ(getDiContainer(), C18VP.class, null);
        this.LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC21167517sX.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC21295718Vn.class, null);
        this.LLJJL = new C11NJ();
        this.LLJL = C21163117rp.LIZIZ().LIZJ();
        this.LLJLL = -1;
        this.LLJLLIL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(125));
        this.LLJLLL = new C21288318Sr(null, new CopyOnWriteArrayList(), null);
        this.LLJZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 390));
    }

    private final void O4(String str, List<C21295818Vo> list) throws Throwable {
        String str2;
        if (str != null) {
            C18W2 c18w2 = this.LLJLLL.LIZ;
            if (c18w2 != null) {
                str2 = c18w2.LIZ;
            } else {
                str2 = null;
            }
            Z4(str2, str);
        }
        if (list != null) {
            P4(list);
        }
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Change Input Data Operation!");
        T4();
    }

    private final void Z4(String str, String str2) {
        if (str == null) {
            str = C1017903yT.LIZ();
        }
        if (str2.length() == 0) {
            this.LLJLLL.LIZ = null;
        } else {
            this.LLJLLL.LIZ = new C18W2(str, str2);
        }
        i3(new AwS146S1100000_32(this, str2, 9));
    }

    private final void r8(C18UI c18ui, Function0<Unit> function0) {
        InterfaceC21291818Ua interfaceC21291818UaLIZLLL;
        AIChatAppearance aIChatAppearance;
        this.LLJJIJI = false;
        boolean zBooleanValue = this.LLJJI.getValue().booleanValue();
        S6(false, EnumC21295018Vg.UI_ACTION_OUT_INPUT);
        if (((Boolean) C289720BXe.LIZ.getValue()).booleanValue()) {
            C01GW c01gw = C21295618Vm.LIZ;
            C21288318Sr c21288318Sr = c18ui.LIZIZ;
            Map<String, Integer> mapLIZIZ = v5().LIZIZ();
            String str = E5().LIZJ;
            C21295618Vm.LIZ().storeBoolean("key_is_pending", true);
            Keva kevaLIZ = C21295618Vm.LIZ();
            Gson gson = C21295618Vm.LIZIZ;
            kevaLIZ.storeString("key_input_data", GsonProtectorUtils.toJson(gson, c21288318Sr));
            C21295618Vm.LIZ().storeString("key_image_ops_log", GsonProtectorUtils.toJson(gson, mapLIZIZ));
            C21295618Vm.LIZ().storeString("key_session_id", str);
        }
        AIChatTrackingConfig aIChatTrackingConfig = null;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC21291818UaLIZLLL = iAiChatFeatureService.LIZLLL()) != null) {
            AIChatGenModel aIChatGenModel = E5().LJ;
            AIChatPageConfig aIChatPageConfig = E5().LJI;
            GuideAppearance guideAppearance = null;
            if (aIChatPageConfig != null) {
                aIChatTrackingConfig = aIChatPageConfig.tracking;
            }
            AIChatPageConfig aIChatPageConfig2 = E5().LJI;
            if (aIChatPageConfig2 != null && (aIChatAppearance = aIChatPageConfig2.appearance) != null) {
                guideAppearance = aIChatAppearance.guideAppearance;
            }
            interfaceC21291818UaLIZLLL.LIZLLL(aIChatGenModel, aIChatTrackingConfig, guideAppearance, this.LLJILJILJ, new C21294618Vc(this, c18ui, zBooleanValue), new AwS62S0310000_32(this, (C18VZ) c18ui, (C18UI) zBooleanValue, (boolean) function0, (Function0<Unit>) 0));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.P6(com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode, X.05Vn):java.lang.Object");
    }

    public final void S6(boolean z, EnumC21295018Vg enumC21295018Vg) {
        y8(this, z, 0L, enumC21295018Vg);
        T4();
        this.LLJJI.setValue(Boolean.valueOf(z));
    }

    public final Object W7(C21171417tA c21171417tA, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        C1DFH c1dfh = C0PEM.LIZ;
        Object objLJI = C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C18VY(this, c21171417tA, null));
        if (objLJI == C099R.LJFF()) {
            return objLJI;
        }
        return Unit.LIZ;
    }

    public final void y7(String str, C18UI c18ui) {
        String promptType;
        c18ui.LIZIZ.LIZIZ();
        C18UP c18up = C18UP.LIZ;
        C18UJ c18ujE5 = E5();
        AIChatGenPrompt aIChatGenPrompt = c18ui.LIZIZ.LIZJ;
        if (aIChatGenPrompt != null) {
            promptType = aIChatGenPrompt.getPromptType();
        } else {
            promptType = null;
        }
        String strValueOf = String.valueOf(promptType);
        int size = c18ui.LIZIZ.LIZIZ.size();
        C21288318Sr c21288318Sr = this.LLJLLL;
        C18UJ c18ujE52 = E5();
        c18up.getClass();
        String strLIZJ = C18UP.LIZJ(c21288318Sr, c18ujE52);
        String strLIZLLL = C18UP.LIZLLL(this.LLJLLL.LIZIZ);
        String str2 = c18ui.LIZ;
        c18up.getClass();
        C18UP.LJIIJJI(c18ujE5, strValueOf, size, str, false, strLIZJ, strLIZLLL, str2);
    }

    public static final void J6(C18VZ c18vz, String str, String str2) {
        String str3;
        String promptId;
        C18W2 c18w2 = c18vz.LLJLLL.LIZ;
        String str4 = null;
        if (c18w2 != null) {
            str3 = c18w2.LIZIZ;
        } else {
            str3 = null;
        }
        if (Intrinsics.LJFF(str2, str3)) {
            return;
        }
        c18vz.Z4(str, str2);
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Edit Content Operation!");
        c18vz.T4();
        AIChatGenPrompt aIChatGenPrompt = c18vz.LLJLLL.LIZJ;
        if (aIChatGenPrompt != null) {
            promptId = aIChatGenPrompt.getPromptId();
        } else {
            promptId = null;
        }
        if (C123100dR.LIZ(promptId)) {
            C18W2 c18w22 = c18vz.LLJLLL.LIZ;
            if (c18w22 != null) {
                str4 = c18w22.LIZIZ;
            }
            if (c18vz.n7(str4)) {
                C21290818Tq.LIZ("AiChatInputFeatureComponent", "Unselect Operation!");
                InterfaceC21295718Vn interfaceC21295718VnT5 = c18vz.t5();
                if (interfaceC21295718VnT5 != null) {
                    interfaceC21295718VnT5.NP1();
                }
            }
        }
    }

    public final void F4(String str, List<C21295818Vo> list, EnumC21295518Vl enumC21295518Vl) {
        String str2;
        if (str != null) {
            int i = C21295418Vk.LIZ[enumC21295518Vl.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    K4(str);
                } else {
                    throw new C1954807lC();
                }
            } else {
                C18W2 c18w2 = this.LLJLLL.LIZ;
                if (c18w2 != null) {
                    str2 = c18w2.LIZ;
                } else {
                    str2 = null;
                }
                Z4(str2, str);
            }
        }
        if (list != null) {
            H4(list);
        }
        C21290818Tq.LIZ("AiChatInputFeatureComponent", "Add Input Data Operation!");
        T4();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void I7(boolean r12, java.lang.String r13, X.C21288318Sr r14, java.lang.String r15) {
        /*
            r11 = this;
            r6 = r15
            X.18T4 r2 = X.C21163117rp.LIZIZ()
            r1 = 0
            if (r6 != 0) goto Lc
            if (r12 == 0) goto L4c
            java.lang.String r6 = "success"
        Lc:
            r14.LIZIZ()
            com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi r0 = r11.D5()
            r10 = r13
            r0.eT1(r10)
            X.18UP r2 = X.C18UP.LIZ
            X.18UJ r3 = r11.E5()
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt r0 = r14.LIZJ
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getPromptType()
        L25:
            java.lang.String r4 = java.lang.String.valueOf(r1)
            java.util.List<X.18Vo> r0 = r14.LIZIZ
            int r5 = r0.size()
            X.18Sr r1 = r11.LLJLLL
            X.18UJ r0 = r11.E5()
            r2.getClass()
            java.lang.String r8 = X.C18UP.LIZJ(r1, r0)
            X.18Sr r0 = r11.LLJLLL
            java.util.List<X.18Vo> r0 = r0.LIZIZ
            java.lang.String r9 = X.C18UP.LIZLLL(r0)
            r7 = 0
            r2.getClass()
            X.C18UP.LJIIJJI(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L4c:
            boolean r0 = r2.LJIIIZ()
            if (r0 != 0) goto L8d
            boolean r0 = r2.LIZJ()
            if (r0 == 0) goto L5b
            java.lang.String r6 = "generating"
            goto Lc
        L5b:
            X.18Sr r0 = r11.LLJLLL
            X.18W2 r0 = r0.LIZ
            if (r0 == 0) goto L6c
            java.lang.String r0 = r0.LIZIZ
        L63:
            boolean r0 = r11.n7(r0)
            if (r0 == 0) goto L6e
            java.lang.String r6 = "empty_text"
            goto Lc
        L6c:
            r0 = r1
            goto L63
        L6e:
            X.18Sr r0 = r11.LLJLLL
            com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt r0 = r0.LIZJ
            if (r0 == 0) goto L8b
            java.lang.String r0 = r0.getPromptId()
        L78:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L8d
            X.18Sr r0 = r11.LLJLLL
            java.util.List<X.18Vo> r0 = r0.LIZIZ
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L8d
            java.lang.String r6 = "default_empty_upload_photo"
            goto Lc
        L8b:
            r0 = r1
            goto L78
        L8d:
            java.lang.String r6 = "sending"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18VZ.I7(boolean, java.lang.String, X.18Sr, java.lang.String):void");
    }

    public static final boolean o7(C18VZ c18vz, C21288318Sr c21288318Sr, String str, boolean z) {
        CreativeToolsPluginService creativeToolsPluginService;
        C18W6 c18w6 = new Object() { // from class: X.18W6
        };
        Context context = (Context) c18vz.getDiContainer().LJII(C19EG.class, null);
        List<C21295818Vo> list = c21288318Sr.LIZIZ;
        c18w6.getClass();
        if (list.isEmpty() || ((creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null)) != null && creativeToolsPluginService.LIZJ(context, "visual_poet_image_send", false))) {
            return true;
        }
        Activity activityLIZ = C0FNT.LIZ(context);
        if (activityLIZ != null) {
            ARunnableS102S0100000_2 aRunnableS102S0100000_2 = new ARunnableS102S0100000_2(activityLIZ, 101);
            if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
                aRunnableS102S0100000_2.run();
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), aRunnableS102S0100000_2);
            }
        }
        c18vz.I7(z, str, c21288318Sr, "ve_plugin_not_ready");
        return false;
    }

    public static final void y8(C18VZ c18vz, boolean z, long j, EnumC21295018Vg enumC21295018Vg) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showOrHideKeyBoard: ");
        sbLIZ.append(z);
        sbLIZ.append(", delay:");
        sbLIZ.append(j);
        sbLIZ.append(", changeReason: ");
        sbLIZ.append(enumC21295018Vg);
        C21290818Tq.LIZJ("AiChatInputFeatureComponent", C2188811AlT.LIZIZ(sbLIZ));
        C0CNO.LIZLLL(j, new AwS148S0110000_32(c18vz, z, 4));
    }
}
