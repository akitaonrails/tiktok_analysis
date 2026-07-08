package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01KY, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01KY extends C09AY implements Function1<RoomCreateInfo, Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01KY(LifecycleOwner lifecycleOwner, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1, Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function12) {
        super(1);
        this.LL = lifecycleOwner;
        this.LLILLJJLI = function1;
        this.LLILLL = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(RoomCreateInfo roomCreateInfo) {
        if (roomCreateInfo.LIZIZ()) {
            C500260Jjc.LJJJJJ(this.LL, null, new C01KW(this.LLILLJJLI, null), 3);
        } else {
            C500260Jjc.LJJJJJ(this.LL, null, new C01KX(this.LLILLL, null), 3);
        }
        return Unit.LIZ;
    }
}
