package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.vip.SubOnlyLiveVipSettingSheet;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JAz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487790JAz extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlyLiveVipSettingSheet LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C487790JAz(SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet) {
        super(1);
        this.LL = subOnlyLiveVipSettingSheet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubOnlyLiveVipSettingSheet subOnlyLiveVipSettingSheet = this.LL;
        assembler.DQ2(subOnlyLiveVipSettingSheet, new C491680JPy(subOnlyLiveVipSettingSheet));
        return Unit.LIZ;
    }
}
