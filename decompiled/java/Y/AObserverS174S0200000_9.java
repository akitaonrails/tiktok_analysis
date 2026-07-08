package Y;

import X.C01GW;
import X.C094D;
import X.C597380Nbs;
import X.C632260Or2;
import X.EnumC597350Nbp;
import X.InterfaceC898260ZLs;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profilerec.ui.ProfileRecFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS292S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AObserverS174S0200000_9 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS174S0200000_9 aObserverS174S0200000_9, Object obj) {
        C632260Or2 c632260Or2 = (C632260Or2) obj;
        if (((ProfileRecFragment) aObserverS174S0200000_9.l0).isAdded()) {
            InterfaceC898260ZLs interfaceC898260ZLs = (InterfaceC898260ZLs) ((C01GW) aObserverS174S0200000_9.l1).getValue();
            if (interfaceC898260ZLs != null) {
                interfaceC898260ZLs.AI2(c632260Or2.LIZ, "fyp_profile_popup", AFwS292S0000000_9.get$arr$(31));
            }
            Function2<? super Boolean, ? super Boolean, Unit> function2 = ((ProfileRecFragment) aObserverS174S0200000_9.l0).LL;
            if (function2 != null) {
                function2.invoke(Boolean.valueOf(c632260Or2.LIZIZ), null);
            }
        }
    }

    public static final void onChanged$1(AObserverS174S0200000_9 aObserverS174S0200000_9, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        if (!((Boolean) ((Function1) aObserverS174S0200000_9.l0).invoke(Integer.valueOf(followStatus.getFollowStatus()))).booleanValue()) {
            C094D c094d = (C094D) aObserverS174S0200000_9.l1;
            EnumC597350Nbp enumC597350Nbp = EnumC597350Nbp.LLILLJJLI;
            String userId = followStatus.getUserId();
            if (userId == null) {
                userId = "";
            }
            c094d.LJIIIIZZ(new C597380Nbs(enumC597350Nbp, userId));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS174S0200000_9(Object obj, ProfileRecFragment profileRecFragment, C01GW<? extends InterfaceC898260ZLs> c01gw) {
        this.$t = c01gw;
        this.l0 = obj;
        this.l1 = profileRecFragment;
    }
}
