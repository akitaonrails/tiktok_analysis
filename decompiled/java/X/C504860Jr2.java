package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Jr2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504860Jr2 extends C09AY implements Function2<UIAssem, C291001Au<? extends C504910Jr7>, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504860Jr2(SubSpaceDetailListAssem subSpaceDetailListAssem) {
        super(2);
        this.LL = subSpaceDetailListAssem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends C504910Jr7> c291001Au) {
        C504910Jr7 c504910Jr7;
        FragmentManager childFragmentManager;
        String secUid;
        User user;
        UIAssem uIAssem2 = uIAssem;
        C291001Au<? extends C504910Jr7> c291001Au2 = c291001Au;
        if (c291001Au2 != null && (c504910Jr7 = (C504910Jr7) c291001Au2.LIZ) != null) {
            SubSpaceDetailListAssem subSpaceDetailListAssem = this.LL;
            Fragment fragmentLJI = C724240Sb0.LJI(uIAssem2);
            if (fragmentLJI != null && (childFragmentManager = fragmentLJI.getChildFragmentManager()) != null) {
                User user2 = c504910Jr7.LIZ.userInfo;
                String secUid2 = null;
                if (user2 != null) {
                    secUid = user2.getSecUid();
                } else {
                    secUid = null;
                }
                C504880Jr4 c504880Jr4Ip = subSpaceDetailListAssem.ip();
                if (c504880Jr4Ip != null && (user = c504880Jr4Ip.LLJ) != null) {
                    secUid2 = user.getSecUid();
                }
                if (Intrinsics.LJFF(secUid, secUid2)) {
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZIZ(2131841277);
                    c1247510iZJ.LIZ(new C507410Jv9(subSpaceDetailListAssem, c504910Jr7));
                    C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                    c1247510iZJ2.LIZIZ(2131844293);
                    c1247510iZJ2.LIZ(new C504830Jqz(subSpaceDetailListAssem, c504910Jr7));
                    c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
                    c1390850mIV.LIZLLL(2131844292);
                    c1390850mIV.LIZJ().show(childFragmentManager, "sub_space_comment_more");
                } else {
                    C1390850mIV c1390850mIV2 = new C1390850mIV();
                    C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
                    c1247510iZJ3.LIZIZ(2131853492);
                    c1247510iZJ3.LIZ(new C504870Jr3(subSpaceDetailListAssem, c504910Jr7));
                    c1390850mIV2.LIZIZ(c1247510iZJ3);
                    c1390850mIV2.LIZLLL(2131844292);
                    c1390850mIV2.LIZJ().show(childFragmentManager, "sub_space_comment_more");
                }
            }
        }
        return Unit.LIZ;
    }
}
