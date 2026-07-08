package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078460eAe implements InterfaceC1078490eAh {
    public boolean LIZ;
    public final /* synthetic */ Function1<Object, Unit> LIZIZ;
    public final /* synthetic */ C1077990e9t LIZJ;
    public final /* synthetic */ int LIZLLL = R.id.m21;
    public final /* synthetic */ Class<Object> LJ;

    @Override // X.InterfaceC1078490eAh
    public final /* synthetic */ void LIZ(Object... objArr) {
    }

    @Override // X.InterfaceC1078490eAh
    public final void invoke(Object obj) {
        if (!this.LIZ) {
            this.LIZ = true;
            this.LIZIZ.invoke(this.LIZJ.LIZ.load(this.LIZLLL, this.LJ, false, new C1078480eAg[]{new C1078480eAg(obj)}));
        }
    }

    public C1078460eAe(Function1 function1, C1077990e9t c1077990e9t, Class cls) {
        this.LIZIZ = function1;
        this.LIZJ = c1077990e9t;
        this.LJ = cls;
    }
}
