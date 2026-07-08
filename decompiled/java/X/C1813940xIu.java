package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.upsert.LiveBoardUpsertViewModel$upsertReally$3", f = "LiveBoardUpsertViewModel.kt", l = {154, 156, 186}, m = "invokeSuspend")
public final class C1813940xIu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveBoardUpsertViewModel LLILLL;
    public final /* synthetic */ C1814370xJb LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Board LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ Bitmap LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813940xIu(LiveBoardUpsertViewModel liveBoardUpsertViewModel, C1814370xJb c1814370xJb, boolean z, Board board, Context context, Bitmap bitmap, InterfaceC1364105Vn<? super C1813940xIu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveBoardUpsertViewModel;
        this.LLILZ = c1814370xJb;
        this.LLILZIL = z;
        this.LLILZLL = board;
        this.LLIZ = context;
        this.LLIZLLLIL = bitmap;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813940xIu c1813940xIu = new C1813940xIu(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1813940xIu.LLILLJJLI = obj;
        return c1813940xIu;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813940xIu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
