package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C579140MnY {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(578));

    public static void LIZ(CreativeInfo creativeInfo, NowsShootModel nowsShootModel, Bitmap bitmap, boolean z, Function1 function1) {
        LIZ.set(false);
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C579160Mna(bitmap, creativeInfo, z, false, nowsShootModel, function1, null), 3);
    }
}
