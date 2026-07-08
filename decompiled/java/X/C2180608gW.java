package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08gW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ci.viewer.viewmodel.ProfileViewerViewModel$config$2$1$onRefresh$1$1", f = "ProfileViewerViewModel.kt", l = {184}, m = "invokeSuspend")
public final class C2180608gW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ List<User> LLILLJJLI;
    public final /* synthetic */ ProfileViewerViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2180608gW(List<? extends User> list, ProfileViewerViewModel profileViewerViewModel, InterfaceC1364105Vn<? super C2180608gW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = profileViewerViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2180608gW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileViewerViewModel@f1c5.config$2$1$onRefresh$1$1");
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
            List<User> list = this.LLILLJJLI;
            String str = this.LLILLL.LLJILJILJ;
            if (str == null) {
                str = "";
            }
            this.LL = 1;
            obj = C1263390iyv.LIZIZ.LIZ().LIZ(list, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProfileViewerViewModel@f1c5.config$2$1$onRefresh$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ProfileViewerViewModel@f1c5.config$2$1$onRefresh$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
