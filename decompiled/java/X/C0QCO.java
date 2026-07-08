package X;

import Y.AfS31S0210000_10;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.abmock.SettingsManager;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QCO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QCO extends C0QCZ {
    public Fragment LJIIL;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LJIILIIL;
    public C09AY LJIILJJIL;
    public boolean LJIILL;
    public final C0Q7A LJIILLIIL;
    public final C0R4T LJIIZILJ;
    public final C689760R3u LJIJ;

    @Override // X.InterfaceC666420QCa
    public final SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZIZ() {
        return this.LJIILIIL;
    }

    public final void LJIIL(DynamicPatch dynamicPatch, TemplateData templateData) {
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LJ("ec_photo_search_first_screen_enable", 0) == 1) {
            C0R4T c0r4t = this.LJIIZILJ;
            if (c0r4t != null) {
                C0Q73 c0q73 = C0Q73.LIZ;
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LJIILIIL;
                String str = dynamicPatch.schema;
                C689760R3u c689760R3u = this.LJIJ;
                c0q73.getClass();
                C0Q73.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, str, templateData, false, c0r4t, c689760R3u, null, null);
                return;
            }
            return;
        }
        C0R4T c0r4t2 = this.LJIIZILJ;
        if (c0r4t2 == null) {
            return;
        }
        C0Q73 c0q732 = C0Q73.LIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = this.LJIILIIL;
        String str2 = dynamicPatch.schema;
        c0q732.getClass();
        C0Q73.LIZ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2, str2, templateData, false, c0r4t2, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(final com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch r16, final com.lynx.tasm.TemplateData r17) {
        /*
            r15 = this;
            r11 = r15
            X.0R4T r8 = r11.LJIIZILJ
            if (r8 == 0) goto L3d
            X.0Q73 r3 = X.C0Q73.LIZ
            r3.getClass()
            X.0qEB r0 = r11.LJIILIIL
            r13 = r16
            if (r0 == 0) goto L27
            android.content.Context r2 = r0.getContext()
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L3e
            r1 = r2
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isDestroyed()
            if (r0 != 0) goto L27
            boolean r0 = r1.isFinishing()
            if (r0 == 0) goto L3e
        L27:
            X.0Q76 r2 = new X.0Q76
            r2.<init>()
            java.lang.String r1 = "type"
            java.lang.String r0 = "spark_container_destroyed"
            r2.LJIILLIIL(r1, r0)
            java.lang.String r1 = r13.schema
            java.lang.String r0 = "schema"
            r2.LJIILLIIL(r0, r1)
            r2.LJIILJJIL()
        L3d:
            return
        L3e:
            boolean r0 = r2 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L51
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.Lifecycle r0 = r2.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L51
            goto L27
        L51:
            java.lang.String r1 = r13.getBulletSchema()
            if (r1 != 0) goto L59
            java.lang.String r1 = r13.schema
        L59:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L61
            java.lang.String r1 = ""
        L61:
            r13.schema = r1
            X.00zU r10 = new X.00zU
            r10.<init>()
            X.01GW r0 = X.C0QCR.LIZ
            X.0Q75 r9 = new X.0Q75
            r6 = r17
            r12 = r8
            r14 = r6
            r9.<init>()
            X.01GW r0 = X.C0QCR.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r2 = r0.remove(r1)
            if (r2 != 0) goto L8d
            X.01GW r0 = X.C0QCR.LIZ
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r2 = r0.remove(r1)
        L8d:
            boolean r0 = X.C0BRK.LIZ()
            if (r0 == 0) goto L9b
            com.ss.android.ugc.aweme.ecommerce.search.lynx.core.viewmodel.BulletUtils r0 = com.ss.android.ugc.aweme.ecommerce.search.lynx.core.viewmodel.BulletUtils.LIZ
            boolean r0 = r0.isSearchIntermediate(r1)
            if (r0 != 0) goto La6
        L9b:
            X.0P5N r0 = X.C0P5N.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.search.service.ecom.ab.LynxPrefetchConfig r0 = X.C0P5N.LIZIZ
            boolean r0 = r0.enable_pre_load
            if (r0 == 0) goto Lb3
        La6:
            X.00Cn r0 = X.EnumC040700Cn.LOADING
            if (r0 != 0) goto Lb3
            android.util.ArrayMap<X.0qEB, X.0qES> r1 = X.C0QCR.LIZJ
            r2.getClass()
            r0 = 0
            r1.put(r0, r9)
        Lb3:
            r10.element = r2
            X.0qEB r4 = r11.LJIILIIL
            java.lang.String r5 = r13.schema
            r9 = 0
            r7 = 0
            r3.getClass()
            r10 = r9
            r11 = r9
            X.C0Q73.LIZ(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QCO.LJIILIIL(com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch, com.lynx.tasm.TemplateData):void");
    }

    public C0QCO(Fragment fragment, Context context, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.LJIIL = fragment;
        C0QCP.LIZ.getClass();
        this.LJIILIIL = C0QCP.LIZ(context);
        this.LJIILLIIL = new C0Q7A();
        this.LIZIZ = this.LJIIL;
        this.LJIIZILJ = new C0R4T(this, 10);
        this.LJIJ = new C689760R3u(this, 0);
    }

    @Override // X.InterfaceC666420QCa
    public final void LIZJ(DynamicPatch dynamicPatch, Map<String, ? extends Object> map, boolean z) {
        LynxView lynxView;
        if (Intrinsics.LJFF(dynamicPatch, this.LJIIJJI)) {
            Object kitView = this.LJIILIIL.getKitView();
            if ((kitView instanceof LynxView) && (lynxView = (LynxView) kitView) != null) {
                lynxView.onEnterForeground();
                return;
            }
            return;
        }
        LJII();
        C830490Whz c830490Whz = new C830490Whz();
        if (map != null) {
            c830490Whz.putAll(map);
        }
        LIZLLL(c830490Whz);
        this.LJIIJ.add(C11NN.LJIIIIZZ(c830490Whz).LJIIIZ(new InterfaceC1487280oo2() { // from class: X.0QCQ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return TemplateData.LJII((C830490Whz) obj);
            }
        }).LJIIZILJ(C11S5.LIZIZ).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS31S0210000_10(this, z, dynamicPatch, 0)));
    }
}
