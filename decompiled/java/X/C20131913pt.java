package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.13pt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20131913pt extends C20131713pr implements Iterable<C20131713pr>, C03W4 {
    public static final /* synthetic */ int LLJJ = 0;
    public final C1119470fEn<C20131713pr> LLJIJIL;
    public int LLJILJIL;
    public String LLJILJILJ;
    public String LLJILLL;

    @Override // X.C20131713pr
    public final int hashCode() {
        int iLJ = this.LLJILJIL;
        C1119470fEn<C20131713pr> c1119470fEn = this.LLJIJIL;
        int iLJII = c1119470fEn.LJII();
        for (int i = 0; i < iLJII; i++) {
            iLJ = (((iLJ * 31) + c1119470fEn.LJ(i)) * 31) + c1119470fEn.LJIIIIZZ(i).hashCode();
        }
        return iLJ;
    }

    @Override // java.lang.Iterable
    public final Iterator<C20131713pr> iterator() {
        return new C20132013pu(this);
    }

    @Override // X.C20131713pr
    public final String toString() {
        C20131713pr c20131713prLJIJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.LLJILLL;
        if (str == null || a0.LJJJIL(str) || (c20131713prLJIJ = LJIL(str, true)) == null) {
            c20131713prLJIJ = LJIJ(this.LLJILJIL, true);
        }
        sb.append(" startDestination=");
        if (c20131713prLJIJ == null) {
            String str2 = this.LLJILLL;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.LLJILJILJ;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("0x");
                    sbLIZ.append(Integer.toHexString(this.LLJILJIL));
                    sb.append(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        } else {
            sb.append("{");
            sb.append(c20131713prLJIJ.toString());
            sb.append("}");
        }
        return sb.toString();
    }

    public C20131913pt(AbstractC20133313q7<? extends C20131913pt> abstractC20133313q7) {
        super(abstractC20133313q7);
        this.LLJIJIL = new C1119470fEn<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C20131713pr
    public final C20132213pw LJIIJJI(C20132113pv c20132113pv) {
        C20132213pw c20132213pwLJIIJJI = super.LJIIJJI(c20132113pv);
        ArrayList arrayList = new ArrayList();
        C20132013pu c20132013pu = new C20132013pu(this);
        while (c20132013pu.hasNext()) {
            C20132213pw c20132213pwLJIIJJI2 = ((C20131713pr) c20132013pu.next()).LJIIJJI(c20132113pv);
            if (c20132213pwLJIIJJI2 != null) {
                arrayList.add(c20132213pwLJIIJJI2);
            }
        }
        return (C20132213pw) C13LP.LJJLIIIJLJLI(C13LQ.LJIJI(new C20132213pw[]{c20132213pwLJIIJJI, C13LP.LJJLIIIJLJLI(arrayList)}));
    }

    public final void LJIIZILJ(C20131713pr c20131713pr) {
        int i = c20131713pr.LLIZLLLIL;
        String str = c20131713pr.LLJ;
        if (i == 0 && str == null) {
            "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString();
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.LLJ != null && !(!Intrinsics.LJFF(str, r0))) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Destination ");
            sbLIZ.append(c20131713pr);
            sbLIZ.append(" cannot have the same route as graph ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        if (i != this.LLIZLLLIL) {
            C20131713pr c20131713prLIZLLL = this.LLJIJIL.LIZLLL(i);
            if (c20131713prLIZLLL == c20131713pr) {
                return;
            }
            if (c20131713pr.LLILLJJLI == null) {
                if (c20131713prLIZLLL != null) {
                    c20131713prLIZLLL.LLILLJJLI = null;
                }
                c20131713pr.LLILLJJLI = this;
                this.LLJIJIL.LJFF(c20131713pr.LLIZLLLIL, c20131713pr);
                return;
            }
            "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString();
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Destination ");
        sbLIZ2.append(c20131713pr);
        sbLIZ2.append(" cannot have the same id as graph ");
        sbLIZ2.append(this);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }

    public final void LJJ(int i) {
        if (i != this.LLIZLLLIL) {
            if (this.LLJILLL != null) {
                LJJI(null);
            }
            this.LLJILJIL = i;
            this.LLJILJILJ = null;
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Start destination ");
        sbLIZ.append(i);
        sbLIZ.append(" cannot use the same id as the graph ");
        sbLIZ.append(this);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final void LJJI(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else if (!Intrinsics.LJFF(str, this.LLJ)) {
            if (!a0.LJJJIL(str)) {
                iHashCode = C1308920kAM.LIZ(str).hashCode();
            } else {
                "Cannot have an empty start destination route".toString();
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Start destination ");
            sbLIZ.append(str);
            sbLIZ.append(" cannot use the same route as the graph ");
            sbLIZ.append(this);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        this.LLJILJIL = iHashCode;
        this.LLJILLL = str;
    }

    @Override // X.C20131713pr
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20131913pt)) {
            return false;
        }
        List listLJJIII = C09RB.LJJIII(C09R4.LIZIZ(new C20307814dA(this.LLJIJIL, (C1119470fEn<Object>) 2)));
        C20131913pt c20131913pt = (C20131913pt) obj;
        C20307814dA c20307814dA = new C20307814dA(c20131913pt.LLJIJIL, (C1119470fEn<Object>) 2);
        while (c20307814dA.hasNext()) {
            listLJJIII.remove(c20307814dA.next());
        }
        if (!super.equals(obj) || this.LLJIJIL.LJII() != c20131913pt.LLJIJIL.LJII() || this.LLJILJIL != c20131913pt.LLJILJIL || !listLJJIII.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // X.C20131713pr
    public final void LJIIL(Context context, AttributeSet attributeSet) {
        super.LJIIL(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.NavGraphNavigator);
        LJJ(typedArrayObtainAttributes.getResourceId(R$styleable.NavGraphNavigator_startDestination, 0));
        this.LLJILJILJ = C1308920kAM.LIZIZ(this.LLJILJIL, context);
        typedArrayObtainAttributes.recycle();
    }

    public final C20131713pr LJIJ(int i, boolean z) {
        C20131913pt c20131913pt;
        C20131713pr c20131713prLIZLLL = this.LLJIJIL.LIZLLL(i);
        if (c20131713prLIZLLL == null) {
            if (z && (c20131913pt = this.LLILLJJLI) != null) {
                return c20131913pt.LJIJ(i, true);
            }
            return null;
        }
        return c20131713prLIZLLL;
    }

    public final C20131713pr LJIL(String str, boolean z) {
        C20131913pt c20131913pt;
        C20131713pr c20131713prLIZLLL = this.LLJIJIL.LIZLLL(C1308920kAM.LIZ(str).hashCode());
        if (c20131713prLIZLLL == null) {
            if (!z || (c20131913pt = this.LLILLJJLI) == null || str == null || a0.LJJJIL(str)) {
                return null;
            }
            return c20131913pt.LJIL(str, true);
        }
        return c20131713prLIZLLL;
    }
}
