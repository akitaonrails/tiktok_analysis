package X;

import com.ss.android.ugc.aweme.innerpush.api.setting.InnerPushExperienceOptimize;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0YZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876390YZp {
    public static final long LJIIIZ;
    public final C876680YaI LIZ;
    public final InterfaceC1631620sYq<List<? extends C869590Y9l>, Integer, Long, Unit> LIZIZ;
    public final Function2<List<C0Y8T>, Long, Boolean> LIZJ;
    public final Function2<List<String>, Long, Boolean> LIZLLL;
    public C1475705q7 LJ;
    public C876840YaY LJI;
    public C876460YZw LJII;
    public final Map<EnumC876540Ya4, InterfaceC876420YZs> LJFF = new LinkedHashMap();
    public final C054G LJIIIIZZ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    static {
        LJIIIZ = ((Boolean) InnerPushExperienceOptimize.LJFF.getValue()).booleanValue() ? 8000L : 20000L;
    }

    public final void LIZ(final Map<String, Integer> map, final EnumC876540Ya4 enumC876540Ya4) {
        this.LJFF.put(enumC876540Ya4, new InterfaceC876420YZs() { // from class: X.0YZn
            @Override // X.InterfaceC876420YZs
            public final void LIZ(C879180YeK c879180YeK, boolean z) {
                C876390YZp c876390YZp = this.LIZ;
                C23250099c.LIZLLL(c876390YZp.LJIIIIZZ, null, null, new C876360YZm(c879180YeK, enumC876540Ya4, map, z, c876390YZp, null), 3);
            }
        });
        Object obj = ((LinkedHashMap) this.LJFF).get(enumC876540Ya4);
        if (obj != null) {
            this.LIZ.LIZJ().LJ.add((InterfaceC876420YZs) obj);
        }
    }

    public C876390YZp(C876680YaI c876680YaI, C876520Ya2 c876520Ya2, C876500Ya0 c876500Ya0, C876490YZz c876490YZz) {
        this.LIZ = c876680YaI;
        this.LIZIZ = c876520Ya2;
        this.LIZJ = c876500Ya0;
        this.LIZLLL = c876490YZz;
    }
}
