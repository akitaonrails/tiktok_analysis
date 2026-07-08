package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ability.IPageToFinish;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cd2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.reedit.EditPostMusicHelper$onEditMusic$1", f = "EditPostMusicHelper.kt", l = {44}, m = "invokeSuspend")
public final class C317820Cd2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DialogC1389620mGW LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ List<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317820Cd2(DialogC1389620mGW dialogC1389620mGW, Context context, Aweme aweme, String str, String str2, List<String> list, InterfaceC1364105Vn<? super C317820Cd2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dialogC1389620mGW;
        this.LLILLL = context;
        this.LLILZ = aweme;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C317820Cd2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        Object objLJI = obj;
        C1C7U.LIZ("EditPostMusicHelper@5949.onEditMusic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C317490CcV c317490CcV = new C317490CcV(this.LLILLL, this.LLIZ, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c317490CcV);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("EditPostMusicHelper@5949.onEditMusic$1");
                return objLJFF;
            }
        }
        List<String> list = (List) objLJI;
        C0FNV.LIZ(this.LLILLJJLI);
        if (list != null) {
            C317840Cd4 c317840Cd4 = C317840Cd4.LIZ;
            Context context = this.LLILLL;
            Aweme aweme = this.LLILZ;
            String str = this.LLILZIL;
            String str2 = this.LLILZLL;
            c317840Cd4.getClass();
            String aid = aweme.getAid();
            if (aid != null && aid.length() != 0) {
                Bundle bundle = new Bundle();
                C786410Ut5.LJJJI("shoot_way", str2, bundle);
                C786410Ut5.LJJJI(FollowStatusChangeMethod.PARAM_UID, aweme.getAid(), bundle);
                C786410Ut5.LJJJI("enter_method", str, bundle);
                Music music = aweme.getMusic();
                if (music == null || (string = Long.valueOf(music.getId()).toString()) == null) {
                    string = "";
                }
                C786410Ut5.LJJJI("music_id", string, bundle);
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                if (c19egLIZIZ != null) {
                    ((IExternalService) ServiceManager.get().getService(IExternalService.class)).openGotoNextService().gotoNextPage(c19egLIZIZ, false, bundle, list, new IPageToFinish() { // from class: X.0Cd3
                        @Override // com.ss.android.ugc.aweme.services.external.ability.IPageToFinish
                        public final void onFinish(boolean z) {
                        }
                    });
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditPostMusicHelper@5949.onEditMusic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
