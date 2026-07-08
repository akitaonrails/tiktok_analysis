package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.04d5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1140104d5 extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140104d5(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(1);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.RQ2(this.LL, new C1140004d4());
        return Unit.LIZ;
    }
}
