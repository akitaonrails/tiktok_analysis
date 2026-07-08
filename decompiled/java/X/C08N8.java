package X;

import java.util.LinkedHashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08N8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08N8<V> implements Callable {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    public C08N8(int i, String str, int i2) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = i2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C1C7U.LIZ("PlayerExtAppLogUtil@634c.updateAppLog$1");
        for (int i = 0; i < this.LL; i++) {
            String str = this.LLILLJJLI;
            int i2 = this.LLILLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int i3 = 0; i3 < i2; i3++) {
                String string = UUID.randomUUID().toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                stringBuffer.append(UUID.randomUUID());
                linkedHashMap.put(string, stringBuffer.toString());
                linkedHashMap.put(UUID.randomUUID().toString(), String.valueOf(new Random().nextInt(100000)));
            }
            C20684815ws.LJIILLIIL(str, linkedHashMap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayerExtAppLogUtil@634c.updateAppLog$1");
        return unit;
    }
}
