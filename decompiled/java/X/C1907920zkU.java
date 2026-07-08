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
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.UserTextNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907920zkU extends C1906860zim {
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
    public BaseNotice LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public boolean LLJJIJI;

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LLJILJIL;
        if (baseNotice == null) {
            return;
        }
        this.LL.UJ(baseNotice, new AwS429S0200000_28(this, baseNotice, 81));
    }

    public static final void R5(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("account_type", "official_info");
        c2344009Gk.LJIIIIZZ("prop_id", str);
        C20684815ws.LJIILLIIL("enter_prop_detail", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v38, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    public final void N5(BaseNotice baseNotice) {
        boolean z;
        ?? r0;
        boolean z2;
        ?? r02;
        String strLIZIZ;
        String strLIZIZ2;
        UserTextNotice userTextNotice;
        String schemaUrl;
        if (baseNotice.announcement == null && baseNotice.textNotice == null) {
            return;
        }
        this.LLJILJIL = baseNotice;
        this.LLJJIII = baseNotice.nid;
        if (baseNotice.type == 2 && (userTextNotice = baseNotice.textNotice) != null && (schemaUrl = userTextNotice.getSchemaUrl()) != null && a0.LJJIIZI(schemaUrl, "contract_invitation=1", false)) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJI = z;
        this.LLILLL.setImageURI(C1325880kbi.LIZIZ(R.drawable.ai0));
        UserTextNotice userTextNotice2 = baseNotice.textNotice;
        this.LLJIJIL = userTextNotice2;
        float f = 192.0f;
        if (userTextNotice2 != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(userTextNotice2.getTitle())) {
                spannableStringBuilder.append((CharSequence) userTextNotice2.getTitle());
                if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                    spannableStringBuilder.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(userTextNotice2.getContent())) {
                spannableStringBuilder.append((CharSequence) a0.LJLIIIL(userTextNotice2.getContent()).toString());
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            String schemaUrl2 = userTextNotice2.getSchemaUrl();
            if (schemaUrl2 != null && schemaUrl2.length() != 0) {
                try {
                    Uri uri = UriProtector.parse(userTextNotice2.getSchemaUrl());
                    this.LLJILJILJ = C1907940zkW.LIZ(uri, "effects");
                    this.LLJILLL = C1907940zkW.LIZ(uri, "blur");
                    this.LLJJ = C1907940zkW.LIZ(uri, "duet");
                    this.LLJJI = C1907940zkW.LIZIZ(uri, "aweme_id");
                    strLIZIZ = C1907940zkW.LIZIZ(uri, "show_image");
                    strLIZIZ2 = C1907940zkW.LIZIZ(uri, "channel");
                    r02 = this.LLJJ;
                } catch (Exception e) {
                    e = e;
                    r02 = 8;
                    f = 160.0f;
                }
                try {
                    if (r02 != 0 && !TextUtils.isEmpty(this.LLJJI)) {
                        f = 160.0f;
                        r0 = 8;
                        C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(192.0f, this.mContext)), null, null);
                        C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                        C786410Ut5.l(this.LLILZIL, 0);
                        C786410Ut5.LLIL(this.LLIZLLLIL, 0);
                        C786410Ut5.LJZI(0, this.LLJ);
                        C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                        C1324840ka2.LJFF(this.LLILZIL, userTextNotice2.getImageUrl());
                    } else {
                        r0 = 8;
                        r0 = 8;
                        r0 = 8;
                        f = 160.0f;
                        if (TextUtils.equals(strLIZIZ, "1")) {
                            if (!TextUtils.isEmpty(strLIZIZ2)) {
                                List listSingletonList = Collections.singletonList(strLIZIZ2);
                                IAdLandPagePreloadService iAdLandPagePreloadService = (IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class);
                                if (iAdLandPagePreloadService != null && iAdLandPagePreloadService.G0() != null) {
                                    C1024380clQ.LJIILJJIL(null, C1687430u0r.LIZ(listSingletonList));
                                }
                                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(160.0f, this.mContext)), null, null);
                                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                                C786410Ut5.l(this.LLILZIL, 0);
                                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                                C786410Ut5.LJZI(8, this.LLJ);
                                C1324840ka2.LJFF(this.LLILZIL, userTextNotice2.getImageUrl());
                            }
                        } else {
                            C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                            C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                            C786410Ut5.l(this.LLILZIL, 8);
                            C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                            C786410Ut5.LJZI(8, this.LLJ);
                            C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                    r0 = r02;
                }
            } else {
                addCreateTimeSpan(spannableStringBuilder, baseNotice);
                this.LLILZ.setText(spannableStringBuilder);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                C786410Ut5.LJZI(8, this.LLJ);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                r0 = 8;
                f = 160.0f;
            }
        } else {
            r0 = 8;
            f = 160.0f;
        }
        AnnouncementNotice announcementNotice = baseNotice.announcement;
        this.LLJI = announcementNotice;
        if (announcementNotice != null) {
            if (announcementNotice.getChallenge() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (!TextUtils.isEmpty(announcementNotice.getTitle())) {
                spannableStringBuilder2.append((CharSequence) announcementNotice.getTitle());
                if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                    spannableStringBuilder2.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder2, new NotificationBoldSpan(), 0, spannableStringBuilder2.length(), 33);
            }
            if (!TextUtils.isEmpty(announcementNotice.getContent())) {
                spannableStringBuilder2.append((CharSequence) announcementNotice.getContent());
            }
            if (z2) {
                C1905460zgW.LIZ(this.LLILLJJLI);
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder2, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(192.0f, this.mContext)), null, null);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 0);
                C786410Ut5.l(this.LLILZIL, r0);
                C786410Ut5.LLLLLLZZ(this.LLIZ, r0);
                return;
            }
            if (announcementNotice.getImageUrl() != null) {
                C1905460zgW.LIZ(this.LLILLJJLI);
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder2, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(f, this.mContext)), null, null);
                C786410Ut5.LLLLLLJ(this.LLILZLL, r0);
                C786410Ut5.l(this.LLILZIL, 0);
                C786410Ut5.LLLLLLZZ(this.LLIZ, r0);
                C1324840ka2.LJFF(this.LLILZIL, announcementNotice.getImageUrl());
                return;
            }
            String schemaUrl3 = announcementNotice.getSchemaUrl();
            if (schemaUrl3 != null && schemaUrl3.length() != 0) {
                C1905460zgW.LIZ(this.LLILLJJLI);
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder2, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                C786410Ut5.LLLLLLJ(this.LLILZLL, r0);
                C786410Ut5.l(this.LLILZIL, r0);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                return;
            }
            this.LLILLJJLI.setOnTouchListener(null);
            this.LLILLJJLI.setForeground(null);
            addCreateTimeSpan(spannableStringBuilder2, baseNotice);
            this.LLILZ.setText(spannableStringBuilder2);
            C786410Ut5.LLLLLLJ(this.LLILZLL, r0);
            C786410Ut5.l(this.LLILZIL, r0);
            C786410Ut5.LLLLLLZZ(this.LLIZ, r0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 933
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907920zkU.onClick(android.view.View):void");
    }

    public C1907920zkU(View view, NotificationDetailVM notificationDetailVM) {
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
        TextView textView = (TextView) view.findViewById(R.id.vyh);
        this.LLIZLLLIL = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.vyg);
        this.LLJ = imageView;
        C1905460zgW.LIZ(viewFindViewById);
        C1905460zgW.LIZ(textView);
        C1905460zgW.LIZ(imageView);
        C10VP.LIZIZ(c422820Gi0);
        c197039127h.getLayoutParams().width = C1905460zgW.LIZIZ(this.mContext);
        C786410Ut5.U8(c197039127h, this);
        C786410Ut5.Q7(imageView, this);
        C786410Ut5.T7(textView, this);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.B9(c422820Gi0, this);
        c422820Gi0.getHierarchy().LJIJ(C1308910kAL.LJ(R.attr.bv, this.mContext), 1);
        this.mIsRTL = C444960Hcc.LIZJ(this.mContext);
    }

    public static final void P5(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
        c2344009Gk.LJIIIIZZ("account_type", "official_info");
        c2344009Gk.LJIIIIZZ("music_id", str);
        c2344009Gk.LJIIIIZZ("process_id", str2);
        C20684815ws.LJIILLIIL("enter_music_detail", c2344009Gk.LIZ);
    }
}
