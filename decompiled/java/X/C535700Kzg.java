package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535700Kzg {
    public final C535280Kz0 LIZ;
    public final List<MediaModel> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C535700Kzg)) {
            return false;
        }
        C535700Kzg c535700Kzg = (C535700Kzg) obj;
        return Intrinsics.LJFF(this.LIZ, c535700Kzg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c535700Kzg.LIZIZ);
    }

    public C535700Kzg(C535280Kz0 c535280Kz0, List<MediaModel> list) {
        this.LIZ = c535280Kz0;
        this.LIZIZ = list;
    }

    public static C535700Kzg LIZ(C535700Kzg c535700Kzg, List list) {
        C535280Kz0 c535280Kz0 = c535700Kzg.LIZ;
        c535700Kzg.getClass();
        return new C535700Kzg(c535280Kz0, list);
    }
}
