package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311400CIo extends C09AY implements Function0<C311390CIn> {
    public C311400CIo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C311390CIn invoke() {
        EnumC311370CIl enumC311370CIl;
        if (!((Boolean) C311420CIq.LJ.getValue()).booleanValue()) {
            return null;
        }
        int iIntValue = ((Number) C311420CIq.LIZLLL.getValue()).intValue();
        if (iIntValue == 1) {
            enumC311370CIl = EnumC311370CIl.ALL_EVENT;
        } else {
            if (iIntValue != 2) {
                return null;
            }
            enumC311370CIl = EnumC311370CIl.OMIT_ON_DESTROY;
        }
        if (enumC311370CIl != null) {
            return new C311390CIn(enumC311370CIl);
        }
        return null;
    }
}
