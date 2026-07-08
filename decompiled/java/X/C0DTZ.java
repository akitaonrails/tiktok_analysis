package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0DTZ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DTZ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C492630JTp LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0DTZ(C492630JTp c492630JTp, View view, C19EG c19eg) {
        super(0);
        this.LL = c492630JTp;
        this.LLILLJJLI = view;
        this.LLILLL = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C492630JTp c492630JTp = this.LL;
        View view = this.LLILLJJLI;
        C19EG c19eg = this.LLILLL;
        c492630JTp.getClass();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new C339600DTa(view));
        c0om1.LIZIZ(c1251150ifB);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIL = c0om1;
        tuxSheet.LLJJJ = null;
        tuxSheet.LLJJIII = view;
        c1390920mIc.LJIIIIZZ(1);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(525));
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJJL = iLIZIZ;
        tuxSheet2.LLJJIJIIJIL = true;
        tuxSheet2.show(c19eg.getSupportFragmentManager(), "SubOnlyLiveExamplesSheet");
        return Unit.LIZ;
    }
}
