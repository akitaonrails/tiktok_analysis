package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinGeckoResourceModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09no, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.view.widget.BulletinLottieImageWidget$showStaticImage$1", f = "BulletinLottieImageWidget.kt", l = {}, m = "invokeSuspend")
public final class C2480609no extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2481009ns LL;
    public final /* synthetic */ BulletinGeckoResourceModel LLILLJJLI;
    public final /* synthetic */ EnumC368901bz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2480609no(C2481009ns c2481009ns, BulletinGeckoResourceModel bulletinGeckoResourceModel, EnumC368901bz enumC368901bz, InterfaceC1364105Vn<? super C2480609no> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2481009ns;
        this.LLILLJJLI = bulletinGeckoResourceModel;
        this.LLILLL = enumC368901bz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2480609no(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1295960jpS c1295960jpS = this.LL.LIZLLL;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LL.LIZLLL;
        if (c1295960jpS2 != null) {
            C786410Ut5.LLD(8, c1295960jpS2);
        }
        BulletinGeckoResourceModel bulletinGeckoResourceModel = this.LLILLJJLI;
        if (bulletinGeckoResourceModel == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1");
            return unit;
        }
        String str = bulletinGeckoResourceModel.imagePath;
        if (str != null && str.length() != 0) {
            C2481009ns c2481009ns = this.LL;
            if (!C0OS8.LJI()) {
                int i = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c2481009ns.LIZIZ);
                sbLIZ.append("-BulletinLottieImageWidget: showStaticImage, startLoadImage ");
                C1720106oR.LJI("bulletin_badge", C2188811AlT.LIZIZ(sbLIZ));
            }
            InterfaceC497601wk interfaceC497601wk = this.LL.LIZ;
            List listSingletonList = Collections.singletonList(this.LLILLL);
            C1DFH c1dfh = C0PEM.LIZ;
            C363301b5.LIZ(bulletinGeckoResourceModel, interfaceC497601wk, listSingletonList, C2107308Nj.LIZ, new C2480109nj(this.LL, null));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("BulletinLottieImageWidget@f8b2.showStaticImage$1");
        return unit3;
    }
}
