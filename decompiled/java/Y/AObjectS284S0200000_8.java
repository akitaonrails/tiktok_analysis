package Y;

import X.C0L90;
import X.C0LZD;
import X.C1660680tJi;
import X.C524780Ki4;
import X.C529740Kq4;
import X.InterfaceC528410Knv;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.performance.AlbumSelectionRestorePerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.ss.android.ugc.cut_ui_impl.process.NLECutCompressActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public class AObjectS284S0200000_8 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS284S0200000_8 aObjectS284S0200000_8) {
        ((p1) aObjectS284S0200000_8.l0).LIZLLL((C0LZD) aObjectS284S0200000_8.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS284S0200000_8 aObjectS284S0200000_8) {
        C529740Kq4 c529740Kq4 = (C529740Kq4) aObjectS284S0200000_8.l0;
        C0L90 c0l90 = (C0L90) aObjectS284S0200000_8.l1;
        c529740Kq4.LLJJJIL = false;
        InterfaceC528410Knv interfaceC528410Knv = c529740Kq4.LLJJ;
        if (interfaceC528410Knv != null) {
            interfaceC528410Knv.LIZIZ(c0l90);
        }
        c529740Kq4.LLLLJ();
        if (c0l90 == C0L90.SELECTION_RESTORE) {
            C524780Ki4.LIZ.end(AlbumSelectionRestorePerformanceMonitor.INSTANCE, (String) null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS284S0200000_8 aObjectS284S0200000_8) {
        ((NLECutCompressActivity) aObjectS284S0200000_8.l0).getClass();
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS284S0200000_8 aObjectS284S0200000_8) {
        Context context = (Context) aObjectS284S0200000_8.l0;
        Bundle bundle = (Bundle) aObjectS284S0200000_8.l1;
        String str = DraftBoxActivity._pnsPageId;
        Intent intent = new Intent(context, (Class<?>) DraftBoxActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        DraftBoxActivity.LLLLZLL(context, intent);
        return null;
    }

    public static final Object invoke$4(AObjectS284S0200000_8 aObjectS284S0200000_8) {
        C1660680tJi.LIZ().LJIJI((Context) aObjectS284S0200000_8.l0, (Intent) aObjectS284S0200000_8.l1);
        return null;
    }

    public AObjectS284S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
