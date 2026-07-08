package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03u4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C990603u4 {
    public static final C990603u4 LIZ = new C990603u4();
    public static Icon LIZIZ;
    public static boolean LIZJ;

    public static Pair LIZ(View view, ViewGroup viewGroup) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        return new Pair(Integer.valueOf(iArr[0] - iArr2[0]), Integer.valueOf((iArr[1] - iArr2[1]) + view.getHeight()));
    }
}
