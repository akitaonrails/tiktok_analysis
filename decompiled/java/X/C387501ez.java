package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C387501ez extends C09AY implements Function2<Integer, LiveEffect, Unit> {
    public C387501ez() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, LiveEffect liveEffect) {
        int iIntValue = num.intValue();
        LiveEffect liveEffect2 = liveEffect;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            String name = null;
            if (iIntValue != -1) {
                if (iIntValue == 1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("FetchAndDownload ");
                    if (liveEffect2 != null) {
                        name = liveEffect2.getName();
                    }
                    sbLIZ.append(name);
                    sbLIZ.append(" Suc");
                    C20441214yg.LIZIZ("SubQueueHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
            } else {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("FetchAndDownload ");
                if (liveEffect2 != null) {
                    name = liveEffect2.getName();
                }
                sbLIZ2.append(name);
                sbLIZ2.append(" Fail");
                C20441214yg.LIZIZ("SubQueueHelper", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return Unit.LIZ;
    }
}
