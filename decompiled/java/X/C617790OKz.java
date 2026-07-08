package X;

import android.content.Context;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinPageInteractionAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS375S0200000_9;

/* JADX INFO: renamed from: X.0OKz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C617790OKz extends C09AY implements Function1<C770770ULj, Unit> {
    public final /* synthetic */ BulletinPageInteractionAssem LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C259800zU<TuxSheet> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C617790OKz(BulletinPageInteractionAssem bulletinPageInteractionAssem, String str, String str2, String str3, Map<String, String> map, C259800zU<TuxSheet> c259800zU) {
        super(1);
        this.LL = bulletinPageInteractionAssem;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = map;
        this.LLILZLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C770770ULj c770770ULj) {
        String str;
        C770770ULj c770770ULj2 = c770770ULj;
        c770770ULj2.LIZIZ = false;
        c770770ULj2.LIZ(true);
        C0OLV c0olvHo = this.LL.Ho();
        if (c0olvHo != null && c0olvHo.LL != null) {
            BulletinPageInteractionAssem bulletinPageInteractionAssem = this.LL;
            C259800zU<TuxSheet> c259800zU = this.LLILZLL;
            BulletinProfileViewModel bulletinProfileViewModelVo = bulletinPageInteractionAssem.Vo();
            Context context = bulletinPageInteractionAssem.getContext();
            C0OLV c0olvHo2 = bulletinPageInteractionAssem.Ho();
            if (c0olvHo2 == null || (str = c0olvHo2.LLILLJJLI) == null) {
                str = "";
            }
            bulletinProfileViewModelVo.XQ2(context, "bulletin_board_page", str, new AwS375S0200000_9((C259800zU) c259800zU, (C259800zU<TuxSheet>) c770770ULj2, (C770770ULj) 43));
        }
        C0OPQ c0opq = C0OPQ.LIZ;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        Map<String, String> map = this.LLILZIL;
        c0opq.getClass();
        C0OPQ.LJJ(str2, str3, str4, "click", "join", map);
        return Unit.LIZ;
    }
}
