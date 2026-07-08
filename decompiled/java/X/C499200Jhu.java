package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0Jhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$getPublishedDraftsCountWithoutExpireTime$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
public final class C499200Jhu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public C499200Jhu(InterfaceC1364105Vn<? super C499200Jhu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C499200Jhu(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftDBExt@aed2.getPublishedDraftsCountWithoutExpireTime$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C118300cf c118300cf = new C118300cf();
        C0M4A.LJII("SELECT count(video_path) FROM local_draft WHERE is_published = 1", new AwS586S0100000_7(c118300cf, 548));
        Integer numLJ = C2286608xc.LJ(c118300cf.element);
        C1C7U.LIZIZ("DraftDBExt@aed2.getPublishedDraftsCountWithoutExpireTime$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return new C499200Jhu(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
