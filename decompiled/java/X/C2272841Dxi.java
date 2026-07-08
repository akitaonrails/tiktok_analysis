package X;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: X.1Dxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2272841Dxi implements Serializable {
    public static final C2272851Dxj Companion = new Object() { // from class: X.1Dxj
    };
    public final Bundle extra;
    public final int type;
    public String value;

    public final void setValue(String str) {
        this.value = str;
    }

    public C2272841Dxi(int i, String str, Bundle bundle) {
        this.type = i;
        this.value = str;
        this.extra = bundle;
    }
}
