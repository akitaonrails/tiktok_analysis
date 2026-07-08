package X;

import android.graphics.Rect;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: renamed from: X.15cA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556415cA extends AbstractC692920RFy {
    public static final /* synthetic */ int LJIJ = 0;
    public List<C20556515cB> LJIIIIZZ;
    public boolean LJIIJJI;
    public double LJIIL;
    public double LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public int LJ = -1;
    public int LJFF = -1;
    public int LJI = -1;
    public int LJII = -1;
    public List<Rect> LJIIIZ = C1697810uHb.LJIIJJI(new Rect(), new Rect(), new Rect(), new Rect());
    public String LJIIJ = "";

    public final double LJ() {
        return (((double) 1) - LIZLLL()) / ((double) 2);
    }

    public final void LJI() {
        this.LJIILJJIL = false;
        this.LJIILL = false;
        this.LJIILLIIL = false;
        this.LJIIZILJ = false;
        List<C20556515cB> list = this.LJIIIIZZ;
        if (list != null) {
            for (C20556515cB c20556515cB : list) {
                if (c20556515cB.LJI()) {
                    this.LJIILJJIL = true;
                }
                if (c20556515cB.LJFF()) {
                    this.LJIILL = true;
                }
                if (c20556515cB.LJ()) {
                    this.LJIILLIIL = true;
                }
                if (c20556515cB.LJIIIIZZ() || c20556515cB.LJII()) {
                    this.LJIIZILJ = true;
                }
            }
        }
    }

    public final double LIZLLL() {
        return this.LJIIL * ((((double) this.LJI) / ((double) this.LJII)) / (((double) this.LJ) / ((double) this.LJFF)));
    }

    public final boolean LJFF() {
        return (((Rect) ListProtector.get(this.LJIIIZ, 0)).width() == 0 || ((Rect) ListProtector.get(this.LJIIIZ, 0)).height() == 0 || ((Rect) ListProtector.get(this.LJIIIZ, 1)).width() == 0 || ((Rect) ListProtector.get(this.LJIIIZ, 1)).height() == 0 || ((Rect) ListProtector.get(this.LJIIIZ, 3)).width() == 0 || ((Rect) ListProtector.get(this.LJIIIZ, 3)).height() == 0) ? false : true;
    }

    public final boolean LIZIZ(Aweme aweme) {
        if (aweme.getAid() == null) {
            return false;
        }
        if (!TextUtils.equals(aweme.getAid(), this.LJIIJ)) {
            this.LJIIJJI = false;
            this.LJIIIIZZ = null;
            this.LJIIIZ = C1697810uHb.LJIIJJI(new Rect(), new Rect(), new Rect(), new Rect());
            this.LJIIJ = aweme.getAid();
        }
        int awemeType = aweme.getAwemeType();
        C01GW c01gw = C20556615cC.LIZ;
        if (!C20556615cC.LIZIZ || C0SXF.LJJ(aweme) || aweme.getIsTikTokStory() || awemeType == 40 || awemeType == 2 || awemeType == 101 || aweme.isAd()) {
            return false;
        }
        return true;
    }

    public final void LIZJ(Aweme aweme, boolean z) {
        List<C20556515cB> list;
        String str;
        String str2;
        String str3;
        LJI();
        if (z) {
            this.LIZJ = Integer.valueOf((int) (((double) this.LJFF) * 0.0d));
            this.LIZLLL = Integer.valueOf((int) (this.LJIILIIL * ((double) this.LJ)));
            this.LIZIZ = Integer.valueOf((int) (this.LJIIL * ((double) this.LJFF)));
            this.LIZ = Integer.valueOf((int) (LIZLLL() * ((double) this.LJ)));
        }
        if (aweme != null && (list = this.LJIIIIZZ) != null && !list.isEmpty()) {
            String str4 = "1";
            if (this.LJIILL) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            AwemeBizExtKt.setIntextOccludeTab(aweme, str);
            if (this.LJIILLIIL) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            AwemeBizExtKt.setIntextOccludeInteraction(aweme, str2);
            if (this.LJIILJJIL) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            AwemeBizExtKt.setIntextOut(aweme, str3);
            if (!this.LJIIZILJ) {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            AwemeBizExtKt.setIntextOccludeDesc(aweme, str4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02d1  */
    @Override // X.AbstractC692920RFy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.Integer r25, java.lang.Integer r26, int r27, int r28, int r29, int r30, com.ss.android.ugc.aweme.feed.model.Aweme r31) {
        /*
            Method dump skipped, instruction units count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20556415cA.LIZ(java.lang.Integer, java.lang.Integer, int, int, int, int, com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }
}
