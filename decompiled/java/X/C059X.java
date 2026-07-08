package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059X, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.query.DraftQueryService$queryDraftCountAndSize$1", f = "IDraftQueryService.kt", l = {55}, m = "invokeSuspend")
public final class C059X extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftQueryService LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Uri LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059X(DraftQueryService draftQueryService, Context context, String str, Uri uri, InterfaceC1364105Vn<? super C059X> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftQueryService;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C059X(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftQueryService@3808.queryDraftCountAndSize$1");
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
            DraftQueryService draftQueryService = this.LLILLJJLI;
            Context context = this.LLILLL;
            String str = this.LLILZ;
            Uri uri = this.LLILZIL;
            this.LL = 1;
            if (draftQueryService.LIZIZ(context, uri, str, this) == objLJFF) {
                C1C7U.LIZIZ("DraftQueryService@3808.queryDraftCountAndSize$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftQueryService@3808.queryDraftCountAndSize$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
