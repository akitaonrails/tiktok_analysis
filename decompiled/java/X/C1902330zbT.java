package X;

import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0zbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902330zbT extends C09AY implements Function2<View, AccessibilityNodeInfoCompat, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1902330zbT(String str) {
        super(2);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.setContentDescription(this.LL);
        return Unit.LIZ;
    }
}
