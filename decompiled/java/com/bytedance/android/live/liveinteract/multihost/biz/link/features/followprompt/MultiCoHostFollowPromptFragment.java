package com.bytedance.android.live.liveinteract.multihost.biz.link.features.followprompt;

import X.C0N67;
import X.C13E8;
import X.C13LP;
import X.C15438062q;
import X.C20736316Cj;
import X.C474500IjA;
import X.C723850SaN;
import X.C786410Ut5;
import X.C960840b6w;
import X.C960850b6x;
import X.C960870b6z;
import X.C963270bAr;
import X.C963810bBj;
import X.EnumC963280bAs;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: loaded from: classes16.dex */
public final class MultiCoHostFollowPromptFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElISAgPGsuIDV9JCwiHELIOSImE1LSQ4PD02O2sqJiM/JzI8OyA+ODFiBDo/PCwPJgc8OzEKJiM/JzIcOyA+ODEKOy40JSAiPQ==";
    public final C960870b6z LLJLLL;
    public final C963270bAr LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void nS() {
        this.LLJZ.LIZIZ = EnumC963280bAs.OUTSIDE;
        super.nS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C963270bAr c963270bAr = this.LLJZ;
        List<C963810bBj> list = c963270bAr.LIZLLL;
        ArrayList arrayList = new ArrayList();
        for (C963810bBj c963810bBj : list) {
            if (c963270bAr.LIZJ.containsKey(Long.valueOf(c963810bBj.LIZ))) {
                arrayList.add(c963810bBj);
            }
        }
        List listLLIIII = C13LP.LLIIII(c963270bAr.LIZJ.values());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C963810bBj) obj).LIZ()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listLLIIII) {
            if (((C963810bBj) obj2).LIZ()) {
                arrayList3.add(obj2);
            }
        }
        C474500IjA c474500IjALIZ = c963270bAr.LIZ("follow_prompt_after_cohost_close");
        c474500IjALIZ.LJJII(c963270bAr.LIZIZ.getMethodName(), "close_method");
        c474500IjALIZ.LJJII(Integer.valueOf(c963270bAr.LIZLLL.size()), "all_anchor_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(listLLIIII.size()), "see_anchor_cnt");
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((C963810bBj) obj3).LIZIZ == 0) {
                arrayList4.add(obj3);
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList4.size()), "initial_could_follow_cnt");
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (((C963810bBj) obj4).LIZIZ == 3) {
                arrayList5.add(obj4);
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList5.size()), "initial_could_followback_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList2.size()), "initial_already_follow_cnt");
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : listLLIIII) {
            if (((C963810bBj) obj5).LIZIZ == 0) {
                arrayList6.add(obj5);
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList6.size()), "final_could_follow_cnt");
        ArrayList arrayList7 = new ArrayList();
        for (Object obj6 : listLLIIII) {
            if (((C963810bBj) obj6).LIZIZ == 3) {
                arrayList7.add(obj6);
            }
        }
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList7.size()), "final_could_followback_cnt");
        c474500IjALIZ.LJJII(Integer.valueOf(arrayList3.size()), "final_already_follow_cnt");
        ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList8.add(Long.valueOf(((C963810bBj) it2.next()).LIZ));
        }
        c474500IjALIZ.LJJII(arrayList8, "to_anchor_id_list");
        ArrayList arrayList9 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList9.add(Long.valueOf(((C963810bBj) it3.next()).LIZ));
        }
        c474500IjALIZ.LJJII(arrayList9, "initial_follow_anchor_id_list");
        ArrayList arrayList10 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            arrayList10.add(Long.valueOf(((C963810bBj) it4.next()).LIZ));
        }
        c474500IjALIZ.LJJII(arrayList10, "final_follow_anchor_id_list");
        c474500IjALIZ.LIZ();
        C13E8<C960840b6w> c13e8 = C960850b6x.LIZ;
        C960850b6x.LIZ(C0N67.COHOST_FOLLOW_PROMPT);
    }

    public MultiCoHostFollowPromptFragment(C960870b6z c960870b6z) {
        this.LLJLLL = c960870b6z;
        this.LLJZ = new C963270bAr(c960870b6z.LIZ.LIZIZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 58), 3);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gjr, viewGroup, false);
    }
}
