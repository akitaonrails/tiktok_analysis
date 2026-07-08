package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.IAccountLoginMethodsService;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AwS0S1120000_13;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0XfX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class ViewOnClickListenerC854450XfX implements View.OnClickListener {
    public final /* synthetic */ BaseAccountFlowFragment LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    public ViewOnClickListenerC854450XfX(BaseAccountFlowFragment baseAccountFlowFragment, String str, boolean z, boolean z2) {
        this.LL = baseAccountFlowFragment;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        IAccountLoginMethodsService iAccountLoginMethodsService;
        C852500XcO c852500XcO = C852500XcO.LIZ;
        BaseAccountFlowFragment baseAccountFlowFragment = this.LL;
        String str2 = this.LLILLJJLI;
        boolean z = this.LLILLL;
        boolean z2 = this.LLILZ;
        c852500XcO.getClass();
        ArrayList arrayList = new ArrayList();
        C1247510iZJ c1247510iZJ = new C1247510iZJ();
        c1247510iZJ.LIZ = baseAccountFlowFragment.getString(2131835944);
        c1247510iZJ.LIZ(new AwS0S1120000_13(baseAccountFlowFragment, str2, z, z2, 0));
        arrayList.add(c1247510iZJ);
        C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
        c1247510iZJ2.LIZ = baseAccountFlowFragment.getString(2131835943);
        c1247510iZJ2.LIZ(new AwS0S1120000_13(baseAccountFlowFragment, str2, z, z2, 1));
        arrayList.add(c1247510iZJ2);
        if (!z && ((iAccountLoginMethodsService = (IAccountLoginMethodsService) PluggableExtentionKt.pluggableSpi$default(IAccountLoginMethodsService.class, false, false, false, 14, null)) == null || !iAccountLoginMethodsService.LIZJ() || iAccountLoginMethodsService.LJIIIZ())) {
            C1247510iZJ c1247510iZJ3 = new C1247510iZJ();
            c1247510iZJ3.LIZIZ(2131835945);
            c1247510iZJ3.LIZ(new AwS598S0100000_19(baseAccountFlowFragment, 95));
            arrayList.add(c1247510iZJ3);
        }
        C1390850mIV c1390850mIV = new C1390850mIV();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) arrayList.toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZ.LLJJIJI = baseAccountFlowFragment.getString(2131824500);
        TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
        FragmentManager fragmentManager = baseAccountFlowFragment.getFragmentManager();
        if (fragmentManager != null) {
            tuxActionSheetLIZJ.show(fragmentManager, "");
        }
        if (!this.LLILLL) {
            String enterFrom = this.LL.getEnterFrom();
            String enterMethod = this.LL.getEnterMethod();
            BaseAccountFlowFragment baseAccountFlowFragment2 = this.LL;
            if (baseAccountFlowFragment2.LLJJLIIIJLLLLLLLZ() == EnumC852910Xd3.PHONE_PASSWORD_LOGIN) {
                str = "phone";
            } else {
                Bundle arguments = baseAccountFlowFragment2.getArguments();
                if (arguments != null && arguments.getBoolean("is_from_username_login")) {
                    str = "handle";
                } else {
                    str = "email";
                }
            }
            C0XGR c0xgr = new C0XGR();
            c0xgr.LIZLLL("enter_from", enterFrom);
            c0xgr.LIZLLL("enter_method", enterMethod);
            c0xgr.LIZLLL("page", "login");
            c0xgr.LIZLLL("platform", str);
            C20684815ws.LJIILLIIL("password_unfold_other_methods", c0xgr.LIZ);
        }
    }
}
