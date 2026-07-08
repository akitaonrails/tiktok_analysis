package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528640KoI {
    public final List<TikTokMediaModel> LIZ;
    public final boolean LIZIZ;

    public C528640KoI() {
        this(3);
    }

    public /* synthetic */ C528640KoI(int i) {
        ArrayList arrayList;
        boolean z;
        if ((i & 1) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(arrayList, z);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C528640KoI.class, cls)) {
            return false;
        }
        C528640KoI c528640KoI = (C528640KoI) obj;
        if (this.LIZIZ != c528640KoI.LIZIZ || this.LIZ.size() != c528640KoI.LIZ.size()) {
            return false;
        }
        Iterator<TikTokMediaModel> it2 = this.LIZ.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int i2 = i + 1;
            if (ListProtector.get(c528640KoI.LIZ, i) != it2.next()) {
                return false;
            }
            i = i2;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C528640KoI(List<? extends TikTokMediaModel> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
