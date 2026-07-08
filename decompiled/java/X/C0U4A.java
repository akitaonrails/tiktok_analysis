package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import tikcast.api.anchor_tool.EffectListResponse;
import webcast.data.EffectStruct;

/* JADX INFO: renamed from: X.0U4A, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4A implements InterfaceC396201gO<C0U74<LiveEffect>>, InterfaceC761040TtG {
    public final CopyOnWriteArrayList<C0U74<LiveEffect>> LIZ = new CopyOnWriteArrayList<>();
    public final C0UMC LIZIZ = new C0UMC();
    public final C766120U3m LIZJ = new C766120U3m();

    @Override // X.InterfaceC761040TtG
    public final List<C0U74<LiveEffect>> LIZJ() {
        return this.LIZ;
    }

    public static List LJ(EffectListResponse.Data data) {
        String str;
        List<EffectStruct> list;
        boolean z;
        boolean zLJ;
        if (data == null || (str = data.LIZ) == null) {
            str = "";
        }
        if (data != null && (list = data.effects) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i = 0;
            for (EffectStruct effectStruct : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    EffectStruct effectStruct2 = effectStruct;
                    LiveEffect liveEffectLJ = C0UEO.LJ(effectStruct2);
                    C767250U7v.LIZIZ(2, liveEffectLJ);
                    liveEffectLJ.LLIIIILZ(effectStruct2.resourceId);
                    liveEffectLJ.LJZ(Integer.valueOf(i));
                    liveEffectLJ.LLJLIL(str);
                    liveEffectLJ.LJIIJJI(str);
                    if (effectStruct2.extra.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        try {
                            new p();
                            k kVarLJJIIZ = p.LIZJ(effectStruct2.extra).LJIILIIL().LJJIIZ("is_none");
                            if (kVarLJJIIZ != null) {
                                zLJ = kVarLJJIIZ.LJ();
                            } else {
                                zLJ = false;
                            }
                            liveEffectLJ.LJJLL(zLJ);
                            C189200o6.m2constructorimpl(Unit.LIZ);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            C189200o6.m2constructorimpl(new C098200Yq(th));
                        }
                    }
                    arrayList.add(liveEffectLJ);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return Collections.singletonList(new C0U74(str, str, null, null, null, new ArrayList(arrayList), null, 248));
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC761040TtG
    public final Object LIZ(InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return this.LIZIZ.LJFF("livefiltercomposerexperiment", interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // X.InterfaceC761040TtG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.util.List<X.C0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C0U4B
            if (r0 == 0) goto L70
            r8 = r10
            X.0U4B r8 = (X.C0U4B) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r7 = r8.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r5 = 1
            if (r0 == 0) goto L53
            if (r0 != r5) goto L85
            long r2 = r8.LL
            X.C155000ia.LIZIZ(r7)
        L24:
            X.0UMl r7 = (X.C771050UMl) r7
            X.0U3m r1 = r9.LIZJ
            T r0 = r7.LIZIZ
            tikcast.api.anchor_tool.EffectListResponse$Data r0 = (tikcast.api.anchor_tool.EffectListResponse.Data) r0
            java.util.List r6 = LJ(r0)
            r1.LJIIIZ(r6)
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L76
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r9.LIZ
            r0.clear()
            java.util.concurrent.CopyOnWriteArrayList<X.0U74<com.bytedance.android.livesdkapi.depend.model.LiveEffect>> r0 = r9.LIZ
            r0.addAll(r6)
            X.0U7i r0 = X.C767120U7i.LIZ
            int r1 = r7.LIZ()
            java.lang.String r0 = r7.LIZIZ()
            X.C767120U7i.LJFF(r1, r2, r0, r5)
            return r6
        L53:
            X.C155000ia.LIZIZ(r7)
            java.lang.String r0 = ""
            X.C770170UJb.LIZLLL = r0
            long r2 = java.lang.System.currentTimeMillis()
            X.0UMC r4 = r9.LIZIZ
            java.lang.String r0 = X.C0UD4.LIZ
            r8.LL = r2
            r8.LLILZ = r5
            r1 = 0
            java.lang.String r0 = "livefiltercomposerexperiment"
            java.lang.Object r7 = r4.LJIIIZ(r0, r1, r8)
            if (r7 != r6) goto L24
            return r6
        L70:
            X.0U4B r8 = new X.0U4B
            r8.<init>(r9, r10)
            goto L12
        L76:
            X.0U7i r0 = X.C767120U7i.LIZ
            int r4 = r7.LIZ()
            java.lang.String r1 = r7.LIZIZ()
            r0 = 0
            X.C767120U7i.LJFF(r4, r2, r1, r0)
            return r6
        L85:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U4A.LIZIZ(X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC761040TtG
    public final Object LIZLLL(InterfaceC1364105Vn<? super List<C0U74<LiveEffect>>> interfaceC1364105Vn) {
        C770170UJb.LIZLLL = "";
        C0UMC c0umc = this.LIZIZ;
        String str = C0UD4.LIZ;
        C771050UMl<Throwable, EffectListResponse.Data> c771050UMlLJIIJ = c0umc.LJIIJ("livefiltercomposerexperiment");
        C766120U3m c766120U3m = this.LIZJ;
        List<C0U74<LiveEffect>> listLJ = LJ(c771050UMlLJIIJ.LIZIZ);
        c766120U3m.LJIIIZ(listLJ);
        if (!listLJ.isEmpty()) {
            this.LIZ.clear();
            this.LIZ.addAll(listLJ);
        }
        return listLJ;
    }
}
