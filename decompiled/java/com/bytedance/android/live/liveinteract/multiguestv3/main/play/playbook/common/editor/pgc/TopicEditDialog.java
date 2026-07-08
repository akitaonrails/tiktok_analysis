package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.pgc;

import X.AbstractC960460b6K;
import X.C092O;
import X.C1119170fEJ;
import X.C20373014ng;
import X.C20373114nh;
import X.C20373314nj;
import X.C20373514nl;
import X.C20373914np;
import X.C20374514nv;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C951190arN;
import X.InterfaceC20373214ni;
import X.InterfaceC20374014nq;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.TopicContent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS432S0200000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class TopicEditDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiOSMyMScjJiR9KyohJCA9ZiAoIDs8Oms8Lix9HCo8ICwWLCw4DSYyJCor";
    public final List<TopicContent> LLJZIJLIL;
    public final Function1<List<TopicContent>, Unit> LLL;
    public final C951190arN LLLF;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.hgs;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 0;
        ArrayList arrayList = new ArrayList();
        final int i = 2;
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131854971), R.style.ajx, new C092O() { // from class: X.14nb
            @Override // X.C092O
            public final void accept(Object obj) {
                C20374514nv.LIZIZ(this.LIZ.getView());
                int i2 = i;
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.LIZ.close(1);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : this.LIZ.LLLF.LL) {
                    if (obj2 instanceof C20373014ng) {
                        arrayList2.add(((C20373014ng) obj2).LIZ);
                    }
                }
                this.LIZ.LLL.invoke(arrayList2);
                this.LIZ.close(1);
            }
        }));
        final int i2 = 1;
        C510160Jza c510160Jza = new C510160Jza(C497740JfY.LJIJI(2131853960), R.style.ajw, new C092O() { // from class: X.14nb
            @Override // X.C092O
            public final void accept(Object obj) {
                C20374514nv.LIZIZ(this.LIZ.getView());
                int i22 = i2;
                if (i22 != 1) {
                    if (i22 == 2) {
                        this.LIZ.close(1);
                        return;
                    }
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : this.LIZ.LLLF.LL) {
                    if (obj2 instanceof C20373014ng) {
                        arrayList2.add(((C20373014ng) obj2).LIZ);
                    }
                }
                this.LIZ.LLL.invoke(arrayList2);
                this.LIZ.close(1);
            }
        });
        C20374514nv.LJIIJJI(c510160Jza, false);
        arrayList.add(c510160Jza);
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ("Edit Topic");
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsLIZ = C20373514nl.LIZ(false);
        sheetOptionsLIZ.canceledOnTouchOutside = false;
        return sheetOptionsLIZ;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.14nf] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.14nc] */
    public TopicEditDialog(List list, AwS397S0200000_31 awS397S0200000_31) {
        this.LLJZIJLIL = list;
        this.LLL = awS397S0200000_31;
        final ?? r4 = new InterfaceC20374014nq() { // from class: X.14nc
            @Override // X.InterfaceC20374014nq
            public final void LIZIZ() {
                ArrayList arrayList = new ArrayList(this.LIZ.LLLF.LL);
                ListProtector.add(arrayList, this.LIZ.LLLF.LL.size() - 1, new C20373014ng(new TopicContent()));
                this.LIZ.LLLF.LLLII(arrayList);
                this.LIZ.LLLF.notifyDataSetChanged();
            }
        };
        final ?? r3 = new InterfaceC20373214ni() { // from class: X.14nf
            @Override // X.InterfaceC20373214ni
            public final void LIZ(C20373014ng c20373014ng) {
                C500260Jjc.LJJLIIIJILLIZJL(new AwS432S0200000_31(this.LIZ, c20373014ng, 124));
            }
        };
        C951190arN c951190arN = new C951190arN();
        this.LLLF = c951190arN;
        c951190arN.LLLI(C20373114nh.class, new AbstractC960460b6K<C20373114nh, C20373914np>(r4) { // from class: X.14nd
            public final InterfaceC20374014nq LIZIZ;

            {
                this.LIZIZ = r4;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20373914np(C786410Ut5.Td(layoutInflater, R.layout.hgq, viewGroup, false), this.LIZIZ);
            }
        });
        c951190arN.LLLI(C20373014ng.class, new AbstractC960460b6K<C20373014ng, C20373314nj>(r3) { // from class: X.14ne
            public final InterfaceC20373214ni LIZIZ;

            {
                this.LIZIZ = r3;
            }

            @Override // X.C0J8P
            /* JADX INFO: renamed from: LJ */
            public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                return new C20373314nj(C786410Ut5.Td(layoutInflater, R.layout.hgr, viewGroup, false), this.LIZIZ);
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.yem);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        recyclerView.setAdapter(this.LLLF);
        List<TopicContent> list = this.LLJZIJLIL;
        C951190arN c951190arN = this.LLLF;
        ArrayList arrayList = new ArrayList();
        Iterator<TopicContent> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C20373014ng(it2.next()));
        }
        arrayList.add(new Object() { // from class: X.14nh
        });
        c951190arN.LLLII(arrayList);
        this.LLLF.notifyDataSetChanged();
    }
}
