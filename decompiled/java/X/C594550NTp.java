package X;

import android.content.ContentResolver;
import android.content.Context;
import com.ss.android.ugc.aweme.services.draft.model.MigrateRequireDraftResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0NTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateRequirePublic$queryPublicFileZip$2$1", f = "MigrateRequirePublic.kt", l = {61}, m = "invokeSuspend")
public final class C594550NTp extends C09AX implements Function1<InterfaceC1364105Vn<? super MigrateRequireDraftResult>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ ContentResolver LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C594550NTp(Context context, ContentResolver contentResolver, String str, String str2, InterfaceC1364105Vn<? super C594550NTp> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = contentResolver;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C594550NTp(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super MigrateRequireDraftResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MigrateRequirePublic@8c44.queryPublicFileZip$2$1");
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
            C0WJ8 c0wj8 = C0WJ8.LIZ;
            Context context = this.LLILLJJLI;
            ContentResolver contentResolver = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            obj = c0wj8.LIZIZ(context, contentResolver, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MigrateRequirePublic@8c44.queryPublicFileZip$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MigrateRequirePublic@8c44.queryPublicFileZip$2$1");
        return obj;
    }
}
