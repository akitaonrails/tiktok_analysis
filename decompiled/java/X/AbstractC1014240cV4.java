package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS24S0400000_16;
import Y.ARunnableS85S0200000_16;
import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS130S1100000_16;
import kotlin.jvm.internal.AwS29S2200000_35;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS6S3200000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1014240cV4 implements InterfaceC1007930cKt {
    public final AnoleComponentModel LL;
    public final C1009340cNA LLILLJJLI;
    public final InterfaceC1014270cV7 LLILLL;
    public final Context LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public AnoleComponentAppearModel LLJI;
    public ARunnableS116S0100000_16 LLJILJIL;
    public ARunnableS85S0200000_16 LLJILJILJ;
    public final String LLJJ;
    public C1009390cNF LLJJI;
    public ViewGroup LLJJIII;
    public ViewGroup LLJJIJI;
    public C1014310cVB LLJJIJIIJIL;
    public View LLJJIJIL;
    public C1014350cVF LLJJJ;
    public AnimatorSet LLJJJIL;
    public InterfaceC1014340cVE LLJJJJ;
    public C1014370cVH LLJJJJJIL;
    public final boolean LLJJJJLIIL;
    public Map<String, View.OnLayoutChangeListener> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(483));
    public String LLJILLL = "normal";

    @Override // X.InterfaceC1007930cKt
    public void Ck(Function1<? super Boolean, Unit> function1) {
    }

    @Override // X.InterfaceC1007930cKt
    public boolean Hk() {
        return false;
    }

    @Override // X.InterfaceC1007930cKt
    public boolean Jk() {
        return false;
    }

    @Override // X.InterfaceC1007930cKt
    public void LJFF() {
    }

    public boolean LJIILJJIL() {
        return this instanceof C1021130cgB;
    }

    public void LJIILL() {
    }

    @Override // X.InterfaceC1007930cKt
    public void Mk(AbstractC1003980cEW abstractC1003980cEW) {
    }

    @Override // X.InterfaceC1007930cKt
    public void clear() {
    }

    @Override // X.InterfaceC1007930cKt
    public abstract C1014500cVU isReady();

    @Override // X.InterfaceC1007930cKt
    public final boolean Ek() {
        return this.LLJJIII != null;
    }

    @Override // X.InterfaceC1007930cKt
    public void LIZ() {
        String str;
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentRelationModel> map;
        AnoleComponentRelationModel anoleComponentRelationModel;
        List<AnoleComponentAppearModel> list;
        if (this.LLJI != null && this.LLJ > 0) {
            C1014500cVU c1014500cVUIsReady = isReady();
            if (!c1014500cVUIsReady.LIZ) {
                LJIILL();
                LJIIIIZZ(c1014500cVUIsReady.LIZIZ);
            }
        }
        Object obj = this.LLILLJJLI.LIZJ;
        String str2 = null;
        if (!(obj instanceof Aweme) || (aweme = (Aweme) obj) == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (anoleModel = awemeRawAd.getAnoleModel()) == null || (map = anoleModel.componentRelations) == null || (anoleComponentRelationModel = map.get(this.LL.type)) == null || (list = anoleComponentRelationModel.showModels) == null) {
            LJIJI();
        } else {
            Iterator<AnoleComponentAppearModel> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AnoleComponentAppearModel next = it2.next();
                if (Intrinsics.LJFF(next.type, EnumC1008360cLa.MOUNT.getType())) {
                    if (next == null) {
                        break;
                    }
                }
            }
            LJIJI();
        }
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str2 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LJIIIIZZ, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str2, 2));
        }
    }

    public final C1015310cWn LJIIIZ() {
        return (C1015310cWn) this.LLJL.getValue();
    }

    public final C1014660cVk LJIIJ() {
        return (C1014660cVk) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final Handler LJIIJJI() {
        return (Handler) this.LLJIJIL.getValue();
    }

    public final void LJIIZILJ() {
        InterfaceC1014340cVE interfaceC1014340cVE;
        if (this.LLILZIL) {
            C1014260cV6.LJIIJ(this);
            this.LLILZIL = false;
            View viewLJIIL = LJIIL();
            if (viewLJIIL != null) {
                C786410Ut5.LJLLLLLL(8, viewLJIIL);
                C1014320cVC.LIZLLL(viewLJIIL);
            }
            this.LLIZ++;
            InterfaceC1014340cVE interfaceC1014340cVE2 = this.LLJJJJ;
            if (interfaceC1014340cVE2 != null) {
                interfaceC1014340cVE2.LJJJIL();
            }
            AnoleComponentLayoutModel anoleComponentLayoutModel = this.LL.layout;
            if (anoleComponentLayoutModel == null || !C1014320cVC.LIZ(anoleComponentLayoutModel.left) || (interfaceC1014340cVE = this.LLJJJJ) == null) {
                return;
            }
            interfaceC1014340cVE.LJI(this.LL.slotID, 0, null, null, null);
        }
    }

    public void LJIJI() {
        AnimatorSet animatorSet = this.LLJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJJIL = null;
        View view = this.LLJJIJIL;
        if (view != null) {
            C1014320cVC.LIZLLL(view);
        }
        C1014310cVB c1014310cVB = this.LLJJIJIIJIL;
        if (c1014310cVB != null) {
            C1014320cVC.LIZLLL(c1014310cVB);
        }
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null && viewGroup.getChildCount() == 0) {
            C786410Ut5.LJLZ(8, viewGroup);
        }
        LJIIZILJ();
        C1014260cV6.LJIIJ(this);
        this.LLJJJ = null;
        this.LLILZLL = 0;
        this.LLIZ = 0;
        if (C009O.COMPONENTUNMOUNT.shouldReset(this.LL.skipCountResetStrategy)) {
            this.LLIZLLLIL = 0;
        }
        ARunnableS85S0200000_16 aRunnableS85S0200000_16 = this.LLJILJILJ;
        if (aRunnableS85S0200000_16 != null) {
            C786410Ut5.LJJZZIII(LJIIJJI(), aRunnableS85S0200000_16);
        }
        LJIJJ();
    }

    public final void LJIJJ() {
        this.LLJ = 0L;
        this.LLJI = null;
        ARunnableS116S0100000_16 aRunnableS116S0100000_16 = this.LLJILJIL;
        if (aRunnableS116S0100000_16 != null) {
            LJIIJJI().removeCallbacks(aRunnableS116S0100000_16);
        }
        this.LLJILJIL = null;
        LJIILL();
    }

    public final void LJIJJLI() {
        AnoleComponentAppearModel anoleComponentAppearModel = this.LLJI;
        if (anoleComponentAppearModel == null || this.LLJ <= 0) {
            LJIILL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("waiting_show, tryShowForWaiting return, !hasWaitingShow, waitingShowModel:");
            sbLIZ.append(this.LLJI);
            sbLIZ.append(", waitingShowTimestamp:");
            sbLIZ.append(this.LLJ);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (isReady().LIZ) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = anoleComponentAppearModel.waitTimeout;
            if (j == -1 || jCurrentTimeMillis <= this.LLJ + j) {
                Nk(anoleComponentAppearModel);
                LJIILL();
                return;
            }
            LJIILL();
            LJIIIIZZ("exceed_max_wait");
            LJIILL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("waitingShowTimestamp ");
            sbLIZ2.append(jCurrentTimeMillis - this.LLJ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
    }

    @Override // X.InterfaceC1007930cKt
    public final void Lk() {
        this.LLIZLLLIL++;
    }

    @Override // X.InterfaceC1007930cKt
    public final Map<String, Object> getData() {
        Map<String, ? extends Object> map = this.LL.data;
        if (map != null) {
            return new LinkedHashMap(map);
        }
        return null;
    }

    @Override // X.InterfaceC1007930cKt
    public final String getType() {
        return this.LL.type;
    }

    @Override // X.InterfaceC1007930cKt
    public void LIZJ() {
        String str;
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            String str2 = null;
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str2 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LIZLLL, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str2, 0));
        }
    }

    @Override // X.InterfaceC1007930cKt
    public void LJ() {
        String str;
        String str2;
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str2 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
                str2 = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LJIIIZ, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str2, 4));
        }
        LJIJI();
        LJIL(false);
        ViewGroup viewGroup = this.LLJJIJI;
        if (viewGroup != null) {
            C786410Ut5.LJJJLZIJ(this.LLJJIII, viewGroup);
        }
        this.LLJJIJI = null;
        this.LLJJIII = null;
        this.LLJJIJIIJIL = null;
        this.LLJJJJ = null;
        LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unmount, component_hash: ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final View LJIIL() {
        LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fadingEdges is null -> ");
        sbLIZ.append(this.LL.fadingEdges == null);
        C2188811AlT.LIZIZ(sbLIZ);
        C1014310cVB c1014310cVB = this.LLJJIJIIJIL;
        return c1014310cVB == null ? this.LLJJIJIL : c1014310cVB;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(r2.getClass().getSimpleName(), "SearchResultActivity") == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.Activity getActivity() {
        /*
            r4 = this;
            android.app.Activity r2 = com.ss.android.ugc.aweme.utils.ActivityStack.getTopActivity()
            r3 = 0
            if (r2 == 0) goto L81
            boolean r0 = r2 instanceof X.C19EG
            if (r0 == 0) goto L81
            X.19EG r2 = (X.C19EG) r2
            if (r2 == 0) goto L81
            boolean r0 = X.C296200BjG.LIZ()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1058560deY.LIZ(r2)
        L19:
            if (r0 == 0) goto L40
            boolean r1 = r0.kh2(r2)
            r0 = 1
            if (r1 != r0) goto L40
        L22:
            r4.LJIILL()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getActivity() is this = "
            r1.append(r0)
            r1.append(r2)
            X.C2188811AlT.LIZIZ(r1)
            return r2
        L35:
            com.ss.android.ugc.aweme.scope.MainActivityScope r0 = X.C0S4U.LIZJ(r2)
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.base.MainBusinessAbility r0 = X.C1058560deY.LIZIZ(r0)
            goto L19
        L40:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "RewardAdActivity"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L22
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "SeriesInnerFeedActivity"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L22
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "DetailActivity"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L22
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = r0.getSimpleName()
            java.lang.String r0 = "SearchResultActivity"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L81
            goto L22
        L81:
            r4.LJIILL()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1014240cV4.getActivity():android.app.Activity");
    }

    @Override // X.InterfaceC1007930cKt
    public final AnoleComponentModel Ak() {
        return this.LL;
    }

    public boolean LJIILIIL() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1007930cKt
    public View getContentView() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC1007930cKt
    public final boolean Bk(AnoleComponentAppearModel anoleComponentAppearModel) {
        int iIntValue;
        Integer skipCount = anoleComponentAppearModel.getSkipCount();
        if (skipCount != null && (iIntValue = skipCount.intValue()) > 0 && this.LLIZLLLIL < iIntValue) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1007930cKt
    public void Dk(AnoleComponentAppearModel anoleComponentAppearModel) {
        View viewLJIIL;
        ViewGroup viewGroup;
        if (!this.LLILZIL || (viewLJIIL = LJIIL()) == null || (viewGroup = this.LLJJIII) == null) {
            return;
        }
        AnimatorSet animatorSet = this.LLJJJIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLJJJIL = null;
        if (C1016660cYy.LIZJ(anoleComponentAppearModel)) {
            HandlerHook.viewPost(viewGroup, new ARunnableS24S0400000_16(viewLJIIL, viewGroup, anoleComponentAppearModel, this, 4));
        } else {
            LJIIZILJ();
        }
        this.LLILLL.LJIJ(C991620bua.LIZ, this);
        LJIILLIIL(anoleComponentAppearModel);
        C1014280cV8.LIZ(anoleComponentAppearModel.actions, this.LLILLL);
        LJIILL();
    }

    @Override // X.InterfaceC1007930cKt
    public final boolean Gk(AnoleComponentAppearModel anoleComponentAppearModel) {
        Integer repeatCount = anoleComponentAppearModel.getRepeatCount();
        if (repeatCount == null) {
            return false;
        }
        if (this.LLIZ < repeatCount.intValue()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1007930cKt
    public final void Ik(EnumC586190Myv enumC586190Myv) {
        C1014650cVj.LIZ(this, enumC586190Myv.getFailReason(), this.LLILLL.Z2());
        LJIILL();
    }

    @Override // X.InterfaceC1007930cKt
    public final boolean Kk(AnoleComponentAppearModel anoleComponentAppearModel) {
        Integer repeatCount = anoleComponentAppearModel.getRepeatCount();
        if (repeatCount == null) {
            return false;
        }
        if (this.LLILZLL < repeatCount.intValue()) {
            return false;
        }
        return true;
    }

    public void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        String str;
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        String str2 = null;
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str2 = c1014490cVTLIZ.LIZ;
                str = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LJII, new AwS29S2200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str2, str, 1));
        }
        LJIL(false);
        this.LLILLL.LJIJ(C991690buh.LIZ, this);
        LJIILLIIL(anoleComponentAppearModel);
        InterfaceC1014340cVE interfaceC1014340cVE = this.LLJJJJ;
        if (interfaceC1014340cVE != null) {
            interfaceC1014340cVE.LIZIZ();
        }
        this.LLILZLL++;
        C1014280cV8.LIZ(anoleComponentAppearModel.actions, this.LLILLL);
        C1014660cVk c1014660cVkLJIIJ = LJIIJ();
        if (LJIILIIL()) {
            String tag = c1014660cVkLJIIJ.LIZIZ.getTag();
            String refer = c1014660cVkLJIIJ.LIZIZ.getRefer();
            if (tag != null && tag.length() != 0 && refer != null && refer.length() != 0) {
                C1014210cV1 c1014210cV1 = C1014210cV1.LIZ;
                C1014200cV0.LIZ.getClass();
                C1023960ckk c1023960ckkLIZJ = C1023500ck0.LIZJ(tag, "othershow", refer, new InterfaceC1023650ckF[]{c1014210cV1.LJI(C1014200cV0.LIZJ, C1014200cV0.LIZIZ)});
                if (c1023960ckkLIZJ != null) {
                    c1014660cVkLJIIJ.logAd(c1023960ckkLIZJ, new AwS595S0100000_16(c1014660cVkLJIIJ, 371));
                }
            }
        } else {
            c1014660cVkLJIIJ.getClass();
        }
        LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show success, component_hash: ");
        sbLIZ.append(hashCode());
        sbLIZ.append(" didShow time ");
        sbLIZ.append(System.currentTimeMillis());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public void LJIIIIZZ(String str) {
        LJIL(false);
        this.LLILLL.LJIJ(new C991300bu4(str), this);
        C1014660cVk c1014660cVkLJIIJ = LJIIJ();
        if (LJIILJJIL()) {
            C1023960ckk c1023960ckkLJIIIIZZ = C1014210cV1.LJIIIIZZ(c1014660cVkLJIIJ.LIZIZ.getTag(), c1014660cVkLJIIJ.LIZIZ.getRefer());
            if (c1023960ckkLJIIIIZZ != null) {
                c1014660cVkLJIIJ.logAd(c1023960ckkLJIIIIZZ, new AwS130S1100000_16(c1014660cVkLJIIJ, str, 22));
            }
        } else {
            c1014660cVkLJIIJ.getClass();
        }
        InterfaceC1014340cVE interfaceC1014340cVE = this.LLJJJJ;
        if (interfaceC1014340cVE != null) {
            interfaceC1014340cVE.LIZJ();
        }
        this.LLILZLL++;
        if (((Boolean) C0AR5.LIZ.getValue()).booleanValue()) {
            LJIJJ();
        }
    }

    public final void LJIILLIIL(AnoleComponentAppearModel anoleComponentAppearModel) {
        List list = anoleComponentAppearModel.showBusinessComponents;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        List list2 = anoleComponentAppearModel.hideBusinessComponents;
        if (list2 == null) {
            list2 = C13BV.INSTANCE;
        }
        if (list.isEmpty() && list2.isEmpty()) {
            return;
        }
        this.LLILLL.LJIJ(new C989590brJ(new C1009100cMm(list, list2)), this);
    }

    public final void LJIJ(View view) {
        if (Intrinsics.LJFF(this.LL.scene, "carousel")) {
            return;
        }
        C1008990cMb c1008990cMb = EnumC1008920cMU.Companion;
        String str = this.LL.type;
        c1008990cMb.getClass();
        if (C1008990cMb.LIZ(str)) {
            return;
        }
        this.LLILLL.LJIJ(new C989540brE(view), this);
    }

    public final void LJIL(boolean z) {
        Integer containerPlaceholderBackGroundColor;
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null && (containerPlaceholderBackGroundColor = this.LL.getContainerPlaceholderBackGroundColor()) != null) {
            int iIntValue = containerPlaceholderBackGroundColor.intValue();
            if (z) {
                viewGroup.setBackgroundColor(iIntValue);
            } else {
                viewGroup.setBackgroundColor(0);
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    @Override // X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Nk(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r16) {
        /*
            Method dump skipped, instruction units count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1014240cV4.Nk(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel):void");
    }

    @Override // X.InterfaceC1007930cKt
    public void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        ViewParent parent;
        ViewGroup viewGroup2;
        Object tag;
        String str;
        this.LLJJIII = viewGroup;
        String str2 = null;
        if (viewGroup != null) {
            parent = viewGroup.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = null;
        }
        this.LLJJIJI = viewGroup2;
        this.LLJJJJ = interfaceC1014340cVE;
        LJIL(true);
        LJIILL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mount, containerView.tag:");
        if (viewGroup != null) {
            tag = viewGroup.getTag();
        } else {
            tag = null;
        }
        sbLIZ.append(tag);
        sbLIZ.append(", component_hash: ");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        C1015310cWn c1015310cWnLJIIIZ = LJIIIZ();
        AnoleComponentModel anoleComponentModel = this.LL;
        c1015310cWnLJIIIZ.getClass();
        if (C298290Bmd.LIZ()) {
            C1014250cV5.LIZ.getClass();
            C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
            if (c1014490cVTLIZ != null) {
                str = c1014490cVTLIZ.LIZ;
                str2 = c1014490cVTLIZ.LIZIZ;
            } else {
                str = null;
            }
            C2275901E6i.LIZ.getClass();
            c1015310cWnLJIIIZ.logAd(C2275901E6i.LIZIZ, new AwS6S3200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str, str2, 1));
        }
    }

    public AbstractC1014240cV4(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        this.LL = anoleComponentModel;
        this.LLILLJJLI = c1009340cNA;
        this.LLILLL = interfaceC1014270cV7;
        this.LLILZ = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnoleComponent,type:");
        sbLIZ.append(anoleComponentModel.type);
        this.LLJJ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJJJLIIL = true;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 907));
        this.LLJL = C452501pT.LIZIZ(new C1015370cWt(this));
    }
}
