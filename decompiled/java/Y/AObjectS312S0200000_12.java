package Y;

import X.C0U3O;
import X.C0UF9;
import X.C1170640gZK;
import X.C1208700hYi;
import X.C1397660mTU;
import X.C197039127h;
import X.C207209166l;
import X.C786410Ut5;
import X.InterfaceC1103130eoR;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: loaded from: classes13.dex */
public class AObjectS312S0200000_12 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        ((C1170640gZK) aObjectS312S0200000_12.l0).onClick(((CollectionContentFragment) aObjectS312S0200000_12.l1).getView());
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        ((C1208700hYi) aObjectS312S0200000_12.l0).onClick(((CollectionContentFragment) aObjectS312S0200000_12.l1).getView());
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        C0UF9 c0uf9 = (C0UF9) aObjectS312S0200000_12.l0;
        InterfaceC1103130eoR interfaceC1103130eoR = (InterfaceC1103130eoR) aObjectS312S0200000_12.l1;
        c0uf9.getClass();
        if (((Boolean) obj).booleanValue()) {
            interfaceC1103130eoR.setAlpha(c0uf9.LLILLJJLI.LLILLJJLI.floatValue());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS312S0200000_12.l0;
        Context context = (Context) aObjectS312S0200000_12.l1;
        C197039127h c197039127h = (C197039127h) obj;
        awemeListFragmentImpl.getClass();
        c197039127h.setText(context.getString(2131846517));
        c197039127h.setButtonVariant(1);
        c197039127h.setButtonSize(1);
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.J6(c197039127h, layoutParams);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(awemeListFragmentImpl, 272));
        return null;
    }

    public static final Object invoke$4(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) aObjectS312S0200000_12.l0;
        Context context = (Context) aObjectS312S0200000_12.l1;
        C197039127h c197039127h = (C197039127h) obj;
        awemeListFragmentImpl.getClass();
        c197039127h.setText(context.getString(2131846509));
        c197039127h.setButtonVariant(1);
        c197039127h.setButtonSize(1);
        ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
        layoutParams.width = -2;
        C786410Ut5.J6(c197039127h, layoutParams);
        C786410Ut5.U8(c197039127h, new ACListenerS154S0100000_19(awemeListFragmentImpl, 271));
        return null;
    }

    public static final Object invoke$5(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        ((C0U3O) obj).LJFF(new AwS378S0200000_12((LiveEffect) aObjectS312S0200000_12.l0, (C207209166l) aObjectS312S0200000_12.l1, 109));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AObjectS312S0200000_12 aObjectS312S0200000_12, Object obj) {
        ((C0U3O) obj).LJFF(new AwS378S0200000_12((C207209166l) aObjectS312S0200000_12.l1, (Function1) aObjectS312S0200000_12.l0, 114));
        return Unit.LIZ;
    }

    public AObjectS312S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
