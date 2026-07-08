package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0zn6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC1909540zn6 extends C19292910dr implements View.OnClickListener {
    public final String LLILZIL;
    public final String LLILZLL;
    public final Context LLIZ;

    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    public final C19319810iC LIZLLL() {
        return new C19319810iC(C0XJ9.LIZIZ(), this.LLILZIL, this, false, null, null, null, this.LLILZLL, false, false, false, null, 130040);
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public ViewOnClickListenerC1909540zn6(Fragment fragment) {
        super(null);
        this.LLILZIL = fragment.getString(2131830502);
        this.LLILZLL = fragment.getString(2131830501);
        this.LLIZ = fragment.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        final int i;
        LJIIIIZZ();
        final boolean z = LIZIZ().LLJJIJIL;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C1909560zn8 c1909560zn8 = InterfaceC1909550zn7.LIZ;
        InterfaceC2385309Wh interfaceC2385309Wh = new InterfaceC2385309Wh() { // from class: X.0zsc
            @Override // X.InterfaceC2385309Wh
            public final Object then(C15O7<BaseResponse> c15o7) {
                String str;
                C1C7U.LIZ("DataSaverUnit@5e65.onClick$1");
                if (!c15o7.LJIILIIL() && !c15o7.LJIILL()) {
                    if (c15o7.LJIILJJIL()) {
                        try {
                            C746350TPl.LIZ.LIZJ().LJ(Integer.valueOf(i));
                            if (z) {
                                str = "data_saver_on";
                            } else {
                                str = "data_saver_off";
                            }
                            C20684815ws.onEventV3(str);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            ViewOnClickListenerC1909540zn6 viewOnClickListenerC1909540zn6 = this.LIZ;
                            viewOnClickListenerC1909540zn6.LJIIIIZZ();
                            C1233040iBy c1233040iBy = new C1233040iBy(viewOnClickListenerC1909540zn6.LLIZ);
                            c1233040iBy.LIZIZ(2131834217);
                            c1233040iBy.LIZLLL();
                        }
                    }
                } else {
                    ViewOnClickListenerC1909540zn6 viewOnClickListenerC1909540zn62 = this.LIZ;
                    viewOnClickListenerC1909540zn62.LJIIIIZZ();
                    C1233040iBy c1233040iBy2 = new C1233040iBy(viewOnClickListenerC1909540zn62.LLIZ);
                    c1233040iBy2.LIZIZ(2131834217);
                    c1233040iBy2.LIZLLL();
                }
                C1C7U.LIZIZ("DataSaverUnit@5e65.onClick$1");
                return null;
            }
        };
        c1909560zn8.getClass();
        C1909560zn8.LIZIZ.LIZ(i).LJ(interfaceC2385309Wh, C15O7.LJIIIIZZ, null);
    }
}
