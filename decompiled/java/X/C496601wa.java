package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.01wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.ui.slide.SlideGuideViewModel$onGuideRealShow$2", f = "SlideGuideViewModel.kt", l = {}, m = "invokeSuspend")
public final class C496601wa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C496601wa(InterfaceC1364105Vn<? super C496601wa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C496601wa(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SlideGuideViewModel@6464.onGuideRealShow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva repo = Keva.getRepo("slide_mask_guide_repo");
        int iLIZ = C1387310mCn.LIZ(System.currentTimeMillis());
        if (repo.getInt("last_show_day", -1) == iLIZ) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("SlideGuide", "today is record!");
        } else {
            repo.storeInt("last_show_day", iLIZ);
            int i2 = repo.getInt("show_day_count", 0) + 1;
            repo.storeInt("show_day_count", i2);
            int i3 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mark show day: ");
            sbLIZ.append(i2);
            sbLIZ.append('!');
            C1720106oR.LJI("SlideGuide", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideGuideViewModel@6464.onGuideRealShow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C496601wa(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
