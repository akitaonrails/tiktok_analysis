package X;

import Y.ACListenerS61S1200000_27;
import Y.ARunnableS106S0100000_6;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editorpro.toolbanner.MAEDraftApi;
import com.ss.android.ugc.aweme.editorpro.toolbanner.MAEDraftItemData;
import com.ss.android.ugc.aweme.editorpro.toolbanner.MAEDraftResponse;
import com.zhiliaoapp.musically.R;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yGv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851150yGv extends Scene {
    public C1851120yGs LLJIJIL;
    public RecyclerView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public String LLJILLL;
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(97));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(83));

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    public static String LLLIIIIL(String str) {
        String string;
        if (str != null && (string = a0.LJLIIIL(str).toString()) != null && string.length() > 0) {
            if (new Regex("^(\\d{4}_\\d{2}_\\d{2})(_.+)?$").matchEntire(string) != null) {
                return string;
            }
            MatchResult matchResultMatchEntire = new Regex("^(\\d{4})-(\\d{2})-(\\d{2})(_.+)?$").matchEntire(string);
            String str2 = "";
            if (matchResultMatchEntire != null) {
                String str3 = (String) C13LP.LJJJLZIJ(4, matchResultMatchEntire.LIZ());
                if (str3 != null) {
                    str2 = str3;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append((String) ListProtector.get(matchResultMatchEntire.LIZ(), 1));
                sbLIZ.append('_');
                sbLIZ.append((String) ListProtector.get(matchResultMatchEntire.LIZ(), 2));
                sbLIZ.append('_');
                sbLIZ.append((String) ListProtector.get(matchResultMatchEntire.LIZ(), 3));
                sbLIZ.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            MatchResult matchResultMatchEntire2 = new Regex("^(\\d{8})(_.+)?$").matchEntire(string);
            if (matchResultMatchEntire2 != null) {
                String str4 = (String) ListProtector.get(matchResultMatchEntire2.LIZ(), 1);
                String str5 = (String) C13LP.LJJJLZIJ(2, matchResultMatchEntire2.LIZ());
                if (str5 != null) {
                    str2 = str5;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str4.substring(0, 4));
                sbLIZ2.append('_');
                sbLIZ2.append(str4.substring(4, 6));
                sbLIZ2.append('_');
                sbLIZ2.append(str4.substring(6, 8));
                sbLIZ2.append(str2);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        return null;
    }

    public final void LLLII(String str) {
        C0X9S<MAEDraftResponse> c0x9sFetchDraftList;
        if (this.LLJI.getValue() == null) {
            RecyclerView recyclerView = this.LLJILJIL;
            if (recyclerView != null) {
                C786410Ut5.LLIZLLLIL(recyclerView, 8);
            }
            TuxTextView tuxTextView = this.LLJILJILJ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                return;
            }
            return;
        }
        String strLLLIIIIL = LLLIIIIL(str);
        if (strLLLIIIIL == null) {
            strLLLIIIIL = this.LLJILLL;
        }
        this.LLJILLL = strLLLIIIIL;
        MAEDraftApi mAEDraftApi = (MAEDraftApi) this.LLJI.getValue();
        if (mAEDraftApi != null && (c0x9sFetchDraftList = mAEDraftApi.fetchDraftList(str)) != null) {
            c0x9sFetchDraftList.enqueue(new InterfaceC594300NSq<MAEDraftResponse>() { // from class: X.0yGw
                @Override // X.InterfaceC594300NSq
                public final void onFailure(C0X9S<MAEDraftResponse> c0x9s, Throwable th) {
                    C1494690ozz c1494690ozz;
                    RecyclerView recyclerView2 = this.LL.LLJILJIL;
                    if (recyclerView2 != null) {
                        C786410Ut5.LLIZLLLIL(recyclerView2, 8);
                    }
                    TuxTextView tuxTextView2 = this.LL.LLJILJILJ;
                    if (tuxTextView2 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView2, 0);
                    }
                    URL url = null;
                    if ((th instanceof C1494690ozz) && (c1494690ozz = (C1494690ozz) th) != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("fetchDraftList onFailure: statusCode=");
                        sbLIZ.append(c1494690ozz.getStatusCode());
                        sbLIZ.append(", cronetInternalErrorCode=");
                        sbLIZ.append(c1494690ozz.getCronetInternalErrorCode());
                        sbLIZ.append(", url=");
                        C1494600ozq requestInfo = c1494690ozz.getRequestInfo();
                        if (requestInfo != null) {
                            url = requestInfo.LJIIZILJ;
                        }
                        sbLIZ.append(url);
                        C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("fetchDraftList onFailure: requestLog=");
                        sbLIZ2.append(c1494690ozz.getRequestLog());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("fetchDraftList onFailure: ");
                    sbLIZ3.append(th.getMessage());
                    C2188811AlT.LIZIZ(sbLIZ3);
                }

                @Override // X.InterfaceC594300NSq
                public final void onResponse(C0X9S<MAEDraftResponse> c0x9s, C0X52<MAEDraftResponse> c0x52) {
                    List<MAEDraftItemData> list;
                    Integer numValueOf;
                    ArrayList arrayList;
                    boolean z;
                    LinearLayoutManager linearLayoutManager;
                    List<MAEDraftItemData> list2;
                    String str2;
                    List<MAEDraftItemData> list3;
                    MAEDraftResponse mAEDraftResponse = c0x52.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchDraftList onResponse: rawData=");
                    RecyclerView.LayoutManager layoutManager = null;
                    if (mAEDraftResponse != null) {
                        list = mAEDraftResponse.data;
                    } else {
                        list = null;
                    }
                    sbLIZ.append(list);
                    sbLIZ.append(", size=");
                    if (mAEDraftResponse != null && (list3 = mAEDraftResponse.data) != null) {
                        numValueOf = Integer.valueOf(list3.size());
                    } else {
                        numValueOf = null;
                    }
                    sbLIZ.append(numValueOf);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (mAEDraftResponse != null && (list2 = mAEDraftResponse.data) != null) {
                        arrayList = new ArrayList();
                        for (MAEDraftItemData mAEDraftItemData : list2) {
                            String str3 = mAEDraftItemData.templateName;
                            if (str3 != null && (str2 = mAEDraftItemData.zipUrl) != null) {
                                String str4 = mAEDraftItemData.index;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList.add(new C1851140yGu(str3, str2, str4, mAEDraftItemData.videoType));
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        RecyclerView recyclerView2 = this.LL.LLJILJIL;
                        if (recyclerView2 != null) {
                            C786410Ut5.LLIZLLLIL(recyclerView2, 8);
                        }
                        TuxTextView tuxTextView2 = this.LL.LLJILJILJ;
                        if (tuxTextView2 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView2, 0);
                            return;
                        }
                        return;
                    }
                    TuxTextView tuxTextView3 = this.LL.LLJILJILJ;
                    if (tuxTextView3 != null) {
                        C786410Ut5.LLLLZLL(tuxTextView3, 8);
                    }
                    RecyclerView recyclerView3 = this.LL.LLJILJIL;
                    if (recyclerView3 != null) {
                        C786410Ut5.LLIZLLLIL(recyclerView3, 0);
                    }
                    C1851150yGv c1851150yGv = this.LL;
                    C1851120yGs c1851120yGs = c1851150yGv.LLJIJIL;
                    if (c1851120yGs != null) {
                        ((ArrayList) c1851120yGs.LLILLL).clear();
                        ((ArrayList) c1851120yGs.LLILLL).addAll(arrayList);
                        c1851120yGs.notifyDataSetChanged();
                    }
                    String str5 = c1851150yGv.LLJILLL;
                    if (str5 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("mae_draft_render_index_");
                        sbLIZ2.append(str5);
                        int i = ((Keva) c1851150yGv.LLJJ.getValue()).getInt(C2188811AlT.LIZIZ(sbLIZ2), -1);
                        if (i >= 0 && i < arrayList.size()) {
                            RecyclerView recyclerView4 = c1851150yGv.LLJILJIL;
                            if (recyclerView4 != null) {
                                layoutManager = recyclerView4.getLayoutManager();
                            }
                            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                                linearLayoutManager.scrollToPositionWithOffset(i, 0);
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        HandlerHook.viewPost(view, new ARunnableS106S0100000_6(view, 54));
        this.LLJILJIL = (RecyclerView) view.findViewById(R.id.nv5);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.nv2);
        RecyclerView recyclerView = this.LLJILJIL;
        if (recyclerView == null) {
            return;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 1, false));
        C1851120yGs c1851120yGs = new C1851120yGs(AFwS269S0000000_27.get$arr$(56), new AwS641S0100000_27(this, 15));
        this.LLJIJIL = c1851120yGs;
        recyclerView.setAdapter(c1851120yGs);
        C0I7D c0i7d = (C0I7D) view.findViewById(R.id.nv1);
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.nv4);
        String str = new SimpleDateFormat("yyyy_MM_dd", Locale.US).format(new Date());
        this.LLJILLL = str;
        c0i7d.setText(str);
        C786410Ut5.U8(c197039127h, new ACListenerS61S1200000_27(this, c0i7d, str, 0));
        LLLII(str);
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eqq, viewGroup, false);
    }
}
