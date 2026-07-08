package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Anq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190281Anq implements InterfaceC2190291Anr {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(292));

    public final ConcurrentHashMap<String, Object> LIZIZ() {
        return (ConcurrentHashMap) this.LIZ.getValue();
    }

    @Override // X.InterfaceC2190291Anr
    public final C2190281Anq LIZ(Object obj, String str) {
        LIZIZ().put(str, obj);
        return this;
    }
}
