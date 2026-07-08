package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O2I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.EditCaptionBottomBarAssemTrigger$onViewCreated$2", f = "EditCaptionBottomBarAssem.kt", l = {}, m = "invokeSuspend")
public final class C0O2I extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ boolean LL;
    public final /* synthetic */ EditCaptionBottomBarAssemTrigger LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O2I(EditCaptionBottomBarAssemTrigger editCaptionBottomBarAssemTrigger, InterfaceC1364105Vn<? super C0O2I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editCaptionBottomBarAssemTrigger;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0O2I c0o2i = new C0O2I(this.LLILLJJLI, interfaceC1364105Vn);
        c0o2i.LL = ((Boolean) obj).booleanValue();
        return c0o2i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return invoke(bool.booleanValue(), interfaceC1364105Vn);
    }

    public final Object invoke(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(z), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        C1C7U.LIZ("EditCaptionBottomBarAssemTrigger@fe8b.onViewCreated$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C786410Ut5.LJLLLLLL(8, this.LLILLJJLI.LJJIJL());
        } else {
            VideoItemParams videoItemParams = this.LLILLJJLI.LLJL;
            if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null) {
                EditCaptionBottomBarAssemTrigger editCaptionBottomBarAssemTrigger = this.LLILLJJLI;
                if (C698140Ra0.LIZ(aweme)) {
                    C786410Ut5.LJLLLLLL(0, editCaptionBottomBarAssemTrigger.LJJIJL());
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditCaptionBottomBarAssemTrigger@fe8b.onViewCreated$2");
        return unit;
    }
}
