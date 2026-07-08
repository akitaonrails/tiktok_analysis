package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.collection.common.ability.CommonCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility;
import com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StorySwipeInterceptComponent;

/* JADX INFO: renamed from: X.0RI4, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI4 {
    public static void LIZ(C0SZ8 c0sz8, View view) {
        Aweme awemeLJIIIIZZ;
        InterfaceC494301wD interfaceC494301wDLIZ;
        CommonCellAbility commonCellAbility;
        InterfaceC713360RyY interfaceC713360RyYFz2;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        CommonCellAbility commonCellAbility2;
        InterfaceC713360RyY interfaceC713360RyYFz22;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ2;
        CommonCellAbility commonCellAbility3;
        InterfaceC713360RyY interfaceC713360RyYFz23;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ3;
        CommonCellAbility commonCellAbility4;
        InterfaceC713360RyY interfaceC713360RyYFz24;
        InterfaceC665370Q7z interfaceC665370Q7zLIZIZ4;
        InterfaceC494301wD interfaceC494301wDLIZ2;
        if (c0sz8 != null && (awemeLJIIIIZZ = c0sz8.LJIIIIZZ()) != null) {
            InterfaceC494301wD interfaceC494301wDLIZ3 = null;
            if (!C10EU.LJIILLIIL(awemeLJIIIIZZ.getAuthor())) {
                C10IT.LIZ.getClass();
                if (C10IT.LJIILJJIL(awemeLJIIIIZZ)) {
                    return;
                }
                C0K77 value = StorySwipeInterceptComponent.LLJLIL.getValue();
                if (value != null && value.LJIJJ(awemeLJIIIIZZ)) {
                    return;
                }
                if ((c0sz8 instanceof CommonCellAbility) && (commonCellAbility4 = (CommonCellAbility) c0sz8) != null && (interfaceC713360RyYFz24 = commonCellAbility4.Fz2()) != null && (interfaceC665370Q7zLIZIZ4 = C1558420qem.LIZIZ(interfaceC713360RyYFz24)) != null && (interfaceC494301wDLIZ2 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ4, QuickDMEntranceAbility.class, null)) != null) {
                    interfaceC494301wDLIZ3 = interfaceC494301wDLIZ2;
                } else {
                    C0SZ8 c0sz8LLJLLL = c0sz8.LLJLLL();
                    if ((c0sz8LLJLLL instanceof CommonCellAbility) && (commonCellAbility3 = (CommonCellAbility) c0sz8LLJLLL) != null && (interfaceC713360RyYFz23 = commonCellAbility3.Fz2()) != null && (interfaceC665370Q7zLIZIZ3 = C1558420qem.LIZIZ(interfaceC713360RyYFz23)) != null) {
                        interfaceC494301wDLIZ3 = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ3, QuickDMEntranceAbility.class, null);
                    }
                }
                QuickDMEntranceAbility quickDMEntranceAbility = (QuickDMEntranceAbility) interfaceC494301wDLIZ3;
                if (quickDMEntranceAbility != null && quickDMEntranceAbility.EC0()) {
                    quickDMEntranceAbility.c92();
                    return;
                }
                return;
            }
            if (!(c0sz8 instanceof CommonCellAbility) || (commonCellAbility2 = (CommonCellAbility) c0sz8) == null || (interfaceC713360RyYFz22 = commonCellAbility2.Fz2()) == null || (interfaceC665370Q7zLIZIZ2 = C1558420qem.LIZIZ(interfaceC713360RyYFz22)) == null || (interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ2, StoryViewerEntranceBridgeAbility.class, null)) == null) {
                C0SZ8 c0sz8LLJLLL2 = c0sz8.LLJLLL();
                if ((c0sz8LLJLLL2 instanceof CommonCellAbility) && (commonCellAbility = (CommonCellAbility) c0sz8LLJLLL2) != null && (interfaceC713360RyYFz2 = commonCellAbility.Fz2()) != null && (interfaceC665370Q7zLIZIZ = C1558420qem.LIZIZ(interfaceC713360RyYFz2)) != null) {
                    interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7zLIZIZ, StoryViewerEntranceBridgeAbility.class, null);
                } else {
                    interfaceC494301wDLIZ = null;
                }
            }
            StoryViewerEntranceBridgeAbility storyViewerEntranceBridgeAbility = (StoryViewerEntranceBridgeAbility) interfaceC494301wDLIZ;
            if (storyViewerEntranceBridgeAbility != null) {
                storyViewerEntranceBridgeAbility.BN(view.getContext(), "slide_up", null);
            }
        }
    }
}
