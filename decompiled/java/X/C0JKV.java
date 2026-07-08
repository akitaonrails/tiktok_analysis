package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JKV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKV extends C09AY implements Function1 {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C0JKT LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JKV(Context context, C0JKT c0jkt) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = c0jkt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        if (Intrinsics.LJFF(obj, 1)) {
            ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Ia2(this.LL);
        }
        this.LLILLJJLI.LL.invoke();
        return null;
    }
}
