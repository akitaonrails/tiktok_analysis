package X;

import Y.ACListenerS159S0100000_25;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.EffectTemplateCategoryFragment;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.guidesubmit.b;
import java.util.List;
import kotlin.jvm.internal.AwS147S0201000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import lnn.q;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sfW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1635760sfW implements InterfaceC1635690sfP<C1642680sqg, Fragment> {
    public static final /* synthetic */ int LJ = 0;
    public final C1DRG LIZ;
    public String LIZIZ;
    public final l0 LIZJ;
    public final b LIZLLL;

    @Override // X.InterfaceC1635690sfP
    public final List<Integer> LIZ() {
        return C1641140soC.LIZLLL();
    }

    public C1635760sfW(C1DRG c1drg) {
        this.LIZ = c1drg;
        this.LIZJ = (l0) c1drg.LJIIL(null, l0.class);
        this.LIZLLL = (b) c1drg.LJIIL(null, b.class);
    }

    @Override // X.InterfaceC1635690sfP
    public final InterfaceC1631590sYn<Fragment> LIZJ(int i, C1630880sXe c1630880sXe, C1631250sYF c1631250sYF, RecyclerView.RecycledViewPool recycledViewPool) {
        ShortVideoContext shortVideoContext = (ShortVideoContext) this.LIZ.LJII(ShortVideoContext.class, null);
        InterfaceC1623190sLF interfaceC1623190sLFU = ((q) this.LIZ.LJII(q.class, null)).U();
        InterfaceC1635780sfY interfaceC1635780sfY = new InterfaceC1635780sfY() { // from class: X.0sYm
            @Override // X.InterfaceC1635780sfY
            public final boolean LIZ() {
                boolean z = false;
                boolean z2 = Keva.getRepo("is_onboarding_video_shown_repo").getBoolean("is_onboarding_video_shown", false);
                if (C1656550tD3.LIZ() && C0C64.LJIILLIIL().LJIIIZ(31744, "show_create_tab_onboarding_video", true, false) && Intrinsics.LJFF(this.LIZ.LIZIZ, C1630860sXc.LIZIZ()) && !z2) {
                    z = true;
                    l0 l0Var = this.LIZ.LIZJ;
                    if (l0Var != null) {
                        l0Var.Ld();
                    }
                    Keva.getRepo("is_onboarding_video_shown_repo").storeBoolean("is_onboarding_video_shown", true);
                    ShortVideoContext shortVideoContext2 = (ShortVideoContext) this.LIZ.LIZ.LJII(ShortVideoContext.class, null);
                    String str = shortVideoContext2.enterFrom;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = shortVideoContext2.shootWay;
                    String str3 = str2 != null ? str2 : "";
                    C0LAB c0lab = new C0LAB();
                    c0lab.LJ("creation_id", shortVideoContext2.getCreationId());
                    c0lab.LJ("enter_from", str);
                    c0lab.LJ("shoot_way", str3);
                    c0lab.LJ("is_photo_mode", shortVideoContext2.LJJIJIL());
                    C20684815ws.LJIILLIIL("show_mec_onboarding_popup", c0lab.LIZ);
                }
                return z;
            }
        };
        b bVar = this.LIZLLL;
        C1DRG c1drg = this.LIZ;
        EffectTemplateCategoryFragment effectTemplateCategoryFragment = new EffectTemplateCategoryFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "short_video_context", shortVideoContext);
        effectTemplateCategoryFragment.setArguments(bundle);
        effectTemplateCategoryFragment.nS(i, c1630880sXe, c1631250sYF, null);
        effectTemplateCategoryFragment.LLILZ = interfaceC1623190sLFU;
        effectTemplateCategoryFragment.LLILZIL = interfaceC1635780sfY;
        effectTemplateCategoryFragment.LLILZLL = bVar;
        effectTemplateCategoryFragment.LLIZ = c1drg;
        return effectTemplateCategoryFragment;
    }

    @Override // X.InterfaceC1635690sfP
    public final C1642680sqg LIZIZ(C19EG c19eg, EffectCategoryModel effectCategoryModel, C19YA c19ya, C1630880sXe c1630880sXe, AwS147S0201000_25 awS147S0201000_25) {
        boolean zOptBoolean;
        List<String> urlList;
        C1642680sqg c1642680sqgLIZJ = C1641140soC.LIZJ(c19eg, c1630880sXe.LIZ.LJJLIIIJJIZ().LJIILJJIL);
        String extra = effectCategoryModel.getExtra();
        if (extra != null && !a0.LJJJIL(extra)) {
            zOptBoolean = new JSONObject(extra).optBoolean("is_show_icon_only");
        } else {
            zOptBoolean = false;
        }
        UrlModel icon_selected = effectCategoryModel.getIcon_selected();
        if (icon_selected != null) {
            urlList = icon_selected.getUrlList();
        } else {
            urlList = null;
        }
        if (!C2401009ay.LIZ(urlList)) {
            com.ss.android.ugc.aweme.base.model.UrlModel urlModel = new com.ss.android.ugc.aweme.base.model.UrlModel();
            urlModel.setUrlList(urlList);
            c1642680sqgLIZJ.setImage(urlModel);
        } else {
            c1642680sqgLIZJ.setImageVisibility(false);
        }
        if (zOptBoolean) {
            c1642680sqgLIZJ.setTextVisibility(false);
        } else {
            c1642680sqgLIZJ.setText(effectCategoryModel.getName());
        }
        if (Intrinsics.LJFF(effectCategoryModel.getKey(), C1630860sXc.LIZIZ())) {
            this.LIZIZ = effectCategoryModel.getKey();
        }
        C786410Ut5.ab(c1642680sqgLIZJ, new ACListenerS159S0100000_25(awS147S0201000_25, 77));
        return c1642680sqgLIZJ;
    }
}
