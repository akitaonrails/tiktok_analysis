package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: renamed from: X.066V, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C066V implements C066X {
    public final String LIZ;
    public final C06H2 LIZIZ;

    public C066V(String str, C06H2 c06h2) {
        this.LIZ = str;
        this.LIZIZ = c06h2;
    }

    @Override // X.C066X
    public final Object LIZ(Context context, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        FragmentManager supportFragmentManager;
        int iIntValue;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            View viewSd = C786410Ut5.Sd(R.layout.cq2, C786410Ut5.ne(context), null);
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJJIII = viewSd;
            tuxSheet.LLJLL = true;
            tuxSheet.LLJLLL = false;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            Integer numLJ = C2286608xc.LJ(iIntValue);
            TuxSheet tuxSheet2 = c1390920mIc.LIZ;
            tuxSheet2.LLJI = numLJ;
            tuxSheet2.LLILLL = true;
            c1390920mIc.LJIIIIZZ(0);
            TuxSheet tuxSheet3 = c1390920mIc.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C066U(this, viewSd, context, tuxSheet3, null), 3);
            tuxSheet3.show(supportFragmentManager, "StreakStatusPanel");
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
