package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.skylight.SkylightCellLongClickAbilityImpl;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS107S1200000_24;
import kotlin.jvm.internal.AwS26S1400000_24;

/* JADX INFO: renamed from: X.0rx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608180rx2 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ SkylightCellLongClickAbilityImpl LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ Context LLJIJIL;
    public final /* synthetic */ User LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608180rx2(boolean z, boolean z2, String str, boolean z3, String str2, String str3, String str4, SkylightCellLongClickAbilityImpl skylightCellLongClickAbilityImpl, Map<String, String> map, String str5, Context context, User user) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = str;
        this.LLILZ = z3;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = skylightCellLongClickAbilityImpl;
        this.LLJ = map;
        this.LLJI = str5;
        this.LLJIJIL = context;
        this.LLJILJIL = user;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        if (this.LL) {
            if (this.LLILLJJLI) {
                c1397620mTQ2.LIZJ(2, this.LLILLL, new AwS26S1400000_24(this.LLIZLLLIL, (SkylightCellLongClickAbilityImpl) this.LLJ, (Map<String, String>) this.LLJI, (String) this.LLJIJIL, (Context) this.LLJILJIL, (User) 0));
            }
            if (this.LLILZ) {
                c1397620mTQ2.LIZJ(2, this.LLILZIL, new AwS26S1400000_24(this.LLIZLLLIL, (SkylightCellLongClickAbilityImpl) this.LLJ, (Map<String, String>) this.LLJI, (String) this.LLJIJIL, (Context) this.LLJILJIL, (User) 1));
            }
        }
        c1397620mTQ2.LIZJ(2, this.LLILZLL, new AwS26S1400000_24(this.LLIZLLLIL, (SkylightCellLongClickAbilityImpl) this.LLJ, (Map<String, String>) this.LLJI, (String) this.LLJIJIL, (Context) this.LLJILJIL, (User) 2));
        c1397620mTQ2.LIZJ(1, this.LLIZ, new AwS107S1200000_24(this.LLIZLLLIL, (SkylightCellLongClickAbilityImpl) this.LLJ, (Map<String, String>) this.LLJI, (String) 0));
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
