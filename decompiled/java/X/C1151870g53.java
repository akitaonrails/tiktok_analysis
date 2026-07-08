package X;

/* JADX INFO: renamed from: X.0g53, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1151870g53 implements InterfaceC1478005qU {
    public final int $t;
    public Object l1;
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
        }
    }

    public C1151870g53(C1124820fNQ c1124820fNQ, int i) {
        this.$t = i;
        this.l1 = c1124820fNQ;
        this.s0 = "pm_mt_match_gift_option_gift_panel_banner";
    }

    public static final void subscribe$0(C1151870g53 c1151870g53, C09AJ c09aj) {
        C1124820fNQ c1124820fNQ = (C1124820fNQ) c1151870g53.l1;
        String str = c1151870g53.s0;
        c1124820fNQ.getClass();
        C1C7U.LIZ("I18nCenterV2@f9b7.asyncGetTranslation$3L");
        c09aj.onNext(new C1096190edF(c1124820fNQ.LIZ(str)));
        C1C7U.LIZIZ("I18nCenterV2@f9b7.asyncGetTranslation$3L");
    }

    public static final void subscribe$1(C1151870g53 c1151870g53, C09AJ c09aj) {
        C1124820fNQ c1124820fNQ = (C1124820fNQ) c1151870g53.l1;
        String str = c1151870g53.s0;
        c1124820fNQ.getClass();
        C1C7U.LIZ("I18nCenterV2@f9b7.asyncGetTranslation$6L");
        c09aj.onNext(new C1096190edF(c1124820fNQ.LIZ(str)));
        C1C7U.LIZIZ("I18nCenterV2@f9b7.asyncGetTranslation$6L");
    }

    public C1151870g53(C1124820fNQ c1124820fNQ, String str, int i) {
        this.$t = i;
        this.l1 = c1124820fNQ;
        this.s0 = str;
    }
}
