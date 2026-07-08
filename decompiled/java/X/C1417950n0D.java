package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.cutsame.cut_android.NLEPrepareListener;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.interfaces.ITemplateApplyService;
import com.ss.android.ugc.cut_ui.CutSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS266S0300000_22;
import kotlin.jvm.internal.AwS457S0200000_22;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0n0D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.util.AutoCutTemplateUtils$prepareTemplateSourceAsFlow$1", f = "AutoCutTemplateUtils.kt", l = {588}, m = "invokeSuspend")
public final class C1417950n0D extends C09AX implements Function2<C094D<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ CutSource LLILZIL;
    public final /* synthetic */ List<MetaExt> LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ LifecycleOwner LLJILJIL;
    public final /* synthetic */ InterfaceC1418120n0U LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ InterfaceC1635410sex LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417950n0D(String str, String str2, CutSource cutSource, List<MetaExt> list, Context context, String str3, boolean z, int i, boolean z2, LifecycleOwner lifecycleOwner, InterfaceC1418120n0U interfaceC1418120n0U, String str4, InterfaceC1635410sex interfaceC1635410sex, InterfaceC1364105Vn<? super C1417950n0D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = cutSource;
        this.LLILZLL = list;
        this.LLIZ = context;
        this.LLIZLLLIL = str3;
        this.LLJ = z;
        this.LLJI = i;
        this.LLJIJIL = z2;
        this.LLJILJIL = lifecycleOwner;
        this.LLJILJILJ = interfaceC1418120n0U;
        this.LLJILLL = str4;
        this.LLJJ = interfaceC1635410sex;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417950n0D c1417950n0D = new C1417950n0D(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c1417950n0D.LLILLJJLI = obj;
        return c1417950n0D;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutTemplateUtils@43a9.prepareTemplateSourceAsFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutTemplateUtils ----------- prepareTemplateSourceExt: start, templateId = ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", templateUrl=");
            sbLIZ.append(this.LLILZ);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
            final C259800zU c259800zU = new C259800zU();
            final C259800zU c259800zU2 = new C259800zU();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
            C1418000n0I.LIZIZ.put(this.LLILZIL, this.LLILZLL);
            C1418000n0I c1418000n0I = C1418000n0I.LIZ;
            final CutSource cutSource = this.LLILZIL;
            final Context context = this.LLIZ;
            String str = this.LLIZLLLIL;
            boolean z = this.LLJ;
            final int i2 = this.LLJI;
            final boolean z2 = this.LLJIJIL;
            final String str2 = this.LLILLL;
            final String str3 = this.LLILZ;
            final InterfaceC1418120n0U interfaceC1418120n0U = this.LLJILJILJ;
            final List<MetaExt> list = this.LLILZLL;
            final String str4 = this.LLJILLL;
            final InterfaceC1635410sex interfaceC1635410sex = this.LLJJ;
            NLEPrepareListener nLEPrepareListener = new NLEPrepareListener() { // from class: X.0n0H
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onPreSuccess(NLETemplateModel nLETemplateModel) {
                    VecNLETrackSPtr tracks;
                    NLETrack next;
                    if (nLETemplateModel == null || nLETemplateModel.getMainTrack() == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AutoCutTemplateUtils AUTO_CUT_NO_TRACK_CRASH: onPreSuccess templateId=");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", templateUrl=");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", cutSource=");
                        sbLIZ2.append(cutSource.value);
                        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    if (C294050Bfn.LIZ()) {
                        boolean zLLIIIL = C351220Dpo.LLIIIL(nLETemplateModel, C294030Bfl.LIZ());
                        if (nLETemplateModel != null) {
                            C0EYQ.LJII(nLETemplateModel, i2, str2, zLLIIIL);
                        }
                    } else if (nLETemplateModel != null) {
                        C0EYQ.LJI(nLETemplateModel, i2, str2);
                    }
                    c094d.LJIIIIZZ(new C23152095i(nLETemplateModel, null));
                    c094d.LJIIIIZZ(C096I.LIZ);
                    C1418000n0I c1418000n0I2 = C1418000n0I.LIZ;
                    InterfaceC1418120n0U interfaceC1418120n0U2 = interfaceC1418120n0U;
                    List<MetaExt> list2 = list;
                    String str5 = str4;
                    C094D<C096H> c094d2 = c094d;
                    C259800zU<List<MetaExt>> c259800zU3 = c259800zU2;
                    C1418060n0O c1418060n0O = new C1418060n0O(i2, context, cutSource, str5, atomicBoolean, atomicBoolean2, c259800zU3, c259800zU, c094d2, z2);
                    AwS457S0200000_22 awS457S0200000_22 = new AwS457S0200000_22(atomicBoolean, (AtomicBoolean) c094d, (C094D<? super C096H>) 5);
                    c1418000n0I2.getClass();
                    C1418000n0I.LJFF(interfaceC1418120n0U2, list2, str5, c1418060n0O, awS457S0200000_22);
                    c094d.LJIIIIZZ(C096J.LIZ);
                    if (i2 == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                        InterfaceC1635410sex interfaceC1635410sex2 = interfaceC1635410sex;
                        if (interfaceC1635410sex2 != null) {
                            C1453060nuq.LIZ(interfaceC1635410sex2);
                        }
                        if (nLETemplateModel != null) {
                            C1418000n0I.LIZJ(nLETemplateModel, interfaceC1635410sex);
                        }
                        if (!C294040Bfm.LIZ() && nLETemplateModel != null && (tracks = nLETemplateModel.getTracks()) != null) {
                            Iterator<NLETrack> it2 = tracks.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (next.getTrackType() == NLETrackType.AUDIO) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            NLETrack nLETrack = next;
                            if (nLETrack != null) {
                                nLETemplateModel.removeTrack(nLETrack);
                            }
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onSuccess(NLETemplateModel nLETemplateModel) {
                    c094d.LJIIIIZZ(new C23144095a(null));
                    c259800zU.element = nLETemplateModel;
                    if (nLETemplateModel == 0 || nLETemplateModel.getMainTrack() == null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("AutoCutTemplateUtils AUTO_CUT_NO_TRACK_CRASH: onSuccess templateId=");
                        sbLIZ2.append(str2);
                        sbLIZ2.append(", templateUrl=");
                        sbLIZ2.append(str3);
                        sbLIZ2.append(", cutSource=");
                        sbLIZ2.append(cutSource.value);
                        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils template source prepare onSuccess");
                    AtomicBoolean atomicBoolean3 = atomicBoolean;
                    AtomicBoolean atomicBoolean4 = atomicBoolean2;
                    C259800zU<NLETemplateModel> c259800zU3 = c259800zU;
                    C259800zU<List<MetaExt>> c259800zU4 = c259800zU2;
                    CutSource cutSource2 = cutSource;
                    C094D<C096H> c094d2 = c094d;
                    C1417950n0D.LIZ(i2, context, cutSource2, str4, atomicBoolean3, atomicBoolean4, c259800zU3, c259800zU4, c094d2, z2);
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onError(int i3, String str5) {
                    Map<CutSource, List<MetaExt>> map = C1418000n0I.LIZIZ;
                    map.remove(cutSource);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils template source prepare compress onFailure: code = ");
                    sbLIZ2.append(i3);
                    sbLIZ2.append(", msg = ");
                    sbLIZ2.append(str5);
                    sbLIZ2.append(", templateMetaMap size=");
                    sbLIZ2.append(map.size());
                    C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
                    C1417950n0D.LJ(atomicBoolean, c094d, new C1417890n07(i3, str5));
                }

                @Override // com.bytedance.ies.cutsame.cut_android.NLEPrepareListener
                public final void onProgress(float f, String str5) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils template source prepare onProgress: ");
                    sbLIZ2.append(f);
                    C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                    c094d.LJIIIIZZ(new C096H(f, str5) { // from class: X.096F
                        public final float LIZ;
                        public final String LIZIZ;

                        public final boolean equals(Object obj2) {
                            if (this == obj2) {
                                return true;
                            }
                            if (!(obj2 instanceof C096F)) {
                                return false;
                            }
                            C096F c096f = (C096F) obj2;
                            return Float.compare(this.LIZ, c096f.LIZ) == 0 && Intrinsics.LJFF(this.LIZIZ, c096f.LIZIZ);
                        }

                        public final String toString() {
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("OnProgress(progress=");
                            sbLIZ3.append(this.LIZ);
                            sbLIZ3.append(", msg=");
                            sbLIZ3.append(this.LIZIZ);
                            sbLIZ3.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ3);
                        }

                        public final int hashCode() {
                            int iFloatToIntBits = Float.floatToIntBits(this.LIZ) * 31;
                            String str6 = this.LIZIZ;
                            return iFloatToIntBits + (str6 == null ? 0 : str6.hashCode());
                        }

                        {
                            this.LIZ = f;
                            this.LIZIZ = str5;
                        }
                    });
                }
            };
            BinderC532620Kui binderC532620Kui = new BinderC532620Kui("autocut_capcut", this.LLILLL, 4);
            BinderC532620Kui.LIZIZ(binderC532620Kui, this.LLJI, C0L95.AUTOCUT_LIST.getValue(), null, 60);
            LifecycleOwner lifecycleOwner = this.LLJILJIL;
            c1418000n0I.getClass();
            C1418000n0I.LIZ(cutSource, context, str, z, i2, z2, nLEPrepareListener, binderC532620Kui, lifecycleOwner);
            AwS266S0300000_22 awS266S0300000_22 = new AwS266S0300000_22(this.LLILZIL, this.LLJILJILJ, atomicBoolean, 31);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS266S0300000_22, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutTemplateUtils@43a9.prepareTemplateSourceAsFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutTemplateUtils@43a9.prepareTemplateSourceAsFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C096H> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LJ(AtomicBoolean atomicBoolean, C094D<? super C096H> c094d, C096H c096h) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        c094d.LJIIIIZZ(c096h);
        c094d.LJIIJJI(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized void LIZ(int i, Context context, CutSource cutSource, String str, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C259800zU c259800zU, C259800zU c259800zU2, C094D c094d, boolean z) {
        NLEResType nLEResType;
        Map linkedHashMap;
        if (atomicBoolean.get()) {
            return;
        }
        int i2 = 1;
        if (!atomicBoolean2.compareAndSet(false, true)) {
            return;
        }
        NLETemplateModel nLETemplateModel = (NLETemplateModel) c259800zU.element;
        List<MetaExt> list = (List) c259800zU2.element;
        if (nLETemplateModel != null && list != null) {
            Map<CutSource, List<MetaExt>> map = C1418000n0I.LIZIZ;
            map.remove(cutSource);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutTemplateUtils template source response templateMetaMap size=");
            sbLIZ.append(map.size());
            C1417710mzp.LIZ(LogLevel.LEVEL_DEBUG, C2188811AlT.LIZIZ(sbLIZ));
            for (MetaExt metaExt : list) {
                if (!C2286708xd.LIZJ(metaExt.path)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoCutTemplateUtils -----------prepareTemplateSource: fail, checkCompress error, path = ");
                    sbLIZ2.append(metaExt.path);
                    C1417710mzp.LIZ(LogLevel.LEVEL_ERROR, C2188811AlT.LIZIZ(sbLIZ2));
                    LJ(atomicBoolean, c094d, new C096G(4, "", "checkCompress error", new HashMap()));
                    return;
                }
            }
            c094d.LJIIIIZZ(C096L.LIZ);
            if (i == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                C1418000n0I.LIZ.getClass();
                CreativeInfo creativeInfoLIZIZ = C1418000n0I.LIZIZ(str);
                if (creativeInfoLIZIZ != null) {
                    C1418000n0I.LJI(nLETemplateModel, creativeInfoLIZIZ);
                }
            }
            s.LIZ.getClass();
            s.LJIIJJI(nLETemplateModel);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (MetaExt metaExt2 : list) {
                String str2 = metaExt2.path;
                if (metaExt2.isVideo()) {
                    nLEResType = NLEResType.VIDEO;
                } else {
                    nLEResType = NLEResType.IMAGE;
                }
                long j = metaExt2.duration;
                Long lValueOf = Long.valueOf(metaExt2.createTime);
                if (lValueOf.longValue() > 0) {
                    Pair[] pairArr = new Pair[i2];
                    pairArr[0] = new Pair("create_time", Long.valueOf(lValueOf.longValue()));
                    linkedHashMap = C2097608Jq.LJIIJ(pairArr);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                arrayList.add(new C0E4S(str2, nLEResType, j, 1.0f, 0L, j, null, linkedHashMap, 64));
                i2 = 1;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0CHQ.LIZ().LJIILL().updateVideoInfoCache(((C0E4S) it2.next()).LIZ);
            }
            if (C298910Bnd.LIZ()) {
                ITemplateApplyService iTemplateApplyService = (ITemplateApplyService) PluggableExtentionKt.pluggableSpi$default(ITemplateApplyService.class, false, false, false, 14, null);
                if (iTemplateApplyService != null) {
                    iTemplateApplyService.LIZ(nLETemplateModel, arrayList, C1412390mrF.LJIIJ, C1412660mrg.LIZJ(i), context, C0E4V.CIRCLE_V2, true, z, false);
                }
            } else {
                ITemplateApplyService iTemplateApplyService2 = (ITemplateApplyService) PluggableExtentionKt.pluggableSpi$default(ITemplateApplyService.class, false, false, false, 14, null);
                if (iTemplateApplyService2 != null) {
                    iTemplateApplyService2.LIZ((NLETemplateModel) c259800zU.element, arrayList, C1412390mrF.LJIIJ, C1412660mrg.LIZJ(i), context, C0E4V.NONE, false, z, false);
                }
            }
            NLEModel nLEModelSaveToDraft = NLETemplateModel.saveToDraft((NLETemplateModel) c259800zU.element);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutTemplateUtils -----------prepareTemplateSource: end ------------");
            c094d.LJIIIIZZ(C096K.LIZ);
            LJ(atomicBoolean, c094d, new C23149095f(nLEModelSaveToDraft, new HashMap()));
            return;
        }
        atomicBoolean2.set(false);
    }
}
