package X;

import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ivg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1261380ivg extends C2217421BqW implements Function1<Function1<? super InterfaceC1261750iwH, ? extends Unit>, Unit> {
    public C1261380ivg(IUserCardListAbility iUserCardListAbility) {
        super(1, iUserCardListAbility, IUserCardListAbility.class, "notifyListener", "notifyListener(Lkotlin/jvm/functions/Function1;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function1<? super InterfaceC1261750iwH, ? extends Unit> function1) {
        ((IUserCardListAbility) this.receiver).v52(function1);
        return Unit.LIZ;
    }
}
