package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.offline.gp.newuser.INewUserDebugService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.10Mg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.utils.NUJRevampDebugHelper$tryPutDebugInfo$1", f = "NUJRevampDebugHelper.kt", l = {}, m = "invokeSuspend")
public final class C19233210Mg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C19233210Mg(InterfaceC1364105Vn<? super C19233210Mg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19233210Mg(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("NUJRevampDebugHelper@575c.tryPutDebugInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1955907lN.LIZ.getClass();
        StringBuilder sb = new StringBuilder("- 0. NUJ Strategy Center: \n");
        C19233110Mf c19233110Mf = new C19233110Mf();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("- - isFormLocalData: ");
        sbLIZ.append(c19233110Mf.LJ());
        sbLIZ.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("- - needForceUseLocalConfig: ");
        C10MU.LIZ.getClass();
        if (((Number) C10MU.LIZIZ.getValue()).intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ2.append(c19233110Mf.LIZ("need_force_use_local_config", z));
        sbLIZ2.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("- - needForceCoverNujConfig: ");
        sbLIZ3.append(c19233110Mf.LIZ("need_force_cover_nuj_config", false));
        sbLIZ3.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append("\n\n- 1. NUJPage Strategy: \n");
        C19233310Mh c19233310Mh = new C19233310Mh(false);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("- - isFormLocalData: ");
        sbLIZ4.append(c19233310Mh.LJ());
        sbLIZ4.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ4));
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("- - pageSwitchAnimation: ");
        sbLIZ5.append(c19233310Mh.LJFF());
        sbLIZ5.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ5));
        sb.append("\n\n- 2. SloganPage Strategy: \n");
        C19233810Mm.LIZ.getClass();
        C10QI c10qiLIZ = C19233810Mm.LIZ(C10MR.class);
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("- - isFormLocalData: ");
        sbLIZ6.append(c10qiLIZ.LJ());
        sbLIZ6.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ6));
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("- - pageStyle: ");
        sbLIZ7.append(C10MR.LJFF());
        sbLIZ7.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ7));
        sb.append("\n\n- 3. SloganConsentBox Strategy: \n");
        C10QI c10qiLIZ2 = C19233810Mm.LIZ(C10N5.class);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append("- - isFormLocalData: ");
        sbLIZ8.append(c10qiLIZ2.LJ());
        sbLIZ8.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ8));
        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
        sbLIZ9.append("- - shouldRun: ");
        sbLIZ9.append(c10qiLIZ2.LIZJ());
        sbLIZ9.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ9));
        sb.append("\n\n- 4. ConsentBoxPage Strategy: \n");
        C10QI c10qiLIZ3 = C19233810Mm.LIZ(C19234110Mp.class);
        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
        sbLIZ10.append("- - isFormLocalData: ");
        sbLIZ10.append(c10qiLIZ3.LJ());
        sbLIZ10.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ10));
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append("- - shouldRun: ");
        sbLIZ11.append(c10qiLIZ3.LIZJ());
        sbLIZ11.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ11));
        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
        sbLIZ12.append("- - pageStyle: ");
        sbLIZ12.append(c10qiLIZ3.LIZIZ("page_style", 0));
        sbLIZ12.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ12));
        sb.append("\n\n- 5. InterestSelect Strategy: \n");
        C10HH c10hh = (C10HH) C19233810Mm.LIZ(C10HH.class);
        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
        sbLIZ13.append("- - isFormLocalData: ");
        sbLIZ13.append(c10hh.LJ());
        sbLIZ13.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ13));
        StringBuilder sbLIZ14 = C2188811AlT.LIZ();
        sbLIZ14.append("- - pageStyle: ");
        sbLIZ14.append(c10hh.LJFF());
        sbLIZ14.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ14));
        StringBuilder sbLIZ15 = C2188811AlT.LIZ();
        sbLIZ15.append("- - topIconStyle: ");
        sbLIZ15.append(c10hh.LIZLLL("top_icon_style", "revamp"));
        sbLIZ15.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ15));
        StringBuilder sbLIZ16 = C2188811AlT.LIZ();
        sbLIZ16.append("- - skipButtonStyle: ");
        sbLIZ16.append(c10hh.LIZLLL("skip_button_style", "bottom"));
        sbLIZ16.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ16));
        StringBuilder sbLIZ17 = C2188811AlT.LIZ();
        sbLIZ17.append("- - textAlignmentStyle: ");
        sbLIZ17.append(c10hh.LIZLLL("text_alignment_style", "start"));
        sbLIZ17.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ17));
        StringBuilder sbLIZ18 = C2188811AlT.LIZ();
        sbLIZ18.append("- - needShowSelectedTagNum: ");
        sbLIZ18.append(c10hh.LIZ("need_show_selected_tag_num", true));
        sbLIZ18.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ18));
        StringBuilder sbLIZ19 = C2188811AlT.LIZ();
        sbLIZ19.append("- - skipButtonCopy: ");
        sbLIZ19.append(c10hh.LIZLLL("skip_button_copy", C20642515q3.LJI(2131838034)));
        sbLIZ19.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ19));
        StringBuilder sbLIZ20 = C2188811AlT.LIZ();
        sbLIZ20.append("- - titleCopy: ");
        sbLIZ20.append(c10hh.LIZLLL("title_copy", C20642515q3.LJI(2131838464)));
        sbLIZ20.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ20));
        StringBuilder sbLIZ21 = C2188811AlT.LIZ();
        sbLIZ21.append("- - subTitleCopy: ");
        sbLIZ21.append(c10hh.LIZLLL("sub_title_copy", C20642515q3.LJI(2131838463)));
        sbLIZ21.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ21));
        StringBuilder sbLIZ22 = C2188811AlT.LIZ();
        sbLIZ22.append("- - nextButtonCopy: ");
        sbLIZ22.append(c10hh.LIZLLL("next_button_copy", C20642515q3.LJI(2131838032)));
        sbLIZ22.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ22));
        sb.append("\n\n- 7. FeedSwipeUp Strategy: \n");
        C10QI c10qiLIZ4 = C19233810Mm.LIZ(C19233710Ml.class);
        StringBuilder sbLIZ23 = C2188811AlT.LIZ();
        sbLIZ23.append("- - isFormLocalData: ");
        sbLIZ23.append(c10qiLIZ4.LJ());
        sbLIZ23.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ23));
        StringBuilder sbLIZ24 = C2188811AlT.LIZ();
        sbLIZ24.append("- - pageStyle: ");
        sbLIZ24.append(c10qiLIZ4.LIZLLL("page_style", "online"));
        sbLIZ24.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ24));
        sb.append("\n\n- 8. Push background Strategy: \n");
        C10QI c10qiLIZ5 = C19233810Mm.LIZ(C19233910Mn.class);
        StringBuilder sbLIZ25 = C2188811AlT.LIZ();
        sbLIZ25.append("- - isFormLocalData: ");
        sbLIZ25.append(c10qiLIZ5.LJ());
        sbLIZ25.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ25));
        StringBuilder sbLIZ26 = C2188811AlT.LIZ();
        sbLIZ26.append("- - shouldRun: ");
        sbLIZ26.append(c10qiLIZ5.LIZJ());
        sbLIZ26.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ26));
        StringBuilder sbLIZ27 = C2188811AlT.LIZ();
        sbLIZ27.append("- - textAlignmentStyle: ");
        sbLIZ27.append(c10qiLIZ5.LIZLLL("text_alignment_style", "start"));
        sbLIZ27.append(" \n");
        sb.append(C2188811AlT.LIZIZ(sbLIZ27));
        sb.append("\n\n");
        ((INewUserDebugService) ServiceManager.get().getService(INewUserDebugService.class)).LJIIJJI("config_info", sb.toString());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NUJRevampDebugHelper@575c.tryPutDebugInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C19233210Mg(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
