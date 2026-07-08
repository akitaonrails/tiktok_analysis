package X;

import com.ss.android.ugc.aweme.experiment.LogInterceptImpl;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04Zd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1118704Zd extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ LogInterceptImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118704Zd(LogInterceptImpl logInterceptImpl) {
        super(0);
        this.LL = logInterceptImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Iterator<C1488205s8> it2 = this.LL.LIZ.iterator();
        while (it2.hasNext()) {
            if (((Boolean) it2.next().LIZIZ.getValue()).booleanValue()) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}
