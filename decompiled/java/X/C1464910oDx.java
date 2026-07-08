package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0oDx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1464910oDx extends C124T {
    @Override // X.C124T
    public final void LIZ() {
        boolean z;
        C1403010mc7.LIZ.getWikiService().getClass();
        AnchorListManager.LIZ.getClass();
        List listLJI = AnchorListManager.LJI();
        ArrayList arrayList = (ArrayList) listLJI;
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((AnchorPublishStruct) ListProtector.get(listLJI, i)).type == EnumC1430380nKG.WIKIPEDIA.getTYPE()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        if (C0CHQ.LIZ().getAccountService().LIZ() || !z || C1456840o0w.LIZ) {
            C786410Ut5.LJZL(8, this.LLJLL);
        } else {
            C786410Ut5.LJZL(0, this.LLJLL);
        }
        C786410Ut5.R7(this.LLJLL, new ACListenerS163S0100000_29((Object) this, 109));
    }

    public C1464910oDx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
