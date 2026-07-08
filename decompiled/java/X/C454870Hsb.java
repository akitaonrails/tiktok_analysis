package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hsb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454870Hsb implements InterfaceC454950Hsj {
    public final C19EG LIZ;
    public final StickerTemplate LIZIZ;
    public final C869590Y9l LIZJ;
    public final View LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C454870Hsb)) {
            return false;
        }
        C454870Hsb c454870Hsb = (C454870Hsb) obj;
        return Intrinsics.LJFF(this.LIZ, c454870Hsb.LIZ) && Intrinsics.LJFF(this.LIZIZ, c454870Hsb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c454870Hsb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c454870Hsb.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FromMessage(fragmentActivity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickerTemplate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C454870Hsb(View view, C19EG c19eg, C869590Y9l c869590Y9l, StickerTemplate stickerTemplate) {
        this.LIZ = c19eg;
        this.LIZIZ = stickerTemplate;
        this.LIZJ = c869590Y9l;
        this.LIZLLL = view;
    }
}
