package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ClaCombineSettings;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1Bd8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209121Bd8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PushSettings LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2209121Bd8(PushSettings pushSettings) {
        super(0);
        this.LL = pushSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer num;
        ClaCombineSettings claCombineSettings = this.LL.claCombineSettings;
        int iIntValue = 0;
        if (claCombineSettings != null && (num = claCombineSettings.enableAutoDubbingConsumption) != null) {
            iIntValue = num.intValue();
        }
        C2209051Bd1.LIZ.getClass();
        C2209051Bd1.LJIILIIL(iIntValue);
        return Unit.LIZ;
    }
}
