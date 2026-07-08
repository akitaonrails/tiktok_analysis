package X;

import android.os.Handler;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nRX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434890nRX extends AbstractC1434490nQt {
    public final Function0<Boolean> LLILZLL;
    public C1431070nLN LLIZ;

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.PATIENCE_MANAGER;
    }

    public C1434890nRX(AwS566S0100000_22 awS566S0100000_22) {
        this.LLILZLL = awS566S0100000_22;
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            Object obj = null;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C1434960nRe) {
                if (next != null) {
                    if (((C1434960nRe) next).LIZ.getTtStoryUploadModel() != null) {
                        c1431070nLN.LJ(null, true);
                        return;
                    }
                    this.LLIZ = c1431070nLN;
                    for (Object obj2 : c1404610meh.LIZ) {
                        if (obj2 == null || (obj2 instanceof C1440610nal)) {
                            obj = obj2;
                            break;
                        }
                    }
                    C1440610nal c1440610nal = (C1440610nal) obj;
                    if (c1440610nal != null) {
                        AwS566S0100000_22 awS566S0100000_22 = new AwS566S0100000_22(this, 974);
                        AwS566S0100000_22 awS566S0100000_222 = new AwS566S0100000_22(this, 975);
                        if (!c1440610nal.LJ) {
                            c1440610nal.LJ = true;
                            c1440610nal.LIZLLL = awS566S0100000_22;
                            c1440610nal.LIZJ = awS566S0100000_222;
                            C786410Ut5.LJLILLLLZI((Handler) c1440610nal.LJII.getValue(), 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
