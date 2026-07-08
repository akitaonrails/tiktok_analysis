package X;

import android.content.Context;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.share.improve.action.delete.DeleteReeditSheetContentFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0mD8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387520mD8 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ IExternalService LLILLJJLI;
    public final /* synthetic */ AwemeDraft LLILLL;
    public final /* synthetic */ C0HTT<C737030Svd> LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387520mD8(DeleteReeditSheetContentFragment deleteReeditSheetContentFragment, Context context, String str, IExternalService iExternalService, AwemeDraft awemeDraft, C0HTT c0htt, Aweme aweme, boolean z, String str2, String str3, Function0 function0) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = iExternalService;
        this.LLILLL = awemeDraft;
        this.LLILZ = c0htt;
        this.LLILZIL = aweme;
        this.LLILZLL = z;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1387490mD5.LJIIJ(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILLJJLI, this.LLILLL, "delete_panel");
        return Unit.LIZ;
    }
}
