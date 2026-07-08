package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0EAU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAU {
    public final Activity LIZ;
    public final InterfaceC497601wk LIZIZ;
    public final C365380EUe LIZJ;
    public final C360180EAe LIZLLL;
    public final Function0<C0EBG> LJ;
    public final InterfaceC361710EGb LJFF;
    public final Function0<C0E48> LJI;
    public final C0EAO LJII;
    public final ArrayList<ResourceItem> LJIIIIZZ = new ArrayList<>();

    public final void LIZ() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        for (NLETrackSlot nLETrackSlot : this.LJII.LLLLLLIL()) {
            for (C351410Dq7 c351410Dq7 : C351220Dpo.LJIIJ(nLETrackSlot)) {
                C0E48 c0e48Invoke = this.LJI.invoke();
                if (c0e48Invoke != null && (interfaceC351350Dq1LLFII = c0e48Invoke.LLFII()) != null) {
                    interfaceC351350Dq1LLFII.LJJIZ(nLETrackSlot, c351410Dq7.LIZ.LIZIZ, 0, false, EnumC356070Dxd.NONE);
                }
            }
        }
    }

    public final void LIZIZ(final Function0<Unit> function0) {
        final HashMap<String, Integer> map;
        Integer num;
        String str;
        Map mapLJ;
        C0E55 player;
        C0EAE c0eae = C0EAE.LIZ;
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LJII.LJJJLIIL();
        c0eae.getClass();
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mobClickAutoRetouchOn clickFrom = ");
        sbLIZ.append(C0EAE.LIZJ);
        C201955140j.LIZLLL(c563650M8t, "RetouchMobEvent", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLIZJ = C0EAE.LIZJ(videoPublishEditModelLJJJLIIL, C0EAE.LIZIZ);
        c0labLIZJ.LJ("click_from", C0EAE.LIZJ);
        C20684815ws.LJIILLIIL("click_auto_retouch_on", c0labLIZJ.LIZ);
        if (((NLETrackSlot) C13LP.LJJJLL(this.LJII.LLLLLLIL())) != null && (!((ArrayList) C351220Dpo.LJIIIZ(r0)).isEmpty())) {
            this.LJII.LIZ(AFwS234S0000000_5.get$arr$(541));
            function0.invoke();
            return;
        }
        C0E48 c0e48Invoke = this.LJI.invoke();
        if (c0e48Invoke != null && (player = c0e48Invoke.getPlayer()) != null) {
            player.pause(false);
        }
        String str2 = this.LIZLLL.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C08F1.LIZIZ(str2));
        sbLIZ2.append("_config");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        HashMap<String, Object> map2 = C09GD.LIZ;
        if (map2.containsKey(strLIZIZ)) {
            Object obj = map2.get(strLIZIZ);
            if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            map = new HashMap<>((Map<? extends String, ? extends Integer>) mapLJ);
        } else {
            map = new HashMap<>();
            if (!a0.LJJJIL(str2)) {
                String strOptString = new JSONObject(str2).optString("config");
                if (strOptString != null) {
                    JSONArray jSONArray = new JSONArray(strOptString);
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                        if (jSONObjectOptJSONObject != null) {
                            map.put(jSONObjectOptJSONObject.optString("tag"), Integer.valueOf(jSONObjectOptJSONObject.optInt("value")));
                        }
                    }
                }
                C09GD.LIZ.put(strLIZIZ, C2097608Jq.LJIIZILJ(map));
            }
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList<String> arrayList = new ArrayList();
        for (ResourceItem resourceItem : this.LJIIIIZZ) {
            String str3 = resourceItem.extra;
            String str4 = "";
            if (str3 == null) {
                str3 = "";
            }
            C0EA9 c0ea9 = (C0EA9) C13LP.LJJJLL(C09GD.LIZJ(str3));
            if (c0ea9 != null && (str = c0ea9.LIZ) != null) {
                str4 = str;
            }
            if (map.containsKey(str4) && (num = map.get(str4)) != null) {
                num.intValue();
                arrayList.add(resourceItem.getResourceId());
            }
        }
        final ArrayList<String> arrayList2 = new ArrayList<>();
        final ArrayList arrayList3 = new ArrayList();
        for (String str5 : arrayList) {
            Effect effectLJ = C365460EUm.LJ(str5);
            if (effectLJ != null && this.LIZJ.LIZ(effectLJ.getEffect_id())) {
                arrayList3.add(effectLJ);
            } else {
                arrayList2.add(str5);
            }
        }
        if (arrayList2.isEmpty()) {
            C0EAE.LJIIIIZZ(C0EAE.LIZ, 0, Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)), arrayList);
            this.LJII.LIZ(AFwS234S0000000_5.get$arr$(542));
            LIZJ(map, arrayList3);
            function0.invoke();
            return;
        }
        C23250099c.LIZLLL(this.LIZIZ, null, null, new C0EAV(this, null), 3);
        this.LIZJ.LJIIJ(arrayList2, "editor_pro_retouch", true, new IFetchEffectListListener() { // from class: X.0EAW
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener
            public final void onFail(ExceptionResult exceptionResult) {
                C0EAE.LJIIIIZZ(C0EAE.LIZ, 1, Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis)), arrayList2);
                C0EAU c0eau = this;
                c0eau.LJII.LIZ(new AwS584S0100000_5(c0eau, 1146));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(List<Effect> list) {
                ArrayList arrayList4;
                String resourceId;
                List<Effect> list2 = list;
                C0EAE c0eae2 = C0EAE.LIZ;
                Integer numValueOf = Integer.valueOf((int) (System.currentTimeMillis() - jCurrentTimeMillis));
                if (list2 != null) {
                    arrayList4 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (Effect effect : list2) {
                        if (effect == null || (resourceId = effect.getResourceId()) == null) {
                            resourceId = "";
                        }
                        arrayList4.add(resourceId);
                    }
                } else {
                    arrayList4 = null;
                }
                C0EAE.LJIIIIZZ(c0eae2, 0, numValueOf, arrayList4);
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList3);
                if (list2 != null) {
                    arrayList5.addAll(list2);
                }
                this.LIZJ(map, arrayList5);
                function0.invoke();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3 A[PHI: r1
      0x01a3: PHI (r1v8 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:97:0x01a1, B:95:0x019e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [X.13BV] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.HashMap<java.lang.String, java.lang.Integer> r15, java.util.List<? extends com.ss.android.ugc.effectmanager.effect.model.Effect> r16) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0EAU.LIZJ(java.util.HashMap, java.util.List):void");
    }

    public C0EAU(Activity activity, C0EAX c0eax, C365380EUe c365380EUe, C360180EAe c360180EAe, AwS549S0100000_5 awS549S0100000_5, InterfaceC361710EGb interfaceC361710EGb, AwS549S0100000_5 awS549S0100000_52, C0EAI c0eai) {
        this.LIZ = activity;
        this.LIZIZ = c0eax;
        this.LIZJ = c365380EUe;
        this.LIZLLL = c360180EAe;
        this.LJ = awS549S0100000_5;
        this.LJFF = interfaceC361710EGb;
        this.LJI = awS549S0100000_52;
        this.LJII = c0eai;
    }
}
