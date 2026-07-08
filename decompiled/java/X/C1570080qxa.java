package X;

import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.TopTabProtocol;
import com.ss.android.ugc.aweme.friendstab.tab.FriendTopTabProtocol;

/* JADX INFO: renamed from: X.0qxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1570080qxa extends AbstractC1585770rMt {
    @Override // X.AbstractC1585770rMt
    public final BottomTabProtocol LIZ() {
        return ((Boolean) C319860CgK.LIZJ.getValue()).booleanValue() ? C1599640rjG.LIZIZ.Xu() : C1595430rcT.LIZIZ.LIZJ().getFriendsTabProtocol();
    }

    @Override // X.AbstractC1585770rMt
    public final TopTabProtocol LIZLLL() {
        return new FriendTopTabProtocol();
    }

    @Override // X.AbstractC1585770rMt
    public final EnumC1584360rKc LIZIZ() {
        return EnumC1584360rKc.FRIENDS;
    }
}
