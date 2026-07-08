package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704830Rkn {
    public final Function0<C690870R8b> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function0<VideoItemParams> LIZLLL;
    public final C704840Rko LJ;
    public final Map<String, Object> LJFF;
    public C705340Rlc LJI;
    public final Map<String, C704830Rkn> LJII;

    public final void LIZ() {
        Iterator it2 = ((LinkedHashMap) this.LJII).entrySet().iterator();
        while (it2.hasNext()) {
            C704840Rko c704840Rko = ((C704830Rkn) ((Map.Entry) it2.next()).getValue()).LJ;
            c704840Rko.LJFF = 0;
            c704840Rko.LIZ = null;
            c704840Rko.LIZIZ = null;
            c704840Rko.LIZJ = null;
            c704840Rko.LIZLLL = null;
            c704840Rko.LJ = null;
            ((LinkedHashMap) c704840Rko.LJIIIZ).clear();
            c704840Rko.LJIIJ = null;
        }
    }

    public final C704830Rkn LIZIZ(String str) {
        C704830Rkn c704830Rkn = (C704830Rkn) ((LinkedHashMap) this.LJII).get(str);
        if (c704830Rkn == null) {
            C704840Rko c704840Rko = new C704840Rko();
            C704840Rko c704840Rko2 = this.LJ;
            c704840Rko.LJI = c704840Rko2.LJI;
            c704840Rko.LJII = c704840Rko2.LJII;
            c704830Rkn = new C704830Rkn(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, c704840Rko, new LinkedHashMap(), this.LJI);
            this.LJII.put(str, c704830Rkn);
        }
        c704830Rkn.LJ.LJII = this.LJ.LJII;
        return c704830Rkn;
    }

    public /* synthetic */ C704830Rkn(Function0 function0, String str, String str2, Function0 function02, C704840Rko c704840Rko, Map map) {
        this(function0, str, str2, function02, c704840Rko, map, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C704830Rkn(Function0<C690870R8b> function0, String str, String str2, Function0<? extends VideoItemParams> function02, C704840Rko c704840Rko, Map<String, Object> map, C705340Rlc c705340Rlc) {
        this.LIZ = function0;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = function02;
        this.LJ = c704840Rko;
        this.LJFF = map;
        this.LJI = c705340Rlc;
        this.LJII = new LinkedHashMap();
    }
}
