package X;

import androidx.fragment.app.FragmentManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20630215o4 extends C09AY implements Function1<AbstractC813200VvC, Unit> {
    public final /* synthetic */ ConcurrentHashMap<AbstractC813200VvC, Boolean> LL;
    public final /* synthetic */ InterfaceC20622815ms LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20630215o4(ConcurrentHashMap<AbstractC813200VvC, Boolean> concurrentHashMap, InterfaceC20622815ms interfaceC20622815ms, FragmentManager fragmentManager) {
        super(1);
        this.LL = concurrentHashMap;
        this.LLILLJJLI = interfaceC20622815ms;
        this.LLILLL = fragmentManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.AbstractC813200VvC r7) {
        /*
            r6 = this;
            X.0VvC r7 = (X.AbstractC813200VvC) r7
            java.util.concurrent.ConcurrentHashMap<X.0VvC, java.lang.Boolean> r0 = r6.LL
            r0.remove(r7)
            X.15ms r0 = r6.LLILLJJLI
            java.util.List r0 = X.C20629915o1.LIZIZ(r0)
            if (r0 == 0) goto L4d
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r0.iterator()
        L18:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.15o9 r2 = (X.InterfaceC20630715o9) r2
            boolean r0 = X.C07RK.LIZ()
            if (r0 == 0) goto L39
            com.bytedance.scene.Scene r0 = r2.getScene()
            X.199x r1 = r0.mState
            X.199x r0 = X.EnumC214943199x.CREATED
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L43
        L39:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.SAFFragmentRootScene
            if (r0 == 0) goto L18
            com.ss.android.ugc.aweme.SAFFragmentRootScene r2 = (com.ss.android.ugc.aweme.SAFFragmentRootScene) r2
            boolean r0 = r2.LLJJL
            if (r0 == 0) goto L18
        L43:
            r5.add(r3)
            goto L18
        L47:
            java.util.Set r2 = X.C13LP.LLIIJI(r5)
            if (r2 != 0) goto L4f
        L4d:
            X.08CX r2 = X.C08CX.INSTANCE
        L4f:
            X.15ms r1 = r6.LLILLJJLI
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L67
            X.198d r1 = (X.InterfaceC214897198d) r1
            if (r1 == 0) goto L67
            X.199m r0 = r1.getDynamicParentScene()
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.SAFFragmentRootScene r0 = r0.LLJI
            if (r0 == 0) goto L67
            java.util.Set r2 = X.C15442062u.LJIIIIZZ(r0, r2)
        L67:
            java.util.Iterator r1 = r2.iterator()
        L6b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()
            X.15o9 r0 = (X.InterfaceC20630715o9) r0
            r0.Rj(r7)
            goto L6b
        L7b:
            androidx.fragment.app.FragmentManager r0 = r6.LLILLL
            r0.LLIILZL(r7)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20630215o4.invoke(java.lang.Object):java.lang.Object");
    }
}
