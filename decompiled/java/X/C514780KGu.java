package X;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C514780KGu extends RecyclerView.ViewHolder {
    public final C16F5 LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;
    public CountDownTimer LLIZLLLIL;
    public final RadioButton LLJ;

    public C514780KGu(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.pxs);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.pxu);
        this.LLILLL = (C16F5) view.findViewById(R.id.fwn);
        this.LLILZ = (C16F5) view.findViewById(R.id.pxv);
        this.LLILZIL = (C16F5) view.findViewById(R.id.ptw);
        this.LLILZLL = (C16F5) view.findViewById(R.id.sai);
        this.LLIZ = (C16F5) view.findViewById(R.id.qli);
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.spi);
        radioButton.setFocusable(false);
        radioButton.setClickable(false);
        this.LLJ = radioButton;
    }
}
