package X;

import com.ss.android.ugc.feed.platform.cell.clean.CellCleanComponent;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733680SqE extends C09AY implements Function0<Float> {
    public final /* synthetic */ CellCleanComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C733680SqE(CellCleanComponent cellCleanComponent) {
        super(0);
        this.LL = cellCleanComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        IPlayButtonAbility iPlayButtonAbility = (IPlayButtonAbility) this.LL.LLJJL.getValue();
        return Float.valueOf(iPlayButtonAbility != null ? iPlayButtonAbility.Fb0() : 1.0f);
    }
}
