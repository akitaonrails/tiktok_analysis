package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.music.assem.report.compose.ReportDetailsFragmentCompose;
import com.ss.android.ugc.aweme.music.assem.report.compose.ReportSubmittedFragmentCompose;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ODF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.assem.report.compose.ReportDetailsFragmentCompose$OnSubmitEvent$2$1", f = "ReportDetailsFragmentCompose.kt", l = {}, m = "invokeSuspend")
public final class C0ODF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C05P1<C597100NbQ> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ ReportDetailsFragmentCompose LLILLL;
    public final /* synthetic */ C05P0<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ODF(C05P1<C597100NbQ> c05p1, String str, ReportDetailsFragmentCompose reportDetailsFragmentCompose, C05P0<Boolean> c05p0, InterfaceC1364105Vn<? super C0ODF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c05p1;
        this.LLILLJJLI = str;
        this.LLILLL = reportDetailsFragmentCompose;
        this.LLILZ = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ODF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC597760NcU enumC597760NcULIZ;
        FragmentManager supportFragmentManager;
        C1C7U.LIZ("ReportDetailsFragmentCompose@23c1.OnSubmitEvent$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C291001Au<EnumC597760NcU> c291001Au = this.LL.getValue().LL;
        if (c291001Au != null && (enumC597760NcULIZ = c291001Au.LIZ()) != null) {
            int i = C597770NcV.LIZ[enumC597760NcULIZ.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    C05P0<Boolean> c05p0 = this.LLILZ;
                    String str = ReportDetailsFragmentCompose._pnsPageId;
                    c05p0.setValue(Boolean.TRUE);
                }
            } else {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("music_id", this.LLILLJJLI);
                c2344009Gk.LJIIIIZZ("result", "success");
                c2344009Gk.LIZJ(((MusicPlayViewModel) this.LLILLL.LL.getValue()).LLJILJIL.contains(this.LLILLJJLI) ? 1 : 0, "play_music_flag");
                C20684815ws.LJIILLIIL("artist_report_result", c2344009Gk.LIZ);
                C19EG activity = this.LLILLL.getActivity();
                if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                    ReportDetailsFragmentCompose reportDetailsFragmentCompose = this.LLILLL;
                    reportDetailsFragmentCompose.getClass();
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJLL = true;
                    tuxSheet.LLJLILLLLZIIL = false;
                    c1390920mIc.LIZ.LLJJIJI = new ReportSubmittedFragmentCompose();
                    c1390920mIc.LJIIIIZZ(1);
                    int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(reportDetailsFragmentCompose.getActivity())) * 0.9d);
                    TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                    tuxSheet2.LLJJL = iLJIIIIZZ;
                    tuxSheet2.show(supportFragmentManager, "report_submitted");
                }
                String str2 = TuxSheet._pnsPageId;
                C1391190mJ3.LJFF(this.LLILLL, C343970De7.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReportDetailsFragmentCompose@23c1.OnSubmitEvent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
