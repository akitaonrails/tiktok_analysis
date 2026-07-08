package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0SLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C719910SLt extends C2217421BqW implements Function2<Integer, Boolean, Unit> {
    public C719910SLt(Object obj) {
        super(2, obj, C719880SLq.class, "onDynamicStickerLayoutChanged", "onDynamicStickerLayoutChanged(IZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, Boolean bool) {
        int iIntValue = num.intValue();
        boolean zBooleanValue = bool.booleanValue();
        C719880SLq c719880SLq = (C719880SLq) this.receiver;
        if (c719880SLq.LJJJIL() && zBooleanValue) {
            Map<Integer, C719970SLz> map = c719880SLq.LLJJJJLIIL.LIZJ;
            Integer numValueOf = Integer.valueOf(iIntValue);
            C719970SLz c719970SLz = map.get(numValueOf);
            if (c719970SLz == null) {
                c719970SLz = new C719970SLz(0);
                map.put(numValueOf, c719970SLz);
            }
            c719970SLz.LIZ = true;
            c719880SLq.LJJL(iIntValue);
        }
        return Unit.LIZ;
    }
}
