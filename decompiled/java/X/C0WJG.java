package X;

import android.app.Application;
import android.content.ContentResolver;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftCommonResult;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftQueryResult;
import com.ss.android.ugc.aweme.services.draft.model.MigrateDraftStateInfo;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WJG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.MigrateDraftService$extracted$2", f = "MigrateDraftService.kt", l = {244, 253, 273}, m = "invokeSuspend")
public final class C0WJG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MigrateDraftService LL;
    public Object LLILLJJLI;
    public MigrateDraftStateInfo LLILLL;
    public Object LLILZ;
    public MigrateDraftQueryResult LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public /* synthetic */ Object LLJILJIL;
    public final /* synthetic */ MigrateDraftStateInfo LLJILJILJ;
    public final /* synthetic */ MigrateDraftService LLJILLL;
    public final /* synthetic */ ContentResolver LLJJ;
    public final /* synthetic */ int LLJJI;
    public final /* synthetic */ List<MigrateDraftStateInfo> LLJJIII;
    public final /* synthetic */ MigrateDraftQueryResult LLJJIJI;
    public final /* synthetic */ Application LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ List<MigrateDraftCommonResult> LLJJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WJG(MigrateDraftStateInfo migrateDraftStateInfo, MigrateDraftService migrateDraftService, ContentResolver contentResolver, int i, List<MigrateDraftStateInfo> list, MigrateDraftQueryResult migrateDraftQueryResult, Application application, String str, List<MigrateDraftCommonResult> list2, InterfaceC1364105Vn<? super C0WJG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJILJILJ = migrateDraftStateInfo;
        this.LLJILLL = migrateDraftService;
        this.LLJJ = contentResolver;
        this.LLJJI = i;
        this.LLJJIII = list;
        this.LLJJIJI = migrateDraftQueryResult;
        this.LLJJIJIIJIL = application;
        this.LLJJIJIL = str;
        this.LLJJJ = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0WJG c0wjg = new C0WJG(this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, interfaceC1364105Vn);
        c0wjg.LLJILJIL = obj;
        return c0wjg;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025b A[Catch: all -> 0x02cc, TryCatch #5 {all -> 0x02cc, blocks: (B:104:0x02a2, B:100:0x024b, B:102:0x025b), top: B:137:0x024b }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0232 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113 A[Catch: all -> 0x02d8, TRY_ENTER, TryCatch #14 {all -> 0x02d8, blocks: (B:34:0x0100, B:40:0x0113, B:46:0x0125), top: B:154:0x0100 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b A[Catch: all -> 0x0120, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0120, blocks: (B:36:0x0107, B:38:0x010b, B:39:0x0112, B:42:0x011b), top: B:129:0x0107 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x023d A[Catch: all -> 0x02ce, TryCatch #7 {all -> 0x02ce, blocks: (B:92:0x0232, B:95:0x023d, B:97:0x0241, B:99:0x0248), top: B:140:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0241 A[Catch: all -> 0x02ce, TryCatch #7 {all -> 0x02ce, blocks: (B:92:0x0232, B:95:0x023d, B:97:0x0241, B:99:0x0248), top: B:140:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0246  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0WJG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
