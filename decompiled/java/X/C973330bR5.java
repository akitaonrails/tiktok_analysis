package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.privilege.voicewave.MultiGuestVoiceWaveSettingSheet;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_social_data.SoundWareEffect;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0bR5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C973330bR5 extends AbstractC21673619ry<C973370bR9> {
    public List<SoundWareEffect> LL;
    public Integer LLILLJJLI;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C973330bR5(List<SoundWareEffect> list) {
        this.LL = list;
    }

    public final void LLLFZ(int i) {
        this.LLILLJJLI = Integer.valueOf(i);
        int size = this.LL.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 == i) {
                notifyItemChanged(i2, "play");
            } else {
                notifyItemChanged(i2, "stop");
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        C973370bR9 c973370bR9 = (C973370bR9) viewHolder;
        Integer num = this.LLILLJJLI;
        if (num != null && num.intValue() == i) {
            z = true;
        } else {
            z = false;
        }
        LLLI(c973370bR9, i, z);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C973370bR9 c973370bR9 = new C973370bR9(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hdb, viewGroup, false));
        try {
            View view = c973370bR9.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c973370bR9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c973370bR9.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C973370bR9.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c973370bR9.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c973370bR9.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C973370bR9.class.getName();
        return c973370bR9;
    }

    public final void LLLI(C973370bR9 c973370bR9, final int i, boolean z) {
        C1324720kZq c1324720kZq = c973370bR9.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("avatarDress, position: ");
        sbLIZ.append(i);
        sbLIZ.append(", no controller, load images, autoPlay = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", C2188811AlT.LIZIZ(sbLIZ));
        final SoundWareEffect soundWareEffect = (SoundWareEffect) C13LP.LJJJLZIJ(i, this.LL);
        if (soundWareEffect != null) {
            SoundWareEffectExtra soundWareEffectExtra = C053100Hh.LIZ;
            String strLIZ = C053100Hh.LIZ(soundWareEffect.staticImageName);
            if (strLIZ != null) {
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(Collections.singletonList(strLIZ));
                c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLIZJ.LJJ = Boolean.FALSE;
                c1324610kZfLIZJ.LJIIL = new InterfaceC1142670fqD() { // from class: X.0bR7
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("avatarDress, position=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", soundWareEffect = ");
                        sbLIZ2.append(soundWareEffect.staticImageName);
                        sbLIZ2.append(", imageUrl = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", load fail");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        C20441214yg.LJ("MultiGuestVoiceWaveSettingSheet", strLIZIZ);
                        C1CC2.LIZ(strLIZIZ, exc);
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i2, int i3, String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("avatarDress, position=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", soundWareEffect = ");
                        sbLIZ2.append(soundWareEffect.staticImageName);
                        sbLIZ2.append(",load success");
                        C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                };
                c1324610kZfLIZJ.LJIL = z;
                c1324610kZfLIZJ.LJJI(c1324720kZq);
            }
        }
        C1324720kZq c1324720kZq2 = c973370bR9.LLILLJJLI;
        final SoundWareEffect soundWareEffect2 = (SoundWareEffect) C13LP.LJJJLZIJ(i, this.LL);
        if (soundWareEffect2 != null) {
            SoundWareEffectExtra soundWareEffectExtra2 = C053100Hh.LIZ;
            String strLIZ2 = C053100Hh.LIZ(soundWareEffect2.dynamicImageName);
            if (strLIZ2 != null) {
                C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(Collections.singletonList(strLIZ2));
                c1324610kZfLIZJ2.LJIILIIL = Boolean.TRUE;
                c1324610kZfLIZJ2.LJJ = Boolean.FALSE;
                c1324610kZfLIZJ2.LJIL = z;
                c1324610kZfLIZJ2.LJIIL = new InterfaceC1142670fqD() { // from class: X.0bR8
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("VoiceWave, position=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", soundWareEffect = ");
                        sbLIZ2.append(soundWareEffect2.dynamicImageName);
                        sbLIZ2.append(", imageUrl = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", load fail");
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", strLIZIZ);
                        C1CC2.LIZ(strLIZIZ, exc);
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i2, int i3, String str) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("VoiceWave, position=");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", soundWareEffect = ");
                        sbLIZ2.append(soundWareEffect2.dynamicImageName);
                        sbLIZ2.append(",load success");
                        C20441214yg.LIZIZ("MultiGuestVoiceWaveSettingSheet", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                };
                c1324610kZfLIZJ2.LJJI(c1324720kZq2);
            }
        }
        C786410Ut5.Yb(c973370bR9.LL, MultiGuestVoiceWaveSettingSheet.LLLILZJ);
        C786410Ut5.xc(c973370bR9.LL, MultiGuestVoiceWaveSettingSheet.LLLILZJ);
        C786410Ut5.Yb(c973370bR9.LLILLJJLI, MultiGuestVoiceWaveSettingSheet.LLLILZJ);
        C786410Ut5.xc(c973370bR9.LLILLJJLI, MultiGuestVoiceWaveSettingSheet.LLLILZJ);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List list) {
        C973370bR9 c973370bR9 = (C973370bR9) viewHolder;
        if (list.isEmpty()) {
            super.onBindViewHolder(c973370bR9, i, list);
            return;
        }
        for (Object obj : list) {
            if (Intrinsics.LJFF(obj, "play")) {
                LLLI(c973370bR9, i, true);
            } else if (Intrinsics.LJFF(obj, "stop")) {
                LLLI(c973370bR9, i, false);
            }
        }
    }
}
