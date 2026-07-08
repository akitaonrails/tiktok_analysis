package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M7x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService$queryDraftFile$1", f = "DraftPackService.kt", l = {173}, m = "invokeSuspend")
public final class C563430M7x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftPackService LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ Uri LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C563430M7x(DraftPackService draftPackService, Context context, String str, boolean z, String str2, long j, Uri uri, InterfaceC1364105Vn<? super C563430M7x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftPackService;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = j;
        this.LLIZLLLIL = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C563430M7x(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftPackService@b42d.queryDraftFile$1");
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
            DraftPackService draftPackService = this.LLILLJJLI;
            Context context = this.LLILLL;
            String str = this.LLILZ;
            boolean z = this.LLILZIL;
            String str2 = this.LLILZLL;
            long j = this.LLIZ;
            this.LL = 1;
            obj = draftPackService.LJ(context, str, z, str2, j, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftPackService@b42d.queryDraftFile$1");
                return objLJFF;
            }
        }
        ((ConcurrentHashMap) this.LLILLJJLI.LIZ.getValue()).put(this.LLILZ, obj);
        this.LLILLL.getContentResolver().notifyChange(this.LLIZLLLIL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftPackService@b42d.queryDraftFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
