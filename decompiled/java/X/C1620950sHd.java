package X;

import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: renamed from: X.0sHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620950sHd implements InterfaceC1478005qU {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Float> c09aj) {
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

    public C1620950sHd(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(C1620950sHd c1620950sHd, C09AJ c09aj) {
        C1C7U.LIZ("StoryBrandView@9ac4.createProgressObservable$1");
        ((C1609580rzI) c1620950sHd.l0).LLILZIL = new AwS603S0100000_24((C19482611Ke) c09aj, 477);
        C1C7U.LIZIZ("StoryBrandView@9ac4.createProgressObservable$1");
    }

    public static final void subscribe$1(C1620950sHd c1620950sHd, C09AJ c09aj) {
        C1609220ryi c1609220ryi;
        AwS603S0100000_24 awS603S0100000_24;
        C1C7U.LIZ("AvatarRingView@35dc.createProgressObservable$1");
        ((C1609220ryi) c1620950sHd.l0).LLJI = new AwS603S0100000_24((C19482611Ke) c09aj, 605);
        C1609220ryi c1609220ryi2 = (C1609220ryi) c1620950sHd.l0;
        if (c1609220ryi2.LLJIJIL == null && c1609220ryi2.getAnimateProgress() > 0.0f && (awS603S0100000_24 = (c1609220ryi = (C1609220ryi) c1620950sHd.l0).LLJI) != null) {
            awS603S0100000_24.invoke(Float.valueOf(c1609220ryi.getAnimateProgress()));
        }
        C1C7U.LIZIZ("AvatarRingView@35dc.createProgressObservable$1");
    }

    public static final void subscribe$2(C1620950sHd c1620950sHd, C09AJ c09aj) {
        C1C7U.LIZ("SocPubAvatarFrameLayout@82d8.createProgressObservable$1");
        ((C1609500rzA) c1620950sHd.l0).LLJJIJIIJIL = new AwS603S0100000_24((C19482611Ke) c09aj, 693);
        C1C7U.LIZIZ("SocPubAvatarFrameLayout@82d8.createProgressObservable$1");
    }
}
