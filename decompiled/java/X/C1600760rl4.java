package X;

import com.ss.android.ugc.feed.platform.panel.viewpager.ViewPagerPanelComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rl4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1600760rl4 extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ ViewPagerPanelComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1600760rl4(ViewPagerPanelComponent viewPagerPanelComponent) {
        super(0);
        this.LL = viewPagerPanelComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        String from;
        C2189821An6 c2189821An6 = this.LL.getPanelContext().LIZJ;
        boolean z = false;
        if (c2189821An6 != null && (from = c2189821An6.getFrom()) != null && (Intrinsics.LJFF(from, "STORY_ENTRANCE_AVATAR") || Intrinsics.LJFF(from, "STORY_ENTRANCE_MINE") || Intrinsics.LJFF(from, "STORY_ENTRANCE_OTHER") || Intrinsics.LJFF(from, "STORY_ENTRANCE_DEFAULT") || Intrinsics.LJFF(from, "STORY_ENTRANCE_INNER_PUSH") || Intrinsics.LJFF(from, "STORY_ENTRANCE_NOTE") || Intrinsics.LJFF(from, "STORY_ENTRANCE_WIDGET") || Intrinsics.LJFF(from, "STORY_ENTRANCE_MUSIC_COVER_AVATAR"))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
