package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00S5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00S5 extends C09AY implements Function0<String> {
    public final /* synthetic */ LifecycleOwner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00S5(LifecycleOwner lifecycleOwner) {
        super(0);
        this.LL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Ability is Empty for ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", have you add @AbilityDefine for it?");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
