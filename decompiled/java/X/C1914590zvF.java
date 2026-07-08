package X;

import Y.ACListenerS130S0200000_28;
import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupAction;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupBlock;
import com.ss.android.ugc.aweme.pns.universalpopup.core.model.UniversalPopupButton;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0zvF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1914590zvF extends AbstractC1914480zv4 {
    public final String LJ;
    public final String LJFF;
    public View LJI;

    @Override // X.AbstractC1914480zv4
    public final FrameLayout LIZ() {
        UniversalPopupButton universalPopupButton;
        View view;
        TuxIconView tuxIconView;
        UniversalPopupButton universalPopupButton2;
        View view2;
        TuxIconView tuxIconView2;
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.f8r, frameLayout, true);
        this.LJI = viewTd;
        if (viewTd != null && (textView2 = (TextView) viewTd.findViewById(R.id.wtv_thumb_feedback_text)) != null) {
            textView2.setText(this.LJ);
        }
        View view3 = this.LJI;
        if (view3 != null && (textView = (TextView) view3.findViewById(R.id.wtv_thumb_feedback_response_text)) != null) {
            textView.setText(this.LJFF);
        }
        List<UniversalPopupButton> list = this.LIZJ.buttons;
        if (list != null && (universalPopupButton2 = (UniversalPopupButton) ListProtector.get(list, 0)) != null && (view2 = this.LJI) != null && (tuxIconView2 = (TuxIconView) view2.findViewById(R.id.wtv_thumb_feedback_like)) != null) {
            C786410Ut5.a9(tuxIconView2, new ACListenerS130S0200000_28(this, universalPopupButton2, 53));
        }
        List<UniversalPopupButton> list2 = this.LIZJ.buttons;
        if (list2 != null && (universalPopupButton = (UniversalPopupButton) ListProtector.get(list2, 1)) != null && (view = this.LJI) != null && (tuxIconView = (TuxIconView) view.findViewById(R.id.wtv_thumb_feedback_dislike)) != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS130S0200000_28(this, universalPopupButton, 54));
        }
        return frameLayout;
    }

    public final void LIZLLL(UniversalPopupAction universalPopupAction) {
        this.LIZIZ.pl(universalPopupAction, null, null);
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS128S0100000_28(this, 117));
    }

    public C1914590zvF(Context context, InterfaceC1914580zvE interfaceC1914580zvE, UniversalPopupBlock universalPopupBlock, String str, String str2) {
        super(context, interfaceC1914580zvE, universalPopupBlock);
        this.LJ = str;
        this.LJFF = str2;
    }
}
