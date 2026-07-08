package X;

import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18BT, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BT {
    public static final C18BT LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final LazyNonNull LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18BT.class, "map", "getMap()Ljava/util/Map;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZ = new C18BT();
        LIZJ = LazyKt.INSTANCE.lazyNonNull(AFwS223S0000000_32.get$arr$(285));
    }

    public final boolean LIZ(String str) {
        C21242718Bd c21242718Bd = (C21242718Bd) ((Map) LIZJ.getValue(this, LIZIZ[0])).get(str);
        if (c21242718Bd == null) {
            return false;
        }
        return c21242718Bd.LIZ;
    }
}
