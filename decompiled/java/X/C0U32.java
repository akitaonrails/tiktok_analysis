package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0U32, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.karaoke.download.KaraokeDownloader$downloadSongInfo$2", f = "KaraokeDownloader.kt", l = {152}, m = "invokeSuspend")
public final class C0U32 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super EnumC765560U1i>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0U33 LLILLL;
    public final /* synthetic */ C0U22 LLILZ;
    public final /* synthetic */ Function2<Long, Integer, Unit> LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0U32(C0U33 c0u33, C0U22 c0u22, Function2<? super Long, ? super Integer, Unit> function2, boolean z, InterfaceC1364105Vn<? super C0U32> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0u33;
        this.LLILZ = c0u22;
        this.LLILZIL = function2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0U32 c0u32 = new C0U32(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0u32.LLILLJJLI = obj;
        return c0u32;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC765560U1i enumC765560U1i;
        ArrayList arrayList;
        List listLJIIJJI;
        String str;
        Object objLIZ = obj;
        C1C7U.LIZ("KaraokeDownloader@4c6a.downloadSongInfo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = false;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LIZIZ("KaraokeDownloader", "Some Job goes wrong");
            this.LLILLL.LIZIZ--;
            enumC765560U1i = EnumC765560U1i.FAIL;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZ);
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL.LIZIZ >= LiveKaraokeMaxDownloadCount.INSTANCE.maxCount()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Song Job stashed: ");
                sbLIZ.append(this.LLILZ.LIZJ);
                C20441214yg.LIZIZ("KaraokeDownloader", C2188811AlT.LIZIZ(sbLIZ));
                this.LLILLL.LIZLLL.addLast(new C0U38(this.LLILZ, this.LLILZIL, this.LLILZLL));
                EnumC765560U1i enumC765560U1i2 = EnumC765560U1i.QUEUE_FULL;
                C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2");
                return enumC765560U1i2;
            }
            int i2 = C771340UNo.LIZ;
            C771340UNo.LJFF("karaoke", String.valueOf(this.LLILZ.LIZ));
            this.LLILLL.LIZIZ++;
            C0U33 c0u33 = this.LLILLL;
            C0U22 c0u22 = this.LLILZ;
            boolean z2 = this.LLILZLL;
            synchronized (c0u33) {
                arrayList = new ArrayList();
                if (!z2) {
                    listLJIIJJI = C1697810uHb.LJIIJJI(c0u22.LIZIZ, c0u22.LJIIIIZZ, c0u22.LJIIIZ);
                } else {
                    listLJIIJJI = Collections.singletonList(c0u22.LJIIIZ);
                }
                C20441214yg.LIZIZ("KaraokeDownloader", "Cache Key List: " + c0u33.LIZJ.keySet());
                if (c0u33.LIZJ.containsKey((Object) Long.valueOf(c0u22.LIZ)) && C2355009Kq.LIZ(C0U23.LIZ(c0u22.LJIIIIZZ.LIZIZ())) && C2355009Kq.LIZ(C0U23.LIZ(c0u22.LIZIZ.LIZIZ())) && C2355009Kq.LIZ(C0U23.LIZ(c0u22.LJIIIZ.LIZIZ()))) {
                    List list = (List) c0u33.LIZJ.get((Object) Long.valueOf(c0u22.LIZ));
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listLJIIJJI) {
                        if (!a0.LJJJIL(((C0U3A) obj2).LIZIZ)) {
                            arrayList2.add(obj2);
                        }
                    }
                    int i3 = 0;
                    for (Object obj3 : arrayList2) {
                        int i4 = i3 + 1;
                        if (i3 >= 0) {
                            C0U3A c0u3a = (C0U3A) obj3;
                            if (list != null) {
                                str = (String) ListProtector.get(list, i3);
                            } else {
                                str = null;
                            }
                            if (!Intrinsics.LJFF(str, c0u3a.LIZ)) {
                                arrayList.add(new Pair(c0u3a.LIZIZ, c0u3a.LIZIZ()));
                            }
                            i3 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    C20441214yg.LIZIZ("KaraokeDownloader", "TaskCount: " + arrayList.size());
                } else {
                    C20441214yg.LIZIZ("KaraokeDownloader", "TaskCount: 3, not in cache");
                    ArrayList<C0U3A> arrayList3 = new ArrayList();
                    for (Object obj4 : listLJIIJJI) {
                        if (!a0.LJJJIL(((C0U3A) obj4).LIZIZ)) {
                            arrayList3.add(obj4);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
                    for (C0U3A c0u3a2 : arrayList3) {
                        arrayList4.add(new Pair(c0u3a2.LIZIZ, c0u3a2.LIZIZ()));
                    }
                    arrayList.addAll(arrayList4);
                }
            }
            C0U22 c0u222 = this.LLILZ;
            C0U33 c0u332 = this.LLILLL;
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            int i5 = 0;
            for (Object obj5 : arrayList) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    Pair pair = (Pair) obj5;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("async create: ");
                    sbLIZ2.append((String) pair.getFirst());
                    sbLIZ2.append(", ");
                    sbLIZ2.append((String) pair.getSecond());
                    C20441214yg.LIZIZ("KaraokeDownloader", C2188811AlT.LIZIZ(sbLIZ2));
                    arrayList5.add(C23250099c.LIZIZ(interfaceC497601wk, C2296908zH.LIZ(), null, new C0U31(pair, c0u222, c0u332, null), 2));
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            if (!arrayList5.isEmpty()) {
                Function2<Long, Integer, Unit> function2 = this.LLILZIL;
                if (function2 != null) {
                    C0U33 c0u333 = this.LLILLL;
                    C0U22 c0u223 = this.LLILZ;
                    c0u333.LJ.put(C2286608xc.LJFF(c0u223.LIZ), new C0U37(arrayList5.size(), c0u223.LIZ, function2));
                }
                this.LL = 1;
                objLIZ = C1D9F.LIZ(arrayList5, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2");
                    return objLJFF;
                }
            } else {
                C20441214yg.LIZIZ("KaraokeDownloader", "No Need");
                this.LLILLL.LIZIZ--;
                enumC765560U1i = EnumC765560U1i.SUCCESS;
                C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2");
                return enumC765560U1i;
            }
        }
        List list2 = (List) objLIZ;
        this.LLILLL.LJ.remove(C2286608xc.LJFF(this.LLILZ.LIZ));
        C20441214yg.LIZIZ("KaraokeDownloader", "All Jobs finished");
        this.LLILLL.LIZIZ--;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!((Boolean) it2.next()).booleanValue()) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            this.LLILLL.LIZ(this.LLILZ, this.LLILZLL);
            enumC765560U1i = EnumC765560U1i.SUCCESS;
        } else {
            C0U33 c0u334 = this.LLILLL;
            C0U22 c0u224 = this.LLILZ;
            boolean z3 = this.LLILZLL;
            c0u334.getClass();
            C0U33.LIZJ(c0u224, z3);
            enumC765560U1i = EnumC765560U1i.FAIL;
        }
        C1C7U.LIZIZ("KaraokeDownloader@4c6a.downloadSongInfo$2");
        return enumC765560U1i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super EnumC765560U1i> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
