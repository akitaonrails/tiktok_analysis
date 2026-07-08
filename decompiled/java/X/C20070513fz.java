package X;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13fz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20070513fz {
    public static final C20070513fz LIZ = new C20070513fz();

    public static final void LIZ(View view, InterfaceC1693130uA3 interfaceC1693130uA3) {
        PointerIcon pointerIconLIZIZ = LIZIZ(view.getContext(), interfaceC1693130uA3);
        if (!Intrinsics.LJFF(view.getPointerIcon(), pointerIconLIZIZ)) {
            view.setPointerIcon(pointerIconLIZIZ);
        }
    }

    public static PointerIcon LIZIZ(Context context, InterfaceC1693130uA3 interfaceC1693130uA3) {
        if (interfaceC1693130uA3 instanceof C00YZ) {
            interfaceC1693130uA3.getClass();
            return null;
        }
        if (interfaceC1693130uA3 instanceof C1557420qdA) {
            return PointerIcon.getSystemIcon(context, ((C1557420qdA) interfaceC1693130uA3).LIZIZ);
        }
        return PointerIcon.getSystemIcon(context, LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
