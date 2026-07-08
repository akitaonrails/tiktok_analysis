package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0m1a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.SocialAvatarResourceEncodeHelper$encodeResources$dynamicAvatarEncodeJob$1", f = "SocialAvatarResourceEncodeHelper.kt", l = {}, m = "invokeSuspend")
public final class C1380360m1a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public final /* synthetic */ C1463680oBy LL;
    public final /* synthetic */ List<C1380380m1c> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1380360m1a(C1463680oBy c1463680oBy, List<C1380380m1c> list, InterfaceC1364105Vn<? super C1380360m1a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1463680oBy;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1380360m1a(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objValueOf;
        C1C7U.LIZ("SocialAvatarResourceEncodeHelper@5f04.encodeResources$dynamicAvatarEncodeJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            this.LL.LJIIIIZZ();
            objValueOf = Unit.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objValueOf = Boolean.valueOf(this.LLILLJJLI.add(new C1380380m1c(e)));
        }
        C1C7U.LIZIZ("SocialAvatarResourceEncodeHelper@5f04.encodeResources$dynamicAvatarEncodeJob$1");
        return objValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
