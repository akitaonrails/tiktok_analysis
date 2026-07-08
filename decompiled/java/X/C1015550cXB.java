package X;

import Y.ARunnableS116S0100000_16;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cXB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015550cXB extends AbstractC1014240cV4 {
    public static final Set<String> LLLIL = C13LQ.LJLIIL(new String[]{"carouselUpdate", "carouselSelectedPage"});
    public static final AtomicLong LLLILZ = new AtomicLong(1);
    public String LLJLIL;
    public AbstractC1014880cW6 LLJLILLLLZIIL;
    public C1015530cX9 LLJLL;
    public final C1020830cfh LLJLLIL;
    public final C01GW LLJLLL;
    public String LLJZ;
    public String LLJZIJLIL;
    public Float LLL;
    public Float LLLF;
    public Float LLLFF;
    public Float LLLFFI;
    public Float LLLFZ;
    public Float LLLI;
    public final C01GW LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final String LLLIIL;
    public C19JH<View> LLLIILIL;

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final List<InterfaceC1015560cXC> LJJ() {
        return (List) this.LLJLLL.getValue();
    }

    public final C1049800dQQ LJJI() {
        return (C1049800dQQ) this.LLLII.getValue();
    }

    public final C1015580cXE LJJIFFI() {
        return (C1015580cXE) this.LLLIIII.getValue();
    }

    public final void LJJII() {
        InterfaceC1014340cVE interfaceC1014340cVE;
        AbstractC1014880cW6 abstractC1014880cW6 = this.LLJLILLLLZIIL;
        if (Intrinsics.LJFF(abstractC1014880cW6, C1014990cWH.LIZ)) {
            InterfaceC1014340cVE interfaceC1014340cVE2 = this.LLJJJJ;
            if (interfaceC1014340cVE2 != null) {
                interfaceC1014340cVE2.LIZLLL(true);
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(abstractC1014880cW6, C1014960cWE.LIZ) || (interfaceC1014340cVE = this.LLJJJJ) == null) {
            return;
        }
        interfaceC1014340cVE.LIZLLL(false);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(Intrinsics.LJFF(this.LLJLILLLLZIIL, C1014990cWH.LIZ), "ugen_render_failed");
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        if (Intrinsics.LJFF(this.LL.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType()) || !this.LL.getShouldRerenderWhenDisappeared()) {
            return;
        }
        C1049800dQQ c1049800dQQLJJI = LJJI();
        JSONObject ugenData = this.LL.getUgenData();
        C19JH<View> c19jh = this.LLLIILIL;
        c1049800dQQLJJI.LIZLLL(c19jh, ugenData);
        c1049800dQQLJJI.LIZJ(c19jh);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZJ() {
        super.LIZJ();
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIIZZ(this);
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        C1015530cX9 c1015530cX9 = this.LLJLL;
        if (c1015530cX9 != null) {
            c1015530cX9.LLILLL = true;
            c1015530cX9.LLILZ = false;
            Animator animator = c1015530cX9.LLILZIL;
            if (animator != null) {
                animator.cancel();
            }
            c1015530cX9.LLILZIL = null;
            C1014320cVC.LIZLLL(c1015530cX9);
        }
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(this);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void clear() {
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(this);
        }
        LJJIII(C1014970cWF.LIZ);
        C1015580cXE c1015580cXELJJIFFI = LJJIFFI();
        c1015580cXELJJIFFI.LIZ = 0L;
        c1015580cXELJJIFFI.LIZIZ = 0L;
        c1015580cXELJJIFFI.LIZJ = 0L;
        c1015580cXELJJIFFI.LIZLLL = 0L;
        c1015580cXELJJIFFI.LJ = 0L;
        c1015580cXELJJIFFI.LJFF = 0L;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Ck(Function1<? super Boolean, Unit> function1) {
        C1015640cXK.LIZ(this, true, this.LL.getUgenData(), null);
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        Boolean boolValueOf;
        super.LJII(anoleComponentAppearModel);
        ViewGroup viewGroup = this.LLJJIII;
        if (viewGroup != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS116S0100000_16(this, 105));
        }
        if (!Intrinsics.LJFF(this.LL.type, EnumC1008920cMU.CAROUSEL_PRODUCT_LABEL_UGEN.getType()) && !Intrinsics.LJFF(this.LL.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
            C1015410cWx.LIZIZ(this, "othershow", null, null, null, null, null, 62);
        }
        List<String> requiringReportScenes = this.LL.getRequiringReportScenes();
        if (requiringReportScenes != null) {
            boolValueOf = Boolean.valueOf(requiringReportScenes.contains("tiktok_video_anchor_view"));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL((String) this.LLLIIIIL.getValue(), "tiktok_video_anchor_view", this.LLILLJJLI.LIZLLL);
            c1022820ciuLIZLLL.LIZJ(this.LLLIIIL.getValue(), "refer");
            Map<String, Object> ttsLogInfo = this.LL.getTtsLogInfo();
            if (ttsLogInfo != null) {
                for (String str : ttsLogInfo.keySet()) {
                    Object obj = ttsLogInfo.get(str);
                    if (obj != null) {
                        c1022820ciuLIZLLL.LIZJ(obj, str);
                    }
                }
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIIIIZZ(String str) {
        super.LJIIIIZZ(str);
        C1015410cWx.LIZIZ(this, "othershow_fail", "ugen_render_failed", this.LLJLIL, null, null, null, 56);
    }

    public final void LJJIII(AbstractC1014880cW6 abstractC1014880cW6) {
        this.LLJLILLLLZIIL = abstractC1014880cW6;
        LJJII();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) throws JSONException {
        Object c098200Yq;
        C1015530cX9 c1015530cX9;
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            if (it2.next().LJ(this, abstractC1003980cEW)) {
                return;
            }
        }
        if (abstractC1003980cEW instanceof C991240bty) {
            JSONObject jSONObject = ((C991240bty) abstractC1003980cEW).LIZ;
            if (!Intrinsics.LJFF(this.LL.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
                String strOptString = jSONObject.optString("event");
                if (strOptString != null) {
                    int iHashCode = strOptString.hashCode();
                    if (iHashCode != -704927414) {
                        if (iHashCode != -648348087) {
                            if (iHashCode == 722614883 && strOptString.equals("carouselUnselectedPage") && (c1015530cX9 = this.LLJLL) != null) {
                                c1015530cX9.LLILZ = false;
                                Animator animator = c1015530cX9.LLILZIL;
                                if (animator != null) {
                                    animator.cancel();
                                }
                                c1015530cX9.LLILZIL = null;
                            }
                        } else if (strOptString.equals("carouselUpdate")) {
                            C1015410cWx.LIZJ(this, jSONObject);
                        }
                    } else if (strOptString.equals("carouselSelectedPage")) {
                        C1015410cWx.LIZJ(this, jSONObject);
                        C1015530cX9 c1015530cX92 = this.LLJLL;
                        if (c1015530cX92 != null) {
                            c1015530cX92.LIZIZ();
                        }
                    }
                }
                Object objOpt = jSONObject.opt("frontendExtraData");
                if (objOpt instanceof JSONObject) {
                    if (objOpt == null) {
                        return;
                    }
                } else {
                    if (!(objOpt instanceof String)) {
                        return;
                    }
                    try {
                        c098200Yq = new JSONObject((String) objOpt);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (C189200o6.m7isFailureimpl(c098200Yq)) {
                        return;
                    } else {
                        objOpt = c098200Yq;
                    }
                }
                JSONObject ugenData = this.LL.getUgenData();
                if (ugenData == null) {
                    return;
                }
                ugenData.put("liveProductUpdateInfo", objOpt);
                C1049800dQQ c1049800dQQLJJI = LJJI();
                C19JH<View> c19jh = this.LLLIILIL;
                c1049800dQQLJJI.LIZLLL(c19jh, ugenData);
                c1049800dQQLJJI.LIZJ(c19jh);
                if (!C691740RBk.LIZ()) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateLiveData: ugenData -> ");
                sbLIZ.append(ugenData);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        boolean z;
        Object obj;
        Double d;
        Object obj2;
        super.Fk(viewGroup, interfaceC1014340cVE);
        List<InterfaceC1015560cXC> listLJJ = LJJ();
        if ((listLJJ instanceof Collection) && listLJJ.isEmpty()) {
            z = false;
        } else {
            Iterator<InterfaceC1015560cXC> it2 = listLJJ.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJII()) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        C1015530cX9 c1015530cX9 = null;
        String str = null;
        if (!z) {
            C1015640cXK.LIZ(this, false, this.LL.getUgenData(), null);
        }
        LJJII();
        Map<String, ? extends Object> map = this.LL.data;
        if (map != null) {
            obj = map.get("guiding_prompt_type");
        } else {
            obj = null;
        }
        if ((obj instanceof Double) && (d = (Double) obj) != null && ((int) d.doubleValue()) == 2) {
            Context context = viewGroup.getContext();
            if (context != null) {
                C1015530cX9 c1015530cX92 = new C1015530cX9(context);
                Map<String, ? extends Object> map2 = this.LL.data;
                if (map2 != null) {
                    obj2 = map2.get("guiding_prompt");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                }
                c1015530cX92.LIZ(str);
                c1015530cX9 = c1015530cX92;
            }
            this.LLJLL = c1015530cX9;
            return;
        }
        this.LLJLL = null;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.07pb] */
    public C1015550cXB(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        boolean zBooleanValue;
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = "-10000";
        this.LLJLILLLLZIIL = C1014970cWF.LIZ;
        this.LLJLLIL = new C1020830cfh(null);
        this.LLJLLL = C452501pT.LIZIZ(new AwS560S0100000_16(anoleComponentModel, 624));
        Float fValueOf = Float.valueOf(-10000.0f);
        this.LLL = fValueOf;
        this.LLLF = fValueOf;
        this.LLLFF = fValueOf;
        this.LLLFFI = fValueOf;
        this.LLLFZ = fValueOf;
        this.LLLI = fValueOf;
        this.LLLII = C452501pT.LIZIZ(new AwS560S0100000_16(context, 627));
        this.LLLIIII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(338));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS560S0100000_16(anoleComponentModel, 626));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS560S0100000_16(anoleComponentModel, 625));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ugen-");
        sbLIZ.append(LLLILZ.getAndIncrement());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLLIIL = strLIZIZ;
        WeakReference weakReference = new WeakReference(this);
        C1015570cXD c1015570cXDLIZ = C1015570cXD.LIZ();
        InterfaceC1015600cXG interfaceC1015600cXG = new InterfaceC1015600cXG() { // from class: X.1ERQ
            @Override // X.InterfaceC1015600cXG
            public final List<C1049860dQW> create() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C1049860dQW() { // from class: X.1ERS
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C19JK(context2);
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERT
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C19JK(context2);
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERR
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C21382618m8(context2) { // from class: X.0kvd
                            public final Context LLZZZZ;
                            public float a;
                            public float b;

                            @Override // X.C21382618m8, X.C19JH
                            public final void LJIIZILJ() {
                                if (this.LLZZZZ == null) {
                                    return;
                                }
                                super.LJIIZILJ();
                                ((TextView) this.LLILZ).getPaint().setAntiAlias(true);
                                int i = (int) this.a;
                                float f = this.b;
                                Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, i, f, 0.0f, Float.valueOf(f), 0.0f, 0, new LinkedHashMap(), 96);
                                if (typefaceLIZIZ != null) {
                                    ((TextView) this.LLILZ).setTypeface(typefaceLIZIZ);
                                }
                            }

                            {
                                super(context2);
                                this.LLZZZZ = context2;
                                this.a = 400.0f;
                            }

                            @Override // X.C21382618m8, X.C19JH
                            public final void LJIJ(String str, String str2) {
                                if (!TextUtils.isEmpty(str)) {
                                    super.LJIJ(str, str2);
                                    if (Intrinsics.LJFF(str, "fontWeight")) {
                                        float fLIZ = C1050100dQu.LIZ(-1.0f, str2);
                                        this.a = fLIZ;
                                        if (fLIZ < 1.0f || fLIZ > 1000.0f) {
                                            this.a = 400.0f;
                                            return;
                                        }
                                        return;
                                    }
                                    if (!Intrinsics.LJFF(str, "textSize")) {
                                        return;
                                    }
                                    this.b = C1050100dQu.LIZ(0.0f, str2);
                                }
                            }
                        };
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERU
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C1337210ktz(context2);
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERV
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C1337210ktz(context2) { // from class: X.0ku1
                            @Override // X.C1337210ktz, X.C19JH
                            public final void LJIIZILJ() {
                                this.LLILZ.setTag(R.id.ugen_carousel_node_id, this.LLJ);
                                super.LJIIZILJ();
                            }
                        };
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERW
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C21382818mA(context2);
                    }
                });
                arrayList.add(new C1049860dQW() { // from class: X.1ERX
                    @Override // X.C1049860dQW
                    public final C19JH<?> LIZ(Context context2) {
                        return new C1337210ktz(context2) { // from class: X.0kwC
                            public final Context LLLZZIL;
                            public int LLZ;

                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x00bb A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            @Override // X.C1337210ktz, X.C19JH
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void LJIIZILJ() {
                                /*
                                    Method dump skipped, instruction units count: 382
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: X.C1338580kwC.LJIIZILJ():void");
                            }

                            {
                                super(context2);
                                this.LLLZZIL = context2;
                                this.LLZ = -16777216;
                            }

                            @Override // X.C1337210ktz, X.C19JH
                            public final void LJIJ(String str, String str2) {
                                super.LJIJ(str, str2);
                                if (Intrinsics.LJFF(str, "textColor")) {
                                    this.LLZ = C21367718jj.LIZJ(str2);
                                }
                            }
                        };
                    }
                });
                return arrayList;
            }
        };
        C1015920cXm c1015920cXm = new C1015920cXm(anoleComponentModel.type, strLIZIZ, new AwS595S0100000_16(weakReference, (WeakReference<C1015550cXB>) 186));
        c1015570cXDLIZ.LIZIZ = interfaceC1015600cXG;
        c1015570cXDLIZ.LIZJ = c1015920cXm;
        ArrayList arrayList = new ArrayList();
        c1015570cXDLIZ.LIZ = arrayList;
        InterfaceC1015600cXG interfaceC1015600cXG2 = c1015570cXDLIZ.LIZIZ;
        if (interfaceC1015600cXG2 != null) {
            arrayList.addAll(interfaceC1015600cXG2.create());
        }
        List<C1049860dQW> list = c1015570cXDLIZ.LIZ;
        if (list != null) {
            ArrayList<C1049860dQW> arrayList2 = (ArrayList) list;
            if (arrayList2.size() > 0) {
                for (C1049860dQW c1049860dQW : arrayList2) {
                    if (c1049860dQW != null) {
                        ((HashMap) C1015590cXF.LIZ).put(c1049860dQW.LIZ, c1049860dQW);
                    }
                }
            }
        }
        C1015570cXD c1015570cXDLIZ2 = C1015570cXD.LIZ();
        try {
            zBooleanValue = ((Boolean) C0AU3.LIZ.getValue()).booleanValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            zBooleanValue = false;
        }
        c1015570cXDLIZ2.LJ = zBooleanValue;
        C1015570cXD.LIZ().getClass();
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C1049970dQh() { // from class: X.0dQc
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(final Context context2) {
                return new AbstractC1050010dQl(context2) { // from class: X.0dQo
                    public float LJII;
                    public float LJIIIIZZ;
                    public int LJIIIZ;
                    public String LJIIJ = "up";
                    public C1050110dQv LJIIJJI;

                    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
                    @Override // X.AbstractC1050010dQl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LJ(java.lang.Object... r10) {
                        /*
                            Method dump skipped, instruction units count: 302
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1050040dQo.LJ(java.lang.Object[]):boolean");
                    }
                };
            }
        });
        arrayList3.add(new C1049970dQh() { // from class: X.0dQd
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(final Context context2) {
                return new AbstractC1050010dQl(context2) { // from class: X.0dQn
                    public float LJII;
                    public float LJIIIIZZ;
                    public boolean LJIIIZ;
                    public C1050110dQv LJIIJ;

                    @Override // X.AbstractC1050010dQl
                    public final boolean LJ(Object... objArr) {
                        if (objArr.length <= 0) {
                            return false;
                        }
                        C19JH c19jh = this.LIZIZ;
                        if (c19jh != null && c19jh.LLLZ && this.LJIIJ == null) {
                            this.LJIIJ = new C1050110dQv();
                        }
                        MotionEvent motionEvent = (MotionEvent) objArr[0];
                        C19JH c19jh2 = this.LIZIZ;
                        C1050110dQv c1050110dQv = this.LJIIJ;
                        if (c1050110dQv != null) {
                            if (c1050110dQv.LIZ(motionEvent)) {
                                return false;
                            }
                            this.LJIIJ.LIZIZ(c19jh2, motionEvent);
                        }
                        int action = motionEvent.getAction();
                        if (action != 0) {
                            if (action != 1) {
                                if (action != 2) {
                                    if (action == 3) {
                                        this.LJIIIZ = false;
                                    }
                                } else {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.LJII) >= 15.0f || Math.abs(rawY - this.LJIIIIZZ) >= 15.0f) {
                                        this.LJIIIZ = true;
                                    }
                                }
                            } else {
                                if (this.LJIIIZ) {
                                    this.LJIIIZ = false;
                                    this.LJII = 0.0f;
                                    this.LJIIIIZZ = 0.0f;
                                    C1050110dQv c1050110dQv2 = this.LJIIJ;
                                    if (c1050110dQv2 == null) {
                                        return false;
                                    }
                                    c1050110dQv2.LIZJ(c19jh2);
                                    return false;
                                }
                                float rawX2 = motionEvent.getRawX();
                                float rawY2 = motionEvent.getRawY();
                                if (Math.abs(rawX2 - this.LJII) < 15.0f && Math.abs(rawY2 - this.LJIIIIZZ) < 15.0f) {
                                    C1049700dQG c1049700dQG = this.LIZ;
                                    if (c1049700dQG != null) {
                                        c1049700dQG.LIZIZ(this.LJ, this.LIZJ.LIZIZ);
                                        this.LJII = 0.0f;
                                        this.LJIIIIZZ = 0.0f;
                                    }
                                } else {
                                    this.LJIIIZ = false;
                                    C1050110dQv c1050110dQv3 = this.LJIIJ;
                                    if (c1050110dQv3 != null) {
                                        c1050110dQv3.LIZJ(c19jh2);
                                    }
                                }
                            }
                        } else {
                            this.LJII = motionEvent.getRawX();
                            this.LJIIIIZZ = motionEvent.getRawY();
                        }
                        return true;
                    }
                };
            }
        });
        arrayList3.add(new C1049970dQh() { // from class: X.0dQe
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(Context context2) {
                return new C1050070dQr(context2);
            }
        });
        arrayList3.add(new C1049970dQh() { // from class: X.0dQf
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(Context context2) {
                return new C1050060dQq(context2);
            }
        });
        arrayList3.add(new C1049970dQh() { // from class: X.0dQg
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(Context context2) {
                return new C1050050dQp(context2);
            }
        });
        arrayList3.add(new C1049970dQh() { // from class: X.0dQb
            @Override // X.C1049970dQh
            public final AbstractC1050010dQl LIZ(Context context2) {
                return new C1049900dQa(context2);
            }
        });
        ArrayList<C1049970dQh> arrayList4 = new ArrayList(arrayList3);
        if (arrayList4.size() > 0) {
            for (C1049970dQh c1049970dQh : arrayList4) {
                if (c1049970dQh != null) {
                    ((HashMap) C1862607Rg.LIZ).put(c1049970dQh.LIZ, c1049970dQh);
                }
            }
        }
        C1015570cXD.LIZ().getClass();
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new C1021670ch3() { // from class: X.0ch0
            @Override // X.C1021670ch3
            public final AbstractC1049690dQF LIZ(final C19JH c19jh, final String str, final C1050000dQk c1050000dQk) {
                return new AbstractC1049690dQF(c19jh, str, c1050000dQk) { // from class: X.0dQM
                    @Override // X.AbstractC1049690dQF
                    public final void LIZIZ() {
                        Map<String, Object> map = this.LIZLLL;
                        if (map == null || map.size() <= 0) {
                            return;
                        }
                        String strValueOf = String.valueOf(this.LIZLLL.get(FollowStatusChangeMethod.PARAM_UID));
                        if (TextUtils.isEmpty(strValueOf)) {
                            LIZLLL(this.LIZIZ);
                            return;
                        }
                        C19JH c19jh2 = this.LIZIZ;
                        c19jh2.getClass();
                        C19JH c19jhLJI = C19JH.LJI(c19jh2);
                        if (c19jhLJI == null) {
                            return;
                        }
                        LIZLLL(c19jhLJI.LJFF(strValueOf));
                    }

                    public final void LIZLLL(C19JH c19jh2) {
                        if (c19jh2 == null) {
                            return;
                        }
                        for (String str2 : this.LIZLLL.keySet()) {
                            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str2, FollowStatusChangeMethod.PARAM_UID)) {
                                c19jh2.LJIJ(str2, String.valueOf(this.LIZLLL.get(str2)));
                            }
                        }
                        boolean zContainsKey = this.LIZLLL.containsKey("width");
                        boolean zContainsKey2 = this.LIZLLL.containsKey("height");
                        if (c19jh2.LLILZ != 0) {
                            ViewGroup.LayoutParams layoutParams = c19jh2.LLLIIIIL;
                            C786410Ut5.W5(c19jh2.LLILZ, layoutParams);
                            c19jh2.LLLIIIIL = layoutParams;
                            if (zContainsKey) {
                                int i = (int) c19jh2.LLJIJIL;
                                if (c19jh2.LLIZLLLIL) {
                                    T t = c19jh2.LLILZ;
                                    if (t instanceof InterfaceC1049770dQN) {
                                        ((InterfaceC1049770dQN) t).LIZLLL(i);
                                    } else {
                                        ViewParent viewParent = (ViewGroup) t.getParent();
                                        if (viewParent instanceof InterfaceC1049770dQN) {
                                            ((InterfaceC1049770dQN) viewParent).LIZIZ(i, c19jh2.LLILZ);
                                        }
                                    }
                                } else {
                                    ViewGroup.LayoutParams layoutParams2 = c19jh2.LLILZ.getLayoutParams();
                                    layoutParams2.width = i;
                                    C786410Ut5.W5(c19jh2.LLILZ, layoutParams2);
                                }
                            }
                            if (zContainsKey2) {
                                int i2 = (int) c19jh2.LLJILJIL;
                                if (c19jh2.LLIZLLLIL) {
                                    T t2 = c19jh2.LLILZ;
                                    if (t2 instanceof InterfaceC1049770dQN) {
                                        ((InterfaceC1049770dQN) t2).LIZ(i2);
                                    } else {
                                        ViewParent viewParent2 = (ViewGroup) t2.getParent();
                                        if (viewParent2 instanceof InterfaceC1049770dQN) {
                                            ((InterfaceC1049770dQN) viewParent2).LJ(i2, c19jh2.LLILZ);
                                        }
                                    }
                                } else {
                                    ViewGroup.LayoutParams layoutParams3 = c19jh2.LLILZ.getLayoutParams();
                                    layoutParams3.height = i2;
                                    C786410Ut5.W5(c19jh2.LLILZ, layoutParams3);
                                }
                            }
                        }
                        c19jh2.LJIIZILJ();
                    }
                };
            }
        });
        arrayList5.add(new C1021670ch3() { // from class: X.0ch1
            @Override // X.C1021670ch3
            public final AbstractC1049690dQF LIZ(C19JH c19jh, String str, C1050000dQk c1050000dQk) {
                return new C1049740dQK(c19jh, str, c1050000dQk);
            }
        });
        arrayList5.add(new C1021670ch3() { // from class: X.0ch2
            @Override // X.C1021670ch3
            public final AbstractC1049690dQF LIZ(final C19JH c19jh, final String str, final C1050000dQk c1050000dQk) {
                return new AbstractC1049690dQF(c19jh, str, c1050000dQk) { // from class: X.0dQO
                    @Override // X.AbstractC1049690dQF
                    public final void LIZJ() {
                    }

                    @Override // X.AbstractC1049690dQF
                    public final void LIZIZ() {
                        C19J8 c19j8LIZLLL;
                        Map<String, Object> map = this.LIZLLL;
                        if (map == null || map.size() <= 0) {
                            return;
                        }
                        String strValueOf = String.valueOf(this.LIZLLL.get("name"));
                        if (TextUtils.isEmpty(strValueOf)) {
                            return;
                        }
                        C19JH c19jh2 = this.LIZIZ;
                        c19jh2.getClass();
                        C19JH c19jhLJI = C19JH.LJI(c19jh2);
                        if (c19jhLJI == null || (c19j8LIZLLL = c19jhLJI.LJ(strValueOf).LIZLLL(strValueOf)) == null) {
                            return;
                        }
                        ValueAnimator valueAnimator = c19j8LIZLLL.LLILLL;
                        if (valueAnimator != null) {
                            valueAnimator.start();
                        }
                        c19j8LIZLLL.LLJ = new C19JG() { // from class: X.0dQP
                            @Override // X.C19JG
                            public final void LIZIZ() {
                            }

                            @Override // X.C19JG
                            public final void LIZ() {
                                LIZ();
                            }
                        };
                    }
                };
            }
        });
        ArrayList<C1021670ch3> arrayList6 = new ArrayList(arrayList5);
        if (arrayList6.size() > 0) {
            for (C1021670ch3 c1021670ch3 : arrayList6) {
                if (c1021670ch3 != null) {
                    ((HashMap) C1862507Rf.LIZ).put(c1021670ch3.LIZ, c1021670ch3);
                }
            }
        }
        C1015570cXD.LIZ().LIZLLL = new Object() { // from class: X.07pb
        };
        Iterator<InterfaceC1015560cXC> it2 = LJJ().iterator();
        while (it2.hasNext()) {
            it2.next().LJFF(this);
        }
    }
}
