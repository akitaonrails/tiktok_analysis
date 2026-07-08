package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.Spannable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.api.coin.incentive.ICoinIncentiveService;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.FeedBubbleEntryData;
import com.bytedance.android.livesdk.api.revenue.strategy.touchpoint.model.FeedBubbleMetaData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.activity.TopTabAbility;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.data.TouchPointColor;

/* JADX INFO: renamed from: X.0sG1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619950sG1 implements InterfaceC1590960rVG {
    public static boolean LIZIZ;
    public static long LIZLLL;
    public static final C1619950sG1 LIZ = new C1619950sG1();
    public static final Map<String, String> LIZJ = C2097608Jq.LJIIIIZZ(new Pair(EnumC1584360rKc.FOLLOWING.getKey(), "live_incentive_task_following_guide"), new Pair(EnumC1584360rKc.INBOX.getKey(), "live_incentive_task_inbox_guide"));

    @Override // X.InterfaceC1590960rVG
    public final void LIZIZ() {
        LIZIZ = true;
    }

    static {
        C1906380zi0 c1906380zi0 = C1906380zi0.LIZ;
        InterfaceC1906520ziE interfaceC1906520ziE = new InterfaceC1906520ziE() { // from class: X.0zi3
            @Override // X.InterfaceC1906520ziE
            public final void LIZJ(Lifecycle.Event event) {
            }

            @Override // X.InterfaceC1906520ziE
            public final void LJ(C1906370zhz c1906370zhz, String str) {
            }

            @Override // X.InterfaceC1906520ziE
            public final void LIZ(C1906370zhz c1906370zhz, String str) {
                C1619950sG1.LIZ.getClass();
                if (!C1619950sG1.LIZJ.values().contains(str)) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_instruction_bubble_show");
                c474500IjALIZ.LJJII(c1906370zhz.LIZ, "tooltips_key");
                c474500IjALIZ.LJJII(0, "click_state");
                c474500IjALIZ.LJJII(c1906370zhz.LJJ, "author_id");
                c474500IjALIZ.LJJII(c1906370zhz.LJIL, "group_id");
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                EnumC1584360rKc enumC1584360rKc = c1906370zhz.LIZIZ;
                c1584320rKY.getClass();
                c474500IjALIZ.LJJII(C1584320rKY.LJIIIZ(enumC1584360rKc), "tooltips_position_name");
                c474500IjALIZ.LJJII(Long.valueOf(c1906370zhz.LIZLLL), "estimated_show_duration");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1906520ziE
            public final void LIZIZ(C1906370zhz c1906370zhz, String str) {
                C1619950sG1.LIZ.getClass();
                if (!C1619950sG1.LIZJ.values().contains(str)) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_instruction_bubble_tab_click");
                c474500IjALIZ.LJJII(c1906370zhz.LIZ, "tooltips_key");
                c474500IjALIZ.LJJII(c1906370zhz.LJJ, "author_id");
                c474500IjALIZ.LJJII(c1906370zhz.LJIL, "group_id");
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                EnumC1584360rKc enumC1584360rKc = c1906370zhz.LIZIZ;
                c1584320rKY.getClass();
                c474500IjALIZ.LJJII(C1584320rKY.LJIIIZ(enumC1584360rKc), "tooltips_position_name");
                c474500IjALIZ.LJJII(0, "click_state");
                c474500IjALIZ.LJJII(c1906370zhz.LJIIJJI, "click_type");
                c474500IjALIZ.LJJII(Long.valueOf(c1906370zhz.LJIJJLI), "click_duration");
                c474500IjALIZ.LJJII(c1906370zhz.LIZ(), "is_tooltips_disappear");
                c474500IjALIZ.LIZ();
            }

            @Override // X.InterfaceC1906520ziE
            public final void LIZLLL(String str, C1906370zhz c1906370zhz, JSONObject jSONObject) {
                C1619950sG1.LIZ.getClass();
                if (!C1619950sG1.LIZJ.values().contains(str)) {
                    return;
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_instruction_bubble_tab_leave");
                if (jSONObject != null) {
                    c474500IjALIZ.LJJIIJZLJL(jSONObject);
                }
                C1584320rKY c1584320rKY = C1584320rKY.LIZ;
                EnumC1584360rKc enumC1584360rKc = c1906370zhz.LIZIZ;
                c1584320rKY.getClass();
                c474500IjALIZ.LJJII(C1584320rKY.LJIIIZ(enumC1584360rKc), "tooltips_position_name");
                c474500IjALIZ.LJJII(c1906370zhz.LIZ, "tooltips_key");
                c474500IjALIZ.LIZ();
            }
        };
        c1906380zi0.getClass();
        ((ArrayList) C1906380zi0.LIZLLL).add(interfaceC1906520ziE);
    }

    public static void LIZLLL(String str) {
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        Activity activityLIZ = C2421209eE.LIZ();
        if (activityLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            C1619940sG0 c1619940sG0 = C1619940sG0.LL;
            homeTabAbilityLIZ.FX1();
            homeTabAbilityLIZ.Ss2(c1619940sG0);
        }
        ICoinIncentiveService iCoinIncentiveServiceLIZ = C1124730fNH.LIZ();
        if (iCoinIncentiveServiceLIZ != null) {
            iCoinIncentiveServiceLIZ.Eq2();
        }
    }

    @Override // X.InterfaceC1590960rVG
    public final void LIZ(View view) {
        LJFF(view, EnumC1121470fI1.FOLLOW_EDUCATION_BUBBLE);
    }

    @Override // X.InterfaceC1590960rVG
    public final boolean LIZJ(View view) {
        return LJFF(view, EnumC1121470fI1.INBOX_EDUCATION_BUBBLE);
    }

    public static boolean LJ(C19EG c19eg, String str) {
        Boolean boolValueOf;
        MainActivityScope mainActivityScopeLIZJ;
        HomeTabAbility homeTabAbilityLIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (homeTabAbilityLIZ = C0DMM.LIZ(mainActivityScopeLIZJ)) != null) {
            boolValueOf = Boolean.valueOf(homeTabAbilityLIZ.ft0(str));
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public static boolean LJFF(View view, EnumC1121470fI1 enumC1121470fI1) {
        Pair pair;
        String str;
        Integer numValueOf;
        String str2;
        String str3;
        C19EG c19egLIZIZ;
        MainActivityScope mainActivityScopeLIZJ;
        TopTabAbility topTabAbilityLIZ;
        Pair pairIL2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try show feed bubble ");
        sbLIZ.append(enumC1121470fI1);
        C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ));
        C1126800fQc.LIZ.GN();
        final C1123320fL0 c1123320fL0LIZIZ = C1121450fHz.LIZIZ(enumC1121470fI1.getType());
        int i = 0;
        if (c1123320fL0LIZIZ == null) {
            return false;
        }
        int i2 = C1121490fI3.LIZ[enumC1121470fI1.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                return false;
            }
            pair = new Pair("live_incentive_task_inbox_guide", EnumC1584360rKc.INBOX);
        } else {
            pair = new Pair("live_incentive_task_following_guide", EnumC1584360rKc.FOLLOWING);
        }
        String str4 = (String) pair.getFirst();
        final EnumC1584360rKc enumC1584360rKc = (EnumC1584360rKc) pair.getSecond();
        C1904790zfR c1904790zfRLIZ = C1904960zfi.LIZ(str4, enumC1584360rKc);
        c1904790zfRLIZ.LJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1904790zfRLIZ.LJFF = EnumC1619300sEy.SWITCH_TAB;
        Text text = ((FeedBubbleMetaData) c1123320fL0LIZIZ.LIZLLL).title;
        Integer numValueOf2 = null;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        final Context context = view.getContext();
        AbstractC1391580mJg<C1391570mJf> abstractC1391580mJg = new AbstractC1391580mJg<C1391570mJf>(context) { // from class: X.0mJf
        };
        abstractC1391580mJg.LLILLJJLI.LIZIZ = view;
        final Context context2 = view.getContext();
        LinearLayout linearLayout = new LinearLayout(context2) { // from class: X.0Gc0
            {
                super(context2);
                LinearLayout.inflate(context2, R.layout.dhs, this);
                int iLIZLLL = C418440Gaw.LIZLLL(context2) / 2;
                TextView textView = (TextView) findViewById(R.id.o8v);
                if (textView != null) {
                    textView.setMaxWidth(iLIZLLL);
                }
            }
        };
        TextView textView = (TextView) linearLayout.findViewById(R.id.o8v);
        if (textView != null) {
            textView.setText(spannableLJIILIIL);
        }
        ImageModel imageModel = ((FeedBubbleMetaData) c1123320fL0LIZIZ.LIZLLL).icon;
        C1324720kZq c1324720kZq = (C1324720kZq) linearLayout.findViewById(R.id.kb6);
        if (c1324720kZq != null && imageModel != null) {
            new C1324600kZe(imageModel).LIZ(c1324720kZq);
        }
        abstractC1391580mJg.LLILLJJLI.LJIIZILJ = linearLayout;
        C1905770zh1.LIZJ(abstractC1391580mJg, str4, false, new View.OnClickListener() { // from class: X.0sG3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
            }
        });
        C1905770zh1.LIZIZ(abstractC1391580mJg, str4, enumC1584360rKc, AFwS213S0000000_24.get$arr$(599));
        C1905770zh1.LIZ(abstractC1391580mJg, str4, enumC1584360rKc, AFwS245S0000000_12.get$arr$(216));
        if (enumC1584360rKc == EnumC1584360rKc.FOLLOWING) {
            abstractC1391580mJg.LLILLJJLI.LJFF = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-20));
            LIZ.getClass();
            Activity activityLIZ = C2421209eE.LIZ();
            if (activityLIZ != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZ)) != null && (mainActivityScopeLIZJ = C0S4U.LIZJ(c19egLIZIZ)) != null && (topTabAbilityLIZ = C0S4T.LIZ(mainActivityScopeLIZJ)) != null && (pairIL2 = topTabAbilityLIZ.IL2()) != null) {
                float fFloatValue = ((Number) pairIL2.getFirst()).floatValue();
                int iIntValue = ((Number) pairIL2.getSecond()).intValue();
                if (fFloatValue < 0.5d) {
                    i = (int) ((fFloatValue * iIntValue) / 2);
                }
            }
            abstractC1391580mJg.LLILLJJLI.LJI = i;
        }
        TouchPointColor touchPointColor = ((FeedBubbleMetaData) c1123320fL0LIZIZ.LIZLLL).background;
        if (touchPointColor != null && (str3 = touchPointColor.light) != null) {
            numValueOf = Integer.valueOf(C0HEZ.LIZIZ(str3));
        } else {
            numValueOf = null;
        }
        TouchPointColor touchPointColor2 = ((FeedBubbleMetaData) c1123320fL0LIZIZ.LIZLLL).background;
        if (touchPointColor2 != null && (str2 = touchPointColor2.dark) != null) {
            numValueOf2 = Integer.valueOf(C0HEZ.LIZIZ(str2));
        }
        if (C960203pA.LIZIZ(view.getContext()) && numValueOf2 != null) {
            abstractC1391580mJg.LJI(numValueOf2.intValue());
        } else if (!C960203pA.LIZIZ(view.getContext()) && numValueOf != null) {
            abstractC1391580mJg.LJI(numValueOf.intValue());
        }
        return Intrinsics.LJFF(C1905750zgz.LIZIZ.LJFF(c1904790zfRLIZ.LIZ(abstractC1391580mJg.LIZIZ()), new InterfaceC1906540ziG() { // from class: X.0sFz
            @Override // X.InterfaceC1906540ziG
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1906540ziG
            public final void onShow() {
                C1619950sG1 c1619950sG1 = C1619950sG1.LIZ;
                C1123320fL0<FeedBubbleMetaData, FeedBubbleEntryData> c1123320fL0 = c1123320fL0LIZIZ;
                String str5 = c1123320fL0.LIZIZ;
                String str6 = c1123320fL0.LJ;
                long j = C1619950sG1.LIZLLL;
                c1619950sG1.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str5);
                sbLIZ2.append('_');
                sbLIZ2.append(str6);
                sbLIZ2.append('_');
                sbLIZ2.append(j);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                try {
                    Map<String, Integer> mapLIZ = C1143820fs4.LIZ.LIZ();
                    if (mapLIZ == null) {
                        mapLIZ = new LinkedHashMap<>();
                    }
                    Integer num = mapLIZ.get(strLIZIZ);
                    mapLIZ.put(strLIZIZ, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                    for (Map.Entry<String, Integer> entry : mapLIZ.entrySet()) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("key: ");
                        sbLIZ3.append(entry.getKey());
                        sbLIZ3.append("  value ");
                        sbLIZ3.append(entry.getValue().intValue());
                        C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    C1143820fs4.LIZ.LIZJ(mapLIZ);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
                C1619940sG0.LLILLJJLI.put(enumC1584360rKc.getKey(), Long.valueOf(SystemClock.elapsedRealtime()));
            }

            @Override // X.InterfaceC1906540ziG
            public final void onDismiss() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1123320fL0LIZIZ.LIZIZ);
                sbLIZ2.append(" bubble dismissed");
                C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ2));
            }

            @Override // X.InterfaceC1906540ziG
            public final void LIZ(C1619160sEk c1619160sEk) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c1123320fL0LIZIZ.LIZIZ);
                sbLIZ2.append(" bubble intercepted with ");
                sbLIZ2.append(c1619160sEk.LIZ);
                C20441214yg.LIZIZ("RevenueStrategyAppInit", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }), C0J74.LIZ);
    }
}
