package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pwm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661300Pwm {
    public final String LIZ;
    public final UrlModel LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C661300Pwm)) {
            return false;
        }
        C661300Pwm c661300Pwm = (C661300Pwm) obj;
        return Intrinsics.LJFF(this.LIZ, c661300Pwm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c661300Pwm.LIZIZ) && this.LIZJ == c661300Pwm.LIZJ && this.LIZLLL == c661300Pwm.LIZLLL;
    }

    public C661300Pwm(int i, UrlModel urlModel, String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = urlModel;
        this.LIZJ = z;
        this.LIZLLL = i;
    }
}
