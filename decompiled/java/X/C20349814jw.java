package X;

import com.bytedance.android.livesdk.comp.impl.subscription.playcondition.BoardsFinishedCondition;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14jw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20349814jw extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ BoardsFinishedCondition LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20349814jw(BoardsFinishedCondition boardsFinishedCondition) {
        super(1);
        this.LL = boardsFinishedCondition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.LL.LJIIIZ("observe");
            InterfaceC946300ajU interfaceC946300ajU = this.LL.LJ;
            if (interfaceC946300ajU != null) {
                interfaceC946300ajU.LIZ(true, false);
            }
        }
        return Unit.LIZ;
    }
}
