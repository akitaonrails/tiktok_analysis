package X;

import Y.ARunnableS121S0100000_21;
import Y.ARunnableS34S0201000_29;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.IEffectAnchorService;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11iE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19574811iE {
    public InterfaceC1635410sex LIZ;
    public boolean LIZIZ;
    public ArrayList<String> LIZJ;
    public Dialog LJFF;
    public CreativeDialogWrapper LJII;
    public ProgressDialogC1399760mWs LJIIIIZZ;
    public final Context LJIIJ;
    public Music LJIIL;
    public String LJIILIIL;
    public Aweme LJIILL;
    public String LJIILLIIL;
    public final String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public String LJJ;
    public String LJJI;
    public String LJJIFFI;
    public InterfaceC19340210lU LJJII;
    public InterfaceC19576611iW LJJIII;
    public InterfaceC1399590mWb LJJIIJ;
    public Effect LJJIJIIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public C1661130tKR LJJIL;
    public C1661120tKQ LJJIZ;
    public String LJJJ;
    public String LJJJJI;
    public String LIZLLL = "";
    public ShootExtraData LJ = new ShootExtraData();
    public C0LEP LJI = C0LEP.CLOSE_VISIBLE_5S;
    public boolean LJIIIZ = false;
    public String LJIIJJI = "";
    public boolean LJIILJJIL = false;
    public final IAVEffectService LJJIIJZLJL = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).abilityService().effectService();
    public final IEffectAnchorService LJJIIZ = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false);
    public String LJJIIZI = "";
    public String LJJIJ = "";
    public String LJJIJIIJI = "";
    public boolean LJJIJIL = true;
    public int LJJJI = 0;
    public Effect LJJJIL = null;
    public boolean LJJJJ = false;
    public boolean LJJJJIZL = false;
    public int LJJJJJ = 0;
    public boolean LJJJJJL = false;
    public String LJJJJL = "";
    public String LJJJJLI = "";
    public boolean LJJJJLL = false;
    public String LJJJJZ = "";
    public int LJJJJZI = 0;
    public final C19576511iV LJJJLIIL = new C19576511iV(this);
    public final C1632250sZr LJJJLL = new C1632250sZr();
    public boolean LJJJLZIJ = false;
    public final C19575111iH LJJJZ = new C19575111iH(this);
    public final C19574711iD LJJL = new C19574711iD(this);
    public int LJJLI = 0;
    public int LJJLIIIIJ = 0;
    public boolean LJJLIIIJ = false;
    public boolean LJJLIIIJILLIZJL = false;

    public final Map<String, String> LJII() {
        HashMap map = new HashMap();
        map.put(Scene.SCENE_SERVICE, this.LJJIJ);
        if (!TextUtils.isEmpty(this.LJJIJIIJI)) {
            map.put("grade_key", this.LJJIJIIJI);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1661120tKQ LJIIIZ() {
        /*
            r9 = this;
            X.0tKQ r0 = r9.LJJIZ
            if (r0 != 0) goto L3a
            java.lang.String r7 = r9.LJIJ
            if (r7 != 0) goto Le
            java.lang.String r7 = r9.LJIILIIL
            if (r7 != 0) goto Le
            java.lang.String r7 = ""
        Le:
            java.lang.String r0 = r9.LJJIIZI
            boolean r0 = LJI(r0)
            r2 = 0
            if (r0 != 0) goto L23
            java.lang.String r1 = r9.LJJIIZI
            boolean r0 = X.C297980Bm8.LIZ()
            if (r0 == 0) goto L42
            java.lang.String r0 = "prop_page"
            if (r1 != r0) goto L42
        L23:
            r8 = 1
        L24:
            X.0tKQ r3 = new X.0tKQ
            android.content.Context r4 = r9.LJIIJ
            java.util.ArrayList<java.lang.String> r0 = r9.LIZJ
            java.lang.Object r5 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            java.lang.String r5 = (java.lang.String) r5
            com.ss.android.ugc.aweme.music.model.Music r0 = r9.LJIIL
            if (r0 != 0) goto L3d
            r6 = 0
        L35:
            r3.<init>(r4, r5, r6, r7, r8)
            r9.LJJIZ = r3
        L3a:
            X.0tKQ r0 = r9.LJJIZ
            return r0
        L3d:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r6 = r0.convertToMusicModel()
            goto L35
        L42:
            r8 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19574811iE.LJIIIZ():X.0tKQ");
    }

    public final C1661130tKR LJIIJJI() {
        if (this.LJJIL == null) {
            this.LJJIL = new C1661130tKR(LJIIIZ());
        }
        return this.LJJIL;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJIIIIZZ() {
        /*
            r5 = this;
            boolean r1 = X.C298980Bnk.LIZ()
            r0 = 0
            if (r1 != 0) goto L8
            return r0
        L8:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r5.LJIILL
            if (r1 == 0) goto L3d
            java.util.List r1 = r1.getAnchors()
            if (r1 == 0) goto L40
            java.util.Iterator r4 = r1.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r3 = r4.next()
            r1 = r3
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r1 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r1
            int r2 = r1.getType()
            X.0nKG r1 = X.EnumC1430380nKG.PROP
            int r1 = r1.getTYPE()
            if (r2 != r1) goto L16
        L2f:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r3
            if (r3 == 0) goto L40
            java.lang.String r1 = r3.getExtra()
        L37:
            java.lang.Object r0 = X.C298980Bnk.LIZIZ(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
        L3d:
            return r0
        L3e:
            r3 = r0
            goto L2f
        L40:
            r1 = r0
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19574811iE.LJIIIIZZ():java.lang.String");
    }

    public static boolean LJI(String str) {
        if (C297980Bm8.LIZ()) {
            return false;
        }
        if (((Number) C297990Bm9.LIZ.getValue()).intValue() == 2) {
            return true;
        }
        if (!C297990Bm9.LIZ() || str != "prop_page") {
            return false;
        }
        return true;
    }

    public static boolean LJIILIIL(Effect effect) {
        if (effect == null) {
            return false;
        }
        C1446130njf.LIZ.getClass();
        return "true".equals(C1446130njf.LJFF(effect, "no_apply_sound_in_effect_reuse"));
    }

    public final void LIZLLL(int i) {
        Context context;
        if (this.LJFF != null && (context = this.LJIIJ) != null && i <= 100 && (context instanceof Activity) && !C1388190mED.LIZ(context).isFinishing() && this.LJFF.isShowing()) {
            LJIILLIIL(this.LJFF, i);
        }
    }

    public final String LJIIJ(Effect effect) {
        Aweme aweme;
        if (effect != null) {
            return effect.getResourceId();
        }
        if (this.LIZJ.size() <= 1 || (aweme = this.LJIILL) == null || aweme.getAnchors() == null) {
            return null;
        }
        final String str = (String) ListProtector.get(this.LIZJ, 0);
        AnchorCommonStruct anchorCommonStructOrElse = this.LJIILL.getAnchors().stream().filter(new Predicate() { // from class: X.11iU
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                if (((AnchorCommonStruct) obj).getId() == str) {
                    return true;
                }
                return false;
            }
        }).findFirst().orElse(null);
        if (anchorCommonStructOrElse == null) {
            return null;
        }
        return anchorCommonStructOrElse.getId();
    }

    public final void LJIILJJIL(C0MVY c0mvy) {
        C194353111z.LIZ.LJ(1021, c0mvy, C0LD3.PROGRESS_WITH_MESSAGE, this.LJI, this.LJJLIIIIJ);
        if (c0mvy == C0MVY.CLICK_CLOSE) {
            LJIILJJIL(C0MVY.DISMISS);
        }
    }

    public final void LJIIZILJ(Music music) {
        if (!((ICommerceMediaService) ServiceManager.get().getService(ICommerceMediaService.class)).LIZJ(music)) {
            this.LJIIL = music;
        }
    }

    public final void LJIJI(DialogC1390150mHN dialogC1390150mHN) {
        dialogC1390150mHN.LJJZ(false);
        ComponentCallbacks2 componentCallbacks2LIZ = C1388190mED.LIZ(this.LJIIJ);
        if (componentCallbacks2LIZ == null) {
            return;
        }
        new SafeHandler((LifecycleOwner) componentCallbacks2LIZ).postDelayed(new ARunnableS121S0100000_21(dialogC1390150mHN, 103), Mp4ScreenVideoLoadTimeout.CONTROL);
        dialogC1390150mHN.LLILZLL = new InterfaceC1389630mGX() { // from class: X.11iO
            @Override // X.InterfaceC1389630mGX
            public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                C19574811iE c19574811iE = this.LIZ;
                c19574811iE.LJJLIIIJILLIZJL = true;
                c19574811iE.LJIILJJIL(C0MVY.CLICK_CLOSE);
            }
        };
    }

    public C19574811iE(Context context, String str) {
        this.LJIIZILJ = "";
        this.LJIIJ = context;
        this.LJIILIIL = str;
        this.LJIIZILJ = "";
    }

    public static void LJIILLIIL(Dialog dialog, int i) {
        if (dialog == null) {
            return;
        }
        if (dialog instanceof ProgressDialogC1397770mTf) {
            ((ProgressDialogC1397770mTf) dialog).setProgress(i);
        } else {
            if (!(dialog instanceof DialogC1390150mHN)) {
                return;
            }
            ((DialogC1390150mHN) dialog).LJJLL(i, false);
        }
    }

    public final void LIZ(RecordConfig.Builder builder, Effect effect) {
        String strLJIIJ = LJIIJ(effect);
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            builder.propData(fromGroupPropService.LIZJ(), fromGroupPropService.LIZLLL(), strLJIIJ);
        }
        builder.propResourceId(strLJIIJ);
    }

    public final void LIZIZ(C2344009Gk c2344009Gk, Effect effect) {
        String strLJIIJ = LJIIJ(effect);
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
            c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        }
        c2344009Gk.LJFF("prop_resource_id", strLJIIJ);
    }

    public final void LJ(final Effect effect, final String str) {
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            new C19467511Ej(this, effect, str).onSuccess();
            return;
        }
        C0XPD.LIZIZ(C1388190mED.LIZ(this.LJIIJ), "prop_page", "prop_page", null, null);
        C0NPK.LIZ.add(new C0XVA() { // from class: X.11Ek
            @Override // X.C0XVA
            public final void onStart() {
            }

            @Override // X.C0XVA
            public final void LIZLLL() {
                if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                    if (C10EU.LJIIIIZZ()) {
                        return;
                    }
                    C19574811iE c19574811iE = this.LIZJ;
                    Effect effect2 = effect;
                    String str2 = str;
                    c19574811iE.getClass();
                    new C19467511Ej(c19574811iE, effect2, str2).onSuccess();
                }
                C0NPK.LIZ.remove(this);
            }
        });
    }

    public final void LJIJ(Dialog dialog, int i) {
        if (i < 20 && !this.LJJLIIIJ) {
            ExecutorC1592406Li.LLILLJJLI.LIZ(500L, new ARunnableS34S0201000_29(dialog, i, this, 7));
        }
    }

    public static void LIZJ(String str, Map.Entry entry, HashMap map) {
        if (str.equals(entry.getKey())) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r17, java.util.ArrayList r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19574811iE.LJFF(boolean, java.util.ArrayList, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0354  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(com.ss.android.ugc.effectmanager.effect.model.Effect r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19574811iE.LJIIL(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, boolean):void");
    }

    public final void LJIILL(final ArrayList<String> arrayList, String str, String str2, final boolean z, int i, final boolean z2) {
        List<Effect> data;
        boolean z3 = !z;
        if (!C19419010yC.LIZ(this.LJIIJ, "prop_page", z3)) {
            return;
        }
        this.LJJIIZI = str;
        this.LJJIJ = str2;
        this.LJJJI = i;
        this.LJJIJIL = z3;
        if (LJI(str) && z && arrayList.size() > 0) {
            C1632250sZr c1632250sZr = this.LJJJLL;
            Context context = this.LJIIJ;
            String str3 = (String) ListProtector.get(arrayList, 0);
            Map<String, String> mapLJII = LJII();
            Function1 function1 = new Function1() { // from class: X.11iT
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    C19574811iE c19574811iE = this.LL;
                    boolean z4 = z2;
                    ArrayList arrayList2 = arrayList;
                    boolean z5 = z;
                    if (!c19574811iE.LJJJLZIJ) {
                        c19574811iE.LJFF(z4, arrayList2, z5);
                    }
                    return Unit.LIZ;
                }
            };
            c1632250sZr.getClass();
            if (C19419010yC.LIZ(context, "prop_page", false)) {
                Effect effect = null;
                if (c1632250sZr.LIZJ == null && C1398060mU8.LIZ(str3) == null) {
                    c1632250sZr.LIZIZ = C23250099c.LIZLLL((InterfaceC497601wk) c1632250sZr.LIZ.getValue(), C0PEM.LIZJ, null, new C2166508eF(c1632250sZr, context, str3, mapLJII, function1, null), 2);
                    return;
                }
                if (c1632250sZr.LIZJ == null) {
                    EffectListResponse effectListResponseLIZ = C1398060mU8.LIZ(str3);
                    if (effectListResponseLIZ != null && (data = effectListResponseLIZ.getData()) != null) {
                        effect = (Effect) C13LP.LJJJLL(data);
                    }
                    c1632250sZr.LIZJ = effect;
                }
                function1.invoke(c1632250sZr.LIZJ);
                return;
            }
            return;
        }
        LJFF(z2, arrayList, z);
    }
}
