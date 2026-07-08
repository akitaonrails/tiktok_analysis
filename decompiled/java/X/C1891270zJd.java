package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emojisticker.api.model.InteractiveEmojiSticker;
import com.ss.android.ugc.aweme.emojisticker.common.viewerlist.ReactionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.interactiveemoji.service.InteractiveEmojiReactionManager$clickInteractiveEmoji$1", f = "InteractiveEmojiReactionManager.kt", l = {}, m = "invokeSuspend")
public final class C1891270zJd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1891750zKP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891270zJd(C1891750zKP c1891750zKP, String str, String str2, InterfaceC1364105Vn<? super C1891270zJd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1891750zKP;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891270zJd(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractiveEmojiReactionManager@dd94.clickInteractiveEmoji$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1891790zKT c1891790zKTLIZJ = this.LL.LIZJ();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c1891790zKTLIZJ.getClass();
        try {
            ReactionApi.LIZIZ.reportInteractiveEmojiStickerClick(str, C7740030o.LIZ().getGson().LJIILL(new InteractiveEmojiSticker(str2)), 1).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InteractiveEmojiReactionManager@dd94.clickInteractiveEmoji$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
