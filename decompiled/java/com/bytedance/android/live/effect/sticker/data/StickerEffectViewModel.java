package com.bytedance.android.live.effect.sticker.data;

import X.AbstractC399701gx;
import X.AnonymousClass0956;
import X.C01GW;
import X.C099G;
import X.C0PEM;
import X.C0U45;
import X.C0U6F;
import X.C0U8B;
import X.C0U8C;
import X.C0U8F;
import X.C0UA1;
import X.C0UBH;
import X.C0UD4;
import X.C1161920gLG;
import X.C13LP;
import X.C13LZ;
import X.C20337914i1;
import X.C20441214yg;
import X.C2188811AlT;
import X.C23250099c;
import X.C398801go;
import X.C398901gp;
import X.C402401hO;
import X.C402501hP;
import X.C405701hv;
import X.C452501pT;
import X.C500260Jjc;
import X.C603820NmG;
import X.C767430U8n;
import X.C767500U8u;
import X.C767760U9u;
import X.C767830UAb;
import X.C786410Ut5;
import X.InterfaceC1364105Vn;
import X.InterfaceC401501hF;
import X.InterfaceC766480U4w;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.datastore.base.BaseEffectViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectCheckUpdateInterval;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectDynamicAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveStickerDataSourceOptSetting;
import com.bytedance.android.livesdk.performance.PerformanceManagerImpl;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public class StickerEffectViewModel extends BaseEffectViewModel<LiveEffect> {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final InterfaceC401501hF LLILZ;
    public final C0U6F LLILZIL;
    public final Queue<C767430U8n> LLILZLL;
    public LiveEffect LLIZ;
    public final HashMap<String, String> LLIZLLLIL;
    public C099G LLJ;
    public final C01GW LLJI;
    public volatile String LLJIJIL;
    public AnonymousClass0956 LLJILJIL;
    public final ConcurrentHashSet<String> LLJILJILJ;
    public final C767830UAb LLJILLL;
    public final C767760U9u LLJJ;
    public final ConcurrentHashSet<String> LLJJI;
    public boolean LLJJIII;

    public final void EQ2() {
        C767430U8n c767430U8n = (C767430U8n) ((ConcurrentLinkedQueue) this.LLILZLL).poll();
        this.LLIZ = c767430U8n != null ? c767430U8n.LIZ : null;
        if (c767430U8n != null) {
            GQ2(c767430U8n.LIZ, c767430U8n.LIZIZ, c767430U8n.LIZJ, c767430U8n.LIZLLL, c767430U8n.LJ);
        }
    }

    public final List<C0UBH> LQ2() {
        return (List) this.LLJI.getValue();
    }

    public static boolean XQ2(String str) {
        if (LiveStickerDataSourceOptSetting.INSTANCE.enable() && Intrinsics.LJFF(str, "trending")) {
            return true;
        }
        return false;
    }

    public final boolean CQ2(String str) {
        C0U6F c0u6f;
        C402501hP c402501hP;
        if (Intrinsics.LJFF(str, "search")) {
            String str2 = this.LLJIJIL;
            if (str2 != null && (c0u6f = this.LLILZIL) != null && (c402501hP = (C402501hP) ((C603820NmG) c0u6f.LJ.getValue()).LIZJ(str2)) != null && c402501hP.LIZIZ && !this.LLJILJILJ.contains(this.LLJIJIL)) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(str, "trending") && this.LLILZ.LJIILLIIL(str) && !this.LLJJI.contains(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object KQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C767480U8s
            if (r0 == 0) goto L67
            r8 = r10
            X.0U8s r8 = (X.C767480U8s) r8
            int r2 = r8.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L67
            int r2 = r2 - r1
            r8.LLILLL = r2
        L12:
            java.lang.Object r1 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILLL
            r4 = 3
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L37
            if (r0 == r6) goto L75
            if (r0 != r4) goto L6d
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            r8.LLILLL = r3
            java.lang.Object r1 = r9.OQ2(r8)
            if (r1 != r7) goto L3a
            return r7
        L37:
            X.C155000ia.LIZIZ(r1)
        L3a:
            X.0U8u r1 = (X.C767500U8u) r1
            if (r1 == 0) goto L55
            X.1DDr r5 = r9.LLILLL
            X.01gM r4 = new X.01gM
            java.lang.String r3 = r1.LIZIZ
            java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect> r2 = r1.LIZ
            r1 = 0
            r0 = 12
            r4.<init>(r3, r2, r1, r0)
            r8.LLILLL = r6
            java.lang.Object r0 = r5.emit(r4, r8)
            if (r0 != r7) goto L78
            return r7
        L55:
            X.1DDr r2 = r9.LLILLL
            X.01gQ r1 = new X.01gQ
            java.lang.String r0 = "fetchCategoryList failed"
            r1.<init>(r3, r0)
            r8.LLILLL = r4
            java.lang.Object r0 = r2.emit(r1, r8)
            if (r0 != r7) goto L28
            return r7
        L67:
            X.0U8s r8 = new X.0U8s
            r8.<init>(r9, r10)
            goto L12
        L6d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L75:
            X.C155000ia.LIZIZ(r1)
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.KQ2(X.05Vn):java.lang.Object");
    }

    public final LiveEffect NQ2(String str) {
        LiveEffect liveEffectLJJIIZI = this.LLILZ.LJJIIZI(str);
        if (liveEffectLJJIIZI != null && liveEffectLJJIIZI.LLILII() != null) {
            String strLLILII = liveEffectLJJIIZI.LLILII();
            if (strLLILII == null) {
                return null;
            }
            return this.LLILZ.LJJIIZI(strLLILII);
        }
        return liveEffectLJJIIZI;
    }

    public final Object OQ2(InterfaceC1364105Vn<? super C767500U8u> interfaceC1364105Vn) {
        Boolean boolValueOf;
        C099G c099g = this.LLJ;
        if (c099g != null) {
            boolValueOf = Boolean.valueOf(c099g.isCompleted());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C099G c099g2 = this.LLJ;
            if (c099g2 == null) {
                return null;
            }
            return c099g2.LJJJIL();
        }
        C099G c099g3 = this.LLJ;
        if (c099g3 == null) {
            return null;
        }
        return c099g3.LJLIIIL(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object QQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C767470U8r
            if (r0 == 0) goto L47
            r5 = r7
            X.0U8r r5 = (X.C767470U8r) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L47
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L4d
            java.lang.Object r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r6.LLJILJILJ
            boolean r0 = r0.remove(r1)
            java.lang.Boolean.valueOf(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r4)
            java.lang.String r1 = r6.LLJIJIL
            if (r1 == 0) goto L2d
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r6.LLJILJILJ
            r0.add(r1)
            r5.LL = r1
            r5.LLILZ = r2
            kotlin.Unit r0 = r6.RQ2(r1, r2)
            if (r0 != r3) goto L24
            return r3
        L47:
            X.0U8r r5 = new X.0U8r
            r5.<init>(r6, r7)
            goto L12
        L4d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.QQ2(X.05Vn):java.lang.Object");
    }

    public final void SQ2(AbstractC399701gx<? extends LiveEffect> abstractC399701gx) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C398801go(this, abstractC399701gx, null), 2);
    }

    public StickerEffectViewModel(InterfaceC401501hF interfaceC401501hF, C0U6F c0u6f) {
        super(interfaceC401501hF.LJJIJL(), c0u6f);
        this.LLILZ = interfaceC401501hF;
        this.LLILZIL = c0u6f;
        this.LLILZLL = new ConcurrentLinkedQueue();
        this.LLIZLLLIL = new HashMap<>();
        this.LLJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(29));
        this.LLJILJILJ = new ConcurrentHashSet<>();
        this.LLJILLL = new C767830UAb(new ArrayList());
        this.LLJJ = C767760U9u.LIZ;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C398901gp(this, null), 3);
        this.LLJJI = new ConcurrentHashSet<>();
    }

    public static List AQ2(List list, C767500U8u c767500U8u) {
        if (c767500U8u != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.add(new C0UBH(C0UD4.LJIIJJI, "livereward", false));
            return arrayList;
        }
        return list;
    }

    public static boolean VQ2(StickerEffectViewModel stickerEffectViewModel, String str) {
        String str2;
        long j;
        String str3;
        stickerEffectViewModel.getClass();
        String strLIZIZ = "";
        boolean z = true;
        if (C500260Jjc.LJJIJLIJ() || C500260Jjc.LJIL()) {
            if (C500260Jjc.LJJIJLIJ()) {
                str2 = "preview";
            } else if (!C500260Jjc.LJIL()) {
                str2 = "";
            } else {
                IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
                if (iInteractService.vp0()) {
                    str2 = "match";
                } else if (iInteractService.w9()) {
                    str2 = "cohost";
                } else if (iInteractService.o1()) {
                    str2 = "multiguest";
                } else {
                    str2 = "broadcast";
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append('_');
            sbLIZ.append("");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C20337914i1<Map<String, Map<String, String>>> c20337914i1 = InterfaceC766480U4w.LJJJIL;
            Map<String, String> map = c20337914i1.LIZIZ().get(strLIZIZ);
            if (map != null && (str3 = map.get(str)) != null) {
                j = CastLongProtector.parseLong(str3);
            } else {
                j = 0;
            }
            if ((System.currentTimeMillis() - j) / ((long) LSPassThroughRecordSizeConfig.DEFAULT) <= LiveEffectCheckUpdateInterval.INSTANCE.getInterval() && Intrinsics.LJFF(strLIZIZ, stickerEffectViewModel.LLIZLLLIL.get(str))) {
                z = false;
            } else {
                if (c20337914i1.LIZIZ().get(strLIZIZ) == null) {
                    c20337914i1.LIZIZ().put(strLIZIZ, new LinkedHashMap());
                }
                Map<String, String> map2 = c20337914i1.LIZIZ().get(strLIZIZ);
                if (map2 != null) {
                    map2.put(str, String.valueOf(System.currentTimeMillis()));
                }
                c20337914i1.LIZJ();
            }
        }
        stickerEffectViewModel.LLIZLLLIL.put(str, strLIZIZ);
        if (z) {
            C20441214yg.LIZIZ("EffectMemoryOpt", "shouldCheckUpdate is true.");
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object IQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect r7, X.InterfaceC1364105Vn<? super java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C767440U8o
            if (r0 == 0) goto L81
            r5 = r8
            X.0U8o r5 = (X.C767440U8o) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 1
            if (r0 == 0) goto L51
            if (r0 != r3) goto L8d
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            X.0UMl r1 = (X.C771050UMl) r1
            T r1 = r1.LIZIZ
        L28:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.android.livesdkapi.depend.model.LiveEffect> r2 = X.C0U8F.LIZJ
            java.lang.String r0 = r7.getResourceId()
            java.lang.Object r0 = r2.get(r0)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            if (r0 == 0) goto L37
            r7 = r0
        L37:
            java.lang.String r3 = "StickerEffectDynamicAdaptiveManager"
            if (r1 == 0) goto L87
            java.lang.String r0 = r7.getResourceId()
            r2.put(r0, r7)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r2 = X.C0U8F.LIZIZ
            java.lang.String r0 = r7.getResourceId()
            r2.put(r0, r1)
            java.lang.String r0 = "fetchGradeEffectListSuccess"
            X.C20441214yg.LIZIZ(r3, r0)
            return r1
        L51:
            X.C155000ia.LIZIZ(r1)
            r0 = 0
            if (r7 != 0) goto L58
            return r0
        L58:
            long r0 = r7.getEffectId()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.List<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r1 = X.C0U8F.LIZIZ
            java.lang.String r0 = r7.getResourceId()
            java.lang.Object r1 = r1.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r0 = X.C500260Jjc.LJJIJIIJI(r1)
            if (r0 == 0) goto L74
            if (r1 != 0) goto L28
        L74:
            X.01hF r0 = r6.LLILZ
            r5.LL = r7
            r5.LLILZ = r3
            java.lang.Object r1 = r0.LJFF(r2, r5)
            if (r1 != r4) goto L24
            return r4
        L81:
            X.0U8o r5 = new X.0U8o
            r5.<init>(r6, r8)
            goto L12
        L87:
            java.lang.String r0 = "fetchGradeEffectListFail"
            X.C20441214yg.LIZIZ(r3, r0)
            return r1
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.IQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0146, code lost:
    
        if (((java.lang.Boolean) r8).booleanValue() == false) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0227  */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(java.lang.String r21, X.InterfaceC1364105Vn<? super kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.JQ2(java.lang.String, X.05Vn):java.lang.Object");
    }

    public final Unit RQ2(String str, boolean z) {
        Boolean boolValueOf;
        AnonymousClass0956 anonymousClass0956;
        this.LLJIJIL = str;
        AnonymousClass0956 anonymousClass09562 = this.LLJILJIL;
        if (anonymousClass09562 != null) {
            boolValueOf = Boolean.valueOf(anonymousClass09562.isActive());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (anonymousClass0956 = this.LLJILJIL) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJILJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C402401hO(this, str, null, z), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object TQ2(java.util.List<X.C0UBH> r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C767490U8t
            if (r0 == 0) goto L8b
            r5 = r13
            X.0U8t r5 = (X.C767490U8t) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 == r3) goto L28
            if (r0 != r6) goto L91
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L75
            goto L25
        L2c:
            X.C155000ia.LIZIZ(r1)
            X.1DDr r8 = r11.LLILLL     // Catch: java.lang.Exception -> L75
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L75
            r7.<init>()     // Catch: java.lang.Exception -> L75
            java.util.Iterator r10 = r12.iterator()     // Catch: java.lang.Exception -> L75
        L3a:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L67
            java.lang.Object r9 = r10.next()     // Catch: java.lang.Exception -> L75
            r2 = r9
            X.0UBH r2 = (X.C0UBH) r2     // Catch: java.lang.Exception -> L75
            com.bytedance.android.livesdk.livesetting.broadcast.LiveInteractionEffectEnableSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveInteractionEffectEnableSetting.INSTANCE     // Catch: java.lang.Exception -> L75
            boolean r0 = r0.inExperiment()     // Catch: java.lang.Exception -> L75
            if (r0 != 0) goto L5e
            com.bytedance.android.livesdk.livesetting.broadcast.LiveInteractionEffectBlockListSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveInteractionEffectBlockListSetting.INSTANCE     // Catch: java.lang.Exception -> L75
            java.lang.String[] r1 = r0.getValue()     // Catch: java.lang.Exception -> L75
            java.lang.String r0 = r2.LIZIZ     // Catch: java.lang.Exception -> L75
            boolean r0 = X.C13LQ.LJIILLIIL(r0, r1)     // Catch: java.lang.Exception -> L75
            if (r0 == 0) goto L5e
            goto L60
        L5e:
            r0 = 1
            goto L61
        L60:
            r0 = 0
        L61:
            if (r0 == 0) goto L3a
            r7.add(r9)     // Catch: java.lang.Exception -> L75
            goto L3a
        L67:
            X.00u9 r0 = new X.00u9     // Catch: java.lang.Exception -> L75
            r0.<init>(r7)     // Catch: java.lang.Exception -> L75
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = r8.emit(r0, r5)     // Catch: java.lang.Exception -> L75
            if (r0 != r4) goto L25
            goto L99
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.1DDr r2 = r11.LLILLL
            X.01gQ r1 = new X.01gQ
            java.lang.String r0 = "fetchCategoryList failed"
            r1.<init>(r3, r0)
            r5.LLILLL = r6
            java.lang.Object r0 = r2.emit(r1, r5)
            if (r0 != r4) goto L25
            return r4
        L8b:
            X.0U8t r5 = new X.0U8t
            r5.<init>(r11, r13)
            goto L12
        L91:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L99:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.TQ2(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void BQ2(int i, int i2, C0U8C c0u8c) throws JSONException {
        String strWp;
        if (LiveEffectDynamicAdaptiveSetting.INSTANCE.disable()) {
            return;
        }
        C0U8F c0u8f = C0U8F.LIZ;
        int iLJ = -3;
        if (i2 != 1) {
            if (i == 0) {
                iLJ = 0;
            } else {
                iLJ = C13LZ.LJ(C0U8F.LJ + i, -3, 0);
            }
        }
        C0U8F.LJ = iLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateLevel: currentLevel = ");
        sbLIZ.append(C0U8F.LJ);
        C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ));
        PerformanceManagerImpl performanceManagerImplRs = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).Rs();
        int i3 = C0U8F.LJ;
        performanceManagerImplRs.getClass();
        C405701hv.LJII = i3;
        if (LiveEffectDynamicAdaptiveForbidApplyWhenLevelChangeSetting.INSTANCE.enable()) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("start apply effect adapt, level: ");
        sbLIZ2.append(i);
        sbLIZ2.append(", forceDowngrade: ");
        sbLIZ2.append(i2);
        C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ2));
        LiveEffect liveEffect = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(this.LLILZ.LJIJ()));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("currentEffect: ");
        sbLIZ3.append(liveEffect);
        sbLIZ3.append(", gradeKey: ");
        if (liveEffect != null) {
            strWp = liveEffect.Wp();
        } else {
            strWp = null;
        }
        sbLIZ3.append(strWp);
        C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ3));
        if (liveEffect == null) {
            if (c0u8c != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("error_code", -1);
                c0u8c.LIZ(C786410Ut5.J3(jSONObject));
                return;
            }
            return;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("start applyEffectAdapt, effectId: ");
        sbLIZ4.append(liveEffect.getEffectId());
        sbLIZ4.append(", isDynamicGrade: ");
        sbLIZ4.append(liveEffect.LJJLIIIJJI());
        C20441214yg.LIZIZ("StickerEffectDynamicAdaptiveManager", C2188811AlT.LIZIZ(sbLIZ4));
        if (liveEffect.LJJLIIIJJI()) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C0U8B(liveEffect, this, c0u8c, null), 2);
        } else {
            if (c0u8c == null) {
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", -2);
            c0u8c.LIZ(C786410Ut5.J3(jSONObject2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
    
        if (((java.lang.Boolean) r5).booleanValue() == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0145 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object HQ2(java.lang.String r15, java.lang.String r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instruction units count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.HQ2(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object UQ2(com.bytedance.ies.sdk.datachannel.DataChannel r16, java.lang.String r17, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r18) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.UQ2(com.bytedance.ies.sdk.datachannel.DataChannel, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object WQ2(boolean r10, com.google.gson.n r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r9 = this;
            java.lang.String r2 = "body"
            boolean r0 = r12 instanceof X.C767460U8q
            if (r0 == 0) goto L2a
            r8 = r12
            X.0U8q r8 = (X.C767460U8q) r8
            int r3 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L2a
            int r3 = r3 - r1
            r8.LLILZ = r3
        L14:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r4 = 102(0x66, float:1.43E-43)
            r3 = 40
            java.lang.String r5 = "status"
            r6 = 1
            if (r0 == 0) goto L38
            if (r0 != r6) goto L30
            com.google.gson.n r11 = r8.LL
            goto L5f
        L2a:
            X.0U8q r8 = new X.0U8q
            r8.<init>(r9, r12)
            goto L14
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r11.LJJIJIIJIL(r2)     // Catch: java.lang.IllegalStateException -> L94
            if (r0 != 0) goto L44
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.IllegalStateException -> L94
            return r0
        L44:
            com.google.gson.n r2 = r11.LJJIJ(r2)     // Catch: java.lang.IllegalStateException -> L94
            if (r2 != 0) goto L4d
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.IllegalStateException -> L94
            return r0
        L4d:
            X.01hF r1 = r9.LLILZ     // Catch: java.lang.IllegalStateException -> L94
            if (r10 == 0) goto L53
            r0 = 1
            goto L54
        L53:
            r0 = 0
        L54:
            r8.LL = r11     // Catch: java.lang.IllegalStateException -> L94
            r8.LLILZ = r6     // Catch: java.lang.IllegalStateException -> L94
            java.lang.Object r1 = r1.LJIJI(r0, r2, r8)     // Catch: java.lang.IllegalStateException -> L94
            if (r1 != r7) goto L62
            return r7
        L5f:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.IllegalStateException -> L94
        L62:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.IllegalStateException -> L94
            boolean r0 = r1.booleanValue()     // Catch: java.lang.IllegalStateException -> L94
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.IllegalStateException -> L94
            boolean r0 = X.C500260Jjc.LJJJI(r0)     // Catch: java.lang.IllegalStateException -> L94
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.IllegalStateException -> L94
            r11.LJJIII(r0, r5)     // Catch: java.lang.IllegalStateException -> L94
            java.lang.String r1 = "InteractiveE#net"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch: java.lang.IllegalStateException -> L94
            X.C20441214yg.LIZIZ(r1, r0)     // Catch: java.lang.IllegalStateException -> L94
            X.0U78 r2 = X.C0UA1.LIZ()     // Catch: java.lang.IllegalStateException -> L94
            X.0UCj r0 = X.C768430UCj.LIZ     // Catch: java.lang.IllegalStateException -> L94
            int r1 = X.C768430UCj.LIZ()     // Catch: java.lang.IllegalStateException -> L94
            java.lang.String r0 = r11.toString()     // Catch: java.lang.IllegalStateException -> L94
            r2.sendEffectMsg(r3, r4, r1, r0)     // Catch: java.lang.IllegalStateException -> L94
            goto Lbd
        L94:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            java.lang.Integer r0 = X.C2286608xc.LJ(r6)
            r11.LJJIII(r0, r5)
            java.lang.String r0 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "InteractiveE#netError"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0U78 r2 = X.C0UA1.LIZ()
            X.0UCj r0 = X.C768430UCj.LIZ
            int r1 = X.C768430UCj.LIZ()
            java.lang.String r0 = r11.toString()
            r2.sendEffectMsg(r3, r4, r1, r0)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.WQ2(boolean, com.google.gson.n, X.05Vn):java.lang.Object");
    }

    public static void FQ2(StickerEffectViewModel stickerEffectViewModel, LiveEffect liveEffect, C0U45 c0u45, int i) {
        C767430U8n c767430U8n;
        C0U45 c0u452 = c0u45;
        if ((i & 2) != 0) {
            c0u452 = null;
        }
        stickerEffectViewModel.getClass();
        ((ConcurrentLinkedQueue) stickerEffectViewModel.LLILZLL).add(new C767430U8n(liveEffect, c0u452, false, false, false));
        if ((!((ConcurrentLinkedQueue) stickerEffectViewModel.LLILZLL).isEmpty()) && stickerEffectViewModel.LLIZ == null && (c767430U8n = (C767430U8n) ((ConcurrentLinkedQueue) stickerEffectViewModel.LLILZLL).poll()) != null) {
            stickerEffectViewModel.GQ2(c767430U8n.LIZ, c767430U8n.LIZIZ, c767430U8n.LIZJ, c767430U8n.LIZLLL, c767430U8n.LJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(java.lang.String r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof X.C767350U8f
            if (r0 == 0) goto Lab
            r4 = r11
            X.0U8f r4 = (X.C767350U8f) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lab
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L3c
            if (r0 != r3) goto Lb2
            X.C155000ia.LIZIZ(r2)
        L25:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
        L2b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L30:
            X.C155000ia.LIZIZ(r2)
            r4.LLILLL = r1
            java.lang.Object r2 = r7.MQ2(r8, r9, r10, r4)
            if (r2 != r5) goto L3f
            return r5
        L3c:
            X.C155000ia.LIZIZ(r2)
        L3f:
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r2 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r2
            if (r2 != 0) goto L49
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L49:
            X.0U6F r0 = r7.LLILZIL
            if (r0 == 0) goto La7
            boolean r0 = X.C0U5H.LJIILL(r2)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L57:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto L2b
            X.0U6F r1 = r7.LLILZIL
            if (r1 == 0) goto La9
            r4.LLILLL = r3
            X.099m r6 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r6.<init>(r0)
            boolean r0 = r2.LJIIIZ()
            if (r0 == 0) goto L7c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r2.LIZJ
            if (r0 != 0) goto L7c
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = X.C0UEO.LIZIZ(r2)
            r2.LIZJ = r0
        L7c:
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r2.LIZJ
            if (r3 == 0) goto L9b
            com.ss.android.ugc.effectmanager.EffectManager r2 = r1.LIZIZ
            X.01zH r1 = new X.01zH
            r0 = 1
            r1.<init>(r6, r0)
            r2.fetchEffect(r3, r1)
        L8b:
            java.lang.Object r2 = r6.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L98
            X.C099Q.LIZJ(r4)
        L98:
            if (r2 != r5) goto L25
            return r5
        L9b:
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.C189200o6.m2constructorimpl(r0)
            r6.resumeWith(r0)
            goto L8b
        La7:
            r0 = 0
            goto L57
        La9:
            r1 = 0
            goto L2b
        Lab:
            X.0U8f r4 = new X.0U8f
            r4.<init>(r7, r11)
            goto L12
        Lb2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.DQ2(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0142, code lost:
    
        if (r2 == null) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121 A[PHI: r5
      0x0121: PHI (r5v9 int) = (r5v7 int), (r5v0 int) binds: [B:71:0x016c, B:49:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166 A[PHI: r5 r6
      0x0166: PHI (r5v8 int) = (r5v7 int), (r5v9 int), (r5v9 int) binds: [B:71:0x016c, B:60:0x0146, B:67:0x0164] A[DONT_GENERATE, DONT_INLINE]
      0x0166: PHI (r6v3 java.lang.Object) = (r6v0 java.lang.Object), (r6v0 java.lang.Object), (r6v5 java.lang.Object) binds: [B:71:0x016c, B:60:0x0146, B:67:0x0164] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020f  */
    /* JADX WARN: Type inference failed for: r2v31, types: [X.0U9e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(java.lang.String r16, java.lang.String r17, java.lang.String r18, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r19) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.MQ2(java.lang.String, java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0145  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object PQ2(long r15, X.EnumC768840UDy r17, java.util.List<? extends com.bytedance.android.livesdkapi.depend.model.LiveEffect> r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.PQ2(long, X.0UDy, java.util.List, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v1 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final void GQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect r15, X.C0U45 r16, boolean r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            java.lang.Thread r1 = X.C786410Ut5.u3()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            r7 = r19
            r6 = r18
            r5 = r17
            r4 = r16
            r3 = r15
            r2 = r14
            if (r0 == 0) goto L29
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZIZ()
            X.0U46 r1 = new X.0U46
            r1.<init>()
            r0.submit(r1)
        L28:
            return
        L29:
            boolean r0 = r2.yQ2(r3)
            if (r0 != 0) goto L49
            r2.LLIZ = r3
            kotlin.jvm.internal.AwS221S0300000_12 r1 = new kotlin.jvm.internal.AwS221S0300000_12
            r0 = 34
            r1.<init>(r4, r3, r2, r0)
            X.0U3k<T> r8 = r2.LL
            if (r8 == 0) goto L28
            X.0U3j r10 = new X.0U3j
            r10.<init>(r1, r2, r3)
            r9 = r3
            r11 = r5
            r12 = r6
            r13 = r7
            r8.LJIIL(r9, r10, r11, r12, r13)
            return
        L49:
            r2.EQ2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.GQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.0U45, boolean, boolean, boolean):void");
    }
}
