package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.EcMallLoginHelper;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776060wJo implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
            case 2:
                onAccountResult$2(this, i, z, i2, user);
                break;
            case 3:
                onAccountResult$3(this, i, z, i2, user);
                break;
        }
    }

    public C1776060wJo(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C1776060wJo c1776060wJo, int i, boolean z, int i2, User user) {
        ArrayList<InterfaceC586170Myt> arrayList = ((EcMallLoginHelper) c1776060wJo.l0).LIZIZ;
        if (arrayList != null) {
            Iterator<InterfaceC586170Myt> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next().onAccountResult(i, z, 0, user);
            }
        }
    }

    public static final void onAccountResult$1(C1776060wJo c1776060wJo, int i, boolean z, int i2, User user) {
        if (i == 1 && z) {
            ((Function0) c1776060wJo.l0).invoke();
        }
    }

    public static final void onAccountResult$2(C1776060wJo c1776060wJo, int i, boolean z, int i2, User user) {
        if (z && i == 1) {
            ((Function0) c1776060wJo.l0).invoke();
        }
        IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
        if (iAccountService != null) {
            iAccountService.LJI(c1776060wJo);
        }
    }

    public static final void onAccountResult$3(C1776060wJo c1776060wJo, int i, boolean z, int i2, User user) {
        if (z) {
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopByteSync BytesyncPush=====  account log in or log out");
            ((C1769640w9S) c1776060wJo.l0).LL = EnumC1769650w9T.HANDLE_BYTESYNC_DELAYED;
        }
    }
}
