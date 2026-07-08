package X;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820750WHp extends C09AY implements Function1<C838040WuA, AdvertisingIdClient.Info> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C820750WHp(Context context) {
        super(1);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AdvertisingIdClient.Info invoke(C838040WuA c838040WuA) {
        Context context = this.LL;
        if (C10EU.LJIILIIL() && C20123813oa.LIZ()) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        return C2204961BRm.LLLLLILLIL(context, new C0WZX("dzBzEgAjS8/YVFkiQFyGdpIIcJC+acxyxgQIiI13W/etPbXL+YCAu/R1zM0JZacYd8ry/2NE2iv2R5ivhg3sJ5UVhds=", null));
    }
}
