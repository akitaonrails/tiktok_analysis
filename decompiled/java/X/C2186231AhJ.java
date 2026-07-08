package X;

import android.opengl.EGLContext;
import com.bytedance.creativex.camerakit.camera.session.recorder.impl.RecorderImpl;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2186231AhJ implements InterfaceC2186241AhK, InterfaceC2253251DHf {
    public final C1DHA LIZ;
    public final boolean LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final CopyOnWriteArrayList<InterfaceC2186241AhK> LIZLLL = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC2185661AgO
    public final void LIZ() {
    }

    @Override // X.InterfaceC2253251DHf
    public final void LIZJ() {
        if (this.LIZJ.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC2186241AhK> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(null, 0, 0, 0, 0, 0L, 0L);
        }
    }

    public C2186231AhJ(RecorderImpl recorderImpl, boolean z, Function0 function0) {
        this.LIZ = recorderImpl;
        this.LIZIZ = z;
        this.LIZJ = function0;
    }

    @Override // X.InterfaceC2185661AgO
    public final void LIZIZ(EGLContext eGLContext, int i, int i2, int i3, int i4, long j, long j2) {
        if (this.LIZJ.invoke().booleanValue()) {
            return;
        }
        Iterator<InterfaceC2186241AhK> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(eGLContext, i, i2, i3, i4, j, j2);
        }
    }
}
