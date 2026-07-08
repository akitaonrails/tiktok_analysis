package X;

import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sdD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634330sdD extends AbstractC1634090scp<List<? extends AbstractC1634360sdG>> implements InterfaceC1634030scj {
    public final Function0<String> LIZ;
    public final Function0<String> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<C1634370sdH> LJ;

    @Override // X.AbstractC1634060scm
    public final C11NZ<List<AbstractC1634360sdG>> LJ() {
        C1634370sdH c1634370sdHInvoke = this.LJ.invoke();
        Boolean boolValueOf = c1634370sdHInvoke != null ? Boolean.valueOf(c1634370sdHInvoke.LIZIZ) : null;
        C1634370sdH c1634370sdHInvoke2 = this.LJ.invoke();
        Boolean boolValueOf2 = c1634370sdHInvoke2 != null ? Boolean.valueOf(c1634370sdHInvoke2.LIZ) : null;
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.LJFF(boolValueOf, bool) && !Intrinsics.LJFF(boolValueOf2, bool)) {
            return C11NZ.LJJJJZ(C1697810uHb.LJIIJJI(new C1634350sdF(this.LIZ.invoke(), this.LIZIZ.invoke()), new C1634340sdE(this.LIZJ.invoke(), this.LIZLLL.invoke(), null, null, null, null, null, 124)));
        }
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.LJFF(boolValueOf2, bool)) {
            EnumC1641350soX enumC1641350soX = EnumC1641350soX.COLLECT;
            arrayList.add(new C1634340sdE(enumC1641350soX.getTag(), enumC1641350soX.getTag(), enumC1641350soX, null, Integer.valueOf(R.raw.icon_star), null, null, 104));
        }
        arrayList.add(new C1634340sdE(this.LIZ.invoke(), this.LIZIZ.invoke(), EnumC1641350soX.RECOMMEND, null, Integer.valueOf(R.raw.icon_sticker), null, "", 40));
        arrayList.add(new C1634340sdE(this.LIZJ.invoke(), this.LIZLLL.invoke(), EnumC1641350soX.EMOJI, null, Integer.valueOf(R.raw.icon_emoji), null, null, 104));
        if (Intrinsics.LJFF(boolValueOf, bool)) {
            String strInvoke = this.LIZJ.invoke();
            EnumC1641350soX enumC1641350soX2 = EnumC1641350soX.STICKERSET;
            arrayList.add(new C1634340sdE(strInvoke, enumC1641350soX2.getTag(), enumC1641350soX2, null, Integer.valueOf(R.raw.icon_store), null, null, 104));
        }
        return C11NZ.LJJJJZ(arrayList);
    }

    public C1634330sdD(Function0<String> function0, Function0<String> function02, Function0<String> function03, Function0<String> function04, Function0<C1634370sdH> function05) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = function04;
        this.LJ = function05;
    }
}
