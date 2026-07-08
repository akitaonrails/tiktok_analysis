package X;

import com.ss.android.ugc.feed.platform.ab.ComponentStrategy;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RUO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RUO extends C09AY implements Function0<ArrayList<ComponentStrategy>> {
    public C0RUO() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ArrayList<ComponentStrategy> invoke() {
        ArrayList<ComponentStrategy> arrayList = new ArrayList<>();
        C0CMJ c0cmj = C0CMJ.HIGH_PRIORITY;
        int type = c0cmj.getType();
        EnumC695670RQn enumC695670RQn = EnumC695670RQn.FIRST_VIDEO_SHOW;
        arrayList.add(new ComponentStrategy("live_scroll_config_component", type, enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("live_feed_live_card_component", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("live_preview_performance_component", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        arrayList.add(new ComponentStrategy("feed_live_card_awareness_component", c0cmj.getType(), enumC695670RQn.getMode(), null, false, false));
        return arrayList;
    }
}
