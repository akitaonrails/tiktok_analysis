package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;
import njp.a;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: renamed from: X.0Jhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$getExpiredPublishedDrafts$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
public final class C499210Jhv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<AwemeDraft>>, Object> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499210Jhv(int i, InterfaceC1364105Vn<? super C499210Jhv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C499210Jhv(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftDBExt@aed2.getExpiredPublishedDrafts$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis() - ((long) this.LL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SELECT * FROM local_draft WHERE is_published = 1 AND published_time < ");
        sbLIZ.append(jCurrentTimeMillis);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ArrayList arrayList = new ArrayList();
        C0M4A.LJII(strLIZIZ, new AwS586S0100000_7((List) arrayList, (List<GameDrawerCategory>) 547));
        C1C7U.LIZIZ("DraftDBExt@aed2.getExpiredPublishedDrafts$2");
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<AwemeDraft>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
