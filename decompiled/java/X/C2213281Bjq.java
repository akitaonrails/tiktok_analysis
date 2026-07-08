package X;

import Y.ARunnableS106S0100000_6;
import android.os.Looper;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS0S1410200_34;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2213281Bjq implements C1BF7 {
    public static final C01GW<C2213281Bjq> LIZJ = C452501pT.LIZ(EnumC452301pR.SYNCHRONIZED, AFwS225S0000000_34.get$arr$(181));
    public final C1BF7 LIZ = C2212231Bi9.LJIIZILJ;
    public final ExecutorService LIZIZ = C2212231Bi9.LJI;

    public final void LJ(Function0<Unit> function0) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            this.LIZIZ.execute(new ARunnableS106S0100000_6((Function0) function0, 136));
        } else {
            function0.invoke();
        }
    }

    @Override // X.C1BF7
    public final void LIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AwS0S1410200_34(this, view, j, list, str, z, j2, jSONObject, 2));
    }

    @Override // X.C1BF7
    public final void LIZIZ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AwS0S1410200_34(this, view, j, list, str, z, j2, jSONObject, 1));
    }

    @Override // X.C1BF7
    public final void LIZJ(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AwS0S1410200_34(this, view, j, list, str, z, j2, jSONObject, 0));
    }

    @Override // X.C1BF7
    public final void LIZLLL(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        LJ(new AwS0S1410200_34(this, view, j, list, str, z, j2, jSONObject, 3));
    }
}
