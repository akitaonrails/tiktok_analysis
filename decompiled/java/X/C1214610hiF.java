package X;

/* JADX INFO: renamed from: X.0hiF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1214610hiF {
    public static final C1214610hiF LIZ = new C1214610hiF();

    public static void LIZ() {
        ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().setAcceptPrivatePolicy(true);
        C632140Oqq.LIZLLL(((InterfaceC1214620hiG) C1214630hiH.LIZ.getValue()).LIZJ(), "/aweme/v1/accept-private-policy/", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0hiE
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("PublishPrivacyConfirmManager@de05.acceptPrivacyPolicy$1");
                C1C7U.LIZIZ("PublishPrivacyConfirmManager@de05.acceptPrivacyPolicy$1");
            }
        }, new C09JN() { // from class: X.0hiD
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PublishPrivacyConfirmManager@de05.acceptPrivacyPolicy$2");
                C0XQ7.LJFF().getCurUser().setAcceptPrivatePolicy(false);
                C1C7U.LIZIZ("PublishPrivacyConfirmManager@de05.acceptPrivacyPolicy$2");
            }
        });
    }

    public static boolean LIZIZ() {
        boolean z = !((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isAcceptPrivatePolicy();
        if (!z || !((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isSecret()) {
            return z;
        }
        LIZ();
        return false;
    }
}
