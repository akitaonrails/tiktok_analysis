package Y;

import X.C197039127h;
import X.C786410Ut5;
import X.EnumC1252760ihm;
import android.content.Context;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AObjectS194S0300000_19 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS194S0300000_19 aObjectS194S0300000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS194S0300000_19.l0;
        Context context = (Context) aObjectS194S0300000_19.l1;
        EnumC1252760ihm enumC1252760ihm = (EnumC1252760ihm) aObjectS194S0300000_19.l2;
        C197039127h c197039127h = (C197039127h) obj;
        awemeListFragmentImpl.getClass();
        c197039127h.setText(context.getString(2131824481));
        c197039127h.setButtonVariant(1);
        C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(awemeListFragmentImpl, enumC1252760ihm, 78));
        return null;
    }

    public static final Object invoke$1(AObjectS194S0300000_19 aObjectS194S0300000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS194S0300000_19.l0;
        Context context = (Context) aObjectS194S0300000_19.l1;
        EnumC1252760ihm enumC1252760ihm = (EnumC1252760ihm) aObjectS194S0300000_19.l2;
        C197039127h c197039127h = (C197039127h) obj;
        awemeListFragmentImpl.getClass();
        c197039127h.setText(context.getString(2131824480));
        c197039127h.setButtonVariant(0);
        C786410Ut5.U8(c197039127h, new ACListenerS122S0200000_19(awemeListFragmentImpl, enumC1252760ihm, 79));
        return null;
    }

    public AObjectS194S0300000_19(AwemeListFragmentImpl awemeListFragmentImpl, Context context, EnumC1252760ihm enumC1252760ihm, int i) {
        this.$t = i;
        this.l0 = awemeListFragmentImpl;
        this.l1 = context;
        this.l2 = enumC1252760ihm;
    }
}
