package X;

import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.13k2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20095613k2 extends AbstractC20095313jz<CharSequence> {
    public C20095613k2(Class cls) {
        super(R.id.x27, cls, 64, 30);
    }

    @Override // X.AbstractC20095313jz
    public final CharSequence LIZIZ(View view) {
        return C20096013k6.LIZIZ(view);
    }

    @Override // X.AbstractC20095313jz
    public final void LIZJ(View view, CharSequence charSequence) {
        C20096013k6.LJFF(view, charSequence);
    }

    @Override // X.AbstractC20095313jz
    public final boolean LJFF(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
