package X;

import Y.ACListenerS147S0100000_12;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.usermanage.model.AdminUserBean;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0Tc4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C750380Tc4 extends AbstractC749630Tar implements InterfaceC749850TbD {
    public final DataChannel LL;
    public final long LLILLJJLI;
    public final View LLILLL;
    public final C1099610eil LLILZ;
    public final TextView LLILZIL;
    public final TextView LLILZLL;
    public final LiveIconView LLIZ;
    public final C21411818qq LLIZLLLIL;
    public C750740Tce LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public long LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    @Override // X.InterfaceC749850TbD
    public final void OO(long j, boolean z) {
    }

    @Override // X.InterfaceC749850TbD
    public final void Rk(Exception exc) {
    }

    @Override // X.InterfaceC749850TbD
    public final void il(AdminUserBean adminUserBean, Exception exc) {
    }

    public final void I5(boolean z) {
        String str;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_setting_click");
        c474500IjALIZ.LJIJJLI(this.LL);
        c474500IjALIZ.LJJII("multi_guest_panel", "event_page");
        c474500IjALIZ.LJJII(C751350Tdd.LIZIZ(8), "setting_name");
        if (this.LLJILJIL == 1) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "to_status");
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_success");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC749630Tar
    public final <T> void V2(T t) {
        C750740Tce c750740Tce;
        Integer num;
        if ((t instanceof C750740Tce) && (c750740Tce = (C750740Tce) t) != null) {
            this.LLJ = c750740Tce;
            ImageModel imageModel = c750740Tce.LJ;
            if (imageModel != null) {
                C0JSS.LJII(this.LLILZ, imageModel);
            } else {
                this.LLILZ.setImageResource(R.drawable.el_);
            }
            this.LLILZIL.setText(C0KVU.LIZIZ(c750740Tce.LIZLLL, c750740Tce.LIZJ));
            TextView textView = this.LLILZLL;
            String str = c750740Tce.LJIIJ;
            if (str == null) {
                str = c750740Tce.LIZJ;
            }
            textView.setText(str);
            this.LLJIJIL = false;
            this.LLJILJILJ = 0L;
            C786410Ut5.LLJJIJIL(this.LLIZ, 0);
            boolean z = true;
            this.LLIZLLLIL.setEnabled(true);
            this.LLJI = true;
            C21411818qq c21411818qq = this.LLIZLLLIL;
            Map<Integer, Integer> map = c750740Tce.LJIIIZ;
            if (map == null || (num = map.get(8)) == null || num.intValue() != 1) {
                z = false;
            }
            c21411818qq.setChecked(z);
            this.LLJI = false;
        }
    }

    @Override // X.InterfaceC749850TbD
    public final void Xa(int i) {
        C750740Tce c750740Tce;
        if (i == 8 && (c750740Tce = this.LLJ) != null && c750740Tce.LIZ == this.LLJILJILJ) {
            this.LLJIJIL = false;
            this.LLJILJILJ = 0L;
            this.LLIZLLLIL.setEnabled(true);
            C750740Tce c750740Tce2 = this.LLJ;
            if (c750740Tce2 != null) {
                Map<Integer, Integer> mapLJ = c750740Tce2.LJIIIZ;
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJ);
                linkedHashMap.put(8, Integer.valueOf(this.LLJILJIL));
                c750740Tce2.LJIIIZ = linkedHashMap;
            }
            I5(true);
        }
    }

    @Override // X.InterfaceC749850TbD
    public final void gx(int i, Exception exc) {
        if (i == 8) {
            C750740Tce c750740Tce = this.LLJ;
            boolean z = true;
            if (c750740Tce != null && c750740Tce.LIZ == this.LLJILJILJ) {
                this.LLJIJIL = false;
                this.LLJILJILJ = 0L;
                this.LLIZLLLIL.setEnabled(true);
                this.LLJI = true;
                C21411818qq c21411818qq = this.LLIZLLLIL;
                if (this.LLJILJIL == 1) {
                    z = false;
                }
                c21411818qq.setChecked(z);
                this.LLJI = false;
                C501540Jlg.LIZJ(this.itemView.getContext(), exc);
                I5(false);
            }
        }
    }

    public C750380Tc4(View view, DataChannel dataChannel, long j) {
        super(1, view);
        this.LL = dataChannel;
        this.LLILLJJLI = j;
        View viewFindViewById = view.findViewById(R.id.user_row_container);
        this.LLILLL = viewFindViewById;
        C1099610eil c1099610eil = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILZ = c1099610eil;
        TextView textView = (TextView) view.findViewById(R.id.user_name);
        this.LLILZIL = textView;
        TextView textView2 = (TextView) view.findViewById(R.id.user_tag);
        this.LLILZLL = textView2;
        this.LLIZ = (LiveIconView) view.findViewById(R.id.tk9);
        C21411818qq c21411818qq = (C21411818qq) view.findViewById(R.id.nyh);
        this.LLIZLLLIL = c21411818qq;
        this.LLJILLL = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(550));
        this.LLJJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(551));
        ACListenerS147S0100000_12 aCListenerS147S0100000_12 = new ACListenerS147S0100000_12(this, 465);
        C786410Ut5.H8(c1099610eil, aCListenerS147S0100000_12);
        C786410Ut5.T7(textView, aCListenerS147S0100000_12);
        C786410Ut5.T7(textView2, aCListenerS147S0100000_12);
        C1570050qxX.LIZ(new ACListenerS147S0100000_12(this, 464), viewFindViewById);
        C786410Ut5.C7(c21411818qq, new C785920UsI(this, view, 4));
    }
}
