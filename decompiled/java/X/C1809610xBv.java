package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809610xBv extends AbstractC485930J3v<C1809640xBy, C1809600xBu> {
    public final DataChannel LIZLLL;

    public C1809610xBv(DataChannel dataChannel) {
        super(R.layout.gqt, Boolean.FALSE);
        this.LIZLLL = dataChannel;
    }

    @Override // X.AbstractC485930J3v, X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, Object obj) {
        int i;
        final C1809600xBu c1809600xBu = (C1809600xBu) viewHolder;
        C1809640xBy c1809640xBy = (C1809640xBy) obj;
        final DataChannel dataChannel = this.LIZLLL;
        ImageView imageView = c1809600xBu.LL;
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.ng;
        imageView.setImageDrawable(c0hti.LIZ(c1809600xBu.itemView.getContext()));
        TuxTextView tuxTextView = c1809600xBu.LLILLJJLI;
        if (c1809640xBy.LIZIZ) {
            i = 2131855543;
        } else {
            i = 2131855572;
        }
        tuxTextView.setText(C497740JfY.LJIJI(i));
        final String str = c1809640xBy.LIZJ;
        if (str == null || !(!a0.LJJJIL(str))) {
            str = null;
        }
        if (str != null) {
            C786410Ut5.LLLLLLJ(c1809600xBu.LLILLL, 0);
            c1809600xBu.LLILLL.setText(C497740JfY.LJIJI(2131855542));
            C197039127h c197039127h = c1809600xBu.LLILLL;
            c197039127h.setButtonSize(2);
            c197039127h.setButtonVariant(1);
            c197039127h.LJJLI(false);
            c197039127h.setMinWidth(0);
            c197039127h.setMaxWidth(Integer.MAX_VALUE);
            ViewGroup.LayoutParams layoutParams = c197039127h.getLayoutParams();
            layoutParams.width = -2;
            C786410Ut5.J6(c197039127h, layoutParams);
            c197039127h.requestLayout();
            if (!c1809600xBu.LLILZ) {
                c1809600xBu.LLILZ = true;
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                String strI5 = C1809600xBu.I5(dataChannel);
                c1810690xDf.getClass();
                C1810690xDf.LJIJ(dataChannel, strI5);
            }
            C786410Ut5.U8(c1809600xBu.LLILLL, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xBt
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
                    DataChannel dataChannel2 = dataChannel;
                    c1809600xBu.getClass();
                    String strI52 = C1809600xBu.I5(dataChannel2);
                    c1810690xDf2.getClass();
                    C1810690xDf.LJIIZILJ(dataChannel2, strI52);
                    boolean z = C1105900esu.LIZIZ;
                    C1105900esu.LJ(dataChannel, str, true, false, "", new LinkedHashMap());
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1200L);
                }
            });
            return;
        }
        C786410Ut5.LLLLLLJ(c1809600xBu.LLILLL, 8);
        C786410Ut5.U8(c1809600xBu.LLILLL, null);
        c1809600xBu.LLILZ = false;
    }

    @Override // X.AbstractC485930J3v
    public final RecyclerView.ViewHolder LJIIIIZZ(View view, ViewGroup viewGroup) {
        C289801Ai.LIZ(view, viewGroup, this.LIZLLL);
        return new C1809600xBu(view);
    }
}
