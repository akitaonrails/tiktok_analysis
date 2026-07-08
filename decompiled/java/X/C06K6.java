package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06K6, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06K6 implements C06GZ {
    public final C06K7 LIZ = new C06K7();

    @Override // X.C06GZ
    public final String LJII() {
        return "default";
    }

    @Override // X.C06GZ
    public final void LJIIJ() {
    }

    @Override // X.C06GZ
    public final int isAvailable() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    @Override // X.C06GZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo LIZ() {
        /*
            r7 = this;
            X.0ZBp r0 = com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi r0 = X.C895630ZBp.LIZ()
            java.lang.String r4 = "chat_ambient_animation_resource"
            java.lang.String r5 = ""
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L81
            com.bytedance.forest.Forest r2 = r0.LJIIJJI()
            if (r2 == 0) goto L81
            com.bytedance.forest.model.RequestParams r1 = new com.bytedance.forest.model.RequestParams
            r1.<init>(r6, r3, r6)
            r1.disableBuiltin = r3
            X.0q1M r0 = X.EnumC1533980q1M.OTHER
            r1.resourceScene = r0
            r1.enableRequestReuse = r3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.enableMemoryCache = r0
            r1.enableCDNCache = r0
            r1.channel = r4
            java.lang.String r0 = "/keywordConfig.json"
            r1.bundle = r0
            X.0q1F r0 = r2.createSyncRequest(r5, r1)
            if (r0 == 0) goto L81
            X.0q13 r1 = r0.LIZIZ()
            if (r1 == 0) goto L40
            java.lang.String r6 = r1.LIZLLL()
        L40:
            r3 = 0
            if (r6 == 0) goto L7f
            int r0 = r6.length()
            if (r0 <= 0) goto L7f
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L7f
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r6)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r0.getParent()
            if (r0 == 0) goto L5d
            r5 = r0
        L5d:
            r1.append(r5)
            java.lang.String r0 = java.io.File.separator
            r1.append(r0)
            java.lang.String r0 = "dm_streaks_fire"
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            X.0VSJ r0 = new X.0VSJ
            r0.<init>(r1)
            boolean r2 = r0.exists()
        L77:
            com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo r1 = new com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo
            java.lang.String r0 = "Default"
            r1.<init>(r0, r4, r2, r3)
            return r1
        L7f:
            r2 = 0
            goto L77
        L81:
            r1 = r6
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06K6.LIZ():com.ss.android.ugc.aweme.im.streak.api.StreakResDebugInfo");
    }

    @Override // X.C06GZ
    public final void LIZIZ() {
        C06K7 c06k7 = this.LIZ;
        if (c06k7.LJFF.compareAndSet(false, true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06KA(c06k7, null), 3);
        }
    }

    @Override // X.C06GZ
    public final void onColdStartFinish() {
        C06K7 c06k7 = this.LIZ;
        if (c06k7.LJI.compareAndSet(false, true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C06KB(c06k7, null), 3);
        }
    }

    @Override // X.C06GZ
    public final Pair<Integer, String> LIZLLL(int i, boolean z) {
        String str;
        boolean z2;
        Activity activityLIZIZ;
        C06K7 c06k7 = this.LIZ;
        c06k7.getClass();
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null && C960203pA.LIZIZ(activityLIZIZ)) {
            if (z) {
                str = c06k7.LIZJ;
            } else {
                str = c06k7.LJ;
            }
        } else if (z) {
            str = c06k7.LIZIZ;
        } else {
            str = c06k7.LIZLLL;
        }
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && str.length() > 0) {
            return new Pair<>(0, str);
        }
        return new Pair<>(1, null);
    }

    @Override // X.C06GZ
    public final Pair<Integer, Uri> LJ(int i, EnumC1578706Gb enumC1578706Gb) {
        int i2;
        int i3 = C1578906Gd.LIZ[enumC1578706Gb.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return new Pair<>(3, null);
            }
            i2 = R.drawable.c5m;
        } else {
            i2 = R.drawable.c5n;
        }
        Context contextLIZ = C20642515q3.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("android.resource://");
        sbLIZ.append(contextLIZ.getPackageName());
        sbLIZ.append("/");
        sbLIZ.append(i2);
        return new Pair<>(0, UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // X.C06GZ
    public final Object LJFF(int i, C1578806Gc c1578806Gc) {
        C23260099m c23260099m = new C23260099m(C099M.LIZLLL(c1578806Gc));
        Pair pair = new Pair(C2286608xc.LJ(0), new C1602706Ph(i, false, true, null, null, null, "dm_streaks_fire", false, 744));
        C189200o6.m2constructorimpl(pair);
        c23260099m.resumeWith(pair);
        Object objLIZ = c23260099m.LIZ();
        if (objLIZ == C099R.LJFF()) {
            C099Q.LIZJ(c1578806Gc);
        }
        return objLIZ;
    }

    @Override // X.C06GZ
    public final Pair<Integer, Drawable> LJI(int i, EnumC1578706Gb enumC1578706Gb) {
        Context contextLIZ;
        int i2;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ == null || (contextLIZ = abstractC1387200mCcLJ.LIZIZ()) == null) {
            C0I0B.LJFF.LIZJ();
            contextLIZ = C894660Z7w.LIZ();
        }
        if (enumC1578706Gb == EnumC1578706Gb.GREY) {
            i2 = R.raw.icon_color_streak_gray;
        } else {
            i2 = R.raw.icon_color_streak_light;
        }
        return new Pair<>(0, new TuxIconDrawable(contextLIZ, i2));
    }

    @Override // X.C06GZ
    public final Pair<Integer, Integer> LIZJ(int i, EnumC1578706Gb enumC1578706Gb, Context context) {
        AbstractC1387200mCc abstractC1387200mCcLJ;
        int i2 = C1578906Gd.LIZ[enumC1578706Gb.ordinal()];
        int i3 = 0;
        if (i2 != 1) {
            if (i2 == 2) {
                i3 = R.attr.a1p;
            }
        } else {
            i3 = R.attr.u5;
        }
        if (i3 <= 0) {
            return new Pair<>(3, 0);
        }
        if (context == null && ((abstractC1387200mCcLJ = C1906580ziK.LJ()) == null || (context = abstractC1387200mCcLJ.LIZIZ()) == null)) {
            C0I0B.LJFF.LIZJ();
            context = C894660Z7w.LIZ();
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i3, context);
        if (numLIZJ != null) {
            return new Pair<>(0, Integer.valueOf(numLIZJ.intValue()));
        }
        return new Pair<>(3, 0);
    }
}
