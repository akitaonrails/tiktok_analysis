package X;

import android.content.Context;
import com.ss.android.ugc.aweme.poi.mapmode.model.PoiLandmark;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0gj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176730gj9 {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public final Context LIZ;
    public final InterfaceC1177250gjz LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final int LIZLLL = 60;
    public final List<Pair<PoiLandmark, InterfaceC1177040gje>> LJ = new ArrayList();
    public final List<PoiLandmark> LJFF = new ArrayList();
    public float LJI = -999.0f;
    public AnonymousClass0956 LJII;

    public final void LIZ() {
        Iterator<Pair<PoiLandmark, InterfaceC1177040gje>> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            it2.next().getSecond().remove();
        }
        ((ArrayList) this.LJ).clear();
    }

    public C1176730gj9(Context context, InterfaceC1177250gjz interfaceC1177250gjz, InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1177250gjz;
        this.LIZJ = interfaceC497601wk;
    }
}
