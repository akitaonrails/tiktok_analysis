package X;

import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MOn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$6", f = "CreationComposerProcessor.kt", l = {79}, m = "invokeSuspend")
public final class C567750MOn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreationConfigModelCompat LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567750MOn(CreationConfigModelCompat creationConfigModelCompat, Context context, InterfaceC1364105Vn<? super C567750MOn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = creationConfigModelCompat;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567750MOn c567750MOn = new C567750MOn(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c567750MOn.LLILLJJLI = obj;
        return c567750MOn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreationComposerProcessor@8bd3.start$6");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C567740MOm c567740MOm = new C567740MOm(this.LLILLL);
            Context context = this.LLILZ;
            this.LL = 1;
            obj = c567740MOm.LIZ(context, interfaceC497601wk, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$6");
                return objLJFF;
            }
        }
        Intent intent = (Intent) obj;
        if (intent == null) {
            C01TT.LIZLLL(new AwS552S0100000_8(this.LLILLL, 1003));
        } else if (this.LLILLL.getMusicShareStoryData() != null) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C567760MOo(this.LLILZ, intent, this.LLILLL, null), 3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationComposerProcessor@8bd3.start$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
