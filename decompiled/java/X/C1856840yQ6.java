package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS83S0500000_27;

/* JADX INFO: renamed from: X.0yQ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856840yQ6 {
    public static final /* synthetic */ int LIZ = 0;

    public static AwS83S0500000_27 LIZIZ(C19EG c19eg, Message message, InterfaceC665370Q7z interfaceC665370Q7z, TakoSharePreviewAbility takoSharePreviewAbility) {
        TakoMixFeed takoMixFeedLJIIIZ;
        List<BaseVideo> list;
        BaseVideo baseVideo;
        String str;
        if (!C298810BnT.LIZ() || c19eg == null || (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || (list = takoMixFeedLJIIIZ.videos) == null || (baseVideo = (BaseVideo) C13LP.LJJJLL(list)) == null || (str = baseVideo.videoUrl) == null || str.length() == 0) {
            return null;
        }
        return new AwS83S0500000_27(interfaceC665370Q7z, baseVideo, message, c19eg, takoSharePreviewAbility, 0);
    }

    public static List LIZ(View view, Message message, InterfaceC665370Q7z interfaceC665370Q7z, Context context, LifecycleCoroutineScope lifecycleCoroutineScope, Function0 function0) {
        List<BaseVideo> list;
        List<BaseVideo> list2;
        List<BaseVideo> list3;
        C1919007fQ.LIZ.getClass();
        List<BaseVideo> list4 = null;
        if (C1919007fQ.LIZLLL()) {
            C1857420yR2 c1857420yR2 = C1857420yR2.LIZ;
            ArrayList arrayList = new ArrayList();
            C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7z, message, "long_press", arrayList);
            C1857420yR2.LJ(view, interfaceC665370Q7z, message, "long_press", arrayList);
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                list2 = takoMixFeedLJIIIZ.videos;
            } else {
                list2 = null;
            }
            C1857420yR2.LJIJJ(arrayList, list2, message, interfaceC665370Q7z, view, "long_press");
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                list3 = takoMixFeedLJIIIZ2.videos;
            } else {
                list3 = null;
            }
            C1857420yR2.LJIJ(arrayList, list3, message, interfaceC665370Q7z, view, lifecycleCoroutineScope, "long_press", true);
            if (C298810BnT.LIZ() && function0 != null) {
                C1857420yR2.LJIILLIIL(8, view, interfaceC665370Q7z, message, null, arrayList, function0);
            }
            C1857420yR2.LIZLLL(arrayList, context, message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
            C1857420yR2.LJIIL(arrayList, view, message, interfaceC665370Q7z, false, null, 24);
            return arrayList;
        }
        C1857420yR2 c1857420yR22 = C1857420yR2.LIZ;
        ArrayList arrayList2 = new ArrayList();
        C1857420yR2.LJIIIIZZ(view, interfaceC665370Q7z, message, "long_press", arrayList2);
        C1857420yR2.LJ(view, interfaceC665370Q7z, message, "long_press", arrayList2);
        TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null) {
            list = takoMixFeedLJIIIZ3.videos;
        } else {
            list = null;
        }
        C1857420yR2.LJIJJ(arrayList2, list, message, interfaceC665370Q7z, view, "long_press");
        if (C298810BnT.LIZ() && function0 != null) {
            C1857420yR2.LJIILLIIL(8, view, interfaceC665370Q7z, message, null, arrayList2, function0);
        }
        C1857420yR2.LJIIL(arrayList2, view, message, interfaceC665370Q7z, false, null, 24);
        C1857420yR2.LIZLLL(arrayList2, context, message, C1858670yT3.LIZ(message, (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null)), interfaceC665370Q7z);
        TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ4 != null) {
            list4 = takoMixFeedLJIIIZ4.videos;
        }
        C1857420yR2.LJIJ(arrayList2, list4, message, interfaceC665370Q7z, view, lifecycleCoroutineScope, "long_press", true);
        return arrayList2;
    }
}
