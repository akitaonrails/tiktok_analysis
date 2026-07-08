package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881460Yi0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC879010Ye3 LL;
    public final /* synthetic */ C879540Yeu<?> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C881460Yi0(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = interfaceC879010Ye3;
        this.LLILLJJLI = c879540Yeu;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String strLJIILLIIL;
        InterfaceC879010Ye3 interfaceC879010Ye3 = this.LL;
        IMUser iMUser = null;
        String mobValue = interfaceC879010Ye3 instanceof C878960Ydy ? ((C878960Ydy) interfaceC879010Ye3).LLILLL.getMobValue() : interfaceC879010Ye3 instanceof C878950Ydx ? ((C878950Ydx) interfaceC879010Ye3).LLILLL.getMobValue() : null;
        C885310YoD c885310YoD = C885310YoD.LIZ;
        InterfaceC879010Ye3 interfaceC879010Ye32 = this.LL;
        c885310YoD.getClass();
        String strLJIJ = C885310YoD.LJIJ(interfaceC879010Ye32);
        InterfaceC1490905sZ<?> interfaceC1490905sZ = this.LLILLJJLI.LIZ;
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1709506mj.INSTANCE)) {
            Boolean bool = Boolean.FALSE;
            C882270YjJ<?, ?> c882270YjJ = this.LLILLJJLI.LJ.get(C886520YqA.LIZ);
            Object obj = c882270YjJ != null ? c882270YjJ.LIZIZ : null;
            List list = obj instanceof List ? (List) obj : null;
            C882270YjJ<?, ?> c882270YjJ2 = this.LLILLJJLI.LJ.get(C886590YqH.LIZ);
            Object obj2 = c882270YjJ2 != null ? c882270YjJ2.LIZIZ : null;
            strLJIILLIIL = C885310YoD.LJIILLIIL(bool, list, obj2 instanceof MatchedFriendStruct ? (MatchedFriendStruct) obj2 : null);
        } else if (interfaceC1490905sZ instanceof InterfaceC1606206Qq) {
            C882270YjJ<?, ?> c882270YjJ3 = this.LLILLJJLI.LJ.get(C886760YqY.LIZ);
            Object obj3 = c882270YjJ3 != null ? c882270YjJ3.LIZIZ : null;
            Boolean bool2 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
            C882270YjJ<?, ?> c882270YjJ4 = this.LLILLJJLI.LJ.get(C886670YqP.LIZ);
            Object obj4 = c882270YjJ4 != null ? c882270YjJ4.LIZIZ : null;
            strLJIILLIIL = C885310YoD.LJIILLIIL(bool2, obj4 instanceof List ? (List) obj4 : null, null);
        } else {
            strLJIILLIIL = null;
        }
        String str = this.LLILLL;
        String str2 = this.LLILZ;
        C879540Yeu<?> c879540Yeu = this.LLILLJJLI;
        InterfaceC1490905sZ<?> interfaceC1490905sZ2 = c879540Yeu.LIZ;
        T t = c879540Yeu.LIZJ;
        C0Y8T c0y8t = t instanceof C0Y8T ? (C0Y8T) t : null;
        if (interfaceC1490905sZ2 instanceof C882110Yj3) {
            C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
            Object obj5 = c1490405sU != null ? c1490405sU.LIZIZ : null;
            if (obj5 instanceof IMUser) {
                iMUser = (IMUser) obj5;
            }
        }
        C885310YoD.LJJII(str, str2, interfaceC1490905sZ2, c0y8t, iMUser, this.LLILZIL, this.LLILZLL, mobValue, strLJIILLIIL, strLJIJ);
        return Unit.LIZ;
    }
}
