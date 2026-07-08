package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import com.ss.android.ugc.aweme.tako.arch.protocol.NonMatching;
import com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C643300PLc {
    public static final C0R2S LIZ = new AbstractC642490PHz<C326880Cre>() { // from class: X.0R2S
        public final C642240PHa LIZIZ = new C642240PHa(true, true, 0, false, false, true, false, false, true, false, null, null, 15228);

        @Override // X.AbstractC642490PHz
        public final C642240PHa LIZIZ() {
            return this.LIZIZ;
        }

        @Override // X.AbstractC642490PHz
        public final List LIZ(InterfaceC1858000yRy interfaceC1858000yRy) {
            List list;
            C326880Cre c326880Cre = (C326880Cre) interfaceC1858000yRy;
            TakoMixFeed takoMixFeedLJIIIZ = c326880Cre.LLILLL.LJIIIZ();
            if (takoMixFeedLJIIIZ == null || (list = takoMixFeedLJIIIZ.videoList) == null) {
                list = C13BV.INSTANCE;
            }
            return Collections.singletonList(new C642570PIh(c326880Cre, list));
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(Fragment fragment, EnumC2012507uV enumC2012507uV) {
        Lifecycle lifecycle;
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (C07CP.LIZ()) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                lifecycle = fragment.requireActivity().getLifecycle();
            } else {
                Fragment parentFragment = fragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        Object obj = (InterfaceC214902198i) parentFragment;
                        if (obj == null || (lifecycle = ((Fragment) obj).getLifecycle()) == null) {
                            break;
                        }
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            break;
                        }
                    }
                }
                lifecycle = fragment.requireActivity().getLifecycle();
            }
        } else {
            lifecycle = fragment.requireActivity().getLifecycle();
        }
        TakoCardContainerSharedVM takoCardContainerSharedVMLIZ = C643280PLa.LIZ(lifecycle, enumC2012507uV);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragment, null);
        synchronized (takoCardContainerSharedVMLIZ) {
            if (takoCardContainerSharedVMLIZ.LLILZIL != null) {
                return;
            }
            takoCardContainerSharedVMLIZ.LLILZIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(takoCardContainerSharedVMLIZ), C0PEM.LIZJ, null, new C643320PLe(interfaceC665370Q7zLJFF, takoCardContainerSharedVMLIZ, null), 2);
        }
    }

    public static final ITakoCardProtocol<InterfaceC1858000yRy> LIZ(InterfaceC1858000yRy interfaceC1858000yRy, EnumC2012507uV enumC2012507uV, Lifecycle lifecycle) {
        ITakoCardProtocol<InterfaceC1858000yRy> iTakoCardProtocolPutIfAbsent;
        if (lifecycle == null) {
            return null;
        }
        TakoCardContainerSharedVM takoCardContainerSharedVMLIZ = C643280PLa.LIZ(lifecycle, enumC2012507uV);
        C23250099c.LJ(C23271099x.INSTANCE, new C2218808mg(takoCardContainerSharedVMLIZ, null));
        if (!takoCardContainerSharedVMLIZ.LL.isEmpty()) {
            ConcurrentHashMap<Integer, ITakoCardProtocol<InterfaceC1858000yRy>> concurrentHashMap = takoCardContainerSharedVMLIZ.LLILLJJLI;
            Integer numValueOf = Integer.valueOf(System.identityHashCode(interfaceC1858000yRy));
            ITakoCardProtocol<InterfaceC1858000yRy> iTakoCardProtocolVQ2 = concurrentHashMap.get(numValueOf);
            if (iTakoCardProtocolVQ2 == null && (iTakoCardProtocolPutIfAbsent = concurrentHashMap.putIfAbsent(numValueOf, (iTakoCardProtocolVQ2 = takoCardContainerSharedVMLIZ.vQ2(interfaceC1858000yRy)))) != null) {
                iTakoCardProtocolVQ2 = iTakoCardProtocolPutIfAbsent;
            }
            ITakoCardProtocol<InterfaceC1858000yRy> iTakoCardProtocol = iTakoCardProtocolVQ2;
            if (!Intrinsics.LJFF(iTakoCardProtocol, NonMatching.LL)) {
                return iTakoCardProtocol;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(java.util.List<? extends X.InterfaceC1858000yRy> r4, X.EnumC2012507uV r5, androidx.lifecycle.Lifecycle r6, android.view.View r7) {
        /*
            boolean r0 = X.C07CP.LIZ()
            r3 = 0
            if (r0 == 0) goto L1e
            android.content.Context r0 = r7.getContext()
            X.0JEh r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJII(r0)
            if (r0 == 0) goto L5e
            X.198i r2 = r0.LIZLLL()
            if (r2 == 0) goto L5e
        L17:
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L1e
            r2.getLifecycle()
        L1e:
            if (r6 == 0) goto Lc5
            if (r4 == 0) goto Lc5
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto Lc5
            com.ss.android.ugc.aweme.tako.arch.protocol.TakoCardContainerSharedVM r5 = X.C643280PLa.LIZ(r6, r5)
            X.08mf r0 = new X.08mf
            r0.<init>(r5, r3)
            X.C23250099c.LJFF(r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol<X.0yRy>> r0 = r5.LL
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc5
            java.util.Iterator r4 = r4.iterator()
        L40:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Lc5
            java.lang.Object r3 = r4.next()
            X.0yRy r3 = (X.InterfaceC1858000yRy) r3
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol<X.0yRy>> r2 = r5.LLILLJJLI
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol r0 = r5.vQ2(r3)
            r2.put(r1, r0)
            goto L40
        L5e:
            android.content.Context r0 = r7.getContext()
            android.app.Activity r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            if (r0 == 0) goto L88
            android.content.Context r0 = r7.getContext()
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto L7b
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L88
            goto L1e
        L7b:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1e
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto L88
            goto L1e
        L88:
            androidx.fragment.app.Fragment r2 = X.C946803n0.LIZ(r7)
            if (r2 == 0) goto L1e
            android.content.Context r0 = r2.getContext()
            if (r0 == 0) goto La4
            android.app.Activity r1 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L98:
            boolean r0 = X.C294780Bgy.LIZ()
            if (r0 == 0) goto La6
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto Lb6
            goto L1e
        La4:
            r1 = r3
            goto L98
        La6:
            boolean r0 = r1 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L1e
            X.198d r1 = (X.InterfaceC214897198d) r1
            boolean r0 = r1.getEnableSAF()
            if (r0 != 0) goto Lb6
            goto L1e
        Lb4:
            if (r2 == 0) goto L1e
        Lb6:
            boolean r0 = r2 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto Lc0
            X.198i r2 = (X.InterfaceC214902198i) r2
            if (r2 == 0) goto L1e
            goto L17
        Lc0:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto Lb4
        Lc5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C643300PLc.LIZIZ(java.util.List, X.07uV, androidx.lifecycle.Lifecycle, android.view.View):void");
    }
}
