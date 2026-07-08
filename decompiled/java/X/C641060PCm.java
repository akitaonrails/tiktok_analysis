package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PCm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641060PCm extends AbstractC1585810rMx {
    public static final int[] LLJ = new int[2];
    public final ViewGroup LL;
    public SearchServiceCenter$AutoPlayAbility LLILZ;
    public volatile boolean LLILZIL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLILLJJLI = -1;
    public ArrayList<View> LLILLL = new ArrayList<>();
    public final C0R4E LLILZLL = new C0R4E(this, 7);

    public final void LJJIZ() {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLJJIJIIJIL;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLJJIJIIJIL2;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLJJIJIIJIL3;
        if (this.LLILLL == null || !(!r0.isEmpty())) {
            ViewGroup viewGroup = this.LL;
            if (viewGroup != null && viewGroup.getVisibility() == 0) {
                LJJIL(viewGroup);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("requestToPlay is empty, re calculate size= ");
            sbLIZ.append(this.LLILLL.size());
            C2188811AlT.LIZIZ(sbLIZ);
            if (this.LLILLL == null || !(!r0.isEmpty())) {
                return;
            }
        }
        ArrayList<View> arrayList = this.LLILLL;
        if (arrayList == null || arrayList.isEmpty()) {
            searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.LLILLL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("calculateAbilityCarrier, tmpList.size: ");
            sbLIZ2.append(arrayList2.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            int size = arrayList2.size();
            if (size == 1) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("calculateAbilityCarrier, autoPlayElement: ");
                sbLIZ3.append(ListProtector.get(arrayList2, 0));
                C2188811AlT.LIZIZ(sbLIZ3);
                searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = LJJIJIIJIL((View) ListProtector.get(arrayList2, 0));
            } else if (size != 2) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("calculateAbilityCarrier, autoPlayElement: ");
                sbLIZ4.append(ListProtector.get(arrayList2, 0));
                C2188811AlT.LIZIZ(sbLIZ4);
                searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = LJJIJIIJIL((View) ListProtector.get(arrayList2, 0));
            } else {
                View view = (View) ListProtector.get(arrayList2, 0);
                View view2 = (View) ListProtector.get(arrayList2, 1);
                int iLIZLLL = (int) (((double) C11VU.LIZLLL(view.getContext())) * 0.8d);
                int[] iArr = LLJ;
                view2.getLocationOnScreen(iArr);
                if (iArr[1] <= iLIZLLL) {
                    searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = LJJIJIIJIL(view2);
                    if (view.getTag(R.id.p7s) != null && (searchServiceCenter$AutoPlayAbilityLJJIJIIJIL3 = LJJIJIIJIL(view)) != null) {
                        searchServiceCenter$AutoPlayAbilityLJJIJIIJIL3.LLZZZZ();
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("judgeAutoPlayElement, secondElement called, autplay = ");
                    sbLIZ5.append(view2.getClass());
                    C2188811AlT.LIZIZ(sbLIZ5);
                } else {
                    searchServiceCenter$AutoPlayAbilityLJJIJIIJIL = LJJIJIIJIL(view);
                    if (view2.getTag(R.id.p7s) != null && (searchServiceCenter$AutoPlayAbilityLJJIJIIJIL2 = LJJIJIIJIL(view2)) != null) {
                        searchServiceCenter$AutoPlayAbilityLJJIJIIJIL2.LLZZZZ();
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("judgeAutoPlayElement, firstElement called, autplay = ");
                    sbLIZ6.append(view.getClass());
                    C2188811AlT.LIZIZ(sbLIZ6);
                }
            }
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("requestToPlay, newAutoPlayAbility: ");
        sbLIZ7.append(searchServiceCenter$AutoPlayAbilityLJJIJIIJIL);
        sbLIZ7.append(", currentAbility: ");
        sbLIZ7.append(this.LLILZ);
        C2188811AlT.LIZIZ(sbLIZ7);
        if (!Intrinsics.LJFF(searchServiceCenter$AutoPlayAbilityLJJIJIIJIL, this.LLILZ) && (searchServiceCenter$AutoPlayAbility2 = this.LLILZ) != null) {
            searchServiceCenter$AutoPlayAbility2.LLZZZZ();
        }
        this.LLILZ = searchServiceCenter$AutoPlayAbilityLJJIJIIJIL;
        if ((searchServiceCenter$AutoPlayAbilityLJJIJIIJIL != null && searchServiceCenter$AutoPlayAbilityLJJIJIIJIL.isPlaying()) || this.LLILZIL || (searchServiceCenter$AutoPlayAbility = this.LLILZ) == null) {
            return;
        }
        searchServiceCenter$AutoPlayAbility.J0();
    }

    public C641060PCm(ViewGroup viewGroup) {
        ViewTreeObserver viewTreeObserver;
        this.LL = viewGroup;
        if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
            C0R4E c0r4e = this.LLILZLL;
            viewTreeObserver.addOnGlobalLayoutListener(c0r4e);
            C2187701Ajg.LIZ(viewTreeObserver, c0r4e, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static SearchServiceCenter$AutoPlayAbility LJJIJIIJIL(View view) {
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        if (view == null || (interfaceC665370Q7zLJIIL = C1558360qeg.LJIIL(view, null, 3)) == null) {
            return null;
        }
        return (SearchServiceCenter$AutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, SearchServiceCenter$AutoPlayAbility.class, null);
    }

    public final void LJJIL(View view) {
        if (view != null && view.getVisibility() == 0) {
            if (!(view instanceof C661440Px0) && !(view instanceof C658550PsL) && view.getTag(R.id.p7s) == null) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        LJJIL(viewGroup.getChildAt(i));
                    }
                    return;
                }
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("iterateAutoPlayElement, isSearchAutoplayNode: ");
            sbLIZ.append(view);
            C2188811AlT.LIZIZ(sbLIZ);
            if (!this.LLILLL.contains(view) && view.getHeight() > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("iterateAutoPlayElement, add item: ");
                sbLIZ2.append(view);
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LLILLL.add(view);
                int iMin = Math.min(this.LLILLL.size(), 2);
                int i2 = iMin - 1;
                int i3 = 0;
                while (i3 < i2) {
                    View view2 = (View) ListProtector.get(this.LLILLL, i3);
                    int[] iArr = LLJ;
                    view2.getLocationOnScreen(iArr);
                    int i4 = iArr[1];
                    int i5 = i3 + 1;
                    for (int i6 = i5; i6 < iMin; i6++) {
                        ((View) ListProtector.get(this.LLILLL, i6)).getLocationOnScreen(iArr);
                        int i7 = iArr[1];
                        if (1 <= i7 && i7 < i4) {
                            Object obj = ListProtector.get(this.LLILLL, i3);
                            ArrayList<View> arrayList = this.LLILLL;
                            ListProtector.set(arrayList, i3, ListProtector.get(arrayList, i6));
                            ListProtector.set(this.LLILLL, i6, obj);
                        }
                    }
                    i3 = i5;
                }
                ArrayList<View> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.LLILLL.subList(0, iMin));
                this.LLILLL = arrayList2;
            }
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        C0Q17 c0q17LJIIJ;
        if (i != 0 && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null && (c0q17LJIIJ = interfaceC657510PqfLIZLLL.LJIIJ()) != null) {
            c0q17LJIIJ.LJ();
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        boolean zIsPlaying;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL;
        C0Q17 c0q17LJIIJ;
        if (Math.abs(i2) > 0 && (interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL()) != null && (c0q17LJIIJ = interfaceC657510PqfLIZLLL.LJIIJ()) != null) {
            c0q17LJIIJ.LJ();
        }
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = this.LLILZ;
        if (searchServiceCenter$AutoPlayAbility != null) {
            zIsPlaying = searchServiceCenter$AutoPlayAbility.isPlaying();
        } else {
            zIsPlaying = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isPlaying: ");
        sbLIZ.append(zIsPlaying);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!zIsPlaying) {
            return;
        }
        int i3 = this.LLIZ + i2;
        this.LLIZ = i3;
        int iAbs = Math.abs(i3 - this.LLIZLLLIL);
        if (iAbs <= 30) {
            return;
        }
        this.LLIZLLLIL = this.LLIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onScrolled called diff = ");
        sbLIZ2.append(iAbs);
        C2188811AlT.LIZIZ(sbLIZ2);
        LJJIZ();
    }
}
