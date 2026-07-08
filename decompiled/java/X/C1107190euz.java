package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0euz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1107190euz extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ IIconSlot.SlotViewModel LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1107190euz(LifecycleOwner lifecycleOwner, IIconSlot.SlotViewModel slotViewModel) {
        super(1);
        this.LL = slotViewModel;
        this.LLILLJJLI = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue() && C1083940eJU.LIZIZ((Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class))) {
            this.LL.vQ2(this.LLILLJJLI);
        }
        return Unit.LIZ;
    }
}
