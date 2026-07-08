package X;

import com.ss.android.ugc.aweme.net.mutli.network.SpeedModeServiceImpl;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0oOP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1471390oOP extends C09AY implements Function0<C1471350oOL> {
    public final /* synthetic */ SpeedModeServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1471390oOP(SpeedModeServiceImpl speedModeServiceImpl) {
        super(0);
        this.LL = speedModeServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1471350oOL invoke() {
        C1471350oOL c1471350oOL = C1471340oOK.LIZ;
        ((CopyOnWriteArrayList) c1471350oOL.LIZJ).add(this.LL.LJIIIZ.getValue());
        return c1471350oOL;
    }
}
