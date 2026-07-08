package X;

import androidx.fragment.app.FragmentManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15o3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20630115o3 extends C09AY implements Function2<AbstractC813200VvC, Boolean, Unit> {
    public final /* synthetic */ ConcurrentHashMap<AbstractC813200VvC, Boolean> LL;
    public final /* synthetic */ InterfaceC20622815ms LLILLJJLI;
    public final /* synthetic */ FragmentManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20630115o3(ConcurrentHashMap<AbstractC813200VvC, Boolean> concurrentHashMap, InterfaceC20622815ms interfaceC20622815ms, FragmentManager fragmentManager) {
        super(2);
        this.LL = concurrentHashMap;
        this.LLILLJJLI = interfaceC20622815ms;
        this.LLILLL = fragmentManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.AbstractC813200VvC r8, java.lang.Boolean r9) {
        /*
            r7 = this;
            X.0VvC r8 = (X.AbstractC813200VvC) r8
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r3 = r9.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            java.util.concurrent.ConcurrentHashMap<X.0VvC, java.lang.Boolean> r0 = r7.LL
            r0.put(r8, r1)
            X.15ms r0 = r7.LLILLJJLI
            java.util.List r0 = X.C20629915o1.LIZIZ(r0)
            if (r0 == 0) goto L57
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r0.iterator()
        L22:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r4 = r5.next()
            r2 = r4
            X.15o9 r2 = (X.InterfaceC20630715o9) r2
            boolean r0 = X.C07RK.LIZ()
            if (r0 == 0) goto L43
            com.bytedance.scene.Scene r0 = r2.getScene()
            X.199x r1 = r0.mState
            X.199x r0 = X.EnumC214943199x.CREATED
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L4d
        L43:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.SAFFragmentRootScene
            if (r0 == 0) goto L22
            com.ss.android.ugc.aweme.SAFFragmentRootScene r2 = (com.ss.android.ugc.aweme.SAFFragmentRootScene) r2
            boolean r0 = r2.LLJJL
            if (r0 == 0) goto L22
        L4d:
            r6.add(r4)
            goto L22
        L51:
            java.util.Set r2 = X.C13LP.LLIIJI(r6)
            if (r2 != 0) goto L59
        L57:
            X.08CX r2 = X.C08CX.INSTANCE
        L59:
            X.15ms r1 = r7.LLILLJJLI
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L71
            X.198d r1 = (X.InterfaceC214897198d) r1
            if (r1 == 0) goto L71
            X.199m r0 = r1.getDynamicParentScene()
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.SAFFragmentRootScene r0 = r0.LLJI
            if (r0 == 0) goto L71
            java.util.Set r2 = X.C15442062u.LJIIIIZZ(r0, r2)
        L71:
            java.util.Iterator r1 = r2.iterator()
        L75:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r1.next()
            X.15o9 r0 = (X.InterfaceC20630715o9) r0
            r0.d5(r8, r3)
            goto L75
        L85:
            androidx.fragment.app.FragmentManager r0 = r7.LLILLL
            r0.LJZL(r8, r3)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20630115o3.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
