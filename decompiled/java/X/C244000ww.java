package X;

import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import java.util.List;

/* JADX INFO: renamed from: X.00ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244000ww {
    public final /* synthetic */ C1112330f3H LIZ;

    public C244000ww(C1112330f3H c1112330f3H) {
        this.LIZ = c1112330f3H;
    }

    public final void LIZ(C1109770ez9 c1109770ez9) {
        List<InterfaceC1112400f3O> listZ51 = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Z51(((CapsuleMessage) this.LIZ.LJIL).capsuleType);
        C1112330f3H c1112330f3H = this.LIZ;
        if (listZ51 != null) {
            for (InterfaceC1112400f3O interfaceC1112400f3O : listZ51) {
                if (interfaceC1112400f3O != null && interfaceC1112400f3O.LJIIJJI(c1112330f3H)) {
                    return;
                }
            }
        }
    }
}
