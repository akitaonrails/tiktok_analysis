package X;

import android.content.Context;
import android.os.Bundle;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class DialogC780480UjW extends C19GI {
    public CharSequence LLIZLLLIL;
    public C419090Gbz LLJ;

    @Override // X.C19GI
    public final boolean LJJZ() {
        return false;
    }

    public DialogC780480UjW(Context context) {
        super(context, R.style.ny);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C419090Gbz c419090Gbz = new C419090Gbz(getContext());
        this.LLJ = c419090Gbz;
        setContentView(c419090Gbz);
        this.LLJ.setMessage(this.LLIZLLLIL);
    }
}
