package X;

import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0UTD, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UTD {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final Function1<Integer, Unit> LIZJ;
    public final Function0<Unit> LIZLLL;
    public int LJ;
    public int LJFF;

    public C0UTD(Context context, DataChannel dataChannel, Function1 function1, Function0 function0, int i, int i2) {
        i = (i2 & 16) != 0 ? 0 : i;
        int i3 = (i2 & 32) != 0 ? 100 : 0;
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = function1;
        this.LIZLLL = function0;
        this.LJ = i;
        this.LJFF = i3;
    }
}
