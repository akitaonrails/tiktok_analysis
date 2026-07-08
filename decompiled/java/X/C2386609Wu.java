package X;

import Y.ARunnableS104S0100000_4;
import Y.ARunnableS73S0200000_4;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.09Wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2386609Wu extends C09AY implements Function1<Boolean, Boolean> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2386609Wu(Context context, String str, Function0 function0, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
        if (bool.booleanValue()) {
            if (!this.LL) {
                return Boolean.TRUE;
            }
            if (TextUtils.equals("share_to_tt", this.LLILLJJLI)) {
                if (!C0CHQ.LIZ().getAccountService().LIZ()) {
                    C0CHQ.LIZ().getRegionService();
                    if (TextUtils.equals("US", C20186013yc.LIZ())) {
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(this.LLILLL, 137));
                    } else {
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS104S0100000_4(this.LLILLL, 138));
                    }
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("enter_from", "share_to_tt");
                    C20684815ws.LJIILLIIL("show_u13_video_import_error", c0lab.LIZ);
                } else {
                    return Boolean.FALSE;
                }
            } else if (!C0CHQ.LIZ().getAccountService().LIZ()) {
                C0LAB c0lab2 = new C0LAB();
                c0lab2.LJ("enter_from", this.LLILLJJLI);
                C20684815ws.LJIILLIIL("show_u13_video_import_error", c0lab2.LIZ);
                C0CHQ.LIZ().getRegionService();
                if (TextUtils.equals("US", C20186013yc.LIZ())) {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS73S0200000_4(this.LLILLL, this.LLILZ, 47));
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS73S0200000_4(this.LLILLL, this.LLILZ, 48));
                }
            } else {
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}
