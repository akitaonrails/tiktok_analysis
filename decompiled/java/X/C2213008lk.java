package X;

import android.net.Uri;
import android.widget.ImageView;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootScene$loadBackgroundLight$1$1", f = "EPAIGCPanelRootScene.kt", l = {}, m = "invokeSuspend")
public final class C2213008lk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C376260Ep6 LL;
    public final /* synthetic */ File LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213008lk(C376260Ep6 c376260Ep6, File file, InterfaceC1364105Vn<? super C2213008lk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c376260Ep6;
        this.LLILLJJLI = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2213008lk(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootScene@e8d5.loadBackgroundLight$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ImageView imageView = (ImageView) this.LL.LLJJLIIIJLLLLLLLZ.getValue();
        if (imageView == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EPAIGCPanelRootScene@e8d5.loadBackgroundLight$1$1");
            return unit;
        }
        C383660F2m.LIZ(this.LL.requireSceneContext(), Uri.fromFile(this.LLILLJJLI).toString(), imageView, new C370690Eg7(new C370680Eg6()));
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPanelRootScene@e8d5.loadBackgroundLight$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
