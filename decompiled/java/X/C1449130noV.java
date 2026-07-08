package X;

import Y.ACListenerS87S0300000_22;
import Y.ARunnableS119S0100000_19;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS639S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: renamed from: X.0noV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449130noV extends AbstractC2172971A2l<Effect, C1449120noU> {
    public final q LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final InterfaceC1449160noY LLILZIL;
    public final CreativeModel LLILZLL;
    public final Function2<Effect, Bundle, Unit> LLIZ;
    public final C054G LLIZLLLIL;
    public String LLJ;
    public boolean LLJI;

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C1449120noU c1449120noU = (C1449120noU) viewHolder;
        super.onViewAttachedToWindow(c1449120noU);
        HandlerHook.viewPost(c1449120noU.itemView, new ARunnableS119S0100000_19(c1449120noU, 88));
    }

    public static final C0LAB LLLIIIIL(C0LAB c0lab, Effect effect) {
        String str;
        List<String> music = effect.getMusic();
        if (music == null || (str = (String) C13LP.LJJJLL(music)) == null || TextUtils.isEmpty(str)) {
            return c0lab;
        }
        if (C1624200sMs.LJIILL(effect)) {
            c0lab.LJ("music_selected_from", "prop_music_bind");
            return c0lab;
        }
        c0lab.LJ("music_selected_from", "prop_music_soft_bind");
        return c0lab;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C1449120noU c1449120noU = (C1449120noU) viewHolder;
        Effect effectLLLFZ = LLLFZ(i);
        c1449120noU.LL = effectLLLFZ;
        TuxTextView tuxTextView = c1449120noU.LLILLJJLI;
        C1360520lVa c1360520lVa = new C1360520lVa();
        c1360520lVa.LIZ.append((CharSequence) effectLLLFZ.getName());
        tuxTextView.setText(c1360520lVa.LIZ);
        if (effectLLLFZ.getUse_number() > 0) {
            String strLIZIZ = C1843500y4a.LIZIZ(effectLLLFZ.getUse_number());
            C786410Ut5.LLLLZLL(c1449120noU.LLILLL, 0);
            TuxTextView tuxTextView2 = c1449120noU.LLILLL;
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZ(c1449120noU.itemView.getContext().getResources(), 2131837792, strLIZIZ);
            tuxTextView2.setText(c1360520lVa2.LIZ);
        } else {
            C786410Ut5.LLLLZLL(c1449120noU.LLILLL, 8);
        }
        String str = (String) C13LP.LJJJLL(effectLLLFZ.getIconUrl().getUrlList());
        if (str != null) {
            C1324750kZt.LJIIIZ(c1449120noU.LLILZ, str, -1, -1);
        }
        C786410Ut5.I7(new ACListenerS87S0300000_22(c1449120noU.LLILZIL, effectLLLFZ, c1449120noU, 0), c1449120noU.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1449120noU c1449120noU = new C1449120noU(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.c3a, viewGroup, false));
        try {
            View view = c1449120noU.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1449120noU.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1449120noU.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C1449120noU.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1449120noU.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1449120noU.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C1449120noU.class.getName();
        return c1449120noU;
    }

    public C1449130noV(q qVar, String str, String str2, InterfaceC1449160noY interfaceC1449160noY, CreativeModel creativeModel, AwS639S0100000_25 awS639S0100000_25) {
        super(new AbstractC339510DSr<Effect>() { // from class: X.0noX
            @Override // X.AbstractC339510DSr
            public final boolean LIZ(Effect effect, Effect effect2) {
                return Intrinsics.LJFF(effect.getEffectId(), effect2.getEffectId());
            }

            @Override // X.AbstractC339510DSr
            public final boolean LIZIZ(Effect effect, Effect effect2) {
                return Intrinsics.LJFF(effect.getEffectId(), effect2.getEffectId());
            }
        });
        this.LLILLJJLI = qVar;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = interfaceC1449160noY;
        this.LLILZLL = creativeModel;
        this.LLIZ = awS639S0100000_25;
        this.LLIZLLLIL = C2296808zG.LIZ(C0PEM.LIZ);
        this.LLJ = "";
    }
}
