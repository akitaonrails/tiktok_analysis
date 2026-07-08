package X;

import Y.ACListenerS44S0201000_12;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.android.livesdk.model.SoundEffectChannel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS55S0010000_12;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.Modification;

/* JADX INFO: renamed from: X.0TuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C761610TuB extends AbstractC761920Tug<C761630TuD, SoundEffect> {
    public final DataChannel LLILLJJLI;
    public final boolean LLILLL;
    public final LifecycleOwner LLILZ;
    public final SoundEffectViewModel LLILZIL;
    public final int LLILZLL;
    public int LLIZ = -1;

    @Override // X.AbstractC761920Tug
    public final void LLLILZ(int i) {
        int i2 = this.LLIZ;
        if (i2 >= 0 && i2 < ((ArrayList) this.LL).size()) {
            LLLJ(this.LLIZ);
        }
        super.LLLILZ(i);
        this.LLIZ = i;
    }

    public void LLLLLLIL(C761630TuD c761630TuD) {
        C500260Jjc.LLFFF(c761630TuD.LLILLJJLI);
        C500260Jjc.LJIILLIIL(c761630TuD.LLILLL);
    }

    public void LLLLLLL(C761630TuD c761630TuD) {
        C500260Jjc.LJIILLIIL(c761630TuD.LLILLJJLI);
        C500260Jjc.LLFFF(c761630TuD.LLILLL);
        C20515815Po c20515815Po = c761630TuD.LLILLL;
        if (c20515815Po != null) {
            c20515815Po.setProgress(90);
        }
    }

    public void LLLLLLLLL(C761630TuD c761630TuD) {
        C500260Jjc.LJIILLIIL(c761630TuD.LLILLJJLI);
        C500260Jjc.LJIILLIIL(c761630TuD.LLILLL);
    }

    public final void LLLLLZIL(final List<SoundEffect> list) {
        final List<Effect> list2 = this.LL;
        C21342318fd.LIZ(new AbstractC21342018fa(list2, list) { // from class: X.0TuE
            public final List<SoundEffect> LIZ;
            public final List<SoundEffect> LIZIZ;

            @Override // X.AbstractC21342018fa
            public final int LIZLLL() {
                return this.LIZIZ.size();
            }

            @Override // X.AbstractC21342018fa
            public final int LJ() {
                return this.LIZ.size();
            }

            {
                this.LIZ = list2;
                this.LIZIZ = list;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZ(int i, int i2) {
                if (!Intrinsics.LJFF(((SoundEffect) ListProtector.get(this.LIZ, i)).name, ((SoundEffect) ListProtector.get(this.LIZIZ, i2)).name)) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC21342018fa
            public final boolean LIZIZ(int i, int i2) {
                if (((SoundEffect) ListProtector.get(this.LIZ, i)).id == ((SoundEffect) ListProtector.get(this.LIZIZ, i2)).id) {
                    return true;
                }
                return false;
            }
        }, true).LIZJ(this);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
    }

    public void LLLLLLLLLL(C761630TuD c761630TuD, SoundEffect soundEffect) {
        C500260Jjc.LLFFF(c761630TuD.LLILZIL);
        TextView textView = c761630TuD.LLILZ;
        if (textView != null) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        }
        TextView textView2 = c761630TuD.LLILZ;
        if (textView2 != null) {
            textView2.setSelected(true);
        }
    }

    public void LLLLLLLZIL(C761630TuD c761630TuD, SoundEffect soundEffect) {
        C500260Jjc.LJIILLIIL(c761630TuD.LLILZIL);
        TextView textView = c761630TuD.LLILZ;
        if (textView != null) {
            textView.setEllipsize(null);
        }
        TextView textView2 = c761630TuD.LLILZ;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
    }

    public C761630TuD LLLLLLZZ(int i, ViewGroup viewGroup) {
        return new C761630TuD(this.LLILZLL, viewGroup);
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C761630TuD c761630TuDLLLLLLZZ = LLLLLLZZ(i, viewGroup);
        if (c761630TuDLLLLLLZZ != null) {
            try {
                View view = c761630TuDLLLLLLZZ.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c761630TuDLLLLLLZZ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c761630TuDLLLLLLZZ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c761630TuDLLLLLLZZ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c761630TuDLLLLLLZZ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c761630TuDLLLLLLZZ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c761630TuDLLLLLLZZ.getClass().getName();
        return c761630TuDLLLLLLZZ;
    }

    @Override // X.AbstractC761920Tug
    public /* bridge */ /* synthetic */ void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLIL((C761630TuD) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public /* bridge */ /* synthetic */ void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLL((C761630TuD) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public /* bridge */ /* synthetic */ void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLL((C761630TuD) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLLL((C761630TuD) viewHolder, (SoundEffect) obj);
    }

    @Override // X.AbstractC761920Tug
    public /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLZIL((C761630TuD) viewHolder, (SoundEffect) obj);
    }

    @Override // X.AbstractC761920Tug
    /* JADX INFO: renamed from: LLLLLLZ, reason: merged with bridge method [inline-methods] */
    public void LLLLLL(C761630TuD c761630TuD, SoundEffect soundEffect, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
        c1324610kZfLJFF.LJIIIZ(soundEffect.iconUrl);
        c1324610kZfLJFF.LJJI(c761630TuD.itemView.findViewById(R.id.lkw));
        TextView textView = c761630TuD.LLILZ;
        if (textView != null) {
            textView.setText(soundEffect.name);
        }
        C786410Ut5.I7(new ACListenerS44S0201000_12(this, i, soundEffect, 4), c761630TuD.itemView);
        SoundEffectViewModel soundEffectViewModel = this.LLILZIL;
        Boolean boolValueOf3 = null;
        if (soundEffectViewModel != null) {
            soundEffectViewModel.LLILZIL.getClass();
            boolValueOf = Boolean.valueOf(C761740TuO.LJIILLIIL(soundEffect));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LLLLLLLLL(c761630TuD);
        } else {
            SoundEffectViewModel soundEffectViewModel2 = this.LLILZIL;
            if (soundEffectViewModel2 != null) {
                boolValueOf2 = Boolean.valueOf(soundEffectViewModel2.LLILZIL.LIZ.contains(soundEffect));
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                LLLLLLL(c761630TuD);
            } else {
                LLLLLLIL(c761630TuD);
            }
        }
        SoundEffectViewModel soundEffectViewModel3 = this.LLILZIL;
        if (soundEffectViewModel3 != null) {
            boolValueOf3 = Boolean.valueOf(Intrinsics.LJFF(soundEffectViewModel3.LLILZ.LIZJ, soundEffect));
        }
        if (C500260Jjc.LJJJI(boolValueOf3)) {
            LLLLLLLLLL(c761630TuD, soundEffect);
        } else {
            LLLLLLLZIL(c761630TuD, soundEffect);
        }
    }

    public void LLLLLZ(View view, SoundEffect soundEffect, int i) {
        Boolean boolValueOf;
        String str;
        String str2;
        boolean zLJFF;
        C946060aj6 c946060aj6;
        C946050aj5 c946050aj5LIZIZ;
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null && (c946060aj6 = (C946060aj6) dataChannel.gg0(SoundEffectChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJ();
        }
        SoundEffectViewModel soundEffectViewModel = this.LLILZIL;
        if (soundEffectViewModel != null) {
            soundEffectViewModel.LLILZIL.getClass();
            if (C761740TuO.LJIILLIIL(soundEffect)) {
                zLJFF = Intrinsics.LJFF(soundEffectViewModel.LLILZ.LIZJ, soundEffect);
            } else {
                zLJFF = false;
            }
            boolValueOf = Boolean.valueOf(zLJFF);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            DataChannel dataChannel2 = this.LLILLJJLI;
            boolean z = this.LLILLL;
            String broadcastScene = ((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_sound_select");
            c474500IjALIZ.LJIJJLI(dataChannel2);
            c474500IjALIZ.LJJII(Integer.valueOf(i + 1), "impr_position");
            if (z) {
                str = "shortcut";
            } else {
                str = "normal";
            }
            c474500IjALIZ.LJJII(str, "panel_type");
            c474500IjALIZ.LJJIIZ(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C761680TuI.LIZ)) ? 1 : 0), "is_live_take_default", new AwS55S0010000_12(z, 4));
            c474500IjALIZ.LJJII(broadcastScene, "select_scene");
            c474500IjALIZ.LJJII(Long.valueOf(soundEffect.id), "effect_id");
            c474500IjALIZ.LJJII(soundEffect.nameEn, "effect_name");
            c474500IjALIZ.LIZ();
            long j = soundEffect.id;
            String strValueOf = String.valueOf(j);
            String str3 = soundEffect.nameEn;
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (z) {
                str2 = "shortcut_panel";
            } else {
                str2 = "normal_panel";
            }
            C768300UBw.LJIIJ(C768300UBw.LIZJ(), C1697810uHb.LJIILJJIL(new Modification(j, str3, strValueOf, 7L, Long.valueOf(jCurrentTimeMillis), null, 0L, str2, null, null, null, null, broadcastScene, null, null, 0L, 0)));
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C761110TtN(this, soundEffect, null), 3);
        }
    }

    public C761610TuB(DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner, SoundEffectViewModel soundEffectViewModel, int i) {
        this.LLILLJJLI = dataChannel;
        this.LLILLL = z;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = soundEffectViewModel;
        this.LLILZLL = i;
    }
}
