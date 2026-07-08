package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.137v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199601137v extends C09AY implements Function0<C139P<Object, Object>> {
    public final /* synthetic */ C139X<Object, Object> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C199601137v(C139X<Object, Object> c139x) {
        super(0);
        this.LL = c139x;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C139P<Object, Object> invoke() {
        C199593137n c199593137n = new C199593137n();
        c199593137n.LIZLLL(this.LL.LIZ);
        c199593137n.LJFF(C137F.LLILLJJLI);
        C139X<Object, Object> c139x = this.LL;
        c199593137n.LIZIZ(c139x.LIZIZ, c139x.LIZJ);
        final C139X<Object, Object> c139x2 = this.LL;
        c199593137n.LJ(new AnonymousClass1385() { // from class: X.137w
            @Override // X.AnonymousClass1385
            public final void LIZJ(C199603137x<K, V> c199603137x) {
                K key;
                if ((c199603137x.getCause() == EnumC199605137z.EXPIRED || c199603137x.getCause() == EnumC199605137z.SIZE) && (key = c199603137x.getKey()) != null) {
                    c139x2.LIZIZ().remove(key);
                }
            }
        });
        return c199593137n.LIZ();
    }
}
