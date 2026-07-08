package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.ICommerceAgentRequestService;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.internal.net.MessageRemote;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.NonAdWebModel;
import com.ss.android.ugc.aweme.commercialize.model.AiAgentConfig;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.router.api.ICRouterManager;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterWebModel;
import com.ss.android.ugc.aweme.commercialize.router.impl.CRouterManager;
import com.ss.android.ugc.aweme.commercialize.routeradapter.api.openapi.invoke.ICRouterModelTransform;
import com.ss.android.ugc.aweme.component.searchcomponent.agent.SearchAgentHintsCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BotConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.model.SearchAdAIAgentModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS120S1100000_6;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS382S0200000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0cRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1012050cRX extends AbstractC1014240cV4 {
    public final InterfaceC1003440cDe LLJLIL;
    public final SearchAdAIAgentModel LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public View LLJLLIL;
    public C427870Gq9 LLJLLL;
    public FrameLayout LLJZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLJZIJLIL;
    public int LLL;
    public Aweme LLLF;
    public final C054G LLLFF;

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        C2296808zG.LIZJ(this.LLLFF, null);
    }

    public final void LJJI(List<String> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        AwS382S0200000_16 awS382S0200000_16 = new AwS382S0200000_16(this, (C1012050cRX) list, (List<String>) 105);
        AwS630S0100000_16 awS630S0100000_16 = new AwS630S0100000_16(this, 101);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJZIJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (String str : list) {
                arrayList.add(new C433690GzX(str, new AwS165S1100000_16(str, awS382S0200000_16, 28), new AwS120S1100000_6(awS630S0100000_16, str, 8)));
            }
            state.LJIILL(arrayList, null);
        }
    }

    public final void LJJII(String str) {
        View view = this.LLJJIJIL;
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(this, 244));
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "othershow", this.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ("ai_agent_question_hints", "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LLL), "hints_type");
        c1022820ciuLIZLLL.LIZIZ(a0.LJJJLZIJ(e3.e, e3.f, str), "questions");
        c1022820ciuLIZLLL.LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [X.0cME] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        String str;
        String str2;
        Aweme aweme;
        View viewLIZIZ;
        C427870Gq9 c427870Gq9;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        View viewFindViewById;
        FrameLayout frameLayout;
        Integer num;
        String str3;
        String str4;
        Integer num2;
        BotConfig botConfig;
        super.Fk(viewGroup, interfaceC1014340cVE);
        SearchAdAIAgentModel searchAdAIAgentModel = this.LLJLILLLLZIIL;
        String str5 = null;
        if (searchAdAIAgentModel != null) {
            str = searchAdAIAgentModel.queryParams;
        } else {
            str = null;
        }
        C1227904rF.LIZ.getClass();
        Gson gsonLIZLLL = C1227904rF.LIZLLL();
        SearchAdAIAgentModel searchAdAIAgentModel2 = this.LLJLILLLLZIIL;
        if (searchAdAIAgentModel2 != null && (botConfig = searchAdAIAgentModel2.botConfig) != null) {
            str2 = botConfig.extra;
        } else {
            str2 = null;
        }
        String json = GsonProtectorUtils.toJson(gsonLIZLLL, new MessageRemote.ExtraInfo(str2));
        ICommerceAgentRequestService iCommerceAgentRequestService = (ICommerceAgentRequestService) PluggableExtentionKt.pluggableSpi$default(ICommerceAgentRequestService.class, false, false, false, 14, null);
        if (iCommerceAgentRequestService != 0) {
            iCommerceAgentRequestService.LIZ(new InterfaceC321390Cin() { // from class: X.0cME
                @Override // X.InterfaceC321390Cin
                public final void LIZIZ() {
                    BotConfig botConfig2;
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", "requestData: onStreamComplete");
                    List<String> list = null;
                    this.LIZ.LLILLL.LJIJ(new C991200btu(3, null), this.LIZ);
                    C1012050cRX c1012050cRX = this.LIZ;
                    SearchAdAIAgentModel searchAdAIAgentModel3 = c1012050cRX.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel3 != null && (botConfig2 = searchAdAIAgentModel3.botConfig) != null) {
                        list = botConfig2.longQuestions;
                    }
                    c1012050cRX.LJJII(String.valueOf(list));
                }

                @Override // X.InterfaceC321390Cin
                public final void LIZJ() {
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", "requestData: onAnswerComplete");
                }

                @Override // X.InterfaceC321390Cin
                public final void LJ() {
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", "requestData: onAskSended");
                }

                @Override // X.InterfaceC321390Cin
                public final void LJII() {
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", "requestData: onStreamFirstChunk");
                }

                @Override // X.InterfaceC321390Cin
                public final void LIZ(List<String> list) {
                    List<String> list2;
                    BotConfig botConfig2;
                    BotConfig botConfig3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestData: onSugReceived: ");
                    sbLIZ.append(list);
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", C2188811AlT.LIZIZ(sbLIZ));
                    if (!list.isEmpty()) {
                        SearchAdAIAgentModel searchAdAIAgentModel3 = this.LIZ.LLJLILLLLZIIL;
                        if (searchAdAIAgentModel3 != null && (botConfig3 = searchAdAIAgentModel3.botConfig) != null) {
                            botConfig3.setLongQuestions(list);
                        }
                        C1012050cRX c1012050cRX = this.LIZ;
                        c1012050cRX.LLL = 1;
                        c1012050cRX.LJJI(list);
                        return;
                    }
                    C1012050cRX c1012050cRX2 = this.LIZ;
                    SearchAdAIAgentModel searchAdAIAgentModel4 = c1012050cRX2.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel4 == null || (botConfig2 = searchAdAIAgentModel4.botConfig) == null || (list2 = botConfig2.longQuestions) == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    c1012050cRX2.LJJI(list2);
                }

                @Override // X.InterfaceC321390Cin
                public final void LIZLLL(String str6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestData: onAnswerChunk: ");
                    sbLIZ.append(str6);
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", C2188811AlT.LIZIZ(sbLIZ));
                    if (C1533950q1J.LJ(str6)) {
                        this.LIZ.LLILLL.LJIJ(new C991200btu(1, str6), this.LIZ);
                    }
                }

                @Override // X.InterfaceC321390Cin
                public final void LJFF(String str6) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestData: onSellingPointReceived: ");
                    sbLIZ.append(str6);
                    C1022620cia.LIZ("SearchAIAgentHintsComponent", C2188811AlT.LIZIZ(sbLIZ));
                    if (C1533950q1J.LJ(str6)) {
                        this.LIZ.LLILLL.LJIJ(new C989550brF(new C1008130cLD(str6)), this.LIZ);
                    }
                }

                @Override // X.InterfaceC321390Cin
                public final void LJI(String str6) {
                    List<String> list;
                    BotConfig botConfig2;
                    BotConfig botConfig3;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("requestData: onStreamFailed: code=");
                    sbLIZ.append(-1);
                    sbLIZ.append(", msg=");
                    sbLIZ.append(str6);
                    C1022620cia.LIZIZ("SearchAIAgentHintsComponent", C2188811AlT.LIZIZ(sbLIZ));
                    List<String> list2 = null;
                    this.LIZ.LLILLL.LJIJ(new C991200btu(2, null), this.LIZ);
                    C1012050cRX c1012050cRX = this.LIZ;
                    SearchAdAIAgentModel searchAdAIAgentModel3 = c1012050cRX.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel3 == null || (botConfig3 = searchAdAIAgentModel3.botConfig) == null || (list = botConfig3.longQuestions) == null) {
                        list = C13BV.INSTANCE;
                    }
                    c1012050cRX.LJJI(list);
                    C1012050cRX c1012050cRX2 = this.LIZ;
                    SearchAdAIAgentModel searchAdAIAgentModel4 = c1012050cRX2.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel4 != null && (botConfig2 = searchAdAIAgentModel4.botConfig) != null) {
                        list2 = botConfig2.longQuestions;
                    }
                    c1012050cRX2.LJJII(String.valueOf(list2));
                }
            }, str, json, 1);
        }
        Object obj = this.LLILLJJLI.LIZJ;
        if (obj instanceof Aweme) {
            aweme = (Aweme) obj;
        } else {
            aweme = null;
        }
        this.LLLF = aweme;
        SearchAdAIAgentModel searchAdAIAgentModel3 = this.LLJLILLLLZIIL;
        if (searchAdAIAgentModel3 != null && (num2 = searchAdAIAgentModel3.layoutType) != null && num2.intValue() == 1) {
            viewLIZIZ = C21146717pB.LIZIZ(this.LLILZ, R.layout.qg, this.LLJJIII, false);
        } else {
            viewLIZIZ = C21146717pB.LIZIZ(this.LLILZ, R.layout.qh, this.LLJJIII, false);
        }
        this.LLJJIJIL = viewLIZIZ;
        this.LLJLL = (TuxTextView) viewLIZIZ.findViewById(R.id.title);
        View view = this.LLJJIJIL;
        if (view != null) {
            c427870Gq9 = (C427870Gq9) view.findViewById(R.id.bh2);
        } else {
            c427870Gq9 = null;
        }
        this.LLJLLL = c427870Gq9;
        View view2 = this.LLJJIJIL;
        if (view2 != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) view2.findViewById(R.id.jp5);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        this.LLJZIJLIL = viewOnAttachStateChangeListenerC20604515jv;
        View view3 = this.LLJJIJIL;
        if (view3 != null) {
            viewFindViewById = view3.findViewById(R.id.vv6);
        } else {
            viewFindViewById = null;
        }
        this.LLJLLIL = viewFindViewById;
        View view4 = this.LLJJIJIL;
        if (view4 != null) {
            frameLayout = (FrameLayout) view4.findViewById(R.id.jp6);
        } else {
            frameLayout = null;
        }
        this.LLJZ = frameLayout;
        SearchAdAIAgentModel searchAdAIAgentModel4 = this.LLJLILLLLZIIL;
        if (searchAdAIAgentModel4 != null && (num = searchAdAIAgentModel4.layoutType) != null) {
            if (num.intValue() == 1) {
                TuxTextView tuxTextView = this.LLJLL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                }
                TuxTextView tuxTextView2 = this.LLJLL;
                if (tuxTextView2 != null) {
                    SearchAdAIAgentModel searchAdAIAgentModel5 = this.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel5 != null) {
                        str5 = searchAdAIAgentModel5.title;
                    }
                    tuxTextView2.setText(str5);
                }
                TuxTextView tuxTextView3 = this.LLJLL;
                if (tuxTextView3 != null) {
                    C786410Ut5.h9(tuxTextView3, new ACListenerS151S0100000_16(this, 156));
                }
                TuxTextView tuxTextView4 = this.LLJLL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setOnLongClickListener(new ViewOnLongClickListenerC1077280e8k(this, 4));
                }
                C427870Gq9 c427870Gq92 = this.LLJLLL;
                if (c427870Gq92 != null) {
                    C786410Ut5.LLLLJI(c427870Gq92, 8);
                }
            } else if (num.intValue() == 2) {
                TuxTextView tuxTextView5 = this.LLJLL;
                if (tuxTextView5 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView5, 0);
                }
                TuxTextView tuxTextView6 = this.LLJLL;
                if (tuxTextView6 != null) {
                    SearchAdAIAgentModel searchAdAIAgentModel6 = this.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel6 != null) {
                        str4 = searchAdAIAgentModel6.title;
                    } else {
                        str4 = null;
                    }
                    tuxTextView6.setText(str4);
                }
                TuxTextView tuxTextView7 = this.LLJLL;
                if (tuxTextView7 != null) {
                    C786410Ut5.h9(tuxTextView7, new ACListenerS151S0100000_16(this, 157));
                }
                TuxTextView tuxTextView8 = this.LLJLL;
                if (tuxTextView8 != null) {
                    tuxTextView8.setOnLongClickListener(new ViewOnLongClickListenerC1077280e8k(this, 5));
                }
                View view5 = this.LLJLLIL;
                if (view5 != null) {
                    C786410Ut5.LJLLLLLL(0, view5);
                }
                View view6 = this.LLJLLIL;
                if (view6 != null) {
                    view6.setOnLongClickListener(new ViewOnLongClickListenerC1077280e8k(this, 6));
                }
                SearchAdAIAgentModel searchAdAIAgentModel7 = this.LLJLILLLLZIIL;
                if (searchAdAIAgentModel7 != null) {
                    str3 = searchAdAIAgentModel7.icon;
                } else {
                    str3 = null;
                }
                if (C1533950q1J.LJ(str3)) {
                    SearchAdAIAgentModel searchAdAIAgentModel8 = this.LLJLILLLLZIIL;
                    if (searchAdAIAgentModel8 != null) {
                        str5 = searchAdAIAgentModel8.icon;
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(String.valueOf(str5));
                    c1331670kl3LJIIIZ.LJJ(this.LLJLLL);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    C427870Gq9 c427870Gq93 = this.LLJLLL;
                    if (c427870Gq93 != null) {
                        C786410Ut5.LLLLJI(c427870Gq93, 0);
                    }
                    C427870Gq9 c427870Gq94 = this.LLJLLL;
                    if (c427870Gq94 != null) {
                        C786410Ut5.P8(c427870Gq94, new ACListenerS151S0100000_16(this, 158));
                    }
                    C427870Gq9 c427870Gq95 = this.LLJLLL;
                    if (c427870Gq95 != null) {
                        c427870Gq95.setOnLongClickListener(new ViewOnLongClickListenerC1077280e8k(this, 7));
                    }
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJZIJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(SearchAgentHintsCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJZIJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
            viewOnAttachStateChangeListenerC20604515jv3.setLayoutManager(new LinearLayoutManager(this.LLILZ, 0, false));
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJZIJLIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            viewOnAttachStateChangeListenerC20604515jv4.addItemDecoration(new C0DXR(iLIZIZ) { // from class: X.0cVm
                public final int LL;

                {
                    this.LL = iLIZIZ;
                }

                @Override // X.C0DXR
                public final void LIZIZ(Rect rect, View view7, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                    if (recyclerView.getChildAdapterPosition(view7) < c21673919s1.LIZIZ() - 1) {
                        if (!C444960Hcc.LIZIZ()) {
                            rect.right = this.LL;
                            return;
                        } else {
                            rect.left = this.LL;
                            return;
                        }
                    }
                    rect.right = 0;
                    rect.left = 0;
                }
            });
        }
    }

    public final void LJJ(String str, String str2) {
        boolean z;
        String aid;
        final AFwS252S0000000_16 aFwS252S0000000_16 = AFwS252S0000000_16.get$arr$(618);
        BotConfig botConfig = null;
        NonAdWebModel nonAdWebModel = null;
        C1025520cnG c1025520cnG = new C1025520cnG(null, "ai_agent_search_hints", null, str, "draw_ad", 95, null, null, 965);
        CRouterCoreModel cRouterCoreModel = new CRouterCoreModel(null, 0, null, new CRouterWebModel(this.LLILLJJLI.LIZLLL.getWebUrl(), this.LLILLJJLI.LIZLLL.getWebTitle(), false, false, 0, null), null, null, null);
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        SearchAdAIAgentModel searchAdAIAgentModel = this.LLJLILLLLZIIL;
        GMTBaseModel gMTBaseModelLIZ = null;
        AwemeRawAd awemeRawAd = null;
        if (searchAdAIAgentModel != null) {
            botConfig = searchAdAIAgentModel.botConfig;
        }
        AiAgentConfig aiAgentConfig = new AiAgentConfig(z, str2, botConfig);
        C1025660cnU c1025660cnU = new C1025660cnU();
        c1025660cnU.LIZJ = new InterfaceC1025850cnn() { // from class: X.0cRY
            @Override // X.InterfaceC1025850cnn
            public final void LIZ() {
                aFwS252S0000000_16.invoke(Boolean.FALSE);
            }

            @Override // X.InterfaceC1025850cnn
            public final void LIZIZ() {
                aFwS252S0000000_16.invoke(Boolean.TRUE);
            }
        };
        C1025660cnU c1025660cnU2 = new C1025660cnU();
        c1025660cnU2.LIZJ = new InterfaceC1025850cnn() { // from class: X.0cRZ
            @Override // X.InterfaceC1025850cnn
            public final void LIZ() {
                aFwS252S0000000_16.invoke(Boolean.FALSE);
            }

            @Override // X.InterfaceC1025850cnn
            public final void LIZIZ() {
                aFwS252S0000000_16.invoke(Boolean.TRUE);
            }
        };
        AwemeRawAd awemeRawAdLJJIJLIJ = null;
        C1021060cg4 c1021060cg4 = new C1021060cg4(cRouterCoreModel, new C1025430cn7(c1025660cnU2, c1025660cnU, nonAdWebModel, aiAgentConfig, 92), 4);
        ICRouterManager iCRouterManager = (ICRouterManager) PluggableExtentionKt.pluggableSpi$default(ICRouterManager.class, false, false, false, 14, null);
        if (iCRouterManager != null) {
            Context context = this.LLILZ;
            Aweme aweme = this.LLLF;
            if (aweme == null || (aid = aweme.getAid()) == null) {
                aid = "";
            }
            Aweme aweme2 = this.LLLF;
            if (aweme2 != null) {
                awemeRawAdLJJIJLIJ = C1017070cZd.LJJIJLIJ(aweme2);
            }
            ICRouterModelTransform iCRouterModelTransform = (ICRouterModelTransform) PluggableExtentionKt.pluggableSpi$default(ICRouterModelTransform.class, false, false, false, 14, null);
            if (iCRouterModelTransform != null) {
                Aweme aweme3 = this.LLLF;
                if (aweme3 != null) {
                    awemeRawAd = aweme3.getAwemeRawAd();
                }
                gMTBaseModelLIZ = iCRouterModelTransform.LIZ(awemeRawAd);
            }
            CRouterManager cRouterManagerLIZLLL = iCRouterManager.LIZLLL(new C1025880cnq(context, aid, aweme2, awemeRawAdLJJIJLIJ, gMTBaseModelLIZ), c1025520cnG, c1021060cg4, true);
            if (cRouterManagerLIZLLL != null) {
                cRouterManagerLIZLLL.LJI();
            }
        }
    }

    public final void LJJIFFI(Integer num, String str, String str2) {
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("result_ad", "click", this.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ(str, "refer");
        c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(this.LLL), "hints_type");
        c1022820ciuLIZLLL.LIZIZ(num, "index");
        c1022820ciuLIZLLL.LIZIZ(str2, "question_content");
        c1022820ciuLIZLLL.LJII();
    }

    public C1012050cRX(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, InterfaceC1003440cDe interfaceC1003440cDe) {
        Object c098200Yq;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = interfaceC1003440cDe;
        this.LLL = 2;
        this.LLLFF = C2296808zG.LIZIZ();
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, ? extends Object> map = anoleComponentModel.data;
            c1227904rF.getClass();
            c098200Yq = (SearchAdAIAgentModel) C1227904rF.LIZIZ(C1227904rF.LJI(map), SearchAdAIAgentModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(anoleComponentModel.type);
            sbLIZ.append(": parse success");
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(anoleComponentModel.type);
            sbLIZ2.append(": parse failed, reason = ");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLJLILLLLZIIL = (SearchAdAIAgentModel) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
    }
}
