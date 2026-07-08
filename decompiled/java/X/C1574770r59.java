package X;

import com.ss.android.ugc.aweme.vibefeed.feed.component.VibeRetentionComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS27S2200000_24;
import kotlin.jvm.internal.AwS44S2100000_24;

/* JADX INFO: renamed from: X.0r59, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1574770r59 extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ EnumC912680ZrG LLILZIL;
    public final /* synthetic */ VibeRetentionComponent LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1574770r59(String str, String str2, String str3, String str4, EnumC912680ZrG enumC912680ZrG, VibeRetentionComponent vibeRetentionComponent) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = enumC912680ZrG;
        this.LLILZLL = vibeRetentionComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LIZJ(0, this.LL, new AwS27S2200000_24(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, 0));
        c1397620mTQ2.LIZJ(1, this.LLILLJJLI, new AwS44S2100000_24(this.LLILLL, this.LLILZ, this.LLILZIL, 1));
        c1397620mTQ2.LJFF = true;
        return Unit.LIZ;
    }
}
