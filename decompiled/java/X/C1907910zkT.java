package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.TcmNotice;
import com.ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.ss.android.ugc.aweme.notification.vm.NotificationDetailVM;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.services.external.ui.ReshootConfig;
import com.ss.android.ugc.aweme.utils.NotificationClickHelperImpl;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0zkT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907910zkT extends C1906860zim {
    public final NotificationDetailVM LL;
    public final View LLILLJJLI;
    public final C422820Gi0 LLILLL;
    public final TextView LLILZ;
    public final RemoteImageView LLILZIL;
    public final C197039127h LLILZLL;
    public final TuxIconView LLIZ;
    public final TextView LLIZLLLIL;
    public final ImageView LLJ;
    public final TextView LLJI;
    public TcmNotice LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public Long LLJJIII;
    public BaseNotice LLJJIJI;

    @Override // X.AbstractC1906850zil, X.ViewOnClickListenerC1906680ziU
    public final void onAttached() {
        super.onAttached();
        BaseNotice baseNotice = this.LLJJIJI;
        if (baseNotice == null) {
            return;
        }
        this.LL.UJ(baseNotice, new AwS429S0200000_28(this, baseNotice, 82));
    }

    public final void N5(BaseNotice baseNotice) {
        if (baseNotice.tcmNotice == null) {
            return;
        }
        this.LLJJIJI = baseNotice;
        this.LLJJI = baseNotice.nid;
        this.LLILLL.setImageURI(C1325880kbi.LIZIZ(R.drawable.ai1));
        this.LLJIJIL = baseNotice.tcmNotice;
        this.LLJJIII = Long.valueOf(baseNotice.createTime);
        TcmNotice tcmNotice = this.LLJIJIL;
        if (tcmNotice != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8296);
            }
            if (!TextUtils.isEmpty(tcmNotice.title)) {
                spannableStringBuilder.append((CharSequence) tcmNotice.title);
                if (!TextUtils.isEmpty(tcmNotice.content)) {
                    spannableStringBuilder.append(": ");
                }
                C786410Ut5.q2(spannableStringBuilder, new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            if (!TextUtils.isEmpty(tcmNotice.content)) {
                spannableStringBuilder.append((CharSequence) tcmNotice.content);
            }
            if (this.mIsRTL) {
                spannableStringBuilder.append((char) 8297);
            }
            String str = tcmNotice.sourceName;
            boolean z = true;
            if (str != null && str.length() != 0) {
                this.LLJI.setText(this.mContext.getString(2131837461, tcmNotice.sourceName));
                C786410Ut5.LLIL(this.LLJI, 0);
            }
            UrlModel urlModel = tcmNotice.sourceIcon;
            if (urlModel != null) {
                C1324840ka2.LJFF(this.LLILLL, urlModel);
            }
            if (tcmNotice.schemaUrl.length() != 0) {
                z = false;
            }
            if (z) {
                addCreateTimeSpan(spannableStringBuilder, baseNotice);
                this.LLILZ.setText(spannableStringBuilder);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                C786410Ut5.LJZI(8, this.LLJ);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                return;
            }
            try {
                Uri uri = UriProtector.parse(tcmNotice.schemaUrl);
                this.LLJILJIL = C1907940zkW.LIZ(uri, "effects");
                this.LLJILJILJ = C1907940zkW.LIZ(uri, "blur");
                this.LLJILLL = C1907940zkW.LIZ(uri, "duet");
                String strLIZIZ = C1907940zkW.LIZIZ(uri, "aweme_id");
                this.LLJJ = strLIZIZ;
                if (this.LLJILLL && !TextUtils.isEmpty(strLIZIZ)) {
                    C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(192.0f, this.mContext)), null, null);
                    C786410Ut5.LLLLLLZZ(this.LLIZ, 8);
                    C786410Ut5.l(this.LLILZIL, 0);
                    C786410Ut5.LLIL(this.LLIZLLLIL, 0);
                    C786410Ut5.LJZI(0, this.LLJ);
                    C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
                    return;
                }
                C1907170zjH.LIZ(this.LLILZ, spannableStringBuilder, baseNotice, 10, C12ES.LJIIJ(this.mContext) - ((int) C12ES.LIZJ(132.0f, this.mContext)), null, null);
                C786410Ut5.LLLLLLZZ(this.LLIZ, 0);
                C786410Ut5.l(this.LLILZIL, 8);
                C786410Ut5.LLIL(this.LLIZLLLIL, 8);
                C786410Ut5.LJZI(8, this.LLJ);
                C786410Ut5.LLLLLLJ(this.LLILZLL, 8);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.ViewOnClickListenerC1906680ziU, android.view.View.OnClickListener
    public final void onClick(View view) {
        TcmNotice tcmNotice;
        Context context;
        Integer numValueOf;
        String accountType;
        BaseNotice baseNotice;
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        int i = 0;
        try {
            if (C036E.LIZ.LIZIZ()) {
                if (!C0OBG.LIZIZ(view) && (tcmNotice = this.LLJIJIL) != null) {
                    String templateId = null;
                    if (view != null) {
                        Context context2 = view.getContext();
                        if (context2 == null || (context = C1388190mED.LIZ(context2)) == null) {
                            context = view.getContext();
                        }
                        numValueOf = Integer.valueOf(view.getId());
                    } else {
                        context = null;
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        if (numValueOf.intValue() != R.id.pf1 && numValueOf.intValue() != R.id.pe1) {
                            if ((numValueOf.intValue() == R.id.vyh || numValueOf.intValue() == R.id.vyg) && (context instanceof Activity)) {
                                NotificationClickHelperImpl.LIZIZ().LIZ((Activity) context, this.LLJILJILJ, this.LLJILJIL, this.LLJILLL, this.LLJJ);
                            }
                        } else if (!(context instanceof Activity) || !NotificationClickHelperImpl.LIZIZ().LIZ((Activity) context, this.LLJILJILJ, this.LLJILJIL, this.LLJILLL, this.LLJJ)) {
                            String str = tcmNotice.schemaUrl;
                            UriProtector.parse(str);
                            if (context != null) {
                                if (C2697012p.LIZ(str)) {
                                    ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).P3().LJFF();
                                    boolean zIsRecording = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().shortVideoConfig().isRecording();
                                    RecordConfig.Builder builder = new RecordConfig.Builder();
                                    builder.shootWay("direct_shoot");
                                    builder.reshootConfig(new ReshootConfig(true, Boolean.valueOf(zIsRecording), true));
                                    builder.defaultTab(2);
                                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("TcmNotification", new C12YU(context, builder.build(), 5));
                                } else if (!TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "aweme://stickers/detail/", false)) {
                                    SchemaPageHelperImpl.LJ().LIZJ(context, u.LJJIFFI(str, "aweme://stickers/detail/", "sslocal://stickers/detail/", false));
                                } else if (!TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "aweme://music/detail/", false)) {
                                    C19724912Fj.LIZLLL().LJII(str);
                                } else if (!TextUtils.isEmpty(str) && u.LJJIIJZLJL(str, "aweme://video_gift_opt_in", false)) {
                                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://video_gift_opt_in");
                                    smartRouteBuildRoute.withParam("bundle_video_gift_enter_from_notification", true);
                                    smartRouteBuildRoute.open();
                                } else if (TextUtils.isEmpty(str) || !u.LJJIIJZLJL(str, "aweme://friend/find", false)) {
                                    C686150Qvl c686150Qvl = new C686150Qvl(str);
                                    c686150Qvl.LIZIZ("refer", "message");
                                    C19724912Fj.LIZLLL().LJII(c686150Qvl.LIZJ());
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                    HashMap map = new HashMap();
                    try {
                        map = (HashMap) new Gson().LJII(tcmNotice.logExtra, new HashMap().getClass());
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    BaseNotice baseNotice2 = this.LLJJIJI;
                    if (baseNotice2 != null) {
                        accountType = baseNotice2.getAccountType();
                    } else {
                        accountType = null;
                    }
                    c2344009Gk.LJIIIIZZ("account_type", accountType);
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    c2344009Gk.LJ(this.LLJJIII, "message_time");
                    if (!C1902710zc5.LIZJ() && (baseNotice = this.LLJJIJI) != null && baseNotice.hasRead) {
                        i = 1;
                    }
                    c2344009Gk.LIZJ(i, "is_read");
                    c2344009Gk.LIZJ(getLayoutPosition(), "client_order");
                    BaseNotice baseNotice3 = this.LLJJIJI;
                    if (baseNotice3 != null) {
                        templateId = baseNotice3.getTemplateId();
                    }
                    c2344009Gk.LJIIIIZZ("template_id", templateId);
                    c2344009Gk.LJIIIIZZ("content_id", this.LLJJI);
                    c2344009Gk.LJI(map);
                    c2344009Gk.LJIIIIZZ("position", C1900870zZ7.LIZ);
                    c2344009Gk.LJIIIIZZ("enter_from", "notification_page");
                    C20684815ws.LJIILLIIL("official_message_inner_message", c2344009Gk.LIZ);
                    return;
                }
                return;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
        c1389890mGx.LJIIIZ(2131837962);
        c1389890mGx.LJIIJJI();
    }

    public C1907910zkT(View view, NotificationDetailVM notificationDetailVM) {
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
        this.LLJI = (TextView) view.findViewById(R.id.pfb);
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
        this.mIsRTL = C444960Hcc.LIZJ(this.mContext);
    }
}
