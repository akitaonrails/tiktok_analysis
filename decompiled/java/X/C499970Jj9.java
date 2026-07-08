package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Jj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499970Jj9 extends C09AY implements InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> {
    public final /* synthetic */ InterfaceC499980JjA LL;
    public final /* synthetic */ C20484615Do LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499970Jj9(InterfaceC499980JjA interfaceC499980JjA, C20484615Do c20484615Do, DataChannel dataChannel) {
        super(3);
        this.LL = interfaceC499980JjA;
        this.LLILLJJLI = c20484615Do;
        this.LLILLL = dataChannel;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Fragment fragment, LifecycleOwner lifecycleOwner, C499640Jic c499640Jic) {
        C499640Jic c499640Jic2 = c499640Jic;
        InterfaceC499980JjA interfaceC499980JjA = this.LL;
        if (interfaceC499980JjA != null) {
            interfaceC499980JjA.cW1(c499640Jic2.LIZ, c499640Jic2.LIZLLL, c499640Jic2.LJI, null, null, this.LLILLJJLI, this.LLILLL);
        }
        return Unit.LIZ;
    }
}
