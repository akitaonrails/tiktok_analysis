package com.bytedance.android.live.liveinteract.competition.takestage.view;

import X.C1117360fBO;
import X.C15438062q;
import X.C786410Ut5;
import X.C972360bPW;
import X.C972380bPY;
import X.C972390bPZ;
import X.C973930bS3;
import X.EnumC972350bPV;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageDurationListSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS250S0000000_15;

/* JADX INFO: loaded from: classes16.dex */
public final class TakeTheStageTimeOptionsFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4Zyw8JTUpPSYnISHELIOSoiZzsyIyA/PS40LWs6ICokZhEtIioHICAfPS40LRElJCocODElJiEgDjctLiI2JjE=";
    public final C1117360fBO LLJLLL = new C1117360fBO();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C972360bPW.LIZ.getClass();
        C973930bS3.LJIIIZ(C972360bPW.LIZJ.getDisplayName());
        C972360bPW.LIZIZ = 0L;
        C972360bPW.LIZJ = EnumC972350bPV.LEAVE;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List<Long> value = LiveCoHostTakeTheStageDurationListSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(value, 10));
        Iterator<Long> it2 = value.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C972380bPY(it2.next().longValue()));
        }
        C1117360fBO c1117360fBO = this.LLJLLL;
        c1117360fBO.LLLI(C972380bPY.class, new C972390bPZ(AFwS250S0000000_15.get$arr$(34)));
        c1117360fBO.LL = arrayList;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.xwf);
        recyclerView.setAdapter(this.LLJLLL);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        C972360bPW.LIZ.getClass();
        C973930bS3.LJIIIZ("show");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gcc, viewGroup, false);
    }
}
