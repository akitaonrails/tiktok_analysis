package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0L3I, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L3I extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0L3H LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Intent LLILZ;
    public final /* synthetic */ ShortVideoContext LLILZIL;
    public final /* synthetic */ ArrayList<MediaModel> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L3I(C0L3H c0l3h, int i, int i2, Intent intent, ShortVideoContext shortVideoContext, ArrayList<MediaModel> arrayList, int i3) {
        super(0);
        this.LL = c0l3h;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = intent;
        this.LLILZIL = shortVideoContext;
        this.LLILZLL = arrayList;
        this.LLIZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        super/*X.0L0i*/.LJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ);
        return Unit.LIZ;
    }
}
