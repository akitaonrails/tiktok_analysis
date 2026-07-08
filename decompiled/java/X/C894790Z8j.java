package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C894790Z8j implements Serializable {
    public Object avatar;

    public C894790Z8j() {
        this(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C894790Z8j) && Intrinsics.LJFF(this.avatar, ((C894790Z8j) obj).avatar);
    }

    public C894790Z8j(Object obj) {
        this.avatar = obj;
    }

    public final void setAvatar(Object obj) {
        this.avatar = obj;
    }
}
