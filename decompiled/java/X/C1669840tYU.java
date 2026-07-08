package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi;

/* JADX INFO: renamed from: X.0tYU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.passwordless.RemovePasswordApi", f = "RemovePasswordApi.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "removePassword")
public final class C1669840tYU extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RemovePasswordApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1669840tYU(RemovePasswordApi removePasswordApi, InterfaceC1364105Vn<? super C1669840tYU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = removePasswordApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RemovePasswordApi@c3cd.removePassword$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, null, this);
        C1C7U.LIZIZ("RemovePasswordApi@c3cd.removePassword$1");
        return objLIZ;
    }
}
