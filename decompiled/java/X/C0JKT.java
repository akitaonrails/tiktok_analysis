package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JKT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JKT implements C0JKM {
    public final Function0<Unit> LL;

    public C0JKT(C512180K6u c512180K6u) {
        this.LL = c512180K6u;
    }

    @Override // X.C0JKM
    public final boolean m3(String str) {
        return Intrinsics.LJFF("/bindemail", str);
    }

    @Override // X.C0JK8
    public final boolean nd(Context context, C2436109gd c2436109gd, Map<String, String> map) {
        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).Rq2(context, new C0JKV(context, this));
        return true;
    }
}
