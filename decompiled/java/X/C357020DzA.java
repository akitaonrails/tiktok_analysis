package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0DzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357020DzA extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C0EPT LL;
    public final /* synthetic */ EffectModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357020DzA(C0EPT c0ept, EffectModel effectModel, String str, int i, long j) {
        super(1);
        this.LL = c0ept;
        this.LLILLJJLI = effectModel;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        this.LL.i3(AFwS234S0000000_5.get$arr$(58));
        C1428470nHB.LLILZIL(this.LL.getEditModel());
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel editModel = this.LL.getEditModel();
        String str2 = this.LLILLJJLI.key;
        String str3 = this.LLILLL;
        int i = this.LLILZ;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILZIL;
        Integer numValueOf = Integer.valueOf(this.LLILLJJLI.source);
        String str4 = this.LLILLJJLI.designerId;
        c1413450msx.getClass();
        C1413450msx.LJII(editModel, str2, str3, i, str, jCurrentTimeMillis, numValueOf, str4);
        return Unit.LIZ;
    }
}
