package X;

import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.assem.FYPSkylightDrawerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.homepage.api.interaction.BaseScrollSwitchStateManager;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectDoneAssem;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620990sHh extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620990sHh(C1611080s1i c1611080s1i, int i) {
        super(5);
        this.$t = i;
        this.l0 = c1611080s1i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620990sHh(C1611120s1m c1611120s1m, int i) {
        super(5);
        this.$t = i;
        this.l0 = c1611120s1m;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620990sHh(FYPSkylightDrawerAssem fYPSkylightDrawerAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = fYPSkylightDrawerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1620990sHh(EffectDoneAssem effectDoneAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = effectDoneAssem;
    }

    public static final Object invoke$0(C1620990sHh c1620990sHh, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj2;
        String str2 = (String) obj3;
        UrlModel urlModel = (UrlModel) obj4;
        Uri uri = (Uri) obj5;
        View view = ((EffectDoneAssem) c1620990sHh.l0).LLJJIII;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        C1322110kVd c1322110kVd = (C1322110kVd) view.findViewById(R.id.gx9);
        if (c1322110kVd != null) {
            if (uri != null) {
                C1324750kZt.LJIIIZ(c1322110kVd, uri.toString(), -1, -1);
            } else {
                C1324750kZt.LJFF(c1322110kVd, urlModel);
            }
        }
        View view3 = ((EffectDoneAssem) c1620990sHh.l0).LLJJIII;
        if (view3 == null) {
            view3 = null;
        }
        TextView textView = (TextView) view3.findViewById(R.id.whr);
        if (textView != null) {
            textView.setText(str);
        }
        View view4 = ((EffectDoneAssem) c1620990sHh.l0).LLJJIII;
        if (view4 != null) {
            view2 = view4;
        }
        TextView textView2 = (TextView) view2.findViewById(R.id.whq);
        if (textView2 != null) {
            textView2.setText(str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1620990sHh c1620990sHh, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Aweme aweme;
        String aid;
        boolean zIsLike;
        boolean zIsCollected;
        boolean zIsCommentClicked;
        View view = (View) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = (String) obj4;
        String str4 = (String) obj5;
        C1611120s1m c1611120s1m = (C1611120s1m) c1620990sHh.l0;
        boolean zIsForwardClicked = false;
        if (view != null && c1611120s1m.LIZIZ(view)) {
            C19EG activity = c1611120s1m.LIZJ().getActivity();
            if (activity != null) {
                C19EG activity2 = c1611120s1m.LIZJ().getActivity();
                if (activity2 != null) {
                    aweme = C680080Qly.LIZIZ(activity2).LLJILJILJ;
                } else {
                    aweme = null;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//search");
                smartRouteBuildRoute.withParam("keyword", str);
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                smartRouteBuildRoute.withParam("group_id", aid);
                smartRouteBuildRoute.withParam("in_single_stack", true);
                smartRouteBuildRoute.withParam("search_from", "time_sensitive_bubble");
                smartRouteBuildRoute.withParam("enter_from", c1611120s1m.LIZJ().f3());
                smartRouteBuildRoute.withParam("enter_method", "time_sensitive_bubble");
                smartRouteBuildRoute.withParam("is_from_video", 1);
                if (C1EE2.LIZIZ.LIZLLL()) {
                    smartRouteBuildRoute.withParam("is_enter_graphic_detail", c1611120s1m.LJIIJ());
                }
                smartRouteBuildRoute.withParam("search_type", "general");
                smartRouteBuildRoute.withParam("back_flag", 1);
                if (aweme != null) {
                    zIsLike = aweme.isLike();
                } else {
                    zIsLike = false;
                }
                smartRouteBuildRoute.withParam("is_feed_liked", zIsLike);
                if (aweme != null) {
                    zIsCollected = AwemeExtKt.isCollected(aweme);
                } else {
                    zIsCollected = false;
                }
                smartRouteBuildRoute.withParam("is_feed_collected", zIsCollected);
                if (aweme != null) {
                    zIsCommentClicked = AwemeBizExtKt.isCommentClicked(aweme);
                } else {
                    zIsCommentClicked = false;
                }
                smartRouteBuildRoute.withParam("is_feed_comment_clicked", zIsCommentClicked);
                if (aweme != null) {
                    zIsForwardClicked = AwemeBizExtKt.isForwardClicked(aweme);
                }
                smartRouteBuildRoute.withParam("is_feed_forward_clicked", zIsForwardClicked);
                smartRouteBuildRoute.withParam("caption_rating", str2);
                smartRouteBuildRoute.withParam("preClickImprId", str3);
                smartRouteBuildRoute.withParam("penetrate_info", str4);
                smartRouteBuildRoute.open();
            }
        } else {
            c1611120s1m.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(C1620990sHh c1620990sHh, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Aweme aweme;
        String aid;
        boolean zIsLike;
        boolean zIsCollected;
        boolean zIsCommentClicked;
        View view = (View) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        String str3 = (String) obj4;
        String str4 = (String) obj5;
        C1611080s1i c1611080s1i = (C1611080s1i) c1620990sHh.l0;
        boolean zIsForwardClicked = false;
        if (view != null && c1611080s1i.LIZIZ(view)) {
            C19EG activity = c1611080s1i.LIZJ().getActivity();
            if (activity != null) {
                C19EG activity2 = c1611080s1i.LIZJ().getActivity();
                if (activity2 != null) {
                    aweme = C680080Qly.LIZIZ(activity2).LLJILJILJ;
                } else {
                    aweme = null;
                }
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activity, "//search");
                smartRouteBuildRoute.withParam("keyword", str);
                if (aweme == null || (aid = aweme.getAid()) == null) {
                    aid = "";
                }
                smartRouteBuildRoute.withParam("group_id", aid);
                smartRouteBuildRoute.withParam("in_single_stack", true);
                smartRouteBuildRoute.withParam("search_from", "time_sensitive_bubble");
                smartRouteBuildRoute.withParam("enter_from", c1611080s1i.LIZJ().f3());
                smartRouteBuildRoute.withParam("enter_method", "time_sensitive_bubble");
                smartRouteBuildRoute.withParam("is_from_video", 1);
                if (C1EE2.LIZIZ.LIZLLL()) {
                    smartRouteBuildRoute.withParam("is_enter_graphic_detail", C1611080s1i.LJIIIIZZ(activity));
                }
                smartRouteBuildRoute.withParam("search_type", "general");
                smartRouteBuildRoute.withParam("back_flag", 1);
                if (aweme != null) {
                    zIsLike = aweme.isLike();
                } else {
                    zIsLike = false;
                }
                smartRouteBuildRoute.withParam("is_feed_liked", zIsLike);
                if (aweme != null) {
                    zIsCollected = AwemeExtKt.isCollected(aweme);
                } else {
                    zIsCollected = false;
                }
                smartRouteBuildRoute.withParam("is_feed_collected", zIsCollected);
                if (aweme != null) {
                    zIsCommentClicked = AwemeBizExtKt.isCommentClicked(aweme);
                } else {
                    zIsCommentClicked = false;
                }
                smartRouteBuildRoute.withParam("is_feed_comment_clicked", zIsCommentClicked);
                if (aweme != null) {
                    zIsForwardClicked = AwemeBizExtKt.isForwardClicked(aweme);
                }
                smartRouteBuildRoute.withParam("is_feed_forward_clicked", zIsForwardClicked);
                smartRouteBuildRoute.withParam("caption_rating", str2);
                smartRouteBuildRoute.withParam("preClickImprId", str3);
                smartRouteBuildRoute.withParam("penetrate_info", str4);
                smartRouteBuildRoute.open();
            }
        } else {
            c1611080s1i.getClass();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(C1620990sHh c1620990sHh, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        View view;
        int iLIZIZ;
        Fragment fragmentLJI;
        EnumC1604570rrD enumC1604570rrD = (EnumC1604570rrD) obj;
        String str = (String) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
        String str2 = (String) obj5;
        FYPSkylightDrawerAssem fYPSkylightDrawerAssem = (FYPSkylightDrawerAssem) c1620990sHh.l0;
        fYPSkylightDrawerAssem.getClass();
        int i = C1604560rrC.LIZ[enumC1604570rrD.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                if (!zBooleanValue && (fragmentLJI = C724240Sb0.LJI(fYPSkylightDrawerAssem)) != null) {
                    C614770O9j.LIZIZ.LJ().LJIILL(fragmentLJI, false, str, 1, zBooleanValue2, false, str2);
                }
                IViewPagerComponentAbility iViewPagerComponentAbilityHo = fYPSkylightDrawerAssem.Ho();
                if (iViewPagerComponentAbilityHo != null) {
                    iViewPagerComponentAbilityHo.Xl0(fYPSkylightDrawerAssem.LLJJJJJIL);
                }
                IAutoAScrollAbility iAutoAScrollAbility = (IAutoAScrollAbility) fYPSkylightDrawerAssem.LLJJI.getValue();
                if (iAutoAScrollAbility != null) {
                    iAutoAScrollAbility.uD2();
                }
            }
        } else {
            if (!zBooleanValue) {
                boolean zLJFF = Intrinsics.LJFF(str, "publish_landing");
                Fragment fragmentLJI2 = C724240Sb0.LJI(fYPSkylightDrawerAssem);
                if (fragmentLJI2 != null) {
                    z = true;
                    C614770O9j.LIZIZ.LJ().LJIILL(fragmentLJI2, true, str, 1, zBooleanValue2, zLJFF, str2);
                }
            }
            IViewPagerComponentAbility iViewPagerComponentAbilityHo2 = fYPSkylightDrawerAssem.Ho();
            if (iViewPagerComponentAbilityHo2 != null) {
                iViewPagerComponentAbilityHo2.Bv0(fYPSkylightDrawerAssem.LLJJJJJIL);
            }
            IAutoAScrollAbility iAutoAScrollAbility2 = (IAutoAScrollAbility) fYPSkylightDrawerAssem.LLJJI.getValue();
            if (iAutoAScrollAbility2 != null) {
                iAutoAScrollAbility2.AU0();
            }
        }
        IViewPagerComponentAbility iViewPagerComponentAbilityHo3 = fYPSkylightDrawerAssem.Ho();
        if (iViewPagerComponentAbilityHo3 != null && (view = iViewPagerComponentAbilityHo3.getView()) != null) {
            if (enumC1604570rrD == EnumC1604570rrD.CLOSED) {
                iLIZIZ = 0;
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            }
            C417950Ga9.LIZ(iLIZIZ, view);
        }
        if (enumC1604570rrD == EnumC1604570rrD.CLOSED) {
            z = false;
        }
        BaseScrollSwitchStateManager baseScrollSwitchStateManager = (BaseScrollSwitchStateManager) fYPSkylightDrawerAssem.LLJJJIL.getValue();
        if (baseScrollSwitchStateManager != null) {
            baseScrollSwitchStateManager.KQ2(!z);
        }
        Iterator it2 = ((CopyOnWriteArrayList) fYPSkylightDrawerAssem.LLJJIJI.getValue()).iterator();
        while (it2.hasNext()) {
            ((Function1) it2.next()).invoke(Boolean.valueOf(z));
        }
        return Unit.LIZ;
    }
}
