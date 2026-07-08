package X;

/* JADX INFO: renamed from: X.0ESt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365010ESt {
    public static final boolean LIZ(C0ETT c0ett) {
        if (!C295260Bhk.LIZ()) {
            return false;
        }
        return !c0ett.LIZJ;
    }

    public static final boolean LIZIZ(C0ELJ c0elj) {
        boolean z = false;
        if (!C295260Bhk.LIZ() || c0elj == null) {
            return false;
        }
        if (c0elj.getFromRetouch() || c0elj.getRetouchMultiTrackMode() || c0elj.getEffectMultiTrackMode() || c0elj.getChangeBanMusicMode() != null || c0elj.isTemplateCreate()) {
            z = true;
        }
        return !z;
    }
}
