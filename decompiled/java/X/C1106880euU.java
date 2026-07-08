package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: Add missing generic type declarations: [VALUE, KEY] */
/* JADX INFO: renamed from: X.0euU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106880euU<KEY, VALUE> extends C09AY implements Function0<ConcurrentHashMap<KEY, C1106820euO<VALUE>>> {
    public C1106880euU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new ConcurrentHashMap();
    }
}
