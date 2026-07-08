package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.PauseInteractionsPage;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.unifiedauth.push.tracking.PushOptInPopupEventManager;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.10kV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class C19334110kV implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
        }
    }

    public static final void run$0(C19334110kV c19334110kV) {
        C197039127h c197039127h = ((PauseInteractionsPage) c19334110kV.l0).LLILZLL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        C197039127h c197039127h2 = ((PauseInteractionsPage) c19334110kV.l0).LLILZLL;
        if (c197039127h2 != null) {
            c197039127h2.setClickable(true);
        }
    }

    public static final void run$1(C19334110kV c19334110kV) {
        C1389890mGx c1389890mGx = new C1389890mGx((C1907570zjv) c19334110kV.l0);
        c1389890mGx.LJIIIZ(2131836489);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039b A[PHI: r7
      0x039b: PHI (r7v1 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) = 
      (r7v0 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v10 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v10 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v10 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v10 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
     binds: [B:188:0x0397, B:53:0x0140, B:55:0x0144, B:57:0x014c, B:59:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a0 A[PHI: r7 r8
      0x03a0: PHI (r7v2 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) = 
      (r7v1 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v9 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v9 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v9 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r7v9 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
     binds: [B:191:0x039c, B:62:0x015c, B:64:0x0160, B:66:0x0168, B:68:0x016c] A[DONT_GENERATE, DONT_INLINE]
      0x03a0: PHI (r8v1 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice) = 
      (r8v0 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r8v3 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r8v3 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r8v3 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
      (r8v3 com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice)
     binds: [B:191:0x039c, B:62:0x015c, B:64:0x0160, B:66:0x0168, B:68:0x016c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void run$2(X.C19334110kV r36) {
        /*
            Method dump skipped, instruction units count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19334110kV.run$2(X.10kV):void");
    }

    public static final void run$3(C19334110kV c19334110kV) {
        ((RelationLabelTextView) c19334110kV.l0).LJJJLIIL();
    }

    public static final void run$4(C19334110kV c19334110kV) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("push_guide_intelligent_data_report_open", false)) {
            C211000rc.LIZ("[Push]");
            ((Keva) C19217510Gf.LIZ.getValue()).storeLong("last_reported_ts", System.currentTimeMillis());
        }
        ((PushOptInPopupEventManager) c19334110kV.l0).LIZ().LIZLLL(((Number) C2255281DPa.LIZLLL.getValue()).intValue());
        C211000rc.LIZ("[Push]");
        C19216610Fw.LIZIZ(((PushOptInPopupEventManager) c19334110kV.l0).LIZ().LIZ());
    }

    public static final void run$5(C19334110kV c19334110kV) {
        ((DialogC19307610gE) c19334110kV.l0).LJJLJ(Boolean.FALSE, "next_time");
        DialogC19307610gE dialogC19307610gE = (DialogC19307610gE) c19334110kV.l0;
        dialogC19307610gE.dismiss();
        C785410UrT.LIZ(dialogC19307610gE);
    }

    public static final void run$6(C19334110kV c19334110kV) {
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("push_guide_intelligent_data_report_open", false)) {
            ((Keva) C19217510Gf.LIZ.getValue()).storeLong("last_reported_ts", System.currentTimeMillis());
        }
        ((PushOptInPopupEventManager) c19334110kV.l0).LIZ().LIZLLL(((Number) C2255281DPa.LIZLLL.getValue()).intValue());
        C211000rc.LIZ("[Push]");
        C19216610Fw.LIZIZ(((PushOptInPopupEventManager) c19334110kV.l0).LIZ().LIZ());
    }

    public static final void run$7(C19334110kV c19334110kV) {
        ((C09AJ) c19334110kV.l0).onComplete();
    }

    public static final void run$8(C19334110kV c19334110kV) {
        ((C10KK) c19334110kV.l0).LJIILLIIL = System.nanoTime();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("build_result", ((C10KK) c19334110kV.l0).LJIILIIL);
        C10KK c10kk = (C10KK) c19334110kV.l0;
        c2344009Gk.LIZLLL(c10kk.LJIILL - c10kk.LJIILJJIL, "text_build_time");
        C10KK c10kk2 = (C10KK) c19334110kV.l0;
        c2344009Gk.LIZLLL(c10kk2.LJIILLIIL - c10kk2.LJIILJJIL, "total_build_time");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LJIIZILJ), "has_tail_image");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LJIJ), "tail_image_has_cache");
        c2344009Gk.LIZJ(((C10KK) c19334110kV.l0).LIZIZ.LIZ.ordinal(), "config_ext_style");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LIZIZ.LIZIZ), "config_tail_avatar");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LIZIZ.LIZJ), "config_avatar_next_line");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LIZIZ.LIZLLL), "config_name_bold");
        c2344009Gk.LJ(Boolean.valueOf(((C10KK) c19334110kV.l0).LIZIZ.LJ), "config_name_clickable");
        c2344009Gk.LJ(((C10KK) c19334110kV.l0).LIZIZ.LJFF, "config_ellipsis_strategy");
        C20684815ws.LJIILLIIL("relation_text_build", c2344009Gk.LIZ);
    }

    public static final void run$9(C19334110kV c19334110kV) {
        ((C770770ULj) c19334110kV.l0).LIZ(false);
    }

    public C19334110kV(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
