package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorAnimateStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0drz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1066890drz extends AbstractC1066910ds1 implements IStandardModelProvider {
    public AnchorCommonStruct LLIZ;
    public final C01GW<C1400390mXt> LLIZLLLIL = C452501pT.LIZIZ(new C1066930ds3(this));

    @Override // X.InterfaceC1393560mMs
    public void It(View view, Aweme aweme, boolean z) {
    }

    @Override // X.InterfaceC712540RxE
    public final void LIZJ(AnchorEventCenter anchorEventCenter) {
    }

    public String LJIIJ() {
        return "webview";
    }

    @Override // X.InterfaceC1393690mN5
    public void LJIIJJI(C2344009Gk c2344009Gk) {
    }

    public C1400390mXt LJIILL() {
        return null;
    }

    public boolean LJIL() {
        return this instanceof C19580511j9;
    }

    public void LJJI(boolean z) {
    }

    public void LJJIFFI(AnchorCommonStruct anchorCommonStruct) {
    }

    @Override // X.InterfaceC1393560mMs
    public CharSequence LJJIZ() {
        return null;
    }

    @Override // X.InterfaceC1393560mMs
    public void LLLIZZ(Aweme aweme) {
    }

    @Override // X.InterfaceC1393560mMs
    public String LIZLLL() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) ? "" : keyword;
    }

    public final Activity LJIILJJIL() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LIZIZ();
    }

    public final Aweme LJIIZILJ() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LJJLIIIJJIZ();
    }

    public boolean LJIJI() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return C1052180dUG.LIZIZ(anchorCommonStruct != null ? anchorCommonStruct.getSchema() : null);
    }

    public final String LJIJJ() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LLIIJI();
    }

    public final String LJIJJLI() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.Cf();
    }

    public final C2344009Gk LJJ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        String authorUid = AwemeExtKt.getAuthorUid(LJIIZILJ());
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String aid = LJIIZILJ().getAid();
        c2344009Gk.LJIIIIZZ("group_id", aid != null ? aid : "");
        c2344009Gk.LJIIIIZZ("enter_from", LJIJJLI());
        c2344009Gk.LJIIIIZZ("anchor_type", LJJJJJL().LJ());
        c2344009Gk.LJIIIIZZ("anchor_name", LJJJJJL().LIZIZ());
        c2344009Gk.LJIIIIZZ("anchor_id", LJJJJJL().LIZ());
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(LJIIZILJ()));
        return c2344009Gk;
    }

    @Override // X.InterfaceC1393560mMs
    public final long LJJJJI() {
        AnchorAnimateStruct animateInfo;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct == null || (animateInfo = anchorCommonStruct.getAnimateInfo()) == null) {
            return -1L;
        }
        return animateInfo.getRecord();
    }

    @Override // X.InterfaceC1393560mMs
    public final String LJJJJJ() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            return anchorCommonStruct.getCaption();
        }
        return null;
    }

    @Override // X.InterfaceC1393560mMs
    public final boolean LJJJJLI() {
        AnchorAnimateStruct animateInfo;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return (anchorCommonStruct == null || (animateInfo = anchorCommonStruct.getAnimateInfo()) == null || animateInfo.getAnimateType() != AnchorAnimateStruct.AnchorAnimateType.ANIMATE_TYPE_GENERAL.getType()) ? false : true;
    }

    @Override // X.InterfaceC1392510mLB
    public final C1400390mXt getAnchorMobConfiguration() {
        return this.LLIZLLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider
    public final Object provideItemPayload() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider
    public final Aweme providerAweme() {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        return interfaceC1392640mLO.LJJLIIIJJIZ();
    }

    @Override // com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider
    public final InterfaceC497601wk providerCoroutineScope() {
        C19FO c19fo;
        Lifecycle lifecycle;
        LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        Activity activityLIZIZ = interfaceC1392640mLO.LIZIZ();
        if ((activityLIZIZ instanceof C19EG) && (c19fo = (C19FO) activityLIZIZ) != null && (lifecycle = c19fo.getLifecycle()) != null && (lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) != null) {
            return lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        return C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.feed.model.banner.IStandardModelProvider
    public final AnchorCommonStruct providerDisplayAnchor() {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        return anchorCommonStruct == null ? new AnchorCommonStruct() : anchorCommonStruct;
    }

    @Override // X.InterfaceC1393560mMs
    public int type() {
        return EnumC1430380nKG.NO_TYPE.getTYPE();
    }

    @Override // X.InterfaceC1393560mMs
    public final AnchorCommonStruct data() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1393560mMs
    public void LJFF(C2344009Gk c2344009Gk) {
        LJJIIJ(c2344009Gk);
    }

    @InterfaceC1294060jmO
    public final Map<String, String> LJIJ(C2344009Gk c2344009Gk) {
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_from", strCf);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
        return c2344009Gk.LIZ;
    }

    @InterfaceC1294060jmO
    public void LJJIIJ(C2344009Gk c2344009Gk) {
        Aweme awemeLJIIZILJ = LJIIZILJ();
        String strLJIJJLI = LJIJJLI();
        if (!C04UD.LIZ()) {
            Map<String, String> mapLJIJ = LJIJ(c2344009Gk);
            C698670Rar.LIZ.getClass();
            C698670Rar.LIZIZ(awemeLJIIZILJ, mapLJIJ);
            C20684815ws.LJIILLIIL("multi_anchor_entrance_click", mapLJIJ);
        }
        if (LJIL()) {
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LJIIIIZZ("enter_method", LJIJJ());
            c2344009GkLJJ.LJIIIIZZ("enter_from", strLJIJJLI);
            String authorUid = AwemeExtKt.getAuthorUid(awemeLJIIZILJ);
            String str = "";
            if (authorUid == null) {
                authorUid = "";
            }
            c2344009GkLJJ.LJIIIIZZ("author_id", authorUid);
            String aid = awemeLJIIZILJ.getAid();
            if (aid != null) {
                str = aid;
            }
            c2344009GkLJJ.LJIIIIZZ("group_id", str);
            c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJIIZILJ));
            C20684815ws.LJIILLIIL("anchor_entrance_click", c2344009GkLJJ.LIZ);
        }
    }

    @InterfaceC1294060jmO
    public void LJJIIJZLJL(C2344009Gk c2344009Gk) {
        if (C04UD.LIZ()) {
            return;
        }
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        InterfaceC1392640mLO interfaceC1392640mLO2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
        if (interfaceC1392640mLO3 != null) {
            interfaceC1392640mLO2 = interfaceC1392640mLO3;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        C698670Rar.LIZ.getClass();
        C698670Rar.LIZ(c2344009Gk, awemeLJJLIIIJJIZ, strCf, true);
        String strLJIJJ = LJIJJ();
        c2344009Gk.getClass();
        c2344009Gk.LJIIIIZZ("enter_method", strLJIJJ);
        c2344009Gk.LJIIIIZZ("enter_from", strCf);
        String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
        String str = "";
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
        String aid = awemeLJJLIIIJJIZ.getAid();
        if (aid != null) {
            str = aid;
        }
        c2344009Gk.LJIIIIZZ("group_id", str);
        C20684815ws.LJIILLIIL("multi_anchor_entrance_show", c2344009Gk.LIZ);
    }

    public void LJJIIZ(C1394720mOk c1394720mOk) {
        LJJIJ(new AwS595S0100000_16(c1394720mOk, 228));
    }

    public final void LJJIJ(Function1<? super AnchorCommonStruct, Unit> function1) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            function1.invoke(anchorCommonStruct);
        }
    }

    @Override // X.InterfaceC1393560mMs
    public void LJJJI(SmartImageView smartImageView) {
        LJJIIZI(smartImageView, new C1066940ds4(this, smartImageView));
    }

    @Override // X.InterfaceC1393560mMs
    public EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        ArrayList arrayList = new ArrayList();
        for (AnchorCommonStruct anchorCommonStruct : list) {
            if (anchorCommonStruct.getType() == type()) {
                arrayList.add(anchorCommonStruct);
            }
        }
        if (arrayList.size() == 0) {
            return EnumC1050190dR3.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) ListProtector.get(arrayList, 0);
        list.remove(anchorCommonStruct2);
        LJJIFFI(anchorCommonStruct2);
        LJIILIIL(anchorCommonStruct2);
        this.LLIZ = anchorCommonStruct2;
        if (arrayList.size() == 1) {
            return EnumC1050190dR3.DONE;
        }
        return EnumC1050190dR3.PROCEED;
    }

    @Override // X.InterfaceC1393560mMs
    public void p1(C2344009Gk c2344009Gk) {
        LJJIIJZLJL(c2344009Gk);
        if (LJIL()) {
            InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
            InterfaceC1392640mLO interfaceC1392640mLO2 = null;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            String strCf = interfaceC1392640mLO.Cf();
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 != null) {
                interfaceC1392640mLO2 = interfaceC1392640mLO3;
            }
            Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LJIIIIZZ("enter_from", strCf);
            String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
            String str = "";
            if (authorUid == null) {
                authorUid = "";
            }
            c2344009GkLJJ.LJIIIIZZ("author_id", authorUid);
            c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
            String aid = awemeLJJLIIIJJIZ.getAid();
            if (aid != null) {
                str = aid;
            }
            c2344009GkLJJ.LJIIIIZZ("group_id", str);
            C20684815ws.LJIILLIIL("anchor_entrance_show", c2344009GkLJJ.LIZ);
        }
    }

    public static final void LJIILLIIL(C2344009Gk c2344009Gk, JSONObject jSONObject) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next, "");
            if (C703302op.LIZ(strOptString)) {
                c2344009Gk.LJFF(next, strOptString);
            }
        }
    }

    public final void LJJIIZI(SmartImageView smartImageView, Function0<Unit> function0) {
        UrlModel newStyleBubbleIcon;
        UrlModel storyImmersiveFeedIcon;
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null && (storyImmersiveFeedIcon = anchorCommonStruct.getStoryImmersiveFeedIcon()) != null && this.LLILZIL) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(storyImmersiveFeedIcon));
            c1331670kl3LJIIIIZZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            return;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
        if (anchorCommonStruct2 != null && (newStyleBubbleIcon = anchorCommonStruct2.getNewStyleBubbleIcon()) != null && this.LLILZ) {
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(newStyleBubbleIcon));
            c1331670kl3LJIIIIZZ2.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            return;
        }
        function0.invoke();
    }

    @InterfaceC1294060jmO
    public void LJJII(C2344009Gk c2344009Gk, boolean z, boolean z2) {
        String keyword;
        InterfaceC1392640mLO interfaceC1392640mLO = this.LL;
        String keyword2 = null;
        if (interfaceC1392640mLO == null) {
            interfaceC1392640mLO = null;
        }
        String strCf = interfaceC1392640mLO.Cf();
        InterfaceC1392640mLO interfaceC1392640mLO2 = this.LL;
        if (interfaceC1392640mLO2 == null) {
            interfaceC1392640mLO2 = null;
        }
        Aweme awemeLJJLIIIJJIZ = interfaceC1392640mLO2.LJJLIIIJJIZ();
        String str = "";
        if (z && !C04UD.LIZ()) {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            C1E95 c1e95 = C1E95.LIZIZ;
            if (c1e95.LJIILL()) {
                c2344009Gk2.LIZJ(c1e95.LJJIFFI(C735370Ssx.LIZJ(awemeLJJLIIIJJIZ)), "spammy_tag_cnt");
            }
            c2344009Gk2.LJIIIIZZ("enter_method", LJIJJ());
            c2344009Gk2.LJI(new HashMap(c2344009Gk.LIZ));
            c2344009Gk2.LJIIIIZZ("enter_from", strCf);
            AnchorCommonStruct anchorCommonStruct = this.LLIZ;
            if (anchorCommonStruct != null) {
                keyword = anchorCommonStruct.getKeyword();
            } else {
                keyword = null;
            }
            c2344009Gk2.LJIIIIZZ("anchor_entry", keyword);
            String authorUid = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ);
            if (authorUid == null) {
                authorUid = "";
            }
            c2344009Gk2.LJIIIIZZ("author_id", authorUid);
            String aid = awemeLJJLIIIJJIZ.getAid();
            if (aid == null) {
                aid = "";
            }
            c2344009Gk2.LJIIIIZZ("group_id", aid);
            c2344009Gk2.LJIIIIZZ("click_type", LJIIJ());
            c2344009Gk2.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ));
            C20684815ws.LJIILLIIL("enter_multi_anchor_detail", c2344009Gk2.LIZ);
        }
        if (LJIL() && z && z2) {
            InterfaceC1392640mLO interfaceC1392640mLO3 = this.LL;
            if (interfaceC1392640mLO3 == null) {
                interfaceC1392640mLO3 = null;
            }
            String strCf2 = interfaceC1392640mLO3.Cf();
            InterfaceC1392640mLO interfaceC1392640mLO4 = this.LL;
            if (interfaceC1392640mLO4 == null) {
                interfaceC1392640mLO4 = null;
            }
            Aweme awemeLJJLIIIJJIZ2 = interfaceC1392640mLO4.LJJLIIIJJIZ();
            C2344009Gk c2344009GkLJJ = LJJ();
            c2344009GkLJJ.LJIIIIZZ("enter_from", strCf2);
            AnchorCommonStruct anchorCommonStruct2 = this.LLIZ;
            if (anchorCommonStruct2 != null) {
                keyword2 = anchorCommonStruct2.getKeyword();
            }
            c2344009GkLJJ.LJIIIIZZ("anchor_entry", keyword2);
            String authorUid2 = AwemeExtKt.getAuthorUid(awemeLJJLIIIJJIZ2);
            if (authorUid2 == null) {
                authorUid2 = "";
            }
            c2344009GkLJJ.LJIIIIZZ("author_id", authorUid2);
            String aid2 = awemeLJJLIIIJJIZ2.getAid();
            if (aid2 != null) {
                str = aid2;
            }
            c2344009GkLJJ.LJIIIIZZ("group_id", str);
            c2344009GkLJJ.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(awemeLJJLIIIJJIZ2));
            C20684815ws.LJIILLIIL("enter_anchor_detail", c2344009GkLJJ.LIZ);
        }
    }

    @Override // X.InterfaceC1393690mN5
    public View LJI(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        return LJJJJIZL(viewGroup, dialog, c2344009Gk, i);
    }

    @Override // X.InterfaceC1393560mMs
    public View LJJJJIZL(ViewGroup viewGroup, Dialog dialog, C2344009Gk c2344009Gk, int i) {
        AnchorCommonStruct anchorCommonStruct = this.LLIZ;
        if (anchorCommonStruct != null) {
            C1394720mOk c1394720mOkLIZ = C1066920ds2.LIZ(viewGroup.getContext());
            UrlModel thumbnail = anchorCommonStruct.getThumbnail();
            if (thumbnail != null) {
                c1394720mOkLIZ.setIcon(thumbnail);
            }
            LJJIIZ(c1394720mOkLIZ);
            c1394720mOkLIZ.setSubTitle(anchorCommonStruct.getDescription());
            C786410Ut5.I7(new C1077230e8f(this, c2344009Gk, dialog, 1), c1394720mOkLIZ);
            viewGroup.addView(c1394720mOkLIZ);
            return c1394720mOkLIZ;
        }
        return null;
    }
}
