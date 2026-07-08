package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06CU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.share.ShareStreakUtil$buildSharePackage$sharePackageBuilder$1", f = "StreakShareUtil.kt", l = {281}, m = "invokeSuspend")
public final class C06CU extends C09AX implements Function2<String, InterfaceC1364105Vn<? super Pair<? extends String, ? extends BaseTemplate>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C06CU(InterfaceC1364105Vn<? super C06CU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06CU c06cu = new C06CU(interfaceC1364105Vn);
        c06cu.LLILLJJLI = obj;
        return c06cu;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareStreakUtil@bf84.buildSharePackage$sharePackageBuilder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = (String) this.LLILLJJLI;
            C06CX c06cx = C06CX.LIZIZ;
            this.LL = 1;
            obj = c06cx.LIZIZ(str, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareStreakUtil@bf84.buildSharePackage$sharePackageBuilder$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        if (!(pair instanceof Pair)) {
            if (!(pair instanceof BaseTemplate)) {
                pair = null;
            }
            pair = new Pair(null, pair);
        }
        C1C7U.LIZIZ("ShareStreakUtil@bf84.buildSharePackage$sharePackageBuilder$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, InterfaceC1364105Vn<? super Pair<? extends String, ? extends BaseTemplate>> interfaceC1364105Vn) {
        return ((a) create(str, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
