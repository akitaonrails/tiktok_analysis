package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752500TfU extends C09AY implements Function1<Pair<? extends Long, ? extends Boolean>, Unit> {
    public final /* synthetic */ Long LL;
    public final /* synthetic */ IIconSlot.SlotViewModel LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752500TfU(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel, Long l) {
        super(1);
        this.LL = l;
        this.LLILLJJLI = slotViewModel;
        this.LLILLL = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Long, ? extends Boolean> pair) {
        Pair<? extends Long, ? extends Boolean> pair2 = pair;
        if (Intrinsics.LJFF(pair2.getFirst(), this.LL) && pair2.getSecond().booleanValue() && C1083940eJU.LIZIZ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class))) {
            this.LLILLJJLI.vQ2(this.LLILLL);
        }
        return Unit.LIZ;
    }
}
