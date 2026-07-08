package X;

import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0pTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513110pTh extends C09AY implements InterfaceC1631630sYr<C1513130pTj, String, C790220UzE, C1513140pTk, Unit> {
    public final /* synthetic */ C1513100pTg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513110pTh(C1513100pTg c1513100pTg) {
        super(4);
        this.LL = c1513100pTg;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.09AY, kotlin.jvm.functions.Function1] */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(C1513130pTj c1513130pTj, String str, C790220UzE c790220UzE, C1513140pTk c1513140pTk) {
        Object objInvoke;
        C1513130pTj c1513130pTj2 = c1513130pTj;
        C1513140pTk c1513140pTk2 = c1513140pTk;
        C1513100pTg c1513100pTg = this.LL;
        ?? r0 = c1513140pTk2.LIZJ;
        Object objInvoke2 = null;
        if (r0 != 0) {
            objInvoke = r0.invoke(str);
        } else {
            objInvoke = null;
        }
        c1513100pTg.getClass();
        if (objInvoke == null) {
            ?? r02 = c1513140pTk2.LIZLLL;
            if (r02 != 0) {
                objInvoke2 = r02.invoke(str);
            }
        } else {
            objInvoke2 = objInvoke;
        }
        Map<String, Object> map = c1513130pTj2.LIZ;
        if (objInvoke2 != null) {
            map.put(str, objInvoke2);
        }
        return Unit.LIZ;
    }
}
