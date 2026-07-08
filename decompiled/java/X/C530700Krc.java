package X;

import Y.ARunnableS17S0400000_8;
import Y.AfS177S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.videochoose.IVideoChoose;
import com.ss.android.ugc.aweme.widgetcompat.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: X.0Krc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530700Krc extends AbstractC528890Koh implements IVideoChoose {
    public static final /* synthetic */ int LLLF = 0;
    public final C11PQ<C530720Kre> LLJJIJIL = C11PQ.LJLLLLLL(new C530720Kre());
    public final C11NJ LLJJJ = new C11NJ();
    public TextView LLJJJIL;
    public C1235900iGa LLJJJJ;
    public RecyclerView LLJJJJJIL;
    public C530420KrA LLJJJJLIIL;
    public C530750Krh LLJJL;
    public ViewOnClickListenerC20639415pY LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public C19414410xS LLJLIL;
    public C530480KrG LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public volatile boolean LLJZ;
    public final C530710Krd LLJZIJLIL;
    public IVideoChoose.Callback LLL;

    @Override // com.ss.android.ugc.aweme.services.videochoose.IVideoChoose
    public final void loadData() {
        if (this.LLJZ) {
            return;
        }
        LLLLIL();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0Krd] */
    public C530700Krc() {
        C566050MHz.LIZIZ();
        this.LLJZ = false;
        this.LLJZIJLIL = new InterfaceC530740Krg() { // from class: X.0Krd
            @Override // X.InterfaceC530740Krg
            public final void LIZ(List list) {
                int size;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onMediaLoaded,success:");
                sbLIZ.append(true);
                sbLIZ.append(",size:");
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                sbLIZ.append(size);
                C530700Krc.LLLLIILL(C2188811AlT.LIZIZ(sbLIZ));
                C530700Krc c530700Krc = this.LIZ;
                if (!c530700Krc.LLJJIJIIJIL) {
                    return;
                }
                C11PQ<C530720Kre> c11pq = c530700Krc.LLJJIJIL;
                C530720Kre c530720KreLJLZ = c11pq.LJLZ();
                c530720KreLJLZ.getClass();
                C530720Kre c530720Kre = new C530720Kre();
                c530720Kre.LIZ = false;
                c530720Kre.LIZIZ = c530720KreLJLZ.LIZIZ;
                c11pq.onNext(c530720Kre);
                this.LIZ.LLLLIL();
            }
        };
    }

    public final void LLLLIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refreshData,dataLoaded:");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(",manager valid:");
        sbLIZ.append(this.LLJJL != null);
        LLLLIILL(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        if (this.LLJJL != null) {
            this.LLJZ = true;
            List<MediaModel> list = this.LLJJL.LIZJ.get(4);
            ArrayList<MediaModel> arrayList2 = list != null ? new ArrayList(list) : new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (MediaModel mediaModel : arrayList2) {
                if (mediaModel.duration > 3000) {
                    arrayList3.add(mediaModel);
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("filterVideosMoreThan3Seconds,originSize:");
            sbLIZ2.append(arrayList2.size());
            sbLIZ2.append("resultSize:");
            sbLIZ2.append(arrayList3.size());
            LLLLIILL(C2188811AlT.LIZIZ(sbLIZ2));
            if (!arrayList3.isEmpty()) {
                C11PQ<C530720Kre> c11pq = this.LLJJIJIL;
                C530720Kre c530720KreLJLZ = c11pq.LJLZ();
                c530720KreLJLZ.getClass();
                C530720Kre c530720Kre = new C530720Kre();
                c530720Kre.LIZ = c530720KreLJLZ.LIZ;
                c530720Kre.LIZIZ = true;
                c11pq.onNext(c530720Kre);
            }
            C530750Krh c530750Krh = this.LLJJL;
            c530750Krh.getClass();
            ArrayList arrayList4 = new ArrayList(c530750Krh.LIZLLL);
            arrayList.addAll(arrayList3);
            C2474509mp.LIZ.execute(new ARunnableS17S0400000_8(this, arrayList, new ArrayList(), arrayList4, 1));
        }
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        C530750Krh c530750Krh = this.LLJJL;
        if (c530750Krh != null) {
            ((HashSet) c530750Krh.LJ).remove(this.LLJZIJLIL);
        }
        this.LLJJJ.LJ();
    }

    public static final void LLLLIILL(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusVideoChooseFragment:");
        sbLIZ.append(str);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        ArrayList arrayList;
        Activity activity;
        super.onActivityCreated(bundle);
        if (this.LLJJL == null && (activity = this.mActivity) != null) {
            C530750Krh.LIZIZ(C786410Ut5.L3(activity));
            C530750Krh c530750Krh = C530750Krh.LJFF;
            this.LLJJL = c530750Krh;
            ((HashSet) c530750Krh.LJ).add(this.LLJZIJLIL);
        }
        List<MediaModel> list = this.LLJJL.LIZJ.get(4);
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = new ArrayList();
        }
        boolean zLIZ = C0IKQ.LIZ(arrayList);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initData,hasNoMedia:");
        sbLIZ.append(zLIZ);
        sbLIZ.append(",dataLoaded:");
        sbLIZ.append(this.LLJZ);
        LLLLIILL(C2188811AlT.LIZIZ(sbLIZ));
        if (zLIZ) {
            C11PQ<C530720Kre> c11pq = this.LLJJIJIL;
            C530720Kre c530720KreLJLZ = c11pq.LJLZ();
            c530720KreLJLZ.getClass();
            C530720Kre c530720Kre = new C530720Kre();
            c530720Kre.LIZ = true;
            c530720Kre.LIZIZ = c530720KreLJLZ.LIZIZ;
            c11pq.onNext(c530720Kre);
            this.LLJJL.LIZLLL(4, -1, -1, false, null);
        }
        if (this.LLJJJJLIIL == null) {
            C530420KrA c530420KrA = new C530420KrA(this.mActivity, this, this.LLJLL);
            this.LLJJJJLIIL = c530420KrA;
            C19414410xS c19414410xS = new C19414410xS(c530420KrA);
            this.LLJLIL = c19414410xS;
            Activity activity2 = this.mActivity;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C12ES.LIZJ(96, activity2));
            View view = new View(activity2);
            C786410Ut5.W5(view, layoutParams);
            view.setBackgroundColor(0);
            C1119470fEn<View> c1119470fEn = c19414410xS.LLILLJJLI;
            c1119470fEn.LJFF(c1119470fEn.LJII() + 200000, view);
            c19414410xS.notifyItemRangeChanged(c19414410xS.getItemCount() - c19414410xS.LLILLJJLI.LJII(), c19414410xS.LLILLJJLI.LJII());
        }
        C530420KrA c530420KrA2 = this.LLJJJJLIIL;
        c530420KrA2.LLJIJIL = this.LLJLLL;
        c530420KrA2.LLJI = this.LLJLLIL;
        this.LLJJLIIIJLLLLLLLZ.setOnModeChangeListener(new InterfaceC20639515pZ() { // from class: X.0KrE
            @Override // X.InterfaceC20639515pZ
            public final void LIZ(boolean z) {
                C530700Krc c530700Krc = this.LIZ;
                C530420KrA c530420KrA3 = c530700Krc.LLJJJJLIIL;
                if (c530420KrA3 != null) {
                    c530420KrA3.LLILZLL = z;
                    c530420KrA3.LLLFZ(((ArrayList) c530420KrA3.LLILLL).size());
                    C19414410xS c19414410xS2 = c530420KrA3.LLJILJILJ.LLJLIL;
                    if (c19414410xS2 != null) {
                        c19414410xS2.notifyDataSetChanged();
                    }
                    List<MediaModel> list2 = c530420KrA3.LLJILJIL;
                    if (list2 != null && !C0IKQ.LIZ(list2)) {
                        ((ArrayList) c530420KrA3.LLJILJIL).clear();
                    }
                }
                c530700Krc.LLJLIL.notifyDataSetChanged();
            }
        });
        loadData();
        C786410Ut5.H0(this.LLJJLIIIJLLLLLLLZ, 8);
        this.LLJJJJJIL.setPadding(0, 0, 0, 0);
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLJLL = this.mArguments.getInt("ARG_NUM_COLUMNS", 4);
        this.LLJLLIL = this.mArguments.getInt("ARG_TEXT_COLOR", C446980Hfs.LIZ(C545820Lau.LIZIZ(this), R.color.bd));
        this.LLJLLL = this.mArguments.getInt("ARG_SHADOW_COLOR", C446980Hfs.LIZ(C545820Lau.LIZIZ(this), R.color.b7));
        this.LLJL = this.mArguments.getBoolean("ARG_MULTI_VIDEO_ENABLE", true);
        this.LLJLILLLLZIIL = new C530480KrG(this);
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Sd(R.layout.i8o, layoutInflater, null);
        C786410Ut5.LJLLLL((ViewStub) viewGroup2.findViewById(R.id.view_stub_multi_select_view));
        RecyclerView recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.j5o);
        this.LLJJJJJIL = recyclerView;
        recyclerView.setLayoutManager(new WrapGridLayoutManager((Context) null, this.LLJLL));
        int i = 0;
        this.LLJJJJJIL.addItemDecoration(new C0OZZ(this.LLJLL, (int) C12ES.LIZJ(1.0f, C545820Lau.LIZIZ(this)), false));
        this.LLJJJIL = (TextView) viewGroup2.findViewById(R.id.zpi);
        this.LLJJJJ = (C1235900iGa) viewGroup2.findViewById(R.id.video_loading);
        ViewOnClickListenerC20639415pY viewOnClickListenerC20639415pY = (ViewOnClickListenerC20639415pY) viewGroup2.findViewById(R.id.opn);
        this.LLJJLIIIJLLLLLLLZ = viewOnClickListenerC20639415pY;
        if (!this.LLJL) {
            i = 8;
        }
        C786410Ut5.H0(viewOnClickListenerC20639415pY, i);
        this.LLJJJ.LIZ(this.LLJJIJIL.LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS177S0100000_8(this, 3)));
        return viewGroup2;
    }
}
