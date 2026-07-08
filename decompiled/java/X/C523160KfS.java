package X;

import android.util.Size;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0KfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523160KfS implements InterfaceC522160Kdq {
    @Override // X.InterfaceC522160Kdq
    public final void LIZ(boolean z, ShortVideoContext shortVideoContext) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LIZIZ(ShortVideoContext shortVideoContext, TikTokMediaModel tikTokMediaModel, String str, String str2, String str3, String str4) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LIZJ(ShortVideoContext shortVideoContext, String str, String str2, boolean z, String str3, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJ(ShortVideoContext shortVideoContext) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJFF(ShortVideoContext shortVideoContext, MediaState mediaState, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJII(ShortVideoContext shortVideoContext, String str, String str2, String str3, String str4, C528240Kne c528240Kne, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIIIZZ(ShortVideoContext shortVideoContext, TikTokMediaModel tikTokMediaModel, String str, String str2, String str3, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIIZ(boolean z, ShortVideoContext shortVideoContext) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIJ(ShortVideoContext shortVideoContext, String str, String str2, String str3, int i, int i2, String str4, String str5, boolean z, List<? extends MediaModel> list, C523920Kgg c523920Kgg, boolean z2, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIJJI(ShortVideoContext shortVideoContext, long j, long j2) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIIL(ShortVideoContext shortVideoContext, String str, C528250Knf c528250Knf, int i, String str2, String str3, boolean z, C528240Kne c528240Kne, String str4, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJIILIIL(ShortVideoContext shortVideoContext, ArrayList arrayList, C528230Knd c528230Knd) {
    }

    @Override // X.InterfaceC522160Kdq
    public final void LIZLLL(ShortVideoContext shortVideoContext, List<? extends TikTokMediaModel> list, C0L9I c0l9i, String str, Size size, String str2, int i, Integer num, C528250Knf c528250Knf, String str3, boolean z, String str4, String str5, boolean z2, int i2, int i3, boolean z3, int i4, boolean z4, String str6, String str7, C528010KnH c528010KnH, C528240Kne c528240Kne, C528230Knd c528230Knd) {
        CreativeModel creativeModel;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "video");
        c0lab.LJ("upload_type", "multiple_content");
        c0lab.LIZ(i4, "source_is_hdr");
        if (shortVideoContext != null) {
            creativeModel = shortVideoContext.creativeModel;
        } else {
            creativeModel = null;
        }
        C0MJO.LIZIZ(creativeModel, c0lab);
        c0lab.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
        c0lab.LJ("album_from_page", c528230Knd.LJI);
        c0lab.LJ("album_from_scene", c528230Knd.LJII);
        c0lab.LJ("multi_select_status", c528230Knd.LIZ());
        c0lab.LJ("select_type", c528230Knd.LJIIIZ);
        c0lab.LJ("shoot_enter_method", c528230Knd.LIZLLL);
        c0lab.LJ("shoot_enter_from", c528230Knd.LIZJ);
        C20684815ws.LJIILLIIL("choose_upload_content", c0lab.LIZ);
    }

    @Override // X.InterfaceC522160Kdq
    public final void LJI(ShortVideoContext shortVideoContext, C0L9I c0l9i, String str, Size size, String str2, int i, Integer num, C528250Knf c528250Knf, String str3, boolean z, String str4, String str5, int i2, int i3, boolean z2, int i4, boolean z3, Boolean bool, String str6, String str7, C528010KnH c528010KnH, C528240Kne c528240Kne, String str8, boolean z4, C528230Knd c528230Knd) {
        CreativeModel creativeModel;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("content_type", "photo");
        c0lab.LJ("upload_type", "multiple_content");
        c0lab.LIZ(i4, "source_is_hdr");
        if (shortVideoContext != null) {
            creativeModel = shortVideoContext.creativeModel;
        } else {
            creativeModel = null;
        }
        C0MJO.LIZIZ(creativeModel, c0lab);
        c0lab.LIZ(c528230Knd.LJ ? 1 : 0, "is_draft");
        c0lab.LJ("multi_select_status", c528230Knd.LIZ());
        c0lab.LJ("select_type", c528230Knd.LJIIIZ);
        c0lab.LJ("album_from_page", c528230Knd.LJI);
        c0lab.LJ("album_from_scene", c528230Knd.LJII);
        c0lab.LJ("shoot_enter_method", c528230Knd.LIZLLL);
        c0lab.LJ("shoot_enter_from", c528230Knd.LIZJ);
        C20684815ws.LJIILLIIL("choose_upload_content", c0lab.LIZ);
    }
}
