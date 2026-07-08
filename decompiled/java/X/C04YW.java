package X;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04YW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04YW extends C09AY implements Function0<Type> {
    public C04YW() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Type invoke() {
        return new TypeToken<Map<String, ? extends String>>() { // from class: X.04YV
        }.getType();
    }
}
