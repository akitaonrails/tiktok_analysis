package X;

import android.view.Surface;
import com.ss.android.vesdk.VEEditor;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DOY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOY {
    public final VEEditor LIZ;
    public final CopyOnWriteArrayList<Function1<Surface, Unit>> LIZIZ = new CopyOnWriteArrayList<>();
    public final C1DOZ LIZJ = new C1DOZ(this);

    public C1DOY(VEEditor vEEditor) {
        this.LIZ = vEEditor;
    }
}
