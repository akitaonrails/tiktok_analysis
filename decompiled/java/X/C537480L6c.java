package X;

import com.ss.android.ugc.aweme.aigc.IMService;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.creation.component.AITheaterCameoControlComponent$onCreate$4$1$1$1", f = "AITheaterCameoControlComponent.kt", l = {177}, m = "invokeSuspend")
public final class C537480L6c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends MentionDataItem>, ? extends Boolean>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537480L6c(long j, InterfaceC1364105Vn<? super C537480L6c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537480L6c(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1$1$1");
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
            C0LPI.LIZ.getClass();
            IMService iMServiceLIZ = C0LPI.LIZ();
            long j = this.LLILLJJLI;
            this.LL = 1;
            obj = iMServiceLIZ.LIZLLL(j, "ai_theater_social_enable", this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AITheaterCameoControlComponent@4a33.onCreate$4$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends List<? extends MentionDataItem>, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
