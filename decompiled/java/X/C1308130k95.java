package X;

import com.bytedance.android.starship.StarshipBridge;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0k95, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308130k95 extends C09AY implements Function2<String, String, Unit> {
    public C1308130k95() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String str, String str2) {
        StarshipBridge.Companion.onStrategyConfigUpdate(str, str2);
        return Unit.LIZ;
    }
}
