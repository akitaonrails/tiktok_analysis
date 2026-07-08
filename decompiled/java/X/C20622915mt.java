package X;

import com.ss.android.ugc.aweme.base.ui.assem.MentionContainerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15mt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20622915mt extends C09AY implements Function1<C0SZ5, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ MentionContainerAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20622915mt(int i, MentionContainerAssem mentionContainerAssem, String str) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = mentionContainerAssem;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0SZ5 c0sz5) {
        C0SZ5 c0sz52 = c0sz5;
        c0sz52.LL = C13LE.LIZ(MentionContainerAssem.class);
        c0sz52.LLIZLLLIL = this.LL;
        c0sz52.LLJILJIL = this.LLILLJJLI;
        c0sz52.LLILLJJLI = C20613615lO.LIZ(this.LLILLL);
        return Unit.LIZ;
    }
}
