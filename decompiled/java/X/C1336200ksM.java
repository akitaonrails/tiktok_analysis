package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ksM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1336200ksM extends C09AY implements Function0<Boolean> {
    public C1336200ksM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = C1336210ksN.LIZLLL() == EnumC1335310kqv.EXTREME_LOW || C1336210ksN.LJ;
        C844470XAv.LIZ.getClass();
        return Boolean.valueOf((Intrinsics.LJFF(C844470XAv.LJIILL, "local_test") && Keva.getRepo("storage_info_debug").getBoolean("extreme_low_state", false)) ? true : z);
    }
}
