package X;

import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.feed.platform.panel.player.PlayerComponentTemp;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C739900T0q extends C09AY implements Function0<String> {
    public final /* synthetic */ PlayerComponentTemp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C739900T0q(PlayerComponentTemp playerComponentTemp) {
        super(0);
        this.LL = playerComponentTemp;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        BaseListFragmentPanel baseListFragmentPanel = this.LL.LL;
        if (!C1481060oe0.LJFF() || baseListFragmentPanel == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(baseListFragmentPanel != null ? baseListFragmentPanel.getClass().getSimpleName() : "");
            sbLIZ.append(baseListFragmentPanel != null ? Integer.valueOf(baseListFragmentPanel.hashCode()) : null);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (baseListFragmentPanel.LLILZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("scene_feed");
            sbLIZ2.append(baseListFragmentPanel.getClass().getSimpleName());
            sbLIZ2.append(this.LL.hashCode());
            return C1481060oe0.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1EE1 c1ee1 = C1EE1.LIZIZ;
        if (c1ee1.LJJIZ()) {
            C2189821An6 c2189821An6 = baseListFragmentPanel.LLLLIIIILLL;
            if (Intrinsics.LJFF(c2189821An6 != null ? c2189821An6.getEventType() : null, "offline_mode_page")) {
                return c1ee1.getSceneId();
            }
        }
        String str = this.LL.LLJI;
        if (str == null) {
            str = "scene_home_page";
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str);
        sbLIZ3.append(baseListFragmentPanel.getClass().getSimpleName());
        sbLIZ3.append(this.LL.hashCode());
        return C1481060oe0.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
