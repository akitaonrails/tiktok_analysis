package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.profile.CoHostOperationCell;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0aoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949450aoZ extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ CoHostOperationCell LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C500400Jjq LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949450aoZ(CoHostOperationCell coHostOperationCell, boolean z, View view, int i, C500400Jjq c500400Jjq) {
        super(1);
        this.LL = coHostOperationCell;
        this.LLILLJJLI = z;
        this.LLILLL = view;
        this.LLILZ = i;
        this.LLILZIL = c500400Jjq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        InterfaceC947410alH interfaceC947410alH;
        boolean zBooleanValue = bool.booleanValue();
        CoHostOperationCell coHostOperationCell = this.LL;
        C495980Jci c495980Jci = coHostOperationCell.LL;
        Context context = c495980Jci.LIZ;
        LifecycleOwner lifecycleOwner = c495980Jci.LIZIZ;
        DataChannel dataChannel = coHostOperationCell.LLJJIJIIJIL;
        boolean z = this.LLILLJJLI;
        if (z) {
            interfaceC947410alH = C949440aoY.LIZ;
        } else {
            interfaceC947410alH = C949460aoa.LIZ;
        }
        C947390alF.LIZ(context, lifecycleOwner, dataChannel, interfaceC947410alH, AFwS193S0000000_7.get$arr$(224), new C945830aij(zBooleanValue, coHostOperationCell, z, this.LLILLL, this.LLILZ, this.LLILZIL));
        return Unit.LIZ;
    }
}
