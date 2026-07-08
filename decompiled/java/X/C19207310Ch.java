package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.10Ch, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19207310Ch extends LinearLayout implements InterfaceC1368280li6 {
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public C424620Gku LLILZ;
    public View LLILZIL;
    public TuxIconView LLILZLL;
    public View LLIZ;
    public TuxIconView LLIZLLLIL;

    @Override // X.InterfaceC1368280li6
    public final void LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load recent failed: ");
        sbLIZ.append(Unit.LIZ);
        C211000rc.LIZIZ("PushNewPopupView", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1368280li6
    public final void LLJJIJIL(List<IMContact> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load recent success size ");
        ArrayList arrayList = (ArrayList) list;
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" list:");
        sbLIZ.append(list);
        C2188811AlT.LIZIZ(sbLIZ);
        C211000rc.LIZ("PushNewPopupView");
        C211000rc.LIZ("[Push-New]");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IMContact iMContact = (IMContact) C13LP.LJJJLZIJ(i, list);
            if (iMContact instanceof IMUser) {
                C1324840ka2.LJFF(this.LLILZ, iMContact.getDisplayAvatar());
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:196:0x0399 A[PHI: r1
      0x0399: PHI (r1v22 int) = (r1v21 int), (r1v24 int), (r1v26 int) binds: [B:191:0x0369, B:193:0x0380, B:195:0x0397] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C19207310Ch(android.content.Context r19, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig r20) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19207310Ch.<init>(android.content.Context, com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig):void");
    }
}
