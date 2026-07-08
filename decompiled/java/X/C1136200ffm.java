package X;

import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueGiftModel;
import com.bytedance.android.livesdk.gift.receiving.model.GiftQueueUserModel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;

/* JADX INFO: renamed from: X.0ffm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136200ffm {
    public final C1136210ffn<Long, InterfaceC1136800fgk> LIZ;
    public final C1136210ffn<Long, InterfaceC1136160ffi> LIZIZ;

    public C1136200ffm(InterfaceC1132530fZr interfaceC1132530fZr) {
        boolean zIsEnableCacheThreadSafe = LiveGiftReceivingRefactorSetting.INSTANCE.isEnableCacheThreadSafe();
        this.LIZ = new C1136210ffn<>(zIsEnableCacheThreadSafe);
        this.LIZIZ = new C1136210ffn<>(zIsEnableCacheThreadSafe);
        C1137710fiD c1137710fiD = new C1137710fiD();
        AnonymousClass1378 anonymousClass1378 = c1137710fiD.LIZ;
        anonymousClass1378.getClass();
        anonymousClass1378.LIZLLL(C137L.LLILLJJLI);
        final AnonymousClass1378 anonymousClass13782 = c1137710fiD.LIZ;
        new Object(anonymousClass13782) { // from class: X.1379
            {
                boolean z;
                C137I c137i = C137I.LL;
                C137H<Object> c137h = anonymousClass13782.LJFF;
                if (c137h == null) {
                    z = true;
                } else {
                    z = false;
                }
                C19864312np.LJIIL(c137h, "key equivalence was already set to %s", z);
                c137i.getClass();
                anonymousClass13782.LJFF = c137i;
                anonymousClass13782.LIZ = true;
                C137L c137lLIZ = anonymousClass13782.LIZ();
                C137K c137k = C137L.LL;
                if (c137lLIZ == c137k && anonymousClass13782.LIZIZ() == c137k) {
                    new AnonymousClass1375(anonymousClass13782, new C137B<K, EnumC199592137m, C199588137i<K>, C199590137k<K>>() { // from class: X.137a
                        @Override // X.C137B
                        public final C137L LIZ() {
                            return C137L.LL;
                        }

                        @Override // X.C137B
                        public final C137L LIZIZ() {
                            return C137L.LL;
                        }

                        @Override // X.C137B
                        public final AnonymousClass1376 LIZJ(final AnonymousClass1375 anonymousClass1375, final int i) {
                            return new AnonymousClass1376<K, EnumC199592137m, C199588137i<K>, C199590137k<K>>(anonymousClass1375, i) { // from class: X.137k
                                @Override // X.AnonymousClass1376
                                public final AnonymousClass1376 LJIIJ() {
                                    return this;
                                }
                            };
                        }

                        @Override // X.C137B
                        public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                            AbstractC199589137j abstractC199589137j = (AbstractC199589137j) c137c;
                            abstractC199589137j.getClass();
                            return new C199588137i(abstractC199589137j.LL, abstractC199589137j.LLILLJJLI, (C199588137i) c137c2);
                        }

                        @Override // X.C137B
                        public final /* bridge */ /* synthetic */ void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, EnumC199592137m enumC199592137m) {
                        }

                        @Override // X.C137B
                        public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i, C137C c137c) {
                            return new C199588137i(obj, i, (C199588137i) c137c);
                        }
                    });
                    return;
                }
                C137L c137lLIZ2 = anonymousClass13782.LIZ();
                C137M c137m = C137L.LLILLJJLI;
                if (c137lLIZ2 == c137m && anonymousClass13782.LIZIZ() == c137k) {
                    new AnonymousClass1375(anonymousClass13782, new C137B<K, EnumC199592137m, C199586137g<K>, C199585137f<K>>() { // from class: X.137X
                        @Override // X.C137B
                        public final C137L LIZ() {
                            return C137L.LLILLJJLI;
                        }

                        @Override // X.C137B
                        public final C137L LIZIZ() {
                            return C137L.LL;
                        }

                        @Override // X.C137B
                        public final AnonymousClass1376 LIZJ(AnonymousClass1375 anonymousClass1375, int i) {
                            return new C199585137f(anonymousClass1375, i);
                        }

                        @Override // X.C137B
                        public final C137C LJ(AnonymousClass1376 anonymousClass1376, C137C c137c, C137C c137c2) {
                            C199585137f c199585137f = (C199585137f) anonymousClass1376;
                            AbstractC199583137d abstractC199583137d = (AbstractC199583137d) c137c;
                            C199586137g c199586137g = (C199586137g) c137c2;
                            if (abstractC199583137d.get() == null) {
                                return null;
                            }
                            return new C199586137g(c199585137f.LLIZLLLIL, abstractC199583137d.get(), abstractC199583137d.LL, c199586137g);
                        }

                        @Override // X.C137B
                        public final /* bridge */ /* synthetic */ void LIZLLL(AnonymousClass1376 anonymousClass1376, C137C c137c, EnumC199592137m enumC199592137m) {
                        }

                        @Override // X.C137B
                        public final C137C LJFF(AnonymousClass1376 anonymousClass1376, Object obj, int i, C137C c137c) {
                            return new C199586137g(((C199585137f) anonymousClass1376).LLIZLLLIL, obj, i, (C199586137g) c137c);
                        }
                    });
                } else {
                    if (anonymousClass13782.LIZIZ() == c137m) {
                        throw new IllegalArgumentException("Map cannot have both weak and dummy values");
                    }
                    throw new AssertionError();
                }
            }
        };
    }

    public final InterfaceC1136160ffi LIZ(long j) {
        InterfaceC1136160ffi interfaceC1136160ffi;
        C1136210ffn<Long, InterfaceC1136160ffi> c1136210ffn = this.LIZIZ;
        Long lValueOf = Long.valueOf(j);
        c1136210ffn.LIZ();
        C1136760fgg<Long, InterfaceC1136160ffi> c1136760fgg = c1136210ffn.LIZ.get(lValueOf);
        if (c1136760fgg != null) {
            interfaceC1136160ffi = c1136760fgg.get();
        } else {
            interfaceC1136160ffi = null;
        }
        return interfaceC1136160ffi;
    }

    public final InterfaceC1136800fgk LIZIZ(long j) {
        InterfaceC1136800fgk interfaceC1136800fgk;
        C1136210ffn<Long, InterfaceC1136800fgk> c1136210ffn = this.LIZ;
        Long lValueOf = Long.valueOf(j);
        c1136210ffn.LIZ();
        C1136760fgg<Long, InterfaceC1136800fgk> c1136760fgg = c1136210ffn.LIZ.get(lValueOf);
        if (c1136760fgg != null) {
            interfaceC1136800fgk = c1136760fgg.get();
        } else {
            interfaceC1136800fgk = null;
        }
        return interfaceC1136800fgk;
    }

    public final void LIZJ(GiftQueueGiftModel giftQueueGiftModel) {
        if (giftQueueGiftModel.LJI()) {
            return;
        }
        C1136210ffn<Long, InterfaceC1136160ffi> c1136210ffn = this.LIZIZ;
        Long lValueOf = Long.valueOf(giftQueueGiftModel.getId());
        c1136210ffn.LIZ();
        c1136210ffn.LIZ.put(lValueOf, new C1136760fgg<>(lValueOf, giftQueueGiftModel, c1136210ffn.LIZIZ));
    }

    public final void LIZLLL(GiftQueueUserModel giftQueueUserModel) {
        C1136210ffn<Long, InterfaceC1136800fgk> c1136210ffn = this.LIZ;
        Long lValueOf = Long.valueOf(giftQueueUserModel.getId());
        c1136210ffn.LIZ();
        c1136210ffn.LIZ.put(lValueOf, new C1136760fgg<>(lValueOf, giftQueueUserModel, c1136210ffn.LIZIZ));
    }
}
