package X;

import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RPY, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RPY extends C09AY implements Function2<FeedBottomButtonContainer, C291001Au<? extends String>, Unit> {
    public C0RPY() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(FeedBottomButtonContainer feedBottomButtonContainer, C291001Au<? extends String> c291001Au) {
        Object obj;
        FeedBottomButtonContainer feedBottomButtonContainer2 = feedBottomButtonContainer;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 == null || (obj = c291001Au2.LIZ) == null) {
            obj = "";
        }
        if (Intrinsics.LJFF(obj, "interact_area_component") || Intrinsics.LJFF(obj, "left_container")) {
            feedBottomButtonContainer2.lj();
        }
        return Unit.LIZ;
    }
}
