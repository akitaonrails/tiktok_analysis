package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity;
import com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$Companion$addResult$1;

/* JADX INFO: renamed from: X.0Xaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C851380Xaa {
    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZIZ(Activity activity, AbstractC854370XfP abstractC854370XfP, EnumC852660Xce enumC852660Xce, Bundle bundle, C0XTR c0xtr) {
        Intent intent = new Intent(activity, (Class<?>) CommonFlowActivity.class);
        intent.putExtras(bundle);
        intent.putExtra("flow", abstractC854370XfP);
        intent.putExtra("current_scene", enumC852660Xce.getValue());
        intent.putExtra("callback_action_type", enumC852660Xce.getValue());
        int value = enumC852660Xce.getValue();
        if (c0xtr != null) {
            CommonFlowActivity.LLJIJIL.put(value, c0xtr);
            if (activity instanceof LifecycleOwner) {
                LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
                C0R1H.LIZIZ(lifecycleOwner, new CommonFlowActivity$Companion$addResult$1(value, lifecycleOwner));
            }
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, activity);
        C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEphJ4lFOmRb++2QZBTDC6P+uBL07lvwdo=", null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Activity activity, EnumC852910Xd3 enumC852910Xd3, EnumC852660Xce enumC852660Xce, Bundle bundle, C0XTR c0xtr, Class cls) {
        int i = bundle.getInt("current_scene", -1);
        if (i != -1) {
            bundle.putInt("last_scene", i);
        }
        if (cls == null) {
            cls = CommonFlowActivity.class;
        }
        Intent intent = new Intent(activity, (Class<?>) cls);
        bundle.putInt("next_page", enumC852910Xd3.getValue());
        bundle.putInt("current_scene", enumC852660Xce.getValue());
        intent.putExtras(bundle);
        intent.putExtra("callback_action_type", enumC852660Xce.getValue());
        String string = bundle.getString("enter_from_item");
        if (string == null) {
            string = "";
        }
        intent.putExtra("enter_from_item", string);
        int value = enumC852660Xce.getValue();
        if (c0xtr != null) {
            CommonFlowActivity.LLJIJIL.put(value, c0xtr);
            if (activity instanceof LifecycleOwner) {
                LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
                C0R1H.LIZIZ(lifecycleOwner, new CommonFlowActivity$Companion$addResult$1(value, lifecycleOwner));
            }
        }
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonFlowActivity.openPage(step: ");
        sbLIZ.append(enumC852910Xd3);
        sbLIZ.append("; enterFrom: ");
        sbLIZ.append(bundle.getString("enter_from_item"));
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (C852950Xd7.LIZ.contains(enumC852910Xd3)) {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Activity_startActivityForResult_2");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIIZILJ(1, activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEphJ4lFOmRb++2QZBTDC6P+uBL07lvwdo=", null));
        } else {
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, activity);
            C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOurYJDb0ibECfF1owsk1PEphJ4lFOmRb++2QZBTDC6P+uBL07lvwdo=", null));
        }
    }
}
