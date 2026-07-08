package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.PlayerPreloadDataComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0quf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568270quf extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ PlayerPreloadDataComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1568270quf(PlayerPreloadDataComponent playerPreloadDataComponent) {
        super(1);
        this.LL = playerPreloadDataComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String strXy2;
        IPlayerComponentAbility iPlayerComponentAbility;
        String str2 = str;
        PlayerPreloadDataComponent playerPreloadDataComponent = this.LL;
        if (C1389300mG0.LJIL(playerPreloadDataComponent.getPanelContext()) && str2 != null) {
            IFeedPanelPlatformAbility iFeedPanelPlatformAbilityBo = playerPreloadDataComponent.bo();
            if (iFeedPanelPlatformAbilityBo != null) {
                strXy2 = iFeedPanelPlatformAbilityBo.xy2();
            } else {
                strXy2 = null;
            }
            if (Intrinsics.LJFF(strXy2, str2)) {
                boolean z = PlayerPreloadDataComponent.LLILZLL;
                if (C0NFO.LIZ(str2)) {
                    IRootAbility iRootAbility = (IRootAbility) playerPreloadDataComponent.LLILLJJLI.getValue();
                    if (iRootAbility != null && iRootAbility.nG0() && (iPlayerComponentAbility = (IPlayerComponentAbility) playerPreloadDataComponent.LLILLL.getValue()) != null) {
                        iPlayerComponentAbility.hs();
                    }
                    C1568280qug.LIZ.getClass();
                    if (!C1568280qug.LIZJ) {
                        C1568280qug.LIZJ = true;
                        if (C1568280qug.LIZIZ) {
                            C1568280qug.LIZ();
                        }
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
