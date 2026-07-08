package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f2J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111730f2J extends AbstractC1111750f2L<InterfaceC1112060f2q> {
    public final TextView LL;

    public C1111730f2J(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.iyn);
    }

    public final void I5(InterfaceC1112060f2q interfaceC1112060f2q) {
        CharSequence content;
        if (!(interfaceC1112060f2q instanceof AbstractC1110800f0o) || (content = ((AbstractC1110790f0n) interfaceC1112060f2q).getContent()) == null) {
            return;
        }
        this.LL.setText(content);
        if (interfaceC1112060f2q instanceof C1111000f18) {
            ((C1111000f18) interfaceC1112060f2q).LJJL(new C1109990ezV(this.LL, content));
        }
    }
}
