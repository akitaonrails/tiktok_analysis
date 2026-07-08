package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS146S1200000_31;

/* JADX INFO: renamed from: X.14XJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14XJ extends C09AY implements Function1<C14XI, C14XI> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ PushSettings LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14XJ(String str, Context context, PushSettings pushSettings, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = context;
        this.LLILLL = pushSettings;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C14XI invoke(C14XI c14xi) {
        return C14XI.LIZ(c14xi, false, false, false, false, false, false, null, null, false, this.LL, new AwS146S1200000_31(this.LLILLJJLI, this.LLILLL, this.LLILZ, 7), null, null, 13311);
    }
}
