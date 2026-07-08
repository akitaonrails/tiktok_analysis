package X;

import android.text.Spanned;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HU9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.markdown.TakoMarkDownHelper$bindMarkdownText$2$2$1", f = "TakoMarkDownHelper.kt", l = {114}, m = "invokeSuspend")
public final class C0HU9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1889607ag LLILLJJLI;
    public final /* synthetic */ C1858620ySy LLILLL;
    public final /* synthetic */ C0HU8 LLILZ;
    public final /* synthetic */ TakoCardAbility LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HU9(C1889607ag c1889607ag, C1858620ySy c1858620ySy, C0HU8 c0hu8, TakoCardAbility takoCardAbility, InterfaceC1364105Vn<? super C0HU9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1889607ag;
        this.LLILLL = c1858620ySy;
        this.LLILZ = c0hu8;
        this.LLILZIL = takoCardAbility;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HU9(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        boolean z;
        Message messageYy1;
        int iLIZIZ;
        Object objLJI = obj;
        C1C7U.LIZ("TakoMarkDownHelper@d95e.bindMarkdownText$2$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        CharSequence c444910HcX = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLJI);
            } else {
                C155000ia.LIZIZ(objLJI);
                C1889607ag c1889607ag = this.LLILLJJLI;
                String str = c1889607ag.LL;
                C1858620ySy c1858620ySy = this.LLILLL;
                C0HU8 c0hu8 = this.LLILZ;
                C0HUB c0hub = c0hu8.LIZLLL;
                C433870Gzp c433870Gzp = c0hu8.LIZJ;
                Map mapLIZJ = C2097908Jt.LIZJ(new Pair("rank", c1889607ag.LLILLL));
                TakoCardAbility takoCardAbility = this.LLILZIL;
                if (takoCardAbility != null && (messageYy1 = takoCardAbility.Yy1()) != null && C1858670yT3.LJIILIIL(messageYy1)) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = 1;
                objLJI = C23250099c.LJI(this, C23118094a.LIZ(), new C432490Gxb(c1858620ySy, c0hub, c433870Gzp, str, mapLIZJ, null, z));
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("TakoMarkDownHelper@d95e.bindMarkdownText$2$2$1");
                    return objLJFF;
                }
            }
            Spanned spanned = (Spanned) objLJI;
            if (spanned != null) {
                C1889607ag c1889607ag2 = this.LLILLJJLI;
                C1858620ySy c1858620ySy2 = this.LLILLL;
                if (!c1889607ag2.LLILLJJLI) {
                    c1889607ag2 = null;
                }
                if (c1889607ag2 == null) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(4)));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(5)));
                }
                c1858620ySy2.setPadding(0, 0, 0, iLIZIZ);
                c444910HcX = new C444910HcX(spanned);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1858620ySy c1858620ySy3 = this.LLILLL;
        if (c444910HcX == null) {
            c444910HcX = this.LLILLJJLI.LL;
        }
        c1858620ySy3.setText(c444910HcX);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMarkDownHelper@d95e.bindMarkdownText$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
