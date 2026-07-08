package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07iB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1936107iB extends C09AY implements Function2<Unit, Unit, Unit> {
    public C1936107iB() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Unit unit, Unit unit2) {
        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
    }
}
