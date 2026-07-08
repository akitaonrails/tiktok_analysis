package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0py2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531920py2 extends C09AY implements Function1<C1531910py1, Unit> {
    public final /* synthetic */ C1531940py4 LL;
    public final /* synthetic */ C1532710pzJ LLILLJJLI;
    public final /* synthetic */ C1532470pyv LLILLL;
    public final /* synthetic */ C1541080qCo<C1532310pyf> LLILZ;
    public final /* synthetic */ Function1<C1532340pyi, Unit> LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ C08AB LLIZ;
    public final /* synthetic */ C1532170pyR LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1531920py2(int i, C1532470pyv c1532470pyv, C1532710pzJ c1532710pzJ, C1532170pyR c1532170pyR, C1531940py4 c1531940py4, C1541080qCo c1541080qCo, C08AB c08ab, Function1 function1) {
        super(1);
        this.LL = c1531940py4;
        this.LLILLJJLI = c1532710pzJ;
        this.LLILLL = c1532470pyv;
        this.LLILZ = c1541080qCo;
        this.LLILZIL = function1;
        this.LLILZLL = i;
        this.LLIZ = c08ab;
        this.LLIZLLLIL = c1532170pyR;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1531910py1 c1531910py1) {
        C1532720pzK c1532720pzKLIZIZ;
        C1531930py3 c1531930py3;
        C1531910py1 c1531910py12 = c1531910py1;
        C1531940py4 c1531940py4 = this.LL;
        C1532710pzJ c1532710pzJ = this.LLILLJJLI;
        List<C1531900py0> list = c1531940py4.LIZJ;
        C1531930py3 c1531930py32 = c1531940py4.LIZIZ;
        if (c1531930py32 == null || (c1532720pzKLIZIZ = c1531930py32.LIZIZ()) == null) {
            c1532720pzKLIZIZ = c1532710pzJ.LJJIII;
        }
        ((ArrayList) list).add(new C1531900py0(c1531910py12, c1532720pzKLIZIZ));
        String str = c1531940py4.LJII;
        if (str != null) {
            if (!c1532710pzJ.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1531910py12.getErrorMessage());
                sbLIZ.append(", but redirect disabled");
                c1531910py12.setErrorMessage$forestx_release(C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLL.LIZIZ(c1531910py12.getErrorCode(), c1531910py12.toString());
                C1531830pxt c1531830pxt = C1531830pxt.LIZ;
                C1531940py4 c1531940py42 = this.LL;
                C1541080qCo<C1532310pyf> c1541080qCo = this.LLILZ;
                c1531830pxt.getClass();
                C1531830pxt.LJI(c1531940py42, c1541080qCo);
                this.LLILZIL.invoke(new C1532340pyi(null, c1531910py12));
            } else {
                C1531930py3 c1531930py33 = c1531940py4.LIZIZ;
                if (c1531930py33 != null) {
                    c1531930py33.LIZ = C1532730pzL.LIZIZ(str, null, null, EnumC838370Wuh.FUZZY);
                    c1531930py33.LIZJ = false;
                }
                c1531940py4.LJII = null;
                C1531940py4 c1531940py43 = this.LL;
                C1541080qCo<C1532310pyf> c1541080qCo2 = this.LLILZ;
                C08AB c08ab = this.LLIZ;
                C1531830pxt.LJII(1 + this.LLILZLL, this.LLILLL, this.LLILLJJLI, this.LLIZLLLIL, c1531940py43, c1541080qCo2, c08ab, this.LLILZIL);
            }
        } else {
            if (c1531940py4.LJIIIIZZ && (c1531930py3 = c1531940py4.LIZIZ) != null) {
                if (c1531940py4.LJ == 1) {
                    c1531940py4.LJ = 2;
                    String str2 = c1531940py4.LJI;
                    if (str2 != null) {
                        c1531930py3.LIZLLL(str2);
                    } else {
                        c1531930py3.LIZ = c1532710pzJ.LJJIII;
                        c1531930py3.LIZJ = false;
                    }
                } else if (c1531940py4.LIZIZ(c1531930py3, true)) {
                    c1531940py4.LJI = null;
                } else {
                    if (c1531940py4.LJFF == 1) {
                        c1531940py4.LJFF = 2;
                    }
                    c1531940py4.LJI = null;
                    if (c1532710pzJ.LJJIII != c1531940py4.LIZIZ.LIZ) {
                        List<String> list2 = c1532710pzJ.LJJIJIL;
                        if (list2 != null && list2.size() > 0) {
                            c1531940py4.LIZIZ.LIZJ((String) ListProtector.get(list2, 0));
                        }
                    }
                }
                C1531940py4 c1531940py432 = this.LL;
                C1541080qCo<C1532310pyf> c1541080qCo22 = this.LLILZ;
                C08AB c08ab2 = this.LLIZ;
                C1531830pxt.LJII(1 + this.LLILZLL, this.LLILLL, this.LLILLJJLI, this.LLIZLLLIL, c1531940py432, c1541080qCo22, c08ab2, this.LLILZIL);
            }
            this.LLILLL.LIZIZ(c1531910py12.getErrorCode(), c1531910py12.toString());
            C1531830pxt c1531830pxt2 = C1531830pxt.LIZ;
            C1531940py4 c1531940py422 = this.LL;
            C1541080qCo<C1532310pyf> c1541080qCo3 = this.LLILZ;
            c1531830pxt2.getClass();
            C1531830pxt.LJI(c1531940py422, c1541080qCo3);
            this.LLILZIL.invoke(new C1532340pyi(null, c1531910py12));
        }
        return Unit.LIZ;
    }
}
