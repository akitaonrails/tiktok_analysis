package X;

import com.ss.android.ugc.aweme.account.login.passkey.management.PasskeyCreateFragment;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.ArchivePageViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.InboxArchiveFragment;

/* JADX INFO: renamed from: X.0Zt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public class C913810Zt5 extends AbstractC2173821A5s {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC2173821A5s
    public final void LIZIZ() {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this);
                break;
            case 1:
                LIZIZ$1(this);
                break;
            default:
                super.LIZIZ();
                break;
        }
    }

    public static final void LIZIZ$0(C913810Zt5 c913810Zt5) {
        C19EG activity = ((PasskeyCreateFragment) c913810Zt5.l0).getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public static final void LIZIZ$1(C913810Zt5 c913810Zt5) {
        String str;
        C878950Ydx c878950Ydx;
        InterfaceC884640Yn8 config;
        int i = C880860Yh2.LIZ[((InboxArchiveFragment) c913810Zt5.l0).SR().getState().LLILLJJLI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int size = ArchivePageViewModel.vQ2(((InboxArchiveFragment) c913810Zt5.l0).SR()).size();
                ((InboxArchiveFragment) c913810Zt5.l0).SR().wQ2(EnumC880850Yh1.NORMAL);
                C885310YoD c885310YoD = C885310YoD.LIZ;
                InterfaceC884020Ym8 interfaceC884020Ym8 = ((InboxArchiveFragment) c913810Zt5.l0).SR().LL;
                InterfaceC879010Ye3 key = null;
                if (interfaceC884020Ym8 != null && (config = interfaceC884020Ym8.getConfig()) != null) {
                    key = config.getKey();
                }
                if (!(key instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) key) == null || (str = c878950Ydx.LLILLJJLI) == null) {
                    str = "archive_page";
                }
                c885310YoD.LJ(size, str, "direct_click", "cancel_back", null);
                return;
            }
            throw new C1954807lC();
        }
        C19EG activity = ((InboxArchiveFragment) c913810Zt5.l0).getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C913810Zt5(Object obj, int i) {
        super(true);
        this.$t = i;
        this.l0 = obj;
    }
}
