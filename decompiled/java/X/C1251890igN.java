package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;

/* JADX INFO: renamed from: X.0igN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251890igN extends RecyclerView.ViewHolder implements InterfaceC1259240isE, InterfaceC1259660isu {
    public final LinearLayout LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TuxIconView LLILZ;
    public final C197039127h LLILZIL;
    public final Context LLILZLL;
    public String LLIZ;
    public boolean LLIZLLLIL;
    public long LLJ;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    @Override // X.InterfaceC1259240isE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U4(com.ss.android.ugc.aweme.profile.model.User r12) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1251890igN.U4(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    @Override // X.InterfaceC1259660isu
    public final void Y1(boolean z) {
        if (z) {
            ((ViewGroup.MarginLayoutParams) this.LL.getLayoutParams()).setMargins(0, C341940Daq.LIZ(48.0d), 0, C341940Daq.LIZ(24.0d));
        } else {
            ((ViewGroup.MarginLayoutParams) this.LL.getLayoutParams()).setMargins(0, C341940Daq.LIZ(24.0d), 0, C341940Daq.LIZ(24.0d));
        }
    }

    public C1251890igN(View view, C19EG c19eg, InterfaceC1259540isi interfaceC1259540isi, C1259360isQ c1259360isQ) {
        super(view);
        this.LL = (LinearLayout) view.findViewById(R.id.jbr);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.v36);
        this.LLILLL = (TextView) view.findViewById(R.id.v37);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.h3u);
        this.LLILZIL = (C197039127h) view.findViewById(R.id.upload_work);
        this.LLILZLL = c19eg;
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LJ = true;
        interfaceC1259540isi.Zx(this);
        ((HashSet) c1259360isQ.LLLLILI).add(this);
    }
}
