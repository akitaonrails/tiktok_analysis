package X;

import android.content.ContentResolver;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftQueryResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0WJI, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateQueryDraft$queryDraftCountFromM$2$1", f = "MigrateQueryDraft.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C0WJI extends C09AX implements Function1<InterfaceC1364105Vn<? super MigrateDraftQueryResult>, Object> {
    public int LL;
    public final /* synthetic */ ContentResolver LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJI(ContentResolver contentResolver, String str, InterfaceC1364105Vn<? super C0WJI> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = contentResolver;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WJI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super MigrateDraftQueryResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MigrateQueryDraft@9724.queryDraftCountFromM$2$1");
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
            C0WJH c0wjh = C0WJH.LIZ;
            ContentResolver contentResolver = this.LLILLJJLI;
            String str = this.LLILLL;
            this.LL = 1;
            obj = c0wjh.LIZIZ(contentResolver, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MigrateQueryDraft@9724.queryDraftCountFromM$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MigrateQueryDraft@9724.queryDraftCountFromM$2$1");
        return obj;
    }
}
