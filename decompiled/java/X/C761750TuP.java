package X;

import Y.ATListenerS339S0200000_12;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import com.bytedance.android.livesdk.model.VoiceEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761750TuP extends AbstractC21673619ry<C761770TuR> {
    public final DataChannel LL;
    public final VoiceEffectViewModel LLILLJJLI;
    public final List<LiveEffect> LLILLL;
    public final Map<Long, Integer> LLILZ;
    public LiveEffect LLILZIL;
    public LiveEffect LLILZLL;
    public boolean LLIZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLL.size();
    }

    public C761750TuP(DataChannel dataChannel, VoiceEffectViewModel voiceEffectViewModel) {
        this.LL = dataChannel;
        this.LLILLJJLI = voiceEffectViewModel;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(voiceEffectViewModel), null, null, new C760950Tt7(this, null), 3);
        this.LLILLL = new ArrayList();
        this.LLILZ = new LinkedHashMap();
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLFZ, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(final C761770TuR c761770TuR, int i) {
        final LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LLILLL, i);
        C761830TuX c761830TuX = C761830TuX.LIZ;
        final boolean zLIZLLL = C761830TuX.LIZLLL(liveEffect);
        final boolean zYQ2 = this.LLILLJJLI.yQ2(liveEffect);
        UrlModel icon = liveEffect.getIcon();
        boolean z = false;
        if (icon != null) {
            C0JSS.LJ(c761770TuR.LL, icon.LIZ(), 0);
        }
        c761770TuR.LLILZIL.setText(liveEffect.getName());
        UrlModel urlModel = LiveEffect.LIZLLL;
        c761770TuR.I5(C0UCX.LIZ(this.LLILZLL, liveEffect));
        C500260Jjc.LJIILIIL(c761770TuR.LLILZLL);
        AbstractC766100U3k<T> abstractC766100U3k = this.LLILLJJLI.LL;
        if (abstractC766100U3k != 0 && abstractC766100U3k.LIZ.contains(liveEffect)) {
            C500260Jjc.LLFFF(c761770TuR.LLILZ);
            C500260Jjc.LJIILIIL(c761770TuR.LLILLL);
        } else {
            C500260Jjc.LJIILIIL(c761770TuR.LLILZ);
            View view = c761770TuR.LLILLL;
            if (!zLIZLLL && !zYQ2) {
                z = true;
            }
            C500260Jjc.LJLJLJ(view, z);
        }
        View view2 = c761770TuR.LLILLJJLI;
        C500260Jjc.LJLIIIL(500L, view2, new C761790TuT(this, c761770TuR.getAdapterPosition(), liveEffect, zLIZLLL, zYQ2));
        view2.setOnLongClickListener(new View.OnLongClickListener() { // from class: X.0TuS
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view3) {
                UrlModel urlModel2 = LiveEffect.LIZLLL;
                if (!C0UCX.LIZ(this.LL.LLILZLL, liveEffect) || zLIZLLL || !zYQ2) {
                    return false;
                }
                this.LL.LLIZ = true;
                C761770TuR c761770TuR2 = c761770TuR;
                C500260Jjc.LJLJLJ(c761770TuR2.LLILZLL, true);
                ViewParent parent = c761770TuR2.LLIZLLLIL.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                C761830TuX c761830TuX2 = C761830TuX.LIZ;
                C761830TuX.LJIIJ = true;
                AbstractC768410UCh abstractC768410UChLIZIZ = C761830TuX.LIZIZ();
                if (abstractC768410UChLIZIZ != null) {
                    abstractC768410UChLIZIZ.setEnable(true);
                }
                AbstractC765580U1k abstractC765580U1k = C761830TuX.LIZIZ;
                if (abstractC765580U1k != null) {
                    abstractC765580U1k.setEnable(true);
                }
                AbstractC768410UCh abstractC768410UChLIZIZ2 = C761830TuX.LIZIZ();
                if (abstractC768410UChLIZIZ2 != null) {
                    abstractC768410UChLIZIZ2.enablePlayerMode(true, false);
                }
                InterfaceC761800TuU interfaceC761800TuU = C761830TuX.LJII;
                if (interfaceC761800TuU != null) {
                    interfaceC761800TuU.Cx(true);
                }
                DataChannel dataChannel = this.LL.LL;
                LiveEffect liveEffect2 = liveEffect;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_voice_try");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(liveEffect2.LJJJJZI(), "effect_name");
                c474500IjALIZ.LJJII(Long.valueOf(liveEffect2.getEffectId()), "effect_id");
                c474500IjALIZ.LJJII(liveEffect2.getResourceId(), "resource_id");
                c474500IjALIZ.LIZ();
                return true;
            }
        });
        view2.setOnTouchListener(new ATListenerS339S0200000_12(this, c761770TuR, 2));
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C761770TuR c761770TuR = new C761770TuR(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gez, viewGroup, false));
        try {
            View view = c761770TuR.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c761770TuR.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c761770TuR.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C761770TuR.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c761770TuR.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c761770TuR.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C761770TuR.class.getName();
        return c761770TuR;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C761770TuR c761770TuR = (C761770TuR) viewHolder;
        super.onBindViewHolder(c761770TuR, i, list);
        LiveEffect liveEffect = (LiveEffect) ListProtector.get(this.LLILLL, i);
        if (list.isEmpty()) {
            onBindViewHolder(c761770TuR, i);
            return;
        }
        for (Object obj : list) {
            if (Intrinsics.LJFF(obj, "item_downloaded")) {
                C500260Jjc.LLFFF(c761770TuR.LLILLL);
                C500260Jjc.LJIILIIL(c761770TuR.LLILZ);
            } else if (Intrinsics.LJFF(obj, "item_downloading")) {
                C500260Jjc.LJIILIIL(c761770TuR.LLILLL);
                C500260Jjc.LLFFF(c761770TuR.LLILZ);
            } else if (Intrinsics.LJFF(obj, "item_select")) {
                UrlModel urlModel = LiveEffect.LIZLLL;
                c761770TuR.I5(C0UCX.LIZ(this.LLILZLL, liveEffect));
            } else if (Intrinsics.LJFF(obj, "item_unselect")) {
                c761770TuR.I5(false);
            }
        }
    }

    public final void LLLI(int i, LiveEffect liveEffect, boolean z, boolean z2) {
        boolean z3;
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj62;
        C946050aj5 c946050aj5LIZIZ2;
        if (i >= 0 && i < ((ArrayList) this.LLILLL).size()) {
            UrlModel urlModel = LiveEffect.LIZLLL;
            if (!C0UCX.LIZ(this.LLILZLL, liveEffect)) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJIJJ;
                if (c20337914i1.LIZIZ().booleanValue() && !z) {
                    c20337914i1.LJFF(Boolean.FALSE);
                    C766270U4b.LIZLLL(2131844656);
                }
                C761850TuZ c761850TuZ = null;
                boolean z4 = false;
                if (!z2) {
                    this.LLILZ.put(Long.valueOf(liveEffect.getEffectId()), Integer.valueOf(i));
                    C761830TuX.LJ.put(Long.valueOf(liveEffect.getEffectId()), Long.valueOf(SystemClock.uptimeMillis()));
                    BaseEffectViewModel.vQ2(this.LLILLJJLI, liveEffect, null, 30);
                } else {
                    C761830TuX c761830TuX = C761830TuX.LIZ;
                    C761830TuX.LJI(liveEffect, false);
                }
                this.LLILZIL = this.LLILZLL;
                this.LLILZLL = liveEffect;
                C1276840jKc c1276840jKc = C1276840jKc.LIZ;
                String strValueOf = String.valueOf(liveEffect.getEffectId());
                c1276840jKc.getClass();
                if (strValueOf.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    C1276840jKc.LJIIL.remove("voice_effect_id");
                } else {
                    C1276840jKc.LJIIL.put("voice_effect_id", strValueOf);
                }
                String resourceId = liveEffect.getResourceId();
                if (resourceId.length() == 0) {
                    z4 = true;
                }
                if (z4) {
                    C1276840jKc.LJIIL.remove("voice_resource_id");
                } else {
                    C1276840jKc.LJIIL.put("voice_resource_id", resourceId);
                }
                DataChannel dataChannel = this.LL;
                LiveEffect liveEffect2 = this.LLILZIL;
                C07NR.LIZ.put(Long.valueOf(liveEffect.getEffectId()), ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene());
                C07NR.LIZIZ = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_voice_select");
                c474500IjALIZ.LJIJJLI(dataChannel);
                c474500IjALIZ.LJJII(liveEffect.LJJJJZI(), "effect_name");
                c474500IjALIZ.LJJII(Long.valueOf(liveEffect.getEffectId()), "effect_id");
                c474500IjALIZ.LJJII(liveEffect.getResourceId(), "resource_id");
                c474500IjALIZ.LJJII(C07NR.LIZIZ, "select_scene");
                c474500IjALIZ.LIZ();
                C768300UBw.LIZIZ(4L);
                if (liveEffect2 != null) {
                    C761830TuX c761830TuX2 = C761830TuX.LIZ;
                    C761820TuW c761820TuW = (C761820TuW) ((LinkedHashMap) C761830TuX.LJFF).get(Long.valueOf(liveEffect2.getEffectId()));
                    if (c761820TuW != null && !C761830TuX.LIZLLL(liveEffect2)) {
                        C768300UBw.LJIIIZ(liveEffect2, Long.valueOf(c761820TuW.LIZ), c761820TuW.LIZIZ);
                    }
                }
                C761830TuX c761830TuX3 = C761830TuX.LIZ;
                if (!C761830TuX.LIZLLL(liveEffect)) {
                    C768300UBw.LJIIIZ(liveEffect, null, C07NR.LIZIZ);
                    C768300UBw.LJIILIIL(4L);
                }
                DataChannel dataChannel2 = this.LL;
                if (dataChannel2 != null && (c946060aj62 = (C946060aj6) dataChannel2.gg0(VoiceEffectChannel.class)) != null && (c946050aj5LIZIZ2 = c946060aj62.LIZIZ()) != null) {
                    c946050aj5LIZIZ2.LJ();
                }
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null && (c946060aj6 = (C946060aj6) dataChannel3.gg0(VoiceEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
                    if (!C761830TuX.LIZLLL(liveEffect)) {
                        c761850TuZ = new C761850TuZ(liveEffect.getResourceId(), liveEffect.getName());
                    }
                    c946050aj5LIZIZ.LIZ(c761850TuZ);
                }
                notifyDataSetChanged();
            }
        }
    }
}
