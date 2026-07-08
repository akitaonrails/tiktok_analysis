package X;

import com.ss.android.ugc.aweme.creatoredit.CreatorEditedTranslatedCaptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.01WT, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.newcreatoredit.CECTransLanguageListController$fetchEditedTranslationList$1$1", f = "CECTransLanguageListController.kt", l = {53}, m = "invokeSuspend")
public final class C01WT extends C09AX implements Function1<InterfaceC1364105Vn<? super C0X52<CreatorEditedTranslatedCaptions>>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01WT(long j, InterfaceC1364105Vn<? super C01WT> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01WT(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C0X52<CreatorEditedTranslatedCaptions>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            obj = C01WU.LIZ().suspendGetEditedTranslatedCaptions(C2286608xc.LJFF(j), this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CECTransLanguageListController@7d08.fetchEditedTranslationList$1$1");
        return obj;
    }
}
