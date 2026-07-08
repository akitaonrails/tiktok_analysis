package X;

import com.ss.android.ugc.aweme.hometab.base.BottomTabNode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rKQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1584240rKQ extends C09AY implements Function0<C1593020rYa> {
    public final /* synthetic */ BottomTabNode LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584240rKQ(BottomTabNode bottomTabNode) {
        super(0);
        this.LL = bottomTabNode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1593020rYa invoke() {
        C1592290rXP c1592290rXPLIZJ = this.LL.LLJ.LIZJ();
        BottomTabNode bottomTabNode = this.LL;
        return new C1593020rYa(bottomTabNode.LLIZLLLIL, bottomTabNode.tag(), this.LL.LIZLLL(), c1592290rXPLIZJ);
    }
}
