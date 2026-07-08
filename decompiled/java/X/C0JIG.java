package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JIG, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JIG(Context context, String str, String str2, String str3) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Bundle bundle = new Bundle();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
        bundle.putLong("anchor_id", lLJIILIIL != null ? lLJIILIIL.longValue() : -1L);
        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str2);
        bundle.putLong("course_id", lLJIILIIL2 != null ? lLJIILIIL2.longValue() : -1L);
        C786410Ut5.LJJJI("show_entrance", str3, bundle);
        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).u60(this.LL, bundle);
        return Unit.LIZ;
    }
}
