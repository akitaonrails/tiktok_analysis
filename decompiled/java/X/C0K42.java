package X;

import android.graphics.drawable.Animatable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.AwS621S0100000_7;
import kotlin.jvm.internal.AwS656S0100000_7;

/* JADX INFO: renamed from: X.0K42, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K42 implements InterfaceC511480K4c {
    public final /* synthetic */ Function0<Unit> LIZ;
    public final /* synthetic */ InterfaceC1631620sYq<String, Integer, Integer, Unit> LIZIZ;
    public final /* synthetic */ Function2<String, Exception, Unit> LIZJ;
    public final /* synthetic */ Function1<Animatable, Unit> LIZLLL;

    @Override // X.InterfaceC1142670fqD
    public final void LIZ() {
        this.LIZ.invoke();
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZIZ(Animatable animatable) {
        this.LIZLLL.invoke(animatable);
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZLLL(String str, Exception exc) {
        this.LIZJ.invoke(str, exc);
    }

    @Override // X.InterfaceC1142670fqD
    public final void LIZJ(int i, int i2, String str) {
        this.LIZIZ.invoke(str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public C0K42(AwS551S0100000_7 awS551S0100000_7, AwS656S0100000_7 awS656S0100000_7, AwS621S0100000_7 awS621S0100000_7, AwS586S0100000_7 awS586S0100000_7) {
        this.LIZ = awS551S0100000_7;
        this.LIZIZ = awS656S0100000_7;
        this.LIZJ = awS621S0100000_7;
        this.LIZLLL = awS586S0100000_7;
    }
}
