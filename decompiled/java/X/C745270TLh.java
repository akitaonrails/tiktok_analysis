package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import avg.f;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0TLh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C745270TLh extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final RadioButton LLILLJJLI;
    public final View LLILLL;

    public C745270TLh(C745260TLg c745260TLg, View view) {
        View.OnClickListener fVar;
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.oxu);
        this.LL = textView;
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.oxz);
        this.LLILLJJLI = radioButton;
        View viewFindViewById = view.findViewById(R.id.moq);
        this.LLILLL = viewFindViewById;
        ACListenerS116S0200000_12 aCListenerS116S0200000_12 = new ACListenerS116S0200000_12(c745260TLg, this, 0);
        if (C1848410yCV.LIZ) {
            fVar = new f(aCListenerS116S0200000_12);
        } else {
            fVar = aCListenerS116S0200000_12;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(radioButton);
        }
        radioButton.setOnClickListener(aVar);
        C786410Ut5.I7(aCListenerS116S0200000_12, view);
        if (!c745260TLg.LLILLJJLI) {
            textView.setTextColor(-1);
            viewFindViewById.setBackgroundColor(ColorProtector.parseColor("#80FFFFFF"));
        }
    }
}
