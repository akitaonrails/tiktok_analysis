package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EPx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364270EPx {
    public final int LIZ;
    public final String LIZIZ;
    public final List<EffectPointModel> LIZJ;

    public C364270EPx() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C364270EPx)) {
            return false;
        }
        C364270EPx c364270EPx = (C364270EPx) obj;
        return this.LIZ == c364270EPx.LIZ && Intrinsics.LJFF(this.LIZIZ, c364270EPx.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c364270EPx.LIZJ);
    }

    public /* synthetic */ C364270EPx(int i) {
        this(-1, "", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C364270EPx(int i, String str, List<? extends EffectPointModel> list) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = list;
    }
}
