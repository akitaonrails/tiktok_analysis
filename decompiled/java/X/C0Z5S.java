package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.GroupDetailFragment;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.search.ChatHistorySearchFeature;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.data.IChatDetailActionFactory;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS124S1000000_14;
import kotlin.jvm.internal.AwS132S0110000_14;
import kotlin.jvm.internal.AwS154S1200000_14;
import kotlin.jvm.internal.AwS29S1110000_2;
import kotlin.jvm.internal.AwS41S1110000_14;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS99S1000000_14;

/* JADX INFO: renamed from: X.0Z5S, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5S extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ GroupDetailFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z5S(GroupDetailFragment groupDetailFragment, String str, long j) {
        super(1);
        this.LL = groupDetailFragment;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        boolean z;
        C1A23 c1a23;
        C0Z2G c0z2g;
        C1A23 c1a232;
        final C0Z6T c0z6t;
        C0Z2F c0z2f;
        final C893960Z5e c893960Z5eLIZ;
        C890990YxN c890990YxNLIZJ;
        final C893020Z1o c893020Z1oLIZLLL;
        C1722006ok c1722006okLIZIZ;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        GroupDetailFragment groupDetailFragment = this.LL;
        final String str = this.LLILLJJLI;
        final long j = this.LLILLL;
        groupDetailFragment.getClass();
        ArrayList arrayList = new ArrayList();
        IChatDetailActionFactory.LIZ.getClass();
        IChatDetailActionFactory iChatDetailActionFactoryLIZ = C0Z5U.LIZ();
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(new C1A24(str) { // from class: X.0Z6n
            /* JADX WARN: Illegal instructions before constructor call */
            {
                int i;
                C894330Z6p c894330Z6p = new C06WA() { // from class: X.0Z6p
                };
                if (C1229100i5c.LIZ.LJIIJ(str)) {
                    i = 2131831351;
                } else {
                    i = 2131831354;
                }
                super(new C894370Z6t(c894330Z6p, i, R.raw.icon_person_plus_fill), AFwS201S0000000_14.get$arr$(467), new AwS124S1000000_14(str, 1), null, 56);
            }
        }, new C1A24(str) { // from class: X.0Z6o
            {
                super(new C894370Z6t(new C06WA() { // from class: X.0Z6q
                }, 2131831353, R.raw.icon_link_fill), AFwS190S0000000_4.get$arr$(4049), new AwS124S1000000_14(str, 4), null, 56);
            }
        });
        if (ChatHistorySearchFeature.LIZ.LIZ() != null) {
            z = true;
        } else {
            z = false;
        }
        C1A23 c1a233 = null;
        if (z && iChatDetailActionFactoryLIZ != null && (c1722006okLIZIZ = iChatDetailActionFactoryLIZ.LIZIZ("group", str, null)) != null) {
            listLJIILJJIL.add(c1722006okLIZIZ);
        }
        arrayList.add(new C893950Z5d(C0ZBL.HORIZONTAL_NEW, listLJIILJJIL));
        List listLJIILJJIL2 = C1697810uHb.LJIILJJIL(new C1A23(str) { // from class: X.0Yx6
            {
                super(new C2172771A1r(new C06WA() { // from class: X.0Yx8
                }, 2131831481, R.raw.icon_bell, null, null, true, null, 1976), new AwS99S1000000_14(str, 3), new AwS124S1000000_14(str, 2), new AwS124S1000000_14(str, 3), null, 48);
            }
        });
        IChatDetailActionFactory iChatDetailActionFactoryLIZ2 = C0Z5U.LIZ();
        if (iChatDetailActionFactoryLIZ2 != null && (c893020Z1oLIZLLL = iChatDetailActionFactoryLIZ2.LIZLLL(str, AFwS248S0000000_14.get$arr$(460))) != null) {
            ListProtector.add(listLJIILJJIL2, 0, new C0Z28(c893020Z1oLIZLLL) { // from class: X.0Z26
                public static final /* synthetic */ int LLJILJILJ = 0;

                {
                    super(c893020Z1oLIZLLL.LLIZ, new AwS558S0100000_14(c893020Z1oLIZLLL, 1467), new AwS628S0100000_14(c893020Z1oLIZLLL, 61), new AwS628S0100000_14(c893020Z1oLIZLLL, 62));
                }
            });
        }
        if (iChatDetailActionFactoryLIZ != null && (c890990YxNLIZJ = iChatDetailActionFactoryLIZ.LIZJ(str, false, true)) != null) {
            ListProtector.add(listLJIILJJIL2, 0, c890990YxNLIZJ);
        }
        final C19EG activity = groupDetailFragment.getActivity();
        ListProtector.add(listLJIILJJIL2, 0, new C1A23(str, activity) { // from class: X.0Z1A
            /* JADX WARN: Illegal instructions before constructor call */
            {
                boolean z2;
                String strLJIIJ;
                C1619106Vp c1619106Vp = IChatCustomizeHelper.LIZ;
                c1619106Vp.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ != null && iChatCustomizeHelperLIZ.canShowNewLabel()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1696006kY c1696006kY = C1696006kY.LIZ;
                c1619106Vp.getClass();
                IChatCustomizeHelper iChatCustomizeHelperLIZ2 = C1619106Vp.LIZ();
                if (iChatCustomizeHelperLIZ2 != null && iChatCustomizeHelperLIZ2.isShowCustomizationLegacyNewLabel()) {
                    strLJIIJ = C1383370m6R.LJIIJ(2131830998);
                } else {
                    strLJIIJ = null;
                }
                super(new C2172771A1r(c1696006kY, 2131830991, R.raw.icon_color_palette, strLJIIJ, new AwS132S0110000_14(activity, z2, 5), true, null, 1928), AFwS201S0000000_14.get$arr$(468), new AwS41S1110000_14(activity, str, z2, 0), null, new AwS29S1110000_2(activity, str, z2, 0), 40);
            }
        });
        final C0Z6T c0z6t2 = (C0Z6T) groupDetailFragment.LLIZ.getValue();
        if (c0z6t2 != null) {
            c1a23 = new C1A23(str, j, c0z6t2) { // from class: X.0YyS
                public final C0Z6T LLJILJILJ;

                {
                    super(new C2172771A1r(new C06WA() { // from class: X.0YyT
                    }, 2131831846, R.raw.icon_eye, null, null, true, null, 1976), new AwS99S1000000_14(str, 4), new C1227980i3o(str, j), new AwS628S0100000_14(c0z6t2, 63), null, 48);
                    this.LLJILJILJ = c0z6t2;
                }
            };
        } else {
            c1a23 = null;
        }
        List listLJIIL = C1697810uHb.LJIIL(c1a23);
        IChatDetailActionFactory iChatDetailActionFactoryLIZ3 = C0Z5U.LIZ();
        if (iChatDetailActionFactoryLIZ3 != null && (c893960Z5eLIZ = iChatDetailActionFactoryLIZ3.LIZ(new AwS53S1000000_2(str, 20))) != null) {
            c1a233 = new C1A23(c893960Z5eLIZ) { // from class: X.0Z5X
                public static final /* synthetic */ int LLJILJILJ = 0;

                {
                    super(c893960Z5eLIZ.LLIZ, AFwS201S0000000_14.get$arr$(469), new AwS628S0100000_14(c893960Z5eLIZ, 64), null, null, 56);
                }
            };
        }
        List listLJIIL2 = C1697810uHb.LJIIL(c1a233);
        C1A23[] c1a23Arr = new C1A23[2];
        C0Z2I c0z2i = (C0Z2I) groupDetailFragment.LLIZLLLIL.getValue();
        if (c0z2i != null && (c0z2f = (C0Z2F) groupDetailFragment.LLJ.getValue()) != null) {
            c0z2g = new C0Z2G(str, j, c0z2i, c0z2f);
        } else {
            c0z2g = null;
        }
        c1a23Arr[0] = c0z2g;
        final C0Z2F c0z2f2 = (C0Z2F) groupDetailFragment.LLJ.getValue();
        if (c0z2f2 != null && (c0z6t = (C0Z6T) groupDetailFragment.LLIZ.getValue()) != null) {
            c1a232 = new C1A23(str, c0z2f2, c0z6t) { // from class: X.0Z5Z
                public final C0Z2F LLJILJILJ;
                public final C0Z6T LLJILLL;

                {
                    super(new C2172771A1r(new C06WA() { // from class: X.0Z5a
                    }, 2131835224, R.raw.icon_arrow_to_right, null, null, false, null, 2040), new AwS99S1000000_14(str, 5), new AwS154S1200000_14(str, c0z2f2, c0z6t, 0), null, null, 56);
                    this.LLJILJILJ = c0z2f2;
                    this.LLJILLL = c0z6t;
                }
            };
        } else {
            c1a232 = null;
        }
        c1a23Arr[1] = c1a232;
        List listLJIJI = C13LQ.LJIJI(c1a23Arr);
        listLJIILJJIL2.addAll(listLJIIL);
        listLJIILJJIL2.addAll(listLJIIL2);
        listLJIILJJIL2.addAll(listLJIJI);
        arrayList.add(new C893950Z5d(C0ZBL.VERTICAL_NEW, listLJIILJJIL2));
        c062p2.LIZ = new C0Z5T(arrayList);
        return Unit.LIZ;
    }
}
