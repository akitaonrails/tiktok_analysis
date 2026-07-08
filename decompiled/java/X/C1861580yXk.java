package X;

import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotHistory;
import com.ss.android.ugc.aweme.tako.botpage.actionbar.model.TakoActiveBotItem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: renamed from: X.0yXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861580yXk {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(IMessageAbility iMessageAbility) {
        C1860520yW2.LIZ.getClass();
        List<TakoActiveBotItem> list = C1860520yW2.LIZJ().items;
        ArrayList arrayList = new ArrayList();
        for (TakoActiveBotItem takoActiveBotItem : list) {
            if (takoActiveBotItem.isActive()) {
                arrayList.add(takoActiveBotItem);
            }
        }
        if (!arrayList.isEmpty()) {
            iMessageAbility.Uj0(C1861630yXp.LIZ(new AwS606S0100000_27(arrayList, (List<TakoActiveBotItem>) 7)));
            C1860520yW2 c1860520yW2 = C1860520yW2.LIZ;
            TakoActiveBotHistory takoActiveBotHistory = new TakoActiveBotHistory(new ArrayList());
            c1860520yW2.getClass();
            C1860520yW2.LJIL(takoActiveBotHistory);
        }
    }
}
