package X;

import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0Q7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C665290Q7r {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(C19EG c19eg, FragmentManager fragmentManager) {
        C128Y c128yLJJJJZI;
        C0Q88 c0q88;
        if (((C663640Q1i.LIZ() && fragmentManager != null) || (c19eg != null && (fragmentManager = c19eg.getSupportFragmentManager()) != null)) && (c128yLJJJJZI = fragmentManager.LJJJJZI("voice_search_contaienr")) != null && (c128yLJJJJZI instanceof C0Q88) && (c0q88 = (C0Q88) c128yLJJJJZI) != null) {
            c0q88.onBackPressed();
            return true;
        }
        return false;
    }
}
