package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0xBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1809470xBh extends RecyclerView.ViewHolder {
    public final C16FV LL;
    public final C16FV LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;

    public C1809470xBh(View view) {
        super(view);
        this.LL = (C16FV) view.findViewById(R.id.sdy);
        this.LLILLJJLI = (C16FV) view.findViewById(R.id.sdz);
        this.LLILLL = (C16F5) view.findViewById(R.id.se1);
        this.LLILZ = (C16F5) view.findViewById(R.id.f0j);
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, C176600m4.LIZ()), 2);
        }
        C16F5 c16f52 = (C16F5) view.findViewById(R.id.p75);
        this.LLILZIL = c16f52;
        C16F5 c16f53 = (C16F5) view.findViewById(R.id.kym);
        this.LLILZLL = c16f53;
        this.LLIZ = (C16F5) view.findViewById(R.id.sdx);
        if (C497740JfY.LJJ()) {
            if (c16f52 != null) {
                c16f52.setBackgroundResource(R.drawable.f13);
            }
            if (c16f53 != null) {
                c16f53.setBackgroundResource(R.drawable.f11);
                return;
            }
            return;
        }
        if (c16f52 != null) {
            c16f52.setBackgroundResource(R.drawable.f12);
        }
        if (c16f53 == null) {
            return;
        }
        c16f53.setBackgroundResource(R.drawable.f10);
    }
}
