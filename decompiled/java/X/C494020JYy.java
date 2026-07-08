package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subonlylive.setting.SubOnlyLiveSettingDialogNew;
import com.bytedance.assem.arch.core.Assembler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494020JYy extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ SubOnlyLiveSettingDialogNew LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C494020JYy(SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew) {
        super(1);
        this.LL = subOnlyLiveSettingDialogNew;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        SubOnlyLiveSettingDialogNew subOnlyLiveSettingDialogNew = this.LL;
        assembler.DQ2(subOnlyLiveSettingDialogNew, new C494030JYz(subOnlyLiveSettingDialogNew));
        return Unit.LIZ;
    }
}
