package Y;

import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C0RPZ;
import X.C0RR7;
import X.C0S1B;
import X.C0S5R;
import X.C0SJF;
import X.C0SJG;
import X.C0SJU;
import X.C0SRL;
import X.C13BV;
import X.C1C7U;
import X.C20684815ws;
import X.C21368918jv;
import X.C2344009Gk;
import X.C2487409ou;
import X.C694320RLi;
import X.C695720RQs;
import X.C695730RQt;
import X.C695740RQu;
import X.C719200SJa;
import X.C719400SJu;
import X.C720690SOt;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.feed.platform.ab.ComponentMarginConfig;
import com.ss.android.ugc.feed.platform.ab.LowScreenOptimizeAB;
import com.ss.android.ugc.feed.platform.ab.UnifyComponentsMarginConfig;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS2S1320000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class ARunnableS4S1400000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        ViewGroup viewGroup;
        View viewLIZ;
        GlobalComponentData globalComponentDataLIZIZ;
        ComponentMarginConfig componentMarginConfigLIZIZ;
        Context context = (Context) this.l1;
        String str = this.s0;
        Aweme aweme = (Aweme) this.l2;
        C01GW c01gw = C695720RQs.LIZ;
        UnifyComponentsMarginConfig unifyComponentsMarginConfig = (UnifyComponentsMarginConfig) c01gw.getValue();
        if (C695730RQt.LIZIZ(context, aweme, str)) {
            unifyComponentsMarginConfig = C695730RQt.LIZIZ;
            if (unifyComponentsMarginConfig == null) {
                unifyComponentsMarginConfig = (UnifyComponentsMarginConfig) c01gw.getValue();
            }
        } else if (C0RR7.LIZIZ(context, aweme, str)) {
            unifyComponentsMarginConfig = (UnifyComponentsMarginConfig) C695720RQs.LIZIZ.getValue();
        }
        boolean zLIZIZ = C695730RQt.LIZIZ((Context) this.l1, (Aweme) this.l2, this.s0);
        boolean zLIZIZ2 = C0RR7.LIZIZ((Context) this.l1, (Aweme) this.l2, this.s0);
        int size = ((List) this.l3).size() - 1;
        View view = null;
        View view2 = null;
        while (-1 < size) {
            View view3 = (View) ListProtector.get((List) this.l3, size);
            boolean z = view == null && Intrinsics.LJFF(unifyComponentsMarginConfig.unifyLastComponent, Boolean.TRUE);
            int id = view3.getId();
            String str2 = C0RPZ.LJIIJJI;
            int i = R.id.elx;
            if (id != R.id.emp) {
                View viewLIZ2 = C695740RQu.LIZ(view3);
                if (viewLIZ2 != null) {
                    Map map = (Map) this.l4;
                    Aweme aweme2 = (Aweme) this.l2;
                    String str3 = this.s0;
                    GlobalComponentData globalComponentDataLIZIZ2 = C695740RQu.LIZIZ(view3);
                    ComponentMarginConfig componentMarginConfigLIZIZ2 = C695720RQs.LIZIZ(globalComponentDataLIZIZ2, unifyComponentsMarginConfig, z);
                    if (componentMarginConfigLIZIZ2 != null) {
                        ComponentMarginConfig componentMarginConfigLIZJ = C695720RQs.LIZJ(componentMarginConfigLIZIZ2, view3, zLIZIZ2);
                        if (((zLIZIZ2 && !zLIZIZ) || (LowScreenOptimizeAB.LIZJ().openAB && LowScreenOptimizeAB.LJ())) && view2 != null && view2.getId() == R.id.elx) {
                            componentMarginConfigLIZJ = new ComponentMarginConfig(C695720RQs.LIZLLL(C694320RLi.LIZJ), 0.0f);
                        }
                        Pair pair = (Pair) map.get(Integer.valueOf(viewLIZ2.hashCode()));
                        if (pair != null) {
                            C695720RQs.LIZ(pair, componentMarginConfigLIZJ, new AwS2S1320000_11(aweme2, str3, componentMarginConfigLIZIZ2, globalComponentDataLIZIZ2, zLIZIZ, z, 1));
                        }
                    }
                }
            } else if ((view3 instanceof ViewGroup) && (viewGroup = (ViewGroup) view3) != null) {
                C09RD c09rd = new C09RD(viewGroup);
                Map map2 = (Map) this.l4;
                Aweme aweme3 = (Aweme) this.l2;
                String str4 = this.s0;
                Iterator<View> it2 = c09rd.iterator();
                while (true) {
                    C09RE c09re = (C09RE) it2;
                    if (c09re.hasNext()) {
                        View view4 = (View) c09re.next();
                        if (view4.isShown() && (viewLIZ = C695740RQu.LIZ(view4)) != null && (componentMarginConfigLIZIZ = C695720RQs.LIZIZ((globalComponentDataLIZIZ = C695740RQu.LIZIZ(view4)), unifyComponentsMarginConfig, z)) != null) {
                            ComponentMarginConfig componentMarginConfigLIZJ2 = C695720RQs.LIZJ(componentMarginConfigLIZIZ, view4, zLIZIZ2);
                            if (((zLIZIZ2 && !zLIZIZ) || (LowScreenOptimizeAB.LIZJ().openAB && LowScreenOptimizeAB.LJ())) && view2 != null) {
                                int id2 = view2.getId();
                                String str5 = C0RPZ.LJIIJJI;
                                if (id2 == i) {
                                    componentMarginConfigLIZJ2 = new ComponentMarginConfig(C695720RQs.LIZLLL(C694320RLi.LIZJ), 0.0f);
                                }
                            }
                            Pair pair2 = (Pair) map2.get(Integer.valueOf(viewLIZ.hashCode()));
                            if (pair2 != null) {
                                C695720RQs.LIZ(pair2, componentMarginConfigLIZJ2, new AwS2S1320000_11(aweme3, str4, componentMarginConfigLIZIZ, globalComponentDataLIZIZ, zLIZIZ, z, 0));
                            }
                        }
                        i = R.id.elx;
                    }
                }
            }
            size--;
            view = view3;
            view2 = view3;
        }
    }

    public final void LIZ$1() {
        String str;
        Iterable iterable;
        Iterable iterable2;
        Aweme aweme = ((C720690SOt) this.l1).LL.LIZJ;
        Object photoDescTextComponents = aweme != null ? AwemeBizExtKt.getPhotoDescTextComponents(aweme) : null;
        C0SJF c0sjfLIZJ = (!(photoDescTextComponents instanceof Iterable) || (iterable2 = (Iterable) photoDescTextComponents) == null) ? C719200SJa.LIZJ(this.s0, (List) this.l2) : new C0SJF(iterable2);
        C0S5R c0s5r = (C0S5R) this.l3;
        if (c0s5r != null && c0s5r.LIZJ) {
            ClientText clientText = c0s5r.LIZ;
            if (clientText != null) {
                Aweme aweme2 = ((C720690SOt) this.l1).LL.LIZJ;
                Object photoDescTextComponents2 = aweme2 != null ? AwemeBizExtKt.getPhotoDescTextComponents(aweme2) : null;
                if (!(photoDescTextComponents2 instanceof Iterable) || (iterable = (Iterable) photoDescTextComponents2) == null) {
                    String str2 = clientText.markupText;
                    str = str2 != null ? str2 : "";
                    List list = clientText.textExtra;
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    c0sjfLIZJ = C719200SJa.LIZJ(str, list);
                } else {
                    c0sjfLIZJ = new C0SJF(iterable);
                }
            } else {
                C720690SOt c720690SOt = (C720690SOt) this.l1;
                String str3 = c0s5r.LIZIZ;
                str = str3 != null ? str3 : "";
                c720690SOt.getClass();
                c0sjfLIZJ = C720690SOt.LIZ(c0sjfLIZJ, str);
            }
        }
        C720690SOt c720690SOt2 = (C720690SOt) this.l1;
        c0sjfLIZJ.LIZLLL(new AwS590S0100000_11(c720690SOt2, 518));
        int currentTextColor = ((C21368918jv) this.l4).getCurrentTextColor();
        C0SRL c0srl = c720690SOt2.LL;
        Aweme aweme3 = c0srl.LIZJ;
        if (aweme3 != null) {
            c0sjfLIZJ.LIZLLL(new C0SJU(Collections.singletonList(new C719400SJu(c720690SOt2, aweme3, c0srl.LIZLLL(), currentTextColor))));
        }
        c0sjfLIZJ.LIZLLL(new C0SJG(AFwS243S0000000_11.get$arr$(766)));
        CharSequence charSequenceLIZ = C0SJF.LIZ(c0sjfLIZJ);
        ((C720690SOt) this.l1).LLJI = c0sjfLIZJ.LIZJ();
        C2487409ou.LIZJ(new ARunnableS20S0400000_11((C720690SOt) this.l1, (C21368918jv) this.l4, charSequenceLIZ, (C0S5R) this.l3, 3));
    }

    public final void LIZ$2() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJ((Integer) this.l1, "total_subtype_num");
        c2344009Gk.LJIIIIZZ("enter_from", this.s0);
        c2344009Gk.LJ((Long) this.l2, "explore_topic_id");
        c2344009Gk.LJ((Integer) this.l3, "subtab_position");
        c2344009Gk.LJ((Integer) this.l4, "end_position");
        C20684815ws.LJIILLIIL("ttexp_topic_manage_reorder", c2344009Gk.LIZ);
    }

    public static final void run$0(ARunnableS4S1400000_11 aRunnableS4S1400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("UnifyComponentMarginMobUtil@962f.checkAndTrySendAsync$2");
        try {
            aRunnableS4S1400000_11.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UnifyComponentMarginMobUtil@962f.checkAndTrySendAsync$2");
    }

    public static final void run$1(ARunnableS4S1400000_11 aRunnableS4S1400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("PostModeDescriptionComponent@bdef.initViewForMarkup$1");
        try {
            aRunnableS4S1400000_11.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PostModeDescriptionComponent@bdef.initViewForMarkup$1");
    }

    public static final void run$2(ARunnableS4S1400000_11 aRunnableS4S1400000_11) {
        boolean zLIZ;
        Function0 function0;
        C1C7U.LIZ("StoryThoughtAnimatedAvatarHelper@1d60.applyUserAvatar$1");
        try {
            if (((AvatarComponentView) aRunnableS4S1400000_11.l1).getParent() != null && ((function0 = (Function0) aRunnableS4S1400000_11.l2) == null || ((Boolean) function0.invoke()).booleanValue())) {
                C0S1B.LIZ((AvatarComponentView) aRunnableS4S1400000_11.l1, aRunnableS4S1400000_11.s0, (User) aRunnableS4S1400000_11.l3, (LifecycleOwner) aRunnableS4S1400000_11.l4, false, null, 56);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryThoughtAnimatedAvatarHelper@1d60.applyUserAvatar$1");
    }

    public static final void run$3(ARunnableS4S1400000_11 aRunnableS4S1400000_11) {
        boolean zLIZ;
        C1C7U.LIZ("ExploreMobUtils@18af.logTopicManagerReorder$1");
        try {
            aRunnableS4S1400000_11.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreMobUtils@18af.logTopicManagerReorder$1");
    }

    public ARunnableS4S1400000_11(Integer num, Long l, Integer num2, Integer num3, int i) {
        this.$t = i;
        this.l1 = num;
        this.s0 = "homepage_explore";
        this.l2 = l;
        this.l3 = num2;
        this.l4 = num3;
    }

    public ARunnableS4S1400000_11(Object obj, Object obj2, String str, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
        this.l3 = obj3;
        this.l4 = obj4;
    }
}
