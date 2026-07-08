package X;

import Y.ACallableS415S0100000_8;
import Y.AObjectS351S0100000_8;
import Y.AObjectS383S0100000_8;
import Y.ARunnableS108S0100000_8;
import Y.AfS177S0100000_8;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimplyAlbumModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AwS587S0100000_8;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Kov, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529030Kov extends AbstractC528290Knj implements InterfaceC529070Koz, InterfaceC524610Khn {
    public static final int LLLLIIL;
    public static final int LLLLIILL;
    public RecyclerView LLJJIJIL;
    public ViewOnClickListenerC529440Kpa LLJJJ;
    public ViewOnClickListenerC529430KpZ LLJJJIL;
    public C530750Krh LLJJJJ;
    public ViewGroup LLJJJJJIL;
    public C523340Kfk LLJJJJLIIL;
    public C522150Kdp LLJJL;
    public boolean LLLFF;
    public ChooseMediaViewModel LLLJIL;
    public C1DRG LLLL;
    public final C11NJ LLJJLIIIJLLLLLLLZ = new C11NJ();
    public boolean LLJL = false;
    public boolean LLJLIL = false;
    public int LLJLILLLLZIIL = 0;
    public int LLJLL = 0;
    public int LLJLLIL = 0;
    public int LLJLLL = 0;
    public int LLJZ = 0;
    public int LLJZIJLIL = 0;
    public long LLL = 0;
    public long LLLF = 0;
    public final List<Runnable> LLLFFI = new ArrayList();
    public final Set<Integer> LLLFZ = new HashSet();
    public boolean LLLI = false;
    public boolean LLLII = false;
    public boolean LLLIIII = false;
    public final SafeHandler LLLIIIIL = new SafeHandler(this);
    public final ARunnableS108S0100000_8 LLLIIIL = new ARunnableS108S0100000_8(this, 45);
    public boolean LLLIIL = false;
    public boolean LLLIILIL = false;
    public boolean LLLIL = false;
    public boolean LLLILZ = false;
    public boolean LLLILZJ = false;
    public boolean LLLILZLLLI = false;
    public int LLLIZZ = 3;
    public int LLLJ = 0;
    public C522350Ke9 LLLJL = new C522350Ke9(null, 0, null, null, null, null, 0, null, null, 0, 0, 4095);
    public final C529040Kow LLLLII = new InterfaceC535290Kz1() { // from class: X.0Kow
        @Override // X.InterfaceC535290Kz1
        public final void LIZ(boolean z, int i, List list, AbstractC530360Kr4 abstractC530360Kr4) {
            int size;
            String str;
            boolean z2;
            C1DRG c1drg;
            C527460KmO c527460KmO;
            C11JF c11jfLIZIZ;
            String str2;
            C523930Kgh c523930Kgh;
            C530020KqW c530020KqWLIZ;
            final C529030Kov c529030Kov = this.LL;
            if (c529030Kov.mActivity == null) {
                C530000KqU.LIZIZ("MvChooseAlbumFragment", new AObjectS383S0100000_8(c529030Kov, 4));
                return;
            }
            boolean z3 = false;
            if (list == null) {
                size = 0;
            } else {
                size = list.size();
            }
            C530370Kr5 c530370Kr5 = C530370Kr5.LIZ;
            if (abstractC530360Kr4 != c530370Kr5) {
                if (i == 4) {
                    c529030Kov.LLJLLL++;
                    c529030Kov.LLJZIJLIL += size;
                } else {
                    c529030Kov.LLJLLIL++;
                    c529030Kov.LLJZ += size;
                }
            }
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[*]onMediaPageLoaded: costMs=");
            sbLIZ.append(c529030Kov.LLLLIILL());
            sbLIZ.append(" success=");
            sbLIZ.append(z);
            sbLIZ.append(" type=");
            if (i == 4) {
                str = "VIDEO";
            } else {
                str = "IMAGE";
            }
            sbLIZ.append(str);
            sbLIZ.append(" refresh=");
            sbLIZ.append(abstractC530360Kr4);
            sbLIZ.append(" thisSize=");
            sbLIZ.append(size);
            sbLIZ.append(" page=(video=");
            sbLIZ.append(c529030Kov.LLJLL);
            sbLIZ.append(",image=");
            sbLIZ.append(c529030Kov.LLJLILLLLZIIL);
            sbLIZ.append(") rounds=(video=");
            sbLIZ.append(c529030Kov.LLJLLL);
            sbLIZ.append(",image=");
            sbLIZ.append(c529030Kov.LLJLLIL);
            sbLIZ.append(") total=(video=");
            sbLIZ.append(c529030Kov.LLJZIJLIL);
            sbLIZ.append(",image=");
            sbLIZ.append(c529030Kov.LLJZ);
            sbLIZ.append(") hasMore=(image=");
            sbLIZ.append(c529030Kov.LLJL);
            sbLIZ.append(",video=");
            sbLIZ.append(c529030Kov.LLJLIL);
            sbLIZ.append(")");
            C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
            if (i == 4) {
                if (!c529030Kov.LLJLIL || !z || list == null) {
                    c529030Kov.LLJLIL = false;
                    C201955140j.LIZLLL(C533780Kwa.LIZIZ, "MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreVideo = false and return");
                    if (C0BRY.LIZ() && (list == null || list.isEmpty())) {
                        return;
                    }
                }
                if (C2401009ay.LIZ(list) && abstractC530360Kr4 != c530370Kr5) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("[*]VIDEO ALL LOADED: costMs=");
                    sbLIZ2.append(c529030Kov.LLLLIILL());
                    sbLIZ2.append(" rounds=");
                    sbLIZ2.append(c529030Kov.LLJLLL);
                    sbLIZ2.append(" total=");
                    sbLIZ2.append(c529030Kov.LLJZIJLIL);
                    sbLIZ2.append(" videoPage=");
                    sbLIZ2.append(c529030Kov.LLJLL);
                    C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    c529030Kov.LLJLIL = false;
                    c529030Kov.LLLLJ();
                }
            } else {
                if (!c529030Kov.LLJL || !z || list == null) {
                    c529030Kov.LLJL = false;
                    C201955140j.LIZLLL(C533780Kwa.LIZIZ, "MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreImage = false and return");
                    if ((C0BRY.LIZ() && list == null) || list.isEmpty()) {
                        return;
                    }
                }
                if (C2401009ay.LIZ(list) && abstractC530360Kr4 != c530370Kr5) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[*]IMAGE ALL LOADED: costMs=");
                    sbLIZ3.append(c529030Kov.LLLLIILL());
                    sbLIZ3.append(" rounds=");
                    sbLIZ3.append(c529030Kov.LLJLLIL);
                    sbLIZ3.append(" total=");
                    sbLIZ3.append(c529030Kov.LLJZ);
                    sbLIZ3.append(" imagePage=");
                    sbLIZ3.append(c529030Kov.LLJLILLLLZIIL);
                    C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ3));
                    c529030Kov.LLJL = false;
                    c529030Kov.LLLLJ();
                }
            }
            ArrayList<TikTokMediaModel> arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                MediaModel mediaModel = (MediaModel) it2.next();
                if (mediaModel != null && mediaModel.LJFF() != null && !TextUtils.isEmpty(mediaModel.LJFF())) {
                    C1DRG c1drg2 = c529030Kov.LLLL;
                    if (c1drg2 == null || (c530020KqWLIZ = (C530020KqW) c1drg2.LJIIL(null, C530020KqW.class)) == null) {
                        c530020KqWLIZ = C527250Km3.LIZ();
                    }
                    TikTokMediaModel.Companion.getClass();
                    TikTokMediaModel tikTokMediaModelLIZJ = C527240Km2.LIZJ(c530020KqWLIZ, mediaModel);
                    if (!hashSet.contains(((MediaModel) tikTokMediaModelLIZJ).id) || !C523750KgP.LJ()) {
                        hashSet.add(((MediaModel) tikTokMediaModelLIZJ).id);
                        arrayList.add(tikTokMediaModelLIZJ);
                    }
                }
            }
            if (c529030Kov.LLLILZ) {
                ViewOnClickListenerC529440Kpa viewOnClickListenerC529440Kpa = c529030Kov.LLJJJ;
                viewOnClickListenerC529440Kpa.getClass();
                if (i == 4 || i == 3 || i == 1) {
                    if (abstractC530360Kr4 == C530350Kr3.LIZ) {
                        Iterator<C523930Kgh> it3 = viewOnClickListenerC529440Kpa.LLILLJJLI.iterator();
                        while (it3.hasNext()) {
                            C523930Kgh next = it3.next();
                            ViewOnClickListenerC529440Kpa.LLLIILIL(i, next);
                            if (next.LIZJ() == 0 && !TextUtils.equals(next.LIZ, viewOnClickListenerC529440Kpa.LLJI)) {
                                it3.remove();
                                HashMap<String, C523930Kgh> map = viewOnClickListenerC529440Kpa.LLILLL;
                                if (map != null) {
                                    map.remove(next.LIZ);
                                }
                            }
                        }
                        ViewOnClickListenerC529440Kpa.LLLIILIL(i, viewOnClickListenerC529440Kpa.LLIZLLLIL);
                    }
                    viewOnClickListenerC529440Kpa.LLJIJIL = true;
                    C523930Kgh c523930Kgh2 = (C523930Kgh) ListProtector.get(viewOnClickListenerC529440Kpa.LLILLJJLI, 0);
                    HashSet hashSet2 = new HashSet();
                    if (!C2401009ay.LIZ(arrayList)) {
                        if (i != 1 && i != 3) {
                            if (i == 4) {
                                c523930Kgh2.LIZLLL.addAll(arrayList);
                            }
                        } else {
                            c523930Kgh2.LIZJ.addAll(arrayList);
                        }
                    }
                    viewOnClickListenerC529440Kpa.LLILZIL |= 1 << i;
                    InterfaceC529070Koz interfaceC529070Koz = viewOnClickListenerC529440Kpa.LLIZ;
                    if (interfaceC529070Koz != null) {
                        C523930Kgh c523930Kgh3 = viewOnClickListenerC529440Kpa.LLIZLLLIL;
                        if (c523930Kgh3 == null) {
                            interfaceC529070Koz.LJJIJ(viewOnClickListenerC529440Kpa.LLLIIIIL(), false, viewOnClickListenerC529440Kpa.LLILZIL, true, true, true, true);
                            viewOnClickListenerC529440Kpa.LLIZLLLIL = viewOnClickListenerC529440Kpa.LLLIIIIL();
                        } else if (!C13LP.LJJJJ(c523930Kgh3, hashSet2) && viewOnClickListenerC529440Kpa.LLIZLLLIL != viewOnClickListenerC529440Kpa.LLLIIIIL()) {
                            if (abstractC530360Kr4 == C530350Kr3.LIZ && viewOnClickListenerC529440Kpa.LLIZLLLIL != null) {
                                for (TikTokMediaModel tikTokMediaModel : arrayList) {
                                    String str3 = tikTokMediaModel.albumClass;
                                    C523930Kgh c523930Kgh4 = viewOnClickListenerC529440Kpa.LLIZLLLIL;
                                    if (c523930Kgh4 != null) {
                                        str2 = c523930Kgh4.LIZ;
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.equals(str3, str2) && (c523930Kgh = viewOnClickListenerC529440Kpa.LLIZLLLIL) != null) {
                                        ViewOnClickListenerC529440Kpa.LLLFZ(c523930Kgh, tikTokMediaModel, i);
                                    }
                                }
                                InterfaceC529070Koz interfaceC529070Koz2 = viewOnClickListenerC529440Kpa.LLIZ;
                                if (interfaceC529070Koz2 != null) {
                                    interfaceC529070Koz2.LJJIJ(viewOnClickListenerC529440Kpa.LLIZLLLIL, false, viewOnClickListenerC529440Kpa.LLILZIL, true, true, true, true);
                                }
                            }
                        } else {
                            InterfaceC529070Koz interfaceC529070Koz3 = viewOnClickListenerC529440Kpa.LLIZ;
                            if (interfaceC529070Koz3 != null) {
                                interfaceC529070Koz3.LJJIJ(viewOnClickListenerC529440Kpa.LLIZLLLIL, false, viewOnClickListenerC529440Kpa.LLILZIL, false, true, true, true);
                            }
                        }
                    }
                    C529050Kox c529050Kox = viewOnClickListenerC529440Kpa.LLJ;
                    if (c529050Kox != null) {
                        c529050Kox.LIZ(i, abstractC530360Kr4);
                    }
                }
                if ((c529030Kov.LLJLIL || c529030Kov.LLJL) && (abstractC530360Kr4 != C530370Kr5.LIZ || i != 4)) {
                    return;
                }
                c529030Kov.LLJJJ.LLLII();
                return;
            }
            ViewOnClickListenerC529430KpZ viewOnClickListenerC529430KpZ = c529030Kov.LLJJJIL;
            boolean z4 = c529030Kov.LLJL;
            boolean z5 = c529030Kov.LLJLIL;
            viewOnClickListenerC529430KpZ.getClass();
            if (i == 4 || i == 3 || i == 1) {
                if (abstractC530360Kr4 == C530350Kr3.LIZ) {
                    Iterator<C523930Kgh> it4 = viewOnClickListenerC529430KpZ.LLILLL.iterator();
                    while (it4.hasNext()) {
                        C523930Kgh next2 = it4.next();
                        ViewOnClickListenerC529430KpZ.LLLILZ(i, next2);
                        if (!TextUtils.equals(next2.LIZ, viewOnClickListenerC529430KpZ.LLJILJILJ) && !TextUtils.equals(next2.LIZ, viewOnClickListenerC529430KpZ.LLJJ)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (next2.LIZJ() == 0 && !z2) {
                            it4.remove();
                            viewOnClickListenerC529430KpZ.LLILZ.remove(next2.LIZ);
                        }
                    }
                    ViewOnClickListenerC529430KpZ.LLLILZ(i, viewOnClickListenerC529430KpZ.LLJIJIL);
                    viewOnClickListenerC529430KpZ.LLLFZ();
                }
                viewOnClickListenerC529430KpZ.LLJJIJIIJIL = true;
                C523930Kgh c523930Kgh5 = (C523930Kgh) ListProtector.get(viewOnClickListenerC529430KpZ.LLILLL, 0);
                HashSet hashSet3 = new HashSet();
                ViewOnClickListenerC529430KpZ.LLLII(c523930Kgh5, arrayList, i);
                if (viewOnClickListenerC529430KpZ.LLJJI && viewOnClickListenerC529430KpZ.LLILLL.size() > 1) {
                    C523930Kgh c523930Kgh6 = (C523930Kgh) ListProtector.get(viewOnClickListenerC529430KpZ.LLILLL, 1);
                    ArrayList arrayList2 = new ArrayList();
                    for (MediaModel mediaModel2 : arrayList) {
                        if (mediaModel2.LJIIJJI()) {
                            arrayList2.add(mediaModel2);
                        }
                    }
                    ViewOnClickListenerC529430KpZ.LLLII(c523930Kgh6, arrayList2, i);
                }
                viewOnClickListenerC529430KpZ.LLILZLL |= 1 << i;
                InterfaceC529070Koz interfaceC529070Koz4 = viewOnClickListenerC529430KpZ.LLJ;
                if (interfaceC529070Koz4 != null) {
                    C523930Kgh c523930Kgh7 = viewOnClickListenerC529430KpZ.LLJIJIL;
                    if (c523930Kgh7 == null) {
                        interfaceC529070Koz4.LJJIJ(viewOnClickListenerC529430KpZ.LLLIILIL(), false, viewOnClickListenerC529430KpZ.LLILZLL, true, z4, z5, viewOnClickListenerC529430KpZ.LLJJIII);
                        viewOnClickListenerC529430KpZ.LLJIJIL = viewOnClickListenerC529430KpZ.LLLIILIL();
                    } else if (!hashSet3.contains(c523930Kgh7) && viewOnClickListenerC529430KpZ.LLJIJIL != viewOnClickListenerC529430KpZ.LLLIILIL()) {
                        if (abstractC530360Kr4 == C530350Kr3.LIZ && viewOnClickListenerC529430KpZ.LLJIJIL != null) {
                            for (TikTokMediaModel tikTokMediaModel2 : arrayList) {
                                if (TextUtils.equals(tikTokMediaModel2.albumClass, viewOnClickListenerC529430KpZ.LLJIJIL.LIZ)) {
                                    ViewOnClickListenerC529430KpZ.LLLI(viewOnClickListenerC529430KpZ.LLJIJIL, tikTokMediaModel2, i);
                                }
                            }
                            viewOnClickListenerC529430KpZ.LLJ.LJJIJ(viewOnClickListenerC529430KpZ.LLJIJIL, false, viewOnClickListenerC529430KpZ.LLILZLL, true, z4, z5, viewOnClickListenerC529430KpZ.LLJJIII);
                        }
                    } else {
                        z3 = false;
                        viewOnClickListenerC529430KpZ.LLJ.LJJIJ(viewOnClickListenerC529430KpZ.LLJIJIL, false, viewOnClickListenerC529430KpZ.LLILZLL, false, z4, z5, viewOnClickListenerC529430KpZ.LLJJIII);
                    }
                }
                if (viewOnClickListenerC529430KpZ.LLJJIJI && C0BYL.LIZ() && viewOnClickListenerC529430KpZ.LLJJIJIIJIL) {
                    viewOnClickListenerC529430KpZ.LLJJIJIIJIL = z3;
                    viewOnClickListenerC529430KpZ.LLLIIIIL(arrayList, i, C530380Kr6.LIZ);
                    viewOnClickListenerC529430KpZ.LLLILZLLLI();
                }
                C529050Kox c529050Kox2 = viewOnClickListenerC529430KpZ.LLJILJIL;
                if (c529050Kox2 != null) {
                    c529050Kox2.LIZ(i, abstractC530360Kr4);
                }
            }
            if (c529030Kov.LLJL || c529030Kov.LLJLIL) {
                return;
            }
            ViewOnClickListenerC529430KpZ viewOnClickListenerC529430KpZ2 = c529030Kov.LLJJJIL;
            viewOnClickListenerC529430KpZ2.getClass();
            C578570Mmd.LIZ.getClass();
            if (C578570Mmd.LIZ()) {
                AbstractC19484711Kz.LJIJI(new ACallableS415S0100000_8(viewOnClickListenerC529430KpZ2, 6)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS177S0100000_8(viewOnClickListenerC529430KpZ2, 12), new AfS177S0100000_8(viewOnClickListenerC529430KpZ2, 13));
            }
            if (!c529030Kov.LLLILZLLLI || (c1drg = c529030Kov.LLLL) == null || (c527460KmO = (C527460KmO) c1drg.LJIIL(null, C527460KmO.class)) == null || (c11jfLIZIZ = c527460KmO.LIZIZ(c529030Kov.LLLIZZ, new InterfaceC524590Khl() { // from class: X.0Kft
                @Override // X.InterfaceC524590Khl
                public final void LIZ(List list2) {
                    ChooseMediaViewModel chooseMediaViewModel = c529030Kov.LLLJIL;
                    if (chooseMediaViewModel != null) {
                        chooseMediaViewModel.yR2(new AwS587S0100000_8(list2, (List<MentionDataItem>) 210));
                    }
                }
            })) == null) {
                return;
            }
            c529030Kov.LLJJLIIIJLLLLLLLZ.LIZ(c11jfLIZIZ);
        }
    };
    public final C529050Kox LLLLIIIILLL = new C529050Kox(this);

    public final void LLLLJI() {
        this.LLLII = true;
        this.LLLIIIIL.removeCallbacks(this.LLLIIIL);
        this.LLLI = false;
        if (((ArrayList) this.LLLFFI).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LLLFFI);
        ((ArrayList) this.LLLFFI).clear();
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[*]flushPendingLoadMore: costMs=");
        sbLIZ.append(LLLLIILL());
        sbLIZ.append(" run ");
        sbLIZ.append(arrayList.size());
        sbLIZ.append(" deferred tasks");
        C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
    }

    static {
        C01GW c01gw = C280650AzH.LIZ;
        LLLLIIL = ((Number) c01gw.getValue()).intValue();
        LLLLIILL = ((Number) c01gw.getValue()).intValue();
    }

    public final long LLLLIILL() {
        if (this.LLL > 0) {
            return System.currentTimeMillis() - this.LLL;
        }
        return -1L;
    }

    public final void LLLLJ() {
        if (this.LLJL || this.LLJLIL || this.LLLF != 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLLF = jCurrentTimeMillis;
        long j = this.LLL;
        long j2 = j > 0 ? jCurrentTimeMillis - j : -1L;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[*]ALL FETCHED: costMs=");
        sbLIZ.append(j2);
        sbLIZ.append(" video(rounds=");
        sbLIZ.append(this.LLJLLL);
        sbLIZ.append(",total=");
        sbLIZ.append(this.LLJZIJLIL);
        sbLIZ.append(") image(rounds=");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append(",total=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(")");
        C201955140j.LJIILL(c533790Kwb, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0Kow] */
    public C529030Kov() {
        C201955140j.LIZLLL(C533790Kwb.LIZIZ, "MvChooseAlbumFragment", "init");
    }

    @Override // X.AbstractC528890Koh, com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJLIIIJLLLLLLLZ.dispose();
        ((ArrayList) this.LLLFFI).clear();
    }

    @Override // com.bytedance.scene.Scene
    public final void onPause() {
        super.onPause();
        if (this.LLLIIII) {
            LLLLJI();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        BaseJediViewModel.iR2((BaseJediViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class), this, new C2217381BqS() { // from class: X.0KgX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new AwS587S0100000_8(new AObjectS351S0100000_8(this, 3), 200));
    }

    @Override // X.InterfaceC524610Khn
    public final void LJLIIIL(C523930Kgh c523930Kgh, boolean z) {
        this.LLJJL.LJLIIIL(c523930Kgh, z);
        if (this.LLLFF && this.LLJJJIL != null && C0BYL.LIZ()) {
            this.LLJJJIL.LLLILZLLLI();
        }
    }

    public final void LLLLIL(int i, AbstractC530360Kr4 abstractC530360Kr4) {
        boolean z;
        C11JF c11jfLJFF;
        boolean zLJI = MethodIDManager.LJI(200897);
        Bundle bundle = this.mArguments;
        if (bundle != null && (abstractC530360Kr4 instanceof C530370Kr5)) {
            z = bundle.getBoolean("extra_enable_cache_request", true);
        } else {
            z = true;
        }
        int i2 = 30;
        if (C0BRY.LIZ()) {
            if (abstractC530360Kr4 != C530370Kr5.LIZ) {
                i2 = LLLLIIL;
            }
            z = true;
        }
        if (this.LLJJJJ != null) {
            C524780Ki4.LIZ.step(OpenAlbumPanelPerformanceMonitor.INSTANCE, "loadMediaModels");
            C533780Kwa c533780Kwa = C533780Kwa.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadData, supportFlag=");
            sbLIZ.append(i);
            sbLIZ.append(",enableRequest=");
            sbLIZ.append(z);
            C201955140j.LIZLLL(c533780Kwa, "MvChooseAlbumFragment", C2188811AlT.LIZIZ(sbLIZ));
            if ((i & 1) != 0 || (i & 2) != 0) {
                this.LLJL = true;
                this.LLJLILLLLZIIL = 0;
                if (z) {
                    if (this.LLLIIL) {
                        C530750Krh c530750Krh = this.LLJJJJ;
                        C529040Kow c529040Kow = this.LLLLII;
                        c530750Krh.getClass();
                        c11jfLJFF = C530750Krh.LJFF(1, i2, 0, false, c529040Kow, abstractC530360Kr4);
                    } else {
                        C530750Krh c530750Krh2 = this.LLJJJJ;
                        C529040Kow c529040Kow2 = this.LLLLII;
                        c530750Krh2.getClass();
                        c11jfLJFF = C530750Krh.LJFF(3, i2, 0, false, c529040Kow2, abstractC530360Kr4);
                    }
                    this.LLJJLIIIJLLLLLLLZ.LIZ(c11jfLJFF);
                }
            }
            if ((i & 4) != 0) {
                this.LLJLIL = true;
                this.LLJLL = 0;
                if (z) {
                    C530750Krh c530750Krh3 = this.LLJJJJ;
                    C529040Kow c529040Kow3 = this.LLLLII;
                    c530750Krh3.getClass();
                    this.LLJJLIIIJLLLLLLLZ.LIZ(C530750Krh.LJFF(4, i2, 0, false, c529040Kow3, abstractC530360Kr4));
                }
            }
        } else {
            C201955140j.LIZLLL(C533780Kwa.LIZIZ, "MvChooseAlbumFragment", "loadData, mMediaManager is null");
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context sceneContext;
        boolean z;
        int i;
        final boolean z2;
        C128Y currentScene = C0CHQ.LIZ().LJIJJ().getCurrentScene(requireActivity());
        final boolean z3 = false;
        if (C0CHQ.LIZ().getAlbumService().executeCreativeRefinePreloadAlbumUserStrategy() && (currentScene instanceof InterfaceC530790Krl)) {
            this.LLJJJJJIL = (ViewGroup) C530780Krk.LIZ((InterfaceC530790Krl) currentScene, R.layout.d6w, this);
        } else {
            this.LLJJJJJIL = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.d6w, viewGroup, false);
        }
        Bundle bundle2 = this.mArguments;
        int i2 = -1;
        if (bundle2 != null) {
            i2 = bundle2.getInt("key_support_flag", -1);
            this.LLLIIL = bundle2.getBoolean("extra_show_gif", false);
            this.LLLIILIL = bundle2.getBoolean("extra_from_ugc_template", false);
            this.LLLIL = bundle2.getBoolean("extra_fix_theme_inconsistency", false);
            this.LLLILZ = bundle2.getBoolean("key_set_flattened_tag_album_menu_config", false);
            bundle2.getBoolean("from_story_album", false);
            this.LLLIIII = bundle2.getBoolean("key_album_defer_load_more_enabled", false);
        }
        this.LLLJIL = (ChooseMediaViewModel) C1659640tI2.LIZLLL(this).LIZ(ChooseMediaViewModel.class);
        RecyclerView recyclerView = (RecyclerView) this.LLJJJJJIL.findViewById(R.id.kbj);
        this.LLJJIJIL = recyclerView;
        recyclerView.setLayoutManager(new WrapLinearLayoutManager(this.mActivity));
        if (this.LLLILZ) {
            ViewOnClickListenerC529440Kpa viewOnClickListenerC529440Kpa = this.LLJJJ;
            viewOnClickListenerC529440Kpa.LLJ = this.LLLLIIIILLL;
            viewOnClickListenerC529440Kpa.LLIZ = this;
        } else {
            if (this.LLLIL) {
                sceneContext = getSceneContext();
            } else {
                sceneContext = this.mActivity;
            }
            if (!this.LLLIILIL && (i = this.LLLJ) != 63 && i != 65) {
                z = false;
            } else {
                z = true;
            }
            ViewOnClickListenerC529430KpZ viewOnClickListenerC529430KpZ = new ViewOnClickListenerC529430KpZ(sceneContext, this, this, z, this.LLLILZJ, C13LP.LLIIII(this.LLLJIL.LLJIJIL));
            this.LLJJJIL = viewOnClickListenerC529430KpZ;
            viewOnClickListenerC529430KpZ.LLJILJIL = this.LLLLIIIILLL;
        }
        if (C530750Krh.LJFF == null) {
            C530750Krh.LIZIZ(C0CHQ.LIZ);
        }
        this.LLJJJJ = C530750Krh.LJFF;
        this.LLJJIJIL.setAdapter(this.LLJJJIL);
        HandlerHook.viewPost(this.LLJJJJJIL, new ARunnableS108S0100000_8(this, 37));
        C201955140j.LJIILL(C533790Kwb.LIZIZ, "MvChooseAlbumFragment", "[*]loadMedia after createView");
        LLLLIL(i2, C530370Kr5.LIZ);
        if (C0BYL.LIZ()) {
            if ((i2 & 1) == 0 && (i2 & 2) == 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if ((i2 & 4) != 0) {
                z3 = true;
            }
            if ((z2 || z3) && this.LLJJJJ != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                final C530750Krh c530750Krh = this.LLJJJJ;
                final boolean zLIZ = C2401309b1.LIZ();
                C528940Kom c528940Kom = new C528940Kom(this, jCurrentTimeMillis);
                c530750Krh.getClass();
                this.LLJJLIIIJLLLLLLLZ.LIZ(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.09b0
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        String strLJJLIIIJ;
                        String strLIZ;
                        Cursor cursorLJJJ;
                        Throwable th;
                        List listLLIIII;
                        Cursor cursorLJJJ2;
                        C530750Krh c530750Krh2 = c530750Krh;
                        boolean z4 = z3;
                        boolean z5 = z2;
                        boolean z6 = zLIZ;
                        c530750Krh2.getClass();
                        C1C7U.LIZ("MediaManager@e18e.loadAlbumList$1L");
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        Context context = c530750Krh2.LIZ;
                        if (Build.VERSION.SDK_INT >= 29) {
                            String[] strArr = {"_id", "bucket_id", "bucket_display_name", "date_modified"};
                            ArrayList arrayList = new ArrayList();
                            if (z5) {
                                arrayList.add("1");
                            }
                            if (z4) {
                                arrayList.add("3");
                            }
                            String strLIZ2 = "(media_type=? OR media_type=?)";
                            if (!z6) {
                                strLIZ2 = C2400909ax.LIZ("(media_type=? OR media_type=?)", "mime_type not like ?");
                                arrayList.add("%hei%");
                            }
                            Uri contentUri = MediaStore.Files.getContentUri("external");
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            try {
                                cursorLJJJ2 = C2204961BRm.LJJJ(context.getContentResolver(), contentUri, strArr, strLIZ2, (String[]) arrayList.toArray(new String[0]), "date_modified DESC", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkN9J2pV3h+Wgwn1yzmHvnXEeqQ==", null));
                                try {
                                    if (cursorLJJJ2 != null) {
                                        try {
                                            int columnIndexOrThrow = cursorLJJJ2.getColumnIndexOrThrow("_id");
                                            int columnIndexOrThrow2 = cursorLJJJ2.getColumnIndexOrThrow("bucket_id");
                                            int columnIndexOrThrow3 = cursorLJJJ2.getColumnIndexOrThrow("bucket_display_name");
                                            while (cursorLJJJ2.moveToNext()) {
                                                String string = cursorLJJJ2.getString(columnIndexOrThrow2);
                                                if (string != null && !linkedHashMap.containsKey(string)) {
                                                    long j = cursorLJJJ2.getLong(columnIndexOrThrow);
                                                    String string2 = cursorLJJJ2.getString(columnIndexOrThrow3);
                                                    if (string2 == null) {
                                                        string2 = "Unknown";
                                                    }
                                                    linkedHashMap.put(string, new SimplyAlbumModel(string, string2, ContentUris.withAppendedId(contentUri, j)));
                                                }
                                            }
                                            C2107108Nh.LIZ(cursorLJJJ2, null);
                                        } finally {
                                            th = th;
                                            try {
                                                try {
                                                } catch (Throwable th2) {
                                                    while (true) {
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                            }
                                        }
                                    }
                                    if (cursorLJJJ2 != null) {
                                        cursorLJJJ2.close();
                                    }
                                    listLLIIII = C13LP.LLIIII(linkedHashMap.values());
                                } catch (Throwable th4) {
                                    th = th4;
                                    while (true) {
                                        try {
                                            TryCatchGuardChecker.doCheck(th);
                                            break;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    if (cursorLJJJ2 != null) {
                                        cursorLJJJ2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                cursorLJJJ2 = null;
                            }
                        } else {
                            String[] strArr2 = {"_id", "bucket_id", "bucket_display_name", "date_modified"};
                            ArrayList arrayList2 = new ArrayList();
                            if (z5) {
                                arrayList2.add("1");
                            }
                            if (z4) {
                                arrayList2.add("3");
                            }
                            boolean z7 = true;
                            if (!arrayList2.isEmpty()) {
                                int size = arrayList2.size();
                                ArrayList arrayList3 = new ArrayList(size);
                                for (int i3 = 0; i3 < size; i3++) {
                                    arrayList3.add("media_type=?");
                                }
                                strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList3, " OR ", e3.h, ")", 0, null, null, 56);
                            } else {
                                strLJJLIIIJ = null;
                            }
                            if (z6) {
                                strLIZ = strLJJLIIIJ;
                            } else {
                                if (strLJJLIIIJ != null && strLJJLIIIJ.length() != 0) {
                                    z7 = false;
                                }
                                strLIZ = z7 ? "mime_type not like ?" : C2400909ax.LIZ(strLJJLIIIJ, "mime_type not like ?");
                                arrayList2.add("%hei%");
                            }
                            Uri contentUri2 = MediaStore.Files.getContentUri("external");
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            try {
                                ContentResolver contentResolver = context.getContentResolver();
                                String[] strArr3 = (String[]) arrayList2.toArray(new String[0]);
                                cursorLJJJ = null;
                                try {
                                    cursorLJJJ = C2204961BRm.LJJJ(contentResolver, contentUri2, strArr2, strLIZ, strArr3, "date_modified DESC", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOetZ5bP3zojwSJvkN9J2pV3h+Wgwn1yzmHvnXEeqQ==", null));
                                    try {
                                        if (cursorLJJJ != null) {
                                            try {
                                                int columnIndexOrThrow4 = cursorLJJJ.getColumnIndexOrThrow("_id");
                                                int columnIndexOrThrow5 = cursorLJJJ.getColumnIndexOrThrow("bucket_id");
                                                int columnIndexOrThrow6 = cursorLJJJ.getColumnIndexOrThrow("bucket_display_name");
                                                while (cursorLJJJ.moveToNext()) {
                                                    try {
                                                        String string3 = cursorLJJJ.getString(columnIndexOrThrow5);
                                                        if (string3 != null && !linkedHashMap2.containsKey(string3)) {
                                                            long j2 = cursorLJJJ.getLong(columnIndexOrThrow4);
                                                            String string4 = cursorLJJJ.getString(columnIndexOrThrow6);
                                                            if (string4 == null) {
                                                                string4 = "Unknown";
                                                            }
                                                            linkedHashMap2.put(string3, new SimplyAlbumModel(string3, string4, ContentUris.withAppendedId(contentUri2, j2)));
                                                        }
                                                    } catch (Throwable th7) {
                                                        th = th7;
                                                        th = null;
                                                        try {
                                                            TryCatchGuardChecker.doCheck(th);
                                                            try {
                                                                throw th;
                                                            } catch (Throwable th8) {
                                                                th = th8;
                                                                while (true) {
                                                                    try {
                                                                        TryCatchGuardChecker.doCheck(th);
                                                                        C2107108Nh.LIZ(cursorLJJJ, th);
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th = th9;
                                                                    }
                                                                }
                                                            }
                                                        } catch (Throwable th10) {
                                                            th = th10;
                                                            th = th;
                                                        }
                                                    }
                                                }
                                                C2107108Nh.LIZ(cursorLJJJ, null);
                                            } catch (Throwable th11) {
                                                th = th11;
                                                th = null;
                                            }
                                        }
                                        if (cursorLJJJ != null) {
                                            cursorLJJJ.close();
                                        }
                                        listLLIIII = C13LP.LLIIII(linkedHashMap2.values());
                                    } catch (Throwable th12) {
                                        th = th12;
                                        while (true) {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                break;
                                            } catch (Throwable th13) {
                                                th = th13;
                                            }
                                        }
                                        if (cursorLJJJ != null) {
                                            cursorLJJJ.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                                cursorLJJJ = null;
                            }
                        }
                        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("call onMediaAlbumListLoadedV2, spendTime = ");
                        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                        sbLIZ.append(", albumList = ");
                        sbLIZ.append(listLLIIII);
                        C201955140j.LJII(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
                        C1C7U.LIZIZ("MediaManager@e18e.loadAlbumList$1L");
                        return listLLIIII;
                    }
                }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS177S0100000_8(c528940Kom, 83), new AfS177S0100000_8(c528940Kom, 84)));
            }
        }
        this.LLJJJJJIL.setOutlineProvider(new C580760MqA(0));
        this.LLJJJJJIL.setElevation(C11VU.LIZIZ(17.0f, requireActivity()));
        return this.LLJJJJJIL;
    }

    public final void LLLLILI(int i, int i2, int i3, C529040Kow c529040Kow, C530350Kr3 c530350Kr3) {
        this.LLJJJJ.getClass();
        this.LLJJLIIIJLLLLLLLZ.LIZ(C530750Krh.LJFF(i, i2, i3, false, c529040Kow, c530350Kr3));
    }

    @Override // X.InterfaceC529070Koz
    public final void LJJIJ(C523930Kgh c523930Kgh, boolean z, int i, boolean z2, boolean z3, boolean z4, boolean z5) {
        C523340Kfk c523340Kfk = this.LLJJJJLIIL;
        if (c523340Kfk != null) {
            c523340Kfk.LJJIJ(c523930Kgh, z, i, z2, z3, z4, z5);
        }
    }
}
