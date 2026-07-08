package X;

import X.AbstractC704860Rkq;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wzm.b;

/* JADX INFO: renamed from: X.0Rl2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC704980Rl2<T extends AbstractC704860Rkq<?>, ELEMENT extends b> extends AbstractC705030Rl7<T> {
    public final InterfaceC705020Rl6 LJIILJJIL;
    public final Function0<Unit> LJIILL;

    @Override // X.AbstractC705030Rl7
    public final void LJIIZILJ(T t, Function0<Unit> function0) {
        InterfaceC705020Rl6 interfaceC705020Rl6 = this.LJIILJJIL;
        if (interfaceC705020Rl6 != null) {
            interfaceC705020Rl6.LIZ();
        }
    }

    public AbstractC704980Rl2(Context context, String str, String str2, String str3, C704840Rko c704840Rko, InterfaceC705020Rl6 interfaceC705020Rl6, Function0<Unit> function0) {
        super(context, str, str2, str3, null, null, c704840Rko);
        this.LJIILJJIL = interfaceC705020Rl6;
        this.LJIILL = function0;
    }
}
