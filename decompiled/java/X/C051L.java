package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.android.ugc.aweme.im.common.util.gson.BooleanDefaultFalseAdapter;
import com.ss.android.ugc.aweme.im.common.util.gson.IntegerDefaultZeroAdater;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.051L, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C051L extends C09AY implements Function0<Gson> {
    public C051L() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        e eVar = new e();
        eVar.LJIILIIL = true;
        Class cls = Boolean.TYPE;
        eVar.LIZJ(new BooleanDefaultFalseAdapter(), cls);
        eVar.LIZJ(new IntegerDefaultZeroAdater(), Integer.TYPE);
        eVar.LIZJ(new BooleanDefaultFalseAdapter(), cls);
        return eVar.LIZ();
    }
}
