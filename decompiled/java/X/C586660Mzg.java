package X;

import com.ss.android.ugc.aweme.livephoto.vh.LivePhotoViewHolder;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586660Mzg extends C09AY implements Function0<String> {
    public final /* synthetic */ LivePhotoViewHolder LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C586660Mzg(LivePhotoViewHolder livePhotoViewHolder, String str, int i, float f) {
        super(0);
        this.LL = livePhotoViewHolder;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.hashCode());
        sbLIZ.append(" onSeekStart sourceId: ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" offset: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" progress: ");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
