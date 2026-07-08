package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0TbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749930TbL extends RecyclerView.ViewHolder implements InterfaceC750020TbU, InterfaceC755430TkD, InterfaceC750500TcG {
    public static final SimpleDateFormat LLJJI = new SimpleDateFormat("MM/dd/yyyy");
    public C1099610eil LL;
    public TextView LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public TextView LLILZIL;
    public TextView LLILZLL;
    public C1324720kZq LLIZ;
    public final Context LLIZLLLIL;
    public List<User> LLJ;
    public final String LLJI;
    public final DataChannel LLJIJIL;
    public User LLJILJIL;
    public final long LLJILJILJ;
    public final long LLJILLL;
    public final InterfaceC749940TbM LLJJ;

    @Override // X.InterfaceC750020TbU
    public final void E5() {
    }

    @Override // X.InterfaceC755430TkD
    public final void FN() {
    }

    @Override // X.InterfaceC750020TbU
    public final void LLLLLLJ(C752140Teu c752140Teu, Exception exc) {
    }

    @Override // X.InterfaceC755430TkD
    public final void TC(C752140Teu c752140Teu, Exception exc) {
    }

    @Override // X.InterfaceC750020TbU
    public final void LJJJLZIJ(boolean z) {
        if (!z) {
            C786410Ut5.LLIL(this.LLILLJJLI, 0);
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
            C749960TbO c749960TbO = new C749960TbO(false, this.LLJILJIL.getId());
            InterfaceC749940TbM interfaceC749940TbM = this.LLJJ;
            if (interfaceC749940TbM != null) {
                interfaceC749940TbM.LIZ(c749960TbO);
            }
            C784440Upu.LIZ().LIZIZ(c749960TbO);
        }
    }

    @Override // X.InterfaceC750500TcG
    public final void ca(Exception exc) {
        C786410Ut5.LLIL(this.LLILLJJLI, 0);
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
    }

    @Override // X.InterfaceC750500TcG
    public final void cd(long j, boolean z) {
        if (!z) {
            User user = this.LLJILJIL;
            if (user != null) {
                C749970TbP c749970TbP = new C749970TbP(user.getId());
                C784440Upu.LIZ().LIZIZ(c749970TbP);
                InterfaceC749940TbM interfaceC749940TbM = this.LLJJ;
                if (interfaceC749940TbM != null) {
                    interfaceC749940TbM.LIZIZ(c749970TbP);
                }
            }
            C786410Ut5.LLIL(this.LLILLJJLI, 0);
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
        }
    }

    @Override // X.InterfaceC750020TbU
    public final void e0(boolean z, Exception exc) {
        if (!z) {
            C786410Ut5.LLIL(this.LLILLJJLI, 0);
            C786410Ut5.LJLLLLLL(8, this.LLILZ);
            C501540Jlg.LIZJ(this.LLIZLLLIL, exc);
        }
    }

    public C749930TbL(Context context, View view, String str, long j, long j2, C749890TbH c749890TbH, DataChannel dataChannel) {
        super(view);
        this.LLJ = new ArrayList();
        this.LL = (C1099610eil) view.findViewById(R.id.jjh);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.db0);
        this.LLILZ = view.findViewById(R.id.dbc);
        this.LLILZIL = (TextView) view.findViewById(R.id.p94);
        this.LLILZLL = (TextView) view.findViewById(R.id.user_name);
        this.LLIZ = (C1324720kZq) view.findViewById(R.id.user_class_medal);
        this.LLILLL = view.findViewById(R.id.db9);
        this.LLIZLLLIL = context;
        this.LLJI = str;
        this.LLJILJILJ = j;
        this.LLJILLL = j2;
        this.LLJJ = c749890TbH;
        this.LLJIJIL = dataChannel;
    }
}
