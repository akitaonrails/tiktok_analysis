package X;

import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1352610lIp extends C09AY implements Function1<C1352520lIg, C1352520lIg> {
    public final /* synthetic */ CommentAudioRecordViewModel LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ List<Float> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352610lIp(CommentAudioRecordViewModel commentAudioRecordViewModel, long j, boolean z, long j2, List<Float> list) {
        super(1);
        this.LL = commentAudioRecordViewModel;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
        this.LLILZIL = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1352520lIg invoke(C1352520lIg c1352520lIg) {
        return C1352520lIg.LIZ(c1352520lIg, null, this.LL.wQ2(this.LLILLJJLI), this.LLILLL, (int) this.LLILZ, null, C13LP.LLI(C13LP.LJJJJLI(this.LLILZIL)), null, 421);
    }
}
