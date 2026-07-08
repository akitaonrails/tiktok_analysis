package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oAy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463060oAy extends C09AY implements Function1<C0LAB, Unit> {
    public final /* synthetic */ AbstractC1463010oAt LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463060oAy(AbstractC1463010oAt abstractC1463010oAt, boolean z, long j) {
        super(1);
        this.LL = abstractC1463010oAt;
        this.LLILLJJLI = z;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0LAB c0lab) {
        String musicOriginWithCheck;
        String str;
        String str2;
        C0LAB c0lab2 = c0lab;
        if (C298260Bma.LIZ()) {
            musicOriginWithCheck = C1412490mrP.LIZIZ(this.LL.getEditModel());
        } else {
            musicOriginWithCheck = this.LL.getEditModel().getMusicOriginWithCheck();
        }
        c0lab2.LIZ(this.LLILLJJLI ? 1 : 0, "is_edit");
        c0lab2.LIZ(C1403850mdT.LJIIIIZZ(this.LL.getEditModel()), "is_multi_content");
        c0lab2.LIZ(this.LL.getEditModel().getVideoCount(), "video_cnt");
        c0lab2.LIZ(this.LL.getEditModel().getPhotoCount(), "pic_cnt");
        c0lab2.LIZIZ(this.LLILLL, "edit_duration");
        c0lab2.LJ("mix_type", C1403470mcr.LJ(this.LL.getEditModel()));
        Iterator<VideoSegment> it2 = this.LL.i3().LJII().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += it2.next().duration;
        }
        c0lab2.LIZIZ(j, "content_duration_ms");
        c0lab2.LJ("music_id", this.LL.getEditModel().getMusicId());
        if (this.LL.getEditModel().getEditMusicSyncMode()) {
            str = "sync_on";
        } else {
            str = "sync_off";
        }
        c0lab2.LJ("sync_mode", str);
        if (C1428470nHB.LJIIZILJ(this.LL.getEditModel()) && this.LL.W7()) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c0lab2.LJ("smart_sync", str2);
        c0lab2.LJ("music_selected_from", musicOriginWithCheck);
        c0lab2.LIZ(this.LL.LLJJIJI ? 1 : 0, "is_rotated");
        c0lab2.LIZ(this.LL.LLJJIJIIJIL ? 1 : 0, "is_edit_speed");
        c0lab2.LIZ(this.LL.LLJJIJIL ? 1 : 0, "is_adjusted");
        return Unit.LIZ;
    }
}
