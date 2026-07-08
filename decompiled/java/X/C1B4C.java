package X;

import com.ss.android.ugc.aweme.share.SystemShareActivityViewModel;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.1B4C, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivityViewModel$handleSingleMediaSystemShare$1$1$1$1", f = "SystemShareActivityViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1B4C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ SystemShareActivityViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4C(C19EG c19eg, String str, SystemShareActivityViewModel systemShareActivityViewModel, InterfaceC1364105Vn<? super C1B4C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = systemShareActivityViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4C(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isDestroyed() && !this.LL.isFinishing()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SystemShareActivity path = ");
            sbLIZ.append(this.LLILLJJLI);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("path = ");
            sbLIZ2.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ2);
            if (this.LLILLJJLI.length() == 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SystemShareActivity path is null, uri = ");
                sbLIZ3.append(this.LL);
                C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (!C2137908Zd.LIZJ.LJFF(this.LLILLJJLI)) {
                C2344809Gs.LJ("SystemShareActivity path not exists, return");
                C1233040iBy c1233040iBy = new C1233040iBy(C786410Ut5.P3(this.LL));
                c1233040iBy.LIZJ(this.LL.getString(2131847881));
                c1233040iBy.LIZLLL();
                C1B46.LIZ.getClass();
                C1B46.LIZIZ();
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1$1$1");
                return unit;
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("SystemShareActivity intent.type = ");
            sbLIZ4.append(this.LLILLL.LLILLL);
            C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ4));
            C1B46 c1b46 = C1B46.LIZ;
            String str = this.LLILLL.LLILLL;
            c1b46.getClass();
            if (str != null && u.LJJIIJZLJL(str, "video/", false)) {
                C1B4P c1b4p = this.LLILLL.LLIZLLLIL;
                c1b4p.LIZ = 2;
                c1b4p.LIZIZ = Collections.singletonList(this.LLILLJJLI);
            } else {
                String str2 = this.LLILLL.LLILLL;
                if (str2 != null && u.LJJIIJZLJL(str2, "image/", false)) {
                    C1B4P c1b4p2 = this.LLILLL.LLIZLLLIL;
                    c1b4p2.LIZ = 1;
                    c1b4p2.LIZIZ = Collections.singletonList(this.LLILLJJLI);
                } else {
                    C2344809Gs.LJ("SystemShareActivity can not handle intent.type, return");
                    C1233040iBy c1233040iBy2 = new C1233040iBy(C786410Ut5.P3(this.LL));
                    c1233040iBy2.LIZJ(this.LL.getString(2131847881));
                    c1233040iBy2.LIZLLL();
                    C1B46.LIZIZ();
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1$1$1");
                    return unit2;
                }
            }
            C2189108ht.LIZ("system_share");
            SystemShareActivityViewModel systemShareActivityViewModel = this.LLILLL;
            C1402840mbq c1402840mbq = systemShareActivityViewModel.LLJI;
            if (c1402840mbq != null) {
                c1402840mbq.mShareMediaType = systemShareActivityViewModel.LLIZLLLIL.LIZ();
            }
            SystemShareActivityViewModel systemShareActivityViewModel2 = this.LLILLL;
            C1B4B c1b4b = new C1B4B(systemShareActivityViewModel2.LLIZLLLIL, systemShareActivityViewModel2.LLIZ.getCreationId(), null);
            SystemShareActivityViewModel systemShareActivityViewModel3 = this.LLILLL;
            C19EG c19eg = this.LL;
            C1402840mbq c1402840mbq2 = systemShareActivityViewModel3.LLJI;
            if (c1402840mbq2 != null) {
                C1B4B.LIZJ(c1b4b, c19eg, c1402840mbq2, null, null, false, 28);
                c1b4b.LJ.observeForever(systemShareActivityViewModel3.LLILZLL);
                c1b4b.LJI.observeForever(systemShareActivityViewModel3.LLJILJILJ);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1$1$1");
                return unit3;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        int i2 = C2187451AjH.LIZ;
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivityViewModel@f202.handleSingleMediaSystemShare$1$1$1$1");
        return unit4;
    }
}
