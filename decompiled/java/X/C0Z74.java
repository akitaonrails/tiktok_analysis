package X;

import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z74, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z74 implements Serializable {
    public final VORightOperationType rightOperationType;

    public final C0Z74 copy(VORightOperationType vORightOperationType) {
        return new C0Z74(vORightOperationType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Z74) && Intrinsics.LJFF(this.rightOperationType, ((C0Z74) obj).rightOperationType);
    }

    public C0Z74(VORightOperationType vORightOperationType) {
        this.rightOperationType = vORightOperationType;
    }
}
