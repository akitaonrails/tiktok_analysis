package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f1Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111270f1Z extends AbstractC1110760f0k<C176500m3> {
    public final TextView LLILZ;

    public C1111270f1Z(View view) {
        super(view);
        this.LLILZ = (TextView) view.findViewById(R.id.text);
        view.findViewById(R.id.k55);
    }

    @Override // X.AbstractC1111020f1A
    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
        TextView textView;
        CharSequence content = ((AbstractC1110790f0n) interfaceC1112060f2q).getContent();
        if (content != null && (textView = this.LLILZ) != null) {
            textView.setText(content);
        }
    }
}
