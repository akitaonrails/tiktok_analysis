package X;

import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.fastfiltercomment.FastCommunityFlaggedController$selectCommunityFlagged$1", f = "FastCommunityFlaggedController.kt", l = {27}, m = "invokeSuspend")
public final class C328440CuA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C328450CuB LLILLJJLI;
    public final /* synthetic */ HashMap<Integer, Boolean> LLILLL;
    public final /* synthetic */ Observer<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328440CuA(C328450CuB c328450CuB, HashMap<Integer, Boolean> map, Observer<Unit> observer, InterfaceC1364105Vn<? super C328440CuA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c328450CuB;
        this.LLILLL = map;
        this.LLILZ = observer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C328440CuA(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FastCommunityFlaggedController@6c40.selectCommunityFlagged$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C328450CuB c328450CuB = this.LLILLJJLI;
                HashMap<Integer, Boolean> map = this.LLILLL;
                DataChannel dataChannel = c328450CuB.LIZJ;
                this.LL = 1;
                if (c328450CuB.LIZJ(map, dataChannel, this) == objLJFF) {
                    C1C7U.LIZIZ("FastCommunityFlaggedController@6c40.selectCommunityFlagged$1");
                    return objLJFF;
                }
            }
            Observer<Unit> observer = this.LLILZ;
            if (observer != null) {
                observer.onChanged(Unit.LIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FastCommunityFlaggedController@6c40.selectCommunityFlagged$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
