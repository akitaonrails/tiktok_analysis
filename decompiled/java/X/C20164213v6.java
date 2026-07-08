package X;

import Y.ARunnableS130S0100000_30;

/* JADX INFO: renamed from: X.13v6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20164213v6 implements C18HS {
    public static final C20164213v6 LIZ = new C20164213v6();

    @Override // X.C18HS
    public final void onPageCreated(Object obj) {
    }

    @Override // X.C18HS
    public final void onPageDestroyed(Object obj) {
    }

    @Override // X.C18HS
    public final void onPagePaused(Object obj) {
    }

    @Override // X.C18HS
    public final void onPageResumed(Object obj) {
        if (obj == null) {
            C20163513uz.LIZIZ(105, null);
        } else {
            C20163513uz.LJIIIZ.execute(new ARunnableS130S0100000_30(obj, 41));
        }
    }
}
