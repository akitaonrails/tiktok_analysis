package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.creative.common.api.analytics.GameMainFlowEventParameters;
import com.ss.android.ugc.aweme.im.creative.common.api.model.data.IMGameCameraInfo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ZpY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public interface InterfaceC911620ZpY {
    public static final C911650Zpb LIZ = C911650Zpb.LIZ;

    Object LIZ(Context context, Effect effect, C0IC8 c0ic8, GameMainFlowEventParameters gameMainFlowEventParameters, InterfaceC1364105Vn<? super IMGameCameraInfo> interfaceC1364105Vn);

    Object LIZIZ(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    Object LIZJ(Context context, String str, C0IC8 c0ic8, GameMainFlowEventParameters gameMainFlowEventParameters, Function1<? super Effect, Unit> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    InterfaceC911720Zpi LIZLLL();

    InterfaceC911780Zpo LJ();

    Object LJFF(Context context, Effect effect, C0IC8 c0ic8, GameMainFlowEventParameters gameMainFlowEventParameters, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    InterfaceC911750Zpl LJI();

    InterfaceC1698506kx LJII();

    Object LJIIIIZZ(Context context, IMGameCameraInfo iMGameCameraInfo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);
}
