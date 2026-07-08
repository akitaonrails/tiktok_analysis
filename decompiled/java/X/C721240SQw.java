package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS4S0210100_11;
import njp.a;

/* JADX INFO: renamed from: X.0SQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel$handleDiggClickFailed$1", f = "PostModeDiggViewModel.kt", l = {}, m = "invokeSuspend")
public final class C721240SQw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PostDiggViewModel LL;
    public final /* synthetic */ Aweme LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C721240SQw(PostDiggViewModel postDiggViewModel, Aweme aweme, InterfaceC1364105Vn<? super C721240SQw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = postDiggViewModel;
        this.LLILLJJLI = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C721240SQw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("PostDiggViewModel@91b2.handleDiggClickFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PostDiggViewModel postDiggViewModel = this.LL;
        if (!postDiggViewModel.LLILLJJLI) {
            postDiggViewModel.LL++;
            z = true;
        } else {
            postDiggViewModel.LL--;
            z = false;
        }
        long jZQ2 = postDiggViewModel.zQ2(this.LLILLJJLI, z);
        PostDiggViewModel postDiggViewModel2 = this.LL;
        postDiggViewModel2.setState(new AwS4S0210100_11(postDiggViewModel2, jZQ2, this.LLILLJJLI, z, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PostDiggViewModel@91b2.handleDiggClickFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
