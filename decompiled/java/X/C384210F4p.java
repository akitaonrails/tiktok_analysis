package X;

import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F4p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.ur.socialavatar.SocialAvatarStoryUtils$loadAnimatedSocialAvatar$2$1$onSuccess$1$1$onSuccess$1", f = "SocialAvatarStoryUtils.kt", l = {191, 195}, m = "invokeSuspend")
public final class C384210F4p extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C348460DlM LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ Effect LLILZIL;
    public final /* synthetic */ SocialAvatarUpdateInfoStruct LLILZLL;
    public final /* synthetic */ InterfaceC1452170ntP LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ InterfaceC1364105Vn<StickerItemModel> LLJ;
    public final /* synthetic */ InterfaceC497601wk LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C384210F4p(C348460DlM c348460DlM, Effect effect, Effect effect2, SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct, InterfaceC1452170ntP interfaceC1452170ntP, Function0<Unit> function0, InterfaceC1364105Vn<? super StickerItemModel> interfaceC1364105Vn, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C384210F4p> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LLILLL = c348460DlM;
        this.LLILZ = effect;
        this.LLILZIL = effect2;
        this.LLILZLL = socialAvatarUpdateInfoStruct;
        this.LLIZ = interfaceC1452170ntP;
        this.LLIZLLLIL = function0;
        this.LLJ = interfaceC1364105Vn;
        this.LLJI = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C384210F4p(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384210F4p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
