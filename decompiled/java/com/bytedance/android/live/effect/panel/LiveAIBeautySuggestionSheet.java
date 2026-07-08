package com.bytedance.android.live.effect.panel;

import X.AbstractC21673619ry;
import X.C03A3;
import X.C03A4;
import X.C0DXR;
import X.C0IJT;
import X.C0U61;
import X.C0U75;
import X.C0U76;
import X.C1119170fEJ;
import X.C1697810uHb;
import X.C20736316Cj;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveAIBeautySuggestionSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLCk1LSY4ZzHELIOS8yJiAgZwM6PiANAA02KTA4MBwmLyIpOjs6JysfISo2PA==";
    public C03A3 LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131851207));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJFF = C1697810uHb.LJIILJJIL(UR());
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.03A3, X.19ry] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        final ArrayList<String> arrayList;
        int itemCount;
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.ark);
        Bundle arguments = getArguments();
        if (arguments == null || (arrayList = arguments.getStringArrayList("suggestions")) == null) {
            arrayList = new ArrayList<>();
        }
        ?? r2 = new AbstractC21673619ry<C03A4>(arrayList) { // from class: X.03A3
            public final List<String> LL;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                return this.LL.size() / 2;
            }

            {
                this.LL = arrayList;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C03A4 c03a4 = (C03A4) viewHolder;
                C16F5 c16f5 = c03a4.LL;
                String str = "";
                if (c16f5 != null) {
                    String str2 = (String) C13LP.LJJJLZIJ(i * 2, this.LL);
                    if (str2 == null) {
                        str2 = "";
                    }
                    c16f5.setText(str2);
                }
                C16F5 c16f52 = c03a4.LLILLJJLI;
                if (c16f52 != null) {
                    String str3 = (String) C13LP.LJJJLZIJ((i * 2) + 1, this.LL);
                    if (str3 != null) {
                        str = str3;
                    }
                    c16f52.setText(str);
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C03A4 c03a4 = new C03A4(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fxq, viewGroup, false));
                try {
                    View view2 = c03a4.itemView;
                    if (view2 != null) {
                        view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c03a4.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c03a4.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C03A4.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c03a4.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c03a4.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C03A4.class.getName();
                return c03a4;
            }
        };
        this.LLJLLL = r2;
        recyclerView.setAdapter(r2);
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.0DST
            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                super.LIZIZ(rect, view2, recyclerView2, c21673919s1);
                rect.bottom = (int) C497740JfY.LIZIZ(12.0f);
            }
        });
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(linearLayoutManager);
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_optimize_tips");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(liveSmallItemBeautyViewModel.LLJIJIL, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(liveSmallItemBeautyViewModel.DQ2()), "task_round");
        C03A3 c03a3 = this.LLJLLL;
        if (c03a3 != null) {
            itemCount = c03a3.getItemCount();
        } else {
            itemCount = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(itemCount), "suggestion_num");
        c474500IjALIZ.LJJII(C0U75.LIZ(liveSmallItemBeautyViewModel.LLJI), "suggestion_content");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxp, viewGroup, false);
    }
}
