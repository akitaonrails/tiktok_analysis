package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RUN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUN extends C09AY implements Function0<ArrayList<ComponentStrategy>> {
    public C0RUN() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<ComponentStrategy> invoke() {
        ArrayList<ComponentStrategy> arrayList = new ArrayList<>();
        C0CMJ c0cmj = C0CMJ.NORMAL_PRIORITY;
        int type = c0cmj.getType();
        EnumC695670RQn enumC695670RQn = EnumC695670RQn.FIRST_VIDEO_SHOW;
        arrayList.add(new ComponentStrategy("login_follow", type, enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("search_launch", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("inbox_enter_mob_event_by_push", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("search_widget", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        C0CMJ c0cmj2 = C0CMJ.HIGH_PRIORITY;
        arrayList.add(new ComponentStrategy("viewpager_paging_duration_component", c0cmj2.getType(), enumC695670RQn.getMode(), null, false, false));
        if (((Boolean) C265950AbZ.LIZ.getValue()).booleanValue()) {
            arrayList.add(new ComponentStrategy("right_container_chat_gpt", c0cmj.getType(), EnumC695670RQn.START_UP_END.getMode(), null, false, false));
        }
        if ((C283270B8j.LIZ() & 1) == 1) {
            arrayList.add(new ComponentStrategy("bottom_banner", c0cmj2.getType(), ((C283270B8j.LIZ() & 2) == 2 ? EnumC695670RQn.SECOND_VIDEO_HAS_LEFT : EnumC695670RQn.FIRST_VIDEO_HAS_LEFT).getMode(), null, false, false));
        }
        if ((C283270B8j.LIZ() & 4) == 4) {
            arrayList.add(new ComponentStrategy("bottom_button", c0cmj2.getType(), ((C283270B8j.LIZ() & 8) == 8 ? EnumC695670RQn.SECOND_VIDEO_HAS_LEFT : EnumC695670RQn.FIRST_VIDEO_HAS_LEFT).getMode(), null, false, false));
        }
        return arrayList;
    }
}
