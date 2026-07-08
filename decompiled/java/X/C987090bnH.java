package X;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0bnH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C987090bnH implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public static final void run$0(C987090bnH c987090bnH) {
        ((C983820bi0) c987090bnH.l0).LIZIZ(0L, 0L, (TimeUnit) c987090bnH.l1);
    }

    public static final void run$1(C987090bnH c987090bnH) {
        ((C946690ak7) c987090bnH.l0).LJIIIZ(EnumC946760akE.FOLLOW_GUIDE_NORMAL, EnumC946710ak9.GIFT, 2, ((C922880a7i) c987090bnH.l1).LIZIZ, C13BV.INSTANCE, null);
    }

    public static final void run$2(C987090bnH c987090bnH) {
        C946690ak7 c946690ak7 = (C946690ak7) c987090bnH.l0;
        EnumC946760akE enumC946760akE = EnumC946760akE.FOLLOW_GUIDE_NORMAL;
        EnumC946710ak9 enumC946710ak9 = EnumC946710ak9.LIKE;
        C13BV c13bv = C13BV.INSTANCE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(((C946730akB) c987090bnH.l1).LIZ));
        c946690ak7.LJIIIZ(enumC946760akE, enumC946710ak9, 4, c13bv, arrayList, null);
    }

    public static final void run$3(C987090bnH c987090bnH) {
        ((C946690ak7) c987090bnH.l0).LJIIIZ(EnumC946760akE.FOLLOW_GUIDE_NORMAL, EnumC946710ak9.GIFT, 1, ((C922880a7i) c987090bnH.l1).LIZIZ, C13BV.INSTANCE, null);
    }

    public C987090bnH(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
