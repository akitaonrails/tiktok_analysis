package X;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0WAo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818920WAo {
    public final Executor LIZ;
    public final List<InterfaceC812380Vts<ComponentRegistrar>> LIZIZ = new ArrayList();
    public final List<C0WBP<?>> LIZJ = new ArrayList();
    public final ComponentRegistrarProcessor LIZLLL = ComponentRegistrarProcessor.NOOP;

    public C818920WAo(Executor executor) {
        this.LIZ = executor;
    }
}
