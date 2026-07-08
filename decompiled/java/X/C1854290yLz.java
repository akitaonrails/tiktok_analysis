package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.tako.otherpage.image.style.TakoImageStyleItemCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0yLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1854290yLz extends FrameLayout {
    public final ViewOnAttachStateChangeListenerC20604515jv LL;
    public List<C06X5> LLILLJJLI;
    public Function0<Unit> LLILLL;
    public Function0<Unit> LLILZ;

    public final Function0<Unit> getOnCancelClick() {
        return this.LLILLL;
    }

    public final Function0<Unit> getOnDoneClick() {
        return this.LLILZ;
    }

    public final List<C06X5> getStyleData() {
        return this.LLILLJJLI;
    }

    public C1854290yLz(Context context) {
        int iIntValue;
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.frs, this);
        TuxNavBar tuxNavBar = (TuxNavBar) findViewById(R.id.x_f);
        C0OM1 c0om1 = new C0OM1();
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = context.getString(2131828355);
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS571S0100000_27(this, 1090));
        c0om1.LJ(c1250300ido);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = context.getString(2131849631);
        c0om1.LIZJ = c1250250idj;
        C1250300ido c1250300ido2 = new C1250300ido();
        c1250300ido2.LIZJ = context.getString(R.string.hz2);
        c1250300ido2.LIZLLL = EnumC638250P1r.PRIMARY;
        c1250300ido2.LIZ(new AwS571S0100000_27(this, 1091));
        c0om1.LIZIZ(c1250300ido2);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        c0om1.LIZJ(iIntValue);
        tuxNavBar.setNavActions(c0om1);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) findViewById(R.id.x_e);
        C1857750yRZ.LJIILJJIL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewOnAttachStateChangeListenerC20604515jv);
        C1857750yRZ.LJIIJJI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), viewOnAttachStateChangeListenerC20604515jv);
        C1857750yRZ.LJIILL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewOnAttachStateChangeListenerC20604515jv);
        C1857750yRZ.LJIIJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), viewOnAttachStateChangeListenerC20604515jv);
        viewOnAttachStateChangeListenerC20604515jv.setOverScrollMode(2);
        viewOnAttachStateChangeListenerC20604515jv.setLayoutManager(new GridLayoutManager(context, 3));
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(TakoImageStyleItemCell.class);
        viewOnAttachStateChangeListenerC20604515jv.setAnimation(null);
        viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
        viewOnAttachStateChangeListenerC20604515jv.addItemDecoration(new C04JB(context, 1));
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
    }

    public final void setOnCancelClick(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public final void setOnDoneClick(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setStyleData(List<C06X5> list) {
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLILLJJLI = list;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(list, null);
        }
    }
}
