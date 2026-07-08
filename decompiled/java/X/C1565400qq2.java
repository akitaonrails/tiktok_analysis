package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushColdStartExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565400qq2 extends C09AY implements Function0<Boolean> {
    public C1565400qq2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int iIntValue = ((Number) InnerPushColdStartExp.LIZJ.getValue()).intValue();
        return Boolean.valueOf(1 <= iIntValue && iIntValue < 4);
    }
}
