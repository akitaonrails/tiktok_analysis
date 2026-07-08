package X;

import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.i18n.location.api.LocationData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0hOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1202370hOV {
    public final Function0<Integer> LIZ;

    public abstract void LIZ(Cert cert, Handler handler, C092O<LocationData> c092o);

    public abstract LocationData LIZIZ(Cert cert);

    public AbstractC1202370hOV(Function0<Integer> function0) {
        this.LIZ = function0;
    }
}
