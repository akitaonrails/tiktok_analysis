package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.eda.datasync.mob.EDADataSyncMobHelper$mobEPSaveToEditCost$1", f = "EDADataSyncMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C352260DrU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ NLEModel LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352260DrU(NLEModel nLEModel, long j, InterfaceC1364105Vn<? super C352260DrU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = nLEModel;
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352260DrU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        int size6;
        int size7;
        C1C7U.LIZ("EDADataSyncMobHelper@e98.mobEPSaveToEditCost$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2259208tC c2259208tC = C2259208tC.LIZ;
        NLEModel nLEModel = this.LL;
        c2259208tC.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        VecNLETrackSPtr tracks = nLEModel.getTracks();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (NLETrack nLETrack : tracks) {
            NLETrackType nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(nLETrack);
            Object arrayList = linkedHashMap2.get(nLETrackTypeLJIIIIZZ);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(nLETrackTypeLJIIIIZZ, arrayList);
            }
            ((List) arrayList).add(nLETrack);
        }
        List list = (List) linkedHashMap2.get(NLETrackType.VIDEO);
        int size8 = 0;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
            }
            size = arrayList2.size();
        } else {
            size = 0;
        }
        List list2 = (List) linkedHashMap2.get(NLETrackType.AUDIO);
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it3.next()).getSlots(), arrayList3);
            }
            size2 = arrayList3.size();
        } else {
            size2 = 0;
        }
        List list3 = (List) linkedHashMap2.get(NLETrackType.AUDIO);
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list3) {
                if (C351220Dpo.LLLFF((NLETrack) obj2)) {
                    arrayList4.add(obj2);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it4.next()).getSlots(), arrayList5);
            }
            size3 = arrayList5.size();
        } else {
            size3 = 0;
        }
        List list4 = (List) linkedHashMap2.get(NLETrackType.STICKER);
        if (list4 != null) {
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list4) {
                if (C351220Dpo.LLJLIL((NLETrack) obj3)) {
                    arrayList6.add(obj3);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it5.next()).getSlots(), arrayList7);
            }
            size4 = arrayList7.size();
        } else {
            size4 = 0;
        }
        List list5 = (List) linkedHashMap2.get(NLETrackType.STICKER);
        if (list5 != null) {
            ArrayList arrayList8 = new ArrayList();
            for (Object obj4 : list5) {
                if (C351220Dpo.LLLJL((NLETrack) obj4)) {
                    arrayList8.add(obj4);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            Iterator it6 = arrayList8.iterator();
            while (it6.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it6.next()).getSlots(), arrayList9);
            }
            size5 = arrayList9.size();
        } else {
            size5 = 0;
        }
        List list6 = (List) linkedHashMap2.get(NLETrackType.FILTER);
        if (list6 != null) {
            ArrayList arrayList10 = new ArrayList();
            for (Object obj5 : list6) {
                if (C351220Dpo.LLJI((NLETrack) obj5)) {
                    arrayList10.add(obj5);
                }
            }
            ArrayList arrayList11 = new ArrayList();
            Iterator it7 = arrayList10.iterator();
            while (it7.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it7.next()).getSlots(), arrayList11);
            }
            size6 = arrayList11.size();
        } else {
            size6 = 0;
        }
        List list7 = (List) linkedHashMap2.get(NLETrackType.EFFECT);
        if (list7 != null) {
            ArrayList arrayList12 = new ArrayList();
            for (Object obj6 : list7) {
                if (C351220Dpo.LLJJIII((NLETrack) obj6)) {
                    arrayList12.add(obj6);
                }
            }
            ArrayList arrayList13 = new ArrayList();
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it8.next()).getSlots(), arrayList13);
            }
            size7 = arrayList13.size();
        } else {
            size7 = 0;
        }
        List list8 = (List) linkedHashMap2.get(NLETrackType.AUDIO);
        if (list8 != null) {
            ArrayList arrayList14 = new ArrayList();
            for (Object obj7 : list8) {
                if (C351220Dpo.LLILL((NLETrack) obj7)) {
                    arrayList14.add(obj7);
                }
            }
            ArrayList arrayList15 = new ArrayList();
            Iterator it9 = arrayList14.iterator();
            while (it9.hasNext()) {
                C19719612Di.LJJI(((NLETrack) it9.next()).getSlots(), arrayList15);
            }
            size8 = arrayList15.size();
        }
        linkedHashMap.put("video_num", String.valueOf(size));
        linkedHashMap.put("audio_num", String.valueOf(size2));
        linkedHashMap.put("music_num", String.valueOf(size3));
        linkedHashMap.put("sticker_num", String.valueOf(size4));
        linkedHashMap.put("text_num", String.valueOf(size5));
        linkedHashMap.put("filter_num", String.valueOf(size6));
        linkedHashMap.put("effect_num", String.valueOf(size7));
        linkedHashMap.put("audio_record_num", String.valueOf(size8));
        C0LAB c0lab = new C0LAB();
        c0lab.LJI(linkedHashMap);
        c0lab.LIZIZ(this.LLILLJJLI, "cost");
        C20684815ws.LJIILLIIL("tool_performance_editor_pro_back_save", c0lab.LIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EDADataSyncMobHelper@e98.mobEPSaveToEditCost$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
