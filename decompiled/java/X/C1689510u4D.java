package X;

import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0u4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.reveal.StoryRevealNotificationSheetHelper", f = "StoryRevealNotificationSheetHelper.kt", l = {115, 118}, m = "runShowFlow")
public final class C1689510u4D extends AbstractC23140094w {
    public C19EG LL;
    public IUpdateSettingService LLILLJJLI;
    public ISettingService LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Function0 LLILZLL;
    public Function0 LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ C1689500u4C LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1689510u4D(C1689500u4C c1689500u4C, InterfaceC1364105Vn<? super C1689510u4D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = c1689500u4C;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objLIZ = this.LLJ.LIZ(null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("StoryRevealNotificationSheetHelper@bf38.runShowFlow$1");
        return objLIZ;
    }
}
