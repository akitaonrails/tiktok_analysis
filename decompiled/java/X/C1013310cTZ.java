package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.model.AnoleMultiContentItemModel;
import com.ss.android.ugc.aweme.model.AnoleMultiContentModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cTZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1013310cTZ extends AbstractC1014240cV4 {
    public final AnoleMultiContentModel LLJLIL;
    public Bitmap LLJLILLLLZIIL;
    public final C1013560cTy LLJLL;
    public C20632315oP LLJLLIL;
    public final C0RJC LLJLLL;
    public boolean LLJZ;
    public final C1013350cTd LLJZIJLIL;
    public final AnoleMultiContentItemModel LLL;
    public C1013320cTa LLLF;

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        C1022620cia.LIZ("AnoleMultiContentComponent", "hostDidDisappear $0{this@AnoleMultiContentComponent}");
        C1013350cTd c1013350cTd = this.LLJZIJLIL;
        c1013350cTd.getClass();
        C1022620cia.LIZ("MultiContentHorizonAdapter", "didHide");
        C369801c8 c369801c8 = c1013350cTd.LLILZIL;
        AnonymousClass0956 anonymousClass0956 = c369801c8.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c369801c8.LIZIZ = null;
        c1013350cTd.LLLI(c1013350cTd.LLIZLLLIL, C1013210cTP.LIZ);
        int i = c1013350cTd.LLIZLLLIL;
        C1013250cTT c1013250cTT = C1013250cTT.LIZ;
        c1013350cTd.LLLI(i, c1013250cTT);
        c1013350cTd.LLLI(c1013350cTd.LLLFZ(c1013350cTd.LLIZLLLIL), c1013250cTT);
        this.LLJZ = false;
        super.LIZ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void clear() {
        C1022620cia.LIZ("AnoleMultiContentComponent", "clear");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hostWillAppear ");
        sbLIZ.append(this);
        C1022620cia.LIZ("AnoleMultiContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJZ = true;
        super.LIZJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        C1013350cTd c1013350cTd = this.LLJZIJLIL;
        int itemCount = c1013350cTd.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            c1013350cTd.LLLI(i, C1013250cTT.LIZ);
        }
        c1013350cTd.clearData();
        C0RJC c0rjc = this.LLJLLL;
        ((LinkedHashMap) c0rjc.LIZ).clear();
        ((LinkedHashMap) c0rjc.LIZIZ).clear();
        C1022620cia.LIZ("AnoleMultiContentComponent", "unmount");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        String vid;
        List<String> urlList;
        C1022620cia.LIZ("AnoleMultiContentComponent", "prerender");
        AnoleMultiContentItemModel anoleMultiContentItemModel = this.LLL;
        String playerAccessKey = null;
        if (anoleMultiContentItemModel != null) {
            vid = anoleMultiContentItemModel.getVid();
        } else {
            vid = null;
        }
        AnoleMultiContentItemModel anoleMultiContentItemModel2 = this.LLL;
        if (anoleMultiContentItemModel2 != null) {
            urlList = anoleMultiContentItemModel2.getUrlList();
        } else {
            urlList = null;
        }
        if (vid != null && urlList != null) {
            AnoleMultiContentItemModel anoleMultiContentItemModel3 = this.LLL;
            if (anoleMultiContentItemModel3 != null) {
                playerAccessKey = anoleMultiContentItemModel3.getPlayerAccessKey();
            }
            C1482560ogQ c1482560ogQLIZ = C1018190cbR.LIZ(vid, playerAccessKey, urlList);
            C582130MsN.LIZ().LJ().getClass();
            C1482860ogu c1482860ogu = C1014030cUj.LIZ;
            List listSingletonList = Collections.singletonList(c1482560ogQLIZ);
            C01GW c01gw = C258170A9v.LIZ;
            c1482860ogu.LJIILLIIL(((Number) c01gw.getValue()).intValue(), listSingletonList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preload first video size: ");
            sbLIZ.append(((Number) c01gw.getValue()).intValue());
            C1022620cia.LIZ("AnoleMultiContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        C20632315oP c20632315oP;
        C1022620cia.LIZ("AnoleMultiContentComponent", "didShow");
        super.LJII(anoleComponentAppearModel);
        this.LLJZ = true;
        C20632315oP c20632315oP2 = this.LLJLLIL;
        if ((c20632315oP2 == null || c20632315oP2.getCurrentItem() != 0) && this.LLJZ && (c20632315oP = this.LLJLLIL) != null) {
            c20632315oP.LJ(0, false);
        }
        C1013350cTd c1013350cTd = this.LLJZIJLIL;
        c1013350cTd.getClass();
        C1022620cia.LIZ("MultiContentHorizonAdapter", "didShow");
        c1013350cTd.LLLI(c1013350cTd.LLIZLLLIL, C1013270cTV.LIZ);
        c1013350cTd.LLJI = 0;
        c1013350cTd.LLJ = 0;
        c1013350cTd.LLJILJIL = 0;
        c1013350cTd.LLJIJIL = null;
        c1013350cTd.LLILZIL.LIZ(new AwS560S0100000_16(c1013350cTd, 8));
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        C20632315oP c20632315oP;
        if (abstractC1003980cEW instanceof C991730bul) {
            if (((C991730bul) abstractC1003980cEW).LIZ) {
                C1013350cTd c1013350cTd = this.LLJZIJLIL;
                c1013350cTd.LLLI(c1013350cTd.LLIZLLLIL, C1013260cTU.LIZ);
                return;
            } else {
                C1013350cTd c1013350cTd2 = this.LLJZIJLIL;
                c1013350cTd2.LLLI(c1013350cTd2.LLIZLLLIL, C1013230cTR.LIZ);
                return;
            }
        }
        if (abstractC1003980cEW instanceof C991270bu1) {
            int i = ((C991270bu1) abstractC1003980cEW).LIZ;
            C20632315oP c20632315oP2 = this.LLJLLIL;
            if ((c20632315oP2 != null && c20632315oP2.getCurrentItem() == i) || !this.LLJZ || (c20632315oP = this.LLJLLIL) == null) {
                return;
            }
            c20632315oP.LJ(i, true);
            return;
        }
        if (abstractC1003980cEW instanceof C991680bug) {
            if (((C991680bug) abstractC1003980cEW).LIZ == 1) {
                C1013350cTd c1013350cTd3 = this.LLJZIJLIL;
                c1013350cTd3.LLLI(c1013350cTd3.LLIZLLLIL, C1013260cTU.LIZ);
                return;
            } else {
                C1013350cTd c1013350cTd4 = this.LLJZIJLIL;
                c1013350cTd4.LLLI(c1013350cTd4.LLIZLLLIL, C1013230cTR.LIZ);
                return;
            }
        }
        if (!(abstractC1003980cEW instanceof C1005120cGM)) {
            return;
        }
        C1005120cGM c1005120cGM = (C1005120cGM) abstractC1003980cEW;
        if (c1005120cGM.LIZJ != null) {
            this.LLJLLL.LIZIZ.put(c1005120cGM.LIZ, new AwS595S0100000_16(abstractC1003980cEW, 484));
        } else {
            this.LLJLLL.LIZIZ.remove(c1005120cGM.LIZ);
        }
        if (c1005120cGM.LIZIZ != null) {
            this.LLJLLL.LIZ.put(c1005120cGM.LIZ, new AwS595S0100000_16(abstractC1003980cEW, 485));
        } else {
            this.LLJLLL.LIZ.remove(c1005120cGM.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0Rwk, X.0cTa] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        ViewParent parent;
        ViewGroup viewGroup2;
        C20632315oP c20632315oP;
        ViewGroup viewGroup3;
        ArrayList arrayList;
        super.Fk(viewGroup, interfaceC1014340cVE);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" mount hashCode=");
        sbLIZ.append(hashCode());
        C1022620cia.LIZ("AnoleMultiContentComponent", C2188811AlT.LIZIZ(sbLIZ));
        AnoleMultiContentModel anoleMultiContentModel = this.LLJLIL;
        if (anoleMultiContentModel != null) {
            C1013350cTd c1013350cTd = this.LLJZIJLIL;
            List<AnoleMultiContentItemModel> contentList = anoleMultiContentModel.getContentList();
            if (contentList != null) {
                arrayList = new ArrayList(contentList);
            } else {
                arrayList = null;
            }
            c1013350cTd.setData(arrayList);
            C1022620cia.LIZ("AnoleMultiContentComponent", "setData ");
            List<AnoleMultiContentItemModel> contentList2 = anoleMultiContentModel.getContentList();
            if (contentList2 != null && !contentList2.isEmpty()) {
                this.LLJZIJLIL.LLIZLLLIL = 0;
            }
        }
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = C786410Ut5.Td(C786410Ut5.ne(this.LLILZ), R.layout.po, this.LLJJIII, false);
        }
        View view = this.LLJJIJIL;
        if (view != null) {
            parent = view.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
            if (viewGroup2 != null && !Intrinsics.LJFF(viewGroup2, this.LLJJIII)) {
                C786410Ut5.LJJJLZIJ(this.LLJJIJIL, viewGroup2);
            }
        } else {
            viewGroup2 = null;
        }
        if (!Intrinsics.LJFF(viewGroup2, this.LLJJIII) && (viewGroup3 = this.LLJJIII) != null) {
            viewGroup3.addView(this.LLJJIJIL);
        }
        C20632315oP c20632315oP2 = this.LLJLLIL;
        if (c20632315oP2 == null || c20632315oP2.getAdapter() == null) {
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                c20632315oP = (C20632315oP) view2.findViewById(R.id.b66);
            } else {
                c20632315oP = 0;
            }
            this.LLJLLIL = c20632315oP;
            if (c20632315oP != 0) {
                c20632315oP.setAdapter(this.LLJZIJLIL);
                c20632315oP.setOffscreenPageLimit(1);
                c20632315oP.setUserInputEnabled(false);
                if (this.LLLF == null) {
                    ?? r0 = new AbstractC712240Rwk() { // from class: X.0cTa
                        @Override // X.AbstractC712240Rwk
                        public final void onPageSelected(int i) {
                            if (!this.LL.LLJZ) {
                                return;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("OnPageChangeCallback new pos: ");
                            sbLIZ2.append(i);
                            C1022620cia.LIZ("AnoleMultiContentComponent", C2188811AlT.LIZIZ(sbLIZ2));
                            C1013350cTd c1013350cTd2 = this.LL.LLJZIJLIL;
                            c1013350cTd2.getClass();
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("onViewPagerPageSelected called, position: ");
                            sbLIZ3.append(i);
                            sbLIZ3.append(" currentPos: ");
                            sbLIZ3.append(c1013350cTd2.LLIZLLLIL);
                            C1022620cia.LIZ("MultiContentHorizonAdapter", C2188811AlT.LIZIZ(sbLIZ3));
                            int i2 = c1013350cTd2.LLIZLLLIL;
                            if (i2 != i) {
                                c1013350cTd2.LLLI(i2, C1013250cTT.LIZ);
                            }
                            c1013350cTd2.LLLI(i, C1013270cTV.LIZ);
                            this.LL.LLJZIJLIL.LLIZLLLIL = i;
                        }
                    };
                    this.LLLF = r0;
                    c20632315oP.LIZIZ(r0);
                }
            }
            C20632315oP c20632315oP3 = this.LLJLLIL;
            if (c20632315oP3 != null) {
                try {
                    Boolean bool = Boolean.FALSE;
                    c20632315oP3.setTag(R.id.mlo, bool);
                    View childAt = c20632315oP3.getChildAt(0);
                    if (childAt != null) {
                        childAt.setTag(R.id.mlo, bool);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        AnoleMultiContentItemModel anoleMultiContentItemModel = this.LLL;
        if (anoleMultiContentItemModel != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1012740cSe(this, anoleMultiContentItemModel, null), 3);
        }
    }

    public C1013310cTZ(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        AnoleMultiContentItemModel anoleMultiContentItemModel;
        List<AnoleMultiContentItemModel> contentList;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        C1227904rF.LIZ.getClass();
        AnoleMultiContentModel anoleMultiContentModel = (AnoleMultiContentModel) anoleComponentModel.parseDataToStructure(C1227904rF.LIZLLL(), AnoleMultiContentModel.class, null);
        this.LLJLIL = anoleMultiContentModel;
        this.LLJLL = new C1013560cTy(c1009340cNA.LIZLLL, anoleMultiContentModel);
        this.LLJLLL = new C0RJC();
        this.LLJZIJLIL = new C1013350cTd(new C1013330cTb(this));
        if (anoleMultiContentModel != null && (contentList = anoleMultiContentModel.getContentList()) != null) {
            anoleMultiContentItemModel = (AnoleMultiContentItemModel) C13LP.LJJJLZIJ(0, contentList);
        } else {
            anoleMultiContentItemModel = null;
        }
        this.LLL = anoleMultiContentItemModel;
    }
}
