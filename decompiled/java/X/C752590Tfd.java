package X;

import com.bytedance.android.live.slot.IIconSlot;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.slot.SlotsBottomSheetAdapter$showDeleteAlert$1$1$1", f = "SlotsBottomSheetAdapter.kt", l = {236}, m = "invokeSuspend")
public final class C752590Tfd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<Boolean>>, Object> {
    public Object LL;
    public InterfaceC1124060fMC LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ ArrayList<Boolean> LLIZ;
    public final /* synthetic */ C756080TlG LLIZLLLIL;
    public final /* synthetic */ InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752590Tfd(ArrayList<Boolean> arrayList, C756080TlG c756080TlG, InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC, InterfaceC1364105Vn<? super C752590Tfd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = arrayList;
        this.LLIZLLLIL = c756080TlG;
        this.LLJ = interfaceC1124060fMC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752590Tfd(this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0058 -> B:6:0x0023). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "SlotsBottomSheetAdapter@97d8.showDeleteAlert$1$1$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILZLL
            r6 = 1
            if (r0 == 0) goto L5b
            if (r0 != r6) goto L72
            java.lang.Object r0 = r9.LLILZIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r5 = r9.LLILZ
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r4 = r9.LLILLL
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            X.0fMC r3 = r9.LLILLJJLI
            java.lang.Object r2 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L23:
            r0.add(r10)
        L26:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r5.next()
            X.0fMC r1 = (X.InterfaceC1124060fMC) r1
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 != 0) goto L26
            boolean r0 = r1 instanceof X.C01SH
            if (r0 == 0) goto L26
            X.01SH r1 = (X.C01SH) r1
            java.lang.String r0 = r3.LIZ()
            r9.LL = r2
            r9.LLILLJJLI = r3
            r9.LLILLL = r4
            r9.LLILZ = r5
            r9.LLILZIL = r4
            r9.LLILZLL = r6
            java.lang.Object r10 = r1.LJIILLIIL(r0, r9)
            if (r10 != r7) goto L58
            X.C1C7U.LIZIZ(r8)
            return r7
        L58:
            r0 = r4
            r4 = r0
            goto L23
        L5b:
            X.C155000ia.LIZIZ(r10)
            java.util.ArrayList<java.lang.Boolean> r2 = r9.LLIZ
            X.0TlG r0 = r9.LLIZLLLIL
            X.0fMC<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.0TmR> r3 = r9.LLJ
            java.util.List<X.0fMC<com.bytedance.android.live.slot.IIconSlot, com.bytedance.android.live.slot.IIconSlot$SlotViewModel, X.0TmR>> r0 = r0.LLILZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
            r4 = r2
            goto L26
        L6e:
            X.C1C7U.LIZIZ(r8)
            return r2
        L72:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C752590Tfd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ArrayList<Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
