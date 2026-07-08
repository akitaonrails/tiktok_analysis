package X;

import com.ss.android.ugc.feed.platform.standard.preload.AbsFcpDataPreloadTask;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SFt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718350SFt {
    public final List<String> LIZ;
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, InterfaceC718610SGt> LIZIZ;
    public final Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, Function0<Object>> LIZJ;
    public final Map<String, C718600SGs> LIZLLL;

    public C718350SFt() {
        this(C13BV.INSTANCE, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C718350SFt(List<String> list, Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, ? extends InterfaceC718610SGt> map, Map<Class<? extends AbsFcpDataPreloadTask<?, ?>>, ? extends Function0<? extends Object>> map2, Map<String, C718600SGs> map3) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = map2;
        this.LIZLLL = map3;
    }
}
