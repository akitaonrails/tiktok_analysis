package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20292214ae extends C09AY implements Function0<Unit> {
    public final /* synthetic */ List<String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20292214ae(List<String> list) {
        super(0);
        this.LL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<String> list = this.LL;
        if (list != null) {
            for (String str : list) {
                C08I7<String, Boolean> c08i7 = C20291714aZ.LIZJ;
                if (c08i7.LIZIZ(str) == null) {
                    c08i7.LIZLLL(str, Boolean.TRUE);
                    C20291714aZ c20291714aZ = C20291714aZ.LIZ;
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("survey_key", str);
                    c20291714aZ.getClass();
                    C20291714aZ.LIZ(c2344009Gk, str);
                    C20684815ws.LJIILLIIL("biz_request", c2344009Gk.LIZ);
                }
            }
        }
        return Unit.LIZ;
    }
}
