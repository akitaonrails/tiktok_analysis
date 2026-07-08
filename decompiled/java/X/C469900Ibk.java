package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ibk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel$initFontListData$1", f = "BoardTextDynamicStyleViewModel.kt", l = {134, 135}, m = "invokeSuspend")
public final class C469900Ibk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BoardTextDynamicStyleViewModel LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469900Ibk(BoardTextDynamicStyleViewModel boardTextDynamicStyleViewModel, Context context, InterfaceC1364105Vn<? super C469900Ibk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = boardTextDynamicStyleViewModel;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C469900Ibk c469900Ibk = new C469900Ibk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c469900Ibk.LLILLJJLI = obj;
        return c469900Ibk;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "BoardTextDynamicStyleViewModel@9bd6.initFontListData$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r11.LL
            r8 = 2
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L5f
            if (r0 == r7) goto L8e
            if (r0 != r8) goto Lb9
            java.lang.Object r1 = r11.LLILLJJLI
            java.util.List r1 = (java.util.List) r1
            X.C155000ia.LIZIZ(r12)
        L1b:
            java.util.List r12 = (java.util.List) r12
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r7 = r1.iterator()
        L26:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r4 = r7.next()
            com.bytedance.android.livesdk.model.SMBBoardFontStyle r4 = (com.bytedance.android.livesdk.model.SMBBoardFontStyle) r4
            java.util.Iterator r3 = r12.iterator()
        L36:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData r0 = (com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData) r0
            java.lang.String r1 = r0.LIZ()
            java.lang.String r0 = r4.fontIdentifier
            java.lang.String r0 = X.C1839560xyE.LJIIJ(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L36
        L53:
            com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData r2 = (com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData) r2
            if (r2 == 0) goto L26
            r2.LIZLLL = r4
            r5.add(r2)
            goto L26
        L5d:
            r2 = r6
            goto L53
        L5f:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r5 = r11.LLILLJJLI
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.1DFB r4 = X.C0PEM.LIZJ
            X.0IP9 r1 = new X.0IP9
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel r0 = r11.LLILLL
            r1.<init>(r0, r6)
            X.099G r3 = X.C23250099c.LIZIZ(r5, r4, r6, r1, r8)
            X.0IbL r2 = new X.0IbL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel r1 = r11.LLILLL
            android.content.Context r0 = r11.LLILZ
            r2.<init>(r1, r0, r6)
            X.099G r0 = X.C23250099c.LIZIZ(r5, r4, r6, r2, r8)
            r11.LLILLJJLI = r0
            r11.LL = r7
            java.lang.Object r12 = r3.LJLIIIL(r11)
            if (r12 != r9) goto L95
            X.C1C7U.LIZIZ(r10)
            return r9
        L8e:
            java.lang.Object r0 = r11.LLILLJJLI
            X.0957 r0 = (X.AnonymousClass0957) r0
            X.C155000ia.LIZIZ(r12)
        L95:
            java.util.List r12 = (java.util.List) r12
            r11.LLILLJJLI = r12
            r11.LL = r8
            java.lang.Object r0 = r0.LJLIIIL(r11)
            if (r0 != r9) goto La5
            X.C1C7U.LIZIZ(r10)
            return r9
        La5:
            r1 = r12
            r12 = r0
            goto L1b
        La9:
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.font.viewmodel.BoardTextDynamicStyleViewModel r1 = r11.LLILLL
            X.0Ibl r0 = new X.0Ibl
            r0.<init>(r5)
            r1.setState(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C469900Ibk.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
