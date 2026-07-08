package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aAQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C924560aAQ {
    public static C924560aAQ LJIIJ;
    public final Room LIZ;
    public final User LIZIZ;
    public final Context LIZJ;
    public final Function0<Unit> LIZLLL;
    public SparkContext LJIIIIZZ;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(261));
    public String LJFF = "";
    public String LJI = "";
    public final C01GW LJII = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(260));
    public final C515301zb LJIIIZ = new C515301zb(this, 9);

    public final void LIZ() {
        InterfaceC1059280dfi interfaceC1059280dfiLJJIJLIJ;
        SparkContext sparkContext = this.LJIIIIZZ;
        if (sparkContext != null && (interfaceC1059280dfiLJJIJLIJ = sparkContext.LJJIJLIJ()) != null) {
            interfaceC1059280dfiLJJIJLIJ.close();
        }
        this.LJIIIIZZ = null;
    }

    public C924560aAQ(Room room, User user, Context context, AwS559S0100000_15 awS559S0100000_15) {
        this.LIZ = room;
        this.LIZIZ = user;
        this.LIZJ = context;
        this.LIZLLL = awS559S0100000_15;
    }
}
