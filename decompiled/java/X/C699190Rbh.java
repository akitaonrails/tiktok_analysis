package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rbh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699190Rbh {
    public static final boolean LIZ(LifecycleOwner lifecycleOwner, ComponentPriorityProtocol componentPriorityProtocol) {
        AbstractC738140SxQ abstractC738140SxQ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        TranslationAbility translationAbility;
        View viewXb = componentPriorityProtocol.xb();
        if (Intrinsics.LJFF("left_container_see_translation", componentPriorityProtocol.H3())) {
            if (!(lifecycleOwner instanceof BaseCellContentComponent) || (abstractC738140SxQ = (AbstractC738140SxQ) lifecycleOwner) == null || (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(abstractC738140SxQ)) == null || (translationAbility = (TranslationAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TranslationAbility.class, null)) == null || !translationAbility.SJ0()) {
                return false;
            }
            return true;
        }
        if (viewXb.getVisibility() != 0) {
            return false;
        }
        return true;
    }
}
