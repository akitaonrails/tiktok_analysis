package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.model.IMPersonalizedRecommendationParams;
import com.ss.android.ugc.aweme.model.TypingRecommendationResponse;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;
import javax.crypto.NoSuchPaddingException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HoR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.typing.CommentTypingRecManager$fetchFromRemote$2", f = "CommentTypingRecManager.kt", l = {240}, m = "invokeSuspend")
public final class C452290HoR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public final /* synthetic */ C452280HoQ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452290HoR(C452280HoQ c452280HoQ, String str, InterfaceC1364105Vn<? super C452290HoR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c452280HoQ;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452290HoR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InvalidKeySpecException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        Object objUy;
        C1C7U.LIZ("CommentTypingRecManager@ed40.fetchFromRemote$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objUy = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LLILLJJLI.LIZ();
            String strLIZ = C0XJN.LIZ(this.LLILLL);
            IMPersonalizedRecommendationParams iMPersonalizedRecommendationParams = new IMPersonalizedRecommendationParams(null, null, null, null, null, null, this.LLILLJJLI.LIZIZ.LIZLLL());
            C452280HoQ c452280HoQ = this.LLILLJJLI;
            C452610Hox c452610Hox = c452280HoQ.LJII;
            if (c452610Hox == null) {
                synchronized (c452280HoQ) {
                    c452610Hox = c452280HoQ.LJII;
                    if (c452610Hox == null) {
                        c452610Hox = (C452610Hox) C1807670x8n.LJJIJIIJIL();
                        c452280HoQ.LJII = c452610Hox;
                    }
                }
            }
            String str = this.LLILLL;
            this.LL = 1;
            objUy = c452610Hox.uy(str, strLIZ, false, iMPersonalizedRecommendationParams, "comment", true, this);
            if (objUy == objLJFF) {
                C1C7U.LIZIZ("CommentTypingRecManager@ed40.fetchFromRemote$2");
                return objLJFF;
            }
        }
        List<StickerItem> list = null;
        if (C189200o6.m7isFailureimpl(objUy)) {
            objUy = null;
        }
        TypingRecommendationResponse typingRecommendationResponse = (TypingRecommendationResponse) objUy;
        if (typingRecommendationResponse != null) {
            list = typingRecommendationResponse.stickerList;
        }
        C1C7U.LIZIZ("CommentTypingRecManager@ed40.fetchFromRemote$2");
        return list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
