package X;

import Y.ACListenerS143S0100000_8;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Lil, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C550690Lil extends AbstractC1664490tPr<C550090Lhn, C550680Lik> {
    public LinearLayout LLJJJIL;
    public C0F9K LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public View LLJJJJLIIL;
    public C197039127h LLJJL;
    public C197039127h LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.d1d, viewGroup, false);
        this.LLJJJJ = (C0F9K) viewGroup2.findViewById(R.id.kbi);
        this.LLJJJJJIL = (TuxTextView) viewGroup2.findViewById(R.id.ito);
        this.LLJJJIL = (LinearLayout) viewGroup2.findViewById(R.id.mb6);
        this.LLJJJJLIIL = viewGroup2.findViewById(R.id.mb5);
        this.LLJJL = (C197039127h) viewGroup2.findViewById(R.id.it3);
        this.LLJJLIIIJLLLLLLLZ = (C197039127h) viewGroup2.findViewById(R.id.ojx);
        TuxTextView tuxTextView = (TuxTextView) viewGroup2.findViewById(R.id.ita);
        this.LLJL = tuxTextView;
        if (tuxTextView != null) {
            tuxTextView.setTextColorRes(R.attr.zl);
        }
        C197039127h c197039127h = this.LLJJL;
        if (c197039127h != null) {
            c197039127h.LJJJJL(AFwS228S0000000_1.get$arr$(929));
        }
        C197039127h c197039127h2 = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h2 != null) {
            c197039127h2.LJJJJL(AFwS228S0000000_1.get$arr$(930));
        }
        C197039127h c197039127h3 = this.LLJJL;
        if (c197039127h3 != null) {
            C786410Ut5.U8(c197039127h3, new ACListenerS143S0100000_8(this, 154));
        }
        C197039127h c197039127h4 = this.LLJJLIIIJLLLLLLLZ;
        if (c197039127h4 != null) {
            C786410Ut5.U8(c197039127h4, new ACListenerS143S0100000_8(this, 155));
        }
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lio
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C550090Lhn) obj).LIZ);
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 797));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Li1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C550090Lhn) obj).LIZLLL;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 798));
        LLLLJI(LLLLILI(), new C2217381BqS() { // from class: X.0Lho
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C550090Lhn) obj).LIZIZ;
            }
        }, Lifecycle.State.STARTED, new AwS587S0100000_8(this, 799));
        return viewGroup2;
    }
}
