package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.favorites.business.aweme.ability.IAwemeCollectionState;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS154S0110000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: renamed from: X.0Svk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737100Svk {
    public final C735210Ssh LIZ;
    public final Function2<Intent, Boolean, Unit> LIZIZ;

    public final List<AbstractC737180Svs> LIZJ(C0HTT<C737030Svd> c0htt) {
        Boolean boolLIZ;
        Boolean boolLIZ2;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("obtainCandidateActions.isMyProfile: ");
        sbLIZ.append(this.LIZ.LJFF);
        sbLIZ.append(", sortType: ");
        sbLIZ.append(this.LIZ.LJIIJ);
        sbLIZ.append(", tabFrom: ");
        sbLIZ.append(this.LIZ.LJI);
        C1720106oR.LJI("LongPressActionManager", C2188811AlT.LIZIZ(sbLIZ));
        boolean zBooleanValue = false;
        if (this.LIZ.LJFF) {
            ArrayList arrayList = new ArrayList();
            switch (C1259070irx.LIZ[this.LIZ.LJI.ordinal()]) {
                case 1:
                    C735210Ssh c735210Ssh = this.LIZ;
                    if (c735210Ssh.LJIIJ == 0) {
                        boolean zIsTop = AwemeExtKt.isTop(c735210Ssh.LIZ);
                        C737130Svn c737130Svn = new C737130Svn(this.LIZ, c0htt);
                        c737130Svn.LLILLJJLI = new AwS154S0110000_11(zIsTop, this, 2);
                        arrayList.add(c737130Svn);
                    }
                    C737190Svt.LIZ.getClass();
                    if (!C737190Svt.LIZ()) {
                        EnumC1259080iry enumC1259080iry = this.LIZ.LJI;
                        C737040Sve c737040Sve = new C737040Sve(this.LIZ, c0htt);
                        c737040Sve.LLILLL = new AwS447S0200000_11(enumC1259080iry, this, 21);
                        arrayList.add(c737040Sve);
                    }
                    LIZIZ(arrayList, this.LIZ);
                    break;
                case 2:
                    EnumC1259080iry enumC1259080iry2 = this.LIZ.LJI;
                    C737040Sve c737040Sve2 = new C737040Sve(this.LIZ, c0htt);
                    c737040Sve2.LLILLL = new AwS447S0200000_11(enumC1259080iry2, this, 21);
                    arrayList.add(c737040Sve2);
                    break;
                case 3:
                    C737190Svt.LIZ.getClass();
                    if (!C737190Svt.LIZ()) {
                        C735210Ssh c735210Ssh2 = this.LIZ;
                        if (c735210Ssh2.LJIIIIZZ) {
                            C735150Ssb c735150Ssb = new C735150Ssb(c735210Ssh2);
                            c735150Ssb.LLILLJJLI = new AwS625S0100000_11(this, 126);
                            arrayList.add(c735150Ssb);
                        }
                    }
                    LIZIZ(arrayList, this.LIZ);
                    break;
                case 4:
                    IAwemeCollectionState iAwemeCollectionState = (IAwemeCollectionState) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionState.class, false, false, false, 14, null);
                    if (iAwemeCollectionState != null && (boolLIZ2 = iAwemeCollectionState.LIZ(this.LIZ.LIZ)) != null && boolLIZ2.booleanValue()) {
                        C734740Srw c734740Srw = new C734740Srw(this.LIZ, c0htt);
                        c734740Srw.LLILLL = new AwS154S0110000_11(true, this, 1);
                        arrayList.add(c734740Srw);
                    }
                    LIZIZ(arrayList, this.LIZ);
                    break;
                case 5:
                    LIZ(arrayList, c0htt);
                    LIZIZ(arrayList, this.LIZ);
                    break;
                case 6:
                    LIZIZ(arrayList, this.LIZ);
                    break;
                case 7:
                    break;
                default:
                    throw new C1954807lC();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((AbstractC737180Svs) obj).LIZIZ()) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        switch (C1259070irx.LIZ[this.LIZ.LJI.ordinal()]) {
            case 1:
                C737190Svt.LIZ.getClass();
                if (C737190Svt.LIZ() || C737190Svt.LIZLLL() == 1) {
                    C737140Svo c737140Svo = new C737140Svo(this.LIZ);
                    c737140Svo.LLILLJJLI = new AwS625S0100000_11(this, 125);
                    arrayList3.add(c737140Svo);
                }
                LIZIZ(arrayList3, this.LIZ);
                if (C737190Svt.LIZ()) {
                    LIZ(arrayList3, c0htt);
                    IAwemeCollectionState iAwemeCollectionState2 = (IAwemeCollectionState) PluggableExtentionKt.pluggableSpi$default(IAwemeCollectionState.class, false, false, false, 14, null);
                    if (iAwemeCollectionState2 != null && (boolLIZ = iAwemeCollectionState2.LIZ(this.LIZ.LIZ)) != null) {
                        zBooleanValue = boolLIZ.booleanValue();
                    }
                    C734740Srw c734740Srw2 = new C734740Srw(this.LIZ, c0htt);
                    c734740Srw2.LLILLL = new AwS154S0110000_11(zBooleanValue, this, 1);
                    arrayList3.add(c734740Srw2);
                }
                break;
            case 2:
            case 7:
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                C737190Svt.LIZ.getClass();
                if (C737190Svt.LIZLLL() == 1) {
                    C737140Svo c737140Svo2 = new C737140Svo(this.LIZ);
                    c737140Svo2.LLILLJJLI = new AwS625S0100000_11(this, 125);
                    arrayList3.add(c737140Svo2);
                }
                LIZIZ(arrayList3, this.LIZ);
                break;
            default:
                throw new C1954807lC();
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (((AbstractC737180Svs) obj2).LIZIZ()) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C737100Svk(C735210Ssh c735210Ssh, Function2<? super Intent, ? super Boolean, Unit> function2) {
        this.LIZ = c735210Ssh;
        this.LIZIZ = function2;
    }

    public final void LIZ(List<AbstractC737180Svs> list, C0HTT<C737030Svd> c0htt) {
        String str;
        boolean z;
        C735210Ssh c735210Ssh = this.LIZ;
        if (c735210Ssh.LJFF) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        C734060Sqq c734060Sqq = new C734060Sqq(str);
        if (c735210Ssh.LIZ.getUserDigg() == 0) {
            z = true;
        } else {
            z = false;
        }
        C734030Sqn c734030Sqn = new C734030Sqn(this.LIZ, c734060Sqq, c0htt);
        c734030Sqn.LLILZIL = new AwS154S0110000_11(z, this, 0);
        ((ArrayList) list).add(c734030Sqn);
    }

    public final void LIZIZ(List<AbstractC737180Svs> list, C735210Ssh c735210Ssh) {
        if (!c735210Ssh.LJIIIIZZ) {
            return;
        }
        C734070Sqr c734070Sqr = new C734070Sqr(c735210Ssh);
        c734070Sqr.LLILLJJLI = new AwS447S0200000_11(this, c735210Ssh, 20);
        ((ArrayList) list).add(c734070Sqr);
    }
}
