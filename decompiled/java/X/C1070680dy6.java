package X;

import Y.ARunnableS85S0200000_16;
import android.graphics.Bitmap;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dy6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage$setupBackgroundImage$1$1", f = "SuggestAuthPage.kt", l = {}, m = "invokeSuspend")
public final class C1070680dy6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SuggestAuthPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070680dy6(String str, SuggestAuthPage suggestAuthPage, InterfaceC1364105Vn<? super C1070680dy6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = suggestAuthPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1070680dy6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SuggestAuthPage@a836.setupBackgroundImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(this.LL));
        final SuggestAuthPage suggestAuthPage = this.LLILLJJLI;
        c1331670kl3LJI.LJJII(new AbstractC468201s0() { // from class: X.0dy8
            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                SmartImageView smartImageViewVR = suggestAuthPage.VR();
                if (smartImageViewVR != null) {
                    HandlerHook.viewPost(smartImageViewVR, new ARunnableS85S0200000_16(bitmap, suggestAuthPage, 58));
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                String message;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("load fail: ");
                if (th != null) {
                    message = th.getMessage();
                } else {
                    message = null;
                }
                sbLIZ.append(message);
                C2188811AlT.LIZIZ(sbLIZ);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAuthPage@a836.setupBackgroundImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
