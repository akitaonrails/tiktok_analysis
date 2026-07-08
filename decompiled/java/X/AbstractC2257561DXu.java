package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentMultiAnimationConfig;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentStateConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.1DXu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2257561DXu {
    public abstract InterfaceC2257411DXf LIZIZ(AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfig, C2257611DXz c2257611DXz);

    public abstract AdOneStopLandingPageComponentStateConfig LIZJ(AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig);

    public final InterfaceC2257411DXf LIZ(View view, AdOneStopLandingPageComponentConfig adOneStopLandingPageComponentConfig, InterfaceC2257451DXj interfaceC2257451DXj) {
        AdOneStopLandingPageComponentMultiAnimationConfig animations;
        List listUnmodifiableList;
        AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfigLIZJ = LIZJ(adOneStopLandingPageComponentConfig);
        if (adOneStopLandingPageComponentStateConfigLIZJ == null || (animations = adOneStopLandingPageComponentStateConfigLIZJ.getAnimations()) == null) {
            return null;
        }
        List<InterfaceC2257601DXy> list = C2257611DXz.LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC2257601DXy> it2 = C2257611DXz.LIZJ.iterator();
        while (it2.hasNext()) {
            C1DY6 c1dy6LIZ = it2.next().LIZ(view, animations, interfaceC2257451DXj);
            if (c1dy6LIZ != null) {
                arrayList.add(c1dy6LIZ);
            }
        }
        if (!(!arrayList.isEmpty()) || (listUnmodifiableList = Collections.unmodifiableList(arrayList)) == null) {
            return null;
        }
        return LIZIZ(adOneStopLandingPageComponentStateConfigLIZJ, new C2257611DXz(listUnmodifiableList));
    }
}
