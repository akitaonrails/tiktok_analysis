package X;

import com.ss.android.ugc.aweme.creative.model.FeedPropPinModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.verify.PlusButtonPinExperiment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nng, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448620nng {
    public static final void LIZ(Function2<? super String, ? super String, Unit> function2) {
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        String strLIZJ = fromGroupPropService.LIZJ();
        String strLIZLLL = fromGroupPropService.LIZLLL();
        function2.invoke("from_group_id_prop_list", strLIZJ);
        function2.invoke("from_group_id_prop_resource_list", strLIZLLL);
    }

    public static final String LIZJ(String str, FeedPropPinModel feedPropPinModel) {
        PlusButtonPinExperiment plusButtonPinExperiment = PlusButtonPinExperiment.INSTANCE;
        if (!plusButtonPinExperiment.getEnabled() || a0.LJJJIL(str) || !plusButtonPinExperiment.getAtLeastPin() || !Intrinsics.LJFF(str, feedPropPinModel.effectId)) {
            return "";
        }
        return "reuse";
    }

    public static final void LIZIZ(Function2<? super String, ? super String, Unit> function2, String str, FeedPropPinModel feedPropPinModel) {
        if (!PlusButtonPinExperiment.INSTANCE.getEnabled()) {
            return;
        }
        function2.invoke("prop_panel_pin_type", LIZJ(str, feedPropPinModel));
    }

    public static final boolean LIZLLL(String str, String str2, FeedPropPinModel feedPropPinModel) {
        if (PlusButtonPinExperiment.INSTANCE.getPinAndApply() && (!a0.LJJJIL(str)) && Intrinsics.LJFF(str2, "direct_shoot") && Intrinsics.LJFF(feedPropPinModel.effectId, str)) {
            return true;
        }
        return false;
    }
}
