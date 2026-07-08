package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.045Y, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel$openSku$1$1", f = "PdpViewModel.kt", l = {3640}, m = "invokeSuspend")
public final class C045Y extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ PdpViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ HashMap<String, Object> LLILZLL;
    public final /* synthetic */ Map<String, Object> LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ InterfaceC497601wk LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ View LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ boolean LLJILJILJ;
    public final /* synthetic */ InterfaceC1631630sYr<Boolean, String, Object, ExceptionUX, Unit> LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C045Y(PdpViewModel pdpViewModel, boolean z, long j, HashMap<String, Object> map, Map<String, ? extends Object> map2, int i, InterfaceC497601wk interfaceC497601wk, String str, View view, String str2, boolean z2, InterfaceC1631630sYr<? super Boolean, ? super String, Object, ? super ExceptionUX, Unit> interfaceC1631630sYr, InterfaceC1364105Vn<? super C045Y> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = pdpViewModel;
        this.LLILZ = z;
        this.LLILZIL = j;
        this.LLILZLL = map;
        this.LLIZ = map2;
        this.LLIZLLLIL = i;
        this.LLJ = interfaceC497601wk;
        this.LLJI = str;
        this.LLJIJIL = view;
        this.LLJILJIL = str2;
        this.LLJILJILJ = z2;
        this.LLJILLL = interfaceC1631630sYr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C045Y(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r83) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C045Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
