package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JIJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JIJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JIJ(Context context, String str, String str2, String str3, String str4) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Bundle bundle = new Bundle();
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        String str3 = this.LLILZ;
        String str4 = this.LLILZIL;
        C786410Ut5.LJJJI("fragment_type", "pcs_course_music_peel", bundle);
        C786410Ut5.LJJJI("show_entrance", str, bundle);
        C786410Ut5.LJJJI("course_id", str2, bundle);
        C786410Ut5.LJJJI("video_id", str3, bundle);
        C786410Ut5.LJJJI("anchor_id", str4, bundle);
        ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).In1(this.LL, bundle);
        return Unit.LIZ;
    }
}
