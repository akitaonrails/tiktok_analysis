package X;

import Y.ACListenerS47S0201000_18;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.poi.activity.PoiActivityApi;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS45S0301000_18;

/* JADX INFO: renamed from: X.0hCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1194790hCH extends AbstractC1762740vyK {
    public final InterfaceC1194150hBF LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final boolean LLIZLLLIL;
    public List<PoiActivityApi.PoiBannerInfo> LLJ;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<PoiActivityApi.PoiBannerInfo> list = this.LLJ;
        return C1175120ggY.LIZJ(list != null ? Integer.valueOf(list.size()) : null);
    }

    @Override // X.AbstractC1762740vyK
    public final View LJJIJIL(final int i, View view, ViewGroup viewGroup) {
        final PoiActivityApi.PoiBannerInfo poiBannerInfo;
        final C1322110kVd c1322110kVd;
        View view2;
        View viewFindViewById;
        final C1194140hBE c1194140hBE = new C1194140hBE(viewGroup.getContext(), this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        List<PoiActivityApi.PoiBannerInfo> list = this.LLJ;
        if (list != null) {
            poiBannerInfo = (PoiActivityApi.PoiBannerInfo) ListProtector.get(list, i);
        } else {
            poiBannerInfo = null;
        }
        View view3 = c1194140hBE.LLILZLL;
        if (view3 != null && (c1322110kVd = (C1322110kVd) view3.findViewById(R.id.brf)) != null && (view2 = c1194140hBE.LLILZLL) != null && (viewFindViewById = view2.findViewById(R.id.e1v)) != null) {
            if (poiBannerInfo != null) {
                String str = poiBannerInfo.picUrl;
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<Object>() { // from class: X.0kMY
                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str2, Object obj, Animatable animatable) {
                        AnimatedDrawable2 animatedDrawable2;
                        if (animatable != null) {
                            try {
                                InterfaceC1330960kju interfaceC1330960kju = null;
                                if (animatable instanceof AnimatedDrawable2) {
                                    animatedDrawable2 = (AnimatedDrawable2) animatable;
                                } else {
                                    animatedDrawable2 = null;
                                }
                                if (animatedDrawable2 != null) {
                                    interfaceC1330960kju = animatedDrawable2.LLILLL;
                                }
                                C1330040kiQ c1330040kiQ = new C1330040kiQ(interfaceC1330960kju);
                                if (animatedDrawable2 != null) {
                                    animatedDrawable2.setPrivateFrameScheduler(c1330040kiQ);
                                }
                                animatable.start();
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                    }
                };
                c1320810kTXLIZJ.LJIIJJI = false;
                c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                c1320810kTXLIZJ.LJII(str);
                c1322110kVd.setController(c1320810kTXLIZJ.LIZ());
                C786410Ut5.q9(c1322110kVd, new View.OnClickListener() { // from class: X.0hBD
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        String str2;
                        C1367960lha.LIZ.getClass();
                        IPoiService iPoiServiceLIZ = C1367960lha.LIZ();
                        Context context = c1194140hBE.getContext();
                        String str3 = poiBannerInfo.clickUrl;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        iPoiServiceLIZ.LJJLIIIJLLLLLLLZ(context, str3);
                        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
                        String strLIZLLL = C18JG.LIZLLL(PageFinder.via((View) c1322110kVd), "a4257.b26943.c2786.d0", null);
                        C1189680h42 c1189680h42 = C1189680h42.LIZ;
                        String str5 = "poi_detail";
                        if (c1194140hBE.LLILLJJLI) {
                            str2 = "poi_detail";
                        } else {
                            str2 = "add_location";
                        }
                        String str6 = poiBannerInfo.activityId;
                        if (str6 == null) {
                            str6 = "";
                        }
                        Integer numValueOf = Integer.valueOf(i + 1);
                        Fragment fragmentLIZ = C946803n0.LIZ(c1194140hBE);
                        if (fragmentLIZ != null) {
                            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLIZ, null);
                        }
                        C1189680h42.LIZ(c1189680h42, false, str2, str6, numValueOf, null, null, null, interfaceC665370Q7zLJFF, strLIZLLL, PageFinder.via((View) c1194140hBE), 112);
                        InterfaceC1194150hBF interfaceC1194150hBF = c1194140hBE.LL;
                        String str7 = poiBannerInfo.activityId;
                        if (str7 == null) {
                            str7 = "";
                        }
                        interfaceC1194150hBF.LIZ(str7);
                        String str8 = poiBannerInfo.activityId;
                        if (str8 != null) {
                            str4 = str8;
                        }
                        if (!c1194140hBE.LLILLJJLI) {
                            str5 = "add_location";
                        }
                        C1194160hBG.LJI(str4, str5);
                    }
                });
                C2211631BhB.LJ(c1322110kVd, new AwS45S0301000_18(i, c1322110kVd, poiBannerInfo, c1194140hBE, 1));
            }
            C786410Ut5.I7(new ACListenerS47S0201000_18(c1194140hBE, poiBannerInfo, i, 0), viewFindViewById);
        }
        return c1194140hBE;
    }

    public C1194790hCH(InterfaceC1194150hBF interfaceC1194150hBF, LayoutInflater layoutInflater, boolean z, String str, String str2, boolean z2) {
        super(layoutInflater);
        this.LLILZ = interfaceC1194150hBF;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = z2;
        this.LLJ = C13BV.INSTANCE;
    }
}
