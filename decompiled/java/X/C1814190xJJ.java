package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.save.SaveAssem;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xJJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1814190xJJ extends C09AY implements Function1<Pair<? extends Object, ? extends Boolean>, Unit> {
    public final /* synthetic */ SaveAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814190xJJ(SaveAssem saveAssem) {
        super(1);
        this.LL = saveAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Object, ? extends Boolean> pair) {
        Pair<? extends Object, ? extends Boolean> pair2 = pair;
        Object first = pair2.getFirst();
        boolean zBooleanValue = pair2.getSecond().booleanValue();
        if (first instanceof C1814370xJb) {
            LiveBoardUpsertViewModel liveBoardUpsertViewModelGo = this.LL.Go();
            C1814370xJb c1814370xJb = (C1814370xJb) first;
            if (zBooleanValue) {
                liveBoardUpsertViewModelGo.setState(new C1814180xJI(c1814370xJb));
            } else {
                liveBoardUpsertViewModelGo.setState(new C1814170xJH());
            }
        }
        return Unit.LIZ;
    }
}
