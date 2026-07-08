package X;

import com.ss.android.ugc.feed.platform.cell.RootCellComponent;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaComponent;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0RBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691720RBi {
    public static final LinkedHashMap<Class<? extends InterfaceC1565640qqQ>, List<String>> LIZ;

    static {
        LinkedHashMap<Class<? extends InterfaceC1565640qqQ>, List<String>> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(RootCellComponent.class, C13LQ.LJLI(new String[]{"event_enter_dislike_mode", "event_downgrade_view_opt", "event_enter_clear_mode", "event_component_clickable"}));
        linkedHashMap.put(InteractAreaComponent.class, C13LQ.LJLI(new String[]{"event_commodity_card", "event_component_hint_text"}));
        LIZ = linkedHashMap;
    }
}
