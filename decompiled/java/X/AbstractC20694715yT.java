package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20694715yT extends AbstractC19293010ds {
    public final String LLILZIL;
    public final boolean LLILZLL;
    public final Object LLIZ;
    public final PushItem LLIZLLLIL;

    public abstract AbstractC20694715yT LIZLLL(Function1 function1, boolean z);

    @Override // X.AbstractC19293010ds
    public boolean LIZ() {
        return this.LLILZLL;
    }

    public PushItem LIZIZ() {
        return this.LLIZLLLIL;
    }

    public String getUniqueId() {
        return this.LLILZIL;
    }

    public boolean equals(Object obj) {
        String str;
        AbstractC20694715yT abstractC20694715yT;
        AbstractC19293010ds abstractC19293010ds;
        String str2 = this.LLILLL;
        boolean z = obj instanceof AbstractC20694715yT;
        String uniqueId = null;
        if (z && (abstractC19293010ds = (AbstractC19293010ds) obj) != null) {
            str = abstractC19293010ds.LLILLL;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str2, str)) {
            String uniqueId2 = getUniqueId();
            if (z && (abstractC20694715yT = (AbstractC20694715yT) obj) != null) {
                uniqueId = abstractC20694715yT.getUniqueId();
            }
            if (Intrinsics.LJFF(uniqueId2, uniqueId)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public AbstractC20694715yT(String str, boolean z, boolean z2, Object obj, PushItem pushItem) {
        super(z, obj, 8);
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = obj;
        this.LLIZLLLIL = pushItem;
    }
}
