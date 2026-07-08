package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01RB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.drawer.BotSharedDrawer$drawBotMessage$1", f = "BotSharedDrawer.kt", l = {58}, m = "invokeSuspend")
public final class C01RB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILLJJLI;
    public final /* synthetic */ List<Pair<Boolean, Bitmap>> LLILLL;
    public final /* synthetic */ InterfaceC665370Q7z LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01RB(InterfaceC665370Q7z interfaceC665370Q7z, List list, InterfaceC1364105Vn interfaceC1364105Vn, Function1 function1) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
        this.LLILLL = list;
        this.LLILZ = interfaceC665370Q7z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        Function1<Bitmap, Unit> function1 = this.LLILLJJLI;
        return new C01RB(this.LLILZ, this.LLILLL, interfaceC1364105Vn, function1);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("BotSharedDrawer@74f5.drawBotMessage$1");
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
            C1DFB c1dfb = C0PEM.LIZJ;
            C01RC c01rc = new C01RC(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c01rc);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BotSharedDrawer@74f5.drawBotMessage$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.invoke((Bitmap) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BotSharedDrawer@74f5.drawBotMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
