package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ybg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877540Ybg implements InterfaceC878560YdK {
    public final C878960Ydy LIZ;
    public final C877560Ybi LIZIZ;
    public final C877570Ybj LIZJ;
    public final int LIZLLL;
    public final C0YUD LJ;
    public final Set<InterfaceC878620YdQ> LJFF;
    public boolean LJI;

    public C877540Ybg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C877540Ybg)) {
            return false;
        }
        C877540Ybg c877540Ybg = (C877540Ybg) obj;
        return Intrinsics.LJFF(this.LIZ, c877540Ybg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c877540Ybg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c877540Ybg.LIZJ) && this.LIZLLL == c877540Ybg.LIZLLL && Intrinsics.LJFF(this.LJ, c877540Ybg.LJ) && Intrinsics.LJFF(this.LJFF, c877540Ybg.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        Set<InterfaceC878620YdQ> set = this.LJFF;
        return iHashCode + (set == null ? 0 : set.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageRequestDataSourceArgs(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", identifier=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", seqIdHelper=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", pageSize=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", messageRequestConvModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aggregationSource=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC878560YdK
    public final int LJFF() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC878560YdK
    public final /* bridge */ /* synthetic */ InterfaceC879010Ye3 getKey() {
        return this.LIZ;
    }

    public final C869380Y8q LIZ(String str, C877600Ybm c877600Ybm) {
        long j;
        C877610Ybn c877610Ybn;
        C869380Y8q c869380Y8q = new C869380Y8q(this.LIZ.toString(), str, LIZIZ(this, c877600Ybm.LIZ, true), LIZIZ(this, c877600Ybm.LIZ, false), 100);
        if (this.LIZ.LLILLL == EnumC880520YgU.PRIORITY) {
            c869380Y8q = C869380Y8q.LIZ(c869380Y8q, C0Y97.UNREAD, 0L, 0L, 123);
        }
        if (this.LIZ.LLILZ == EnumC877640Ybq.SORT_BY_TIME_RECENT) {
            AbstractC877620Ybo abstractC877620Ybo = c877600Ybm.LIZ;
            if ((abstractC877620Ybo instanceof C877610Ybn) && (c877610Ybn = (C877610Ybn) abstractC877620Ybo) != null) {
                j = c877610Ybn.LIZ;
            } else {
                j = Long.MAX_VALUE;
            }
            c869380Y8q = C869380Y8q.LIZ(c869380Y8q, null, j, 0L, 95);
        }
        return C869380Y8q.LIZ(c869380Y8q, null, 0L, c877600Ybm.LIZIZ, 63);
    }

    public static C873950YQf LIZIZ(C877540Ybg c877540Ybg, AbstractC877620Ybo abstractC877620Ybo, boolean z) {
        Double dValueOf;
        C877630Ybp c877630Ybp;
        AbstractC874090YQt abstractC874090YQt;
        Long lValueOf;
        C877610Ybn c877610Ybn;
        C878960Ydy c878960Ydy = c877540Ybg.LIZ;
        ArrayList arrayList = new ArrayList();
        if (c878960Ydy.LLILZ == EnumC877640Ybq.SORT_BY_FOLLOWER_HIGH_TO_LOW) {
            EnumC877690Ybv enumC877690Ybv = EnumC877690Ybv.FOLLOWER_NUM;
            arrayList.add(new C873970YQh(new C873980YQi(enumC877690Ybv.getKey(), "Integer"), C874040YQo.LIZ, new C874000YQk("-1")));
            C873980YQi c873980YQi = new C873980YQi(enumC877690Ybv.getKey(), "Integer");
            if (z) {
                abstractC874090YQt = C874030YQn.LIZ;
            } else {
                abstractC874090YQt = C874060YQq.LIZ;
            }
            if ((abstractC877620Ybo instanceof C877610Ybn) && (c877610Ybn = (C877610Ybn) abstractC877620Ybo) != null) {
                lValueOf = Long.valueOf(c877610Ybn.LIZ);
            } else {
                lValueOf = null;
            }
            arrayList.add(new C873970YQh(c873980YQi, abstractC874090YQt, new C874000YQk(String.valueOf(lValueOf))));
        }
        if (c878960Ydy.LLILLL == EnumC880520YgU.PRIORITY) {
            EnumC877690Ybv.Companion.getClass();
            C873980YQi c873980YQi2 = new C873980YQi(C877700Ybw.LIZ().getKey(), "Double");
            C874000YQk c874000YQk = new C874000YQk(String.valueOf(C885630Yoj.LJ()));
            C873970YQh c873970YQh = new C873970YQh(c873980YQi2, C874040YQo.LIZ, c874000YQk);
            C874070YQr c874070YQr = C874070YQr.LIZ;
            AbstractC874090YQt abstractC874090YQt2 = C874030YQn.LIZ;
            arrayList.add(new C873970YQh(c873970YQh, c874070YQr, new C873970YQh(c873980YQi2, abstractC874090YQt2, c874000YQk)));
            C873980YQi c873980YQi3 = new C873980YQi(C877700Ybw.LIZ().getKey(), "Double");
            if (!z) {
                abstractC874090YQt2 = C874060YQq.LIZ;
            }
            if ((abstractC877620Ybo instanceof C877630Ybp) && (c877630Ybp = (C877630Ybp) abstractC877620Ybo) != null) {
                dValueOf = Double.valueOf(c877630Ybp.LIZ);
            } else {
                dValueOf = null;
            }
            arrayList.add(new C873970YQh(c873980YQi3, abstractC874090YQt2, new C874000YQk(String.valueOf(dValueOf))));
            if (C612090Nzb.LIZ()) {
                EnumC877690Ybv enumC877690Ybv2 = EnumC877690Ybv.PRIORITY_SHOW_COUNT;
                arrayList.add(new C873970YQh(new C873970YQh(new C873980YQi(enumC877690Ybv2.getKey(), "Integer"), C874060YQq.LIZ, new C874000YQk(String.valueOf(C877780Yc4.LIZ().maxTimeShowInPriority))), c874070YQr, new C873970YQh(new C873980YQi(enumC877690Ybv2.getKey(), null), C874050YQp.LIZ, new C874000YQk("null"))));
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC874080YQs abstractC874080YQs = (AbstractC874080YQs) ListProtector.get(arrayList, 0);
            int size = arrayList.size();
            int i = 1;
            while (i < size) {
                C873970YQh c873970YQh2 = new C873970YQh(abstractC874080YQs, C874020YQm.LIZ, (AbstractC874080YQs) ListProtector.get(arrayList, i));
                i++;
                abstractC874080YQs = c873970YQh2;
            }
            if (abstractC874080YQs != null) {
                C878960Ydy c878960Ydy2 = c877540Ybg.LIZ;
                ArrayList arrayList2 = new ArrayList();
                if (c878960Ydy2.LLILZ == EnumC877640Ybq.SORT_BY_FOLLOWER_HIGH_TO_LOW) {
                    arrayList2.add(new C869450Y8x(EnumC877690Ybv.FOLLOWER_NUM.getKey(), C0VRJ.DESC, "Integer"));
                }
                if (c878960Ydy2.LLILLL == EnumC880520YgU.PRIORITY) {
                    EnumC877690Ybv.Companion.getClass();
                    arrayList2.add(new C869450Y8x(C877700Ybw.LIZ().getKey(), C0VRJ.DESC, "Double"));
                }
                return new C873950YQf(abstractC874080YQs, arrayList2);
            }
        }
        return null;
    }

    public C877540Ybg(C878960Ydy c878960Ydy, int i, C0YUD c0yud, Set set) {
        C877560Ybi c877560Ybi = C877560Ybi.LIZ;
        C877570Ybj c877570Ybj = new C877570Ybj();
        this.LIZ = c878960Ydy;
        this.LIZIZ = c877560Ybi;
        this.LIZJ = c877570Ybj;
        this.LIZLLL = i;
        this.LJ = c0yud;
        this.LJFF = set;
    }
}
