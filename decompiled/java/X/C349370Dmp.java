package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C349370Dmp extends C09AY implements Function1<C348100Dkm, Unit> {
    public final /* synthetic */ AbstractC1452680nuE LL;
    public final /* synthetic */ double LLILLJJLI;
    public final /* synthetic */ double LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C349370Dmp(AbstractC1452680nuE abstractC1452680nuE, double d, double d2) {
        super(1);
        this.LL = abstractC1452680nuE;
        this.LLILLJJLI = d;
        this.LLILLL = d2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C348100Dkm c348100Dkm) {
        NLETrack next;
        String uuid;
        C348100Dkm c348100Dkm2 = c348100Dkm;
        Iterator<NLETrack> it2 = c348100Dkm2.LIZ.getModel().getTracks().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF("BGM", C348350DlB.LIZ(next))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null && (uuid = nLETrack.getUUID()) != null) {
            AbstractC1452680nuE.LIZIZ(uuid, this.LL.LJIIL.LIZLLL, this.LLILLJJLI, this.LLILLL, c348100Dkm2);
        }
        return Unit.LIZ;
    }
}
