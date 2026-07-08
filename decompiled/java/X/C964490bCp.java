package X;

import com.bytedance.android.live.ai.api.pitaya.LivePitayaEnv;
import com.bytedance.pitaya.api.bean.PTYError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bCp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964490bCp extends C09AY implements Function2<Integer, PTYError, Unit> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964490bCp(int i) {
        super(2);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, PTYError pTYError) {
        num.intValue();
        LivePitayaEnv.LJIIL().restart(this.LL);
        return Unit.LIZ;
    }
}
