package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0MEK, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public abstract class C0MEK<V extends View> {
    public final Context LIZ;
    public final Function0<C19EG> LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 964));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 963));

    public abstract V LIZ();

    /* JADX WARN: Multi-variable type inference failed */
    public C0MEK(Context context, Function0<? extends C19EG> function0) {
        this.LIZ = context;
        this.LIZIZ = function0;
    }
}
