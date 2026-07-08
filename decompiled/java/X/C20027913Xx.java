package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.13Xx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", l = {580, 591}, m = "invokeSuspend")
public final class C20027913Xx extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, InterfaceC1838630xwj, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C19994113Kx LLILZ;
    public C19994113Kx LLILZIL;
    public C19994113Kx LLILZLL;
    public Object LLIZ;
    public C19994113Kx LLIZLLLIL;
    public int LLJ;
    public /* synthetic */ InterfaceC1838630xwj LLJI;
    public final /* synthetic */ C13Y1 LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20027913Xx(C13Y1 c13y1, InterfaceC1364105Vn<? super C20027913Xx> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLJIJIL = c13y1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:8:0x0031). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00a1 -> B:7:0x002c). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20027913Xx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static final void LJ(List list, C13Y1 c13y1) {
        list.clear();
        synchronized (c13y1.LIZIZ) {
            try {
                ArrayList arrayList = (ArrayList) c13y1.LJIIIZ;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((C13Z3) arrayList.get(i));
                }
                ((ArrayList) c13y1.LJIIIZ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1838630xwj interfaceC1838630xwj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C20027913Xx c20027913Xx = new C20027913Xx(this.LLJIJIL, interfaceC1364105Vn);
        c20027913Xx.LLJI = interfaceC1838630xwj;
        return c20027913Xx.invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C13Y1 r13, java.util.List r14, java.util.List r15, java.util.List r16, X.C19994113Kx r17, X.C19994113Kx r18, X.C19994113Kx r19, X.C19994113Kx r20) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20027913Xx.LIZ(X.13Y1, java.util.List, java.util.List, java.util.List, X.13Kx, X.13Kx, X.13Kx, X.13Kx):void");
    }
}
