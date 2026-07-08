package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Dwv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355630Dwv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ VideoPublishEditModel LL;
    public final /* synthetic */ C0E48 LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355630Dwv(VideoPublishEditModel videoPublishEditModel, C0E48 c0e48, long j, Pair<Integer, Integer> pair, String str) {
        super(0);
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = c0e48;
        this.LLILLL = j;
        this.LLILZ = pair;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0LAB c0labLJFF = C361680EFy.LJFF(this.LLILLL, this.LL, this.LLILLJJLI, this.LLILZ);
        c0labLJFF.LJ("crop_type", this.LLILZIL);
        C20684815ws.LJIILLIIL("click_crop_video_change", c0labLJFF.LIZ);
        return Unit.LIZ;
    }
}
