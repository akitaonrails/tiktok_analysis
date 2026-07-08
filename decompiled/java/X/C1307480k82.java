package X;

import com.bytedance.android.starship.engine.graph.config.EdgeConfig;
import com.bytedance.android.starship.engine.graph.config.NodeConfig;
import com.bytedance.android.starship.engine.graph.foundation.Task;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;

/* JADX INFO: renamed from: X.0k82, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1307480k82 {
    public final EdgeConfig LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public String LIZLLL = "";
    public InterfaceC1307210k7b LJ;
    public InterfaceC1307210k7b LJFF;

    public C1307480k82(EdgeConfig edgeConfig) {
        this.LIZ = edgeConfig;
        this.LIZIZ = CastLongProtector.parseLong(edgeConfig.source);
        this.LIZJ = CastLongProtector.parseLong(edgeConfig.target);
        C1307530k87 c1307530k87 = new AbstractC1307540k88() { // from class: X.0k87
            {
                new NodeConfig("PLACEHOLDER", EnumC1307400k7u.UNKNOWN, null, null, null, null, null, null, null, null, null, null, null);
            }

            @Override // X.InterfaceC1307210k7b
            public final Object LIZJ(C1307280k7i c1307280k7i, Task task, InterfaceC1364105Vn interfaceC1364105Vn) {
                throw new IllegalStateException("PlaceHolderNode should not be executed");
            }
        };
        this.LJ = c1307530k87;
        this.LJFF = c1307530k87;
    }
}
