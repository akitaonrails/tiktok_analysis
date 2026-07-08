package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.tako.otherpage.image.detail.TakoViewLargeImageDialogFragment;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1856800yQ2 {
    public static TakoViewLargeImageDialogFragment LIZ(String str, Map map, List list, List list2) {
        TakoViewLargeImageDialogFragment takoViewLargeImageDialogFragment = new TakoViewLargeImageDialogFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "data", new C1857700yRU(list, str, true, map, list2));
        takoViewLargeImageDialogFragment.setArguments(bundle);
        return takoViewLargeImageDialogFragment;
    }
}
