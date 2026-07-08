package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0LNW, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0LNW<T> {
    public final C567370MNb LIZ = new C567370MNb();
    public final C0LNY LIZIZ = new Object() { // from class: X.0LNY
    };
    public DialogC1389620mGW LIZJ;
    public AnonymousClass0956 LIZLLL;

    public abstract T LIZJ(C0MNQ c0mnq);

    public abstract String LIZLLL();

    public abstract Intent LJFF(CreativeInfo creativeInfo, Object obj, C0MNQ c0mnq, T t);

    public abstract Object LJI(Context context, T t, CreativeInfo creativeInfo, InterfaceC1364105Vn<Object> interfaceC1364105Vn);

    public final void LIZIZ() {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C0LNU(this, null), 2);
    }

    public static Pair LIZ(C0MNQ c0mnq) {
        String strLIZ;
        C0MNR c0mnr = c0mnq.LIZ;
        if (c0mnr == null || (strLIZ = c0mnr.LIZ) == null) {
            strLIZ = C0DMI.LIZ();
        }
        return new Pair(strLIZ, new CreativeInfo(strLIZ, 0, null, 6, null));
    }

    public final void LJ(Context context, Intent intent) {
        getClass();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C2153508c9(context, intent, null), 3);
    }

    public final void LJII(Context context, Function1 function1) {
        DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
        dialogC1389620mGW.LJJLJLI(context.getString(2131847921));
        dialogC1389620mGW.LJJLL(true);
        dialogC1389620mGW.setCancelable(true);
        dialogC1389620mGW.LLILZLL = new InterfaceC1389630mGX(this) { // from class: X.0LNX
            public final /* synthetic */ C0LNW<Object> LIZ;

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                AnonymousClass0956 anonymousClass0956 = this.LIZ.LIZLLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
            }
        };
        this.LIZJ = dialogC1389620mGW;
        C786410Ut5.J4(dialogC1389620mGW);
        this.LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0LNV(this, function1, context, null), 3);
    }
}
