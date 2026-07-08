package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.migratedraft.provider.pack.DraftPackService$queryDraftPublicFile$1", f = "DraftPackService.kt", l = {207}, m = "invokeSuspend")
public final class C821060WIu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftPackService LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Uri LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C821060WIu(DraftPackService draftPackService, Context context, Uri uri, InterfaceC1364105Vn<? super C821060WIu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftPackService;
        this.LLILLL = context;
        this.LLILZ = uri;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C821060WIu(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0WIv] */
    /* JADX WARN: Type inference failed for: r12v2 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c098200Yq;
        C1C7U.LIZ("DraftPackService@b42d.queryDraftPublicFile$1");
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
            this.LL = 1;
            draftPackService.getClass();
            obj = new C821070WIv();
            C821050WIt.LIZ.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.w2(context).getAbsolutePath());
            sbLIZ.append(File.separator);
            sbLIZ.append("migrate");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            try {
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (!c0vsj.exists()) {
                    c0vsj.mkdirs();
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            C0VSJ c0vsj2 = new C0VSJ(strLIZIZ + File.separator + "migrate_public");
            File parentFile = c0vsj2.getParentFile();
            if (parentFile != null) {
                Boolean.valueOf(parentFile.mkdirs());
            }
            List<String> list = (List) C301840BsM.LIZIZ.getValue();
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj.LIZLLL = false;
                obj.LIZJ = "zip file failed, getPublicDirList is empty";
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (String str : list) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("prepare public files, dir: ");
                    sbLIZ2.append(str);
                    C0WJO.LIZJ("transfer", C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF());
                    sbLIZ3.append(str);
                    linkedHashMap.put(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)), str);
                }
                try {
                    C0WJA.LIZ.getClass();
                    C0WJA.LJIIJ(c0vsj2, linkedHashMap);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                    obj.LIZLLL = true;
                    obj.LIZ = c0vsj2.getAbsolutePath();
                }
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    obj.LIZLLL = false;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("zip file failed, ");
                    sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
                    obj.LIZJ = C2188811AlT.LIZIZ(sbLIZ4);
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftPackService@b42d.queryDraftPublicFile$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LIZIZ = (C821070WIv) obj;
        this.LLILLL.getContentResolver().notifyChange(this.LLILZ, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftPackService@b42d.queryDraftPublicFile$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
