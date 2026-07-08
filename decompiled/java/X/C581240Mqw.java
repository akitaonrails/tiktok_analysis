package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.p1;

/* JADX INFO: renamed from: X.0Mqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581240Mqw implements InterfaceC1478005qU {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C581240Mqw c581240Mqw, C09AJ c09aj) {
        p1 p1Var = (p1) c581240Mqw.l1;
        ShortVideoContext shortVideoContext = (ShortVideoContext) c581240Mqw.l2;
        String str = c581240Mqw.s0;
        p1Var.getClass();
        C1C7U.LIZ("GoNextFactoryFactory@2bad.getMultiEditVideoStatusRecordData$2L");
        C579640MoM.LIZ.getClass();
        C579640MoM.LIZIZ(shortVideoContext);
        if (p1Var.LIZ.I4()) {
            C571900Mbs.LIZ("fail to stopRecord before goNext(Normal)");
        }
        c09aj.onNext(AbstractC19852312lt.fromNullable(p1.LJFF(shortVideoContext, str)));
        c09aj.onComplete();
        C1C7U.LIZIZ("GoNextFactoryFactory@2bad.getMultiEditVideoStatusRecordData$2L");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(X.C581240Mqw r10, X.C09AJ r11) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C581240Mqw.subscribe$1(X.0Mqw, X.09AJ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$2(X.C581240Mqw r13, X.C09AJ r14) {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C581240Mqw.subscribe$2(X.0Mqw, X.09AJ):void");
    }

    public C581240Mqw(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
