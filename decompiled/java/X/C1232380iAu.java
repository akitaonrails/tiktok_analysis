package X;

import Y.AfS188S0100000_19;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.anchor.AddAnchorViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkValidateResult;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0iAu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.anchor.AddAnchorViewModel$editLink$2", f = "AddAnchorViewModel.kt", l = {100}, m = "invokeSuspend")
public final class C1232380iAu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AddAnchorViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1232380iAu(AddAnchorViewModel addAnchorViewModel, String str, InterfaceC1364105Vn<? super C1232380iAu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = addAnchorViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1232380iAu(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AddAnchorViewModel@1940.editLink$2");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(2000L, this) == objLJFF) {
                C1C7U.LIZIZ("AddAnchorViewModel@1940.editLink$2");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LL = a0.LJLIIIL(this.LLILLL).toString();
        final AddAnchorViewModel addAnchorViewModel = this.LLILLJJLI;
        addAnchorViewModel.getClass();
        addAnchorViewModel.setState(AFwS257S0000000_19.get$arr$(589));
        C844470XAv.LIZ.getClass();
        if (!C0XF1.LIZLLL(C844470XAv.LIZ())) {
            addAnchorViewModel.setState(AFwS257S0000000_19.get$arr$(590));
        } else {
            ((C11NJ) addAnchorViewModel.LLILLL.getValue()).LJ();
            C11NJ c11nj = (C11NJ) addAnchorViewModel.LLILLL.getValue();
            InterfaceC1232390iAv.LIZ.getClass();
            c11nj.LIZ(new C19482811Kg(((InterfaceC1232390iAv) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ).build().retrofit.LIZ(InterfaceC1232390iAv.class)).LIZ(EnumC1430380nKG.ARTICLE_PHOTO_MODE.getTYPE(), addAnchorViewModel.LL).LJIILIIL(C1701940uOG.LIZIZ()).LJIJJ(C11S5.LIZ()), C19487811Me.LJI).LJIJJLI(30000L, TimeUnit.MILLISECONDS, new C11ID() { // from class: X.0hul
                @Override // X.C11ID
                public final void LIZ(C11IH<? super LinkValidateResult> c11ih) {
                    addAnchorViewModel.setState(AFwS257S0000000_19.get$arr$(591));
                }
            }).LJII(new AfS188S0100000_19(addAnchorViewModel, 52)).LJIILLIIL(new AfS188S0100000_19(addAnchorViewModel, 53)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AddAnchorViewModel@1940.editLink$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
