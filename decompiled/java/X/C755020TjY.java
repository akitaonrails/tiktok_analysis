package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0TjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C755020TjY extends C750630TcT {
    public final C755030TjZ LLILZIL;

    @Override // X.AbstractC752950TgD
    public final Function0<Unit> LJFF() {
        return new AwS556S0100000_12(this, 795);
    }

    public C755020TjY(C755030TjZ c755030TjZ) {
        super(c755030TjZ);
        this.LLILZIL = c755030TjZ;
    }

    @Override // X.AbstractC752950TgD
    public final boolean LJ(EnumC755280Tjy enumC755280Tjy) {
        boolean z;
        C755030TjZ c755030TjZ = this.LLILZIL;
        if ((c755030TjZ.LJIILIIL instanceof C1110490f0J) && enumC755280Tjy == EnumC755280Tjy.VIEWER) {
            z = true;
        } else {
            z = false;
        }
        Boolean bool = c755030TjZ.LJIIL;
        if (bool != null && bool.booleanValue() && !z) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC752950TgD
    public final void LIZIZ(C755180Tjo c755180Tjo, Context context) {
        this.LLILLJJLI = c755180Tjo;
        this.LL = context;
        if (c755180Tjo != null) {
            c755180Tjo.LJI(this.LLILZIL.LJIIJ);
        }
    }
}
