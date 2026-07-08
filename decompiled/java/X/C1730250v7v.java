package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.TemplateEditFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;

/* JADX INFO: renamed from: X.0v7v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1730250v7v {
    public static void LIZ(LifecycleOwner lifecycleOwner, TemplateItem templateItem, InterfaceC1730270v7x interfaceC1730270v7x, InterfaceC1729710v73 interfaceC1729710v73, long j, long j2) {
        FragmentManager fragmentManager;
        if (!(lifecycleOwner instanceof Fragment) || (fragmentManager = ((Fragment) lifecycleOwner).getFragmentManager()) == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TemplateEditFragment templateEditFragment = new TemplateEditFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "extras_template_item", templateItem);
        bundle.putLong("start_click_time", System.currentTimeMillis());
        bundle.putLong("create_time", j);
        bundle.putLong("server_time", j2);
        bundle.putInt("schema", 0);
        templateEditFragment.setArguments(bundle);
        templateEditFragment.LLILZIL = interfaceC1730270v7x;
        templateEditFragment.LLILZLL = interfaceC1729710v73;
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = templateEditFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLLL = false;
        c1390920mIc.LJIIIIZZ(1);
        C844470XAv.LIZ.getClass();
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = (int) (C14KQ.LJI(C844470XAv.LIZ())[1] * 0.9f);
        tuxSheet2.LLJLL = true;
        tuxSheet2.show(fragmentManager, TemplateEditFragment.class.getName());
    }
}
