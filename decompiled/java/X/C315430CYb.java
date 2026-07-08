package X;

import com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel;
import com.ss.android.ugc.aweme.im.lightinteract.api.model.AlphaVideoFileModel;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.interactioncard.viewmodel.InteractionCardViewModel$obtainVideoResource$1$1", f = "InteractionCardViewModel.kt", l = {}, m = "invokeSuspend")
public final class C315430CYb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AlphaVideoFileModel.Item LL;
    public final /* synthetic */ Function1<DataSource, Unit> LLILLJJLI;
    public final /* synthetic */ InteractionCardViewModel LLILLL;
    public final /* synthetic */ File LLILZ;
    public final /* synthetic */ Function1<AlphaVideoFileModel.Item, DataSource> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C315430CYb(AlphaVideoFileModel.Item item, Function1<? super DataSource, Unit> function1, InteractionCardViewModel interactionCardViewModel, File file, Function1<? super AlphaVideoFileModel.Item, ? extends DataSource> function12, InterfaceC1364105Vn<? super C315430CYb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = item;
        this.LLILLJJLI = function1;
        this.LLILLL = interactionCardViewModel;
        this.LLILZ = file;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315430CYb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractionCardViewModel@87d.obtainVideoResource$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            this.LLILLJJLI.invoke(null);
        } else {
            this.LLILLL.LL.put(this.LLILZ.getAbsolutePath(), this.LL);
            this.LLILLJJLI.invoke(this.LLILZIL.invoke(this.LL));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractionCardViewModel@87d.obtainVideoResource$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
