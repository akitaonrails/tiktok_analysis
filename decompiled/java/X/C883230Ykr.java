package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0Ykr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C883230Ykr extends AbstractC883300Yky {
    public final String toString() {
        return "SettingUp";
    }

    public final int hashCode() {
        return C883230Ykr.class.hashCode();
    }

    @Override // X.AbstractC883300Yky
    public final AbstractC883300Yky LIZ(AbstractC883060Yka abstractC883060Yka) {
        if (abstractC883060Yka instanceof C876260YZc) {
            this.LIZ = ((C876260YZc) abstractC883060Yka).LIZ;
        } else if (!(abstractC883060Yka instanceof C0YUJ)) {
            if (abstractC883060Yka instanceof C883310Ykz) {
                return new C883180Ykm(CardStruct.IStatusCode.DEFAULT, null);
            }
            C0I0B.LJFF.LIZJ();
            if (C894660Z7w.LIZJ()) {
                throw new IllegalStateException("Unexpected action on this state");
            }
        }
        return this;
    }

    public final boolean equals(Object obj) {
        return obj instanceof C883230Ykr;
    }
}
