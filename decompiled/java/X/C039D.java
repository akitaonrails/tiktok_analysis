package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.039D, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039D extends C1002203vw<OrderSubmitAssemViewModel> implements C039H {
    @Override // X.C039H
    public final int UW() {
        return EnumC882203ca.CONTINUE.ordinal();
    }

    @Override // X.C039H
    public final HashMap<String, Object> hi1(boolean z) {
        BillInfoData billInfoData = LIZ().LLJJI;
        if (billInfoData != null) {
            return C7806033c.LJIIIIZZ(billInfoData, LIZ(), z);
        }
        return new HashMap<>();
    }

    @Override // X.C039H
    public final SpannableStringBuilder JZ0(Context context, AnonymousClass0376 anonymousClass0376) {
        return C039F.LIZ(context, anonymousClass0376, EnumC803903Cb.HAS_ICON);
    }
}
