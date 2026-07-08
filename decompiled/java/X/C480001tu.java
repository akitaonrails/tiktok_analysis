package X;

import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01tu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel$fetchOriginalVideoInfo$1$1", f = "NewCreatorCaptionEditViewModel.kt", l = {85}, m = "invokeSuspend")
public final class C480001tu extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<CreatorCaptionEditModel>>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C480001tu(Long l, String str, InterfaceC1364105Vn<? super C480001tu> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C480001tu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<CreatorCaptionEditModel>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1$1");
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
            long jLongValue = this.LLILLJJLI.longValue();
            String str = this.LLILLL;
            this.LL = 1;
            obj = C01WU.LIZ().suspendQueryAwemeAndCaption(C2286608xc.LJFF(jLongValue), str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("NewCreatorCaptionEditViewModel@b8c6.fetchOriginalVideoInfo$1$1");
        return obj;
    }
}
