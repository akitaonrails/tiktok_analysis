package X;

import kotlin.text.a0;
import tikcast.linkmic.common.CohostTypeLayoutExtra;
import tikcast.linkmic.common.LayoutData;
import tikcast.linkmic.common.LayoutState;

/* JADX INFO: renamed from: X.0aoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949540aoi {
    public static final /* synthetic */ int LIZ = 0;

    public static C948680anK LIZ(EnumC918980a1Q enumC918980a1Q, long j, LayoutData layoutData) {
        int i;
        String strLIZ;
        LayoutState layoutState;
        String str;
        CohostTypeLayoutExtra cohostTypeLayoutExtra;
        if (layoutData == null) {
            return null;
        }
        long j2 = layoutData.groupChannelId;
        LayoutState layoutState2 = layoutData.layout;
        if (layoutState2 != null && (cohostTypeLayoutExtra = layoutState2.cohostLayoutExtra) != null) {
            i = cohostTypeLayoutExtra.scene;
        } else {
            i = 0;
        }
        C948680anK c948680anK = new C948680anK(enumC918980a1Q, j, j2, layoutData, i);
        if (j <= 0 || layoutState2 == null || (((strLIZ = c948680anK.LIZ()) == null || a0.LJJJIL(strLIZ)) && (((layoutState = layoutData.layout) == null || (str = layoutState.layoutId) == null || a0.LJJJIL(str)) && !(!layoutData.uiPos.isEmpty())))) {
            return null;
        }
        return c948680anK;
    }
}
