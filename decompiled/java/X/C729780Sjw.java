package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentRepo;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentUidShowData;
import java.util.HashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Sjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.exposedcmt.ExposedCommentRepo$markExposedCommentClick$1", f = "ExposedCommentRepo.kt", l = {}, m = "invokeSuspend")
public final class C729780Sjw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ExposedCommentRepo LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729780Sjw(ExposedCommentRepo exposedCommentRepo, String str, InterfaceC1364105Vn<? super C729780Sjw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = exposedCommentRepo;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C729780Sjw(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        HashMap<String, Set<String>> map;
        Set<String> set;
        C1C7U.LIZ("ExposedCommentRepo@77c6.markExposedCommentClick$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL.LLILZIL, false)) {
            C729770Sjv.LIZ.getClass();
            ((Keva) C729770Sjv.LJ.getValue()).erase(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        }
        this.LL.LLILZIL = true;
        C729770Sjv c729770Sjv = C729770Sjv.LIZ;
        String str = this.LLILLJJLI;
        c729770Sjv.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (C729770Sjv.LJ().get(curUserId) == null) {
            C729770Sjv.LJ().clear();
        }
        ExposedCommentUidShowData exposedCommentUidShowData = (ExposedCommentUidShowData) C729770Sjv.LJ().get(curUserId);
        if (exposedCommentUidShowData != null && (map = exposedCommentUidShowData.unclikedCommentUid) != null && (set = map.get(str)) != null) {
            set.clear();
            Keva keva = (Keva) C729770Sjv.LJI.getValue();
            C1227904rF.LIZ.getClass();
            keva.storeString(curUserId, C1227904rF.LJI(exposedCommentUidShowData));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExposedCommentRepo@77c6.markExposedCommentClick$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
