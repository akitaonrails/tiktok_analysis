package X;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.0zkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907930zkV extends C1906860zim {
    public final NotificationDetailVM LL;
    public final View LLILLJJLI;
    public final C422820Gi0 LLILLL;
    public final TextView LLILZ;
    public final RemoteImageView LLILZIL;
    public final C197039127h LLILZLL;
    public final TuxIconView LLIZ;
    public final TextView LLIZLLLIL;
    public final ImageView LLJ;
    public AnnouncementNotice LLJI;
    public UserTextNotice LLJIJIL;
    public String LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public BaseNotice LLJJIII;
    public String LLJJIJI;

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LLJJIII;
        if (baseNotice == null) {
            return;
        }
        this.LL.UJ(baseNotice, new AwS429S0200000_28(this, baseNotice, 79));
    }

    public static final void S5(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("account_type", "tiktok_assistant");
        c2344009Gk.LJIIIIZZ("prop_id", str);
        C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
    }

    public final void N5(C2344009Gk c2344009Gk) {
        String str = this.mMTBaseNotice.photoBoostedGroupId;
        if (str != null) {
            c2344009Gk.LJFF("group_id", str);
        }
        String str2 = this.mMTBaseNotice.infoPhotoTotalVv;
        if (str2 != null) {
            c2344009Gk.LJFF("info_photo_total_vv", str2);
        }
        String str3 = this.mMTBaseNotice.infoPhotoBoostedVv;
        if (str3 != null) {
            c2344009Gk.LJFF("info_photo_boosted_vv", str3);
        }
    }

    public final void P5(BaseNotice baseNotice) {
        int i;
        boolean z;
        if (baseNotice.announcement == null && baseNotice.textNotice == null) {
            return;
        }
        this.LLJJIII = baseNotice;
        this.LLJILJIL = baseNotice.nid;
        this.LLILLL.setImageURI(C1325880kbi.LIZIZ(R.drawable.ai6));
        AnnouncementNotice announcementNotice = baseNotice.announcement;
        this.LLJI = announcementNotice;
        if (announcementNotice != null) {
            if (announcementNotice.getChallenge() != null) {
                z = true;
            } else {
                z = false;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                spannableStringBuilder.append((CharSequence) announcementNotice.getTitle());
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                spannableStringBuilder.append((CharSequence) announcementNotice.getContent());
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            if (z) {
                C1905460zgW.LIZ(this.LLILLJJLI);
                i = 8;
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(192.0f, this.mContext)), null, null);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 0);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
            } else {
                i = 8;
                if (announcementNotice.getImageUrl() != null) {
                    C1905460zgW.LIZ(this.LLILLJJLI);
                    C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(160.0f, this.mContext)), null, null);
                    C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                    C786410Ut5.l(this.LLILZIL, 0);
                    C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                    C1324840ka2.LJFF(this.LLILZIL, announcementNotice.getImageUrl());
                } else {
                    String schemaUrl = announcementNotice.getSchemaUrl();
                    if (schemaUrl != null && schemaUrl.length() != 0) {
                        C1905460zgW.LIZ(this.LLILLJJLI);
                        C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                        C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                        C786410Ut5.l(this.LLILZIL, 8);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                    } else {
                        this.LLILLJJLI.setOnTouchListener(null);
                        this.LLILLJJLI.setForeground(null);
                        addCreateTimeSpan(spannableStringBuilder, baseNotice);
                        this.LLILZ.setText(spannableStringBuilder);
                        C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                        C786410Ut5.l(this.LLILZIL, 8);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                    }
                }
            }
            String schemaUrl2 = announcementNotice.getSchemaUrl();
            String str = "";
            if (schemaUrl2 == null) {
                schemaUrl2 = "";
            }
            String strLIZIZ = C1907940zkW.LIZIZ(UriProtector.parse(schemaUrl2), "event_keyword");
            if (strLIZIZ != null) {
                str = strLIZIZ;
            }
            this.LLJJIJI = str;
        } else {
            i = 8;
        }
        UserTextNotice userTextNotice = baseNotice.textNotice;
        this.LLJIJIL = userTextNotice;
        if (userTextNotice != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(userTextNotice.getTitle())) {
                spannableStringBuilder2.append((CharSequence) userTextNotice.getTitle());
                if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                    spannableStringBuilder2.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder2, new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
            }
            if (!TextUtils.isEmpty(userTextNotice.getContent())) {
                spannableStringBuilder2.append((CharSequence) userTextNotice.getContent());
            }
            String schemaUrl3 = userTextNotice.getSchemaUrl();
            if (schemaUrl3 != null && schemaUrl3.length() != 0) {
                try {
                    Uri uri = UriProtector.parse(userTextNotice.getSchemaUrl());
                    this.LLJILJILJ = C1907940zkW.LIZ(uri, "effects");
                    this.LLJILLL = C1907940zkW.LIZ(uri, "blur");
                    this.LLJJ = C1907940zkW.LIZ(uri, "duet");
                    String strLIZIZ2 = C1907940zkW.LIZIZ(uri, "aweme_id");
                    this.LLJJI = strLIZIZ2;
                    if (this.LLJJ && !TextUtils.isEmpty(strLIZIZ2)) {
                        C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder2, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(192.0f, this.mContext)), null, null);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, i);
                        C786410Ut5.l(this.LLILZIL, 0);
                        C786410Ut5.LLIL(this.LLIZLLLIL, 0);
                        C786410Ut5.LJZI(0, this.LLJ);
                        C786410Ut5.LLLLLLJ(this.LLILZLL, i);
                        C1324840ka2.LJFF(this.LLILZIL, userTextNotice.getImageUrl());
                        return;
                    }
                    C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder2, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                    C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                    C786410Ut5.l(this.LLILZIL, i);
                    C786410Ut5.LLIL(this.LLIZLLLIL, i);
                    C786410Ut5.LJZI(i, this.LLJ);
                    C786410Ut5.LLLLLLJ(this.LLILZLL, i);
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            addCreateTimeSpan(spannableStringBuilder2, baseNotice);
            this.LLILZ.setText(spannableStringBuilder2);
            C786410Ut5.LLLLLLZZ(this.LLIZ, i);
            C786410Ut5.l(this.LLILZIL, i);
            C786410Ut5.LLIL(this.LLIZLLLIL, i);
            C786410Ut5.LJZI(i, this.LLJ);
            C786410Ut5.LLLLLLJ(this.LLILZLL, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r26) {
        /*
            Method dump skipped, instruction units count: 1054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907930zkV.onClick(android.view.View):void");
    }

    public C1907930zkV(View view, NotificationDetailVM notificationDetailVM) {
        super(view);
        this.LL = notificationDetailVM;
        View viewFindViewById = view.findViewById(R.id.pf1);
        this.LLILLJJLI = viewFindViewById;
        C422820Gi0 c422820Gi0 = (C422820Gi0) view.findViewById(R.id.pe1);
        this.LLILLL = c422820Gi0;
        this.LLILZ = (TextView) view.findViewById(R.id.pdu);
        this.LLILZIL = (RemoteImageView) view.findViewById(R.id.pdw);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.pds);
        this.LLILZLL = c197039127h;
        this.LLIZ = (TuxIconView) view.findViewById(R.id.pdk);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.vyh);
        this.LLJ = (ImageView) view.findViewById(R.id.vyg);
        c197039127h.getLayoutParams().width = C1905460zgW.LIZIZ(this.mContext);
        C10VP.LIZIZ(c422820Gi0);
        C10VP.LIZIZ(c197039127h);
        C786410Ut5.U8(c197039127h, this);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.B9(c422820Gi0, this);
        this.mIsRTL = C444960Hcc.LIZJ(this.mContext);
    }

    public final void R5(String str, String str2) {
        String templateId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("account_type", "tiktok_assistant");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("process_id", str2);
        BaseNotice baseNotice = this.LLJJIII;
        if (baseNotice != null) {
            templateId = baseNotice.getTemplateId();
        } else {
            templateId = null;
        }
        c2344009Gk.LJIIIIZZ("template_id", templateId);
        C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
    }
}
