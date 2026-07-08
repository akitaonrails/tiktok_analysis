package X;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0PHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642440PHu {
    public final C642240PHa LIZ;
    public C0PHT LIZIZ;
    public final Function1<C642440PHu, Unit> LIZJ;
    public String LIZLLL = "";
    public final ArrayList<C642450PHv> LJ = new ArrayList<>();
    public C642240PHa LJFF;
    public Boolean LJI;

    public final void LIZIZ(C642240PHa c642240PHa) {
        this.LJFF = C642240PHa.LIZ(c642240PHa);
    }

    public final void LIZJ(Function1 function1) {
        C642240PHa c642240PHaLIZ = C642240PHa.LIZ(this.LJFF);
        function1.invoke(c642240PHaLIZ);
        this.LJFF = c642240PHaLIZ;
    }

    public final void LIZLLL(Function1<? super C642450PHv, Unit> function1) {
        ArrayList<C642450PHv> arrayList = this.LJ;
        C642450PHv c642450PHv = new C642450PHv(this.LIZIZ, this);
        function1.invoke(c642450PHv);
        arrayList.add(c642450PHv);
    }

    public final void LIZ(C0PHX c0phx, C0PHT c0pht) {
        this.LJ.clear();
        this.LJFF = this.LIZ;
        this.LIZIZ = c0pht;
        this.LIZJ.invoke(this);
        c0phx.LJIIIZ = this.LIZLLL;
        c0phx.LJIIJ = this.LJFF;
        Boolean bool = this.LJI;
        if (bool != null) {
            c0phx.LJFF = bool.booleanValue();
        }
        c0phx.LJ();
        ArrayList arrayList = (ArrayList) c0phx.LJIIJJI;
        arrayList.clear();
        C0PHW c0phw = null;
        for (C642450PHv c642450PHv : this.LJ) {
            if (c642450PHv != null) {
                C0PHW c0phw2 = new C0PHW(c642450PHv.LIZJ, c0phx.LIZ, c0phx);
                if (c0phw != null) {
                    c0phw.LIZLLL = c0phw2;
                }
                c0phw2.LJ = c0phw;
                c0phw = c0phw2;
                arrayList.add(c0phw2);
            } else {
                c0phw = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C642440PHu(C642240PHa c642240PHa, C0PHT c0pht, Function1<? super C642440PHu, Unit> function1) {
        this.LIZ = c642240PHa;
        this.LIZIZ = c0pht;
        this.LIZJ = function1;
        this.LJFF = c642240PHa;
    }
}
