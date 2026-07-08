package X;

import com.bytedance.android.live.effect.navi.NaviAvatarListViewModel;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfo;
import com.bytedance.android.live.effect.navi.model.ProfileNaviFeatureInfoValue;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0UCV, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UCV {
    public final NaviAvatarListViewModel LIZ;
    public final C0UCY LIZIZ;
    public final Map<String, String> LIZJ;
    public C768350UCb LJ;
    public boolean LJFF;
    public C11JF LJI;
    public final Gson LIZLLL = new Gson();
    public final List<C768370UCd> LJII = new ArrayList();

    public final void LIZJ() {
        if (this.LJFF) {
            return;
        }
        C11JF c11jf = this.LJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJI = null;
        this.LJFF = true;
    }

    public final void LIZ(List<ProfileNaviFeatureInfo> list, List<? extends Effect> list2) {
        String str;
        C768350UCb c768350UCb = this.LJ;
        if (c768350UCb != null) {
            Map<C768350UCb, Pair<List<ProfileNaviFeatureInfo>, List<Effect>>> map = C767790U9x.LIZJ;
            if (!map.containsKey(c768350UCb)) {
                map.put(c768350UCb, new Pair<>(list, list2));
            }
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        for (Effect effect : list2) {
            arrayList.add(new Pair(effect.getName(), effect.getUnzipPath()));
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        C20441214yg.LJIIIZ("LiveNaviAvatar", "send the start message(66640 1 0 avatar_load)");
        this.LIZIZ.sendEffectMsg(66640, 1L, 0L, "avatar_load");
        for (ProfileNaviFeatureInfo profileNaviFeatureInfo : list) {
            String str2 = (String) mapLJIILLIIL.get(profileNaviFeatureInfo.stickerId);
            if (str2 != null) {
                this.LIZIZ.sendEffectMsg(66666, 1L, 0L, str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("send message(66666 1 0 ");
                sbLIZ.append(str2);
                sbLIZ.append(')');
                C20441214yg.LIZIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ));
            }
            ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue = profileNaviFeatureInfo.colorPicker;
            String str3 = null;
            if (profileNaviFeatureInfoValue != null) {
                str = profileNaviFeatureInfoValue.key;
            } else {
                str = null;
            }
            LIZIZ(1L, str);
            ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue2 = profileNaviFeatureInfo.flip;
            if (profileNaviFeatureInfoValue2 != null) {
                str3 = profileNaviFeatureInfoValue2.key;
            }
            LIZIZ(1L, str3);
            LIZIZ(1L, profileNaviFeatureInfo.inspirationKey);
            List<ProfileNaviFeatureInfoValue> list3 = profileNaviFeatureInfo.sliders;
            if (list3 != null) {
                for (ProfileNaviFeatureInfoValue profileNaviFeatureInfoValue3 : list3) {
                    LIZIZ(profileNaviFeatureInfoValue3.value, profileNaviFeatureInfoValue3.key);
                }
            }
        }
        for (C768370UCd c768370UCd : this.LJII) {
            this.LIZIZ.sendEffectMsg(c768370UCd.LIZ, c768370UCd.LIZIZ, c768370UCd.LIZJ, c768370UCd.LIZLLL);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("send message(");
            sbLIZ2.append(c768370UCd.LIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(c768370UCd.LIZIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(c768370UCd.LIZJ);
            sbLIZ2.append(' ');
            sbLIZ2.append(c768370UCd.LIZLLL);
            sbLIZ2.append(')');
            C20441214yg.LIZIZ("LiveNaviAvatar", C2188811AlT.LIZIZ(sbLIZ2));
        }
        ((ArrayList) this.LJII).clear();
        C20441214yg.LJIIIZ("LiveNaviAvatar", "send the end message(66640 0 0 avatar_load)");
        this.LIZIZ.sendEffectMsg(66640, 0L, 0L, "avatar_load");
    }

    public final void LIZIZ(Long l, String str) {
        if (str != null && l != null) {
            ((ArrayList) this.LJII).add(new C768370UCd(l.longValue(), str));
        }
    }

    public C0UCV(NaviAvatarListViewModel naviAvatarListViewModel, C0UCY c0ucy, Map<String, String> map) {
        this.LIZ = naviAvatarListViewModel;
        this.LIZIZ = c0ucy;
        this.LIZJ = map;
    }
}
