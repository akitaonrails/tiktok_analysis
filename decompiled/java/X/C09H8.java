package X;

import com.bytedance.android.bcm.impl.paramcheck.EnumTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.e;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09H8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09H8 extends C09AY implements Function0<Gson> {
    public C09H8() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        e eVar = new e();
        ((ArrayList) eVar.LJ).add(new EnumTypeAdapterFactory());
        return eVar.LIZ();
    }
}
