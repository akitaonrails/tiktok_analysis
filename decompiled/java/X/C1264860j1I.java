package X;

import android.text.TextUtils;
import android.util.TypedValue;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.profile.model.AwemeUnreadInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j1I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264860j1I {
    public static String LIZ(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (TextUtils.equals(interfaceC1264850j1H.Ye(), "following_relation")) {
            if (interfaceC1264850j1H.LLIL()) {
                return "following";
            }
            return "other_following";
        }
        if (TextUtils.equals(interfaceC1264850j1H.Ye(), "follower_relation")) {
            if (interfaceC1264850j1H.LLIL()) {
                return "fans";
            }
            return "other_fans";
        }
        return "";
    }

    public static String LIZIZ(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (C123100dR.LIZ(interfaceC1264850j1H.M2())) {
            String strM2 = interfaceC1264850j1H.M2();
            if (strM2 == null) {
                return "";
            }
            return strM2;
        }
        if (interfaceC1264850j1H.LLIL()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public static String LIZJ(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "following_relation")) {
            if (interfaceC1264850j1H.LLIL()) {
                return "following_list";
            }
            return "other_following";
        }
        if (Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "follower_relation")) {
            if (interfaceC1264850j1H.LLIL()) {
                return "fans";
            }
            return "other_fans";
        }
        if (Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "mutual_relation")) {
            return "relation_tab";
        }
        if (C123100dR.LIZ(interfaceC1264850j1H.M2())) {
            String strM2 = interfaceC1264850j1H.M2();
            if (strM2 != null) {
                return strM2;
            }
            return "";
        }
        if (interfaceC1264850j1H.LLIL()) {
            return "personal_homepage";
        }
        return "others_homepage";
    }

    public static RelationLabelTextView LIZLLL(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (interfaceC1264850j1H.H2() != null) {
            return interfaceC1264850j1H.H2();
        }
        interfaceC1264850j1H.o9((RelationLabelTextView) C726240SeE.LIZIZ(interfaceC1264850j1H.bl(), interfaceC1264850j1H.H2(), R.id.t4q, R.id.vs_relation_label));
        return interfaceC1264850j1H.H2();
    }

    public static C1091830eWD LJ(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (interfaceC1264850j1H.S5() != null) {
            return interfaceC1264850j1H.S5();
        }
        interfaceC1264850j1H.si((C1091830eWD) C726240SeE.LIZIZ(interfaceC1264850j1H.bl(), interfaceC1264850j1H.S5(), R.id.v6h, R.id.vs_shop_entrance_link));
        return interfaceC1264850j1H.S5();
    }

    public static void LJI(InterfaceC1264850j1H interfaceC1264850j1H) {
        if (LJII(interfaceC1264850j1H)) {
            interfaceC1264850j1H.bl().setBackground(null);
            return;
        }
        TypedValue typedValue = new TypedValue();
        interfaceC1264850j1H.bl().getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
        interfaceC1264850j1H.bl().setBackgroundResource(typedValue.resourceId);
    }

    public static boolean LJII(InterfaceC1264850j1H interfaceC1264850j1H) {
        if ((((Number) C296100Bj6.LIZ.getValue()).intValue() & 4) != 0 && Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "following_relation") && interfaceC1264850j1H.LLIL()) {
            return true;
        }
        return false;
    }

    public static Pair LJFF(User user, InterfaceC1264850j1H interfaceC1264850j1H) {
        AwemeUnreadInfo awemeUnreadInfo;
        List<String> list;
        Pair pair = new Pair(Boolean.FALSE, 0);
        if (C2277051EAt.LIZ() && Intrinsics.LJFF(interfaceC1264850j1H.Ye(), "following_relation") && interfaceC1264850j1H.LLIL() && (awemeUnreadInfo = user.getAwemeUnreadInfo()) != null && (list = awemeUnreadInfo.unreadIdList) != null && (!list.isEmpty())) {
            return new Pair(Boolean.TRUE, Integer.valueOf(list.size()));
        }
        return pair;
    }

    public static void LJIIIIZZ(InterfaceC1264850j1H interfaceC1264850j1H, int i) {
        if (SubscribeSettingsExp.LIZIZ()) {
            return;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    interfaceC1264850j1H.P4().setIconRes(R.raw.icon_bell_slash);
                    interfaceC1264850j1H.P4().setTintColorRes(R.attr.a1k);
                    return;
                }
                return;
            }
            interfaceC1264850j1H.P4().setIconRes(R.raw.icon_bell);
            interfaceC1264850j1H.P4().setTintColorRes(R.attr.a1k);
            return;
        }
        interfaceC1264850j1H.P4().setIconRes(R.raw.icon_bell_activation);
        interfaceC1264850j1H.P4().setTintColorRes(R.attr.a1k);
    }
}
