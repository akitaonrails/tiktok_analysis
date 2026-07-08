package X;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fzh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1148550fzh implements InterfaceC2787016b {
    @Override // X.InterfaceC2787016b
    public String LIZIZ() {
        return "global_live_basic_native";
    }

    public abstract Float LIZJ();

    @Override // X.InterfaceC2787016b
    public boolean isEnable() {
        return true;
    }

    @Override // X.InterfaceC2787016b
    public final boolean LIZ(String str) {
        return Intrinsics.LJFF(str.toLowerCase(Locale.ROOT), "number");
    }
}
