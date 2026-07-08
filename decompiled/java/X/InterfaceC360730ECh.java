package X;

import android.content.Context;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ECh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC360730ECh {
    boolean LIZ(String str);

    void LIZIZ(C360720ECg c360720ECg);

    void LIZJ(InterfaceC365420EUi interfaceC365420EUi, String str);

    void LIZLLL(int i, String str, String str2, Function1 function1);

    ArrayList LJ();

    ArrayList LJFF();

    void LJI();

    void LJII(String str, boolean z, boolean z2, boolean z3, InterfaceC365520EUs<ResourceItem> interfaceC365520EUs);

    void LJIIIIZZ(String str);

    void LJIIIZ(String str, String str2, InterfaceC365520EUs<ResourceItem> interfaceC365520EUs);

    void LJIIJ(ArrayList<String> arrayList, String str, boolean z, IFetchEffectListListener iFetchEffectListListener);

    void LJIIJJI(Context context, String str, String str2, InterfaceC365520EUs<ResourceItem> interfaceC365520EUs);

    C365770EVr getResourceConfig();
}
