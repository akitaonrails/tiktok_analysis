package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FOz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.EditGuidePostHelper$showGuidePostingDialog$2", f = "EditGuidePostHelper.kt", l = {}, m = "invokeSuspend")
public final class C389510FOz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C389510FOz(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2, InterfaceC1364105Vn<? super C389510FOz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C389510FOz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditGuidePostHelper@3a46.showGuidePostingDialog$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1418900n1k c1418900n1k = C1418900n1k.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        int i2 = this.LLILZ;
        c1418900n1k.getClass();
        C1418900n1k.LIZ(i, i2, videoPublishEditModel, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditGuidePostHelper@3a46.showGuidePostingDialog$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
