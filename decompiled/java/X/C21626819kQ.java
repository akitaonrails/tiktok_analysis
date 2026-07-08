package X;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.19kQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21626819kQ extends AbstractC21626619kO {
    public static final C21626819kQ LIZIZ = new C21626819kQ();

    public C21626819kQ() {
        super(null);
    }

    @Override // X.AbstractC21626619kO
    public final boolean LIZIZ() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }
}
