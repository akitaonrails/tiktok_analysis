package X;

import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS48S0000100_7;
import kotlin.jvm.internal.AwS79S0100100_7;

/* JADX INFO: renamed from: X.0Il5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475690Il5 implements InterfaceC420801kM {
    public final Map<String, String> LL;
    public final long LLILLJJLI;
    public final InterfaceC1685420txc<List<C468240IXu>, Boolean, Long, String, Integer, Unit> LLILLL;
    public final Function2<String, String, Unit> LLILZ;
    public final Function0<Unit> LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC420801kM
    public final void dispose() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("disposed feed request[heroId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(']');
        C20441214yg.LJIIL("GameLiveBottombarVideoAdapter", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLILZLL) {
            return;
        }
        this.LLILZLL = true;
        this.LLILZIL.invoke();
    }

    @Override // X.InterfaceC420801kM
    public final boolean isDisposed() {
        return this.LLILZLL;
    }

    public C475690Il5(Context context, Map map, String str, String str2, long j, boolean z, C475670Il3 c475670Il3, AwS79S0100100_7 awS79S0100100_7, AwS48S0000100_7 awS48S0000100_7) {
        this.LL = map;
        this.LLILLJJLI = j;
        this.LLILLL = c475670Il3;
        this.LLILZ = awS79S0100100_7;
        this.LLILZIL = awS48S0000100_7;
    }
}
