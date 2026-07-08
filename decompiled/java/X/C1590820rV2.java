package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0rV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590820rV2 extends AbstractC1386130mAt {
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public int LJJI;
    public int LJJIFFI;
    public String LJJII;
    public boolean LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public String LJJIIZ;
    public String LJJIIZI;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.AbstractC1386130mAt
    public final void LJIIIIZZ() {
        String str = this.LJIILLIIL;
        C1210890hcF c1210890hcF = InterfaceC1210900hcG.LIZIZ;
        LJFF("group_id", str, c1210890hcF);
        LJFF("author_id", this.LJIIZILJ, c1210890hcF);
        if (this.LIZ == "enter_homepage_follow") {
            LJ("is_casting", Boolean.toString(this.LJJIII));
            LJ("casting_session_id", this.LJJIIJ);
        }
        if ((((Boolean) C304490Bwd.LIZIZ.getValue()).booleanValue() && System.currentTimeMillis() - C486540J6e.LIZ <= 3000) || (!((Boolean) C0C1S.LIZIZ.getValue()).booleanValue() && ((!((Boolean) C0C1S.LIZJ.getValue()).booleanValue() || !C1150504el.LIZ().LJII) && (!((Boolean) C0C1S.LIZLLL.getValue()).booleanValue() || C1150504el.LIZ().LJII)))) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (contextLIZ != null) {
                this.LJIL = String.valueOf(C0WYJ.LJIJJ(contextLIZ) / 1024);
            }
        }
        LJ("memory_usage", this.LJIL);
        LJ("local_time_ms", String.valueOf(System.currentTimeMillis()));
        if (!TextUtils.isEmpty(this.LJIJ)) {
            LJFF("enter_method", this.LJIJ, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LJIJI)) {
            LJFF("previous_page", this.LJIJI, InterfaceC1210900hcG.LIZ);
        }
        if (!TextUtils.isEmpty(this.LIZLLL)) {
            String str2 = this.LIZLLL;
            str2.getClass();
            switch (str2.hashCode()) {
                case -1382453013:
                    if (str2.equals("NOTIFICATION")) {
                        this.LIZLLL = "notice";
                    }
                    break;
                case 2614219:
                    if (str2.equals("USER")) {
                        this.LIZLLL = "profile";
                    }
                    break;
                case 482617583:
                    if (str2.equals("PUBLISH")) {
                        this.LIZLLL = "shoot";
                    }
                    break;
                case 877821105:
                    if (str2.equals("SERIES_DISCOVER")) {
                        this.LIZLLL = "series_discover";
                    }
                    break;
                case 1055811561:
                    if (str2.equals("DISCOVER")) {
                        this.LIZLLL = "discover";
                    }
                    break;
            }
            LJ("enter_from", this.LIZLLL);
        }
        if (!TextUtils.isEmpty(this.LJIJJ)) {
            LJ("music_id", this.LJIJJ);
        }
        if (!TextUtils.isEmpty(this.LJJIIZI)) {
            LJ("follow_status", this.LJJIIZI);
        }
        String str3 = this.LJIJJLI;
        if (str3 != null) {
            LJ("notice_type", str3);
        }
        if (!TextUtils.isEmpty(this.LJJII)) {
            LJ("topic_tab_name", this.LJJII);
        }
        if ("enter_homepage_nearby".equals(this.LIZ)) {
            C1606660rua.LIZIZ.LJIIJ("enter_homepage_nearby", this.LIZIZ);
            C1200530hLX.LIZ(null, this, this.LIZ);
            if (!this.LJJIIZ.isEmpty()) {
                LJ("enter_nearby_tab_enter_method", this.LJJIIJZLJL);
            }
            if (!this.LJJIIZ.isEmpty()) {
                LJ("enter_nearby_tab_enter_from", this.LJJIIZ);
            }
        }
        if ("enter_homepage_explore".equals(this.LIZ)) {
            C15WT.LIZIZ.LJIIIZ(this.LIZLLL, this.LJIJ, this.LIZIZ);
        }
        LJ("from_inbox_page", this.LJJ);
        int i = this.LJJI;
        if (i == 1) {
            LIZLLL(i, "live_notice_type");
        }
        int i2 = this.LJJI;
        if (i2 == 2) {
            LIZLLL(i2, "live_notice_type");
            LIZLLL(this.LJJIFFI, "anchor_bubble_num");
        }
    }

    public C1590820rV2(String str) {
        super(str);
        this.LJIL = "";
        this.LJJ = "";
        this.LJJI = -1;
        this.LJJII = "";
        this.LJJIIJ = "";
        this.LJJIIJZLJL = "";
        this.LJJIIZ = "";
        this.LJI = true;
    }

    public final void LJIILLIIL(Aweme aweme) {
        if (aweme != null) {
            this.LJIILLIIL = aweme.getAid();
            this.LJIIZILJ = AwemeExtKt.getAuthorUid(aweme);
            this.LJJIIZI = C735370Ssx.LJIIJ(aweme);
        }
    }
}
