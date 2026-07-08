package X;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.0Wuo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C838440Wuo {
    public final ColorStateList LIZ;
    public final Configuration LIZIZ;
    public final int LIZJ;

    public C838440Wuo(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int iHashCode;
        this.LIZ = colorStateList;
        this.LIZIZ = configuration;
        if (theme == null) {
            iHashCode = 0;
        } else {
            iHashCode = theme.hashCode();
        }
        this.LIZJ = iHashCode;
    }
}
