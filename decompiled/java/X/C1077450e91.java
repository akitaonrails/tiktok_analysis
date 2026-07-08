package X;

import Y.ARunnableS49S0300000_16;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friendstab.helper.FriendsEmptyPageSharePackage;
import com.ss.android.ugc.aweme.friendstab.ui.FriendsFeedEmptyPageCell;
import com.ss.android.ugc.aweme.setting.serverpush.api.SocialRelationDataCheckResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0e91, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077450e91 implements InterfaceC2385309Wh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7 c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C1077450e91 c1077450e91, C15O7 c15o7) {
        Boolean boolValueOf;
        C1C7U.LIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatus$1");
        if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((BaseResponse) c15o7.LJIIL()).message, true)) {
            if (((SocialRelationDataCheckResponse) c15o7.LJIIL()).getHasRemainingData()) {
                if (C1070510dxp.LIZ()) {
                    ((Function1) c1077450e91.l1).invoke(1);
                    C1070520dxq.LJIIJJI = false;
                    ((Function1) c1077450e91.l0).invoke(Boolean.FALSE);
                } else {
                    ((Function1) c1077450e91.l1).invoke(0);
                    C1070520dxq.LJIIJJI = true;
                    ((Function1) c1077450e91.l0).invoke(Boolean.TRUE);
                }
                boolValueOf = Boolean.FALSE;
            } else {
                C11JF c11jf = C1070520dxq.LJIIL;
                if (c11jf != null) {
                    c11jf.dispose();
                }
                C1070520dxq.LJIIJJI = false;
                ((Function1) c1077450e91.l0).invoke(Boolean.FALSE);
                boolean zLIZ = C1070510dxp.LIZ();
                Keva.getRepo("facebook_sync_repo").storeBoolean("facebook_sync_is_removing", false);
                ((Function1) c1077450e91.l1).invoke(0);
                boolValueOf = Boolean.valueOf(zLIZ);
            }
        } else {
            C1070520dxq.LJIIJJI = true;
            ((Function1) c1077450e91.l0).invoke(Boolean.TRUE);
            boolValueOf = Boolean.FALSE;
        }
        C1C7U.LIZIZ("FindCtxSettingManager@b41b.checkFBFriendsRemoveStatus$1");
        return boolValueOf;
    }

    public static final Object then$1(C1077450e91 c1077450e91, C15O7 c15o7) {
        C1C7U.LIZ("FriendsFeedEmptyPageCell@fd38.initShareChannel$1$2");
        if (!c15o7.LJIILL() || !c15o7.LJIILIIL()) {
            C2487409ou.LIZJ(new ARunnableS49S0300000_16((FriendsFeedEmptyPageCell) c1077450e91.l0, c15o7, (FriendsEmptyPageSharePackage) c1077450e91.l1, 20));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FriendsFeedEmptyPageCell@fd38.initShareChannel$1$2");
        return unit;
    }

    public C1077450e91(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
