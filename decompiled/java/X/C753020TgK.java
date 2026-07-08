package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TgK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753020TgK extends C750630TcT {
    public final C753010TgJ LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 796);
    }

    public C753020TgK(C753010TgJ c753010TgJ) {
        super(c753010TgJ);
        this.LLILZIL = c753010TgJ;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        if (enumC755280Tjy != EnumC755280Tjy.ANCHOR && (this.LLILZIL.LJIIJ instanceof C1110490f0J)) {
            return true;
        }
        return false;
    }
}
