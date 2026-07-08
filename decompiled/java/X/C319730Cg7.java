package X;

import android.view.View;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.background.ProfileBgImagePreviewActivity$performSave$1$1", f = "ProfileBgImagePreviewActivity.kt", l = {}, m = "invokeSuspend")
public final class C319730Cg7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ProfileBgImagePreviewActivity LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319730Cg7(ProfileBgImagePreviewActivity profileBgImagePreviewActivity, boolean z, InterfaceC1364105Vn<? super C319730Cg7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = profileBgImagePreviewActivity;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319730Cg7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("ProfileBgImagePreviewActivity@7895.performSave$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View view = this.LL.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ProfileBgImagePreviewActivity profileBgImagePreviewActivity = this.LL;
        boolean z = this.LLILLJJLI;
        profileBgImagePreviewActivity.getClass();
        if (z) {
            i = 2131845410;
        } else {
            i = R.string.shz;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(profileBgImagePreviewActivity);
        c1389890mGx.LJIIJ(profileBgImagePreviewActivity.getString(i));
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileBgImagePreviewActivity@7895.performSave$1$1");
        return unit;
    }
}
