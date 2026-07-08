package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0i96, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1231260i96 extends C09AY implements Function1<IMGroupChatApi, Unit> {
    public final /* synthetic */ Activity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ GroupInfo LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ C900560ZUo LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1231260i96(C19EG c19eg, String str, long j, GroupInfo groupInfo, String str2, String str3, String str4, C900560ZUo c900560ZUo) {
        super(1);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = groupInfo;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = c900560ZUo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IMGroupChatApi iMGroupChatApi) {
        iMGroupChatApi.LJIJ(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
