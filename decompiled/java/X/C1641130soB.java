package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0soB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641130soB extends C09AY implements Function1<C1641150soD, Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C1641120soA LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ Function1<C1641170soF, Unit> LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1641130soB(Context context, float f, float f2, int i, C1641120soA c1641120soA, int i2, int i3, boolean z, int i4, int i5, boolean z2, Function1<? super C1641170soF, Unit> function1) {
        super(1);
        this.LL = context;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
        this.LLILZ = i;
        this.LLILZIL = c1641120soA;
        this.LLILZLL = i2;
        this.LLIZ = i3;
        this.LLIZLLLIL = z;
        this.LLJ = i4;
        this.LLJI = i5;
        this.LLJIJIL = z2;
        this.LLJILJIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1641150soD c1641150soD) {
        int i;
        int i2;
        int i3;
        C1641150soD c1641150soD2 = c1641150soD;
        c1641150soD2.LJ = (int) C1641090so7.LIZIZ(this.LLILLJJLI, this.LL);
        c1641150soD2.LJFF = (int) C1641090so7.LIZIZ(this.LLILLL, this.LL);
        int i4 = this.LLILZ;
        c1641150soD2.LJI = i4;
        c1641150soD2.LJII = i4;
        C1641120soA c1641120soA = this.LLILZIL;
        c1641150soD2.LIZIZ = c1641120soA.LIZ;
        c1641150soD2.LJIIZILJ = true;
        c1641150soD2.LJIIIZ = c1641120soA.LJIIZILJ;
        c1641150soD2.LJIILLIIL = c1641120soA.LJIJ;
        c1641150soD2.LJJIIJ = c1641120soA.LJIJI;
        c1641150soD2.LJJIIJZLJL = c1641120soA.LJIJJ;
        c1641150soD2.LJIIJ = c1641120soA.LJIJJLI;
        c1641150soD2.LJIIJJI = c1641120soA.LJIL;
        c1641150soD2.LJIIL = this.LLILZLL;
        c1641150soD2.LJIILIIL = this.LLIZ;
        c1641150soD2.LJIJJLI = c1641120soA.LIZIZ;
        c1641150soD2.LJJIIZ = c1641120soA.LJIIL;
        c1641150soD2.LJJIIZI = c1641120soA.LJIILIIL;
        c1641150soD2.LIZJ = (int) C1641090so7.LIZIZ(c1641120soA.LIZLLL, this.LL);
        c1641150soD2.LIZLLL = (int) C1641090so7.LIZIZ(this.LLILZIL.LIZJ, this.LL);
        C1641120soA c1641120soA2 = this.LLILZIL;
        c1641150soD2.LJIJI = c1641120soA2.LJ;
        c1641150soD2.LJIJ = c1641120soA2.LJJ;
        c1641150soD2.LJJI = c1641120soA2.LJJIII;
        c1641150soD2.LJJIJ = true;
        c1641150soD2.LJJII = c1641120soA2.LJJIIJ;
        c1641150soD2.LJJIFFI = this.LLIZLLLIL;
        c1641150soD2.LJJIJIIJI = this.LLJ;
        c1641150soD2.LJJIJIIJIL = this.LLJI;
        Integer numValueOf = Integer.valueOf(R.dimen.b5);
        numValueOf.intValue();
        if (!C1641090so7.LIZJ()) {
            numValueOf = null;
        }
        c1641150soD2.LJJIJIL = numValueOf;
        if (C1641090so7.LIZJ()) {
            i = 2;
        } else {
            i = 0;
        }
        c1641150soD2.LJIJJ = i;
        if (C1641090so7.LIZJ()) {
            i2 = (int) this.LLILLJJLI;
        } else {
            i2 = this.LLJ;
        }
        c1641150soD2.LJJIJIIJI = i2;
        if (C1641090so7.LIZJ()) {
            i3 = (int) this.LLILLL;
        } else {
            i3 = this.LLJI;
        }
        c1641150soD2.LJJIJIIJIL = i3;
        c1641150soD2.LJJIJL = this.LLJIJIL;
        Function1<? super C1641170soF, Unit> function1 = this.LLILZIL.LJIILLIIL;
        if (function1 != null) {
            function1.invoke(c1641150soD2);
        }
        this.LLJILJIL.invoke(c1641150soD2);
        return Unit.LIZ;
    }
}
