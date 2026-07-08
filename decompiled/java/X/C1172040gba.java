package X;

import android.os.Bundle;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageSheetFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0gba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1172040gba {
    public static void LIZ(C19EG c19eg, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC1172050gbb interfaceC1172050gbb) {
        CollectionManageSheetFragment collectionManageSheetFragment = new CollectionManageSheetFragment();
        collectionManageSheetFragment.LL = interfaceC1172050gbb;
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_empty_collection", z);
        bundle.putBoolean("key_is_collaborative_collection", z2);
        bundle.putBoolean("key_is_want_to_go", z3);
        bundle.putBoolean("key_is_collection_public", z4);
        collectionManageSheetFragment.setArguments(bundle);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        c1390920mIc.LIZ.LLJJIJI = collectionManageSheetFragment;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, c19eg);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJI = numLIZJ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.show(c19eg.getSupportFragmentManager(), "CollectionManageSheetFragment");
    }
}
