package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.18Jk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21264218Jk implements InterfaceC21263418Jc {
    public final String LL;
    public final int[] LLILLJJLI;
    public final EnumC21153717qJ LLILLL;
    public final EnumC21263618Je LLILZ;
    public final EnumC714840S2g LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;

    @Override // X.InterfaceC21263418Jc
    public final void LJII() {
    }

    @Override // X.InterfaceC21263418Jc
    public final InterfaceC21263718Jf LJFF() {
        C21265018Js c21265018Js = C20673215v0.LIZ;
        return (c21265018Js == null || !c21265018Js.LJ) ? C21264318Jl.LIZ : new InterfaceC21263718Jf() { // from class: X.18Jm
            @Override // X.InterfaceC21263718Jf
            public final View LIZ(Context context, int i, ViewGroup viewGroup) {
                return C20742916Ex.LIZ(context, i, viewGroup, false, -1);
            }
        };
    }

    @Override // X.InterfaceC21263418Jc
    public final int LIZJ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC21263418Jc
    public final EnumC21153717qJ LIZLLL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC21263418Jc
    public final int[] LJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC21263418Jc
    public final EnumC21263618Je LJIIIIZZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC21263418Jc
    public final String LJIIIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC21263418Jc
    public final EnumC714840S2g threadMode() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC21263418Jc
    public final ViewGroup LJI(Context context) {
        return new FrameLayout(context);
    }

    public C21264218Jk(String str, int[] iArr, EnumC21153717qJ enumC21153717qJ, EnumC21263618Je enumC21263618Je, EnumC714840S2g enumC714840S2g, int i, int i2) {
        this.LL = str;
        this.LLILLJJLI = iArr;
        this.LLILLL = enumC21153717qJ;
        this.LLILZ = enumC21263618Je;
        this.LLILZIL = enumC714840S2g;
        this.LLILZLL = i;
        this.LLIZ = i2;
    }
}
