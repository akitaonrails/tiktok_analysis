package X;

import java.util.HashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583320MuI extends C09AY implements Function0<HashSet<String>> {
    public C583320MuI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("fyp_request_preload");
        hashSet.add("mus_new_notification");
        hashSet.add("system_launch_startup_end_to_feed");
        hashSet.add("system_launch_feed_to_first_frame");
        hashSet.add("system_launch_after_first_frame");
        hashSet.add("system_launch_isolate_startup_to_first_frame");
        hashSet.add("system_launch_isolate_after_first_frame");
        hashSet.add("system_launch_1_minute");
        hashSet.add("system_launch_1_minute_feed");
        hashSet.add("system_launch_1_to_2_minute");
        hashSet.add("system_launch_1_to_2_minute_feed");
        hashSet.add("three_vv");
        return hashSet;
    }
}
