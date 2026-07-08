package X;

import android.content.Context;
import com.ss.android.ugc.aweme.poi.osp.repo.model.DialogContent;
import com.ss.android.ugc.aweme.poi.osp.repo.model.PriceItem;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h9x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1193350h9x {
    public static final C1193350h9x LIZ = new C1193350h9x();

    public static void LIZ(Context context, PriceItem priceItem) {
        DialogContent dialogContent = priceItem.dialogInfo;
        if (dialogContent != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(dialogContent.title);
            c1397580mTM.LIZIZ(dialogContent.message);
            C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(dialogContent, 1098));
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }
}
