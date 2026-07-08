package X;

import android.content.Context;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment$onViewCreated$2$3$1", f = "MusicGiftDetailPageDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C752970TgF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LL;
    public final /* synthetic */ C05P1<C1147340fxk> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C752970TgF(C05P1 c05p1, MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = musicGiftDetailPageDialogFragment;
        this.LLILLJJLI = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C752970TgF(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        Boolean boolValueOf;
        C1C7U.LIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LL;
        long j = this.LLILLJJLI.getValue().LJFF;
        if (j > 0) {
            if (!musicGiftDetailPageDialogFragment.LLLF && (context = musicGiftDetailPageDialogFragment.getContext()) != null) {
                C20337914i1<Boolean> c20337914i1 = InterfaceC1094160eZy.l1;
                if (!C500260Jjc.LJJJI(c20337914i1.LIZIZ())) {
                    String string = UriProtector.parse("aweme://roma_redirect/?spark_page=music_gift_details_page_education_guide").buildUpon().appendQueryParameter("mood_id", String.valueOf(j)).build().toString();
                    IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                    if (iActionHandlerService != null) {
                        boolValueOf = Boolean.valueOf(iActionHandlerService.handle(context, string));
                    } else {
                        boolValueOf = null;
                    }
                    boolean zLJJJI = C500260Jjc.LJJJI(boolValueOf);
                    musicGiftDetailPageDialogFragment.LLLF = zLJJJI;
                    if (zLJJJI) {
                        c20337914i1.LJFF(Boolean.TRUE);
                    }
                }
            }
        } else {
            musicGiftDetailPageDialogFragment.getClass();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
