package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0HLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.network.SocialAvatarGenerator", f = "SocialAvatarGenerator.kt", l = {608}, m = "generateSocialAvatar$socialavatar_release")
public final class C0HLJ extends AbstractC23140094w {
    public InterfaceC497601wk LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public Function1 LLILZ;
    public Function1 LLILZIL;
    public boolean LLILZLL;
    public long LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C0HLI LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HLJ(C0HLI c0hli, InterfaceC1364105Vn<? super C0HLJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c0hli;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("SocialAvatarGenerator@55bc.generateSocialAvatar$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLJFF = this.LLJ.LJFF(null, null, null, 0.0d, null, null, false, 0, null, null, null, this);
        C1C7U.LIZIZ("SocialAvatarGenerator@55bc.generateSocialAvatar$1");
        return objLJFF;
    }
}
