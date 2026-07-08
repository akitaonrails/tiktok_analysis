package X;

import com.ss.android.ugc.aweme.cutsame.PUGCTemplateDetail;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS622S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Ksq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$downloadTemplate$getTemplateUrlTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {1868}, m = "invokeSuspend")
public final class C531460Ksq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends PUGCTemplateDetail, ? extends String, ? extends String>>, Object> {
    public int LL;
    public final /* synthetic */ C0L7R LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C531460Ksq(C0L7R c0l7r, String str, String str2, InterfaceC1364105Vn<? super C531460Ksq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l7r;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C531460Ksq(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.downloadTemplate$getTemplateUrlTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            C0L7R c0l7r = this.LLILLJJLI;
            String str = c0l7r.LJIJI;
            C1429050nI7.LIZ.getClass();
            Pair pairLIZ = C1429050nI7.LIZ();
            String str2 = this.LLILLL;
            String str3 = this.LLILZ;
            this.LL = 1;
            C443120HZe<String, String, String> c443120HZeLIZ = C0CHQ.LIZ().LJIIIIZZ().LIZ(str);
            String first = c443120HZeLIZ.getFirst();
            if (first == null) {
                first = "";
            }
            String second = c443120HZeLIZ.getSecond();
            if (second == null) {
                second = "";
            }
            String third = c443120HZeLIZ.getThird();
            if (third == null) {
                third = "";
            }
            c0l7r.LJJJJZ(10);
            if (first.length() > 0) {
                objLIZ = new C443120HZe(new PUGCTemplateDetail(first, second, null, third, null, null, null, null), "", "");
            } else {
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C0CHQ.LIZ().LJIIIIZZ().LJ(str, pairLIZ, str2, str3, new AwS587S0100000_8(c23260099m, 113), new AwS622S0100000_8(c23260099m, 14));
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.downloadTemplate$getTemplateUrlTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.downloadTemplate$getTemplateUrlTask$1");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends PUGCTemplateDetail, ? extends String, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
