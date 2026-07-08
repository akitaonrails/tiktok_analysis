package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636710sh3 extends C1636160sgA {
    public static final ConcurrentHashMap<String, Integer> LLJJIII = new ConcurrentHashMap<>();
    public final ShortVideoContext LLJIJIL;
    public final InterfaceC1631620sYq<Effect, Integer, Integer, Unit> LLJILJIL;
    public final C01GW LLJILJILJ;
    public String LLJILLL;
    public final C1636700sh2 LLJJ;
    public final GradientDrawable LLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1636160sgA, android.view.View.OnClickListener
    public final void onClick(View view) {
        Effect effect = (Effect) this.LL;
        if (effect == null || -1 == getAdapterPosition()) {
            return;
        }
        if (!C1656550tD3.LIZ()) {
            super.onClick(view);
        } else if (!C1446840nko.LJ(effect) && !C1446840nko.LIZJ(effect)) {
            super.onClick(view);
        } else {
            onClick(view);
        }
    }

    @Override // X.C1636160sgA, X.C1636260sgK
    public final /* bridge */ /* synthetic */ void L5(int i, Object obj) {
        L5(i, (Effect) obj);
    }

    @Override // X.C1636160sgA
    /* JADX INFO: renamed from: W5 */
    public final void L5(int i, Effect effect) {
        String strOptString;
        List<String> urlList;
        String str;
        Uri uri;
        String path;
        int iLJJJJI;
        Lifecycle lifecycle;
        LifecycleCoroutineScope lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope;
        int iIntValue;
        super.L5(i, effect);
        String name = effect.getName();
        if (C339670DTh.LIZ()) {
            this.LLILZIL.setGradientBgName(name);
        } else {
            this.LLILZIL.setText(name);
        }
        if (C339670DTh.LIZ()) {
            this.LLJILLL = effect.getEffectId();
            this.LLILZIL.setGradientBgDrawable(this.LLJJI);
            ConcurrentHashMap<String, Integer> concurrentHashMap = LLJJIII;
            if (concurrentHashMap.contains(effect.getEffectId())) {
                C1662850tND c1662850tND = this.LLILZIL;
                GradientDrawable gradientDrawable = new GradientDrawable();
                int[] iArr = new int[2];
                Integer num = concurrentHashMap.get(effect.getEffectId());
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                iArr[0] = iIntValue;
                iArr[1] = 0;
                gradientDrawable.setColors(iArr);
                gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
                c1662850tND.setGradientBgDrawable(gradientDrawable);
            } else {
                LifecycleOwner lifecycleOwnerLIZIZ = C0SY5.LIZIZ(this.LLILZIL.getContext());
                if (lifecycleOwnerLIZIZ != null && (lifecycle = lifecycleOwnerLIZIZ.getLifecycle()) != null && (lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope = LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(lifecycle)) != null) {
                    C23250099c.LIZLLL(lifecycleCoroutineScopeAndroidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope, null, null, new C09JT(this, effect, null), 3);
                }
            }
        }
        C1446130njf.LIZ.getClass();
        JSONObject jSONObjectLJII = C1446130njf.LJII(effect);
        if (jSONObjectLJII == null || (strOptString = jSONObjectLJII.optString("template_rect_uri")) == null || strOptString.length() == 0 || (str = (String) C13LP.LJJJLL(effect.getIconUrl().getUrlList())) == null || (uri = UriProtector.parse(str)) == null || (path = uri.getPath()) == null || (iLJJJJI = a0.LJJJJI(path, "/", 0, 6)) < 0) {
            urlList = effect.getIconUrl().getUrlList();
        } else {
            String strSubstring = path.substring(0, iLJJJJI);
            Uri.Builder builderAuthority = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strSubstring);
            sbLIZ.append('/');
            sbLIZ.append(strOptString);
            urlList = Collections.singletonList(builderAuthority.path(C2188811AlT.LIZIZ(sbLIZ)).build().toString());
        }
        if (C2281551ESb.LIZIZ.LJJIJIIJI()) {
            if (this.LLILZLL.LJJIJIL() == -1 && this.LLILZLL.LJJJJL() == -1) {
                C1637440siE.LIZLLL(this.LLILZIL, effect, urlList, null, null);
            } else {
                C1637440siE.LIZLLL(this.LLILZIL, effect, urlList, new C1636110sg5(), new C1636090sg3(this.LLILZLL, this.LLILLL));
            }
        } else {
            String str2 = (String) C13LP.LJJJLL(urlList);
            if (str2 != null) {
                if (this.LLILZLL.LJJIJIL() == -1 && this.LLILZLL.LJJJJL() == -1) {
                    C1637440siE.LIZ(this.LLILZIL, effect, str2, null, null);
                } else {
                    C1637440siE.LIZ(this.LLILZIL, effect, str2, new C1636110sg5(), new C1636090sg3(this.LLILZLL, this.LLILLL));
                }
            }
        }
        this.itemView.setContentDescription(effect.getName());
        if (C1624570sNT.LJIILLIIL(effect)) {
            this.LLILZIL.getImageView().setPadding((int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f), (int) C11VU.LIZ(3.0f));
        } else {
            this.LLILZIL.getImageView().setPadding(0, 0, 0, 0);
        }
        C786410Ut5.T4(this.itemView, 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0sh2] */
    public C1636710sh3(View view, C1662850tND c1662850tND, final InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, InterfaceC1631540sYi<Effect> interfaceC1631540sYi, ShortVideoContext shortVideoContext, InterfaceC1631620sYq<? super Effect, ? super Integer, ? super Integer, Unit> interfaceC1631620sYq) {
        super(view, c1662850tND, interfaceC1624480sNK, interfaceC1635560sfC, interfaceC1631540sYi);
        this.LLJIJIL = shortVideoContext;
        this.LLJILJIL = interfaceC1631620sYq;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1031));
        this.LLJJ = new AbstractViewOnClickListenerC1637610siV() { // from class: X.0sh2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                if (view2 == null) {
                    return;
                }
                C1636710sh3 c1636710sh3 = this.LLILZ;
                Effect effect = (Effect) c1636710sh3.LL;
                if (effect == null) {
                    return;
                }
                C1636550sgn.LIZLLL(c1636710sh3.LLJIJIL, effect);
                C1636710sh3 c1636710sh32 = this.LLILZ;
                c1636710sh32.LLJILJIL.invoke(effect, Integer.valueOf(c1636710sh32.getAdapterPosition()), Integer.valueOf(this.LLILZ.LLILLJJLI));
                Context context = view2.getContext();
                InterfaceC1624480sNK interfaceC1624480sNK2 = interfaceC1624480sNK;
                C1636710sh3 c1636710sh33 = this.LLILZ;
                C1636550sgn.LIZ(context, interfaceC1624480sNK2, effect, c1636710sh33.LLJIJIL, (InterfaceC1625550sP3) c1636710sh33.LLJILJILJ.getValue());
            }
        };
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{0, 0});
        this.LLJJI = gradientDrawable;
    }
}
