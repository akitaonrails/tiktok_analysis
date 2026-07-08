package X;

import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0NQF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel$loadPage$1", f = "MusicGiftDetailViewModel.kt", l = {561}, m = "invokeSuspend")
public final class C0NQF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQF(MusicGiftDetailViewModel musicGiftDetailViewModel, long j, long j2, boolean z, boolean z2, InterfaceC1364105Vn<? super C0NQF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = z;
        this.LLILZLL = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQF(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailViewModel@deb0.loadPage$1");
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
            InterfaceC346201Wa<AbstractC1147530fy3<C1147420fxs>> interfaceC346201WaLIZ = musicGiftDetailViewModel.LLILZ.LIZ(this.LLILLL, this.LLILZ, musicGiftDetailViewModel.LLILLJJLI);
            final boolean z = this.LLILZIL;
            final MusicGiftDetailViewModel musicGiftDetailViewModel2 = this.LLILLJJLI;
            final long j = this.LLILLL;
            final long j2 = this.LLILZ;
            final boolean z2 = this.LLILZLL;
            InterfaceC346701Wf<? super AbstractC1147530fy3<C1147420fxs>> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fxa
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    boolean z3;
                    C1147420fxs c1147420fxs;
                    long jLongValue;
                    long jLongValue2;
                    C1147020fxE c1147020fxE;
                    EnumC1142190fpR enumC1142190fpR;
                    C1147350fxl c1147350fxlBQ2;
                    C1147070fxJ c1147070fxJ;
                    Object next;
                    C1147330fxj next2;
                    C1147070fxJ c1147070fxJ2;
                    AbstractC1147530fy3 abstractC1147530fy3 = (AbstractC1147530fy3) obj2;
                    if (abstractC1147530fy3 instanceof C1147590fy9) {
                        if (z) {
                            C1147060fxI c1147060fxIHQ2 = musicGiftDetailViewModel2.HQ2();
                            c1147420fxs = (C1147420fxs) ((C1147590fy9) abstractC1147530fy3).LIZ;
                            Long lValueOf = Long.valueOf(c1147060fxIHQ2.LIZ.LIZ);
                            if (lValueOf.longValue() > 0) {
                                long jLongValue3 = lValueOf.longValue();
                                C197024126s c197024126s = new C197024126s(C09RB.LJIILIIL(new C1939607ik(c1147420fxs.LIZIZ), new C1147490fxz()));
                                while (true) {
                                    if (c197024126s.hasNext()) {
                                        next = c197024126s.next();
                                        if (((C1147350fxl) next).LIZ == jLongValue3) {
                                            break;
                                        }
                                    } else {
                                        next = null;
                                        break;
                                    }
                                }
                                C1147350fxl c1147350fxlLIZ = (C1147350fxl) next;
                                C1147350fxl c1147350fxlLIZ2 = c1147060fxIHQ2.LIZ();
                                if (c1147350fxlLIZ != null) {
                                    if ((c1147350fxlLIZ.LJFF == null || !(!a0.LJJJIL(r2.LIZ))) && c1147350fxlLIZ2 != null && (c1147070fxJ2 = c1147350fxlLIZ2.LJFF) != null) {
                                        c1147350fxlLIZ = C1147350fxl.LIZ(c1147350fxlLIZ, c1147070fxJ2, false, 2015);
                                    }
                                    c1147350fxlLIZ2 = c1147350fxlLIZ;
                                } else if (c1147350fxlLIZ2 != null) {
                                }
                                Iterator<C1147330fxj> it2 = c1147420fxs.LIZIZ.iterator();
                                loop1: while (true) {
                                    if (it2.hasNext()) {
                                        next2 = it2.next();
                                        List<C1147350fxl> list = next2.LJI;
                                        if (!(list instanceof Collection) || !list.isEmpty()) {
                                            Iterator<C1147350fxl> it3 = list.iterator();
                                            while (it3.hasNext()) {
                                                if (it3.next().LIZ == jLongValue3) {
                                                    break loop1;
                                                }
                                            }
                                        }
                                    } else {
                                        next2 = null;
                                        break;
                                    }
                                }
                                C1147330fxj c1147330fxj = next2;
                                if (c1147330fxj == null && (c1147330fxj = (C1147330fxj) C13LP.LJJJLL(c1147420fxs.LIZIZ)) == null) {
                                    c1147420fxs = new C1147420fxs(c1147420fxs.LIZ, Collections.singletonList(new C1147330fxj(-1L, "Music Gifts", null, "", false, false, Collections.singletonList(c1147350fxlLIZ2))));
                                } else {
                                    List<C1147330fxj> list2 = c1147420fxs.LIZIZ;
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                                    for (C1147330fxj c1147330fxjLIZ : list2) {
                                        if (c1147330fxjLIZ.LIZ == c1147330fxj.LIZ) {
                                            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                                            c13dvLIZIZ.add(c1147350fxlLIZ2);
                                            List<C1147350fxl> list3 = c1147330fxjLIZ.LJI;
                                            ArrayList arrayList2 = new ArrayList();
                                            for (C1147350fxl c1147350fxl : list3) {
                                                if (c1147350fxl.LIZ != jLongValue3) {
                                                    arrayList2.add(c1147350fxl);
                                                }
                                            }
                                            c13dvLIZIZ.addAll(arrayList2);
                                            c1147330fxjLIZ = C1147330fxj.LIZ(c1147330fxjLIZ, 0L, null, null, null, false, C1697820uHc.LIZ(c13dvLIZIZ), 63);
                                        }
                                        arrayList.add(c1147330fxjLIZ);
                                    }
                                    c1147420fxs = new C1147420fxs(c1147420fxs.LIZ, arrayList);
                                }
                            }
                        } else {
                            c1147420fxs = (C1147420fxs) ((C1147590fy9) abstractC1147530fy3).LIZ;
                        }
                        MusicGiftDetailViewModel musicGiftDetailViewModel3 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel3.LLJJJJ = true;
                        musicGiftDetailViewModel3.LLJ = c1147420fxs;
                        ((LinkedHashMap) musicGiftDetailViewModel3.LLJLIL).clear();
                        MusicGiftDetailViewModel musicGiftDetailViewModel4 = musicGiftDetailViewModel2;
                        Long lLJFF = C2286608xc.LJFF(c1147420fxs.LIZ);
                        if (lLJFF.longValue() > 0) {
                            jLongValue = lLJFF.longValue();
                        } else {
                            jLongValue = j;
                        }
                        musicGiftDetailViewModel4.LLJILJIL = jLongValue;
                        MusicGiftDetailViewModel musicGiftDetailViewModel5 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel5.LLJJIJI = false;
                        musicGiftDetailViewModel5.LLJJIJIIJIL = false;
                        musicGiftDetailViewModel5.LLJJIJIL = null;
                        musicGiftDetailViewModel5.LLJJJ = false;
                        musicGiftDetailViewModel5.LLJJJIL = null;
                        Long lLJFF2 = C2286608xc.LJFF(j2);
                        if (lLJFF2.longValue() > 0) {
                            jLongValue2 = lLJFF2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        MusicGiftDetailViewModel musicGiftDetailViewModel6 = musicGiftDetailViewModel2;
                        boolean z4 = musicGiftDetailViewModel6.LLJL;
                        musicGiftDetailViewModel6.LLJL = false;
                        MusicGiftDetailViewModel.AQ2(musicGiftDetailViewModel6, jLongValue2, false, z4, z4, 2);
                        musicGiftDetailViewModel2.QQ2();
                        if (z4) {
                            musicGiftDetailViewModel2.FQ2(false, false, false);
                        }
                        MusicGiftDetailViewModel musicGiftDetailViewModel7 = musicGiftDetailViewModel2;
                        if (!z4 && z2 && jLongValue2 <= 0) {
                            long j3 = musicGiftDetailViewModel7.LLJILJIL;
                            long j4 = musicGiftDetailViewModel7.LLJILLL;
                            if (MusicGiftDetailViewModel.KQ2(musicGiftDetailViewModel7.LLL, j3, j4)) {
                                musicGiftDetailViewModel7.wQ2();
                            } else {
                                AnonymousClass0956 anonymousClass0956 = musicGiftDetailViewModel7.LLJJIII;
                                if (anonymousClass0956 != null) {
                                    anonymousClass0956.LIZIZ(null);
                                }
                                musicGiftDetailViewModel7.LLJJIII = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(musicGiftDetailViewModel7), null, null, new C592870NNd(musicGiftDetailViewModel7, j3, j4, null), 3);
                            }
                        } else {
                            musicGiftDetailViewModel7.wQ2();
                        }
                        MusicGiftDetailViewModel musicGiftDetailViewModel8 = musicGiftDetailViewModel2;
                        if (!musicGiftDetailViewModel8.LLJJLIIIJLLLLLLLZ && ((enumC1142190fpR = (c1147020fxE = musicGiftDetailViewModel8.LL).LJ) == EnumC1142190fpR.GIFT_TRAY || enumC1142190fpR == EnumC1142190fpR.MUSIC_GUIDE)) {
                            long j5 = c1147020fxE.LIZ;
                            if (j5 > 0 && musicGiftDetailViewModel8.LLJILLL == j5 && (c1147350fxlBQ2 = musicGiftDetailViewModel8.BQ2()) != null && (c1147070fxJ = c1147350fxlBQ2.LJFF) != null && (!a0.LJJJIL(c1147070fxJ.LIZ))) {
                                musicGiftDetailViewModel8.LLJJLIIIJLLLLLLLZ = true;
                                musicGiftDetailViewModel8.TQ2();
                            }
                        }
                    } else if (Intrinsics.LJFF(abstractC1147530fy3, C1147570fy7.LIZ)) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel9 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel9.LLJL = false;
                        musicGiftDetailViewModel9.LLJ = null;
                        musicGiftDetailViewModel9.LLJJIJI = false;
                        musicGiftDetailViewModel9.LLJJIJIIJIL = true;
                        musicGiftDetailViewModel9.LLJJIJIL = null;
                        musicGiftDetailViewModel9.LLJJJ = false;
                        musicGiftDetailViewModel9.LLJJJIL = null;
                        musicGiftDetailViewModel9.QQ2();
                    } else if (abstractC1147530fy3 instanceof C1147540fy4) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel10 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel10.LLJL = false;
                        musicGiftDetailViewModel10.LLJJIJI = false;
                        musicGiftDetailViewModel10.LLJJIJIIJIL = false;
                        String str = ((C1147540fy4) abstractC1147530fy3).LIZIZ;
                        if (str == null || !(!a0.LJJJIL(str))) {
                            str = "Unable to load music gifts. Please try again.";
                        }
                        musicGiftDetailViewModel10.LLJJIJIL = str;
                        MusicGiftDetailViewModel musicGiftDetailViewModel11 = musicGiftDetailViewModel2;
                        musicGiftDetailViewModel11.LLJJJ = false;
                        musicGiftDetailViewModel11.LLJJJIL = null;
                        musicGiftDetailViewModel11.QQ2();
                    } else if (Intrinsics.LJFF(abstractC1147530fy3, C1147580fy8.LIZ)) {
                        MusicGiftDetailViewModel musicGiftDetailViewModel12 = musicGiftDetailViewModel2;
                        if (musicGiftDetailViewModel12.LLJ == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        musicGiftDetailViewModel12.LLJJIJI = z3;
                        musicGiftDetailViewModel12.LLJJIJIIJIL = false;
                        musicGiftDetailViewModel12.LLJJIJIL = null;
                        musicGiftDetailViewModel12.QQ2();
                    } else {
                        throw new C1954807lC();
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadPage$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailViewModel@deb0.loadPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
