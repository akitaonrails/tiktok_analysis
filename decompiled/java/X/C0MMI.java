package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMI, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.StoryCanvasVideoHelper$prepareCanvasVideoData$2", f = "StoryCanvasVideoHelper.kt", l = {86}, m = "invokeSuspend")
public final class C0MMI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<C536390L1x> LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Pair<Integer, Integer> LLILZIL;
    public final /* synthetic */ StoryCanvasVideoHelper LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MMI(List<C536390L1x> list, Context context, Pair<Integer, Integer> pair, StoryCanvasVideoHelper storyCanvasVideoHelper, InterfaceC1364105Vn<? super C0MMI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = context;
        this.LLILZIL = pair;
        this.LLILZLL = storyCanvasVideoHelper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MMI c0mmi = new C0MMI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0mmi.LLILLJJLI = obj;
        return c0mmi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034 A[LOOP:0: B:8:0x002e->B:10:0x0034, LOOP_END] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MMI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CanvasVideoData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
