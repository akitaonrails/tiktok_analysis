package X;

import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0WTY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C0WTY extends C2217421BqW implements Function1<Integer, Unit> {
    public C0WTY(C0WTW c0wtw) {
        super(1, c0wtw, C0WTW.class, "setDefaultMaxPoolSize", "setDefaultMaxPoolSize(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        C0WPA c0wpa;
        int iIntValue = num.intValue();
        ExecutorService executorService = ((C0WTO) C0WTW.LJ.getValue()).LL;
        if ((executorService instanceof C0WPA) && (c0wpa = (C0WPA) executorService) != null) {
            c0wpa.setMaximumPoolSize(iIntValue);
        }
        return Unit.LIZ;
    }
}
