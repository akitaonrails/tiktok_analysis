package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.external.UIServiceCallback;
import com.ss.android.ugc.aweme.services.external.ui.ChangeBanMusicConfig;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MfG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.ui.RecordServiceBaseImpl$startChangeBanMusic$1$1", f = "RecordServiceBaseImpl.kt", l = {792}, m = "invokeSuspend")
public final class C574000MfG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public VEUtils.VEVideoFileInfo LLILLJJLI;
    public Aweme LLILLL;
    public Object LLILZ;
    public ChangeBanMusicConfig LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Aweme LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ ChangeBanMusicConfig LLJILJILJ;
    public final /* synthetic */ Activity LLJILLL;
    public final /* synthetic */ UIServiceCallback LLJJ;
    public final /* synthetic */ VEUtils.VEVideoFileInfo LLJJI;
    public final /* synthetic */ String LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574000MfG(String str, Aweme aweme, String str2, ChangeBanMusicConfig changeBanMusicConfig, Activity activity, UIServiceCallback uIServiceCallback, VEUtils.VEVideoFileInfo vEVideoFileInfo, String str3, InterfaceC1364105Vn<? super C574000MfG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJI = str;
        this.LLJIJIL = aweme;
        this.LLJILJIL = str2;
        this.LLJILJILJ = changeBanMusicConfig;
        this.LLJILLL = activity;
        this.LLJJ = uIServiceCallback;
        this.LLJJI = vEVideoFileInfo;
        this.LLJJIII = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C574000MfG(this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C574000MfG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
