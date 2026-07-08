package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.05Or, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.helper.CommentStickerClickHelper$getAimojiUIData$uiData$1", f = "CommentStickerClickHelper.kt", l = {553}, m = "invokeSuspend")
public final class C1346305Or extends C09AX implements Function1<InterfaceC1364105Vn<? super CharSequence>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1346305Or(String str, InterfaceC1364105Vn<? super C1346305Or> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1346305Or(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super CharSequence> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("CommentStickerClickHelper@ddf8.getAimojiUIData$uiData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String nickName = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(this.LLILLJJLI, null, "im_local_db");
            if (iMUserLJIIL != null) {
                String str = C06T2.LIZ;
                strLIZIZ = C06T2.LIZIZ(iMUserLJIIL.getNickName());
                C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getAimojiUIData$uiData$1");
                return strLIZIZ;
            }
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String str2 = this.LLILLJJLI;
            this.LL = 1;
            obj = c1bgsLJ.LJIIJ(str2, "im_social_avatar_sticker", true, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getAimojiUIData$uiData$1");
                return objLJFF;
            }
        }
        BaseContact baseContact = (BaseContact) obj;
        if (baseContact != null) {
            nickName = baseContact.getNickName();
        }
        strLIZIZ = C06T2.LIZIZ(nickName);
        C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getAimojiUIData$uiData$1");
        return strLIZIZ;
    }
}
