package X;

import Y.ARunnableS48S0300000_15;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.avatar.MultiGuestAvatarPreviewFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C935830aSb extends C2217421BqW implements Function0<Unit> {
    public C935830aSb(Object obj) {
        super(0, obj, MultiGuestAvatarPreviewFragment.class, "onCustomizeClick", "onCustomizeClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MultiGuestAvatarPreviewFragment multiGuestAvatarPreviewFragment = (MultiGuestAvatarPreviewFragment) this.receiver;
        multiGuestAvatarPreviewFragment.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - multiGuestAvatarPreviewFragment.LLJJL >= 1000) {
            multiGuestAvatarPreviewFragment.LLJJL = jCurrentTimeMillis;
            Function0<Unit> function0 = multiGuestAvatarPreviewFragment.LLILZIL;
            if (function0 != null) {
                function0.invoke();
            }
            View view = multiGuestAvatarPreviewFragment.getView();
            FragmentManager fragmentManager = multiGuestAvatarPreviewFragment.LLJIJIL;
            InterfaceC934710aQn.jc.LJFF(Boolean.TRUE);
            if (view != null) {
                HandlerHook.viewPost(view, new ARunnableS48S0300000_15(view, fragmentManager, multiGuestAvatarPreviewFragment, 3));
            }
            C924610aAV.LIZ(C917520Zz4.LJI(), C930540aK4.LJ() ? 1 : 0, "customize", !multiGuestAvatarPreviewFragment.LLJJJJ, null, null, null);
        }
        return Unit.LIZ;
    }
}
