package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import njp.a;

/* JADX INFO: renamed from: X.0CYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel$obtainVideoResource$1", f = "InteractionCardViewModel.kt", l = {288, 293}, m = "invokeSuspend")
public final class C315420CYa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ Function1<DataSource, Unit> LLILLL;
    public final /* synthetic */ InteractionCardViewModel LLILZ;
    public final /* synthetic */ Function1<AlphaVideoFileModel.Item, DataSource> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C315420CYa(File file, Function1<? super DataSource, Unit> function1, InteractionCardViewModel interactionCardViewModel, Function1<? super AlphaVideoFileModel.Item, ? extends DataSource> function12, InterfaceC1364105Vn<? super C315420CYa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
        this.LLILLL = function1;
        this.LLILZ = interactionCardViewModel;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315420CYa(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
            return unit2;
        }
        C155000ia.LIZIZ(obj);
        try {
            AlphaVideoFileModel.Item item = ((AlphaVideoFileModel) C7740030o.LIZ().getGson().LJII(C09BH.LJI(this.LLILLJJLI, Charsets.UTF_8), AlphaVideoFileModel.class)).portrait;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C315430CYb c315430CYb = new C315430CYb(item, this.LLILLL, this.LLILZ, this.LLILLJJLI, this.LLILZIL, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c315430CYb) == objLJFF) {
                C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
                return objLJFF;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
            return unit3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C0CYZ c0cyz = new C0CYZ(this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq2, c0cyz) == objLJFF) {
                C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1");
                return objLJFF;
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
