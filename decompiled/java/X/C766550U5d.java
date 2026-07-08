package X;

import com.bytedance.android.live.effect.model.EffectDataRestoreSucc;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0U5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766550U5d {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, C0U78 c0u78, DataChannel dataChannel) {
        C0U74 c0u74;
        List<T> list2;
        LiveEffect liveEffect;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("restoreNewBeauty, liveEffectPanelList#size=");
        sbLIZ.append(list.size());
        C20441214yg.LJIIIZ("MultiGuestEffectStoreManager", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0U74 c0u742 = (C0U74) it2.next();
            arrayList.addAll(c0u742.LIZIZ);
            Iterator it3 = c0u742.LIZIZ.iterator();
            while (it3.hasNext()) {
                List<LiveEffect> listLL = ((LiveEffect) it3.next()).LL();
                if (listLL == null) {
                    listLL = C13BV.INSTANCE;
                }
                arrayList.addAll(listLL);
            }
        }
        c0u78.LJJII("liveguestbeauty", arrayList);
        List<LiveEffect> listLJ = c0u78.LJ("liveguestbeauty");
        if (listLJ.isEmpty() && (c0u74 = (C0U74) C13LP.LJJJLL(list)) != null && (list2 = c0u74.LIZIZ) != 0 && (liveEffect = (LiveEffect) C13LP.LJJJLL(list2)) != null) {
            c0u78.kr(liveEffect, "liveguestbeauty");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C19719612Di.LJJI(((C0U74) it4.next()).LIZIZ, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (true ^ listLJ.contains(obj)) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            LiveEffect liveEffect2 = (LiveEffect) obj2;
            if (!C0U7C.LJIILJJIL(liveEffect2) && !liveEffect2.LJJIJIIJI() && !liveEffect2.LJIILIIL()) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : arrayList4) {
            boolean z = false;
            for (LiveEffect.ComposerConfig composerConfig : ((LiveEffect) obj3).LJJJZ()) {
                composerConfig.LIZ = composerConfig.LIZIZ;
                if (composerConfig.defaultValue != 0) {
                    z = true;
                }
            }
            if (z) {
                arrayList5.add(obj3);
            }
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            c0u78.kr((LiveEffect) it5.next(), "liveguestbeauty");
        }
        if (dataChannel != null) {
            dataChannel.FQ2(EffectDataRestoreSucc.class);
        }
    }
}
