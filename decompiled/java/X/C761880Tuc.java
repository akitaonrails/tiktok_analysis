package X;

import Y.ACListenerS44S0201000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0Tuc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761880Tuc extends AbstractC761920Tug<C761890Tud, LiveEffect> {
    public final Context LLILLJJLI;
    public final ComposerFilterViewModel LLILLL;
    public final InterfaceC761900Tue LLILZ;
    public int LLILZIL;

    public static void LLLLLLIL(C761890Tud c761890Tud) {
        if (LiveAIBeautySetting.INSTANCE.enableDialogUpdate()) {
            c761890Tud.LLILLJJLI.setBackgroundResource(R.drawable.dm3);
        } else {
            c761890Tud.LLILLJJLI.setBackgroundResource(R.drawable.dm2);
            c761890Tud.LLILZ.setTextColor(C20736316Cj.LIZIZ(R.attr.eya, c761890Tud.itemView.getContext()));
        }
        c761890Tud.LLILZ.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        c761890Tud.LLILZ.setSelected(true);
    }

    public static void LLLLLLL(C761890Tud c761890Tud) {
        c761890Tud.LLILLJJLI.setBackgroundResource(R.drawable.dm4);
        c761890Tud.LLILZ.setEllipsize(null);
        c761890Tud.LLILZ.setSelected(false);
        c761890Tud.LLILZ.setTextColor(C497740JfY.LJFF(R.color.a5m));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C761890Tud c761890Tud = new C761890Tud(C786410Ut5.Td(C786410Ut5.ne(this.LLILLJJLI), R.layout.ger, viewGroup, false));
        try {
            View view = c761890Tud.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c761890Tud.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c761890Tud.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C761890Tud.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c761890Tud.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c761890Tud.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C761890Tud.class.getName();
        return c761890Tud;
    }

    public C761880Tuc(Context context, ComposerFilterViewModel composerFilterViewModel, C761620TuC c761620TuC) {
        this.LLILLJJLI = context;
        this.LLILLL = composerFilterViewModel;
        this.LLILZ = c761620TuC;
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLIL((C761890Tud) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLL((C761890Tud) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        List<String> urlList;
        AbstractC766100U3k<T> abstractC766100U3k;
        UrlModel iconUrl;
        C761890Tud c761890Tud = (C761890Tud) viewHolder;
        LiveEffect liveEffect = (LiveEffect) obj;
        if (!((ArrayList) this.LL).isEmpty() && i <= ((ArrayList) this.LL).size()) {
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            Effect effect = liveEffect.LIZJ;
            String name = null;
            if (effect != null && (iconUrl = effect.getIconUrl()) != null) {
                urlList = iconUrl.getUrlList();
            } else {
                urlList = null;
            }
            c0jbnLIZ.LIZJ(urlList).LJJI(c761890Tud.LLILLL);
            TextView textView = c761890Tud.LLILZ;
            Effect effect2 = liveEffect.LIZJ;
            if (effect2 != null) {
                name = effect2.getName();
            }
            textView.setText(name);
            C786410Ut5.LJZI(4, c761890Tud.LLILZIL);
            if (i == this.LLILZIL) {
                LLLLLLIL(c761890Tud);
            } else {
                LLLLLLL(c761890Tud);
            }
            if (!this.LLILLL.yQ2(liveEffect) && !liveEffect.LJJIJIIJI()) {
                ImageView imageView = (ImageView) c761890Tud.itemView.findViewById(R.id.lno);
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
                BaseEffectViewModel.vQ2(this.LLILLL, liveEffect, new AwS378S0200000_12(this, liveEffect, 69), 28);
            } else {
                C786410Ut5.LJLLLLLL(8, c761890Tud.LL);
            }
            C786410Ut5.I7(new ACListenerS44S0201000_12(this, liveEffect, i, c761890Tud, 3), c761890Tud.itemView);
            if (liveEffect.LIZJ != null && (abstractC766100U3k = this.LLILLL.LL) != 0 && abstractC766100U3k.LIZ.contains(liveEffect)) {
                C786410Ut5.LJLLLLLL(0, c761890Tud.LL);
                return;
            }
            C786410Ut5.LJLLLLLL(8, c761890Tud.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(liveEffect.getName());
            sbLIZ.append(" effect is null");
            C20441214yg.LJ("LiveComposerFilterAdapter_onBindViewHolder", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("filterEffects[position]=");
        sbLIZ2.append(this.LL);
        sbLIZ2.append("[position]");
        C20441214yg.LJ("LiveComposerFilterAdapter_onBindViewHolder", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
