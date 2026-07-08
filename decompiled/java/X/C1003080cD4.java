package X;

import Y.ARunnableS27S0101000_16;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spi.HomePageCommonService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cD4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1003080cD4 extends AbstractC1014240cV4 implements InterfaceC1003120cD8 {
    public final IAnoleManager LLJLIL;
    public C0HA6 LLJLILLLLZIIL;

    public final List<Long> LJJ() {
        Map<String, ? extends Object> map = this.LL.data;
        Object obj = map != null ? map.get("durations") : null;
        if (C19719512Dh.LJI(obj)) {
            return (List) obj;
        }
        return null;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        C1022620cia.LIZ("AnoleNativeProgressBarComponent", "hostDidDisappear");
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        C1022620cia.LIZ("AnoleNativeProgressBarComponent", "hostWillAppear");
        if (Intrinsics.LJFF(EnumC1008920cMU.PROGRESS_BAR.getType(), this.LL.type)) {
            C622680Oba.LIZJ(this);
        }
    }

    @Override // X.InterfaceC1003120cD8
    public final AbstractC1003110cD7 LIZLLL(int i) {
        List<Long> listLJJ = LJJ();
        if (listLJJ == null) {
            return new C1003100cD6(C00CS.DURATIONS_IS_NULL);
        }
        if (i >= 0 && i < listLJJ.size()) {
            long jLJZL = C13LP.LJZL(listLJJ);
            long jLongValue = 0;
            for (int i2 = 0; i2 < i; i2++) {
                jLongValue += ((Number) ListProtector.get(listLJJ, i2)).longValue();
            }
            return new C1003090cD5(jLongValue / jLJZL);
        }
        return new C1003100cD6(C00CS.INDEX_OUT_OF_BOUNDS);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        C0HA6 c0ha6;
        if (abstractC1003980cEW instanceof C1005130cGN) {
            if (Intrinsics.LJFF(EnumC1008920cMU.PROGRESS_BAR.getType(), this.LL.type)) {
                ArrayList arrayList = new ArrayList();
                List<Long> listLJJ = LJJ();
                int i = 0;
                if (listLJJ != null) {
                    int i2 = 0;
                    long j = 0;
                    for (Long l : listLJJ) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            long jLongValue = l.longValue();
                            if (i2 == 0) {
                                arrayList.add(0L);
                            } else {
                                arrayList.add(Long.valueOf(j));
                            }
                            j += jLongValue;
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getAllVideoStartPlayProgress = ");
                sbLIZ.append(arrayList);
                C1022620cia.LIZ("AnoleNativeProgressBarComponent", C2188811AlT.LIZIZ(sbLIZ));
                for (Object obj : arrayList) {
                    int i4 = i + 1;
                    if (i >= 0) {
                        long jLongValue2 = ((Number) obj).longValue();
                        if (i != 0) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(this.LL.type);
                            sbLIZ2.append('-');
                            sbLIZ2.append(jLongValue2);
                            sbLIZ2.append('-');
                            sbLIZ2.append(i);
                            this.LLILLL.a3(C2188811AlT.LIZIZ(sbLIZ2), new ARunnableS27S0101000_16(i, this, 7), (int) jLongValue2);
                        }
                        i = i4;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        if (abstractC1003980cEW instanceof C995860c1Q) {
            C995860c1Q c995860c1Q = (C995860c1Q) abstractC1003980cEW;
            int i5 = c995860c1Q.LIZ;
            float f = c995860c1Q.LIZIZ;
            C0HA6 c0ha62 = this.LLJLILLLLZIIL;
            if (c0ha62 != null) {
                c0ha62.LIZ(i5);
            }
            if (f >= 0.0f && f <= 100.0f && (c0ha6 = this.LLJLILLLLZIIL) != null) {
                c0ha6.LIZIZ(f);
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Nk(AnoleComponentAppearModel anoleComponentAppearModel) {
        C0HA8 c0ha8;
        C0HA6 c0ha6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LLJJIJIL == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.q3, this.LLJJIII, false);
            this.LLJJIJIL = viewTd;
            ViewGroup.LayoutParams layoutParams = null;
            if (viewTd != null) {
                c0ha6 = (C0HA6) viewTd.findViewById(R.id.oqy);
            } else {
                c0ha6 = null;
            }
            this.LLJLILLLLZIIL = c0ha6;
            HomePageCommonService homePageCommonService = (HomePageCommonService) PluggableExtentionKt.pluggableSpi$default(HomePageCommonService.class, false, false, false, 14, null);
            if (homePageCommonService != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(homePageCommonService.LJFF())));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(2.0f)));
                C0HA6 c0ha62 = this.LLJLILLLLZIIL;
                if (c0ha62 != null) {
                    layoutParams = c0ha62.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.setMargins(0, 0, 0, iLIZIZ - iLIZIZ2);
                }
            }
        }
        List<Long> listLJJ = LJJ();
        if (listLJJ != null) {
            ArrayList arrayList = new ArrayList();
            long jLJZL = C13LP.LJZL(listLJJ);
            Iterator<Long> it2 = listLJJ.iterator();
            long j = 0;
            while (it2.hasNext()) {
                long jLongValue = it2.next().longValue();
                arrayList.add(new C0HA9((j / jLJZL) * 100));
                j += jLongValue;
            }
            C0HA6 c0ha63 = this.LLJLILLLLZIIL;
            if (c0ha63 != null) {
                c0ha63.setIndexNodes(arrayList);
            }
            boolean zLJFF = Intrinsics.LJFF(EnumC1008920cMU.PROGRESS_BAR.getType(), this.LL.type);
            C0HA6 c0ha64 = this.LLJLILLLLZIIL;
            if (c0ha64 != null) {
                if (zLJFF) {
                    c0ha8 = C0HA8.SINGLE_VIDEO;
                } else {
                    c0ha8 = C0HA8.MULTI_VIDEO;
                }
                c0ha64.setMode(c0ha8);
            }
        }
        super.Nk(anoleComponentAppearModel);
        C0HA6 c0ha65 = this.LLJLILLLLZIIL;
        if (c0ha65 != null) {
            c0ha65.LIZIZ(0.0f);
        }
    }

    @C14EU
    public final void onFeedAdProgressBarChange(C581690Mrf c581690Mrf) {
        String aid;
        C0HA6 c0ha6;
        Aweme aweme;
        if (c581690Mrf != null && (aweme = c581690Mrf.LIZ) != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (Intrinsics.LJFF(aid, this.LLILLJJLI.LIZ) && Intrinsics.LJFF(EnumC1008920cMU.PROGRESS_BAR.getType(), this.LL.type)) {
            float f = c581690Mrf.LIZIZ;
            if (f >= 0.0f && f <= 100.0f && (c0ha6 = this.LLJLILLLLZIIL) != null) {
                c0ha6.LIZIZ(f);
            }
        }
    }

    public C1003080cD4(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context, IAnoleManager iAnoleManager) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = iAnoleManager;
    }
}
