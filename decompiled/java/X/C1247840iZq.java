package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.profile.org.OrgIdentifierBizData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0iZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247840iZq {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Function0<Unit> LIZLLL;
    public final Function0<Unit> LJ;

    public static void LIZ(int i, View view, Object obj, Function2 function2) {
        View viewFindViewById = view.findViewById(i);
        if (obj != null) {
            function2.invoke(viewFindViewById, obj);
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
        } else {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
    }

    public C1247840iZq(C19EG c19eg, OrgIdentifierBizData orgIdentifierBizData, String str, String str2, AwS556S0100000_12 awS556S0100000_12, AwS556S0100000_12 awS556S0100000_122) {
        this.LIZ = c19eg;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = awS556S0100000_12;
        this.LJ = awS556S0100000_122;
    }
}
