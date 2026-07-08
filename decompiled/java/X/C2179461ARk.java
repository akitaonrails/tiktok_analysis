package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1ARk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.background.BackgroundAudioBrowserService$setMetadata$1", f = "BackgroundAudioBrowserService.kt", l = {356}, m = "invokeSuspend")
public final class C2179461ARk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BackgroundAudioBrowserService LL;
    public int LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ BackgroundAudioBrowserService LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2179461ARk(Aweme aweme, BackgroundAudioBrowserService backgroundAudioBrowserService, InterfaceC1364105Vn<? super C2179461ARk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aweme;
        this.LLILZ = backgroundAudioBrowserService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2179461ARk(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UrlModel avatarMedium;
        BackgroundAudioBrowserService backgroundAudioBrowserService;
        C1C7U.LIZ("BackgroundAudioBrowserService@c46b.setMetadata$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        C1AS1 c1as1 = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    backgroundAudioBrowserService = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                User author = this.LLILLL.getAuthor();
                if (author != null) {
                    avatarMedium = author.getAvatarMedium();
                } else {
                    avatarMedium = null;
                }
                if (avatarMedium != null) {
                    backgroundAudioBrowserService = this.LLILZ;
                    this.LL = backgroundAudioBrowserService;
                    this.LLILLJJLI = 1;
                    backgroundAudioBrowserService.getClass();
                    C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                    C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(avatarMedium)).LJJII(new C517601zy(new C013C(), c23260099m, 1));
                    obj = c23260099m.LIZ();
                    if (obj == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("BackgroundAudioBrowserService@c46b.setMetadata$1");
                        return objLJFF;
                    }
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BackgroundAudioBrowserService@c46b.setMetadata$1");
                return unit;
            }
            Bitmap bitmap = (Bitmap) obj;
            C2179501ARo c2179501ARo = backgroundAudioBrowserService.LLJI;
            if (c2179501ARo == null) {
                c2179501ARo = null;
            }
            c2179501ARo.LIZJ(bitmap);
            C1AS1 c1as12 = backgroundAudioBrowserService.LLJ;
            if (c1as12 != null) {
                c1as1 = c1as12;
            }
            C2179451ARj c2179451ARj = c1as1.LJIIIZ;
            c2179451ARj.LJI = bitmap;
            c2179451ARj.LIZIZ = Boolean.valueOf(c1as1.LIZLLL.LJFF());
            c2179451ARj.LIZJ = Boolean.valueOf(c1as1.LIZLLL.LJI());
            c1as1.LJFF(c2179451ARj);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("BackgroundAudioBrowserService@c46b.setMetadata$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            th.getMessage();
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("BackgroundAudioBrowserService@c46b.setMetadata$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
