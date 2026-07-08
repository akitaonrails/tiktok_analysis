package X;

import android.widget.TextView;
import com.bytedance.android.live.effect.BeautyPanelFetchSuccess;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U6V, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U6V {
    public final DataChannel LIZ;
    public final C19P4 LIZIZ;
    public final TextView LIZJ;
    public final String LIZLLL;
    public final C0U78 LJ;
    public LiveEffect LJFF;
    public String LJI;
    public String LJII;
    public final Map<String, LiveEffect> LJIIIIZZ = new LinkedHashMap();
    public final List<String> LJIIIZ = new ArrayList();
    public final List<C0U74<LiveEffect>> LJIIJ = new ArrayList();

    public LiveEffect LIZJ() {
        throw null;
    }

    public void LJI(LiveEffect liveEffect) {
        throw null;
    }

    public final List<LiveEffect> LIZ() {
        C0U74<LiveEffect> next;
        Iterator<C0U74<LiveEffect>> it2 = this.LJIIJ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.LJFF(next.LIZ, this.LJI)) {
                break;
            }
        }
        C0U74<LiveEffect> c0u74 = next;
        if (c0u74 != null) {
            return c0u74.LIZIZ;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJFF() {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U6V.LJFF():void");
    }

    public final float LIZIZ(LiveEffect liveEffect) {
        String str;
        int i;
        C0U78 c0u78 = this.LJ;
        String resourceId = liveEffect.getResourceId();
        LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
        if (composerConfigLJIIJ == null || (str = composerConfigLJIIJ.tag) == null) {
            str = "";
        }
        Float fLJIJ = c0u78.LJIJ(resourceId, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeautySwitch#getEffectValue, value: ");
        sbLIZ.append(fLJIJ);
        C20441214yg.LIZIZ("kk", C2188811AlT.LIZIZ(sbLIZ));
        if (fLJIJ == null) {
            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
            if (composerConfigLJIIJ2 != null) {
                i = composerConfigLJIIJ2.LIZIZ;
            } else {
                i = 0;
            }
            fLJIJ = Float.valueOf(C0UG7.LIZLLL(C0U7C.LJIIJ(liveEffect), i));
        }
        return fLJIJ.floatValue();
    }

    public final void LIZLLL(List<C0U74<LiveEffect>> list) {
        String str;
        String str2;
        ((ArrayList) this.LJIIJ).clear();
        ((ArrayList) this.LJIIJ).addAll(list);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C0U74<LiveEffect>> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZ);
        }
        if (!Intrinsics.LJFF(this.LJIIIZ, arrayList)) {
            C0U74 c0u74 = (C0U74) C13LP.LJJJLL(list);
            LiveEffect liveEffect = null;
            if (c0u74 != null) {
                str = c0u74.LIZ;
            } else {
                str = null;
            }
            this.LJI = str;
            C0U74 c0u742 = (C0U74) C13LP.LJJJLL(list);
            if (c0u742 != null) {
                str2 = c0u742.LIZJ;
            } else {
                str2 = null;
            }
            this.LJII = str2;
            LiveEffect liveEffectLIZJ = LIZJ();
            if (liveEffectLIZJ != null) {
                LJIIIZ(liveEffectLIZJ, false);
                liveEffect = liveEffectLIZJ;
            }
            LJII(liveEffect);
            ((ArrayList) this.LJIIIZ).clear();
            ((ArrayList) this.LJIIIZ).addAll(arrayList);
            DataChannel dataChannel = this.LIZ;
            if (dataChannel != null) {
                dataChannel.FQ2(BeautyPanelFetchSuccess.class);
            }
        }
    }

    public final void LJ(LiveEffect liveEffect) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("effect: ");
        sbLIZ.append(liveEffect);
        C20441214yg.LIZIZ("BeautySwitch#onSelect", C2188811AlT.LIZIZ(sbLIZ));
        if (C0U7C.LJIILJJIL(liveEffect)) {
            C20441214yg.LIZIZ("BeautySwitch#onSelect", "branch1");
            LJI(liveEffect);
            LJII(liveEffect);
            return;
        }
        if (liveEffect.LJIILIIL()) {
            LiveEffect liveEffect2 = this.LJFF;
            String strLLILL = null;
            if (liveEffect2 != null) {
                boolValueOf = Boolean.valueOf(liveEffect2.LJIILIIL());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                String strLLILL2 = liveEffect.LLILL();
                LiveEffect liveEffect3 = this.LJFF;
                if (liveEffect3 != null) {
                    strLLILL = liveEffect3.LLILL();
                }
                if (Intrinsics.LJFF(strLLILL2, strLLILL)) {
                    C20441214yg.LIZIZ("BeautySwitch#onSelect", "branch2");
                    C0UC4 c0uc4 = C0UC4.LIZ;
                    DataChannel dataChannel = this.LIZ;
                    boolean zLJFF = Intrinsics.LJFF(this.LJII, "liveguestbeauty");
                    String str = this.LJII;
                    String str2 = "";
                    if (str == null) {
                        str = "";
                    }
                    C0UC4.LJJIII(dataChannel, zLJFF, liveEffect, str);
                    C768430UCj c768430UCj = C768430UCj.LIZ;
                    boolean zLJFF2 = Intrinsics.LJFF(this.LJII, "liveguestbeauty");
                    String str3 = this.LJII;
                    if (str3 != null) {
                        str2 = str3;
                    }
                    C768430UCj.LJ(liveEffect, 0L, zLJFF2, str2);
                    this.LJ.Gr(this.LIZLLL, this.LJFF, liveEffect);
                    LJII(liveEffect);
                    LJIIIZ(liveEffect, false);
                    return;
                }
            }
        }
        C20441214yg.LIZIZ("BeautySwitch#onSelect", "branch3");
        LJII(liveEffect);
        LJIIIZ(liveEffect, true);
    }

    public final void LJII(LiveEffect liveEffect) {
        LiveEffect liveEffectLJIIL;
        Boolean boolValueOf;
        if (liveEffect == null || (liveEffectLJIIL = C0U7C.LJIIL(liveEffect, this.LIZLLL, this.LJ)) == null) {
            liveEffectLJIIL = liveEffect;
        }
        this.LJFF = liveEffectLJIIL;
        if (liveEffect != null) {
            boolValueOf = Boolean.valueOf(liveEffect.LLLIIII());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            this.LJIIIIZZ.put(this.LJI, liveEffect);
        }
    }

    public final void LJIIIIZZ(int i, LiveEffect liveEffect) {
        if (liveEffect == null || !((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
            return;
        }
        String strLIZIZ = "";
        for (LiveEffect.ComposerConfig composerConfig : liveEffect.LJJJZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append("name: ");
            sbLIZ.append(composerConfig.tag);
            sbLIZ.append("\nbeauty_restore_by_ui_value: ");
            sbLIZ.append(liveEffect.LJLLL());
            sbLIZ.append("lokiMax: ");
            sbLIZ.append(composerConfig.maxValue);
            sbLIZ.append("\nlokiMin: ");
            sbLIZ.append(composerConfig.minValue);
            sbLIZ.append("\nlokiDefault: ");
            sbLIZ.append(composerConfig.defaultValue);
            sbLIZ.append("\nuiMax:");
            sbLIZ.append(composerConfig.LIZJ);
            sbLIZ.append("\nuiMin: ");
            sbLIZ.append(composerConfig.LIZLLL);
            sbLIZ.append("\nuiDefault: ");
            sbLIZ.append(composerConfig.LIZIZ);
            sbLIZ.append("\ncurrentUIValue: ");
            sbLIZ.append(i);
            sbLIZ.append("\ncurrentEffectValue: ");
            sbLIZ.append(C0UG7.LIZLLL(composerConfig, i));
            sbLIZ.append('\n');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZJ.setText(strLIZIZ);
    }

    public final void LJIIIZ(LiveEffect liveEffect, boolean z) {
        String strLIZ;
        int i;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i2;
        LiveEffect liveEffect2 = null;
        if (liveEffect != null && C0U7C.LJIIJ(liveEffect) != null) {
            if (C0U7C.LJIILL(liveEffect, this.LJ)) {
                C500260Jjc.LJIILIIL(this.LIZIZ);
            } else {
                C500260Jjc.LLFFF(this.LIZIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BeautySwitch#updateSeekBarStyle， config: ");
                LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ != null) {
                    strLIZ = composerConfigLJIIJ.LIZ();
                } else {
                    strLIZ = null;
                }
                sbLIZ.append(strLIZ);
                C20441214yg.LIZIZ("kk", C2188811AlT.LIZIZ(sbLIZ));
                this.LIZIZ.setPercent(C0UG7.LIZJ(C0U7C.LJIIJ(liveEffect), LIZIZ(liveEffect)));
                LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
                if (composerConfigLJIIJ2 != null && composerConfigLJIIJ2.doubleDirection) {
                    C19P4 c19p4 = this.LIZIZ;
                    LiveEffect.ComposerConfig composerConfigLJIIJ3 = C0U7C.LJIIJ(liveEffect);
                    if (composerConfigLJIIJ3 != null) {
                        i2 = composerConfigLJIIJ3.LIZIZ;
                    } else {
                        i2 = 0;
                    }
                    c19p4.LIZJ(50, -50, i2, false);
                } else {
                    C19P4 c19p42 = this.LIZIZ;
                    LiveEffect.ComposerConfig composerConfigLJIIJ4 = C0U7C.LJIIJ(liveEffect);
                    if (composerConfigLJIIJ4 != null) {
                        i = composerConfigLJIIJ4.LIZIZ;
                    } else {
                        i = 0;
                    }
                    c19p42.LIZJ(100, 0, i, true);
                }
                String str = this.LJII;
                if (str != null) {
                    boolValueOf = Boolean.valueOf(u.LJJIIJZLJL(str, "makeup", false));
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJJI(boolValueOf)) {
                    Iterator<LiveEffect> it2 = this.LJ.qr(this.LJII).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        LiveEffect next = it2.next();
                        String strLJLL = next.LJLL();
                        if (strLJLL != null) {
                            boolValueOf2 = Boolean.valueOf(u.LJJIIJZLJL(strLJLL, "makeup", false));
                        } else {
                            boolValueOf2 = null;
                        }
                        if (C500260Jjc.LJJJI(boolValueOf2)) {
                            liveEffect2 = next;
                            break;
                        }
                    }
                    LiveEffect liveEffect3 = liveEffect2;
                    if (liveEffect3 != null && C0U7C.LJIILL(liveEffect3, this.LJ)) {
                        C500260Jjc.LJIILIIL(this.LIZIZ);
                    } else {
                        C500260Jjc.LLFFF(this.LIZIZ);
                    }
                }
            }
            LJIIIIZZ(C0UG7.LIZJ(C0U7C.LJIIJ(liveEffect), LIZIZ(liveEffect)), liveEffect);
            if (z) {
                C0UC4 c0uc4 = C0UC4.LIZ;
                DataChannel dataChannel = this.LIZ;
                boolean zLJFF = Intrinsics.LJFF(this.LJII, "liveguestbeauty");
                String str2 = C0UD4.LJFF;
                C0UC4.LJJIII(dataChannel, zLJFF, liveEffect, str2);
                C768430UCj c768430UCj = C768430UCj.LIZ;
                C768430UCj.LJ(liveEffect, 0L, Intrinsics.LJFF(this.LJII, "liveguestbeauty"), str2);
                this.LJ.kr(liveEffect, this.LIZLLL);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LIZIZ);
    }

    public C0U6V(DataChannel dataChannel, C19P4 c19p4, TextView textView, String str, C0U78 c0u78) {
        this.LIZ = dataChannel;
        this.LIZIZ = c19p4;
        this.LIZJ = textView;
        this.LIZLLL = str;
        this.LJ = c0u78;
    }
}
