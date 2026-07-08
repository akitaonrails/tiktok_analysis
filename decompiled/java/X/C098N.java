package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.098N, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl$onChosenResult$1", f = "AIPlaygroundAIGCChooseResultImpl.kt", l = {81, 100, 121}, m = "invokeSuspend")
public final class C098N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ ArrayList<MediaModel> LLIZ;
    public final /* synthetic */ CreativeInfo LLIZLLLIL;
    public final /* synthetic */ AIPlaygroundAIGCChooseResultImpl LLJ;
    public final /* synthetic */ Intent LLJI;
    public final /* synthetic */ int LLJIJIL;
    public final /* synthetic */ int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C098N(ArrayList<MediaModel> arrayList, CreativeInfo creativeInfo, AIPlaygroundAIGCChooseResultImpl aIPlaygroundAIGCChooseResultImpl, Intent intent, int i, int i2, InterfaceC1364105Vn<? super C098N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = arrayList;
        this.LLIZLLLIL = creativeInfo;
        this.LLJ = aIPlaygroundAIGCChooseResultImpl;
        this.LLJI = intent;
        this.LLJIJIL = i;
        this.LLJILJIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C098N c098n = new C098N(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
        c098n.LLILZLL = obj;
        return c098n;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ac  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C098N.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
