package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoEffect;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351370Dq3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(List list) {
        String strLIZIZ = "";
        for (String str : (ArrayList) list) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            sbLIZ.append(',');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return a0.LJJJLL(",", strLIZIZ);
    }

    public static void LIZ(NLEModel nLEModel, Map map) {
        Object obj;
        String strLIZ;
        String extra;
        VecNLETrackSPtr tracks;
        String str = "1";
        if (C357540E0a.LJIJI(nLEModel)) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_editorpro_magic_video", obj);
        map.put("editorpro_magic_cnt", String.valueOf(C357540E0a.LJII(nLEModel)));
        ArrayList arrayList = new ArrayList();
        if (nLEModel != null && (tracks = nLEModel.getTracks()) != null) {
            ArrayList<NLETrackSlot> arrayList2 = new ArrayList();
            Iterator<NLETrack> it2 = tracks.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getSortedSlots(), arrayList2);
            }
            for (NLETrackSlot nLETrackSlot : arrayList2) {
                if (C357540E0a.LJIILL(nLETrackSlot)) {
                    C354260Dui.LIZ.getClass();
                    for (String str2 : C354260Dui.LJII(nLETrackSlot)) {
                        if (!a0.LJJJIL(str2)) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            strLIZ = C351360Dq2.LIZ(arrayList);
        } else {
            strLIZ = "";
        }
        map.put("editorpro_magic_id_list", strLIZ);
        map.put("editorpro_magic_res_id_list", LIZJ(LIZIZ(nLEModel, AFwS234S0000000_5.get$arr$(504))));
        C351510DqH.LIZ.getClass();
        VecNLETrackSPtr tracks2 = nLEModel.getTracks();
        ArrayList arrayList3 = new ArrayList();
        Iterator<NLETrack> it3 = tracks2.iterator();
        while (it3.hasNext()) {
            C19719612Di.LJJI(it3.next().getSlots(), arrayList3);
        }
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((NLETrackSlot) it4.next()).getRenderProxy());
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJLIJ((NLETrackSlot) obj2)) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            NLESegment mainSegment = ((NLETrackSlot) it5.next()).getMainSegment();
            if (mainSegment != null && (extra = mainSegment.getExtra("original_effect_name")) != null) {
                arrayList6.add(extra);
            }
        }
        C351510DqH.LIZ.getClass();
        VecNLETrackSPtr tracks3 = nLEModel.getTracks();
        ArrayList arrayList7 = new ArrayList();
        Iterator<NLETrack> it6 = tracks3.iterator();
        while (it6.hasNext()) {
            C19719612Di.LJJI(it6.next().getSlots(), arrayList7);
        }
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            C19719612Di.LJJI(((NLETrackSlot) it7.next()).getVideoEffects(), arrayList8);
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : arrayList8) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJIL((NLEVideoEffect) obj3)) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList9, 10));
        Iterator it8 = arrayList9.iterator();
        while (it8.hasNext()) {
            arrayList10.add(((NLENode) it8.next()).getExtra("original_effect_name"));
        }
        C351510DqH.LIZ.getClass();
        VecNLETrackSPtr tracks4 = nLEModel.getTracks();
        ArrayList arrayList11 = new ArrayList();
        Iterator<NLETrack> it9 = tracks4.iterator();
        while (it9.hasNext()) {
            C19719612Di.LJJI(it9.next().getSlots(), arrayList11);
        }
        ArrayList arrayList12 = new ArrayList();
        Iterator it10 = arrayList11.iterator();
        while (it10.hasNext()) {
            C19719612Di.LJJI(((NLETrackSlot) it10.next()).getFilters(), arrayList12);
        }
        ArrayList arrayList13 = new ArrayList();
        for (Object obj4 : arrayList12) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIJL((NLEFilter) obj4)) {
                arrayList13.add(obj4);
            }
        }
        ArrayList arrayList14 = new ArrayList(C15438062q.LJIJJ(arrayList13, 10));
        Iterator it11 = arrayList13.iterator();
        while (it11.hasNext()) {
            arrayList14.add(((NLENode) it11.next()).getExtra("original_effect_name"));
        }
        map.put("editorpro_magic_name_list", LIZJ(C13LP.LJLIL(arrayList14, C13LP.LJLIL(arrayList10, arrayList6))));
        map.put("editorpro_magic_tab_panel_list", LIZJ(LIZIZ(nLEModel, AFwS234S0000000_5.get$arr$(505))));
        if (!C351220Dpo.LIZLLL(nLEModel)) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("is_editorpro_pip_magic_video", str);
    }

    public static List LIZIZ(NLEModel nLEModel, Function1 function1) {
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrack> it2 = tracks.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getSlots(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object objInvoke = function1.invoke(it3.next());
            if (objInvoke != null) {
                arrayList2.add(objInvoke);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (C123100dR.LIZ((String) obj)) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }
}
