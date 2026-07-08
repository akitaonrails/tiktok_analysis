package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS100S1200000_16;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.AwS165S1100000_16;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.AwS81S1300000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dSl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1051250dSl extends IAdHybridCustomLoader implements InterfaceC1051270dSn {
    public static final C1051350dSv Companion = new Object() { // from class: X.0dSv
    };
    public static final HashMap<String, Boolean> isBizRegister = new HashMap<>();
    public Context context;
    public C1028380crs hybridContainerOption;
    public InterfaceC1051190dSf iAdHybridLoadStatus;
    public boolean isFromPre;
    public boolean isLoadFailed;
    public boolean isPreRenderLoadFailed;
    public boolean isPreloadSuccess;
    public volatile Function0<Unit> pendingReleaseCacheKeysTask;
    public final AbstractC1542100qES preRenderLoadCallback;
    public final AbstractC1542100qES preRenderLoadCallbackInner;
    public C1542120qEU preRenderLoadFailedReason;
    public C1051290dSp renderHybridOption;
    public final AbstractC1542100qES renderLoadCallback;
    public final AbstractC1542100qES renderLoadCallbackInner;
    public String scene;
    public InterfaceC2217701Bqy sparkActivityCallback;
    public volatile InterfaceC1051160dSc sparkMixture;
    public InterfaceC1036150d4P sparkRootContainer;
    public InterfaceC1892990zMP sparkTitleBarProvider;
    public InterfaceC1056670dbV sparkViewProvider;
    public List<SparkContext> preRenderContextCache = Collections.synchronizedList(new ArrayList());
    public final C01GW mainScope$delegate = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(136));
    public volatile EnumC1051280dSo renderState = EnumC1051280dSo.LL;

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowFailed(String str, String str2) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onShowSuccess() {
    }

    public void preDecodeIfNeed(SparkContext sparkContext) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registAdWebFragmentViewProvider(InterfaceC1036870d5Z interfaceC1036870d5Z) {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void close() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.close();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void destroy() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.destroy();
        }
    }

    public final InterfaceC497601wk getMainScope() {
        return (InterfaceC497601wk) this.mainScope$delegate.getValue();
    }

    public final String getScene() {
        String str = this.scene;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final void handlePendingReleaseCacheKeys() {
        if (((Boolean) C1051600dTK.LJIIJ.getValue()).booleanValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handlePendingReleaseCacheKeys ");
            sbLIZ.append(this.pendingReleaseCacheKeysTask != null);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(getTag());
            Function0<Unit> function0 = this.pendingReleaseCacheKeysTask;
            if (function0 != null) {
                function0.invoke();
            }
            this.pendingReleaseCacheKeysTask = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onHide() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.onHide();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void refresh() {
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null) {
            interfaceC1051160dSc.refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCache() {
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        C1537060q6K.LJIILL(getScene());
        isBizRegister.remove(getScene());
    }

    public AbstractC1051250dSl() {
        C1077560e9C c1077560e9C = new C1077560e9C(this, 3);
        this.renderLoadCallbackInner = c1077560e9C;
        this.renderLoadCallback = wrapLoadCallbackOnMainIfNeed(c1077560e9C);
        C1077560e9C c1077560e9C2 = new C1077560e9C(this, 2);
        this.preRenderLoadCallbackInner = c1077560e9C2;
        this.preRenderLoadCallback = wrapLoadCallbackOnMainIfNeed(c1077560e9C2);
    }

    public final InterfaceC1051160dSc getSparkMixture() {
        return this.sparkMixture;
    }

    public final boolean isPreloadSuccess() {
        return this.isPreloadSuccess;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public boolean isRendering() {
        return this.isPreloadSuccess;
    }

    private final AbstractC1542100qES wrapLoadCallbackOnMainIfNeed(final AbstractC1542100qES abstractC1542100qES) {
        return new AbstractC1542100qES() { // from class: X.0dSw
            @Override // X.AbstractC1537870q7d
            public final void LJLIIIL(InterfaceC1541990qEH interfaceC1541990qEH) {
                LJLLLL(new AwS417S0200000_16(abstractC1542100qES, interfaceC1541990qEH, 11));
            }

            public final void LJLLLL(Function0<Unit> function0) {
                if (!((Boolean) C1051600dTK.LJFF.getValue()).booleanValue() && !((Boolean) C1051600dTK.LJI.getValue()).booleanValue()) {
                    function0.invoke();
                    return;
                }
                InterfaceC497601wk mainScope = this.getMainScope();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(mainScope, C2107308Nj.LIZ.LLIILII(), null, new C01RK(function0, null), 2);
            }

            @Override // X.AbstractC1537870q7d
            public final void LJLIIL(InterfaceC1541990qEH interfaceC1541990qEH, String str) {
                LJLLLL(new AwS132S1200000_16(abstractC1542100qES, interfaceC1541990qEH, str, 2));
            }

            @Override // X.AbstractC1537870q7d
            public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) {
                LJLLLL(new AwS81S1300000_16(abstractC1542100qES, interfaceC1541990qEH, str, c1542120qEU, 0));
            }
        };
    }

    public final C1051340dSu buildSparkInitParam(C1051290dSp c1051290dSp) {
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY == null || (c1049260dPY.LJIIIZ == null && (c1049260dPY == null || c1049260dPY.LJIIJ == null))) {
            return null;
        }
        return new C1051340dSu(new C1077530e99(c1051290dSp, 0));
    }

    public final long getOrDefault(Long l) {
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityCallback(final C1ER0 c1er0) {
        C1051410dT1.LIZ.getClass();
        this.sparkActivityCallback = new InterfaceC2217701Bqy() { // from class: X.1EQz
            @Override // X.InterfaceC2217701Bqy
            public final void LJIILLIIL(boolean z) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC2217701Bqy
            public final void finish() {
                c1er0.finish();
            }

            @Override // X.InterfaceC2217701Bqy
            public final Context LIZJ(Context context) {
                c1er0.LIZJ(context);
                return context;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJI(SparkActivity sparkActivity) {
                c1er0.LIZLLL();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIJZLJL(SparkActivity sparkActivity) {
                c1er0.LJFF();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIJIIJI(SparkActivity sparkActivity) {
                c1er0.LJ();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJ(SparkActivity sparkActivity) {
                c1er0.onContentChanged();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJ(SparkActivity sparkActivity) {
                c1er0.onActivityPostPaused(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJLL(SparkActivity sparkActivity) {
                c1er0.onActivityPostDestroyed(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJZI(SparkActivity sparkActivity) {
                c1er0.LJI();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJI(SparkActivity sparkActivity) {
                c1er0.LJII();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJJIZ(SparkActivity sparkActivity) {
                c1er0.onActivityPostResumed(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final boolean LJJLIIIJLLLLLLLZ(SparkActivity sparkActivity) {
                c1er0.onBackPressed();
                return false;
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLJLI(SparkActivity sparkActivity) {
                c1er0.LJIIIZ();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLL(SparkActivity sparkActivity) {
                c1er0.LJIIIIZZ();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onRestoreInstanceState(Bundle bundle) {
                c1er0.LJJI();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJIL(Activity activity, Context context) {
                c1er0.LJIIL();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIII(SparkActivity sparkActivity, boolean z) {
                c1er0.LJJ();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIIZI(SparkActivity sparkActivity, Bundle bundle) {
                c1er0.LJJIFFI(sparkActivity);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIL(SparkActivity sparkActivity, Bundle bundle) {
                c1er0.LJIJI();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJJJJL(SparkActivity sparkActivity, Configuration configuration) {
                c1er0.onConfigurationChanged(sparkActivity, configuration);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIIJL(SparkActivity sparkActivity, Bundle bundle) {
                c1er0.LJIILIIL();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJLIIJ(SparkActivity sparkActivity, Bundle bundle) {
                c1er0.LJIIJJI();
            }

            @Override // X.InterfaceC2217701Bqy
            public final void onActivityResult(int i, int i2, Intent intent) {
                c1er0.onActivityResult(i, i2, intent);
            }

            @Override // X.InterfaceC2217701Bqy
            public final void LJJIZ(SparkActivity sparkActivity, int i, String[] strArr, int[] iArr) {
                c1er0.LJJII(sparkActivity, i, strArr, iArr);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerActivityRootViewProvider(final InterfaceC1051330dSt interfaceC1051330dSt) {
        C1051410dT1.LIZ.getClass();
        this.sparkViewProvider = new InterfaceC1056670dbV() { // from class: X.0dSs
            @Override // X.InterfaceC1163130gND
            public final void release() {
            }

            @Override // X.InterfaceC1056670dbV
            public final ViewGroup LJIILIIL() {
                interfaceC1051330dSt.LJIILIIL();
                return null;
            }

            @Override // X.InterfaceC1056670dbV
            public final ViewGroup LJIJJ() {
                return interfaceC1051330dSt.LJIJJ();
            }

            @Override // X.InterfaceC1056670dbV
            public final int LJJIJ() {
                interfaceC1051330dSt.LJIJJLI();
                return R.id.vs5;
            }

            @Override // X.InterfaceC1056670dbV
            public final View LJIILJJIL(Context context) {
                return interfaceC1051330dSt.LJIILJJIL(context);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerHybridRootContainer(InterfaceC1036150d4P interfaceC1036150d4P) {
        this.sparkRootContainer = interfaceC1036150d4P;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void registerTitleBarProvider(final AbstractC1067720dtK abstractC1067720dtK) {
        C1051410dT1.LIZ.getClass();
        this.sparkTitleBarProvider = new InterfaceC1892990zMP() { // from class: X.0dtH
            @Override // X.InterfaceC1892990zMP
            public final void LJJII(boolean z) {
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJJLIIIJ(boolean z) {
            }

            @Override // X.InterfaceC1892990zMP
            public final void setSubTitle(String str) {
            }

            @Override // X.InterfaceC1163130gND
            public final void release() {
                abstractC1067720dtK.getClass();
            }

            @Override // X.InterfaceC1892990zMP
            public final View LJFF(Context context) {
                return abstractC1067720dtK.LIZ(context);
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJIILL(int i) {
                abstractC1067720dtK.LJII(i);
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJJIFFI(EnumC1067700dtI enumC1067700dtI) {
                String str;
                int i = C1067680dtG.LIZ[enumC1067700dtI.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    str = "";
                                } else {
                                    throw new C1954807lC();
                                }
                            } else {
                                str = "more";
                            }
                        } else {
                            str = "report";
                        }
                    } else {
                        str = "share";
                    }
                } else {
                    str = "collect";
                }
                abstractC1067720dtK.LJ(str);
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJJIJLIJ(SpannableString spannableString) {
                spannableString.toString();
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJJJI(int i) {
                abstractC1067720dtK.LJI(i);
            }

            @Override // X.InterfaceC1892990zMP
            public final void LJJJJ(boolean z) {
                abstractC1067720dtK.LIZJ(z);
            }

            @Override // X.InterfaceC1892990zMP
            public final void setBackClickListener(View.OnClickListener onClickListener) {
                abstractC1067720dtK.LIZIZ(onClickListener);
            }

            @Override // X.InterfaceC1892990zMP
            public final void setCloseAllClickListener(View.OnClickListener onClickListener) {
                abstractC1067720dtK.LIZLLL(onClickListener);
            }

            @Override // X.InterfaceC1892990zMP
            public final void setTitle(String str) {
                abstractC1067720dtK.LJFF(str);
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void releaseCacheWithKey(String str) {
        InterfaceC1051160dSc interfaceC1051160dSc;
        C1051290dSp c1051290dSp;
        if (((Boolean) C1051600dTK.LJIIJ.getValue()).booleanValue() && (c1051290dSp = this.renderHybridOption) != null && c1051290dSp.LJIIIIZZ && this.renderState == EnumC1051280dSo.LLILLJJLI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("releaseCacheWithKey skipped - render state is LOADING, cacheKey: ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C811103Ev.LIZ(getTag());
            this.pendingReleaseCacheKeysTask = new AwS165S1100000_16(this, str, 11);
            return;
        }
        if (((Boolean) C1051710dTV.LIZIZ.getValue()).booleanValue()) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            if (!C1537060q6K.LIZ(getScene(), str) && (interfaceC1051160dSc = this.sparkMixture) != null) {
                interfaceC1051160dSc.release();
            }
        }
        C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
        C1537060q6K.LIZIZ(str, getScene(), null);
        if (((Boolean) C1051710dTV.LIZJ.getValue()).booleanValue()) {
            Iterator<SparkContext> it2 = this.preRenderContextCache.iterator();
            while (it2.hasNext()) {
                it2.next().LJJIFFI();
            }
            this.preRenderContextCache.clear();
            C811103Ev.LIZ(getTag());
        }
        this.renderState = EnumC1051280dSo.LL;
        C811103Ev.LIZ(getTag());
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderFullScreen(C1051290dSp c1051290dSp) {
        String str;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null) {
            String str2 = c1049260dPY.LIZLLL;
            C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
            Context context = this.context;
            if (context == null) {
                context = null;
            }
            this.sparkMixture = createSparkMixture(C1051410dT1.LIZLLL(c1051410dT1, context, str, str2, c1049260dPY.LIZJ, c1049260dPY.LJ, c1049260dPY.LIZ, this.sparkActivityCallback, this.sparkTitleBarProvider, this.sparkViewProvider, null, c1051290dSp.LJII, 512), null);
        }
    }

    public final void setPreloadSuccess(boolean z) {
        this.isPreloadSuccess = z;
    }

    public final void setScene(String str) {
        this.scene = str;
    }

    public final void setSparkMixture(InterfaceC1051160dSc interfaceC1051160dSc) {
        this.sparkMixture = interfaceC1051160dSc;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void updateGlobalProps(Map<String, ? extends Object> map) {
        InterfaceC1541990qEH kitView;
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null && (kitView = interfaceC1051160dSc.getKitView()) != null) {
            kitView.U0(map);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void initialize(String str, Context context) {
        this.context = context;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getTag());
        sbLIZ.append('_');
        sbLIZ.append(str);
        setScene(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void notifyFE(String str, JSONObject jSONObject) {
        boolean z;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sparkMixture is empty = ");
        boolean z3 = true;
        if (this.sparkMixture == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ(getTag());
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sparkView is empty = ");
        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
        if (interfaceC1051160dSc != null && interfaceC1051160dSc.getView() != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        sbLIZ2.append(z2);
        C2188811AlT.LIZIZ(sbLIZ2);
        C811103Ev.LIZ(getTag());
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("KitView is empty = ");
        InterfaceC1051160dSc interfaceC1051160dSc2 = this.sparkMixture;
        if (interfaceC1051160dSc2 != null && interfaceC1051160dSc2.getKitView() != null) {
            z3 = false;
        }
        sbLIZ3.append(z3);
        C2188811AlT.LIZIZ(sbLIZ3);
        C811103Ev.LIZ(getTag());
        InterfaceC1051160dSc interfaceC1051160dSc3 = this.sparkMixture;
        if (interfaceC1051160dSc3 != null) {
            interfaceC1051160dSc3.LIZ(str, jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onPreRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp) {
        String str;
        InterfaceC1020440cf4 interfaceC1020440cf4;
        boolean zLJI = MethodIDManager.LJI(71828);
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null) {
            String str2 = c1049260dPY.LIZLLL;
            HashMap<String, Boolean> map = isBizRegister;
            Boolean bool = map.get(getScene());
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                map.put(getScene(), bool2);
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LJIIL(getPrerenderConfig(c1051290dSp), Boolean.FALSE);
            }
            Context context = this.context;
            Bundle bundle = null;
            if (context == null) {
                context = null;
            }
            C1049260dPY c1049260dPY2 = c1051290dSp.LJFF;
            if (c1049260dPY2 != null) {
                bundle = c1049260dPY2.LIZJ;
                interfaceC1020440cf4 = c1049260dPY2.LJ;
            } else {
                interfaceC1020440cf4 = null;
            }
            AdSparkHybridContext adSparkHybridContextCreateAdSparkContext = createAdSparkContext(context, str, str2, bundle, interfaceC1020440cf4, getScene(), buildSparkInitParam(c1051290dSp));
            adSparkHybridContextCreateAdSparkContext.LJJLJ(this.preRenderLoadCallback);
            this.preRenderContextCache.add(adSparkHybridContextCreateAdSparkContext);
            if (this.renderState == EnumC1051280dSo.LL) {
                this.renderState = EnumC1051280dSo.LLILLJJLI;
            }
            preDecodeIfNeed(adSparkHybridContextCreateAdSparkContext);
            C1537060q6K.LJIIJJI(C1529590puH.LIZ, c1051290dSp.LIZIZ, getScene(), adSparkHybridContextCreateAdSparkContext, new C1537070q6L() { // from class: X.0dSq
                @Override // X.C1537070q6L
                public final void LIZJ(String str3, String str4, C1537080q6M c1537080q6M) {
                }

                @Override // X.C1537070q6L
                public final void LIZLLL(String str3, String str4, InterfaceC1105930esx interfaceC1105930esx) {
                }
            }, true, null, 32);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void renderPopup(C1051290dSp c1051290dSp, InterfaceC1051480dT8 interfaceC1051480dT8) {
        String str;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null) {
            String str2 = c1049260dPY.LIZLLL;
            C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
            Context context = this.context;
            if (context == null) {
                context = null;
            }
            this.sparkMixture = createSparkMixture(C1051410dT1.LIZLLL(c1051410dT1, context, str, str2, c1049260dPY.LIZJ, c1049260dPY.LJ, c1049260dPY.LIZ, this.sparkActivityCallback, this.sparkTitleBarProvider, this.sparkViewProvider, interfaceC1051480dT8, false, 1024), null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void router(Context context, String str) {
        SmartRouter.buildRoute(context, str).open();
    }

    public final void tryRegisterLynxSSRCallback(SparkContext sparkContext, final C1051290dSp c1051290dSp) {
        C1049260dPY c1049260dPY;
        InterfaceC1541990qEH interfaceC1541990qEHLJIJJ;
        C1537480q70 hybridContext;
        C1539580qAO c1539580qAO;
        if (c1051290dSp != null && (c1049260dPY = c1051290dSp.LJFF) != null && c1049260dPY.LJIIIZ != null && (interfaceC1541990qEHLJIJJ = sparkContext.LJIJJ()) != null && (hybridContext = interfaceC1541990qEHLJIJJ.getHybridContext()) != null && (c1539580qAO = (C1539580qAO) hybridContext.LJFF(C1539580qAO.class)) != null) {
            c1539580qAO.LJIIJ = C13LP.LJLILLLLZI(new InterfaceC1539930qAx() { // from class: X.0cu3
                @Override // X.InterfaceC1539930qAx
                public final void LIZ(EnumC1539690qAZ enumC1539690qAZ) {
                    C1049260dPY c1049260dPY2;
                    C1009380cNE c1009380cNE;
                    InterfaceC1015070cWP interfaceC1015070cWP;
                    C1051290dSp c1051290dSp2 = c1051290dSp;
                    if (c1051290dSp2 != null && (c1049260dPY2 = c1051290dSp2.LJFF) != null && (c1009380cNE = c1049260dPY2.LJIIIZ) != null && (interfaceC1015070cWP = c1009380cNE.LIZIZ) != null) {
                        interfaceC1015070cWP.LIZ(enumC1539690qAZ);
                    }
                }
            }, c1539580qAO.LJIIJ);
        }
    }

    private final <T> void optimizeTaskExecute(boolean z, Function0<? extends T> function0, Function1<? super T, Unit> function1) {
        if (((Boolean) C1051600dTK.LJFF.getValue()).booleanValue() && z) {
            C23250099c.LIZLLL(getMainScope(), C0PEM.LIZJ, null, new C01RH(null, function0, function1), 2);
            return;
        }
        if (((Boolean) C1051600dTK.LJI.getValue()).booleanValue() && z) {
            InterfaceC497601wk mainScope = getMainScope();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(mainScope, C2107308Nj.LIZ.LLIILII(), null, new C01RI(null, function0, function1), 2);
            return;
        }
        function1.invoke(function0.invoke());
    }

    private final void renderAndCache(C1051290dSp c1051290dSp, String str, Bundle bundle) {
        String str2;
        String str3;
        InterfaceC1020440cf4 interfaceC1020440cf4;
        String str4;
        SparkContext sparkContextLLIILZL;
        SparkContext sparkContextLLIILZL2;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str2 = c1049260dPY.LIZIZ) != null && (str3 = c1049260dPY.LIZLLL) != null) {
            HashMap<String, Boolean> map = isBizRegister;
            Boolean bool = map.get(getScene());
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.LJFF(bool, bool2)) {
                map.put(getScene(), bool2);
                C1537060q6K c1537060q6K = C1529590puH.LIZ;
                C1537060q6K.LJIIL(getPrerenderConfig(c1051290dSp), Boolean.FALSE);
            }
            C1537060q6K c1537060q6K2 = C1529590puH.LIZ;
            String str5 = c1051290dSp.LIZIZ;
            String scene = getScene();
            Context context = this.context;
            Bundle bundle2 = null;
            if (context == null) {
                context = null;
            }
            C1049260dPY c1049260dPY2 = c1051290dSp.LJFF;
            if (c1049260dPY2 != null) {
                bundle2 = c1049260dPY2.LIZJ;
                interfaceC1020440cf4 = c1049260dPY2.LJ;
            } else {
                interfaceC1020440cf4 = null;
            }
            AdSparkHybridContext adSparkHybridContextCreateAdSparkContext = createAdSparkContext(context, str2, str3, bundle2, interfaceC1020440cf4, getScene(), buildSparkInitParam(c1051290dSp));
            adSparkHybridContextCreateAdSparkContext.LJJLJ(this.preRenderLoadCallback);
            this.preRenderContextCache.add(adSparkHybridContextCreateAdSparkContext);
            InterfaceC1020440cf4 interfaceC1020440cf42 = null;
            String str6 = null;
            C1537060q6K.LJIIJJI(c1537060q6K2, str5, scene, adSparkHybridContextCreateAdSparkContext, new C1537070q6L() { // from class: X.0dSr
                @Override // X.C1537070q6L
                public final void LIZJ(String str7, String str8, C1537080q6M c1537080q6M) {
                }

                @Override // X.C1537070q6L
                public final void LIZLLL(String str7, String str8, InterfaceC1105930esx interfaceC1105930esx) {
                }
            }, true, null, 32);
            C301090Br9.LIZIZ(new AwS165S1100000_16(this, str, 12));
            Context context2 = this.context;
            if (context2 == null) {
                context2 = null;
            }
            InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context2, c1051290dSp.LIZIZ, getScene(), null, 24);
            if (interfaceC1540940qCaLJ != null && isPreloadViewLoadSuccess(interfaceC1540940qCaLJ)) {
                C811103Ev.LIZ(getTag());
                InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
                if (interfaceC1051160dSc != null) {
                    sparkContextLLIILZL2 = interfaceC1051160dSc.LLIILZL();
                } else {
                    sparkContextLLIILZL2 = null;
                }
                this.sparkMixture = createSparkMixture(sparkContextLLIILZL2, interfaceC1540940qCaLJ);
                InterfaceC1051190dSf interfaceC1051190dSf = this.iAdHybridLoadStatus;
                if (interfaceC1051190dSf != null) {
                    View viewLJII = interfaceC1540940qCaLJ.LJII();
                    EnumC2008907tv enumC2008907tv = EnumC2008907tv.STATUS_LOAD_SUCCESS;
                    C1537480q70 c1537480q70LJIILJJIL = interfaceC1540940qCaLJ.LJIILJJIL();
                    if (c1537480q70LJIILJJIL != null) {
                        str6 = c1537480q70LJIILJJIL.containerId;
                    }
                    interfaceC1051190dSf.A9(new C1014910cW9(viewLJII, enumC2008907tv, str6, true));
                }
                C301090Br9.LIZIZ(new AwS165S1100000_16(this, str, 13));
                return;
            }
            C811103Ev.LIZ(getTag());
            Context context3 = this.context;
            if (context3 == null) {
                context3 = null;
            }
            AbstractC1542100qES abstractC1542100qES = this.renderLoadCallback;
            C1049260dPY c1049260dPY3 = c1051290dSp.LJFF;
            if (c1049260dPY3 != null) {
                interfaceC1020440cf42 = c1049260dPY3.LJ;
                str4 = c1049260dPY3.LIZ;
            } else {
                str4 = null;
            }
            this.sparkMixture = createSparkMixture(context3, str, bundle, str3, abstractC1542100qES, interfaceC1020440cf42, str4, buildSparkInitParam(c1051290dSp));
            InterfaceC1051160dSc interfaceC1051160dSc2 = this.sparkMixture;
            if (interfaceC1051160dSc2 != null && (sparkContextLLIILZL = interfaceC1051160dSc2.LLIILZL()) != null) {
                tryRegisterLynxSSRCallback(sparkContextLLIILZL, c1051290dSp);
            }
            InterfaceC1051160dSc interfaceC1051160dSc3 = this.sparkMixture;
            if (interfaceC1051160dSc3 != null) {
                interfaceC1051160dSc3.LIZIZ();
            }
            C301090Br9.LIZIZ(new AwS165S1100000_16(this, str, 14));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public InterfaceC1034470d1h createHybridFragment(C1051290dSp c1051290dSp, boolean z, C830490Whz<String, Object> c830490Whz) {
        String str;
        Object obj;
        InterfaceC1057870ddR interfaceC1057870ddRLIZJ;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null) {
            String str2 = c1049260dPY.LIZLLL;
            C1051410dT1 c1051410dT1 = C1051410dT1.LIZ;
            Context context = this.context;
            if (context == null) {
                context = null;
            }
            Bundle bundle = c1049260dPY.LIZJ;
            InterfaceC1020440cf4 interfaceC1020440cf4 = c1049260dPY.LJ;
            String str3 = c1049260dPY.LIZ;
            InterfaceC2217701Bqy interfaceC2217701Bqy = this.sparkActivityCallback;
            InterfaceC1892990zMP interfaceC1892990zMP = this.sparkTitleBarProvider;
            InterfaceC1056670dbV interfaceC1056670dbV = this.sparkViewProvider;
            InterfaceC1036150d4P interfaceC1036150d4P = this.sparkRootContainer;
            c1051410dT1.getClass();
            Bundle bundle2 = bundle;
            Context context2 = context;
            c1051410dT1.getClass();
            AdSparkHybridContext adSparkHybridContextLIZ = C1051410dT1.LIZ(context, str, str2, bundle, interfaceC1020440cf4, str3, interfaceC2217701Bqy, interfaceC1892990zMP, interfaceC1056670dbV, false, null);
            Bundle bundle3 = new Bundle();
            C786410Ut5.LJJJI("container_bg_color", "FFFFFFFF", bundle3);
            adSparkHybridContextLIZ.LJJLIIJ(C08RU.LIZ(bundle3, str));
            adSparkHybridContextLIZ.LJJJZ("container_bg_color", "FFFFFFFF");
            if (c830490Whz != null) {
                obj = c830490Whz.get("enable_scroll_web_view");
            } else {
                obj = null;
            }
            if (TextUtils.equals("1", String.valueOf(obj))) {
                adSparkHybridContextLIZ.LJJJZ("enable_scroll_web_view", "1");
            }
            if (c830490Whz != null) {
                Object obj2 = c830490Whz.get("native_header_info");
                if ((obj2 instanceof C1036360d4k) && obj2 != null) {
                    adSparkHybridContextLIZ.LJJ(C1036360d4k.class, obj2);
                }
                Object obj3 = c830490Whz.get("native_header_ad_new_style_model");
                if ((obj3 instanceof C1026310coX) && obj3 != null) {
                    adSparkHybridContextLIZ.LJJ(C1026310coX.class, obj3);
                }
                Object obj4 = c830490Whz.get("ad_lynx_model");
                if ((obj4 instanceof C1029630ctt) && obj4 != null) {
                    adSparkHybridContextLIZ.LJJ(C1029630ctt.class, obj4);
                }
            }
            if (interfaceC1020440cf4 != null && (interfaceC1057870ddRLIZJ = interfaceC1020440cf4.LIZJ(adSparkHybridContextLIZ, context2, str, bundle2)) != null) {
                adSparkHybridContextLIZ.LJJ(InterfaceC1057870ddR.class, interfaceC1057870ddRLIZJ);
            }
            if (interfaceC1036150d4P != null) {
                adSparkHybridContextLIZ.LJJ(InterfaceC1036150d4P.class, interfaceC1036150d4P);
            }
            AdSparkHybridFragment adSparkHybridFragment = new AdSparkHybridFragment(z);
            if (bundle2 != null) {
                C905703gN.LIZ.getClass();
                C1041990dDp.LIZ.getClass();
                C1041990dDp.LIZJ(adSparkHybridContextLIZ);
                C786410Ut5.LJJJI("SparkContextContainerId", adSparkHybridContextLIZ.containerId, bundle2);
            } else {
                bundle2 = null;
            }
            adSparkHybridFragment.setArguments(bundle2);
            return adSparkHybridFragment;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.hybrid.api.IAdHybridCustomLoader
    public void onRender(C1028380crs c1028380crs, C1051290dSp c1051290dSp, InterfaceC1051190dSf interfaceC1051190dSf) {
        String str;
        String str2;
        Bundle bundle;
        Bundle bundle2;
        InterfaceC1020440cf4 interfaceC1020440cf4;
        String str3;
        this.iAdHybridLoadStatus = interfaceC1051190dSf;
        this.hybridContainerOption = c1028380crs;
        this.renderHybridOption = c1051290dSp;
        C1049260dPY c1049260dPY = c1051290dSp.LJFF;
        Context context = null;
        if (c1049260dPY != null && (str = c1049260dPY.LIZIZ) != null && !a0.LJJJIL(str)) {
            C1049260dPY c1049260dPY2 = c1051290dSp.LJFF;
            if (c1049260dPY2 != null && (str2 = c1049260dPY2.LIZLLL) != null && !a0.LJJJIL(str2)) {
                if (this.renderState == EnumC1051280dSo.LL) {
                    this.renderState = EnumC1051280dSo.LLILLJJLI;
                }
                int i = C1000700c9E.LIZ[c1051290dSp.LIZ.ordinal()];
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        C811103Ev.LIZ(getTag());
                    } else {
                        this.isFromPre = false;
                        InterfaceC1028400cru adRenderLifecycle = getAdRenderLifecycle();
                        if (adRenderLifecycle != null) {
                            adRenderLifecycle.LIZIZ();
                        }
                        Context context2 = this.context;
                        if (context2 == null) {
                            context2 = null;
                        }
                        C1049260dPY c1049260dPY3 = c1051290dSp.LJFF;
                        if (c1049260dPY3 != null) {
                            bundle2 = c1049260dPY3.LIZJ;
                        } else {
                            bundle2 = null;
                        }
                        AbstractC1542100qES abstractC1542100qES = this.renderLoadCallback;
                        if (c1049260dPY3 != null) {
                            interfaceC1020440cf4 = c1049260dPY3.LJ;
                            str3 = c1049260dPY3.LIZ;
                        } else {
                            interfaceC1020440cf4 = null;
                            str3 = null;
                        }
                        this.sparkMixture = createSparkMixture(context2, str, bundle2, str2, abstractC1542100qES, interfaceC1020440cf4, str3, buildSparkInitParam(c1051290dSp));
                        InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
                        if (interfaceC1051160dSc != null) {
                            interfaceC1051160dSc.LIZIZ();
                        }
                    }
                } else {
                    Context context3 = this.context;
                    if (context3 == null) {
                        context3 = null;
                    }
                    String str4 = c1051290dSp.LIZIZ;
                    String scene = getScene();
                    C1049260dPY c1049260dPY4 = c1051290dSp.LJFF;
                    if (c1049260dPY4 != null) {
                        bundle = c1049260dPY4.LIZJ;
                    } else {
                        bundle = null;
                    }
                    fetchViewInPool(context3, str4, str, scene, str2, c1051290dSp, bundle);
                }
                Context context4 = this.context;
                if (context4 != null) {
                    context = context4;
                }
                C811103Ev.LIZIZ(context, "Lynx default");
                return;
            }
            interfaceC1051190dSf.k3("-3", "access_key_empty");
            return;
        }
        interfaceC1051190dSf.k3("-2", "schema_illegal");
    }

    public final void renderRetry(Context context, String str, String str2, C1051290dSp c1051290dSp, Bundle bundle) {
        C811103Ev.LIZ(getTag());
        EnumC1000680c9C enumC1000680c9C = c1051290dSp.LIZ;
        if (enumC1000680c9C == EnumC1000680c9C.ONLY_CACHE) {
            C811103Ev.LIZ(getTag());
            InterfaceC1051190dSf interfaceC1051190dSf = this.iAdHybridLoadStatus;
            if (interfaceC1051190dSf != null) {
                interfaceC1051190dSf.k3("-5", "preload_failed");
            }
            this.renderState = EnumC1051280dSo.LLILZ;
            return;
        }
        if (enumC1000680c9C != EnumC1000680c9C.CACHE_WITH_RETRY) {
            return;
        }
        this.isFromPre = true;
        InterfaceC1028400cru adRenderLifecycle = getAdRenderLifecycle();
        if (adRenderLifecycle != null) {
            adRenderLifecycle.LIZIZ();
        }
        if (((Boolean) C270620Aj6.LIZ.getValue()).booleanValue()) {
            renderAndCache(c1051290dSp, str, bundle);
        } else {
            optimizeTaskExecute(c1051290dSp.LJIIIIZZ, new C1051260dSm(this, context, str, bundle, str2, c1051290dSp), new AwS100S1200000_16(this, c1051290dSp, str, 0));
        }
    }

    private final void fetchViewInPool(Context context, String str, String str2, String str3, String str4, C1051290dSp c1051290dSp, Bundle bundle) {
        SparkContext sparkContextLLIILZL;
        this.renderHybridOption = c1051290dSp;
        C1537060q6K c1537060q6K = C1529590puH.LIZ;
        String str5 = null;
        InterfaceC1540940qCa interfaceC1540940qCaLJ = C1537060q6K.LJ(context, str, str3, null, 24);
        if (interfaceC1540940qCaLJ != null && isPreloadViewLoadSuccess(interfaceC1540940qCaLJ)) {
            C811103Ev.LIZ(getTag());
            InterfaceC1051160dSc interfaceC1051160dSc = this.sparkMixture;
            if (interfaceC1051160dSc != null) {
                sparkContextLLIILZL = interfaceC1051160dSc.LLIILZL();
            } else {
                sparkContextLLIILZL = null;
            }
            this.sparkMixture = createSparkMixture(sparkContextLLIILZL, interfaceC1540940qCaLJ);
            InterfaceC1051190dSf interfaceC1051190dSf = this.iAdHybridLoadStatus;
            if (interfaceC1051190dSf != null) {
                View viewLJII = interfaceC1540940qCaLJ.LJII();
                EnumC2008907tv enumC2008907tv = EnumC2008907tv.STATUS_LOAD_SUCCESS;
                C1537480q70 c1537480q70LJIILJJIL = interfaceC1540940qCaLJ.LJIILJJIL();
                if (c1537480q70LJIILJJIL != null) {
                    str5 = c1537480q70LJIILJJIL.containerId;
                }
                interfaceC1051190dSf.A9(new C1014910cW9(viewLJII, enumC2008907tv, str5, true));
            }
            this.renderState = EnumC1051280dSo.LLILLL;
            C301090Br9.LIZIZ(new AwS165S1100000_16(this, str2, 10));
            return;
        }
        C811103Ev.LIZ(getTag());
        renderRetry(context, str2, str4, c1051290dSp, bundle);
    }
}
