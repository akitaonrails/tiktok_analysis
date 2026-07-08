package X;

import com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0ZUD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.redesign.detailpage.viewmodel.MediaGridViewModel$onPrepared$1$3", f = "MediaGridViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0ZUD extends C09AX implements Function2<C1887407aK, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MediaGridViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZUD(MediaGridViewModel mediaGridViewModel, InterfaceC1364105Vn<? super C0ZUD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mediaGridViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0ZUD c0zud = new C0ZUD(this.LLILLJJLI, interfaceC1364105Vn);
        c0zud.LL = obj;
        return c0zud;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaGridViewModel@164c.onPrepared$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1887407aK c1887407aK = (C1887407aK) this.LL;
        List<C869590Y9l> list = c1887407aK.LIZ;
        boolean z = c1887407aK.LIZIZ;
        List<C0ZW7> listHQ2 = this.LLILLJJLI.HQ2(list);
        if (listHQ2.isEmpty()) {
            listHQ2 = Collections.singletonList(new C345480DgY(EnumC904370Zdr.PRIVATE_MEDIA, false));
        }
        List<AbstractC345490DgZ> list2 = this.LLILLJJLI.getState().LLILLL;
        this.LLILLJJLI.setState(new AwS593S0100000_14(listHQ2, (List<C0YAE>) 124));
        if (Intrinsics.LJFF(list2, listHQ2)) {
            this.LLILLJJLI.JQ2(EnumC904370Zdr.PRIVATE_MEDIA);
        } else if (this.LLILLJJLI.LLILZ != null && z) {
            this.LLILLJJLI.LLILZLL = true;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaGridViewModel@164c.onPrepared$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1887407aK c1887407aK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1887407aK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
