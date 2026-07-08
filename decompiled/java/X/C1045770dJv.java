package X;

import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dJv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045770dJv {
    public final C1BUP LIZ;

    public C1045770dJv(C1BUP c1bup) {
        this.LIZ = c1bup;
    }

    public static C1045770dJv LIZIZ(AbstractC1045430dJN abstractC1045430dJN) {
        C1BUP c1bup = (C1BUP) abstractC1045430dJN;
        C1045780dJw.LIZ(abstractC1045430dJN, "AdSession is null");
        C1045760dJu c1045760dJu = c1bup.LIZIZ;
        c1045760dJu.getClass();
        if (EnumC1046030dKL.NATIVE == c1045760dJu.LIZIZ) {
            if (!c1bup.LJFF) {
                C1045780dJw.LIZLLL(c1bup);
                C1BUI c1bui = c1bup.LJ;
                if (c1bui.LIZLLL == null) {
                    C1045770dJv c1045770dJv = new C1045770dJv(c1bup);
                    c1bui.LIZLLL = c1045770dJv;
                    return c1045770dJv;
                }
                throw new IllegalStateException("MediaEvents already exists for AdSession");
            }
            throw new IllegalStateException("AdSession is started");
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public final void LIZ(EnumC1999407sO enumC1999407sO) {
        C1045780dJw.LIZ(enumC1999407sO, "InteractionType is null");
        C1045780dJw.LIZJ(this.LIZ);
        JSONObject jSONObject = new JSONObject();
        C1287890jcR.LIZIZ(jSONObject, "interactionType", enumC1999407sO);
        this.LIZ.LJ.LIZ("adUserInteraction", jSONObject);
    }
}
