package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0alC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947360alC extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ LifecycleOwner LLILLJJLI;
    public final /* synthetic */ DataChannel LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ List<InterfaceC947380alE> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C947360alC(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Function0<Unit> function0, Function0<Unit> function02, List<? extends InterfaceC947380alE> list, int i) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = dataChannel;
        this.LLILZ = function0;
        this.LLILZIL = function02;
        this.LLILZLL = list;
        this.LLIZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C947390alF.LIZJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ + 1);
        } else {
            this.LLILZIL.invoke();
        }
        return Unit.LIZ;
    }
}
