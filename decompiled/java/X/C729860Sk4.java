package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.model.UserStoriesResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sk4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729860Sk4 extends AbstractC2252311DDp<UserStoriesResponse> {
    public final InterfaceC728200ShO LLILLL;
    public final AtomicBoolean LLILZ = new AtomicBoolean(true);

    public C729860Sk4(C727880Sgs c727880Sgs) {
        this.LLILLL = c727880Sgs;
    }

    public final C11ON LJFF(final C728180ShM c728180ShM) {
        C613960O6g c613960O6gLIZIZ = C613940O6e.LIZ().LIZIZ(new C729930SkB(c728180ShM.LIZ, this.LLILZ));
        InterfaceC728200ShO interfaceC728200ShO = this.LLILLL;
        AwS447S0200000_11 awS447S0200000_11 = new AwS447S0200000_11(this, c728180ShM, 18);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(637);
        Intrinsics.LJFF(Aweme.class, C729840Sk2.class);
        c613960O6gLIZIZ.LIZ(new C0O8D(new C0O70(interfaceC728200ShO, awS447S0200000_11, aFwS243S0000000_11, C729840Sk2.class, Aweme.class)));
        C0O7F.LIZIZ(c613960O6gLIZIZ, c728180ShM.LIZIZ);
        final InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZIZ.LIZIZ();
        return C11NZ.LJIJJLI(new C2502209rI(C23271099x.INSTANCE, new InterfaceC346201Wa<AbstractC729900Sk8<UserStoriesResponse>>() { // from class: X.0Sk3
            @Override // X.InterfaceC346201Wa
            public final Object collect(InterfaceC346701Wf<? super AbstractC729900Sk8<UserStoriesResponse>> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                Object objCollect = interfaceC346201WaLIZIZ.collect(new C729820Sk0(interfaceC346701Wf, this, c728180ShM), interfaceC1364105Vn);
                if (objCollect == C099R.LJFF()) {
                    return objCollect;
                }
                return Unit.LIZ;
            }
        }, 1)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0Sk6
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) throws Throwable {
                AbstractC729900Sk8 abstractC729900Sk8 = (AbstractC729900Sk8) obj;
                if (abstractC729900Sk8 instanceof C729870Sk5) {
                    return ((C729870Sk5) abstractC729900Sk8).LIZIZ;
                }
                if (abstractC729900Sk8 instanceof C729890Sk7) {
                    throw ((C729890Sk7) abstractC729900Sk8).LIZIZ;
                }
                throw new RuntimeException("error ");
            }
        });
    }
}
