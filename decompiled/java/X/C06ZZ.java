package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.data.factory.handler.QuotedTikTokLinkPreview;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06ZZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.data.factory.handler.QuotePreviewFromRefSceneLogicHandler$tryUpdateLatestStatus$1", f = "QuotePreviewFromRefSceneLogicHandler.kt", l = {}, m = "invokeSuspend")
public final class C06ZZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C869590Y9l LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ QuotedTikTokLinkPreview LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZZ(C869590Y9l c869590Y9l, String str, QuotedTikTokLinkPreview quotedTikTokLinkPreview, InterfaceC1364105Vn<? super C06ZZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c869590Y9l;
        this.LLILLJJLI = str;
        this.LLILLL = quotedTikTokLinkPreview;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZZ(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuotePreviewFromRefSceneLogicHandler@90ff.tryUpdateLatestStatus$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            QuotedTikTokLinkPreview quotedTikTokLinkPreview = (QuotedTikTokLinkPreview) C051M.LIZ(QuotedTikTokLinkPreview.class, this.LL.getLocalExt().get("ref_preview_info"));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (!Intrinsics.LJFF(this.LL.getLocalExt().get("ref_attachment_state"), this.LLILLJJLI)) {
                this.LL.getLocalExt().put("ref_attachment_state", this.LLILLJJLI);
                linkedHashMap.put("ref_attachment_state", new C0Y3R(this.LLILLJJLI));
            }
            QuotedTikTokLinkPreview quotedTikTokLinkPreview2 = this.LLILLL;
            if (quotedTikTokLinkPreview2 != null && !Intrinsics.LJFF(quotedTikTokLinkPreview, quotedTikTokLinkPreview2)) {
                String strLJ = C051M.LJ(this.LLILLL, false);
                this.LL.getLocalExt().put("ref_preview_info", strLJ);
                linkedHashMap.put("ref_preview_info", new C0Y3R(strLJ));
            }
            if (linkedHashMap.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("QuotePreviewFromRefSceneLogicHandler@90ff.tryUpdateLatestStatus$1");
                return unit;
            }
            C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ().LJFF(Collections.singletonList(new Pair(this.LL, linkedHashMap)), false, new C0Y3I("Update latest flag for QuotePreviewFromRefSceneLogicHandler"));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("QuotePreviewFromRefSceneLogicHandler@90ff.tryUpdateLatestStatus$1");
            return unit2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("QuotePreviewFromRefSceneLogicHandler@90ff.tryUpdateLatestStatus$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
