package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1653370t7v {
    public final Function0<Boolean> LIZ;
    public Pair<? extends EnumC1653380t7w, ? extends C0P0T> LIZIZ;

    public C1653370t7v(AwS569S0100000_25 awS569S0100000_25) {
        this.LIZ = awS569S0100000_25;
    }

    public final boolean LIZ(EnumC1653380t7w enumC1653380t7w) {
        if (enumC1653380t7w != EnumC1653380t7w.LIVE && !this.LIZ.invoke().booleanValue()) {
            return false;
        }
        Pair<? extends EnumC1653380t7w, ? extends C0P0T> pair = this.LIZIZ;
        if (pair != null && enumC1653380t7w.getPriority() >= pair.getFirst().getPriority()) {
            return false;
        }
        return true;
    }
}
