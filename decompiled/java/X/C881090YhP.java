package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: renamed from: X.0YhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881090YhP implements InterfaceC892690Z0h {
    public final /* synthetic */ InterfaceC878160Ycg LIZ;

    public C881090YhP(C878110Ycb c878110Ycb) {
        this.LIZ = c878110Ycb;
    }

    @Override // X.InterfaceC892690Z0h
    public final void LIZ(C882890YkJ c882890YkJ) {
        String str;
        String message = null;
        if (c882890YkJ.LJ) {
            Object obj = c882890YkJ.LJ().get("data");
            if ((obj instanceof String) && (str = (String) obj) != null && str.length() != 0) {
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    Type type = new AbstractC1905540zge<List<? extends List<? extends Double>>>() { // from class: X.0YhQ
                    }.getType();
                    c1227904rF.getClass();
                    List<? extends List<Double>> list = (List) C1227904rF.LIZJ(str, type);
                    if (list == null) {
                        list = C13BV.INSTANCE;
                    }
                    C880830Ygz.LIZ(EnumC881060YhM.INFERENCE, true, null);
                    this.LIZ.onSuccess(list);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C880830Ygz.LIZ(EnumC881060YhM.INFERENCE, false, e.getMessage());
                    this.LIZ.onFailed();
                    return;
                }
            }
            C880830Ygz.LIZ(EnumC881060YhM.INFERENCE, false, new C892820Z0u("empty inference result", "runtime").getMessage());
            this.LIZ.onFailed();
            return;
        }
        EnumC881060YhM enumC881060YhM = EnumC881060YhM.INFERENCE;
        Throwable th = c882890YkJ.LJFF;
        if (th != null) {
            message = th.getMessage();
        }
        C880830Ygz.LIZ(enumC881060YhM, false, message);
        this.LIZ.onFailed();
    }
}
