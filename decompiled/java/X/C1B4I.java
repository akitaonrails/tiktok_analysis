package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1B4I, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.viewmodel.ShareActionHelper$validateAndLaunchEdit$1", f = "ShareActionHelper.kt", l = {78, 95, 114, 133}, m = "invokeSuspend")
public final class C1B4I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C1B4B LLILZ;
    public final /* synthetic */ C1402840mbq LLILZIL;
    public final /* synthetic */ C580380MpY LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ MusicModel LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B4I(Activity activity, C1B4B c1b4b, C1402840mbq c1402840mbq, C580380MpY c580380MpY, boolean z, String str, MusicModel musicModel, boolean z2, InterfaceC1364105Vn<? super C1B4I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = activity;
        this.LLILZ = c1b4b;
        this.LLILZIL = c1402840mbq;
        this.LLILZLL = c580380MpY;
        this.LLIZ = z;
        this.LLIZLLLIL = str;
        this.LLJ = musicModel;
        this.LLJI = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B4I(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0216  */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.1B4N, X.1B4R] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1B4I.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
