package X;

import Y.ARunnableS102S0100000_2;
import android.os.Looper;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.main.MainRootFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Nk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1597806Nk extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LifecycleOwner LL;
    public final /* synthetic */ Assembler LLILLJJLI;
    public final /* synthetic */ MainActivity LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1597806Nk(MainRootFragment mainRootFragment, Assembler assembler, MainActivity mainActivity) {
        super(0);
        this.LL = mainRootFragment;
        this.LLILLJJLI = assembler;
        this.LLILLL = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LifecycleOwner lifecycleOwner = this.LL;
        C1597906Nl c1597906Nl = new C1597906Nl(lifecycleOwner, this.LLILLJJLI, this.LLILLL);
        if (((Boolean) C1222504qN.LIZIZ.getValue()).booleanValue()) {
            C1222504qN.LIZJ = c1597906Nl;
            AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(lifecycleOwner, 1108);
            if (Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
                awS546S0100000_2.invoke();
            } else {
                C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS102S0100000_2(awS546S0100000_2, 76));
            }
        } else {
            c1597906Nl.invoke();
        }
        return Unit.LIZ;
    }
}
