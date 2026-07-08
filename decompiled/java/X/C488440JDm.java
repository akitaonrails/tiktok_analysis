package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JDm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488440JDm extends RecyclerView.ViewHolder implements InterfaceC488420JDk {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final ViewGroup LLILLL;
    public final View LLILZ;
    public final View LLILZIL;

    @Override // X.InterfaceC488420JDk
    public final void LJIIJ() {
        C500260Jjc.LJIILIIL(this.LLILZ);
        C500260Jjc.LJIILIIL(this.LLILZIL);
    }

    @Override // X.InterfaceC488420JDk
    public final void LJIIZILJ() {
        C500260Jjc.LLFFF(this.LLILZ);
        C500260Jjc.LLFFF(this.LLILZIL);
    }

    public C488440JDm(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.video_title);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.video_length);
        this.LLILLL = (ViewGroup) view.findViewById(R.id.g8a);
        this.LLILZ = view.findViewById(R.id.uxz);
        this.LLILZIL = view.findViewById(R.id.uxq);
    }
}
