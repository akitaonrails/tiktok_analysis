package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Wu8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838020Wu8 extends C09AY implements Function1<C838310Wub, C838040WuA> {
    public final /* synthetic */ InterfaceC838140WuK LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C838020Wu8(InterfaceC838140WuK interfaceC838140WuK, C825940Wae c825940Wae) {
        super(1);
        this.LL = interfaceC838140WuK;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C838040WuA invoke(C838310Wub c838310Wub) throws C838130WuJ {
        Map<String, Object> map;
        C838310Wub c838310Wub2 = c838310Wub;
        C838040WuA c838040WuACheck = this.LL.check();
        Object obj = ((LinkedHashMap) c838040WuACheck.LIZLLL).get("extraInfo");
        if (C19719512Dh.LJII(obj)) {
            map = (Map) obj;
        } else {
            map = null;
        }
        c838310Wub2.LJII = map;
        if (c838040WuACheck.LIZ != 0) {
            int i = C838060WuC.LIZ[EnumC838070WuD.WARNING.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw new C838130WuJ(c838040WuACheck.LIZ, c838040WuACheck.LIZIZ);
                    }
                } else {
                    c838310Wub2.LJFF = EnumC838050WuB.WARN;
                    c838310Wub2.LJI = new Throwable();
                }
            } else {
                c838310Wub2.LJFF = EnumC838050WuB.INFO;
                c838040WuACheck.LIZ = 0;
                c838040WuACheck.LIZIZ = "";
            }
        }
        c838310Wub2.LIZJ = c838040WuACheck.LIZ;
        c838310Wub2.LIZLLL = c838040WuACheck.LIZIZ;
        return c838040WuACheck;
    }
}
