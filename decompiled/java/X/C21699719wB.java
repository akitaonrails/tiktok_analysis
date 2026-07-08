package X;

import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.ability.FriendsV3FeedListAbility;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19wB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21699719wB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ FriendsV3PlayerManagerComponent LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0NCM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21699719wB(FriendsV3PlayerManagerComponent friendsV3PlayerManagerComponent, String str, C0NCM c0ncm) {
        super(0);
        this.LL = friendsV3PlayerManagerComponent;
        this.LLILLJJLI = str;
        this.LLILLL = c0ncm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1588310rQz interfaceC1588310rQzFL;
        FriendsV3FeedListAbility friendsV3FeedListAbilityKo = this.LL.ko();
        if (friendsV3FeedListAbilityKo != null && (interfaceC1588310rQzFL = friendsV3FeedListAbilityKo.fL(this.LLILLJJLI)) != null) {
            this.LL.bo(interfaceC1588310rQzFL, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
