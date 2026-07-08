package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.slideslip.view.CarouselLayoutManager;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0sWH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1630030sWH extends AbstractC1585810rMx {
    public final C1627130sRb LL;
    public final CarouselLayoutManager LLILLJJLI;
    public final C20636015p0 LLILLL;
    public final Function1<Integer, InterfaceC1626470sQX> LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ = true;

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        Integer num;
        View viewLJFF = LJFF(this.LLILLJJLI);
        Object tag = null;
        if (viewLJFF != null) {
            tag = viewLJFF.getTag();
        }
        if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
            int iIntValue = num.intValue();
            if (i != 0) {
                if (i == 1) {
                    this.LLILZLL = true;
                    return;
                }
                return;
            }
            int i2 = this.LLILZIL;
            if (i2 != iIntValue || this.LLILZLL) {
                this.LL.LJI.invoke(Integer.valueOf(i2), Integer.valueOf(iIntValue), Boolean.valueOf(!this.LLILZLL), Boolean.valueOf(this.LLIZ), this.LLILZ.invoke(Integer.valueOf(this.LLILZIL)), this.LLILZ.invoke(Integer.valueOf(iIntValue)));
                this.LLILZLL = false;
                this.LLILZIL = iIntValue;
            }
            this.LLIZ = true;
        }
    }

    public C1630030sWH(C1627130sRb c1627130sRb, CarouselLayoutManager carouselLayoutManager, C20636015p0 c20636015p0, C1629820sVw c1629820sVw) {
        this.LL = c1627130sRb;
        this.LLILLJJLI = carouselLayoutManager;
        this.LLILLL = c20636015p0;
        this.LLILZ = c1629820sVw;
    }
}
