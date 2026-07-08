package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Jc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.comment.CommentStickerView$initCompileScene$1", f = "CommentStickerView.kt", l = {92}, m = "invokeSuspend")
public final class C2351009Jc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ CommentVideoModel LLILLJJLI;
    public final /* synthetic */ C19611011o4 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2351009Jc(CommentVideoModel commentVideoModel, C19611011o4 c19611011o4, InterfaceC1364105Vn<? super C2351009Jc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentVideoModel;
        this.LLILLL = c19611011o4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2351009Jc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean boolValueOf;
        C1C7U.LIZ("CommentStickerView@72ae.initCompileScene$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UrlModel userAvatar = this.LLILLJJLI.getUserAvatar();
            if (userAvatar != null) {
                C19611011o4 c19611011o4 = this.LLILLL;
                float fLIZIZ = C1919207fS.LIZIZ();
                C19591311kt c19591311kt = C19591311kt.LIZ;
                C424630Gkv avatarView = c19611011o4.getAvatarView();
                c19591311kt.getClass();
                C099F c099fLJII = C19591311kt.LJII(avatarView, userAvatar, fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
                this.LL = 1;
                obj = c099fLJII.LJLIIIL(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommentStickerView@72ae.initCompileScene$1");
                    return objLJFF;
                }
            } else {
                boolValueOf = null;
                C1C7U.LIZIZ("CommentStickerView@72ae.initCompileScene$1");
                return boolValueOf;
            }
        }
        boolValueOf = Boolean.valueOf(((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("CommentStickerView@72ae.initCompileScene$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
