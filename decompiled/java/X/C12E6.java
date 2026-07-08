package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.ur.creative.CardActionReportData;
import com.zhiliaoapp.musically.R;
import irm.AkS66S0200000_29;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.12E6, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12E6 extends RecyclerView.ViewHolder implements InterfaceC1259240isE, InterfaceC1259660isu {
    public final LinearLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public final C197039127h LLILZIL;
    public final C1749280vcc LLILZLL;
    public final Context LLIZ;
    public String LLIZLLLIL;

    @Override // X.InterfaceC1259240isE
    public final void U4(User user) {
    }

    @Override // X.InterfaceC1259660isu
    public final void Y1(boolean z) {
    }

    public final GradientDrawable L5() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setColor(numLIZJ.intValue());
        }
        return gradientDrawable;
    }

    public final void I5(C12E8 c12e8) {
        if (c12e8 == null) {
            return;
        }
        int iIntValue = 0;
        if (c12e8.LIZ) {
            C786410Ut5.LLLZLZ(this.LLILZLL, 0);
            this.LLILZLL.LJ();
            C786410Ut5.LJZL(8, this.LL);
        } else {
            this.LLILZLL.setStatus(new C1722300uv6());
            C786410Ut5.LLLZLZ(this.LLILZLL, 8);
            C786410Ut5.LJZL(0, this.LL);
        }
        View view = this.itemView;
        if (view.isAttachedToWindow()) {
            if (!c12e8.LIZ && this.LL.getVisibility() == 0 && !this.LLIZLLLIL.equals(c12e8.LIZJ)) {
                C12E7 c12e7 = C12E7.LIZ;
                C12EA c12ea = C12EA.SHOW;
                c12e7.getClass();
                C12E7.LIZLLL(c12e8, c12ea);
                C12E7.LIZ(null, EnumC2193121AsQ.SHOW, new CardActionReportData(c12e8.LJI, c12e8.LJIIJJI, c12e8.LJIILIIL, c12e8.LJIILJJIL));
            }
            String str = c12e8.LIZJ;
            if (str == null) {
                str = "";
            }
            this.LLIZLLLIL = str;
        } else {
            view.addOnAttachStateChangeListener(new C12YI(view, c12e8, this, 2));
        }
        TuxTextView tuxTextView = this.LLILLL;
        String str2 = c12e8.LJIIIIZZ;
        if (str2 == null) {
            str2 = "Create your first post with effects";
        }
        tuxTextView.setText(str2);
        TuxTextView tuxTextView2 = this.LLILZ;
        String string = c12e8.LJIIIZ;
        if (string == null) {
            string = this.LLIZ.getString(2131821006);
        }
        tuxTextView2.setText(string);
        C197039127h c197039127h = this.LLILZIL;
        String str3 = c12e8.LJIIJ;
        if (str3 == null) {
            str3 = "Try now";
        }
        c197039127h.setText(str3);
        String str4 = c12e8.LJIILL;
        if (str4 != null) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZJ(str4));
            c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
            c1331670kl3LJIIIIZZ.LJJIIZI(L5());
            c1331670kl3LJIIIIZZ.LJIL(L5());
            C1331750klB c1331750klB = new C1331750klB();
            c1331750klB.LJ = C418440Gaw.LIZIZ(Float.valueOf(20.0f));
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            float fLIZIZ = C418440Gaw.LIZIZ(Float.valueOf(1.0f));
            c1331750klB.LIZJ = iIntValue;
            c1331750klB.LIZIZ = fLIZIZ;
            c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
            c1331670kl3LJIIIIZZ.LJJJIL = new InterfaceC658750Psf() { // from class: X.12EB
                @Override // X.InterfaceC658750Psf
                public final void Ck(JSONObject jSONObject) {
                    C0W8I.LIZ.getClass();
                    if (!C0W8I.LIZJ()) {
                        C365090ETb.LIZIZ();
                    } else {
                        jSONObject.optBoolean("isSuccess");
                    }
                }

                @Override // X.InterfaceC658750Psf
                public final void onImageLoaded(boolean z, String str5, JSONObject jSONObject) {
                    C0W8I.LIZ.getClass();
                    if (!C0W8I.LIZJ()) {
                        C365090ETb.LIZIZ();
                    }
                }
            };
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        C786410Ut5.I7(new AkS66S0200000_29(this, c12e8, 9), this.LLILZIL);
        C786410Ut5.I7(new AkS66S0200000_29(this, c12e8, 10), this.LLILLJJLI);
    }

    public final void N5(C12E8 c12e8) {
        boolean zDownloadEffectOrMusicAfterEnterCamera;
        String string;
        IConfigService iConfigServiceConfigService;
        IAVSettingsService iAVSettingsServiceAvsettingsConfig;
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null && (iConfigServiceConfigService = iExternalService.configService()) != null && (iAVSettingsServiceAvsettingsConfig = iConfigServiceConfigService.avsettingsConfig()) != null) {
            zDownloadEffectOrMusicAfterEnterCamera = iAVSettingsServiceAvsettingsConfig.downloadEffectOrMusicAfterEnterCamera();
        } else {
            zDownloadEffectOrMusicAfterEnterCamera = true;
        }
        String str = c12e8.LIZJ;
        if (str == null) {
            return;
        }
        IPropReuseService iPropReuseService = (IPropReuseService) PluggableExtentionKt.pluggableSpi$default(IPropReuseService.class, false, false, false, 14, null);
        if (iPropReuseService != null) {
            Context context = this.LLIZ;
            List<String> listSingletonList = Collections.singletonList(str);
            C12E7.LIZ.getClass();
            String string2 = UUID.randomUUID().toString();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("creation_id", string2);
            c2344009Gk.LJFF("enter_from", "personal_homepage");
            c2344009Gk.LJFF("enter_method", "click_no_draft_try_now");
            c2344009Gk.LJIIIIZZ("topic_id", "");
            c2344009Gk.LJIIIIZZ("user_id", ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            c2344009Gk.LJIIIIZZ("session_id", c12e8.LJII);
            c2344009Gk.LJIIIIZZ("debuginfo", c12e8.LJIJ);
            c2344009Gk.LJIIIIZZ("search_topic_id", c12e8.LJI);
            c2344009Gk.LJIIIIZZ("inspiration_result_id", c12e8.LJI);
            c2344009Gk.LJIIIIZZ("inspiration_keyword", c12e8.LJIIIIZZ);
            c2344009Gk.LJIIIIZZ("inspiration_reco_id", c12e8.LJII);
            Integer num = c12e8.LJIILIIL;
            if (num != null) {
                string = num.toString();
            } else {
                string = null;
            }
            c2344009Gk.LJIIIIZZ("topic_type", string);
            c2344009Gk.LJIIIIZZ("post_chain", "");
            c2344009Gk.LJIIIIZZ("activity_name", c12e8.LJIILJJIL);
            c2344009Gk.LJIIIIZZ("primary_scene", c12e8.LJIIJJI);
            c2344009Gk.LJFF("search_extra", c12e8.LJIIZILJ);
            c2344009Gk.LJFF("shoot_way", "homepage_prop_anchor");
            c2344009Gk.LJII(C12E7.LIZIZ(c12e8));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("shoot", c2344009Gk.LIZ);
            iPropReuseService.LJFF(context, listSingletonList, new C116L(null, "homepage_prop_anchor", null, false, null, "personal_homepage", "click_no_draft_try_now", null, "homepage_prop_anchor", null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, linkedHashMap, null, null, null, null, 16252927, null), 0, -1073742531), zDownloadEffectOrMusicAfterEnterCamera);
        }
        C12E7 c12e7 = C12E7.LIZ;
        C12EA c12ea = C12EA.CLICK;
        c12e7.getClass();
        C12E7.LIZLLL(c12e8, c12ea);
        C12E7.LIZ(null, EnumC2193121AsQ.CLICK, new CardActionReportData(c12e8.LJI, c12e8.LJIIJJI, c12e8.LJIILIIL, c12e8.LJIILJJIL));
    }

    public C12E6(View view, C19EG c19eg, InterfaceC1259540isi interfaceC1259540isi, C1259360isQ c1259360isQ) {
        LinearLayout.LayoutParams layoutParams;
        super(view);
        this.LL = (LinearLayout) view.findViewById(R.id.eux);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.lfl);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        this.LLILLL = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.tv_post_count);
        this.LLILZ = tuxTextView2;
        this.LLILZIL = (C197039127h) view.findViewById(R.id.cwa);
        this.LLILZLL = (C1749280vcc) view.findViewById(R.id.nne);
        this.LLIZ = c19eg;
        this.LLIZLLLIL = "";
        C1252550ihR.LIZ.getClass();
        C1252550ihR.LJ = true;
        interfaceC1259540isi.Zx(this);
        ((HashSet) c1259360isQ.LLLLILI).add(this);
        tuxTextView.setMaxWidth((int) (c19eg.getResources().getDisplayMetrics().widthPixels * 0.8f));
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if ((layoutParams2 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams2) != null) {
            layoutParams.width = -2;
            C786410Ut5.R6(this.LLILLL, layoutParams);
        }
        tuxTextView.setSingleLine(false);
        C786410Ut5.LLLLZLL(tuxTextView2, 0);
    }
}
