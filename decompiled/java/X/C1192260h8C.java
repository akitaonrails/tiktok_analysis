package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.pagesyncer.PageModuleSyncer;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h8C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192260h8C {
    public static final InterfaceC665370Q7z LIZIZ(Object obj) {
        if (obj instanceof C19EG) {
            return C1558360qeg.LJI((C19EG) obj, null);
        }
        if (obj instanceof Fragment) {
            return C1558360qeg.LJFF((Fragment) obj, null);
        }
        if (obj instanceof AbstractC738140SxQ) {
            return C1558520qew.LJIIL((AbstractC738140SxQ) obj);
        }
        if (obj instanceof InterfaceC713360RyY) {
            return C1558420qem.LIZIZ((InterfaceC713360RyY) obj);
        }
        if (!(obj instanceof InterfaceC665370Q7z)) {
            return null;
        }
        return (InterfaceC665370Q7z) obj;
    }

    public static final void LIZ(LifecycleOwner lifecycleOwner, String str, Function1 function1) {
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ = LIZIZ(lifecycleOwner);
        if (interfaceC665370Q7zLIZIZ != null) {
            PageModuleSyncer pageModuleSyncer = new PageModuleSyncer(str, lifecycleOwner);
            C1558520qew.LJII(interfaceC665370Q7zLIZIZ, pageModuleSyncer, PageModuleSyncer.class, "poi_detail_fragment", null);
            PageModuleSyncer pageModuleSyncer2 = (PageModuleSyncer) C1558520qew.LIZ(interfaceC665370Q7zLIZIZ.getTree().LJIIIIZZ(), PageModuleSyncer.class, "poi_detail_fragment");
            if (pageModuleSyncer2 != null) {
                ((ArrayList) pageModuleSyncer2.LLILZ).add(pageModuleSyncer);
                pageModuleSyncer.LLILLL = pageModuleSyncer2;
            }
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2 = LIZIZ(lifecycleOwner);
        if (interfaceC665370Q7zLIZIZ2 == null) {
            return;
        }
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, PageModuleSyncer.class, "poi_detail_fragment");
        PageModuleSyncer pageModuleSyncer3 = (PageModuleSyncer) interfaceC494301wDLIZ;
        if ((pageModuleSyncer3 instanceof InterfaceC1189350h3V) && Intrinsics.LJFF(pageModuleSyncer3.LL, lifecycleOwner) && interfaceC494301wDLIZ != null) {
            function1.invoke(interfaceC494301wDLIZ);
        }
    }
}
