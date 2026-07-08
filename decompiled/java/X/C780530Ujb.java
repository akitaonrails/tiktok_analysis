package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.broadcast.interaction.config.WidgetLoadViewModel;
import com.bytedance.android.livesdk.broadcast.video.VideoBroadcastInteractionFragment;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Ujb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780530Ujb {
    public static final C01GW LIZ = C452501pT.LIZ(EnumC452301pR.NONE, AFwS199S0000000_12.get$arr$(534));
    public static WidgetLoadViewModel LIZIZ;

    public static final WidgetLoadViewModel LIZIZ(InterfaceC780590Ujh interfaceC780590Ujh) {
        WidgetLoadViewModel widgetLoadViewModel = LIZIZ;
        if (widgetLoadViewModel != null) {
            return widgetLoadViewModel;
        }
        VideoBroadcastInteractionFragment videoBroadcastInteractionFragmentSO = interfaceC780590Ujh.sO();
        if (!(videoBroadcastInteractionFragmentSO instanceof Fragment)) {
            videoBroadcastInteractionFragmentSO = null;
        }
        WidgetLoadViewModel widgetLoadViewModel2 = (WidgetLoadViewModel) C520010KaN.LJJJ(videoBroadcastInteractionFragmentSO, WidgetLoadViewModel.class, null, null, true);
        if (widgetLoadViewModel2 == null) {
            widgetLoadViewModel2 = (WidgetLoadViewModel) LIZ.getValue();
        }
        LIZIZ = widgetLoadViewModel2;
        return widgetLoadViewModel2;
    }

    public static void LIZ(InterfaceC780590Ujh interfaceC780590Ujh, EnumC780830Uk5 enumC780830Uk5, Function2 function2) {
        WidgetLoadViewModel widgetLoadViewModelLIZIZ = LIZIZ(interfaceC780590Ujh);
        if (widgetLoadViewModelLIZIZ.LL == null) {
            widgetLoadViewModelLIZIZ.LL = new C780620Ujk();
        }
        C780620Ujk c780620Ujk = widgetLoadViewModelLIZIZ.LL;
        if (c780620Ujk != null) {
            function2.invoke(new C780600Uji(c780620Ujk, enumC780830Uk5, null), interfaceC780590Ujh);
            c780620Ujk.LJFF(null);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
