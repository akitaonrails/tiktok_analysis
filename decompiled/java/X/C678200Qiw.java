package X;

import Y.AsS37S0100000_10;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678200Qiw implements InterfaceC676500QgC {
    public C678130Qip LL;
    public C676680QgU LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(460));
    public int LLILZ = -1;
    public AsS37S0100000_10 LLILZIL;

    @Override // X.InterfaceC676500QgC
    public final void onCreate() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onDestroy() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onPause() {
    }

    @Override // X.InterfaceC676500QgC
    public final void onResume() {
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [X.0Qj9] */
    public final void LIZ() throws JSONException {
        C0HA4 c0ha4;
        RecyclerView.LayoutManager layoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int iLJJJJLI;
        List<InterfaceC1891350zJl> listSubList;
        C1540620qC4 c1540620qC4;
        final C677480Qhm c677480Qhm;
        String string;
        C678240Qj0 c678240Qj0;
        AbstractC677840QiM abstractC677840QiM;
        MixPageViewModel mixPageViewModel;
        List<InterfaceC1891350zJl> listItems;
        List<InterfaceC1891350zJl> listItems2;
        if (((Boolean) C134500fH.LIZ.getValue()).booleanValue()) {
            C678130Qip c678130Qip = this.LL;
            AbstractC677870QiP abstractC677870QiP = null;
            if (c678130Qip != null) {
                c0ha4 = c678130Qip.LJI;
                layoutManager = c0ha4 != null ? c0ha4.getLayoutManager() : null;
                if ((layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null || 1 > (iLJJJJLI = C13LQ.LJJJJLI(staggeredGridLayoutManager.LJIJJ(null))) || iLJJJJLI >= 21) {
                    return;
                }
                int i = iLJJJJLI + 1;
                if (this.LLILZ < 0) {
                    this.LLILZ = i;
                }
                int size = (c0ha4 == null || (listItems2 = c0ha4.getListItems()) == null) ? 0 : listItems2.size();
                if (this.LLILZ > i || i >= size) {
                    return;
                }
                if (c0ha4 == null || (listItems = c0ha4.getListItems()) == null) {
                    listSubList = null;
                } else {
                    int i2 = i + 2;
                    if (i2 <= size) {
                        size = i2;
                    }
                    listSubList = listItems.subList(i, size);
                }
                C678130Qip c678130Qip2 = this.LL;
                if (c678130Qip2 == null || (c1540620qC4 = c678130Qip2.LJIIIIZZ) == null || listSubList == null || (c677480Qhm = c678130Qip2.LJIILJJIL) == null) {
                    return;
                }
                C678140Qiq c678140Qiq = c678130Qip2.LJII;
                if (c678140Qiq == null || (mixPageViewModel = c678140Qiq.LJIIL) == null || (string = mixPageViewModel.toString()) == null) {
                    string = c0ha4.toString();
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC1891350zJl interfaceC1891350zJl : listSubList) {
                    AbstractC677870QiP abstractC677870QiP2 = (!(interfaceC1891350zJl instanceof C677470Qhl) || (abstractC677840QiM = (AbstractC677840QiM) interfaceC1891350zJl) == null) ? abstractC677870QiP : abstractC677840QiM.LL;
                    if ((abstractC677870QiP2 instanceof C678240Qj0) && (c678240Qj0 = (C678240Qj0) abstractC677870QiP2) != null) {
                        ?? r8 = new InterfaceC678480QjO() { // from class: X.0Qj9
                            @Override // X.InterfaceC678480QjO
                            public final void LIZ(C678240Qj0 c678240Qj02) {
                                if (c677480Qhm.LLILLJJLI.containsKey(c678240Qj02.LIZJ)) {
                                    c677480Qhm.LLILLJJLI.remove(c678240Qj02.LIZJ);
                                }
                            }
                        };
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("item_id", c678240Qj0.LIZJ);
                        jSONObject.put("biz_type", c678240Qj0.LIZIZ);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(string);
                        sbLIZ.append('/');
                        sbLIZ.append(c678240Qj0.LIZIZ);
                        sbLIZ.append('/');
                        sbLIZ.append(c678240Qj0.LIZJ);
                        jSONObject.put("XElementSessionID", C2188811AlT.LIZIZ(sbLIZ));
                        linkedHashMap.put("searchCardMeta", jSONObject);
                        C679540Ql6 c679540Ql6 = new C679540Ql6(c678240Qj0.LIZJ, TemplateData.LJIIIIZZ(c678240Qj0.LJIIIIZZ), Boolean.TRUE, linkedHashMap, Integer.valueOf((int) c678240Qj0.LJIIIZ), null, null, null, c678240Qj0.LJII, new AwS219S0300000_10(c677480Qhm, c678240Qj0, (C678330Qj9) r8, 17), 27076);
                        if (c1540620qC4.LJIIJJI(c679540Ql6) < (Intrinsics.LJFF(c678240Qj0.LJI, C2539809xM.LIZ.getValue()) ? 10 : 1) && !c677480Qhm.LLILLJJLI.containsKey(c678240Qj0.LIZJ)) {
                            arrayList.add(c679540Ql6);
                            c677480Qhm.LLILLJJLI.put(c678240Qj0.LIZJ, c679540Ql6);
                        }
                        abstractC677870QiP = null;
                    }
                }
                if (!(!arrayList.isEmpty()) || System.currentTimeMillis() - c677480Qhm.LLILLL <= 500) {
                    return;
                }
                c677480Qhm.LLILLL = System.currentTimeMillis();
                if (((Boolean) C142100gV.LIZ.getValue()).booleanValue()) {
                    c1540620qC4.LJIILLIIL(arrayList, new AwS589S0100000_10(c677480Qhm, 425));
                    return;
                } else {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJ), null, null, new C602050NjP(c1540620qC4, arrayList, null), 3);
                    return;
                }
            }
            c0ha4 = null;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
            }
        }
    }

    public final void LIZIZ() {
        C0HA4 c0ha4;
        C0HA4 c0ha42;
        AsS37S0100000_10 asS37S0100000_10;
        C678130Qip c678130Qip = this.LL;
        if (c678130Qip != null && (c0ha42 = c678130Qip.LJI) != null && (asS37S0100000_10 = this.LLILZIL) != null) {
            c0ha42.removeOnScrollListener(asS37S0100000_10);
        }
        AsS37S0100000_10 asS37S0100000_102 = new AsS37S0100000_10(this, 14);
        this.LLILZIL = asS37S0100000_102;
        C678130Qip c678130Qip2 = this.LL;
        if (c678130Qip2 == null || (c0ha4 = c678130Qip2.LJI) == null) {
            return;
        }
        c0ha4.addOnScrollListener(asS37S0100000_102);
    }
}
