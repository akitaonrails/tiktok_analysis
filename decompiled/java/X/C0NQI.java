package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NQI, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$loadTabPage$1", f = "MusicGiftDetailViewModel.kt", l = {714}, m = "invokeSuspend")
public final class C0NQI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;
    public final /* synthetic */ C1147330fxj LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQI(MusicGiftDetailViewModel musicGiftDetailViewModel, C1147330fxj c1147330fxj, boolean z, InterfaceC1364105Vn<? super C0NQI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
        this.LLILLL = c1147330fxj;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.loadTabPage$1");
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
            MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLILLJJLI;
            InterfaceC597550Nc9 interfaceC597550Nc9 = musicGiftDetailViewModel.LLILZ;
            long j = musicGiftDetailViewModel.LLJILJIL;
            C1147330fxj c1147330fxj = this.LLILLL;
            InterfaceC346201Wa<AbstractC1147530fy3<C1147330fxj>> interfaceC346201WaLIZLLL = interfaceC597550Nc9.LIZLLL(j, c1147330fxj.LIZ, c1147330fxj.LIZLLL);
            final MusicGiftDetailViewModel musicGiftDetailViewModel2 = this.LLILLJJLI;
            final C1147330fxj c1147330fxj2 = this.LLILLL;
            final boolean z = this.LLILZ;
            InterfaceC346701Wf<? super AbstractC1147530fy3<C1147330fxj>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fxc
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v6 */
                /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List<X.0fxl>] */
                /* JADX WARN: Type inference failed for: r3v8, types: [java.util.List<X.0fxl>] */
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    ?? arrayList;
                    boolean z2;
                    long jLongValue;
                    boolean z3;
                    AbstractC1147530fy3 abstractC1147530fy3 = (AbstractC1147530fy3) obj2;
                    if (abstractC1147530fy3 instanceof C1147590fy9) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel3 = musicGiftDetailViewModel2;
                        C1147330fxj c1147330fxj3 = c1147330fxj2;
                        C1147330fxj c1147330fxj4 = (C1147330fxj) ((C1147590fy9) abstractC1147530fy3).LIZ;
                        boolean z4 = z;
                        C1147420fxs c1147420fxs = musicGiftDetailViewModel3.LLJ;
                        if (c1147420fxs != null) {
                            List<C1147330fxj> list = c1147420fxs.LIZIZ;
                            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                            for (C1147330fxj c1147330fxjLIZ : list) {
                                if (c1147330fxjLIZ.LIZ == c1147330fxj3.LIZ) {
                                    if (z4) {
                                        arrayList = c1147330fxj4.LJI;
                                    } else {
                                        List listLJLIL = C13LP.LJLIL(c1147330fxj4.LJI, c1147330fxjLIZ.LJI);
                                        HashSet hashSet = new HashSet();
                                        arrayList = new ArrayList();
                                        for (Object obj3 : (ArrayList) listLJLIL) {
                                            if (hashSet.add(Long.valueOf(((C1147350fxl) obj3).LIZ))) {
                                                arrayList.add(obj3);
                                            }
                                        }
                                    }
                                    Long lValueOf = Long.valueOf(c1147330fxj4.LIZ);
                                    if (lValueOf.longValue() > 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (Boolean.valueOf(z2).booleanValue()) {
                                        jLongValue = lValueOf.longValue();
                                    } else {
                                        jLongValue = c1147330fxjLIZ.LIZ;
                                    }
                                    String str = c1147330fxj4.LIZIZ;
                                    if (a0.LJJJIL(str)) {
                                        str = c1147330fxjLIZ.LIZIZ;
                                    }
                                    ImageModel imageModel = c1147330fxj4.LIZJ;
                                    if (imageModel == null) {
                                        imageModel = c1147330fxjLIZ.LIZJ;
                                    }
                                    if (!c1147330fxj4.LJFF && !c1147330fxjLIZ.LJFF) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (!z4 && arrayList.isEmpty()) {
                                        arrayList = c1147330fxjLIZ.LJI;
                                    }
                                    c1147330fxjLIZ = C1147330fxj.LIZ(c1147330fxj4, jLongValue, str, imageModel, null, z3, arrayList, 24);
                                }
                                arrayList2.add(c1147330fxjLIZ);
                            }
                            musicGiftDetailViewModel3.LLJ = new C1147420fxs(c1147420fxs.LIZ, arrayList2);
                        }
                        ((LinkedHashMap) musicGiftDetailViewModel2.LLJLIL).clear();
                        MusicGiftDetailViewModel musicGiftDetailViewModel4 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel4.LLJJJ = false;
                        musicGiftDetailViewModel4.LLJJJIL = null;
                        MusicGiftDetailViewModel.AQ2(musicGiftDetailViewModel4, musicGiftDetailViewModel4.LLJILLL, MusicGiftDetailViewModel.DQ2(c1147330fxj2), false, false, 12);
                        musicGiftDetailViewModel2.QQ2();
                    } else if (Intrinsics.LJFF(abstractC1147530fy3, C1147570fy7.LIZ)) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel5 = musicGiftDetailViewModel2;
                        C1147330fxj c1147330fxj5 = c1147330fxj2;
                        C1147420fxs c1147420fxs2 = musicGiftDetailViewModel5.LLJ;
                        if (c1147420fxs2 != null) {
                            List<C1147330fxj> list2 = c1147420fxs2.LIZIZ;
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                            for (C1147330fxj c1147330fxjLIZ2 : list2) {
                                if (c1147330fxjLIZ2.LIZ == c1147330fxj5.LIZ) {
                                    c1147330fxjLIZ2 = C1147330fxj.LIZ(c1147330fxjLIZ2, 0L, null, null, "", false, null, 103);
                                }
                                arrayList3.add(c1147330fxjLIZ2);
                            }
                            musicGiftDetailViewModel5.LLJ = new C1147420fxs(c1147420fxs2.LIZ, arrayList3);
                        }
                        MusicGiftDetailViewModel musicGiftDetailViewModel6 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel6.LLJJJ = false;
                        musicGiftDetailViewModel6.LLJJJIL = null;
                        musicGiftDetailViewModel6.QQ2();
                    } else if (abstractC1147530fy3 instanceof C1147540fy4) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel7 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel7.LLJJJ = false;
                        String str2 = ((C1147540fy4) abstractC1147530fy3).LIZIZ;
                        if (str2 == null || !(!a0.LJJJIL(str2))) {
                            str2 = "Unable to load music gifts. Please try again.";
                        }
                        musicGiftDetailViewModel7.LLJJJIL = str2;
                        musicGiftDetailViewModel2.QQ2();
                    } else if (Intrinsics.LJFF(abstractC1147530fy3, C1147580fy8.LIZ)) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel8 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel8.LLJJJ = true;
                        musicGiftDetailViewModel8.LLJJJIL = null;
                        musicGiftDetailViewModel8.QQ2();
                    } else {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZLLL.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadTabPage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadTabPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
