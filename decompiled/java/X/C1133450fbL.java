package X;

import Y.ARunnableS109S0100000_9;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1133450fbL {
    public static void LIZIZ(List list) {
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AssetsModel assetsModel = (AssetsModel) it2.next();
                ArrayList arrayList = (ArrayList) C1133460fbM.LIZ;
                if (!arrayList.contains(Long.valueOf(assetsModel.id))) {
                    arrayList.add(Long.valueOf(assetsModel.id));
                }
            }
        }
    }

    public static C11JF LIZ(Collection collection, final Function0 function0, final Function0 function02) {
        long id;
        if (C1133460fbM.LIZIZ && GiftReceiveFlowFluencyOptSetting.INSTANCE.getAssetsModelCacheOpt()) {
            if (!collection.isEmpty()) {
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (C1138640fji.LIZLLL(((Number) it2.next()).longValue()) != null) {
                    }
                }
            }
            if (function0 != null) {
                function0.invoke();
            }
            return null;
        }
        Set<Long> currentEffectSet = GiftManager.inst().getCurrentEffectSet();
        if (!currentEffectSet.containsAll(collection) && (!collection.isEmpty())) {
            Iterator it3 = collection.iterator();
            while (it3.hasNext()) {
                long jLongValue = ((Number) it3.next()).longValue();
                if (!currentEffectSet.contains(Long.valueOf(jLongValue))) {
                    currentEffectSet.add(Long.valueOf(jLongValue));
                }
            }
        }
        if (!currentEffectSet.isEmpty()) {
            C1133460fbM.LIZIZ = true;
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        return C1138640fji.LJIIIZ(4, id, currentEffectSet, new InterfaceC1133140faq() { // from class: X.0N4u
            @Override // X.InterfaceC1133140faq
            public final void onFailed() {
                C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS109S0100000_9(function02, 153));
            }

            @Override // X.InterfaceC1133140faq
            public final void onSuccess() {
                C786410Ut5.LJJZZIII(C473410IhP.LIZ(), new ARunnableS109S0100000_9(function0, 154));
            }
        });
    }
}
