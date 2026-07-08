package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.fcpanchor.access.VideoFeedMultiTagAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.componentmanager.IFcpPolicyAbility;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0RkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704440RkA extends C09AY implements Function2<VideoFeedMultiTagAssem, C291001Au<? extends String>, Unit> {
    public C704440RkA() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(VideoFeedMultiTagAssem videoFeedMultiTagAssem, C291001Au<? extends String> c291001Au) {
        Aweme aweme;
        String str;
        JSONObject jSONObjectVQ2;
        Context context;
        Activity activityLIZ;
        ArrayList arrayList;
        Fragment fragment;
        Object obj;
        Object obj2;
        Object obj3;
        Map<String, C699090RbX<ComponentPriorityProtocol>> mapZt1;
        VideoFeedMultiTagAssem videoFeedMultiTagAssem2 = videoFeedMultiTagAssem;
        C291001Au<? extends String> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ != 0 && (aweme = videoFeedMultiTagAssem2.Fp().getAweme()) != null && (str = videoFeedMultiTagAssem2.Fp().eventType) != null && (jSONObjectVQ2 = videoFeedMultiTagAssem2.Fp().vQ2()) != null && (context = videoFeedMultiTagAssem2.getContext()) != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            String.valueOf(videoFeedMultiTagAssem2.jm().hashCode());
            IFcpPolicyAbility iFcpPolicyAbility = (IFcpPolicyAbility) videoFeedMultiTagAssem2.LLLI.getValue();
            if (iFcpPolicyAbility != null && (mapZt1 = iFcpPolicyAbility.Zt1()) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, C699090RbX<ComponentPriorityProtocol>> entry : mapZt1.entrySet()) {
                    if (Intrinsics.LJFF(entry.getValue().LLJILJILJ, Boolean.TRUE)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                arrayList = new ArrayList(linkedHashMap.size());
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    arrayList.add(((Map.Entry) it2.next()).getKey());
                }
            } else {
                arrayList = null;
            }
            C0RJN c0rjnLIZIZ = videoFeedMultiTagAssem2.jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                fragment = c0rjnLIZIZ.LJ;
            } else {
                fragment = null;
            }
            C724270Sb3 c724270Sb3 = videoFeedMultiTagAssem2.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            C712510RxB c712510RxB = new C712510RxB(aweme, activityLIZ, str, jSONObjectVQ2, false, fragment, arrayList, obj);
            C704760Rkg c704760Rkg = videoFeedMultiTagAssem2.LLJLLIL;
            if (c704760Rkg != null) {
                int iLIZ = c704760Rkg.LIZ(c712510RxB, videoFeedMultiTagAssem2.LLLIILIL);
                boolean z = false;
                if (iLIZ == 0) {
                    C786410Ut5.LJLLLLLL(8, videoFeedMultiTagAssem2.LJJIJL());
                } else {
                    C786410Ut5.LJLLLLLL(0, videoFeedMultiTagAssem2.LJJIJL());
                }
                C698800Rb4 c698800Rb4 = C698800Rb4.LIZ;
                FeedComponentPriorityData feedComponentPriorityDataEp = videoFeedMultiTagAssem2.Ep();
                C724270Sb3 c724270Sb32 = videoFeedMultiTagAssem2.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                } else {
                    obj2 = null;
                }
                String strLIZIZ = C698800Rb4.LIZIZ(c698800Rb4, feedComponentPriorityDataEp, ((VideoItemParams) obj2).getAweme().getAnchors());
                if (!TextUtils.isEmpty(strLIZIZ)) {
                    C724270Sb3 c724270Sb33 = videoFeedMultiTagAssem2.LLJI;
                    if (c724270Sb33 != null) {
                        obj3 = c724270Sb33.LL;
                    } else {
                        obj3 = null;
                    }
                    ((VideoItemParams) obj3).getAweme();
                    if (videoFeedMultiTagAssem2.LJJIJL().getVisibility() == 0 && iLIZ != 0) {
                        z = true;
                    }
                    InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) videoFeedMultiTagAssem2.LLJZ.getValue();
                    if (interactAreaCommonAbility != null) {
                        interactAreaCommonAbility.CL(strLIZIZ, null, z);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
