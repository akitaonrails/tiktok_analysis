package X;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0buV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991570buV {
    public final String LIZ;
    public final CharSequence LIZIZ;
    public final int LIZJ;

    public final PlaybackStateCompat.CustomAction LIZ() {
        return new PlaybackStateCompat.CustomAction(this.LIZ, this.LIZIZ, this.LIZJ, null);
    }

    public C991570buV(String str, CharSequence charSequence, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(charSequence)) {
                if (i != 0) {
                    this.LIZ = str;
                    this.LIZIZ = charSequence;
                    this.LIZJ = i;
                    return;
                }
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
        }
        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
    }
}
