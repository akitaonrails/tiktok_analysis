package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06Xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1624106Xn extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1624106Xn(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(1);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1624206Xo());
        return Unit.LIZ;
    }
}
