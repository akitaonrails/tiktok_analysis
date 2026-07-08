package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Hjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C449460Hjs extends AbstractC444180HbM implements InterfaceC449500Hjw {
    public static int LLJ;
    public final InterfaceC449820HkS LLILLJJLI;
    public final C0H3E LLILLL;
    public final C449450Hjr LLILZ;
    public boolean LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C054G LLIZLLLIL;

    public final void LIZJ() {
        C0H3E c0h3e = this.LLILLL;
        InterfaceC444050Hb9 interfaceC444050Hb9 = this.LLILZ.LIZ;
        int iAl = interfaceC444050Hb9 == null ? 0 : interfaceC444050Hb9.Al();
        InterfaceC444050Hb9 interfaceC444050Hb92 = this.LLILZ.LIZ;
        int iLJIIJJI = interfaceC444050Hb92 == null ? 0 : interfaceC444050Hb92.LJIIJJI();
        InterfaceC444050Hb9 interfaceC444050Hb93 = this.LLILZ.LIZ;
        int iLIZJ = interfaceC444050Hb93 != null ? interfaceC444050Hb93.LIZJ() : 0;
        C0H3B c0h3b = c0h3e.LIZ;
        if (c0h3b.LL != iAl || c0h3b.LLILLJJLI != iLJIIJJI || c0h3b.LLILLL != iLIZJ) {
            c0h3b.LL = iAl;
            c0h3b.LLILLL = iLIZJ;
            ((ArrayList) c0h3b.LLILZ).clear();
            for (int i = 0; i < iAl; i++) {
                C0H3D c0h3d = new C0H3D();
                c0h3d.LIZIZ = R.drawable.bpv;
                ((ArrayList) c0h3b.LLILZ).add(c0h3d);
                if (i == iLJIIJJI) {
                    c0h3b.LLILLJJLI = iLJIIJJI;
                    ((C0H3D) ListProtector.get(c0h3b.LLILZ, iLJIIJJI)).LIZ = true;
                }
            }
            c0h3b.notifyDataSetChanged();
        }
        C786410Ut5.LLIZLLLIL((RecyclerView) this.LLIZ.getValue(), 0);
    }

    @Override // X.InterfaceC449500Hjw
    public final C449450Hjr LIZIZ() {
        return this.LLILZ;
    }

    public C449460Hjs(InterfaceC449820HkS interfaceC449820HkS, C449490Hjv c449490Hjv, ViewGroup viewGroup) {
        int iLJIIJJI;
        super(viewGroup, R.layout.c3u);
        this.LLILLJJLI = interfaceC449820HkS;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1302));
        this.LLILZLL = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1301));
        this.LLIZ = c01gwLIZIZ2;
        this.LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZ);
        C449450Hjr c449450Hjr = new C449450Hjr(c449490Hjv);
        this.LLILZ = c449450Hjr;
        ((ViewPager) c01gwLIZIZ.getValue()).setAdapter(new C449510Hjx(interfaceC449820HkS, this, (C117T) c01gwLIZIZ.getValue()));
        this.LLILLL = new C0H3E((RecyclerView) c01gwLIZIZ2.getValue());
        LIZJ();
        ((ViewPager) c01gwLIZIZ.getValue()).addOnPageChangeListener(new C360660ECa() { // from class: X.0Hjt
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                C449460Hjs c449460Hjs = this.LL;
                int i2 = 0;
                c449460Hjs.LLILZIL = false;
                C449450Hjr c449450Hjr2 = c449460Hjs.LLILZ;
                if (i < 0) {
                    c449450Hjr2.getClass();
                } else {
                    int iAl = 0;
                    while (true) {
                        if (i2 >= ((ArrayList) c449450Hjr2.LIZJ).size()) {
                            break;
                        }
                        InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) ListProtector.get(c449450Hjr2.LIZJ, i2);
                        if (i < interfaceC444050Hb9.Al() + iAl) {
                            c449450Hjr2.LIZLLL = i2;
                            c449450Hjr2.LIZ = interfaceC444050Hb9;
                            interfaceC444050Hb9.LJIIIIZZ(i - iAl);
                            break;
                        }
                        iAl += interfaceC444050Hb9.Al();
                        i2++;
                    }
                }
                C449460Hjs c449460Hjs2 = this.LL;
                C449460Hjs.LLJ = c449460Hjs2.LLILZ.LIZLLL;
                c449460Hjs2.LIZJ();
            }
        });
        this.LLILZIL = true;
        int i = LLJ;
        if (i >= 0 && i < ((ArrayList) c449450Hjr.LIZJ).size()) {
            c449450Hjr.LIZLLL = i;
            c449450Hjr.LIZ = (InterfaceC444050Hb9) ListProtector.get(c449450Hjr.LIZJ, i);
        }
        Iterator it2 = ((ArrayList) c449450Hjr.LIZJ).iterator();
        int iAl = 0;
        while (true) {
            if (it2.hasNext()) {
                InterfaceC444050Hb9 interfaceC444050Hb9 = (InterfaceC444050Hb9) it2.next();
                InterfaceC444050Hb9 interfaceC444050Hb92 = c449450Hjr.LIZ;
                if (interfaceC444050Hb9 == interfaceC444050Hb92) {
                    iLJIIJJI = interfaceC444050Hb92.LJIIJJI() + iAl;
                    break;
                }
                iAl += interfaceC444050Hb9.Al();
            } else {
                iLJIIJJI = 0;
                break;
            }
        }
        ((ViewPager) this.LLILZLL.getValue()).setCurrentItem(iLJIIJJI, false);
        if (this.LLILZIL && iLJIIJJI == 0) {
            this.LLILZIL = false;
            ((ViewPager) this.LLILZLL.getValue()).getCurrentItem();
            this.LLILLJJLI.E0();
        }
    }
}
