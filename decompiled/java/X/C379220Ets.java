package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ets, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379220Ets {
    public static final C379170Etn LIZ(String str) {
        EnumC379190Etp enumC379190Etp;
        EnumC379190Etp.Companion.getClass();
        if (C2471909mP.LJJIII(str, false, 6)) {
            enumC379190Etp = EnumC379190Etp.IMAGE;
        } else if (!C2471909mP.LJJIIZI(str) && !a0.LJJIJ(a0.LJJLJ('/', str, str), '.') && C2471909mP.LJJIII(str, true, 4)) {
            enumC379190Etp = EnumC379190Etp.IMAGE;
        } else {
            enumC379190Etp = EnumC379190Etp.VIDEO;
        }
        return new C379170Etn(str, enumC379190Etp, null);
    }
}
