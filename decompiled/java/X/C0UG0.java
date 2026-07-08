package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0UG0, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UG0 implements InterfaceC932350aMz {
    public static volatile C0UG0 LJIJ;
    public C0UG8 LIZIZ;
    public boolean LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public final Map<LiveEffect, Map<String, Float>> LJIIIZ = new HashMap();
    public final Map<String, Map<String, Float>> LJIILL = new HashMap();
    public final List<C0U86> LJIIJJI = new ArrayList();
    public final Map<String, List<String>> LJIILJJIL = InterfaceC766480U4w.LJIIJ.LIZIZ();
    public final Map<String, Map<String, Float>> LJIILLIIL = InterfaceC766480U4w.LJIIJJI.LIZIZ();
    public final Map<String, List<String>> LJIILIIL = new HashMap();
    public final Map<String, Map<String, LiveEffect>> LJIIIIZZ = new HashMap();
    public final List<LiveEffect> LJIIJ = new ArrayList();
    public final List<C0UG2> LJIIL = new ArrayList();
    public final Map<String, Integer> LJIIZILJ = new HashMap();

    @Override // X.InterfaceC769000UEo
    public final void Er() {
    }

    @Override // X.InterfaceC769000UEo
    public final void Fr(String str) {
    }

    @Override // X.InterfaceC769000UEo
    public final void Hr() {
    }

    @Override // X.InterfaceC769000UEo
    public final void sendEffectMsg(int i, int i2, int i3, String str) {
    }

    @Override // X.InterfaceC769000UEo
    public final void setRenderCacheString(String str, String str2) {
    }

    @Override // X.InterfaceC769000UEo
    public final void sr() {
    }

    @Override // X.InterfaceC769000UEo
    public final void release() {
        C0UG9 c0ug9;
        if (!this.LJIILJJIL.isEmpty()) {
            ((HashMap) this.LJIILIIL).putAll(this.LJIILJJIL);
        }
        this.LIZJ = true;
        InterfaceC766480U4w.LJIIJ.LJFF(this.LJIILIIL);
        InterfaceC766480U4w.LJIIJJI.LJFF(this.LJIILL);
        C0UG8 c0ug8 = this.LIZIZ;
        if (c0ug8 != null && (c0ug9 = c0ug8.LIZJ) != null) {
            try {
                c0ug9.LJIJI(new String[0]);
                this.LIZIZ.LIZJ.hide();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C20441214yg.LJI("LiveComposerManager", th);
            }
        }
        this.LJIILJJIL.clear();
        this.LJIILJJIL.putAll(this.LJIILIIL);
        this.LJIILLIIL.clear();
        this.LJIILLIIL.putAll(this.LJIILL);
        ((HashMap) this.LJIIIIZZ).clear();
        ((ArrayList) this.LJIIJJI).clear();
        ((ArrayList) this.LJIIL).clear();
        ((HashMap) this.LJIILIIL).clear();
        ((ArrayList) this.LJIIJ).clear();
        ((HashMap) this.LJIIIZ).clear();
        ((HashMap) this.LJIILL).clear();
        this.LIZIZ = null;
    }

    @Override // X.InterfaceC769000UEo
    public final String Ar() {
        return this.LJI;
    }

    @Override // X.InterfaceC769000UEo
    public final Map<String, Map<String, LiveEffect>> jr() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC769000UEo
    public final String mr() {
        return this.LJ;
    }

    @Override // X.InterfaceC769000UEo
    public final String pr() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC769000UEo
    public final String ur() {
        return this.LJFF;
    }

    @Override // X.InterfaceC769000UEo
    public final String xr() {
        return this.LJII;
    }

    @Override // X.InterfaceC769000UEo
    public final void Br(C0UG3 c0ug3) {
        if (c0ug3 == null) {
            return;
        }
        ((ArrayList) this.LJIIL).remove(c0ug3);
    }

    @Override // X.InterfaceC769000UEo
    public final void Dr(C0U86 c0u86) {
        if (c0u86 != null && !((ArrayList) this.LJIIJJI).contains(c0u86)) {
            ((ArrayList) this.LJIIJJI).add(c0u86);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void LIZIZ(String str) {
        this.LJ = str;
    }

    @Override // X.InterfaceC932350aMz
    public final void LJIJI(EffectChannelResponse effectChannelResponse) {
        Map<String, List<String>> map;
        if (this.LIZIZ == null) {
            return;
        }
        String panel = effectChannelResponse.getPanel();
        if (!this.LIZIZ.LIZIZ.contains(panel) || (map = this.LJIILJJIL) == null || map.isEmpty() || !this.LJIILJJIL.containsKey(panel)) {
            return;
        }
        List<String> list = this.LJIILJJIL.get(panel);
        for (Effect effect : effectChannelResponse.getAllCategoryEffects()) {
            if (effect != null) {
                if (effect.getEffectType() == 1 && !C086I.LIZIZ(effect.getChildEffects())) {
                    for (int i = 0; i < effect.getChildEffects().size(); i++) {
                        Effect effect2 = (Effect) ListProtector.get(effect.getChildEffects(), i);
                        if (list != null && effect2 != null && list.contains(effect2.getUnzipPath())) {
                            ((HashMap) this.LJIIZILJ).put(effect.getEffectId(), Integer.valueOf(i));
                        }
                        LJJIJIL(effect2, panel, list);
                    }
                } else {
                    LJJIJIL(effect, panel, list);
                }
            }
        }
        this.LJIILJJIL.remove(panel);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(boolean r14) {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UG0.LJJIL(boolean):void");
    }

    @Override // X.InterfaceC932350aMz, X.InterfaceC769000UEo
    public final void lr(String str) {
        if (((HashMap) this.LJIIIIZZ).containsKey(str) && ((Map) ((HashMap) this.LJIIIIZZ).get(str)).size() > 0) {
            Iterator it2 = ((Map) ((HashMap) this.LJIIIIZZ).get(str)).values().iterator();
            while (it2.hasNext()) {
                LJJIJLIJ((LiveEffect) it2.next(), str);
            }
            ((HashMap) this.LJIIIIZZ).remove(str);
            LJJIL(false);
            Iterator it3 = ((ArrayList) this.LJIIJJI).iterator();
            while (it3.hasNext()) {
                ((C0U86) it3.next()).LIZ(null, str, false);
            }
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void nr(String str) {
        this.LJI = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void or(C0UG8 c0ug8) {
        this.LIZIZ = c0ug8;
        this.LIZJ = true;
    }

    @Override // X.InterfaceC769000UEo
    public final List<LiveEffect> qr(String str) {
        if (((HashMap) this.LJIIIIZZ).containsKey(str)) {
            return new ArrayList(((Map) ((HashMap) this.LJIIIIZZ).get(str)).values());
        }
        return new ArrayList();
    }

    @Override // X.InterfaceC769000UEo
    public final void rr(String str) {
        this.LIZLLL = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void tr(C0U86 c0u86) {
        if (c0u86 == null) {
            return;
        }
        ((ArrayList) this.LJIIJJI).remove(c0u86);
    }

    @Override // X.InterfaceC769000UEo
    public final void vr(String str) {
        this.LJFF = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void wr(C0UG3 c0ug3) {
        if (c0ug3 != null && !((ArrayList) this.LJIIL).contains(c0ug3)) {
            ((ArrayList) this.LJIIL).add(c0ug3);
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void yr(String str) {
        this.LJII = str;
    }

    @Override // X.InterfaceC769000UEo
    public final void zr(boolean z) {
        LiveEffect liveEffect;
        String str;
        LiveEffect liveEffect2;
        LJJIL(true);
        for (Map map : new HashMap(this.LJIIIZ).values()) {
            if (map != null && map.size() != 0) {
                for (String str2 : map.keySet()) {
                    if (map.get(str2) != null) {
                        float fFloatValue = ((Float) map.get(str2)).floatValue();
                        for (LiveEffect liveEffect3 : (ArrayList) this.LJIIJ) {
                            if (!C0IKQ.LIZ(liveEffect3.LJJIJIIJIL()) && liveEffect3.LJJIJIIJIL().contains(str2) && this.LIZIZ != null && !C0IKQ.LIZ(liveEffect3.LJJIJIIJIL()) && liveEffect3.LJJIJIIJIL().contains(str2)) {
                                this.LIZIZ.LIZJ.LJIIZILJ(fFloatValue, liveEffect3.getFilePath(), str2);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("updateTagValue path:");
                                sbLIZ.append(liveEffect3.getFilePath());
                                sbLIZ.append(" tag:");
                                sbLIZ.append(str2);
                                sbLIZ.append(" value:");
                                sbLIZ.append(fFloatValue);
                                C20441214yg.LIZIZ("LiveComposerManager", C2188811AlT.LIZIZ(sbLIZ));
                                Iterator it2 = ((HashMap) this.LJIIIZ).keySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        liveEffect = (LiveEffect) it2.next();
                                        if (liveEffect.getFilePath().equals(liveEffect3.getFilePath()) && liveEffect.LJJIJIIJIL().contains(str2)) {
                                            Map map2 = (Map) ((HashMap) this.LJIIIZ).get(liveEffect);
                                            if (map2 != null) {
                                                map2.put(str2, Float.valueOf(fFloatValue));
                                            }
                                        }
                                    } else {
                                        liveEffect = null;
                                        ((HashMap) this.LJIIIZ).put(liveEffect3, new HashMap());
                                        Map map3 = (Map) ((HashMap) this.LJIIIZ).get(liveEffect3);
                                        if (map3 != null) {
                                            map3.put(str2, Float.valueOf(fFloatValue));
                                        }
                                    }
                                }
                                Iterator it3 = ((HashMap) this.LJIIIIZZ).keySet().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        str = (String) it3.next();
                                        Map map4 = (Map) ((HashMap) this.LJIIIIZZ).get(str);
                                        if (liveEffect != null) {
                                            liveEffect2 = liveEffect;
                                        } else {
                                            liveEffect2 = liveEffect3;
                                        }
                                        if (map4.containsValue(liveEffect2)) {
                                            break;
                                        }
                                    } else {
                                        str = "";
                                        break;
                                    }
                                }
                                LJJIJIIJI(str, liveEffect3, str2, fFloatValue);
                                if (!((ArrayList) this.LJIIL).isEmpty()) {
                                    for (C0UG2 c0ug2 : (ArrayList) this.LJIIL) {
                                        if (c0ug2 != null) {
                                            c0ug2.LIZIZ();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final boolean LJJIJL(List<Integer> list, List<Integer> list2) {
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (list2.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public final void LJJIJIIJIL(LiveEffect liveEffect, String str) {
        if (this.LIZIZ != null && liveEffect != null) {
            if (!((HashMap) this.LJIILIIL).containsKey(str)) {
                ((HashMap) this.LJIILIIL).put(str, new ArrayList());
            }
            if (!((List) ((HashMap) this.LJIILIIL).get(str)).contains(liveEffect.getFilePath()) && !C2093608Ic.LJ(liveEffect.getFilePath()) && this.LIZIZ.LIZIZ.contains(str)) {
                ((List) ((HashMap) this.LJIILIIL).get(str)).add(liveEffect.getFilePath());
            }
        }
    }

    public final void LJJIJLIJ(LiveEffect liveEffect, String str) {
        if (((HashMap) this.LJIILIIL).containsKey(str) && liveEffect != null && !C2093608Ic.LJ(liveEffect.getFilePath())) {
            ((List) ((HashMap) this.LJIILIIL).get(str)).remove(liveEffect.getFilePath());
        }
    }

    @Override // X.InterfaceC932350aMz, X.InterfaceC769000UEo
    public final void kr(LiveEffect liveEffect, String str) {
        if (liveEffect != null && this.LIZIZ != null) {
            if (!((HashMap) this.LJIIIIZZ).containsKey(str)) {
                ((HashMap) this.LJIIIIZZ).put(str, new HashMap());
            }
            Map map = (Map) ((HashMap) this.LJIIIIZZ).get(str);
            if (map.containsKey(liveEffect.getFilePath())) {
                ((LiveEffect) map.get(liveEffect.getFilePath())).LJJIJIIJIL().addAll(liveEffect.LJJIJIIJIL());
                return;
            }
            map.put(liveEffect.getFilePath(), liveEffect);
            if (this.LIZIZ.LIZIZ.contains(str)) {
                LJJIJIIJIL(liveEffect, str);
            }
            LJJIL(false);
            Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
            while (it2.hasNext()) {
                ((C0U86) it2.next()).LIZ(liveEffect, str, true);
            }
        }
    }

    @Override // X.InterfaceC769000UEo
    public final void Gr(String str, LiveEffect liveEffect, LiveEffect liveEffect2) {
        if (this.LIZIZ == null) {
            return;
        }
        if (liveEffect != null && ((HashMap) this.LJIIIIZZ).containsKey(str) && ((Map) ((HashMap) this.LJIIIIZZ).get(str)).size() > 0) {
            ((Map) ((HashMap) this.LJIIIIZZ).get(str)).remove(liveEffect.getFilePath());
            if (this.LIZIZ.LIZIZ.contains(str)) {
                LJJIJLIJ(liveEffect, str);
            }
            Iterator it2 = ((ArrayList) this.LJIIJJI).iterator();
            while (it2.hasNext()) {
                ((C0U86) it2.next()).LIZ(liveEffect, str, false);
            }
        }
        if (liveEffect2 != null) {
            if (!((HashMap) this.LJIIIIZZ).containsKey(str)) {
                ((HashMap) this.LJIIIIZZ).put(str, new HashMap());
            }
            Map map = (Map) ((HashMap) this.LJIIIIZZ).get(str);
            if (map.containsKey(liveEffect2.getFilePath())) {
                ((LiveEffect) map.get(liveEffect2.getFilePath())).LJJIJIIJIL().addAll(liveEffect2.LJJIJIIJIL());
                return;
            }
            map.put(liveEffect2.getFilePath(), liveEffect2);
            if (this.LIZIZ.LIZIZ.contains(str)) {
                LJJIJIIJIL(liveEffect2, str);
            }
            Iterator it3 = ((ArrayList) this.LJIIJJI).iterator();
            while (it3.hasNext()) {
                ((C0U86) it3.next()).LIZ(liveEffect2, str, true);
            }
        } else if (liveEffect == null) {
            return;
        }
        LJJIL(false);
    }

    public final void LJJIJIL(Effect effect, String str, List<String> list) {
        Float fValueOf;
        LiveEffect liveEffect;
        String str2;
        LiveEffect liveEffect2;
        if (effect == null || !list.contains(effect.getUnzipPath())) {
            return;
        }
        try {
            new p();
            n nVarLJIILIIL = p.LIZJ(effect.getExtra()).LJIILIIL();
            if (nVarLJIILIIL.LJJIJIIJIL("ab_group")) {
                if (LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue() != nVarLJIILIIL.LJJIIZ("ab_group").LJIIJJI()) {
                    return;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveComposerManager", e);
        }
        if (this.LJIILLIIL.containsKey(effect.getUnzipPath())) {
            LiveEffect liveEffectLIZLLL = C0UEO.LIZLLL(effect);
            Map<String, Float> map = this.LJIILLIIL.get(effect.getUnzipPath());
            liveEffectLIZLLL.LJJIJIIJIL().addAll(map.keySet());
            kr(liveEffectLIZLLL, str);
            for (String str3 : map.keySet()) {
                if (((HashMap) this.LJIILL).containsKey(effect.getUnzipPath())) {
                    if (!((Map) ((HashMap) this.LJIILL).get(effect.getUnzipPath())).containsKey(str3)) {
                    }
                }
                String str4 = str3;
                if (effect.getExtra().contains(str4)) {
                    liveEffectLIZLLL.LJJIJIIJIL().add(str4);
                    Object obj = map.get(str3);
                    if (obj instanceof Double) {
                        fValueOf = Float.valueOf(((Double) obj).floatValue());
                    } else {
                        fValueOf = (Float) obj;
                    }
                    float fFloatValue = fValueOf.floatValue();
                    if (this.LIZIZ != null) {
                        Iterator it2 = ((ArrayList) this.LJIIJ).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                LiveEffect liveEffect3 = (LiveEffect) it2.next();
                                if (!C0IKQ.LIZ(liveEffect3.LJJIJIIJIL()) && liveEffect3.LJJIJIIJIL().contains(str4)) {
                                    if (!((HashMap) this.LJIIIZ).containsKey(liveEffect3) || !((Map) ((HashMap) this.LJIIIZ).get(liveEffect3)).containsKey(str4) || !((Float) ((Map) ((HashMap) this.LJIIIZ).get(liveEffect3)).get(str4)).equals(Float.valueOf(fFloatValue))) {
                                        this.LIZIZ.LIZJ.LJIIZILJ(fFloatValue, liveEffect3.getFilePath(), str4);
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("updateTagValue path:");
                                        sbLIZ.append(liveEffect3.getFilePath());
                                        sbLIZ.append(" tag:");
                                        sbLIZ.append(str4);
                                        sbLIZ.append(" value:");
                                        sbLIZ.append(fFloatValue);
                                        C20441214yg.LIZIZ("LiveComposerManager", C2188811AlT.LIZIZ(sbLIZ));
                                        Iterator it3 = ((HashMap) this.LJIIIZ).keySet().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                liveEffect = (LiveEffect) it3.next();
                                                if (liveEffect.getFilePath().equals(liveEffect3.getFilePath()) && liveEffect.LJJIJIIJIL().contains(str4)) {
                                                    Map map2 = (Map) ((HashMap) this.LJIIIZ).get(liveEffect);
                                                    if (map2 != null) {
                                                        map2.put(str4, Float.valueOf(fFloatValue));
                                                    }
                                                }
                                            } else {
                                                liveEffect = null;
                                                ((HashMap) this.LJIIIZ).put(liveEffect3, new HashMap());
                                                Map map3 = (Map) ((HashMap) this.LJIIIZ).get(liveEffect3);
                                                if (map3 != null) {
                                                    map3.put(str4, Float.valueOf(fFloatValue));
                                                }
                                            }
                                        }
                                        Iterator it4 = ((HashMap) this.LJIIIIZZ).keySet().iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                str2 = (String) it4.next();
                                                Map map4 = (Map) ((HashMap) this.LJIIIIZZ).get(str2);
                                                if (liveEffect != null) {
                                                    liveEffect2 = liveEffect;
                                                } else {
                                                    liveEffect2 = liveEffect3;
                                                }
                                                if (map4.containsValue(liveEffect2)) {
                                                    break;
                                                }
                                            } else {
                                                str2 = "";
                                                break;
                                            }
                                        }
                                        LJJIJIIJI(str2, liveEffect3, str4, fFloatValue);
                                        if (!((ArrayList) this.LJIIL).isEmpty()) {
                                            for (C0UG2 c0ug2 : (ArrayList) this.LJIIL) {
                                                if (c0ug2 != null) {
                                                    c0ug2.LIZIZ();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        kr(C0UEO.LIZLLL(effect), str);
    }

    public final void LJJIJIIJI(String str, LiveEffect liveEffect, String str2, float f) {
        if (((HashMap) this.LJIILIIL).containsKey(str) && ((List) ((HashMap) this.LJIILIIL).get(str)).contains(liveEffect.getFilePath())) {
            if (!((HashMap) this.LJIILL).containsKey(liveEffect.getFilePath())) {
                ((HashMap) this.LJIILL).put(liveEffect.getFilePath(), new HashMap());
            }
            ((Map) ((HashMap) this.LJIILL).get(liveEffect.getFilePath())).put(str2, Float.valueOf(f));
        }
    }
}
