package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.emojisticker.api.model.EmojiSliderSticker;
import com.ss.android.ugc.aweme.emojisticker.common.viewerlist.ReactionApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HGZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.emojisticker.emojislider.service.EmojiSliderReactionManager$voteEmojiSlider$1", f = "EmojiSliderReactionManager.kt", l = {}, m = "invokeSuspend")
public final class C0HGZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C437880HFa LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HGZ(C437880HFa c437880HFa, String str, String str2, int i, InterfaceC1364105Vn<? super C0HGZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c437880HFa;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HGZ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EmojiSliderReactionManager@96b6.voteEmojiSlider$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object value = this.LL.LIZJ.getValue();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        int i = this.LLILZ;
        value.getClass();
        try {
            ReactionApi.LIZIZ.reportEmojiSliderStickerVote(str, C7740030o.LIZ().getGson().LJIILL(new EmojiSliderSticker(str2, i)), 2).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmojiSliderReactionManager@96b6.voteEmojiSlider$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
