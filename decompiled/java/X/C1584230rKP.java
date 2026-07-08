package X;

import com.ss.android.ugc.aweme.hometab.base.BottomTabNodeGroup;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584230rKP extends C09AY implements Function0<C1593020rYa> {
    public final /* synthetic */ BottomTabNodeGroup LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584230rKP(BottomTabNodeGroup bottomTabNodeGroup) {
        super(0);
        this.LL = bottomTabNodeGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1593020rYa invoke() {
        C1592290rXP c1592290rXPLIZJ = this.LL.LLJILLL.LIZJ();
        BottomTabNodeGroup bottomTabNodeGroup = this.LL;
        return new C1593020rYa(bottomTabNodeGroup.LLJILJILJ, bottomTabNodeGroup.tag(), this.LL.LIZLLL(), c1592290rXPLIZJ);
    }
}
