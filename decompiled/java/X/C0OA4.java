package X;

import Y.ARunnableS109S0100000_9;
import Y.ARunnableS42S0300000_9;
import com.bytedance.i18n.location.api.LocationData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0OA4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OA4 implements InterfaceC687820QyS {
    public final /* synthetic */ Function0<Unit> LIZ;
    public final /* synthetic */ Function1<LocationData, Unit> LIZIZ;

    @Override // X.InterfaceC687820QyS
    public final void LIZ(LocationData locationData) {
        C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS42S0300000_9(locationData, this.LIZ, this.LIZIZ, 25));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0OA4(Function0<Unit> function0, Function1<? super LocationData, Unit> function1) {
        this.LIZ = function0;
        this.LIZIZ = function1;
    }

    @Override // X.InterfaceC687820QyS
    public final void onError(int i, String str) {
        C786410Ut5.LJJZZIII(C724640Sbe.LIZ(), new ARunnableS109S0100000_9(this.LIZ, 222));
    }
}
